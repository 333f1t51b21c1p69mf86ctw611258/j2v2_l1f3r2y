package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.NoSuchPartnerException;
import com.dasannetworks.vn.sb.model.Partner;
import com.dasannetworks.vn.sb.model.impl.PartnerImpl;
import com.dasannetworks.vn.sb.model.impl.PartnerModelImpl;
import com.dasannetworks.vn.sb.service.persistence.PartnerPersistence;

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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the partner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PartnerPersistence
 * @see PartnerUtil
 * @generated
 */
public class PartnerPersistenceImpl extends BasePersistenceImpl<Partner>
    implements PartnerPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PartnerUtil} to access the partner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PartnerImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PartnerModelImpl.ENTITY_CACHE_ENABLED,
            PartnerModelImpl.FINDER_CACHE_ENABLED, PartnerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PartnerModelImpl.ENTITY_CACHE_ENABLED,
            PartnerModelImpl.FINDER_CACHE_ENABLED, PartnerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PartnerModelImpl.ENTITY_CACHE_ENABLED,
            PartnerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_PARTNERCODE = new FinderPath(PartnerModelImpl.ENTITY_CACHE_ENABLED,
            PartnerModelImpl.FINDER_CACHE_ENABLED, PartnerImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByPartnerCode",
            new String[] { String.class.getName() },
            PartnerModelImpl.PARTNERCODE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PARTNERCODE = new FinderPath(PartnerModelImpl.ENTITY_CACHE_ENABLED,
            PartnerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPartnerCode",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_PARTNERCODE_PARTNERCODE_1 = "partner.partnerCode IS NULL";
    private static final String _FINDER_COLUMN_PARTNERCODE_PARTNERCODE_2 = "partner.partnerCode = ?";
    private static final String _FINDER_COLUMN_PARTNERCODE_PARTNERCODE_3 = "(partner.partnerCode IS NULL OR partner.partnerCode = '')";
    private static final String _SQL_SELECT_PARTNER = "SELECT partner FROM Partner partner";
    private static final String _SQL_SELECT_PARTNER_WHERE = "SELECT partner FROM Partner partner WHERE ";
    private static final String _SQL_COUNT_PARTNER = "SELECT COUNT(partner) FROM Partner partner";
    private static final String _SQL_COUNT_PARTNER_WHERE = "SELECT COUNT(partner) FROM Partner partner WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "partner.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Partner exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Partner exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PartnerPersistenceImpl.class);
    private static Partner _nullPartner = new PartnerImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Partner> toCacheModel() {
                return _nullPartnerCacheModel;
            }
        };

    private static CacheModel<Partner> _nullPartnerCacheModel = new CacheModel<Partner>() {
            @Override
            public Partner toEntityModel() {
                return _nullPartner;
            }
        };

    public PartnerPersistenceImpl() {
        setModelClass(Partner.class);
    }

    /**
     * Returns the partner where partnerCode = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchPartnerException} if it could not be found.
     *
     * @param partnerCode the partner code
     * @return the matching partner
     * @throws com.dasannetworks.vn.sb.NoSuchPartnerException if a matching partner could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Partner findByPartnerCode(String partnerCode)
        throws NoSuchPartnerException, SystemException {
        Partner partner = fetchByPartnerCode(partnerCode);

        if (partner == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("partnerCode=");
            msg.append(partnerCode);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchPartnerException(msg.toString());
        }

        return partner;
    }

    /**
     * Returns the partner where partnerCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param partnerCode the partner code
     * @return the matching partner, or <code>null</code> if a matching partner could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Partner fetchByPartnerCode(String partnerCode)
        throws SystemException {
        return fetchByPartnerCode(partnerCode, true);
    }

    /**
     * Returns the partner where partnerCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param partnerCode the partner code
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching partner, or <code>null</code> if a matching partner could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Partner fetchByPartnerCode(String partnerCode,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { partnerCode };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PARTNERCODE,
                    finderArgs, this);
        }

        if (result instanceof Partner) {
            Partner partner = (Partner) result;

            if (!Validator.equals(partnerCode, partner.getPartnerCode())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_PARTNER_WHERE);

            boolean bindPartnerCode = false;

            if (partnerCode == null) {
                query.append(_FINDER_COLUMN_PARTNERCODE_PARTNERCODE_1);
            } else if (partnerCode.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PARTNERCODE_PARTNERCODE_3);
            } else {
                bindPartnerCode = true;

                query.append(_FINDER_COLUMN_PARTNERCODE_PARTNERCODE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindPartnerCode) {
                    qPos.add(partnerCode);
                }

                List<Partner> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PARTNERCODE,
                        finderArgs, list);
                } else {
                    Partner partner = list.get(0);

                    result = partner;

                    cacheResult(partner);

                    if ((partner.getPartnerCode() == null) ||
                            !partner.getPartnerCode().equals(partnerCode)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PARTNERCODE,
                            finderArgs, partner);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PARTNERCODE,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Partner) result;
        }
    }

    /**
     * Removes the partner where partnerCode = &#63; from the database.
     *
     * @param partnerCode the partner code
     * @return the partner that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Partner removeByPartnerCode(String partnerCode)
        throws NoSuchPartnerException, SystemException {
        Partner partner = findByPartnerCode(partnerCode);

        return remove(partner);
    }

    /**
     * Returns the number of partners where partnerCode = &#63;.
     *
     * @param partnerCode the partner code
     * @return the number of matching partners
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByPartnerCode(String partnerCode) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PARTNERCODE;

        Object[] finderArgs = new Object[] { partnerCode };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PARTNER_WHERE);

            boolean bindPartnerCode = false;

            if (partnerCode == null) {
                query.append(_FINDER_COLUMN_PARTNERCODE_PARTNERCODE_1);
            } else if (partnerCode.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PARTNERCODE_PARTNERCODE_3);
            } else {
                bindPartnerCode = true;

                query.append(_FINDER_COLUMN_PARTNERCODE_PARTNERCODE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindPartnerCode) {
                    qPos.add(partnerCode);
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
     * Caches the partner in the entity cache if it is enabled.
     *
     * @param partner the partner
     */
    @Override
    public void cacheResult(Partner partner) {
        EntityCacheUtil.putResult(PartnerModelImpl.ENTITY_CACHE_ENABLED,
            PartnerImpl.class, partner.getPrimaryKey(), partner);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PARTNERCODE,
            new Object[] { partner.getPartnerCode() }, partner);

        partner.resetOriginalValues();
    }

    /**
     * Caches the partners in the entity cache if it is enabled.
     *
     * @param partners the partners
     */
    @Override
    public void cacheResult(List<Partner> partners) {
        for (Partner partner : partners) {
            if (EntityCacheUtil.getResult(
                        PartnerModelImpl.ENTITY_CACHE_ENABLED,
                        PartnerImpl.class, partner.getPrimaryKey()) == null) {
                cacheResult(partner);
            } else {
                partner.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all partners.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PartnerImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PartnerImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the partner.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Partner partner) {
        EntityCacheUtil.removeResult(PartnerModelImpl.ENTITY_CACHE_ENABLED,
            PartnerImpl.class, partner.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(partner);
    }

    @Override
    public void clearCache(List<Partner> partners) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Partner partner : partners) {
            EntityCacheUtil.removeResult(PartnerModelImpl.ENTITY_CACHE_ENABLED,
                PartnerImpl.class, partner.getPrimaryKey());

            clearUniqueFindersCache(partner);
        }
    }

    protected void cacheUniqueFindersCache(Partner partner) {
        if (partner.isNew()) {
            Object[] args = new Object[] { partner.getPartnerCode() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PARTNERCODE, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PARTNERCODE, args,
                partner);
        } else {
            PartnerModelImpl partnerModelImpl = (PartnerModelImpl) partner;

            if ((partnerModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_PARTNERCODE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { partner.getPartnerCode() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PARTNERCODE,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PARTNERCODE,
                    args, partner);
            }
        }
    }

    protected void clearUniqueFindersCache(Partner partner) {
        PartnerModelImpl partnerModelImpl = (PartnerModelImpl) partner;

        Object[] args = new Object[] { partner.getPartnerCode() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PARTNERCODE, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PARTNERCODE, args);

        if ((partnerModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_PARTNERCODE.getColumnBitmask()) != 0) {
            args = new Object[] { partnerModelImpl.getOriginalPartnerCode() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PARTNERCODE, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PARTNERCODE, args);
        }
    }

    /**
     * Creates a new partner with the primary key. Does not add the partner to the database.
     *
     * @param partnerId the primary key for the new partner
     * @return the new partner
     */
    @Override
    public Partner create(long partnerId) {
        Partner partner = new PartnerImpl();

        partner.setNew(true);
        partner.setPrimaryKey(partnerId);

        return partner;
    }

    /**
     * Removes the partner with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param partnerId the primary key of the partner
     * @return the partner that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchPartnerException if a partner with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Partner remove(long partnerId)
        throws NoSuchPartnerException, SystemException {
        return remove((Serializable) partnerId);
    }

    /**
     * Removes the partner with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the partner
     * @return the partner that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchPartnerException if a partner with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Partner remove(Serializable primaryKey)
        throws NoSuchPartnerException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Partner partner = (Partner) session.get(PartnerImpl.class,
                    primaryKey);

            if (partner == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPartnerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(partner);
        } catch (NoSuchPartnerException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Partner removeImpl(Partner partner) throws SystemException {
        partner = toUnwrappedModel(partner);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(partner)) {
                partner = (Partner) session.get(PartnerImpl.class,
                        partner.getPrimaryKeyObj());
            }

            if (partner != null) {
                session.delete(partner);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (partner != null) {
            clearCache(partner);
        }

        return partner;
    }

    @Override
    public Partner updateImpl(com.dasannetworks.vn.sb.model.Partner partner)
        throws SystemException {
        partner = toUnwrappedModel(partner);

        boolean isNew = partner.isNew();

        Session session = null;

        try {
            session = openSession();

            if (partner.isNew()) {
                session.save(partner);

                partner.setNew(false);
            } else {
                session.merge(partner);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PartnerModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(PartnerModelImpl.ENTITY_CACHE_ENABLED,
            PartnerImpl.class, partner.getPrimaryKey(), partner);

        clearUniqueFindersCache(partner);
        cacheUniqueFindersCache(partner);

        return partner;
    }

    protected Partner toUnwrappedModel(Partner partner) {
        if (partner instanceof PartnerImpl) {
            return partner;
        }

        PartnerImpl partnerImpl = new PartnerImpl();

        partnerImpl.setNew(partner.isNew());
        partnerImpl.setPrimaryKey(partner.getPrimaryKey());

        partnerImpl.setPartnerId(partner.getPartnerId());
        partnerImpl.setCompanyId(partner.getCompanyId());
        partnerImpl.setUserId(partner.getUserId());
        partnerImpl.setUserName(partner.getUserName());
        partnerImpl.setCreateDate(partner.getCreateDate());
        partnerImpl.setModifiedDate(partner.getModifiedDate());
        partnerImpl.setPartnerCode(partner.getPartnerCode());
        partnerImpl.setPartnerName(partner.getPartnerName());
        partnerImpl.setInCharge(partner.getInCharge());
        partnerImpl.setEmail(partner.getEmail());
        partnerImpl.setPhone(partner.getPhone());
        partnerImpl.setAddress(partner.getAddress());

        return partnerImpl;
    }

    /**
     * Returns the partner with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the partner
     * @return the partner
     * @throws com.dasannetworks.vn.sb.NoSuchPartnerException if a partner with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Partner findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPartnerException, SystemException {
        Partner partner = fetchByPrimaryKey(primaryKey);

        if (partner == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPartnerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return partner;
    }

    /**
     * Returns the partner with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchPartnerException} if it could not be found.
     *
     * @param partnerId the primary key of the partner
     * @return the partner
     * @throws com.dasannetworks.vn.sb.NoSuchPartnerException if a partner with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Partner findByPrimaryKey(long partnerId)
        throws NoSuchPartnerException, SystemException {
        return findByPrimaryKey((Serializable) partnerId);
    }

    /**
     * Returns the partner with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the partner
     * @return the partner, or <code>null</code> if a partner with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Partner fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Partner partner = (Partner) EntityCacheUtil.getResult(PartnerModelImpl.ENTITY_CACHE_ENABLED,
                PartnerImpl.class, primaryKey);

        if (partner == _nullPartner) {
            return null;
        }

        if (partner == null) {
            Session session = null;

            try {
                session = openSession();

                partner = (Partner) session.get(PartnerImpl.class, primaryKey);

                if (partner != null) {
                    cacheResult(partner);
                } else {
                    EntityCacheUtil.putResult(PartnerModelImpl.ENTITY_CACHE_ENABLED,
                        PartnerImpl.class, primaryKey, _nullPartner);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PartnerModelImpl.ENTITY_CACHE_ENABLED,
                    PartnerImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return partner;
    }

    /**
     * Returns the partner with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param partnerId the primary key of the partner
     * @return the partner, or <code>null</code> if a partner with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Partner fetchByPrimaryKey(long partnerId) throws SystemException {
        return fetchByPrimaryKey((Serializable) partnerId);
    }

    /**
     * Returns all the partners.
     *
     * @return the partners
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Partner> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the partners.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PartnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of partners
     * @param end the upper bound of the range of partners (not inclusive)
     * @return the range of partners
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Partner> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the partners.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PartnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of partners
     * @param end the upper bound of the range of partners (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of partners
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Partner> findAll(int start, int end,
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

        List<Partner> list = (List<Partner>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PARTNER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PARTNER;

                if (pagination) {
                    sql = sql.concat(PartnerModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Partner>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Partner>(list);
                } else {
                    list = (List<Partner>) QueryUtil.list(q, getDialect(),
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
     * Removes all the partners from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Partner partner : findAll()) {
            remove(partner);
        }
    }

    /**
     * Returns the number of partners.
     *
     * @return the number of partners
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

                Query q = session.createQuery(_SQL_COUNT_PARTNER);

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

    /**
     * Initializes the partner persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.dasannetworks.vn.sb.model.Partner")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Partner>> listenersList = new ArrayList<ModelListener<Partner>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Partner>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PartnerImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
