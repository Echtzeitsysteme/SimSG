/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries.util;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import manual.queries.TestR1Match;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the manual.queries.testR1 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TestR1Processor implements IMatchProcessor<TestR1Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pA the value of pattern parameter a in the currently processed match
   * @param pAILS the value of pattern parameter aILS in the currently processed match
   * @param pAN the value of pattern parameter aN in the currently processed match
   * @param pAsN the value of pattern parameter asN in the currently processed match
   * @param pALS the value of pattern parameter aLS in the currently processed match
   * @param pBI the value of pattern parameter bI in the currently processed match
   * @param pBILS the value of pattern parameter bILS in the currently processed match
   * @param pBN the value of pattern parameter bN in the currently processed match
   * @param pBsN the value of pattern parameter bsN in the currently processed match
   * @param pBLS the value of pattern parameter bLS in the currently processed match
   * 
   */
  public abstract void process(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS);
  
  @Override
  public void process(final TestR1Match match) {
    process(match.getA(), match.getAILS(), match.getAN(), match.getAsN(), match.getALS(), match.getBI(), match.getBILS(), match.getBN(), match.getBsN(), match.getBLS());
  }
}
