/**
 */
package biochemsimulation.reactioncontainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sim Bound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.SimBound#getSimSite2 <em>Sim Site2</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getSimBound()
 * @model
 * @generated
 */
public interface SimBound extends SimLinkState {
	/**
	 * Returns the value of the '<em><b>Sim Site2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Site2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Site2</em>' reference.
	 * @see #setSimSite2(SimSite)
	 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage#getSimBound_SimSite2()
	 * @model required="true"
	 * @generated
	 */
	SimSite getSimSite2();

	/**
	 * Sets the value of the '{@link biochemsimulation.reactioncontainer.SimBound#getSimSite2 <em>Sim Site2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sim Site2</em>' reference.
	 * @see #getSimSite2()
	 * @generated
	 */
	void setSimSite2(SimSite value);

} // SimBound
