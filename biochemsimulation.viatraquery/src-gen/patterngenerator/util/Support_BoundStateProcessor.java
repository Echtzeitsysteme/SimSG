/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator.util;

import biochemsimulation.reactioncontainer.SimBound;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import patterngenerator.Support_BoundStateMatch;

/**
 * A match processor tailored for the patterngenerator.support_BoundState pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Support_BoundStateProcessor implements IMatchProcessor<Support_BoundStateMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pLs the value of pattern parameter ls in the currently processed match
   * 
   */
  public abstract void process(final SimBound pLs);
  
  @Override
  public void process(final Support_BoundStateMatch match) {
    process(match.getLs());
  }
}
