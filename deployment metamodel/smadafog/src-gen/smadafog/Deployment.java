/**
 */
package smadafog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smadafog.Deployment#getContainer <em>Container</em>}</li>
 *   <li>{@link smadafog.Deployment#getDevice <em>Device</em>}</li>
 *   <li>{@link smadafog.Deployment#getName <em>Name</em>}</li>
 *   <li>{@link smadafog.Deployment#getAllocation <em>Allocation</em>}</li>
 * </ul>
 *
 * @see smadafog.SmadafogPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link smadafog.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see smadafog.SmadafogPackage#getDeployment_Container()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContainer();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link smadafog.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see smadafog.SmadafogPackage#getDeployment_Device()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getDevice();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see smadafog.SmadafogPackage#getDeployment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smadafog.Deployment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link smadafog.Allocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation</em>' containment reference list.
	 * @see smadafog.SmadafogPackage#getDeployment_Allocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Allocation> getAllocation();

} // Deployment
