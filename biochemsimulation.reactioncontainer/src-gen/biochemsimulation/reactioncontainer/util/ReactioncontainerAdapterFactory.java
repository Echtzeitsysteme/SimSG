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
		public Adapter caseSimAgent(SimAgent object) {
			return createSimAgentAdapter();
		}

		@Override
		public Adapter caseSimSite(SimSite object) {
			return createSimSiteAdapter();
		}

		@Override
		public Adapter caseSimSiteState(SimSiteState object) {
			return createSimSiteStateAdapter();
		}

		@Override
		public Adapter caseSimLinkState(SimLinkState object) {
			return createSimLinkStateAdapter();
		}

		@Override
		public Adapter caseSimFree(SimFree object) {
			return createSimFreeAdapter();
		}

		@Override
		public Adapter caseSimBound(SimBound object) {
			return createSimBoundAdapter();
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
	 * Creates a new adapter for an object of class '{@link biochemsimulation.reactioncontainer.SimAgent <em>Sim Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biochemsimulation.reactioncontainer.SimAgent
	 * @generated
	 */
	public Adapter createSimAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biochemsimulation.reactioncontainer.SimSite <em>Sim Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biochemsimulation.reactioncontainer.SimSite
	 * @generated
	 */
	public Adapter createSimSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biochemsimulation.reactioncontainer.SimSiteState <em>Sim Site State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biochemsimulation.reactioncontainer.SimSiteState
	 * @generated
	 */
	public Adapter createSimSiteStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biochemsimulation.reactioncontainer.SimLinkState <em>Sim Link State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biochemsimulation.reactioncontainer.SimLinkState
	 * @generated
	 */
	public Adapter createSimLinkStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biochemsimulation.reactioncontainer.SimFree <em>Sim Free</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biochemsimulation.reactioncontainer.SimFree
	 * @generated
	 */
	public Adapter createSimFreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biochemsimulation.reactioncontainer.SimBound <em>Sim Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biochemsimulation.reactioncontainer.SimBound
	 * @generated
	 */
	public Adapter createSimBoundAdapter() {
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
