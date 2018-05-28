/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import manual.queries.TestR2bMatch;
import manual.queries.TestR2bMatcher;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;

/**
 * A pattern-specific query specification that can instantiate TestR2bMatcher in a type-safe way.
 * 
 * @see TestR2bMatcher
 * @see TestR2bMatch
 * 
 */
@SuppressWarnings("all")
public final class TestR2bQuerySpecification extends BaseGeneratedEMFQuerySpecification<TestR2bMatcher> {
  private TestR2bQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static TestR2bQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TestR2bMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TestR2bMatcher.on(engine);
  }
  
  @Override
  public TestR2bMatcher instantiate() throws ViatraQueryException {
    return TestR2bMatcher.create();
  }
  
  @Override
  public TestR2bMatch newEmptyMatch() {
    return TestR2bMatch.newEmptyMatch();
  }
  
  @Override
  public TestR2bMatch newMatch(final Object... parameters) {
    return TestR2bMatch.newMatch((biochemsimulation.reactionrules.reactionRules.AgentInstance) parameters[0], (biochemsimulation.reactionrules.reactionRules.AgentInstance) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: manual.queries.util.TestR2bQuerySpecification (visibility: PUBLIC, simpleName: TestR2bQuerySpecification, identifier: manual.queries.util.TestR2bQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: manual.queries.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: manual.queries.util.TestR2bQuerySpecification (visibility: PUBLIC, simpleName: TestR2bQuerySpecification, identifier: manual.queries.util.TestR2bQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: manual.queries.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static TestR2bQuerySpecification INSTANCE = new TestR2bQuerySpecification();
    
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
    private final static TestR2bQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pA = new PParameter("a", "biochemsimulation.reactionrules.reactionRules.AgentInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pB = new PParameter("b", "biochemsimulation.reactionrules.reactionRules.AgentInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pA, parameter_pB);
    
    @Override
    public String getFullyQualifiedName() {
      return "manual.queries.testR2b";
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
      {
          PBody body = new PBody(this);
          PVariable var_a = body.getOrCreateVariableByName("a");
          PVariable var_b = body.getOrCreateVariableByName("b");
          PVariable var_aILS = body.getOrCreateVariableByName("aILS");
          PVariable var_bILS = body.getOrCreateVariableByName("bILS");
          PVariable var_aSite = body.getOrCreateVariableByName("aSite");
          PVariable var_bSite = body.getOrCreateVariableByName("bSite");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_b), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_a, parameter_pA),
             new ExportedParameter(body, var_b, parameter_pB)
          ));
          // 	AgentInstance.linkStates(a, aILS)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance", "linkStates")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          new Equality(body, var__virtual_0_, var_aILS);
          // 	AgentInstance.linkStates(b, bILS)
          new TypeConstraint(body, Tuples.flatTupleOf(var_b), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_b, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance", "linkStates")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          new Equality(body, var__virtual_1_, var_bILS);
          // 		AgentInstanceLinkState.site(aILS, aSite)
          new TypeConstraint(body, Tuples.flatTupleOf(var_aILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_aILS, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState", "site")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Site")));
          new Equality(body, var__virtual_2_, var_aSite);
          // 	AgentInstanceLinkState.site(bILS, bSite)
          new TypeConstraint(body, Tuples.flatTupleOf(var_bILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_bILS, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState", "site")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Site")));
          new Equality(body, var__virtual_3_, var_bSite);
          // 	AgentInstanceLinkState.attachedSite(aILS, bSite)
          new TypeConstraint(body, Tuples.flatTupleOf(var_aILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_aILS, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState", "attachedSite")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Site")));
          new Equality(body, var__virtual_4_, var_bSite);
          // 	AgentInstanceLinkState.attachedSite(bILS, aSite)
          new TypeConstraint(body, Tuples.flatTupleOf(var_bILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_bILS, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState", "attachedSite")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Site")));
          new Equality(body, var__virtual_5_, var_aSite);
          // 	AgentInstanceLinkState.attachedAgentInstance(aILS, b)
          new TypeConstraint(body, Tuples.flatTupleOf(var_aILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_aILS, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState", "attachedAgentInstance")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          new Equality(body, var__virtual_6_, var_b);
          // 	AgentInstanceLinkState.attachedAgentInstance(bILS, a)
          new TypeConstraint(body, Tuples.flatTupleOf(var_bILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_bILS, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState", "attachedAgentInstance")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          new Equality(body, var__virtual_7_, var_a);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
