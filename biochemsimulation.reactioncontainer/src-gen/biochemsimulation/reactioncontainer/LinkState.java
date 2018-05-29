/**
 */
package biochemsimulation.reactioncontainer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.LinkState#getSite1 <em>Site1</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getLinkState()
 * @model abstract="true"
 * @generated
 */
public interface LinkState extends EObject {

	/**
	 * Returns the value of the '<em><b>Site1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site1</em>' reference.
	 * @see #setSite1(Site)
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getLinkState_Site1()
	 * @model required="true"
	 * @generated
	 */
	Site getSite1();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.LinkState#getSite1 <em>Site1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site1</em>' reference.
	 * @see #getSite1()
	 * @generated
	 */
	void setSite1(Site value);

} // LinkState
