/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import manual.queries.TestR2Match;
import manual.queries.TestR2Matcher;
import manual.queries.util.TestR2aQuerySpecification;
import manual.queries.util.TestR2bQuerySpecification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;

/**
 * A pattern-specific query specification that can instantiate TestR2Matcher in a type-safe way.
 * 
 * @see TestR2Matcher
 * @see TestR2Match
 * 
 */
@SuppressWarnings("all")
public final class TestR2QuerySpecification extends BaseGeneratedEMFQuerySpecification<TestR2Matcher> {
  private TestR2QuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static TestR2QuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TestR2Matcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TestR2Matcher.on(engine);
  }
  
  @Override
  public TestR2Matcher instantiate() throws ViatraQueryException {
    return TestR2Matcher.create();
  }
  
  @Override
  public TestR2Match newEmptyMatch() {
    return TestR2Match.newEmptyMatch();
  }
  
  @Override
  public TestR2Match newMatch(final Object... parameters) {
    return TestR2Match.newMatch((biochemsimulation.reactionrules.reactionRules.AgentInstance) parameters[0], (biochemsimulation.reactionrules.reactionRules.AgentInstance) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: manual.queries.util.TestR2QuerySpecification (visibility: PUBLIC, simpleName: TestR2QuerySpecification, identifier: manual.queries.util.TestR2QuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: manual.queries.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: manual.queries.util.TestR2QuerySpecification (visibility: PUBLIC, simpleName: TestR2QuerySpecification, identifier: manual.queries.util.TestR2QuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: manual.queries.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static TestR2QuerySpecification INSTANCE = new TestR2QuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TestR2QuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pA = new PParameter("a", "biochemsimulation.reactionrules.reactionRules.AgentInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pB = new PParameter("b", "biochemsimulation.reactionrules.reactionRules.AgentInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pA, parameter_pB);
    
    @Override
    public String getFullyQualifiedName() {
      return "manual.queries.testR2";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("a","b");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
          {
              PBody body = new PBody(this);
              PVariable var_a = body.getOrCreateVariableByName("a");
              PVariable var_b = body.getOrCreateVariableByName("b");
              new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
              new TypeConstraint(body, Tuples.flatTupleOf(var_b), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_a, parameter_pA),
                 new ExportedParameter(body, var_b, parameter_pB)
              ));
              // 	/*	AgentInstance.agent.name(a, "A");	AgentInstance.linkStates(a, aILS);	AgentInstanceLinkState.site.name(aILS, "x");	AgentInstanceLinkState.linkState.linkState(aILS, als);	IndexedLink(als);		AgentInstance.agent.name(b, "B");	AgentInstance.linkStates(b, bILS);	AgentInstanceLinkState.site.name(bILS, "x");	AgentInstanceLinkState.linkState.linkState(bILS, bls);	IndexedLink(bls);		AgentInstanceLinkState.site(aILS, aSite);	AgentInstanceLinkState.site(bILS, bSite);	AgentInstanceLinkState.attachedSite(aILS, bSite);	AgentInstanceLinkState.attachedSite(bILS, aSite);	AgentInstanceLinkState.attachedAgentInstance(aILS, b);	AgentInstanceLinkState.attachedAgentInstance(bILS, a);	* 	*/	find testR2a(a, "A", "x")
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, "A");
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, "x");
              new PositivePatternCall(body, new FlatTuple(var_a, var__virtual_0_, var__virtual_1_), TestR2aQuerySpecification.instance().getInternalQueryRepresentation());
              // 	find testR2a(b, "B", "x")
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, "B");
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, "x");
              new PositivePatternCall(body, new FlatTuple(var_b, var__virtual_2_, var__virtual_3_), TestR2aQuerySpecification.instance().getInternalQueryRepresentation());
              // 	find testR2b(a,b)
              new PositivePatternCall(body, new FlatTuple(var_a, var_b), TestR2bQuerySpecification.instance().getInternalQueryRepresentation());
              bodies.add(body);
          }
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
