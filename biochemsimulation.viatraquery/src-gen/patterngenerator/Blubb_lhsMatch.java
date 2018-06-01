/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator;

import biochemsimulation.reactioncontainer.SimAgent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import patterngenerator.util.Blubb_lhsQuerySpecification;

/**
 * Pattern-specific match representation of the patterngenerator.blubb_lhs pattern,
 * to be used in conjunction with {@link Blubb_lhsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Blubb_lhsMatcher
 *  @see Blubb_lhsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Blubb_lhsMatch extends BasePatternMatch {
  private SimAgent fD;
  
  private SimAgent fD1;
  
  private static List<String> parameterNames = makeImmutableList("D", "D1");
  
  private Blubb_lhsMatch(final SimAgent pD, final SimAgent pD1) {
    this.fD = pD;
    this.fD1 = pD1;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("D".equals(parameterName)) return this.fD;
    if ("D1".equals(parameterName)) return this.fD1;
    return null;
  }
  
  public SimAgent getD() {
    return this.fD;
  }
  
  public SimAgent getD1() {
    return this.fD1;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("D".equals(parameterName) ) {
        this.fD = (SimAgent) newValue;
        return true;
    }
    if ("D1".equals(parameterName) ) {
        this.fD1 = (SimAgent) newValue;
        return true;
    }
    return false;
  }
  
  public void setD(final SimAgent pD) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fD = pD;
  }
  
  public void setD1(final SimAgent pD1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fD1 = pD1;
  }
  
  @Override
  public String patternName() {
    return "patterngenerator.blubb_lhs";
  }
  
  @Override
  public List<String> parameterNames() {
    return Blubb_lhsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fD, fD1};
  }
  
  @Override
  public Blubb_lhsMatch toImmutable() {
    return isMutable() ? newMatch(fD, fD1) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"D\"=" + prettyPrintValue(fD) + ", ");
    result.append("\"D1\"=" + prettyPrintValue(fD1));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(fD, fD1);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof Blubb_lhsMatch)) {
        Blubb_lhsMatch other = (Blubb_lhsMatch) obj;
        return Objects.equals(fD, other.fD) && Objects.equals(fD1, other.fD1);
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
  public Blubb_lhsQuerySpecification specification() {
    try {
        return Blubb_lhsQuerySpecification.instance();
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
  public static Blubb_lhsMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pD the fixed value of pattern parameter D, or null if not bound.
   * @param pD1 the fixed value of pattern parameter D1, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Blubb_lhsMatch newMutableMatch(final SimAgent pD, final SimAgent pD1) {
    return new Mutable(pD, pD1);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pD the fixed value of pattern parameter D, or null if not bound.
   * @param pD1 the fixed value of pattern parameter D1, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Blubb_lhsMatch newMatch(final SimAgent pD, final SimAgent pD1) {
    return new Immutable(pD, pD1);
  }
  
  private static final class Mutable extends Blubb_lhsMatch {
    Mutable(final SimAgent pD, final SimAgent pD1) {
      super(pD, pD1);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Blubb_lhsMatch {
    Immutable(final SimAgent pD, final SimAgent pD1) {
      super(pD, pD1);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
