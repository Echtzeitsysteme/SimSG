/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import manual.queries.TestR1aMatch;
import manual.queries.TestR1aMatcher;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;

/**
 * A pattern-specific query specification that can instantiate TestR1aMatcher in a type-safe way.
 * 
 * @see TestR1aMatcher
 * @see TestR1aMatch
 * 
 */
@SuppressWarnings("all")
public final class TestR1aQuerySpecification extends BaseGeneratedEMFQuerySpecification<TestR1aMatcher> {
  private TestR1aQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static TestR1aQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TestR1aMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TestR1aMatcher.on(engine);
  }
  
  @Override
  public TestR1aMatcher instantiate() throws ViatraQueryException {
    return TestR1aMatcher.create();
  }
  
  @Override
  public TestR1aMatch newEmptyMatch() {
    return TestR1aMatch.newEmptyMatch();
  }
  
  @Override
  public TestR1aMatch newMatch(final Object... parameters) {
    return TestR1aMatch.newMatch((biochemsimulation.reactionrules.reactionRules.AgentInstance) parameters[0], (java.lang.String) parameters[1], (java.lang.String) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: manual.queries.util.TestR1aQuerySpecification (visibility: PUBLIC, simpleName: TestR1aQuerySpecification, identifier: manual.queries.util.TestR1aQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: manual.queries.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: manual.queries.util.TestR1aQuerySpecification (visibility: PUBLIC, simpleName: TestR1aQuerySpecification, identifier: manual.queries.util.TestR1aQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: manual.queries.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static TestR1aQuerySpecification INSTANCE = new TestR1aQuerySpecification();
    
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
    private final static TestR1aQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pA = new PParameter("a", "biochemsimulation.reactionrules.reactionRules.AgentInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAgentName = new PParameter("agentName", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSiteName = new PParameter("siteName", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pA, parameter_pAgentName, parameter_pSiteName);
    
    @Override
    public String getFullyQualifiedName() {
      return "manual.queries.testR1a";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("a","agentName","siteName");
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
          PVariable var_agentName = body.getOrCreateVariableByName("agentName");
          PVariable var_siteName = body.getOrCreateVariableByName("siteName");
          PVariable var_aILS = body.getOrCreateVariableByName("aILS");
          PVariable var_als = body.getOrCreateVariableByName("als");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          new TypeFilterConstraint(body, new FlatTuple(var_agentName), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeFilterConstraint(body, new FlatTuple(var_siteName), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_a, parameter_pA),
             new ExportedParameter(body, var_agentName, parameter_pAgentName),
             new ExportedParameter(body, var_siteName, parameter_pSiteName)
          ));
          // 	AgentInstance.agent.name(a, agentName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance", "agent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Agent")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "ReactionProperty", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_1_, var_agentName);
          // 	AgentInstance.linkStates(a, aILS)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance", "linkStates")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          new Equality(body, var__virtual_2_, var_aILS);
          // 	AgentInstanceLinkState.site.name(aILS, siteName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_aILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_aILS, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState", "site")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Site")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Site", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_4_, var_siteName);
          // 	AgentInstanceLinkState.linkState.linkState(aILS, als)
          new TypeConstraint(body, Tuples.flatTupleOf(var_aILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_aILS, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState", "linkState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "LinkState")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "LinkState", "linkState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "LinkState")));
          new Equality(body, var__virtual_6_, var_als);
          // 	FreeLink(als)
          new TypeConstraint(body, Tuples.flatTupleOf(var_als), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "FreeLink")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
