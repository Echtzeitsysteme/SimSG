/**
 * Generated from platform:/resource/biochemsimulation.viatrapatterns/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator;

import biochemsimulation.reactioncontainer.SimAgent;
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
  private SimAgent fA;
  
  private SimAgent fB;
  
  private static List<String> parameterNames = makeImmutableList("A", "B");
  
  private AtoB_lhsMatch(final SimAgent pA, final SimAgent pB) {
    this.fA = pA;
    this.fB = pB;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("A".equals(parameterName)) return this.fA;
    if ("B".equals(parameterName)) return this.fB;
    return null;
  }
  
  public SimAgent getA() {
    return this.fA;
  }
  
  public SimAgent getB() {
    return this.fB;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("A".equals(parameterName) ) {
        this.fA = (SimAgent) newValue;
        return true;
    }
    if ("B".equals(parameterName) ) {
        this.fB = (SimAgent) newValue;
        return true;
    }
    return false;
  }
  
  public void setA(final SimAgent pA) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fA = pA;
  }
  
  public void setB(final SimAgent pB) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fB = pB;
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
    return new Object[]{fA, fB};
  }
  
  @Override
  public AtoB_lhsMatch toImmutable() {
    return isMutable() ? newMatch(fA, fB) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"A\"=" + prettyPrintValue(fA) + ", ");
    result.append("\"B\"=" + prettyPrintValue(fB));
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
    if ((obj instanceof AtoB_lhsMatch)) {
        AtoB_lhsMatch other = (AtoB_lhsMatch) obj;
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
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AtoB_lhsMatch newMutableMatch(final SimAgent pA, final SimAgent pB) {
    return new Mutable(pA, pB);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AtoB_lhsMatch newMatch(final SimAgent pA, final SimAgent pB) {
    return new Immutable(pA, pB);
  }
  
  private static final class Mutable extends AtoB_lhsMatch {
    Mutable(final SimAgent pA, final SimAgent pB) {
      super(pA, pB);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AtoB_lhsMatch {
    Immutable(final SimAgent pA, final SimAgent pB) {
      super(pA, pB);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
