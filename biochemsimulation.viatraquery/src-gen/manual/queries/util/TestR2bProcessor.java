/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries.util;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import manual.queries.TestR2bMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the manual.queries.testR2b pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TestR2bProcessor implements IMatchProcessor<TestR2bMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pA the value of pattern parameter a in the currently processed match
   * @param pB the value of pattern parameter b in the currently processed match
   * 
   */
  public abstract void process(final AgentInstance pA, final AgentInstance pB);
  
  @Override
  public void process(final TestR2bMatch match) {
    process(match.getA(), match.getB());
  }
}
