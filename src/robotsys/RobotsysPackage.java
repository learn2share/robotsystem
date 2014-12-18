/**
 */
package robotsys;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robotsys.RobotsysFactory
 * @model kind="package"
 * @generated
 */
public interface RobotsysPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robotsys";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.zstu.edu.cn/robot/robotsys";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robotsys";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotsysPackage eINSTANCE = robotsys.impl.RobotsysPackageImpl.init();

	/**
	 * The meta object id for the '{@link robotsys.impl.RobotNodeImpl <em>Robot Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotsys.impl.RobotNodeImpl
	 * @see robotsys.impl.RobotsysPackageImpl#getRobotNode()
	 * @generated
	 */
	int ROBOT_NODE = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_NODE__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_NODE__ID = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_NODE__NAME = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Robot Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_NODE_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_NODE___GET_EANNOTATION__STRING = EcorePackage.EMODEL_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Robot Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_NODE_OPERATION_COUNT = EcorePackage.EMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotsys.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotsys.impl.ActuatorImpl
	 * @see robotsys.impl.RobotsysPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__EANNOTATIONS = ROBOT_NODE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ID = ROBOT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = ROBOT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Contract Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__CONTRACT_IDENTIFIER = ROBOT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__SERVICE_IDENTIFIER = ROBOT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Motor Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__MOTOR_PORT = ROBOT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PARENT = ROBOT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pwm Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PWM_MODE = ROBOT_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Motor Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__MOTOR_POWER = ROBOT_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = ROBOT_NODE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___GET_EANNOTATION__STRING = ROBOT_NODE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = ROBOT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotsys.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotsys.impl.SensorImpl
	 * @see robotsys.impl.RobotsysPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__EANNOTATIONS = ROBOT_NODE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = ROBOT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = ROBOT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Contract Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONTRACT_IDENTIFIER = ROBOT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SERVICE_IDENTIFIER = ROBOT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensor Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSOR_PORT = ROBOT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__VALUE = ROBOT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PARENT = ROBOT_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = ROBOT_NODE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___GET_EANNOTATION__STRING = ROBOT_NODE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = ROBOT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotsys.impl.RegistrationImpl <em>Registration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotsys.impl.RegistrationImpl
	 * @see robotsys.impl.RobotsysPackageImpl#getRegistration()
	 * @generated
	 */
	int REGISTRATION = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__ID = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__NAME = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Robotnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__ROBOTNODES = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION___GET_EANNOTATION__STRING = EcorePackage.EMODEL_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_OPERATION_COUNT = EcorePackage.EMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotsys.impl.RobotProxyImpl <em>Robot Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotsys.impl.RobotProxyImpl
	 * @see robotsys.impl.RobotsysPackageImpl#getRobotProxy()
	 * @generated
	 */
	int ROBOT_PROXY = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROXY__EANNOTATIONS = ROBOT_NODE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROXY__ID = ROBOT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROXY__NAME = ROBOT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Avaliable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROXY__AVALIABLE = ROBOT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectiontype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROXY__CONNECTIONTYPE = ROBOT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Batteryvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROXY__BATTERYVOLTAGE = ROBOT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROXY__PARENT = ROBOT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sensorconnected</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROXY__SENSORCONNECTED = ROBOT_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actuatorconnected</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROXY__ACTUATORCONNECTED = ROBOT_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Robot Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROXY_FEATURE_COUNT = ROBOT_NODE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROXY___GET_EANNOTATION__STRING = ROBOT_NODE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Robot Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROXY_OPERATION_COUNT = ROBOT_NODE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link robotsys.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see robotsys.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.Actuator#getContractIdentifier <em>Contract Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contract Identifier</em>'.
	 * @see robotsys.Actuator#getContractIdentifier()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_ContractIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.Actuator#getServiceIdentifier <em>Service Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Identifier</em>'.
	 * @see robotsys.Actuator#getServiceIdentifier()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_ServiceIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.Actuator#getMotorPort <em>Motor Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motor Port</em>'.
	 * @see robotsys.Actuator#getMotorPort()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_MotorPort();

	/**
	 * Returns the meta object for the container reference '{@link robotsys.Actuator#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see robotsys.Actuator#getParent()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Parent();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.Actuator#getPwmMode <em>Pwm Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwm Mode</em>'.
	 * @see robotsys.Actuator#getPwmMode()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_PwmMode();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.Actuator#getMotorPower <em>Motor Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motor Power</em>'.
	 * @see robotsys.Actuator#getMotorPower()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_MotorPower();

	/**
	 * Returns the meta object for class '{@link robotsys.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see robotsys.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.Sensor#getContractIdentifier <em>Contract Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contract Identifier</em>'.
	 * @see robotsys.Sensor#getContractIdentifier()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_ContractIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.Sensor#getServiceIdentifier <em>Service Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Identifier</em>'.
	 * @see robotsys.Sensor#getServiceIdentifier()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_ServiceIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.Sensor#getSensorPort <em>Sensor Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Port</em>'.
	 * @see robotsys.Sensor#getSensorPort()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_SensorPort();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.Sensor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robotsys.Sensor#getValue()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Value();

	/**
	 * Returns the meta object for the container reference '{@link robotsys.Sensor#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see robotsys.Sensor#getParent()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Parent();

	/**
	 * Returns the meta object for class '{@link robotsys.Registration <em>Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registration</em>'.
	 * @see robotsys.Registration
	 * @generated
	 */
	EClass getRegistration();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.Registration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see robotsys.Registration#getId()
	 * @see #getRegistration()
	 * @generated
	 */
	EAttribute getRegistration_Id();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.Registration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robotsys.Registration#getName()
	 * @see #getRegistration()
	 * @generated
	 */
	EAttribute getRegistration_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link robotsys.Registration#getRobotnodes <em>Robotnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Robotnodes</em>'.
	 * @see robotsys.Registration#getRobotnodes()
	 * @see #getRegistration()
	 * @generated
	 */
	EReference getRegistration_Robotnodes();

	/**
	 * Returns the meta object for class '{@link robotsys.RobotNode <em>Robot Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot Node</em>'.
	 * @see robotsys.RobotNode
	 * @generated
	 */
	EClass getRobotNode();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.RobotNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see robotsys.RobotNode#getId()
	 * @see #getRobotNode()
	 * @generated
	 */
	EAttribute getRobotNode_Id();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.RobotNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robotsys.RobotNode#getName()
	 * @see #getRobotNode()
	 * @generated
	 */
	EAttribute getRobotNode_Name();

	/**
	 * Returns the meta object for class '{@link robotsys.RobotProxy <em>Robot Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot Proxy</em>'.
	 * @see robotsys.RobotProxy
	 * @generated
	 */
	EClass getRobotProxy();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.RobotProxy#isAvaliable <em>Avaliable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avaliable</em>'.
	 * @see robotsys.RobotProxy#isAvaliable()
	 * @see #getRobotProxy()
	 * @generated
	 */
	EAttribute getRobotProxy_Avaliable();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.RobotProxy#getConnectiontype <em>Connectiontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connectiontype</em>'.
	 * @see robotsys.RobotProxy#getConnectiontype()
	 * @see #getRobotProxy()
	 * @generated
	 */
	EAttribute getRobotProxy_Connectiontype();

	/**
	 * Returns the meta object for the attribute '{@link robotsys.RobotProxy#getBatteryvoltage <em>Batteryvoltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batteryvoltage</em>'.
	 * @see robotsys.RobotProxy#getBatteryvoltage()
	 * @see #getRobotProxy()
	 * @generated
	 */
	EAttribute getRobotProxy_Batteryvoltage();

	/**
	 * Returns the meta object for the container reference '{@link robotsys.RobotProxy#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see robotsys.RobotProxy#getParent()
	 * @see #getRobotProxy()
	 * @generated
	 */
	EReference getRobotProxy_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link robotsys.RobotProxy#getSensorconnected <em>Sensorconnected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensorconnected</em>'.
	 * @see robotsys.RobotProxy#getSensorconnected()
	 * @see #getRobotProxy()
	 * @generated
	 */
	EReference getRobotProxy_Sensorconnected();

	/**
	 * Returns the meta object for the containment reference list '{@link robotsys.RobotProxy#getActuatorconnected <em>Actuatorconnected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actuatorconnected</em>'.
	 * @see robotsys.RobotProxy#getActuatorconnected()
	 * @see #getRobotProxy()
	 * @generated
	 */
	EReference getRobotProxy_Actuatorconnected();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobotsysFactory getRobotsysFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robotsys.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotsys.impl.ActuatorImpl
		 * @see robotsys.impl.RobotsysPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Contract Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__CONTRACT_IDENTIFIER = eINSTANCE.getActuator_ContractIdentifier();

		/**
		 * The meta object literal for the '<em><b>Service Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__SERVICE_IDENTIFIER = eINSTANCE.getActuator_ServiceIdentifier();

		/**
		 * The meta object literal for the '<em><b>Motor Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__MOTOR_PORT = eINSTANCE.getActuator_MotorPort();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__PARENT = eINSTANCE.getActuator_Parent();

		/**
		 * The meta object literal for the '<em><b>Pwm Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__PWM_MODE = eINSTANCE.getActuator_PwmMode();

		/**
		 * The meta object literal for the '<em><b>Motor Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__MOTOR_POWER = eINSTANCE.getActuator_MotorPower();

		/**
		 * The meta object literal for the '{@link robotsys.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotsys.impl.SensorImpl
		 * @see robotsys.impl.RobotsysPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Contract Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__CONTRACT_IDENTIFIER = eINSTANCE.getSensor_ContractIdentifier();

		/**
		 * The meta object literal for the '<em><b>Service Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__SERVICE_IDENTIFIER = eINSTANCE.getSensor_ServiceIdentifier();

		/**
		 * The meta object literal for the '<em><b>Sensor Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__SENSOR_PORT = eINSTANCE.getSensor_SensorPort();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__VALUE = eINSTANCE.getSensor_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__PARENT = eINSTANCE.getSensor_Parent();

		/**
		 * The meta object literal for the '{@link robotsys.impl.RegistrationImpl <em>Registration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotsys.impl.RegistrationImpl
		 * @see robotsys.impl.RobotsysPackageImpl#getRegistration()
		 * @generated
		 */
		EClass REGISTRATION = eINSTANCE.getRegistration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION__ID = eINSTANCE.getRegistration_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION__NAME = eINSTANCE.getRegistration_Name();

		/**
		 * The meta object literal for the '<em><b>Robotnodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION__ROBOTNODES = eINSTANCE.getRegistration_Robotnodes();

		/**
		 * The meta object literal for the '{@link robotsys.impl.RobotNodeImpl <em>Robot Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotsys.impl.RobotNodeImpl
		 * @see robotsys.impl.RobotsysPackageImpl#getRobotNode()
		 * @generated
		 */
		EClass ROBOT_NODE = eINSTANCE.getRobotNode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_NODE__ID = eINSTANCE.getRobotNode_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_NODE__NAME = eINSTANCE.getRobotNode_Name();

		/**
		 * The meta object literal for the '{@link robotsys.impl.RobotProxyImpl <em>Robot Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotsys.impl.RobotProxyImpl
		 * @see robotsys.impl.RobotsysPackageImpl#getRobotProxy()
		 * @generated
		 */
		EClass ROBOT_PROXY = eINSTANCE.getRobotProxy();

		/**
		 * The meta object literal for the '<em><b>Avaliable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_PROXY__AVALIABLE = eINSTANCE.getRobotProxy_Avaliable();

		/**
		 * The meta object literal for the '<em><b>Connectiontype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_PROXY__CONNECTIONTYPE = eINSTANCE.getRobotProxy_Connectiontype();

		/**
		 * The meta object literal for the '<em><b>Batteryvoltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_PROXY__BATTERYVOLTAGE = eINSTANCE.getRobotProxy_Batteryvoltage();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_PROXY__PARENT = eINSTANCE.getRobotProxy_Parent();

		/**
		 * The meta object literal for the '<em><b>Sensorconnected</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_PROXY__SENSORCONNECTED = eINSTANCE.getRobotProxy_Sensorconnected();

		/**
		 * The meta object literal for the '<em><b>Actuatorconnected</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_PROXY__ACTUATORCONNECTED = eINSTANCE.getRobotProxy_Actuatorconnected();

	}

} //RobotsysPackage
