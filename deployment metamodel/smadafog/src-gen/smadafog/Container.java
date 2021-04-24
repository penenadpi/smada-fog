/**
 */
package smadafog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smadafog.Container#getDemand <em>Demand</em>}</li>
 *   <li>{@link smadafog.Container#getVersion <em>Version</em>}</li>
 *   <li>{@link smadafog.Container#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link smadafog.Container#getContainerId <em>Container Id</em>}</li>
 *   <li>{@link smadafog.Container#getCpuRequirement <em>Cpu Requirement</em>}</li>
 * </ul>
 *
 * @see smadafog.SmadafogPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand</em>' attribute.
	 * @see #setDemand(int)
	 * @see smadafog.SmadafogPackage#getContainer_Demand()
	 * @model
	 * @generated
	 */
	int getDemand();

	/**
	 * Sets the value of the '{@link smadafog.Container#getDemand <em>Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand</em>' attribute.
	 * @see #getDemand()
	 * @generated
	 */
	void setDemand(int value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see smadafog.SmadafogPackage#getContainer_Version()
	 * @model
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link smadafog.Container#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(int)
	 * @see smadafog.SmadafogPackage#getContainer_Environment()
	 * @model
	 * @generated
	 */
	int getEnvironment();

	/**
	 * Sets the value of the '{@link smadafog.Container#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(int value);

	/**
	 * Returns the value of the '<em><b>Container Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Id</em>' attribute.
	 * @see #setContainerId(String)
	 * @see smadafog.SmadafogPackage#getContainer_ContainerId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getContainerId();

	/**
	 * Sets the value of the '{@link smadafog.Container#getContainerId <em>Container Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Id</em>' attribute.
	 * @see #getContainerId()
	 * @generated
	 */
	void setContainerId(String value);

	/**
	 * Returns the value of the '<em><b>Cpu Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Requirement</em>' attribute.
	 * @see #setCpuRequirement(int)
	 * @see smadafog.SmadafogPackage#getContainer_CpuRequirement()
	 * @model
	 * @generated
	 */
	int getCpuRequirement();

	/**
	 * Sets the value of the '{@link smadafog.Container#getCpuRequirement <em>Cpu Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Requirement</em>' attribute.
	 * @see #getCpuRequirement()
	 * @generated
	 */
	void setCpuRequirement(int value);

} // Container
