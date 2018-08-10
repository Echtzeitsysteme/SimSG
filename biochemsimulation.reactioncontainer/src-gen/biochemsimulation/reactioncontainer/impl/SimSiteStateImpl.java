/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactioncontainer.SimSiteState;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sim Site State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.SimSiteStateImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimSiteStateImpl extends DefaultPersistentEObject implements SimSiteState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimSiteStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactionContainerPackage.Literals.SIM_SITE_STATE;
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
	public String getType() {
		return (String) eGet(ReactionContainerPackage.Literals.SIM_SITE_STATE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eSet(ReactionContainerPackage.Literals.SIM_SITE_STATE__TYPE, newType);
	}

} //SimSiteStateImpl
