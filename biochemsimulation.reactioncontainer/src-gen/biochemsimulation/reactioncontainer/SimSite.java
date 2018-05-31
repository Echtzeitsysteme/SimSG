/**
 */
package biochemsimulation.reactioncontainer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sim Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.SimSite#getType <em>Type</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.SimSite#getSimLinkstate <em>Sim Linkstate</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.SimSite#getSimSiteState <em>Sim Site State</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.SimSite#getSimAgent <em>Sim Agent</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getSimSite()
 * @model
 * @generated
 */
public interface SimSite extends EObject {
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
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getSimSite_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.SimSite#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Sim Linkstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Linkstate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Linkstate</em>' containment reference.
	 * @see #setSimLinkstate(SimLinkState)
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getSimSite_SimLinkstate()
	 * @model containment="true"
	 * @generated
	 */
	SimLinkState getSimLinkstate();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.SimSite#getSimLinkstate <em>Sim Linkstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sim Linkstate</em>' containment reference.
	 * @see #getSimLinkstate()
	 * @generated
	 */
	void setSimLinkstate(SimLinkState value);

	/**
	 * Returns the value of the '<em><b>Sim Site State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Site State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Site State</em>' containment reference.
	 * @see #setSimSiteState(SimSiteState)
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getSimSite_SimSiteState()
	 * @model containment="true"
	 * @generated
	 */
	SimSiteState getSimSiteState();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.SimSite#getSimSiteState <em>Sim Site State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sim Site State</em>' containment reference.
	 * @see #getSimSiteState()
	 * @generated
	 */
	void setSimSiteState(SimSiteState value);

	/**
	 * Returns the value of the '<em><b>Sim Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Agent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Agent</em>' reference.
	 * @see #setSimAgent(SimAgent)
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getSimSite_SimAgent()
	 * @model required="true"
	 * @generated
	 */
	SimAgent getSimAgent();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.SimSite#getSimAgent <em>Sim Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sim Agent</em>' reference.
	 * @see #getSimAgent()
	 * @generated
	 */
	void setSimAgent(SimAgent value);

} // SimSite
