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

import com.pacnet.connect.NoSuchAccessRequestNoteHistoryException;
import com.pacnet.connect.model.AccessRequestNoteHistory;
import com.pacnet.connect.model.impl.AccessRequestNoteHistoryImpl;
import com.pacnet.connect.model.impl.AccessRequestNoteHistoryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the access request note history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestNoteHistoryPersistence
 * @see AccessRequestNoteHistoryUtil
 * @generated
 */
public class AccessRequestNoteHistoryPersistenceImpl extends BasePersistenceImpl<AccessRequestNoteHistory>
	implements AccessRequestNoteHistoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AccessRequestNoteHistoryUtil} to access the access request note history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AccessRequestNoteHistoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQID =
		new FinderPath(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestNoteHistoryModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestNoteHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAccessRequestNoteHistoryByAccReqId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQID =
		new FinderPath(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestNoteHistoryModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestNoteHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAccessRequestNoteHistoryByAccReqId",
			new String[] { Long.class.getName() },
			AccessRequestNoteHistoryModelImpl.ACCESSREQUESTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACCESSREQUESTNOTEHISTORYBYACCREQID =
		new FinderPath(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestNoteHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAccessRequestNoteHistoryByAccReqId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID =
		new FinderPath(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestNoteHistoryModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestNoteHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAccessRequestNoteHistoryByAccReqIdAndCustId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID =
		new FinderPath(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestNoteHistoryModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestNoteHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAccessRequestNoteHistoryByAccReqIdAndCustId",
			new String[] { Long.class.getName(), Long.class.getName() },
			AccessRequestNoteHistoryModelImpl.ACCESSREQUESTID_COLUMN_BITMASK |
			AccessRequestNoteHistoryModelImpl.CUSTOMERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID =
		new FinderPath(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestNoteHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAccessRequestNoteHistoryByAccReqIdAndCustId",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE =
		new FinderPath(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestNoteHistoryModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestNoteHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAccessRequestNoteHistoryByAccReqCustTable",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE =
		new FinderPath(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestNoteHistoryModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestNoteHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAccessRequestNoteHistoryByAccReqCustTable",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			AccessRequestNoteHistoryModelImpl.ACCESSREQUESTID_COLUMN_BITMASK |
			AccessRequestNoteHistoryModelImpl.CUSTOMERID_COLUMN_BITMASK |
			AccessRequestNoteHistoryModelImpl.TABLENAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE =
		new FinderPath(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestNoteHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAccessRequestNoteHistoryByAccReqCustTable",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestNoteHistoryModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestNoteHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestNoteHistoryModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestNoteHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestNoteHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the access request note history in the entity cache if it is enabled.
	 *
	 * @param accessRequestNoteHistory the access request note history
	 */
	public void cacheResult(AccessRequestNoteHistory accessRequestNoteHistory) {
		EntityCacheUtil.putResult(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestNoteHistoryImpl.class,
			accessRequestNoteHistory.getPrimaryKey(), accessRequestNoteHistory);

		accessRequestNoteHistory.resetOriginalValues();
	}

	/**
	 * Caches the access request note histories in the entity cache if it is enabled.
	 *
	 * @param accessRequestNoteHistories the access request note histories
	 */
	public void cacheResult(
		List<AccessRequestNoteHistory> accessRequestNoteHistories) {
		for (AccessRequestNoteHistory accessRequestNoteHistory : accessRequestNoteHistories) {
			if (EntityCacheUtil.getResult(
						AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
						AccessRequestNoteHistoryImpl.class,
						accessRequestNoteHistory.getPrimaryKey()) == null) {
				cacheResult(accessRequestNoteHistory);
			}
			else {
				accessRequestNoteHistory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all access request note histories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AccessRequestNoteHistoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AccessRequestNoteHistoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the access request note history.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AccessRequestNoteHistory accessRequestNoteHistory) {
		EntityCacheUtil.removeResult(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestNoteHistoryImpl.class,
			accessRequestNoteHistory.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<AccessRequestNoteHistory> accessRequestNoteHistories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AccessRequestNoteHistory accessRequestNoteHistory : accessRequestNoteHistories) {
			EntityCacheUtil.removeResult(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
				AccessRequestNoteHistoryImpl.class,
				accessRequestNoteHistory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new access request note history with the primary key. Does not add the access request note history to the database.
	 *
	 * @param id the primary key for the new access request note history
	 * @return the new access request note history
	 */
	public AccessRequestNoteHistory create(long id) {
		AccessRequestNoteHistory accessRequestNoteHistory = new AccessRequestNoteHistoryImpl();

		accessRequestNoteHistory.setNew(true);
		accessRequestNoteHistory.setPrimaryKey(id);

		return accessRequestNoteHistory;
	}

	/**
	 * Removes the access request note history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the access request note history
	 * @return the access request note history that was removed
	 * @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a access request note history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory remove(long id)
		throws NoSuchAccessRequestNoteHistoryException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the access request note history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the access request note history
	 * @return the access request note history that was removed
	 * @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a access request note history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccessRequestNoteHistory remove(Serializable primaryKey)
		throws NoSuchAccessRequestNoteHistoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AccessRequestNoteHistory accessRequestNoteHistory = (AccessRequestNoteHistory)session.get(AccessRequestNoteHistoryImpl.class,
					primaryKey);

			if (accessRequestNoteHistory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAccessRequestNoteHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(accessRequestNoteHistory);
		}
		catch (NoSuchAccessRequestNoteHistoryException nsee) {
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
	protected AccessRequestNoteHistory removeImpl(
		AccessRequestNoteHistory accessRequestNoteHistory)
		throws SystemException {
		accessRequestNoteHistory = toUnwrappedModel(accessRequestNoteHistory);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, accessRequestNoteHistory);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(accessRequestNoteHistory);

		return accessRequestNoteHistory;
	}

	@Override
	public AccessRequestNoteHistory updateImpl(
		com.pacnet.connect.model.AccessRequestNoteHistory accessRequestNoteHistory,
		boolean merge) throws SystemException {
		accessRequestNoteHistory = toUnwrappedModel(accessRequestNoteHistory);

		boolean isNew = accessRequestNoteHistory.isNew();

		AccessRequestNoteHistoryModelImpl accessRequestNoteHistoryModelImpl = (AccessRequestNoteHistoryModelImpl)accessRequestNoteHistory;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, accessRequestNoteHistory, merge);

			accessRequestNoteHistory.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AccessRequestNoteHistoryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((accessRequestNoteHistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(accessRequestNoteHistoryModelImpl.getOriginalAccessRequestId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTNOTEHISTORYBYACCREQID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQID,
					args);

				args = new Object[] {
						Long.valueOf(accessRequestNoteHistoryModelImpl.getAccessRequestId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTNOTEHISTORYBYACCREQID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQID,
					args);
			}

			if ((accessRequestNoteHistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(accessRequestNoteHistoryModelImpl.getOriginalAccessRequestId()),
						Long.valueOf(accessRequestNoteHistoryModelImpl.getOriginalCustomerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID,
					args);

				args = new Object[] {
						Long.valueOf(accessRequestNoteHistoryModelImpl.getAccessRequestId()),
						Long.valueOf(accessRequestNoteHistoryModelImpl.getCustomerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID,
					args);
			}

			if ((accessRequestNoteHistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(accessRequestNoteHistoryModelImpl.getOriginalAccessRequestId()),
						Long.valueOf(accessRequestNoteHistoryModelImpl.getOriginalCustomerId()),
						
						accessRequestNoteHistoryModelImpl.getOriginalTableName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE,
					args);

				args = new Object[] {
						Long.valueOf(accessRequestNoteHistoryModelImpl.getAccessRequestId()),
						Long.valueOf(accessRequestNoteHistoryModelImpl.getCustomerId()),
						
						accessRequestNoteHistoryModelImpl.getTableName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE,
					args);
			}
		}

		EntityCacheUtil.putResult(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestNoteHistoryImpl.class,
			accessRequestNoteHistory.getPrimaryKey(), accessRequestNoteHistory);

		return accessRequestNoteHistory;
	}

	protected AccessRequestNoteHistory toUnwrappedModel(
		AccessRequestNoteHistory accessRequestNoteHistory) {
		if (accessRequestNoteHistory instanceof AccessRequestNoteHistoryImpl) {
			return accessRequestNoteHistory;
		}

		AccessRequestNoteHistoryImpl accessRequestNoteHistoryImpl = new AccessRequestNoteHistoryImpl();

		accessRequestNoteHistoryImpl.setNew(accessRequestNoteHistory.isNew());
		accessRequestNoteHistoryImpl.setPrimaryKey(accessRequestNoteHistory.getPrimaryKey());

		accessRequestNoteHistoryImpl.setId(accessRequestNoteHistory.getId());
		accessRequestNoteHistoryImpl.setAccessRequestId(accessRequestNoteHistory.getAccessRequestId());
		accessRequestNoteHistoryImpl.setCustomerId(accessRequestNoteHistory.getCustomerId());
		accessRequestNoteHistoryImpl.setNote(accessRequestNoteHistory.getNote());
		accessRequestNoteHistoryImpl.setTableName(accessRequestNoteHistory.getTableName());
		accessRequestNoteHistoryImpl.setIsActive(accessRequestNoteHistory.isIsActive());
		accessRequestNoteHistoryImpl.setCreatedOn(accessRequestNoteHistory.getCreatedOn());
		accessRequestNoteHistoryImpl.setCreatedBy(accessRequestNoteHistory.getCreatedBy());
		accessRequestNoteHistoryImpl.setUpdatedOn(accessRequestNoteHistory.getUpdatedOn());
		accessRequestNoteHistoryImpl.setUpdatedBy(accessRequestNoteHistory.getUpdatedBy());

		return accessRequestNoteHistoryImpl;
	}

	/**
	 * Returns the access request note history with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the access request note history
	 * @return the access request note history
	 * @throws com.liferay.portal.NoSuchModelException if a access request note history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccessRequestNoteHistory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the access request note history with the primary key or throws a {@link com.pacnet.connect.NoSuchAccessRequestNoteHistoryException} if it could not be found.
	 *
	 * @param id the primary key of the access request note history
	 * @return the access request note history
	 * @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a access request note history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory findByPrimaryKey(long id)
		throws NoSuchAccessRequestNoteHistoryException, SystemException {
		AccessRequestNoteHistory accessRequestNoteHistory = fetchByPrimaryKey(id);

		if (accessRequestNoteHistory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchAccessRequestNoteHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return accessRequestNoteHistory;
	}

	/**
	 * Returns the access request note history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the access request note history
	 * @return the access request note history, or <code>null</code> if a access request note history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccessRequestNoteHistory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the access request note history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the access request note history
	 * @return the access request note history, or <code>null</code> if a access request note history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory fetchByPrimaryKey(long id)
		throws SystemException {
		AccessRequestNoteHistory accessRequestNoteHistory = (AccessRequestNoteHistory)EntityCacheUtil.getResult(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
				AccessRequestNoteHistoryImpl.class, id);

		if (accessRequestNoteHistory == _nullAccessRequestNoteHistory) {
			return null;
		}

		if (accessRequestNoteHistory == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				accessRequestNoteHistory = (AccessRequestNoteHistory)session.get(AccessRequestNoteHistoryImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (accessRequestNoteHistory != null) {
					cacheResult(accessRequestNoteHistory);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(AccessRequestNoteHistoryModelImpl.ENTITY_CACHE_ENABLED,
						AccessRequestNoteHistoryImpl.class, id,
						_nullAccessRequestNoteHistory);
				}

				closeSession(session);
			}
		}

		return accessRequestNoteHistory;
	}

	/**
	 * Returns all the access request note histories where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @return the matching access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqId(
		long accessRequestId) throws SystemException {
		return findByAccessRequestNoteHistoryByAccReqId(accessRequestId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access request note histories where accessRequestId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param accessRequestId the access request ID
	 * @param start the lower bound of the range of access request note histories
	 * @param end the upper bound of the range of access request note histories (not inclusive)
	 * @return the range of matching access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqId(
		long accessRequestId, int start, int end) throws SystemException {
		return findByAccessRequestNoteHistoryByAccReqId(accessRequestId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the access request note histories where accessRequestId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param accessRequestId the access request ID
	 * @param start the lower bound of the range of access request note histories
	 * @param end the upper bound of the range of access request note histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqId(
		long accessRequestId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQID;
			finderArgs = new Object[] { accessRequestId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQID;
			finderArgs = new Object[] {
					accessRequestId,
					
					start, end, orderByComparator
				};
		}

		List<AccessRequestNoteHistory> list = (List<AccessRequestNoteHistory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AccessRequestNoteHistory accessRequestNoteHistory : list) {
				if ((accessRequestId != accessRequestNoteHistory.getAccessRequestId())) {
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

			query.append(_SQL_SELECT_ACCESSREQUESTNOTEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQID_ACCESSREQUESTID_2);

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

				qPos.add(accessRequestId);

				list = (List<AccessRequestNoteHistory>)QueryUtil.list(q,
						getDialect(), start, end);
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
	 * Returns the first access request note history in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request note history
	 * @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a matching access request note history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqId_First(
		long accessRequestId, OrderByComparator orderByComparator)
		throws NoSuchAccessRequestNoteHistoryException, SystemException {
		AccessRequestNoteHistory accessRequestNoteHistory = fetchByAccessRequestNoteHistoryByAccReqId_First(accessRequestId,
				orderByComparator);

		if (accessRequestNoteHistory != null) {
			return accessRequestNoteHistory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("accessRequestId=");
		msg.append(accessRequestId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestNoteHistoryException(msg.toString());
	}

	/**
	 * Returns the first access request note history in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request note history, or <code>null</code> if a matching access request note history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqId_First(
		long accessRequestId, OrderByComparator orderByComparator)
		throws SystemException {
		List<AccessRequestNoteHistory> list = findByAccessRequestNoteHistoryByAccReqId(accessRequestId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last access request note history in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request note history
	 * @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a matching access request note history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqId_Last(
		long accessRequestId, OrderByComparator orderByComparator)
		throws NoSuchAccessRequestNoteHistoryException, SystemException {
		AccessRequestNoteHistory accessRequestNoteHistory = fetchByAccessRequestNoteHistoryByAccReqId_Last(accessRequestId,
				orderByComparator);

		if (accessRequestNoteHistory != null) {
			return accessRequestNoteHistory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("accessRequestId=");
		msg.append(accessRequestId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestNoteHistoryException(msg.toString());
	}

	/**
	 * Returns the last access request note history in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request note history, or <code>null</code> if a matching access request note history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqId_Last(
		long accessRequestId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByAccessRequestNoteHistoryByAccReqId(accessRequestId);

		List<AccessRequestNoteHistory> list = findByAccessRequestNoteHistoryByAccReqId(accessRequestId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the access request note histories before and after the current access request note history in the ordered set where accessRequestId = &#63;.
	 *
	 * @param id the primary key of the current access request note history
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next access request note history
	 * @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a access request note history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory[] findByAccessRequestNoteHistoryByAccReqId_PrevAndNext(
		long id, long accessRequestId, OrderByComparator orderByComparator)
		throws NoSuchAccessRequestNoteHistoryException, SystemException {
		AccessRequestNoteHistory accessRequestNoteHistory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AccessRequestNoteHistory[] array = new AccessRequestNoteHistoryImpl[3];

			array[0] = getByAccessRequestNoteHistoryByAccReqId_PrevAndNext(session,
					accessRequestNoteHistory, accessRequestId,
					orderByComparator, true);

			array[1] = accessRequestNoteHistory;

			array[2] = getByAccessRequestNoteHistoryByAccReqId_PrevAndNext(session,
					accessRequestNoteHistory, accessRequestId,
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

	protected AccessRequestNoteHistory getByAccessRequestNoteHistoryByAccReqId_PrevAndNext(
		Session session, AccessRequestNoteHistory accessRequestNoteHistory,
		long accessRequestId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACCESSREQUESTNOTEHISTORY_WHERE);

		query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQID_ACCESSREQUESTID_2);

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

		qPos.add(accessRequestId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(accessRequestNoteHistory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AccessRequestNoteHistory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the access request note histories where accessRequestId = &#63; and customerId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @return the matching access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqIdAndCustId(
		long accessRequestId, long customerId) throws SystemException {
		return findByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
			customerId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access request note histories where accessRequestId = &#63; and customerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param start the lower bound of the range of access request note histories
	 * @param end the upper bound of the range of access request note histories (not inclusive)
	 * @return the range of matching access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqIdAndCustId(
		long accessRequestId, long customerId, int start, int end)
		throws SystemException {
		return findByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
			customerId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the access request note histories where accessRequestId = &#63; and customerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param start the lower bound of the range of access request note histories
	 * @param end the upper bound of the range of access request note histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqIdAndCustId(
		long accessRequestId, long customerId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID;
			finderArgs = new Object[] { accessRequestId, customerId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID;
			finderArgs = new Object[] {
					accessRequestId, customerId,
					
					start, end, orderByComparator
				};
		}

		List<AccessRequestNoteHistory> list = (List<AccessRequestNoteHistory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AccessRequestNoteHistory accessRequestNoteHistory : list) {
				if ((accessRequestId != accessRequestNoteHistory.getAccessRequestId()) ||
						(customerId != accessRequestNoteHistory.getCustomerId())) {
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

			query.append(_SQL_SELECT_ACCESSREQUESTNOTEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID_ACCESSREQUESTID_2);

			query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID_CUSTOMERID_2);

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

				qPos.add(accessRequestId);

				qPos.add(customerId);

				list = (List<AccessRequestNoteHistory>)QueryUtil.list(q,
						getDialect(), start, end);
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
	 * Returns the first access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request note history
	 * @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a matching access request note history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqIdAndCustId_First(
		long accessRequestId, long customerId,
		OrderByComparator orderByComparator)
		throws NoSuchAccessRequestNoteHistoryException, SystemException {
		AccessRequestNoteHistory accessRequestNoteHistory = fetchByAccessRequestNoteHistoryByAccReqIdAndCustId_First(accessRequestId,
				customerId, orderByComparator);

		if (accessRequestNoteHistory != null) {
			return accessRequestNoteHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("accessRequestId=");
		msg.append(accessRequestId);

		msg.append(", customerId=");
		msg.append(customerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestNoteHistoryException(msg.toString());
	}

	/**
	 * Returns the first access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request note history, or <code>null</code> if a matching access request note history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqIdAndCustId_First(
		long accessRequestId, long customerId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AccessRequestNoteHistory> list = findByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
				customerId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request note history
	 * @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a matching access request note history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqIdAndCustId_Last(
		long accessRequestId, long customerId,
		OrderByComparator orderByComparator)
		throws NoSuchAccessRequestNoteHistoryException, SystemException {
		AccessRequestNoteHistory accessRequestNoteHistory = fetchByAccessRequestNoteHistoryByAccReqIdAndCustId_Last(accessRequestId,
				customerId, orderByComparator);

		if (accessRequestNoteHistory != null) {
			return accessRequestNoteHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("accessRequestId=");
		msg.append(accessRequestId);

		msg.append(", customerId=");
		msg.append(customerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestNoteHistoryException(msg.toString());
	}

	/**
	 * Returns the last access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request note history, or <code>null</code> if a matching access request note history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqIdAndCustId_Last(
		long accessRequestId, long customerId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
				customerId);

		List<AccessRequestNoteHistory> list = findByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
				customerId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the access request note histories before and after the current access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63;.
	 *
	 * @param id the primary key of the current access request note history
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next access request note history
	 * @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a access request note history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory[] findByAccessRequestNoteHistoryByAccReqIdAndCustId_PrevAndNext(
		long id, long accessRequestId, long customerId,
		OrderByComparator orderByComparator)
		throws NoSuchAccessRequestNoteHistoryException, SystemException {
		AccessRequestNoteHistory accessRequestNoteHistory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AccessRequestNoteHistory[] array = new AccessRequestNoteHistoryImpl[3];

			array[0] = getByAccessRequestNoteHistoryByAccReqIdAndCustId_PrevAndNext(session,
					accessRequestNoteHistory, accessRequestId, customerId,
					orderByComparator, true);

			array[1] = accessRequestNoteHistory;

			array[2] = getByAccessRequestNoteHistoryByAccReqIdAndCustId_PrevAndNext(session,
					accessRequestNoteHistory, accessRequestId, customerId,
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

	protected AccessRequestNoteHistory getByAccessRequestNoteHistoryByAccReqIdAndCustId_PrevAndNext(
		Session session, AccessRequestNoteHistory accessRequestNoteHistory,
		long accessRequestId, long customerId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACCESSREQUESTNOTEHISTORY_WHERE);

		query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID_ACCESSREQUESTID_2);

		query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID_CUSTOMERID_2);

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

		qPos.add(accessRequestId);

		qPos.add(customerId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(accessRequestNoteHistory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AccessRequestNoteHistory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the access request note histories where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param tableName the table name
	 * @return the matching access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqCustTable(
		long accessRequestId, long customerId, String tableName)
		throws SystemException {
		return findByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
			customerId, tableName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access request note histories where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param tableName the table name
	 * @param start the lower bound of the range of access request note histories
	 * @param end the upper bound of the range of access request note histories (not inclusive)
	 * @return the range of matching access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqCustTable(
		long accessRequestId, long customerId, String tableName, int start,
		int end) throws SystemException {
		return findByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
			customerId, tableName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the access request note histories where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param tableName the table name
	 * @param start the lower bound of the range of access request note histories
	 * @param end the upper bound of the range of access request note histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqCustTable(
		long accessRequestId, long customerId, String tableName, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE;
			finderArgs = new Object[] { accessRequestId, customerId, tableName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE;
			finderArgs = new Object[] {
					accessRequestId, customerId, tableName,
					
					start, end, orderByComparator
				};
		}

		List<AccessRequestNoteHistory> list = (List<AccessRequestNoteHistory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AccessRequestNoteHistory accessRequestNoteHistory : list) {
				if ((accessRequestId != accessRequestNoteHistory.getAccessRequestId()) ||
						(customerId != accessRequestNoteHistory.getCustomerId()) ||
						!Validator.equals(tableName,
							accessRequestNoteHistory.getTableName())) {
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

			query.append(_SQL_SELECT_ACCESSREQUESTNOTEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_ACCESSREQUESTID_2);

			query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_CUSTOMERID_2);

			if (tableName == null) {
				query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_TABLENAME_1);
			}
			else {
				if (tableName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_TABLENAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_TABLENAME_2);
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

				qPos.add(accessRequestId);

				qPos.add(customerId);

				if (tableName != null) {
					qPos.add(tableName);
				}

				list = (List<AccessRequestNoteHistory>)QueryUtil.list(q,
						getDialect(), start, end);
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
	 * Returns the first access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param tableName the table name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request note history
	 * @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a matching access request note history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqCustTable_First(
		long accessRequestId, long customerId, String tableName,
		OrderByComparator orderByComparator)
		throws NoSuchAccessRequestNoteHistoryException, SystemException {
		AccessRequestNoteHistory accessRequestNoteHistory = fetchByAccessRequestNoteHistoryByAccReqCustTable_First(accessRequestId,
				customerId, tableName, orderByComparator);

		if (accessRequestNoteHistory != null) {
			return accessRequestNoteHistory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("accessRequestId=");
		msg.append(accessRequestId);

		msg.append(", customerId=");
		msg.append(customerId);

		msg.append(", tableName=");
		msg.append(tableName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestNoteHistoryException(msg.toString());
	}

	/**
	 * Returns the first access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param tableName the table name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request note history, or <code>null</code> if a matching access request note history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqCustTable_First(
		long accessRequestId, long customerId, String tableName,
		OrderByComparator orderByComparator) throws SystemException {
		List<AccessRequestNoteHistory> list = findByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
				customerId, tableName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param tableName the table name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request note history
	 * @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a matching access request note history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqCustTable_Last(
		long accessRequestId, long customerId, String tableName,
		OrderByComparator orderByComparator)
		throws NoSuchAccessRequestNoteHistoryException, SystemException {
		AccessRequestNoteHistory accessRequestNoteHistory = fetchByAccessRequestNoteHistoryByAccReqCustTable_Last(accessRequestId,
				customerId, tableName, orderByComparator);

		if (accessRequestNoteHistory != null) {
			return accessRequestNoteHistory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("accessRequestId=");
		msg.append(accessRequestId);

		msg.append(", customerId=");
		msg.append(customerId);

		msg.append(", tableName=");
		msg.append(tableName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestNoteHistoryException(msg.toString());
	}

	/**
	 * Returns the last access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param tableName the table name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request note history, or <code>null</code> if a matching access request note history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqCustTable_Last(
		long accessRequestId, long customerId, String tableName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
				customerId, tableName);

		List<AccessRequestNoteHistory> list = findByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
				customerId, tableName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the access request note histories before and after the current access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	 *
	 * @param id the primary key of the current access request note history
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param tableName the table name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next access request note history
	 * @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a access request note history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestNoteHistory[] findByAccessRequestNoteHistoryByAccReqCustTable_PrevAndNext(
		long id, long accessRequestId, long customerId, String tableName,
		OrderByComparator orderByComparator)
		throws NoSuchAccessRequestNoteHistoryException, SystemException {
		AccessRequestNoteHistory accessRequestNoteHistory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AccessRequestNoteHistory[] array = new AccessRequestNoteHistoryImpl[3];

			array[0] = getByAccessRequestNoteHistoryByAccReqCustTable_PrevAndNext(session,
					accessRequestNoteHistory, accessRequestId, customerId,
					tableName, orderByComparator, true);

			array[1] = accessRequestNoteHistory;

			array[2] = getByAccessRequestNoteHistoryByAccReqCustTable_PrevAndNext(session,
					accessRequestNoteHistory, accessRequestId, customerId,
					tableName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AccessRequestNoteHistory getByAccessRequestNoteHistoryByAccReqCustTable_PrevAndNext(
		Session session, AccessRequestNoteHistory accessRequestNoteHistory,
		long accessRequestId, long customerId, String tableName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACCESSREQUESTNOTEHISTORY_WHERE);

		query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_ACCESSREQUESTID_2);

		query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_CUSTOMERID_2);

		if (tableName == null) {
			query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_TABLENAME_1);
		}
		else {
			if (tableName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_TABLENAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_TABLENAME_2);
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

		qPos.add(accessRequestId);

		qPos.add(customerId);

		if (tableName != null) {
			qPos.add(tableName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(accessRequestNoteHistory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AccessRequestNoteHistory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the access request note histories.
	 *
	 * @return the access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestNoteHistory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access request note histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of access request note histories
	 * @param end the upper bound of the range of access request note histories (not inclusive)
	 * @return the range of access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestNoteHistory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the access request note histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of access request note histories
	 * @param end the upper bound of the range of access request note histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestNoteHistory> findAll(int start, int end,
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

		List<AccessRequestNoteHistory> list = (List<AccessRequestNoteHistory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACCESSREQUESTNOTEHISTORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACCESSREQUESTNOTEHISTORY;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<AccessRequestNoteHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<AccessRequestNoteHistory>)QueryUtil.list(q,
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
	 * Removes all the access request note histories where accessRequestId = &#63; from the database.
	 *
	 * @param accessRequestId the access request ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAccessRequestNoteHistoryByAccReqId(long accessRequestId)
		throws SystemException {
		for (AccessRequestNoteHistory accessRequestNoteHistory : findByAccessRequestNoteHistoryByAccReqId(
				accessRequestId)) {
			remove(accessRequestNoteHistory);
		}
	}

	/**
	 * Removes all the access request note histories where accessRequestId = &#63; and customerId = &#63; from the database.
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAccessRequestNoteHistoryByAccReqIdAndCustId(
		long accessRequestId, long customerId) throws SystemException {
		for (AccessRequestNoteHistory accessRequestNoteHistory : findByAccessRequestNoteHistoryByAccReqIdAndCustId(
				accessRequestId, customerId)) {
			remove(accessRequestNoteHistory);
		}
	}

	/**
	 * Removes all the access request note histories where accessRequestId = &#63; and customerId = &#63; and tableName = &#63; from the database.
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param tableName the table name
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAccessRequestNoteHistoryByAccReqCustTable(
		long accessRequestId, long customerId, String tableName)
		throws SystemException {
		for (AccessRequestNoteHistory accessRequestNoteHistory : findByAccessRequestNoteHistoryByAccReqCustTable(
				accessRequestId, customerId, tableName)) {
			remove(accessRequestNoteHistory);
		}
	}

	/**
	 * Removes all the access request note histories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (AccessRequestNoteHistory accessRequestNoteHistory : findAll()) {
			remove(accessRequestNoteHistory);
		}
	}

	/**
	 * Returns the number of access request note histories where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @return the number of matching access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAccessRequestNoteHistoryByAccReqId(long accessRequestId)
		throws SystemException {
		Object[] finderArgs = new Object[] { accessRequestId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTNOTEHISTORYBYACCREQID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACCESSREQUESTNOTEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQID_ACCESSREQUESTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(accessRequestId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTNOTEHISTORYBYACCREQID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of access request note histories where accessRequestId = &#63; and customerId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @return the number of matching access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAccessRequestNoteHistoryByAccReqIdAndCustId(
		long accessRequestId, long customerId) throws SystemException {
		Object[] finderArgs = new Object[] { accessRequestId, customerId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ACCESSREQUESTNOTEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID_ACCESSREQUESTID_2);

			query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID_CUSTOMERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(accessRequestId);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of access request note histories where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param customerId the customer ID
	 * @param tableName the table name
	 * @return the number of matching access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAccessRequestNoteHistoryByAccReqCustTable(
		long accessRequestId, long customerId, String tableName)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				accessRequestId, customerId, tableName
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ACCESSREQUESTNOTEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_ACCESSREQUESTID_2);

			query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_CUSTOMERID_2);

			if (tableName == null) {
				query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_TABLENAME_1);
			}
			else {
				if (tableName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_TABLENAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_TABLENAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(accessRequestId);

				qPos.add(customerId);

				if (tableName != null) {
					qPos.add(tableName);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of access request note histories.
	 *
	 * @return the number of access request note histories
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ACCESSREQUESTNOTEHISTORY);

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
	 * Initializes the access request note history persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.AccessRequestNoteHistory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AccessRequestNoteHistory>> listenersList = new ArrayList<ModelListener<AccessRequestNoteHistory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AccessRequestNoteHistory>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AccessRequestNoteHistoryImpl.class.getName());
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
	private static final String _SQL_SELECT_ACCESSREQUESTNOTEHISTORY = "SELECT accessRequestNoteHistory FROM AccessRequestNoteHistory accessRequestNoteHistory";
	private static final String _SQL_SELECT_ACCESSREQUESTNOTEHISTORY_WHERE = "SELECT accessRequestNoteHistory FROM AccessRequestNoteHistory accessRequestNoteHistory WHERE ";
	private static final String _SQL_COUNT_ACCESSREQUESTNOTEHISTORY = "SELECT COUNT(accessRequestNoteHistory) FROM AccessRequestNoteHistory accessRequestNoteHistory";
	private static final String _SQL_COUNT_ACCESSREQUESTNOTEHISTORY_WHERE = "SELECT COUNT(accessRequestNoteHistory) FROM AccessRequestNoteHistory accessRequestNoteHistory WHERE ";
	private static final String _FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQID_ACCESSREQUESTID_2 =
		"accessRequestNoteHistory.accessRequestId = ?";
	private static final String _FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID_ACCESSREQUESTID_2 =
		"accessRequestNoteHistory.accessRequestId = ? AND ";
	private static final String _FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQIDANDCUSTID_CUSTOMERID_2 =
		"accessRequestNoteHistory.customerId = ?";
	private static final String _FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_ACCESSREQUESTID_2 =
		"accessRequestNoteHistory.accessRequestId = ? AND ";
	private static final String _FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_CUSTOMERID_2 =
		"accessRequestNoteHistory.customerId = ? AND ";
	private static final String _FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_TABLENAME_1 =
		"accessRequestNoteHistory.tableName IS NULL";
	private static final String _FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_TABLENAME_2 =
		"accessRequestNoteHistory.tableName = ?";
	private static final String _FINDER_COLUMN_ACCESSREQUESTNOTEHISTORYBYACCREQCUSTTABLE_TABLENAME_3 =
		"(accessRequestNoteHistory.tableName IS NULL OR accessRequestNoteHistory.tableName = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "accessRequestNoteHistory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AccessRequestNoteHistory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AccessRequestNoteHistory exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AccessRequestNoteHistoryPersistenceImpl.class);
	private static AccessRequestNoteHistory _nullAccessRequestNoteHistory = new AccessRequestNoteHistoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AccessRequestNoteHistory> toCacheModel() {
				return _nullAccessRequestNoteHistoryCacheModel;
			}
		};

	private static CacheModel<AccessRequestNoteHistory> _nullAccessRequestNoteHistoryCacheModel =
		new CacheModel<AccessRequestNoteHistory>() {
			public AccessRequestNoteHistory toEntityModel() {
				return _nullAccessRequestNoteHistory;
			}
		};
}