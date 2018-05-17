/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import manual.queries.TestR1Match;
import manual.queries.TestR1Matcher;
import manual.queries.util.TestR1aQuerySpecification;
import manual.queries.util.TestR1bQuerySpecification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;

/**
 * A pattern-specific query specification that can instantiate TestR1Matcher in a type-safe way.
 * 
 * @see TestR1Matcher
 * @see TestR1Match
 * 
 */
@SuppressWarnings("all")
public final class TestR1QuerySpecification extends BaseGeneratedEMFQuerySpecification<TestR1Matcher> {
  private TestR1QuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static TestR1QuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TestR1Matcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TestR1Matcher.on(engine);
  }
  
  @Override
  public TestR1Matcher instantiate() throws ViatraQueryException {
    return TestR1Matcher.create();
  }
  
  @Override
  public TestR1Match newEmptyMatch() {
    return TestR1Match.newEmptyMatch();
  }
  
  @Override
  public TestR1Match newMatch(final Object... parameters) {
    return TestR1Match.newMatch((biochemsimulation.reactionrules.reactionRules.AgentInstance) parameters[0], (biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState) parameters[1], (java.lang.String) parameters[2], (java.lang.String) parameters[3], (biochemsimulation.reactionrules.reactionRules.FreeLink) parameters[4], (biochemsimulation.reactionrules.reactionRules.AgentInstance) parameters[5], (biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState) parameters[6], (java.lang.String) parameters[7], (java.lang.String) parameters[8], (biochemsimulation.reactionrules.reactionRules.FreeLink) parameters[9]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: manual.queries.util.TestR1QuerySpecification (visibility: PUBLIC, simpleName: TestR1QuerySpecification, identifier: manual.queries.util.TestR1QuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: manual.queries.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: manual.queries.util.TestR1QuerySpecification (visibility: PUBLIC, simpleName: TestR1QuerySpecification, identifier: manual.queries.util.TestR1QuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: manual.queries.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static TestR1QuerySpecification INSTANCE = new TestR1QuerySpecification();
    
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
    private final static TestR1QuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pA = new PParameter("a", "biochemsimulation.reactionrules.reactionRules.AgentInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAILS = new PParameter("aILS", "biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAN = new PParameter("aN", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAsN = new PParameter("asN", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pALS = new PParameter("aLS", "biochemsimulation.reactionrules.reactionRules.FreeLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "FreeLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pBI = new PParameter("bI", "biochemsimulation.reactionrules.reactionRules.AgentInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pBILS = new PParameter("bILS", "biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pBN = new PParameter("bN", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pBsN = new PParameter("bsN", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pBLS = new PParameter("bLS", "biochemsimulation.reactionrules.reactionRules.FreeLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "FreeLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pA, parameter_pAILS, parameter_pAN, parameter_pAsN, parameter_pALS, parameter_pBI, parameter_pBILS, parameter_pBN, parameter_pBsN, parameter_pBLS);
    
    @Override
    public String getFullyQualifiedName() {
      return "manual.queries.testR1";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("a","aILS","aN","asN","aLS","bI","bILS","bN","bsN","bLS");
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
              PVariable var_aILS = body.getOrCreateVariableByName("aILS");
              PVariable var_aN = body.getOrCreateVariableByName("aN");
              PVariable var_asN = body.getOrCreateVariableByName("asN");
              PVariable var_aLS = body.getOrCreateVariableByName("aLS");
              PVariable var_bI = body.getOrCreateVariableByName("bI");
              PVariable var_bILS = body.getOrCreateVariableByName("bILS");
              PVariable var_bN = body.getOrCreateVariableByName("bN");
              PVariable var_bsN = body.getOrCreateVariableByName("bsN");
              PVariable var_bLS = body.getOrCreateVariableByName("bLS");
              new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
              new TypeConstraint(body, Tuples.flatTupleOf(var_aILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
              new TypeFilterConstraint(body, new FlatTuple(var_aN), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeFilterConstraint(body, new FlatTuple(var_asN), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_aLS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "FreeLink")));
              new TypeConstraint(body, Tuples.flatTupleOf(var_bI), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
              new TypeConstraint(body, Tuples.flatTupleOf(var_bILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
              new TypeFilterConstraint(body, new FlatTuple(var_bN), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeFilterConstraint(body, new FlatTuple(var_bsN), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_bLS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "FreeLink")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_a, parameter_pA),
                 new ExportedParameter(body, var_aILS, parameter_pAILS),
                 new ExportedParameter(body, var_aN, parameter_pAN),
                 new ExportedParameter(body, var_asN, parameter_pAsN),
                 new ExportedParameter(body, var_aLS, parameter_pALS),
                 new ExportedParameter(body, var_bI, parameter_pBI),
                 new ExportedParameter(body, var_bILS, parameter_pBILS),
                 new ExportedParameter(body, var_bN, parameter_pBN),
                 new ExportedParameter(body, var_bsN, parameter_pBsN),
                 new ExportedParameter(body, var_bLS, parameter_pBLS)
              ));
              // 	find testR1a(a, aILS, aN, asN, aLS)
              new PositivePatternCall(body, new FlatTuple(var_a, var_aILS, var_aN, var_asN, var_aLS), TestR1aQuerySpecification.instance().getInternalQueryRepresentation());
              // 	find testR1b(bI, bILS, bN, bsN, bLS)
              new PositivePatternCall(body, new FlatTuple(var_bI, var_bILS, var_bN, var_bsN, var_bLS), TestR1bQuerySpecification.instance().getInternalQueryRepresentation());
              bodies.add(body);
          }
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
