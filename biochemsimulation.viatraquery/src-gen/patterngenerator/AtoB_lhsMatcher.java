/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import patterngenerator.AtoB_lhsMatch;
import patterngenerator.util.AtoB_lhsQuerySpecification;

/**
 * Generated pattern matcher API of the patterngenerator.AtoB_lhs pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AtoB_lhsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern AtoB_lhs( A: AgentInstance, Agent_A_Name: java String,  A_xILS: AgentInstanceLinkState, A_x_ILS_name: java String, A_x_ILS_state: FreeLink,  B: AgentInstance, Agent_B_Name: java String,  B_xILS: AgentInstanceLinkState, B_x_ILS_name: java String, B_x_ILS_state: FreeLink) {
 * 	AgentInstance.agent.name(A, Agent_A_Name);
 * 		check (
 * 			Agent_A_Name.matches("A")
 * 		);
 * 		AgentInstance.linkStates(A, A_xILS);
 * 		AgentInstanceLinkState.site.name(A_xILS, A_x_ILS_name);
 * 			check (
 * 				A_x_ILS_name.matches("x")
 * 			);
 * 		AgentInstanceLinkState.linkState.linkState(A_xILS, A_x_ILS_state);
 * 	AgentInstance.agent.name(B, Agent_B_Name);
 * 		check (
 * 			Agent_B_Name.matches("B")
 * 		); 
 * 		AgentInstance.linkStates(B, B_xILS);
 * 		AgentInstanceLinkState.site.name(B_xILS, B_x_ILS_name);
 * 			check (
 * 				B_x_ILS_name.matches("x")
 * 			);
 * 		AgentInstanceLinkState.linkState.linkState(B_xILS, B_x_ILS_state);
 * 	
 * }
 * </pre></code>
 * 
 * @see AtoB_lhsMatch
 *  @see AtoB_lhsProcessor
 * @see AtoB_lhsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AtoB_lhsMatcher extends BaseMatcher<AtoB_lhsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AtoB_lhsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    AtoB_lhsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (AtoB_lhsMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static AtoB_lhsMatcher create() throws ViatraQueryException {
    return new AtoB_lhsMatcher();
  }
  
  private final static int POSITION_A = 0;
  
  private final static int POSITION_AGENT_A_NAME = 1;
  
  private final static int POSITION_A_XILS = 2;
  
  private final static int POSITION_A_X_ILS_NAME = 3;
  
  private final static int POSITION_A_X_ILS_STATE = 4;
  
  private final static int POSITION_B = 5;
  
  private final static int POSITION_AGENT_B_NAME = 6;
  
  private final static int POSITION_B_XILS = 7;
  
  private final static int POSITION_B_X_ILS_NAME = 8;
  
  private final static int POSITION_B_X_ILS_STATE = 9;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AtoB_lhsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private AtoB_lhsMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pAgent_A_Name the fixed value of pattern parameter Agent_A_Name, or null if not bound.
   * @param pA_xILS the fixed value of pattern parameter A_xILS, or null if not bound.
   * @param pA_x_ILS_name the fixed value of pattern parameter A_x_ILS_name, or null if not bound.
   * @param pA_x_ILS_state the fixed value of pattern parameter A_x_ILS_state, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @param pAgent_B_Name the fixed value of pattern parameter Agent_B_Name, or null if not bound.
   * @param pB_xILS the fixed value of pattern parameter B_xILS, or null if not bound.
   * @param pB_x_ILS_name the fixed value of pattern parameter B_x_ILS_name, or null if not bound.
   * @param pB_x_ILS_state the fixed value of pattern parameter B_x_ILS_state, or null if not bound.
   * @return matches represented as a AtoB_lhsMatch object.
   * 
   */
  public Collection<AtoB_lhsMatch> getAllMatches(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    return rawGetAllMatches(new Object[]{pA, pAgent_A_Name, pA_xILS, pA_x_ILS_name, pA_x_ILS_state, pB, pAgent_B_Name, pB_xILS, pB_x_ILS_name, pB_x_ILS_state});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pAgent_A_Name the fixed value of pattern parameter Agent_A_Name, or null if not bound.
   * @param pA_xILS the fixed value of pattern parameter A_xILS, or null if not bound.
   * @param pA_x_ILS_name the fixed value of pattern parameter A_x_ILS_name, or null if not bound.
   * @param pA_x_ILS_state the fixed value of pattern parameter A_x_ILS_state, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @param pAgent_B_Name the fixed value of pattern parameter Agent_B_Name, or null if not bound.
   * @param pB_xILS the fixed value of pattern parameter B_xILS, or null if not bound.
   * @param pB_x_ILS_name the fixed value of pattern parameter B_x_ILS_name, or null if not bound.
   * @param pB_x_ILS_state the fixed value of pattern parameter B_x_ILS_state, or null if not bound.
   * @return a match represented as a AtoB_lhsMatch object, or null if no match is found.
   * 
   */
  public AtoB_lhsMatch getOneArbitraryMatch(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    return rawGetOneArbitraryMatch(new Object[]{pA, pAgent_A_Name, pA_xILS, pA_x_ILS_name, pA_x_ILS_state, pB, pAgent_B_Name, pB_xILS, pB_x_ILS_name, pB_x_ILS_state});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pAgent_A_Name the fixed value of pattern parameter Agent_A_Name, or null if not bound.
   * @param pA_xILS the fixed value of pattern parameter A_xILS, or null if not bound.
   * @param pA_x_ILS_name the fixed value of pattern parameter A_x_ILS_name, or null if not bound.
   * @param pA_x_ILS_state the fixed value of pattern parameter A_x_ILS_state, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @param pAgent_B_Name the fixed value of pattern parameter Agent_B_Name, or null if not bound.
   * @param pB_xILS the fixed value of pattern parameter B_xILS, or null if not bound.
   * @param pB_x_ILS_name the fixed value of pattern parameter B_x_ILS_name, or null if not bound.
   * @param pB_x_ILS_state the fixed value of pattern parameter B_x_ILS_state, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    return rawHasMatch(new Object[]{pA, pAgent_A_Name, pA_xILS, pA_x_ILS_name, pA_x_ILS_state, pB, pAgent_B_Name, pB_xILS, pB_x_ILS_name, pB_x_ILS_state});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pAgent_A_Name the fixed value of pattern parameter Agent_A_Name, or null if not bound.
   * @param pA_xILS the fixed value of pattern parameter A_xILS, or null if not bound.
   * @param pA_x_ILS_name the fixed value of pattern parameter A_x_ILS_name, or null if not bound.
   * @param pA_x_ILS_state the fixed value of pattern parameter A_x_ILS_state, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @param pAgent_B_Name the fixed value of pattern parameter Agent_B_Name, or null if not bound.
   * @param pB_xILS the fixed value of pattern parameter B_xILS, or null if not bound.
   * @param pB_x_ILS_name the fixed value of pattern parameter B_x_ILS_name, or null if not bound.
   * @param pB_x_ILS_state the fixed value of pattern parameter B_x_ILS_state, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    return rawCountMatches(new Object[]{pA, pAgent_A_Name, pA_xILS, pA_x_ILS_name, pA_x_ILS_state, pB, pAgent_B_Name, pB_xILS, pB_x_ILS_name, pB_x_ILS_state});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pAgent_A_Name the fixed value of pattern parameter Agent_A_Name, or null if not bound.
   * @param pA_xILS the fixed value of pattern parameter A_xILS, or null if not bound.
   * @param pA_x_ILS_name the fixed value of pattern parameter A_x_ILS_name, or null if not bound.
   * @param pA_x_ILS_state the fixed value of pattern parameter A_x_ILS_state, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @param pAgent_B_Name the fixed value of pattern parameter Agent_B_Name, or null if not bound.
   * @param pB_xILS the fixed value of pattern parameter B_xILS, or null if not bound.
   * @param pB_x_ILS_name the fixed value of pattern parameter B_x_ILS_name, or null if not bound.
   * @param pB_x_ILS_state the fixed value of pattern parameter B_x_ILS_state, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state, final IMatchProcessor<? super AtoB_lhsMatch> processor) {
    rawForEachMatch(new Object[]{pA, pAgent_A_Name, pA_xILS, pA_x_ILS_name, pA_x_ILS_state, pB, pAgent_B_Name, pB_xILS, pB_x_ILS_name, pB_x_ILS_state}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pAgent_A_Name the fixed value of pattern parameter Agent_A_Name, or null if not bound.
   * @param pA_xILS the fixed value of pattern parameter A_xILS, or null if not bound.
   * @param pA_x_ILS_name the fixed value of pattern parameter A_x_ILS_name, or null if not bound.
   * @param pA_x_ILS_state the fixed value of pattern parameter A_x_ILS_state, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @param pAgent_B_Name the fixed value of pattern parameter Agent_B_Name, or null if not bound.
   * @param pB_xILS the fixed value of pattern parameter B_xILS, or null if not bound.
   * @param pB_x_ILS_name the fixed value of pattern parameter B_x_ILS_name, or null if not bound.
   * @param pB_x_ILS_state the fixed value of pattern parameter B_x_ILS_state, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state, final IMatchProcessor<? super AtoB_lhsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pA, pAgent_A_Name, pA_xILS, pA_x_ILS_name, pA_x_ILS_state, pB, pAgent_B_Name, pB_xILS, pB_x_ILS_name, pB_x_ILS_state}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pAgent_A_Name the fixed value of pattern parameter Agent_A_Name, or null if not bound.
   * @param pA_xILS the fixed value of pattern parameter A_xILS, or null if not bound.
   * @param pA_x_ILS_name the fixed value of pattern parameter A_x_ILS_name, or null if not bound.
   * @param pA_x_ILS_state the fixed value of pattern parameter A_x_ILS_state, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @param pAgent_B_Name the fixed value of pattern parameter Agent_B_Name, or null if not bound.
   * @param pB_xILS the fixed value of pattern parameter B_xILS, or null if not bound.
   * @param pB_x_ILS_name the fixed value of pattern parameter B_x_ILS_name, or null if not bound.
   * @param pB_x_ILS_state the fixed value of pattern parameter B_x_ILS_state, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AtoB_lhsMatch newMatch(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    return AtoB_lhsMatch.newMatch(pA, pAgent_A_Name, pA_xILS, pA_x_ILS_name, pA_x_ILS_state, pB, pAgent_B_Name, pB_xILS, pB_x_ILS_name, pB_x_ILS_state);
  }
  
  /**
   * Retrieve the set of values that occur in matches for A.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AgentInstance> rawAccumulateAllValuesOfA(final Object[] parameters) {
    Set<AgentInstance> results = new HashSet<AgentInstance>();
    rawAccumulateAllValues(POSITION_A, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for A.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfA() {
    return rawAccumulateAllValuesOfA(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for A.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfA(final AtoB_lhsMatch partialMatch) {
    return rawAccumulateAllValuesOfA(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for A.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfA(final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    return rawAccumulateAllValuesOfA(new Object[]{
    null, 
    pAgent_A_Name, 
    pA_xILS, 
    pA_x_ILS_name, 
    pA_x_ILS_state, 
    pB, 
    pAgent_B_Name, 
    pB_xILS, 
    pB_x_ILS_name, 
    pB_x_ILS_state
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for Agent_A_Name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfAgent_A_Name(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_AGENT_A_NAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Agent_A_Name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfAgent_A_Name() {
    return rawAccumulateAllValuesOfAgent_A_Name(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Agent_A_Name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfAgent_A_Name(final AtoB_lhsMatch partialMatch) {
    return rawAccumulateAllValuesOfAgent_A_Name(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Agent_A_Name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfAgent_A_Name(final AgentInstance pA, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    return rawAccumulateAllValuesOfAgent_A_Name(new Object[]{
    pA, 
    null, 
    pA_xILS, 
    pA_x_ILS_name, 
    pA_x_ILS_state, 
    pB, 
    pAgent_B_Name, 
    pB_xILS, 
    pB_x_ILS_name, 
    pB_x_ILS_state
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for A_xILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AgentInstanceLinkState> rawAccumulateAllValuesOfA_xILS(final Object[] parameters) {
    Set<AgentInstanceLinkState> results = new HashSet<AgentInstanceLinkState>();
    rawAccumulateAllValues(POSITION_A_XILS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for A_xILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstanceLinkState> getAllValuesOfA_xILS() {
    return rawAccumulateAllValuesOfA_xILS(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for A_xILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstanceLinkState> getAllValuesOfA_xILS(final AtoB_lhsMatch partialMatch) {
    return rawAccumulateAllValuesOfA_xILS(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for A_xILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstanceLinkState> getAllValuesOfA_xILS(final AgentInstance pA, final String pAgent_A_Name, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    return rawAccumulateAllValuesOfA_xILS(new Object[]{
    pA, 
    pAgent_A_Name, 
    null, 
    pA_x_ILS_name, 
    pA_x_ILS_state, 
    pB, 
    pAgent_B_Name, 
    pB_xILS, 
    pB_x_ILS_name, 
    pB_x_ILS_state
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for A_x_ILS_name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfA_x_ILS_name(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_A_X_ILS_NAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for A_x_ILS_name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfA_x_ILS_name() {
    return rawAccumulateAllValuesOfA_x_ILS_name(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for A_x_ILS_name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfA_x_ILS_name(final AtoB_lhsMatch partialMatch) {
    return rawAccumulateAllValuesOfA_x_ILS_name(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for A_x_ILS_name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfA_x_ILS_name(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    return rawAccumulateAllValuesOfA_x_ILS_name(new Object[]{
    pA, 
    pAgent_A_Name, 
    pA_xILS, 
    null, 
    pA_x_ILS_state, 
    pB, 
    pAgent_B_Name, 
    pB_xILS, 
    pB_x_ILS_name, 
    pB_x_ILS_state
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for A_x_ILS_state.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<FreeLink> rawAccumulateAllValuesOfA_x_ILS_state(final Object[] parameters) {
    Set<FreeLink> results = new HashSet<FreeLink>();
    rawAccumulateAllValues(POSITION_A_X_ILS_STATE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for A_x_ILS_state.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<FreeLink> getAllValuesOfA_x_ILS_state() {
    return rawAccumulateAllValuesOfA_x_ILS_state(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for A_x_ILS_state.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<FreeLink> getAllValuesOfA_x_ILS_state(final AtoB_lhsMatch partialMatch) {
    return rawAccumulateAllValuesOfA_x_ILS_state(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for A_x_ILS_state.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<FreeLink> getAllValuesOfA_x_ILS_state(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    return rawAccumulateAllValuesOfA_x_ILS_state(new Object[]{
    pA, 
    pAgent_A_Name, 
    pA_xILS, 
    pA_x_ILS_name, 
    null, 
    pB, 
    pAgent_B_Name, 
    pB_xILS, 
    pB_x_ILS_name, 
    pB_x_ILS_state
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for B.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AgentInstance> rawAccumulateAllValuesOfB(final Object[] parameters) {
    Set<AgentInstance> results = new HashSet<AgentInstance>();
    rawAccumulateAllValues(POSITION_B, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for B.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfB() {
    return rawAccumulateAllValuesOfB(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for B.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfB(final AtoB_lhsMatch partialMatch) {
    return rawAccumulateAllValuesOfB(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for B.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfB(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    return rawAccumulateAllValuesOfB(new Object[]{
    pA, 
    pAgent_A_Name, 
    pA_xILS, 
    pA_x_ILS_name, 
    pA_x_ILS_state, 
    null, 
    pAgent_B_Name, 
    pB_xILS, 
    pB_x_ILS_name, 
    pB_x_ILS_state
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for Agent_B_Name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfAgent_B_Name(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_AGENT_B_NAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Agent_B_Name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfAgent_B_Name() {
    return rawAccumulateAllValuesOfAgent_B_Name(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Agent_B_Name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfAgent_B_Name(final AtoB_lhsMatch partialMatch) {
    return rawAccumulateAllValuesOfAgent_B_Name(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Agent_B_Name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfAgent_B_Name(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    return rawAccumulateAllValuesOfAgent_B_Name(new Object[]{
    pA, 
    pAgent_A_Name, 
    pA_xILS, 
    pA_x_ILS_name, 
    pA_x_ILS_state, 
    pB, 
    null, 
    pB_xILS, 
    pB_x_ILS_name, 
    pB_x_ILS_state
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for B_xILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AgentInstanceLinkState> rawAccumulateAllValuesOfB_xILS(final Object[] parameters) {
    Set<AgentInstanceLinkState> results = new HashSet<AgentInstanceLinkState>();
    rawAccumulateAllValues(POSITION_B_XILS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for B_xILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstanceLinkState> getAllValuesOfB_xILS() {
    return rawAccumulateAllValuesOfB_xILS(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for B_xILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstanceLinkState> getAllValuesOfB_xILS(final AtoB_lhsMatch partialMatch) {
    return rawAccumulateAllValuesOfB_xILS(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for B_xILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstanceLinkState> getAllValuesOfB_xILS(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    return rawAccumulateAllValuesOfB_xILS(new Object[]{
    pA, 
    pAgent_A_Name, 
    pA_xILS, 
    pA_x_ILS_name, 
    pA_x_ILS_state, 
    pB, 
    pAgent_B_Name, 
    null, 
    pB_x_ILS_name, 
    pB_x_ILS_state
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for B_x_ILS_name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfB_x_ILS_name(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_B_X_ILS_NAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for B_x_ILS_name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfB_x_ILS_name() {
    return rawAccumulateAllValuesOfB_x_ILS_name(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for B_x_ILS_name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfB_x_ILS_name(final AtoB_lhsMatch partialMatch) {
    return rawAccumulateAllValuesOfB_x_ILS_name(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for B_x_ILS_name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfB_x_ILS_name(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final FreeLink pB_x_ILS_state) {
    return rawAccumulateAllValuesOfB_x_ILS_name(new Object[]{
    pA, 
    pAgent_A_Name, 
    pA_xILS, 
    pA_x_ILS_name, 
    pA_x_ILS_state, 
    pB, 
    pAgent_B_Name, 
    pB_xILS, 
    null, 
    pB_x_ILS_state
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for B_x_ILS_state.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<FreeLink> rawAccumulateAllValuesOfB_x_ILS_state(final Object[] parameters) {
    Set<FreeLink> results = new HashSet<FreeLink>();
    rawAccumulateAllValues(POSITION_B_X_ILS_STATE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for B_x_ILS_state.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<FreeLink> getAllValuesOfB_x_ILS_state() {
    return rawAccumulateAllValuesOfB_x_ILS_state(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for B_x_ILS_state.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<FreeLink> getAllValuesOfB_x_ILS_state(final AtoB_lhsMatch partialMatch) {
    return rawAccumulateAllValuesOfB_x_ILS_state(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for B_x_ILS_state.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<FreeLink> getAllValuesOfB_x_ILS_state(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name) {
    return rawAccumulateAllValuesOfB_x_ILS_state(new Object[]{
    pA, 
    pAgent_A_Name, 
    pA_xILS, 
    pA_x_ILS_name, 
    pA_x_ILS_state, 
    pB, 
    pAgent_B_Name, 
    pB_xILS, 
    pB_x_ILS_name, 
    null
    });
  }
  
  @Override
  protected AtoB_lhsMatch tupleToMatch(final Tuple t) {
    try {
        return AtoB_lhsMatch.newMatch((AgentInstance) t.get(POSITION_A), (String) t.get(POSITION_AGENT_A_NAME), (AgentInstanceLinkState) t.get(POSITION_A_XILS), (String) t.get(POSITION_A_X_ILS_NAME), (FreeLink) t.get(POSITION_A_X_ILS_STATE), (AgentInstance) t.get(POSITION_B), (String) t.get(POSITION_AGENT_B_NAME), (AgentInstanceLinkState) t.get(POSITION_B_XILS), (String) t.get(POSITION_B_X_ILS_NAME), (FreeLink) t.get(POSITION_B_X_ILS_STATE));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AtoB_lhsMatch arrayToMatch(final Object[] match) {
    try {
        return AtoB_lhsMatch.newMatch((AgentInstance) match[POSITION_A], (String) match[POSITION_AGENT_A_NAME], (AgentInstanceLinkState) match[POSITION_A_XILS], (String) match[POSITION_A_X_ILS_NAME], (FreeLink) match[POSITION_A_X_ILS_STATE], (AgentInstance) match[POSITION_B], (String) match[POSITION_AGENT_B_NAME], (AgentInstanceLinkState) match[POSITION_B_XILS], (String) match[POSITION_B_X_ILS_NAME], (FreeLink) match[POSITION_B_X_ILS_STATE]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AtoB_lhsMatch arrayToMatchMutable(final Object[] match) {
    try {
        return AtoB_lhsMatch.newMutableMatch((AgentInstance) match[POSITION_A], (String) match[POSITION_AGENT_A_NAME], (AgentInstanceLinkState) match[POSITION_A_XILS], (String) match[POSITION_A_X_ILS_NAME], (FreeLink) match[POSITION_A_X_ILS_STATE], (AgentInstance) match[POSITION_B], (String) match[POSITION_AGENT_B_NAME], (AgentInstanceLinkState) match[POSITION_B_XILS], (String) match[POSITION_B_X_ILS_NAME], (FreeLink) match[POSITION_B_X_ILS_STATE]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<AtoB_lhsMatcher> querySpecification() throws ViatraQueryException {
    return AtoB_lhsQuerySpecification.instance();
  }
}
