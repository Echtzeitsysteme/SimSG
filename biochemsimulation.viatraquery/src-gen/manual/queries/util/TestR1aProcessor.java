/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries.util;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import manual.queries.TestR1aMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the manual.queries.testR1a pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TestR1aProcessor implements IMatchProcessor<TestR1aMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pA the value of pattern parameter a in the currently processed match
   * @param pAgentName the value of pattern parameter agentName in the currently processed match
   * @param pSiteName the value of pattern parameter siteName in the currently processed match
   * 
   */
  public abstract void process(final AgentInstance pA, final String pAgentName, final String pSiteName);
  
  @Override
  public void process(final TestR1aMatch match) {
    process(match.getA(), match.getAgentName(), match.getSiteName());
  }
}
