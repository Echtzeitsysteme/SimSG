/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.reactionRules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric From Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.NumericFromVariable#getValueVar <em>Value Var</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getNumericFromVariable()
 * @model
 * @generated
 */
public interface NumericFromVariable extends NumericAssignment
{
  /**
   * Returns the value of the '<em><b>Value Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Var</em>' reference.
   * @see #setValueVar(ArithmeticVariable)
   * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getNumericFromVariable_ValueVar()
   * @model
   * @generated
   */
  ArithmeticVariable getValueVar();

  /**
   * Sets the value of the '{@link biochemsimulation.reactionrules.reactionRules.NumericFromVariable#getValueVar <em>Value Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Var</em>' reference.
   * @see #getValueVar()
   * @generated
   */
  void setValueVar(ArithmeticVariable value);

} // NumericFromVariable