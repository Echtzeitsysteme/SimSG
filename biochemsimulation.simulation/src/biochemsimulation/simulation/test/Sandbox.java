package biochemsimulation.simulation.test;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import biochemsimulation.reactioncontainer.generator.ReactionContainerEMF;
import biochemsimulation.reactioncontainer.generator.ReactionContainerGenerator;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.persistence.PersistenceManager;
import biochemsimulation.simulation.persistence.PersistenceManagerEnum;
import biochemsimulation.simulation.persistence.PersistenceManagerFactory;
import biochemsimulation.simulation.persistence.PersistenceUtils;


public class Sandbox {

	public static void main(String[] args) {
		/*
		Resource modelResource = null;
		try {
			modelResource = PersistenceUtils.loadResource("C:\\Users\\sehmes\\Workspaces\\BioChemSimulation\\biochemsimulation.simulation\\data\\ReactionRuleModels\\Goldbeter_Koshland.xmi");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Pre..");
		EPackage.Registry.INSTANCE.entrySet().forEach(entry -> {
			System.out.println(entry.getKey()+" _ "+entry.getValue());
		});
		
		ReactionRuleModel model = (ReactionRuleModel) modelResource.getContents().get(0);
		ReactionContainerGenerator gen = new ReactionContainerEMF(model);
		
		Resource metaModelResource = null;
			
		try {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			metaModelResource = PersistenceUtils.loadResource("C:\\Users\\sehmes\\Workspaces\\BioChemSimulation\\biochemsimulation.reactioncontainer\\generated\\Goldbeter_Koshland.ecore");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		EPackage metaModel = (EPackage) metaModelResource.getContents().get(0);
		EPackage.Registry.INSTANCE.put(metaModel.getNsURI(), metaModel);
		
		try {
			gen.doGenerate("","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n Post..");
		EPackage.Registry.INSTANCE.entrySet().forEach(entry -> {
			System.out.println(entry.getKey()+" _ "+entry.getValue());
		});
		*/
		
		System.out.println("Pre..");
		EPackage.Registry.INSTANCE.entrySet().forEach(entry -> {
			System.out.println(entry.getKey()+" _ "+entry.getValue());
		});
		
		
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		try {
			pm.loadReactionRuleModel("Goldbeter_Koshland");
			pm.loadReactionContainerModel("Goldbeter_Koshland");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n Post..");
		EPackage.Registry.INSTANCE.entrySet().forEach(entry -> {
			System.out.println(entry.getKey()+" _ "+entry.getValue());
		});
	}
	
}
