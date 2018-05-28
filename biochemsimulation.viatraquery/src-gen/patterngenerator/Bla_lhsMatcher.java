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
import patterngenerator.Bla_lhsMatch;
import patterngenerator.util.Bla_lhsQuerySpecification;

/**
 * Generated pattern matcher API of the patterngenerator.bla_lhs pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Bla_lhsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern bla_lhs( A: AgentInstance) {
 * 	// Agent pattern for instances of agent A
 * 	AgentInstance.agent.name(A, "A");
 * 		// Site patterns for site x attached to instances of agent A 
 * 		AgentInstance.linkStates(A, A_x_ILS);
 * 		AgentInstanceLinkState.site.name(A_x_ILS, "x");
 * 		AgentInstanceLinkState.linkState.linkState(A_x_ILS, A_x_SL);
 * 		IndexedLink(A_x_SL);
 * }
 * </pre></code>
 * 
 * @see Bla_lhsMatch
 *  @see Bla_lhsProcessor
 * @see Bla_lhsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Bla_lhsMatcher extends BaseMatcher<Bla_lhsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Bla_lhsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    Bla_lhsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (Bla_lhsMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static Bla_lhsMatcher create() throws ViatraQueryException {
    return new Bla_lhsMatcher();
  }
  
  private final static int POSITION_A = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Bla_lhsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private Bla_lhsMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @return matches represented as a Bla_lhsMatch object.
   * 
   */
  public Collection<Bla_lhsMatch> getAllMatches(final AgentInstance pA) {
    return rawGetAllMatches(new Object[]{pA});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @return a match represented as a Bla_lhsMatch object, or null if no match is found.
   * 
   */
  public Bla_lhsMatch getOneArbitraryMatch(final AgentInstance pA) {
    return rawGetOneArbitraryMatch(new Object[]{pA});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final AgentInstance pA) {
    return rawHasMatch(new Object[]{pA});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final AgentInstance pA) {
    return rawCountMatches(new Object[]{pA});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final AgentInstance pA, final IMatchProcessor<? super Bla_lhsMatch> processor) {
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
  public boolean forOneArbitraryMatch(final AgentInstance pA, final IMatchProcessor<? super Bla_lhsMatch> processor) {
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
  public Bla_lhsMatch newMatch(final AgentInstance pA) {
    return Bla_lhsMatch.newMatch(pA);
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
  
  @Override
  protected Bla_lhsMatch tupleToMatch(final Tuple t) {
    try {
        return Bla_lhsMatch.newMatch((AgentInstance) t.get(POSITION_A));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Bla_lhsMatch arrayToMatch(final Object[] match) {
    try {
        return Bla_lhsMatch.newMatch((AgentInstance) match[POSITION_A]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Bla_lhsMatch arrayToMatchMutable(final Object[] match) {
    try {
        return Bla_lhsMatch.newMutableMatch((AgentInstance) match[POSITION_A]);
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
  public static IQuerySpecification<Bla_lhsMatcher> querySpecification() throws ViatraQueryException {
    return Bla_lhsQuerySpecification.instance();
  }
}
