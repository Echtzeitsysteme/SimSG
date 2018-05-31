/**
 */
package biochemsimulation.reactioncontainer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sim Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.SimAgent#getName <em>Name</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.SimAgent#getType <em>Type</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.SimAgent#getSimSite <em>Sim Site</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getSimAgent()
 * @model
 * @generated
 */
public interface SimAgent extends EObject {
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
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getSimAgent_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.SimAgent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getSimAgent_Type()
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
	 * Returns the value of the '<em><b>Sim Site</b></em>' containment reference list.
	 * The list contents are of type {@link biochemsimulation.reactioncontainer.SimSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Site</em>' containment reference list.
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getSimAgent_SimSite()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimSite> getSimSite();

} // SimAgent
