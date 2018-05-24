/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import manual.queries.util.TestR2aQuerySpecification;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the manual.queries.testR2a pattern,
 * to be used in conjunction with {@link TestR2aMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TestR2aMatcher
 *  @see TestR2aProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TestR2aMatch extends BasePatternMatch {
  private AgentInstance fA;
  
  private String fAgentName;
  
  private String fSiteName;
  
  private static List<String> parameterNames = makeImmutableList("a", "agentName", "siteName");
  
  private TestR2aMatch(final AgentInstance pA, final String pAgentName, final String pSiteName) {
    this.fA = pA;
    this.fAgentName = pAgentName;
    this.fSiteName = pSiteName;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("a".equals(parameterName)) return this.fA;
    if ("agentName".equals(parameterName)) return this.fAgentName;
    if ("siteName".equals(parameterName)) return this.fSiteName;
    return null;
  }
  
  public AgentInstance getA() {
    return this.fA;
  }
  
  public String getAgentName() {
    return this.fAgentName;
  }
  
  public String getSiteName() {
    return this.fSiteName;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("a".equals(parameterName) ) {
        this.fA = (AgentInstance) newValue;
        return true;
    }
    if ("agentName".equals(parameterName) ) {
        this.fAgentName = (String) newValue;
        return true;
    }
    if ("siteName".equals(parameterName) ) {
        this.fSiteName = (String) newValue;
        return true;
    }
    return false;
  }
  
  public void setA(final AgentInstance pA) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fA = pA;
  }
  
  public void setAgentName(final String pAgentName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAgentName = pAgentName;
  }
  
  public void setSiteName(final String pSiteName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSiteName = pSiteName;
  }
  
  @Override
  public String patternName() {
    return "manual.queries.testR2a";
  }
  
  @Override
  public List<String> parameterNames() {
    return TestR2aMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fA, fAgentName, fSiteName};
  }
  
  @Override
  public TestR2aMatch toImmutable() {
    return isMutable() ? newMatch(fA, fAgentName, fSiteName) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"a\"=" + prettyPrintValue(fA) + ", ");
    result.append("\"agentName\"=" + prettyPrintValue(fAgentName) + ", ");
    result.append("\"siteName\"=" + prettyPrintValue(fSiteName));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(fA, fAgentName, fSiteName);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof TestR2aMatch)) {
        TestR2aMatch other = (TestR2aMatch) obj;
        return Objects.equals(fA, other.fA) && Objects.equals(fAgentName, other.fAgentName) && Objects.equals(fSiteName, other.fSiteName);
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
  public TestR2aQuerySpecification specification() {
    try {
        return TestR2aQuerySpecification.instance();
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
  public static TestR2aMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAgentName the fixed value of pattern parameter agentName, or null if not bound.
   * @param pSiteName the fixed value of pattern parameter siteName, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TestR2aMatch newMutableMatch(final AgentInstance pA, final String pAgentName, final String pSiteName) {
    return new Mutable(pA, pAgentName, pSiteName);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pAgentName the fixed value of pattern parameter agentName, or null if not bound.
   * @param pSiteName the fixed value of pattern parameter siteName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TestR2aMatch newMatch(final AgentInstance pA, final String pAgentName, final String pSiteName) {
    return new Immutable(pA, pAgentName, pSiteName);
  }
  
  private static final class Mutable extends TestR2aMatch {
    Mutable(final AgentInstance pA, final String pAgentName, final String pSiteName) {
      super(pA, pAgentName, pSiteName);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TestR2aMatch {
    Immutable(final AgentInstance pA, final String pAgentName, final String pSiteName) {
      super(pA, pAgentName, pSiteName);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
