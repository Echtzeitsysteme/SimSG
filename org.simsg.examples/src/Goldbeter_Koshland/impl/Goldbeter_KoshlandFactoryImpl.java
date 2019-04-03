/**
 */
package Goldbeter_Koshland.impl;

import Goldbeter_Koshland.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Goldbeter_KoshlandFactoryImpl extends EFactoryImpl implements Goldbeter_KoshlandFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Goldbeter_KoshlandFactory init() {
		try {
			Goldbeter_KoshlandFactory theGoldbeter_KoshlandFactory = (Goldbeter_KoshlandFactory)EPackage.Registry.INSTANCE.getEFactory(Goldbeter_KoshlandPackage.eNS_URI);
			if (theGoldbeter_KoshlandFactory != null) {
				return theGoldbeter_KoshlandFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Goldbeter_KoshlandFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goldbeter_KoshlandFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Goldbeter_KoshlandPackage.K: return createK();
			case Goldbeter_KoshlandPackage.P: return createP();
			case Goldbeter_KoshlandPackage.T: return createT();
			case Goldbeter_KoshlandPackage.US: return createus();
			case Goldbeter_KoshlandPackage.PS: return createps();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public K createK() {
		KImpl k = new KImpl();
		return k;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P createP() {
		PImpl p = new PImpl();
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T createT() {
		TImpl t = new TImpl();
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public us createus() {
		usImpl us = new usImpl();
		return us;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ps createps() {
		psImpl ps = new psImpl();
		return ps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goldbeter_KoshlandPackage getGoldbeter_KoshlandPackage() {
		return (Goldbeter_KoshlandPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Goldbeter_KoshlandPackage getPackage() {
		return Goldbeter_KoshlandPackage.eINSTANCE;
	}

} //Goldbeter_KoshlandFactoryImpl
