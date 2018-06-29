package biochemsimulation.reactioncontainer.generator;

import java.util.List;

import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;

public interface LinkStateTemplate {
	public SimLinkState createInstance(ReactionContainerFactory factory, List<SimLinkState> simLinkStates, SimSite site);
}
