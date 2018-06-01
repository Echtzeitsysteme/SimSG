/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
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
import patterngenerator.Blubb_lhsMatch;
import patterngenerator.util.Blubb_lhsQuerySpecification;

/**
 * Generated pattern matcher API of the patterngenerator.blubb_lhs pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Blubb_lhsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern blubb_lhs( D: SimAgent,  D1: SimAgent) {
 * 	// Agent pattern for instances of agent D
 * 	SimAgent.Type(D, "D");
 * 		// Site patterns for site c attached to instances of agent D 
 * 		SimAgent.simSites(D, D_c);
 * 		SimSite.Type(D_c, "c");
 * 		SimSite.simLinkState(D_c, D_c_LS);
 * 		neg find support_BoundState(D_c_LS);
 * 	
 * 	// Agent pattern for instances of agent D1
 * 	SimAgent.Type(D1, "D");
 * 		// Site patterns for site c attached to instances of agent D1 
 * 		SimAgent.simSites(D1, D1_c);
 * 		SimSite.Type(D1_c, "c");
 * 		SimSite.simLinkState(D1_c, D1_c_LS);
 * 		neg find support_BoundState(D1_c_LS);
 * 	 D1 != D;
 * }
 * </pre></code>
 * 
 * @see Blubb_lhsMatch
 *  @see Blubb_lhsProcessor
 * @see Blubb_lhsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Blubb_lhsMatcher extends BaseMatcher<Blubb_lhsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Blubb_lhsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    Blubb_lhsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (Blubb_lhsMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static Blubb_lhsMatcher create() throws ViatraQueryException {
    return new Blubb_lhsMatcher();
  }
  
  private final static int POSITION_D = 0;
  
  private final static int POSITION_D1 = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Blubb_lhsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private Blubb_lhsMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pD the fixed value of pattern parameter D, or null if not bound.
   * @param pD1 the fixed value of pattern parameter D1, or null if not bound.
   * @return matches represented as a Blubb_lhsMatch object.
   * 
   */
  public Collection<Blubb_lhsMatch> getAllMatches(final SimAgent pD, final SimAgent pD1) {
    return rawGetAllMatches(new Object[]{pD, pD1});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pD the fixed value of pattern parameter D, or null if not bound.
   * @param pD1 the fixed value of pattern parameter D1, or null if not bound.
   * @return a match represented as a Blubb_lhsMatch object, or null if no match is found.
   * 
   */
  public Blubb_lhsMatch getOneArbitraryMatch(final SimAgent pD, final SimAgent pD1) {
    return rawGetOneArbitraryMatch(new Object[]{pD, pD1});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pD the fixed value of pattern parameter D, or null if not bound.
   * @param pD1 the fixed value of pattern parameter D1, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SimAgent pD, final SimAgent pD1) {
    return rawHasMatch(new Object[]{pD, pD1});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pD the fixed value of pattern parameter D, or null if not bound.
   * @param pD1 the fixed value of pattern parameter D1, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SimAgent pD, final SimAgent pD1) {
    return rawCountMatches(new Object[]{pD, pD1});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pD the fixed value of pattern parameter D, or null if not bound.
   * @param pD1 the fixed value of pattern parameter D1, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SimAgent pD, final SimAgent pD1, final IMatchProcessor<? super Blubb_lhsMatch> processor) {
    rawForEachMatch(new Object[]{pD, pD1}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pD the fixed value of pattern parameter D, or null if not bound.
   * @param pD1 the fixed value of pattern parameter D1, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SimAgent pD, final SimAgent pD1, final IMatchProcessor<? super Blubb_lhsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pD, pD1}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pD the fixed value of pattern parameter D, or null if not bound.
   * @param pD1 the fixed value of pattern parameter D1, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Blubb_lhsMatch newMatch(final SimAgent pD, final SimAgent pD1) {
    return Blubb_lhsMatch.newMatch(pD, pD1);
  }
  
  /**
   * Retrieve the set of values that occur in matches for D.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<SimAgent> rawAccumulateAllValuesOfD(final Object[] parameters) {
    Set<SimAgent> results = new HashSet<SimAgent>();
    rawAccumulateAllValues(POSITION_D, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for D.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SimAgent> getAllValuesOfD() {
    return rawAccumulateAllValuesOfD(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for D.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SimAgent> getAllValuesOfD(final Blubb_lhsMatch partialMatch) {
    return rawAccumulateAllValuesOfD(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for D.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SimAgent> getAllValuesOfD(final SimAgent pD1) {
    return rawAccumulateAllValuesOfD(new Object[]{
    null, 
    pD1
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for D1.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<SimAgent> rawAccumulateAllValuesOfD1(final Object[] parameters) {
    Set<SimAgent> results = new HashSet<SimAgent>();
    rawAccumulateAllValues(POSITION_D1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for D1.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SimAgent> getAllValuesOfD1() {
    return rawAccumulateAllValuesOfD1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for D1.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SimAgent> getAllValuesOfD1(final Blubb_lhsMatch partialMatch) {
    return rawAccumulateAllValuesOfD1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for D1.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SimAgent> getAllValuesOfD1(final SimAgent pD) {
    return rawAccumulateAllValuesOfD1(new Object[]{
    pD, 
    null
    });
  }
  
  @Override
  protected Blubb_lhsMatch tupleToMatch(final Tuple t) {
    try {
        return Blubb_lhsMatch.newMatch((SimAgent) t.get(POSITION_D), (SimAgent) t.get(POSITION_D1));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Blubb_lhsMatch arrayToMatch(final Object[] match) {
    try {
        return Blubb_lhsMatch.newMatch((SimAgent) match[POSITION_D], (SimAgent) match[POSITION_D1]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Blubb_lhsMatch arrayToMatchMutable(final Object[] match) {
    try {
        return Blubb_lhsMatch.newMutableMatch((SimAgent) match[POSITION_D], (SimAgent) match[POSITION_D1]);
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
  public static IQuerySpecification<Blubb_lhsMatcher> querySpecification() throws ViatraQueryException {
    return Blubb_lhsQuerySpecification.instance();
  }
}
