/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimLinkState;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaction Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.ReactionContainerImpl#getSimAgent <em>Sim Agent</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.ReactionContainerImpl#getSimLinkStates <em>Sim Link States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactionContainerImpl extends MinimalEObjectImpl.Container implements ReactionContainer {
	/**
	 * The cached value of the '{@link #getSimAgent() <em>Sim Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimAgent()
	 * @generated
	 * @ordered
	 */
	protected EList<SimAgent> simAgent;

	/**
	 * The cached value of the '{@link #getSimLinkStates() <em>Sim Link States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimLinkStates()
	 * @generated
	 * @ordered
	 */
	protected EList<SimLinkState> simLinkStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactionContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactionContainerPackage.Literals.REACTION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimAgent> getSimAgent() {
		if (simAgent == null) {
			simAgent = new EObjectContainmentEList<SimAgent>(SimAgent.class, this,
					ReactionContainerPackage.REACTION_CONTAINER__SIM_AGENT);
		}
		return simAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimLinkState> getSimLinkStates() {
		if (simLinkStates == null) {
			simLinkStates = new EObjectContainmentEList<SimLinkState>(SimLinkState.class, this,
					ReactionContainerPackage.REACTION_CONTAINER__SIM_LINK_STATES);
		}
		return simLinkStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReactionContainerPackage.REACTION_CONTAINER__SIM_AGENT:
			return ((InternalEList<?>) getSimAgent()).basicRemove(otherEnd, msgs);
		case ReactionContainerPackage.REACTION_CONTAINER__SIM_LINK_STATES:
			return ((InternalEList<?>) getSimLinkStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ReactionContainerPackage.REACTION_CONTAINER__SIM_AGENT:
			return getSimAgent();
		case ReactionContainerPackage.REACTION_CONTAINER__SIM_LINK_STATES:
			return getSimLinkStates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ReactionContainerPackage.REACTION_CONTAINER__SIM_AGENT:
			getSimAgent().clear();
			getSimAgent().addAll((Collection<? extends SimAgent>) newValue);
			return;
		case ReactionContainerPackage.REACTION_CONTAINER__SIM_LINK_STATES:
			getSimLinkStates().clear();
			getSimLinkStates().addAll((Collection<? extends SimLinkState>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ReactionContainerPackage.REACTION_CONTAINER__SIM_AGENT:
			getSimAgent().clear();
			return;
		case ReactionContainerPackage.REACTION_CONTAINER__SIM_LINK_STATES:
			getSimLinkStates().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ReactionContainerPackage.REACTION_CONTAINER__SIM_AGENT:
			return simAgent != null && !simAgent.isEmpty();
		case ReactionContainerPackage.REACTION_CONTAINER__SIM_LINK_STATES:
			return simLinkStates != null && !simLinkStates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReactionContainerImpl
