/**
 */
package biochemsimulation.reactioncontainer;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.Agent#getState <em>State</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getAgent()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface Agent extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference list.
	 * The list contents are of type {@link biochemsimulation.reactioncontainer.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference list.
	 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getAgent_State()
	 * @model
	 * @generated
	 */
	EList<State> getState();

} // Agent
