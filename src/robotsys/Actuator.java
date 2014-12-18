/**
 */
package robotsys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robotsys.Actuator#getContractIdentifier <em>Contract Identifier</em>}</li>
 *   <li>{@link robotsys.Actuator#getServiceIdentifier <em>Service Identifier</em>}</li>
 *   <li>{@link robotsys.Actuator#getMotorPort <em>Motor Port</em>}</li>
 *   <li>{@link robotsys.Actuator#getParent <em>Parent</em>}</li>
 *   <li>{@link robotsys.Actuator#getPwmMode <em>Pwm Mode</em>}</li>
 *   <li>{@link robotsys.Actuator#getMotorPower <em>Motor Power</em>}</li>
 * </ul>
 * </p>
 *
 * @see robotsys.RobotsysPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends RobotNode {
	/**
	 * Returns the value of the '<em><b>Contract Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract Identifier</em>' attribute.
	 * @see #setContractIdentifier(String)
	 * @see robotsys.RobotsysPackage#getActuator_ContractIdentifier()
	 * @model required="true"
	 * @generated
	 */
	String getContractIdentifier();

	/**
	 * Sets the value of the '{@link robotsys.Actuator#getContractIdentifier <em>Contract Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract Identifier</em>' attribute.
	 * @see #getContractIdentifier()
	 * @generated
	 */
	void setContractIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Service Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Identifier</em>' attribute.
	 * @see #setServiceIdentifier(long)
	 * @see robotsys.RobotsysPackage#getActuator_ServiceIdentifier()
	 * @model required="true"
	 * @generated
	 */
	long getServiceIdentifier();

	/**
	 * Sets the value of the '{@link robotsys.Actuator#getServiceIdentifier <em>Service Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Identifier</em>' attribute.
	 * @see #getServiceIdentifier()
	 * @generated
	 */
	void setServiceIdentifier(long value);

	/**
	 * Returns the value of the '<em><b>Motor Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motor Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor Port</em>' attribute.
	 * @see #setMotorPort(int)
	 * @see robotsys.RobotsysPackage#getActuator_MotorPort()
	 * @model required="true"
	 * @generated
	 */
	int getMotorPort();

	/**
	 * Sets the value of the '{@link robotsys.Actuator#getMotorPort <em>Motor Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motor Port</em>' attribute.
	 * @see #getMotorPort()
	 * @generated
	 */
	void setMotorPort(int value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link robotsys.RobotProxy#getActuatorconnected <em>Actuatorconnected</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(RobotProxy)
	 * @see robotsys.RobotsysPackage#getActuator_Parent()
	 * @see robotsys.RobotProxy#getActuatorconnected
	 * @model opposite="actuatorconnected" transient="false"
	 * @generated
	 */
	RobotProxy getParent();

	/**
	 * Sets the value of the '{@link robotsys.Actuator#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(RobotProxy value);

	/**
	 * Returns the value of the '<em><b>Pwm Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwm Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwm Mode</em>' attribute.
	 * @see #setPwmMode(int)
	 * @see robotsys.RobotsysPackage#getActuator_PwmMode()
	 * @model required="true"
	 * @generated
	 */
	int getPwmMode();

	/**
	 * Sets the value of the '{@link robotsys.Actuator#getPwmMode <em>Pwm Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwm Mode</em>' attribute.
	 * @see #getPwmMode()
	 * @generated
	 */
	void setPwmMode(int value);

	/**
	 * Returns the value of the '<em><b>Motor Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motor Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor Power</em>' attribute.
	 * @see #setMotorPower(float)
	 * @see robotsys.RobotsysPackage#getActuator_MotorPower()
	 * @model required="true"
	 * @generated
	 */
	float getMotorPower();

	/**
	 * Sets the value of the '{@link robotsys.Actuator#getMotorPower <em>Motor Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motor Power</em>' attribute.
	 * @see #getMotorPower()
	 * @generated
	 */
	void setMotorPower(float value);

} // Actuator
