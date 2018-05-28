/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
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
import patterngenerator.AtoNull_lhsMatch;
import patterngenerator.util.AtoNull_lhsQuerySpecification;

/**
 * Generated pattern matcher API of the patterngenerator.AtoNull_lhs pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AtoNull_lhsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern AtoNull_lhs( A: AgentInstance,  B: AgentInstance) {
 * 	// Agent pattern for instances of agent A
 * 	AgentInstance.agent.name(A, "A");
 * 		// Site patterns for site x attached to instances of agent A 
 * 		AgentInstance.linkStates(A, A_x_ILS);
 * 		AgentInstanceLinkState.site.name(A_x_ILS, "x");
 * 	
 * 	// Agent pattern for instances of agent B
 * 	AgentInstance.agent.name(B, "B");
 * 		// Site patterns for site x attached to instances of agent B 
 * 		AgentInstance.linkStates(B, B_x_ILS);
 * 		AgentInstanceLinkState.site.name(B_x_ILS, "x");
 * }
 * </pre></code>
 * 
 * @see AtoNull_lhsMatch
 *  @see AtoNull_lhsProcessor
 * @see AtoNull_lhsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AtoNull_lhsMatcher extends BaseMatcher<AtoNull_lhsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AtoNull_lhsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    AtoNull_lhsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (AtoNull_lhsMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static AtoNull_lhsMatcher create() throws ViatraQueryException {
    return new AtoNull_lhsMatcher();
  }
  
  private final static int POSITION_A = 0;
  
  private final static int POSITION_B = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AtoNull_lhsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private AtoNull_lhsMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @return matches represented as a AtoNull_lhsMatch object.
   * 
   */
  public Collection<AtoNull_lhsMatch> getAllMatches(final AgentInstance pA, final AgentInstance pB) {
    return rawGetAllMatches(new Object[]{pA, pB});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @return a match represented as a AtoNull_lhsMatch object, or null if no match is found.
   * 
   */
  public AtoNull_lhsMatch getOneArbitraryMatch(final AgentInstance pA, final AgentInstance pB) {
    return rawGetOneArbitraryMatch(new Object[]{pA, pB});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final AgentInstance pA, final AgentInstance pB) {
    return rawHasMatch(new Object[]{pA, pB});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final AgentInstance pA, final AgentInstance pB) {
    return rawCountMatches(new Object[]{pA, pB});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final AgentInstance pA, final AgentInstance pB, final IMatchProcessor<? super AtoNull_lhsMatch> processor) {
    rawForEachMatch(new Object[]{pA, pB}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final AgentInstance pA, final AgentInstance pB, final IMatchProcessor<? super AtoNull_lhsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pA, pB}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AtoNull_lhsMatch newMatch(final AgentInstance pA, final AgentInstance pB) {
    return AtoNull_lhsMatch.newMatch(pA, pB);
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
  public Set<AgentInstance> getAllValuesOfA(final AtoNull_lhsMatch partialMatch) {
    return rawAccumulateAllValuesOfA(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for A.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfA(final AgentInstance pB) {
    return rawAccumulateAllValuesOfA(new Object[]{
    null, 
    pB
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
  public Set<AgentInstance> getAllValuesOfB(final AtoNull_lhsMatch partialMatch) {
    return rawAccumulateAllValuesOfB(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for B.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfB(final AgentInstance pA) {
    return rawAccumulateAllValuesOfB(new Object[]{
    pA, 
    null
    });
  }
  
  @Override
  protected AtoNull_lhsMatch tupleToMatch(final Tuple t) {
    try {
        return AtoNull_lhsMatch.newMatch((AgentInstance) t.get(POSITION_A), (AgentInstance) t.get(POSITION_B));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AtoNull_lhsMatch arrayToMatch(final Object[] match) {
    try {
        return AtoNull_lhsMatch.newMatch((AgentInstance) match[POSITION_A], (AgentInstance) match[POSITION_B]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AtoNull_lhsMatch arrayToMatchMutable(final Object[] match) {
    try {
        return AtoNull_lhsMatch.newMutableMatch((AgentInstance) match[POSITION_A], (AgentInstance) match[POSITION_B]);
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
  public static IQuerySpecification<AtoNull_lhsMatcher> querySpecification() throws ViatraQueryException {
    return AtoNull_lhsQuerySpecification.instance();
  }
}
