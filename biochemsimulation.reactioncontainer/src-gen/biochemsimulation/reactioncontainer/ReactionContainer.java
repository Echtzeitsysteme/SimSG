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
 * </ul>
 *
 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getReactionContainer()
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
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getReactionContainer_SimAgent()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimAgent> getSimAgent();

	/**
	 * Returns the value of the '<em><b>Sim Link States</b></em>' containment reference list.
	 * The list contents are of type {@link biochemsimulation.reactioncontainer.SimLinkState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Link States</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Link States</em>' containment reference list.
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getReactionContainer_SimLinkStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimLinkState> getSimLinkStates();

} // ReactionContainer
