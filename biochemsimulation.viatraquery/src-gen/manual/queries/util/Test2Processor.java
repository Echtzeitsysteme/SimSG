/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries.util;

import biochemsimulation.reactionrules.reactionRules.Model;
import manual.queries.Test2Match;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the manual.queries.test2 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Test2Processor implements IMatchProcessor<Test2Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pModel the value of pattern parameter model in the currently processed match
   * 
   */
  public abstract void process(final Model pModel);
  
  @Override
  public void process(final Test2Match match) {
    process(match.getModel());
  }
}
