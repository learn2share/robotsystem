/**
 */
package robotsys;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robotsys.RobotProxy#isAvaliable <em>Avaliable</em>}</li>
 *   <li>{@link robotsys.RobotProxy#getConnectiontype <em>Connectiontype</em>}</li>
 *   <li>{@link robotsys.RobotProxy#getBatteryvoltage <em>Batteryvoltage</em>}</li>
 *   <li>{@link robotsys.RobotProxy#getParent <em>Parent</em>}</li>
 *   <li>{@link robotsys.RobotProxy#getSensorconnected <em>Sensorconnected</em>}</li>
 *   <li>{@link robotsys.RobotProxy#getActuatorconnected <em>Actuatorconnected</em>}</li>
 * </ul>
 * </p>
 *
 * @see robotsys.RobotsysPackage#getRobotProxy()
 * @model
 * @generated
 */
public interface RobotProxy extends RobotNode {
	/**
	 * Returns the value of the '<em><b>Avaliable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avaliable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avaliable</em>' attribute.
	 * @see #setAvaliable(boolean)
	 * @see robotsys.RobotsysPackage#getRobotProxy_Avaliable()
	 * @model required="true"
	 * @generated
	 */
	boolean isAvaliable();

	/**
	 * Sets the value of the '{@link robotsys.RobotProxy#isAvaliable <em>Avaliable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avaliable</em>' attribute.
	 * @see #isAvaliable()
	 * @generated
	 */
	void setAvaliable(boolean value);

	/**
	 * Returns the value of the '<em><b>Connectiontype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectiontype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectiontype</em>' attribute.
	 * @see #setConnectiontype(String)
	 * @see robotsys.RobotsysPackage#getRobotProxy_Connectiontype()
	 * @model required="true"
	 * @generated
	 */
	String getConnectiontype();

	/**
	 * Sets the value of the '{@link robotsys.RobotProxy#getConnectiontype <em>Connectiontype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectiontype</em>' attribute.
	 * @see #getConnectiontype()
	 * @generated
	 */
	void setConnectiontype(String value);

	/**
	 * Returns the value of the '<em><b>Batteryvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batteryvoltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batteryvoltage</em>' attribute.
	 * @see #setBatteryvoltage(float)
	 * @see robotsys.RobotsysPackage#getRobotProxy_Batteryvoltage()
	 * @model required="true"
	 * @generated
	 */
	float getBatteryvoltage();

	/**
	 * Sets the value of the '{@link robotsys.RobotProxy#getBatteryvoltage <em>Batteryvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batteryvoltage</em>' attribute.
	 * @see #getBatteryvoltage()
	 * @generated
	 */
	void setBatteryvoltage(float value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link robotsys.Registration#getRobotnodes <em>Robotnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Registration)
	 * @see robotsys.RobotsysPackage#getRobotProxy_Parent()
	 * @see robotsys.Registration#getRobotnodes
	 * @model opposite="robotnodes" transient="false"
	 * @generated
	 */
	Registration getParent();

	/**
	 * Sets the value of the '{@link robotsys.RobotProxy#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Registration value);

	/**
	 * Returns the value of the '<em><b>Sensorconnected</b></em>' containment reference list.
	 * The list contents are of type {@link robotsys.Sensor}.
	 * It is bidirectional and its opposite is '{@link robotsys.Sensor#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensorconnected</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensorconnected</em>' containment reference list.
	 * @see robotsys.RobotsysPackage#getRobotProxy_Sensorconnected()
	 * @see robotsys.Sensor#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Sensor> getSensorconnected();

	/**
	 * Returns the value of the '<em><b>Actuatorconnected</b></em>' containment reference list.
	 * The list contents are of type {@link robotsys.Actuator}.
	 * It is bidirectional and its opposite is '{@link robotsys.Actuator#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuatorconnected</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuatorconnected</em>' containment reference list.
	 * @see robotsys.RobotsysPackage#getRobotProxy_Actuatorconnected()
	 * @see robotsys.Actuator#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	EList<Actuator> getActuatorconnected();

} // RobotProxy
