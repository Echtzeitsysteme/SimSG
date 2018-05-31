/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.*;

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
public class ReactioncontainerFactoryImpl extends EFactoryImpl implements ReactioncontainerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReactioncontainerFactory init() {
		try {
			ReactioncontainerFactory theReactioncontainerFactory = (ReactioncontainerFactory) EPackage.Registry.INSTANCE
					.getEFactory(ReactioncontainerPackage.eNS_URI);
			if (theReactioncontainerFactory != null) {
				return theReactioncontainerFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReactioncontainerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactioncontainerFactoryImpl() {
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
		case ReactioncontainerPackage.REACTION_CONTAINER:
			return createReactionContainer();
		case ReactioncontainerPackage.SIM_AGENT:
			return createSimAgent();
		case ReactioncontainerPackage.SIM_SITE:
			return createSimSite();
		case ReactioncontainerPackage.SIM_SITE_STATE:
			return createSimSiteState();
		case ReactioncontainerPackage.SIM_FREE:
			return createSimFree();
		case ReactioncontainerPackage.SIM_BOUND:
			return createSimBound();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionContainer createReactionContainer() {
		ReactionContainerImpl reactionContainer = new ReactionContainerImpl();
		return reactionContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimAgent createSimAgent() {
		SimAgentImpl simAgent = new SimAgentImpl();
		return simAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimSite createSimSite() {
		SimSiteImpl simSite = new SimSiteImpl();
		return simSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimSiteState createSimSiteState() {
		SimSiteStateImpl simSiteState = new SimSiteStateImpl();
		return simSiteState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimFree createSimFree() {
		SimFreeImpl simFree = new SimFreeImpl();
		return simFree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimBound createSimBound() {
		SimBoundImpl simBound = new SimBoundImpl();
		return simBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactioncontainerPackage getReactioncontainerPackage() {
		return (ReactioncontainerPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReactioncontainerPackage getPackage() {
		return ReactioncontainerPackage.eINSTANCE;
	}

} //ReactioncontainerFactoryImpl
