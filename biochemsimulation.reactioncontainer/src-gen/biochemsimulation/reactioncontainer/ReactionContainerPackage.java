/**
 */
package biochemsimulation.reactioncontainer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see biochemsimulation.reactioncontainer.ReactionContainerFactory
 * @model kind="package"
 * @generated
 */
public interface ReactionContainerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reactioncontainer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.reactioncontainer.biochemsimulation.org/reactioncontainer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reactioncontainer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReactionContainerPackage eINSTANCE = biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl.init();

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.ReactionContainerImpl <em>Reaction Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getReactionContainer()
	 * @generated
	 */
	int REACTION_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Sim Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONTAINER__SIM_AGENT = 0;

	/**
	 * The feature id for the '<em><b>Sim Link States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONTAINER__SIM_LINK_STATES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONTAINER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Reaction Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reaction Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.SimAgentImpl <em>Sim Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.SimAgentImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getSimAgent()
	 * @generated
	 */
	int SIM_AGENT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_AGENT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Sim Sites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_AGENT__SIM_SITES = 1;

	/**
	 * The number of structural features of the '<em>Sim Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_AGENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sim Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.SimSiteImpl <em>Sim Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.SimSiteImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getSimSite()
	 * @generated
	 */
	int SIM_SITE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_SITE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Sim Site State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_SITE__SIM_SITE_STATE = 1;

	/**
	 * The feature id for the '<em><b>Sim Link State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_SITE__SIM_LINK_STATE = 2;

	/**
	 * The number of structural features of the '<em>Sim Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_SITE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sim Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_SITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.SimSiteStateImpl <em>Sim Site State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.SimSiteStateImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getSimSiteState()
	 * @generated
	 */
	int SIM_SITE_STATE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_SITE_STATE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Sim Site State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_SITE_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sim Site State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_SITE_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.SimLinkStateImpl <em>Sim Link State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.SimLinkStateImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getSimLinkState()
	 * @generated
	 */
	int SIM_LINK_STATE = 4;

	/**
	 * The feature id for the '<em><b>Sim Site1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_LINK_STATE__SIM_SITE1 = 0;

	/**
	 * The number of structural features of the '<em>Sim Link State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_LINK_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sim Link State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_LINK_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.SimBoundImpl <em>Sim Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.SimBoundImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getSimBound()
	 * @generated
	 */
	int SIM_BOUND = 5;

	/**
	 * The feature id for the '<em><b>Sim Site1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_BOUND__SIM_SITE1 = SIM_LINK_STATE__SIM_SITE1;

	/**
	 * The feature id for the '<em><b>Sim Site2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_BOUND__SIM_SITE2 = SIM_LINK_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sim Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_BOUND_FEATURE_COUNT = SIM_LINK_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sim Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_BOUND_OPERATION_COUNT = SIM_LINK_STATE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link biochemsimulation.reactioncontainer.ReactionContainer <em>Reaction Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaction Container</em>'.
	 * @see biochemsimulation.reactioncontainer.ReactionContainer
	 * @generated
	 */
	EClass getReactionContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link biochemsimulation.reactioncontainer.ReactionContainer#getSimAgent <em>Sim Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sim Agent</em>'.
	 * @see biochemsimulation.reactioncontainer.ReactionContainer#getSimAgent()
	 * @see #getReactionContainer()
	 * @generated
	 */
	EReference getReactionContainer_SimAgent();

	/**
	 * Returns the meta object for the containment reference list '{@link biochemsimulation.reactioncontainer.ReactionContainer#getSimLinkStates <em>Sim Link States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sim Link States</em>'.
	 * @see biochemsimulation.reactioncontainer.ReactionContainer#getSimLinkStates()
	 * @see #getReactionContainer()
	 * @generated
	 */
	EReference getReactionContainer_SimLinkStates();

	/**
	 * Returns the meta object for the attribute '{@link biochemsimulation.reactioncontainer.ReactionContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see biochemsimulation.reactioncontainer.ReactionContainer#getName()
	 * @see #getReactionContainer()
	 * @generated
	 */
	EAttribute getReactionContainer_Name();

	/**
	 * Returns the meta object for class '{@link biochemsimulation.reactioncontainer.SimAgent <em>Sim Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sim Agent</em>'.
	 * @see biochemsimulation.reactioncontainer.SimAgent
	 * @generated
	 */
	EClass getSimAgent();

	/**
	 * Returns the meta object for the attribute '{@link biochemsimulation.reactioncontainer.SimAgent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see biochemsimulation.reactioncontainer.SimAgent#getType()
	 * @see #getSimAgent()
	 * @generated
	 */
	EAttribute getSimAgent_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link biochemsimulation.reactioncontainer.SimAgent#getSimSites <em>Sim Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sim Sites</em>'.
	 * @see biochemsimulation.reactioncontainer.SimAgent#getSimSites()
	 * @see #getSimAgent()
	 * @generated
	 */
	EReference getSimAgent_SimSites();

	/**
	 * Returns the meta object for class '{@link biochemsimulation.reactioncontainer.SimSite <em>Sim Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sim Site</em>'.
	 * @see biochemsimulation.reactioncontainer.SimSite
	 * @generated
	 */
	EClass getSimSite();

	/**
	 * Returns the meta object for the attribute '{@link biochemsimulation.reactioncontainer.SimSite#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see biochemsimulation.reactioncontainer.SimSite#getType()
	 * @see #getSimSite()
	 * @generated
	 */
	EAttribute getSimSite_Type();

	/**
	 * Returns the meta object for the containment reference '{@link biochemsimulation.reactioncontainer.SimSite#getSimSiteState <em>Sim Site State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sim Site State</em>'.
	 * @see biochemsimulation.reactioncontainer.SimSite#getSimSiteState()
	 * @see #getSimSite()
	 * @generated
	 */
	EReference getSimSite_SimSiteState();

	/**
	 * Returns the meta object for the reference '{@link biochemsimulation.reactioncontainer.SimSite#getSimLinkState <em>Sim Link State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sim Link State</em>'.
	 * @see biochemsimulation.reactioncontainer.SimSite#getSimLinkState()
	 * @see #getSimSite()
	 * @generated
	 */
	EReference getSimSite_SimLinkState();

	/**
	 * Returns the meta object for class '{@link biochemsimulation.reactioncontainer.SimSiteState <em>Sim Site State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sim Site State</em>'.
	 * @see biochemsimulation.reactioncontainer.SimSiteState
	 * @generated
	 */
	EClass getSimSiteState();

	/**
	 * Returns the meta object for the attribute '{@link biochemsimulation.reactioncontainer.SimSiteState#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see biochemsimulation.reactioncontainer.SimSiteState#getType()
	 * @see #getSimSiteState()
	 * @generated
	 */
	EAttribute getSimSiteState_Type();

	/**
	 * Returns the meta object for class '{@link biochemsimulation.reactioncontainer.SimLinkState <em>Sim Link State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sim Link State</em>'.
	 * @see biochemsimulation.reactioncontainer.SimLinkState
	 * @generated
	 */
	EClass getSimLinkState();

	/**
	 * Returns the meta object for the reference '{@link biochemsimulation.reactioncontainer.SimLinkState#getSimSite1 <em>Sim Site1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sim Site1</em>'.
	 * @see biochemsimulation.reactioncontainer.SimLinkState#getSimSite1()
	 * @see #getSimLinkState()
	 * @generated
	 */
	EReference getSimLinkState_SimSite1();

	/**
	 * Returns the meta object for class '{@link biochemsimulation.reactioncontainer.SimBound <em>Sim Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sim Bound</em>'.
	 * @see biochemsimulation.reactioncontainer.SimBound
	 * @generated
	 */
	EClass getSimBound();

	/**
	 * Returns the meta object for the reference '{@link biochemsimulation.reactioncontainer.SimBound#getSimSite2 <em>Sim Site2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sim Site2</em>'.
	 * @see biochemsimulation.reactioncontainer.SimBound#getSimSite2()
	 * @see #getSimBound()
	 * @generated
	 */
	EReference getSimBound_SimSite2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReactionContainerFactory getReactionContainerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.ReactionContainerImpl <em>Reaction Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getReactionContainer()
		 * @generated
		 */
		EClass REACTION_CONTAINER = eINSTANCE.getReactionContainer();

		/**
		 * The meta object literal for the '<em><b>Sim Agent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION_CONTAINER__SIM_AGENT = eINSTANCE.getReactionContainer_SimAgent();

		/**
		 * The meta object literal for the '<em><b>Sim Link States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION_CONTAINER__SIM_LINK_STATES = eINSTANCE.getReactionContainer_SimLinkStates();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACTION_CONTAINER__NAME = eINSTANCE.getReactionContainer_Name();

		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.SimAgentImpl <em>Sim Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.SimAgentImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getSimAgent()
		 * @generated
		 */
		EClass SIM_AGENT = eINSTANCE.getSimAgent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIM_AGENT__TYPE = eINSTANCE.getSimAgent_Type();

		/**
		 * The meta object literal for the '<em><b>Sim Sites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIM_AGENT__SIM_SITES = eINSTANCE.getSimAgent_SimSites();

		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.SimSiteImpl <em>Sim Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.SimSiteImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getSimSite()
		 * @generated
		 */
		EClass SIM_SITE = eINSTANCE.getSimSite();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIM_SITE__TYPE = eINSTANCE.getSimSite_Type();

		/**
		 * The meta object literal for the '<em><b>Sim Site State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIM_SITE__SIM_SITE_STATE = eINSTANCE.getSimSite_SimSiteState();

		/**
		 * The meta object literal for the '<em><b>Sim Link State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIM_SITE__SIM_LINK_STATE = eINSTANCE.getSimSite_SimLinkState();

		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.SimSiteStateImpl <em>Sim Site State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.SimSiteStateImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getSimSiteState()
		 * @generated
		 */
		EClass SIM_SITE_STATE = eINSTANCE.getSimSiteState();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIM_SITE_STATE__TYPE = eINSTANCE.getSimSiteState_Type();

		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.SimLinkStateImpl <em>Sim Link State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.SimLinkStateImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getSimLinkState()
		 * @generated
		 */
		EClass SIM_LINK_STATE = eINSTANCE.getSimLinkState();

		/**
		 * The meta object literal for the '<em><b>Sim Site1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIM_LINK_STATE__SIM_SITE1 = eINSTANCE.getSimLinkState_SimSite1();

		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.SimBoundImpl <em>Sim Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.SimBoundImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getSimBound()
		 * @generated
		 */
		EClass SIM_BOUND = eINSTANCE.getSimBound();

		/**
		 * The meta object literal for the '<em><b>Sim Site2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIM_BOUND__SIM_SITE2 = eINSTANCE.getSimBound_SimSite2();

	}

} //ReactionContainerPackage
