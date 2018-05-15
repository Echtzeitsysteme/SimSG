/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries.util;

import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import manual.queries.Test3Match;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the manual.queries.test3 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Test3Processor implements IMatchProcessor<Test3Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pAll the value of pattern parameter all in the currently processed match
   * 
   */
  public abstract void process(final ReactionRuleModel pAll);
  
  @Override
  public void process(final Test3Match match) {
    process(match.getAll());
  }
}
