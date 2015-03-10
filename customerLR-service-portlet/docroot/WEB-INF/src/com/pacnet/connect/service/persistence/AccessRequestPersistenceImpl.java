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

import com.pacnet.connect.NoSuchAccessRequestException;
import com.pacnet.connect.model.AccessRequest;
import com.pacnet.connect.model.impl.AccessRequestImpl;
import com.pacnet.connect.model.impl.AccessRequestModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the access request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestPersistence
 * @see AccessRequestUtil
 * @generated
 */
public class AccessRequestPersistenceImpl extends BasePersistenceImpl<AccessRequest>
	implements AccessRequestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AccessRequestUtil} to access the access request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AccessRequestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTBYFACILITY =
		new FinderPath(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAccessRequestByFacility",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTBYFACILITY =
		new FinderPath(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAccessRequestByFacility",
			new String[] { Long.class.getName() },
			AccessRequestModelImpl.FACILITYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACCESSREQUESTBYFACILITY = new FinderPath(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAccessRequestByFacility",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTBYCUSTOMER =
		new FinderPath(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAccessRequestByCustomer",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTBYCUSTOMER =
		new FinderPath(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAccessRequestByCustomer",
			new String[] { Long.class.getName() },
			AccessRequestModelImpl.CUSTOMERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACCESSREQUESTBYCUSTOMER = new FinderPath(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAccessRequestByCustomer",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTBYVISITOR =
		new FinderPath(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAccessRequestByVisitor",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTBYVISITOR =
		new FinderPath(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAccessRequestByVisitor",
			new String[] { Long.class.getName() },
			AccessRequestModelImpl.VISITORID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACCESSREQUESTBYVISITOR = new FinderPath(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAccessRequestByVisitor",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the access request in the entity cache if it is enabled.
	 *
	 * @param accessRequest the access request
	 */
	public void cacheResult(AccessRequest accessRequest) {
		EntityCacheUtil.putResult(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestImpl.class, accessRequest.getPrimaryKey(),
			accessRequest);

		accessRequest.resetOriginalValues();
	}

	/**
	 * Caches the access requests in the entity cache if it is enabled.
	 *
	 * @param accessRequests the access requests
	 */
	public void cacheResult(List<AccessRequest> accessRequests) {
		for (AccessRequest accessRequest : accessRequests) {
			if (EntityCacheUtil.getResult(
						AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
						AccessRequestImpl.class, accessRequest.getPrimaryKey()) == null) {
				cacheResult(accessRequest);
			}
			else {
				accessRequest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all access requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AccessRequestImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AccessRequestImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the access request.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AccessRequest accessRequest) {
		EntityCacheUtil.removeResult(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestImpl.class, accessRequest.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AccessRequest> accessRequests) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AccessRequest accessRequest : accessRequests) {
			EntityCacheUtil.removeResult(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
				AccessRequestImpl.class, accessRequest.getPrimaryKey());
		}
	}

	/**
	 * Creates a new access request with the primary key. Does not add the access request to the database.
	 *
	 * @param id the primary key for the new access request
	 * @return the new access request
	 */
	public AccessRequest create(long id) {
		AccessRequest accessRequest = new AccessRequestImpl();

		accessRequest.setNew(true);
		accessRequest.setPrimaryKey(id);

		return accessRequest;
	}

	/**
	 * Removes the access request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the access request
	 * @return the access request that was removed
	 * @throws com.pacnet.connect.NoSuchAccessRequestException if a access request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest remove(long id)
		throws NoSuchAccessRequestException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the access request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the access request
	 * @return the access request that was removed
	 * @throws com.pacnet.connect.NoSuchAccessRequestException if a access request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccessRequest remove(Serializable primaryKey)
		throws NoSuchAccessRequestException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AccessRequest accessRequest = (AccessRequest)session.get(AccessRequestImpl.class,
					primaryKey);

			if (accessRequest == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAccessRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(accessRequest);
		}
		catch (NoSuchAccessRequestException nsee) {
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
	protected AccessRequest removeImpl(AccessRequest accessRequest)
		throws SystemException {
		accessRequest = toUnwrappedModel(accessRequest);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, accessRequest);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(accessRequest);

		return accessRequest;
	}

	@Override
	public AccessRequest updateImpl(
		com.pacnet.connect.model.AccessRequest accessRequest, boolean merge)
		throws SystemException {
		accessRequest = toUnwrappedModel(accessRequest);

		boolean isNew = accessRequest.isNew();

		AccessRequestModelImpl accessRequestModelImpl = (AccessRequestModelImpl)accessRequest;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, accessRequest, merge);

			accessRequest.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AccessRequestModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((accessRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTBYFACILITY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(accessRequestModelImpl.getOriginalFacilityId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTBYFACILITY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTBYFACILITY,
					args);

				args = new Object[] {
						Long.valueOf(accessRequestModelImpl.getFacilityId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTBYFACILITY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTBYFACILITY,
					args);
			}

			if ((accessRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTBYCUSTOMER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(accessRequestModelImpl.getOriginalCustomerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTBYCUSTOMER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTBYCUSTOMER,
					args);

				args = new Object[] {
						Long.valueOf(accessRequestModelImpl.getCustomerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTBYCUSTOMER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTBYCUSTOMER,
					args);
			}

			if ((accessRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTBYVISITOR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(accessRequestModelImpl.getOriginalVisitorId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTBYVISITOR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTBYVISITOR,
					args);

				args = new Object[] {
						Long.valueOf(accessRequestModelImpl.getVisitorId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTBYVISITOR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTBYVISITOR,
					args);
			}
		}

		EntityCacheUtil.putResult(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestImpl.class, accessRequest.getPrimaryKey(),
			accessRequest);

		return accessRequest;
	}

	protected AccessRequest toUnwrappedModel(AccessRequest accessRequest) {
		if (accessRequest instanceof AccessRequestImpl) {
			return accessRequest;
		}

		AccessRequestImpl accessRequestImpl = new AccessRequestImpl();

		accessRequestImpl.setNew(accessRequest.isNew());
		accessRequestImpl.setPrimaryKey(accessRequest.getPrimaryKey());

		accessRequestImpl.setId(accessRequest.getId());
		accessRequestImpl.setFacilityId(accessRequest.getFacilityId());
		accessRequestImpl.setCustomerId(accessRequest.getCustomerId());
		accessRequestImpl.setVisitorId(accessRequest.getVisitorId());
		accessRequestImpl.setAccessRequestStatusId(accessRequest.getAccessRequestStatusId());
		accessRequestImpl.setDateOfVisit(accessRequest.getDateOfVisit());
		accessRequestImpl.setTentativeTimeIn(accessRequest.getTentativeTimeIn());
		accessRequestImpl.setTentativeTimeOut(accessRequest.getTentativeTimeOut());
		accessRequestImpl.setNote(accessRequest.getNote());
		accessRequestImpl.setIsExternalVisitor(accessRequest.isIsExternalVisitor());
		accessRequestImpl.setIsActive(accessRequest.isIsActive());
		accessRequestImpl.setOneTimeAccess(accessRequest.isOneTimeAccess());
		accessRequestImpl.setDateOfVisitGmt(accessRequest.getDateOfVisitGmt());
		accessRequestImpl.setDateOfTimeOutGmt(accessRequest.getDateOfTimeOutGmt());
		accessRequestImpl.setCreatedOn(accessRequest.getCreatedOn());
		accessRequestImpl.setCreatedBy(accessRequest.getCreatedBy());
		accessRequestImpl.setUpdatedOn(accessRequest.getUpdatedOn());
		accessRequestImpl.setUpdatedBy(accessRequest.getUpdatedBy());

		return accessRequestImpl;
	}

	/**
	 * Returns the access request with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the access request
	 * @return the access request
	 * @throws com.liferay.portal.NoSuchModelException if a access request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccessRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the access request with the primary key or throws a {@link com.pacnet.connect.NoSuchAccessRequestException} if it could not be found.
	 *
	 * @param id the primary key of the access request
	 * @return the access request
	 * @throws com.pacnet.connect.NoSuchAccessRequestException if a access request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest findByPrimaryKey(long id)
		throws NoSuchAccessRequestException, SystemException {
		AccessRequest accessRequest = fetchByPrimaryKey(id);

		if (accessRequest == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchAccessRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return accessRequest;
	}

	/**
	 * Returns the access request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the access request
	 * @return the access request, or <code>null</code> if a access request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccessRequest fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the access request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the access request
	 * @return the access request, or <code>null</code> if a access request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest fetchByPrimaryKey(long id) throws SystemException {
		AccessRequest accessRequest = (AccessRequest)EntityCacheUtil.getResult(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
				AccessRequestImpl.class, id);

		if (accessRequest == _nullAccessRequest) {
			return null;
		}

		if (accessRequest == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				accessRequest = (AccessRequest)session.get(AccessRequestImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (accessRequest != null) {
					cacheResult(accessRequest);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(AccessRequestModelImpl.ENTITY_CACHE_ENABLED,
						AccessRequestImpl.class, id, _nullAccessRequest);
				}

				closeSession(session);
			}
		}

		return accessRequest;
	}

	/**
	 * Returns all the access requests where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @return the matching access requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequest> findByAccessRequestByFacility(long facilityId)
		throws SystemException {
		return findByAccessRequestByFacility(facilityId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access requests where facilityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityId the facility ID
	 * @param start the lower bound of the range of access requests
	 * @param end the upper bound of the range of access requests (not inclusive)
	 * @return the range of matching access requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequest> findByAccessRequestByFacility(long facilityId,
		int start, int end) throws SystemException {
		return findByAccessRequestByFacility(facilityId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the access requests where facilityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityId the facility ID
	 * @param start the lower bound of the range of access requests
	 * @param end the upper bound of the range of access requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching access requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequest> findByAccessRequestByFacility(long facilityId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTBYFACILITY;
			finderArgs = new Object[] { facilityId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTBYFACILITY;
			finderArgs = new Object[] { facilityId, start, end, orderByComparator };
		}

		List<AccessRequest> list = (List<AccessRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AccessRequest accessRequest : list) {
				if ((facilityId != accessRequest.getFacilityId())) {
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

			query.append(_SQL_SELECT_ACCESSREQUEST_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTBYFACILITY_FACILITYID_2);

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

				qPos.add(facilityId);

				list = (List<AccessRequest>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first access request in the ordered set where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request
	 * @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest findByAccessRequestByFacility_First(long facilityId,
		OrderByComparator orderByComparator)
		throws NoSuchAccessRequestException, SystemException {
		AccessRequest accessRequest = fetchByAccessRequestByFacility_First(facilityId,
				orderByComparator);

		if (accessRequest != null) {
			return accessRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityId=");
		msg.append(facilityId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestException(msg.toString());
	}

	/**
	 * Returns the first access request in the ordered set where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request, or <code>null</code> if a matching access request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest fetchByAccessRequestByFacility_First(long facilityId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AccessRequest> list = findByAccessRequestByFacility(facilityId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last access request in the ordered set where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request
	 * @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest findByAccessRequestByFacility_Last(long facilityId,
		OrderByComparator orderByComparator)
		throws NoSuchAccessRequestException, SystemException {
		AccessRequest accessRequest = fetchByAccessRequestByFacility_Last(facilityId,
				orderByComparator);

		if (accessRequest != null) {
			return accessRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityId=");
		msg.append(facilityId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestException(msg.toString());
	}

	/**
	 * Returns the last access request in the ordered set where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request, or <code>null</code> if a matching access request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest fetchByAccessRequestByFacility_Last(long facilityId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAccessRequestByFacility(facilityId);

		List<AccessRequest> list = findByAccessRequestByFacility(facilityId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the access requests before and after the current access request in the ordered set where facilityId = &#63;.
	 *
	 * @param id the primary key of the current access request
	 * @param facilityId the facility ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next access request
	 * @throws com.pacnet.connect.NoSuchAccessRequestException if a access request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest[] findByAccessRequestByFacility_PrevAndNext(long id,
		long facilityId, OrderByComparator orderByComparator)
		throws NoSuchAccessRequestException, SystemException {
		AccessRequest accessRequest = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AccessRequest[] array = new AccessRequestImpl[3];

			array[0] = getByAccessRequestByFacility_PrevAndNext(session,
					accessRequest, facilityId, orderByComparator, true);

			array[1] = accessRequest;

			array[2] = getByAccessRequestByFacility_PrevAndNext(session,
					accessRequest, facilityId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AccessRequest getByAccessRequestByFacility_PrevAndNext(
		Session session, AccessRequest accessRequest, long facilityId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACCESSREQUEST_WHERE);

		query.append(_FINDER_COLUMN_ACCESSREQUESTBYFACILITY_FACILITYID_2);

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

		qPos.add(facilityId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(accessRequest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AccessRequest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the access requests where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @return the matching access requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequest> findByAccessRequestByCustomer(long customerId)
		throws SystemException {
		return findByAccessRequestByCustomer(customerId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access requests where customerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param start the lower bound of the range of access requests
	 * @param end the upper bound of the range of access requests (not inclusive)
	 * @return the range of matching access requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequest> findByAccessRequestByCustomer(long customerId,
		int start, int end) throws SystemException {
		return findByAccessRequestByCustomer(customerId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the access requests where customerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param start the lower bound of the range of access requests
	 * @param end the upper bound of the range of access requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching access requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequest> findByAccessRequestByCustomer(long customerId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTBYCUSTOMER;
			finderArgs = new Object[] { customerId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTBYCUSTOMER;
			finderArgs = new Object[] { customerId, start, end, orderByComparator };
		}

		List<AccessRequest> list = (List<AccessRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AccessRequest accessRequest : list) {
				if ((customerId != accessRequest.getCustomerId())) {
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

			query.append(_SQL_SELECT_ACCESSREQUEST_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTBYCUSTOMER_CUSTOMERID_2);

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

				list = (List<AccessRequest>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first access request in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request
	 * @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest findByAccessRequestByCustomer_First(long customerId,
		OrderByComparator orderByComparator)
		throws NoSuchAccessRequestException, SystemException {
		AccessRequest accessRequest = fetchByAccessRequestByCustomer_First(customerId,
				orderByComparator);

		if (accessRequest != null) {
			return accessRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestException(msg.toString());
	}

	/**
	 * Returns the first access request in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request, or <code>null</code> if a matching access request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest fetchByAccessRequestByCustomer_First(long customerId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AccessRequest> list = findByAccessRequestByCustomer(customerId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last access request in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request
	 * @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest findByAccessRequestByCustomer_Last(long customerId,
		OrderByComparator orderByComparator)
		throws NoSuchAccessRequestException, SystemException {
		AccessRequest accessRequest = fetchByAccessRequestByCustomer_Last(customerId,
				orderByComparator);

		if (accessRequest != null) {
			return accessRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestException(msg.toString());
	}

	/**
	 * Returns the last access request in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request, or <code>null</code> if a matching access request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest fetchByAccessRequestByCustomer_Last(long customerId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAccessRequestByCustomer(customerId);

		List<AccessRequest> list = findByAccessRequestByCustomer(customerId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the access requests before and after the current access request in the ordered set where customerId = &#63;.
	 *
	 * @param id the primary key of the current access request
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next access request
	 * @throws com.pacnet.connect.NoSuchAccessRequestException if a access request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest[] findByAccessRequestByCustomer_PrevAndNext(long id,
		long customerId, OrderByComparator orderByComparator)
		throws NoSuchAccessRequestException, SystemException {
		AccessRequest accessRequest = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AccessRequest[] array = new AccessRequestImpl[3];

			array[0] = getByAccessRequestByCustomer_PrevAndNext(session,
					accessRequest, customerId, orderByComparator, true);

			array[1] = accessRequest;

			array[2] = getByAccessRequestByCustomer_PrevAndNext(session,
					accessRequest, customerId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AccessRequest getByAccessRequestByCustomer_PrevAndNext(
		Session session, AccessRequest accessRequest, long customerId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACCESSREQUEST_WHERE);

		query.append(_FINDER_COLUMN_ACCESSREQUESTBYCUSTOMER_CUSTOMERID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(accessRequest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AccessRequest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the access requests where visitorId = &#63;.
	 *
	 * @param visitorId the visitor ID
	 * @return the matching access requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequest> findByAccessRequestByVisitor(long visitorId)
		throws SystemException {
		return findByAccessRequestByVisitor(visitorId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access requests where visitorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param visitorId the visitor ID
	 * @param start the lower bound of the range of access requests
	 * @param end the upper bound of the range of access requests (not inclusive)
	 * @return the range of matching access requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequest> findByAccessRequestByVisitor(long visitorId,
		int start, int end) throws SystemException {
		return findByAccessRequestByVisitor(visitorId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the access requests where visitorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param visitorId the visitor ID
	 * @param start the lower bound of the range of access requests
	 * @param end the upper bound of the range of access requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching access requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequest> findByAccessRequestByVisitor(long visitorId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTBYVISITOR;
			finderArgs = new Object[] { visitorId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTBYVISITOR;
			finderArgs = new Object[] { visitorId, start, end, orderByComparator };
		}

		List<AccessRequest> list = (List<AccessRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AccessRequest accessRequest : list) {
				if ((visitorId != accessRequest.getVisitorId())) {
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

			query.append(_SQL_SELECT_ACCESSREQUEST_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTBYVISITOR_VISITORID_2);

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

				qPos.add(visitorId);

				list = (List<AccessRequest>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first access request in the ordered set where visitorId = &#63;.
	 *
	 * @param visitorId the visitor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request
	 * @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest findByAccessRequestByVisitor_First(long visitorId,
		OrderByComparator orderByComparator)
		throws NoSuchAccessRequestException, SystemException {
		AccessRequest accessRequest = fetchByAccessRequestByVisitor_First(visitorId,
				orderByComparator);

		if (accessRequest != null) {
			return accessRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("visitorId=");
		msg.append(visitorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestException(msg.toString());
	}

	/**
	 * Returns the first access request in the ordered set where visitorId = &#63;.
	 *
	 * @param visitorId the visitor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request, or <code>null</code> if a matching access request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest fetchByAccessRequestByVisitor_First(long visitorId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AccessRequest> list = findByAccessRequestByVisitor(visitorId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last access request in the ordered set where visitorId = &#63;.
	 *
	 * @param visitorId the visitor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request
	 * @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest findByAccessRequestByVisitor_Last(long visitorId,
		OrderByComparator orderByComparator)
		throws NoSuchAccessRequestException, SystemException {
		AccessRequest accessRequest = fetchByAccessRequestByVisitor_Last(visitorId,
				orderByComparator);

		if (accessRequest != null) {
			return accessRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("visitorId=");
		msg.append(visitorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestException(msg.toString());
	}

	/**
	 * Returns the last access request in the ordered set where visitorId = &#63;.
	 *
	 * @param visitorId the visitor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request, or <code>null</code> if a matching access request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest fetchByAccessRequestByVisitor_Last(long visitorId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAccessRequestByVisitor(visitorId);

		List<AccessRequest> list = findByAccessRequestByVisitor(visitorId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the access requests before and after the current access request in the ordered set where visitorId = &#63;.
	 *
	 * @param id the primary key of the current access request
	 * @param visitorId the visitor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next access request
	 * @throws com.pacnet.connect.NoSuchAccessRequestException if a access request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequest[] findByAccessRequestByVisitor_PrevAndNext(long id,
		long visitorId, OrderByComparator orderByComparator)
		throws NoSuchAccessRequestException, SystemException {
		AccessRequest accessRequest = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AccessRequest[] array = new AccessRequestImpl[3];

			array[0] = getByAccessRequestByVisitor_PrevAndNext(session,
					accessRequest, visitorId, orderByComparator, true);

			array[1] = accessRequest;

			array[2] = getByAccessRequestByVisitor_PrevAndNext(session,
					accessRequest, visitorId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AccessRequest getByAccessRequestByVisitor_PrevAndNext(
		Session session, AccessRequest accessRequest, long visitorId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACCESSREQUEST_WHERE);

		query.append(_FINDER_COLUMN_ACCESSREQUESTBYVISITOR_VISITORID_2);

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

		qPos.add(visitorId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(accessRequest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AccessRequest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the access requests.
	 *
	 * @return the access requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequest> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of access requests
	 * @param end the upper bound of the range of access requests (not inclusive)
	 * @return the range of access requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequest> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the access requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of access requests
	 * @param end the upper bound of the range of access requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of access requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequest> findAll(int start, int end,
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

		List<AccessRequest> list = (List<AccessRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACCESSREQUEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACCESSREQUEST;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<AccessRequest>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<AccessRequest>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the access requests where facilityId = &#63; from the database.
	 *
	 * @param facilityId the facility ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAccessRequestByFacility(long facilityId)
		throws SystemException {
		for (AccessRequest accessRequest : findByAccessRequestByFacility(
				facilityId)) {
			remove(accessRequest);
		}
	}

	/**
	 * Removes all the access requests where customerId = &#63; from the database.
	 *
	 * @param customerId the customer ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAccessRequestByCustomer(long customerId)
		throws SystemException {
		for (AccessRequest accessRequest : findByAccessRequestByCustomer(
				customerId)) {
			remove(accessRequest);
		}
	}

	/**
	 * Removes all the access requests where visitorId = &#63; from the database.
	 *
	 * @param visitorId the visitor ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAccessRequestByVisitor(long visitorId)
		throws SystemException {
		for (AccessRequest accessRequest : findByAccessRequestByVisitor(
				visitorId)) {
			remove(accessRequest);
		}
	}

	/**
	 * Removes all the access requests from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (AccessRequest accessRequest : findAll()) {
			remove(accessRequest);
		}
	}

	/**
	 * Returns the number of access requests where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @return the number of matching access requests
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAccessRequestByFacility(long facilityId)
		throws SystemException {
		Object[] finderArgs = new Object[] { facilityId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTBYFACILITY,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACCESSREQUEST_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTBYFACILITY_FACILITYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(facilityId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTBYFACILITY,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of access requests where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @return the number of matching access requests
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAccessRequestByCustomer(long customerId)
		throws SystemException {
		Object[] finderArgs = new Object[] { customerId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTBYCUSTOMER,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACCESSREQUEST_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTBYCUSTOMER_CUSTOMERID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTBYCUSTOMER,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of access requests where visitorId = &#63;.
	 *
	 * @param visitorId the visitor ID
	 * @return the number of matching access requests
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAccessRequestByVisitor(long visitorId)
		throws SystemException {
		Object[] finderArgs = new Object[] { visitorId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTBYVISITOR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACCESSREQUEST_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTBYVISITOR_VISITORID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(visitorId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTBYVISITOR,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of access requests.
	 *
	 * @return the number of access requests
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ACCESSREQUEST);

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
	 * Initializes the access request persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.AccessRequest")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AccessRequest>> listenersList = new ArrayList<ModelListener<AccessRequest>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AccessRequest>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AccessRequestImpl.class.getName());
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
	private static final String _SQL_SELECT_ACCESSREQUEST = "SELECT accessRequest FROM AccessRequest accessRequest";
	private static final String _SQL_SELECT_ACCESSREQUEST_WHERE = "SELECT accessRequest FROM AccessRequest accessRequest WHERE ";
	private static final String _SQL_COUNT_ACCESSREQUEST = "SELECT COUNT(accessRequest) FROM AccessRequest accessRequest";
	private static final String _SQL_COUNT_ACCESSREQUEST_WHERE = "SELECT COUNT(accessRequest) FROM AccessRequest accessRequest WHERE ";
	private static final String _FINDER_COLUMN_ACCESSREQUESTBYFACILITY_FACILITYID_2 =
		"accessRequest.facilityId = ?";
	private static final String _FINDER_COLUMN_ACCESSREQUESTBYCUSTOMER_CUSTOMERID_2 =
		"accessRequest.customerId = ?";
	private static final String _FINDER_COLUMN_ACCESSREQUESTBYVISITOR_VISITORID_2 =
		"accessRequest.visitorId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "accessRequest.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AccessRequest exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AccessRequest exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AccessRequestPersistenceImpl.class);
	private static AccessRequest _nullAccessRequest = new AccessRequestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AccessRequest> toCacheModel() {
				return _nullAccessRequestCacheModel;
			}
		};

	private static CacheModel<AccessRequest> _nullAccessRequestCacheModel = new CacheModel<AccessRequest>() {
			public AccessRequest toEntityModel() {
				return _nullAccessRequest;
			}
		};
}