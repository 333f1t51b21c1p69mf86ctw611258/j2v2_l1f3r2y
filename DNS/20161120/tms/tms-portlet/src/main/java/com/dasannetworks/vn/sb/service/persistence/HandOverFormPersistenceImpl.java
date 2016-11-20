package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.NoSuchHandOverFormException;
import com.dasannetworks.vn.sb.model.HandOverForm;
import com.dasannetworks.vn.sb.model.impl.HandOverFormImpl;
import com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl;
import com.dasannetworks.vn.sb.service.persistence.HandOverFormPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the hand over form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HandOverFormPersistence
 * @see HandOverFormUtil
 * @generated
 */
public class HandOverFormPersistenceImpl extends BasePersistenceImpl<HandOverForm>
    implements HandOverFormPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link HandOverFormUtil} to access the hand over form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = HandOverFormImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            HandOverFormModelImpl.UUID_COLUMN_BITMASK |
            HandOverFormModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "handOverForm.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "handOverForm.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(handOverForm.uuid IS NULL OR handOverForm.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            HandOverFormModelImpl.UUID_COLUMN_BITMASK |
            HandOverFormModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "handOverForm.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "handOverForm.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(handOverForm.uuid IS NULL OR handOverForm.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "handOverForm.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            HandOverFormModelImpl.UUID_COLUMN_BITMASK |
            HandOverFormModelImpl.COMPANYID_COLUMN_BITMASK |
            HandOverFormModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "handOverForm.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "handOverForm.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(handOverForm.uuid IS NULL OR handOverForm.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "handOverForm.companyId = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_HANDOVERFORMNUMBER = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByHandOverFormNumber",
            new String[] { String.class.getName() },
            HandOverFormModelImpl.HANDOVERFORMNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_HANDOVERFORMNUMBER = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByHandOverFormNumber", new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_HANDOVERFORMNUMBER_HANDOVERFORMNUMBER_1 =
        "handOverForm.handOverFormNumber IS NULL";
    private static final String _FINDER_COLUMN_HANDOVERFORMNUMBER_HANDOVERFORMNUMBER_2 =
        "handOverForm.handOverFormNumber = ?";
    private static final String _FINDER_COLUMN_HANDOVERFORMNUMBER_HANDOVERFORMNUMBER_3 =
        "(handOverForm.handOverFormNumber IS NULL OR handOverForm.handOverFormNumber = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            HandOverFormModelImpl.GROUPID_COLUMN_BITMASK |
            HandOverFormModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "handOverForm.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
            new String[] { Long.class.getName() },
            HandOverFormModelImpl.COMPANYID_COLUMN_BITMASK |
            HandOverFormModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "handOverForm.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CUSTOMERCODE =
        new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycustomerCode",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERCODE =
        new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycustomerCode",
            new String[] { String.class.getName() },
            HandOverFormModelImpl.CUSTOMERCODE_COLUMN_BITMASK |
            HandOverFormModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CUSTOMERCODE = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycustomerCode",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_1 = "handOverForm.customerCode IS NULL";
    private static final String _FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_2 = "handOverForm.customerCode = ?";
    private static final String _FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_3 = "(handOverForm.customerCode IS NULL OR handOverForm.customerCode = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_S = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_S",
            new String[] {
                Long.class.getName(), Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, HandOverFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_S",
            new String[] { Long.class.getName(), Integer.class.getName() },
            HandOverFormModelImpl.GROUPID_COLUMN_BITMASK |
            HandOverFormModelImpl.STATUS_COLUMN_BITMASK |
            HandOverFormModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_S = new FinderPath(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_S",
            new String[] { Long.class.getName(), Integer.class.getName() });
    private static final String _FINDER_COLUMN_G_S_GROUPID_2 = "handOverForm.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_S_STATUS_2 = "handOverForm.status = ?";
    private static final String _SQL_SELECT_HANDOVERFORM = "SELECT handOverForm FROM HandOverForm handOverForm";
    private static final String _SQL_SELECT_HANDOVERFORM_WHERE = "SELECT handOverForm FROM HandOverForm handOverForm WHERE ";
    private static final String _SQL_COUNT_HANDOVERFORM = "SELECT COUNT(handOverForm) FROM HandOverForm handOverForm";
    private static final String _SQL_COUNT_HANDOVERFORM_WHERE = "SELECT COUNT(handOverForm) FROM HandOverForm handOverForm WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "handOverForm.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HandOverForm exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No HandOverForm exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(HandOverFormPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static HandOverForm _nullHandOverForm = new HandOverFormImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<HandOverForm> toCacheModel() {
                return _nullHandOverFormCacheModel;
            }
        };

    private static CacheModel<HandOverForm> _nullHandOverFormCacheModel = new CacheModel<HandOverForm>() {
            @Override
            public HandOverForm toEntityModel() {
                return _nullHandOverForm;
            }
        };

    public HandOverFormPersistenceImpl() {
        setModelClass(HandOverForm.class);
    }

    /**
     * Returns all the hand over forms where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the hand over forms where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of hand over forms
     * @param end the upper bound of the range of hand over forms (not inclusive)
     * @return the range of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

    /**
     * Returns an ordered range of all the hand over forms where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of hand over forms
     * @param end the upper bound of the range of hand over forms (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findByUuid(String uuid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid, start, end, orderByComparator };
        }

        List<HandOverForm> list = (List<HandOverForm>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (HandOverForm handOverForm : list) {
                if (!Validator.equals(uuid, handOverForm.getUuid())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_HANDOVERFORM_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(HandOverFormModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<HandOverForm>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<HandOverForm>(list);
                } else {
                    list = (List<HandOverForm>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first hand over form in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = fetchByUuid_First(uuid, orderByComparator);

        if (handOverForm != null) {
            return handOverForm;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchHandOverFormException(msg.toString());
    }

    /**
     * Returns the first hand over form in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<HandOverForm> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last hand over form in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = fetchByUuid_Last(uuid, orderByComparator);

        if (handOverForm != null) {
            return handOverForm;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchHandOverFormException(msg.toString());
    }

    /**
     * Returns the last hand over form in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<HandOverForm> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the hand over forms before and after the current hand over form in the ordered set where uuid = &#63;.
     *
     * @param handOverFormId the primary key of the current hand over form
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a hand over form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm[] findByUuid_PrevAndNext(long handOverFormId,
        String uuid, OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = findByPrimaryKey(handOverFormId);

        Session session = null;

        try {
            session = openSession();

            HandOverForm[] array = new HandOverFormImpl[3];

            array[0] = getByUuid_PrevAndNext(session, handOverForm, uuid,
                    orderByComparator, true);

            array[1] = handOverForm;

            array[2] = getByUuid_PrevAndNext(session, handOverForm, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected HandOverForm getByUuid_PrevAndNext(Session session,
        HandOverForm handOverForm, String uuid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_HANDOVERFORM_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(HandOverFormModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(handOverForm);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<HandOverForm> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the hand over forms where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (HandOverForm handOverForm : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(handOverForm);
        }
    }

    /**
     * Returns the number of hand over forms where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid(String uuid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] { uuid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_HANDOVERFORM_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the hand over form where uuid = &#63; and groupId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchHandOverFormException} if it could not be found.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findByUUID_G(String uuid, long groupId)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = fetchByUUID_G(uuid, groupId);

        if (handOverForm == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("uuid=");
            msg.append(uuid);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchHandOverFormException(msg.toString());
        }

        return handOverForm;
    }

    /**
     * Returns the hand over form where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
    }

    /**
     * Returns the hand over form where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof HandOverForm) {
            HandOverForm handOverForm = (HandOverForm) result;

            if (!Validator.equals(uuid, handOverForm.getUuid()) ||
                    (groupId != handOverForm.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_HANDOVERFORM_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                List<HandOverForm> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    HandOverForm handOverForm = list.get(0);

                    result = handOverForm;

                    cacheResult(handOverForm);

                    if ((handOverForm.getUuid() == null) ||
                            !handOverForm.getUuid().equals(uuid) ||
                            (handOverForm.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, handOverForm);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (HandOverForm) result;
        }
    }

    /**
     * Removes the hand over form where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the hand over form that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm removeByUUID_G(String uuid, long groupId)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = findByUUID_G(uuid, groupId);

        return remove(handOverForm);
    }

    /**
     * Returns the number of hand over forms where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUUID_G(String uuid, long groupId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

        Object[] finderArgs = new Object[] { uuid, groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_HANDOVERFORM_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the hand over forms where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the hand over forms where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of hand over forms
     * @param end the upper bound of the range of hand over forms (not inclusive)
     * @return the range of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findByUuid_C(String uuid, long companyId,
        int start, int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
    }

    /**
     * Returns an ordered range of all the hand over forms where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of hand over forms
     * @param end the upper bound of the range of hand over forms (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findByUuid_C(String uuid, long companyId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] { uuid, companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] {
                    uuid, companyId,
                    
                    start, end, orderByComparator
                };
        }

        List<HandOverForm> list = (List<HandOverForm>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (HandOverForm handOverForm : list) {
                if (!Validator.equals(uuid, handOverForm.getUuid()) ||
                        (companyId != handOverForm.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_HANDOVERFORM_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(HandOverFormModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<HandOverForm>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<HandOverForm>(list);
                } else {
                    list = (List<HandOverForm>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first hand over form in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = fetchByUuid_C_First(uuid, companyId,
                orderByComparator);

        if (handOverForm != null) {
            return handOverForm;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchHandOverFormException(msg.toString());
    }

    /**
     * Returns the first hand over form in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<HandOverForm> list = findByUuid_C(uuid, companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last hand over form in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = fetchByUuid_C_Last(uuid, companyId,
                orderByComparator);

        if (handOverForm != null) {
            return handOverForm;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchHandOverFormException(msg.toString());
    }

    /**
     * Returns the last hand over form in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<HandOverForm> list = findByUuid_C(uuid, companyId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the hand over forms before and after the current hand over form in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param handOverFormId the primary key of the current hand over form
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a hand over form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm[] findByUuid_C_PrevAndNext(long handOverFormId,
        String uuid, long companyId, OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = findByPrimaryKey(handOverFormId);

        Session session = null;

        try {
            session = openSession();

            HandOverForm[] array = new HandOverFormImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, handOverForm, uuid,
                    companyId, orderByComparator, true);

            array[1] = handOverForm;

            array[2] = getByUuid_C_PrevAndNext(session, handOverForm, uuid,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected HandOverForm getByUuid_C_PrevAndNext(Session session,
        HandOverForm handOverForm, String uuid, long companyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_HANDOVERFORM_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_C_UUID_2);
        }

        query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(HandOverFormModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(handOverForm);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<HandOverForm> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the hand over forms where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (HandOverForm handOverForm : findByUuid_C(uuid, companyId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(handOverForm);
        }
    }

    /**
     * Returns the number of hand over forms where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid_C(String uuid, long companyId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

        Object[] finderArgs = new Object[] { uuid, companyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_HANDOVERFORM_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the hand over form where handOverFormNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchHandOverFormException} if it could not be found.
     *
     * @param handOverFormNumber the hand over form number
     * @return the matching hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findByHandOverFormNumber(String handOverFormNumber)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = fetchByHandOverFormNumber(handOverFormNumber);

        if (handOverForm == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("handOverFormNumber=");
            msg.append(handOverFormNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchHandOverFormException(msg.toString());
        }

        return handOverForm;
    }

    /**
     * Returns the hand over form where handOverFormNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param handOverFormNumber the hand over form number
     * @return the matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByHandOverFormNumber(String handOverFormNumber)
        throws SystemException {
        return fetchByHandOverFormNumber(handOverFormNumber, true);
    }

    /**
     * Returns the hand over form where handOverFormNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param handOverFormNumber the hand over form number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByHandOverFormNumber(String handOverFormNumber,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { handOverFormNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_HANDOVERFORMNUMBER,
                    finderArgs, this);
        }

        if (result instanceof HandOverForm) {
            HandOverForm handOverForm = (HandOverForm) result;

            if (!Validator.equals(handOverFormNumber,
                        handOverForm.getHandOverFormNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_HANDOVERFORM_WHERE);

            boolean bindHandOverFormNumber = false;

            if (handOverFormNumber == null) {
                query.append(_FINDER_COLUMN_HANDOVERFORMNUMBER_HANDOVERFORMNUMBER_1);
            } else if (handOverFormNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_HANDOVERFORMNUMBER_HANDOVERFORMNUMBER_3);
            } else {
                bindHandOverFormNumber = true;

                query.append(_FINDER_COLUMN_HANDOVERFORMNUMBER_HANDOVERFORMNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindHandOverFormNumber) {
                    qPos.add(handOverFormNumber);
                }

                List<HandOverForm> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HANDOVERFORMNUMBER,
                        finderArgs, list);
                } else {
                    HandOverForm handOverForm = list.get(0);

                    result = handOverForm;

                    cacheResult(handOverForm);

                    if ((handOverForm.getHandOverFormNumber() == null) ||
                            !handOverForm.getHandOverFormNumber()
                                             .equals(handOverFormNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HANDOVERFORMNUMBER,
                            finderArgs, handOverForm);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HANDOVERFORMNUMBER,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (HandOverForm) result;
        }
    }

    /**
     * Removes the hand over form where handOverFormNumber = &#63; from the database.
     *
     * @param handOverFormNumber the hand over form number
     * @return the hand over form that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm removeByHandOverFormNumber(String handOverFormNumber)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = findByHandOverFormNumber(handOverFormNumber);

        return remove(handOverForm);
    }

    /**
     * Returns the number of hand over forms where handOverFormNumber = &#63;.
     *
     * @param handOverFormNumber the hand over form number
     * @return the number of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByHandOverFormNumber(String handOverFormNumber)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_HANDOVERFORMNUMBER;

        Object[] finderArgs = new Object[] { handOverFormNumber };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_HANDOVERFORM_WHERE);

            boolean bindHandOverFormNumber = false;

            if (handOverFormNumber == null) {
                query.append(_FINDER_COLUMN_HANDOVERFORMNUMBER_HANDOVERFORMNUMBER_1);
            } else if (handOverFormNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_HANDOVERFORMNUMBER_HANDOVERFORMNUMBER_3);
            } else {
                bindHandOverFormNumber = true;

                query.append(_FINDER_COLUMN_HANDOVERFORMNUMBER_HANDOVERFORMNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindHandOverFormNumber) {
                    qPos.add(handOverFormNumber);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the hand over forms where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findByGroupId(long groupId)
        throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the hand over forms where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of hand over forms
     * @param end the upper bound of the range of hand over forms (not inclusive)
     * @return the range of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the hand over forms where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of hand over forms
     * @param end the upper bound of the range of hand over forms (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findByGroupId(long groupId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId, start, end, orderByComparator };
        }

        List<HandOverForm> list = (List<HandOverForm>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (HandOverForm handOverForm : list) {
                if ((groupId != handOverForm.getGroupId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_HANDOVERFORM_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(HandOverFormModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<HandOverForm>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<HandOverForm>(list);
                } else {
                    list = (List<HandOverForm>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first hand over form in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = fetchByGroupId_First(groupId,
                orderByComparator);

        if (handOverForm != null) {
            return handOverForm;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchHandOverFormException(msg.toString());
    }

    /**
     * Returns the first hand over form in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<HandOverForm> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last hand over form in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = fetchByGroupId_Last(groupId,
                orderByComparator);

        if (handOverForm != null) {
            return handOverForm;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchHandOverFormException(msg.toString());
    }

    /**
     * Returns the last hand over form in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<HandOverForm> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the hand over forms before and after the current hand over form in the ordered set where groupId = &#63;.
     *
     * @param handOverFormId the primary key of the current hand over form
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a hand over form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm[] findByGroupId_PrevAndNext(long handOverFormId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = findByPrimaryKey(handOverFormId);

        Session session = null;

        try {
            session = openSession();

            HandOverForm[] array = new HandOverFormImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, handOverForm, groupId,
                    orderByComparator, true);

            array[1] = handOverForm;

            array[2] = getByGroupId_PrevAndNext(session, handOverForm, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected HandOverForm getByGroupId_PrevAndNext(Session session,
        HandOverForm handOverForm, long groupId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_HANDOVERFORM_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(HandOverFormModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(handOverForm);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<HandOverForm> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the hand over forms where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (HandOverForm handOverForm : findByGroupId(groupId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(handOverForm);
        }
    }

    /**
     * Returns the number of hand over forms where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByGroupId(long groupId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_HANDOVERFORM_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the hand over forms where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findByCompanyId(long companyId)
        throws SystemException {
        return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the hand over forms where companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param companyId the company ID
     * @param start the lower bound of the range of hand over forms
     * @param end the upper bound of the range of hand over forms (not inclusive)
     * @return the range of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findByCompanyId(long companyId, int start, int end)
        throws SystemException {
        return findByCompanyId(companyId, start, end, null);
    }

    /**
     * Returns an ordered range of all the hand over forms where companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param companyId the company ID
     * @param start the lower bound of the range of hand over forms
     * @param end the upper bound of the range of hand over forms (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findByCompanyId(long companyId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
            finderArgs = new Object[] { companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
            finderArgs = new Object[] { companyId, start, end, orderByComparator };
        }

        List<HandOverForm> list = (List<HandOverForm>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (HandOverForm handOverForm : list) {
                if ((companyId != handOverForm.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_HANDOVERFORM_WHERE);

            query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(HandOverFormModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<HandOverForm>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<HandOverForm>(list);
                } else {
                    list = (List<HandOverForm>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first hand over form in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findByCompanyId_First(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = fetchByCompanyId_First(companyId,
                orderByComparator);

        if (handOverForm != null) {
            return handOverForm;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchHandOverFormException(msg.toString());
    }

    /**
     * Returns the first hand over form in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByCompanyId_First(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<HandOverForm> list = findByCompanyId(companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last hand over form in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = fetchByCompanyId_Last(companyId,
                orderByComparator);

        if (handOverForm != null) {
            return handOverForm;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchHandOverFormException(msg.toString());
    }

    /**
     * Returns the last hand over form in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCompanyId(companyId);

        if (count == 0) {
            return null;
        }

        List<HandOverForm> list = findByCompanyId(companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the hand over forms before and after the current hand over form in the ordered set where companyId = &#63;.
     *
     * @param handOverFormId the primary key of the current hand over form
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a hand over form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm[] findByCompanyId_PrevAndNext(long handOverFormId,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = findByPrimaryKey(handOverFormId);

        Session session = null;

        try {
            session = openSession();

            HandOverForm[] array = new HandOverFormImpl[3];

            array[0] = getByCompanyId_PrevAndNext(session, handOverForm,
                    companyId, orderByComparator, true);

            array[1] = handOverForm;

            array[2] = getByCompanyId_PrevAndNext(session, handOverForm,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected HandOverForm getByCompanyId_PrevAndNext(Session session,
        HandOverForm handOverForm, long companyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_HANDOVERFORM_WHERE);

        query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(HandOverFormModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(handOverForm);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<HandOverForm> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the hand over forms where companyId = &#63; from the database.
     *
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByCompanyId(long companyId) throws SystemException {
        for (HandOverForm handOverForm : findByCompanyId(companyId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(handOverForm);
        }
    }

    /**
     * Returns the number of hand over forms where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the number of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByCompanyId(long companyId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

        Object[] finderArgs = new Object[] { companyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_HANDOVERFORM_WHERE);

            query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the hand over forms where customerCode = &#63;.
     *
     * @param customerCode the customer code
     * @return the matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findBycustomerCode(String customerCode)
        throws SystemException {
        return findBycustomerCode(customerCode, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the hand over forms where customerCode = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param customerCode the customer code
     * @param start the lower bound of the range of hand over forms
     * @param end the upper bound of the range of hand over forms (not inclusive)
     * @return the range of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findBycustomerCode(String customerCode,
        int start, int end) throws SystemException {
        return findBycustomerCode(customerCode, start, end, null);
    }

    /**
     * Returns an ordered range of all the hand over forms where customerCode = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param customerCode the customer code
     * @param start the lower bound of the range of hand over forms
     * @param end the upper bound of the range of hand over forms (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findBycustomerCode(String customerCode,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERCODE;
            finderArgs = new Object[] { customerCode };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CUSTOMERCODE;
            finderArgs = new Object[] {
                    customerCode,
                    
                    start, end, orderByComparator
                };
        }

        List<HandOverForm> list = (List<HandOverForm>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (HandOverForm handOverForm : list) {
                if (!Validator.equals(customerCode,
                            handOverForm.getCustomerCode())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_HANDOVERFORM_WHERE);

            boolean bindCustomerCode = false;

            if (customerCode == null) {
                query.append(_FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_1);
            } else if (customerCode.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_3);
            } else {
                bindCustomerCode = true;

                query.append(_FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(HandOverFormModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindCustomerCode) {
                    qPos.add(customerCode);
                }

                if (!pagination) {
                    list = (List<HandOverForm>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<HandOverForm>(list);
                } else {
                    list = (List<HandOverForm>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first hand over form in the ordered set where customerCode = &#63;.
     *
     * @param customerCode the customer code
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findBycustomerCode_First(String customerCode,
        OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = fetchBycustomerCode_First(customerCode,
                orderByComparator);

        if (handOverForm != null) {
            return handOverForm;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("customerCode=");
        msg.append(customerCode);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchHandOverFormException(msg.toString());
    }

    /**
     * Returns the first hand over form in the ordered set where customerCode = &#63;.
     *
     * @param customerCode the customer code
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchBycustomerCode_First(String customerCode,
        OrderByComparator orderByComparator) throws SystemException {
        List<HandOverForm> list = findBycustomerCode(customerCode, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last hand over form in the ordered set where customerCode = &#63;.
     *
     * @param customerCode the customer code
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findBycustomerCode_Last(String customerCode,
        OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = fetchBycustomerCode_Last(customerCode,
                orderByComparator);

        if (handOverForm != null) {
            return handOverForm;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("customerCode=");
        msg.append(customerCode);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchHandOverFormException(msg.toString());
    }

    /**
     * Returns the last hand over form in the ordered set where customerCode = &#63;.
     *
     * @param customerCode the customer code
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchBycustomerCode_Last(String customerCode,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBycustomerCode(customerCode);

        if (count == 0) {
            return null;
        }

        List<HandOverForm> list = findBycustomerCode(customerCode, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the hand over forms before and after the current hand over form in the ordered set where customerCode = &#63;.
     *
     * @param handOverFormId the primary key of the current hand over form
     * @param customerCode the customer code
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a hand over form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm[] findBycustomerCode_PrevAndNext(long handOverFormId,
        String customerCode, OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = findByPrimaryKey(handOverFormId);

        Session session = null;

        try {
            session = openSession();

            HandOverForm[] array = new HandOverFormImpl[3];

            array[0] = getBycustomerCode_PrevAndNext(session, handOverForm,
                    customerCode, orderByComparator, true);

            array[1] = handOverForm;

            array[2] = getBycustomerCode_PrevAndNext(session, handOverForm,
                    customerCode, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected HandOverForm getBycustomerCode_PrevAndNext(Session session,
        HandOverForm handOverForm, String customerCode,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_HANDOVERFORM_WHERE);

        boolean bindCustomerCode = false;

        if (customerCode == null) {
            query.append(_FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_1);
        } else if (customerCode.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_3);
        } else {
            bindCustomerCode = true;

            query.append(_FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(HandOverFormModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindCustomerCode) {
            qPos.add(customerCode);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(handOverForm);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<HandOverForm> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the hand over forms where customerCode = &#63; from the database.
     *
     * @param customerCode the customer code
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBycustomerCode(String customerCode)
        throws SystemException {
        for (HandOverForm handOverForm : findBycustomerCode(customerCode,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(handOverForm);
        }
    }

    /**
     * Returns the number of hand over forms where customerCode = &#63;.
     *
     * @param customerCode the customer code
     * @return the number of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBycustomerCode(String customerCode)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CUSTOMERCODE;

        Object[] finderArgs = new Object[] { customerCode };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_HANDOVERFORM_WHERE);

            boolean bindCustomerCode = false;

            if (customerCode == null) {
                query.append(_FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_1);
            } else if (customerCode.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_3);
            } else {
                bindCustomerCode = true;

                query.append(_FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindCustomerCode) {
                    qPos.add(customerCode);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the hand over forms where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @return the matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findByG_S(long groupId, int status)
        throws SystemException {
        return findByG_S(groupId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the hand over forms where groupId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param status the status
     * @param start the lower bound of the range of hand over forms
     * @param end the upper bound of the range of hand over forms (not inclusive)
     * @return the range of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findByG_S(long groupId, int status, int start,
        int end) throws SystemException {
        return findByG_S(groupId, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the hand over forms where groupId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param status the status
     * @param start the lower bound of the range of hand over forms
     * @param end the upper bound of the range of hand over forms (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findByG_S(long groupId, int status, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S;
            finderArgs = new Object[] { groupId, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_S;
            finderArgs = new Object[] {
                    groupId, status,
                    
                    start, end, orderByComparator
                };
        }

        List<HandOverForm> list = (List<HandOverForm>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (HandOverForm handOverForm : list) {
                if ((groupId != handOverForm.getGroupId()) ||
                        (status != handOverForm.getStatus())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_HANDOVERFORM_WHERE);

            query.append(_FINDER_COLUMN_G_S_GROUPID_2);

            query.append(_FINDER_COLUMN_G_S_STATUS_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(HandOverFormModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(status);

                if (!pagination) {
                    list = (List<HandOverForm>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<HandOverForm>(list);
                } else {
                    list = (List<HandOverForm>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first hand over form in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findByG_S_First(long groupId, int status,
        OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = fetchByG_S_First(groupId, status,
                orderByComparator);

        if (handOverForm != null) {
            return handOverForm;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchHandOverFormException(msg.toString());
    }

    /**
     * Returns the first hand over form in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByG_S_First(long groupId, int status,
        OrderByComparator orderByComparator) throws SystemException {
        List<HandOverForm> list = findByG_S(groupId, status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last hand over form in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findByG_S_Last(long groupId, int status,
        OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = fetchByG_S_Last(groupId, status,
                orderByComparator);

        if (handOverForm != null) {
            return handOverForm;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchHandOverFormException(msg.toString());
    }

    /**
     * Returns the last hand over form in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching hand over form, or <code>null</code> if a matching hand over form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByG_S_Last(long groupId, int status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_S(groupId, status);

        if (count == 0) {
            return null;
        }

        List<HandOverForm> list = findByG_S(groupId, status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the hand over forms before and after the current hand over form in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param handOverFormId the primary key of the current hand over form
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a hand over form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm[] findByG_S_PrevAndNext(long handOverFormId,
        long groupId, int status, OrderByComparator orderByComparator)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = findByPrimaryKey(handOverFormId);

        Session session = null;

        try {
            session = openSession();

            HandOverForm[] array = new HandOverFormImpl[3];

            array[0] = getByG_S_PrevAndNext(session, handOverForm, groupId,
                    status, orderByComparator, true);

            array[1] = handOverForm;

            array[2] = getByG_S_PrevAndNext(session, handOverForm, groupId,
                    status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected HandOverForm getByG_S_PrevAndNext(Session session,
        HandOverForm handOverForm, long groupId, int status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_HANDOVERFORM_WHERE);

        query.append(_FINDER_COLUMN_G_S_GROUPID_2);

        query.append(_FINDER_COLUMN_G_S_STATUS_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(HandOverFormModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(status);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(handOverForm);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<HandOverForm> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the hand over forms where groupId = &#63; and status = &#63; from the database.
     *
     * @param groupId the group ID
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_S(long groupId, int status) throws SystemException {
        for (HandOverForm handOverForm : findByG_S(groupId, status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(handOverForm);
        }
    }

    /**
     * Returns the number of hand over forms where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @return the number of matching hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_S(long groupId, int status) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_S;

        Object[] finderArgs = new Object[] { groupId, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_HANDOVERFORM_WHERE);

            query.append(_FINDER_COLUMN_G_S_GROUPID_2);

            query.append(_FINDER_COLUMN_G_S_STATUS_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(status);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the hand over form in the entity cache if it is enabled.
     *
     * @param handOverForm the hand over form
     */
    @Override
    public void cacheResult(HandOverForm handOverForm) {
        EntityCacheUtil.putResult(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormImpl.class, handOverForm.getPrimaryKey(), handOverForm);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { handOverForm.getUuid(), handOverForm.getGroupId() },
            handOverForm);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HANDOVERFORMNUMBER,
            new Object[] { handOverForm.getHandOverFormNumber() }, handOverForm);

        handOverForm.resetOriginalValues();
    }

    /**
     * Caches the hand over forms in the entity cache if it is enabled.
     *
     * @param handOverForms the hand over forms
     */
    @Override
    public void cacheResult(List<HandOverForm> handOverForms) {
        for (HandOverForm handOverForm : handOverForms) {
            if (EntityCacheUtil.getResult(
                        HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
                        HandOverFormImpl.class, handOverForm.getPrimaryKey()) == null) {
                cacheResult(handOverForm);
            } else {
                handOverForm.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all hand over forms.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(HandOverFormImpl.class.getName());
        }

        EntityCacheUtil.clearCache(HandOverFormImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the hand over form.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(HandOverForm handOverForm) {
        EntityCacheUtil.removeResult(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormImpl.class, handOverForm.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(handOverForm);
    }

    @Override
    public void clearCache(List<HandOverForm> handOverForms) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (HandOverForm handOverForm : handOverForms) {
            EntityCacheUtil.removeResult(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
                HandOverFormImpl.class, handOverForm.getPrimaryKey());

            clearUniqueFindersCache(handOverForm);
        }
    }

    protected void cacheUniqueFindersCache(HandOverForm handOverForm) {
        if (handOverForm.isNew()) {
            Object[] args = new Object[] {
                    handOverForm.getUuid(), handOverForm.getGroupId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                handOverForm);

            args = new Object[] { handOverForm.getHandOverFormNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HANDOVERFORMNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HANDOVERFORMNUMBER,
                args, handOverForm);
        } else {
            HandOverFormModelImpl handOverFormModelImpl = (HandOverFormModelImpl) handOverForm;

            if ((handOverFormModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        handOverForm.getUuid(), handOverForm.getGroupId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    handOverForm);
            }

            if ((handOverFormModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_HANDOVERFORMNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        handOverForm.getHandOverFormNumber()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HANDOVERFORMNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HANDOVERFORMNUMBER,
                    args, handOverForm);
            }
        }
    }

    protected void clearUniqueFindersCache(HandOverForm handOverForm) {
        HandOverFormModelImpl handOverFormModelImpl = (HandOverFormModelImpl) handOverForm;

        Object[] args = new Object[] {
                handOverForm.getUuid(), handOverForm.getGroupId()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((handOverFormModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    handOverFormModelImpl.getOriginalUuid(),
                    handOverFormModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }

        args = new Object[] { handOverForm.getHandOverFormNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HANDOVERFORMNUMBER,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HANDOVERFORMNUMBER,
            args);

        if ((handOverFormModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_HANDOVERFORMNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] {
                    handOverFormModelImpl.getOriginalHandOverFormNumber()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HANDOVERFORMNUMBER,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HANDOVERFORMNUMBER,
                args);
        }
    }

    /**
     * Creates a new hand over form with the primary key. Does not add the hand over form to the database.
     *
     * @param handOverFormId the primary key for the new hand over form
     * @return the new hand over form
     */
    @Override
    public HandOverForm create(long handOverFormId) {
        HandOverForm handOverForm = new HandOverFormImpl();

        handOverForm.setNew(true);
        handOverForm.setPrimaryKey(handOverFormId);

        String uuid = PortalUUIDUtil.generate();

        handOverForm.setUuid(uuid);

        return handOverForm;
    }

    /**
     * Removes the hand over form with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param handOverFormId the primary key of the hand over form
     * @return the hand over form that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a hand over form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm remove(long handOverFormId)
        throws NoSuchHandOverFormException, SystemException {
        return remove((Serializable) handOverFormId);
    }

    /**
     * Removes the hand over form with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the hand over form
     * @return the hand over form that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a hand over form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm remove(Serializable primaryKey)
        throws NoSuchHandOverFormException, SystemException {
        Session session = null;

        try {
            session = openSession();

            HandOverForm handOverForm = (HandOverForm) session.get(HandOverFormImpl.class,
                    primaryKey);

            if (handOverForm == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchHandOverFormException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(handOverForm);
        } catch (NoSuchHandOverFormException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected HandOverForm removeImpl(HandOverForm handOverForm)
        throws SystemException {
        handOverForm = toUnwrappedModel(handOverForm);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(handOverForm)) {
                handOverForm = (HandOverForm) session.get(HandOverFormImpl.class,
                        handOverForm.getPrimaryKeyObj());
            }

            if (handOverForm != null) {
                session.delete(handOverForm);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (handOverForm != null) {
            clearCache(handOverForm);
        }

        return handOverForm;
    }

    @Override
    public HandOverForm updateImpl(
        com.dasannetworks.vn.sb.model.HandOverForm handOverForm)
        throws SystemException {
        handOverForm = toUnwrappedModel(handOverForm);

        boolean isNew = handOverForm.isNew();

        HandOverFormModelImpl handOverFormModelImpl = (HandOverFormModelImpl) handOverForm;

        if (Validator.isNull(handOverForm.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            handOverForm.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (handOverForm.isNew()) {
                session.save(handOverForm);

                handOverForm.setNew(false);
            } else {
                session.merge(handOverForm);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !HandOverFormModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((handOverFormModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        handOverFormModelImpl.getOriginalUuid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { handOverFormModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((handOverFormModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        handOverFormModelImpl.getOriginalUuid(),
                        handOverFormModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        handOverFormModelImpl.getUuid(),
                        handOverFormModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((handOverFormModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        handOverFormModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { handOverFormModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((handOverFormModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        handOverFormModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);

                args = new Object[] { handOverFormModelImpl.getCompanyId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);
            }

            if ((handOverFormModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERCODE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        handOverFormModelImpl.getOriginalCustomerCode()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERCODE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERCODE,
                    args);

                args = new Object[] { handOverFormModelImpl.getCustomerCode() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERCODE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERCODE,
                    args);
            }

            if ((handOverFormModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        handOverFormModelImpl.getOriginalGroupId(),
                        handOverFormModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S,
                    args);

                args = new Object[] {
                        handOverFormModelImpl.getGroupId(),
                        handOverFormModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S,
                    args);
            }
        }

        EntityCacheUtil.putResult(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormImpl.class, handOverForm.getPrimaryKey(), handOverForm);

        clearUniqueFindersCache(handOverForm);
        cacheUniqueFindersCache(handOverForm);

        return handOverForm;
    }

    protected HandOverForm toUnwrappedModel(HandOverForm handOverForm) {
        if (handOverForm instanceof HandOverFormImpl) {
            return handOverForm;
        }

        HandOverFormImpl handOverFormImpl = new HandOverFormImpl();

        handOverFormImpl.setNew(handOverForm.isNew());
        handOverFormImpl.setPrimaryKey(handOverForm.getPrimaryKey());

        handOverFormImpl.setUuid(handOverForm.getUuid());
        handOverFormImpl.setHandOverFormId(handOverForm.getHandOverFormId());
        handOverFormImpl.setCompanyId(handOverForm.getCompanyId());
        handOverFormImpl.setUserId(handOverForm.getUserId());
        handOverFormImpl.setUserName(handOverForm.getUserName());
        handOverFormImpl.setCreateDate(handOverForm.getCreateDate());
        handOverFormImpl.setModifiedDate(handOverForm.getModifiedDate());
        handOverFormImpl.setGroupId(handOverForm.getGroupId());
        handOverFormImpl.setCustomerCode(handOverForm.getCustomerCode());
        handOverFormImpl.setContactPoint(handOverForm.getContactPoint());
        handOverFormImpl.setEmail(handOverForm.getEmail());
        handOverFormImpl.setPhone(handOverForm.getPhone());
        handOverFormImpl.setLocation(handOverForm.getLocation());
        handOverFormImpl.setPersonInCharge(handOverForm.getPersonInCharge());
        handOverFormImpl.setHandOverFormNumber(handOverForm.getHandOverFormNumber());
        handOverFormImpl.setNote(handOverForm.getNote());
        handOverFormImpl.setAssignDate(handOverForm.getAssignDate());
        handOverFormImpl.setEstimatedReturnDate(handOverForm.getEstimatedReturnDate());
        handOverFormImpl.setStatus(handOverForm.getStatus());
        handOverFormImpl.setStatusByUserId(handOverForm.getStatusByUserId());
        handOverFormImpl.setStatusDate(handOverForm.getStatusDate());
        handOverFormImpl.setTestId(handOverForm.getTestId());

        return handOverFormImpl;
    }

    /**
     * Returns the hand over form with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the hand over form
     * @return the hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a hand over form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findByPrimaryKey(Serializable primaryKey)
        throws NoSuchHandOverFormException, SystemException {
        HandOverForm handOverForm = fetchByPrimaryKey(primaryKey);

        if (handOverForm == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchHandOverFormException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return handOverForm;
    }

    /**
     * Returns the hand over form with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchHandOverFormException} if it could not be found.
     *
     * @param handOverFormId the primary key of the hand over form
     * @return the hand over form
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a hand over form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm findByPrimaryKey(long handOverFormId)
        throws NoSuchHandOverFormException, SystemException {
        return findByPrimaryKey((Serializable) handOverFormId);
    }

    /**
     * Returns the hand over form with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the hand over form
     * @return the hand over form, or <code>null</code> if a hand over form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        HandOverForm handOverForm = (HandOverForm) EntityCacheUtil.getResult(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
                HandOverFormImpl.class, primaryKey);

        if (handOverForm == _nullHandOverForm) {
            return null;
        }

        if (handOverForm == null) {
            Session session = null;

            try {
                session = openSession();

                handOverForm = (HandOverForm) session.get(HandOverFormImpl.class,
                        primaryKey);

                if (handOverForm != null) {
                    cacheResult(handOverForm);
                } else {
                    EntityCacheUtil.putResult(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
                        HandOverFormImpl.class, primaryKey, _nullHandOverForm);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
                    HandOverFormImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return handOverForm;
    }

    /**
     * Returns the hand over form with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param handOverFormId the primary key of the hand over form
     * @return the hand over form, or <code>null</code> if a hand over form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverForm fetchByPrimaryKey(long handOverFormId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) handOverFormId);
    }

    /**
     * Returns all the hand over forms.
     *
     * @return the hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the hand over forms.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hand over forms
     * @param end the upper bound of the range of hand over forms (not inclusive)
     * @return the range of hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the hand over forms.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hand over forms
     * @param end the upper bound of the range of hand over forms (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverForm> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<HandOverForm> list = (List<HandOverForm>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_HANDOVERFORM);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_HANDOVERFORM;

                if (pagination) {
                    sql = sql.concat(HandOverFormModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<HandOverForm>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<HandOverForm>(list);
                } else {
                    list = (List<HandOverForm>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the hand over forms from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (HandOverForm handOverForm : findAll()) {
            remove(handOverForm);
        }
    }

    /**
     * Returns the number of hand over forms.
     *
     * @return the number of hand over forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_HANDOVERFORM);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the hand over form persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.dasannetworks.vn.sb.model.HandOverForm")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<HandOverForm>> listenersList = new ArrayList<ModelListener<HandOverForm>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<HandOverForm>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(HandOverFormImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
