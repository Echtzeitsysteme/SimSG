/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.reactionRules;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.SitePattern#getSite <em>Site</em>}</li>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.SitePattern#getState <em>State</em>}</li>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.SitePattern#getLinkState <em>Link State</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getSitePattern()
 * @model
 * @generated
 */
public interface SitePattern extends EObject
{
  /**
   * Returns the value of the '<em><b>Site</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Site</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Site</em>' containment reference.
   * @see #setSite(Site)
   * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getSitePattern_Site()
   * @model containment="true"
   * @generated
   */
  Site getSite();

  /**
   * Sets the value of the '{@link biochemsimulation.reactionrules.reactionRules.SitePattern#getSite <em>Site</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Site</em>' containment reference.
   * @see #getSite()
   * @generated
   */
  void setSite(Site value);

  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference.
   * @see #setState(State)
   * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getSitePattern_State()
   * @model containment="true"
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link biochemsimulation.reactionrules.reactionRules.SitePattern#getState <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' containment reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

  /**
   * Returns the value of the '<em><b>Link State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link State</em>' containment reference.
   * @see #setLinkState(LinkState)
   * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getSitePattern_LinkState()
   * @model containment="true"
   * @generated
   */
  LinkState getLinkState();

  /**
   * Sets the value of the '{@link biochemsimulation.reactionrules.reactionRules.SitePattern#getLinkState <em>Link State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link State</em>' containment reference.
   * @see #getLinkState()
   * @generated
   */
  void setLinkState(LinkState value);

} // SitePattern
