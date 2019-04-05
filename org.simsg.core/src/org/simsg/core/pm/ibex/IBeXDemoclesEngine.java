package org.simsg.core.pm.ibex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.emoflon.ibex.gt.api.GraphTransformationApp;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.match.IMatch;

import GTLanguage.GTRule;
import IBeXLanguage.IBeXPattern;

public class IBeXDemoclesEngine extends PatternMatchingEngine {
	
	private String nameSpace;
	private String packageName;
	
	private Class<GraphTransformationApp<?>> democlesAppClass;
	private Class<GraphTransformationApp<?>> appClass;
	private Class<GraphTransformationAPI> apiClass;
	private Method registerMetaModels;
	private Map<String, Method> matcherGetter = new HashMap<>();
	
	private GraphTransformationApp<?> democlesApp;
	private GraphTransformationAPI api;
	
	private Map<String, GraphTransformationPattern<?,?>> matcher = new HashMap<>();
	private Map<String, Collection<IMatch>> matches = new HashMap<>();
	
	private void setNameSpaceAndPackageName() {
		String uri = simulationDefinition.getGtRulesURI();
		Pattern pattern = Pattern.compile("^(.*src-gen/)(.*)(api/gt-rules.xmi)$");
		Matcher matcher = pattern.matcher(uri);
		matcher.matches();
		String ns = matcher.group(2);
		
		Pattern pattern2 = Pattern.compile("^(.*/)(.*)(/)$");
		Matcher matcher2 = pattern2.matcher(ns);
		matcher2.matches();
		String pack = matcher2.group(2);
		ns = ns.substring(0, ns.length()-1);
		ns = ns.replace("/", ".");
		
		packageName = pack.substring(0, 1).toUpperCase() + pack.substring(1, pack.length());
		nameSpace = ns+".api";

	}
	
	@SuppressWarnings("unchecked")
	private void initDemoclesApp() {
		try {
			democlesAppClass = (Class<GraphTransformationApp<?>>)java.lang.Class.forName(nameSpace+"."+packageName+"DemoclesApp");
			democlesApp = democlesAppClass.newInstance();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	private void initDemoclesApiClasses() {
		try {
			appClass = (Class<GraphTransformationApp<?>>)java.lang.Class.forName(nameSpace+"."+packageName+"App");
			registerMetaModels = appClass.getDeclaredMethod("registerMetaModels");
			apiClass = (Class<GraphTransformationAPI>)java.lang.Class.forName(nameSpace+"."+packageName+"API");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void initMatcherGetter() {
		
		for(IBeXPattern pattern : simulationDefinition.getIbexPatternSet().getContextPatterns()) {
			Method getter = null;
			try {
				getter = apiClass.getDeclaredMethod(pattern.getName());
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(getter != null) {
				matcherGetter.put(pattern.getName(), getter);
			}
		}
		
		for(GTRule rule : simulationDefinition.getGtRuleSet().getRules()) {
			Method getter = null;
			
			try {
				getter = apiClass.getDeclaredMethod(rule.getName());
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(getter != null) {
				matcherGetter.put(rule.getName(), getter);
			}
		}
	}
	
	private void initMatcher() {
		for(String getterName : matcherGetter.keySet()) {
			Method getter = matcherGetter.get(getterName);
			GraphTransformationPattern<?,?> matcher = null;
			try {
				matcher = (GraphTransformationPattern<?,?>)getter.invoke(api);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(matcher != null) {
				this.matcher.put(getterName, matcher);
			}
		}
	}

	@Override
	public void setAdditionalParameters(Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initPatterns() {
		setNameSpaceAndPackageName();
		initDemoclesApp();
		initDemoclesApiClasses();
		initMatcherGetter();
	}

	@Override
	public void initEngine() {
		try {
			registerMetaModels.invoke(democlesApp);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		democlesApp.getModel().getResources().add(simulationModel);
		api = democlesApp.initAPI();
		initMatcher();
		
		updateAllMatches();
	}

	@Override
	public Collection<IMatch> getMatchesAndUpdate(String patternName) {
		updateMatches(patternName);
		return matches.get(patternName);
	}
	
	@Override
	public Map<String, Collection<IMatch>> getAllMatchesAndUpdate(String patternName) {
		updateAllMatches();
		return matches;
	}

	@Override
	public Collection<IMatch> getMatches(String patternName) {
		return matches.get(patternName);
	}

	@Override
	public Map<String, Collection<IMatch>> getAllMatches() {
		return matches;
	}

	@Override
	public void disposeEngine() {
		api.terminate();
	}
	
	@Override
	public void updateMatches(String patternName) {
		api.updateMatches();
		GraphTransformationPattern<?,?> m = matcher.get(patternName);
		@SuppressWarnings("unchecked")
		Collection<GraphTransformationMatch<?,?>> ibexMatches = (Collection<GraphTransformationMatch<?, ?>>) m.findMatches();
		Collection<IMatch> iMatches = new LinkedList<IMatch>();
		matches.put(patternName, iMatches);
		for(GraphTransformationMatch<?,?> match : ibexMatches) {
			iMatches.add(new IBeXMatch(match));
		}
	}

	@Override
	public void updateAllMatches() {
		api.updateMatches();
		for(String patternName : matcher.keySet()) {
			GraphTransformationPattern<?,?> m = matcher.get(patternName);
			@SuppressWarnings("unchecked")
			Collection<GraphTransformationMatch<?,?>> ibexMatches = (Collection<GraphTransformationMatch<?, ?>>) m.findMatches();
			Collection<IMatch> iMatches = new LinkedList<IMatch>();
			matches.put(patternName, iMatches);
			for(GraphTransformationMatch<?,?> match : ibexMatches) {
				iMatches.add(new IBeXMatch(match));
			}
		}
	}

}
