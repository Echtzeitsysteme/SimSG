/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator.util;

import biochemsimulation.reactioncontainer.SimAgent;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import patterngenerator.AtoB_rhsMatch;

/**
 * A match processor tailored for the patterngenerator.AtoB_rhs pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AtoB_rhsProcessor implements IMatchProcessor<AtoB_rhsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pA the value of pattern parameter A in the currently processed match
   * @param pB the value of pattern parameter B in the currently processed match
   * 
   */
  public abstract void process(final SimAgent pA, final SimAgent pB);
  
  @Override
  public void process(final AtoB_rhsMatch match) {
    process(match.getA(), match.getB());
  }
}
