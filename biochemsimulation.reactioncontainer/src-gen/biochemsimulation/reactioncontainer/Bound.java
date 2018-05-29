/**
 */
package biochemsimulation.reactioncontainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.Bound#getSite2 <em>Site2</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getBound()
 * @model
 * @generated
 */
public interface Bound extends LinkState {

	/**
	 * Returns the value of the '<em><b>Site2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site2</em>' reference.
	 * @see #setSite2(Site)
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#getBound_Site2()
	 * @model required="true"
	 * @generated
	 */
	Site getSite2();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.Bound#getSite2 <em>Site2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site2</em>' reference.
	 * @see #getSite2()
	 * @generated
	 */
	void setSite2(Site value);
} // Bound
