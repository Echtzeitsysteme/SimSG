/**
 * Generated from platform:/resource/biochemsimulation.viatrapatterns/src/patterngenerator/GeneratedQueryTest.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import patterngenerator.AExact_lhsMatch;
import patterngenerator.AExact_lhsMatcher;

/**
 * A pattern-specific query specification that can instantiate AExact_lhsMatcher in a type-safe way.
 * 
 * @see AExact_lhsMatcher
 * @see AExact_lhsMatch
 * 
 */
@SuppressWarnings("all")
public final class AExact_lhsQuerySpecification extends BaseGeneratedEMFQuerySpecification<AExact_lhsMatcher> {
  private AExact_lhsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static AExact_lhsQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AExact_lhsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AExact_lhsMatcher.on(engine);
  }
  
  @Override
  public AExact_lhsMatcher instantiate() throws ViatraQueryException {
    return AExact_lhsMatcher.create();
  }
  
  @Override
  public AExact_lhsMatch newEmptyMatch() {
    return AExact_lhsMatch.newEmptyMatch();
  }
  
  @Override
  public AExact_lhsMatch newMatch(final Object... parameters) {
    return AExact_lhsMatch.newMatch((biochemsimulation.reactioncontainer.SimAgent) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: patterngenerator.util.AExact_lhsQuerySpecification (visibility: PUBLIC, simpleName: AExact_lhsQuerySpecification, identifier: patterngenerator.util.AExact_lhsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterngenerator.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: patterngenerator.util.AExact_lhsQuerySpecification (visibility: PUBLIC, simpleName: AExact_lhsQuerySpecification, identifier: patterngenerator.util.AExact_lhsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterngenerator.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static AExact_lhsQuerySpecification INSTANCE = new AExact_lhsQuerySpecification();
    
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
    private final static AExact_lhsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pA = new PParameter("A", "biochemsimulation.reactioncontainer.SimAgent", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pA);
    
    @Override
    public String getFullyQualifiedName() {
      return "patterngenerator.AExact_lhs";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("A");
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
          PVariable var_A_x = body.getOrCreateVariableByName("A_x");
          PVariable var_A_x_LS = body.getOrCreateVariableByName("A_x_LS");
          PVariable var_A_B = body.getOrCreateVariableByName("A_B");
          PVariable var_A_B_x = body.getOrCreateVariableByName("A_B_x");
          PVariable var_A_B_x_LS = body.getOrCreateVariableByName("A_B_x_LS");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_A, parameter_pA)
          ));
          // 	// Agent pattern for instances of agent A	SimAgent.Type(A, "A")
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "A");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "String")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          // 		// Site patterns for site x attached to instances of agent A 		SimAgent.simSites(A, A_x)
          new TypeConstraint(body, Tuples.flatTupleOf(var_A), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent", "simSites")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
          new Equality(body, var__virtual_2_, var_A_x);
          // 		SimSite.Type(A_x, "x")
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new ConstantValue(body, var__virtual_3_, "x");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_x), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_x, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "String")));
          new Equality(body, var__virtual_4_, var__virtual_3_);
          // 		SimSite.simLinkState(A_x, A_x_LS)
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_x), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_x, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite", "simLinkState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimLinkState")));
          new Equality(body, var__virtual_5_, var_A_x_LS);
          // 		// Create context for other SimAgent:		SimAgent.Type(A_B, "B")
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new ConstantValue(body, var__virtual_6_, "B");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_B), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_B, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "String")));
          new Equality(body, var__virtual_7_, var__virtual_6_);
          // 		SimAgent.simSites(A_B, A_B_x)
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_B), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_B, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent", "simSites")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_8_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
          new Equality(body, var__virtual_8_, var_A_B_x);
          // 		SimSite.Type(A_B_x, "x")
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new ConstantValue(body, var__virtual_9_, "x");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_B_x), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
          PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_B_x, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_10_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "String")));
          new Equality(body, var__virtual_10_, var__virtual_9_);
          // 		SimSite.simLinkState(A_B_x, A_B_x_LS)
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_B_x), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
          PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A_B_x, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite", "simLinkState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_11_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimLinkState")));
          new Equality(body, var__virtual_11_, var_A_B_x_LS);
          // 		// check for equality		A_x_LS == A_B_x_LS
          new Equality(body, var_A_x_LS, var_A_B_x_LS);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
