package org.simsg.core.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.emoflon.ibex.gt.api.GraphTransformationApp;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXModel;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;

public class IBeXApiWrapper {
	
	private static IBeXApiWrapper instance;
	
	private String nameSpace;
	private String packageName;
	
	private Class<GraphTransformationApp<?>> engineAppClass;
	private Class<GraphTransformationApp<?>> appClass;
	private Class<GraphTransformationAPI> apiClass;
	private Method registerMetaModels;
	private Map<String, Method> matcherGetter = new HashMap<>();
	
	private GraphTransformationApp<?> engineApp;
	private GraphTransformationAPI api;
	
	private Map<String, GraphTransformationPattern<?,?>> matcher = new HashMap<>();
	private Map<String, GraphTransformationRule<?,?>> rules = new HashMap<>();
	
	private Resource simulationModel;
	private IBeXModel ibexModel;
	
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
	
	public void initDemoclesWrapper(final IBeXModel ibexModel, final String fqApiPackageName) {
		this.ibexModel = ibexModel;
		setNameSpaceAndPackageName(fqApiPackageName);
		initDemoclesApp();
		initApiClasses();
		initMatcherGetter();
		wrapperInitialized = true;
		System.out.println("Actual engine: "+ engineAppClass);
	}
	
	public void initHiPEWrapper(final IBeXModel ibexModel, final String fqApiPackageName) {
		this.ibexModel = ibexModel;
		setNameSpaceAndPackageName(fqApiPackageName);
		initHiPEApp();
		initApiClasses();
		initMatcherGetter();
		wrapperInitialized = true;
		System.out.println("Actual engine: "+ engineAppClass);
	}
	
	public GraphTransformationAPI initEngine(Resource simulationModel) throws IncompleteInitializationException {
		this.simulationModel = simulationModel;
		if(!wrapperInitialized) {
			throw new IncompleteInitializationException("IBeX wrapper must be initialized before initializing the Match/GT-Engine aka IBeXApi.");
		}
		try {
			registerMetaModels.invoke(engineApp);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		engineApp.getModel().getResources().add(this.simulationModel);
		api = engineApp.initAPI();
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
	
//	private void setNameSpaceAndPackageName() {
//		URI uri = URI.createFileURI(simulationDefinition.getGtRulesURI()).trimSegments(2);
//		List<String> segments = new LinkedList<>(uri.segmentsList());
//		segments.remove(0);
//		uri = URI.createFileURI(segments.stream()
//				.reduce("", (str1, str2) -> {
//						if(!str1.equals("")) {
//							return str1 +"/"+str2;
//						}else {
//							return str1 + str2;
//						}
//					}
//				));
//		String ns = uri.toString().replace("/", ".");
//		
//		packageName = uri.lastSegment().substring(0,1).toUpperCase() + uri.lastSegment().substring(1, uri.lastSegment().length());
//		nameSpace = ns+".api";
//
//	}
	
	private void setNameSpaceAndPackageName(String fqApiPackageName) {
	nameSpace = fqApiPackageName;
	URI uri = URI.createFileURI(fqApiPackageName.replace(".", "/")).trimSegments(1);
	packageName = uri.lastSegment().substring(0,1).toUpperCase() + uri.lastSegment().substring(1, uri.lastSegment().length());

}
	
	@SuppressWarnings("unchecked")
	private void initDemoclesApp() {
		try {
			engineAppClass = (Class<GraphTransformationApp<?>>)java.lang.Class.forName(nameSpace+"."+packageName+"DemoclesApp");
			engineApp = engineAppClass.newInstance();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	private void initHiPEApp() {
		try {
			engineAppClass = (Class<GraphTransformationApp<?>>)java.lang.Class.forName(nameSpace+"."+packageName+"HiPEApp");
			engineApp = engineAppClass.newInstance();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	private void initApiClasses() {
		try {
			appClass = (Class<GraphTransformationApp<?>>)java.lang.Class.forName(nameSpace+"."+packageName+"App");
			registerMetaModels = appClass.getDeclaredMethod("registerMetaModels");
			apiClass = (Class<GraphTransformationAPI>)java.lang.Class.forName(nameSpace+"."+packageName+"API");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}  catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
	
	private void initMatcherGetter() {
		
		Map<String, Method> apiMethodsByName = new HashMap<>();
		Method[] m = apiClass.getDeclaredMethods();
		for(int i = 0; i<m.length; i++) {
			Method met = m[i];
			apiMethodsByName.put(met.getName(), met);
		}
		
		for(IBeXPattern pattern : ibexModel.getPatternSet().getContextPatterns().stream()
				.filter(pattern -> !pattern.getName().contains("CONDITION"))
				.collect(Collectors.toList())) {
			Method getter = null;
			
			try {
				if(!apiMethodsByName.containsKey(pattern.getName())) {
					System.out.println("Pattern "+pattern.getName()+" does not seem to have a generated api -> might be abstract or conidition.");
				}
				getter = apiMethodsByName.get(pattern.getName());
			} catch (SecurityException e) {
				e.printStackTrace();
			}
			
			if(getter != null) {
				matcherGetter.put(pattern.getName(), getter);
			}
		}
		
		for(IBeXRule rule : ibexModel.getRuleSet().getRules()) {
			Method getter = null;
			
			try {
				if(!apiMethodsByName.containsKey(rule.getName())) {
					throw new NoSuchMethodException("Method with name: "+rule.getName()+" not found in Class: "+apiClass.getName());
				}
				getter = apiMethodsByName.get(rule.getName());
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
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
				List<Class<?>> paramTypes = Arrays.asList(getter.getParameterTypes());
				List<Object> params = new LinkedList<>();
				for(Class<?> paramType : paramTypes) {
					params.add(instantiatePrimitiveTypes(paramType));
				}
				if(paramTypes.size() > 0) {
					matcher = (GraphTransformationPattern<?,?>)getter.invoke(api, params.toArray());
				}else {
					matcher = (GraphTransformationPattern<?,?>)getter.invoke(api);
				}
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
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
	
	public static Object instantiatePrimitiveTypes(Class<?> type) {
		switch(type.getName()) {
			case "float" : {
				return new Float(0);
			}
			case "double" : {
				return new Double(0);
			}
			case "byte" : {
				return new Byte((byte)0x00);
			}
			case "short" : {
				return new Short((short)0);
			}
			case "int" : {
				return new Integer(0);
			}
			case "long" : {
				return new Long(0);
			}
			case "char" : {
				return new Character('\0');
			}
			case "String" : {
				return "";
			}
			case "boolean" : {
				return new Boolean(false);
			}
			default : {
				System.err.println("Rule parameters do not allow for non primitive types.");
				return null;
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
