/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import manual.queries.util.Test1QuerySpecification;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the manual.queries.test1 pattern,
 * to be used in conjunction with {@link Test1Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Test1Matcher
 *  @see Test1Processor
 * 
 */
@SuppressWarnings("all")
public abstract class Test1Match extends BasePatternMatch {
  private AgentInstance fAgentI;
  
  private static List<String> parameterNames = makeImmutableList("agentI");
  
  private Test1Match(final AgentInstance pAgentI) {
    this.fAgentI = pAgentI;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("agentI".equals(parameterName)) return this.fAgentI;
    return null;
  }
  
  public AgentInstance getAgentI() {
    return this.fAgentI;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("agentI".equals(parameterName) ) {
        this.fAgentI = (AgentInstance) newValue;
        return true;
    }
    return false;
  }
  
  public void setAgentI(final AgentInstance pAgentI) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAgentI = pAgentI;
  }
  
  @Override
  public String patternName() {
    return "manual.queries.test1";
  }
  
  @Override
  public List<String> parameterNames() {
    return Test1Match.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fAgentI};
  }
  
  @Override
  public Test1Match toImmutable() {
    return isMutable() ? newMatch(fAgentI) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"agentI\"=" + prettyPrintValue(fAgentI));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(fAgentI);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof Test1Match)) {
        Test1Match other = (Test1Match) obj;
        return Objects.equals(fAgentI, other.fAgentI);
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
  public Test1QuerySpecification specification() {
    try {
        return Test1QuerySpecification.instance();
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
  public static Test1Match newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pAgentI the fixed value of pattern parameter agentI, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Test1Match newMutableMatch(final AgentInstance pAgentI) {
    return new Mutable(pAgentI);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pAgentI the fixed value of pattern parameter agentI, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Test1Match newMatch(final AgentInstance pAgentI) {
    return new Immutable(pAgentI);
  }
  
  private static final class Mutable extends Test1Match {
    Mutable(final AgentInstance pAgentI) {
      super(pAgentI);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Test1Match {
    Immutable(final AgentInstance pAgentI) {
      super(pAgentI);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
