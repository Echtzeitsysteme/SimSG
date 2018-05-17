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
import manual.queries.TestR1Match;
import manual.queries.util.TestR1QuerySpecification;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * Generated pattern matcher API of the manual.queries.testR1 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TestR1Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern testR1(a: AgentInstance, aILS: AgentInstanceLinkState, aN: java String, asN: java String, aLS: FreeLink, bI: AgentInstance, bILS: AgentInstanceLinkState, bN: java String, bsN: java String, bLS: FreeLink) {
 * 	find testR1a(a, aILS, aN, asN, aLS);
 * 	find testR1b(bI, bILS, bN, bsN, bLS);
 * 
 * }
 * </pre></code>
 * 
 * @see TestR1Match
 *  @see TestR1Processor
 * @see TestR1QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TestR1Matcher extends BaseMatcher<TestR1Match> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TestR1Matcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    TestR1Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (TestR1Matcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static TestR1Matcher create() throws ViatraQueryException {
    return new TestR1Matcher();
  }
  
  private final static int POSITION_A = 0;
  
  private final static int POSITION_AILS = 1;
  
  private final static int POSITION_AN = 2;
  
  private final static int POSITION_ASN = 3;
  
  private final static int POSITION_ALS = 4;
  
  private final static int POSITION_BI = 5;
  
  private final static int POSITION_BILS = 6;
  
  private final static int POSITION_BN = 7;
  
  private final static int POSITION_BSN = 8;
  
  private final static int POSITION_BLS = 9;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TestR1Matcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private TestR1Matcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAILS the fixed value of pattern parameter aILS, or null if not bound.
   * @param pAN the fixed value of pattern parameter aN, or null if not bound.
   * @param pAsN the fixed value of pattern parameter asN, or null if not bound.
   * @param pALS the fixed value of pattern parameter aLS, or null if not bound.
   * @param pBI the fixed value of pattern parameter bI, or null if not bound.
   * @param pBILS the fixed value of pattern parameter bILS, or null if not bound.
   * @param pBN the fixed value of pattern parameter bN, or null if not bound.
   * @param pBsN the fixed value of pattern parameter bsN, or null if not bound.
   * @param pBLS the fixed value of pattern parameter bLS, or null if not bound.
   * @return matches represented as a TestR1Match object.
   * 
   */
  public Collection<TestR1Match> getAllMatches(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
    return rawGetAllMatches(new Object[]{pA, pAILS, pAN, pAsN, pALS, pBI, pBILS, pBN, pBsN, pBLS});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAILS the fixed value of pattern parameter aILS, or null if not bound.
   * @param pAN the fixed value of pattern parameter aN, or null if not bound.
   * @param pAsN the fixed value of pattern parameter asN, or null if not bound.
   * @param pALS the fixed value of pattern parameter aLS, or null if not bound.
   * @param pBI the fixed value of pattern parameter bI, or null if not bound.
   * @param pBILS the fixed value of pattern parameter bILS, or null if not bound.
   * @param pBN the fixed value of pattern parameter bN, or null if not bound.
   * @param pBsN the fixed value of pattern parameter bsN, or null if not bound.
   * @param pBLS the fixed value of pattern parameter bLS, or null if not bound.
   * @return a match represented as a TestR1Match object, or null if no match is found.
   * 
   */
  public TestR1Match getOneArbitraryMatch(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
    return rawGetOneArbitraryMatch(new Object[]{pA, pAILS, pAN, pAsN, pALS, pBI, pBILS, pBN, pBsN, pBLS});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAILS the fixed value of pattern parameter aILS, or null if not bound.
   * @param pAN the fixed value of pattern parameter aN, or null if not bound.
   * @param pAsN the fixed value of pattern parameter asN, or null if not bound.
   * @param pALS the fixed value of pattern parameter aLS, or null if not bound.
   * @param pBI the fixed value of pattern parameter bI, or null if not bound.
   * @param pBILS the fixed value of pattern parameter bILS, or null if not bound.
   * @param pBN the fixed value of pattern parameter bN, or null if not bound.
   * @param pBsN the fixed value of pattern parameter bsN, or null if not bound.
   * @param pBLS the fixed value of pattern parameter bLS, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
    return rawHasMatch(new Object[]{pA, pAILS, pAN, pAsN, pALS, pBI, pBILS, pBN, pBsN, pBLS});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAILS the fixed value of pattern parameter aILS, or null if not bound.
   * @param pAN the fixed value of pattern parameter aN, or null if not bound.
   * @param pAsN the fixed value of pattern parameter asN, or null if not bound.
   * @param pALS the fixed value of pattern parameter aLS, or null if not bound.
   * @param pBI the fixed value of pattern parameter bI, or null if not bound.
   * @param pBILS the fixed value of pattern parameter bILS, or null if not bound.
   * @param pBN the fixed value of pattern parameter bN, or null if not bound.
   * @param pBsN the fixed value of pattern parameter bsN, or null if not bound.
   * @param pBLS the fixed value of pattern parameter bLS, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
    return rawCountMatches(new Object[]{pA, pAILS, pAN, pAsN, pALS, pBI, pBILS, pBN, pBsN, pBLS});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAILS the fixed value of pattern parameter aILS, or null if not bound.
   * @param pAN the fixed value of pattern parameter aN, or null if not bound.
   * @param pAsN the fixed value of pattern parameter asN, or null if not bound.
   * @param pALS the fixed value of pattern parameter aLS, or null if not bound.
   * @param pBI the fixed value of pattern parameter bI, or null if not bound.
   * @param pBILS the fixed value of pattern parameter bILS, or null if not bound.
   * @param pBN the fixed value of pattern parameter bN, or null if not bound.
   * @param pBsN the fixed value of pattern parameter bsN, or null if not bound.
   * @param pBLS the fixed value of pattern parameter bLS, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS, final IMatchProcessor<? super TestR1Match> processor) {
    rawForEachMatch(new Object[]{pA, pAILS, pAN, pAsN, pALS, pBI, pBILS, pBN, pBsN, pBLS}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAILS the fixed value of pattern parameter aILS, or null if not bound.
   * @param pAN the fixed value of pattern parameter aN, or null if not bound.
   * @param pAsN the fixed value of pattern parameter asN, or null if not bound.
   * @param pALS the fixed value of pattern parameter aLS, or null if not bound.
   * @param pBI the fixed value of pattern parameter bI, or null if not bound.
   * @param pBILS the fixed value of pattern parameter bILS, or null if not bound.
   * @param pBN the fixed value of pattern parameter bN, or null if not bound.
   * @param pBsN the fixed value of pattern parameter bsN, or null if not bound.
   * @param pBLS the fixed value of pattern parameter bLS, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS, final IMatchProcessor<? super TestR1Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pA, pAILS, pAN, pAsN, pALS, pBI, pBILS, pBN, pBsN, pBLS}, processor);
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
   * @param pBI the fixed value of pattern parameter bI, or null if not bound.
   * @param pBILS the fixed value of pattern parameter bILS, or null if not bound.
   * @param pBN the fixed value of pattern parameter bN, or null if not bound.
   * @param pBsN the fixed value of pattern parameter bsN, or null if not bound.
   * @param pBLS the fixed value of pattern parameter bLS, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TestR1Match newMatch(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
    return TestR1Match.newMatch(pA, pAILS, pAN, pAsN, pALS, pBI, pBILS, pBN, pBsN, pBLS);
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
  public Set<AgentInstance> getAllValuesOfa(final TestR1Match partialMatch) {
    return rawAccumulateAllValuesOfa(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for a.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfa(final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
    return rawAccumulateAllValuesOfa(new Object[]{
    null, 
    pAILS, 
    pAN, 
    pAsN, 
    pALS, 
    pBI, 
    pBILS, 
    pBN, 
    pBsN, 
    pBLS
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
  public Set<AgentInstanceLinkState> getAllValuesOfaILS(final TestR1Match partialMatch) {
    return rawAccumulateAllValuesOfaILS(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for aILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstanceLinkState> getAllValuesOfaILS(final AgentInstance pA, final String pAN, final String pAsN, final FreeLink pALS, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
    return rawAccumulateAllValuesOfaILS(new Object[]{
    pA, 
    null, 
    pAN, 
    pAsN, 
    pALS, 
    pBI, 
    pBILS, 
    pBN, 
    pBsN, 
    pBLS
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
  public Set<String> getAllValuesOfaN(final TestR1Match partialMatch) {
    return rawAccumulateAllValuesOfaN(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for aN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfaN(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAsN, final FreeLink pALS, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
    return rawAccumulateAllValuesOfaN(new Object[]{
    pA, 
    pAILS, 
    null, 
    pAsN, 
    pALS, 
    pBI, 
    pBILS, 
    pBN, 
    pBsN, 
    pBLS
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
  public Set<String> getAllValuesOfasN(final TestR1Match partialMatch) {
    return rawAccumulateAllValuesOfasN(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for asN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfasN(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final FreeLink pALS, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
    return rawAccumulateAllValuesOfasN(new Object[]{
    pA, 
    pAILS, 
    pAN, 
    null, 
    pALS, 
    pBI, 
    pBILS, 
    pBN, 
    pBsN, 
    pBLS
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
  public Set<FreeLink> getAllValuesOfaLS(final TestR1Match partialMatch) {
    return rawAccumulateAllValuesOfaLS(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for aLS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<FreeLink> getAllValuesOfaLS(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
    return rawAccumulateAllValuesOfaLS(new Object[]{
    pA, 
    pAILS, 
    pAN, 
    pAsN, 
    null, 
    pBI, 
    pBILS, 
    pBN, 
    pBsN, 
    pBLS
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for bI.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AgentInstance> rawAccumulateAllValuesOfbI(final Object[] parameters) {
    Set<AgentInstance> results = new HashSet<AgentInstance>();
    rawAccumulateAllValues(POSITION_BI, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for bI.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfbI() {
    return rawAccumulateAllValuesOfbI(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for bI.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfbI(final TestR1Match partialMatch) {
    return rawAccumulateAllValuesOfbI(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for bI.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfbI(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
    return rawAccumulateAllValuesOfbI(new Object[]{
    pA, 
    pAILS, 
    pAN, 
    pAsN, 
    pALS, 
    null, 
    pBILS, 
    pBN, 
    pBsN, 
    pBLS
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for bILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AgentInstanceLinkState> rawAccumulateAllValuesOfbILS(final Object[] parameters) {
    Set<AgentInstanceLinkState> results = new HashSet<AgentInstanceLinkState>();
    rawAccumulateAllValues(POSITION_BILS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for bILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstanceLinkState> getAllValuesOfbILS() {
    return rawAccumulateAllValuesOfbILS(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for bILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstanceLinkState> getAllValuesOfbILS(final TestR1Match partialMatch) {
    return rawAccumulateAllValuesOfbILS(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for bILS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstanceLinkState> getAllValuesOfbILS(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final AgentInstance pBI, final String pBN, final String pBsN, final FreeLink pBLS) {
    return rawAccumulateAllValuesOfbILS(new Object[]{
    pA, 
    pAILS, 
    pAN, 
    pAsN, 
    pALS, 
    pBI, 
    null, 
    pBN, 
    pBsN, 
    pBLS
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for bN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfbN(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_BN, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for bN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfbN() {
    return rawAccumulateAllValuesOfbN(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for bN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfbN(final TestR1Match partialMatch) {
    return rawAccumulateAllValuesOfbN(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for bN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfbN(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBsN, final FreeLink pBLS) {
    return rawAccumulateAllValuesOfbN(new Object[]{
    pA, 
    pAILS, 
    pAN, 
    pAsN, 
    pALS, 
    pBI, 
    pBILS, 
    null, 
    pBsN, 
    pBLS
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for bsN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfbsN(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_BSN, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for bsN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfbsN() {
    return rawAccumulateAllValuesOfbsN(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for bsN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfbsN(final TestR1Match partialMatch) {
    return rawAccumulateAllValuesOfbsN(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for bsN.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfbsN(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final FreeLink pBLS) {
    return rawAccumulateAllValuesOfbsN(new Object[]{
    pA, 
    pAILS, 
    pAN, 
    pAsN, 
    pALS, 
    pBI, 
    pBILS, 
    pBN, 
    null, 
    pBLS
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for bLS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<FreeLink> rawAccumulateAllValuesOfbLS(final Object[] parameters) {
    Set<FreeLink> results = new HashSet<FreeLink>();
    rawAccumulateAllValues(POSITION_BLS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for bLS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<FreeLink> getAllValuesOfbLS() {
    return rawAccumulateAllValuesOfbLS(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for bLS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<FreeLink> getAllValuesOfbLS(final TestR1Match partialMatch) {
    return rawAccumulateAllValuesOfbLS(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for bLS.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<FreeLink> getAllValuesOfbLS(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS, final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN) {
    return rawAccumulateAllValuesOfbLS(new Object[]{
    pA, 
    pAILS, 
    pAN, 
    pAsN, 
    pALS, 
    pBI, 
    pBILS, 
    pBN, 
    pBsN, 
    null
    });
  }
  
  @Override
  protected TestR1Match tupleToMatch(final Tuple t) {
    try {
        return TestR1Match.newMatch((AgentInstance) t.get(POSITION_A), (AgentInstanceLinkState) t.get(POSITION_AILS), (String) t.get(POSITION_AN), (String) t.get(POSITION_ASN), (FreeLink) t.get(POSITION_ALS), (AgentInstance) t.get(POSITION_BI), (AgentInstanceLinkState) t.get(POSITION_BILS), (String) t.get(POSITION_BN), (String) t.get(POSITION_BSN), (FreeLink) t.get(POSITION_BLS));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected TestR1Match arrayToMatch(final Object[] match) {
    try {
        return TestR1Match.newMatch((AgentInstance) match[POSITION_A], (AgentInstanceLinkState) match[POSITION_AILS], (String) match[POSITION_AN], (String) match[POSITION_ASN], (FreeLink) match[POSITION_ALS], (AgentInstance) match[POSITION_BI], (AgentInstanceLinkState) match[POSITION_BILS], (String) match[POSITION_BN], (String) match[POSITION_BSN], (FreeLink) match[POSITION_BLS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected TestR1Match arrayToMatchMutable(final Object[] match) {
    try {
        return TestR1Match.newMutableMatch((AgentInstance) match[POSITION_A], (AgentInstanceLinkState) match[POSITION_AILS], (String) match[POSITION_AN], (String) match[POSITION_ASN], (FreeLink) match[POSITION_ALS], (AgentInstance) match[POSITION_BI], (AgentInstanceLinkState) match[POSITION_BILS], (String) match[POSITION_BN], (String) match[POSITION_BSN], (FreeLink) match[POSITION_BLS]);
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
  public static IQuerySpecification<TestR1Matcher> querySpecification() throws ViatraQueryException {
    return TestR1QuerySpecification.instance();
  }
}
