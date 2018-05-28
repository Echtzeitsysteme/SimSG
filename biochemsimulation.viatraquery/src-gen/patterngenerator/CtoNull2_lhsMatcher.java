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
import patterngenerator.CtoNull2_lhsMatch;
import patterngenerator.util.CtoNull2_lhsQuerySpecification;

/**
 * Generated pattern matcher API of the patterngenerator.CtoNull2_lhs pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CtoNull2_lhsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern CtoNull2_lhs( C: AgentInstance) {
 * 	// Agent pattern for instances of agent C
 * 	AgentInstance.agent.name(C, "C");
 * 		// Site patterns for site x attached to instances of agent C 
 * 		AgentInstance.linkStates(C, C_x_ILS);
 * 		AgentInstanceLinkState.site.name(C_x_ILS, "x");
 * }
 * </pre></code>
 * 
 * @see CtoNull2_lhsMatch
 *  @see CtoNull2_lhsProcessor
 * @see CtoNull2_lhsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CtoNull2_lhsMatcher extends BaseMatcher<CtoNull2_lhsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CtoNull2_lhsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    CtoNull2_lhsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (CtoNull2_lhsMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static CtoNull2_lhsMatcher create() throws ViatraQueryException {
    return new CtoNull2_lhsMatcher();
  }
  
  private final static int POSITION_C = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(CtoNull2_lhsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private CtoNull2_lhsMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return matches represented as a CtoNull2_lhsMatch object.
   * 
   */
  public Collection<CtoNull2_lhsMatch> getAllMatches(final AgentInstance pC) {
    return rawGetAllMatches(new Object[]{pC});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return a match represented as a CtoNull2_lhsMatch object, or null if no match is found.
   * 
   */
  public CtoNull2_lhsMatch getOneArbitraryMatch(final AgentInstance pC) {
    return rawGetOneArbitraryMatch(new Object[]{pC});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final AgentInstance pC) {
    return rawHasMatch(new Object[]{pC});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final AgentInstance pC) {
    return rawCountMatches(new Object[]{pC});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final AgentInstance pC, final IMatchProcessor<? super CtoNull2_lhsMatch> processor) {
    rawForEachMatch(new Object[]{pC}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final AgentInstance pC, final IMatchProcessor<? super CtoNull2_lhsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pC}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CtoNull2_lhsMatch newMatch(final AgentInstance pC) {
    return CtoNull2_lhsMatch.newMatch(pC);
  }
  
  /**
   * Retrieve the set of values that occur in matches for C.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AgentInstance> rawAccumulateAllValuesOfC(final Object[] parameters) {
    Set<AgentInstance> results = new HashSet<AgentInstance>();
    rawAccumulateAllValues(POSITION_C, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for C.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfC() {
    return rawAccumulateAllValuesOfC(emptyArray());
  }
  
  @Override
  protected CtoNull2_lhsMatch tupleToMatch(final Tuple t) {
    try {
        return CtoNull2_lhsMatch.newMatch((AgentInstance) t.get(POSITION_C));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected CtoNull2_lhsMatch arrayToMatch(final Object[] match) {
    try {
        return CtoNull2_lhsMatch.newMatch((AgentInstance) match[POSITION_C]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected CtoNull2_lhsMatch arrayToMatchMutable(final Object[] match) {
    try {
        return CtoNull2_lhsMatch.newMutableMatch((AgentInstance) match[POSITION_C]);
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
  public static IQuerySpecification<CtoNull2_lhsMatcher> querySpecification() throws ViatraQueryException {
    return CtoNull2_lhsQuerySpecification.instance();
  }
}
