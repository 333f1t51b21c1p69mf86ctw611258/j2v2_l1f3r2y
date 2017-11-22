package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.DeviceHis;
import com.dasannetworks.vn.sb.model.DeviceHisModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DeviceHis service. Represents a row in the &quot;tms_DeviceHis&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.dasannetworks.vn.sb.model.DeviceHisModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DeviceHisImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceHisImpl
 * @see com.dasannetworks.vn.sb.model.DeviceHis
 * @see com.dasannetworks.vn.sb.model.DeviceHisModel
 * @generated
 */
public class DeviceHisModelImpl extends BaseModelImpl<DeviceHis>
    implements DeviceHisModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a device his model instance should use the {@link com.dasannetworks.vn.sb.model.DeviceHis} interface instead.
     */
    public static final String TABLE_NAME = "tms_DeviceHis";
    public static final Object[][] TABLE_COLUMNS = {
            { "deviceId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "modelName", Types.VARCHAR },
            { "serialNumber", Types.VARCHAR },
            { "gponSerialNumber", Types.VARCHAR },
            { "boxSerialNumber", Types.VARCHAR },
            { "customerSerialNumber", Types.VARCHAR },
            { "manufacturerSerialNumber", Types.VARCHAR },
            { "hardwareRevision", Types.VARCHAR },
            { "softwareRevision", Types.VARCHAR },
            { "macAddress", Types.VARCHAR },
            { "partNumber", Types.VARCHAR },
            { "specification", Types.VARCHAR },
            { "factoryOut", Types.TIMESTAMP },
            { "purchaseOrderId", Types.BIGINT },
            { "warrantyFormId", Types.BIGINT },
            { "status", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table tms_DeviceHis (deviceId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,modelName VARCHAR(75) null,serialNumber VARCHAR(75) null,gponSerialNumber VARCHAR(75) null,boxSerialNumber VARCHAR(75) null,customerSerialNumber VARCHAR(75) null,manufacturerSerialNumber VARCHAR(75) null,hardwareRevision VARCHAR(75) null,softwareRevision VARCHAR(75) null,macAddress VARCHAR(75) null,partNumber VARCHAR(75) null,specification VARCHAR(75) null,factoryOut DATE null,purchaseOrderId LONG,warrantyFormId LONG,status INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table tms_DeviceHis";
    public static final String ORDER_BY_JPQL = " ORDER BY deviceHis.deviceId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY tms_DeviceHis.deviceId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.dasannetworks.vn.sb.model.DeviceHis"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.dasannetworks.vn.sb.model.DeviceHis"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.dasannetworks.vn.sb.model.DeviceHis"),
            true);
    public static long CUSTOMERSERIALNUMBER_COLUMN_BITMASK = 1L;
    public static long GPONSERIALNUMBER_COLUMN_BITMASK = 2L;
    public static long MODELNAME_COLUMN_BITMASK = 4L;
    public static long PURCHASEORDERID_COLUMN_BITMASK = 8L;
    public static long SERIALNUMBER_COLUMN_BITMASK = 16L;
    public static long STATUS_COLUMN_BITMASK = 32L;
    public static long WARRANTYFORMID_COLUMN_BITMASK = 64L;
    public static long DEVICEID_COLUMN_BITMASK = 128L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.dasannetworks.vn.sb.model.DeviceHis"));
    private static ClassLoader _classLoader = DeviceHis.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            DeviceHis.class
        };
    private long _deviceId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _modelName;
    private String _originalModelName;
    private String _serialNumber;
    private String _originalSerialNumber;
    private String _gponSerialNumber;
    private String _originalGponSerialNumber;
    private String _boxSerialNumber;
    private String _customerSerialNumber;
    private String _originalCustomerSerialNumber;
    private String _manufacturerSerialNumber;
    private String _hardwareRevision;
    private String _softwareRevision;
    private String _macAddress;
    private String _partNumber;
    private String _specification;
    private Date _factoryOut;
    private Long _purchaseOrderId;
    private Long _originalPurchaseOrderId;
    private boolean _setOriginalPurchaseOrderId;
    private Long _warrantyFormId;
    private Long _originalWarrantyFormId;
    private boolean _setOriginalWarrantyFormId;
    private int _status;
    private int _originalStatus;
    private boolean _setOriginalStatus;
    private long _columnBitmask;
    private DeviceHis _escapedModel;

    public DeviceHisModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _deviceId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setDeviceId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _deviceId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return DeviceHis.class;
    }

    @Override
    public String getModelClassName() {
        return DeviceHis.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("deviceId", getDeviceId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("modelName", getModelName());
        attributes.put("serialNumber", getSerialNumber());
        attributes.put("gponSerialNumber", getGponSerialNumber());
        attributes.put("boxSerialNumber", getBoxSerialNumber());
        attributes.put("customerSerialNumber", getCustomerSerialNumber());
        attributes.put("manufacturerSerialNumber", getManufacturerSerialNumber());
        attributes.put("hardwareRevision", getHardwareRevision());
        attributes.put("softwareRevision", getSoftwareRevision());
        attributes.put("macAddress", getMacAddress());
        attributes.put("partNumber", getPartNumber());
        attributes.put("specification", getSpecification());
        attributes.put("factoryOut", getFactoryOut());
        attributes.put("purchaseOrderId", getPurchaseOrderId());
        attributes.put("warrantyFormId", getWarrantyFormId());
        attributes.put("status", getStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long deviceId = (Long) attributes.get("deviceId");

        if (deviceId != null) {
            setDeviceId(deviceId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String modelName = (String) attributes.get("modelName");

        if (modelName != null) {
            setModelName(modelName);
        }

        String serialNumber = (String) attributes.get("serialNumber");

        if (serialNumber != null) {
            setSerialNumber(serialNumber);
        }

        String gponSerialNumber = (String) attributes.get("gponSerialNumber");

        if (gponSerialNumber != null) {
            setGponSerialNumber(gponSerialNumber);
        }

        String boxSerialNumber = (String) attributes.get("boxSerialNumber");

        if (boxSerialNumber != null) {
            setBoxSerialNumber(boxSerialNumber);
        }

        String customerSerialNumber = (String) attributes.get(
                "customerSerialNumber");

        if (customerSerialNumber != null) {
            setCustomerSerialNumber(customerSerialNumber);
        }

        String manufacturerSerialNumber = (String) attributes.get(
                "manufacturerSerialNumber");

        if (manufacturerSerialNumber != null) {
            setManufacturerSerialNumber(manufacturerSerialNumber);
        }

        String hardwareRevision = (String) attributes.get("hardwareRevision");

        if (hardwareRevision != null) {
            setHardwareRevision(hardwareRevision);
        }

        String softwareRevision = (String) attributes.get("softwareRevision");

        if (softwareRevision != null) {
            setSoftwareRevision(softwareRevision);
        }

        String macAddress = (String) attributes.get("macAddress");

        if (macAddress != null) {
            setMacAddress(macAddress);
        }

        String partNumber = (String) attributes.get("partNumber");

        if (partNumber != null) {
            setPartNumber(partNumber);
        }

        String specification = (String) attributes.get("specification");

        if (specification != null) {
            setSpecification(specification);
        }

        Date factoryOut = (Date) attributes.get("factoryOut");

        if (factoryOut != null) {
            setFactoryOut(factoryOut);
        }

        Long purchaseOrderId = (Long) attributes.get("purchaseOrderId");

        if (purchaseOrderId != null) {
            setPurchaseOrderId(purchaseOrderId);
        }

        Long warrantyFormId = (Long) attributes.get("warrantyFormId");

        if (warrantyFormId != null) {
            setWarrantyFormId(warrantyFormId);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }
    }

    @Override
    public long getDeviceId() {
        return _deviceId;
    }

    @Override
    public void setDeviceId(long deviceId) {
        _deviceId = deviceId;
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        if (_userName == null) {
            return StringPool.BLANK;
        } else {
            return _userName;
        }
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @Override
    public String getModelName() {
        if (_modelName == null) {
            return StringPool.BLANK;
        } else {
            return _modelName;
        }
    }

    @Override
    public void setModelName(String modelName) {
        _columnBitmask |= MODELNAME_COLUMN_BITMASK;

        if (_originalModelName == null) {
            _originalModelName = _modelName;
        }

        _modelName = modelName;
    }

    public String getOriginalModelName() {
        return GetterUtil.getString(_originalModelName);
    }

    @Override
    public String getSerialNumber() {
        return _serialNumber;
    }

    @Override
    public void setSerialNumber(String serialNumber) {
        _columnBitmask |= SERIALNUMBER_COLUMN_BITMASK;

        if (_originalSerialNumber == null) {
            _originalSerialNumber = _serialNumber;
        }

        _serialNumber = serialNumber;
    }

    public String getOriginalSerialNumber() {
        return _originalSerialNumber;
    }

    @Override
    public String getGponSerialNumber() {
        return _gponSerialNumber;
    }

    @Override
    public void setGponSerialNumber(String gponSerialNumber) {
        _columnBitmask |= GPONSERIALNUMBER_COLUMN_BITMASK;

        if (_originalGponSerialNumber == null) {
            _originalGponSerialNumber = _gponSerialNumber;
        }

        _gponSerialNumber = gponSerialNumber;
    }

    public String getOriginalGponSerialNumber() {
        return _originalGponSerialNumber;
    }

    @Override
    public String getBoxSerialNumber() {
        return _boxSerialNumber;
    }

    @Override
    public void setBoxSerialNumber(String boxSerialNumber) {
        _boxSerialNumber = boxSerialNumber;
    }

    @Override
    public String getCustomerSerialNumber() {
        return _customerSerialNumber;
    }

    @Override
    public void setCustomerSerialNumber(String customerSerialNumber) {
        _columnBitmask |= CUSTOMERSERIALNUMBER_COLUMN_BITMASK;

        if (_originalCustomerSerialNumber == null) {
            _originalCustomerSerialNumber = _customerSerialNumber;
        }

        _customerSerialNumber = customerSerialNumber;
    }

    public String getOriginalCustomerSerialNumber() {
        return _originalCustomerSerialNumber;
    }

    @Override
    public String getManufacturerSerialNumber() {
        return _manufacturerSerialNumber;
    }

    @Override
    public void setManufacturerSerialNumber(String manufacturerSerialNumber) {
        _manufacturerSerialNumber = manufacturerSerialNumber;
    }

    @Override
    public String getHardwareRevision() {
        if (_hardwareRevision == null) {
            return StringPool.BLANK;
        } else {
            return _hardwareRevision;
        }
    }

    @Override
    public void setHardwareRevision(String hardwareRevision) {
        _hardwareRevision = hardwareRevision;
    }

    @Override
    public String getSoftwareRevision() {
        if (_softwareRevision == null) {
            return StringPool.BLANK;
        } else {
            return _softwareRevision;
        }
    }

    @Override
    public void setSoftwareRevision(String softwareRevision) {
        _softwareRevision = softwareRevision;
    }

    @Override
    public String getMacAddress() {
        if (_macAddress == null) {
            return StringPool.BLANK;
        } else {
            return _macAddress;
        }
    }

    @Override
    public void setMacAddress(String macAddress) {
        _macAddress = macAddress;
    }

    @Override
    public String getPartNumber() {
        if (_partNumber == null) {
            return StringPool.BLANK;
        } else {
            return _partNumber;
        }
    }

    @Override
    public void setPartNumber(String partNumber) {
        _partNumber = partNumber;
    }

    @Override
    public String getSpecification() {
        if (_specification == null) {
            return StringPool.BLANK;
        } else {
            return _specification;
        }
    }

    @Override
    public void setSpecification(String specification) {
        _specification = specification;
    }

    @Override
    public Date getFactoryOut() {
        return _factoryOut;
    }

    @Override
    public void setFactoryOut(Date factoryOut) {
        _factoryOut = factoryOut;
    }

    @Override
    public Long getPurchaseOrderId() {
        return _purchaseOrderId;
    }

    @Override
    public void setPurchaseOrderId(Long purchaseOrderId) {
        _columnBitmask |= PURCHASEORDERID_COLUMN_BITMASK;

        if (!_setOriginalPurchaseOrderId) {
            _setOriginalPurchaseOrderId = true;

            _originalPurchaseOrderId = _purchaseOrderId;
        }

        _purchaseOrderId = purchaseOrderId;
    }

    public Long getOriginalPurchaseOrderId() {
        return _originalPurchaseOrderId;
    }

    @Override
    public Long getWarrantyFormId() {
        return _warrantyFormId;
    }

    @Override
    public void setWarrantyFormId(Long warrantyFormId) {
        _columnBitmask |= WARRANTYFORMID_COLUMN_BITMASK;

        if (!_setOriginalWarrantyFormId) {
            _setOriginalWarrantyFormId = true;

            _originalWarrantyFormId = _warrantyFormId;
        }

        _warrantyFormId = warrantyFormId;
    }

    public Long getOriginalWarrantyFormId() {
        return _originalWarrantyFormId;
    }

    @Override
    public int getStatus() {
        return _status;
    }

    @Override
    public void setStatus(int status) {
        _columnBitmask |= STATUS_COLUMN_BITMASK;

        if (!_setOriginalStatus) {
            _setOriginalStatus = true;

            _originalStatus = _status;
        }

        _status = status;
    }

    public int getOriginalStatus() {
        return _originalStatus;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            DeviceHis.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public DeviceHis toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (DeviceHis) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        DeviceHisImpl deviceHisImpl = new DeviceHisImpl();

        deviceHisImpl.setDeviceId(getDeviceId());
        deviceHisImpl.setGroupId(getGroupId());
        deviceHisImpl.setCompanyId(getCompanyId());
        deviceHisImpl.setUserId(getUserId());
        deviceHisImpl.setUserName(getUserName());
        deviceHisImpl.setCreateDate(getCreateDate());
        deviceHisImpl.setModifiedDate(getModifiedDate());
        deviceHisImpl.setModelName(getModelName());
        deviceHisImpl.setSerialNumber(getSerialNumber());
        deviceHisImpl.setGponSerialNumber(getGponSerialNumber());
        deviceHisImpl.setBoxSerialNumber(getBoxSerialNumber());
        deviceHisImpl.setCustomerSerialNumber(getCustomerSerialNumber());
        deviceHisImpl.setManufacturerSerialNumber(getManufacturerSerialNumber());
        deviceHisImpl.setHardwareRevision(getHardwareRevision());
        deviceHisImpl.setSoftwareRevision(getSoftwareRevision());
        deviceHisImpl.setMacAddress(getMacAddress());
        deviceHisImpl.setPartNumber(getPartNumber());
        deviceHisImpl.setSpecification(getSpecification());
        deviceHisImpl.setFactoryOut(getFactoryOut());
        deviceHisImpl.setPurchaseOrderId(getPurchaseOrderId());
        deviceHisImpl.setWarrantyFormId(getWarrantyFormId());
        deviceHisImpl.setStatus(getStatus());

        deviceHisImpl.resetOriginalValues();

        return deviceHisImpl;
    }

    @Override
    public int compareTo(DeviceHis deviceHis) {
        long primaryKey = deviceHis.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DeviceHis)) {
            return false;
        }

        DeviceHis deviceHis = (DeviceHis) obj;

        long primaryKey = deviceHis.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        DeviceHisModelImpl deviceHisModelImpl = this;

        deviceHisModelImpl._originalModelName = deviceHisModelImpl._modelName;

        deviceHisModelImpl._originalSerialNumber = deviceHisModelImpl._serialNumber;

        deviceHisModelImpl._originalGponSerialNumber = deviceHisModelImpl._gponSerialNumber;

        deviceHisModelImpl._originalCustomerSerialNumber = deviceHisModelImpl._customerSerialNumber;

        deviceHisModelImpl._originalPurchaseOrderId = deviceHisModelImpl._purchaseOrderId;

        deviceHisModelImpl._setOriginalPurchaseOrderId = false;

        deviceHisModelImpl._originalWarrantyFormId = deviceHisModelImpl._warrantyFormId;

        deviceHisModelImpl._setOriginalWarrantyFormId = false;

        deviceHisModelImpl._originalStatus = deviceHisModelImpl._status;

        deviceHisModelImpl._setOriginalStatus = false;

        deviceHisModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<DeviceHis> toCacheModel() {
        DeviceHisCacheModel deviceHisCacheModel = new DeviceHisCacheModel();

        deviceHisCacheModel.deviceId = getDeviceId();

        deviceHisCacheModel.groupId = getGroupId();

        deviceHisCacheModel.companyId = getCompanyId();

        deviceHisCacheModel.userId = getUserId();

        deviceHisCacheModel.userName = getUserName();

        String userName = deviceHisCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            deviceHisCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            deviceHisCacheModel.createDate = createDate.getTime();
        } else {
            deviceHisCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            deviceHisCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            deviceHisCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        deviceHisCacheModel.modelName = getModelName();

        String modelName = deviceHisCacheModel.modelName;

        if ((modelName != null) && (modelName.length() == 0)) {
            deviceHisCacheModel.modelName = null;
        }

        deviceHisCacheModel.serialNumber = getSerialNumber();

        String serialNumber = deviceHisCacheModel.serialNumber;

        if ((serialNumber != null) && (serialNumber.length() == 0)) {
            deviceHisCacheModel.serialNumber = null;
        }

        deviceHisCacheModel.gponSerialNumber = getGponSerialNumber();

        String gponSerialNumber = deviceHisCacheModel.gponSerialNumber;

        if ((gponSerialNumber != null) && (gponSerialNumber.length() == 0)) {
            deviceHisCacheModel.gponSerialNumber = null;
        }

        deviceHisCacheModel.boxSerialNumber = getBoxSerialNumber();

        String boxSerialNumber = deviceHisCacheModel.boxSerialNumber;

        if ((boxSerialNumber != null) && (boxSerialNumber.length() == 0)) {
            deviceHisCacheModel.boxSerialNumber = null;
        }

        deviceHisCacheModel.customerSerialNumber = getCustomerSerialNumber();

        String customerSerialNumber = deviceHisCacheModel.customerSerialNumber;

        if ((customerSerialNumber != null) &&
                (customerSerialNumber.length() == 0)) {
            deviceHisCacheModel.customerSerialNumber = null;
        }

        deviceHisCacheModel.manufacturerSerialNumber = getManufacturerSerialNumber();

        String manufacturerSerialNumber = deviceHisCacheModel.manufacturerSerialNumber;

        if ((manufacturerSerialNumber != null) &&
                (manufacturerSerialNumber.length() == 0)) {
            deviceHisCacheModel.manufacturerSerialNumber = null;
        }

        deviceHisCacheModel.hardwareRevision = getHardwareRevision();

        String hardwareRevision = deviceHisCacheModel.hardwareRevision;

        if ((hardwareRevision != null) && (hardwareRevision.length() == 0)) {
            deviceHisCacheModel.hardwareRevision = null;
        }

        deviceHisCacheModel.softwareRevision = getSoftwareRevision();

        String softwareRevision = deviceHisCacheModel.softwareRevision;

        if ((softwareRevision != null) && (softwareRevision.length() == 0)) {
            deviceHisCacheModel.softwareRevision = null;
        }

        deviceHisCacheModel.macAddress = getMacAddress();

        String macAddress = deviceHisCacheModel.macAddress;

        if ((macAddress != null) && (macAddress.length() == 0)) {
            deviceHisCacheModel.macAddress = null;
        }

        deviceHisCacheModel.partNumber = getPartNumber();

        String partNumber = deviceHisCacheModel.partNumber;

        if ((partNumber != null) && (partNumber.length() == 0)) {
            deviceHisCacheModel.partNumber = null;
        }

        deviceHisCacheModel.specification = getSpecification();

        String specification = deviceHisCacheModel.specification;

        if ((specification != null) && (specification.length() == 0)) {
            deviceHisCacheModel.specification = null;
        }

        Date factoryOut = getFactoryOut();

        if (factoryOut != null) {
            deviceHisCacheModel.factoryOut = factoryOut.getTime();
        } else {
            deviceHisCacheModel.factoryOut = Long.MIN_VALUE;
        }

        deviceHisCacheModel.purchaseOrderId = getPurchaseOrderId();

        deviceHisCacheModel.warrantyFormId = getWarrantyFormId();

        deviceHisCacheModel.status = getStatus();

        return deviceHisCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(45);

        sb.append("{deviceId=");
        sb.append(getDeviceId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", modelName=");
        sb.append(getModelName());
        sb.append(", serialNumber=");
        sb.append(getSerialNumber());
        sb.append(", gponSerialNumber=");
        sb.append(getGponSerialNumber());
        sb.append(", boxSerialNumber=");
        sb.append(getBoxSerialNumber());
        sb.append(", customerSerialNumber=");
        sb.append(getCustomerSerialNumber());
        sb.append(", manufacturerSerialNumber=");
        sb.append(getManufacturerSerialNumber());
        sb.append(", hardwareRevision=");
        sb.append(getHardwareRevision());
        sb.append(", softwareRevision=");
        sb.append(getSoftwareRevision());
        sb.append(", macAddress=");
        sb.append(getMacAddress());
        sb.append(", partNumber=");
        sb.append(getPartNumber());
        sb.append(", specification=");
        sb.append(getSpecification());
        sb.append(", factoryOut=");
        sb.append(getFactoryOut());
        sb.append(", purchaseOrderId=");
        sb.append(getPurchaseOrderId());
        sb.append(", warrantyFormId=");
        sb.append(getWarrantyFormId());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(70);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.DeviceHis");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>deviceId</column-name><column-value><![CDATA[");
        sb.append(getDeviceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelName</column-name><column-value><![CDATA[");
        sb.append(getModelName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serialNumber</column-name><column-value><![CDATA[");
        sb.append(getSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gponSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getGponSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>boxSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getBoxSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>customerSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getCustomerSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>manufacturerSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getManufacturerSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>hardwareRevision</column-name><column-value><![CDATA[");
        sb.append(getHardwareRevision());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>softwareRevision</column-name><column-value><![CDATA[");
        sb.append(getSoftwareRevision());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>macAddress</column-name><column-value><![CDATA[");
        sb.append(getMacAddress());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>partNumber</column-name><column-value><![CDATA[");
        sb.append(getPartNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>specification</column-name><column-value><![CDATA[");
        sb.append(getSpecification());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>factoryOut</column-name><column-value><![CDATA[");
        sb.append(getFactoryOut());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>purchaseOrderId</column-name><column-value><![CDATA[");
        sb.append(getPurchaseOrderId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>warrantyFormId</column-name><column-value><![CDATA[");
        sb.append(getWarrantyFormId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
