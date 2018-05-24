/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
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
 * pattern testR1a(a: AgentInstance, agentName: java String, siteName: java String) {
 * 	AgentInstance.agent.name(a, agentName);
 * 	AgentInstance.linkStates(a, aILS);
 * 	AgentInstanceLinkState.site.name(aILS, siteName);
 * 	AgentInstanceLinkState.linkState.linkState(aILS, als);
 * 	FreeLink(als);
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
  
  private final static int POSITION_AGENTNAME = 1;
  
  private final static int POSITION_SITENAME = 2;
  
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
   * @param pAgentName the fixed value of pattern parameter agentName, or null if not bound.
   * @param pSiteName the fixed value of pattern parameter siteName, or null if not bound.
   * @return matches represented as a TestR1aMatch object.
   * 
   */
  public Collection<TestR1aMatch> getAllMatches(final AgentInstance pA, final String pAgentName, final String pSiteName) {
    return rawGetAllMatches(new Object[]{pA, pAgentName, pSiteName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAgentName the fixed value of pattern parameter agentName, or null if not bound.
   * @param pSiteName the fixed value of pattern parameter siteName, or null if not bound.
   * @return a match represented as a TestR1aMatch object, or null if no match is found.
   * 
   */
  public TestR1aMatch getOneArbitraryMatch(final AgentInstance pA, final String pAgentName, final String pSiteName) {
    return rawGetOneArbitraryMatch(new Object[]{pA, pAgentName, pSiteName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAgentName the fixed value of pattern parameter agentName, or null if not bound.
   * @param pSiteName the fixed value of pattern parameter siteName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final AgentInstance pA, final String pAgentName, final String pSiteName) {
    return rawHasMatch(new Object[]{pA, pAgentName, pSiteName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAgentName the fixed value of pattern parameter agentName, or null if not bound.
   * @param pSiteName the fixed value of pattern parameter siteName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final AgentInstance pA, final String pAgentName, final String pSiteName) {
    return rawCountMatches(new Object[]{pA, pAgentName, pSiteName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAgentName the fixed value of pattern parameter agentName, or null if not bound.
   * @param pSiteName the fixed value of pattern parameter siteName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final AgentInstance pA, final String pAgentName, final String pSiteName, final IMatchProcessor<? super TestR1aMatch> processor) {
    rawForEachMatch(new Object[]{pA, pAgentName, pSiteName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAgentName the fixed value of pattern parameter agentName, or null if not bound.
   * @param pSiteName the fixed value of pattern parameter siteName, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final AgentInstance pA, final String pAgentName, final String pSiteName, final IMatchProcessor<? super TestR1aMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pA, pAgentName, pSiteName}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAgentName the fixed value of pattern parameter agentName, or null if not bound.
   * @param pSiteName the fixed value of pattern parameter siteName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TestR1aMatch newMatch(final AgentInstance pA, final String pAgentName, final String pSiteName) {
    return TestR1aMatch.newMatch(pA, pAgentName, pSiteName);
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
  public Set<AgentInstance> getAllValuesOfa(final String pAgentName, final String pSiteName) {
    return rawAccumulateAllValuesOfa(new Object[]{
    null, 
    pAgentName, 
    pSiteName
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for agentName.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfagentName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_AGENTNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for agentName.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfagentName() {
    return rawAccumulateAllValuesOfagentName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for agentName.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfagentName(final TestR1aMatch partialMatch) {
    return rawAccumulateAllValuesOfagentName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for agentName.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfagentName(final AgentInstance pA, final String pSiteName) {
    return rawAccumulateAllValuesOfagentName(new Object[]{
    pA, 
    null, 
    pSiteName
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for siteName.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfsiteName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_SITENAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for siteName.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfsiteName() {
    return rawAccumulateAllValuesOfsiteName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for siteName.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfsiteName(final TestR1aMatch partialMatch) {
    return rawAccumulateAllValuesOfsiteName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for siteName.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfsiteName(final AgentInstance pA, final String pAgentName) {
    return rawAccumulateAllValuesOfsiteName(new Object[]{
    pA, 
    pAgentName, 
    null
    });
  }
  
  @Override
  protected TestR1aMatch tupleToMatch(final Tuple t) {
    try {
        return TestR1aMatch.newMatch((AgentInstance) t.get(POSITION_A), (String) t.get(POSITION_AGENTNAME), (String) t.get(POSITION_SITENAME));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected TestR1aMatch arrayToMatch(final Object[] match) {
    try {
        return TestR1aMatch.newMatch((AgentInstance) match[POSITION_A], (String) match[POSITION_AGENTNAME], (String) match[POSITION_SITENAME]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected TestR1aMatch arrayToMatchMutable(final Object[] match) {
    try {
        return TestR1aMatch.newMutableMatch((AgentInstance) match[POSITION_A], (String) match[POSITION_AGENTNAME], (String) match[POSITION_SITENAME]);
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
