/**
 */
package biochemsimulation.reactioncontainer;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.Container#getAgents <em>Agents</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.Container#getModelName <em>Model Name</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.Container#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getContainer()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface Container extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link biochemsimulation.reactioncontainer.Agent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getContainer_Agents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgents();

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getContainer_ModelName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.Container#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link biochemsimulation.reactioncontainer.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getContainer_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

} // Container
