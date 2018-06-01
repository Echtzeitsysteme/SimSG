package biochemsimulation.reactioncontainer.generator;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;

public interface LinkStateTemplate {
	public SimLinkState createInstance(ReactionContainerFactory factory, ReactionContainer container, SimSite site);
}
