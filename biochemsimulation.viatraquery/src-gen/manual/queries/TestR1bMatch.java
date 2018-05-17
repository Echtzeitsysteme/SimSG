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
import manual.queries.util.TestR1bQuerySpecification;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the manual.queries.testR1b pattern,
 * to be used in conjunction with {@link TestR1bMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TestR1bMatcher
 *  @see TestR1bProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TestR1bMatch extends BasePatternMatch {
  private AgentInstance fBI;
  
  private AgentInstanceLinkState fBILS;
  
  private String fBN;
  
  private String fBsN;
  
  private FreeLink fBLS;
  
  private static List<String> parameterNames = makeImmutableList("bI", "bILS", "bN", "bsN", "bLS");
  
  private TestR1bMatch(final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
    this.fBI = pBI;
    this.fBILS = pBILS;
    this.fBN = pBN;
    this.fBsN = pBsN;
    this.fBLS = pBLS;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("bI".equals(parameterName)) return this.fBI;
    if ("bILS".equals(parameterName)) return this.fBILS;
    if ("bN".equals(parameterName)) return this.fBN;
    if ("bsN".equals(parameterName)) return this.fBsN;
    if ("bLS".equals(parameterName)) return this.fBLS;
    return null;
  }
  
  public AgentInstance getBI() {
    return this.fBI;
  }
  
  public AgentInstanceLinkState getBILS() {
    return this.fBILS;
  }
  
  public String getBN() {
    return this.fBN;
  }
  
  public String getBsN() {
    return this.fBsN;
  }
  
  public FreeLink getBLS() {
    return this.fBLS;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("bI".equals(parameterName) ) {
        this.fBI = (AgentInstance) newValue;
        return true;
    }
    if ("bILS".equals(parameterName) ) {
        this.fBILS = (AgentInstanceLinkState) newValue;
        return true;
    }
    if ("bN".equals(parameterName) ) {
        this.fBN = (String) newValue;
        return true;
    }
    if ("bsN".equals(parameterName) ) {
        this.fBsN = (String) newValue;
        return true;
    }
    if ("bLS".equals(parameterName) ) {
        this.fBLS = (FreeLink) newValue;
        return true;
    }
    return false;
  }
  
  public void setBI(final AgentInstance pBI) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fBI = pBI;
  }
  
  public void setBILS(final AgentInstanceLinkState pBILS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fBILS = pBILS;
  }
  
  public void setBN(final String pBN) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fBN = pBN;
  }
  
  public void setBsN(final String pBsN) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fBsN = pBsN;
  }
  
  public void setBLS(final FreeLink pBLS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fBLS = pBLS;
  }
  
  @Override
  public String patternName() {
    return "manual.queries.testR1b";
  }
  
  @Override
  public List<String> parameterNames() {
    return TestR1bMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fBI, fBILS, fBN, fBsN, fBLS};
  }
  
  @Override
  public TestR1bMatch toImmutable() {
    return isMutable() ? newMatch(fBI, fBILS, fBN, fBsN, fBLS) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"bI\"=" + prettyPrintValue(fBI) + ", ");
    result.append("\"bILS\"=" + prettyPrintValue(fBILS) + ", ");
    result.append("\"bN\"=" + prettyPrintValue(fBN) + ", ");
    result.append("\"bsN\"=" + prettyPrintValue(fBsN) + ", ");
    result.append("\"bLS\"=" + prettyPrintValue(fBLS));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(fBI, fBILS, fBN, fBsN, fBLS);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof TestR1bMatch)) {
        TestR1bMatch other = (TestR1bMatch) obj;
        return Objects.equals(fBI, other.fBI) && Objects.equals(fBILS, other.fBILS) && Objects.equals(fBN, other.fBN) && Objects.equals(fBsN, other.fBsN) && Objects.equals(fBLS, other.fBLS);
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
  public TestR1bQuerySpecification specification() {
    try {
        return TestR1bQuerySpecification.instance();
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
  public static TestR1bMatch newEmptyMatch() {
    return new Mutable(null, null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pBI the fixed value of pattern parameter bI, or null if not bound.
   * @param pBILS the fixed value of pattern parameter bILS, or null if not bound.
   * @param pBN the fixed value of pattern parameter bN, or null if not bound.
   * @param pBsN the fixed value of pattern parameter bsN, or null if not bound.
   * @param pBLS the fixed value of pattern parameter bLS, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TestR1bMatch newMutableMatch(final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
    return new Mutable(pBI, pBILS, pBN, pBsN, pBLS);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pBI the fixed value of pattern parameter bI, or null if not bound.
   * @param pBILS the fixed value of pattern parameter bILS, or null if not bound.
   * @param pBN the fixed value of pattern parameter bN, or null if not bound.
   * @param pBsN the fixed value of pattern parameter bsN, or null if not bound.
   * @param pBLS the fixed value of pattern parameter bLS, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TestR1bMatch newMatch(final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
    return new Immutable(pBI, pBILS, pBN, pBsN, pBLS);
  }
  
  private static final class Mutable extends TestR1bMatch {
    Mutable(final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
      super(pBI, pBILS, pBN, pBsN, pBLS);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TestR1bMatch {
    Immutable(final AgentInstance pBI, final AgentInstanceLinkState pBILS, final String pBN, final String pBsN, final FreeLink pBLS) {
      super(pBI, pBILS, pBN, pBsN, pBLS);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
