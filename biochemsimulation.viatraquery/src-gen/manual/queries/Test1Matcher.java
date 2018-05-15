/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import manual.queries.Test1Match;
import manual.queries.util.Test1QuerySpecification;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * Generated pattern matcher API of the manual.queries.test1 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Test1Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern test1(agentI: AgentInstance) {
 * 	AgentInstance.agent(agentI, _);
 * }
 * </pre></code>
 * 
 * @see Test1Match
 *  @see Test1Processor
 * @see Test1QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Test1Matcher extends BaseMatcher<Test1Match> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Test1Matcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    Test1Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (Test1Matcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static Test1Matcher create() throws ViatraQueryException {
    return new Test1Matcher();
  }
  
  private final static int POSITION_AGENTI = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Test1Matcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private Test1Matcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pAgentI the fixed value of pattern parameter agentI, or null if not bound.
   * @return matches represented as a Test1Match object.
   * 
   */
  public Collection<Test1Match> getAllMatches(final AgentInstance pAgentI) {
    return rawGetAllMatches(new Object[]{pAgentI});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pAgentI the fixed value of pattern parameter agentI, or null if not bound.
   * @return a match represented as a Test1Match object, or null if no match is found.
   * 
   */
  public Test1Match getOneArbitraryMatch(final AgentInstance pAgentI) {
    return rawGetOneArbitraryMatch(new Object[]{pAgentI});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pAgentI the fixed value of pattern parameter agentI, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final AgentInstance pAgentI) {
    return rawHasMatch(new Object[]{pAgentI});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pAgentI the fixed value of pattern parameter agentI, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final AgentInstance pAgentI) {
    return rawCountMatches(new Object[]{pAgentI});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pAgentI the fixed value of pattern parameter agentI, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final AgentInstance pAgentI, final IMatchProcessor<? super Test1Match> processor) {
    rawForEachMatch(new Object[]{pAgentI}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pAgentI the fixed value of pattern parameter agentI, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final AgentInstance pAgentI, final IMatchProcessor<? super Test1Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pAgentI}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pAgentI the fixed value of pattern parameter agentI, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Test1Match newMatch(final AgentInstance pAgentI) {
    return Test1Match.newMatch(pAgentI);
  }
  
  /**
   * Retrieve the set of values that occur in matches for agentI.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AgentInstance> rawAccumulateAllValuesOfagentI(final Object[] parameters) {
    Set<AgentInstance> results = new HashSet<AgentInstance>();
    rawAccumulateAllValues(POSITION_AGENTI, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for agentI.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfagentI() {
    return rawAccumulateAllValuesOfagentI(emptyArray());
  }
  
  @Override
  protected Test1Match tupleToMatch(final Tuple t) {
    try {
        return Test1Match.newMatch((AgentInstance) t.get(POSITION_AGENTI));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Test1Match arrayToMatch(final Object[] match) {
    try {
        return Test1Match.newMatch((AgentInstance) match[POSITION_AGENTI]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Test1Match arrayToMatchMutable(final Object[] match) {
    try {
        return Test1Match.newMutableMatch((AgentInstance) match[POSITION_AGENTI]);
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
  public static IQuerySpecification<Test1Matcher> querySpecification() throws ViatraQueryException {
    return Test1QuerySpecification.instance();
  }
}
