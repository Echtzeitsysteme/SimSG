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
import patterngenerator.CtoNull_lhsMatch;
import patterngenerator.CtoNull_lhsMatcher;

/**
 * A pattern-specific query specification that can instantiate CtoNull_lhsMatcher in a type-safe way.
 * 
 * @see CtoNull_lhsMatcher
 * @see CtoNull_lhsMatch
 * 
 */
@SuppressWarnings("all")
public final class CtoNull_lhsQuerySpecification extends BaseGeneratedEMFQuerySpecification<CtoNull_lhsMatcher> {
  private CtoNull_lhsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static CtoNull_lhsQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected CtoNull_lhsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return CtoNull_lhsMatcher.on(engine);
  }
  
  @Override
  public CtoNull_lhsMatcher instantiate() throws ViatraQueryException {
    return CtoNull_lhsMatcher.create();
  }
  
  @Override
  public CtoNull_lhsMatch newEmptyMatch() {
    return CtoNull_lhsMatch.newEmptyMatch();
  }
  
  @Override
  public CtoNull_lhsMatch newMatch(final Object... parameters) {
    return CtoNull_lhsMatch.newMatch((biochemsimulation.reactioncontainer.SimAgent) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: patterngenerator.util.CtoNull_lhsQuerySpecification (visibility: PUBLIC, simpleName: CtoNull_lhsQuerySpecification, identifier: patterngenerator.util.CtoNull_lhsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterngenerator.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: patterngenerator.util.CtoNull_lhsQuerySpecification (visibility: PUBLIC, simpleName: CtoNull_lhsQuerySpecification, identifier: patterngenerator.util.CtoNull_lhsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterngenerator.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static CtoNull_lhsQuerySpecification INSTANCE = new CtoNull_lhsQuerySpecification();
    
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
    private final static CtoNull_lhsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pC = new PParameter("C", "biochemsimulation.reactioncontainer.SimAgent", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pC);
    
    @Override
    public String getFullyQualifiedName() {
      return "patterngenerator.CtoNull_lhs";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("C");
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
          PVariable var_C = body.getOrCreateVariableByName("C");
          PVariable var_C_x = body.getOrCreateVariableByName("C_x");
          new TypeConstraint(body, Tuples.flatTupleOf(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_C, parameter_pC)
          ));
          // 	// Agent pattern for instances of agent C	SimAgent.Type(C, "C")
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "C");
          new TypeConstraint(body, Tuples.flatTupleOf(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_C, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "String")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          // 		// Site patterns for site x attached to instances of agent C 		SimAgent.simSites(C, C_x)
          new TypeConstraint(body, Tuples.flatTupleOf(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_C, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent", "simSites")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
          new Equality(body, var__virtual_2_, var_C_x);
          // 		SimSite.Type(C_x, "x")
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new ConstantValue(body, var__virtual_3_, "x");
          new TypeConstraint(body, Tuples.flatTupleOf(var_C_x), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_C_x, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "String")));
          new Equality(body, var__virtual_4_, var__virtual_3_);
          // 		SimSite.simSiteState.Type(C_x, "u")
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new ConstantValue(body, var__virtual_5_, "u");
          new TypeConstraint(body, Tuples.flatTupleOf(var_C_x), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_C_x, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite", "simSiteState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSiteState")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSiteState", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "String")));
          new Equality(body, var__virtual_7_, var__virtual_5_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
