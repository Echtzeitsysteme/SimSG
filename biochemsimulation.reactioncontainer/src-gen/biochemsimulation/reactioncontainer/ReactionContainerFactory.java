/**
 */
package biochemsimulation.reactioncontainer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage
 * @generated
 */
public interface ReactionContainerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReactionContainerFactory eINSTANCE = biochemsimulation.reactioncontainer.impl.ReactionContainerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reaction Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction Container</em>'.
	 * @generated
	 */
	ReactionContainer createReactionContainer();

	/**
	 * Returns a new object of class '<em>Sim Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sim Agent</em>'.
	 * @generated
	 */
	SimAgent createSimAgent();

	/**
	 * Returns a new object of class '<em>Sim Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sim Site</em>'.
	 * @generated
	 */
	SimSite createSimSite();

	/**
	 * Returns a new object of class '<em>Sim Site State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sim Site State</em>'.
	 * @generated
	 */
	SimSiteState createSimSiteState();

	/**
	 * Returns a new object of class '<em>Sim Bound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sim Bound</em>'.
	 * @generated
	 */
	SimBound createSimBound();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReactionContainerPackage getReactionContainerPackage();

} //ReactionContainerFactory
