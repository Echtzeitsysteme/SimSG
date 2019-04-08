package org.simsg.core.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.emoflon.ibex.gt.api.GraphTransformationApp;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.emoflon.ibex.gt.api.GraphTransformationRule;

import GTLanguage.GTRule;
import IBeXLanguage.IBeXPattern;
import SimulationDefinition.SimDefinition;

public class IBeXApiWrapper {
	
	private static IBeXApiWrapper instance;
	
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
	private Map<String, GraphTransformationRule<?,?>> rules = new HashMap<>();
	
	private Resource simulationModel;
	private SimDefinition simulationDefinition;
	
	private boolean wrapperInitialized = false;
	private boolean apiInitialized = false;
	
	private IBeXApiWrapper() {
		
	}
	
	public static synchronized IBeXApiWrapper getInstance() {
		if(instance == null) {
			instance = new IBeXApiWrapper();
		}
		
		return instance;
	}
	
	public boolean isInitialized() {
		return wrapperInitialized && apiInitialized;
	}
	
	public GraphTransformationAPI getApi() throws IncompleteInitializationException {
		if(!wrapperInitialized) {
			throw new IncompleteInitializationException("IBeX wrapper is not initialized.");
		}
		return api;
	}
	
	public Class<GraphTransformationAPI> getApiClass() {
		return apiClass;
	}
	
	public void initWrapper(SimDefinition simulationDefinition) {
		this.simulationDefinition = simulationDefinition;
		setNameSpaceAndPackageName();
		initDemoclesApp();
		initDemoclesApiClasses();
		initMatcherGetter();
		wrapperInitialized = true;
	}
	
	public GraphTransformationAPI initEngine(Resource simulationModel) throws IncompleteInitializationException {
		this.simulationModel = simulationModel;
		if(!wrapperInitialized) {
			throw new IncompleteInitializationException("IBeX wrapper must be initialized before initializing the Match/GT-Engine aka IBeXApi.");
		}
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
		democlesApp.getModel().getResources().add(this.simulationModel);
		api = democlesApp.initAPI();
		initMatcher();
		initRules();
		apiInitialized = true;
		return api;
	}
	
	public Map<String, GraphTransformationPattern<?,?>> getMatcher() throws IncompleteInitializationException {
		if(!wrapperInitialized && !apiInitialized) {
			throw new IncompleteInitializationException("IBeX api the Match/GT-Engine must be initialized otherwise matchers can not be generated.");
		}
		return matcher;
	}
	
	public Map<String, GraphTransformationRule<?,?>> getRules() throws IncompleteInitializationException {
		if(!wrapperInitialized && !apiInitialized) {
			throw new IncompleteInitializationException("IBeX api the Match/GT-Engine must be initialized otherwise rules can not be generated.");
		}
		return rules;
	}
	
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
	
	private void initRules() {
		for(String name : matcher.keySet()) {
			Object rObj = matcher.get(name);
			if(rObj instanceof GraphTransformationRule<?,?>) {
				GraphTransformationRule<?,?> r = (GraphTransformationRule<?,?>) matcher.get(name);
				rules.put(name, r);
			}
		}
	}
}

class IncompleteInitializationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IncompleteInitializationException(String errorMessage) {
		super(errorMessage);
	}
	
}
