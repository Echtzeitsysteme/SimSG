/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator.util;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import patterngenerator.AExact_lhsMatch;

/**
 * A match processor tailored for the patterngenerator.AExact_lhs pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AExact_lhsProcessor implements IMatchProcessor<AExact_lhsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pA the value of pattern parameter A in the currently processed match
   * 
   */
  public abstract void process(final AgentInstance pA);
  
  @Override
  public void process(final AExact_lhsMatch match) {
    process(match.getA());
  }
}
