package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.NoSuchWarrantyFormException;
import com.dasannetworks.vn.sb.model.WarrantyForm;
import com.dasannetworks.vn.sb.model.impl.WarrantyFormImpl;
import com.dasannetworks.vn.sb.model.impl.WarrantyFormModelImpl;
import com.dasannetworks.vn.sb.service.persistence.WarrantyFormPersistence;

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
 * The persistence implementation for the warranty form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyFormPersistence
 * @see WarrantyFormUtil
 * @generated
 */
public class WarrantyFormPersistenceImpl extends BasePersistenceImpl<WarrantyForm>
    implements WarrantyFormPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link WarrantyFormUtil} to access the warranty form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = WarrantyFormImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(WarrantyFormModelImpl.ENTITY_CACHE_ENABLED,
            WarrantyFormModelImpl.FINDER_CACHE_ENABLED, WarrantyFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(WarrantyFormModelImpl.ENTITY_CACHE_ENABLED,
            WarrantyFormModelImpl.FINDER_CACHE_ENABLED, WarrantyFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(WarrantyFormModelImpl.ENTITY_CACHE_ENABLED,
            WarrantyFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_ORIGINALSERIALNUMBER = new FinderPath(WarrantyFormModelImpl.ENTITY_CACHE_ENABLED,
            WarrantyFormModelImpl.FINDER_CACHE_ENABLED, WarrantyFormImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByOriginalSerialNumber",
            new String[] { String.class.getName() },
            WarrantyFormModelImpl.ORIGINALSERIALNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ORIGINALSERIALNUMBER = new FinderPath(WarrantyFormModelImpl.ENTITY_CACHE_ENABLED,
            WarrantyFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByOriginalSerialNumber",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_ORIGINALSERIALNUMBER_ORIGINALSERIALNUMBER_1 =
        "warrantyForm.originalSerialNumber IS NULL";
    private static final String _FINDER_COLUMN_ORIGINALSERIALNUMBER_ORIGINALSERIALNUMBER_2 =
        "warrantyForm.originalSerialNumber = ?";
    private static final String _FINDER_COLUMN_ORIGINALSERIALNUMBER_ORIGINALSERIALNUMBER_3 =
        "(warrantyForm.originalSerialNumber IS NULL OR warrantyForm.originalSerialNumber = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_LATESTSERIALNUMBER = new FinderPath(WarrantyFormModelImpl.ENTITY_CACHE_ENABLED,
            WarrantyFormModelImpl.FINDER_CACHE_ENABLED, WarrantyFormImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByLatestSerialNumber",
            new String[] { String.class.getName() },
            WarrantyFormModelImpl.LATESTSERIALNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_LATESTSERIALNUMBER = new FinderPath(WarrantyFormModelImpl.ENTITY_CACHE_ENABLED,
            WarrantyFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByLatestSerialNumber", new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_LATESTSERIALNUMBER_LATESTSERIALNUMBER_1 =
        "warrantyForm.latestSerialNumber IS NULL";
    private static final String _FINDER_COLUMN_LATESTSERIALNUMBER_LATESTSERIALNUMBER_2 =
        "warrantyForm.latestSerialNumber = ?";
    private static final String _FINDER_COLUMN_LATESTSERIALNUMBER_LATESTSERIALNUMBER_3 =
        "(warrantyForm.latestSerialNumber IS NULL OR warrantyForm.latestSerialNumber = '')";
    private static final String _SQL_SELECT_WARRANTYFORM = "SELECT warrantyForm FROM WarrantyForm warrantyForm";
    private static final String _SQL_SELECT_WARRANTYFORM_WHERE = "SELECT warrantyForm FROM WarrantyForm warrantyForm WHERE ";
    private static final String _SQL_COUNT_WARRANTYFORM = "SELECT COUNT(warrantyForm) FROM WarrantyForm warrantyForm";
    private static final String _SQL_COUNT_WARRANTYFORM_WHERE = "SELECT COUNT(warrantyForm) FROM WarrantyForm warrantyForm WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "warrantyForm.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No WarrantyForm exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No WarrantyForm exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(WarrantyFormPersistenceImpl.class);
    private static WarrantyForm _nullWarrantyForm = new WarrantyFormImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<WarrantyForm> toCacheModel() {
                return _nullWarrantyFormCacheModel;
            }
        };

    private static CacheModel<WarrantyForm> _nullWarrantyFormCacheModel = new CacheModel<WarrantyForm>() {
            @Override
            public WarrantyForm toEntityModel() {
                return _nullWarrantyForm;
            }
        };

    public WarrantyFormPersistenceImpl() {
        setModelClass(WarrantyForm.class);
    }

    /**
     * Returns the warranty form where originalSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchWarrantyFormException} if it could not be found.
     *
     * @param originalSerialNumber the original serial number
     * @return the matching warranty form
     * @throws com.dasannetworks.vn.sb.NoSuchWarrantyFormException if a matching warranty form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public WarrantyForm findByOriginalSerialNumber(String originalSerialNumber)
        throws NoSuchWarrantyFormException, SystemException {
        WarrantyForm warrantyForm = fetchByOriginalSerialNumber(originalSerialNumber);

        if (warrantyForm == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("originalSerialNumber=");
            msg.append(originalSerialNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchWarrantyFormException(msg.toString());
        }

        return warrantyForm;
    }

    /**
     * Returns the warranty form where originalSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param originalSerialNumber the original serial number
     * @return the matching warranty form, or <code>null</code> if a matching warranty form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public WarrantyForm fetchByOriginalSerialNumber(String originalSerialNumber)
        throws SystemException {
        return fetchByOriginalSerialNumber(originalSerialNumber, true);
    }

    /**
     * Returns the warranty form where originalSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param originalSerialNumber the original serial number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching warranty form, or <code>null</code> if a matching warranty form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public WarrantyForm fetchByOriginalSerialNumber(
        String originalSerialNumber, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { originalSerialNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ORIGINALSERIALNUMBER,
                    finderArgs, this);
        }

        if (result instanceof WarrantyForm) {
            WarrantyForm warrantyForm = (WarrantyForm) result;

            if (!Validator.equals(originalSerialNumber,
                        warrantyForm.getOriginalSerialNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_WARRANTYFORM_WHERE);

            boolean bindOriginalSerialNumber = false;

            if (originalSerialNumber == null) {
                query.append(_FINDER_COLUMN_ORIGINALSERIALNUMBER_ORIGINALSERIALNUMBER_1);
            } else if (originalSerialNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ORIGINALSERIALNUMBER_ORIGINALSERIALNUMBER_3);
            } else {
                bindOriginalSerialNumber = true;

                query.append(_FINDER_COLUMN_ORIGINALSERIALNUMBER_ORIGINALSERIALNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindOriginalSerialNumber) {
                    qPos.add(originalSerialNumber);
                }

                List<WarrantyForm> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ORIGINALSERIALNUMBER,
                        finderArgs, list);
                } else {
                    WarrantyForm warrantyForm = list.get(0);

                    result = warrantyForm;

                    cacheResult(warrantyForm);

                    if ((warrantyForm.getOriginalSerialNumber() == null) ||
                            !warrantyForm.getOriginalSerialNumber()
                                             .equals(originalSerialNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ORIGINALSERIALNUMBER,
                            finderArgs, warrantyForm);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ORIGINALSERIALNUMBER,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (WarrantyForm) result;
        }
    }

    /**
     * Removes the warranty form where originalSerialNumber = &#63; from the database.
     *
     * @param originalSerialNumber the original serial number
     * @return the warranty form that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public WarrantyForm removeByOriginalSerialNumber(
        String originalSerialNumber)
        throws NoSuchWarrantyFormException, SystemException {
        WarrantyForm warrantyForm = findByOriginalSerialNumber(originalSerialNumber);

        return remove(warrantyForm);
    }

    /**
     * Returns the number of warranty forms where originalSerialNumber = &#63;.
     *
     * @param originalSerialNumber the original serial number
     * @return the number of matching warranty forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByOriginalSerialNumber(String originalSerialNumber)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ORIGINALSERIALNUMBER;

        Object[] finderArgs = new Object[] { originalSerialNumber };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_WARRANTYFORM_WHERE);

            boolean bindOriginalSerialNumber = false;

            if (originalSerialNumber == null) {
                query.append(_FINDER_COLUMN_ORIGINALSERIALNUMBER_ORIGINALSERIALNUMBER_1);
            } else if (originalSerialNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ORIGINALSERIALNUMBER_ORIGINALSERIALNUMBER_3);
            } else {
                bindOriginalSerialNumber = true;

                query.append(_FINDER_COLUMN_ORIGINALSERIALNUMBER_ORIGINALSERIALNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindOriginalSerialNumber) {
                    qPos.add(originalSerialNumber);
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
     * Returns the warranty form where latestSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchWarrantyFormException} if it could not be found.
     *
     * @param latestSerialNumber the latest serial number
     * @return the matching warranty form
     * @throws com.dasannetworks.vn.sb.NoSuchWarrantyFormException if a matching warranty form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public WarrantyForm findByLatestSerialNumber(String latestSerialNumber)
        throws NoSuchWarrantyFormException, SystemException {
        WarrantyForm warrantyForm = fetchByLatestSerialNumber(latestSerialNumber);

        if (warrantyForm == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("latestSerialNumber=");
            msg.append(latestSerialNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchWarrantyFormException(msg.toString());
        }

        return warrantyForm;
    }

    /**
     * Returns the warranty form where latestSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param latestSerialNumber the latest serial number
     * @return the matching warranty form, or <code>null</code> if a matching warranty form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public WarrantyForm fetchByLatestSerialNumber(String latestSerialNumber)
        throws SystemException {
        return fetchByLatestSerialNumber(latestSerialNumber, true);
    }

    /**
     * Returns the warranty form where latestSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param latestSerialNumber the latest serial number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching warranty form, or <code>null</code> if a matching warranty form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public WarrantyForm fetchByLatestSerialNumber(String latestSerialNumber,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { latestSerialNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_LATESTSERIALNUMBER,
                    finderArgs, this);
        }

        if (result instanceof WarrantyForm) {
            WarrantyForm warrantyForm = (WarrantyForm) result;

            if (!Validator.equals(latestSerialNumber,
                        warrantyForm.getLatestSerialNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_WARRANTYFORM_WHERE);

            boolean bindLatestSerialNumber = false;

            if (latestSerialNumber == null) {
                query.append(_FINDER_COLUMN_LATESTSERIALNUMBER_LATESTSERIALNUMBER_1);
            } else if (latestSerialNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_LATESTSERIALNUMBER_LATESTSERIALNUMBER_3);
            } else {
                bindLatestSerialNumber = true;

                query.append(_FINDER_COLUMN_LATESTSERIALNUMBER_LATESTSERIALNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindLatestSerialNumber) {
                    qPos.add(latestSerialNumber);
                }

                List<WarrantyForm> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LATESTSERIALNUMBER,
                        finderArgs, list);
                } else {
                    WarrantyForm warrantyForm = list.get(0);

                    result = warrantyForm;

                    cacheResult(warrantyForm);

                    if ((warrantyForm.getLatestSerialNumber() == null) ||
                            !warrantyForm.getLatestSerialNumber()
                                             .equals(latestSerialNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LATESTSERIALNUMBER,
                            finderArgs, warrantyForm);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_LATESTSERIALNUMBER,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (WarrantyForm) result;
        }
    }

    /**
     * Removes the warranty form where latestSerialNumber = &#63; from the database.
     *
     * @param latestSerialNumber the latest serial number
     * @return the warranty form that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public WarrantyForm removeByLatestSerialNumber(String latestSerialNumber)
        throws NoSuchWarrantyFormException, SystemException {
        WarrantyForm warrantyForm = findByLatestSerialNumber(latestSerialNumber);

        return remove(warrantyForm);
    }

    /**
     * Returns the number of warranty forms where latestSerialNumber = &#63;.
     *
     * @param latestSerialNumber the latest serial number
     * @return the number of matching warranty forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByLatestSerialNumber(String latestSerialNumber)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_LATESTSERIALNUMBER;

        Object[] finderArgs = new Object[] { latestSerialNumber };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_WARRANTYFORM_WHERE);

            boolean bindLatestSerialNumber = false;

            if (latestSerialNumber == null) {
                query.append(_FINDER_COLUMN_LATESTSERIALNUMBER_LATESTSERIALNUMBER_1);
            } else if (latestSerialNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_LATESTSERIALNUMBER_LATESTSERIALNUMBER_3);
            } else {
                bindLatestSerialNumber = true;

                query.append(_FINDER_COLUMN_LATESTSERIALNUMBER_LATESTSERIALNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindLatestSerialNumber) {
                    qPos.add(latestSerialNumber);
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
     * Caches the warranty form in the entity cache if it is enabled.
     *
     * @param warrantyForm the warranty form
     */
    @Override
    public void cacheResult(WarrantyForm warrantyForm) {
        EntityCacheUtil.putResult(WarrantyFormModelImpl.ENTITY_CACHE_ENABLED,
            WarrantyFormImpl.class, warrantyForm.getPrimaryKey(), warrantyForm);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ORIGINALSERIALNUMBER,
            new Object[] { warrantyForm.getOriginalSerialNumber() },
            warrantyForm);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LATESTSERIALNUMBER,
            new Object[] { warrantyForm.getLatestSerialNumber() }, warrantyForm);

        warrantyForm.resetOriginalValues();
    }

    /**
     * Caches the warranty forms in the entity cache if it is enabled.
     *
     * @param warrantyForms the warranty forms
     */
    @Override
    public void cacheResult(List<WarrantyForm> warrantyForms) {
        for (WarrantyForm warrantyForm : warrantyForms) {
            if (EntityCacheUtil.getResult(
                        WarrantyFormModelImpl.ENTITY_CACHE_ENABLED,
                        WarrantyFormImpl.class, warrantyForm.getPrimaryKey()) == null) {
                cacheResult(warrantyForm);
            } else {
                warrantyForm.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all warranty forms.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(WarrantyFormImpl.class.getName());
        }

        EntityCacheUtil.clearCache(WarrantyFormImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the warranty form.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(WarrantyForm warrantyForm) {
        EntityCacheUtil.removeResult(WarrantyFormModelImpl.ENTITY_CACHE_ENABLED,
            WarrantyFormImpl.class, warrantyForm.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(warrantyForm);
    }

    @Override
    public void clearCache(List<WarrantyForm> warrantyForms) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (WarrantyForm warrantyForm : warrantyForms) {
            EntityCacheUtil.removeResult(WarrantyFormModelImpl.ENTITY_CACHE_ENABLED,
                WarrantyFormImpl.class, warrantyForm.getPrimaryKey());

            clearUniqueFindersCache(warrantyForm);
        }
    }

    protected void cacheUniqueFindersCache(WarrantyForm warrantyForm) {
        if (warrantyForm.isNew()) {
            Object[] args = new Object[] { warrantyForm.getOriginalSerialNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ORIGINALSERIALNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ORIGINALSERIALNUMBER,
                args, warrantyForm);

            args = new Object[] { warrantyForm.getLatestSerialNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_LATESTSERIALNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LATESTSERIALNUMBER,
                args, warrantyForm);
        } else {
            WarrantyFormModelImpl warrantyFormModelImpl = (WarrantyFormModelImpl) warrantyForm;

            if ((warrantyFormModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_ORIGINALSERIALNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        warrantyForm.getOriginalSerialNumber()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ORIGINALSERIALNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ORIGINALSERIALNUMBER,
                    args, warrantyForm);
            }

            if ((warrantyFormModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_LATESTSERIALNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        warrantyForm.getLatestSerialNumber()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_LATESTSERIALNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LATESTSERIALNUMBER,
                    args, warrantyForm);
            }
        }
    }

    protected void clearUniqueFindersCache(WarrantyForm warrantyForm) {
        WarrantyFormModelImpl warrantyFormModelImpl = (WarrantyFormModelImpl) warrantyForm;

        Object[] args = new Object[] { warrantyForm.getOriginalSerialNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORIGINALSERIALNUMBER,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ORIGINALSERIALNUMBER,
            args);

        if ((warrantyFormModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_ORIGINALSERIALNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] {
                    warrantyFormModelImpl.getOriginalOriginalSerialNumber()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORIGINALSERIALNUMBER,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ORIGINALSERIALNUMBER,
                args);
        }

        args = new Object[] { warrantyForm.getLatestSerialNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LATESTSERIALNUMBER,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_LATESTSERIALNUMBER,
            args);

        if ((warrantyFormModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_LATESTSERIALNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] {
                    warrantyFormModelImpl.getOriginalLatestSerialNumber()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LATESTSERIALNUMBER,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_LATESTSERIALNUMBER,
                args);
        }
    }

    /**
     * Creates a new warranty form with the primary key. Does not add the warranty form to the database.
     *
     * @param warrantyFormId the primary key for the new warranty form
     * @return the new warranty form
     */
    @Override
    public WarrantyForm create(long warrantyFormId) {
        WarrantyForm warrantyForm = new WarrantyFormImpl();

        warrantyForm.setNew(true);
        warrantyForm.setPrimaryKey(warrantyFormId);

        return warrantyForm;
    }

    /**
     * Removes the warranty form with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param warrantyFormId the primary key of the warranty form
     * @return the warranty form that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchWarrantyFormException if a warranty form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public WarrantyForm remove(long warrantyFormId)
        throws NoSuchWarrantyFormException, SystemException {
        return remove((Serializable) warrantyFormId);
    }

    /**
     * Removes the warranty form with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the warranty form
     * @return the warranty form that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchWarrantyFormException if a warranty form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public WarrantyForm remove(Serializable primaryKey)
        throws NoSuchWarrantyFormException, SystemException {
        Session session = null;

        try {
            session = openSession();

            WarrantyForm warrantyForm = (WarrantyForm) session.get(WarrantyFormImpl.class,
                    primaryKey);

            if (warrantyForm == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchWarrantyFormException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(warrantyForm);
        } catch (NoSuchWarrantyFormException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected WarrantyForm removeImpl(WarrantyForm warrantyForm)
        throws SystemException {
        warrantyForm = toUnwrappedModel(warrantyForm);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(warrantyForm)) {
                warrantyForm = (WarrantyForm) session.get(WarrantyFormImpl.class,
                        warrantyForm.getPrimaryKeyObj());
            }

            if (warrantyForm != null) {
                session.delete(warrantyForm);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (warrantyForm != null) {
            clearCache(warrantyForm);
        }

        return warrantyForm;
    }

    @Override
    public WarrantyForm updateImpl(
        com.dasannetworks.vn.sb.model.WarrantyForm warrantyForm)
        throws SystemException {
        warrantyForm = toUnwrappedModel(warrantyForm);

        boolean isNew = warrantyForm.isNew();

        Session session = null;

        try {
            session = openSession();

            if (warrantyForm.isNew()) {
                session.save(warrantyForm);

                warrantyForm.setNew(false);
            } else {
                session.merge(warrantyForm);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !WarrantyFormModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(WarrantyFormModelImpl.ENTITY_CACHE_ENABLED,
            WarrantyFormImpl.class, warrantyForm.getPrimaryKey(), warrantyForm);

        clearUniqueFindersCache(warrantyForm);
        cacheUniqueFindersCache(warrantyForm);

        return warrantyForm;
    }

    protected WarrantyForm toUnwrappedModel(WarrantyForm warrantyForm) {
        if (warrantyForm instanceof WarrantyFormImpl) {
            return warrantyForm;
        }

        WarrantyFormImpl warrantyFormImpl = new WarrantyFormImpl();

        warrantyFormImpl.setNew(warrantyForm.isNew());
        warrantyFormImpl.setPrimaryKey(warrantyForm.getPrimaryKey());

        warrantyFormImpl.setWarrantyFormId(warrantyForm.getWarrantyFormId());
        warrantyFormImpl.setCompanyId(warrantyForm.getCompanyId());
        warrantyFormImpl.setUserId(warrantyForm.getUserId());
        warrantyFormImpl.setUserName(warrantyForm.getUserName());
        warrantyFormImpl.setCreateDate(warrantyForm.getCreateDate());
        warrantyFormImpl.setModifiedDate(warrantyForm.getModifiedDate());
        warrantyFormImpl.setAgentCode(warrantyForm.getAgentCode());
        warrantyFormImpl.setWarrantyStartDate(warrantyForm.getWarrantyStartDate());
        warrantyFormImpl.setWarrantyEndDate(warrantyForm.getWarrantyEndDate());
        warrantyFormImpl.setOriginalSerialNumber(warrantyForm.getOriginalSerialNumber());
        warrantyFormImpl.setHisSerialNumbers(warrantyForm.getHisSerialNumbers());
        warrantyFormImpl.setLatestSerialNumber(warrantyForm.getLatestSerialNumber());
        warrantyFormImpl.setRemark(warrantyForm.getRemark());

        return warrantyFormImpl;
    }

    /**
     * Returns the warranty form with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the warranty form
     * @return the warranty form
     * @throws com.dasannetworks.vn.sb.NoSuchWarrantyFormException if a warranty form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public WarrantyForm findByPrimaryKey(Serializable primaryKey)
        throws NoSuchWarrantyFormException, SystemException {
        WarrantyForm warrantyForm = fetchByPrimaryKey(primaryKey);

        if (warrantyForm == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchWarrantyFormException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return warrantyForm;
    }

    /**
     * Returns the warranty form with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchWarrantyFormException} if it could not be found.
     *
     * @param warrantyFormId the primary key of the warranty form
     * @return the warranty form
     * @throws com.dasannetworks.vn.sb.NoSuchWarrantyFormException if a warranty form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public WarrantyForm findByPrimaryKey(long warrantyFormId)
        throws NoSuchWarrantyFormException, SystemException {
        return findByPrimaryKey((Serializable) warrantyFormId);
    }

    /**
     * Returns the warranty form with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the warranty form
     * @return the warranty form, or <code>null</code> if a warranty form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public WarrantyForm fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        WarrantyForm warrantyForm = (WarrantyForm) EntityCacheUtil.getResult(WarrantyFormModelImpl.ENTITY_CACHE_ENABLED,
                WarrantyFormImpl.class, primaryKey);

        if (warrantyForm == _nullWarrantyForm) {
            return null;
        }

        if (warrantyForm == null) {
            Session session = null;

            try {
                session = openSession();

                warrantyForm = (WarrantyForm) session.get(WarrantyFormImpl.class,
                        primaryKey);

                if (warrantyForm != null) {
                    cacheResult(warrantyForm);
                } else {
                    EntityCacheUtil.putResult(WarrantyFormModelImpl.ENTITY_CACHE_ENABLED,
                        WarrantyFormImpl.class, primaryKey, _nullWarrantyForm);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(WarrantyFormModelImpl.ENTITY_CACHE_ENABLED,
                    WarrantyFormImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return warrantyForm;
    }

    /**
     * Returns the warranty form with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param warrantyFormId the primary key of the warranty form
     * @return the warranty form, or <code>null</code> if a warranty form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public WarrantyForm fetchByPrimaryKey(long warrantyFormId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) warrantyFormId);
    }

    /**
     * Returns all the warranty forms.
     *
     * @return the warranty forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<WarrantyForm> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the warranty forms.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.WarrantyFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of warranty forms
     * @param end the upper bound of the range of warranty forms (not inclusive)
     * @return the range of warranty forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<WarrantyForm> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the warranty forms.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.WarrantyFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of warranty forms
     * @param end the upper bound of the range of warranty forms (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of warranty forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<WarrantyForm> findAll(int start, int end,
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

        List<WarrantyForm> list = (List<WarrantyForm>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_WARRANTYFORM);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_WARRANTYFORM;

                if (pagination) {
                    sql = sql.concat(WarrantyFormModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<WarrantyForm>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<WarrantyForm>(list);
                } else {
                    list = (List<WarrantyForm>) QueryUtil.list(q, getDialect(),
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
     * Removes all the warranty forms from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (WarrantyForm warrantyForm : findAll()) {
            remove(warrantyForm);
        }
    }

    /**
     * Returns the number of warranty forms.
     *
     * @return the number of warranty forms
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

                Query q = session.createQuery(_SQL_COUNT_WARRANTYFORM);

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
     * Initializes the warranty form persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.dasannetworks.vn.sb.model.WarrantyForm")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<WarrantyForm>> listenersList = new ArrayList<ModelListener<WarrantyForm>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<WarrantyForm>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(WarrantyFormImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
