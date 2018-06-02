/**
 * Generated from platform:/resource/biochemsimulation.viatrapatterns/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator;

import biochemsimulation.reactioncontainer.SimAgent;
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
import patterngenerator.AExact_lhsMatch;
import patterngenerator.util.AExact_lhsQuerySpecification;

/**
 * Generated pattern matcher API of the patterngenerator.AExact_lhs pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AExact_lhsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern AExact_lhs( A: SimAgent) {
 * 	// Agent pattern for instances of agent A
 * 	SimAgent.Type(A, "A");
 * 		// Site patterns for site x attached to instances of agent A 
 * 		SimAgent.simSites(A, A_x);
 * 		SimSite.Type(A_x, "x");
 * 		SimSite.simLinkState(A_x, A_x_LS);
 * 		// Create context for other SimAgent:
 * 		SimAgent.Type(A_B, "B");
 * 		SimAgent.simSites(A_B, A_B_x);
 * 		SimSite.Type(A_B_x, "x");
 * 		SimSite.simLinkState(A_B_x, A_B_x_LS);
 * 		// check for equality
 * 		A_x_LS == A_B_x_LS;
 * }
 * </pre></code>
 * 
 * @see AExact_lhsMatch
 *  @see AExact_lhsProcessor
 * @see AExact_lhsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AExact_lhsMatcher extends BaseMatcher<AExact_lhsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AExact_lhsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    AExact_lhsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (AExact_lhsMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static AExact_lhsMatcher create() throws ViatraQueryException {
    return new AExact_lhsMatcher();
  }
  
  private final static int POSITION_A = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AExact_lhsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private AExact_lhsMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @return matches represented as a AExact_lhsMatch object.
   * 
   */
  public Collection<AExact_lhsMatch> getAllMatches(final SimAgent pA) {
    return rawGetAllMatches(new Object[]{pA});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @return a match represented as a AExact_lhsMatch object, or null if no match is found.
   * 
   */
  public AExact_lhsMatch getOneArbitraryMatch(final SimAgent pA) {
    return rawGetOneArbitraryMatch(new Object[]{pA});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SimAgent pA) {
    return rawHasMatch(new Object[]{pA});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SimAgent pA) {
    return rawCountMatches(new Object[]{pA});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SimAgent pA, final IMatchProcessor<? super AExact_lhsMatch> processor) {
    rawForEachMatch(new Object[]{pA}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SimAgent pA, final IMatchProcessor<? super AExact_lhsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pA}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AExact_lhsMatch newMatch(final SimAgent pA) {
    return AExact_lhsMatch.newMatch(pA);
  }
  
  /**
   * Retrieve the set of values that occur in matches for A.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<SimAgent> rawAccumulateAllValuesOfA(final Object[] parameters) {
    Set<SimAgent> results = new HashSet<SimAgent>();
    rawAccumulateAllValues(POSITION_A, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for A.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SimAgent> getAllValuesOfA() {
    return rawAccumulateAllValuesOfA(emptyArray());
  }
  
  @Override
  protected AExact_lhsMatch tupleToMatch(final Tuple t) {
    try {
        return AExact_lhsMatch.newMatch((SimAgent) t.get(POSITION_A));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AExact_lhsMatch arrayToMatch(final Object[] match) {
    try {
        return AExact_lhsMatch.newMatch((SimAgent) match[POSITION_A]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AExact_lhsMatch arrayToMatchMutable(final Object[] match) {
    try {
        return AExact_lhsMatch.newMutableMatch((SimAgent) match[POSITION_A]);
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
  public static IQuerySpecification<AExact_lhsMatcher> querySpecification() throws ViatraQueryException {
    return AExact_lhsQuerySpecification.instance();
  }
}
