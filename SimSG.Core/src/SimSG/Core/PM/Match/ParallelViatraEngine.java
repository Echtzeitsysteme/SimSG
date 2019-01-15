package SimSG.Core.PM.Match;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.viatra.query.patternlanguage.emf.vql.Pattern;
import org.eclipse.viatra.query.patternlanguage.emf.vql.PatternModel;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;

import SimSG.Core.PM.Pattern.GenericPattern;
import SimSG.Core.PM.Viatra.ViatraMatch;
import SimSG.Core.PM.Viatra.ViatraPatternGenerator;

@SuppressWarnings("restriction")
public class ParallelViatraEngine extends PatternMatchingEngine {
	
	private int NUM_OF_CORES = Runtime.getRuntime().availableProcessors();
	
	private List<Map<String, GenericPattern>> patternGroups;
	private Map<String, Map<String, GenericPattern>> patternGroupMap;
	private Map<Map<String, GenericPattern>, AdvancedViatraQueryEngine> queryEngines;
	private Map<Map<String, GenericPattern>, PatternModel> patternModels;
	private HashMap<String, ViatraQueryMatcher<? extends IPatternMatch>> matcher;
	
	ParallelViatraEngine() {
		type = PatternMatchingEngineEnum.ParallelViatraEngine;
		matcher = new HashMap<String, ViatraQueryMatcher<? extends IPatternMatch>>();
	}

	@Override
	public void loadModels() throws Exception {
		patternGroups = new LinkedList<Map<String,GenericPattern>>();
		patternGroupMap = new HashMap<String, Map<String,GenericPattern>>();
		patternModels = new HashMap<Map<String,GenericPattern>, PatternModel>();
		
		int groupSize = genericPatterns.size()/NUM_OF_CORES;
		Map<String,GenericPattern> currentGroup = new HashMap<String, GenericPattern>(groupSize);
		patternGroups.add(currentGroup);
		
		for(Entry<String, GenericPattern> entry : genericPatterns.entrySet()) {
			if(currentGroup.size()>=groupSize) {
				currentGroup  = new HashMap<String, GenericPattern>(groupSize);
				patternGroups.add(currentGroup);
			}
			currentGroup.put(entry.getKey(), entry.getValue());
			patternGroupMap.put(entry.getKey(), currentGroup);
		}
		
		for(Map<String, GenericPattern> patternGroup : patternGroups) {
			ViatraPatternGenerator gen = new ViatraPatternGenerator(metaModel, patternGroup);
			patternModels.put(patternGroup, gen.doGenerate());
		}
		
		System.out.println("Cores: "+NUM_OF_CORES+", groupsize: "+groupSize+", nGroups: "+patternGroups.size());

	}

	@Override
	protected void initEngineInternal() throws Exception {
		queryEngines = new HashMap<Map<String,GenericPattern>, AdvancedViatraQueryEngine>(patternGroups.size());
		EMFScope scope = new EMFScope(model);
		patternGroups.parallelStream().forEach(pg -> queryEngines.put(pg, AdvancedViatraQueryEngine.createUnmanagedEngine(scope)));
		patternModels.entrySet().forEach(entry -> {
			for(Pattern p : entry.getValue().getPatterns()) {
				matcher.put(p.getName(), null);
			}
		});
		// errors occur when doing this in parallel
		patternGroups.forEach(pg -> {
			for(Pattern p : patternModels.get(pg).getPatterns()) {
				SpecificationBuilder builder = new SpecificationBuilder();
				matcher.replace(p.getName(), queryEngines.get(pg).getMatcher(builder.getOrCreateSpecification(p, true)));
			}
			
		});
	}

	@Override
	protected void initNonVoidPatternNames() {
		nonVoidPatterns = new LinkedList<String>();
		for(String pattern : matcher.keySet()) {
			nonVoidPatterns.add(pattern);
		}

	}

	@Override
	protected Collection<IMatch> getMatchesAndUpdate(String patternName) throws Exception {
		Collection<IMatch> iMatches = new LinkedList<IMatch>();
		for(IPatternMatch match : matcher.get(patternName).getAllMatches()) {
			iMatches.add(new ViatraMatch(match, patternName));
		}
		return iMatches;
	}
	
	@Override
	public Map<String, Collection<IMatch>> getAllMatches() throws Exception {
		Map<String, Collection<IMatch>> out = new HashMap<String, Collection<IMatch>>(genericPatterns.size());
		for(Entry<String, Collection<IMatch>> entry : out.entrySet()) {
			out.put(entry.getKey(), null);
		}
		patternGroups.parallelStream().forEach(pg -> {
			for(String patternName : pg.keySet()) {
				try {
					out.replace(patternName, getMatchesAndUpdate(patternName));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		return out;
	}

	@Override
	public void disposeEngine() {
		// this is evil when using parallel matching engines
		/*
		queryEngines.values().forEach(engine-> {
			engine.wipe();
			engine.dispose();
		});
		*/
	}

}
