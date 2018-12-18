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
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.ContainerImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__AGENTS = 0;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MODEL_NAME = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STATES = 2;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.AgentImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__STATE = 0;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.State
	 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.SiteStateImpl <em>Site State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.SiteStateImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getSiteState()
	 * @generated
	 */
	int SITE_STATE = 3;

	/**
	 * The number of structural features of the '<em>Site State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Site State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link biochemsimulation.reactioncontainer.impl.AgentStateImpl <em>Agent State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biochemsimulation.reactioncontainer.impl.AgentStateImpl
	 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getAgentState()
	 * @generated
	 */
	int AGENT_STATE = 4;

	/**
	 * The number of structural features of the '<em>Agent State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agent State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link biochemsimulation.reactioncontainer.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see biochemsimulation.reactioncontainer.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link biochemsimulation.reactioncontainer.Container#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see biochemsimulation.reactioncontainer.Container#getAgents()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Agents();

	/**
	 * Returns the meta object for the attribute '{@link biochemsimulation.reactioncontainer.Container#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see biochemsimulation.reactioncontainer.Container#getModelName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_ModelName();

	/**
	 * Returns the meta object for the containment reference list '{@link biochemsimulation.reactioncontainer.Container#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see biochemsimulation.reactioncontainer.Container#getStates()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_States();

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
	 * Returns the meta object for the reference list '{@link biochemsimulation.reactioncontainer.Agent#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State</em>'.
	 * @see biochemsimulation.reactioncontainer.Agent#getState()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_State();

	/**
	 * Returns the meta object for class '{@link biochemsimulation.reactioncontainer.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see biochemsimulation.reactioncontainer.State
	 * @generated
	 */
	EClass getState();

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
	 * Returns the meta object for class '{@link biochemsimulation.reactioncontainer.AgentState <em>Agent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent State</em>'.
	 * @see biochemsimulation.reactioncontainer.AgentState
	 * @generated
	 */
	EClass getAgentState();

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
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.ContainerImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__AGENTS = eINSTANCE.getContainer_Agents();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MODEL_NAME = eINSTANCE.getContainer_ModelName();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__STATES = eINSTANCE.getContainer_States();

		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.AgentImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__STATE = eINSTANCE.getAgent_State();

		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.State
		 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.SiteStateImpl <em>Site State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.SiteStateImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getSiteState()
		 * @generated
		 */
		EClass SITE_STATE = eINSTANCE.getSiteState();

		/**
		 * The meta object literal for the '{@link biochemsimulation.reactioncontainer.impl.AgentStateImpl <em>Agent State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see biochemsimulation.reactioncontainer.impl.AgentStateImpl
		 * @see biochemsimulation.reactioncontainer.impl.ReactionContainerPackageImpl#getAgentState()
		 * @generated
		 */
		EClass AGENT_STATE = eINSTANCE.getAgentState();

	}

} //ReactionContainerPackage
