/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
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
import patterngenerator.AtoB_rhsMatch;
import patterngenerator.AtoB_rhsMatcher;

/**
 * A pattern-specific query specification that can instantiate AtoB_rhsMatcher in a type-safe way.
 * 
 * @see AtoB_rhsMatcher
 * @see AtoB_rhsMatch
 * 
 */
@SuppressWarnings("all")
public final class AtoB_rhsQuerySpecification extends BaseGeneratedEMFQuerySpecification<AtoB_rhsMatcher> {
  private AtoB_rhsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static AtoB_rhsQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AtoB_rhsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AtoB_rhsMatcher.on(engine);
  }
  
  @Override
  public AtoB_rhsMatcher instantiate() throws ViatraQueryException {
    return AtoB_rhsMatcher.create();
  }
  
  @Override
  public AtoB_rhsMatch newEmptyMatch() {
    return AtoB_rhsMatch.newEmptyMatch();
  }
  
  @Override
  public AtoB_rhsMatch newMatch(final Object... parameters) {
    return AtoB_rhsMatch.newMatch((biochemsimulation.reactionrules.reactionRules.AgentInstance) parameters[0], (java.lang.String) parameters[1], (biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState) parameters[2], (java.lang.String) parameters[3], (biochemsimulation.reactionrules.reactionRules.LimitLink) parameters[4], (biochemsimulation.reactionrules.reactionRules.AgentInstance) parameters[5], (java.lang.String) parameters[6], (biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState) parameters[7], (java.lang.String) parameters[8], (biochemsimulation.reactionrules.reactionRules.LimitLink) parameters[9]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: patterngenerator.util.AtoB_rhsQuerySpecification (visibility: PUBLIC, simpleName: AtoB_rhsQuerySpecification, identifier: patterngenerator.util.AtoB_rhsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterngenerator.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: patterngenerator.util.AtoB_rhsQuerySpecification (visibility: PUBLIC, simpleName: AtoB_rhsQuerySpecification, identifier: patterngenerator.util.AtoB_rhsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterngenerator.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static AtoB_rhsQuerySpecification INSTANCE = new AtoB_rhsQuerySpecification();
    
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
    private final static AtoB_rhsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pA = new PParameter("A", "biochemsimulation.reactionrules.reactionRules.AgentInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAgent_A_Name = new PParameter("Agent_A_Name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pA_xILS = new PParameter("A_xILS", "biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pA_x_ILS_name = new PParameter("A_x_ILS_name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pA_x_ILS_state = new PParameter("A_x_ILS_state", "biochemsimulation.reactionrules.reactionRules.LimitLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "LimitLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pB = new PParameter("B", "biochemsimulation.reactionrules.reactionRules.AgentInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAgent_B_Name = new PParameter("Agent_B_Name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pB_xILS = new PParameter("B_xILS", "biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pB_x_ILS_name = new PParameter("B_x_ILS_name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pB_x_ILS_state = new PParameter("B_x_ILS_state", "biochemsimulation.reactionrules.reactionRules.LimitLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "LimitLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pA, parameter_pAgent_A_Name, parameter_pA_xILS, parameter_pA_x_ILS_name, parameter_pA_x_ILS_state, parameter_pB, parameter_pAgent_B_Name, parameter_pB_xILS, parameter_pB_x_ILS_name, parameter_pB_x_ILS_state);
    
    @Override
    public String getFullyQualifiedName() {
      return "patterngenerator.AtoB_rhs";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("A","Agent_A_Name","A_xILS","A_x_ILS_name","A_x_ILS_state","B","Agent_B_Name","B_xILS","B_x_ILS_name","B_x_ILS_state");
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
          PVariable var_A = body.getOrCreateVariableByName("A");
          PVariable var_Agent_A_Name = body.getOrCreateVariableByName("Agent_A_Name");
          PVariable var_A_xILS = body.getOrCreateVariableByName("A_xILS");
          PVariable var_A_x_ILS_name = body.getOrCreateVariableByName("A_x_ILS_name");
          PVariable var_A_x_ILS_state = body.getOrCreateVariableByName("A_x_ILS_state");
          PVariable var_B = body.getOrCreateVariableByName("B");
          PVariable var_Agent_B_Name = body.getOrCreateVariableByName("Agent_B_Name");
          PVariable var_B_xILS = body.getOrCreateVariableByName("B_xILS");
          PVariable var_B_x_ILS_name = body.getOrCreateVariableByName("B_x_ILS_name");
          PVariable var_B_x_ILS_state = body.getOrCreateVariableByName("B_x_ILS_state");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          new TypeFilterConstraint(body, new FlatTuple(var_Agent_A_Name), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_xILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          new TypeFilterConstraint(body, new FlatTuple(var_A_x_ILS_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_x_ILS_state), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "LimitLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_B), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          new TypeFilterConstraint(body, new FlatTuple(var_Agent_B_Name), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeConstraint(body, Tuples.flatTupleOf(var_B_xILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          new TypeFilterConstraint(body, new FlatTuple(var_B_x_ILS_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeConstraint(body, Tuples.flatTupleOf(var_B_x_ILS_state), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "LimitLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_A, parameter_pA),
             new ExportedParameter(body, var_Agent_A_Name, parameter_pAgent_A_Name),
             new ExportedParameter(body, var_A_xILS, parameter_pA_xILS),
             new ExportedParameter(body, var_A_x_ILS_name, parameter_pA_x_ILS_name),
             new ExportedParameter(body, var_A_x_ILS_state, parameter_pA_x_ILS_state),
             new ExportedParameter(body, var_B, parameter_pB),
             new ExportedParameter(body, var_Agent_B_Name, parameter_pAgent_B_Name),
             new ExportedParameter(body, var_B_xILS, parameter_pB_xILS),
             new ExportedParameter(body, var_B_x_ILS_name, parameter_pB_x_ILS_name),
             new ExportedParameter(body, var_B_x_ILS_state, parameter_pB_x_ILS_state)
          ));
          // 	AgentInstance.agent.name(A, Agent_A_Name)
          new TypeConstraint(body, Tuples.flatTupleOf(var_A), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance", "agent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Agent")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "ReactionProperty", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_1_, var_Agent_A_Name);
          // 		check (			Agent_A_Name.matches("A")		)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern AtoB_rhs";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("Agent_A_Name");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String Agent_A_Name = (String) provider.getValue("Agent_A_Name");
                  return evaluateExpression_1_1(Agent_A_Name);
              }
          },  null); 
          // 		AgentInstance.linkStates(A, A_xILS)
          new TypeConstraint(body, Tuples.flatTupleOf(var_A), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance", "linkStates")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          new Equality(body, var__virtual_2_, var_A_xILS);
          // 		AgentInstanceLinkState.site.name(A_xILS, A_x_ILS_name)
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_xILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_xILS, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState", "site")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Site")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Site", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_4_, var_A_x_ILS_name);
          // 			check (				A_x_ILS_name.matches("x")			)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern AtoB_rhs";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("A_x_ILS_name");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String A_x_ILS_name = (String) provider.getValue("A_x_ILS_name");
                  return evaluateExpression_1_2(A_x_ILS_name);
              }
          },  null); 
          // 		AgentInstanceLinkState.linkState.linkState(A_xILS, A_x_ILS_state)
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_xILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_xILS, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState", "linkState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "LinkState")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "LinkState", "linkState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "LinkState")));
          new Equality(body, var__virtual_6_, var_A_x_ILS_state);
          // 	AgentInstance.agent.name(B, Agent_B_Name)
          new TypeConstraint(body, Tuples.flatTupleOf(var_B), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_B, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance", "agent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Agent")));
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "ReactionProperty", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_8_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_8_, var_Agent_B_Name);
          // 		check (			Agent_B_Name.matches("B")		)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern AtoB_rhs";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("Agent_B_Name");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String Agent_B_Name = (String) provider.getValue("Agent_B_Name");
                  return evaluateExpression_1_3(Agent_B_Name);
              }
          },  null); 
          // 		AgentInstance.linkStates(B, B_xILS)
          new TypeConstraint(body, Tuples.flatTupleOf(var_B), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_B, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance", "linkStates")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_9_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          new Equality(body, var__virtual_9_, var_B_xILS);
          // 		AgentInstanceLinkState.site.name(B_xILS, B_x_ILS_name)
          new TypeConstraint(body, Tuples.flatTupleOf(var_B_xILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_B_xILS, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState", "site")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_10_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Site")));
          PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_10_, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Site", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_11_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_11_, var_B_x_ILS_name);
          // 			check (				B_x_ILS_name.matches("x")			)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern AtoB_rhs";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("B_x_ILS_name");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String B_x_ILS_name = (String) provider.getValue("B_x_ILS_name");
                  return evaluateExpression_1_4(B_x_ILS_name);
              }
          },  null); 
          // 		AgentInstanceLinkState.linkState.linkState(B_xILS, B_x_ILS_state)
          new TypeConstraint(body, Tuples.flatTupleOf(var_B_xILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_B_xILS, var__virtual_12_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState", "linkState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_12_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "LinkState")));
          PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_12_, var__virtual_13_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "LinkState", "linkState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_13_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "LinkState")));
          new Equality(body, var__virtual_13_, var_B_x_ILS_state);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final String Agent_A_Name) {
    boolean _matches = Agent_A_Name.matches("A");
    return _matches;
  }
  
  private static boolean evaluateExpression_1_2(final String A_x_ILS_name) {
    boolean _matches = A_x_ILS_name.matches("x");
    return _matches;
  }
  
  private static boolean evaluateExpression_1_3(final String Agent_B_Name) {
    boolean _matches = Agent_B_Name.matches("B");
    return _matches;
  }
  
  private static boolean evaluateExpression_1_4(final String B_x_ILS_name) {
    boolean _matches = B_x_ILS_name.matches("x");
    return _matches;
  }
}
