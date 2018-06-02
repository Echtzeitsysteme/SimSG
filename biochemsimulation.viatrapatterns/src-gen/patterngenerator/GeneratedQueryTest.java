/**
 * Generated from platform:/resource/biochemsimulation.viatrapatterns/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import patterngenerator.AExact_lhsMatcher;
import patterngenerator.AtoB_lhsMatcher;
import patterngenerator.AtoB_rhsMatcher;
import patterngenerator.AtoNull_lhsMatcher;
import patterngenerator.Bla_lhsMatcher;
import patterngenerator.Blubb_lhsMatcher;
import patterngenerator.CtoNull2_lhsMatcher;
import patterngenerator.CtoNull_lhsMatcher;
import patterngenerator.Support_SimLinkStateMatcher;
import patterngenerator.util.AExact_lhsQuerySpecification;
import patterngenerator.util.AtoB_lhsQuerySpecification;
import patterngenerator.util.AtoB_rhsQuerySpecification;
import patterngenerator.util.AtoNull_lhsQuerySpecification;
import patterngenerator.util.Bla_lhsQuerySpecification;
import patterngenerator.util.Blubb_lhsQuerySpecification;
import patterngenerator.util.CtoNull2_lhsQuerySpecification;
import patterngenerator.util.CtoNull_lhsQuerySpecification;
import patterngenerator.util.Support_SimLinkStateQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in GeneratedQueryTest.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file GeneratedQueryTest.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package patterngenerator, the group contains the definition of the following patterns: <ul>
 * <li>support_SimLinkState</li>
 * <li>AtoB_lhs</li>
 * <li>AtoB_rhs</li>
 * <li>AtoNull_lhs</li>
 * <li>CtoNull_lhs</li>
 * <li>CtoNull2_lhs</li>
 * <li>AExact_lhs</li>
 * <li>bla_lhs</li>
 * <li>blubb_lhs</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class GeneratedQueryTest extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static GeneratedQueryTest instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new GeneratedQueryTest();
    }
    return INSTANCE;
  }
  
  private static GeneratedQueryTest INSTANCE;
  
  private GeneratedQueryTest() throws ViatraQueryException {
    querySpecifications.add(Support_SimLinkStateQuerySpecification.instance());
    querySpecifications.add(AtoB_lhsQuerySpecification.instance());
    querySpecifications.add(AtoB_rhsQuerySpecification.instance());
    querySpecifications.add(AtoNull_lhsQuerySpecification.instance());
    querySpecifications.add(CtoNull_lhsQuerySpecification.instance());
    querySpecifications.add(CtoNull2_lhsQuerySpecification.instance());
    querySpecifications.add(AExact_lhsQuerySpecification.instance());
    querySpecifications.add(Bla_lhsQuerySpecification.instance());
    querySpecifications.add(Blubb_lhsQuerySpecification.instance());
  }
  
  public Support_SimLinkStateQuerySpecification getSupport_SimLinkState() throws ViatraQueryException {
    return Support_SimLinkStateQuerySpecification.instance();
  }
  
  public Support_SimLinkStateMatcher getSupport_SimLinkState(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Support_SimLinkStateMatcher.on(engine);
  }
  
  public AtoB_lhsQuerySpecification getAtoB_lhs() throws ViatraQueryException {
    return AtoB_lhsQuerySpecification.instance();
  }
  
  public AtoB_lhsMatcher getAtoB_lhs(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AtoB_lhsMatcher.on(engine);
  }
  
  public AtoB_rhsQuerySpecification getAtoB_rhs() throws ViatraQueryException {
    return AtoB_rhsQuerySpecification.instance();
  }
  
  public AtoB_rhsMatcher getAtoB_rhs(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AtoB_rhsMatcher.on(engine);
  }
  
  public AtoNull_lhsQuerySpecification getAtoNull_lhs() throws ViatraQueryException {
    return AtoNull_lhsQuerySpecification.instance();
  }
  
  public AtoNull_lhsMatcher getAtoNull_lhs(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AtoNull_lhsMatcher.on(engine);
  }
  
  public CtoNull_lhsQuerySpecification getCtoNull_lhs() throws ViatraQueryException {
    return CtoNull_lhsQuerySpecification.instance();
  }
  
  public CtoNull_lhsMatcher getCtoNull_lhs(final ViatraQueryEngine engine) throws ViatraQueryException {
    return CtoNull_lhsMatcher.on(engine);
  }
  
  public CtoNull2_lhsQuerySpecification getCtoNull2_lhs() throws ViatraQueryException {
    return CtoNull2_lhsQuerySpecification.instance();
  }
  
  public CtoNull2_lhsMatcher getCtoNull2_lhs(final ViatraQueryEngine engine) throws ViatraQueryException {
    return CtoNull2_lhsMatcher.on(engine);
  }
  
  public AExact_lhsQuerySpecification getAExact_lhs() throws ViatraQueryException {
    return AExact_lhsQuerySpecification.instance();
  }
  
  public AExact_lhsMatcher getAExact_lhs(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AExact_lhsMatcher.on(engine);
  }
  
  public Bla_lhsQuerySpecification getBla_lhs() throws ViatraQueryException {
    return Bla_lhsQuerySpecification.instance();
  }
  
  public Bla_lhsMatcher getBla_lhs(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Bla_lhsMatcher.on(engine);
  }
  
  public Blubb_lhsQuerySpecification getBlubb_lhs() throws ViatraQueryException {
    return Blubb_lhsQuerySpecification.instance();
  }
  
  public Blubb_lhsMatcher getBlubb_lhs(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Blubb_lhsMatcher.on(engine);
  }
}
