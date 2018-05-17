/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries.util;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import manual.queries.TestR1bMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the manual.queries.testR1b pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TestR1bProcessor implements IMatchProcessor<TestR1bMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pBI the value of pattern parameter bI in the currently processed match
   * @param pBILS the value of pattern parameter bILS in the currently processed match
   * @param pBN the value of pattern parameter bN in the currently processed match
   * @param pBsN the value of pattern parameter bsN in the currently processed match
   * @param pBLS the value of pattern parameter bLS in the currently processed match
   * 
   */
  public abstract void process(final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS);
  
  @Override
  public void process(final TestR1bMatch match) {
    process(match.getBI(), match.getBILS(), match.getBN(), match.getBsN(), match.getBLS());
  }
}
