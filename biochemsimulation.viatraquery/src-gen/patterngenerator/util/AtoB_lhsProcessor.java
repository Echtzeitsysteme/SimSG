/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator.util;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import patterngenerator.AtoB_lhsMatch;

/**
 * A match processor tailored for the patterngenerator.AtoB_lhs pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AtoB_lhsProcessor implements IMatchProcessor<AtoB_lhsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pA the value of pattern parameter A in the currently processed match
   * @param pAgent_A_Name the value of pattern parameter Agent_A_Name in the currently processed match
   * @param pA_xILS the value of pattern parameter A_xILS in the currently processed match
   * @param pA_x_ILS_name the value of pattern parameter A_x_ILS_name in the currently processed match
   * @param pA_x_ILS_state the value of pattern parameter A_x_ILS_state in the currently processed match
   * @param pB the value of pattern parameter B in the currently processed match
   * @param pAgent_B_Name the value of pattern parameter Agent_B_Name in the currently processed match
   * @param pB_xILS the value of pattern parameter B_xILS in the currently processed match
   * @param pB_x_ILS_name the value of pattern parameter B_x_ILS_name in the currently processed match
   * @param pB_x_ILS_state the value of pattern parameter B_x_ILS_state in the currently processed match
   * 
   */
  public abstract void process(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state);
  
  @Override
  public void process(final AtoB_lhsMatch match) {
    process(match.getA(), match.getAgent_A_Name(), match.getA_xILS(), match.getA_x_ILS_name(), match.getA_x_ILS_state(), match.getB(), match.getAgent_B_Name(), match.getB_xILS(), match.getB_x_ILS_name(), match.getB_x_ILS_state());
  }
}
