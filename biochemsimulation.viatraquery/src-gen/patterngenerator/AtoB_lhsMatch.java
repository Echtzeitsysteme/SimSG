/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import patterngenerator.util.AtoB_lhsQuerySpecification;

/**
 * Pattern-specific match representation of the patterngenerator.AtoB_lhs pattern,
 * to be used in conjunction with {@link AtoB_lhsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AtoB_lhsMatcher
 *  @see AtoB_lhsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AtoB_lhsMatch extends BasePatternMatch {
  private AgentInstance fA;
  
  private String fAgent_A_Name;
  
  private AgentInstanceLinkState fA_xILS;
  
  private String fA_x_ILS_name;
  
  private FreeLink fA_x_ILS_state;
  
  private AgentInstance fB;
  
  private String fAgent_B_Name;
  
  private AgentInstanceLinkState fB_xILS;
  
  private String fB_x_ILS_name;
  
  private FreeLink fB_x_ILS_state;
  
  private static List<String> parameterNames = makeImmutableList("A", "Agent_A_Name", "A_xILS", "A_x_ILS_name", "A_x_ILS_state", "B", "Agent_B_Name", "B_xILS", "B_x_ILS_name", "B_x_ILS_state");
  
  private AtoB_lhsMatch(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    this.fA = pA;
    this.fAgent_A_Name = pAgent_A_Name;
    this.fA_xILS = pA_xILS;
    this.fA_x_ILS_name = pA_x_ILS_name;
    this.fA_x_ILS_state = pA_x_ILS_state;
    this.fB = pB;
    this.fAgent_B_Name = pAgent_B_Name;
    this.fB_xILS = pB_xILS;
    this.fB_x_ILS_name = pB_x_ILS_name;
    this.fB_x_ILS_state = pB_x_ILS_state;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("A".equals(parameterName)) return this.fA;
    if ("Agent_A_Name".equals(parameterName)) return this.fAgent_A_Name;
    if ("A_xILS".equals(parameterName)) return this.fA_xILS;
    if ("A_x_ILS_name".equals(parameterName)) return this.fA_x_ILS_name;
    if ("A_x_ILS_state".equals(parameterName)) return this.fA_x_ILS_state;
    if ("B".equals(parameterName)) return this.fB;
    if ("Agent_B_Name".equals(parameterName)) return this.fAgent_B_Name;
    if ("B_xILS".equals(parameterName)) return this.fB_xILS;
    if ("B_x_ILS_name".equals(parameterName)) return this.fB_x_ILS_name;
    if ("B_x_ILS_state".equals(parameterName)) return this.fB_x_ILS_state;
    return null;
  }
  
  public AgentInstance getA() {
    return this.fA;
  }
  
  public String getAgent_A_Name() {
    return this.fAgent_A_Name;
  }
  
  public AgentInstanceLinkState getA_xILS() {
    return this.fA_xILS;
  }
  
  public String getA_x_ILS_name() {
    return this.fA_x_ILS_name;
  }
  
  public FreeLink getA_x_ILS_state() {
    return this.fA_x_ILS_state;
  }
  
  public AgentInstance getB() {
    return this.fB;
  }
  
  public String getAgent_B_Name() {
    return this.fAgent_B_Name;
  }
  
  public AgentInstanceLinkState getB_xILS() {
    return this.fB_xILS;
  }
  
  public String getB_x_ILS_name() {
    return this.fB_x_ILS_name;
  }
  
  public FreeLink getB_x_ILS_state() {
    return this.fB_x_ILS_state;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("A".equals(parameterName) ) {
        this.fA = (AgentInstance) newValue;
        return true;
    }
    if ("Agent_A_Name".equals(parameterName) ) {
        this.fAgent_A_Name = (String) newValue;
        return true;
    }
    if ("A_xILS".equals(parameterName) ) {
        this.fA_xILS = (AgentInstanceLinkState) newValue;
        return true;
    }
    if ("A_x_ILS_name".equals(parameterName) ) {
        this.fA_x_ILS_name = (String) newValue;
        return true;
    }
    if ("A_x_ILS_state".equals(parameterName) ) {
        this.fA_x_ILS_state = (FreeLink) newValue;
        return true;
    }
    if ("B".equals(parameterName) ) {
        this.fB = (AgentInstance) newValue;
        return true;
    }
    if ("Agent_B_Name".equals(parameterName) ) {
        this.fAgent_B_Name = (String) newValue;
        return true;
    }
    if ("B_xILS".equals(parameterName) ) {
        this.fB_xILS = (AgentInstanceLinkState) newValue;
        return true;
    }
    if ("B_x_ILS_name".equals(parameterName) ) {
        this.fB_x_ILS_name = (String) newValue;
        return true;
    }
    if ("B_x_ILS_state".equals(parameterName) ) {
        this.fB_x_ILS_state = (FreeLink) newValue;
        return true;
    }
    return false;
  }
  
  public void setA(final AgentInstance pA) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fA = pA;
  }
  
  public void setAgent_A_Name(final String pAgent_A_Name) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAgent_A_Name = pAgent_A_Name;
  }
  
  public void setA_xILS(final AgentInstanceLinkState pA_xILS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fA_xILS = pA_xILS;
  }
  
  public void setA_x_ILS_name(final String pA_x_ILS_name) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fA_x_ILS_name = pA_x_ILS_name;
  }
  
  public void setA_x_ILS_state(final FreeLink pA_x_ILS_state) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fA_x_ILS_state = pA_x_ILS_state;
  }
  
  public void setB(final AgentInstance pB) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fB = pB;
  }
  
  public void setAgent_B_Name(final String pAgent_B_Name) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAgent_B_Name = pAgent_B_Name;
  }
  
  public void setB_xILS(final AgentInstanceLinkState pB_xILS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fB_xILS = pB_xILS;
  }
  
  public void setB_x_ILS_name(final String pB_x_ILS_name) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fB_x_ILS_name = pB_x_ILS_name;
  }
  
  public void setB_x_ILS_state(final FreeLink pB_x_ILS_state) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fB_x_ILS_state = pB_x_ILS_state;
  }
  
  @Override
  public String patternName() {
    return "patterngenerator.AtoB_lhs";
  }
  
  @Override
  public List<String> parameterNames() {
    return AtoB_lhsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fA, fAgent_A_Name, fA_xILS, fA_x_ILS_name, fA_x_ILS_state, fB, fAgent_B_Name, fB_xILS, fB_x_ILS_name, fB_x_ILS_state};
  }
  
  @Override
  public AtoB_lhsMatch toImmutable() {
    return isMutable() ? newMatch(fA, fAgent_A_Name, fA_xILS, fA_x_ILS_name, fA_x_ILS_state, fB, fAgent_B_Name, fB_xILS, fB_x_ILS_name, fB_x_ILS_state) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"A\"=" + prettyPrintValue(fA) + ", ");
    result.append("\"Agent_A_Name\"=" + prettyPrintValue(fAgent_A_Name) + ", ");
    result.append("\"A_xILS\"=" + prettyPrintValue(fA_xILS) + ", ");
    result.append("\"A_x_ILS_name\"=" + prettyPrintValue(fA_x_ILS_name) + ", ");
    result.append("\"A_x_ILS_state\"=" + prettyPrintValue(fA_x_ILS_state) + ", ");
    result.append("\"B\"=" + prettyPrintValue(fB) + ", ");
    result.append("\"Agent_B_Name\"=" + prettyPrintValue(fAgent_B_Name) + ", ");
    result.append("\"B_xILS\"=" + prettyPrintValue(fB_xILS) + ", ");
    result.append("\"B_x_ILS_name\"=" + prettyPrintValue(fB_x_ILS_name) + ", ");
    result.append("\"B_x_ILS_state\"=" + prettyPrintValue(fB_x_ILS_state));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(fA, fAgent_A_Name, fA_xILS, fA_x_ILS_name, fA_x_ILS_state, fB, fAgent_B_Name, fB_xILS, fB_x_ILS_name, fB_x_ILS_state);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof AtoB_lhsMatch)) {
        AtoB_lhsMatch other = (AtoB_lhsMatch) obj;
        return Objects.equals(fA, other.fA) && Objects.equals(fAgent_A_Name, other.fAgent_A_Name) && Objects.equals(fA_xILS, other.fA_xILS) && Objects.equals(fA_x_ILS_name, other.fA_x_ILS_name) && Objects.equals(fA_x_ILS_state, other.fA_x_ILS_state) && Objects.equals(fB, other.fB) && Objects.equals(fAgent_B_Name, other.fAgent_B_Name) && Objects.equals(fB_xILS, other.fB_xILS) && Objects.equals(fB_x_ILS_name, other.fB_x_ILS_name) && Objects.equals(fB_x_ILS_state, other.fB_x_ILS_state);
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
  public AtoB_lhsQuerySpecification specification() {
    try {
        return AtoB_lhsQuerySpecification.instance();
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
  public static AtoB_lhsMatch newEmptyMatch() {
    return new Mutable(null, null, null, null, null, null, null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pAgent_A_Name the fixed value of pattern parameter Agent_A_Name, or null if not bound.
   * @param pA_xILS the fixed value of pattern parameter A_xILS, or null if not bound.
   * @param pA_x_ILS_name the fixed value of pattern parameter A_x_ILS_name, or null if not bound.
   * @param pA_x_ILS_state the fixed value of pattern parameter A_x_ILS_state, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @param pAgent_B_Name the fixed value of pattern parameter Agent_B_Name, or null if not bound.
   * @param pB_xILS the fixed value of pattern parameter B_xILS, or null if not bound.
   * @param pB_x_ILS_name the fixed value of pattern parameter B_x_ILS_name, or null if not bound.
   * @param pB_x_ILS_state the fixed value of pattern parameter B_x_ILS_state, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AtoB_lhsMatch newMutableMatch(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    return new Mutable(pA, pAgent_A_Name, pA_xILS, pA_x_ILS_name, pA_x_ILS_state, pB, pAgent_B_Name, pB_xILS, pB_x_ILS_name, pB_x_ILS_state);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pAgent_A_Name the fixed value of pattern parameter Agent_A_Name, or null if not bound.
   * @param pA_xILS the fixed value of pattern parameter A_xILS, or null if not bound.
   * @param pA_x_ILS_name the fixed value of pattern parameter A_x_ILS_name, or null if not bound.
   * @param pA_x_ILS_state the fixed value of pattern parameter A_x_ILS_state, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @param pAgent_B_Name the fixed value of pattern parameter Agent_B_Name, or null if not bound.
   * @param pB_xILS the fixed value of pattern parameter B_xILS, or null if not bound.
   * @param pB_x_ILS_name the fixed value of pattern parameter B_x_ILS_name, or null if not bound.
   * @param pB_x_ILS_state the fixed value of pattern parameter B_x_ILS_state, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AtoB_lhsMatch newMatch(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
    return new Immutable(pA, pAgent_A_Name, pA_xILS, pA_x_ILS_name, pA_x_ILS_state, pB, pAgent_B_Name, pB_xILS, pB_x_ILS_name, pB_x_ILS_state);
  }
  
  private static final class Mutable extends AtoB_lhsMatch {
    Mutable(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
      super(pA, pAgent_A_Name, pA_xILS, pA_x_ILS_name, pA_x_ILS_state, pB, pAgent_B_Name, pB_xILS, pB_x_ILS_name, pB_x_ILS_state);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AtoB_lhsMatch {
    Immutable(final AgentInstance pA, final String pAgent_A_Name, final AgentInstanceLinkState pA_xILS, final String pA_x_ILS_name, final FreeLink pA_x_ILS_state, final AgentInstance pB, final String pAgent_B_Name, final AgentInstanceLinkState pB_xILS, final String pB_x_ILS_name, final FreeLink pB_x_ILS_state) {
      super(pA, pAgent_A_Name, pA_xILS, pA_x_ILS_name, pA_x_ILS_state, pB, pAgent_B_Name, pB_xILS, pB_x_ILS_name, pB_x_ILS_state);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
