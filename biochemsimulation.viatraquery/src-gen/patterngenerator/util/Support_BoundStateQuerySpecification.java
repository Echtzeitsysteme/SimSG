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
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import patterngenerator.Support_BoundStateMatch;
import patterngenerator.Support_BoundStateMatcher;

/**
 * A pattern-specific query specification that can instantiate Support_BoundStateMatcher in a type-safe way.
 * 
 * @see Support_BoundStateMatcher
 * @see Support_BoundStateMatch
 * 
 */
@SuppressWarnings("all")
public final class Support_BoundStateQuerySpecification extends BaseGeneratedEMFQuerySpecification<Support_BoundStateMatcher> {
  private Support_BoundStateQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static Support_BoundStateQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Support_BoundStateMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Support_BoundStateMatcher.on(engine);
  }
  
  @Override
  public Support_BoundStateMatcher instantiate() throws ViatraQueryException {
    return Support_BoundStateMatcher.create();
  }
  
  @Override
  public Support_BoundStateMatch newEmptyMatch() {
    return Support_BoundStateMatch.newEmptyMatch();
  }
  
  @Override
  public Support_BoundStateMatch newMatch(final Object... parameters) {
    return Support_BoundStateMatch.newMatch((biochemsimulation.reactioncontainer.SimBound) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: patterngenerator.util.Support_BoundStateQuerySpecification (visibility: PUBLIC, simpleName: Support_BoundStateQuerySpecification, identifier: patterngenerator.util.Support_BoundStateQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterngenerator.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: patterngenerator.util.Support_BoundStateQuerySpecification (visibility: PUBLIC, simpleName: Support_BoundStateQuerySpecification, identifier: patterngenerator.util.Support_BoundStateQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterngenerator.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Support_BoundStateQuerySpecification INSTANCE = new Support_BoundStateQuerySpecification();
    
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
    private final static Support_BoundStateQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pLs = new PParameter("ls", "biochemsimulation.reactioncontainer.SimBound", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimBound")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pLs);
    
    @Override
    public String getFullyQualifiedName() {
      return "patterngenerator.support_BoundState";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ls");
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
          PVariable var_ls = body.getOrCreateVariableByName("ls");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ls), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimBound")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_ls, parameter_pLs)
          ));
          // 	SimBound(ls)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ls), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.reactioncontainer.biochemsimulation.org/reactioncontainer", "SimBound")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
