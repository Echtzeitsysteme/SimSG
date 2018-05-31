package biochemsimulation.reactioncontainer.generator;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactioncontainerFactory;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;

public interface LinkStateTemplate {
	public SimLinkState createInstance(ReactioncontainerFactory factory, ReactionContainer container, SimSite site);
}
