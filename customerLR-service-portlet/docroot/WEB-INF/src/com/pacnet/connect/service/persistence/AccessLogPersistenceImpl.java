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
import com.liferay.portal.kernel.util.CalendarUtil;
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

import com.pacnet.connect.NoSuchAccessLogException;
import com.pacnet.connect.model.AccessLog;
import com.pacnet.connect.model.impl.AccessLogImpl;
import com.pacnet.connect.model.impl.AccessLogModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the access log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see AccessLogPersistence
 * @see AccessLogUtil
 * @generated
 */
public class AccessLogPersistenceImpl extends BasePersistenceImpl<AccessLog>
	implements AccessLogPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AccessLogUtil} to access the access log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AccessLogImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSLOGBYACCESSREQUEST =
		new FinderPath(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
			AccessLogModelImpl.FINDER_CACHE_ENABLED, AccessLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAccessLogByAccessRequest",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSLOGBYACCESSREQUEST =
		new FinderPath(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
			AccessLogModelImpl.FINDER_CACHE_ENABLED, AccessLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAccessLogByAccessRequest",
			new String[] { Long.class.getName() },
			AccessLogModelImpl.ACCESSREQUESTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACCESSLOGBYACCESSREQUEST =
		new FinderPath(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
			AccessLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAccessLogByAccessRequest",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSLOGBYFACILITYUSERMAPPING =
		new FinderPath(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
			AccessLogModelImpl.FINDER_CACHE_ENABLED, AccessLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAccessLogByFacilityUserMapping",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSLOGBYFACILITYUSERMAPPING =
		new FinderPath(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
			AccessLogModelImpl.FINDER_CACHE_ENABLED, AccessLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAccessLogByFacilityUserMapping",
			new String[] { Long.class.getName() },
			AccessLogModelImpl.FACILITYUSERMAPPINGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACCESSLOGBYFACILITYUSERMAPPING =
		new FinderPath(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
			AccessLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAccessLogByFacilityUserMapping",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSLOGBYDATEOFVISIT =
		new FinderPath(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
			AccessLogModelImpl.FINDER_CACHE_ENABLED, AccessLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAccessLogByDateOfVisit",
			new String[] {
				Date.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSLOGBYDATEOFVISIT =
		new FinderPath(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
			AccessLogModelImpl.FINDER_CACHE_ENABLED, AccessLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAccessLogByDateOfVisit",
			new String[] { Date.class.getName() },
			AccessLogModelImpl.ACTUALDATEOFVISIT_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACCESSLOGBYDATEOFVISIT = new FinderPath(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
			AccessLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAccessLogByDateOfVisit",
			new String[] { Date.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
			AccessLogModelImpl.FINDER_CACHE_ENABLED, AccessLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
			AccessLogModelImpl.FINDER_CACHE_ENABLED, AccessLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
			AccessLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the access log in the entity cache if it is enabled.
	 *
	 * @param accessLog the access log
	 */
	public void cacheResult(AccessLog accessLog) {
		EntityCacheUtil.putResult(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
			AccessLogImpl.class, accessLog.getPrimaryKey(), accessLog);

		accessLog.resetOriginalValues();
	}

	/**
	 * Caches the access logs in the entity cache if it is enabled.
	 *
	 * @param accessLogs the access logs
	 */
	public void cacheResult(List<AccessLog> accessLogs) {
		for (AccessLog accessLog : accessLogs) {
			if (EntityCacheUtil.getResult(
						AccessLogModelImpl.ENTITY_CACHE_ENABLED,
						AccessLogImpl.class, accessLog.getPrimaryKey()) == null) {
				cacheResult(accessLog);
			}
			else {
				accessLog.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all access logs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AccessLogImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AccessLogImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the access log.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AccessLog accessLog) {
		EntityCacheUtil.removeResult(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
			AccessLogImpl.class, accessLog.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AccessLog> accessLogs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AccessLog accessLog : accessLogs) {
			EntityCacheUtil.removeResult(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
				AccessLogImpl.class, accessLog.getPrimaryKey());
		}
	}

	/**
	 * Creates a new access log with the primary key. Does not add the access log to the database.
	 *
	 * @param id the primary key for the new access log
	 * @return the new access log
	 */
	public AccessLog create(long id) {
		AccessLog accessLog = new AccessLogImpl();

		accessLog.setNew(true);
		accessLog.setPrimaryKey(id);

		return accessLog;
	}

	/**
	 * Removes the access log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the access log
	 * @return the access log that was removed
	 * @throws com.pacnet.connect.NoSuchAccessLogException if a access log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog remove(long id)
		throws NoSuchAccessLogException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the access log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the access log
	 * @return the access log that was removed
	 * @throws com.pacnet.connect.NoSuchAccessLogException if a access log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccessLog remove(Serializable primaryKey)
		throws NoSuchAccessLogException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AccessLog accessLog = (AccessLog)session.get(AccessLogImpl.class,
					primaryKey);

			if (accessLog == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAccessLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(accessLog);
		}
		catch (NoSuchAccessLogException nsee) {
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
	protected AccessLog removeImpl(AccessLog accessLog)
		throws SystemException {
		accessLog = toUnwrappedModel(accessLog);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, accessLog);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(accessLog);

		return accessLog;
	}

	@Override
	public AccessLog updateImpl(com.pacnet.connect.model.AccessLog accessLog,
		boolean merge) throws SystemException {
		accessLog = toUnwrappedModel(accessLog);

		boolean isNew = accessLog.isNew();

		AccessLogModelImpl accessLogModelImpl = (AccessLogModelImpl)accessLog;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, accessLog, merge);

			accessLog.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AccessLogModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((accessLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSLOGBYACCESSREQUEST.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(accessLogModelImpl.getOriginalAccessRequestId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSLOGBYACCESSREQUEST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSLOGBYACCESSREQUEST,
					args);

				args = new Object[] {
						Long.valueOf(accessLogModelImpl.getAccessRequestId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSLOGBYACCESSREQUEST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSLOGBYACCESSREQUEST,
					args);
			}

			if ((accessLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSLOGBYFACILITYUSERMAPPING.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(accessLogModelImpl.getOriginalFacilityUserMappingId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSLOGBYFACILITYUSERMAPPING,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSLOGBYFACILITYUSERMAPPING,
					args);

				args = new Object[] {
						Long.valueOf(accessLogModelImpl.getFacilityUserMappingId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSLOGBYFACILITYUSERMAPPING,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSLOGBYFACILITYUSERMAPPING,
					args);
			}

			if ((accessLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSLOGBYDATEOFVISIT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						accessLogModelImpl.getOriginalActualDateOfVisit()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSLOGBYDATEOFVISIT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSLOGBYDATEOFVISIT,
					args);

				args = new Object[] { accessLogModelImpl.getActualDateOfVisit() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSLOGBYDATEOFVISIT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSLOGBYDATEOFVISIT,
					args);
			}
		}

		EntityCacheUtil.putResult(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
			AccessLogImpl.class, accessLog.getPrimaryKey(), accessLog);

		return accessLog;
	}

	protected AccessLog toUnwrappedModel(AccessLog accessLog) {
		if (accessLog instanceof AccessLogImpl) {
			return accessLog;
		}

		AccessLogImpl accessLogImpl = new AccessLogImpl();

		accessLogImpl.setNew(accessLog.isNew());
		accessLogImpl.setPrimaryKey(accessLog.getPrimaryKey());

		accessLogImpl.setId(accessLog.getId());
		accessLogImpl.setAccessRequestId(accessLog.getAccessRequestId());
		accessLogImpl.setFacilityUserMappingId(accessLog.getFacilityUserMappingId());
		accessLogImpl.setActualDateOfVisit(accessLog.getActualDateOfVisit());
		accessLogImpl.setTimeIn(accessLog.getTimeIn());
		accessLogImpl.setTimeOut(accessLog.getTimeOut());
		accessLogImpl.setNote(accessLog.getNote());
		accessLogImpl.setIsActive(accessLog.isIsActive());
		accessLogImpl.setCreatedOn(accessLog.getCreatedOn());
		accessLogImpl.setCreatedBy(accessLog.getCreatedBy());
		accessLogImpl.setUpdatedOn(accessLog.getUpdatedOn());
		accessLogImpl.setUpdatedBy(accessLog.getUpdatedBy());

		return accessLogImpl;
	}

	/**
	 * Returns the access log with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the access log
	 * @return the access log
	 * @throws com.liferay.portal.NoSuchModelException if a access log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccessLog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the access log with the primary key or throws a {@link com.pacnet.connect.NoSuchAccessLogException} if it could not be found.
	 *
	 * @param id the primary key of the access log
	 * @return the access log
	 * @throws com.pacnet.connect.NoSuchAccessLogException if a access log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog findByPrimaryKey(long id)
		throws NoSuchAccessLogException, SystemException {
		AccessLog accessLog = fetchByPrimaryKey(id);

		if (accessLog == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchAccessLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return accessLog;
	}

	/**
	 * Returns the access log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the access log
	 * @return the access log, or <code>null</code> if a access log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccessLog fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the access log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the access log
	 * @return the access log, or <code>null</code> if a access log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog fetchByPrimaryKey(long id) throws SystemException {
		AccessLog accessLog = (AccessLog)EntityCacheUtil.getResult(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
				AccessLogImpl.class, id);

		if (accessLog == _nullAccessLog) {
			return null;
		}

		if (accessLog == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				accessLog = (AccessLog)session.get(AccessLogImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (accessLog != null) {
					cacheResult(accessLog);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(AccessLogModelImpl.ENTITY_CACHE_ENABLED,
						AccessLogImpl.class, id, _nullAccessLog);
				}

				closeSession(session);
			}
		}

		return accessLog;
	}

	/**
	 * Returns all the access logs where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @return the matching access logs
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessLog> findByAccessLogByAccessRequest(long accessRequestId)
		throws SystemException {
		return findByAccessLogByAccessRequest(accessRequestId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access logs where accessRequestId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param accessRequestId the access request ID
	 * @param start the lower bound of the range of access logs
	 * @param end the upper bound of the range of access logs (not inclusive)
	 * @return the range of matching access logs
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessLog> findByAccessLogByAccessRequest(
		long accessRequestId, int start, int end) throws SystemException {
		return findByAccessLogByAccessRequest(accessRequestId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the access logs where accessRequestId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param accessRequestId the access request ID
	 * @param start the lower bound of the range of access logs
	 * @param end the upper bound of the range of access logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching access logs
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessLog> findByAccessLogByAccessRequest(
		long accessRequestId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSLOGBYACCESSREQUEST;
			finderArgs = new Object[] { accessRequestId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSLOGBYACCESSREQUEST;
			finderArgs = new Object[] {
					accessRequestId,
					
					start, end, orderByComparator
				};
		}

		List<AccessLog> list = (List<AccessLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AccessLog accessLog : list) {
				if ((accessRequestId != accessLog.getAccessRequestId())) {
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

			query.append(_SQL_SELECT_ACCESSLOG_WHERE);

			query.append(_FINDER_COLUMN_ACCESSLOGBYACCESSREQUEST_ACCESSREQUESTID_2);

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

				list = (List<AccessLog>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first access log in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access log
	 * @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog findByAccessLogByAccessRequest_First(
		long accessRequestId, OrderByComparator orderByComparator)
		throws NoSuchAccessLogException, SystemException {
		AccessLog accessLog = fetchByAccessLogByAccessRequest_First(accessRequestId,
				orderByComparator);

		if (accessLog != null) {
			return accessLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("accessRequestId=");
		msg.append(accessRequestId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessLogException(msg.toString());
	}

	/**
	 * Returns the first access log in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access log, or <code>null</code> if a matching access log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog fetchByAccessLogByAccessRequest_First(
		long accessRequestId, OrderByComparator orderByComparator)
		throws SystemException {
		List<AccessLog> list = findByAccessLogByAccessRequest(accessRequestId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last access log in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access log
	 * @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog findByAccessLogByAccessRequest_Last(long accessRequestId,
		OrderByComparator orderByComparator)
		throws NoSuchAccessLogException, SystemException {
		AccessLog accessLog = fetchByAccessLogByAccessRequest_Last(accessRequestId,
				orderByComparator);

		if (accessLog != null) {
			return accessLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("accessRequestId=");
		msg.append(accessRequestId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessLogException(msg.toString());
	}

	/**
	 * Returns the last access log in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access log, or <code>null</code> if a matching access log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog fetchByAccessLogByAccessRequest_Last(
		long accessRequestId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByAccessLogByAccessRequest(accessRequestId);

		List<AccessLog> list = findByAccessLogByAccessRequest(accessRequestId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the access logs before and after the current access log in the ordered set where accessRequestId = &#63;.
	 *
	 * @param id the primary key of the current access log
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next access log
	 * @throws com.pacnet.connect.NoSuchAccessLogException if a access log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog[] findByAccessLogByAccessRequest_PrevAndNext(long id,
		long accessRequestId, OrderByComparator orderByComparator)
		throws NoSuchAccessLogException, SystemException {
		AccessLog accessLog = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AccessLog[] array = new AccessLogImpl[3];

			array[0] = getByAccessLogByAccessRequest_PrevAndNext(session,
					accessLog, accessRequestId, orderByComparator, true);

			array[1] = accessLog;

			array[2] = getByAccessLogByAccessRequest_PrevAndNext(session,
					accessLog, accessRequestId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AccessLog getByAccessLogByAccessRequest_PrevAndNext(
		Session session, AccessLog accessLog, long accessRequestId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACCESSLOG_WHERE);

		query.append(_FINDER_COLUMN_ACCESSLOGBYACCESSREQUEST_ACCESSREQUESTID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(accessLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AccessLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the access logs where facilityUserMappingId = &#63;.
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @return the matching access logs
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessLog> findByAccessLogByFacilityUserMapping(
		long facilityUserMappingId) throws SystemException {
		return findByAccessLogByFacilityUserMapping(facilityUserMappingId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access logs where facilityUserMappingId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param start the lower bound of the range of access logs
	 * @param end the upper bound of the range of access logs (not inclusive)
	 * @return the range of matching access logs
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessLog> findByAccessLogByFacilityUserMapping(
		long facilityUserMappingId, int start, int end)
		throws SystemException {
		return findByAccessLogByFacilityUserMapping(facilityUserMappingId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the access logs where facilityUserMappingId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param start the lower bound of the range of access logs
	 * @param end the upper bound of the range of access logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching access logs
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessLog> findByAccessLogByFacilityUserMapping(
		long facilityUserMappingId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSLOGBYFACILITYUSERMAPPING;
			finderArgs = new Object[] { facilityUserMappingId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSLOGBYFACILITYUSERMAPPING;
			finderArgs = new Object[] {
					facilityUserMappingId,
					
					start, end, orderByComparator
				};
		}

		List<AccessLog> list = (List<AccessLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AccessLog accessLog : list) {
				if ((facilityUserMappingId != accessLog.getFacilityUserMappingId())) {
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

			query.append(_SQL_SELECT_ACCESSLOG_WHERE);

			query.append(_FINDER_COLUMN_ACCESSLOGBYFACILITYUSERMAPPING_FACILITYUSERMAPPINGID_2);

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

				qPos.add(facilityUserMappingId);

				list = (List<AccessLog>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first access log in the ordered set where facilityUserMappingId = &#63;.
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access log
	 * @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog findByAccessLogByFacilityUserMapping_First(
		long facilityUserMappingId, OrderByComparator orderByComparator)
		throws NoSuchAccessLogException, SystemException {
		AccessLog accessLog = fetchByAccessLogByFacilityUserMapping_First(facilityUserMappingId,
				orderByComparator);

		if (accessLog != null) {
			return accessLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityUserMappingId=");
		msg.append(facilityUserMappingId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessLogException(msg.toString());
	}

	/**
	 * Returns the first access log in the ordered set where facilityUserMappingId = &#63;.
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access log, or <code>null</code> if a matching access log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog fetchByAccessLogByFacilityUserMapping_First(
		long facilityUserMappingId, OrderByComparator orderByComparator)
		throws SystemException {
		List<AccessLog> list = findByAccessLogByFacilityUserMapping(facilityUserMappingId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last access log in the ordered set where facilityUserMappingId = &#63;.
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access log
	 * @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog findByAccessLogByFacilityUserMapping_Last(
		long facilityUserMappingId, OrderByComparator orderByComparator)
		throws NoSuchAccessLogException, SystemException {
		AccessLog accessLog = fetchByAccessLogByFacilityUserMapping_Last(facilityUserMappingId,
				orderByComparator);

		if (accessLog != null) {
			return accessLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityUserMappingId=");
		msg.append(facilityUserMappingId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessLogException(msg.toString());
	}

	/**
	 * Returns the last access log in the ordered set where facilityUserMappingId = &#63;.
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access log, or <code>null</code> if a matching access log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog fetchByAccessLogByFacilityUserMapping_Last(
		long facilityUserMappingId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByAccessLogByFacilityUserMapping(facilityUserMappingId);

		List<AccessLog> list = findByAccessLogByFacilityUserMapping(facilityUserMappingId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the access logs before and after the current access log in the ordered set where facilityUserMappingId = &#63;.
	 *
	 * @param id the primary key of the current access log
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next access log
	 * @throws com.pacnet.connect.NoSuchAccessLogException if a access log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog[] findByAccessLogByFacilityUserMapping_PrevAndNext(
		long id, long facilityUserMappingId, OrderByComparator orderByComparator)
		throws NoSuchAccessLogException, SystemException {
		AccessLog accessLog = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AccessLog[] array = new AccessLogImpl[3];

			array[0] = getByAccessLogByFacilityUserMapping_PrevAndNext(session,
					accessLog, facilityUserMappingId, orderByComparator, true);

			array[1] = accessLog;

			array[2] = getByAccessLogByFacilityUserMapping_PrevAndNext(session,
					accessLog, facilityUserMappingId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AccessLog getByAccessLogByFacilityUserMapping_PrevAndNext(
		Session session, AccessLog accessLog, long facilityUserMappingId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACCESSLOG_WHERE);

		query.append(_FINDER_COLUMN_ACCESSLOGBYFACILITYUSERMAPPING_FACILITYUSERMAPPINGID_2);

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

		qPos.add(facilityUserMappingId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(accessLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AccessLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the access logs where actualDateOfVisit = &#63;.
	 *
	 * @param actualDateOfVisit the actual date of visit
	 * @return the matching access logs
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessLog> findByAccessLogByDateOfVisit(Date actualDateOfVisit)
		throws SystemException {
		return findByAccessLogByDateOfVisit(actualDateOfVisit,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access logs where actualDateOfVisit = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param actualDateOfVisit the actual date of visit
	 * @param start the lower bound of the range of access logs
	 * @param end the upper bound of the range of access logs (not inclusive)
	 * @return the range of matching access logs
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessLog> findByAccessLogByDateOfVisit(
		Date actualDateOfVisit, int start, int end) throws SystemException {
		return findByAccessLogByDateOfVisit(actualDateOfVisit, start, end, null);
	}

	/**
	 * Returns an ordered range of all the access logs where actualDateOfVisit = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param actualDateOfVisit the actual date of visit
	 * @param start the lower bound of the range of access logs
	 * @param end the upper bound of the range of access logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching access logs
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessLog> findByAccessLogByDateOfVisit(
		Date actualDateOfVisit, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSLOGBYDATEOFVISIT;
			finderArgs = new Object[] { actualDateOfVisit };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSLOGBYDATEOFVISIT;
			finderArgs = new Object[] {
					actualDateOfVisit,
					
					start, end, orderByComparator
				};
		}

		List<AccessLog> list = (List<AccessLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AccessLog accessLog : list) {
				if (!Validator.equals(actualDateOfVisit,
							accessLog.getActualDateOfVisit())) {
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

			query.append(_SQL_SELECT_ACCESSLOG_WHERE);

			if (actualDateOfVisit == null) {
				query.append(_FINDER_COLUMN_ACCESSLOGBYDATEOFVISIT_ACTUALDATEOFVISIT_1);
			}
			else {
				query.append(_FINDER_COLUMN_ACCESSLOGBYDATEOFVISIT_ACTUALDATEOFVISIT_2);
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

				if (actualDateOfVisit != null) {
					qPos.add(CalendarUtil.getTimestamp(actualDateOfVisit));
				}

				list = (List<AccessLog>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first access log in the ordered set where actualDateOfVisit = &#63;.
	 *
	 * @param actualDateOfVisit the actual date of visit
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access log
	 * @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog findByAccessLogByDateOfVisit_First(
		Date actualDateOfVisit, OrderByComparator orderByComparator)
		throws NoSuchAccessLogException, SystemException {
		AccessLog accessLog = fetchByAccessLogByDateOfVisit_First(actualDateOfVisit,
				orderByComparator);

		if (accessLog != null) {
			return accessLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("actualDateOfVisit=");
		msg.append(actualDateOfVisit);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessLogException(msg.toString());
	}

	/**
	 * Returns the first access log in the ordered set where actualDateOfVisit = &#63;.
	 *
	 * @param actualDateOfVisit the actual date of visit
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access log, or <code>null</code> if a matching access log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog fetchByAccessLogByDateOfVisit_First(
		Date actualDateOfVisit, OrderByComparator orderByComparator)
		throws SystemException {
		List<AccessLog> list = findByAccessLogByDateOfVisit(actualDateOfVisit,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last access log in the ordered set where actualDateOfVisit = &#63;.
	 *
	 * @param actualDateOfVisit the actual date of visit
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access log
	 * @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog findByAccessLogByDateOfVisit_Last(Date actualDateOfVisit,
		OrderByComparator orderByComparator)
		throws NoSuchAccessLogException, SystemException {
		AccessLog accessLog = fetchByAccessLogByDateOfVisit_Last(actualDateOfVisit,
				orderByComparator);

		if (accessLog != null) {
			return accessLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("actualDateOfVisit=");
		msg.append(actualDateOfVisit);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessLogException(msg.toString());
	}

	/**
	 * Returns the last access log in the ordered set where actualDateOfVisit = &#63;.
	 *
	 * @param actualDateOfVisit the actual date of visit
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access log, or <code>null</code> if a matching access log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog fetchByAccessLogByDateOfVisit_Last(
		Date actualDateOfVisit, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByAccessLogByDateOfVisit(actualDateOfVisit);

		List<AccessLog> list = findByAccessLogByDateOfVisit(actualDateOfVisit,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the access logs before and after the current access log in the ordered set where actualDateOfVisit = &#63;.
	 *
	 * @param id the primary key of the current access log
	 * @param actualDateOfVisit the actual date of visit
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next access log
	 * @throws com.pacnet.connect.NoSuchAccessLogException if a access log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessLog[] findByAccessLogByDateOfVisit_PrevAndNext(long id,
		Date actualDateOfVisit, OrderByComparator orderByComparator)
		throws NoSuchAccessLogException, SystemException {
		AccessLog accessLog = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AccessLog[] array = new AccessLogImpl[3];

			array[0] = getByAccessLogByDateOfVisit_PrevAndNext(session,
					accessLog, actualDateOfVisit, orderByComparator, true);

			array[1] = accessLog;

			array[2] = getByAccessLogByDateOfVisit_PrevAndNext(session,
					accessLog, actualDateOfVisit, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AccessLog getByAccessLogByDateOfVisit_PrevAndNext(
		Session session, AccessLog accessLog, Date actualDateOfVisit,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACCESSLOG_WHERE);

		if (actualDateOfVisit == null) {
			query.append(_FINDER_COLUMN_ACCESSLOGBYDATEOFVISIT_ACTUALDATEOFVISIT_1);
		}
		else {
			query.append(_FINDER_COLUMN_ACCESSLOGBYDATEOFVISIT_ACTUALDATEOFVISIT_2);
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

		if (actualDateOfVisit != null) {
			qPos.add(CalendarUtil.getTimestamp(actualDateOfVisit));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(accessLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AccessLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the access logs.
	 *
	 * @return the access logs
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessLog> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of access logs
	 * @param end the upper bound of the range of access logs (not inclusive)
	 * @return the range of access logs
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessLog> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the access logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of access logs
	 * @param end the upper bound of the range of access logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of access logs
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessLog> findAll(int start, int end,
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

		List<AccessLog> list = (List<AccessLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACCESSLOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACCESSLOG;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<AccessLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<AccessLog>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the access logs where accessRequestId = &#63; from the database.
	 *
	 * @param accessRequestId the access request ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAccessLogByAccessRequest(long accessRequestId)
		throws SystemException {
		for (AccessLog accessLog : findByAccessLogByAccessRequest(
				accessRequestId)) {
			remove(accessLog);
		}
	}

	/**
	 * Removes all the access logs where facilityUserMappingId = &#63; from the database.
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAccessLogByFacilityUserMapping(
		long facilityUserMappingId) throws SystemException {
		for (AccessLog accessLog : findByAccessLogByFacilityUserMapping(
				facilityUserMappingId)) {
			remove(accessLog);
		}
	}

	/**
	 * Removes all the access logs where actualDateOfVisit = &#63; from the database.
	 *
	 * @param actualDateOfVisit the actual date of visit
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAccessLogByDateOfVisit(Date actualDateOfVisit)
		throws SystemException {
		for (AccessLog accessLog : findByAccessLogByDateOfVisit(
				actualDateOfVisit)) {
			remove(accessLog);
		}
	}

	/**
	 * Removes all the access logs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (AccessLog accessLog : findAll()) {
			remove(accessLog);
		}
	}

	/**
	 * Returns the number of access logs where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @return the number of matching access logs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAccessLogByAccessRequest(long accessRequestId)
		throws SystemException {
		Object[] finderArgs = new Object[] { accessRequestId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ACCESSLOGBYACCESSREQUEST,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACCESSLOG_WHERE);

			query.append(_FINDER_COLUMN_ACCESSLOGBYACCESSREQUEST_ACCESSREQUESTID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ACCESSLOGBYACCESSREQUEST,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of access logs where facilityUserMappingId = &#63;.
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @return the number of matching access logs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAccessLogByFacilityUserMapping(long facilityUserMappingId)
		throws SystemException {
		Object[] finderArgs = new Object[] { facilityUserMappingId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ACCESSLOGBYFACILITYUSERMAPPING,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACCESSLOG_WHERE);

			query.append(_FINDER_COLUMN_ACCESSLOGBYFACILITYUSERMAPPING_FACILITYUSERMAPPINGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(facilityUserMappingId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ACCESSLOGBYFACILITYUSERMAPPING,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of access logs where actualDateOfVisit = &#63;.
	 *
	 * @param actualDateOfVisit the actual date of visit
	 * @return the number of matching access logs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAccessLogByDateOfVisit(Date actualDateOfVisit)
		throws SystemException {
		Object[] finderArgs = new Object[] { actualDateOfVisit };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ACCESSLOGBYDATEOFVISIT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACCESSLOG_WHERE);

			if (actualDateOfVisit == null) {
				query.append(_FINDER_COLUMN_ACCESSLOGBYDATEOFVISIT_ACTUALDATEOFVISIT_1);
			}
			else {
				query.append(_FINDER_COLUMN_ACCESSLOGBYDATEOFVISIT_ACTUALDATEOFVISIT_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (actualDateOfVisit != null) {
					qPos.add(CalendarUtil.getTimestamp(actualDateOfVisit));
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ACCESSLOGBYDATEOFVISIT,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of access logs.
	 *
	 * @return the number of access logs
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ACCESSLOG);

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
	 * Initializes the access log persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.AccessLog")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AccessLog>> listenersList = new ArrayList<ModelListener<AccessLog>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AccessLog>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AccessLogImpl.class.getName());
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
	private static final String _SQL_SELECT_ACCESSLOG = "SELECT accessLog FROM AccessLog accessLog";
	private static final String _SQL_SELECT_ACCESSLOG_WHERE = "SELECT accessLog FROM AccessLog accessLog WHERE ";
	private static final String _SQL_COUNT_ACCESSLOG = "SELECT COUNT(accessLog) FROM AccessLog accessLog";
	private static final String _SQL_COUNT_ACCESSLOG_WHERE = "SELECT COUNT(accessLog) FROM AccessLog accessLog WHERE ";
	private static final String _FINDER_COLUMN_ACCESSLOGBYACCESSREQUEST_ACCESSREQUESTID_2 =
		"accessLog.accessRequestId = ?";
	private static final String _FINDER_COLUMN_ACCESSLOGBYFACILITYUSERMAPPING_FACILITYUSERMAPPINGID_2 =
		"accessLog.facilityUserMappingId = ?";
	private static final String _FINDER_COLUMN_ACCESSLOGBYDATEOFVISIT_ACTUALDATEOFVISIT_1 =
		"accessLog.actualDateOfVisit IS NULL";
	private static final String _FINDER_COLUMN_ACCESSLOGBYDATEOFVISIT_ACTUALDATEOFVISIT_2 =
		"accessLog.actualDateOfVisit = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "accessLog.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AccessLog exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AccessLog exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AccessLogPersistenceImpl.class);
	private static AccessLog _nullAccessLog = new AccessLogImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AccessLog> toCacheModel() {
				return _nullAccessLogCacheModel;
			}
		};

	private static CacheModel<AccessLog> _nullAccessLogCacheModel = new CacheModel<AccessLog>() {
			public AccessLog toEntityModel() {
				return _nullAccessLog;
			}
		};
}