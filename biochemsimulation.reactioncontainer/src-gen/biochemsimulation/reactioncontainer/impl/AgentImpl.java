/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.Agent;
import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.AgentImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentImpl extends DefaultPersistentEObject implements Agent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactionContainerPackage.Literals.AGENT;
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
	public long getID() {
		return (Long) eGet(ReactionContainerPackage.Literals.AGENT__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(long newID) {
		eSet(ReactionContainerPackage.Literals.AGENT__ID, newID);
	}

} //AgentImpl
