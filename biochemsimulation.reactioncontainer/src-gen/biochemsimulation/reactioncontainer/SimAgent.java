/**
 */
package biochemsimulation.reactioncontainer;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sim Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.SimAgent#getType <em>Type</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.SimAgent#getSimSites <em>Sim Sites</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getSimAgent()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface SimAgent extends PersistentEObject {
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
	 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getSimAgent_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.SimAgent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Sim Sites</b></em>' containment reference list.
	 * The list contents are of type {@link biochemsimulation.reactioncontainer.SimSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Sites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Sites</em>' containment reference list.
	 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getSimAgent_SimSites()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimSite> getSimSites();

} // SimAgent
