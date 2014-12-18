/**
 */
package robotsys.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import robotsys.RobotProxy;
import robotsys.RobotsysPackage;
import robotsys.Sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robotsys.impl.SensorImpl#getContractIdentifier <em>Contract Identifier</em>}</li>
 *   <li>{@link robotsys.impl.SensorImpl#getServiceIdentifier <em>Service Identifier</em>}</li>
 *   <li>{@link robotsys.impl.SensorImpl#getSensorPort <em>Sensor Port</em>}</li>
 *   <li>{@link robotsys.impl.SensorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link robotsys.impl.SensorImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorImpl extends RobotNodeImpl implements Sensor {
	/**
	 * The default value of the '{@link #getContractIdentifier() <em>Contract Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRACT_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContractIdentifier() <em>Contract Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String contractIdentifier = CONTRACT_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceIdentifier() <em>Service Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final long SERVICE_IDENTIFIER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getServiceIdentifier() <em>Service Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected long serviceIdentifier = SERVICE_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSensorPort() <em>Sensor Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorPort()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSOR_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensorPort() <em>Sensor Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorPort()
	 * @generated
	 * @ordered
	 */
	protected String sensorPort = SENSOR_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotsysPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContractIdentifier() {
		return contractIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContractIdentifier(String newContractIdentifier) {
		String oldContractIdentifier = contractIdentifier;
		contractIdentifier = newContractIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotsysPackage.SENSOR__CONTRACT_IDENTIFIER, oldContractIdentifier, contractIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getServiceIdentifier() {
		return serviceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceIdentifier(long newServiceIdentifier) {
		long oldServiceIdentifier = serviceIdentifier;
		serviceIdentifier = newServiceIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotsysPackage.SENSOR__SERVICE_IDENTIFIER, oldServiceIdentifier, serviceIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSensorPort() {
		return sensorPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorPort(String newSensorPort) {
		String oldSensorPort = sensorPort;
		sensorPort = newSensorPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotsysPackage.SENSOR__SENSOR_PORT, oldSensorPort, sensorPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotsysPackage.SENSOR__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotProxy getParent() {
		if (eContainerFeatureID() != RobotsysPackage.SENSOR__PARENT) return null;
		return (RobotProxy)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(RobotProxy newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, RobotsysPackage.SENSOR__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(RobotProxy newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != RobotsysPackage.SENSOR__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, RobotsysPackage.ROBOT_PROXY__SENSORCONNECTED, RobotProxy.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotsysPackage.SENSOR__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobotsysPackage.SENSOR__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((RobotProxy)otherEnd, msgs);
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
			case RobotsysPackage.SENSOR__PARENT:
				return basicSetParent(null, msgs);
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
			case RobotsysPackage.SENSOR__PARENT:
				return eInternalContainer().eInverseRemove(this, RobotsysPackage.ROBOT_PROXY__SENSORCONNECTED, RobotProxy.class, msgs);
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
			case RobotsysPackage.SENSOR__CONTRACT_IDENTIFIER:
				return getContractIdentifier();
			case RobotsysPackage.SENSOR__SERVICE_IDENTIFIER:
				return getServiceIdentifier();
			case RobotsysPackage.SENSOR__SENSOR_PORT:
				return getSensorPort();
			case RobotsysPackage.SENSOR__VALUE:
				return getValue();
			case RobotsysPackage.SENSOR__PARENT:
				return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RobotsysPackage.SENSOR__CONTRACT_IDENTIFIER:
				setContractIdentifier((String)newValue);
				return;
			case RobotsysPackage.SENSOR__SERVICE_IDENTIFIER:
				setServiceIdentifier((Long)newValue);
				return;
			case RobotsysPackage.SENSOR__SENSOR_PORT:
				setSensorPort((String)newValue);
				return;
			case RobotsysPackage.SENSOR__VALUE:
				setValue((String)newValue);
				return;
			case RobotsysPackage.SENSOR__PARENT:
				setParent((RobotProxy)newValue);
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
			case RobotsysPackage.SENSOR__CONTRACT_IDENTIFIER:
				setContractIdentifier(CONTRACT_IDENTIFIER_EDEFAULT);
				return;
			case RobotsysPackage.SENSOR__SERVICE_IDENTIFIER:
				setServiceIdentifier(SERVICE_IDENTIFIER_EDEFAULT);
				return;
			case RobotsysPackage.SENSOR__SENSOR_PORT:
				setSensorPort(SENSOR_PORT_EDEFAULT);
				return;
			case RobotsysPackage.SENSOR__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case RobotsysPackage.SENSOR__PARENT:
				setParent((RobotProxy)null);
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
			case RobotsysPackage.SENSOR__CONTRACT_IDENTIFIER:
				return CONTRACT_IDENTIFIER_EDEFAULT == null ? contractIdentifier != null : !CONTRACT_IDENTIFIER_EDEFAULT.equals(contractIdentifier);
			case RobotsysPackage.SENSOR__SERVICE_IDENTIFIER:
				return serviceIdentifier != SERVICE_IDENTIFIER_EDEFAULT;
			case RobotsysPackage.SENSOR__SENSOR_PORT:
				return SENSOR_PORT_EDEFAULT == null ? sensorPort != null : !SENSOR_PORT_EDEFAULT.equals(sensorPort);
			case RobotsysPackage.SENSOR__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case RobotsysPackage.SENSOR__PARENT:
				return getParent() != null;
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
		result.append(" (ContractIdentifier: ");
		result.append(contractIdentifier);
		result.append(", ServiceIdentifier: ");
		result.append(serviceIdentifier);
		result.append(", SensorPort: ");
		result.append(sensorPort);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
