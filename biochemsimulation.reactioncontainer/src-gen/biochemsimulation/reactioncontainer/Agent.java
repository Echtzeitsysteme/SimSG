/**
 */
package biochemsimulation.reactioncontainer;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.Agent#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getAgent()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface Agent extends PersistentEObject {

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(long)
	 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getAgent_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 * @generated
	 */
	long getID();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.Agent#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(long value);

} // Agent
