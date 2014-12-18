/**
 */
package robotsys.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import robotsys.Actuator;
import robotsys.Registration;
import robotsys.RobotNode;
import robotsys.RobotProxy;
import robotsys.RobotsysFactory;
import robotsys.RobotsysPackage;
import robotsys.Sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotsysPackageImpl extends EPackageImpl implements RobotsysPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotProxyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see robotsys.RobotsysPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RobotsysPackageImpl() {
		super(eNS_URI, RobotsysFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RobotsysPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RobotsysPackage init() {
		if (isInited) return (RobotsysPackage)EPackage.Registry.INSTANCE.getEPackage(RobotsysPackage.eNS_URI);

		// Obtain or create and register package
		RobotsysPackageImpl theRobotsysPackage = (RobotsysPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RobotsysPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RobotsysPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRobotsysPackage.createPackageContents();

		// Initialize created meta-data
		theRobotsysPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRobotsysPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RobotsysPackage.eNS_URI, theRobotsysPackage);
		return theRobotsysPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_ContractIdentifier() {
		return (EAttribute)actuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_ServiceIdentifier() {
		return (EAttribute)actuatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_MotorPort() {
		return (EAttribute)actuatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuator_Parent() {
		return (EReference)actuatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_PwmMode() {
		return (EAttribute)actuatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_MotorPower() {
		return (EAttribute)actuatorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_ContractIdentifier() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_ServiceIdentifier() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_SensorPort() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Value() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Parent() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistration() {
		return registrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistration_Id() {
		return (EAttribute)registrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistration_Name() {
		return (EAttribute)registrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistration_Robotnodes() {
		return (EReference)registrationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobotNode() {
		return robotNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotNode_Id() {
		return (EAttribute)robotNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotNode_Name() {
		return (EAttribute)robotNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobotProxy() {
		return robotProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotProxy_Avaliable() {
		return (EAttribute)robotProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotProxy_Connectiontype() {
		return (EAttribute)robotProxyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotProxy_Batteryvoltage() {
		return (EAttribute)robotProxyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotProxy_Parent() {
		return (EReference)robotProxyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotProxy_Sensorconnected() {
		return (EReference)robotProxyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotProxy_Actuatorconnected() {
		return (EReference)robotProxyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotsysFactory getRobotsysFactory() {
		return (RobotsysFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		actuatorEClass = createEClass(ACTUATOR);
		createEAttribute(actuatorEClass, ACTUATOR__CONTRACT_IDENTIFIER);
		createEAttribute(actuatorEClass, ACTUATOR__SERVICE_IDENTIFIER);
		createEAttribute(actuatorEClass, ACTUATOR__MOTOR_PORT);
		createEReference(actuatorEClass, ACTUATOR__PARENT);
		createEAttribute(actuatorEClass, ACTUATOR__PWM_MODE);
		createEAttribute(actuatorEClass, ACTUATOR__MOTOR_POWER);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__CONTRACT_IDENTIFIER);
		createEAttribute(sensorEClass, SENSOR__SERVICE_IDENTIFIER);
		createEAttribute(sensorEClass, SENSOR__SENSOR_PORT);
		createEAttribute(sensorEClass, SENSOR__VALUE);
		createEReference(sensorEClass, SENSOR__PARENT);

		registrationEClass = createEClass(REGISTRATION);
		createEAttribute(registrationEClass, REGISTRATION__ID);
		createEAttribute(registrationEClass, REGISTRATION__NAME);
		createEReference(registrationEClass, REGISTRATION__ROBOTNODES);

		robotNodeEClass = createEClass(ROBOT_NODE);
		createEAttribute(robotNodeEClass, ROBOT_NODE__ID);
		createEAttribute(robotNodeEClass, ROBOT_NODE__NAME);

		robotProxyEClass = createEClass(ROBOT_PROXY);
		createEAttribute(robotProxyEClass, ROBOT_PROXY__AVALIABLE);
		createEAttribute(robotProxyEClass, ROBOT_PROXY__CONNECTIONTYPE);
		createEAttribute(robotProxyEClass, ROBOT_PROXY__BATTERYVOLTAGE);
		createEReference(robotProxyEClass, ROBOT_PROXY__PARENT);
		createEReference(robotProxyEClass, ROBOT_PROXY__SENSORCONNECTED);
		createEReference(robotProxyEClass, ROBOT_PROXY__ACTUATORCONNECTED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actuatorEClass.getESuperTypes().add(this.getRobotNode());
		sensorEClass.getESuperTypes().add(this.getRobotNode());
		registrationEClass.getESuperTypes().add(ecorePackage.getEModelElement());
		robotNodeEClass.getESuperTypes().add(ecorePackage.getEModelElement());
		robotProxyEClass.getESuperTypes().add(this.getRobotNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuator_ContractIdentifier(), ecorePackage.getEString(), "ContractIdentifier", null, 1, 1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuator_ServiceIdentifier(), ecorePackage.getELong(), "ServiceIdentifier", null, 1, 1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuator_MotorPort(), ecorePackage.getEInt(), "MotorPort", null, 1, 1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActuator_Parent(), this.getRobotProxy(), this.getRobotProxy_Actuatorconnected(), "parent", null, 0, 1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuator_PwmMode(), ecorePackage.getEInt(), "pwmMode", null, 1, 1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuator_MotorPower(), ecorePackage.getEFloat(), "motorPower", null, 1, 1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_ContractIdentifier(), ecorePackage.getEString(), "ContractIdentifier", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_ServiceIdentifier(), ecorePackage.getELong(), "ServiceIdentifier", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_SensorPort(), ecorePackage.getEString(), "SensorPort", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Value(), ecorePackage.getEString(), "value", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Parent(), this.getRobotProxy(), this.getRobotProxy_Sensorconnected(), "parent", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registrationEClass, Registration.class, "Registration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistration_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistration_Robotnodes(), this.getRobotProxy(), this.getRobotProxy_Parent(), "robotnodes", null, 0, -1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(robotNodeEClass, RobotNode.class, "RobotNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRobotNode_Id(), ecorePackage.getELong(), "id", null, 1, 1, RobotNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotNode_Name(), ecorePackage.getEString(), "name", null, 1, 1, RobotNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(robotProxyEClass, RobotProxy.class, "RobotProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRobotProxy_Avaliable(), ecorePackage.getEBoolean(), "avaliable", null, 1, 1, RobotProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotProxy_Connectiontype(), ecorePackage.getEString(), "connectiontype", null, 1, 1, RobotProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotProxy_Batteryvoltage(), ecorePackage.getEFloat(), "batteryvoltage", null, 1, 1, RobotProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotProxy_Parent(), this.getRegistration(), this.getRegistration_Robotnodes(), "parent", null, 0, 1, RobotProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotProxy_Sensorconnected(), this.getSensor(), this.getSensor_Parent(), "sensorconnected", null, 0, -1, RobotProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotProxy_Actuatorconnected(), this.getActuator(), this.getActuator_Parent(), "actuatorconnected", null, 1, -1, RobotProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RobotsysPackageImpl
