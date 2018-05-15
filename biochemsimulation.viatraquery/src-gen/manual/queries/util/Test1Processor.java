/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries.util;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import manual.queries.Test1Match;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the manual.queries.test1 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Test1Processor implements IMatchProcessor<Test1Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pAgentI the value of pattern parameter agentI in the currently processed match
   * 
   */
  public abstract void process(final AgentInstance pAgentI);
  
  @Override
  public void process(final Test1Match match) {
    process(match.getAgentI());
  }
}
