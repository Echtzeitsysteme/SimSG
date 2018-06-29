/**
 */
package biochemsimulation.reactioncontainer.util;

import biochemsimulation.reactioncontainer.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see biochemsimulation.reactioncontainer.ReactionContainerPackage
 * @generated
 */
public class ReactionContainerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReactionContainerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionContainerSwitch() {
		if (modelPackage == null) {
			modelPackage = ReactionContainerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ReactionContainerPackage.REACTION_CONTAINER: {
			ReactionContainer reactionContainer = (ReactionContainer) theEObject;
			T result = caseReactionContainer(reactionContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReactionContainerPackage.SIM_AGENT: {
			SimAgent simAgent = (SimAgent) theEObject;
			T result = caseSimAgent(simAgent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReactionContainerPackage.SIM_SITE: {
			SimSite simSite = (SimSite) theEObject;
			T result = caseSimSite(simSite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReactionContainerPackage.SIM_SITE_STATE: {
			SimSiteState simSiteState = (SimSiteState) theEObject;
			T result = caseSimSiteState(simSiteState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReactionContainerPackage.SIM_LINK_STATE: {
			SimLinkState simLinkState = (SimLinkState) theEObject;
			T result = caseSimLinkState(simLinkState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReactionContainerPackage.SIM_BOUND: {
			SimBound simBound = (SimBound) theEObject;
			T result = caseSimBound(simBound);
			if (result == null)
				result = caseSimLinkState(simBound);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reaction Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reaction Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactionContainer(ReactionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sim Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sim Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimAgent(SimAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sim Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sim Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimSite(SimSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sim Site State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sim Site State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimSiteState(SimSiteState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sim Link State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sim Link State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimLinkState(SimLinkState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sim Bound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sim Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimBound(SimBound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ReactionContainerSwitch
