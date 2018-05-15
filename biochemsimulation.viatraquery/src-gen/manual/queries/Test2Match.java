/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries;

import biochemsimulation.reactionrules.reactionRules.Model;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import manual.queries.util.Test2QuerySpecification;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the manual.queries.test2 pattern,
 * to be used in conjunction with {@link Test2Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Test2Matcher
 *  @see Test2Processor
 * 
 */
@SuppressWarnings("all")
public abstract class Test2Match extends BasePatternMatch {
  private Model fModel;
  
  private static List<String> parameterNames = makeImmutableList("model");
  
  private Test2Match(final Model pModel) {
    this.fModel = pModel;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("model".equals(parameterName)) return this.fModel;
    return null;
  }
  
  public Model getModel() {
    return this.fModel;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("model".equals(parameterName) ) {
        this.fModel = (Model) newValue;
        return true;
    }
    return false;
  }
  
  public void setModel(final Model pModel) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fModel = pModel;
  }
  
  @Override
  public String patternName() {
    return "manual.queries.test2";
  }
  
  @Override
  public List<String> parameterNames() {
    return Test2Match.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fModel};
  }
  
  @Override
  public Test2Match toImmutable() {
    return isMutable() ? newMatch(fModel) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"model\"=" + prettyPrintValue(fModel));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(fModel);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof Test2Match)) {
        Test2Match other = (Test2Match) obj;
        return Objects.equals(fModel, other.fModel);
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
  public Test2QuerySpecification specification() {
    try {
        return Test2QuerySpecification.instance();
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
  public static Test2Match newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pModel the fixed value of pattern parameter model, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Test2Match newMutableMatch(final Model pModel) {
    return new Mutable(pModel);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pModel the fixed value of pattern parameter model, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Test2Match newMatch(final Model pModel) {
    return new Immutable(pModel);
  }
  
  private static final class Mutable extends Test2Match {
    Mutable(final Model pModel) {
      super(pModel);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Test2Match {
    Immutable(final Model pModel) {
      super(pModel);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
