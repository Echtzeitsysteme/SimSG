/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator.util;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import patterngenerator.Bla_lhsMatch;

/**
 * A match processor tailored for the patterngenerator.bla_lhs pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Bla_lhsProcessor implements IMatchProcessor<Bla_lhsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pA the value of pattern parameter A in the currently processed match
   * 
   */
  public abstract void process(final AgentInstance pA);
  
  @Override
  public void process(final Bla_lhsMatch match) {
    process(match.getA());
  }
}
