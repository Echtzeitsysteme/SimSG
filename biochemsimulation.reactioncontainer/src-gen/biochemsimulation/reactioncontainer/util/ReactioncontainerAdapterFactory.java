/**
 */
package biochemsimulation.reactioncontainer.util;

import biochemsimulation.reactioncontainer.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see biochemsimulation.reactioncontainer.ReactioncontainerPackage
 * @generated
 */
public class ReactioncontainerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReactioncontainerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactioncontainerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReactioncontainerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactioncontainerSwitch<Adapter> modelSwitch = new ReactioncontainerSwitch<Adapter>() {
		@Override
		public Adapter caseReactionContainer(ReactionContainer object) {
			return createReactionContainerAdapter();
		}

		@Override
		public Adapter caseAgent(Agent object) {
			return createAgentAdapter();
		}

		@Override
		public Adapter caseSite(Site object) {
			return createSiteAdapter();
		}

		@Override
		public Adapter caseSiteState(SiteState object) {
			return createSiteStateAdapter();
		}

		@Override
		public Adapter caseLinkState(LinkState object) {
			return createLinkStateAdapter();
		}

		@Override
		public Adapter caseFree(Free object) {
			return createFreeAdapter();
		}

		@Override
		public Adapter caseBound(Bound object) {
			return createBoundAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link biochemsimulation.reactioncontainer.ReactionContainer <em>Reaction Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biochemsimulation.reactioncontainer.ReactionContainer
	 * @generated
	 */
	public Adapter createReactionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biochemsimulation.reactioncontainer.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biochemsimulation.reactioncontainer.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biochemsimulation.reactioncontainer.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biochemsimulation.reactioncontainer.Site
	 * @generated
	 */
	public Adapter createSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biochemsimulation.reactioncontainer.SiteState <em>Site State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biochemsimulation.reactioncontainer.SiteState
	 * @generated
	 */
	public Adapter createSiteStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biochemsimulation.reactioncontainer.LinkState <em>Link State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biochemsimulation.reactioncontainer.LinkState
	 * @generated
	 */
	public Adapter createLinkStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biochemsimulation.reactioncontainer.Free <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biochemsimulation.reactioncontainer.Free
	 * @generated
	 */
	public Adapter createFreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biochemsimulation.reactioncontainer.Bound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biochemsimulation.reactioncontainer.Bound
	 * @generated
	 */
	public Adapter createBoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ReactioncontainerAdapterFactory
