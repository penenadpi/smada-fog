/**
 */
package smadafog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smadafog.Device#getMemoryCapacity <em>Memory Capacity</em>}</li>
 *   <li>{@link smadafog.Device#getContainer <em>Container</em>}</li>
 *   <li>{@link smadafog.Device#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link smadafog.Device#getLocation <em>Location</em>}</li>
 *   <li>{@link smadafog.Device#getEnergyConsumption <em>Energy Consumption</em>}</li>
 *   <li>{@link smadafog.Device#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link smadafog.Device#getExecutionSpeed <em>Execution Speed</em>}</li>
 * </ul>
 *
 * @see smadafog.SmadafogPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject {
	/**
	 * Returns the value of the '<em><b>Memory Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Capacity</em>' attribute.
	 * @see #setMemoryCapacity(int)
	 * @see smadafog.SmadafogPackage#getDevice_MemoryCapacity()
	 * @model
	 * @generated
	 */
	int getMemoryCapacity();

	/**
	 * Sets the value of the '{@link smadafog.Device#getMemoryCapacity <em>Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Capacity</em>' attribute.
	 * @see #getMemoryCapacity()
	 * @generated
	 */
	void setMemoryCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link smadafog.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see smadafog.SmadafogPackage#getDevice_Container()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContainer();

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see #setArchitecture(int)
	 * @see smadafog.SmadafogPackage#getDevice_Architecture()
	 * @model
	 * @generated
	 */
	int getArchitecture();

	/**
	 * Sets the value of the '{@link smadafog.Device#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(int value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(int)
	 * @see smadafog.SmadafogPackage#getDevice_Location()
	 * @model
	 * @generated
	 */
	int getLocation();

	/**
	 * Sets the value of the '{@link smadafog.Device#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(int value);

	/**
	 * Returns the value of the '<em><b>Energy Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumption</em>' attribute.
	 * @see #setEnergyConsumption(int)
	 * @see smadafog.SmadafogPackage#getDevice_EnergyConsumption()
	 * @model
	 * @generated
	 */
	int getEnergyConsumption();

	/**
	 * Sets the value of the '{@link smadafog.Device#getEnergyConsumption <em>Energy Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Consumption</em>' attribute.
	 * @see #getEnergyConsumption()
	 * @generated
	 */
	void setEnergyConsumption(int value);

	/**
	 * Returns the value of the '<em><b>Device Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Id</em>' attribute.
	 * @see #setDeviceId(String)
	 * @see smadafog.SmadafogPackage#getDevice_DeviceId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getDeviceId();

	/**
	 * Sets the value of the '{@link smadafog.Device#getDeviceId <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Id</em>' attribute.
	 * @see #getDeviceId()
	 * @generated
	 */
	void setDeviceId(String value);

	/**
	 * Returns the value of the '<em><b>Execution Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Speed</em>' attribute.
	 * @see #setExecutionSpeed(int)
	 * @see smadafog.SmadafogPackage#getDevice_ExecutionSpeed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getExecutionSpeed();

	/**
	 * Sets the value of the '{@link smadafog.Device#getExecutionSpeed <em>Execution Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Speed</em>' attribute.
	 * @see #getExecutionSpeed()
	 * @generated
	 */
	void setExecutionSpeed(int value);

} // Device
