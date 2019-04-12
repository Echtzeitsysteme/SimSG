package org.simsg.core.gt;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.utils.IBeXApiWrapper;

public class IBeXGT extends GraphTransformationEngine {
	
	private IBeXApiWrapper apiWrapper;
	private Map<String, GraphTransformationRule<?,?>> rules;
	private Method ruleApplicationMethod;

	@Override
	public void init() {
		apiWrapper = IBeXApiWrapper.getInstance();
		if(!apiWrapper.isInitialized()) {
			apiWrapper.initWrapper(simulationDefinition);
			try {
				apiWrapper.initEngine(simulationModel);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			rules = apiWrapper.getRules();
			ruleApplicationMethod = GraphTransformationRule.class.getDeclaredMethod("apply", GraphTransformationMatch.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void applyRule(SimSGMatch match) {
		try {
			ruleApplicationMethod.invoke(rules.get(match.getPatternName()), match.asGtMatch());
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
	}
	
}
