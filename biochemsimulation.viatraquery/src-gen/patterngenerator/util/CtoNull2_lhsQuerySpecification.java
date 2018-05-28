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
import patterngenerator.CtoNull2_lhsMatch;
import patterngenerator.CtoNull2_lhsMatcher;

/**
 * A pattern-specific query specification that can instantiate CtoNull2_lhsMatcher in a type-safe way.
 * 
 * @see CtoNull2_lhsMatcher
 * @see CtoNull2_lhsMatch
 * 
 */
@SuppressWarnings("all")
public final class CtoNull2_lhsQuerySpecification extends BaseGeneratedEMFQuerySpecification<CtoNull2_lhsMatcher> {
  private CtoNull2_lhsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static CtoNull2_lhsQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected CtoNull2_lhsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return CtoNull2_lhsMatcher.on(engine);
  }
  
  @Override
  public CtoNull2_lhsMatcher instantiate() throws ViatraQueryException {
    return CtoNull2_lhsMatcher.create();
  }
  
  @Override
  public CtoNull2_lhsMatch newEmptyMatch() {
    return CtoNull2_lhsMatch.newEmptyMatch();
  }
  
  @Override
  public CtoNull2_lhsMatch newMatch(final Object... parameters) {
    return CtoNull2_lhsMatch.newMatch((biochemsimulation.reactionrules.reactionRules.AgentInstance) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: patterngenerator.util.CtoNull2_lhsQuerySpecification (visibility: PUBLIC, simpleName: CtoNull2_lhsQuerySpecification, identifier: patterngenerator.util.CtoNull2_lhsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterngenerator.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: patterngenerator.util.CtoNull2_lhsQuerySpecification (visibility: PUBLIC, simpleName: CtoNull2_lhsQuerySpecification, identifier: patterngenerator.util.CtoNull2_lhsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterngenerator.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static CtoNull2_lhsQuerySpecification INSTANCE = new CtoNull2_lhsQuerySpecification();
    
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
    private final static CtoNull2_lhsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pC = new PParameter("C", "biochemsimulation.reactionrules.reactionRules.AgentInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pC);
    
    @Override
    public String getFullyQualifiedName() {
      return "patterngenerator.CtoNull2_lhs";
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
          PVariable var_C_x_ILS = body.getOrCreateVariableByName("C_x_ILS");
          new TypeConstraint(body, Tuples.flatTupleOf(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_C, parameter_pC)
          ));
          // 	// Agent pattern for instances of agent C	AgentInstance.agent.name(C, "C")
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "C");
          new TypeConstraint(body, Tuples.flatTupleOf(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_C, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance", "agent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Agent")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "ReactionProperty", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_2_, var__virtual_0_);
          // 		// Site patterns for site x attached to instances of agent C 		AgentInstance.linkStates(C, C_x_ILS)
          new TypeConstraint(body, Tuples.flatTupleOf(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_C, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstance", "linkStates")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          new Equality(body, var__virtual_3_, var_C_x_ILS);
          // 		AgentInstanceLinkState.site.name(C_x_ILS, "x")
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new ConstantValue(body, var__virtual_4_, "x");
          new TypeConstraint(body, Tuples.flatTupleOf(var_C_x_ILS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_C_x_ILS, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "AgentInstanceLinkState", "site")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Site")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactionrules.biochemsimulation/ReactionRules", "Site", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_6_, var__virtual_4_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
