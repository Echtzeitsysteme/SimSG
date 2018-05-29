/**
 */
package biochemsimulation.reactioncontainer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage
 * @generated
 */
public interface ReactioncontainerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReactioncontainerFactory eINSTANCE = biochemsimulation.reactioncontainer.impl.ReactioncontainerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reaction Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction Container</em>'.
	 * @generated
	 */
	ReactionContainer createReactionContainer();

	/**
	 * Returns a new object of class '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent</em>'.
	 * @generated
	 */
	Agent createAgent();

	/**
	 * Returns a new object of class '<em>Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Site</em>'.
	 * @generated
	 */
	Site createSite();

	/**
	 * Returns a new object of class '<em>Site State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Site State</em>'.
	 * @generated
	 */
	SiteState createSiteState();

	/**
	 * Returns a new object of class '<em>Free</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free</em>'.
	 * @generated
	 */
	Free createFree();

	/**
	 * Returns a new object of class '<em>Bound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bound</em>'.
	 * @generated
	 */
	Bound createBound();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReactioncontainerPackage getReactioncontainerPackage();

} //ReactioncontainerFactory
