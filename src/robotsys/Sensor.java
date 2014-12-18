/**
 */
package robotsys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robotsys.Sensor#getContractIdentifier <em>Contract Identifier</em>}</li>
 *   <li>{@link robotsys.Sensor#getServiceIdentifier <em>Service Identifier</em>}</li>
 *   <li>{@link robotsys.Sensor#getSensorPort <em>Sensor Port</em>}</li>
 *   <li>{@link robotsys.Sensor#getValue <em>Value</em>}</li>
 *   <li>{@link robotsys.Sensor#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see robotsys.RobotsysPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends RobotNode {
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
	 * @see robotsys.RobotsysPackage#getSensor_ContractIdentifier()
	 * @model required="true"
	 * @generated
	 */
	String getContractIdentifier();

	/**
	 * Sets the value of the '{@link robotsys.Sensor#getContractIdentifier <em>Contract Identifier</em>}' attribute.
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
	 * @see robotsys.RobotsysPackage#getSensor_ServiceIdentifier()
	 * @model required="true"
	 * @generated
	 */
	long getServiceIdentifier();

	/**
	 * Sets the value of the '{@link robotsys.Sensor#getServiceIdentifier <em>Service Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Identifier</em>' attribute.
	 * @see #getServiceIdentifier()
	 * @generated
	 */
	void setServiceIdentifier(long value);

	/**
	 * Returns the value of the '<em><b>Sensor Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Port</em>' attribute.
	 * @see #setSensorPort(String)
	 * @see robotsys.RobotsysPackage#getSensor_SensorPort()
	 * @model required="true"
	 * @generated
	 */
	String getSensorPort();

	/**
	 * Sets the value of the '{@link robotsys.Sensor#getSensorPort <em>Sensor Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Port</em>' attribute.
	 * @see #getSensorPort()
	 * @generated
	 */
	void setSensorPort(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see robotsys.RobotsysPackage#getSensor_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link robotsys.Sensor#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link robotsys.RobotProxy#getSensorconnected <em>Sensorconnected</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(RobotProxy)
	 * @see robotsys.RobotsysPackage#getSensor_Parent()
	 * @see robotsys.RobotProxy#getSensorconnected
	 * @model opposite="sensorconnected" transient="false"
	 * @generated
	 */
	RobotProxy getParent();

	/**
	 * Sets the value of the '{@link robotsys.Sensor#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(RobotProxy value);

} // Sensor
