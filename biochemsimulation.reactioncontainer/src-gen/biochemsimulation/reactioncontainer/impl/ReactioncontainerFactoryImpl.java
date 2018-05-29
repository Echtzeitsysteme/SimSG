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
		case ReactioncontainerPackage.AGENT:
			return createAgent();
		case ReactioncontainerPackage.SITE:
			return createSite();
		case ReactioncontainerPackage.SITE_STATE:
			return createSiteState();
		case ReactioncontainerPackage.FREE:
			return createFree();
		case ReactioncontainerPackage.BOUND:
			return createBound();
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
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site createSite() {
		SiteImpl site = new SiteImpl();
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteState createSiteState() {
		SiteStateImpl siteState = new SiteStateImpl();
		return siteState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Free createFree() {
		FreeImpl free = new FreeImpl();
		return free;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bound createBound() {
		BoundImpl bound = new BoundImpl();
		return bound;
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
