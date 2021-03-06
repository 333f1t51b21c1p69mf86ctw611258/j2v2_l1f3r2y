package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.RmaReplacement;
import com.dasannetworks.vn.sb.model.RmaReplacementModel;
import com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the RmaReplacement service. Represents a row in the &quot;tms_RmaReplacement&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.dasannetworks.vn.sb.model.RmaReplacementModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RmaReplacementImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaReplacementImpl
 * @see com.dasannetworks.vn.sb.model.RmaReplacement
 * @see com.dasannetworks.vn.sb.model.RmaReplacementModel
 * @generated
 */
public class RmaReplacementModelImpl extends BaseModelImpl<RmaReplacement>
    implements RmaReplacementModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a rma replacement model instance should use the {@link com.dasannetworks.vn.sb.model.RmaReplacement} interface instead.
     */
    public static final String TABLE_NAME = "tms_RmaReplacement";
    public static final Object[][] TABLE_COLUMNS = {
            { "rmaRequestId", Types.BIGINT },
            { "replacedNumber", Types.VARCHAR },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "status", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table tms_RmaReplacement (rmaRequestId LONG not null,replacedNumber VARCHAR(75) not null,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,status INTEGER,primary key (rmaRequestId, replacedNumber))";
    public static final String TABLE_SQL_DROP = "drop table tms_RmaReplacement";
    public static final String ORDER_BY_JPQL = " ORDER BY rmaReplacement.id.rmaRequestId ASC, rmaReplacement.id.replacedNumber ASC";
    public static final String ORDER_BY_SQL = " ORDER BY tms_RmaReplacement.rmaRequestId ASC, tms_RmaReplacement.replacedNumber ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.dasannetworks.vn.sb.model.RmaReplacement"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.dasannetworks.vn.sb.model.RmaReplacement"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.dasannetworks.vn.sb.model.RmaReplacement"),
            true);
    public static long REPLACEDNUMBER_COLUMN_BITMASK = 1L;
    public static long RMAREQUESTID_COLUMN_BITMASK = 2L;
    public static long STATUS_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.dasannetworks.vn.sb.model.RmaReplacement"));
    private static ClassLoader _classLoader = RmaReplacement.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            RmaReplacement.class
        };
    private long _rmaRequestId;
    private long _originalRmaRequestId;
    private boolean _setOriginalRmaRequestId;
    private String _replacedNumber;
    private String _originalReplacedNumber;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private int _status;
    private int _originalStatus;
    private boolean _setOriginalStatus;
    private long _columnBitmask;
    private RmaReplacement _escapedModel;

    public RmaReplacementModelImpl() {
    }

    @Override
    public RmaReplacementPK getPrimaryKey() {
        return new RmaReplacementPK(_rmaRequestId, _replacedNumber);
    }

    @Override
    public void setPrimaryKey(RmaReplacementPK primaryKey) {
        setRmaRequestId(primaryKey.rmaRequestId);
        setReplacedNumber(primaryKey.replacedNumber);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new RmaReplacementPK(_rmaRequestId, _replacedNumber);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((RmaReplacementPK) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return RmaReplacement.class;
    }

    @Override
    public String getModelClassName() {
        return RmaReplacement.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("rmaRequestId", getRmaRequestId());
        attributes.put("replacedNumber", getReplacedNumber());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("status", getStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long rmaRequestId = (Long) attributes.get("rmaRequestId");

        if (rmaRequestId != null) {
            setRmaRequestId(rmaRequestId);
        }

        String replacedNumber = (String) attributes.get("replacedNumber");

        if (replacedNumber != null) {
            setReplacedNumber(replacedNumber);
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

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }
    }

    @Override
    public long getRmaRequestId() {
        return _rmaRequestId;
    }

    @Override
    public void setRmaRequestId(long rmaRequestId) {
        _columnBitmask |= RMAREQUESTID_COLUMN_BITMASK;

        if (!_setOriginalRmaRequestId) {
            _setOriginalRmaRequestId = true;

            _originalRmaRequestId = _rmaRequestId;
        }

        _rmaRequestId = rmaRequestId;
    }

    public long getOriginalRmaRequestId() {
        return _originalRmaRequestId;
    }

    @Override
    public String getReplacedNumber() {
        if (_replacedNumber == null) {
            return StringPool.BLANK;
        } else {
            return _replacedNumber;
        }
    }

    @Override
    public void setReplacedNumber(String replacedNumber) {
        _columnBitmask |= REPLACEDNUMBER_COLUMN_BITMASK;

        if (_originalReplacedNumber == null) {
            _originalReplacedNumber = _replacedNumber;
        }

        _replacedNumber = replacedNumber;
    }

    public String getOriginalReplacedNumber() {
        return GetterUtil.getString(_originalReplacedNumber);
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
    public RmaReplacement toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (RmaReplacement) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        RmaReplacementImpl rmaReplacementImpl = new RmaReplacementImpl();

        rmaReplacementImpl.setRmaRequestId(getRmaRequestId());
        rmaReplacementImpl.setReplacedNumber(getReplacedNumber());
        rmaReplacementImpl.setCompanyId(getCompanyId());
        rmaReplacementImpl.setUserId(getUserId());
        rmaReplacementImpl.setUserName(getUserName());
        rmaReplacementImpl.setCreateDate(getCreateDate());
        rmaReplacementImpl.setModifiedDate(getModifiedDate());
        rmaReplacementImpl.setStatus(getStatus());

        rmaReplacementImpl.resetOriginalValues();

        return rmaReplacementImpl;
    }

    @Override
    public int compareTo(RmaReplacement rmaReplacement) {
        RmaReplacementPK primaryKey = rmaReplacement.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RmaReplacement)) {
            return false;
        }

        RmaReplacement rmaReplacement = (RmaReplacement) obj;

        RmaReplacementPK primaryKey = rmaReplacement.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public void resetOriginalValues() {
        RmaReplacementModelImpl rmaReplacementModelImpl = this;

        rmaReplacementModelImpl._originalRmaRequestId = rmaReplacementModelImpl._rmaRequestId;

        rmaReplacementModelImpl._setOriginalRmaRequestId = false;

        rmaReplacementModelImpl._originalReplacedNumber = rmaReplacementModelImpl._replacedNumber;

        rmaReplacementModelImpl._originalStatus = rmaReplacementModelImpl._status;

        rmaReplacementModelImpl._setOriginalStatus = false;

        rmaReplacementModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<RmaReplacement> toCacheModel() {
        RmaReplacementCacheModel rmaReplacementCacheModel = new RmaReplacementCacheModel();

        rmaReplacementCacheModel.rmaRequestId = getRmaRequestId();

        rmaReplacementCacheModel.replacedNumber = getReplacedNumber();

        String replacedNumber = rmaReplacementCacheModel.replacedNumber;

        if ((replacedNumber != null) && (replacedNumber.length() == 0)) {
            rmaReplacementCacheModel.replacedNumber = null;
        }

        rmaReplacementCacheModel.companyId = getCompanyId();

        rmaReplacementCacheModel.userId = getUserId();

        rmaReplacementCacheModel.userName = getUserName();

        String userName = rmaReplacementCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            rmaReplacementCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            rmaReplacementCacheModel.createDate = createDate.getTime();
        } else {
            rmaReplacementCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            rmaReplacementCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            rmaReplacementCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        rmaReplacementCacheModel.status = getStatus();

        return rmaReplacementCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{rmaRequestId=");
        sb.append(getRmaRequestId());
        sb.append(", replacedNumber=");
        sb.append(getReplacedNumber());
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
        sb.append(", status=");
        sb.append(getStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.RmaReplacement");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>rmaRequestId</column-name><column-value><![CDATA[");
        sb.append(getRmaRequestId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>replacedNumber</column-name><column-value><![CDATA[");
        sb.append(getReplacedNumber());
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
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
