/**
 * Generated from platform:/resource/biochemsimulation.viatrapatterns/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator.util;

import biochemsimulation.reactioncontainer.SimAgent;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import patterngenerator.Blubb_lhsMatch;

/**
 * A match processor tailored for the patterngenerator.blubb_lhs pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Blubb_lhsProcessor implements IMatchProcessor<Blubb_lhsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pD the value of pattern parameter D in the currently processed match
   * @param pD1 the value of pattern parameter D1 in the currently processed match
   * 
   */
  public abstract void process(final SimAgent pD, final SimAgent pD1);
  
  @Override
  public void process(final Blubb_lhsMatch match) {
    process(match.getD(), match.getD1());
  }
}
