/**
 */
package biochemsimulation.reactioncontainer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sim Link State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.SimLinkState#getSimSite1 <em>Sim Site1</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getSimLinkState()
 * @model abstract="true"
 * @generated
 */
public interface SimLinkState extends EObject {
	/**
	 * Returns the value of the '<em><b>Sim Site1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Site1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Site1</em>' reference.
	 * @see #setSimSite1(SimSite)
	 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getSimLinkState_SimSite1()
	 * @model required="true"
	 * @generated
	 */
	SimSite getSimSite1();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.SimLinkState#getSimSite1 <em>Sim Site1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sim Site1</em>' reference.
	 * @see #getSimSite1()
	 * @generated
	 */
	void setSimSite1(SimSite value);

} // SimLinkState
