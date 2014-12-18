/**
 */
package robotsys.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.InternalEList;
import robotsys.Actuator;
import robotsys.Registration;
import robotsys.RobotProxy;
import robotsys.RobotsysPackage;
import robotsys.Sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robotsys.impl.RobotProxyImpl#isAvaliable <em>Avaliable</em>}</li>
 *   <li>{@link robotsys.impl.RobotProxyImpl#getConnectiontype <em>Connectiontype</em>}</li>
 *   <li>{@link robotsys.impl.RobotProxyImpl#getBatteryvoltage <em>Batteryvoltage</em>}</li>
 *   <li>{@link robotsys.impl.RobotProxyImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link robotsys.impl.RobotProxyImpl#getSensorconnected <em>Sensorconnected</em>}</li>
 *   <li>{@link robotsys.impl.RobotProxyImpl#getActuatorconnected <em>Actuatorconnected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RobotProxyImpl extends RobotNodeImpl implements RobotProxy {
	/**
	 * The default value of the '{@link #isAvaliable() <em>Avaliable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvaliable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVALIABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAvaliable() <em>Avaliable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvaliable()
	 * @generated
	 * @ordered
	 */
	protected boolean avaliable = AVALIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectiontype() <em>Connectiontype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectiontype()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTIONTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectiontype() <em>Connectiontype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectiontype()
	 * @generated
	 * @ordered
	 */
	protected String connectiontype = CONNECTIONTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatteryvoltage() <em>Batteryvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryvoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float BATTERYVOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBatteryvoltage() <em>Batteryvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryvoltage()
	 * @generated
	 * @ordered
	 */
	protected float batteryvoltage = BATTERYVOLTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSensorconnected() <em>Sensorconnected</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorconnected()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensorconnected;

	/**
	 * The cached value of the '{@link #getActuatorconnected() <em>Actuatorconnected</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorconnected()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> actuatorconnected;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotsysPackage.Literals.ROBOT_PROXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvaliable() {
		return avaliable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvaliable(boolean newAvaliable) {
		boolean oldAvaliable = avaliable;
		avaliable = newAvaliable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotsysPackage.ROBOT_PROXY__AVALIABLE, oldAvaliable, avaliable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectiontype() {
		return connectiontype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectiontype(String newConnectiontype) {
		String oldConnectiontype = connectiontype;
		connectiontype = newConnectiontype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotsysPackage.ROBOT_PROXY__CONNECTIONTYPE, oldConnectiontype, connectiontype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBatteryvoltage() {
		return batteryvoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatteryvoltage(float newBatteryvoltage) {
		float oldBatteryvoltage = batteryvoltage;
		batteryvoltage = newBatteryvoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotsysPackage.ROBOT_PROXY__BATTERYVOLTAGE, oldBatteryvoltage, batteryvoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Registration getParent() {
		if (eContainerFeatureID() != RobotsysPackage.ROBOT_PROXY__PARENT) return null;
		return (Registration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Registration newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, RobotsysPackage.ROBOT_PROXY__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Registration newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != RobotsysPackage.ROBOT_PROXY__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, RobotsysPackage.REGISTRATION__ROBOTNODES, Registration.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotsysPackage.ROBOT_PROXY__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensorconnected() {
		if (sensorconnected == null) {
			sensorconnected = new EObjectContainmentWithInverseEList<Sensor>(Sensor.class, this, RobotsysPackage.ROBOT_PROXY__SENSORCONNECTED, RobotsysPackage.SENSOR__PARENT);
		}
		return sensorconnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuator> getActuatorconnected() {
		if (actuatorconnected == null) {
			actuatorconnected = new EObjectContainmentWithInverseEList<Actuator>(Actuator.class, this, RobotsysPackage.ROBOT_PROXY__ACTUATORCONNECTED, RobotsysPackage.ACTUATOR__PARENT);
		}
		return actuatorconnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobotsysPackage.ROBOT_PROXY__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Registration)otherEnd, msgs);
			case RobotsysPackage.ROBOT_PROXY__SENSORCONNECTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensorconnected()).basicAdd(otherEnd, msgs);
			case RobotsysPackage.ROBOT_PROXY__ACTUATORCONNECTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActuatorconnected()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobotsysPackage.ROBOT_PROXY__PARENT:
				return basicSetParent(null, msgs);
			case RobotsysPackage.ROBOT_PROXY__SENSORCONNECTED:
				return ((InternalEList<?>)getSensorconnected()).basicRemove(otherEnd, msgs);
			case RobotsysPackage.ROBOT_PROXY__ACTUATORCONNECTED:
				return ((InternalEList<?>)getActuatorconnected()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RobotsysPackage.ROBOT_PROXY__PARENT:
				return eInternalContainer().eInverseRemove(this, RobotsysPackage.REGISTRATION__ROBOTNODES, Registration.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RobotsysPackage.ROBOT_PROXY__AVALIABLE:
				return isAvaliable();
			case RobotsysPackage.ROBOT_PROXY__CONNECTIONTYPE:
				return getConnectiontype();
			case RobotsysPackage.ROBOT_PROXY__BATTERYVOLTAGE:
				return getBatteryvoltage();
			case RobotsysPackage.ROBOT_PROXY__PARENT:
				return getParent();
			case RobotsysPackage.ROBOT_PROXY__SENSORCONNECTED:
				return getSensorconnected();
			case RobotsysPackage.ROBOT_PROXY__ACTUATORCONNECTED:
				return getActuatorconnected();
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
			case RobotsysPackage.ROBOT_PROXY__AVALIABLE:
				setAvaliable((Boolean)newValue);
				return;
			case RobotsysPackage.ROBOT_PROXY__CONNECTIONTYPE:
				setConnectiontype((String)newValue);
				return;
			case RobotsysPackage.ROBOT_PROXY__BATTERYVOLTAGE:
				setBatteryvoltage((Float)newValue);
				return;
			case RobotsysPackage.ROBOT_PROXY__PARENT:
				setParent((Registration)newValue);
				return;
			case RobotsysPackage.ROBOT_PROXY__SENSORCONNECTED:
				getSensorconnected().clear();
				getSensorconnected().addAll((Collection<? extends Sensor>)newValue);
				return;
			case RobotsysPackage.ROBOT_PROXY__ACTUATORCONNECTED:
				getActuatorconnected().clear();
				getActuatorconnected().addAll((Collection<? extends Actuator>)newValue);
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
			case RobotsysPackage.ROBOT_PROXY__AVALIABLE:
				setAvaliable(AVALIABLE_EDEFAULT);
				return;
			case RobotsysPackage.ROBOT_PROXY__CONNECTIONTYPE:
				setConnectiontype(CONNECTIONTYPE_EDEFAULT);
				return;
			case RobotsysPackage.ROBOT_PROXY__BATTERYVOLTAGE:
				setBatteryvoltage(BATTERYVOLTAGE_EDEFAULT);
				return;
			case RobotsysPackage.ROBOT_PROXY__PARENT:
				setParent((Registration)null);
				return;
			case RobotsysPackage.ROBOT_PROXY__SENSORCONNECTED:
				getSensorconnected().clear();
				return;
			case RobotsysPackage.ROBOT_PROXY__ACTUATORCONNECTED:
				getActuatorconnected().clear();
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
			case RobotsysPackage.ROBOT_PROXY__AVALIABLE:
				return avaliable != AVALIABLE_EDEFAULT;
			case RobotsysPackage.ROBOT_PROXY__CONNECTIONTYPE:
				return CONNECTIONTYPE_EDEFAULT == null ? connectiontype != null : !CONNECTIONTYPE_EDEFAULT.equals(connectiontype);
			case RobotsysPackage.ROBOT_PROXY__BATTERYVOLTAGE:
				return batteryvoltage != BATTERYVOLTAGE_EDEFAULT;
			case RobotsysPackage.ROBOT_PROXY__PARENT:
				return getParent() != null;
			case RobotsysPackage.ROBOT_PROXY__SENSORCONNECTED:
				return sensorconnected != null && !sensorconnected.isEmpty();
			case RobotsysPackage.ROBOT_PROXY__ACTUATORCONNECTED:
				return actuatorconnected != null && !actuatorconnected.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (avaliable: ");
		result.append(avaliable);
		result.append(", connectiontype: ");
		result.append(connectiontype);
		result.append(", batteryvoltage: ");
		result.append(batteryvoltage);
		result.append(')');
		return result.toString();
	}

} //RobotProxyImpl
