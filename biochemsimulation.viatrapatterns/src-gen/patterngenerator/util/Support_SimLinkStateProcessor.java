/**
 * Generated from platform:/resource/biochemsimulation.viatrapatterns/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator.util;

import biochemsimulation.reactioncontainer.SimSite;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import patterngenerator.Support_SimLinkStateMatch;

/**
 * A match processor tailored for the patterngenerator.support_SimLinkState pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Support_SimLinkStateProcessor implements IMatchProcessor<Support_SimLinkStateMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSs the value of pattern parameter ss in the currently processed match
   * 
   */
  public abstract void process(final SimSite pSs);
  
  @Override
  public void process(final Support_SimLinkStateMatch match) {
    process(match.getSs());
  }
}
