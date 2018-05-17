/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import manual.queries.TestR1aMatch;
import manual.queries.util.TestR1aQuerySpecification;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * Generated pattern matcher API of the manual.queries.testR1a pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TestR1aMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern testR1a(a: AgentInstance, aILS: AgentInstanceLinkState, aN: java String, asN: java String, aLS: FreeLink) {
 * 	AgentInstance.agent.name(a, aN);
 * 	check (
 * 		aN.matches("A")
 * 	);
 * 	AgentInstance.linkStates(a, aILS);
 * 	AgentInstanceLinkState.site.name(aILS, asN);
 * 	check (
 * 		asN.matches("x")
 * 	);
 * 	AgentInstanceLinkState.linkState.linkState(aILS, aLS);
 * 
 * }
 * </pre></code>
 * 
 * @see TestR1aMatch
 *  @see TestR1aProcessor
 * @see TestR1aQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TestR1aMatcher extends BaseMatcher<TestR1aMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TestR1aMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    TestR1aMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (TestR1aMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static TestR1aMatcher create() throws ViatraQueryException {
    return new TestR1aMatcher();
  }
  
  private final static int POSITION_A = 0;
  
  private final static int POSITION_AILS = 1;
  
  private final static int POSITION_AN = 2;
  
  private final static int POSITION_ASN = 3;
  
  private final static int POSITION_ALS = 4;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TestR1aMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private TestR1aMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAILS the fixed value of pattern parameter aILS, or null if not bound.
   * @param pAN the fixed value of pattern parameter aN, or null if not bound.
   * @param pAsN the fixed value of pattern parameter asN, or null if not bound.
   * @param pALS the fixed value of pattern parameter aLS, or null if not bound.
   * @return matches represented as a TestR1aMatch object.
   * 
   */
  public Collection<TestR1aMatch> getAllMatches(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS) {
    return rawGetAllMatches(new Object[]{pA, pAILS, pAN, pAsN, pALS});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAILS the fixed value of pattern parameter aILS, or null if not bound.
   * @param pAN the fixed value of pattern parameter aN, or null if not bound.
   * @param pAsN the fixed value of pattern parameter asN, or null if not bound.
   * @param pALS the fixed value of pattern parameter aLS, or null if not bound.
   * @return a match represented as a TestR1aMatch object, or null if no match is found.
   * 
   */
  public TestR1aMatch getOneArbitraryMatch(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS) {
    return rawGetOneArbitraryMatch(new Object[]{pA, pAILS, pAN, pAsN, pALS});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAILS the fixed value of pattern parameter aILS, or null if not bound.
   * @param pAN the fixed value of pattern parameter aN, or null if not bound.
   * @param pAsN the fixed value of pattern parameter asN, or null if not bound.
   * @param pALS the fixed value of pattern parameter aLS, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS) {
    return rawHasMatch(new Object[]{pA, pAILS, pAN, pAsN, pALS});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAILS the fixed value of pattern parameter aILS, or null if not bound.
   * @param pAN the fixed value of pattern parameter aN, or null if not bound.
   * @param pAsN the fixed value of pattern parameter asN, or null if not bound.
   * @param pALS the fixed value of pattern parameter aLS, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS) {
    return rawCountMatches(new Object[]{pA, pAILS, pAN, pAsN, pALS});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAILS the fixed value of pattern parameter aILS, or null if not bound.
   * @param pAN the fixed value of pattern parameter aN, or null if not bound.
   * @param pAsN the fixed value of pattern parameter asN, or null if not bound.
   * @param pALS the fixed value of pattern parameter aLS, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final IMatchProcessor<? super TestR1aMatch> processor) {
    rawForEachMatch(new Object[]{pA, pAILS, pAN, pAsN, pALS}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAILS the fixed value of pattern parameter aILS, or null if not bound.
   * @param pAN the fixed value of pattern parameter aN, or null if not bound.
   * @param pAsN the fixed value of pattern parameter asN, or null if not bound.
   * @param pALS the fixed value of pattern parameter aLS, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final IMatchProcessor<? super TestR1aMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pA, pAILS, pAN, pAsN, pALS}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAILS the fixed value of pattern parameter aILS, or null if not bound.
   * @param pAN the fixed value of pattern parameter aN, or null if not bound.
   * @param pAsN the fixed value of pattern parameter asN, or null if not bound.
   * @param pALS the fixed value of pattern parameter aLS, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TestR1aMatch newMatch(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS) {
    return TestR1aMatch.newMatch(pA, pAILS, pAN, pAsN, pALS);
  }
  
  /**
   * Retrieve the set of values that occur in matches for a.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AgentInstance> rawAccumulateAllValuesOfa(final Object[] parameters) {
    Set<AgentInstance> results = new HashSet<AgentInstance>();
    rawAccumulateAllValues(POSITION_A, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for a.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfa() {
    return rawAccumulateAllValuesOfa(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for a.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfa(final TestR1aMatch partialMatch) {
    return rawAccumulateAllValuesOfa(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for a.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfa(final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS) {
    return rawAccumulateAllValuesOfa(new Object[]{
    null, 
    pAILS, 
    pAN, 
    pAsN, 
    pALS
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for aILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AgentInstanceLinkState> rawAccumulateAllValuesOfaILS(final Object[] parameters) {
    Set<AgentInstanceLinkState> results = new HashSet<AgentInstanceLinkState>();
    rawAccumulateAllValues(POSITION_AILS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for aILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstanceLinkState> getAllValuesOfaILS() {
    return rawAccumulateAllValuesOfaILS(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for aILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstanceLinkState> getAllValuesOfaILS(final TestR1aMatch partialMatch) {
    return rawAccumulateAllValuesOfaILS(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for aILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstanceLinkState> getAllValuesOfaILS(final AgentInstance pA, final String pAN, final String pAsN, final FreeLink pALS) {
    return rawAccumulateAllValuesOfaILS(new Object[]{
    pA, 
    null, 
    pAN, 
    pAsN, 
    pALS
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for aN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfaN(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_AN, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for aN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfaN() {
    return rawAccumulateAllValuesOfaN(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for aN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfaN(final TestR1aMatch partialMatch) {
    return rawAccumulateAllValuesOfaN(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for aN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfaN(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAsN, final FreeLink pALS) {
    return rawAccumulateAllValuesOfaN(new Object[]{
    pA, 
    pAILS, 
    null, 
    pAsN, 
    pALS
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for asN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfasN(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_ASN, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for asN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfasN() {
    return rawAccumulateAllValuesOfasN(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for asN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfasN(final TestR1aMatch partialMatch) {
    return rawAccumulateAllValuesOfasN(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for asN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfasN(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final FreeLink pALS) {
    return rawAccumulateAllValuesOfasN(new Object[]{
    pA, 
    pAILS, 
    pAN, 
    null, 
    pALS
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for aLS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<FreeLink> rawAccumulateAllValuesOfaLS(final Object[] parameters) {
    Set<FreeLink> results = new HashSet<FreeLink>();
    rawAccumulateAllValues(POSITION_ALS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for aLS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<FreeLink> getAllValuesOfaLS() {
    return rawAccumulateAllValuesOfaLS(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for aLS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<FreeLink> getAllValuesOfaLS(final TestR1aMatch partialMatch) {
    return rawAccumulateAllValuesOfaLS(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for aLS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<FreeLink> getAllValuesOfaLS(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN) {
    return rawAccumulateAllValuesOfaLS(new Object[]{
    pA, 
    pAILS, 
    pAN, 
    pAsN, 
    null
    });
  }
  
  @Override
  protected TestR1aMatch tupleToMatch(final Tuple t) {
    try {
        return TestR1aMatch.newMatch((AgentInstance) t.get(POSITION_A), (AgentInstanceLinkState) t.get(POSITION_AILS), (String) t.get(POSITION_AN), (String) t.get(POSITION_ASN), (FreeLink) t.get(POSITION_ALS));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected TestR1aMatch arrayToMatch(final Object[] match) {
    try {
        return TestR1aMatch.newMatch((AgentInstance) match[POSITION_A], (AgentInstanceLinkState) match[POSITION_AILS], (String) match[POSITION_AN], (String) match[POSITION_ASN], (FreeLink) match[POSITION_ALS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected TestR1aMatch arrayToMatchMutable(final Object[] match) {
    try {
        return TestR1aMatch.newMutableMatch((AgentInstance) match[POSITION_A], (AgentInstanceLinkState) match[POSITION_AILS], (String) match[POSITION_AN], (String) match[POSITION_ASN], (FreeLink) match[POSITION_ALS]);
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
  public static IQuerySpecification<TestR1aMatcher> querySpecification() throws ViatraQueryException {
    return TestR1aQuerySpecification.instance();
  }
}
