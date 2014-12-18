/**
 */
package robotsys.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import robotsys.Actuator;
import robotsys.RobotProxy;
import robotsys.RobotsysPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robotsys.impl.ActuatorImpl#getContractIdentifier <em>Contract Identifier</em>}</li>
 *   <li>{@link robotsys.impl.ActuatorImpl#getServiceIdentifier <em>Service Identifier</em>}</li>
 *   <li>{@link robotsys.impl.ActuatorImpl#getMotorPort <em>Motor Port</em>}</li>
 *   <li>{@link robotsys.impl.ActuatorImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link robotsys.impl.ActuatorImpl#getPwmMode <em>Pwm Mode</em>}</li>
 *   <li>{@link robotsys.impl.ActuatorImpl#getMotorPower <em>Motor Power</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActuatorImpl extends RobotNodeImpl implements Actuator {
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
	 * The default value of the '{@link #getMotorPort() <em>Motor Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotorPort()
	 * @generated
	 * @ordered
	 */
	protected static final int MOTOR_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMotorPort() <em>Motor Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotorPort()
	 * @generated
	 * @ordered
	 */
	protected int motorPort = MOTOR_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPwmMode() <em>Pwm Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwmMode()
	 * @generated
	 * @ordered
	 */
	protected static final int PWM_MODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPwmMode() <em>Pwm Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwmMode()
	 * @generated
	 * @ordered
	 */
	protected int pwmMode = PWM_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotorPower() <em>Motor Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotorPower()
	 * @generated
	 * @ordered
	 */
	protected static final float MOTOR_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMotorPower() <em>Motor Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotorPower()
	 * @generated
	 * @ordered
	 */
	protected float motorPower = MOTOR_POWER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotsysPackage.Literals.ACTUATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RobotsysPackage.ACTUATOR__CONTRACT_IDENTIFIER, oldContractIdentifier, contractIdentifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RobotsysPackage.ACTUATOR__SERVICE_IDENTIFIER, oldServiceIdentifier, serviceIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMotorPort() {
		return motorPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotorPort(int newMotorPort) {
		int oldMotorPort = motorPort;
		motorPort = newMotorPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotsysPackage.ACTUATOR__MOTOR_PORT, oldMotorPort, motorPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotProxy getParent() {
		if (eContainerFeatureID() != RobotsysPackage.ACTUATOR__PARENT) return null;
		return (RobotProxy)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(RobotProxy newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, RobotsysPackage.ACTUATOR__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(RobotProxy newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != RobotsysPackage.ACTUATOR__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, RobotsysPackage.ROBOT_PROXY__ACTUATORCONNECTED, RobotProxy.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotsysPackage.ACTUATOR__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPwmMode() {
		return pwmMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwmMode(int newPwmMode) {
		int oldPwmMode = pwmMode;
		pwmMode = newPwmMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotsysPackage.ACTUATOR__PWM_MODE, oldPwmMode, pwmMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMotorPower() {
		return motorPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotorPower(float newMotorPower) {
		float oldMotorPower = motorPower;
		motorPower = newMotorPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotsysPackage.ACTUATOR__MOTOR_POWER, oldMotorPower, motorPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobotsysPackage.ACTUATOR__PARENT:
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
			case RobotsysPackage.ACTUATOR__PARENT:
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
			case RobotsysPackage.ACTUATOR__PARENT:
				return eInternalContainer().eInverseRemove(this, RobotsysPackage.ROBOT_PROXY__ACTUATORCONNECTED, RobotProxy.class, msgs);
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
			case RobotsysPackage.ACTUATOR__CONTRACT_IDENTIFIER:
				return getContractIdentifier();
			case RobotsysPackage.ACTUATOR__SERVICE_IDENTIFIER:
				return getServiceIdentifier();
			case RobotsysPackage.ACTUATOR__MOTOR_PORT:
				return getMotorPort();
			case RobotsysPackage.ACTUATOR__PARENT:
				return getParent();
			case RobotsysPackage.ACTUATOR__PWM_MODE:
				return getPwmMode();
			case RobotsysPackage.ACTUATOR__MOTOR_POWER:
				return getMotorPower();
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
			case RobotsysPackage.ACTUATOR__CONTRACT_IDENTIFIER:
				setContractIdentifier((String)newValue);
				return;
			case RobotsysPackage.ACTUATOR__SERVICE_IDENTIFIER:
				setServiceIdentifier((Long)newValue);
				return;
			case RobotsysPackage.ACTUATOR__MOTOR_PORT:
				setMotorPort((Integer)newValue);
				return;
			case RobotsysPackage.ACTUATOR__PARENT:
				setParent((RobotProxy)newValue);
				return;
			case RobotsysPackage.ACTUATOR__PWM_MODE:
				setPwmMode((Integer)newValue);
				return;
			case RobotsysPackage.ACTUATOR__MOTOR_POWER:
				setMotorPower((Float)newValue);
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
			case RobotsysPackage.ACTUATOR__CONTRACT_IDENTIFIER:
				setContractIdentifier(CONTRACT_IDENTIFIER_EDEFAULT);
				return;
			case RobotsysPackage.ACTUATOR__SERVICE_IDENTIFIER:
				setServiceIdentifier(SERVICE_IDENTIFIER_EDEFAULT);
				return;
			case RobotsysPackage.ACTUATOR__MOTOR_PORT:
				setMotorPort(MOTOR_PORT_EDEFAULT);
				return;
			case RobotsysPackage.ACTUATOR__PARENT:
				setParent((RobotProxy)null);
				return;
			case RobotsysPackage.ACTUATOR__PWM_MODE:
				setPwmMode(PWM_MODE_EDEFAULT);
				return;
			case RobotsysPackage.ACTUATOR__MOTOR_POWER:
				setMotorPower(MOTOR_POWER_EDEFAULT);
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
			case RobotsysPackage.ACTUATOR__CONTRACT_IDENTIFIER:
				return CONTRACT_IDENTIFIER_EDEFAULT == null ? contractIdentifier != null : !CONTRACT_IDENTIFIER_EDEFAULT.equals(contractIdentifier);
			case RobotsysPackage.ACTUATOR__SERVICE_IDENTIFIER:
				return serviceIdentifier != SERVICE_IDENTIFIER_EDEFAULT;
			case RobotsysPackage.ACTUATOR__MOTOR_PORT:
				return motorPort != MOTOR_PORT_EDEFAULT;
			case RobotsysPackage.ACTUATOR__PARENT:
				return getParent() != null;
			case RobotsysPackage.ACTUATOR__PWM_MODE:
				return pwmMode != PWM_MODE_EDEFAULT;
			case RobotsysPackage.ACTUATOR__MOTOR_POWER:
				return motorPower != MOTOR_POWER_EDEFAULT;
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
		result.append(", MotorPort: ");
		result.append(motorPort);
		result.append(", pwmMode: ");
		result.append(pwmMode);
		result.append(", motorPower: ");
		result.append(motorPower);
		result.append(')');
		return result.toString();
	}

} //ActuatorImpl
