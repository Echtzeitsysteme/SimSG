package org.simsg.core.gt;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.utils.IBeXApiWrapper;

public abstract class IBeXGT extends GraphTransformationEngine {
	
	protected IBeXApiWrapper apiWrapper;
	protected Map<String, GraphTransformationRule<?,?>> rules;
	protected Method ruleApplicationMethod;
	
	protected final String fqApiPackageName;
	
	protected IBeXGT(final String fqApiPackageName) {
		this.fqApiPackageName = fqApiPackageName;
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
