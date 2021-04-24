/**
 */
package smadafog.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smadafog.Device;
import smadafog.SmadafogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smadafog.impl.DeviceImpl#getMemoryCapacity <em>Memory Capacity</em>}</li>
 *   <li>{@link smadafog.impl.DeviceImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link smadafog.impl.DeviceImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link smadafog.impl.DeviceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link smadafog.impl.DeviceImpl#getEnergyConsumption <em>Energy Consumption</em>}</li>
 *   <li>{@link smadafog.impl.DeviceImpl#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link smadafog.impl.DeviceImpl#getExecutionSpeed <em>Execution Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device {
	/**
	 * The default value of the '{@link #getMemoryCapacity() <em>Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemoryCapacity() <em>Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryCapacity()
	 * @generated
	 * @ordered
	 */
	protected int memoryCapacity = MEMORY_CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<smadafog.Container> container;

	/**
	 * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final int ARCHITECTURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected int architecture = ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected int location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergyConsumption() <em>Energy Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final int ENERGY_CONSUMPTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnergyConsumption() <em>Energy Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumption()
	 * @generated
	 * @ordered
	 */
	protected int energyConsumption = ENERGY_CONSUMPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceId()
	 * @generated
	 * @ordered
	 */
	protected String deviceId = DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionSpeed() <em>Execution Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int EXECUTION_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExecutionSpeed() <em>Execution Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionSpeed()
	 * @generated
	 * @ordered
	 */
	protected int executionSpeed = EXECUTION_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmadafogPackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMemoryCapacity() {
		return memoryCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemoryCapacity(int newMemoryCapacity) {
		int oldMemoryCapacity = memoryCapacity;
		memoryCapacity = newMemoryCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmadafogPackage.DEVICE__MEMORY_CAPACITY,
					oldMemoryCapacity, memoryCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<smadafog.Container> getContainer() {
		if (container == null) {
			container = new EObjectContainmentEList<smadafog.Container>(smadafog.Container.class, this,
					SmadafogPackage.DEVICE__CONTAINER);
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArchitecture(int newArchitecture) {
		int oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmadafogPackage.DEVICE__ARCHITECTURE, oldArchitecture,
					architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(int newLocation) {
		int oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmadafogPackage.DEVICE__LOCATION, oldLocation,
					location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEnergyConsumption() {
		return energyConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnergyConsumption(int newEnergyConsumption) {
		int oldEnergyConsumption = energyConsumption;
		energyConsumption = newEnergyConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmadafogPackage.DEVICE__ENERGY_CONSUMPTION,
					oldEnergyConsumption, energyConsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceId(String newDeviceId) {
		String oldDeviceId = deviceId;
		deviceId = newDeviceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmadafogPackage.DEVICE__DEVICE_ID, oldDeviceId,
					deviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExecutionSpeed() {
		return executionSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionSpeed(int newExecutionSpeed) {
		int oldExecutionSpeed = executionSpeed;
		executionSpeed = newExecutionSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmadafogPackage.DEVICE__EXECUTION_SPEED,
					oldExecutionSpeed, executionSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmadafogPackage.DEVICE__CONTAINER:
			return ((InternalEList<?>) getContainer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmadafogPackage.DEVICE__MEMORY_CAPACITY:
			return getMemoryCapacity();
		case SmadafogPackage.DEVICE__CONTAINER:
			return getContainer();
		case SmadafogPackage.DEVICE__ARCHITECTURE:
			return getArchitecture();
		case SmadafogPackage.DEVICE__LOCATION:
			return getLocation();
		case SmadafogPackage.DEVICE__ENERGY_CONSUMPTION:
			return getEnergyConsumption();
		case SmadafogPackage.DEVICE__DEVICE_ID:
			return getDeviceId();
		case SmadafogPackage.DEVICE__EXECUTION_SPEED:
			return getExecutionSpeed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SmadafogPackage.DEVICE__MEMORY_CAPACITY:
			setMemoryCapacity((Integer) newValue);
			return;
		case SmadafogPackage.DEVICE__CONTAINER:
			getContainer().clear();
			getContainer().addAll((Collection<? extends smadafog.Container>) newValue);
			return;
		case SmadafogPackage.DEVICE__ARCHITECTURE:
			setArchitecture((Integer) newValue);
			return;
		case SmadafogPackage.DEVICE__LOCATION:
			setLocation((Integer) newValue);
			return;
		case SmadafogPackage.DEVICE__ENERGY_CONSUMPTION:
			setEnergyConsumption((Integer) newValue);
			return;
		case SmadafogPackage.DEVICE__DEVICE_ID:
			setDeviceId((String) newValue);
			return;
		case SmadafogPackage.DEVICE__EXECUTION_SPEED:
			setExecutionSpeed((Integer) newValue);
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
		case SmadafogPackage.DEVICE__MEMORY_CAPACITY:
			setMemoryCapacity(MEMORY_CAPACITY_EDEFAULT);
			return;
		case SmadafogPackage.DEVICE__CONTAINER:
			getContainer().clear();
			return;
		case SmadafogPackage.DEVICE__ARCHITECTURE:
			setArchitecture(ARCHITECTURE_EDEFAULT);
			return;
		case SmadafogPackage.DEVICE__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case SmadafogPackage.DEVICE__ENERGY_CONSUMPTION:
			setEnergyConsumption(ENERGY_CONSUMPTION_EDEFAULT);
			return;
		case SmadafogPackage.DEVICE__DEVICE_ID:
			setDeviceId(DEVICE_ID_EDEFAULT);
			return;
		case SmadafogPackage.DEVICE__EXECUTION_SPEED:
			setExecutionSpeed(EXECUTION_SPEED_EDEFAULT);
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
		case SmadafogPackage.DEVICE__MEMORY_CAPACITY:
			return memoryCapacity != MEMORY_CAPACITY_EDEFAULT;
		case SmadafogPackage.DEVICE__CONTAINER:
			return container != null && !container.isEmpty();
		case SmadafogPackage.DEVICE__ARCHITECTURE:
			return architecture != ARCHITECTURE_EDEFAULT;
		case SmadafogPackage.DEVICE__LOCATION:
			return location != LOCATION_EDEFAULT;
		case SmadafogPackage.DEVICE__ENERGY_CONSUMPTION:
			return energyConsumption != ENERGY_CONSUMPTION_EDEFAULT;
		case SmadafogPackage.DEVICE__DEVICE_ID:
			return DEVICE_ID_EDEFAULT == null ? deviceId != null : !DEVICE_ID_EDEFAULT.equals(deviceId);
		case SmadafogPackage.DEVICE__EXECUTION_SPEED:
			return executionSpeed != EXECUTION_SPEED_EDEFAULT;
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
		result.append(" (memoryCapacity: ");
		result.append(memoryCapacity);
		result.append(", architecture: ");
		result.append(architecture);
		result.append(", location: ");
		result.append(location);
		result.append(", energyConsumption: ");
		result.append(energyConsumption);
		result.append(", deviceId: ");
		result.append(deviceId);
		result.append(", executionSpeed: ");
		result.append(executionSpeed);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
