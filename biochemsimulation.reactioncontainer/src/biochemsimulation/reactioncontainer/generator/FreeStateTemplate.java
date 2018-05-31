package biochemsimulation.reactioncontainer.generator;

import biochemsimulation.reactioncontainer.ReactioncontainerFactory;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;

public class FreeStateTemplate implements LinkStateTemplate {

	@Override
	public SimLinkState createInstance(ReactioncontainerFactory factory, SimSite site) {
		SimLinkState newLinkState = factory.createSimFree();
		newLinkState.setSimSite1(site);
		return newLinkState;
	}

}
