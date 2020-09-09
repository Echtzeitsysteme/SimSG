package org.simsg.ui.build;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.emoflon.ibex.IBeXDisjunctPatternModel.IBeXDependentInjectivityConstraints;
import org.emoflon.ibex.IBeXDisjunctPatternModel.IBeXDisjunctContextPattern;
import org.emoflon.ibex.IBeXDisjunctPatternModel.IBeXDisjunctPatternModelFactory;
import org.emoflon.ibex.IBeXDisjunctPatternModel.IBexDisjunctInjectivityConstraint;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXNode;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXNodePair;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternInvocation;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternModelFactory;

public class IBeXDisjunctPatternCreator {
	
	final IBeXContextPattern pattern;
	final Set<Set<IBeXNode>> subpatterns;
	final Map<Set<IBeXNode>, IBeXContextPattern> dividedPatterns;
	
	public IBeXDisjunctPatternCreator(final IBeXContextPattern disjunctPattern, Set<Set<IBeXNode>> subgraphs) {
		pattern = disjunctPattern;
		subpatterns = subgraphs;	
		dividedPatterns = new HashMap<Set<IBeXNode>, IBeXContextPattern>();
	}
	
	/**
	 * divides the EditorPattern in subpatterns and transforms the subpatterns
	 * 
	 * @param editorPattern the pattern
	 * @param isLocalCheck
	 * @return the IBeXDisjunctContextPattern
	 * @throws IllegalArgumentException if something goes wrong when dividing the EditorPattern
	 */
	public IBeXDisjunctContextPattern transformToContextPattern(){
		IBeXDisjunctContextPattern ibexPattern = IBeXDisjunctPatternModelFactory.eINSTANCE.createIBeXDisjunctContextPattern();
		ibexPattern.setName(pattern.getName());
		
		//divide the pattern
		Map<Set<IBeXNode>, IBeXContextPattern> dividedSubpatterns = divideContextPatterns(pattern);
		
		List<IBexDisjunctInjectivityConstraint> subconstraint = new ArrayList<IBexDisjunctInjectivityConstraint>();
		
		//find the injectivity constraints
		List<Set<IBeXNode>> subpatternList = new ArrayList<Set<IBeXNode>>(dividedSubpatterns.keySet());
		for(int i = 0; i<subpatternList.size(); i++) {
			Set<IBeXNode> subpattern = subpatternList.get(i);
			for(int j = i+1; j<subpatternList.size(); j++) {
				Set<IBeXNode> otherSubpattern = subpatternList.get(j);
				List<IBeXNodePair> pairs = pattern.getInjectivityConstraints().stream()
						.filter(pair -> {
						return subpattern.contains(pair.getValues().get(0))&&otherSubpattern.contains(pair.getValues().get(1))||
								subpattern.contains(pair.getValues().get(1))&&otherSubpattern.contains(pair.getValues().get(0));
					}).collect(Collectors.toList());
				if(!pairs.isEmpty()) {
						subconstraint.add(transformConstraints(dividedSubpatterns.get(subpattern), dividedSubpatterns.get(otherSubpattern), pairs));
			
				}
			}	
		}

		ibexPattern.getInjectivityConstraints().addAll(transformInjectivityConstraints(ibexPattern.getSubpatterns(), subconstraint));
		ibexPattern.getSubpatterns().addAll(dividedSubpatterns.values());
		
		return ibexPattern;
	}
	
	/**
	 * divides a disjunct pattern in different subpatterns; not supported until now: EditorPatternAttributeCondition(?)
	 */
	private Map<Set<IBeXNode>, IBeXContextPattern> divideContextPatterns(IBeXContextPattern pattern) {
		List<IBeXNode> signatureNodes = new ArrayList<IBeXNode>(pattern.getSignatureNodes());
		List<IBeXNode> localNodes = new ArrayList<IBeXNode>(pattern.getLocalNodes());
		Map<Set<IBeXNode>, IBeXContextPattern> dividedSubpatterns = new HashMap<Set<IBeXNode>, IBeXContextPattern>();
		
		boolean forbiddenInjectivity = pattern.getInjectivityConstraints().stream()
				.anyMatch(pair -> localNodes.contains(pair.getValues().get(0)) || localNodes.contains(pair.getValues().get(1)));
		if(forbiddenInjectivity) throw new IllegalArgumentException("injectivity constraints can't be resolved");
		
		int i = 0;
		//divide the nodes in the pattern
		if(dividedSubpatterns.isEmpty()) {
			for(Set<IBeXNode> subpattern: subpatterns) {
				if(subpattern.containsAll(signatureNodes)) {
					dividedSubpatterns.put(subpattern, pattern);
					break;
				}
				List<IBeXNode> subpatternSignatureNodes = subpattern.stream().filter(n -> signatureNodes.contains(n)).collect(Collectors.toList());				
				if(subpatternSignatureNodes.isEmpty()) continue;
				IBeXContextPattern newSubpattern =  IBeXPatternModelFactory.eINSTANCE.createIBeXContextPattern();
				newSubpattern.setName(i + "_" + pattern.getName());
				
				newSubpattern.getSignatureNodes().addAll(subpatternSignatureNodes);
				List<IBeXNode> subpatternLocalNodes = subpattern.stream().filter(n -> localNodes.contains(n)).collect(Collectors.toList());
				newSubpattern.getLocalNodes().addAll(subpatternLocalNodes);
				
				newSubpattern.getLocalEdges().addAll(pattern.getLocalEdges().stream().filter(edge -> subpattern.contains(edge.getSourceNode())).collect(Collectors.toList()));
				newSubpattern.getInjectivityConstraints().addAll(pattern.getInjectivityConstraints().stream()
						.filter(pair -> subpattern.contains(pair.getValues().get(0)) && subpattern.contains(pair.getValues().get(1))).collect(Collectors.toList()));		
				dividedSubpatterns.put(subpattern, newSubpattern);
				//attribute constraints are ignored
				i++;
			}
		}
	
		for(IBeXPatternInvocation invocation: pattern.getInvocations()) {
			//divide the invocations
			for(Entry<Set<IBeXNode>, IBeXContextPattern> dividedInvocations : divideContextPatterns(invocation.getInvokedPattern()).entrySet()) {
				if(!dividedSubpatterns.containsKey(dividedInvocations.getKey())) {
					throw new IllegalArgumentException("invocation could not be divided");
				}
				else {				
					IBeXPatternInvocation newInvocation = IBeXPatternModelFactory.eINSTANCE.createIBeXPatternInvocation();
					newInvocation.setInvokedBy(dividedSubpatterns.get(dividedInvocations.getKey()));
					newInvocation.setInvokedPattern(dividedInvocations.getValue());
					newInvocation.setPositive(invocation.isPositive());
					Map<IBeXNode, IBeXNode> mapping = invocation.getMapping().entrySet().stream()
							.filter(entry -> dividedInvocations.getKey().contains(entry.getKey())).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
					for(Entry<IBeXNode, IBeXNode> map: mapping.entrySet()) {
						newInvocation.getMapping().put(map.getKey(), map.getValue());
					}
					dividedSubpatterns.get(dividedInvocations.getKey()).getInvocations().add(newInvocation);
				}
			}
		}
		return dividedSubpatterns;
	}	
	
	/**
	 * tranforms the injectivity constraints
	 */
	private List<IBeXDependentInjectivityConstraints> transformInjectivityConstraints(List<IBeXContextPattern> subpatterns, List<IBexDisjunctInjectivityConstraint> constraints){
		Map<List<IBeXContextPattern>, List<IBexDisjunctInjectivityConstraint>> constraintMap = new HashMap<List<IBeXContextPattern>, List<IBexDisjunctInjectivityConstraint>>();
		for(IBexDisjunctInjectivityConstraint constraint: constraints) {
			List<List<IBeXContextPattern>> dependentPatterns = constraintMap.keySet().stream()
					.filter(list -> list.contains(constraint.getPattern1())&&list.contains(constraint.getPattern2())).collect(Collectors.toList());
			if(dependentPatterns.isEmpty()) {
				List<IBeXContextPattern> key = new ArrayList<IBeXContextPattern>();
				key.add(constraint.getPattern1());
				key.add(constraint.getPattern2());
				List<IBexDisjunctInjectivityConstraint> value = new ArrayList<IBexDisjunctInjectivityConstraint>();
				value.add(constraint);
				constraintMap.put(key, value);
			}
			else {
				List<IBeXContextPattern> key = new ArrayList<IBeXContextPattern>();
				key.addAll(dependentPatterns.stream().flatMap(pattern -> pattern.stream()).collect(Collectors.toList()));
				key.add(constraint.getPattern1());
				key.add(constraint.getPattern2());
				List<IBexDisjunctInjectivityConstraint> value = new ArrayList<IBexDisjunctInjectivityConstraint>();
				value.addAll(dependentPatterns.stream().flatMap(pattern -> constraintMap.get(pattern).stream()).collect(Collectors.toList()));
				value.add(constraint);
				constraintMap.put(key, value);
				for(List<IBeXContextPattern> dependentSubpattern: dependentPatterns) {
					constraintMap.remove(dependentSubpattern);
				}
			}
		}
		
		List<IBeXDependentInjectivityConstraints> dependentConstraints = new ArrayList<IBeXDependentInjectivityConstraints>();
		for(Entry<List<IBeXContextPattern>, List<IBexDisjunctInjectivityConstraint>> entry: constraintMap.entrySet()) {
			IBeXDependentInjectivityConstraints depententConstraint = IBeXDisjunctPatternModelFactory.eINSTANCE.createIBeXDependentInjectivityConstraints();
			depententConstraint.getInjectivityConstraints().addAll(entry.getValue());
			depententConstraint.getPatterns().addAll(entry.getKey());
			dependentConstraints.add(depententConstraint);
		}
		return dependentConstraints;
	}
	
	/**
	 * tranform a constraint between two patterns
	 */
	private IBexDisjunctInjectivityConstraint transformConstraints(IBeXContextPattern pattern1, IBeXContextPattern pattern2, List<IBeXNodePair> nodes) {
		IBexDisjunctInjectivityConstraint constraint = IBeXDisjunctPatternModelFactory.eINSTANCE.createIBexDisjunctInjectivityConstraint();
		constraint.setPattern1(pattern1);
		constraint.setPattern2(pattern2);
		List<IBeXNode> nodes1 = nodes.stream()
				.filter(pair -> pattern1.getSignatureNodes().contains(pair.getValues().get(0)) || pattern1.getSignatureNodes().contains(pair.getValues().get(1)))
				.map(pair -> (pattern1.getSignatureNodes().contains(pair.getValues().get(0)))? pair.getValues().get(0) : pair.getValues().get(1)).collect(Collectors.toList());
		List<IBeXNode> nodes2 = nodes.stream()
				.filter(pair -> pattern2.getSignatureNodes().contains(pair.getValues().get(0)) || pattern2.getSignatureNodes().contains(pair.getValues().get(1)))
				.map(pair -> (pattern2.getSignatureNodes().contains(pair.getValues().get(0)))? pair.getValues().get(0) : pair.getValues().get(1)).collect(Collectors.toList());
		constraint.getNode1().addAll(nodes1);
		constraint.getNode2().addAll(nodes2);
		return constraint;
	}
}
