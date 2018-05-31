package biochemsimulation.reactioncontainer.generator;

import biochemsimulation.reactioncontainer.ReactioncontainerFactory;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;

public interface LinkStateTemplate {
	public SimLinkState createInstance(ReactioncontainerFactory factory, SimSite site);
}
