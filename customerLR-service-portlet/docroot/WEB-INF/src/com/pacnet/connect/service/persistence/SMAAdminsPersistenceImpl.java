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

import com.pacnet.connect.NoSuchSMAAdminsException;
import com.pacnet.connect.model.SMAAdmins;
import com.pacnet.connect.model.impl.SMAAdminsImpl;
import com.pacnet.connect.model.impl.SMAAdminsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the s m a admins service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMAAdminsPersistence
 * @see SMAAdminsUtil
 * @generated
 */
public class SMAAdminsPersistenceImpl extends BasePersistenceImpl<SMAAdmins>
	implements SMAAdminsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SMAAdminsUtil} to access the s m a admins persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SMAAdminsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAADMINSLISTBYCOMPANYID =
		new FinderPath(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsModelImpl.FINDER_CACHE_ENABLED, SMAAdminsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMAAdminsListByCompanyId",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYCOMPANYID =
		new FinderPath(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsModelImpl.FINDER_CACHE_ENABLED, SMAAdminsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMAAdminsListByCompanyId",
			new String[] { Integer.class.getName(), Long.class.getName() },
			SMAAdminsModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMAAdminsModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMAADMINSLISTBYCOMPANYID =
		new FinderPath(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMAAdminsListByCompanyId",
			new String[] { Integer.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAADMINSLISTBYUSERID =
		new FinderPath(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsModelImpl.FINDER_CACHE_ENABLED, SMAAdminsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMAAdminsListByUserId",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYUSERID =
		new FinderPath(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsModelImpl.FINDER_CACHE_ENABLED, SMAAdminsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMAAdminsListByUserId",
			new String[] { Integer.class.getName(), Long.class.getName() },
			SMAAdminsModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMAAdminsModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMAADMINSLISTBYUSERID = new FinderPath(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMAAdminsListByUserId",
			new String[] { Integer.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAADMINSLISTBYRADCHECKID =
		new FinderPath(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsModelImpl.FINDER_CACHE_ENABLED, SMAAdminsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMAAdminsListByRadcheckId",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYRADCHECKID =
		new FinderPath(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsModelImpl.FINDER_CACHE_ENABLED, SMAAdminsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMAAdminsListByRadcheckId",
			new String[] { Integer.class.getName(), Long.class.getName() },
			SMAAdminsModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMAAdminsModelImpl.RADCHECKID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMAADMINSLISTBYRADCHECKID =
		new FinderPath(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMAAdminsListByRadcheckId",
			new String[] { Integer.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID =
		new FinderPath(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsModelImpl.FINDER_CACHE_ENABLED, SMAAdminsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMAAdminsListByRadcheckIdUserIdCompanyId",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID =
		new FinderPath(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsModelImpl.FINDER_CACHE_ENABLED, SMAAdminsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMAAdminsListByRadcheckIdUserIdCompanyId",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName()
			},
			SMAAdminsModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMAAdminsModelImpl.RADCHECKID_COLUMN_BITMASK |
			SMAAdminsModelImpl.USERID_COLUMN_BITMASK |
			SMAAdminsModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID =
		new FinderPath(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMAAdminsListByRadcheckIdUserIdCompanyId",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsModelImpl.FINDER_CACHE_ENABLED, SMAAdminsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsModelImpl.FINDER_CACHE_ENABLED, SMAAdminsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the s m a admins in the entity cache if it is enabled.
	 *
	 * @param smaAdmins the s m a admins
	 */
	public void cacheResult(SMAAdmins smaAdmins) {
		EntityCacheUtil.putResult(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsImpl.class, smaAdmins.getPrimaryKey(), smaAdmins);

		smaAdmins.resetOriginalValues();
	}

	/**
	 * Caches the s m a adminses in the entity cache if it is enabled.
	 *
	 * @param smaAdminses the s m a adminses
	 */
	public void cacheResult(List<SMAAdmins> smaAdminses) {
		for (SMAAdmins smaAdmins : smaAdminses) {
			if (EntityCacheUtil.getResult(
						SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
						SMAAdminsImpl.class, smaAdmins.getPrimaryKey()) == null) {
				cacheResult(smaAdmins);
			}
			else {
				smaAdmins.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all s m a adminses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SMAAdminsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SMAAdminsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the s m a admins.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SMAAdmins smaAdmins) {
		EntityCacheUtil.removeResult(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsImpl.class, smaAdmins.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SMAAdmins> smaAdminses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SMAAdmins smaAdmins : smaAdminses) {
			EntityCacheUtil.removeResult(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
				SMAAdminsImpl.class, smaAdmins.getPrimaryKey());
		}
	}

	/**
	 * Creates a new s m a admins with the primary key. Does not add the s m a admins to the database.
	 *
	 * @param id the primary key for the new s m a admins
	 * @return the new s m a admins
	 */
	public SMAAdmins create(long id) {
		SMAAdmins smaAdmins = new SMAAdminsImpl();

		smaAdmins.setNew(true);
		smaAdmins.setPrimaryKey(id);

		return smaAdmins;
	}

	/**
	 * Removes the s m a admins with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the s m a admins
	 * @return the s m a admins that was removed
	 * @throws com.pacnet.connect.NoSuchSMAAdminsException if a s m a admins with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins remove(long id)
		throws NoSuchSMAAdminsException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the s m a admins with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the s m a admins
	 * @return the s m a admins that was removed
	 * @throws com.pacnet.connect.NoSuchSMAAdminsException if a s m a admins with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMAAdmins remove(Serializable primaryKey)
		throws NoSuchSMAAdminsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SMAAdmins smaAdmins = (SMAAdmins)session.get(SMAAdminsImpl.class,
					primaryKey);

			if (smaAdmins == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSMAAdminsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(smaAdmins);
		}
		catch (NoSuchSMAAdminsException nsee) {
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
	protected SMAAdmins removeImpl(SMAAdmins smaAdmins)
		throws SystemException {
		smaAdmins = toUnwrappedModel(smaAdmins);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, smaAdmins);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(smaAdmins);

		return smaAdmins;
	}

	@Override
	public SMAAdmins updateImpl(com.pacnet.connect.model.SMAAdmins smaAdmins,
		boolean merge) throws SystemException {
		smaAdmins = toUnwrappedModel(smaAdmins);

		boolean isNew = smaAdmins.isNew();

		SMAAdminsModelImpl smaAdminsModelImpl = (SMAAdminsModelImpl)smaAdmins;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, smaAdmins, merge);

			smaAdmins.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SMAAdminsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((smaAdminsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYCOMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaAdminsModelImpl.getOriginalIsActive()),
						Long.valueOf(smaAdminsModelImpl.getOriginalCompanyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYCOMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYCOMPANYID,
					args);

				args = new Object[] {
						Integer.valueOf(smaAdminsModelImpl.getIsActive()),
						Long.valueOf(smaAdminsModelImpl.getCompanyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYCOMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYCOMPANYID,
					args);
			}

			if ((smaAdminsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaAdminsModelImpl.getOriginalIsActive()),
						Long.valueOf(smaAdminsModelImpl.getOriginalUserId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYUSERID,
					args);

				args = new Object[] {
						Integer.valueOf(smaAdminsModelImpl.getIsActive()),
						Long.valueOf(smaAdminsModelImpl.getUserId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYUSERID,
					args);
			}

			if ((smaAdminsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYRADCHECKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaAdminsModelImpl.getOriginalIsActive()),
						Long.valueOf(smaAdminsModelImpl.getOriginalRadcheckId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYRADCHECKID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYRADCHECKID,
					args);

				args = new Object[] {
						Integer.valueOf(smaAdminsModelImpl.getIsActive()),
						Long.valueOf(smaAdminsModelImpl.getRadcheckId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYRADCHECKID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYRADCHECKID,
					args);
			}

			if ((smaAdminsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaAdminsModelImpl.getOriginalIsActive()),
						Long.valueOf(smaAdminsModelImpl.getOriginalRadcheckId()),
						Long.valueOf(smaAdminsModelImpl.getOriginalUserId()),
						Long.valueOf(smaAdminsModelImpl.getOriginalCompanyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID,
					args);

				args = new Object[] {
						Integer.valueOf(smaAdminsModelImpl.getIsActive()),
						Long.valueOf(smaAdminsModelImpl.getRadcheckId()),
						Long.valueOf(smaAdminsModelImpl.getUserId()),
						Long.valueOf(smaAdminsModelImpl.getCompanyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID,
					args);
			}
		}

		EntityCacheUtil.putResult(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
			SMAAdminsImpl.class, smaAdmins.getPrimaryKey(), smaAdmins);

		return smaAdmins;
	}

	protected SMAAdmins toUnwrappedModel(SMAAdmins smaAdmins) {
		if (smaAdmins instanceof SMAAdminsImpl) {
			return smaAdmins;
		}

		SMAAdminsImpl smaAdminsImpl = new SMAAdminsImpl();

		smaAdminsImpl.setNew(smaAdmins.isNew());
		smaAdminsImpl.setPrimaryKey(smaAdmins.getPrimaryKey());

		smaAdminsImpl.setId(smaAdmins.getId());
		smaAdminsImpl.setUserId(smaAdmins.getUserId());
		smaAdminsImpl.setRadcheckId(smaAdmins.getRadcheckId());
		smaAdminsImpl.setCompanyId(smaAdmins.getCompanyId());
		smaAdminsImpl.setIsActive(smaAdmins.getIsActive());
		smaAdminsImpl.setCreatedOn(smaAdmins.getCreatedOn());
		smaAdminsImpl.setCreatedBy(smaAdmins.getCreatedBy());
		smaAdminsImpl.setUpdatedOn(smaAdmins.getUpdatedOn());
		smaAdminsImpl.setUpdatedBy(smaAdmins.getUpdatedBy());

		return smaAdminsImpl;
	}

	/**
	 * Returns the s m a admins with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the s m a admins
	 * @return the s m a admins
	 * @throws com.liferay.portal.NoSuchModelException if a s m a admins with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMAAdmins findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the s m a admins with the primary key or throws a {@link com.pacnet.connect.NoSuchSMAAdminsException} if it could not be found.
	 *
	 * @param id the primary key of the s m a admins
	 * @return the s m a admins
	 * @throws com.pacnet.connect.NoSuchSMAAdminsException if a s m a admins with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins findByPrimaryKey(long id)
		throws NoSuchSMAAdminsException, SystemException {
		SMAAdmins smaAdmins = fetchByPrimaryKey(id);

		if (smaAdmins == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchSMAAdminsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return smaAdmins;
	}

	/**
	 * Returns the s m a admins with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the s m a admins
	 * @return the s m a admins, or <code>null</code> if a s m a admins with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMAAdmins fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the s m a admins with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the s m a admins
	 * @return the s m a admins, or <code>null</code> if a s m a admins with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins fetchByPrimaryKey(long id) throws SystemException {
		SMAAdmins smaAdmins = (SMAAdmins)EntityCacheUtil.getResult(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
				SMAAdminsImpl.class, id);

		if (smaAdmins == _nullSMAAdmins) {
			return null;
		}

		if (smaAdmins == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				smaAdmins = (SMAAdmins)session.get(SMAAdminsImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (smaAdmins != null) {
					cacheResult(smaAdmins);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(SMAAdminsModelImpl.ENTITY_CACHE_ENABLED,
						SMAAdminsImpl.class, id, _nullSMAAdmins);
				}

				closeSession(session);
			}
		}

		return smaAdmins;
	}

	/**
	 * Returns all the s m a adminses where isActive = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @return the matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAAdmins> findBySMAAdminsListByCompanyId(int isActive,
		long companyId) throws SystemException {
		return findBySMAAdminsListByCompanyId(isActive, companyId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a adminses where isActive = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @param start the lower bound of the range of s m a adminses
	 * @param end the upper bound of the range of s m a adminses (not inclusive)
	 * @return the range of matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAAdmins> findBySMAAdminsListByCompanyId(int isActive,
		long companyId, int start, int end) throws SystemException {
		return findBySMAAdminsListByCompanyId(isActive, companyId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the s m a adminses where isActive = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @param start the lower bound of the range of s m a adminses
	 * @param end the upper bound of the range of s m a adminses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAAdmins> findBySMAAdminsListByCompanyId(int isActive,
		long companyId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYCOMPANYID;
			finderArgs = new Object[] { isActive, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAADMINSLISTBYCOMPANYID;
			finderArgs = new Object[] {
					isActive, companyId,
					
					start, end, orderByComparator
				};
		}

		List<SMAAdmins> list = (List<SMAAdmins>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMAAdmins smaAdmins : list) {
				if ((isActive != smaAdmins.getIsActive()) ||
						(companyId != smaAdmins.getCompanyId())) {
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

			query.append(_SQL_SELECT_SMAADMINS_WHERE);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYCOMPANYID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYCOMPANYID_COMPANYID_2);

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

				list = (List<SMAAdmins>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Returns the first s m a admins in the ordered set where isActive = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a admins
	 * @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins findBySMAAdminsListByCompanyId_First(int isActive,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchSMAAdminsException, SystemException {
		SMAAdmins smaAdmins = fetchBySMAAdminsListByCompanyId_First(isActive,
				companyId, orderByComparator);

		if (smaAdmins != null) {
			return smaAdmins;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAAdminsException(msg.toString());
	}

	/**
	 * Returns the first s m a admins in the ordered set where isActive = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins fetchBySMAAdminsListByCompanyId_First(int isActive,
		long companyId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMAAdmins> list = findBySMAAdminsListByCompanyId(isActive,
				companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a admins in the ordered set where isActive = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a admins
	 * @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins findBySMAAdminsListByCompanyId_Last(int isActive,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchSMAAdminsException, SystemException {
		SMAAdmins smaAdmins = fetchBySMAAdminsListByCompanyId_Last(isActive,
				companyId, orderByComparator);

		if (smaAdmins != null) {
			return smaAdmins;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAAdminsException(msg.toString());
	}

	/**
	 * Returns the last s m a admins in the ordered set where isActive = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins fetchBySMAAdminsListByCompanyId_Last(int isActive,
		long companyId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMAAdminsListByCompanyId(isActive, companyId);

		List<SMAAdmins> list = findBySMAAdminsListByCompanyId(isActive,
				companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a adminses before and after the current s m a admins in the ordered set where isActive = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current s m a admins
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a admins
	 * @throws com.pacnet.connect.NoSuchSMAAdminsException if a s m a admins with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins[] findBySMAAdminsListByCompanyId_PrevAndNext(long id,
		int isActive, long companyId, OrderByComparator orderByComparator)
		throws NoSuchSMAAdminsException, SystemException {
		SMAAdmins smaAdmins = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMAAdmins[] array = new SMAAdminsImpl[3];

			array[0] = getBySMAAdminsListByCompanyId_PrevAndNext(session,
					smaAdmins, isActive, companyId, orderByComparator, true);

			array[1] = smaAdmins;

			array[2] = getBySMAAdminsListByCompanyId_PrevAndNext(session,
					smaAdmins, isActive, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMAAdmins getBySMAAdminsListByCompanyId_PrevAndNext(
		Session session, SMAAdmins smaAdmins, int isActive, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMAADMINS_WHERE);

		query.append(_FINDER_COLUMN_SMAADMINSLISTBYCOMPANYID_ISACTIVE_2);

		query.append(_FINDER_COLUMN_SMAADMINSLISTBYCOMPANYID_COMPANYID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(smaAdmins);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMAAdmins> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a adminses where isActive = &#63; and userId = &#63;.
	 *
	 * @param isActive the is active
	 * @param userId the user ID
	 * @return the matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAAdmins> findBySMAAdminsListByUserId(int isActive, long userId)
		throws SystemException {
		return findBySMAAdminsListByUserId(isActive, userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a adminses where isActive = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param userId the user ID
	 * @param start the lower bound of the range of s m a adminses
	 * @param end the upper bound of the range of s m a adminses (not inclusive)
	 * @return the range of matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAAdmins> findBySMAAdminsListByUserId(int isActive,
		long userId, int start, int end) throws SystemException {
		return findBySMAAdminsListByUserId(isActive, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a adminses where isActive = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param userId the user ID
	 * @param start the lower bound of the range of s m a adminses
	 * @param end the upper bound of the range of s m a adminses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAAdmins> findBySMAAdminsListByUserId(int isActive,
		long userId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYUSERID;
			finderArgs = new Object[] { isActive, userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAADMINSLISTBYUSERID;
			finderArgs = new Object[] {
					isActive, userId,
					
					start, end, orderByComparator
				};
		}

		List<SMAAdmins> list = (List<SMAAdmins>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMAAdmins smaAdmins : list) {
				if ((isActive != smaAdmins.getIsActive()) ||
						(userId != smaAdmins.getUserId())) {
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

			query.append(_SQL_SELECT_SMAADMINS_WHERE);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYUSERID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYUSERID_USERID_2);

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

				qPos.add(userId);

				list = (List<SMAAdmins>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Returns the first s m a admins in the ordered set where isActive = &#63; and userId = &#63;.
	 *
	 * @param isActive the is active
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a admins
	 * @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins findBySMAAdminsListByUserId_First(int isActive,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchSMAAdminsException, SystemException {
		SMAAdmins smaAdmins = fetchBySMAAdminsListByUserId_First(isActive,
				userId, orderByComparator);

		if (smaAdmins != null) {
			return smaAdmins;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAAdminsException(msg.toString());
	}

	/**
	 * Returns the first s m a admins in the ordered set where isActive = &#63; and userId = &#63;.
	 *
	 * @param isActive the is active
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins fetchBySMAAdminsListByUserId_First(int isActive,
		long userId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMAAdmins> list = findBySMAAdminsListByUserId(isActive, userId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a admins in the ordered set where isActive = &#63; and userId = &#63;.
	 *
	 * @param isActive the is active
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a admins
	 * @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins findBySMAAdminsListByUserId_Last(int isActive,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchSMAAdminsException, SystemException {
		SMAAdmins smaAdmins = fetchBySMAAdminsListByUserId_Last(isActive,
				userId, orderByComparator);

		if (smaAdmins != null) {
			return smaAdmins;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAAdminsException(msg.toString());
	}

	/**
	 * Returns the last s m a admins in the ordered set where isActive = &#63; and userId = &#63;.
	 *
	 * @param isActive the is active
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins fetchBySMAAdminsListByUserId_Last(int isActive,
		long userId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMAAdminsListByUserId(isActive, userId);

		List<SMAAdmins> list = findBySMAAdminsListByUserId(isActive, userId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a adminses before and after the current s m a admins in the ordered set where isActive = &#63; and userId = &#63;.
	 *
	 * @param id the primary key of the current s m a admins
	 * @param isActive the is active
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a admins
	 * @throws com.pacnet.connect.NoSuchSMAAdminsException if a s m a admins with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins[] findBySMAAdminsListByUserId_PrevAndNext(long id,
		int isActive, long userId, OrderByComparator orderByComparator)
		throws NoSuchSMAAdminsException, SystemException {
		SMAAdmins smaAdmins = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMAAdmins[] array = new SMAAdminsImpl[3];

			array[0] = getBySMAAdminsListByUserId_PrevAndNext(session,
					smaAdmins, isActive, userId, orderByComparator, true);

			array[1] = smaAdmins;

			array[2] = getBySMAAdminsListByUserId_PrevAndNext(session,
					smaAdmins, isActive, userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMAAdmins getBySMAAdminsListByUserId_PrevAndNext(
		Session session, SMAAdmins smaAdmins, int isActive, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMAADMINS_WHERE);

		query.append(_FINDER_COLUMN_SMAADMINSLISTBYUSERID_ISACTIVE_2);

		query.append(_FINDER_COLUMN_SMAADMINSLISTBYUSERID_USERID_2);

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

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaAdmins);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMAAdmins> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a adminses where isActive = &#63; and radcheckId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @return the matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAAdmins> findBySMAAdminsListByRadcheckId(int isActive,
		long radcheckId) throws SystemException {
		return findBySMAAdminsListByRadcheckId(isActive, radcheckId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a adminses where isActive = &#63; and radcheckId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param start the lower bound of the range of s m a adminses
	 * @param end the upper bound of the range of s m a adminses (not inclusive)
	 * @return the range of matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAAdmins> findBySMAAdminsListByRadcheckId(int isActive,
		long radcheckId, int start, int end) throws SystemException {
		return findBySMAAdminsListByRadcheckId(isActive, radcheckId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the s m a adminses where isActive = &#63; and radcheckId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param start the lower bound of the range of s m a adminses
	 * @param end the upper bound of the range of s m a adminses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAAdmins> findBySMAAdminsListByRadcheckId(int isActive,
		long radcheckId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYRADCHECKID;
			finderArgs = new Object[] { isActive, radcheckId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAADMINSLISTBYRADCHECKID;
			finderArgs = new Object[] {
					isActive, radcheckId,
					
					start, end, orderByComparator
				};
		}

		List<SMAAdmins> list = (List<SMAAdmins>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMAAdmins smaAdmins : list) {
				if ((isActive != smaAdmins.getIsActive()) ||
						(radcheckId != smaAdmins.getRadcheckId())) {
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

			query.append(_SQL_SELECT_SMAADMINS_WHERE);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKID_RADCHECKID_2);

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

				qPos.add(radcheckId);

				list = (List<SMAAdmins>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Returns the first s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a admins
	 * @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins findBySMAAdminsListByRadcheckId_First(int isActive,
		long radcheckId, OrderByComparator orderByComparator)
		throws NoSuchSMAAdminsException, SystemException {
		SMAAdmins smaAdmins = fetchBySMAAdminsListByRadcheckId_First(isActive,
				radcheckId, orderByComparator);

		if (smaAdmins != null) {
			return smaAdmins;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", radcheckId=");
		msg.append(radcheckId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAAdminsException(msg.toString());
	}

	/**
	 * Returns the first s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins fetchBySMAAdminsListByRadcheckId_First(int isActive,
		long radcheckId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMAAdmins> list = findBySMAAdminsListByRadcheckId(isActive,
				radcheckId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a admins
	 * @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins findBySMAAdminsListByRadcheckId_Last(int isActive,
		long radcheckId, OrderByComparator orderByComparator)
		throws NoSuchSMAAdminsException, SystemException {
		SMAAdmins smaAdmins = fetchBySMAAdminsListByRadcheckId_Last(isActive,
				radcheckId, orderByComparator);

		if (smaAdmins != null) {
			return smaAdmins;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", radcheckId=");
		msg.append(radcheckId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAAdminsException(msg.toString());
	}

	/**
	 * Returns the last s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins fetchBySMAAdminsListByRadcheckId_Last(int isActive,
		long radcheckId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMAAdminsListByRadcheckId(isActive, radcheckId);

		List<SMAAdmins> list = findBySMAAdminsListByRadcheckId(isActive,
				radcheckId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a adminses before and after the current s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63;.
	 *
	 * @param id the primary key of the current s m a admins
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a admins
	 * @throws com.pacnet.connect.NoSuchSMAAdminsException if a s m a admins with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins[] findBySMAAdminsListByRadcheckId_PrevAndNext(long id,
		int isActive, long radcheckId, OrderByComparator orderByComparator)
		throws NoSuchSMAAdminsException, SystemException {
		SMAAdmins smaAdmins = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMAAdmins[] array = new SMAAdminsImpl[3];

			array[0] = getBySMAAdminsListByRadcheckId_PrevAndNext(session,
					smaAdmins, isActive, radcheckId, orderByComparator, true);

			array[1] = smaAdmins;

			array[2] = getBySMAAdminsListByRadcheckId_PrevAndNext(session,
					smaAdmins, isActive, radcheckId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMAAdmins getBySMAAdminsListByRadcheckId_PrevAndNext(
		Session session, SMAAdmins smaAdmins, int isActive, long radcheckId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMAADMINS_WHERE);

		query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKID_ISACTIVE_2);

		query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKID_RADCHECKID_2);

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

		qPos.add(radcheckId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaAdmins);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMAAdmins> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a adminses where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param userId the user ID
	 * @param companyId the company ID
	 * @return the matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAAdmins> findBySMAAdminsListByRadcheckIdUserIdCompanyId(
		int isActive, long radcheckId, long userId, long companyId)
		throws SystemException {
		return findBySMAAdminsListByRadcheckIdUserIdCompanyId(isActive,
			radcheckId, userId, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a adminses where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param userId the user ID
	 * @param companyId the company ID
	 * @param start the lower bound of the range of s m a adminses
	 * @param end the upper bound of the range of s m a adminses (not inclusive)
	 * @return the range of matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAAdmins> findBySMAAdminsListByRadcheckIdUserIdCompanyId(
		int isActive, long radcheckId, long userId, long companyId, int start,
		int end) throws SystemException {
		return findBySMAAdminsListByRadcheckIdUserIdCompanyId(isActive,
			radcheckId, userId, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a adminses where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param userId the user ID
	 * @param companyId the company ID
	 * @param start the lower bound of the range of s m a adminses
	 * @param end the upper bound of the range of s m a adminses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAAdmins> findBySMAAdminsListByRadcheckIdUserIdCompanyId(
		int isActive, long radcheckId, long userId, long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID;
			finderArgs = new Object[] { isActive, radcheckId, userId, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID;
			finderArgs = new Object[] {
					isActive, radcheckId, userId, companyId,
					
					start, end, orderByComparator
				};
		}

		List<SMAAdmins> list = (List<SMAAdmins>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMAAdmins smaAdmins : list) {
				if ((isActive != smaAdmins.getIsActive()) ||
						(radcheckId != smaAdmins.getRadcheckId()) ||
						(userId != smaAdmins.getUserId()) ||
						(companyId != smaAdmins.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_SMAADMINS_WHERE);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_RADCHECKID_2);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_USERID_2);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_COMPANYID_2);

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

				qPos.add(radcheckId);

				qPos.add(userId);

				qPos.add(companyId);

				list = (List<SMAAdmins>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Returns the first s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param userId the user ID
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a admins
	 * @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins findBySMAAdminsListByRadcheckIdUserIdCompanyId_First(
		int isActive, long radcheckId, long userId, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchSMAAdminsException, SystemException {
		SMAAdmins smaAdmins = fetchBySMAAdminsListByRadcheckIdUserIdCompanyId_First(isActive,
				radcheckId, userId, companyId, orderByComparator);

		if (smaAdmins != null) {
			return smaAdmins;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", radcheckId=");
		msg.append(radcheckId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAAdminsException(msg.toString());
	}

	/**
	 * Returns the first s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param userId the user ID
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins fetchBySMAAdminsListByRadcheckIdUserIdCompanyId_First(
		int isActive, long radcheckId, long userId, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<SMAAdmins> list = findBySMAAdminsListByRadcheckIdUserIdCompanyId(isActive,
				radcheckId, userId, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param userId the user ID
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a admins
	 * @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins findBySMAAdminsListByRadcheckIdUserIdCompanyId_Last(
		int isActive, long radcheckId, long userId, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchSMAAdminsException, SystemException {
		SMAAdmins smaAdmins = fetchBySMAAdminsListByRadcheckIdUserIdCompanyId_Last(isActive,
				radcheckId, userId, companyId, orderByComparator);

		if (smaAdmins != null) {
			return smaAdmins;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", radcheckId=");
		msg.append(radcheckId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAAdminsException(msg.toString());
	}

	/**
	 * Returns the last s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param userId the user ID
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins fetchBySMAAdminsListByRadcheckIdUserIdCompanyId_Last(
		int isActive, long radcheckId, long userId, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBySMAAdminsListByRadcheckIdUserIdCompanyId(isActive,
				radcheckId, userId, companyId);

		List<SMAAdmins> list = findBySMAAdminsListByRadcheckIdUserIdCompanyId(isActive,
				radcheckId, userId, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a adminses before and after the current s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current s m a admins
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param userId the user ID
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a admins
	 * @throws com.pacnet.connect.NoSuchSMAAdminsException if a s m a admins with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAAdmins[] findBySMAAdminsListByRadcheckIdUserIdCompanyId_PrevAndNext(
		long id, int isActive, long radcheckId, long userId, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchSMAAdminsException, SystemException {
		SMAAdmins smaAdmins = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMAAdmins[] array = new SMAAdminsImpl[3];

			array[0] = getBySMAAdminsListByRadcheckIdUserIdCompanyId_PrevAndNext(session,
					smaAdmins, isActive, radcheckId, userId, companyId,
					orderByComparator, true);

			array[1] = smaAdmins;

			array[2] = getBySMAAdminsListByRadcheckIdUserIdCompanyId_PrevAndNext(session,
					smaAdmins, isActive, radcheckId, userId, companyId,
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

	protected SMAAdmins getBySMAAdminsListByRadcheckIdUserIdCompanyId_PrevAndNext(
		Session session, SMAAdmins smaAdmins, int isActive, long radcheckId,
		long userId, long companyId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMAADMINS_WHERE);

		query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_ISACTIVE_2);

		query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_RADCHECKID_2);

		query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_USERID_2);

		query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_COMPANYID_2);

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

		qPos.add(radcheckId);

		qPos.add(userId);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaAdmins);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMAAdmins> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a adminses.
	 *
	 * @return the s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAAdmins> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a adminses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s m a adminses
	 * @param end the upper bound of the range of s m a adminses (not inclusive)
	 * @return the range of s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAAdmins> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a adminses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s m a adminses
	 * @param end the upper bound of the range of s m a adminses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAAdmins> findAll(int start, int end,
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

		List<SMAAdmins> list = (List<SMAAdmins>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SMAADMINS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SMAADMINS;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<SMAAdmins>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<SMAAdmins>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the s m a adminses where isActive = &#63; and companyId = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMAAdminsListByCompanyId(int isActive, long companyId)
		throws SystemException {
		for (SMAAdmins smaAdmins : findBySMAAdminsListByCompanyId(isActive,
				companyId)) {
			remove(smaAdmins);
		}
	}

	/**
	 * Removes all the s m a adminses where isActive = &#63; and userId = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMAAdminsListByUserId(int isActive, long userId)
		throws SystemException {
		for (SMAAdmins smaAdmins : findBySMAAdminsListByUserId(isActive, userId)) {
			remove(smaAdmins);
		}
	}

	/**
	 * Removes all the s m a adminses where isActive = &#63; and radcheckId = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMAAdminsListByRadcheckId(int isActive, long radcheckId)
		throws SystemException {
		for (SMAAdmins smaAdmins : findBySMAAdminsListByRadcheckId(isActive,
				radcheckId)) {
			remove(smaAdmins);
		}
	}

	/**
	 * Removes all the s m a adminses where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param userId the user ID
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMAAdminsListByRadcheckIdUserIdCompanyId(int isActive,
		long radcheckId, long userId, long companyId) throws SystemException {
		for (SMAAdmins smaAdmins : findBySMAAdminsListByRadcheckIdUserIdCompanyId(
				isActive, radcheckId, userId, companyId)) {
			remove(smaAdmins);
		}
	}

	/**
	 * Removes all the s m a adminses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (SMAAdmins smaAdmins : findAll()) {
			remove(smaAdmins);
		}
	}

	/**
	 * Returns the number of s m a adminses where isActive = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param companyId the company ID
	 * @return the number of matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMAAdminsListByCompanyId(int isActive, long companyId)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, companyId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYCOMPANYID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMAADMINS_WHERE);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYCOMPANYID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYCOMPANYID_COMPANYID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYCOMPANYID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a adminses where isActive = &#63; and userId = &#63;.
	 *
	 * @param isActive the is active
	 * @param userId the user ID
	 * @return the number of matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMAAdminsListByUserId(int isActive, long userId)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, userId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYUSERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMAADMINS_WHERE);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYUSERID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYUSERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				qPos.add(userId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYUSERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a adminses where isActive = &#63; and radcheckId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @return the number of matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMAAdminsListByRadcheckId(int isActive, long radcheckId)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, radcheckId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYRADCHECKID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMAADMINS_WHERE);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKID_RADCHECKID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				qPos.add(radcheckId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYRADCHECKID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a adminses where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param userId the user ID
	 * @param companyId the company ID
	 * @return the number of matching s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMAAdminsListByRadcheckIdUserIdCompanyId(int isActive,
		long radcheckId, long userId, long companyId) throws SystemException {
		Object[] finderArgs = new Object[] {
				isActive, radcheckId, userId, companyId
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_SMAADMINS_WHERE);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_RADCHECKID_2);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_USERID_2);

			query.append(_FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				qPos.add(radcheckId);

				qPos.add(userId);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a adminses.
	 *
	 * @return the number of s m a adminses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SMAADMINS);

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
	 * Initializes the s m a admins persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.SMAAdmins")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SMAAdmins>> listenersList = new ArrayList<ModelListener<SMAAdmins>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SMAAdmins>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SMAAdminsImpl.class.getName());
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
	private static final String _SQL_SELECT_SMAADMINS = "SELECT smaAdmins FROM SMAAdmins smaAdmins";
	private static final String _SQL_SELECT_SMAADMINS_WHERE = "SELECT smaAdmins FROM SMAAdmins smaAdmins WHERE ";
	private static final String _SQL_COUNT_SMAADMINS = "SELECT COUNT(smaAdmins) FROM SMAAdmins smaAdmins";
	private static final String _SQL_COUNT_SMAADMINS_WHERE = "SELECT COUNT(smaAdmins) FROM SMAAdmins smaAdmins WHERE ";
	private static final String _FINDER_COLUMN_SMAADMINSLISTBYCOMPANYID_ISACTIVE_2 =
		"smaAdmins.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMAADMINSLISTBYCOMPANYID_COMPANYID_2 =
		"smaAdmins.companyId = ?";
	private static final String _FINDER_COLUMN_SMAADMINSLISTBYUSERID_ISACTIVE_2 = "smaAdmins.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMAADMINSLISTBYUSERID_USERID_2 = "smaAdmins.userId = ?";
	private static final String _FINDER_COLUMN_SMAADMINSLISTBYRADCHECKID_ISACTIVE_2 =
		"smaAdmins.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMAADMINSLISTBYRADCHECKID_RADCHECKID_2 =
		"smaAdmins.radcheckId = ?";
	private static final String _FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_ISACTIVE_2 =
		"smaAdmins.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_RADCHECKID_2 =
		"smaAdmins.radcheckId = ? AND ";
	private static final String _FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_USERID_2 =
		"smaAdmins.userId = ? AND ";
	private static final String _FINDER_COLUMN_SMAADMINSLISTBYRADCHECKIDUSERIDCOMPANYID_COMPANYID_2 =
		"smaAdmins.companyId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "smaAdmins.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SMAAdmins exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SMAAdmins exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SMAAdminsPersistenceImpl.class);
	private static SMAAdmins _nullSMAAdmins = new SMAAdminsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SMAAdmins> toCacheModel() {
				return _nullSMAAdminsCacheModel;
			}
		};

	private static CacheModel<SMAAdmins> _nullSMAAdminsCacheModel = new CacheModel<SMAAdmins>() {
			public SMAAdmins toEntityModel() {
				return _nullSMAAdmins;
			}
		};
}