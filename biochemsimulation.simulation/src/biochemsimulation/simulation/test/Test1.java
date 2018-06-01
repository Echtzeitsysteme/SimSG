package biochemsimulation.simulation.test;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.persistence.PersistenceManager;
import biochemsimulation.simulation.persistence.SimplePersistenceManager;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersistenceManager pm = new SimplePersistenceManager();
		pm.init();
		pm.availableReactionContainerModels().forEach(x->System.out.println(x));
		pm.availableReactionRuleModels().forEach(x->System.out.println(x));
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("Blubb");
			System.out.println(model1.getModel().getName());
			ReactionContainer model2 = pm.loadReactionContainerModel("Blubb", true);
			System.out.println(model2.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
