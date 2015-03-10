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

import com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException;
import com.pacnet.connect.model.FacilitySecurityOfficerMapping;
import com.pacnet.connect.model.impl.FacilitySecurityOfficerMappingImpl;
import com.pacnet.connect.model.impl.FacilitySecurityOfficerMappingModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the facility security officer mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilitySecurityOfficerMappingPersistence
 * @see FacilitySecurityOfficerMappingUtil
 * @generated
 */
public class FacilitySecurityOfficerMappingPersistenceImpl
	extends BasePersistenceImpl<FacilitySecurityOfficerMapping>
	implements FacilitySecurityOfficerMappingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FacilitySecurityOfficerMappingUtil} to access the facility security officer mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FacilitySecurityOfficerMappingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYSECURITYBYFACILITY =
		new FinderPath(FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilitySecurityOfficerMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilitySecurityOfficerMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilitySecurityByFacility",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSECURITYBYFACILITY =
		new FinderPath(FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilitySecurityOfficerMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilitySecurityOfficerMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilitySecurityByFacility",
			new String[] { Long.class.getName() },
			FacilitySecurityOfficerMappingModelImpl.FACILTYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYSECURITYBYFACILITY =
		new FinderPath(FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilitySecurityOfficerMappingModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilitySecurityByFacility",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYSECURITYBYSECURITYOFFICERUSERID =
		new FinderPath(FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilitySecurityOfficerMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilitySecurityOfficerMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilitySecurityBySecurityOfficerUserId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSECURITYBYSECURITYOFFICERUSERID =
		new FinderPath(FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilitySecurityOfficerMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilitySecurityOfficerMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilitySecurityBySecurityOfficerUserId",
			new String[] { Long.class.getName() },
			FacilitySecurityOfficerMappingModelImpl.SECURITYOFFICERUSERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYSECURITYBYSECURITYOFFICERUSERID =
		new FinderPath(FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilitySecurityOfficerMappingModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilitySecurityBySecurityOfficerUserId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilitySecurityOfficerMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilitySecurityOfficerMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilitySecurityOfficerMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilitySecurityOfficerMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilitySecurityOfficerMappingModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	/**
	 * Caches the facility security officer mapping in the entity cache if it is enabled.
	 *
	 * @param facilitySecurityOfficerMapping the facility security officer mapping
	 */
	public void cacheResult(
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping) {
		EntityCacheUtil.putResult(FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilitySecurityOfficerMappingImpl.class,
			facilitySecurityOfficerMapping.getPrimaryKey(),
			facilitySecurityOfficerMapping);

		facilitySecurityOfficerMapping.resetOriginalValues();
	}

	/**
	 * Caches the facility security officer mappings in the entity cache if it is enabled.
	 *
	 * @param facilitySecurityOfficerMappings the facility security officer mappings
	 */
	public void cacheResult(
		List<FacilitySecurityOfficerMapping> facilitySecurityOfficerMappings) {
		for (FacilitySecurityOfficerMapping facilitySecurityOfficerMapping : facilitySecurityOfficerMappings) {
			if (EntityCacheUtil.getResult(
						FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
						FacilitySecurityOfficerMappingImpl.class,
						facilitySecurityOfficerMapping.getPrimaryKey()) == null) {
				cacheResult(facilitySecurityOfficerMapping);
			}
			else {
				facilitySecurityOfficerMapping.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all facility security officer mappings.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FacilitySecurityOfficerMappingImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FacilitySecurityOfficerMappingImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the facility security officer mapping.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping) {
		EntityCacheUtil.removeResult(FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilitySecurityOfficerMappingImpl.class,
			facilitySecurityOfficerMapping.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<FacilitySecurityOfficerMapping> facilitySecurityOfficerMappings) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FacilitySecurityOfficerMapping facilitySecurityOfficerMapping : facilitySecurityOfficerMappings) {
			EntityCacheUtil.removeResult(FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
				FacilitySecurityOfficerMappingImpl.class,
				facilitySecurityOfficerMapping.getPrimaryKey());
		}
	}

	/**
	 * Creates a new facility security officer mapping with the primary key. Does not add the facility security officer mapping to the database.
	 *
	 * @param id the primary key for the new facility security officer mapping
	 * @return the new facility security officer mapping
	 */
	public FacilitySecurityOfficerMapping create(long id) {
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping = new FacilitySecurityOfficerMappingImpl();

		facilitySecurityOfficerMapping.setNew(true);
		facilitySecurityOfficerMapping.setPrimaryKey(id);

		return facilitySecurityOfficerMapping;
	}

	/**
	 * Removes the facility security officer mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the facility security officer mapping
	 * @return the facility security officer mapping that was removed
	 * @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a facility security officer mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilitySecurityOfficerMapping remove(long id)
		throws NoSuchFacilitySecurityOfficerMappingException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the facility security officer mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the facility security officer mapping
	 * @return the facility security officer mapping that was removed
	 * @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a facility security officer mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilitySecurityOfficerMapping remove(Serializable primaryKey)
		throws NoSuchFacilitySecurityOfficerMappingException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FacilitySecurityOfficerMapping facilitySecurityOfficerMapping = (FacilitySecurityOfficerMapping)session.get(FacilitySecurityOfficerMappingImpl.class,
					primaryKey);

			if (facilitySecurityOfficerMapping == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFacilitySecurityOfficerMappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(facilitySecurityOfficerMapping);
		}
		catch (NoSuchFacilitySecurityOfficerMappingException nsee) {
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
	protected FacilitySecurityOfficerMapping removeImpl(
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping)
		throws SystemException {
		facilitySecurityOfficerMapping = toUnwrappedModel(facilitySecurityOfficerMapping);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, facilitySecurityOfficerMapping);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(facilitySecurityOfficerMapping);

		return facilitySecurityOfficerMapping;
	}

	@Override
	public FacilitySecurityOfficerMapping updateImpl(
		com.pacnet.connect.model.FacilitySecurityOfficerMapping facilitySecurityOfficerMapping,
		boolean merge) throws SystemException {
		facilitySecurityOfficerMapping = toUnwrappedModel(facilitySecurityOfficerMapping);

		boolean isNew = facilitySecurityOfficerMapping.isNew();

		FacilitySecurityOfficerMappingModelImpl facilitySecurityOfficerMappingModelImpl =
			(FacilitySecurityOfficerMappingModelImpl)facilitySecurityOfficerMapping;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, facilitySecurityOfficerMapping,
				merge);

			facilitySecurityOfficerMapping.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!FacilitySecurityOfficerMappingModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((facilitySecurityOfficerMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSECURITYBYFACILITY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilitySecurityOfficerMappingModelImpl.getOriginalFaciltyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYSECURITYBYFACILITY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSECURITYBYFACILITY,
					args);

				args = new Object[] {
						Long.valueOf(facilitySecurityOfficerMappingModelImpl.getFaciltyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYSECURITYBYFACILITY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSECURITYBYFACILITY,
					args);
			}

			if ((facilitySecurityOfficerMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSECURITYBYSECURITYOFFICERUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilitySecurityOfficerMappingModelImpl.getOriginalSecurityOfficerUserId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYSECURITYBYSECURITYOFFICERUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSECURITYBYSECURITYOFFICERUSERID,
					args);

				args = new Object[] {
						Long.valueOf(facilitySecurityOfficerMappingModelImpl.getSecurityOfficerUserId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYSECURITYBYSECURITYOFFICERUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSECURITYBYSECURITYOFFICERUSERID,
					args);
			}
		}

		EntityCacheUtil.putResult(FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilitySecurityOfficerMappingImpl.class,
			facilitySecurityOfficerMapping.getPrimaryKey(),
			facilitySecurityOfficerMapping);

		return facilitySecurityOfficerMapping;
	}

	protected FacilitySecurityOfficerMapping toUnwrappedModel(
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping) {
		if (facilitySecurityOfficerMapping instanceof FacilitySecurityOfficerMappingImpl) {
			return facilitySecurityOfficerMapping;
		}

		FacilitySecurityOfficerMappingImpl facilitySecurityOfficerMappingImpl = new FacilitySecurityOfficerMappingImpl();

		facilitySecurityOfficerMappingImpl.setNew(facilitySecurityOfficerMapping.isNew());
		facilitySecurityOfficerMappingImpl.setPrimaryKey(facilitySecurityOfficerMapping.getPrimaryKey());

		facilitySecurityOfficerMappingImpl.setId(facilitySecurityOfficerMapping.getId());
		facilitySecurityOfficerMappingImpl.setFaciltyId(facilitySecurityOfficerMapping.getFaciltyId());
		facilitySecurityOfficerMappingImpl.setSecurityOfficerUserId(facilitySecurityOfficerMapping.getSecurityOfficerUserId());
		facilitySecurityOfficerMappingImpl.setIsActive(facilitySecurityOfficerMapping.isIsActive());
		facilitySecurityOfficerMappingImpl.setCreatedOn(facilitySecurityOfficerMapping.getCreatedOn());
		facilitySecurityOfficerMappingImpl.setCreatedBy(facilitySecurityOfficerMapping.getCreatedBy());
		facilitySecurityOfficerMappingImpl.setUpdatedOn(facilitySecurityOfficerMapping.getUpdatedOn());
		facilitySecurityOfficerMappingImpl.setUpdatedBy(facilitySecurityOfficerMapping.getUpdatedBy());

		return facilitySecurityOfficerMappingImpl;
	}

	/**
	 * Returns the facility security officer mapping with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility security officer mapping
	 * @return the facility security officer mapping
	 * @throws com.liferay.portal.NoSuchModelException if a facility security officer mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilitySecurityOfficerMapping findByPrimaryKey(
		Serializable primaryKey) throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility security officer mapping with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException} if it could not be found.
	 *
	 * @param id the primary key of the facility security officer mapping
	 * @return the facility security officer mapping
	 * @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a facility security officer mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilitySecurityOfficerMapping findByPrimaryKey(long id)
		throws NoSuchFacilitySecurityOfficerMappingException, SystemException {
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping = fetchByPrimaryKey(id);

		if (facilitySecurityOfficerMapping == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchFacilitySecurityOfficerMappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return facilitySecurityOfficerMapping;
	}

	/**
	 * Returns the facility security officer mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility security officer mapping
	 * @return the facility security officer mapping, or <code>null</code> if a facility security officer mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilitySecurityOfficerMapping fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility security officer mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the facility security officer mapping
	 * @return the facility security officer mapping, or <code>null</code> if a facility security officer mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilitySecurityOfficerMapping fetchByPrimaryKey(long id)
		throws SystemException {
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping = (FacilitySecurityOfficerMapping)EntityCacheUtil.getResult(FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
				FacilitySecurityOfficerMappingImpl.class, id);

		if (facilitySecurityOfficerMapping == _nullFacilitySecurityOfficerMapping) {
			return null;
		}

		if (facilitySecurityOfficerMapping == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				facilitySecurityOfficerMapping = (FacilitySecurityOfficerMapping)session.get(FacilitySecurityOfficerMappingImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (facilitySecurityOfficerMapping != null) {
					cacheResult(facilitySecurityOfficerMapping);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(FacilitySecurityOfficerMappingModelImpl.ENTITY_CACHE_ENABLED,
						FacilitySecurityOfficerMappingImpl.class, id,
						_nullFacilitySecurityOfficerMapping);
				}

				closeSession(session);
			}
		}

		return facilitySecurityOfficerMapping;
	}

	/**
	 * Returns all the facility security officer mappings where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @return the matching facility security officer mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilitySecurityOfficerMapping> findByFacilitySecurityByFacility(
		long faciltyId) throws SystemException {
		return findByFacilitySecurityByFacility(faciltyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility security officer mappings where faciltyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param faciltyId the facilty ID
	 * @param start the lower bound of the range of facility security officer mappings
	 * @param end the upper bound of the range of facility security officer mappings (not inclusive)
	 * @return the range of matching facility security officer mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilitySecurityOfficerMapping> findByFacilitySecurityByFacility(
		long faciltyId, int start, int end) throws SystemException {
		return findByFacilitySecurityByFacility(faciltyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility security officer mappings where faciltyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param faciltyId the facilty ID
	 * @param start the lower bound of the range of facility security officer mappings
	 * @param end the upper bound of the range of facility security officer mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility security officer mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilitySecurityOfficerMapping> findByFacilitySecurityByFacility(
		long faciltyId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSECURITYBYFACILITY;
			finderArgs = new Object[] { faciltyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYSECURITYBYFACILITY;
			finderArgs = new Object[] { faciltyId, start, end, orderByComparator };
		}

		List<FacilitySecurityOfficerMapping> list = (List<FacilitySecurityOfficerMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilitySecurityOfficerMapping facilitySecurityOfficerMapping : list) {
				if ((faciltyId != facilitySecurityOfficerMapping.getFaciltyId())) {
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

			query.append(_SQL_SELECT_FACILITYSECURITYOFFICERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYSECURITYBYFACILITY_FACILTYID_2);

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

				qPos.add(faciltyId);

				list = (List<FacilitySecurityOfficerMapping>)QueryUtil.list(q,
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
	 * Returns the first facility security officer mapping in the ordered set where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility security officer mapping
	 * @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a matching facility security officer mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilitySecurityOfficerMapping findByFacilitySecurityByFacility_First(
		long faciltyId, OrderByComparator orderByComparator)
		throws NoSuchFacilitySecurityOfficerMappingException, SystemException {
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping = fetchByFacilitySecurityByFacility_First(faciltyId,
				orderByComparator);

		if (facilitySecurityOfficerMapping != null) {
			return facilitySecurityOfficerMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("faciltyId=");
		msg.append(faciltyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilitySecurityOfficerMappingException(msg.toString());
	}

	/**
	 * Returns the first facility security officer mapping in the ordered set where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility security officer mapping, or <code>null</code> if a matching facility security officer mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilitySecurityOfficerMapping fetchByFacilitySecurityByFacility_First(
		long faciltyId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FacilitySecurityOfficerMapping> list = findByFacilitySecurityByFacility(faciltyId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility security officer mapping in the ordered set where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility security officer mapping
	 * @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a matching facility security officer mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilitySecurityOfficerMapping findByFacilitySecurityByFacility_Last(
		long faciltyId, OrderByComparator orderByComparator)
		throws NoSuchFacilitySecurityOfficerMappingException, SystemException {
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping = fetchByFacilitySecurityByFacility_Last(faciltyId,
				orderByComparator);

		if (facilitySecurityOfficerMapping != null) {
			return facilitySecurityOfficerMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("faciltyId=");
		msg.append(faciltyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilitySecurityOfficerMappingException(msg.toString());
	}

	/**
	 * Returns the last facility security officer mapping in the ordered set where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility security officer mapping, or <code>null</code> if a matching facility security officer mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilitySecurityOfficerMapping fetchByFacilitySecurityByFacility_Last(
		long faciltyId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByFacilitySecurityByFacility(faciltyId);

		List<FacilitySecurityOfficerMapping> list = findByFacilitySecurityByFacility(faciltyId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility security officer mappings before and after the current facility security officer mapping in the ordered set where faciltyId = &#63;.
	 *
	 * @param id the primary key of the current facility security officer mapping
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility security officer mapping
	 * @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a facility security officer mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilitySecurityOfficerMapping[] findByFacilitySecurityByFacility_PrevAndNext(
		long id, long faciltyId, OrderByComparator orderByComparator)
		throws NoSuchFacilitySecurityOfficerMappingException, SystemException {
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilitySecurityOfficerMapping[] array = new FacilitySecurityOfficerMappingImpl[3];

			array[0] = getByFacilitySecurityByFacility_PrevAndNext(session,
					facilitySecurityOfficerMapping, faciltyId,
					orderByComparator, true);

			array[1] = facilitySecurityOfficerMapping;

			array[2] = getByFacilitySecurityByFacility_PrevAndNext(session,
					facilitySecurityOfficerMapping, faciltyId,
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

	protected FacilitySecurityOfficerMapping getByFacilitySecurityByFacility_PrevAndNext(
		Session session,
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping,
		long faciltyId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYSECURITYOFFICERMAPPING_WHERE);

		query.append(_FINDER_COLUMN_FACILITYSECURITYBYFACILITY_FACILTYID_2);

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

		qPos.add(faciltyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(facilitySecurityOfficerMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilitySecurityOfficerMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility security officer mappings where securityOfficerUserId = &#63;.
	 *
	 * @param securityOfficerUserId the security officer user ID
	 * @return the matching facility security officer mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilitySecurityOfficerMapping> findByFacilitySecurityBySecurityOfficerUserId(
		long securityOfficerUserId) throws SystemException {
		return findByFacilitySecurityBySecurityOfficerUserId(securityOfficerUserId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility security officer mappings where securityOfficerUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param securityOfficerUserId the security officer user ID
	 * @param start the lower bound of the range of facility security officer mappings
	 * @param end the upper bound of the range of facility security officer mappings (not inclusive)
	 * @return the range of matching facility security officer mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilitySecurityOfficerMapping> findByFacilitySecurityBySecurityOfficerUserId(
		long securityOfficerUserId, int start, int end)
		throws SystemException {
		return findByFacilitySecurityBySecurityOfficerUserId(securityOfficerUserId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility security officer mappings where securityOfficerUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param securityOfficerUserId the security officer user ID
	 * @param start the lower bound of the range of facility security officer mappings
	 * @param end the upper bound of the range of facility security officer mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility security officer mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilitySecurityOfficerMapping> findByFacilitySecurityBySecurityOfficerUserId(
		long securityOfficerUserId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSECURITYBYSECURITYOFFICERUSERID;
			finderArgs = new Object[] { securityOfficerUserId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYSECURITYBYSECURITYOFFICERUSERID;
			finderArgs = new Object[] {
					securityOfficerUserId,
					
					start, end, orderByComparator
				};
		}

		List<FacilitySecurityOfficerMapping> list = (List<FacilitySecurityOfficerMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilitySecurityOfficerMapping facilitySecurityOfficerMapping : list) {
				if ((securityOfficerUserId != facilitySecurityOfficerMapping.getSecurityOfficerUserId())) {
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

			query.append(_SQL_SELECT_FACILITYSECURITYOFFICERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYSECURITYBYSECURITYOFFICERUSERID_SECURITYOFFICERUSERID_2);

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

				qPos.add(securityOfficerUserId);

				list = (List<FacilitySecurityOfficerMapping>)QueryUtil.list(q,
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
	 * Returns the first facility security officer mapping in the ordered set where securityOfficerUserId = &#63;.
	 *
	 * @param securityOfficerUserId the security officer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility security officer mapping
	 * @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a matching facility security officer mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilitySecurityOfficerMapping findByFacilitySecurityBySecurityOfficerUserId_First(
		long securityOfficerUserId, OrderByComparator orderByComparator)
		throws NoSuchFacilitySecurityOfficerMappingException, SystemException {
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping = fetchByFacilitySecurityBySecurityOfficerUserId_First(securityOfficerUserId,
				orderByComparator);

		if (facilitySecurityOfficerMapping != null) {
			return facilitySecurityOfficerMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("securityOfficerUserId=");
		msg.append(securityOfficerUserId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilitySecurityOfficerMappingException(msg.toString());
	}

	/**
	 * Returns the first facility security officer mapping in the ordered set where securityOfficerUserId = &#63;.
	 *
	 * @param securityOfficerUserId the security officer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility security officer mapping, or <code>null</code> if a matching facility security officer mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilitySecurityOfficerMapping fetchByFacilitySecurityBySecurityOfficerUserId_First(
		long securityOfficerUserId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FacilitySecurityOfficerMapping> list = findByFacilitySecurityBySecurityOfficerUserId(securityOfficerUserId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility security officer mapping in the ordered set where securityOfficerUserId = &#63;.
	 *
	 * @param securityOfficerUserId the security officer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility security officer mapping
	 * @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a matching facility security officer mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilitySecurityOfficerMapping findByFacilitySecurityBySecurityOfficerUserId_Last(
		long securityOfficerUserId, OrderByComparator orderByComparator)
		throws NoSuchFacilitySecurityOfficerMappingException, SystemException {
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping = fetchByFacilitySecurityBySecurityOfficerUserId_Last(securityOfficerUserId,
				orderByComparator);

		if (facilitySecurityOfficerMapping != null) {
			return facilitySecurityOfficerMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("securityOfficerUserId=");
		msg.append(securityOfficerUserId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilitySecurityOfficerMappingException(msg.toString());
	}

	/**
	 * Returns the last facility security officer mapping in the ordered set where securityOfficerUserId = &#63;.
	 *
	 * @param securityOfficerUserId the security officer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility security officer mapping, or <code>null</code> if a matching facility security officer mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilitySecurityOfficerMapping fetchByFacilitySecurityBySecurityOfficerUserId_Last(
		long securityOfficerUserId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByFacilitySecurityBySecurityOfficerUserId(securityOfficerUserId);

		List<FacilitySecurityOfficerMapping> list = findByFacilitySecurityBySecurityOfficerUserId(securityOfficerUserId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility security officer mappings before and after the current facility security officer mapping in the ordered set where securityOfficerUserId = &#63;.
	 *
	 * @param id the primary key of the current facility security officer mapping
	 * @param securityOfficerUserId the security officer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility security officer mapping
	 * @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a facility security officer mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilitySecurityOfficerMapping[] findByFacilitySecurityBySecurityOfficerUserId_PrevAndNext(
		long id, long securityOfficerUserId, OrderByComparator orderByComparator)
		throws NoSuchFacilitySecurityOfficerMappingException, SystemException {
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilitySecurityOfficerMapping[] array = new FacilitySecurityOfficerMappingImpl[3];

			array[0] = getByFacilitySecurityBySecurityOfficerUserId_PrevAndNext(session,
					facilitySecurityOfficerMapping, securityOfficerUserId,
					orderByComparator, true);

			array[1] = facilitySecurityOfficerMapping;

			array[2] = getByFacilitySecurityBySecurityOfficerUserId_PrevAndNext(session,
					facilitySecurityOfficerMapping, securityOfficerUserId,
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

	protected FacilitySecurityOfficerMapping getByFacilitySecurityBySecurityOfficerUserId_PrevAndNext(
		Session session,
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping,
		long securityOfficerUserId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYSECURITYOFFICERMAPPING_WHERE);

		query.append(_FINDER_COLUMN_FACILITYSECURITYBYSECURITYOFFICERUSERID_SECURITYOFFICERUSERID_2);

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

		qPos.add(securityOfficerUserId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(facilitySecurityOfficerMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilitySecurityOfficerMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility security officer mappings.
	 *
	 * @return the facility security officer mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilitySecurityOfficerMapping> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility security officer mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facility security officer mappings
	 * @param end the upper bound of the range of facility security officer mappings (not inclusive)
	 * @return the range of facility security officer mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilitySecurityOfficerMapping> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility security officer mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facility security officer mappings
	 * @param end the upper bound of the range of facility security officer mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of facility security officer mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilitySecurityOfficerMapping> findAll(int start, int end,
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

		List<FacilitySecurityOfficerMapping> list = (List<FacilitySecurityOfficerMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FACILITYSECURITYOFFICERMAPPING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FACILITYSECURITYOFFICERMAPPING;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<FacilitySecurityOfficerMapping>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<FacilitySecurityOfficerMapping>)QueryUtil.list(q,
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
	 * Removes all the facility security officer mappings where faciltyId = &#63; from the database.
	 *
	 * @param faciltyId the facilty ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilitySecurityByFacility(long faciltyId)
		throws SystemException {
		for (FacilitySecurityOfficerMapping facilitySecurityOfficerMapping : findByFacilitySecurityByFacility(
				faciltyId)) {
			remove(facilitySecurityOfficerMapping);
		}
	}

	/**
	 * Removes all the facility security officer mappings where securityOfficerUserId = &#63; from the database.
	 *
	 * @param securityOfficerUserId the security officer user ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilitySecurityBySecurityOfficerUserId(
		long securityOfficerUserId) throws SystemException {
		for (FacilitySecurityOfficerMapping facilitySecurityOfficerMapping : findByFacilitySecurityBySecurityOfficerUserId(
				securityOfficerUserId)) {
			remove(facilitySecurityOfficerMapping);
		}
	}

	/**
	 * Removes all the facility security officer mappings from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (FacilitySecurityOfficerMapping facilitySecurityOfficerMapping : findAll()) {
			remove(facilitySecurityOfficerMapping);
		}
	}

	/**
	 * Returns the number of facility security officer mappings where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @return the number of matching facility security officer mappings
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilitySecurityByFacility(long faciltyId)
		throws SystemException {
		Object[] finderArgs = new Object[] { faciltyId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYSECURITYBYFACILITY,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITYSECURITYOFFICERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYSECURITYBYFACILITY_FACILTYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(faciltyId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYSECURITYBYFACILITY,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility security officer mappings where securityOfficerUserId = &#63;.
	 *
	 * @param securityOfficerUserId the security officer user ID
	 * @return the number of matching facility security officer mappings
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilitySecurityBySecurityOfficerUserId(
		long securityOfficerUserId) throws SystemException {
		Object[] finderArgs = new Object[] { securityOfficerUserId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYSECURITYBYSECURITYOFFICERUSERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITYSECURITYOFFICERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYSECURITYBYSECURITYOFFICERUSERID_SECURITYOFFICERUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(securityOfficerUserId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYSECURITYBYSECURITYOFFICERUSERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility security officer mappings.
	 *
	 * @return the number of facility security officer mappings
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FACILITYSECURITYOFFICERMAPPING);

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
	 * Initializes the facility security officer mapping persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.FacilitySecurityOfficerMapping")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FacilitySecurityOfficerMapping>> listenersList =
					new ArrayList<ModelListener<FacilitySecurityOfficerMapping>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FacilitySecurityOfficerMapping>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FacilitySecurityOfficerMappingImpl.class.getName());
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
	private static final String _SQL_SELECT_FACILITYSECURITYOFFICERMAPPING = "SELECT facilitySecurityOfficerMapping FROM FacilitySecurityOfficerMapping facilitySecurityOfficerMapping";
	private static final String _SQL_SELECT_FACILITYSECURITYOFFICERMAPPING_WHERE =
		"SELECT facilitySecurityOfficerMapping FROM FacilitySecurityOfficerMapping facilitySecurityOfficerMapping WHERE ";
	private static final String _SQL_COUNT_FACILITYSECURITYOFFICERMAPPING = "SELECT COUNT(facilitySecurityOfficerMapping) FROM FacilitySecurityOfficerMapping facilitySecurityOfficerMapping";
	private static final String _SQL_COUNT_FACILITYSECURITYOFFICERMAPPING_WHERE = "SELECT COUNT(facilitySecurityOfficerMapping) FROM FacilitySecurityOfficerMapping facilitySecurityOfficerMapping WHERE ";
	private static final String _FINDER_COLUMN_FACILITYSECURITYBYFACILITY_FACILTYID_2 =
		"facilitySecurityOfficerMapping.faciltyId = ?";
	private static final String _FINDER_COLUMN_FACILITYSECURITYBYSECURITYOFFICERUSERID_SECURITYOFFICERUSERID_2 =
		"facilitySecurityOfficerMapping.securityOfficerUserId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "facilitySecurityOfficerMapping.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FacilitySecurityOfficerMapping exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FacilitySecurityOfficerMapping exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FacilitySecurityOfficerMappingPersistenceImpl.class);
	private static FacilitySecurityOfficerMapping _nullFacilitySecurityOfficerMapping =
		new FacilitySecurityOfficerMappingImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FacilitySecurityOfficerMapping> toCacheModel() {
				return _nullFacilitySecurityOfficerMappingCacheModel;
			}
		};

	private static CacheModel<FacilitySecurityOfficerMapping> _nullFacilitySecurityOfficerMappingCacheModel =
		new CacheModel<FacilitySecurityOfficerMapping>() {
			public FacilitySecurityOfficerMapping toEntityModel() {
				return _nullFacilitySecurityOfficerMapping;
			}
		};
}