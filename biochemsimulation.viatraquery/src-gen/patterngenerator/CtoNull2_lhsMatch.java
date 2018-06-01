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
import patterngenerator.util.CtoNull2_lhsQuerySpecification;

/**
 * Pattern-specific match representation of the patterngenerator.CtoNull2_lhs pattern,
 * to be used in conjunction with {@link CtoNull2_lhsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CtoNull2_lhsMatcher
 *  @see CtoNull2_lhsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CtoNull2_lhsMatch extends BasePatternMatch {
  private SimAgent fC;
  
  private static List<String> parameterNames = makeImmutableList("C");
  
  private CtoNull2_lhsMatch(final SimAgent pC) {
    this.fC = pC;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("C".equals(parameterName)) return this.fC;
    return null;
  }
  
  public SimAgent getC() {
    return this.fC;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("C".equals(parameterName) ) {
        this.fC = (SimAgent) newValue;
        return true;
    }
    return false;
  }
  
  public void setC(final SimAgent pC) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fC = pC;
  }
  
  @Override
  public String patternName() {
    return "patterngenerator.CtoNull2_lhs";
  }
  
  @Override
  public List<String> parameterNames() {
    return CtoNull2_lhsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fC};
  }
  
  @Override
  public CtoNull2_lhsMatch toImmutable() {
    return isMutable() ? newMatch(fC) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"C\"=" + prettyPrintValue(fC));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(fC);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof CtoNull2_lhsMatch)) {
        CtoNull2_lhsMatch other = (CtoNull2_lhsMatch) obj;
        return Objects.equals(fC, other.fC);
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
  public CtoNull2_lhsQuerySpecification specification() {
    try {
        return CtoNull2_lhsQuerySpecification.instance();
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
  public static CtoNull2_lhsMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CtoNull2_lhsMatch newMutableMatch(final SimAgent pC) {
    return new Mutable(pC);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CtoNull2_lhsMatch newMatch(final SimAgent pC) {
    return new Immutable(pC);
  }
  
  private static final class Mutable extends CtoNull2_lhsMatch {
    Mutable(final SimAgent pC) {
      super(pC);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CtoNull2_lhsMatch {
    Immutable(final SimAgent pC) {
      super(pC);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
