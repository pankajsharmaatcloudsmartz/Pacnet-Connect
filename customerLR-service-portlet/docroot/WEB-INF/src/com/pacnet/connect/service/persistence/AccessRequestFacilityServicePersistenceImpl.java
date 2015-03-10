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

import com.pacnet.connect.NoSuchAccessRequestFacilityServiceException;
import com.pacnet.connect.model.AccessRequestFacilityService;
import com.pacnet.connect.model.impl.AccessRequestFacilityServiceImpl;
import com.pacnet.connect.model.impl.AccessRequestFacilityServiceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the access request facility service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestFacilityServicePersistence
 * @see AccessRequestFacilityServiceUtil
 * @generated
 */
public class AccessRequestFacilityServicePersistenceImpl
	extends BasePersistenceImpl<AccessRequestFacilityService>
	implements AccessRequestFacilityServicePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AccessRequestFacilityServiceUtil} to access the access request facility service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AccessRequestFacilityServiceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST =
		new FinderPath(AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestFacilityServiceModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestFacilityServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAccessRequestFacilityServiceByAccessRequest",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST =
		new FinderPath(AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestFacilityServiceModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestFacilityServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAccessRequestFacilityServiceByAccessRequest",
			new String[] { Long.class.getName() },
			AccessRequestFacilityServiceModelImpl.ACCESSREQUESTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST =
		new FinderPath(AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestFacilityServiceModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAccessRequestFacilityServiceByAccessRequest",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE =
		new FinderPath(AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestFacilityServiceModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestFacilityServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAccessRequestFacilityServiceByFacilityService",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE =
		new FinderPath(AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestFacilityServiceModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestFacilityServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAccessRequestFacilityServiceByFacilityService",
			new String[] { Long.class.getName() },
			AccessRequestFacilityServiceModelImpl.FACILITYSERVICEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE =
		new FinderPath(AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestFacilityServiceModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAccessRequestFacilityServiceByFacilityService",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestFacilityServiceModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestFacilityServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestFacilityServiceModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestFacilityServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestFacilityServiceModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	/**
	 * Caches the access request facility service in the entity cache if it is enabled.
	 *
	 * @param accessRequestFacilityService the access request facility service
	 */
	public void cacheResult(
		AccessRequestFacilityService accessRequestFacilityService) {
		EntityCacheUtil.putResult(AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestFacilityServiceImpl.class,
			accessRequestFacilityService.getPrimaryKey(),
			accessRequestFacilityService);

		accessRequestFacilityService.resetOriginalValues();
	}

	/**
	 * Caches the access request facility services in the entity cache if it is enabled.
	 *
	 * @param accessRequestFacilityServices the access request facility services
	 */
	public void cacheResult(
		List<AccessRequestFacilityService> accessRequestFacilityServices) {
		for (AccessRequestFacilityService accessRequestFacilityService : accessRequestFacilityServices) {
			if (EntityCacheUtil.getResult(
						AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
						AccessRequestFacilityServiceImpl.class,
						accessRequestFacilityService.getPrimaryKey()) == null) {
				cacheResult(accessRequestFacilityService);
			}
			else {
				accessRequestFacilityService.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all access request facility services.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AccessRequestFacilityServiceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AccessRequestFacilityServiceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the access request facility service.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AccessRequestFacilityService accessRequestFacilityService) {
		EntityCacheUtil.removeResult(AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestFacilityServiceImpl.class,
			accessRequestFacilityService.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<AccessRequestFacilityService> accessRequestFacilityServices) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AccessRequestFacilityService accessRequestFacilityService : accessRequestFacilityServices) {
			EntityCacheUtil.removeResult(AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
				AccessRequestFacilityServiceImpl.class,
				accessRequestFacilityService.getPrimaryKey());
		}
	}

	/**
	 * Creates a new access request facility service with the primary key. Does not add the access request facility service to the database.
	 *
	 * @param id the primary key for the new access request facility service
	 * @return the new access request facility service
	 */
	public AccessRequestFacilityService create(long id) {
		AccessRequestFacilityService accessRequestFacilityService = new AccessRequestFacilityServiceImpl();

		accessRequestFacilityService.setNew(true);
		accessRequestFacilityService.setPrimaryKey(id);

		return accessRequestFacilityService;
	}

	/**
	 * Removes the access request facility service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the access request facility service
	 * @return the access request facility service that was removed
	 * @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a access request facility service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestFacilityService remove(long id)
		throws NoSuchAccessRequestFacilityServiceException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the access request facility service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the access request facility service
	 * @return the access request facility service that was removed
	 * @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a access request facility service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccessRequestFacilityService remove(Serializable primaryKey)
		throws NoSuchAccessRequestFacilityServiceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AccessRequestFacilityService accessRequestFacilityService = (AccessRequestFacilityService)session.get(AccessRequestFacilityServiceImpl.class,
					primaryKey);

			if (accessRequestFacilityService == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAccessRequestFacilityServiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(accessRequestFacilityService);
		}
		catch (NoSuchAccessRequestFacilityServiceException nsee) {
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
	protected AccessRequestFacilityService removeImpl(
		AccessRequestFacilityService accessRequestFacilityService)
		throws SystemException {
		accessRequestFacilityService = toUnwrappedModel(accessRequestFacilityService);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, accessRequestFacilityService);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(accessRequestFacilityService);

		return accessRequestFacilityService;
	}

	@Override
	public AccessRequestFacilityService updateImpl(
		com.pacnet.connect.model.AccessRequestFacilityService accessRequestFacilityService,
		boolean merge) throws SystemException {
		accessRequestFacilityService = toUnwrappedModel(accessRequestFacilityService);

		boolean isNew = accessRequestFacilityService.isNew();

		AccessRequestFacilityServiceModelImpl accessRequestFacilityServiceModelImpl =
			(AccessRequestFacilityServiceModelImpl)accessRequestFacilityService;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, accessRequestFacilityService, merge);

			accessRequestFacilityService.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!AccessRequestFacilityServiceModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((accessRequestFacilityServiceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(accessRequestFacilityServiceModelImpl.getOriginalAccessRequestId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST,
					args);

				args = new Object[] {
						Long.valueOf(accessRequestFacilityServiceModelImpl.getAccessRequestId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST,
					args);
			}

			if ((accessRequestFacilityServiceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(accessRequestFacilityServiceModelImpl.getOriginalFacilityServiceId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE,
					args);

				args = new Object[] {
						Long.valueOf(accessRequestFacilityServiceModelImpl.getFacilityServiceId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE,
					args);
			}
		}

		EntityCacheUtil.putResult(AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestFacilityServiceImpl.class,
			accessRequestFacilityService.getPrimaryKey(),
			accessRequestFacilityService);

		return accessRequestFacilityService;
	}

	protected AccessRequestFacilityService toUnwrappedModel(
		AccessRequestFacilityService accessRequestFacilityService) {
		if (accessRequestFacilityService instanceof AccessRequestFacilityServiceImpl) {
			return accessRequestFacilityService;
		}

		AccessRequestFacilityServiceImpl accessRequestFacilityServiceImpl = new AccessRequestFacilityServiceImpl();

		accessRequestFacilityServiceImpl.setNew(accessRequestFacilityService.isNew());
		accessRequestFacilityServiceImpl.setPrimaryKey(accessRequestFacilityService.getPrimaryKey());

		accessRequestFacilityServiceImpl.setId(accessRequestFacilityService.getId());
		accessRequestFacilityServiceImpl.setAccessRequestId(accessRequestFacilityService.getAccessRequestId());
		accessRequestFacilityServiceImpl.setFacilityServiceId(accessRequestFacilityService.getFacilityServiceId());
		accessRequestFacilityServiceImpl.setIsActive(accessRequestFacilityService.isIsActive());
		accessRequestFacilityServiceImpl.setCreatedOn(accessRequestFacilityService.getCreatedOn());
		accessRequestFacilityServiceImpl.setCreatedBy(accessRequestFacilityService.getCreatedBy());
		accessRequestFacilityServiceImpl.setUpdatedOn(accessRequestFacilityService.getUpdatedOn());
		accessRequestFacilityServiceImpl.setUpdatedBy(accessRequestFacilityService.getUpdatedBy());

		return accessRequestFacilityServiceImpl;
	}

	/**
	 * Returns the access request facility service with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the access request facility service
	 * @return the access request facility service
	 * @throws com.liferay.portal.NoSuchModelException if a access request facility service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccessRequestFacilityService findByPrimaryKey(
		Serializable primaryKey) throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the access request facility service with the primary key or throws a {@link com.pacnet.connect.NoSuchAccessRequestFacilityServiceException} if it could not be found.
	 *
	 * @param id the primary key of the access request facility service
	 * @return the access request facility service
	 * @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a access request facility service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestFacilityService findByPrimaryKey(long id)
		throws NoSuchAccessRequestFacilityServiceException, SystemException {
		AccessRequestFacilityService accessRequestFacilityService = fetchByPrimaryKey(id);

		if (accessRequestFacilityService == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchAccessRequestFacilityServiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return accessRequestFacilityService;
	}

	/**
	 * Returns the access request facility service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the access request facility service
	 * @return the access request facility service, or <code>null</code> if a access request facility service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccessRequestFacilityService fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the access request facility service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the access request facility service
	 * @return the access request facility service, or <code>null</code> if a access request facility service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestFacilityService fetchByPrimaryKey(long id)
		throws SystemException {
		AccessRequestFacilityService accessRequestFacilityService = (AccessRequestFacilityService)EntityCacheUtil.getResult(AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
				AccessRequestFacilityServiceImpl.class, id);

		if (accessRequestFacilityService == _nullAccessRequestFacilityService) {
			return null;
		}

		if (accessRequestFacilityService == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				accessRequestFacilityService = (AccessRequestFacilityService)session.get(AccessRequestFacilityServiceImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (accessRequestFacilityService != null) {
					cacheResult(accessRequestFacilityService);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(AccessRequestFacilityServiceModelImpl.ENTITY_CACHE_ENABLED,
						AccessRequestFacilityServiceImpl.class, id,
						_nullAccessRequestFacilityService);
				}

				closeSession(session);
			}
		}

		return accessRequestFacilityService;
	}

	/**
	 * Returns all the access request facility services where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @return the matching access request facility services
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestFacilityService> findByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId) throws SystemException {
		return findByAccessRequestFacilityServiceByAccessRequest(accessRequestId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access request facility services where accessRequestId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param accessRequestId the access request ID
	 * @param start the lower bound of the range of access request facility services
	 * @param end the upper bound of the range of access request facility services (not inclusive)
	 * @return the range of matching access request facility services
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestFacilityService> findByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId, int start, int end) throws SystemException {
		return findByAccessRequestFacilityServiceByAccessRequest(accessRequestId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the access request facility services where accessRequestId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param accessRequestId the access request ID
	 * @param start the lower bound of the range of access request facility services
	 * @param end the upper bound of the range of access request facility services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching access request facility services
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestFacilityService> findByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST;
			finderArgs = new Object[] { accessRequestId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST;
			finderArgs = new Object[] {
					accessRequestId,
					
					start, end, orderByComparator
				};
		}

		List<AccessRequestFacilityService> list = (List<AccessRequestFacilityService>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AccessRequestFacilityService accessRequestFacilityService : list) {
				if ((accessRequestId != accessRequestFacilityService.getAccessRequestId())) {
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

			query.append(_SQL_SELECT_ACCESSREQUESTFACILITYSERVICE_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST_ACCESSREQUESTID_2);

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

				list = (List<AccessRequestFacilityService>)QueryUtil.list(q,
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
	 * Returns the first access request facility service in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request facility service
	 * @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestFacilityService findByAccessRequestFacilityServiceByAccessRequest_First(
		long accessRequestId, OrderByComparator orderByComparator)
		throws NoSuchAccessRequestFacilityServiceException, SystemException {
		AccessRequestFacilityService accessRequestFacilityService = fetchByAccessRequestFacilityServiceByAccessRequest_First(accessRequestId,
				orderByComparator);

		if (accessRequestFacilityService != null) {
			return accessRequestFacilityService;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("accessRequestId=");
		msg.append(accessRequestId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestFacilityServiceException(msg.toString());
	}

	/**
	 * Returns the first access request facility service in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestFacilityService fetchByAccessRequestFacilityServiceByAccessRequest_First(
		long accessRequestId, OrderByComparator orderByComparator)
		throws SystemException {
		List<AccessRequestFacilityService> list = findByAccessRequestFacilityServiceByAccessRequest(accessRequestId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last access request facility service in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request facility service
	 * @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestFacilityService findByAccessRequestFacilityServiceByAccessRequest_Last(
		long accessRequestId, OrderByComparator orderByComparator)
		throws NoSuchAccessRequestFacilityServiceException, SystemException {
		AccessRequestFacilityService accessRequestFacilityService = fetchByAccessRequestFacilityServiceByAccessRequest_Last(accessRequestId,
				orderByComparator);

		if (accessRequestFacilityService != null) {
			return accessRequestFacilityService;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("accessRequestId=");
		msg.append(accessRequestId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestFacilityServiceException(msg.toString());
	}

	/**
	 * Returns the last access request facility service in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestFacilityService fetchByAccessRequestFacilityServiceByAccessRequest_Last(
		long accessRequestId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByAccessRequestFacilityServiceByAccessRequest(accessRequestId);

		List<AccessRequestFacilityService> list = findByAccessRequestFacilityServiceByAccessRequest(accessRequestId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the access request facility services before and after the current access request facility service in the ordered set where accessRequestId = &#63;.
	 *
	 * @param id the primary key of the current access request facility service
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next access request facility service
	 * @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a access request facility service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestFacilityService[] findByAccessRequestFacilityServiceByAccessRequest_PrevAndNext(
		long id, long accessRequestId, OrderByComparator orderByComparator)
		throws NoSuchAccessRequestFacilityServiceException, SystemException {
		AccessRequestFacilityService accessRequestFacilityService = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AccessRequestFacilityService[] array = new AccessRequestFacilityServiceImpl[3];

			array[0] = getByAccessRequestFacilityServiceByAccessRequest_PrevAndNext(session,
					accessRequestFacilityService, accessRequestId,
					orderByComparator, true);

			array[1] = accessRequestFacilityService;

			array[2] = getByAccessRequestFacilityServiceByAccessRequest_PrevAndNext(session,
					accessRequestFacilityService, accessRequestId,
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

	protected AccessRequestFacilityService getByAccessRequestFacilityServiceByAccessRequest_PrevAndNext(
		Session session,
		AccessRequestFacilityService accessRequestFacilityService,
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

		query.append(_SQL_SELECT_ACCESSREQUESTFACILITYSERVICE_WHERE);

		query.append(_FINDER_COLUMN_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST_ACCESSREQUESTID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(accessRequestFacilityService);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AccessRequestFacilityService> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the access request facility services where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @return the matching access request facility services
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestFacilityService> findByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId) throws SystemException {
		return findByAccessRequestFacilityServiceByFacilityService(facilityServiceId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access request facility services where facilityServiceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityServiceId the facility service ID
	 * @param start the lower bound of the range of access request facility services
	 * @param end the upper bound of the range of access request facility services (not inclusive)
	 * @return the range of matching access request facility services
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestFacilityService> findByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId, int start, int end) throws SystemException {
		return findByAccessRequestFacilityServiceByFacilityService(facilityServiceId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the access request facility services where facilityServiceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityServiceId the facility service ID
	 * @param start the lower bound of the range of access request facility services
	 * @param end the upper bound of the range of access request facility services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching access request facility services
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestFacilityService> findByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE;
			finderArgs = new Object[] { facilityServiceId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE;
			finderArgs = new Object[] {
					facilityServiceId,
					
					start, end, orderByComparator
				};
		}

		List<AccessRequestFacilityService> list = (List<AccessRequestFacilityService>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AccessRequestFacilityService accessRequestFacilityService : list) {
				if ((facilityServiceId != accessRequestFacilityService.getFacilityServiceId())) {
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

			query.append(_SQL_SELECT_ACCESSREQUESTFACILITYSERVICE_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE_FACILITYSERVICEID_2);

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

				qPos.add(facilityServiceId);

				list = (List<AccessRequestFacilityService>)QueryUtil.list(q,
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
	 * Returns the first access request facility service in the ordered set where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request facility service
	 * @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestFacilityService findByAccessRequestFacilityServiceByFacilityService_First(
		long facilityServiceId, OrderByComparator orderByComparator)
		throws NoSuchAccessRequestFacilityServiceException, SystemException {
		AccessRequestFacilityService accessRequestFacilityService = fetchByAccessRequestFacilityServiceByFacilityService_First(facilityServiceId,
				orderByComparator);

		if (accessRequestFacilityService != null) {
			return accessRequestFacilityService;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityServiceId=");
		msg.append(facilityServiceId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestFacilityServiceException(msg.toString());
	}

	/**
	 * Returns the first access request facility service in the ordered set where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestFacilityService fetchByAccessRequestFacilityServiceByFacilityService_First(
		long facilityServiceId, OrderByComparator orderByComparator)
		throws SystemException {
		List<AccessRequestFacilityService> list = findByAccessRequestFacilityServiceByFacilityService(facilityServiceId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last access request facility service in the ordered set where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request facility service
	 * @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestFacilityService findByAccessRequestFacilityServiceByFacilityService_Last(
		long facilityServiceId, OrderByComparator orderByComparator)
		throws NoSuchAccessRequestFacilityServiceException, SystemException {
		AccessRequestFacilityService accessRequestFacilityService = fetchByAccessRequestFacilityServiceByFacilityService_Last(facilityServiceId,
				orderByComparator);

		if (accessRequestFacilityService != null) {
			return accessRequestFacilityService;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityServiceId=");
		msg.append(facilityServiceId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAccessRequestFacilityServiceException(msg.toString());
	}

	/**
	 * Returns the last access request facility service in the ordered set where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestFacilityService fetchByAccessRequestFacilityServiceByFacilityService_Last(
		long facilityServiceId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByAccessRequestFacilityServiceByFacilityService(facilityServiceId);

		List<AccessRequestFacilityService> list = findByAccessRequestFacilityServiceByFacilityService(facilityServiceId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the access request facility services before and after the current access request facility service in the ordered set where facilityServiceId = &#63;.
	 *
	 * @param id the primary key of the current access request facility service
	 * @param facilityServiceId the facility service ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next access request facility service
	 * @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a access request facility service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestFacilityService[] findByAccessRequestFacilityServiceByFacilityService_PrevAndNext(
		long id, long facilityServiceId, OrderByComparator orderByComparator)
		throws NoSuchAccessRequestFacilityServiceException, SystemException {
		AccessRequestFacilityService accessRequestFacilityService = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AccessRequestFacilityService[] array = new AccessRequestFacilityServiceImpl[3];

			array[0] = getByAccessRequestFacilityServiceByFacilityService_PrevAndNext(session,
					accessRequestFacilityService, facilityServiceId,
					orderByComparator, true);

			array[1] = accessRequestFacilityService;

			array[2] = getByAccessRequestFacilityServiceByFacilityService_PrevAndNext(session,
					accessRequestFacilityService, facilityServiceId,
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

	protected AccessRequestFacilityService getByAccessRequestFacilityServiceByFacilityService_PrevAndNext(
		Session session,
		AccessRequestFacilityService accessRequestFacilityService,
		long facilityServiceId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACCESSREQUESTFACILITYSERVICE_WHERE);

		query.append(_FINDER_COLUMN_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE_FACILITYSERVICEID_2);

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

		qPos.add(facilityServiceId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(accessRequestFacilityService);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AccessRequestFacilityService> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the access request facility services.
	 *
	 * @return the access request facility services
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestFacilityService> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access request facility services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of access request facility services
	 * @param end the upper bound of the range of access request facility services (not inclusive)
	 * @return the range of access request facility services
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestFacilityService> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the access request facility services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of access request facility services
	 * @param end the upper bound of the range of access request facility services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of access request facility services
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestFacilityService> findAll(int start, int end,
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

		List<AccessRequestFacilityService> list = (List<AccessRequestFacilityService>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACCESSREQUESTFACILITYSERVICE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACCESSREQUESTFACILITYSERVICE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<AccessRequestFacilityService>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<AccessRequestFacilityService>)QueryUtil.list(q,
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
	 * Removes all the access request facility services where accessRequestId = &#63; from the database.
	 *
	 * @param accessRequestId the access request ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId) throws SystemException {
		for (AccessRequestFacilityService accessRequestFacilityService : findByAccessRequestFacilityServiceByAccessRequest(
				accessRequestId)) {
			remove(accessRequestFacilityService);
		}
	}

	/**
	 * Removes all the access request facility services where facilityServiceId = &#63; from the database.
	 *
	 * @param facilityServiceId the facility service ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId) throws SystemException {
		for (AccessRequestFacilityService accessRequestFacilityService : findByAccessRequestFacilityServiceByFacilityService(
				facilityServiceId)) {
			remove(accessRequestFacilityService);
		}
	}

	/**
	 * Removes all the access request facility services from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (AccessRequestFacilityService accessRequestFacilityService : findAll()) {
			remove(accessRequestFacilityService);
		}
	}

	/**
	 * Returns the number of access request facility services where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @return the number of matching access request facility services
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId) throws SystemException {
		Object[] finderArgs = new Object[] { accessRequestId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACCESSREQUESTFACILITYSERVICE_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST_ACCESSREQUESTID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of access request facility services where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @return the number of matching access request facility services
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId) throws SystemException {
		Object[] finderArgs = new Object[] { facilityServiceId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACCESSREQUESTFACILITYSERVICE_WHERE);

			query.append(_FINDER_COLUMN_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE_FACILITYSERVICEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(facilityServiceId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of access request facility services.
	 *
	 * @return the number of access request facility services
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ACCESSREQUESTFACILITYSERVICE);

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
	 * Initializes the access request facility service persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.AccessRequestFacilityService")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AccessRequestFacilityService>> listenersList = new ArrayList<ModelListener<AccessRequestFacilityService>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AccessRequestFacilityService>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AccessRequestFacilityServiceImpl.class.getName());
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
	private static final String _SQL_SELECT_ACCESSREQUESTFACILITYSERVICE = "SELECT accessRequestFacilityService FROM AccessRequestFacilityService accessRequestFacilityService";
	private static final String _SQL_SELECT_ACCESSREQUESTFACILITYSERVICE_WHERE = "SELECT accessRequestFacilityService FROM AccessRequestFacilityService accessRequestFacilityService WHERE ";
	private static final String _SQL_COUNT_ACCESSREQUESTFACILITYSERVICE = "SELECT COUNT(accessRequestFacilityService) FROM AccessRequestFacilityService accessRequestFacilityService";
	private static final String _SQL_COUNT_ACCESSREQUESTFACILITYSERVICE_WHERE = "SELECT COUNT(accessRequestFacilityService) FROM AccessRequestFacilityService accessRequestFacilityService WHERE ";
	private static final String _FINDER_COLUMN_ACCESSREQUESTFACILITYSERVICEBYACCESSREQUEST_ACCESSREQUESTID_2 =
		"accessRequestFacilityService.accessRequestId = ?";
	private static final String _FINDER_COLUMN_ACCESSREQUESTFACILITYSERVICEBYFACILITYSERVICE_FACILITYSERVICEID_2 =
		"accessRequestFacilityService.facilityServiceId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "accessRequestFacilityService.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AccessRequestFacilityService exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AccessRequestFacilityService exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AccessRequestFacilityServicePersistenceImpl.class);
	private static AccessRequestFacilityService _nullAccessRequestFacilityService =
		new AccessRequestFacilityServiceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AccessRequestFacilityService> toCacheModel() {
				return _nullAccessRequestFacilityServiceCacheModel;
			}
		};

	private static CacheModel<AccessRequestFacilityService> _nullAccessRequestFacilityServiceCacheModel =
		new CacheModel<AccessRequestFacilityService>() {
			public AccessRequestFacilityService toEntityModel() {
				return _nullAccessRequestFacilityService;
			}
		};
}