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
public class ReactionContainerFactoryImpl extends EFactoryImpl implements ReactionContainerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReactionContainerFactory init() {
		try {
			ReactionContainerFactory theReactionContainerFactory = (ReactionContainerFactory) EPackage.Registry.INSTANCE
					.getEFactory(ReactionContainerPackage.eNS_URI);
			if (theReactionContainerFactory != null) {
				return theReactionContainerFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReactionContainerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionContainerFactoryImpl() {
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
		case ReactionContainerPackage.REACTION_CONTAINER:
			return createReactionContainer();
		case ReactionContainerPackage.SIM_AGENT:
			return createSimAgent();
		case ReactionContainerPackage.SIM_SITE:
			return createSimSite();
		case ReactionContainerPackage.SIM_SITE_STATE:
			return createSimSiteState();
		case ReactionContainerPackage.SIM_BOUND:
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
	public SimBound createSimBound() {
		SimBoundImpl simBound = new SimBoundImpl();
		return simBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionContainerPackage getReactionContainerPackage() {
		return (ReactionContainerPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReactionContainerPackage getPackage() {
		return ReactionContainerPackage.eINSTANCE;
	}

} //ReactionContainerFactoryImpl
