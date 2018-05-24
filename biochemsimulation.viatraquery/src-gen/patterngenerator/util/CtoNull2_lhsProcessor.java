/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator.util;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import patterngenerator.CtoNull2_lhsMatch;

/**
 * A match processor tailored for the patterngenerator.CtoNull2_lhs pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CtoNull2_lhsProcessor implements IMatchProcessor<CtoNull2_lhsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pC the value of pattern parameter C in the currently processed match
   * 
   */
  public abstract void process(final AgentInstance pC);
  
  @Override
  public void process(final CtoNull2_lhsMatch match) {
    process(match.getC());
  }
}
