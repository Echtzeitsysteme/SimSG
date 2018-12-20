package biochemsimulation.reactioncontainer.generator;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import biochemsimulation.reactioncontainer.Agent;
import biochemsimulation.reactioncontainer.Container;
import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactioncontainer.State;
import biochemsimulation.reactioncontainer.impl.ReactionContainerFactoryImpl;
import biochemsimulation.reactioncontainer.util.AgentClassFactory;
import biochemsimulation.reactioncontainer.util.AgentClassRegistry;
import biochemsimulation.reactioncontainer.util.AgentFactory;
import biochemsimulation.reactioncontainer.util.StateClassRegistry;
import biochemsimulation.reactioncontainer.util.StateFactory;
import biochemsimulation.reactionrules.reactionRules.Initial;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage;
import biochemsimulation.reactionrules.reactionRules.impl.ReactionRuleModelImpl;
import biochemsimulation.reactionrules.utils.PatternUtils;

public abstract class ReactionContainerGenerator {
	private String projectPath;
	private URI modelLocation;
	private Resource modelResource;
	protected ReactionRuleModelImpl model;
	private boolean isInitialized;
	
	
	
	private ReactionContainerFactory factory;
	protected Container containerModel;
	
	protected EPackage dynamicMetaModel;
	protected AgentClassRegistry agentClassRegistry;
	protected StateClassRegistry stateClassRegistry;
	protected AgentClassFactory agentClassFactory;
	protected AgentFactory agentFactory;
	protected StateFactory stateFactory;
	protected Map<String, State> stateInstances;
	
	private Map<Initial, InitializationTemplate> templates;
	
	protected URI containerURI;
	protected ResourceSet containerResSet;
	protected Resource containerRes;
	
	private void init() {
		ReactionRulesPackage.eINSTANCE.eClass();
		ReactionContainerPackage.eINSTANCE.eClass();
		factory = ReactionContainerFactoryImpl.init();
		
		projectPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		projectPath = projectPath.replaceFirst("/bin", "");
	}
	
	public ReactionContainerGenerator(URI modelLocation) {
		init();
		
		this.modelLocation = modelLocation;
		isInitialized = loadResource();
		if(isInitialized)
			isInitialized = loadModel();
		
	}
	
	public ReactionContainerGenerator(Resource model) {
		init();
		
		modelResource = model;
		isInitialized = model != null;
		if(isInitialized) {
			modelLocation = modelResource.getURI();
			isInitialized = loadModel();
		}
	}
	
	public ReactionContainerGenerator(ReactionRuleModel model) {
		init();
		
		modelResource = null;
		isInitialized = model != null;
		this.model = (ReactionRuleModelImpl) model;
	}
	
	private boolean loadResource() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ReactionRules", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		modelResource = null;
		try {
			modelResource = rs.getResource(modelLocation, true);
		}catch(Exception e) {
			System.out.println("Exceptionn occured while loading a resource: "+e.getClass()+": "+e.getMessage());
			return false;
		}
		if(modelResource != null)
			return true;
		
		return false;
		
	}
	
	private boolean loadModel() {
		model = (ReactionRuleModelImpl) modelResource.getContents().get(0);
		if(model != null) 
			return true;
		
		return false;
	}
	
	protected abstract void setContainerURI(String path);
	
	protected abstract void createAndSetResourceSet();
	
	protected abstract void createAndSetResource();
	
	protected abstract void saveModel() throws Exception;
	
	public void doGenerate(String path) throws Exception{
		generateAgentClasses();
		
		createAndSetResourceSet();
		setContainerURI(projectPath+"/generated/"+ model.getModel().getName() + ".xmi");
		createAndSetResource();
		
		containerModel = factory.createContainer();
		containerModel.setModelName(model.getModel().getName());
		
		createStateInstances();
		generateInitializationTemplates();
		createInstances();
		
		containerRes.getContents().add(containerModel);
		saveModel();
		
		containerRes.unload();
		
	}
	
	private void generateInitializationTemplates(){
		templates = new HashMap<Initial, InitializationTemplate>();
		List<Initial> initials = PatternUtils.getInitials(model);
		for(Initial init : initials) {
			templates.put(init, 
					new InitializationTemplate(PatternUtils.patternFromPatternAssignment(init.getInitialPattern()), 
							agentFactory, stateInstances));
		}
	}
	
	
	private void createInstances(){
		List<Agent> agents = new LinkedList<Agent>();
		for(Initial init : templates.keySet()) {
			int amount = (int) PatternUtils.valueOfNumericAssignment(init.getCount());
			agents.addAll(templates.get(init).createInstances(amount));
		}
		containerModel.getAgents().addAll(agents);
	}
	
	
	protected void generateAgentClasses() {
		dynamicMetaModel = EcoreFactory.eINSTANCE.createEPackage();

		dynamicMetaModel.setName(model.getModel().getName());
		dynamicMetaModel.setNsPrefix(model.getModel().getName());
		dynamicMetaModel.setNsURI("platform:/resource/reactioncontainer/generated/" + model.getModel().getName() + ".ecore");
		
		agentClassRegistry = new AgentClassRegistry();
		stateClassRegistry = new StateClassRegistry();
		agentClassFactory = new AgentClassFactory(dynamicMetaModel, agentClassRegistry, stateClassRegistry);
		
		model.getReactionProperties().forEach(x -> {
			if(x instanceof biochemsimulation.reactionrules.reactionRules.Agent) {
				biochemsimulation.reactionrules.reactionRules.Agent agnt = (biochemsimulation.reactionrules.reactionRules.Agent)x;
				agentClassFactory.createAgentClass(agnt);
			}
		});
		
		agentFactory = new AgentFactory(dynamicMetaModel, agentClassRegistry);
		stateFactory = new StateFactory(dynamicMetaModel, stateClassRegistry);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put( "ecore",
				new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource res = resSet.createResource(URI.createFileURI(projectPath+"/generated/"+ model.getModel().getName() + ".ecore"));
		
		res.getContents().add(dynamicMetaModel);
		
		
		Map<Object, Object> saveOptions = ((XMIResource)res).getDefaultSaveOptions();
		saveOptions.put(XMIResource.OPTION_ENCODING,"UTF-8");
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION,Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
		
		try {
			((XMIResource)res).save(saveOptions);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	protected void createStateInstances() {
		stateInstances = new HashMap<String, State>();
		
		stateClassRegistry.getAllClasses().forEach(stateClass -> {
			State state = stateFactory.createState(stateClass);
			containerModel.getStates().add(state);
			stateInstances.put(state.eClass().getName(), state);
		});;
	}
}
