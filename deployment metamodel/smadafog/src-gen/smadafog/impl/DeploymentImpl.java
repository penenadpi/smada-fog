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

import smadafog.Allocation;
import smadafog.Deployment;
import smadafog.Device;
import smadafog.SmadafogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smadafog.impl.DeploymentImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link smadafog.impl.DeploymentImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link smadafog.impl.DeploymentImpl#getName <em>Name</em>}</li>
 *   <li>{@link smadafog.impl.DeploymentImpl#getAllocation <em>Allocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment {
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
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> device;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Allocation> allocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmadafogPackage.Literals.DEPLOYMENT;
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
					SmadafogPackage.DEPLOYMENT__CONTAINER);
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Device> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<Device>(Device.class, this, SmadafogPackage.DEPLOYMENT__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmadafogPackage.DEPLOYMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Allocation> getAllocation() {
		if (allocation == null) {
			allocation = new EObjectContainmentEList<Allocation>(Allocation.class, this,
					SmadafogPackage.DEPLOYMENT__ALLOCATION);
		}
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmadafogPackage.DEPLOYMENT__CONTAINER:
			return ((InternalEList<?>) getContainer()).basicRemove(otherEnd, msgs);
		case SmadafogPackage.DEPLOYMENT__DEVICE:
			return ((InternalEList<?>) getDevice()).basicRemove(otherEnd, msgs);
		case SmadafogPackage.DEPLOYMENT__ALLOCATION:
			return ((InternalEList<?>) getAllocation()).basicRemove(otherEnd, msgs);
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
		case SmadafogPackage.DEPLOYMENT__CONTAINER:
			return getContainer();
		case SmadafogPackage.DEPLOYMENT__DEVICE:
			return getDevice();
		case SmadafogPackage.DEPLOYMENT__NAME:
			return getName();
		case SmadafogPackage.DEPLOYMENT__ALLOCATION:
			return getAllocation();
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
		case SmadafogPackage.DEPLOYMENT__CONTAINER:
			getContainer().clear();
			getContainer().addAll((Collection<? extends smadafog.Container>) newValue);
			return;
		case SmadafogPackage.DEPLOYMENT__DEVICE:
			getDevice().clear();
			getDevice().addAll((Collection<? extends Device>) newValue);
			return;
		case SmadafogPackage.DEPLOYMENT__NAME:
			setName((String) newValue);
			return;
		case SmadafogPackage.DEPLOYMENT__ALLOCATION:
			getAllocation().clear();
			getAllocation().addAll((Collection<? extends Allocation>) newValue);
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
		case SmadafogPackage.DEPLOYMENT__CONTAINER:
			getContainer().clear();
			return;
		case SmadafogPackage.DEPLOYMENT__DEVICE:
			getDevice().clear();
			return;
		case SmadafogPackage.DEPLOYMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SmadafogPackage.DEPLOYMENT__ALLOCATION:
			getAllocation().clear();
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
		case SmadafogPackage.DEPLOYMENT__CONTAINER:
			return container != null && !container.isEmpty();
		case SmadafogPackage.DEPLOYMENT__DEVICE:
			return device != null && !device.isEmpty();
		case SmadafogPackage.DEPLOYMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SmadafogPackage.DEPLOYMENT__ALLOCATION:
			return allocation != null && !allocation.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DeploymentImpl
