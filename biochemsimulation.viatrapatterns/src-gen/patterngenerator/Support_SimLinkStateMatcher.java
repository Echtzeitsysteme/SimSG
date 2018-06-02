/**
 * Generated from platform:/resource/biochemsimulation.viatrapatterns/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator;

import biochemsimulation.reactioncontainer.SimSite;
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
import patterngenerator.Support_SimLinkStateMatch;
import patterngenerator.util.Support_SimLinkStateQuerySpecification;

/**
 * Generated pattern matcher API of the patterngenerator.support_SimLinkState pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Support_SimLinkStateMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern support_SimLinkState(ss: SimSite) {
 * 	SimSite.simLinkState(ss, _);
 * }
 * </pre></code>
 * 
 * @see Support_SimLinkStateMatch
 *  @see Support_SimLinkStateProcessor
 * @see Support_SimLinkStateQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Support_SimLinkStateMatcher extends BaseMatcher<Support_SimLinkStateMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Support_SimLinkStateMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    Support_SimLinkStateMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (Support_SimLinkStateMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static Support_SimLinkStateMatcher create() throws ViatraQueryException {
    return new Support_SimLinkStateMatcher();
  }
  
  private final static int POSITION_SS = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Support_SimLinkStateMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private Support_SimLinkStateMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSs the fixed value of pattern parameter ss, or null if not bound.
   * @return matches represented as a Support_SimLinkStateMatch object.
   * 
   */
  public Collection<Support_SimLinkStateMatch> getAllMatches(final SimSite pSs) {
    return rawGetAllMatches(new Object[]{pSs});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSs the fixed value of pattern parameter ss, or null if not bound.
   * @return a match represented as a Support_SimLinkStateMatch object, or null if no match is found.
   * 
   */
  public Support_SimLinkStateMatch getOneArbitraryMatch(final SimSite pSs) {
    return rawGetOneArbitraryMatch(new Object[]{pSs});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSs the fixed value of pattern parameter ss, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SimSite pSs) {
    return rawHasMatch(new Object[]{pSs});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSs the fixed value of pattern parameter ss, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SimSite pSs) {
    return rawCountMatches(new Object[]{pSs});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSs the fixed value of pattern parameter ss, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SimSite pSs, final IMatchProcessor<? super Support_SimLinkStateMatch> processor) {
    rawForEachMatch(new Object[]{pSs}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSs the fixed value of pattern parameter ss, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SimSite pSs, final IMatchProcessor<? super Support_SimLinkStateMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSs}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSs the fixed value of pattern parameter ss, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Support_SimLinkStateMatch newMatch(final SimSite pSs) {
    return Support_SimLinkStateMatch.newMatch(pSs);
  }
  
  /**
   * Retrieve the set of values that occur in matches for ss.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<SimSite> rawAccumulateAllValuesOfss(final Object[] parameters) {
    Set<SimSite> results = new HashSet<SimSite>();
    rawAccumulateAllValues(POSITION_SS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for ss.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SimSite> getAllValuesOfss() {
    return rawAccumulateAllValuesOfss(emptyArray());
  }
  
  @Override
  protected Support_SimLinkStateMatch tupleToMatch(final Tuple t) {
    try {
        return Support_SimLinkStateMatch.newMatch((SimSite) t.get(POSITION_SS));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Support_SimLinkStateMatch arrayToMatch(final Object[] match) {
    try {
        return Support_SimLinkStateMatch.newMatch((SimSite) match[POSITION_SS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Support_SimLinkStateMatch arrayToMatchMutable(final Object[] match) {
    try {
        return Support_SimLinkStateMatch.newMutableMatch((SimSite) match[POSITION_SS]);
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
  public static IQuerySpecification<Support_SimLinkStateMatcher> querySpecification() throws ViatraQueryException {
    return Support_SimLinkStateQuerySpecification.instance();
  }
}
