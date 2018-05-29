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
 * @see biochemsimulation.reactioncontainer.ReactioncontainerFactory
 * @model kind="package"
 * @generated
 */
public interface ReactioncontainerPackage extends EPackage {
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
	String eNS_URI = "http://www.example.org/reactioncontainer";

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
	ReactioncontainerPackage eINSTANCE = biochemsimulation.reactioncontainer.impl.ReactioncontainerPackageImpl.init();

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.ReactionContainerImpl <em>Reaction Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactioncontainerPackageImpl#getReactionContainer()
	 * @generated
	 */
	int REACTION_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONTAINER__AGENT = 0;

	/**
	 * The number of structural features of the '<em>Reaction Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reaction Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.AgentImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactioncontainerPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Site</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__SITE = 2;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.SiteImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactioncontainerPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Linkstate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__LINKSTATE = 1;

	/**
	 * The feature id for the '<em><b>Sitestate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__SITESTATE = 2;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__AGENT = 3;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.SiteStateImpl <em>Site State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.SiteStateImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactioncontainerPackageImpl#getSiteState()
	 * @generated
	 */
	int SITE_STATE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_STATE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Site State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Site State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.LinkStateImpl <em>Link State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.LinkStateImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactioncontainerPackageImpl#getLinkState()
	 * @generated
	 */
	int LINK_STATE = 4;

	/**
	 * The feature id for the '<em><b>Site1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_STATE__SITE1 = 0;

	/**
	 * The number of structural features of the '<em>Link State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.FreeImpl <em>Free</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.FreeImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactioncontainerPackageImpl#getFree()
	 * @generated
	 */
	int FREE = 5;

	/**
	 * The feature id for the '<em><b>Site1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE__SITE1 = LINK_STATE__SITE1;

	/**
	 * The number of structural features of the '<em>Free</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_FEATURE_COUNT = LINK_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Free</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_OPERATION_COUNT = LINK_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.BoundImpl <em>Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.BoundImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactioncontainerPackageImpl#getBound()
	 * @generated
	 */
	int BOUND = 6;

	/**
	 * The feature id for the '<em><b>Site1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND__SITE1 = LINK_STATE__SITE1;

	/**
	 * The feature id for the '<em><b>Site2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND__SITE2 = LINK_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_FEATURE_COUNT = LINK_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION_COUNT = LINK_STATE_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link biochemsimulation.reactioncontainer.ReactionContainer#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agent</em>'.
	 * @see biochemsimulation.reactioncontainer.ReactionContainer#getAgent()
	 * @see #getReactionContainer()
	 * @generated
	 */
	EReference getReactionContainer_Agent();

	/**
	 * Returns the meta object for class '{@link biochemsimulation.reactioncontainer.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see biochemsimulation.reactioncontainer.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link biochemsimulation.reactioncontainer.Agent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see biochemsimulation.reactioncontainer.Agent#getName()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Name();

	/**
	 * Returns the meta object for the attribute '{@link biochemsimulation.reactioncontainer.Agent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see biochemsimulation.reactioncontainer.Agent#getType()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link biochemsimulation.reactioncontainer.Agent#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Site</em>'.
	 * @see biochemsimulation.reactioncontainer.Agent#getSite()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Site();

	/**
	 * Returns the meta object for class '{@link biochemsimulation.reactioncontainer.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see biochemsimulation.reactioncontainer.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the attribute '{@link biochemsimulation.reactioncontainer.Site#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see biochemsimulation.reactioncontainer.Site#getType()
	 * @see #getSite()
	 * @generated
	 */
	EAttribute getSite_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link biochemsimulation.reactioncontainer.Site#getLinkstate <em>Linkstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linkstate</em>'.
	 * @see biochemsimulation.reactioncontainer.Site#getLinkstate()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Linkstate();

	/**
	 * Returns the meta object for the reference '{@link biochemsimulation.reactioncontainer.Site#getSitestate <em>Sitestate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sitestate</em>'.
	 * @see biochemsimulation.reactioncontainer.Site#getSitestate()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Sitestate();

	/**
	 * Returns the meta object for the reference '{@link biochemsimulation.reactioncontainer.Site#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see biochemsimulation.reactioncontainer.Site#getAgent()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Agent();

	/**
	 * Returns the meta object for class '{@link biochemsimulation.reactioncontainer.SiteState <em>Site State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site State</em>'.
	 * @see biochemsimulation.reactioncontainer.SiteState
	 * @generated
	 */
	EClass getSiteState();

	/**
	 * Returns the meta object for the attribute '{@link biochemsimulation.reactioncontainer.SiteState#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see biochemsimulation.reactioncontainer.SiteState#getType()
	 * @see #getSiteState()
	 * @generated
	 */
	EAttribute getSiteState_Type();

	/**
	 * Returns the meta object for class '{@link biochemsimulation.reactioncontainer.LinkState <em>Link State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link State</em>'.
	 * @see biochemsimulation.reactioncontainer.LinkState
	 * @generated
	 */
	EClass getLinkState();

	/**
	 * Returns the meta object for the reference '{@link biochemsimulation.reactioncontainer.LinkState#getSite1 <em>Site1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Site1</em>'.
	 * @see biochemsimulation.reactioncontainer.LinkState#getSite1()
	 * @see #getLinkState()
	 * @generated
	 */
	EReference getLinkState_Site1();

	/**
	 * Returns the meta object for class '{@link biochemsimulation.reactioncontainer.Free <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free</em>'.
	 * @see biochemsimulation.reactioncontainer.Free
	 * @generated
	 */
	EClass getFree();

	/**
	 * Returns the meta object for class '{@link biochemsimulation.reactioncontainer.Bound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound</em>'.
	 * @see biochemsimulation.reactioncontainer.Bound
	 * @generated
	 */
	EClass getBound();

	/**
	 * Returns the meta object for the reference '{@link biochemsimulation.reactioncontainer.Bound#getSite2 <em>Site2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Site2</em>'.
	 * @see biochemsimulation.reactioncontainer.Bound#getSite2()
	 * @see #getBound()
	 * @generated
	 */
	EReference getBound_Site2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReactioncontainerFactory getReactioncontainerFactory();

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
		 * @see biochemsimulation.reactioncontainer.impl.ReactioncontainerPackageImpl#getReactionContainer()
		 * @generated
		 */
		EClass REACTION_CONTAINER = eINSTANCE.getReactionContainer();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION_CONTAINER__AGENT = eINSTANCE.getReactionContainer_Agent();

		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.AgentImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactioncontainerPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__TYPE = eINSTANCE.getAgent_Type();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__SITE = eINSTANCE.getAgent_Site();

		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.SiteImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactioncontainerPackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__TYPE = eINSTANCE.getSite_Type();

		/**
		 * The meta object literal for the '<em><b>Linkstate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__LINKSTATE = eINSTANCE.getSite_Linkstate();

		/**
		 * The meta object literal for the '<em><b>Sitestate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__SITESTATE = eINSTANCE.getSite_Sitestate();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__AGENT = eINSTANCE.getSite_Agent();

		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.SiteStateImpl <em>Site State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.SiteStateImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactioncontainerPackageImpl#getSiteState()
		 * @generated
		 */
		EClass SITE_STATE = eINSTANCE.getSiteState();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE_STATE__TYPE = eINSTANCE.getSiteState_Type();

		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.LinkStateImpl <em>Link State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.LinkStateImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactioncontainerPackageImpl#getLinkState()
		 * @generated
		 */
		EClass LINK_STATE = eINSTANCE.getLinkState();

		/**
		 * The meta object literal for the '<em><b>Site1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_STATE__SITE1 = eINSTANCE.getLinkState_Site1();

		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.FreeImpl <em>Free</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.FreeImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactioncontainerPackageImpl#getFree()
		 * @generated
		 */
		EClass FREE = eINSTANCE.getFree();

		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.BoundImpl <em>Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.BoundImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactioncontainerPackageImpl#getBound()
		 * @generated
		 */
		EClass BOUND = eINSTANCE.getBound();

		/**
		 * The meta object literal for the '<em><b>Site2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUND__SITE2 = eINSTANCE.getBound_Site2();

	}

} //ReactioncontainerPackage
