/**
 */
package biochemsimulation.reactioncontainer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.Site#getType <em>Type</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.Site#getLinkstate <em>Linkstate</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.Site#getSitestate <em>Sitestate</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.Site#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getSite()
 * @model
 * @generated
 */
public interface Site extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getSite_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.Site#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Linkstate</b></em>' containment reference list.
	 * The list contents are of type {@link biochemsimulation.reactioncontainer.LinkState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linkstate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkstate</em>' containment reference list.
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getSite_Linkstate()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkState> getLinkstate();

	/**
	 * Returns the value of the '<em><b>Sitestate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sitestate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sitestate</em>' reference.
	 * @see #setSitestate(SiteState)
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getSite_Sitestate()
	 * @model
	 * @generated
	 */
	SiteState getSitestate();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.Site#getSitestate <em>Sitestate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sitestate</em>' reference.
	 * @see #getSitestate()
	 * @generated
	 */
	void setSitestate(SiteState value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference.
	 * @see #setAgent(Agent)
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getSite_Agent()
	 * @model required="true"
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.Site#getAgent <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

} // Site
