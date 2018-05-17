/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import manual.queries.TestR1bMatch;
import manual.queries.TestR1bMatcher;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;

/**
 * A pattern-specific query specification that can instantiate TestR1bMatcher in a type-safe way.
 * 
 * @see TestR1bMatcher
 * @see TestR1bMatch
 * 
 */
@SuppressWarnings("all")
public final class TestR1bQuerySpecification extends BaseGeneratedEMFQuerySpecification<TestR1bMatcher> {
  private TestR1bQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static TestR1bQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TestR1bMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TestR1bMatcher.on(engine);
  }
  
  @Override
  public TestR1bMatcher instantiate() throws ViatraQueryException {
    return TestR1bMatcher.create();
  }
  
  @Override
  public TestR1bMatch newEmptyMatch() {
    return TestR1bMatch.newEmptyMatch();
  }
  
  @Override
  public TestR1bMatch newMatch(final Object... parameters) {
    return TestR1bMatch.newMatch((biochemsimulation.reactionrules.reactionRules.AgentInstance) parameters[0], (biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState) parameters[1], (java.lang.String) parameters[2], (java.lang.String) parameters[3], (biochemsimulation.reactionrules.reactionRules.FreeLink) parameters[4]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: manual.queries.util.TestR1bQuerySpecification (visibility: PUBLIC, simpleName: TestR1bQuerySpecification, identifier: manual.queries.util.TestR1bQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: manual.queries.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: manual.queries.util.TestR1bQuerySpecification (visibility: PUBLIC, simpleName: TestR1bQuerySpecification, identifier: manual.queries.util.TestR1bQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: manual.queries.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static TestR1bQuerySpecification INSTANCE = new TestR1bQuerySpecification();
    
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
    private final static TestR1bQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pBI = new PParameter("bI", "biochemsimulation.reactionrules.reactionRules.AgentInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pBILS = new PParameter("bILS", "biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pBN = new PParameter("bN", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pBsN = new PParameter("bsN", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pBLS = new PParameter("bLS", "biochemsimulation.reactionrules.reactionRules.FreeLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "FreeLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pBI, parameter_pBILS, parameter_pBN, parameter_pBsN, parameter_pBLS);
    
    @Override
    public String getFullyQualifiedName() {
      return "manual.queries.testR1b";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("bI","bILS","bN","bsN","bLS");
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
          PVariable var_bI = body.getOrCreateVariableByName("bI");
          PVariable var_bILS = body.getOrCreateVariableByName("bILS");
          PVariable var_bN = body.getOrCreateVariableByName("bN");
          PVariable var_bsN = body.getOrCreateVariableByName("bsN");
          PVariable var_bLS = body.getOrCreateVariableByName("bLS");
          new TypeConstraint(body, Tuples.flatTupleOf(var_bI), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_bILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          new TypeFilterConstraint(body, new FlatTuple(var_bN), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeFilterConstraint(body, new FlatTuple(var_bsN), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeConstraint(body, Tuples.flatTupleOf(var_bLS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "FreeLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_bI, parameter_pBI),
             new ExportedParameter(body, var_bILS, parameter_pBILS),
             new ExportedParameter(body, var_bN, parameter_pBN),
             new ExportedParameter(body, var_bsN, parameter_pBsN),
             new ExportedParameter(body, var_bLS, parameter_pBLS)
          ));
          // 	AgentInstance.agent.name(bI, bN)
          new TypeConstraint(body, Tuples.flatTupleOf(var_bI), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_bI, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance", "agent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Agent")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "ReactionProperty", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_1_, var_bN);
          // 	check (		bN.matches("B")	)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern testR1b";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("bN");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String bN = (String) provider.getValue("bN");
                  return evaluateExpression_1_1(bN);
              }
          },  null); 
          // 	AgentInstance.linkStates(bI, bILS)
          new TypeConstraint(body, Tuples.flatTupleOf(var_bI), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_bI, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance", "linkStates")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          new Equality(body, var__virtual_2_, var_bILS);
          // 	AgentInstanceLinkState.site.name(bILS, bsN)
          new TypeConstraint(body, Tuples.flatTupleOf(var_bILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_bILS, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState", "site")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Site")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Site", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_4_, var_bsN);
          // 	check (		bsN.matches("x")	)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern testR1b";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("bsN");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String bsN = (String) provider.getValue("bsN");
                  return evaluateExpression_1_2(bsN);
              }
          },  null); 
          // 	AgentInstanceLinkState.linkState.linkState(bILS, bLS)
          new TypeConstraint(body, Tuples.flatTupleOf(var_bILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_bILS, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState", "linkState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "LinkState")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "LinkState", "linkState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "LinkState")));
          new Equality(body, var__virtual_6_, var_bLS);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final String bN) {
    boolean _matches = bN.matches("B");
    return _matches;
  }
  
  private static boolean evaluateExpression_1_2(final String bsN) {
    boolean _matches = bsN.matches("x");
    return _matches;
  }
}
