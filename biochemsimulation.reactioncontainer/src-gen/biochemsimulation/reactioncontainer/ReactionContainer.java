/**
 */
package biochemsimulation.reactioncontainer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaction Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.ReactionContainer#getSimAgent <em>Sim Agent</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.ReactionContainer#getSimLinkStates <em>Sim Link States</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.ReactionContainer#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getReactionContainer()
 * @model
 * @generated
 */
public interface ReactionContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Sim Agent</b></em>' containment reference list.
	 * The list contents are of type {@link biochemsimulation.reactioncontainer.SimAgent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Agent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Agent</em>' containment reference list.
	 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getReactionContainer_SimAgent()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimAgent> getSimAgent();

	/**
	 * Returns the value of the '<em><b>Sim Link States</b></em>' containment reference list.
	 * The list contents are of type {@link biochemsimulation.reactioncontainer.SimLinkState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Link States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Link States</em>' containment reference list.
	 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getReactionContainer_SimLinkStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimLinkState> getSimLinkStates();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getReactionContainer_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.ReactionContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ReactionContainer
