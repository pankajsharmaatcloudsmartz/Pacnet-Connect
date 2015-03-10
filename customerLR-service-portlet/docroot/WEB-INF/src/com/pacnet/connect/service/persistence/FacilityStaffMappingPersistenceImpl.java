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

import com.pacnet.connect.NoSuchFacilityStaffMappingException;
import com.pacnet.connect.model.FacilityStaffMapping;
import com.pacnet.connect.model.impl.FacilityStaffMappingImpl;
import com.pacnet.connect.model.impl.FacilityStaffMappingModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the facility staff mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityStaffMappingPersistence
 * @see FacilityStaffMappingUtil
 * @generated
 */
public class FacilityStaffMappingPersistenceImpl extends BasePersistenceImpl<FacilityStaffMapping>
	implements FacilityStaffMappingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FacilityStaffMappingUtil} to access the facility staff mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FacilityStaffMappingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYSTAFFBYFACILITY =
		new FinderPath(FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityStaffMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityStaffMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityStaffByFacility",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSTAFFBYFACILITY =
		new FinderPath(FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityStaffMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityStaffMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityStaffByFacility",
			new String[] { Long.class.getName() },
			FacilityStaffMappingModelImpl.FACILITYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYSTAFFBYFACILITY = new FinderPath(FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityStaffMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityStaffByFacility",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYSTAFFBYSTAFFUSERID =
		new FinderPath(FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityStaffMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityStaffMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityStaffByStaffUserId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSTAFFBYSTAFFUSERID =
		new FinderPath(FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityStaffMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityStaffMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityStaffByStaffUserId",
			new String[] { Long.class.getName() },
			FacilityStaffMappingModelImpl.STAFFUSERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYSTAFFBYSTAFFUSERID =
		new FinderPath(FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityStaffMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityStaffByStaffUserId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityStaffMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityStaffMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityStaffMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityStaffMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityStaffMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the facility staff mapping in the entity cache if it is enabled.
	 *
	 * @param facilityStaffMapping the facility staff mapping
	 */
	public void cacheResult(FacilityStaffMapping facilityStaffMapping) {
		EntityCacheUtil.putResult(FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityStaffMappingImpl.class,
			facilityStaffMapping.getPrimaryKey(), facilityStaffMapping);

		facilityStaffMapping.resetOriginalValues();
	}

	/**
	 * Caches the facility staff mappings in the entity cache if it is enabled.
	 *
	 * @param facilityStaffMappings the facility staff mappings
	 */
	public void cacheResult(List<FacilityStaffMapping> facilityStaffMappings) {
		for (FacilityStaffMapping facilityStaffMapping : facilityStaffMappings) {
			if (EntityCacheUtil.getResult(
						FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
						FacilityStaffMappingImpl.class,
						facilityStaffMapping.getPrimaryKey()) == null) {
				cacheResult(facilityStaffMapping);
			}
			else {
				facilityStaffMapping.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all facility staff mappings.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FacilityStaffMappingImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FacilityStaffMappingImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the facility staff mapping.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FacilityStaffMapping facilityStaffMapping) {
		EntityCacheUtil.removeResult(FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityStaffMappingImpl.class, facilityStaffMapping.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FacilityStaffMapping> facilityStaffMappings) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FacilityStaffMapping facilityStaffMapping : facilityStaffMappings) {
			EntityCacheUtil.removeResult(FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
				FacilityStaffMappingImpl.class,
				facilityStaffMapping.getPrimaryKey());
		}
	}

	/**
	 * Creates a new facility staff mapping with the primary key. Does not add the facility staff mapping to the database.
	 *
	 * @param id the primary key for the new facility staff mapping
	 * @return the new facility staff mapping
	 */
	public FacilityStaffMapping create(long id) {
		FacilityStaffMapping facilityStaffMapping = new FacilityStaffMappingImpl();

		facilityStaffMapping.setNew(true);
		facilityStaffMapping.setPrimaryKey(id);

		return facilityStaffMapping;
	}

	/**
	 * Removes the facility staff mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the facility staff mapping
	 * @return the facility staff mapping that was removed
	 * @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a facility staff mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityStaffMapping remove(long id)
		throws NoSuchFacilityStaffMappingException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the facility staff mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the facility staff mapping
	 * @return the facility staff mapping that was removed
	 * @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a facility staff mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityStaffMapping remove(Serializable primaryKey)
		throws NoSuchFacilityStaffMappingException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FacilityStaffMapping facilityStaffMapping = (FacilityStaffMapping)session.get(FacilityStaffMappingImpl.class,
					primaryKey);

			if (facilityStaffMapping == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFacilityStaffMappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(facilityStaffMapping);
		}
		catch (NoSuchFacilityStaffMappingException nsee) {
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
	protected FacilityStaffMapping removeImpl(
		FacilityStaffMapping facilityStaffMapping) throws SystemException {
		facilityStaffMapping = toUnwrappedModel(facilityStaffMapping);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, facilityStaffMapping);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(facilityStaffMapping);

		return facilityStaffMapping;
	}

	@Override
	public FacilityStaffMapping updateImpl(
		com.pacnet.connect.model.FacilityStaffMapping facilityStaffMapping,
		boolean merge) throws SystemException {
		facilityStaffMapping = toUnwrappedModel(facilityStaffMapping);

		boolean isNew = facilityStaffMapping.isNew();

		FacilityStaffMappingModelImpl facilityStaffMappingModelImpl = (FacilityStaffMappingModelImpl)facilityStaffMapping;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, facilityStaffMapping, merge);

			facilityStaffMapping.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FacilityStaffMappingModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((facilityStaffMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSTAFFBYFACILITY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityStaffMappingModelImpl.getOriginalFacilityId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYSTAFFBYFACILITY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSTAFFBYFACILITY,
					args);

				args = new Object[] {
						Long.valueOf(facilityStaffMappingModelImpl.getFacilityId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYSTAFFBYFACILITY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSTAFFBYFACILITY,
					args);
			}

			if ((facilityStaffMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSTAFFBYSTAFFUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityStaffMappingModelImpl.getOriginalStaffUserId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYSTAFFBYSTAFFUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSTAFFBYSTAFFUSERID,
					args);

				args = new Object[] {
						Long.valueOf(facilityStaffMappingModelImpl.getStaffUserId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYSTAFFBYSTAFFUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSTAFFBYSTAFFUSERID,
					args);
			}
		}

		EntityCacheUtil.putResult(FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityStaffMappingImpl.class,
			facilityStaffMapping.getPrimaryKey(), facilityStaffMapping);

		return facilityStaffMapping;
	}

	protected FacilityStaffMapping toUnwrappedModel(
		FacilityStaffMapping facilityStaffMapping) {
		if (facilityStaffMapping instanceof FacilityStaffMappingImpl) {
			return facilityStaffMapping;
		}

		FacilityStaffMappingImpl facilityStaffMappingImpl = new FacilityStaffMappingImpl();

		facilityStaffMappingImpl.setNew(facilityStaffMapping.isNew());
		facilityStaffMappingImpl.setPrimaryKey(facilityStaffMapping.getPrimaryKey());

		facilityStaffMappingImpl.setId(facilityStaffMapping.getId());
		facilityStaffMappingImpl.setFacilityId(facilityStaffMapping.getFacilityId());
		facilityStaffMappingImpl.setStaffUserId(facilityStaffMapping.getStaffUserId());
		facilityStaffMappingImpl.setIsActive(facilityStaffMapping.isIsActive());
		facilityStaffMappingImpl.setCreatedOn(facilityStaffMapping.getCreatedOn());
		facilityStaffMappingImpl.setCreatedBy(facilityStaffMapping.getCreatedBy());
		facilityStaffMappingImpl.setUpdatedOn(facilityStaffMapping.getUpdatedOn());
		facilityStaffMappingImpl.setUpdatedBy(facilityStaffMapping.getUpdatedBy());

		return facilityStaffMappingImpl;
	}

	/**
	 * Returns the facility staff mapping with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility staff mapping
	 * @return the facility staff mapping
	 * @throws com.liferay.portal.NoSuchModelException if a facility staff mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityStaffMapping findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility staff mapping with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityStaffMappingException} if it could not be found.
	 *
	 * @param id the primary key of the facility staff mapping
	 * @return the facility staff mapping
	 * @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a facility staff mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityStaffMapping findByPrimaryKey(long id)
		throws NoSuchFacilityStaffMappingException, SystemException {
		FacilityStaffMapping facilityStaffMapping = fetchByPrimaryKey(id);

		if (facilityStaffMapping == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchFacilityStaffMappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return facilityStaffMapping;
	}

	/**
	 * Returns the facility staff mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility staff mapping
	 * @return the facility staff mapping, or <code>null</code> if a facility staff mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityStaffMapping fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility staff mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the facility staff mapping
	 * @return the facility staff mapping, or <code>null</code> if a facility staff mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityStaffMapping fetchByPrimaryKey(long id)
		throws SystemException {
		FacilityStaffMapping facilityStaffMapping = (FacilityStaffMapping)EntityCacheUtil.getResult(FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
				FacilityStaffMappingImpl.class, id);

		if (facilityStaffMapping == _nullFacilityStaffMapping) {
			return null;
		}

		if (facilityStaffMapping == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				facilityStaffMapping = (FacilityStaffMapping)session.get(FacilityStaffMappingImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (facilityStaffMapping != null) {
					cacheResult(facilityStaffMapping);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(FacilityStaffMappingModelImpl.ENTITY_CACHE_ENABLED,
						FacilityStaffMappingImpl.class, id,
						_nullFacilityStaffMapping);
				}

				closeSession(session);
			}
		}

		return facilityStaffMapping;
	}

	/**
	 * Returns all the facility staff mappings where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @return the matching facility staff mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityStaffMapping> findByFacilityStaffByFacility(
		long facilityId) throws SystemException {
		return findByFacilityStaffByFacility(facilityId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility staff mappings where facilityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityId the facility ID
	 * @param start the lower bound of the range of facility staff mappings
	 * @param end the upper bound of the range of facility staff mappings (not inclusive)
	 * @return the range of matching facility staff mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityStaffMapping> findByFacilityStaffByFacility(
		long facilityId, int start, int end) throws SystemException {
		return findByFacilityStaffByFacility(facilityId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility staff mappings where facilityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityId the facility ID
	 * @param start the lower bound of the range of facility staff mappings
	 * @param end the upper bound of the range of facility staff mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility staff mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityStaffMapping> findByFacilityStaffByFacility(
		long facilityId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSTAFFBYFACILITY;
			finderArgs = new Object[] { facilityId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYSTAFFBYFACILITY;
			finderArgs = new Object[] { facilityId, start, end, orderByComparator };
		}

		List<FacilityStaffMapping> list = (List<FacilityStaffMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityStaffMapping facilityStaffMapping : list) {
				if ((facilityId != facilityStaffMapping.getFacilityId())) {
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

			query.append(_SQL_SELECT_FACILITYSTAFFMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYSTAFFBYFACILITY_FACILITYID_2);

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

				list = (List<FacilityStaffMapping>)QueryUtil.list(q,
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
	 * Returns the first facility staff mapping in the ordered set where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility staff mapping
	 * @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a matching facility staff mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityStaffMapping findByFacilityStaffByFacility_First(
		long facilityId, OrderByComparator orderByComparator)
		throws NoSuchFacilityStaffMappingException, SystemException {
		FacilityStaffMapping facilityStaffMapping = fetchByFacilityStaffByFacility_First(facilityId,
				orderByComparator);

		if (facilityStaffMapping != null) {
			return facilityStaffMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityId=");
		msg.append(facilityId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityStaffMappingException(msg.toString());
	}

	/**
	 * Returns the first facility staff mapping in the ordered set where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility staff mapping, or <code>null</code> if a matching facility staff mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityStaffMapping fetchByFacilityStaffByFacility_First(
		long facilityId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FacilityStaffMapping> list = findByFacilityStaffByFacility(facilityId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility staff mapping in the ordered set where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility staff mapping
	 * @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a matching facility staff mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityStaffMapping findByFacilityStaffByFacility_Last(
		long facilityId, OrderByComparator orderByComparator)
		throws NoSuchFacilityStaffMappingException, SystemException {
		FacilityStaffMapping facilityStaffMapping = fetchByFacilityStaffByFacility_Last(facilityId,
				orderByComparator);

		if (facilityStaffMapping != null) {
			return facilityStaffMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityId=");
		msg.append(facilityId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityStaffMappingException(msg.toString());
	}

	/**
	 * Returns the last facility staff mapping in the ordered set where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility staff mapping, or <code>null</code> if a matching facility staff mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityStaffMapping fetchByFacilityStaffByFacility_Last(
		long facilityId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByFacilityStaffByFacility(facilityId);

		List<FacilityStaffMapping> list = findByFacilityStaffByFacility(facilityId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility staff mappings before and after the current facility staff mapping in the ordered set where facilityId = &#63;.
	 *
	 * @param id the primary key of the current facility staff mapping
	 * @param facilityId the facility ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility staff mapping
	 * @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a facility staff mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityStaffMapping[] findByFacilityStaffByFacility_PrevAndNext(
		long id, long facilityId, OrderByComparator orderByComparator)
		throws NoSuchFacilityStaffMappingException, SystemException {
		FacilityStaffMapping facilityStaffMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityStaffMapping[] array = new FacilityStaffMappingImpl[3];

			array[0] = getByFacilityStaffByFacility_PrevAndNext(session,
					facilityStaffMapping, facilityId, orderByComparator, true);

			array[1] = facilityStaffMapping;

			array[2] = getByFacilityStaffByFacility_PrevAndNext(session,
					facilityStaffMapping, facilityId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FacilityStaffMapping getByFacilityStaffByFacility_PrevAndNext(
		Session session, FacilityStaffMapping facilityStaffMapping,
		long facilityId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYSTAFFMAPPING_WHERE);

		query.append(_FINDER_COLUMN_FACILITYSTAFFBYFACILITY_FACILITYID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(facilityStaffMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityStaffMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility staff mappings where staffUserId = &#63;.
	 *
	 * @param staffUserId the staff user ID
	 * @return the matching facility staff mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityStaffMapping> findByFacilityStaffByStaffUserId(
		long staffUserId) throws SystemException {
		return findByFacilityStaffByStaffUserId(staffUserId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility staff mappings where staffUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param staffUserId the staff user ID
	 * @param start the lower bound of the range of facility staff mappings
	 * @param end the upper bound of the range of facility staff mappings (not inclusive)
	 * @return the range of matching facility staff mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityStaffMapping> findByFacilityStaffByStaffUserId(
		long staffUserId, int start, int end) throws SystemException {
		return findByFacilityStaffByStaffUserId(staffUserId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility staff mappings where staffUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param staffUserId the staff user ID
	 * @param start the lower bound of the range of facility staff mappings
	 * @param end the upper bound of the range of facility staff mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility staff mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityStaffMapping> findByFacilityStaffByStaffUserId(
		long staffUserId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSTAFFBYSTAFFUSERID;
			finderArgs = new Object[] { staffUserId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYSTAFFBYSTAFFUSERID;
			finderArgs = new Object[] { staffUserId, start, end, orderByComparator };
		}

		List<FacilityStaffMapping> list = (List<FacilityStaffMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityStaffMapping facilityStaffMapping : list) {
				if ((staffUserId != facilityStaffMapping.getStaffUserId())) {
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

			query.append(_SQL_SELECT_FACILITYSTAFFMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYSTAFFBYSTAFFUSERID_STAFFUSERID_2);

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

				qPos.add(staffUserId);

				list = (List<FacilityStaffMapping>)QueryUtil.list(q,
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
	 * Returns the first facility staff mapping in the ordered set where staffUserId = &#63;.
	 *
	 * @param staffUserId the staff user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility staff mapping
	 * @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a matching facility staff mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityStaffMapping findByFacilityStaffByStaffUserId_First(
		long staffUserId, OrderByComparator orderByComparator)
		throws NoSuchFacilityStaffMappingException, SystemException {
		FacilityStaffMapping facilityStaffMapping = fetchByFacilityStaffByStaffUserId_First(staffUserId,
				orderByComparator);

		if (facilityStaffMapping != null) {
			return facilityStaffMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("staffUserId=");
		msg.append(staffUserId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityStaffMappingException(msg.toString());
	}

	/**
	 * Returns the first facility staff mapping in the ordered set where staffUserId = &#63;.
	 *
	 * @param staffUserId the staff user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility staff mapping, or <code>null</code> if a matching facility staff mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityStaffMapping fetchByFacilityStaffByStaffUserId_First(
		long staffUserId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FacilityStaffMapping> list = findByFacilityStaffByStaffUserId(staffUserId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility staff mapping in the ordered set where staffUserId = &#63;.
	 *
	 * @param staffUserId the staff user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility staff mapping
	 * @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a matching facility staff mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityStaffMapping findByFacilityStaffByStaffUserId_Last(
		long staffUserId, OrderByComparator orderByComparator)
		throws NoSuchFacilityStaffMappingException, SystemException {
		FacilityStaffMapping facilityStaffMapping = fetchByFacilityStaffByStaffUserId_Last(staffUserId,
				orderByComparator);

		if (facilityStaffMapping != null) {
			return facilityStaffMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("staffUserId=");
		msg.append(staffUserId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityStaffMappingException(msg.toString());
	}

	/**
	 * Returns the last facility staff mapping in the ordered set where staffUserId = &#63;.
	 *
	 * @param staffUserId the staff user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility staff mapping, or <code>null</code> if a matching facility staff mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityStaffMapping fetchByFacilityStaffByStaffUserId_Last(
		long staffUserId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByFacilityStaffByStaffUserId(staffUserId);

		List<FacilityStaffMapping> list = findByFacilityStaffByStaffUserId(staffUserId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility staff mappings before and after the current facility staff mapping in the ordered set where staffUserId = &#63;.
	 *
	 * @param id the primary key of the current facility staff mapping
	 * @param staffUserId the staff user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility staff mapping
	 * @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a facility staff mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityStaffMapping[] findByFacilityStaffByStaffUserId_PrevAndNext(
		long id, long staffUserId, OrderByComparator orderByComparator)
		throws NoSuchFacilityStaffMappingException, SystemException {
		FacilityStaffMapping facilityStaffMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityStaffMapping[] array = new FacilityStaffMappingImpl[3];

			array[0] = getByFacilityStaffByStaffUserId_PrevAndNext(session,
					facilityStaffMapping, staffUserId, orderByComparator, true);

			array[1] = facilityStaffMapping;

			array[2] = getByFacilityStaffByStaffUserId_PrevAndNext(session,
					facilityStaffMapping, staffUserId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FacilityStaffMapping getByFacilityStaffByStaffUserId_PrevAndNext(
		Session session, FacilityStaffMapping facilityStaffMapping,
		long staffUserId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYSTAFFMAPPING_WHERE);

		query.append(_FINDER_COLUMN_FACILITYSTAFFBYSTAFFUSERID_STAFFUSERID_2);

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

		qPos.add(staffUserId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(facilityStaffMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityStaffMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility staff mappings.
	 *
	 * @return the facility staff mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityStaffMapping> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility staff mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facility staff mappings
	 * @param end the upper bound of the range of facility staff mappings (not inclusive)
	 * @return the range of facility staff mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityStaffMapping> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility staff mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facility staff mappings
	 * @param end the upper bound of the range of facility staff mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of facility staff mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityStaffMapping> findAll(int start, int end,
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

		List<FacilityStaffMapping> list = (List<FacilityStaffMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FACILITYSTAFFMAPPING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FACILITYSTAFFMAPPING;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<FacilityStaffMapping>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<FacilityStaffMapping>)QueryUtil.list(q,
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
	 * Removes all the facility staff mappings where facilityId = &#63; from the database.
	 *
	 * @param facilityId the facility ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityStaffByFacility(long facilityId)
		throws SystemException {
		for (FacilityStaffMapping facilityStaffMapping : findByFacilityStaffByFacility(
				facilityId)) {
			remove(facilityStaffMapping);
		}
	}

	/**
	 * Removes all the facility staff mappings where staffUserId = &#63; from the database.
	 *
	 * @param staffUserId the staff user ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityStaffByStaffUserId(long staffUserId)
		throws SystemException {
		for (FacilityStaffMapping facilityStaffMapping : findByFacilityStaffByStaffUserId(
				staffUserId)) {
			remove(facilityStaffMapping);
		}
	}

	/**
	 * Removes all the facility staff mappings from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (FacilityStaffMapping facilityStaffMapping : findAll()) {
			remove(facilityStaffMapping);
		}
	}

	/**
	 * Returns the number of facility staff mappings where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @return the number of matching facility staff mappings
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityStaffByFacility(long facilityId)
		throws SystemException {
		Object[] finderArgs = new Object[] { facilityId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYSTAFFBYFACILITY,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITYSTAFFMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYSTAFFBYFACILITY_FACILITYID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYSTAFFBYFACILITY,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility staff mappings where staffUserId = &#63;.
	 *
	 * @param staffUserId the staff user ID
	 * @return the number of matching facility staff mappings
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityStaffByStaffUserId(long staffUserId)
		throws SystemException {
		Object[] finderArgs = new Object[] { staffUserId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYSTAFFBYSTAFFUSERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITYSTAFFMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYSTAFFBYSTAFFUSERID_STAFFUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(staffUserId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYSTAFFBYSTAFFUSERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility staff mappings.
	 *
	 * @return the number of facility staff mappings
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FACILITYSTAFFMAPPING);

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
	 * Initializes the facility staff mapping persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.FacilityStaffMapping")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FacilityStaffMapping>> listenersList = new ArrayList<ModelListener<FacilityStaffMapping>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FacilityStaffMapping>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FacilityStaffMappingImpl.class.getName());
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
	private static final String _SQL_SELECT_FACILITYSTAFFMAPPING = "SELECT facilityStaffMapping FROM FacilityStaffMapping facilityStaffMapping";
	private static final String _SQL_SELECT_FACILITYSTAFFMAPPING_WHERE = "SELECT facilityStaffMapping FROM FacilityStaffMapping facilityStaffMapping WHERE ";
	private static final String _SQL_COUNT_FACILITYSTAFFMAPPING = "SELECT COUNT(facilityStaffMapping) FROM FacilityStaffMapping facilityStaffMapping";
	private static final String _SQL_COUNT_FACILITYSTAFFMAPPING_WHERE = "SELECT COUNT(facilityStaffMapping) FROM FacilityStaffMapping facilityStaffMapping WHERE ";
	private static final String _FINDER_COLUMN_FACILITYSTAFFBYFACILITY_FACILITYID_2 =
		"facilityStaffMapping.facilityId = ?";
	private static final String _FINDER_COLUMN_FACILITYSTAFFBYSTAFFUSERID_STAFFUSERID_2 =
		"facilityStaffMapping.staffUserId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "facilityStaffMapping.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FacilityStaffMapping exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FacilityStaffMapping exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FacilityStaffMappingPersistenceImpl.class);
	private static FacilityStaffMapping _nullFacilityStaffMapping = new FacilityStaffMappingImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FacilityStaffMapping> toCacheModel() {
				return _nullFacilityStaffMappingCacheModel;
			}
		};

	private static CacheModel<FacilityStaffMapping> _nullFacilityStaffMappingCacheModel =
		new CacheModel<FacilityStaffMapping>() {
			public FacilityStaffMapping toEntityModel() {
				return _nullFacilityStaffMapping;
			}
		};
}