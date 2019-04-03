/**
 */
package Goldbeter_Koshland.impl;

import Goldbeter_Koshland.Goldbeter_KoshlandFactory;
import Goldbeter_Koshland.Goldbeter_KoshlandPackage;
import Goldbeter_Koshland.ps;
import Goldbeter_Koshland.us;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.simsg.container.ContainerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Goldbeter_KoshlandPackageImpl extends EPackageImpl implements Goldbeter_KoshlandPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psEClass = null;

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
	 * @see Goldbeter_Koshland.Goldbeter_KoshlandPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Goldbeter_KoshlandPackageImpl() {
		super(eNS_URI, Goldbeter_KoshlandFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Goldbeter_KoshlandPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Goldbeter_KoshlandPackage init() {
		if (isInited) return (Goldbeter_KoshlandPackage)EPackage.Registry.INSTANCE.getEPackage(Goldbeter_KoshlandPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGoldbeter_KoshlandPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Goldbeter_KoshlandPackageImpl theGoldbeter_KoshlandPackage = registeredGoldbeter_KoshlandPackage instanceof Goldbeter_KoshlandPackageImpl ? (Goldbeter_KoshlandPackageImpl)registeredGoldbeter_KoshlandPackage : new Goldbeter_KoshlandPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ContainerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGoldbeter_KoshlandPackage.createPackageContents();

		// Initialize created meta-data
		theGoldbeter_KoshlandPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGoldbeter_KoshlandPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Goldbeter_KoshlandPackage.eNS_URI, theGoldbeter_KoshlandPackage);
		return theGoldbeter_KoshlandPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getK() {
		return kEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getK_K_a() {
		return (EReference)kEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP() {
		return pEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getP_P_a() {
		return (EReference)pEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT() {
		return tEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_T_x() {
		return (EReference)tEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_T_x_u() {
		return (EReference)tEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_T_x_p() {
		return (EReference)tEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_T_y() {
		return (EReference)tEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_T_y_u() {
		return (EReference)tEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_T_y_p() {
		return (EReference)tEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getus() {
		return usEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getps() {
		return psEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goldbeter_KoshlandFactory getGoldbeter_KoshlandFactory() {
		return (Goldbeter_KoshlandFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		kEClass = createEClass(K);
		createEReference(kEClass, K__KA);

		pEClass = createEClass(P);
		createEReference(pEClass, P__PA);

		tEClass = createEClass(T);
		createEReference(tEClass, T__TX);
		createEReference(tEClass, T__TXU);
		createEReference(tEClass, T__TXP);
		createEReference(tEClass, T__TY);
		createEReference(tEClass, T__TYU);
		createEReference(tEClass, T__TYP);

		usEClass = createEClass(US);

		psEClass = createEClass(PS);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ContainerPackage theContainerPackage = (ContainerPackage)EPackage.Registry.INSTANCE.getEPackage(ContainerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		kEClass.getESuperTypes().add(theContainerPackage.getAgent());
		pEClass.getESuperTypes().add(theContainerPackage.getAgent());
		tEClass.getESuperTypes().add(theContainerPackage.getAgent());
		usEClass.getESuperTypes().add(theContainerPackage.getState());
		psEClass.getESuperTypes().add(theContainerPackage.getState());

		// Initialize classes, features, and operations; add parameters
		initEClass(kEClass, Goldbeter_Koshland.K.class, "K", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getK_K_a(), theContainerPackage.getAgent(), null, "K_a", null, 0, 1, Goldbeter_Koshland.K.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pEClass, Goldbeter_Koshland.P.class, "P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getP_P_a(), theContainerPackage.getAgent(), null, "P_a", null, 0, 1, Goldbeter_Koshland.P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tEClass, Goldbeter_Koshland.T.class, "T", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_T_x(), theContainerPackage.getAgent(), null, "T_x", null, 0, 1, Goldbeter_Koshland.T.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getT_T_x_u(), this.getus(), null, "T_x_u", null, 0, 1, Goldbeter_Koshland.T.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getT_T_x_p(), this.getps(), null, "T_x_p", null, 0, 1, Goldbeter_Koshland.T.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getT_T_y(), theContainerPackage.getAgent(), null, "T_y", null, 0, 1, Goldbeter_Koshland.T.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getT_T_y_u(), this.getus(), null, "T_y_u", null, 0, 1, Goldbeter_Koshland.T.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getT_T_y_p(), this.getps(), null, "T_y_p", null, 0, 1, Goldbeter_Koshland.T.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usEClass, us.class, "us", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(psEClass, ps.class, "ps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Goldbeter_KoshlandPackageImpl
