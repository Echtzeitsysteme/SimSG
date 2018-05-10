/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.reactionRules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.PatternAssignment#getPattern <em>Pattern</em>}</li>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.PatternAssignment#getPatternVar <em>Pattern Var</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getPatternAssignment()
 * @model
 * @generated
 */
public interface PatternAssignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference list.
   * The list contents are of type {@link biochemsimulation.reactionrules.reactionRules.Pattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference list.
   * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getPatternAssignment_Pattern()
   * @model containment="true"
   * @generated
   */
  EList<Pattern> getPattern();

  /**
   * Returns the value of the '<em><b>Pattern Var</b></em>' reference list.
   * The list contents are of type {@link biochemsimulation.reactionrules.reactionRules.PatternVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern Var</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern Var</em>' reference list.
   * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getPatternAssignment_PatternVar()
   * @model
   * @generated
   */
  EList<PatternVariable> getPatternVar();

} // PatternAssignment
