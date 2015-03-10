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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.pacnet.connect.NoSuchSMACompanyListException;
import com.pacnet.connect.model.SMACompanyList;
import com.pacnet.connect.model.impl.SMACompanyListImpl;
import com.pacnet.connect.model.impl.SMACompanyListModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the s m a company list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMACompanyListPersistence
 * @see SMACompanyListUtil
 * @generated
 */
public class SMACompanyListPersistenceImpl extends BasePersistenceImpl<SMACompanyList>
	implements SMACompanyListPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SMACompanyListUtil} to access the s m a company list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SMACompanyListImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYADMINUSERID =
		new FinderPath(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListModelImpl.FINDER_CACHE_ENABLED,
			SMACompanyListImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMACompanyListByAdminUserId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYADMINUSERID =
		new FinderPath(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListModelImpl.FINDER_CACHE_ENABLED,
			SMACompanyListImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMACompanyListByAdminUserId",
			new String[] { Long.class.getName() },
			SMACompanyListModelImpl.ADMINUSERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYADMINUSERID =
		new FinderPath(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMACompanyListByAdminUserId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYCOMPANYID =
		new FinderPath(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListModelImpl.FINDER_CACHE_ENABLED,
			SMACompanyListImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMACompanyListByCompanyId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCOMPANYID =
		new FinderPath(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListModelImpl.FINDER_CACHE_ENABLED,
			SMACompanyListImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMACompanyListByCompanyId",
			new String[] { Long.class.getName() },
			SMACompanyListModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCOMPANYID =
		new FinderPath(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMACompanyListByCompanyId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERID =
		new FinderPath(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListModelImpl.FINDER_CACHE_ENABLED,
			SMACompanyListImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMACompanyListByCustomerId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERID =
		new FinderPath(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListModelImpl.FINDER_CACHE_ENABLED,
			SMACompanyListImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMACompanyListByCustomerId",
			new String[] { Long.class.getName() },
			SMACompanyListModelImpl.CUSTOMERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCUSTOMERID =
		new FinderPath(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMACompanyListByCustomerId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYDOMAINS =
		new FinderPath(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListModelImpl.FINDER_CACHE_ENABLED,
			SMACompanyListImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMACompanyListByDomains",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYDOMAINS =
		new FinderPath(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListModelImpl.FINDER_CACHE_ENABLED,
			SMACompanyListImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMACompanyListByDomains",
			new String[] { String.class.getName() },
			SMACompanyListModelImpl.DOMAINS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYDOMAINS = new FinderPath(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMACompanyListByDomains",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListModelImpl.FINDER_CACHE_ENABLED,
			SMACompanyListImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListModelImpl.FINDER_CACHE_ENABLED,
			SMACompanyListImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the s m a company list in the entity cache if it is enabled.
	 *
	 * @param smaCompanyList the s m a company list
	 */
	public void cacheResult(SMACompanyList smaCompanyList) {
		EntityCacheUtil.putResult(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListImpl.class, smaCompanyList.getPrimaryKey(),
			smaCompanyList);

		smaCompanyList.resetOriginalValues();
	}

	/**
	 * Caches the s m a company lists in the entity cache if it is enabled.
	 *
	 * @param smaCompanyLists the s m a company lists
	 */
	public void cacheResult(List<SMACompanyList> smaCompanyLists) {
		for (SMACompanyList smaCompanyList : smaCompanyLists) {
			if (EntityCacheUtil.getResult(
						SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
						SMACompanyListImpl.class, smaCompanyList.getPrimaryKey()) == null) {
				cacheResult(smaCompanyList);
			}
			else {
				smaCompanyList.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all s m a company lists.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SMACompanyListImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SMACompanyListImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the s m a company list.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SMACompanyList smaCompanyList) {
		EntityCacheUtil.removeResult(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListImpl.class, smaCompanyList.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SMACompanyList> smaCompanyLists) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SMACompanyList smaCompanyList : smaCompanyLists) {
			EntityCacheUtil.removeResult(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
				SMACompanyListImpl.class, smaCompanyList.getPrimaryKey());
		}
	}

	/**
	 * Creates a new s m a company list with the primary key. Does not add the s m a company list to the database.
	 *
	 * @param id the primary key for the new s m a company list
	 * @return the new s m a company list
	 */
	public SMACompanyList create(String id) {
		SMACompanyList smaCompanyList = new SMACompanyListImpl();

		smaCompanyList.setNew(true);
		smaCompanyList.setPrimaryKey(id);

		return smaCompanyList;
	}

	/**
	 * Removes the s m a company list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the s m a company list
	 * @return the s m a company list that was removed
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException if a s m a company list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList remove(String id)
		throws NoSuchSMACompanyListException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the s m a company list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the s m a company list
	 * @return the s m a company list that was removed
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException if a s m a company list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMACompanyList remove(Serializable primaryKey)
		throws NoSuchSMACompanyListException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SMACompanyList smaCompanyList = (SMACompanyList)session.get(SMACompanyListImpl.class,
					primaryKey);

			if (smaCompanyList == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSMACompanyListException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(smaCompanyList);
		}
		catch (NoSuchSMACompanyListException nsee) {
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
	protected SMACompanyList removeImpl(SMACompanyList smaCompanyList)
		throws SystemException {
		smaCompanyList = toUnwrappedModel(smaCompanyList);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, smaCompanyList);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(smaCompanyList);

		return smaCompanyList;
	}

	@Override
	public SMACompanyList updateImpl(
		com.pacnet.connect.model.SMACompanyList smaCompanyList, boolean merge)
		throws SystemException {
		smaCompanyList = toUnwrappedModel(smaCompanyList);

		boolean isNew = smaCompanyList.isNew();

		SMACompanyListModelImpl smaCompanyListModelImpl = (SMACompanyListModelImpl)smaCompanyList;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, smaCompanyList, merge);

			smaCompanyList.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SMACompanyListModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((smaCompanyListModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYADMINUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(smaCompanyListModelImpl.getOriginalAdminUserId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYADMINUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYADMINUSERID,
					args);

				args = new Object[] {
						Long.valueOf(smaCompanyListModelImpl.getAdminUserId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYADMINUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYADMINUSERID,
					args);
			}

			if ((smaCompanyListModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCOMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(smaCompanyListModelImpl.getOriginalCompanyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCOMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCOMPANYID,
					args);

				args = new Object[] {
						Long.valueOf(smaCompanyListModelImpl.getCompanyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCOMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCOMPANYID,
					args);
			}

			if ((smaCompanyListModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(smaCompanyListModelImpl.getOriginalCustomerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCUSTOMERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERID,
					args);

				args = new Object[] {
						Long.valueOf(smaCompanyListModelImpl.getCustomerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCUSTOMERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERID,
					args);
			}

			if ((smaCompanyListModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYDOMAINS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						smaCompanyListModelImpl.getOriginalDomains()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYDOMAINS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYDOMAINS,
					args);

				args = new Object[] { smaCompanyListModelImpl.getDomains() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYDOMAINS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYDOMAINS,
					args);
			}
		}

		EntityCacheUtil.putResult(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
			SMACompanyListImpl.class, smaCompanyList.getPrimaryKey(),
			smaCompanyList);

		return smaCompanyList;
	}

	protected SMACompanyList toUnwrappedModel(SMACompanyList smaCompanyList) {
		if (smaCompanyList instanceof SMACompanyListImpl) {
			return smaCompanyList;
		}

		SMACompanyListImpl smaCompanyListImpl = new SMACompanyListImpl();

		smaCompanyListImpl.setNew(smaCompanyList.isNew());
		smaCompanyListImpl.setPrimaryKey(smaCompanyList.getPrimaryKey());

		smaCompanyListImpl.setId(smaCompanyList.getId());
		smaCompanyListImpl.setAdminUserId(smaCompanyList.getAdminUserId());
		smaCompanyListImpl.setCompanyId(smaCompanyList.getCompanyId());
		smaCompanyListImpl.setCustomerId(smaCompanyList.getCustomerId());
		smaCompanyListImpl.setDomains(smaCompanyList.getDomains());

		return smaCompanyListImpl;
	}

	/**
	 * Returns the s m a company list with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the s m a company list
	 * @return the s m a company list
	 * @throws com.liferay.portal.NoSuchModelException if a s m a company list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMACompanyList findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the s m a company list with the primary key or throws a {@link com.pacnet.connect.NoSuchSMACompanyListException} if it could not be found.
	 *
	 * @param id the primary key of the s m a company list
	 * @return the s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException if a s m a company list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList findByPrimaryKey(String id)
		throws NoSuchSMACompanyListException, SystemException {
		SMACompanyList smaCompanyList = fetchByPrimaryKey(id);

		if (smaCompanyList == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchSMACompanyListException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return smaCompanyList;
	}

	/**
	 * Returns the s m a company list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the s m a company list
	 * @return the s m a company list, or <code>null</code> if a s m a company list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMACompanyList fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the s m a company list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the s m a company list
	 * @return the s m a company list, or <code>null</code> if a s m a company list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList fetchByPrimaryKey(String id)
		throws SystemException {
		SMACompanyList smaCompanyList = (SMACompanyList)EntityCacheUtil.getResult(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
				SMACompanyListImpl.class, id);

		if (smaCompanyList == _nullSMACompanyList) {
			return null;
		}

		if (smaCompanyList == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				smaCompanyList = (SMACompanyList)session.get(SMACompanyListImpl.class,
						id);
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (smaCompanyList != null) {
					cacheResult(smaCompanyList);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(SMACompanyListModelImpl.ENTITY_CACHE_ENABLED,
						SMACompanyListImpl.class, id, _nullSMACompanyList);
				}

				closeSession(session);
			}
		}

		return smaCompanyList;
	}

	/**
	 * Returns all the s m a company lists where adminUserId = &#63;.
	 *
	 * @param adminUserId the admin user ID
	 * @return the matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanyList> findBySMACompanyListByAdminUserId(
		long adminUserId) throws SystemException {
		return findBySMACompanyListByAdminUserId(adminUserId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a company lists where adminUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param adminUserId the admin user ID
	 * @param start the lower bound of the range of s m a company lists
	 * @param end the upper bound of the range of s m a company lists (not inclusive)
	 * @return the range of matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanyList> findBySMACompanyListByAdminUserId(
		long adminUserId, int start, int end) throws SystemException {
		return findBySMACompanyListByAdminUserId(adminUserId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a company lists where adminUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param adminUserId the admin user ID
	 * @param start the lower bound of the range of s m a company lists
	 * @param end the upper bound of the range of s m a company lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanyList> findBySMACompanyListByAdminUserId(
		long adminUserId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYADMINUSERID;
			finderArgs = new Object[] { adminUserId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYADMINUSERID;
			finderArgs = new Object[] { adminUserId, start, end, orderByComparator };
		}

		List<SMACompanyList> list = (List<SMACompanyList>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMACompanyList smaCompanyList : list) {
				if ((adminUserId != smaCompanyList.getAdminUserId())) {
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
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_SMACOMPANYLIST_WHERE);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYADMINUSERID_ADMINUSERID_2);

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

				qPos.add(adminUserId);

				list = (List<SMACompanyList>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first s m a company list in the ordered set where adminUserId = &#63;.
	 *
	 * @param adminUserId the admin user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList findBySMACompanyListByAdminUserId_First(
		long adminUserId, OrderByComparator orderByComparator)
		throws NoSuchSMACompanyListException, SystemException {
		SMACompanyList smaCompanyList = fetchBySMACompanyListByAdminUserId_First(adminUserId,
				orderByComparator);

		if (smaCompanyList != null) {
			return smaCompanyList;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("adminUserId=");
		msg.append(adminUserId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompanyListException(msg.toString());
	}

	/**
	 * Returns the first s m a company list in the ordered set where adminUserId = &#63;.
	 *
	 * @param adminUserId the admin user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList fetchBySMACompanyListByAdminUserId_First(
		long adminUserId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMACompanyList> list = findBySMACompanyListByAdminUserId(adminUserId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a company list in the ordered set where adminUserId = &#63;.
	 *
	 * @param adminUserId the admin user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList findBySMACompanyListByAdminUserId_Last(
		long adminUserId, OrderByComparator orderByComparator)
		throws NoSuchSMACompanyListException, SystemException {
		SMACompanyList smaCompanyList = fetchBySMACompanyListByAdminUserId_Last(adminUserId,
				orderByComparator);

		if (smaCompanyList != null) {
			return smaCompanyList;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("adminUserId=");
		msg.append(adminUserId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompanyListException(msg.toString());
	}

	/**
	 * Returns the last s m a company list in the ordered set where adminUserId = &#63;.
	 *
	 * @param adminUserId the admin user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList fetchBySMACompanyListByAdminUserId_Last(
		long adminUserId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMACompanyListByAdminUserId(adminUserId);

		List<SMACompanyList> list = findBySMACompanyListByAdminUserId(adminUserId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a company lists before and after the current s m a company list in the ordered set where adminUserId = &#63;.
	 *
	 * @param id the primary key of the current s m a company list
	 * @param adminUserId the admin user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException if a s m a company list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList[] findBySMACompanyListByAdminUserId_PrevAndNext(
		String id, long adminUserId, OrderByComparator orderByComparator)
		throws NoSuchSMACompanyListException, SystemException {
		SMACompanyList smaCompanyList = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMACompanyList[] array = new SMACompanyListImpl[3];

			array[0] = getBySMACompanyListByAdminUserId_PrevAndNext(session,
					smaCompanyList, adminUserId, orderByComparator, true);

			array[1] = smaCompanyList;

			array[2] = getBySMACompanyListByAdminUserId_PrevAndNext(session,
					smaCompanyList, adminUserId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMACompanyList getBySMACompanyListByAdminUserId_PrevAndNext(
		Session session, SMACompanyList smaCompanyList, long adminUserId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMACOMPANYLIST_WHERE);

		query.append(_FINDER_COLUMN_SMACOMPANYLISTBYADMINUSERID_ADMINUSERID_2);

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

		qPos.add(adminUserId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaCompanyList);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMACompanyList> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a company lists where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanyList> findBySMACompanyListByCompanyId(long companyId)
		throws SystemException {
		return findBySMACompanyListByCompanyId(companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a company lists where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of s m a company lists
	 * @param end the upper bound of the range of s m a company lists (not inclusive)
	 * @return the range of matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanyList> findBySMACompanyListByCompanyId(
		long companyId, int start, int end) throws SystemException {
		return findBySMACompanyListByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a company lists where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of s m a company lists
	 * @param end the upper bound of the range of s m a company lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanyList> findBySMACompanyListByCompanyId(
		long companyId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCOMPANYID;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYCOMPANYID;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<SMACompanyList> list = (List<SMACompanyList>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMACompanyList smaCompanyList : list) {
				if ((companyId != smaCompanyList.getCompanyId())) {
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
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_SMACOMPANYLIST_WHERE);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCOMPANYID_COMPANYID_2);

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

				qPos.add(companyId);

				list = (List<SMACompanyList>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first s m a company list in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList findBySMACompanyListByCompanyId_First(
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchSMACompanyListException, SystemException {
		SMACompanyList smaCompanyList = fetchBySMACompanyListByCompanyId_First(companyId,
				orderByComparator);

		if (smaCompanyList != null) {
			return smaCompanyList;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompanyListException(msg.toString());
	}

	/**
	 * Returns the first s m a company list in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList fetchBySMACompanyListByCompanyId_First(
		long companyId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMACompanyList> list = findBySMACompanyListByCompanyId(companyId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a company list in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList findBySMACompanyListByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchSMACompanyListException, SystemException {
		SMACompanyList smaCompanyList = fetchBySMACompanyListByCompanyId_Last(companyId,
				orderByComparator);

		if (smaCompanyList != null) {
			return smaCompanyList;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompanyListException(msg.toString());
	}

	/**
	 * Returns the last s m a company list in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList fetchBySMACompanyListByCompanyId_Last(
		long companyId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMACompanyListByCompanyId(companyId);

		List<SMACompanyList> list = findBySMACompanyListByCompanyId(companyId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a company lists before and after the current s m a company list in the ordered set where companyId = &#63;.
	 *
	 * @param id the primary key of the current s m a company list
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException if a s m a company list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList[] findBySMACompanyListByCompanyId_PrevAndNext(
		String id, long companyId, OrderByComparator orderByComparator)
		throws NoSuchSMACompanyListException, SystemException {
		SMACompanyList smaCompanyList = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMACompanyList[] array = new SMACompanyListImpl[3];

			array[0] = getBySMACompanyListByCompanyId_PrevAndNext(session,
					smaCompanyList, companyId, orderByComparator, true);

			array[1] = smaCompanyList;

			array[2] = getBySMACompanyListByCompanyId_PrevAndNext(session,
					smaCompanyList, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMACompanyList getBySMACompanyListByCompanyId_PrevAndNext(
		Session session, SMACompanyList smaCompanyList, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMACOMPANYLIST_WHERE);

		query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCOMPANYID_COMPANYID_2);

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

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaCompanyList);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMACompanyList> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a company lists where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @return the matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanyList> findBySMACompanyListByCustomerId(
		long customerId) throws SystemException {
		return findBySMACompanyListByCustomerId(customerId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a company lists where customerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param start the lower bound of the range of s m a company lists
	 * @param end the upper bound of the range of s m a company lists (not inclusive)
	 * @return the range of matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanyList> findBySMACompanyListByCustomerId(
		long customerId, int start, int end) throws SystemException {
		return findBySMACompanyListByCustomerId(customerId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a company lists where customerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param start the lower bound of the range of s m a company lists
	 * @param end the upper bound of the range of s m a company lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanyList> findBySMACompanyListByCustomerId(
		long customerId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERID;
			finderArgs = new Object[] { customerId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERID;
			finderArgs = new Object[] { customerId, start, end, orderByComparator };
		}

		List<SMACompanyList> list = (List<SMACompanyList>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMACompanyList smaCompanyList : list) {
				if ((customerId != smaCompanyList.getCustomerId())) {
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
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_SMACOMPANYLIST_WHERE);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERID_CUSTOMERID_2);

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

				qPos.add(customerId);

				list = (List<SMACompanyList>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first s m a company list in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList findBySMACompanyListByCustomerId_First(
		long customerId, OrderByComparator orderByComparator)
		throws NoSuchSMACompanyListException, SystemException {
		SMACompanyList smaCompanyList = fetchBySMACompanyListByCustomerId_First(customerId,
				orderByComparator);

		if (smaCompanyList != null) {
			return smaCompanyList;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompanyListException(msg.toString());
	}

	/**
	 * Returns the first s m a company list in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList fetchBySMACompanyListByCustomerId_First(
		long customerId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMACompanyList> list = findBySMACompanyListByCustomerId(customerId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a company list in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList findBySMACompanyListByCustomerId_Last(
		long customerId, OrderByComparator orderByComparator)
		throws NoSuchSMACompanyListException, SystemException {
		SMACompanyList smaCompanyList = fetchBySMACompanyListByCustomerId_Last(customerId,
				orderByComparator);

		if (smaCompanyList != null) {
			return smaCompanyList;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompanyListException(msg.toString());
	}

	/**
	 * Returns the last s m a company list in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList fetchBySMACompanyListByCustomerId_Last(
		long customerId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMACompanyListByCustomerId(customerId);

		List<SMACompanyList> list = findBySMACompanyListByCustomerId(customerId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a company lists before and after the current s m a company list in the ordered set where customerId = &#63;.
	 *
	 * @param id the primary key of the current s m a company list
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException if a s m a company list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList[] findBySMACompanyListByCustomerId_PrevAndNext(
		String id, long customerId, OrderByComparator orderByComparator)
		throws NoSuchSMACompanyListException, SystemException {
		SMACompanyList smaCompanyList = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMACompanyList[] array = new SMACompanyListImpl[3];

			array[0] = getBySMACompanyListByCustomerId_PrevAndNext(session,
					smaCompanyList, customerId, orderByComparator, true);

			array[1] = smaCompanyList;

			array[2] = getBySMACompanyListByCustomerId_PrevAndNext(session,
					smaCompanyList, customerId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMACompanyList getBySMACompanyListByCustomerId_PrevAndNext(
		Session session, SMACompanyList smaCompanyList, long customerId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMACOMPANYLIST_WHERE);

		query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERID_CUSTOMERID_2);

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

		qPos.add(customerId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaCompanyList);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMACompanyList> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a company lists where domains = &#63;.
	 *
	 * @param domains the domains
	 * @return the matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanyList> findBySMACompanyListByDomains(String domains)
		throws SystemException {
		return findBySMACompanyListByDomains(domains, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a company lists where domains = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param domains the domains
	 * @param start the lower bound of the range of s m a company lists
	 * @param end the upper bound of the range of s m a company lists (not inclusive)
	 * @return the range of matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanyList> findBySMACompanyListByDomains(String domains,
		int start, int end) throws SystemException {
		return findBySMACompanyListByDomains(domains, start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a company lists where domains = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param domains the domains
	 * @param start the lower bound of the range of s m a company lists
	 * @param end the upper bound of the range of s m a company lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanyList> findBySMACompanyListByDomains(String domains,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYDOMAINS;
			finderArgs = new Object[] { domains };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYDOMAINS;
			finderArgs = new Object[] { domains, start, end, orderByComparator };
		}

		List<SMACompanyList> list = (List<SMACompanyList>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMACompanyList smaCompanyList : list) {
				if (!Validator.equals(domains, smaCompanyList.getDomains())) {
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
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_SMACOMPANYLIST_WHERE);

			if (domains == null) {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_1);
			}
			else {
				if (domains.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_3);
				}
				else {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_2);
				}
			}

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

				if (domains != null) {
					qPos.add(domains);
				}

				list = (List<SMACompanyList>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first s m a company list in the ordered set where domains = &#63;.
	 *
	 * @param domains the domains
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList findBySMACompanyListByDomains_First(String domains,
		OrderByComparator orderByComparator)
		throws NoSuchSMACompanyListException, SystemException {
		SMACompanyList smaCompanyList = fetchBySMACompanyListByDomains_First(domains,
				orderByComparator);

		if (smaCompanyList != null) {
			return smaCompanyList;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("domains=");
		msg.append(domains);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompanyListException(msg.toString());
	}

	/**
	 * Returns the first s m a company list in the ordered set where domains = &#63;.
	 *
	 * @param domains the domains
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList fetchBySMACompanyListByDomains_First(String domains,
		OrderByComparator orderByComparator) throws SystemException {
		List<SMACompanyList> list = findBySMACompanyListByDomains(domains, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a company list in the ordered set where domains = &#63;.
	 *
	 * @param domains the domains
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList findBySMACompanyListByDomains_Last(String domains,
		OrderByComparator orderByComparator)
		throws NoSuchSMACompanyListException, SystemException {
		SMACompanyList smaCompanyList = fetchBySMACompanyListByDomains_Last(domains,
				orderByComparator);

		if (smaCompanyList != null) {
			return smaCompanyList;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("domains=");
		msg.append(domains);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompanyListException(msg.toString());
	}

	/**
	 * Returns the last s m a company list in the ordered set where domains = &#63;.
	 *
	 * @param domains the domains
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList fetchBySMACompanyListByDomains_Last(String domains,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBySMACompanyListByDomains(domains);

		List<SMACompanyList> list = findBySMACompanyListByDomains(domains,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a company lists before and after the current s m a company list in the ordered set where domains = &#63;.
	 *
	 * @param id the primary key of the current s m a company list
	 * @param domains the domains
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException if a s m a company list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanyList[] findBySMACompanyListByDomains_PrevAndNext(
		String id, String domains, OrderByComparator orderByComparator)
		throws NoSuchSMACompanyListException, SystemException {
		SMACompanyList smaCompanyList = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMACompanyList[] array = new SMACompanyListImpl[3];

			array[0] = getBySMACompanyListByDomains_PrevAndNext(session,
					smaCompanyList, domains, orderByComparator, true);

			array[1] = smaCompanyList;

			array[2] = getBySMACompanyListByDomains_PrevAndNext(session,
					smaCompanyList, domains, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMACompanyList getBySMACompanyListByDomains_PrevAndNext(
		Session session, SMACompanyList smaCompanyList, String domains,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMACOMPANYLIST_WHERE);

		if (domains == null) {
			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_1);
		}
		else {
			if (domains.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_3);
			}
			else {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_2);
			}
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

		if (domains != null) {
			qPos.add(domains);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaCompanyList);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMACompanyList> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a company lists.
	 *
	 * @return the s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanyList> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a company lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s m a company lists
	 * @param end the upper bound of the range of s m a company lists (not inclusive)
	 * @return the range of s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanyList> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a company lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s m a company lists
	 * @param end the upper bound of the range of s m a company lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanyList> findAll(int start, int end,
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

		List<SMACompanyList> list = (List<SMACompanyList>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SMACOMPANYLIST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SMACOMPANYLIST;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<SMACompanyList>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<SMACompanyList>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the s m a company lists where adminUserId = &#63; from the database.
	 *
	 * @param adminUserId the admin user ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMACompanyListByAdminUserId(long adminUserId)
		throws SystemException {
		for (SMACompanyList smaCompanyList : findBySMACompanyListByAdminUserId(
				adminUserId)) {
			remove(smaCompanyList);
		}
	}

	/**
	 * Removes all the s m a company lists where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMACompanyListByCompanyId(long companyId)
		throws SystemException {
		for (SMACompanyList smaCompanyList : findBySMACompanyListByCompanyId(
				companyId)) {
			remove(smaCompanyList);
		}
	}

	/**
	 * Removes all the s m a company lists where customerId = &#63; from the database.
	 *
	 * @param customerId the customer ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMACompanyListByCustomerId(long customerId)
		throws SystemException {
		for (SMACompanyList smaCompanyList : findBySMACompanyListByCustomerId(
				customerId)) {
			remove(smaCompanyList);
		}
	}

	/**
	 * Removes all the s m a company lists where domains = &#63; from the database.
	 *
	 * @param domains the domains
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMACompanyListByDomains(String domains)
		throws SystemException {
		for (SMACompanyList smaCompanyList : findBySMACompanyListByDomains(
				domains)) {
			remove(smaCompanyList);
		}
	}

	/**
	 * Removes all the s m a company lists from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (SMACompanyList smaCompanyList : findAll()) {
			remove(smaCompanyList);
		}
	}

	/**
	 * Returns the number of s m a company lists where adminUserId = &#63;.
	 *
	 * @param adminUserId the admin user ID
	 * @return the number of matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMACompanyListByAdminUserId(long adminUserId)
		throws SystemException {
		Object[] finderArgs = new Object[] { adminUserId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYADMINUSERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SMACOMPANYLIST_WHERE);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYADMINUSERID_ADMINUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(adminUserId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYADMINUSERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a company lists where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMACompanyListByCompanyId(long companyId)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCOMPANYID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SMACOMPANYLIST_WHERE);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCOMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCOMPANYID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a company lists where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @return the number of matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMACompanyListByCustomerId(long customerId)
		throws SystemException {
		Object[] finderArgs = new Object[] { customerId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCUSTOMERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SMACOMPANYLIST_WHERE);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERID_CUSTOMERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(customerId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCUSTOMERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a company lists where domains = &#63;.
	 *
	 * @param domains the domains
	 * @return the number of matching s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMACompanyListByDomains(String domains)
		throws SystemException {
		Object[] finderArgs = new Object[] { domains };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYDOMAINS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SMACOMPANYLIST_WHERE);

			if (domains == null) {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_1);
			}
			else {
				if (domains.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_3);
				}
				else {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (domains != null) {
					qPos.add(domains);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYDOMAINS,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a company lists.
	 *
	 * @return the number of s m a company lists
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SMACOMPANYLIST);

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
	 * Initializes the s m a company list persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.SMACompanyList")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SMACompanyList>> listenersList = new ArrayList<ModelListener<SMACompanyList>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SMACompanyList>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SMACompanyListImpl.class.getName());
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
	private static final String _SQL_SELECT_SMACOMPANYLIST = "SELECT smaCompanyList FROM SMACompanyList smaCompanyList";
	private static final String _SQL_SELECT_SMACOMPANYLIST_WHERE = "SELECT smaCompanyList FROM SMACompanyList smaCompanyList WHERE ";
	private static final String _SQL_COUNT_SMACOMPANYLIST = "SELECT COUNT(smaCompanyList) FROM SMACompanyList smaCompanyList";
	private static final String _SQL_COUNT_SMACOMPANYLIST_WHERE = "SELECT COUNT(smaCompanyList) FROM SMACompanyList smaCompanyList WHERE ";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYADMINUSERID_ADMINUSERID_2 =
		"smaCompanyList.adminUserId = ?";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYCOMPANYID_COMPANYID_2 =
		"smaCompanyList.companyId = ?";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERID_CUSTOMERID_2 =
		"smaCompanyList.customerId = ?";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_1 =
		"smaCompanyList.domains IS NULL";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_2 =
		"smaCompanyList.domains = ?";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_3 =
		"(smaCompanyList.domains IS NULL OR smaCompanyList.domains = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "smaCompanyList.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SMACompanyList exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SMACompanyList exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SMACompanyListPersistenceImpl.class);
	private static SMACompanyList _nullSMACompanyList = new SMACompanyListImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SMACompanyList> toCacheModel() {
				return _nullSMACompanyListCacheModel;
			}
		};

	private static CacheModel<SMACompanyList> _nullSMACompanyListCacheModel = new CacheModel<SMACompanyList>() {
			public SMACompanyList toEntityModel() {
				return _nullSMACompanyList;
			}
		};
}