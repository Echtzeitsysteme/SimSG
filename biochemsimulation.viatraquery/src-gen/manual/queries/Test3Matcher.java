/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries;

import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import manual.queries.Test3Match;
import manual.queries.util.Test3QuerySpecification;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * Generated pattern matcher API of the manual.queries.test3 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Test3Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern test3(all: ReactionRuleModel) {
 * 	ReactionRuleModel.model(all, _);
 * }
 * </pre></code>
 * 
 * @see Test3Match
 *  @see Test3Processor
 * @see Test3QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Test3Matcher extends BaseMatcher<Test3Match> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Test3Matcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    Test3Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (Test3Matcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static Test3Matcher create() throws ViatraQueryException {
    return new Test3Matcher();
  }
  
  private final static int POSITION_ALL = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Test3Matcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private Test3Matcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pAll the fixed value of pattern parameter all, or null if not bound.
   * @return matches represented as a Test3Match object.
   * 
   */
  public Collection<Test3Match> getAllMatches(final ReactionRuleModel pAll) {
    return rawGetAllMatches(new Object[]{pAll});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pAll the fixed value of pattern parameter all, or null if not bound.
   * @return a match represented as a Test3Match object, or null if no match is found.
   * 
   */
  public Test3Match getOneArbitraryMatch(final ReactionRuleModel pAll) {
    return rawGetOneArbitraryMatch(new Object[]{pAll});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pAll the fixed value of pattern parameter all, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final ReactionRuleModel pAll) {
    return rawHasMatch(new Object[]{pAll});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pAll the fixed value of pattern parameter all, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final ReactionRuleModel pAll) {
    return rawCountMatches(new Object[]{pAll});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pAll the fixed value of pattern parameter all, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final ReactionRuleModel pAll, final IMatchProcessor<? super Test3Match> processor) {
    rawForEachMatch(new Object[]{pAll}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pAll the fixed value of pattern parameter all, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final ReactionRuleModel pAll, final IMatchProcessor<? super Test3Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pAll}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pAll the fixed value of pattern parameter all, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Test3Match newMatch(final ReactionRuleModel pAll) {
    return Test3Match.newMatch(pAll);
  }
  
  /**
   * Retrieve the set of values that occur in matches for all.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<ReactionRuleModel> rawAccumulateAllValuesOfall(final Object[] parameters) {
    Set<ReactionRuleModel> results = new HashSet<ReactionRuleModel>();
    rawAccumulateAllValues(POSITION_ALL, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for all.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<ReactionRuleModel> getAllValuesOfall() {
    return rawAccumulateAllValuesOfall(emptyArray());
  }
  
  @Override
  protected Test3Match tupleToMatch(final Tuple t) {
    try {
        return Test3Match.newMatch((ReactionRuleModel) t.get(POSITION_ALL));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Test3Match arrayToMatch(final Object[] match) {
    try {
        return Test3Match.newMatch((ReactionRuleModel) match[POSITION_ALL]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Test3Match arrayToMatchMutable(final Object[] match) {
    try {
        return Test3Match.newMutableMatch((ReactionRuleModel) match[POSITION_ALL]);
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
  public static IQuerySpecification<Test3Matcher> querySpecification() throws ViatraQueryException {
    return Test3QuerySpecification.instance();
  }
}
