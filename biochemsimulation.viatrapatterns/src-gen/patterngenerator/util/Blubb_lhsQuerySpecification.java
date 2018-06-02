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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import patterngenerator.Blubb_lhsMatch;
import patterngenerator.Blubb_lhsMatcher;
import patterngenerator.util.Support_SimLinkStateQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate Blubb_lhsMatcher in a type-safe way.
 * 
 * @see Blubb_lhsMatcher
 * @see Blubb_lhsMatch
 * 
 */
@SuppressWarnings("all")
public final class Blubb_lhsQuerySpecification extends BaseGeneratedEMFQuerySpecification<Blubb_lhsMatcher> {
  private Blubb_lhsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static Blubb_lhsQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Blubb_lhsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Blubb_lhsMatcher.on(engine);
  }
  
  @Override
  public Blubb_lhsMatcher instantiate() throws ViatraQueryException {
    return Blubb_lhsMatcher.create();
  }
  
  @Override
  public Blubb_lhsMatch newEmptyMatch() {
    return Blubb_lhsMatch.newEmptyMatch();
  }
  
  @Override
  public Blubb_lhsMatch newMatch(final Object... parameters) {
    return Blubb_lhsMatch.newMatch((biochemsimulation.reactioncontainer.SimAgent) parameters[0], (biochemsimulation.reactioncontainer.SimAgent) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: patterngenerator.util.Blubb_lhsQuerySpecification (visibility: PUBLIC, simpleName: Blubb_lhsQuerySpecification, identifier: patterngenerator.util.Blubb_lhsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterngenerator.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: patterngenerator.util.Blubb_lhsQuerySpecification (visibility: PUBLIC, simpleName: Blubb_lhsQuerySpecification, identifier: patterngenerator.util.Blubb_lhsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterngenerator.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Blubb_lhsQuerySpecification INSTANCE = new Blubb_lhsQuerySpecification();
    
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
    private final static Blubb_lhsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pD = new PParameter("D", "biochemsimulation.reactioncontainer.SimAgent", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pD1 = new PParameter("D1", "biochemsimulation.reactioncontainer.SimAgent", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pD, parameter_pD1);
    
    @Override
    public String getFullyQualifiedName() {
      return "patterngenerator.blubb_lhs";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("D","D1");
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
              PVariable var_D = body.getOrCreateVariableByName("D");
              PVariable var_D1 = body.getOrCreateVariableByName("D1");
              PVariable var_D_c = body.getOrCreateVariableByName("D_c");
              PVariable var_D1_c = body.getOrCreateVariableByName("D1_c");
              new TypeConstraint(body, Tuples.flatTupleOf(var_D), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
              new TypeConstraint(body, Tuples.flatTupleOf(var_D1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_D, parameter_pD),
                 new ExportedParameter(body, var_D1, parameter_pD1)
              ));
              // 	// Agent pattern for instances of agent D	SimAgent.Type(D, "D")
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, "D");
              new TypeConstraint(body, Tuples.flatTupleOf(var_D), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new TypeConstraint(body, Tuples.flatTupleOf(var_D, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent", "Type")));
              new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "String")));
              new Equality(body, var__virtual_1_, var__virtual_0_);
              // 		// Site patterns for site c attached to instances of agent D 		SimAgent.simSites(D, D_c)
              new TypeConstraint(body, Tuples.flatTupleOf(var_D), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new TypeConstraint(body, Tuples.flatTupleOf(var_D, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent", "simSites")));
              new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
              new Equality(body, var__virtual_2_, var_D_c);
              // 		SimSite.Type(D_c, "c")
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, "c");
              new TypeConstraint(body, Tuples.flatTupleOf(var_D_c), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
              PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
              new TypeConstraint(body, Tuples.flatTupleOf(var_D_c, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite", "Type")));
              new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "String")));
              new Equality(body, var__virtual_4_, var__virtual_3_);
              // 		neg find support_SimLinkState(D_c)
              new NegativePatternCall(body, new FlatTuple(var_D_c), Support_SimLinkStateQuerySpecification.instance().getInternalQueryRepresentation());
              // 		// Agent pattern for instances of agent D1	SimAgent.Type(D1, "D")
              PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
              new ConstantValue(body, var__virtual_5_, "D");
              new TypeConstraint(body, Tuples.flatTupleOf(var_D1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
              PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
              new TypeConstraint(body, Tuples.flatTupleOf(var_D1, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent", "Type")));
              new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "String")));
              new Equality(body, var__virtual_6_, var__virtual_5_);
              // 		// Site patterns for site c attached to instances of agent D1 		SimAgent.simSites(D1, D1_c)
              new TypeConstraint(body, Tuples.flatTupleOf(var_D1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent")));
              PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
              new TypeConstraint(body, Tuples.flatTupleOf(var_D1, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimAgent", "simSites")));
              new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
              new Equality(body, var__virtual_7_, var_D1_c);
              // 		SimSite.Type(D1_c, "c")
              PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
              new ConstantValue(body, var__virtual_8_, "c");
              new TypeConstraint(body, Tuples.flatTupleOf(var_D1_c), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
              PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
              new TypeConstraint(body, Tuples.flatTupleOf(var_D1_c, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite", "Type")));
              new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_9_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "String")));
              new Equality(body, var__virtual_9_, var__virtual_8_);
              // 		neg find support_SimLinkState(D1_c)
              new NegativePatternCall(body, new FlatTuple(var_D1_c), Support_SimLinkStateQuerySpecification.instance().getInternalQueryRepresentation());
              // 	 D != D1
              new Inequality(body, var_D, var_D1);
              bodies.add(body);
          }
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
