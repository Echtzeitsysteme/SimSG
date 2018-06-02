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
    return AtoB_rhsMatch.newMatch((biochemsimulation.reactioncontainer.SimAgent) parameters[0], (biochemsimulation.reactioncontainer.SimAgent) parameters[1]);
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
    
    private final PParameter parameter_pA = new PParameter("A", "biochemsimulation.reactioncontainer.SimAgent", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pB = new PParameter("B", "biochemsimulation.reactioncontainer.SimAgent", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pA, parameter_pB);
    
    @Override
    public String getFullyQualifiedName() {
      return "patterngenerator.AtoB_rhs";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("A","B");
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
          PVariable var_B = body.getOrCreateVariableByName("B");
          PVariable var_A_x = body.getOrCreateVariableByName("A_x");
          PVariable var_A_x_LS = body.getOrCreateVariableByName("A_x_LS");
          PVariable var_B_x_LS = body.getOrCreateVariableByName("B_x_LS");
          PVariable var_B_x = body.getOrCreateVariableByName("B_x");
          new TypeConstraint(body, Tuples.flatTupleOf(var_A), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_B), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_A, parameter_pA),
             new ExportedParameter(body, var_B, parameter_pB)
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
          // 		A_x_LS == B_x_LS
          new Equality(body, var_A_x_LS, var_B_x_LS);
          // 		// Agent pattern for instances of agent B	SimAgent.Type(B, "B")
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new ConstantValue(body, var__virtual_6_, "B");
          new TypeConstraint(body, Tuples.flatTupleOf(var_B), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_B, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "String")));
          new Equality(body, var__virtual_7_, var__virtual_6_);
          // 		// Site patterns for site x attached to instances of agent B 		SimAgent.simSites(B, B_x)
          new TypeConstraint(body, Tuples.flatTupleOf(var_B), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_B, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent", "simSites")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_8_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
          new Equality(body, var__virtual_8_, var_B_x);
          // 		SimSite.Type(B_x, "x")
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new ConstantValue(body, var__virtual_9_, "x");
          new TypeConstraint(body, Tuples.flatTupleOf(var_B_x), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
          PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_B_x, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_10_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "String")));
          new Equality(body, var__virtual_10_, var__virtual_9_);
          // 		SimSite.simLinkState(B_x, B_x_LS)
          new TypeConstraint(body, Tuples.flatTupleOf(var_B_x), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
          PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_B_x, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite", "simLinkState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_11_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimLinkState")));
          new Equality(body, var__virtual_11_, var_B_x_LS);
          // 		B_x_LS == A_x_LS
          new Equality(body, var_B_x_LS, var_A_x_LS);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
