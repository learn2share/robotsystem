/**
 */
package robotsys;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robotsys.Registration#getId <em>Id</em>}</li>
 *   <li>{@link robotsys.Registration#getName <em>Name</em>}</li>
 *   <li>{@link robotsys.Registration#getRobotnodes <em>Robotnodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see robotsys.RobotsysPackage#getRegistration()
 * @model
 * @generated
 */
public interface Registration extends EObject, EModelElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see robotsys.RobotsysPackage#getRegistration_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link robotsys.Registration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see robotsys.RobotsysPackage#getRegistration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link robotsys.Registration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Robotnodes</b></em>' containment reference list.
	 * The list contents are of type {@link robotsys.RobotProxy}.
	 * It is bidirectional and its opposite is '{@link robotsys.RobotProxy#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Robotnodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robotnodes</em>' containment reference list.
	 * @see robotsys.RobotsysPackage#getRegistration_Robotnodes()
	 * @see robotsys.RobotProxy#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<RobotProxy> getRobotnodes();

} // Registration
