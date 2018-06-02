/**
 * Generated from platform:/resource/biochemsimulation.viatrapatterns/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator;

import biochemsimulation.reactioncontainer.SimSite;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import patterngenerator.util.Support_SimLinkStateQuerySpecification;

/**
 * Pattern-specific match representation of the patterngenerator.support_SimLinkState pattern,
 * to be used in conjunction with {@link Support_SimLinkStateMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Support_SimLinkStateMatcher
 *  @see Support_SimLinkStateProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Support_SimLinkStateMatch extends BasePatternMatch {
  private SimSite fSs;
  
  private static List<String> parameterNames = makeImmutableList("ss");
  
  private Support_SimLinkStateMatch(final SimSite pSs) {
    this.fSs = pSs;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("ss".equals(parameterName)) return this.fSs;
    return null;
  }
  
  public SimSite getSs() {
    return this.fSs;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("ss".equals(parameterName) ) {
        this.fSs = (SimSite) newValue;
        return true;
    }
    return false;
  }
  
  public void setSs(final SimSite pSs) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSs = pSs;
  }
  
  @Override
  public String patternName() {
    return "patterngenerator.support_SimLinkState";
  }
  
  @Override
  public List<String> parameterNames() {
    return Support_SimLinkStateMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSs};
  }
  
  @Override
  public Support_SimLinkStateMatch toImmutable() {
    return isMutable() ? newMatch(fSs) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"ss\"=" + prettyPrintValue(fSs));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(fSs);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof Support_SimLinkStateMatch)) {
        Support_SimLinkStateMatch other = (Support_SimLinkStateMatch) obj;
        return Objects.equals(fSs, other.fSs);
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
  public Support_SimLinkStateQuerySpecification specification() {
    try {
        return Support_SimLinkStateQuerySpecification.instance();
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
  public static Support_SimLinkStateMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSs the fixed value of pattern parameter ss, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Support_SimLinkStateMatch newMutableMatch(final SimSite pSs) {
    return new Mutable(pSs);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSs the fixed value of pattern parameter ss, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Support_SimLinkStateMatch newMatch(final SimSite pSs) {
    return new Immutable(pSs);
  }
  
  private static final class Mutable extends Support_SimLinkStateMatch {
    Mutable(final SimSite pSs) {
      super(pSs);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Support_SimLinkStateMatch {
    Immutable(final SimSite pSs) {
      super(pSs);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
