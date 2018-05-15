/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries;

import biochemsimulation.reactionrules.reactionRules.Model;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import manual.queries.Test2Match;
import manual.queries.util.Test2QuerySpecification;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * Generated pattern matcher API of the manual.queries.test2 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Test2Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern test2(model: Model) {
 * 	Model.name(model, _);
 * }
 * </pre></code>
 * 
 * @see Test2Match
 *  @see Test2Processor
 * @see Test2QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Test2Matcher extends BaseMatcher<Test2Match> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Test2Matcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    Test2Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (Test2Matcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static Test2Matcher create() throws ViatraQueryException {
    return new Test2Matcher();
  }
  
  private final static int POSITION_MODEL = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Test2Matcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private Test2Matcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pModel the fixed value of pattern parameter model, or null if not bound.
   * @return matches represented as a Test2Match object.
   * 
   */
  public Collection<Test2Match> getAllMatches(final Model pModel) {
    return rawGetAllMatches(new Object[]{pModel});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pModel the fixed value of pattern parameter model, or null if not bound.
   * @return a match represented as a Test2Match object, or null if no match is found.
   * 
   */
  public Test2Match getOneArbitraryMatch(final Model pModel) {
    return rawGetOneArbitraryMatch(new Object[]{pModel});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pModel the fixed value of pattern parameter model, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Model pModel) {
    return rawHasMatch(new Object[]{pModel});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pModel the fixed value of pattern parameter model, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Model pModel) {
    return rawCountMatches(new Object[]{pModel});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pModel the fixed value of pattern parameter model, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Model pModel, final IMatchProcessor<? super Test2Match> processor) {
    rawForEachMatch(new Object[]{pModel}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pModel the fixed value of pattern parameter model, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Model pModel, final IMatchProcessor<? super Test2Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pModel}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pModel the fixed value of pattern parameter model, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Test2Match newMatch(final Model pModel) {
    return Test2Match.newMatch(pModel);
  }
  
  /**
   * Retrieve the set of values that occur in matches for model.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<Model> rawAccumulateAllValuesOfmodel(final Object[] parameters) {
    Set<Model> results = new HashSet<Model>();
    rawAccumulateAllValues(POSITION_MODEL, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for model.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Model> getAllValuesOfmodel() {
    return rawAccumulateAllValuesOfmodel(emptyArray());
  }
  
  @Override
  protected Test2Match tupleToMatch(final Tuple t) {
    try {
        return Test2Match.newMatch((Model) t.get(POSITION_MODEL));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Test2Match arrayToMatch(final Object[] match) {
    try {
        return Test2Match.newMatch((Model) match[POSITION_MODEL]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Test2Match arrayToMatchMutable(final Object[] match) {
    try {
        return Test2Match.newMutableMatch((Model) match[POSITION_MODEL]);
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
  public static IQuerySpecification<Test2Matcher> querySpecification() throws ViatraQueryException {
    return Test2QuerySpecification.instance();
  }
}
