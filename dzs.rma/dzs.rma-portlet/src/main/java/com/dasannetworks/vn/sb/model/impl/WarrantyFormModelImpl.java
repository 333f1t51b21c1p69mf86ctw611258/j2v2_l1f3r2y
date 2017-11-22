package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.WarrantyForm;
import com.dasannetworks.vn.sb.model.WarrantyFormModel;

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
 * The base model implementation for the WarrantyForm service. Represents a row in the &quot;tms_WarrantyForm&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.dasannetworks.vn.sb.model.WarrantyFormModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WarrantyFormImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyFormImpl
 * @see com.dasannetworks.vn.sb.model.WarrantyForm
 * @see com.dasannetworks.vn.sb.model.WarrantyFormModel
 * @generated
 */
public class WarrantyFormModelImpl extends BaseModelImpl<WarrantyForm>
    implements WarrantyFormModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a warranty form model instance should use the {@link com.dasannetworks.vn.sb.model.WarrantyForm} interface instead.
     */
    public static final String TABLE_NAME = "tms_WarrantyForm";
    public static final Object[][] TABLE_COLUMNS = {
            { "warrantyFormId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "agentCode", Types.VARCHAR },
            { "warrantyStartDate", Types.TIMESTAMP },
            { "warrantyEndDate", Types.TIMESTAMP },
            { "originalSerialNumber", Types.VARCHAR },
            { "hisSerialNumbers", Types.VARCHAR },
            { "latestSerialNumber", Types.VARCHAR },
            { "remark", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table tms_WarrantyForm (warrantyFormId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,agentCode VARCHAR(75) null,warrantyStartDate DATE null,warrantyEndDate DATE null,originalSerialNumber VARCHAR(75) null,hisSerialNumbers VARCHAR(75) null,latestSerialNumber VARCHAR(75) null,remark VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table tms_WarrantyForm";
    public static final String ORDER_BY_JPQL = " ORDER BY warrantyForm.warrantyFormId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY tms_WarrantyForm.warrantyFormId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.dasannetworks.vn.sb.model.WarrantyForm"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.dasannetworks.vn.sb.model.WarrantyForm"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.dasannetworks.vn.sb.model.WarrantyForm"),
            true);
    public static long LATESTSERIALNUMBER_COLUMN_BITMASK = 1L;
    public static long ORIGINALSERIALNUMBER_COLUMN_BITMASK = 2L;
    public static long WARRANTYFORMID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.dasannetworks.vn.sb.model.WarrantyForm"));
    private static ClassLoader _classLoader = WarrantyForm.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            WarrantyForm.class
        };
    private long _warrantyFormId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _agentCode;
    private Date _warrantyStartDate;
    private Date _warrantyEndDate;
    private String _originalSerialNumber;
    private String _originalOriginalSerialNumber;
    private String _hisSerialNumbers;
    private String _latestSerialNumber;
    private String _originalLatestSerialNumber;
    private String _remark;
    private long _columnBitmask;
    private WarrantyForm _escapedModel;

    public WarrantyFormModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _warrantyFormId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setWarrantyFormId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _warrantyFormId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return WarrantyForm.class;
    }

    @Override
    public String getModelClassName() {
        return WarrantyForm.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("warrantyFormId", getWarrantyFormId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("agentCode", getAgentCode());
        attributes.put("warrantyStartDate", getWarrantyStartDate());
        attributes.put("warrantyEndDate", getWarrantyEndDate());
        attributes.put("originalSerialNumber", getOriginalSerialNumber());
        attributes.put("hisSerialNumbers", getHisSerialNumbers());
        attributes.put("latestSerialNumber", getLatestSerialNumber());
        attributes.put("remark", getRemark());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long warrantyFormId = (Long) attributes.get("warrantyFormId");

        if (warrantyFormId != null) {
            setWarrantyFormId(warrantyFormId);
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

        String agentCode = (String) attributes.get("agentCode");

        if (agentCode != null) {
            setAgentCode(agentCode);
        }

        Date warrantyStartDate = (Date) attributes.get("warrantyStartDate");

        if (warrantyStartDate != null) {
            setWarrantyStartDate(warrantyStartDate);
        }

        Date warrantyEndDate = (Date) attributes.get("warrantyEndDate");

        if (warrantyEndDate != null) {
            setWarrantyEndDate(warrantyEndDate);
        }

        String originalSerialNumber = (String) attributes.get(
                "originalSerialNumber");

        if (originalSerialNumber != null) {
            setOriginalSerialNumber(originalSerialNumber);
        }

        String hisSerialNumbers = (String) attributes.get("hisSerialNumbers");

        if (hisSerialNumbers != null) {
            setHisSerialNumbers(hisSerialNumbers);
        }

        String latestSerialNumber = (String) attributes.get(
                "latestSerialNumber");

        if (latestSerialNumber != null) {
            setLatestSerialNumber(latestSerialNumber);
        }

        String remark = (String) attributes.get("remark");

        if (remark != null) {
            setRemark(remark);
        }
    }

    @Override
    public long getWarrantyFormId() {
        return _warrantyFormId;
    }

    @Override
    public void setWarrantyFormId(long warrantyFormId) {
        _warrantyFormId = warrantyFormId;
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
    public String getAgentCode() {
        if (_agentCode == null) {
            return StringPool.BLANK;
        } else {
            return _agentCode;
        }
    }

    @Override
    public void setAgentCode(String agentCode) {
        _agentCode = agentCode;
    }

    @Override
    public Date getWarrantyStartDate() {
        return _warrantyStartDate;
    }

    @Override
    public void setWarrantyStartDate(Date warrantyStartDate) {
        _warrantyStartDate = warrantyStartDate;
    }

    @Override
    public Date getWarrantyEndDate() {
        return _warrantyEndDate;
    }

    @Override
    public void setWarrantyEndDate(Date warrantyEndDate) {
        _warrantyEndDate = warrantyEndDate;
    }

    @Override
    public String getOriginalSerialNumber() {
        return _originalSerialNumber;
    }

    @Override
    public void setOriginalSerialNumber(String originalSerialNumber) {
        _columnBitmask |= ORIGINALSERIALNUMBER_COLUMN_BITMASK;

        if (_originalOriginalSerialNumber == null) {
            _originalOriginalSerialNumber = _originalSerialNumber;
        }

        _originalSerialNumber = originalSerialNumber;
    }

    public String getOriginalOriginalSerialNumber() {
        return _originalOriginalSerialNumber;
    }

    @Override
    public String getHisSerialNumbers() {
        return _hisSerialNumbers;
    }

    @Override
    public void setHisSerialNumbers(String hisSerialNumbers) {
        _hisSerialNumbers = hisSerialNumbers;
    }

    @Override
    public String getLatestSerialNumber() {
        return _latestSerialNumber;
    }

    @Override
    public void setLatestSerialNumber(String latestSerialNumber) {
        _columnBitmask |= LATESTSERIALNUMBER_COLUMN_BITMASK;

        if (_originalLatestSerialNumber == null) {
            _originalLatestSerialNumber = _latestSerialNumber;
        }

        _latestSerialNumber = latestSerialNumber;
    }

    public String getOriginalLatestSerialNumber() {
        return _originalLatestSerialNumber;
    }

    @Override
    public String getRemark() {
        if (_remark == null) {
            return StringPool.BLANK;
        } else {
            return _remark;
        }
    }

    @Override
    public void setRemark(String remark) {
        _remark = remark;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            WarrantyForm.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public WarrantyForm toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (WarrantyForm) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        WarrantyFormImpl warrantyFormImpl = new WarrantyFormImpl();

        warrantyFormImpl.setWarrantyFormId(getWarrantyFormId());
        warrantyFormImpl.setCompanyId(getCompanyId());
        warrantyFormImpl.setUserId(getUserId());
        warrantyFormImpl.setUserName(getUserName());
        warrantyFormImpl.setCreateDate(getCreateDate());
        warrantyFormImpl.setModifiedDate(getModifiedDate());
        warrantyFormImpl.setAgentCode(getAgentCode());
        warrantyFormImpl.setWarrantyStartDate(getWarrantyStartDate());
        warrantyFormImpl.setWarrantyEndDate(getWarrantyEndDate());
        warrantyFormImpl.setOriginalSerialNumber(getOriginalSerialNumber());
        warrantyFormImpl.setHisSerialNumbers(getHisSerialNumbers());
        warrantyFormImpl.setLatestSerialNumber(getLatestSerialNumber());
        warrantyFormImpl.setRemark(getRemark());

        warrantyFormImpl.resetOriginalValues();

        return warrantyFormImpl;
    }

    @Override
    public int compareTo(WarrantyForm warrantyForm) {
        long primaryKey = warrantyForm.getPrimaryKey();

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

        if (!(obj instanceof WarrantyForm)) {
            return false;
        }

        WarrantyForm warrantyForm = (WarrantyForm) obj;

        long primaryKey = warrantyForm.getPrimaryKey();

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
        WarrantyFormModelImpl warrantyFormModelImpl = this;

        warrantyFormModelImpl._originalOriginalSerialNumber = warrantyFormModelImpl._originalSerialNumber;

        warrantyFormModelImpl._originalLatestSerialNumber = warrantyFormModelImpl._latestSerialNumber;

        warrantyFormModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<WarrantyForm> toCacheModel() {
        WarrantyFormCacheModel warrantyFormCacheModel = new WarrantyFormCacheModel();

        warrantyFormCacheModel.warrantyFormId = getWarrantyFormId();

        warrantyFormCacheModel.companyId = getCompanyId();

        warrantyFormCacheModel.userId = getUserId();

        warrantyFormCacheModel.userName = getUserName();

        String userName = warrantyFormCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            warrantyFormCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            warrantyFormCacheModel.createDate = createDate.getTime();
        } else {
            warrantyFormCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            warrantyFormCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            warrantyFormCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        warrantyFormCacheModel.agentCode = getAgentCode();

        String agentCode = warrantyFormCacheModel.agentCode;

        if ((agentCode != null) && (agentCode.length() == 0)) {
            warrantyFormCacheModel.agentCode = null;
        }

        Date warrantyStartDate = getWarrantyStartDate();

        if (warrantyStartDate != null) {
            warrantyFormCacheModel.warrantyStartDate = warrantyStartDate.getTime();
        } else {
            warrantyFormCacheModel.warrantyStartDate = Long.MIN_VALUE;
        }

        Date warrantyEndDate = getWarrantyEndDate();

        if (warrantyEndDate != null) {
            warrantyFormCacheModel.warrantyEndDate = warrantyEndDate.getTime();
        } else {
            warrantyFormCacheModel.warrantyEndDate = Long.MIN_VALUE;
        }

        warrantyFormCacheModel.originalSerialNumber = getOriginalSerialNumber();

        String originalSerialNumber = warrantyFormCacheModel.originalSerialNumber;

        if ((originalSerialNumber != null) &&
                (originalSerialNumber.length() == 0)) {
            warrantyFormCacheModel.originalSerialNumber = null;
        }

        warrantyFormCacheModel.hisSerialNumbers = getHisSerialNumbers();

        String hisSerialNumbers = warrantyFormCacheModel.hisSerialNumbers;

        if ((hisSerialNumbers != null) && (hisSerialNumbers.length() == 0)) {
            warrantyFormCacheModel.hisSerialNumbers = null;
        }

        warrantyFormCacheModel.latestSerialNumber = getLatestSerialNumber();

        String latestSerialNumber = warrantyFormCacheModel.latestSerialNumber;

        if ((latestSerialNumber != null) && (latestSerialNumber.length() == 0)) {
            warrantyFormCacheModel.latestSerialNumber = null;
        }

        warrantyFormCacheModel.remark = getRemark();

        String remark = warrantyFormCacheModel.remark;

        if ((remark != null) && (remark.length() == 0)) {
            warrantyFormCacheModel.remark = null;
        }

        return warrantyFormCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{warrantyFormId=");
        sb.append(getWarrantyFormId());
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
        sb.append(", agentCode=");
        sb.append(getAgentCode());
        sb.append(", warrantyStartDate=");
        sb.append(getWarrantyStartDate());
        sb.append(", warrantyEndDate=");
        sb.append(getWarrantyEndDate());
        sb.append(", originalSerialNumber=");
        sb.append(getOriginalSerialNumber());
        sb.append(", hisSerialNumbers=");
        sb.append(getHisSerialNumbers());
        sb.append(", latestSerialNumber=");
        sb.append(getLatestSerialNumber());
        sb.append(", remark=");
        sb.append(getRemark());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.WarrantyForm");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>warrantyFormId</column-name><column-value><![CDATA[");
        sb.append(getWarrantyFormId());
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
            "<column><column-name>agentCode</column-name><column-value><![CDATA[");
        sb.append(getAgentCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>warrantyStartDate</column-name><column-value><![CDATA[");
        sb.append(getWarrantyStartDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>warrantyEndDate</column-name><column-value><![CDATA[");
        sb.append(getWarrantyEndDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>originalSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getOriginalSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>hisSerialNumbers</column-name><column-value><![CDATA[");
        sb.append(getHisSerialNumbers());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>latestSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getLatestSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>remark</column-name><column-value><![CDATA[");
        sb.append(getRemark());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
