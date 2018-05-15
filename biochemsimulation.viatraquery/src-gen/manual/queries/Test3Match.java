/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries;

import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import manual.queries.util.Test3QuerySpecification;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the manual.queries.test3 pattern,
 * to be used in conjunction with {@link Test3Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Test3Matcher
 *  @see Test3Processor
 * 
 */
@SuppressWarnings("all")
public abstract class Test3Match extends BasePatternMatch {
  private ReactionRuleModel fAll;
  
  private static List<String> parameterNames = makeImmutableList("all");
  
  private Test3Match(final ReactionRuleModel pAll) {
    this.fAll = pAll;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("all".equals(parameterName)) return this.fAll;
    return null;
  }
  
  public ReactionRuleModel getAll() {
    return this.fAll;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("all".equals(parameterName) ) {
        this.fAll = (ReactionRuleModel) newValue;
        return true;
    }
    return false;
  }
  
  public void setAll(final ReactionRuleModel pAll) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAll = pAll;
  }
  
  @Override
  public String patternName() {
    return "manual.queries.test3";
  }
  
  @Override
  public List<String> parameterNames() {
    return Test3Match.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fAll};
  }
  
  @Override
  public Test3Match toImmutable() {
    return isMutable() ? newMatch(fAll) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"all\"=" + prettyPrintValue(fAll));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(fAll);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof Test3Match)) {
        Test3Match other = (Test3Match) obj;
        return Objects.equals(fAll, other.fAll);
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
  public Test3QuerySpecification specification() {
    try {
        return Test3QuerySpecification.instance();
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
  public static Test3Match newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pAll the fixed value of pattern parameter all, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Test3Match newMutableMatch(final ReactionRuleModel pAll) {
    return new Mutable(pAll);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pAll the fixed value of pattern parameter all, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Test3Match newMatch(final ReactionRuleModel pAll) {
    return new Immutable(pAll);
  }
  
  private static final class Mutable extends Test3Match {
    Mutable(final ReactionRuleModel pAll) {
      super(pAll);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Test3Match {
    Immutable(final ReactionRuleModel pAll) {
      super(pAll);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
