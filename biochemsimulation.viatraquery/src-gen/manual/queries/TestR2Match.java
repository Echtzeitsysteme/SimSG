/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import manual.queries.util.TestR2QuerySpecification;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the manual.queries.testR2 pattern,
 * to be used in conjunction with {@link TestR2Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TestR2Matcher
 *  @see TestR2Processor
 * 
 */
@SuppressWarnings("all")
public abstract class TestR2Match extends BasePatternMatch {
  private AgentInstance fA;
  
  private AgentInstance fB;
  
  private static List<String> parameterNames = makeImmutableList("a", "b");
  
  private TestR2Match(final AgentInstance pA, final AgentInstance pB) {
    this.fA = pA;
    this.fB = pB;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("a".equals(parameterName)) return this.fA;
    if ("b".equals(parameterName)) return this.fB;
    return null;
  }
  
  public AgentInstance getA() {
    return this.fA;
  }
  
  public AgentInstance getB() {
    return this.fB;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("a".equals(parameterName) ) {
        this.fA = (AgentInstance) newValue;
        return true;
    }
    if ("b".equals(parameterName) ) {
        this.fB = (AgentInstance) newValue;
        return true;
    }
    return false;
  }
  
  public void setA(final AgentInstance pA) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fA = pA;
  }
  
  public void setB(final AgentInstance pB) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fB = pB;
  }
  
  @Override
  public String patternName() {
    return "manual.queries.testR2";
  }
  
  @Override
  public List<String> parameterNames() {
    return TestR2Match.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fA, fB};
  }
  
  @Override
  public TestR2Match toImmutable() {
    return isMutable() ? newMatch(fA, fB) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"a\"=" + prettyPrintValue(fA) + ", ");
    result.append("\"b\"=" + prettyPrintValue(fB));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(fA, fB);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof TestR2Match)) {
        TestR2Match other = (TestR2Match) obj;
        return Objects.equals(fA, other.fA) && Objects.equals(fB, other.fB);
    } else {
        // this should be infrequent
        if (!(obj instanceof IPatternMatch)) {
            return false;
        }
        IPatternMatch otherSig  = (IPatternMatch) obj;
        return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
    }
  }
  
  @Override
  public TestR2QuerySpecification specification() {
    try {
        return TestR2QuerySpecification.instance();
    } catch (ViatraQueryException ex) {
         // This cannot happen, as the match object can only be instantiated if the query specification exists
         throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static TestR2Match newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TestR2Match newMutableMatch(final AgentInstance pA, final AgentInstance pB) {
    return new Mutable(pA, pB);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TestR2Match newMatch(final AgentInstance pA, final AgentInstance pB) {
    return new Immutable(pA, pB);
  }
  
  private static final class Mutable extends TestR2Match {
    Mutable(final AgentInstance pA, final AgentInstance pB) {
      super(pA, pB);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TestR2Match {
    Immutable(final AgentInstance pA, final AgentInstance pB) {
      super(pA, pB);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
