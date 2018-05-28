/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import patterngenerator.util.Bla_lhsQuerySpecification;

/**
 * Pattern-specific match representation of the patterngenerator.bla_lhs pattern,
 * to be used in conjunction with {@link Bla_lhsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Bla_lhsMatcher
 *  @see Bla_lhsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Bla_lhsMatch extends BasePatternMatch {
  private AgentInstance fA;
  
  private static List<String> parameterNames = makeImmutableList("A");
  
  private Bla_lhsMatch(final AgentInstance pA) {
    this.fA = pA;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("A".equals(parameterName)) return this.fA;
    return null;
  }
  
  public AgentInstance getA() {
    return this.fA;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("A".equals(parameterName) ) {
        this.fA = (AgentInstance) newValue;
        return true;
    }
    return false;
  }
  
  public void setA(final AgentInstance pA) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fA = pA;
  }
  
  @Override
  public String patternName() {
    return "patterngenerator.bla_lhs";
  }
  
  @Override
  public List<String> parameterNames() {
    return Bla_lhsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fA};
  }
  
  @Override
  public Bla_lhsMatch toImmutable() {
    return isMutable() ? newMatch(fA) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"A\"=" + prettyPrintValue(fA));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(fA);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof Bla_lhsMatch)) {
        Bla_lhsMatch other = (Bla_lhsMatch) obj;
        return Objects.equals(fA, other.fA);
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
  public Bla_lhsQuerySpecification specification() {
    try {
        return Bla_lhsQuerySpecification.instance();
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
  public static Bla_lhsMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Bla_lhsMatch newMutableMatch(final AgentInstance pA) {
    return new Mutable(pA);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Bla_lhsMatch newMatch(final AgentInstance pA) {
    return new Immutable(pA);
  }
  
  private static final class Mutable extends Bla_lhsMatch {
    Mutable(final AgentInstance pA) {
      super(pA);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Bla_lhsMatch {
    Immutable(final AgentInstance pA) {
      super(pA);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
