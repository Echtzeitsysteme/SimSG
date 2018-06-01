/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
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
import patterngenerator.Support_SimLinkStateMatch;
import patterngenerator.Support_SimLinkStateMatcher;

/**
 * A pattern-specific query specification that can instantiate Support_SimLinkStateMatcher in a type-safe way.
 * 
 * @see Support_SimLinkStateMatcher
 * @see Support_SimLinkStateMatch
 * 
 */
@SuppressWarnings("all")
public final class Support_SimLinkStateQuerySpecification extends BaseGeneratedEMFQuerySpecification<Support_SimLinkStateMatcher> {
  private Support_SimLinkStateQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static Support_SimLinkStateQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Support_SimLinkStateMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Support_SimLinkStateMatcher.on(engine);
  }
  
  @Override
  public Support_SimLinkStateMatcher instantiate() throws ViatraQueryException {
    return Support_SimLinkStateMatcher.create();
  }
  
  @Override
  public Support_SimLinkStateMatch newEmptyMatch() {
    return Support_SimLinkStateMatch.newEmptyMatch();
  }
  
  @Override
  public Support_SimLinkStateMatch newMatch(final Object... parameters) {
    return Support_SimLinkStateMatch.newMatch((biochemsimulation.reactioncontainer.SimSite) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: patterngenerator.util.Support_SimLinkStateQuerySpecification (visibility: PUBLIC, simpleName: Support_SimLinkStateQuerySpecification, identifier: patterngenerator.util.Support_SimLinkStateQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterngenerator.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: patterngenerator.util.Support_SimLinkStateQuerySpecification (visibility: PUBLIC, simpleName: Support_SimLinkStateQuerySpecification, identifier: patterngenerator.util.Support_SimLinkStateQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterngenerator.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Support_SimLinkStateQuerySpecification INSTANCE = new Support_SimLinkStateQuerySpecification();
    
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
    private final static Support_SimLinkStateQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pSs = new PParameter("ss", "biochemsimulation.reactioncontainer.SimSite", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSs);
    
    @Override
    public String getFullyQualifiedName() {
      return "patterngenerator.support_SimLinkState";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ss");
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
          PVariable var_ss = body.getOrCreateVariableByName("ss");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ss), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_ss, parameter_pSs)
          ));
          // 	SimSite.simLinkState(ss, _)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ss), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ss, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimSite", "simLinkState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimLinkState")));
          new Equality(body, var__virtual_0_, var___0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
