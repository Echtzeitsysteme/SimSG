/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries;

import manual.queries.TestR1Matcher;
import manual.queries.TestR1aMatcher;
import manual.queries.TestR1bMatcher;
import manual.queries.util.TestR1QuerySpecification;
import manual.queries.util.TestR1aQuerySpecification;
import manual.queries.util.TestR1bQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all public patterns defined in QueryTest.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file QueryTest.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package manual.queries, the group contains the definition of the following patterns: <ul>
 * <li>testR1</li>
 * <li>testR1a</li>
 * <li>testR1b</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class QueryTest extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static QueryTest instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new QueryTest();
    }
    return INSTANCE;
  }
  
  private static QueryTest INSTANCE;
  
  private QueryTest() throws ViatraQueryException {
    querySpecifications.add(TestR1QuerySpecification.instance());
    querySpecifications.add(TestR1aQuerySpecification.instance());
    querySpecifications.add(TestR1bQuerySpecification.instance());
  }
  
  public TestR1QuerySpecification getTestR1() throws ViatraQueryException {
    return TestR1QuerySpecification.instance();
  }
  
  public TestR1Matcher getTestR1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TestR1Matcher.on(engine);
  }
  
  public TestR1aQuerySpecification getTestR1a() throws ViatraQueryException {
    return TestR1aQuerySpecification.instance();
  }
  
  public TestR1aMatcher getTestR1a(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TestR1aMatcher.on(engine);
  }
  
  public TestR1bQuerySpecification getTestR1b() throws ViatraQueryException {
    return TestR1bQuerySpecification.instance();
  }
  
  public TestR1bMatcher getTestR1b(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TestR1bMatcher.on(engine);
  }
}
