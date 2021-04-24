/**
 */
package smadafog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import smadafog.SmadafogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smadafog.impl.ContainerImpl#getDemand <em>Demand</em>}</li>
 *   <li>{@link smadafog.impl.ContainerImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link smadafog.impl.ContainerImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link smadafog.impl.ContainerImpl#getContainerId <em>Container Id</em>}</li>
 *   <li>{@link smadafog.impl.ContainerImpl#getCpuRequirement <em>Cpu Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements smadafog.Container {
	/**
	 * The default value of the '{@link #getDemand() <em>Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemand()
	 * @generated
	 * @ordered
	 */
	protected static final int DEMAND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDemand() <em>Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemand()
	 * @generated
	 * @ordered
	 */
	protected int demand = DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final int ENVIRONMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected int environment = ENVIRONMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerId() <em>Container Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerId() <em>Container Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerId()
	 * @generated
	 * @ordered
	 */
	protected String containerId = CONTAINER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuRequirement() <em>Cpu Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuRequirement()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_REQUIREMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpuRequirement() <em>Cpu Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuRequirement()
	 * @generated
	 * @ordered
	 */
	protected int cpuRequirement = CPU_REQUIREMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmadafogPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDemand() {
		return demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDemand(int newDemand) {
		int oldDemand = demand;
		demand = newDemand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmadafogPackage.CONTAINER__DEMAND, oldDemand,
					demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmadafogPackage.CONTAINER__VERSION, oldVersion,
					version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvironment(int newEnvironment) {
		int oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmadafogPackage.CONTAINER__ENVIRONMENT,
					oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainerId() {
		return containerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerId(String newContainerId) {
		String oldContainerId = containerId;
		containerId = newContainerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmadafogPackage.CONTAINER__CONTAINER_ID,
					oldContainerId, containerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCpuRequirement() {
		return cpuRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpuRequirement(int newCpuRequirement) {
		int oldCpuRequirement = cpuRequirement;
		cpuRequirement = newCpuRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmadafogPackage.CONTAINER__CPU_REQUIREMENT,
					oldCpuRequirement, cpuRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmadafogPackage.CONTAINER__DEMAND:
			return getDemand();
		case SmadafogPackage.CONTAINER__VERSION:
			return getVersion();
		case SmadafogPackage.CONTAINER__ENVIRONMENT:
			return getEnvironment();
		case SmadafogPackage.CONTAINER__CONTAINER_ID:
			return getContainerId();
		case SmadafogPackage.CONTAINER__CPU_REQUIREMENT:
			return getCpuRequirement();
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
		case SmadafogPackage.CONTAINER__DEMAND:
			setDemand((Integer) newValue);
			return;
		case SmadafogPackage.CONTAINER__VERSION:
			setVersion((Integer) newValue);
			return;
		case SmadafogPackage.CONTAINER__ENVIRONMENT:
			setEnvironment((Integer) newValue);
			return;
		case SmadafogPackage.CONTAINER__CONTAINER_ID:
			setContainerId((String) newValue);
			return;
		case SmadafogPackage.CONTAINER__CPU_REQUIREMENT:
			setCpuRequirement((Integer) newValue);
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
		case SmadafogPackage.CONTAINER__DEMAND:
			setDemand(DEMAND_EDEFAULT);
			return;
		case SmadafogPackage.CONTAINER__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case SmadafogPackage.CONTAINER__ENVIRONMENT:
			setEnvironment(ENVIRONMENT_EDEFAULT);
			return;
		case SmadafogPackage.CONTAINER__CONTAINER_ID:
			setContainerId(CONTAINER_ID_EDEFAULT);
			return;
		case SmadafogPackage.CONTAINER__CPU_REQUIREMENT:
			setCpuRequirement(CPU_REQUIREMENT_EDEFAULT);
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
		case SmadafogPackage.CONTAINER__DEMAND:
			return demand != DEMAND_EDEFAULT;
		case SmadafogPackage.CONTAINER__VERSION:
			return version != VERSION_EDEFAULT;
		case SmadafogPackage.CONTAINER__ENVIRONMENT:
			return environment != ENVIRONMENT_EDEFAULT;
		case SmadafogPackage.CONTAINER__CONTAINER_ID:
			return CONTAINER_ID_EDEFAULT == null ? containerId != null : !CONTAINER_ID_EDEFAULT.equals(containerId);
		case SmadafogPackage.CONTAINER__CPU_REQUIREMENT:
			return cpuRequirement != CPU_REQUIREMENT_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (demand: ");
		result.append(demand);
		result.append(", version: ");
		result.append(version);
		result.append(", environment: ");
		result.append(environment);
		result.append(", containerId: ");
		result.append(containerId);
		result.append(", cpuRequirement: ");
		result.append(cpuRequirement);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
