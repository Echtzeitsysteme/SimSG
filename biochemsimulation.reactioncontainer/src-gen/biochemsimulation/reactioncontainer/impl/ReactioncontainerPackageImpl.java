/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactioncontainerFactory;
import biochemsimulation.reactioncontainer.ReactioncontainerPackage;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimBound;
import biochemsimulation.reactioncontainer.SimFree;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.reactioncontainer.SimSiteState;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReactioncontainerPackageImpl extends EPackageImpl implements ReactioncontainerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simSiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simSiteStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simLinkStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simFreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simBoundEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReactioncontainerPackageImpl() {
		super(eNS_URI, ReactioncontainerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ReactioncontainerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReactioncontainerPackage init() {
		if (isInited)
			return (ReactioncontainerPackage) EPackage.Registry.INSTANCE.getEPackage(ReactioncontainerPackage.eNS_URI);

		// Obtain or create and register package
		ReactioncontainerPackageImpl theReactioncontainerPackage = (ReactioncontainerPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ReactioncontainerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ReactioncontainerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theReactioncontainerPackage.createPackageContents();

		// Initialize created meta-data
		theReactioncontainerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReactioncontainerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReactioncontainerPackage.eNS_URI, theReactioncontainerPackage);
		return theReactioncontainerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactionContainer() {
		return reactionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactionContainer_SimAgent() {
		return (EReference) reactionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimAgent() {
		return simAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimAgent_Name() {
		return (EAttribute) simAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimAgent_Type() {
		return (EAttribute) simAgentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimAgent_SimSite() {
		return (EReference) simAgentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimSite() {
		return simSiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimSite_Type() {
		return (EAttribute) simSiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimSite_SimLinkstate() {
		return (EReference) simSiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimSite_SimSiteState() {
		return (EReference) simSiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimSite_SimAgent() {
		return (EReference) simSiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimSiteState() {
		return simSiteStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimSiteState_Type() {
		return (EAttribute) simSiteStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimLinkState() {
		return simLinkStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimLinkState_SimSite1() {
		return (EReference) simLinkStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimFree() {
		return simFreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimBound() {
		return simBoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimBound_SimSite2() {
		return (EReference) simBoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactioncontainerFactory getReactioncontainerFactory() {
		return (ReactioncontainerFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		reactionContainerEClass = createEClass(REACTION_CONTAINER);
		createEReference(reactionContainerEClass, REACTION_CONTAINER__SIM_AGENT);

		simAgentEClass = createEClass(SIM_AGENT);
		createEAttribute(simAgentEClass, SIM_AGENT__NAME);
		createEAttribute(simAgentEClass, SIM_AGENT__TYPE);
		createEReference(simAgentEClass, SIM_AGENT__SIM_SITE);

		simSiteEClass = createEClass(SIM_SITE);
		createEAttribute(simSiteEClass, SIM_SITE__TYPE);
		createEReference(simSiteEClass, SIM_SITE__SIM_LINKSTATE);
		createEReference(simSiteEClass, SIM_SITE__SIM_SITE_STATE);
		createEReference(simSiteEClass, SIM_SITE__SIM_AGENT);

		simSiteStateEClass = createEClass(SIM_SITE_STATE);
		createEAttribute(simSiteStateEClass, SIM_SITE_STATE__TYPE);

		simLinkStateEClass = createEClass(SIM_LINK_STATE);
		createEReference(simLinkStateEClass, SIM_LINK_STATE__SIM_SITE1);

		simFreeEClass = createEClass(SIM_FREE);

		simBoundEClass = createEClass(SIM_BOUND);
		createEReference(simBoundEClass, SIM_BOUND__SIM_SITE2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simFreeEClass.getESuperTypes().add(this.getSimLinkState());
		simBoundEClass.getESuperTypes().add(this.getSimLinkState());

		// Initialize classes, features, and operations; add parameters
		initEClass(reactionContainerEClass, ReactionContainer.class, "ReactionContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReactionContainer_SimAgent(), this.getSimAgent(), null, "simAgent", null, 0, -1,
				ReactionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simAgentEClass, SimAgent.class, "SimAgent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimAgent_Name(), theXMLTypePackage.getString(), "Name", null, 0, 1, SimAgent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimAgent_Type(), theXMLTypePackage.getString(), "Type", null, 0, 1, SimAgent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimAgent_SimSite(), this.getSimSite(), null, "simSite", null, 0, -1, SimAgent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simSiteEClass, SimSite.class, "SimSite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimSite_Type(), theXMLTypePackage.getString(), "Type", null, 0, 1, SimSite.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimSite_SimLinkstate(), this.getSimLinkState(), null, "simLinkstate", null, 0, 1,
				SimSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimSite_SimSiteState(), this.getSimSiteState(), null, "simSiteState", null, 0, 1,
				SimSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimSite_SimAgent(), this.getSimAgent(), null, "simAgent", null, 1, 1, SimSite.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simSiteStateEClass, SimSiteState.class, "SimSiteState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimSiteState_Type(), theXMLTypePackage.getString(), "Type", null, 0, 1, SimSiteState.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simLinkStateEClass, SimLinkState.class, "SimLinkState", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimLinkState_SimSite1(), this.getSimSite(), null, "simSite1", null, 1, 1, SimLinkState.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simFreeEClass, SimFree.class, "SimFree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simBoundEClass, SimBound.class, "SimBound", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimBound_SimSite2(), this.getSimSite(), null, "simSite2", null, 1, 1, SimBound.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ReactioncontainerPackageImpl
