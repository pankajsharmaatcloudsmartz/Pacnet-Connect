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

import com.pacnet.connect.NoSuchFacilityUserServiceException;
import com.pacnet.connect.model.FacilityUserService;
import com.pacnet.connect.model.impl.FacilityUserServiceImpl;
import com.pacnet.connect.model.impl.FacilityUserServiceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the facility user service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityUserServicePersistence
 * @see FacilityUserServiceUtil
 * @generated
 */
public class FacilityUserServicePersistenceImpl extends BasePersistenceImpl<FacilityUserService>
	implements FacilityUserServicePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FacilityUserServiceUtil} to access the facility user service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FacilityUserServiceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYUSERSERVICEBYFACILITYUSERMAPPING =
		new FinderPath(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserServiceModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityUserServiceByFacilityUserMapping",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERSERVICEBYFACILITYUSERMAPPING =
		new FinderPath(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserServiceModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityUserServiceByFacilityUserMapping",
			new String[] { Long.class.getName() },
			FacilityUserServiceModelImpl.FACILITYUSERMAPPINGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYUSERSERVICEBYFACILITYUSERMAPPING =
		new FinderPath(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityUserServiceByFacilityUserMapping",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYFACILITYSERVICE =
		new FinderPath(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserServiceModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityUserMappingByFacilityService",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYFACILITYSERVICE =
		new FinderPath(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserServiceModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityUserMappingByFacilityService",
			new String[] { Long.class.getName() },
			FacilityUserServiceModelImpl.FACILITYSERVICEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYUSERMAPPINGBYFACILITYSERVICE =
		new FinderPath(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityUserMappingByFacilityService",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FUSBYSERVICEUSERMAPPING =
		new FinderPath(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserServiceModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFusByServiceUserMapping",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FUSBYSERVICEUSERMAPPING =
		new FinderPath(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserServiceModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFusByServiceUserMapping",
			new String[] { Long.class.getName(), Long.class.getName() },
			FacilityUserServiceModelImpl.FACILITYSERVICEID_COLUMN_BITMASK |
			FacilityUserServiceModelImpl.FACILITYUSERMAPPINGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FUSBYSERVICEUSERMAPPING = new FinderPath(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFusByServiceUserMapping",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserServiceModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserServiceModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the facility user service in the entity cache if it is enabled.
	 *
	 * @param facilityUserService the facility user service
	 */
	public void cacheResult(FacilityUserService facilityUserService) {
		EntityCacheUtil.putResult(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserServiceImpl.class, facilityUserService.getPrimaryKey(),
			facilityUserService);

		facilityUserService.resetOriginalValues();
	}

	/**
	 * Caches the facility user services in the entity cache if it is enabled.
	 *
	 * @param facilityUserServices the facility user services
	 */
	public void cacheResult(List<FacilityUserService> facilityUserServices) {
		for (FacilityUserService facilityUserService : facilityUserServices) {
			if (EntityCacheUtil.getResult(
						FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
						FacilityUserServiceImpl.class,
						facilityUserService.getPrimaryKey()) == null) {
				cacheResult(facilityUserService);
			}
			else {
				facilityUserService.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all facility user services.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FacilityUserServiceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FacilityUserServiceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the facility user service.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FacilityUserService facilityUserService) {
		EntityCacheUtil.removeResult(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserServiceImpl.class, facilityUserService.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FacilityUserService> facilityUserServices) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FacilityUserService facilityUserService : facilityUserServices) {
			EntityCacheUtil.removeResult(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
				FacilityUserServiceImpl.class,
				facilityUserService.getPrimaryKey());
		}
	}

	/**
	 * Creates a new facility user service with the primary key. Does not add the facility user service to the database.
	 *
	 * @param id the primary key for the new facility user service
	 * @return the new facility user service
	 */
	public FacilityUserService create(long id) {
		FacilityUserService facilityUserService = new FacilityUserServiceImpl();

		facilityUserService.setNew(true);
		facilityUserService.setPrimaryKey(id);

		return facilityUserService;
	}

	/**
	 * Removes the facility user service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the facility user service
	 * @return the facility user service that was removed
	 * @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a facility user service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService remove(long id)
		throws NoSuchFacilityUserServiceException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the facility user service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the facility user service
	 * @return the facility user service that was removed
	 * @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a facility user service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityUserService remove(Serializable primaryKey)
		throws NoSuchFacilityUserServiceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FacilityUserService facilityUserService = (FacilityUserService)session.get(FacilityUserServiceImpl.class,
					primaryKey);

			if (facilityUserService == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFacilityUserServiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(facilityUserService);
		}
		catch (NoSuchFacilityUserServiceException nsee) {
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
	protected FacilityUserService removeImpl(
		FacilityUserService facilityUserService) throws SystemException {
		facilityUserService = toUnwrappedModel(facilityUserService);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, facilityUserService);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(facilityUserService);

		return facilityUserService;
	}

	@Override
	public FacilityUserService updateImpl(
		com.pacnet.connect.model.FacilityUserService facilityUserService,
		boolean merge) throws SystemException {
		facilityUserService = toUnwrappedModel(facilityUserService);

		boolean isNew = facilityUserService.isNew();

		FacilityUserServiceModelImpl facilityUserServiceModelImpl = (FacilityUserServiceModelImpl)facilityUserService;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, facilityUserService, merge);

			facilityUserService.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FacilityUserServiceModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((facilityUserServiceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERSERVICEBYFACILITYUSERMAPPING.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityUserServiceModelImpl.getOriginalFacilityUserMappingId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYUSERSERVICEBYFACILITYUSERMAPPING,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERSERVICEBYFACILITYUSERMAPPING,
					args);

				args = new Object[] {
						Long.valueOf(facilityUserServiceModelImpl.getFacilityUserMappingId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYUSERSERVICEBYFACILITYUSERMAPPING,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERSERVICEBYFACILITYUSERMAPPING,
					args);
			}

			if ((facilityUserServiceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYFACILITYSERVICE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityUserServiceModelImpl.getOriginalFacilityServiceId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYUSERMAPPINGBYFACILITYSERVICE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYFACILITYSERVICE,
					args);

				args = new Object[] {
						Long.valueOf(facilityUserServiceModelImpl.getFacilityServiceId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYUSERMAPPINGBYFACILITYSERVICE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYFACILITYSERVICE,
					args);
			}

			if ((facilityUserServiceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FUSBYSERVICEUSERMAPPING.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityUserServiceModelImpl.getOriginalFacilityServiceId()),
						Long.valueOf(facilityUserServiceModelImpl.getOriginalFacilityUserMappingId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FUSBYSERVICEUSERMAPPING,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FUSBYSERVICEUSERMAPPING,
					args);

				args = new Object[] {
						Long.valueOf(facilityUserServiceModelImpl.getFacilityServiceId()),
						Long.valueOf(facilityUserServiceModelImpl.getFacilityUserMappingId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FUSBYSERVICEUSERMAPPING,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FUSBYSERVICEUSERMAPPING,
					args);
			}
		}

		EntityCacheUtil.putResult(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserServiceImpl.class, facilityUserService.getPrimaryKey(),
			facilityUserService);

		return facilityUserService;
	}

	protected FacilityUserService toUnwrappedModel(
		FacilityUserService facilityUserService) {
		if (facilityUserService instanceof FacilityUserServiceImpl) {
			return facilityUserService;
		}

		FacilityUserServiceImpl facilityUserServiceImpl = new FacilityUserServiceImpl();

		facilityUserServiceImpl.setNew(facilityUserService.isNew());
		facilityUserServiceImpl.setPrimaryKey(facilityUserService.getPrimaryKey());

		facilityUserServiceImpl.setId(facilityUserService.getId());
		facilityUserServiceImpl.setFacilityUserMappingId(facilityUserService.getFacilityUserMappingId());
		facilityUserServiceImpl.setFacilityServiceId(facilityUserService.getFacilityServiceId());
		facilityUserServiceImpl.setIsActive(facilityUserService.isIsActive());
		facilityUserServiceImpl.setCreatedOn(facilityUserService.getCreatedOn());
		facilityUserServiceImpl.setCreatedBy(facilityUserService.getCreatedBy());
		facilityUserServiceImpl.setUpdatedOn(facilityUserService.getUpdatedOn());
		facilityUserServiceImpl.setUpdatedBy(facilityUserService.getUpdatedBy());

		return facilityUserServiceImpl;
	}

	/**
	 * Returns the facility user service with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility user service
	 * @return the facility user service
	 * @throws com.liferay.portal.NoSuchModelException if a facility user service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityUserService findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility user service with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityUserServiceException} if it could not be found.
	 *
	 * @param id the primary key of the facility user service
	 * @return the facility user service
	 * @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a facility user service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService findByPrimaryKey(long id)
		throws NoSuchFacilityUserServiceException, SystemException {
		FacilityUserService facilityUserService = fetchByPrimaryKey(id);

		if (facilityUserService == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchFacilityUserServiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return facilityUserService;
	}

	/**
	 * Returns the facility user service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility user service
	 * @return the facility user service, or <code>null</code> if a facility user service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityUserService fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility user service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the facility user service
	 * @return the facility user service, or <code>null</code> if a facility user service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService fetchByPrimaryKey(long id)
		throws SystemException {
		FacilityUserService facilityUserService = (FacilityUserService)EntityCacheUtil.getResult(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
				FacilityUserServiceImpl.class, id);

		if (facilityUserService == _nullFacilityUserService) {
			return null;
		}

		if (facilityUserService == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				facilityUserService = (FacilityUserService)session.get(FacilityUserServiceImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (facilityUserService != null) {
					cacheResult(facilityUserService);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(FacilityUserServiceModelImpl.ENTITY_CACHE_ENABLED,
						FacilityUserServiceImpl.class, id,
						_nullFacilityUserService);
				}

				closeSession(session);
			}
		}

		return facilityUserService;
	}

	/**
	 * Returns all the facility user services where facilityUserMappingId = &#63;.
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @return the matching facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId) throws SystemException {
		return findByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility user services where facilityUserMappingId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param start the lower bound of the range of facility user services
	 * @param end the upper bound of the range of facility user services (not inclusive)
	 * @return the range of matching facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId, int start, int end)
		throws SystemException {
		return findByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility user services where facilityUserMappingId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param start the lower bound of the range of facility user services
	 * @param end the upper bound of the range of facility user services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERSERVICEBYFACILITYUSERMAPPING;
			finderArgs = new Object[] { facilityUserMappingId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYUSERSERVICEBYFACILITYUSERMAPPING;
			finderArgs = new Object[] {
					facilityUserMappingId,
					
					start, end, orderByComparator
				};
		}

		List<FacilityUserService> list = (List<FacilityUserService>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityUserService facilityUserService : list) {
				if ((facilityUserMappingId != facilityUserService.getFacilityUserMappingId())) {
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

			query.append(_SQL_SELECT_FACILITYUSERSERVICE_WHERE);

			query.append(_FINDER_COLUMN_FACILITYUSERSERVICEBYFACILITYUSERMAPPING_FACILITYUSERMAPPINGID_2);

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

				list = (List<FacilityUserService>)QueryUtil.list(q,
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
	 * Returns the first facility user service in the ordered set where facilityUserMappingId = &#63;.
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user service
	 * @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService findByFacilityUserServiceByFacilityUserMapping_First(
		long facilityUserMappingId, OrderByComparator orderByComparator)
		throws NoSuchFacilityUserServiceException, SystemException {
		FacilityUserService facilityUserService = fetchByFacilityUserServiceByFacilityUserMapping_First(facilityUserMappingId,
				orderByComparator);

		if (facilityUserService != null) {
			return facilityUserService;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityUserMappingId=");
		msg.append(facilityUserMappingId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserServiceException(msg.toString());
	}

	/**
	 * Returns the first facility user service in the ordered set where facilityUserMappingId = &#63;.
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user service, or <code>null</code> if a matching facility user service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService fetchByFacilityUserServiceByFacilityUserMapping_First(
		long facilityUserMappingId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FacilityUserService> list = findByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility user service in the ordered set where facilityUserMappingId = &#63;.
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user service
	 * @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService findByFacilityUserServiceByFacilityUserMapping_Last(
		long facilityUserMappingId, OrderByComparator orderByComparator)
		throws NoSuchFacilityUserServiceException, SystemException {
		FacilityUserService facilityUserService = fetchByFacilityUserServiceByFacilityUserMapping_Last(facilityUserMappingId,
				orderByComparator);

		if (facilityUserService != null) {
			return facilityUserService;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityUserMappingId=");
		msg.append(facilityUserMappingId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserServiceException(msg.toString());
	}

	/**
	 * Returns the last facility user service in the ordered set where facilityUserMappingId = &#63;.
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user service, or <code>null</code> if a matching facility user service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService fetchByFacilityUserServiceByFacilityUserMapping_Last(
		long facilityUserMappingId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId);

		List<FacilityUserService> list = findByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility user services before and after the current facility user service in the ordered set where facilityUserMappingId = &#63;.
	 *
	 * @param id the primary key of the current facility user service
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility user service
	 * @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a facility user service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService[] findByFacilityUserServiceByFacilityUserMapping_PrevAndNext(
		long id, long facilityUserMappingId, OrderByComparator orderByComparator)
		throws NoSuchFacilityUserServiceException, SystemException {
		FacilityUserService facilityUserService = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityUserService[] array = new FacilityUserServiceImpl[3];

			array[0] = getByFacilityUserServiceByFacilityUserMapping_PrevAndNext(session,
					facilityUserService, facilityUserMappingId,
					orderByComparator, true);

			array[1] = facilityUserService;

			array[2] = getByFacilityUserServiceByFacilityUserMapping_PrevAndNext(session,
					facilityUserService, facilityUserMappingId,
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

	protected FacilityUserService getByFacilityUserServiceByFacilityUserMapping_PrevAndNext(
		Session session, FacilityUserService facilityUserService,
		long facilityUserMappingId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYUSERSERVICE_WHERE);

		query.append(_FINDER_COLUMN_FACILITYUSERSERVICEBYFACILITYUSERMAPPING_FACILITYUSERMAPPINGID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(facilityUserService);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityUserService> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility user services where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @return the matching facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserService> findByFacilityUserMappingByFacilityService(
		long facilityServiceId) throws SystemException {
		return findByFacilityUserMappingByFacilityService(facilityServiceId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility user services where facilityServiceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityServiceId the facility service ID
	 * @param start the lower bound of the range of facility user services
	 * @param end the upper bound of the range of facility user services (not inclusive)
	 * @return the range of matching facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserService> findByFacilityUserMappingByFacilityService(
		long facilityServiceId, int start, int end) throws SystemException {
		return findByFacilityUserMappingByFacilityService(facilityServiceId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility user services where facilityServiceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityServiceId the facility service ID
	 * @param start the lower bound of the range of facility user services
	 * @param end the upper bound of the range of facility user services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserService> findByFacilityUserMappingByFacilityService(
		long facilityServiceId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYFACILITYSERVICE;
			finderArgs = new Object[] { facilityServiceId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYFACILITYSERVICE;
			finderArgs = new Object[] {
					facilityServiceId,
					
					start, end, orderByComparator
				};
		}

		List<FacilityUserService> list = (List<FacilityUserService>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityUserService facilityUserService : list) {
				if ((facilityServiceId != facilityUserService.getFacilityServiceId())) {
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

			query.append(_SQL_SELECT_FACILITYUSERSERVICE_WHERE);

			query.append(_FINDER_COLUMN_FACILITYUSERMAPPINGBYFACILITYSERVICE_FACILITYSERVICEID_2);

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

				list = (List<FacilityUserService>)QueryUtil.list(q,
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
	 * Returns the first facility user service in the ordered set where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user service
	 * @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService findByFacilityUserMappingByFacilityService_First(
		long facilityServiceId, OrderByComparator orderByComparator)
		throws NoSuchFacilityUserServiceException, SystemException {
		FacilityUserService facilityUserService = fetchByFacilityUserMappingByFacilityService_First(facilityServiceId,
				orderByComparator);

		if (facilityUserService != null) {
			return facilityUserService;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityServiceId=");
		msg.append(facilityServiceId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserServiceException(msg.toString());
	}

	/**
	 * Returns the first facility user service in the ordered set where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user service, or <code>null</code> if a matching facility user service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService fetchByFacilityUserMappingByFacilityService_First(
		long facilityServiceId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FacilityUserService> list = findByFacilityUserMappingByFacilityService(facilityServiceId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility user service in the ordered set where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user service
	 * @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService findByFacilityUserMappingByFacilityService_Last(
		long facilityServiceId, OrderByComparator orderByComparator)
		throws NoSuchFacilityUserServiceException, SystemException {
		FacilityUserService facilityUserService = fetchByFacilityUserMappingByFacilityService_Last(facilityServiceId,
				orderByComparator);

		if (facilityUserService != null) {
			return facilityUserService;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityServiceId=");
		msg.append(facilityServiceId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserServiceException(msg.toString());
	}

	/**
	 * Returns the last facility user service in the ordered set where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user service, or <code>null</code> if a matching facility user service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService fetchByFacilityUserMappingByFacilityService_Last(
		long facilityServiceId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByFacilityUserMappingByFacilityService(facilityServiceId);

		List<FacilityUserService> list = findByFacilityUserMappingByFacilityService(facilityServiceId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility user services before and after the current facility user service in the ordered set where facilityServiceId = &#63;.
	 *
	 * @param id the primary key of the current facility user service
	 * @param facilityServiceId the facility service ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility user service
	 * @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a facility user service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService[] findByFacilityUserMappingByFacilityService_PrevAndNext(
		long id, long facilityServiceId, OrderByComparator orderByComparator)
		throws NoSuchFacilityUserServiceException, SystemException {
		FacilityUserService facilityUserService = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityUserService[] array = new FacilityUserServiceImpl[3];

			array[0] = getByFacilityUserMappingByFacilityService_PrevAndNext(session,
					facilityUserService, facilityServiceId, orderByComparator,
					true);

			array[1] = facilityUserService;

			array[2] = getByFacilityUserMappingByFacilityService_PrevAndNext(session,
					facilityUserService, facilityServiceId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FacilityUserService getByFacilityUserMappingByFacilityService_PrevAndNext(
		Session session, FacilityUserService facilityUserService,
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

		query.append(_SQL_SELECT_FACILITYUSERSERVICE_WHERE);

		query.append(_FINDER_COLUMN_FACILITYUSERMAPPINGBYFACILITYSERVICE_FACILITYSERVICEID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(facilityUserService);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityUserService> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param facilityUserMappingId the facility user mapping ID
	 * @return the matching facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserService> findByFusByServiceUserMapping(
		long facilityServiceId, long facilityUserMappingId)
		throws SystemException {
		return findByFusByServiceUserMapping(facilityServiceId,
			facilityUserMappingId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityServiceId the facility service ID
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param start the lower bound of the range of facility user services
	 * @param end the upper bound of the range of facility user services (not inclusive)
	 * @return the range of matching facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserService> findByFusByServiceUserMapping(
		long facilityServiceId, long facilityUserMappingId, int start, int end)
		throws SystemException {
		return findByFusByServiceUserMapping(facilityServiceId,
			facilityUserMappingId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityServiceId the facility service ID
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param start the lower bound of the range of facility user services
	 * @param end the upper bound of the range of facility user services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserService> findByFusByServiceUserMapping(
		long facilityServiceId, long facilityUserMappingId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FUSBYSERVICEUSERMAPPING;
			finderArgs = new Object[] { facilityServiceId, facilityUserMappingId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FUSBYSERVICEUSERMAPPING;
			finderArgs = new Object[] {
					facilityServiceId, facilityUserMappingId,
					
					start, end, orderByComparator
				};
		}

		List<FacilityUserService> list = (List<FacilityUserService>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityUserService facilityUserService : list) {
				if ((facilityServiceId != facilityUserService.getFacilityServiceId()) ||
						(facilityUserMappingId != facilityUserService.getFacilityUserMappingId())) {
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

			query.append(_SQL_SELECT_FACILITYUSERSERVICE_WHERE);

			query.append(_FINDER_COLUMN_FUSBYSERVICEUSERMAPPING_FACILITYSERVICEID_2);

			query.append(_FINDER_COLUMN_FUSBYSERVICEUSERMAPPING_FACILITYUSERMAPPINGID_2);

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

				qPos.add(facilityUserMappingId);

				list = (List<FacilityUserService>)QueryUtil.list(q,
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
	 * Returns the first facility user service in the ordered set where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user service
	 * @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService findByFusByServiceUserMapping_First(
		long facilityServiceId, long facilityUserMappingId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityUserServiceException, SystemException {
		FacilityUserService facilityUserService = fetchByFusByServiceUserMapping_First(facilityServiceId,
				facilityUserMappingId, orderByComparator);

		if (facilityUserService != null) {
			return facilityUserService;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityServiceId=");
		msg.append(facilityServiceId);

		msg.append(", facilityUserMappingId=");
		msg.append(facilityUserMappingId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserServiceException(msg.toString());
	}

	/**
	 * Returns the first facility user service in the ordered set where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user service, or <code>null</code> if a matching facility user service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService fetchByFusByServiceUserMapping_First(
		long facilityServiceId, long facilityUserMappingId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FacilityUserService> list = findByFusByServiceUserMapping(facilityServiceId,
				facilityUserMappingId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility user service in the ordered set where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user service
	 * @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService findByFusByServiceUserMapping_Last(
		long facilityServiceId, long facilityUserMappingId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityUserServiceException, SystemException {
		FacilityUserService facilityUserService = fetchByFusByServiceUserMapping_Last(facilityServiceId,
				facilityUserMappingId, orderByComparator);

		if (facilityUserService != null) {
			return facilityUserService;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityServiceId=");
		msg.append(facilityServiceId);

		msg.append(", facilityUserMappingId=");
		msg.append(facilityUserMappingId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserServiceException(msg.toString());
	}

	/**
	 * Returns the last facility user service in the ordered set where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user service, or <code>null</code> if a matching facility user service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService fetchByFusByServiceUserMapping_Last(
		long facilityServiceId, long facilityUserMappingId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFusByServiceUserMapping(facilityServiceId,
				facilityUserMappingId);

		List<FacilityUserService> list = findByFusByServiceUserMapping(facilityServiceId,
				facilityUserMappingId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility user services before and after the current facility user service in the ordered set where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	 *
	 * @param id the primary key of the current facility user service
	 * @param facilityServiceId the facility service ID
	 * @param facilityUserMappingId the facility user mapping ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility user service
	 * @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a facility user service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserService[] findByFusByServiceUserMapping_PrevAndNext(
		long id, long facilityServiceId, long facilityUserMappingId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityUserServiceException, SystemException {
		FacilityUserService facilityUserService = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityUserService[] array = new FacilityUserServiceImpl[3];

			array[0] = getByFusByServiceUserMapping_PrevAndNext(session,
					facilityUserService, facilityServiceId,
					facilityUserMappingId, orderByComparator, true);

			array[1] = facilityUserService;

			array[2] = getByFusByServiceUserMapping_PrevAndNext(session,
					facilityUserService, facilityServiceId,
					facilityUserMappingId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FacilityUserService getByFusByServiceUserMapping_PrevAndNext(
		Session session, FacilityUserService facilityUserService,
		long facilityServiceId, long facilityUserMappingId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYUSERSERVICE_WHERE);

		query.append(_FINDER_COLUMN_FUSBYSERVICEUSERMAPPING_FACILITYSERVICEID_2);

		query.append(_FINDER_COLUMN_FUSBYSERVICEUSERMAPPING_FACILITYUSERMAPPINGID_2);

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

		qPos.add(facilityUserMappingId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(facilityUserService);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityUserService> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility user services.
	 *
	 * @return the facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserService> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility user services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facility user services
	 * @param end the upper bound of the range of facility user services (not inclusive)
	 * @return the range of facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserService> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility user services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facility user services
	 * @param end the upper bound of the range of facility user services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserService> findAll(int start, int end,
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

		List<FacilityUserService> list = (List<FacilityUserService>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FACILITYUSERSERVICE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FACILITYUSERSERVICE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<FacilityUserService>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<FacilityUserService>)QueryUtil.list(q,
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
	 * Removes all the facility user services where facilityUserMappingId = &#63; from the database.
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId) throws SystemException {
		for (FacilityUserService facilityUserService : findByFacilityUserServiceByFacilityUserMapping(
				facilityUserMappingId)) {
			remove(facilityUserService);
		}
	}

	/**
	 * Removes all the facility user services where facilityServiceId = &#63; from the database.
	 *
	 * @param facilityServiceId the facility service ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityUserMappingByFacilityService(
		long facilityServiceId) throws SystemException {
		for (FacilityUserService facilityUserService : findByFacilityUserMappingByFacilityService(
				facilityServiceId)) {
			remove(facilityUserService);
		}
	}

	/**
	 * Removes all the facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63; from the database.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param facilityUserMappingId the facility user mapping ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFusByServiceUserMapping(long facilityServiceId,
		long facilityUserMappingId) throws SystemException {
		for (FacilityUserService facilityUserService : findByFusByServiceUserMapping(
				facilityServiceId, facilityUserMappingId)) {
			remove(facilityUserService);
		}
	}

	/**
	 * Removes all the facility user services from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (FacilityUserService facilityUserService : findAll()) {
			remove(facilityUserService);
		}
	}

	/**
	 * Returns the number of facility user services where facilityUserMappingId = &#63;.
	 *
	 * @param facilityUserMappingId the facility user mapping ID
	 * @return the number of matching facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId) throws SystemException {
		Object[] finderArgs = new Object[] { facilityUserMappingId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYUSERSERVICEBYFACILITYUSERMAPPING,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITYUSERSERVICE_WHERE);

			query.append(_FINDER_COLUMN_FACILITYUSERSERVICEBYFACILITYUSERMAPPING_FACILITYUSERMAPPINGID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYUSERSERVICEBYFACILITYUSERMAPPING,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility user services where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @return the number of matching facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityUserMappingByFacilityService(
		long facilityServiceId) throws SystemException {
		Object[] finderArgs = new Object[] { facilityServiceId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYUSERMAPPINGBYFACILITYSERVICE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITYUSERSERVICE_WHERE);

			query.append(_FINDER_COLUMN_FACILITYUSERMAPPINGBYFACILITYSERVICE_FACILITYSERVICEID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYUSERMAPPINGBYFACILITYSERVICE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param facilityUserMappingId the facility user mapping ID
	 * @return the number of matching facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFusByServiceUserMapping(long facilityServiceId,
		long facilityUserMappingId) throws SystemException {
		Object[] finderArgs = new Object[] {
				facilityServiceId, facilityUserMappingId
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FUSBYSERVICEUSERMAPPING,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FACILITYUSERSERVICE_WHERE);

			query.append(_FINDER_COLUMN_FUSBYSERVICEUSERMAPPING_FACILITYSERVICEID_2);

			query.append(_FINDER_COLUMN_FUSBYSERVICEUSERMAPPING_FACILITYUSERMAPPINGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(facilityServiceId);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FUSBYSERVICEUSERMAPPING,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility user services.
	 *
	 * @return the number of facility user services
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FACILITYUSERSERVICE);

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
	 * Initializes the facility user service persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.FacilityUserService")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FacilityUserService>> listenersList = new ArrayList<ModelListener<FacilityUserService>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FacilityUserService>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FacilityUserServiceImpl.class.getName());
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
	private static final String _SQL_SELECT_FACILITYUSERSERVICE = "SELECT facilityUserService FROM FacilityUserService facilityUserService";
	private static final String _SQL_SELECT_FACILITYUSERSERVICE_WHERE = "SELECT facilityUserService FROM FacilityUserService facilityUserService WHERE ";
	private static final String _SQL_COUNT_FACILITYUSERSERVICE = "SELECT COUNT(facilityUserService) FROM FacilityUserService facilityUserService";
	private static final String _SQL_COUNT_FACILITYUSERSERVICE_WHERE = "SELECT COUNT(facilityUserService) FROM FacilityUserService facilityUserService WHERE ";
	private static final String _FINDER_COLUMN_FACILITYUSERSERVICEBYFACILITYUSERMAPPING_FACILITYUSERMAPPINGID_2 =
		"facilityUserService.facilityUserMappingId = ?";
	private static final String _FINDER_COLUMN_FACILITYUSERMAPPINGBYFACILITYSERVICE_FACILITYSERVICEID_2 =
		"facilityUserService.facilityServiceId = ?";
	private static final String _FINDER_COLUMN_FUSBYSERVICEUSERMAPPING_FACILITYSERVICEID_2 =
		"facilityUserService.facilityServiceId = ? AND ";
	private static final String _FINDER_COLUMN_FUSBYSERVICEUSERMAPPING_FACILITYUSERMAPPINGID_2 =
		"facilityUserService.facilityUserMappingId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "facilityUserService.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FacilityUserService exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FacilityUserService exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FacilityUserServicePersistenceImpl.class);
	private static FacilityUserService _nullFacilityUserService = new FacilityUserServiceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FacilityUserService> toCacheModel() {
				return _nullFacilityUserServiceCacheModel;
			}
		};

	private static CacheModel<FacilityUserService> _nullFacilityUserServiceCacheModel =
		new CacheModel<FacilityUserService>() {
			public FacilityUserService toEntityModel() {
				return _nullFacilityUserService;
			}
		};
}