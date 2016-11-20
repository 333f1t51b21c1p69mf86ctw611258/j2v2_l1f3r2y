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
 * The persistence implementation for the hand over form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HandOverFormPersistence
 * @see HandOverFormService
 * @generated
 */
public class HandOverFormPersistenceImpl extends BasePersistenceImpl<HandOverForm>
    implements HandOverFormPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link HandOverFormService} to access the hand over form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
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
     * Caches the hand over form in the entity cache if it is enabled.
     *
     * @param handOverForm the hand over form
     */
    @Override
    public void cacheResult(HandOverForm handOverForm) {
        EntityCacheUtil.putResult(HandOverFormModelImpl.ENTITY_CACHE_ENABLED,
            HandOverFormImpl.class, handOverForm.getPrimaryKey(), handOverForm);

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
            Object[] args = new Object[] { handOverForm.getHandOverFormNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HANDOVERFORMNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HANDOVERFORMNUMBER,
                args, handOverForm);
        } else {
            HandOverFormModelImpl handOverFormModelImpl = (HandOverFormModelImpl) handOverForm;

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

        Object[] args = new Object[] { handOverForm.getHandOverFormNumber() };

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

        handOverFormImpl.setHandOverFormId(handOverForm.getHandOverFormId());
        handOverFormImpl.setCompanyId(handOverForm.getCompanyId());
        handOverFormImpl.setUserId(handOverForm.getUserId());
        handOverFormImpl.setUserName(handOverForm.getUserName());
        handOverFormImpl.setCreateDate(handOverForm.getCreateDate());
        handOverFormImpl.setModifiedDate(handOverForm.getModifiedDate());
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
