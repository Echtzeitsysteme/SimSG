/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import manual.queries.util.TestR1aQuerySpecification;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the manual.queries.testR1a pattern,
 * to be used in conjunction with {@link TestR1aMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TestR1aMatcher
 *  @see TestR1aProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TestR1aMatch extends BasePatternMatch {
  private AgentInstance fA;
  
  private AgentInstanceLinkState fAILS;
  
  private String fAN;
  
  private String fAsN;
  
  private FreeLink fALS;
  
  private static List<String> parameterNames = makeImmutableList("a", "aILS", "aN", "asN", "aLS");
  
  private TestR1aMatch(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS) {
    this.fA = pA;
    this.fAILS = pAILS;
    this.fAN = pAN;
    this.fAsN = pAsN;
    this.fALS = pALS;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("a".equals(parameterName)) return this.fA;
    if ("aILS".equals(parameterName)) return this.fAILS;
    if ("aN".equals(parameterName)) return this.fAN;
    if ("asN".equals(parameterName)) return this.fAsN;
    if ("aLS".equals(parameterName)) return this.fALS;
    return null;
  }
  
  public AgentInstance getA() {
    return this.fA;
  }
  
  public AgentInstanceLinkState getAILS() {
    return this.fAILS;
  }
  
  public String getAN() {
    return this.fAN;
  }
  
  public String getAsN() {
    return this.fAsN;
  }
  
  public FreeLink getALS() {
    return this.fALS;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("a".equals(parameterName) ) {
        this.fA = (AgentInstance) newValue;
        return true;
    }
    if ("aILS".equals(parameterName) ) {
        this.fAILS = (AgentInstanceLinkState) newValue;
        return true;
    }
    if ("aN".equals(parameterName) ) {
        this.fAN = (String) newValue;
        return true;
    }
    if ("asN".equals(parameterName) ) {
        this.fAsN = (String) newValue;
        return true;
    }
    if ("aLS".equals(parameterName) ) {
        this.fALS = (FreeLink) newValue;
        return true;
    }
    return false;
  }
  
  public void setA(final AgentInstance pA) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fA = pA;
  }
  
  public void setAILS(final AgentInstanceLinkState pAILS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAILS = pAILS;
  }
  
  public void setAN(final String pAN) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAN = pAN;
  }
  
  public void setAsN(final String pAsN) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAsN = pAsN;
  }
  
  public void setALS(final FreeLink pALS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fALS = pALS;
  }
  
  @Override
  public String patternName() {
    return "manual.queries.testR1a";
  }
  
  @Override
  public List<String> parameterNames() {
    return TestR1aMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fA, fAILS, fAN, fAsN, fALS};
  }
  
  @Override
  public TestR1aMatch toImmutable() {
    return isMutable() ? newMatch(fA, fAILS, fAN, fAsN, fALS) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"a\"=" + prettyPrintValue(fA) + ", ");
    result.append("\"aILS\"=" + prettyPrintValue(fAILS) + ", ");
    result.append("\"aN\"=" + prettyPrintValue(fAN) + ", ");
    result.append("\"asN\"=" + prettyPrintValue(fAsN) + ", ");
    result.append("\"aLS\"=" + prettyPrintValue(fALS));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(fA, fAILS, fAN, fAsN, fALS);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof TestR1aMatch)) {
        TestR1aMatch other = (TestR1aMatch) obj;
        return Objects.equals(fA, other.fA) && Objects.equals(fAILS, other.fAILS) && Objects.equals(fAN, other.fAN) && Objects.equals(fAsN, other.fAsN) && Objects.equals(fALS, other.fALS);
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
  public TestR1aQuerySpecification specification() {
    try {
        return TestR1aQuerySpecification.instance();
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
  public static TestR1aMatch newEmptyMatch() {
    return new Mutable(null, null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAILS the fixed value of pattern parameter aILS, or null if not bound.
   * @param pAN the fixed value of pattern parameter aN, or null if not bound.
   * @param pAsN the fixed value of pattern parameter asN, or null if not bound.
   * @param pALS the fixed value of pattern parameter aLS, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TestR1aMatch newMutableMatch(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS) {
    return new Mutable(pA, pAILS, pAN, pAsN, pALS);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAILS the fixed value of pattern parameter aILS, or null if not bound.
   * @param pAN the fixed value of pattern parameter aN, or null if not bound.
   * @param pAsN the fixed value of pattern parameter asN, or null if not bound.
   * @param pALS the fixed value of pattern parameter aLS, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TestR1aMatch newMatch(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS) {
    return new Immutable(pA, pAILS, pAN, pAsN, pALS);
  }
  
  private static final class Mutable extends TestR1aMatch {
    Mutable(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS) {
      super(pA, pAILS, pAN, pAsN, pALS);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TestR1aMatch {
    Immutable(final AgentInstance pA, final AgentInstanceLinkState pAILS, final String pAN, final String pAsN, final FreeLink pALS) {
      super(pA, pAILS, pAN, pAsN, pALS);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
