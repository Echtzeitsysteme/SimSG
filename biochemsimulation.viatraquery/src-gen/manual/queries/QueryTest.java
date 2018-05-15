/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries;

import manual.queries.Test1Matcher;
import manual.queries.Test2Matcher;
import manual.queries.Test3Matcher;
import manual.queries.util.Test1QuerySpecification;
import manual.queries.util.Test2QuerySpecification;
import manual.queries.util.Test3QuerySpecification;
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
 * <li>test1</li>
 * <li>test2</li>
 * <li>test3</li>
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
    querySpecifications.add(Test1QuerySpecification.instance());
    querySpecifications.add(Test2QuerySpecification.instance());
    querySpecifications.add(Test3QuerySpecification.instance());
  }
  
  public Test1QuerySpecification getTest1() throws ViatraQueryException {
    return Test1QuerySpecification.instance();
  }
  
  public Test1Matcher getTest1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Test1Matcher.on(engine);
  }
  
  public Test2QuerySpecification getTest2() throws ViatraQueryException {
    return Test2QuerySpecification.instance();
  }
  
  public Test2Matcher getTest2(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Test2Matcher.on(engine);
  }
  
  public Test3QuerySpecification getTest3() throws ViatraQueryException {
    return Test3QuerySpecification.instance();
  }
  
  public Test3Matcher getTest3(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Test3Matcher.on(engine);
  }
}
