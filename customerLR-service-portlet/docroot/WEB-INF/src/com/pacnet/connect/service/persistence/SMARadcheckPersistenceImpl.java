/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.pacnet.connect.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.pacnet.connect.NoSuchSMARadcheckException;
import com.pacnet.connect.model.SMARadcheck;
import com.pacnet.connect.model.impl.SMARadcheckImpl;
import com.pacnet.connect.model.impl.SMARadcheckModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the s m a radcheck service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMARadcheckPersistence
 * @see SMARadcheckUtil
 * @generated
 */
public class SMARadcheckPersistenceImpl extends BasePersistenceImpl<SMARadcheck>
	implements SMARadcheckPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SMARadcheckUtil} to access the s m a radcheck persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SMARadcheckImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAUSERLISTBYCOMPANYID =
		new FinderPath(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
			SMARadcheckModelImpl.FINDER_CACHE_ENABLED, SMARadcheckImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMAUserListByCompanyId",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAUSERLISTBYCOMPANYID =
		new FinderPath(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
			SMARadcheckModelImpl.FINDER_CACHE_ENABLED, SMARadcheckImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMAUserListByCompanyId",
			new String[] { Integer.class.getName(), Long.class.getName() },
			SMARadcheckModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMARadcheckModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMAUSERLISTBYCOMPANYID = new FinderPath(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
			SMARadcheckModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMAUserListByCompanyId",
			new String[] { Integer.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAUSERLISTBYISADMIN =
		new FinderPath(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
			SMARadcheckModelImpl.FINDER_CACHE_ENABLED, SMARadcheckImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMAUserListByIsAdmin",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAUSERLISTBYISADMIN =
		new FinderPath(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
			SMARadcheckModelImpl.FINDER_CACHE_ENABLED, SMARadcheckImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMAUserListByIsAdmin",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			SMARadcheckModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMARadcheckModelImpl.ISADMIN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMAUSERLISTBYISADMIN = new FinderPath(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
			SMARadcheckModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMAUserListByIsAdmin",
			new String[] { Integer.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAUSERLISTBYISADMINCOMPANYID =
		new FinderPath(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
			SMARadcheckModelImpl.FINDER_CACHE_ENABLED, SMARadcheckImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMAUserListByIsAdminCompanyId",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAUSERLISTBYISADMINCOMPANYID =
		new FinderPath(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
			SMARadcheckModelImpl.FINDER_CACHE_ENABLED, SMARadcheckImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMAUserListByIsAdminCompanyId",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName()
			},
			SMARadcheckModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMARadcheckModelImpl.ISADMIN_COLUMN_BITMASK |
			SMARadcheckModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMAUSERLISTBYISADMINCOMPANYID =
		new FinderPath(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
			SMARadcheckModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMAUserListByIsAdminCompanyId",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
			SMARadcheckModelImpl.FINDER_CACHE_ENABLED, SMARadcheckImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
			SMARadcheckModelImpl.FINDER_CACHE_ENABLED, SMARadcheckImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
			SMARadcheckModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the s m a radcheck in the entity cache if it is enabled.
	 *
	 * @param smaRadcheck the s m a radcheck
	 */
	public void cacheResult(SMARadcheck smaRadcheck) {
		EntityCacheUtil.putResult(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
			SMARadcheckImpl.class, smaRadcheck.getPrimaryKey(), smaRadcheck);

		smaRadcheck.resetOriginalValues();
	}

	/**
	 * Caches the s m a radchecks in the entity cache if it is enabled.
	 *
	 * @param smaRadchecks the s m a radchecks
	 */
	public void cacheResult(List<SMARadcheck> smaRadchecks) {
		for (SMARadcheck smaRadcheck : smaRadchecks) {
			if (EntityCacheUtil.getResult(
						SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
						SMARadcheckImpl.class, smaRadcheck.getPrimaryKey()) == null) {
				cacheResult(smaRadcheck);
			}
			else {
				smaRadcheck.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all s m a radchecks.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SMARadcheckImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SMARadcheckImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the s m a radcheck.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SMARadcheck smaRadcheck) {
		EntityCacheUtil.removeResult(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
			SMARadcheckImpl.class, smaRadcheck.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SMARadcheck> smaRadchecks) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SMARadcheck smaRadcheck : smaRadchecks) {
			EntityCacheUtil.removeResult(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
				SMARadcheckImpl.class, smaRadcheck.getPrimaryKey());
		}
	}

	/**
	 * Creates a new s m a radcheck with the primary key. Does not add the s m a radcheck to the database.
	 *
	 * @param id the primary key for the new s m a radcheck
	 * @return the new s m a radcheck
	 */
	public SMARadcheck create(long id) {
		SMARadcheck smaRadcheck = new SMARadcheckImpl();

		smaRadcheck.setNew(true);
		smaRadcheck.setPrimaryKey(id);

		return smaRadcheck;
	}

	/**
	 * Removes the s m a radcheck with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the s m a radcheck
	 * @return the s m a radcheck that was removed
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException if a s m a radcheck with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck remove(long id)
		throws NoSuchSMARadcheckException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the s m a radcheck with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the s m a radcheck
	 * @return the s m a radcheck that was removed
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException if a s m a radcheck with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMARadcheck remove(Serializable primaryKey)
		throws NoSuchSMARadcheckException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SMARadcheck smaRadcheck = (SMARadcheck)session.get(SMARadcheckImpl.class,
					primaryKey);

			if (smaRadcheck == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSMARadcheckException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(smaRadcheck);
		}
		catch (NoSuchSMARadcheckException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected SMARadcheck removeImpl(SMARadcheck smaRadcheck)
		throws SystemException {
		smaRadcheck = toUnwrappedModel(smaRadcheck);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, smaRadcheck);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(smaRadcheck);

		return smaRadcheck;
	}

	@Override
	public SMARadcheck updateImpl(
		com.pacnet.connect.model.SMARadcheck smaRadcheck, boolean merge)
		throws SystemException {
		smaRadcheck = toUnwrappedModel(smaRadcheck);

		boolean isNew = smaRadcheck.isNew();

		SMARadcheckModelImpl smaRadcheckModelImpl = (SMARadcheckModelImpl)smaRadcheck;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, smaRadcheck, merge);

			smaRadcheck.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SMARadcheckModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((smaRadcheckModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAUSERLISTBYCOMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaRadcheckModelImpl.getOriginalIsActive()),
						Long.valueOf(smaRadcheckModelImpl.getOriginalCompanyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAUSERLISTBYCOMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAUSERLISTBYCOMPANYID,
					args);

				args = new Object[] {
						Integer.valueOf(smaRadcheckModelImpl.getIsActive()),
						Long.valueOf(smaRadcheckModelImpl.getCompanyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAUSERLISTBYCOMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAUSERLISTBYCOMPANYID,
					args);
			}

			if ((smaRadcheckModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAUSERLISTBYISADMIN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaRadcheckModelImpl.getOriginalIsActive()),
						Integer.valueOf(smaRadcheckModelImpl.getOriginalIsAdmin())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAUSERLISTBYISADMIN,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAUSERLISTBYISADMIN,
					args);

				args = new Object[] {
						Integer.valueOf(smaRadcheckModelImpl.getIsActive()),
						Integer.valueOf(smaRadcheckModelImpl.getIsAdmin())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAUSERLISTBYISADMIN,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAUSERLISTBYISADMIN,
					args);
			}

			if ((smaRadcheckModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAUSERLISTBYISADMINCOMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaRadcheckModelImpl.getOriginalIsActive()),
						Integer.valueOf(smaRadcheckModelImpl.getOriginalIsAdmin()),
						Long.valueOf(smaRadcheckModelImpl.getOriginalCompanyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAUSERLISTBYISADMINCOMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAUSERLISTBYISADMINCOMPANYID,
					args);

				args = new Object[] {
						Integer.valueOf(smaRadcheckModelImpl.getIsActive()),
						Integer.valueOf(smaRadcheckModelImpl.getIsAdmin()),
						Long.valueOf(smaRadcheckModelImpl.getCompanyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAUSERLISTBYISADMINCOMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAUSERLISTBYISADMINCOMPANYID,
					args);
			}
		}

		EntityCacheUtil.putResult(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
			SMARadcheckImpl.class, smaRadcheck.getPrimaryKey(), smaRadcheck);

		return smaRadcheck;
	}

	protected SMARadcheck toUnwrappedModel(SMARadcheck smaRadcheck) {
		if (smaRadcheck instanceof SMARadcheckImpl) {
			return smaRadcheck;
		}

		SMARadcheckImpl smaRadcheckImpl = new SMARadcheckImpl();

		smaRadcheckImpl.setNew(smaRadcheck.isNew());
		smaRadcheckImpl.setPrimaryKey(smaRadcheck.getPrimaryKey());

		smaRadcheckImpl.setId(smaRadcheck.getId());
		smaRadcheckImpl.setCompanyId(smaRadcheck.getCompanyId());
		smaRadcheckImpl.setUsername(smaRadcheck.getUsername());
		smaRadcheckImpl.setAttribute(smaRadcheck.getAttribute());
		smaRadcheckImpl.setOp(smaRadcheck.getOp());
		smaRadcheckImpl.setValue(smaRadcheck.getValue());
		smaRadcheckImpl.setIsAdmin(smaRadcheck.getIsAdmin());
		smaRadcheckImpl.setIsActive(smaRadcheck.getIsActive());
		smaRadcheckImpl.setCreatedOn(smaRadcheck.getCreatedOn());
		smaRadcheckImpl.setCreatedBy(smaRadcheck.getCreatedBy());
		smaRadcheckImpl.setUpdatedOn(smaRadcheck.getUpdatedOn());
		smaRadcheckImpl.setUpdatedBy(smaRadcheck.getUpdatedBy());

		return smaRadcheckImpl;
	}

	/**
	 * Returns the s m a radcheck with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the s m a radcheck
	 * @return the s m a radcheck
	 * @throws com.liferay.portal.NoSuchModelException if a s m a radcheck with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMARadcheck findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the s m a radcheck with the primary key or throws a {@link com.pacnet.connect.NoSuchSMARadcheckException} if it could not be found.
	 *
	 * @param id the primary key of the s m a radcheck
	 * @return the s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException if a s m a radcheck with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck findByPrimaryKey(long id)
		throws NoSuchSMARadcheckException, SystemException {
		SMARadcheck smaRadcheck = fetchByPrimaryKey(id);

		if (smaRadcheck == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchSMARadcheckException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return smaRadcheck;
	}

	/**
	 * Returns the s m a radcheck with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the s m a radcheck
	 * @return the s m a radcheck, or <code>null</code> if a s m a radcheck with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMARadcheck fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the s m a radcheck with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the s m a radcheck
	 * @return the s m a radcheck, or <code>null</code> if a s m a radcheck with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck fetchByPrimaryKey(long id) throws SystemException {
		SMARadcheck smaRadcheck = (SMARadcheck)EntityCacheUtil.getResult(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
				SMARadcheckImpl.class, id);

		if (smaRadcheck == _nullSMARadcheck) {
			return null;
		}

		if (smaRadcheck == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				smaRadcheck = (SMARadcheck)session.get(SMARadcheckImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (smaRadcheck != null) {
					cacheResult(smaRadcheck);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(SMARadcheckModelImpl.ENTITY_CACHE_ENABLED,
						SMARadcheckImpl.class, id, _nullSMARadcheck);
				}

				closeSession(session);
			}
		}

		return smaRadcheck;
	}

	/**
	 * Returns all the s m a radchecks where isActive = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @return the matching s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadcheck> findBySMAUserListByCompanyId(int isActive,
		long companyId) throws SystemException {
		return findBySMAUserListByCompanyId(isActive, companyId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a radchecks where isActive = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @param start the lower bound of the range of s m a radchecks
	 * @param end the upper bound of the range of s m a radchecks (not inclusive)
	 * @return the range of matching s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadcheck> findBySMAUserListByCompanyId(int isActive,
		long companyId, int start, int end) throws SystemException {
		return findBySMAUserListByCompanyId(isActive, companyId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the s m a radchecks where isActive = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @param start the lower bound of the range of s m a radchecks
	 * @param end the upper bound of the range of s m a radchecks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadcheck> findBySMAUserListByCompanyId(int isActive,
		long companyId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAUSERLISTBYCOMPANYID;
			finderArgs = new Object[] { isActive, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAUSERLISTBYCOMPANYID;
			finderArgs = new Object[] {
					isActive, companyId,
					
					start, end, orderByComparator
				};
		}

		List<SMARadcheck> list = (List<SMARadcheck>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMARadcheck smaRadcheck : list) {
				if ((isActive != smaRadcheck.getIsActive()) ||
						(companyId != smaRadcheck.getCompanyId())) {
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
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_SMARADCHECK_WHERE);

			query.append(_FINDER_COLUMN_SMAUSERLISTBYCOMPANYID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAUSERLISTBYCOMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				qPos.add(companyId);

				list = (List<SMARadcheck>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first s m a radcheck in the ordered set where isActive = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException if a matching s m a radcheck could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck findBySMAUserListByCompanyId_First(int isActive,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchSMARadcheckException, SystemException {
		SMARadcheck smaRadcheck = fetchBySMAUserListByCompanyId_First(isActive,
				companyId, orderByComparator);

		if (smaRadcheck != null) {
			return smaRadcheck;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMARadcheckException(msg.toString());
	}

	/**
	 * Returns the first s m a radcheck in the ordered set where isActive = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a radcheck, or <code>null</code> if a matching s m a radcheck could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck fetchBySMAUserListByCompanyId_First(int isActive,
		long companyId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMARadcheck> list = findBySMAUserListByCompanyId(isActive,
				companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a radcheck in the ordered set where isActive = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException if a matching s m a radcheck could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck findBySMAUserListByCompanyId_Last(int isActive,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchSMARadcheckException, SystemException {
		SMARadcheck smaRadcheck = fetchBySMAUserListByCompanyId_Last(isActive,
				companyId, orderByComparator);

		if (smaRadcheck != null) {
			return smaRadcheck;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMARadcheckException(msg.toString());
	}

	/**
	 * Returns the last s m a radcheck in the ordered set where isActive = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a radcheck, or <code>null</code> if a matching s m a radcheck could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck fetchBySMAUserListByCompanyId_Last(int isActive,
		long companyId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMAUserListByCompanyId(isActive, companyId);

		List<SMARadcheck> list = findBySMAUserListByCompanyId(isActive,
				companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a radchecks before and after the current s m a radcheck in the ordered set where isActive = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current s m a radcheck
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException if a s m a radcheck with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck[] findBySMAUserListByCompanyId_PrevAndNext(long id,
		int isActive, long companyId, OrderByComparator orderByComparator)
		throws NoSuchSMARadcheckException, SystemException {
		SMARadcheck smaRadcheck = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMARadcheck[] array = new SMARadcheckImpl[3];

			array[0] = getBySMAUserListByCompanyId_PrevAndNext(session,
					smaRadcheck, isActive, companyId, orderByComparator, true);

			array[1] = smaRadcheck;

			array[2] = getBySMAUserListByCompanyId_PrevAndNext(session,
					smaRadcheck, isActive, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMARadcheck getBySMAUserListByCompanyId_PrevAndNext(
		Session session, SMARadcheck smaRadcheck, int isActive, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMARADCHECK_WHERE);

		query.append(_FINDER_COLUMN_SMAUSERLISTBYCOMPANYID_ISACTIVE_2);

		query.append(_FINDER_COLUMN_SMAUSERLISTBYCOMPANYID_COMPANYID_2);

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
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
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
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isActive);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaRadcheck);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMARadcheck> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a radchecks where isActive = &#63; and isAdmin = &#63;.
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @return the matching s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadcheck> findBySMAUserListByIsAdmin(int isActive,
		int isAdmin) throws SystemException {
		return findBySMAUserListByIsAdmin(isActive, isAdmin, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a radchecks where isActive = &#63; and isAdmin = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param start the lower bound of the range of s m a radchecks
	 * @param end the upper bound of the range of s m a radchecks (not inclusive)
	 * @return the range of matching s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadcheck> findBySMAUserListByIsAdmin(int isActive,
		int isAdmin, int start, int end) throws SystemException {
		return findBySMAUserListByIsAdmin(isActive, isAdmin, start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a radchecks where isActive = &#63; and isAdmin = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param start the lower bound of the range of s m a radchecks
	 * @param end the upper bound of the range of s m a radchecks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadcheck> findBySMAUserListByIsAdmin(int isActive,
		int isAdmin, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAUSERLISTBYISADMIN;
			finderArgs = new Object[] { isActive, isAdmin };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAUSERLISTBYISADMIN;
			finderArgs = new Object[] {
					isActive, isAdmin,
					
					start, end, orderByComparator
				};
		}

		List<SMARadcheck> list = (List<SMARadcheck>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMARadcheck smaRadcheck : list) {
				if ((isActive != smaRadcheck.getIsActive()) ||
						(isAdmin != smaRadcheck.getIsAdmin())) {
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
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_SMARADCHECK_WHERE);

			query.append(_FINDER_COLUMN_SMAUSERLISTBYISADMIN_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAUSERLISTBYISADMIN_ISADMIN_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				qPos.add(isAdmin);

				list = (List<SMARadcheck>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first s m a radcheck in the ordered set where isActive = &#63; and isAdmin = &#63;.
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException if a matching s m a radcheck could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck findBySMAUserListByIsAdmin_First(int isActive,
		int isAdmin, OrderByComparator orderByComparator)
		throws NoSuchSMARadcheckException, SystemException {
		SMARadcheck smaRadcheck = fetchBySMAUserListByIsAdmin_First(isActive,
				isAdmin, orderByComparator);

		if (smaRadcheck != null) {
			return smaRadcheck;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", isAdmin=");
		msg.append(isAdmin);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMARadcheckException(msg.toString());
	}

	/**
	 * Returns the first s m a radcheck in the ordered set where isActive = &#63; and isAdmin = &#63;.
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a radcheck, or <code>null</code> if a matching s m a radcheck could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck fetchBySMAUserListByIsAdmin_First(int isActive,
		int isAdmin, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMARadcheck> list = findBySMAUserListByIsAdmin(isActive, isAdmin,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a radcheck in the ordered set where isActive = &#63; and isAdmin = &#63;.
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException if a matching s m a radcheck could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck findBySMAUserListByIsAdmin_Last(int isActive,
		int isAdmin, OrderByComparator orderByComparator)
		throws NoSuchSMARadcheckException, SystemException {
		SMARadcheck smaRadcheck = fetchBySMAUserListByIsAdmin_Last(isActive,
				isAdmin, orderByComparator);

		if (smaRadcheck != null) {
			return smaRadcheck;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", isAdmin=");
		msg.append(isAdmin);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMARadcheckException(msg.toString());
	}

	/**
	 * Returns the last s m a radcheck in the ordered set where isActive = &#63; and isAdmin = &#63;.
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a radcheck, or <code>null</code> if a matching s m a radcheck could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck fetchBySMAUserListByIsAdmin_Last(int isActive,
		int isAdmin, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMAUserListByIsAdmin(isActive, isAdmin);

		List<SMARadcheck> list = findBySMAUserListByIsAdmin(isActive, isAdmin,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a radchecks before and after the current s m a radcheck in the ordered set where isActive = &#63; and isAdmin = &#63;.
	 *
	 * @param id the primary key of the current s m a radcheck
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException if a s m a radcheck with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck[] findBySMAUserListByIsAdmin_PrevAndNext(long id,
		int isActive, int isAdmin, OrderByComparator orderByComparator)
		throws NoSuchSMARadcheckException, SystemException {
		SMARadcheck smaRadcheck = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMARadcheck[] array = new SMARadcheckImpl[3];

			array[0] = getBySMAUserListByIsAdmin_PrevAndNext(session,
					smaRadcheck, isActive, isAdmin, orderByComparator, true);

			array[1] = smaRadcheck;

			array[2] = getBySMAUserListByIsAdmin_PrevAndNext(session,
					smaRadcheck, isActive, isAdmin, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMARadcheck getBySMAUserListByIsAdmin_PrevAndNext(
		Session session, SMARadcheck smaRadcheck, int isActive, int isAdmin,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMARADCHECK_WHERE);

		query.append(_FINDER_COLUMN_SMAUSERLISTBYISADMIN_ISACTIVE_2);

		query.append(_FINDER_COLUMN_SMAUSERLISTBYISADMIN_ISADMIN_2);

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
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
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
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isActive);

		qPos.add(isAdmin);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaRadcheck);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMARadcheck> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a radchecks where isActive = &#63; and isAdmin = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param companyId the company ID
	 * @return the matching s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadcheck> findBySMAUserListByIsAdminCompanyId(int isActive,
		int isAdmin, long companyId) throws SystemException {
		return findBySMAUserListByIsAdminCompanyId(isActive, isAdmin,
			companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a radchecks where isActive = &#63; and isAdmin = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param companyId the company ID
	 * @param start the lower bound of the range of s m a radchecks
	 * @param end the upper bound of the range of s m a radchecks (not inclusive)
	 * @return the range of matching s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadcheck> findBySMAUserListByIsAdminCompanyId(int isActive,
		int isAdmin, long companyId, int start, int end)
		throws SystemException {
		return findBySMAUserListByIsAdminCompanyId(isActive, isAdmin,
			companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a radchecks where isActive = &#63; and isAdmin = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param companyId the company ID
	 * @param start the lower bound of the range of s m a radchecks
	 * @param end the upper bound of the range of s m a radchecks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadcheck> findBySMAUserListByIsAdminCompanyId(int isActive,
		int isAdmin, long companyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAUSERLISTBYISADMINCOMPANYID;
			finderArgs = new Object[] { isActive, isAdmin, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAUSERLISTBYISADMINCOMPANYID;
			finderArgs = new Object[] {
					isActive, isAdmin, companyId,
					
					start, end, orderByComparator
				};
		}

		List<SMARadcheck> list = (List<SMARadcheck>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMARadcheck smaRadcheck : list) {
				if ((isActive != smaRadcheck.getIsActive()) ||
						(isAdmin != smaRadcheck.getIsAdmin()) ||
						(companyId != smaRadcheck.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_SMARADCHECK_WHERE);

			query.append(_FINDER_COLUMN_SMAUSERLISTBYISADMINCOMPANYID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAUSERLISTBYISADMINCOMPANYID_ISADMIN_2);

			query.append(_FINDER_COLUMN_SMAUSERLISTBYISADMINCOMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				qPos.add(isAdmin);

				qPos.add(companyId);

				list = (List<SMARadcheck>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first s m a radcheck in the ordered set where isActive = &#63; and isAdmin = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException if a matching s m a radcheck could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck findBySMAUserListByIsAdminCompanyId_First(int isActive,
		int isAdmin, long companyId, OrderByComparator orderByComparator)
		throws NoSuchSMARadcheckException, SystemException {
		SMARadcheck smaRadcheck = fetchBySMAUserListByIsAdminCompanyId_First(isActive,
				isAdmin, companyId, orderByComparator);

		if (smaRadcheck != null) {
			return smaRadcheck;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", isAdmin=");
		msg.append(isAdmin);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMARadcheckException(msg.toString());
	}

	/**
	 * Returns the first s m a radcheck in the ordered set where isActive = &#63; and isAdmin = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a radcheck, or <code>null</code> if a matching s m a radcheck could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck fetchBySMAUserListByIsAdminCompanyId_First(
		int isActive, int isAdmin, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<SMARadcheck> list = findBySMAUserListByIsAdminCompanyId(isActive,
				isAdmin, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a radcheck in the ordered set where isActive = &#63; and isAdmin = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException if a matching s m a radcheck could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck findBySMAUserListByIsAdminCompanyId_Last(int isActive,
		int isAdmin, long companyId, OrderByComparator orderByComparator)
		throws NoSuchSMARadcheckException, SystemException {
		SMARadcheck smaRadcheck = fetchBySMAUserListByIsAdminCompanyId_Last(isActive,
				isAdmin, companyId, orderByComparator);

		if (smaRadcheck != null) {
			return smaRadcheck;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", isAdmin=");
		msg.append(isAdmin);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMARadcheckException(msg.toString());
	}

	/**
	 * Returns the last s m a radcheck in the ordered set where isActive = &#63; and isAdmin = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a radcheck, or <code>null</code> if a matching s m a radcheck could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck fetchBySMAUserListByIsAdminCompanyId_Last(int isActive,
		int isAdmin, long companyId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMAUserListByIsAdminCompanyId(isActive, isAdmin,
				companyId);

		List<SMARadcheck> list = findBySMAUserListByIsAdminCompanyId(isActive,
				isAdmin, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a radchecks before and after the current s m a radcheck in the ordered set where isActive = &#63; and isAdmin = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current s m a radcheck
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException if a s m a radcheck with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadcheck[] findBySMAUserListByIsAdminCompanyId_PrevAndNext(
		long id, int isActive, int isAdmin, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchSMARadcheckException, SystemException {
		SMARadcheck smaRadcheck = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMARadcheck[] array = new SMARadcheckImpl[3];

			array[0] = getBySMAUserListByIsAdminCompanyId_PrevAndNext(session,
					smaRadcheck, isActive, isAdmin, companyId,
					orderByComparator, true);

			array[1] = smaRadcheck;

			array[2] = getBySMAUserListByIsAdminCompanyId_PrevAndNext(session,
					smaRadcheck, isActive, isAdmin, companyId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMARadcheck getBySMAUserListByIsAdminCompanyId_PrevAndNext(
		Session session, SMARadcheck smaRadcheck, int isActive, int isAdmin,
		long companyId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMARADCHECK_WHERE);

		query.append(_FINDER_COLUMN_SMAUSERLISTBYISADMINCOMPANYID_ISACTIVE_2);

		query.append(_FINDER_COLUMN_SMAUSERLISTBYISADMINCOMPANYID_ISADMIN_2);

		query.append(_FINDER_COLUMN_SMAUSERLISTBYISADMINCOMPANYID_COMPANYID_2);

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
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
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
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isActive);

		qPos.add(isAdmin);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaRadcheck);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMARadcheck> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a radchecks.
	 *
	 * @return the s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadcheck> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a radchecks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s m a radchecks
	 * @param end the upper bound of the range of s m a radchecks (not inclusive)
	 * @return the range of s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadcheck> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a radchecks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s m a radchecks
	 * @param end the upper bound of the range of s m a radchecks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadcheck> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<SMARadcheck> list = (List<SMARadcheck>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SMARADCHECK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SMARADCHECK;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<SMARadcheck>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<SMARadcheck>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the s m a radchecks where isActive = &#63; and companyId = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMAUserListByCompanyId(int isActive, long companyId)
		throws SystemException {
		for (SMARadcheck smaRadcheck : findBySMAUserListByCompanyId(isActive,
				companyId)) {
			remove(smaRadcheck);
		}
	}

	/**
	 * Removes all the s m a radchecks where isActive = &#63; and isAdmin = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMAUserListByIsAdmin(int isActive, int isAdmin)
		throws SystemException {
		for (SMARadcheck smaRadcheck : findBySMAUserListByIsAdmin(isActive,
				isAdmin)) {
			remove(smaRadcheck);
		}
	}

	/**
	 * Removes all the s m a radchecks where isActive = &#63; and isAdmin = &#63; and companyId = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMAUserListByIsAdminCompanyId(int isActive,
		int isAdmin, long companyId) throws SystemException {
		for (SMARadcheck smaRadcheck : findBySMAUserListByIsAdminCompanyId(
				isActive, isAdmin, companyId)) {
			remove(smaRadcheck);
		}
	}

	/**
	 * Removes all the s m a radchecks from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (SMARadcheck smaRadcheck : findAll()) {
			remove(smaRadcheck);
		}
	}

	/**
	 * Returns the number of s m a radchecks where isActive = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @return the number of matching s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMAUserListByCompanyId(int isActive, long companyId)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, companyId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMAUSERLISTBYCOMPANYID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMARADCHECK_WHERE);

			query.append(_FINDER_COLUMN_SMAUSERLISTBYCOMPANYID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAUSERLISTBYCOMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				qPos.add(companyId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMAUSERLISTBYCOMPANYID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a radchecks where isActive = &#63; and isAdmin = &#63;.
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @return the number of matching s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMAUserListByIsAdmin(int isActive, int isAdmin)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, isAdmin };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMAUSERLISTBYISADMIN,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMARADCHECK_WHERE);

			query.append(_FINDER_COLUMN_SMAUSERLISTBYISADMIN_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAUSERLISTBYISADMIN_ISADMIN_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				qPos.add(isAdmin);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMAUSERLISTBYISADMIN,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a radchecks where isActive = &#63; and isAdmin = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param isAdmin the is admin
	 * @param companyId the company ID
	 * @return the number of matching s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMAUserListByIsAdminCompanyId(int isActive, int isAdmin,
		long companyId) throws SystemException {
		Object[] finderArgs = new Object[] { isActive, isAdmin, companyId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMAUSERLISTBYISADMINCOMPANYID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_SMARADCHECK_WHERE);

			query.append(_FINDER_COLUMN_SMAUSERLISTBYISADMINCOMPANYID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAUSERLISTBYISADMINCOMPANYID_ISADMIN_2);

			query.append(_FINDER_COLUMN_SMAUSERLISTBYISADMINCOMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				qPos.add(isAdmin);

				qPos.add(companyId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMAUSERLISTBYISADMINCOMPANYID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a radchecks.
	 *
	 * @return the number of s m a radchecks
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SMARADCHECK);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the s m a radcheck persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.SMARadcheck")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SMARadcheck>> listenersList = new ArrayList<ModelListener<SMARadcheck>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SMARadcheck>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(SMARadcheckImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = AccessLogPersistence.class)
	protected AccessLogPersistence accessLogPersistence;
	@BeanReference(type = AccessRequestPersistence.class)
	protected AccessRequestPersistence accessRequestPersistence;
	@BeanReference(type = AccessRequestFacilityServicePersistence.class)
	protected AccessRequestFacilityServicePersistence accessRequestFacilityServicePersistence;
	@BeanReference(type = AccessRequestNoteHistoryPersistence.class)
	protected AccessRequestNoteHistoryPersistence accessRequestNoteHistoryPersistence;
	@BeanReference(type = AccessRequestStatusPersistence.class)
	protected AccessRequestStatusPersistence accessRequestStatusPersistence;
	@BeanReference(type = FacilityPersistence.class)
	protected FacilityPersistence facilityPersistence;
	@BeanReference(type = FacilityAccessPersistence.class)
	protected FacilityAccessPersistence facilityAccessPersistence;
	@BeanReference(type = FacilityAssignmentPersistence.class)
	protected FacilityAssignmentPersistence facilityAssignmentPersistence;
	@BeanReference(type = FacilityExternalVisitorPersistence.class)
	protected FacilityExternalVisitorPersistence facilityExternalVisitorPersistence;
	@BeanReference(type = FacilitySecurityOfficerMappingPersistence.class)
	protected FacilitySecurityOfficerMappingPersistence facilitySecurityOfficerMappingPersistence;
	@BeanReference(type = FacilityStaffMappingPersistence.class)
	protected FacilityStaffMappingPersistence facilityStaffMappingPersistence;
	@BeanReference(type = FacilityUserMappingPersistence.class)
	protected FacilityUserMappingPersistence facilityUserMappingPersistence;
	@BeanReference(type = FacilityUserServicePersistence.class)
	protected FacilityUserServicePersistence facilityUserServicePersistence;
	@BeanReference(type = SMAAdminsPersistence.class)
	protected SMAAdminsPersistence smaAdminsPersistence;
	@BeanReference(type = SMACompaniesPersistence.class)
	protected SMACompaniesPersistence smaCompaniesPersistence;
	@BeanReference(type = SMACompanyListPersistence.class)
	protected SMACompanyListPersistence smaCompanyListPersistence;
	@BeanReference(type = SMAEmailHistoryPersistence.class)
	protected SMAEmailHistoryPersistence smaEmailHistoryPersistence;
	@BeanReference(type = SMARadacctPersistence.class)
	protected SMARadacctPersistence smaRadacctPersistence;
	@BeanReference(type = SMARadcheckPersistence.class)
	protected SMARadcheckPersistence smaRadcheckPersistence;
	@BeanReference(type = SMAReservationPersistence.class)
	protected SMAReservationPersistence smaReservationPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_SMARADCHECK = "SELECT smaRadcheck FROM SMARadcheck smaRadcheck";
	private static final String _SQL_SELECT_SMARADCHECK_WHERE = "SELECT smaRadcheck FROM SMARadcheck smaRadcheck WHERE ";
	private static final String _SQL_COUNT_SMARADCHECK = "SELECT COUNT(smaRadcheck) FROM SMARadcheck smaRadcheck";
	private static final String _SQL_COUNT_SMARADCHECK_WHERE = "SELECT COUNT(smaRadcheck) FROM SMARadcheck smaRadcheck WHERE ";
	private static final String _FINDER_COLUMN_SMAUSERLISTBYCOMPANYID_ISACTIVE_2 =
		"smaRadcheck.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMAUSERLISTBYCOMPANYID_COMPANYID_2 =
		"smaRadcheck.companyId = ?";
	private static final String _FINDER_COLUMN_SMAUSERLISTBYISADMIN_ISACTIVE_2 = "smaRadcheck.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMAUSERLISTBYISADMIN_ISADMIN_2 = "smaRadcheck.isAdmin = ?";
	private static final String _FINDER_COLUMN_SMAUSERLISTBYISADMINCOMPANYID_ISACTIVE_2 =
		"smaRadcheck.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMAUSERLISTBYISADMINCOMPANYID_ISADMIN_2 =
		"smaRadcheck.isAdmin = ? AND ";
	private static final String _FINDER_COLUMN_SMAUSERLISTBYISADMINCOMPANYID_COMPANYID_2 =
		"smaRadcheck.companyId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "smaRadcheck.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SMARadcheck exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SMARadcheck exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SMARadcheckPersistenceImpl.class);
	private static SMARadcheck _nullSMARadcheck = new SMARadcheckImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SMARadcheck> toCacheModel() {
				return _nullSMARadcheckCacheModel;
			}
		};

	private static CacheModel<SMARadcheck> _nullSMARadcheckCacheModel = new CacheModel<SMARadcheck>() {
			public SMARadcheck toEntityModel() {
				return _nullSMARadcheck;
			}
		};
}