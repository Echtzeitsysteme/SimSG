package biochemsimulation.simulation.test;

import org.eclipse.emf.ecore.resource.Resource;

import biochemsimulation.reactioncontainer.generator.ReactionContainerEMF;
import biochemsimulation.reactioncontainer.generator.ReactionContainerGenerator;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.persistence.PersistenceUtils;


public class Sandbox {

	public static void main(String[] args) {
		Resource modelResource = null;
		try {
			modelResource = PersistenceUtils.loadResource("C:\\Users\\sehmes\\Workspaces\\BioChemSimulation\\biochemsimulation.simulation\\data\\ReactionRuleModels\\EGF_Pathway.xmi");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ReactionRuleModel model = (ReactionRuleModel) modelResource.getContents().get(0);
		ReactionContainerGenerator gen = new ReactionContainerEMF(model);
		try {
			gen.doGenerate("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
