/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator;

import biochemsimulation.reactioncontainer.SimBound;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import patterngenerator.util.Support_BoundStateQuerySpecification;

/**
 * Pattern-specific match representation of the patterngenerator.support_BoundState pattern,
 * to be used in conjunction with {@link Support_BoundStateMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Support_BoundStateMatcher
 *  @see Support_BoundStateProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Support_BoundStateMatch extends BasePatternMatch {
  private SimBound fLs;
  
  private static List<String> parameterNames = makeImmutableList("ls");
  
  private Support_BoundStateMatch(final SimBound pLs) {
    this.fLs = pLs;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("ls".equals(parameterName)) return this.fLs;
    return null;
  }
  
  public SimBound getLs() {
    return this.fLs;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("ls".equals(parameterName) ) {
        this.fLs = (SimBound) newValue;
        return true;
    }
    return false;
  }
  
  public void setLs(final SimBound pLs) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fLs = pLs;
  }
  
  @Override
  public String patternName() {
    return "patterngenerator.support_BoundState";
  }
  
  @Override
  public List<String> parameterNames() {
    return Support_BoundStateMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fLs};
  }
  
  @Override
  public Support_BoundStateMatch toImmutable() {
    return isMutable() ? newMatch(fLs) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"ls\"=" + prettyPrintValue(fLs));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(fLs);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof Support_BoundStateMatch)) {
        Support_BoundStateMatch other = (Support_BoundStateMatch) obj;
        return Objects.equals(fLs, other.fLs);
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
  public Support_BoundStateQuerySpecification specification() {
    try {
        return Support_BoundStateQuerySpecification.instance();
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
  public static Support_BoundStateMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pLs the fixed value of pattern parameter ls, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Support_BoundStateMatch newMutableMatch(final SimBound pLs) {
    return new Mutable(pLs);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pLs the fixed value of pattern parameter ls, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Support_BoundStateMatch newMatch(final SimBound pLs) {
    return new Immutable(pLs);
  }
  
  private static final class Mutable extends Support_BoundStateMatch {
    Mutable(final SimBound pLs) {
      super(pLs);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Support_BoundStateMatch {
    Immutable(final SimBound pLs) {
      super(pLs);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
