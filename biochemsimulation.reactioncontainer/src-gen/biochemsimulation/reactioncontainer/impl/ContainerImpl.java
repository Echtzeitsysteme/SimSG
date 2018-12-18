/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.Agent;
import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactioncontainer.State;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.ContainerImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.ContainerImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.ContainerImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends DefaultPersistentEObject implements biochemsimulation.reactioncontainer.Container {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactionContainerPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Agent> getAgents() {
		return (EList<Agent>) eGet(ReactionContainerPackage.Literals.CONTAINER__AGENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return (String) eGet(ReactionContainerPackage.Literals.CONTAINER__MODEL_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		eSet(ReactionContainerPackage.Literals.CONTAINER__MODEL_NAME, newModelName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<State> getStates() {
		return (EList<State>) eGet(ReactionContainerPackage.Literals.CONTAINER__STATES, true);
	}

} //ContainerImpl
