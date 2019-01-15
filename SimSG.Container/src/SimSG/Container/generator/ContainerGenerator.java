package SimSG.Container.generator;

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
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import SimSG.Container.Agent;
import SimSG.Container.Container;
import SimSG.Container.ContainerFactory;
import SimSG.Container.ContainerPackage;
import SimSG.Container.State;
import SimSG.Container.impl.ContainerFactoryImpl;
import SimSG.Container.util.AgentClassFactory;
import SimSG.Container.util.StateClassFactory;
import biochemsimulation.reactionrules.reactionRules.Initial;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage;
import biochemsimulation.reactionrules.reactionRules.impl.ReactionRuleModelImpl;
import biochemsimulation.reactionrules.utils.PatternUtils;

public abstract class ContainerGenerator {
	private String projectPath;
	private URI modelLocation;
	private Resource modelResource;
	protected ReactionRuleModelImpl model;
	private boolean isInitialized;
	
	private ContainerFactory factory;
	protected Container containerModel;
	
	protected EPackage dynamicMetaModel;
	protected AgentClassFactory agentClassFactory;
	protected StateClassFactory stateClassFactory;
	protected Map<String, State> stateInstances;
	
	private Map<Initial, InitializationTemplate> templates;
	
	protected URI containerURI;
	protected String metaModelPath;
	protected ResourceSet containerResSet;
	protected Resource containerRes;
	
	private void init() {
		ReactionRulesPackage.eINSTANCE.eClass();
		ContainerPackage.eINSTANCE.eClass();
		factory = ContainerFactoryImpl.init();
		
		projectPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		projectPath = projectPath.replaceFirst("/bin", "");
	}
	
	public ContainerGenerator(URI modelLocation) {
		init();
		
		this.modelLocation = modelLocation;
		isInitialized = loadResource();
		if(isInitialized)
			isInitialized = loadModel();
		
	}
	
	public ContainerGenerator(Resource model) {
		init();
		
		modelResource = model;
		isInitialized = model != null;
		if(isInitialized) {
			modelLocation = modelResource.getURI();
			isInitialized = loadModel();
		}
	}
	
	public ContainerGenerator(ReactionRuleModel model) {
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
	
	protected void setMetaModelPath(String path) {
		this.metaModelPath = path;
	}
	
	protected abstract void createAndSetResourceSet();
	
	protected abstract void createAndSetResource();
	
	protected abstract void saveModel() throws Exception;
	
	protected void saveMetaModel() throws Exception {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put( "ecore",
		//		new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource res = resSet.createResource(URI.createFileURI(metaModelPath));
		
		res.getContents().add(dynamicMetaModel);
		//EPackage.Registry.INSTANCE.put(dynamicMetaModel.getNsURI(), dynamicMetaModel);
		
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
	
	public void doGenerate(String modelPath, String metaModelPath) throws Exception{
		//setMetaModelPath(projectPath+"generated/"+ model.getModel().getName() + ".ecore");
		setMetaModelPath(metaModelPath);
		generateAgentClasses();
		
		createAndSetResourceSet();
		//setContainerURI(projectPath+"generated/"+ model.getModel().getName() + ".xmi");
		setContainerURI(modelPath);
		createAndSetResource();
		
		containerModel = factory.createContainer();
		containerModel.setModelName(model.getModel().getName());
		
		createStateInstances();
		generateInitializationTemplates();
		createInstances();
		
		containerRes.getContents().add(containerModel);
		saveModel();
		saveMetaModel();
		
		containerRes.unload();
		
	}
	
	private void generateInitializationTemplates(){
		templates = new HashMap<Initial, InitializationTemplate>();
		List<Initial> initials = PatternUtils.getInitials(model);
		for(Initial init : initials) {
			templates.put(init, new InitializationTemplate(PatternUtils.patternFromPatternAssignment(init.getInitialPattern()), 
					agentClassFactory, stateClassFactory, stateInstances));
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
		
		URI uri = createMetaModelURI(model.getModel().getName());
		dynamicMetaModel.setNsURI(uri.toString());
		
		//ReactionContainerPackage.eINSTANCE.getESubpackages().clear();
		ContainerPackage.eINSTANCE.getESubpackages().add(dynamicMetaModel);
		
		stateClassFactory = new StateClassFactory(dynamicMetaModel);
		agentClassFactory = new AgentClassFactory(dynamicMetaModel, stateClassFactory);
		
		
		model.getReactionProperties().forEach(x -> {
			if(x instanceof biochemsimulation.reactionrules.reactionRules.Agent) {
				biochemsimulation.reactionrules.reactionRules.Agent agnt = (biochemsimulation.reactionrules.reactionRules.Agent)x;
				agentClassFactory.createClass(agnt);
			}
		});

	}
	
	protected void createStateInstances() {
		stateInstances = new HashMap<String, State>();
		
		stateClassFactory.getEClassRegistry().getAllClasses().forEach(stateClass -> {
			State state = stateClassFactory.getEObjectFactory().createObject(stateClass);
			containerModel.getStates().add(state);
			stateInstances.put(state.eClass().getName(), state);
		});;
	}
	
	public static URI createMetaModelURI(String modelName) {
		return URI.createPlatformResourceURI("SimSG.Container/generated/"+modelName, true);
	}
}
