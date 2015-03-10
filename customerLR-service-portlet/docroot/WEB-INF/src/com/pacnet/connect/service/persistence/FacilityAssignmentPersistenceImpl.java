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

import com.pacnet.connect.NoSuchFacilityAssignmentException;
import com.pacnet.connect.model.FacilityAssignment;
import com.pacnet.connect.model.impl.FacilityAssignmentImpl;
import com.pacnet.connect.model.impl.FacilityAssignmentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the facility assignment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityAssignmentPersistence
 * @see FacilityAssignmentUtil
 * @generated
 */
public class FacilityAssignmentPersistenceImpl extends BasePersistenceImpl<FacilityAssignment>
	implements FacilityAssignmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FacilityAssignmentUtil} to access the facility assignment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FacilityAssignmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYCUSTOMERID =
		new FinderPath(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAssignmentModelImpl.FINDER_CACHE_ENABLED,
			FacilityAssignmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityAssignmentByCustomerId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYCUSTOMERID =
		new FinderPath(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAssignmentModelImpl.FINDER_CACHE_ENABLED,
			FacilityAssignmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityAssignmentByCustomerId",
			new String[] { Long.class.getName() },
			FacilityAssignmentModelImpl.CUSTOMERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYASSIGNMENTBYCUSTOMERID =
		new FinderPath(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAssignmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityAssignmentByCustomerId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYFACILITY =
		new FinderPath(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAssignmentModelImpl.FINDER_CACHE_ENABLED,
			FacilityAssignmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityAssignmentByFacility",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYFACILITY =
		new FinderPath(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAssignmentModelImpl.FINDER_CACHE_ENABLED,
			FacilityAssignmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityAssignmentByFacility",
			new String[] { Long.class.getName() },
			FacilityAssignmentModelImpl.FACILTYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYASSIGNMENTBYFACILITY =
		new FinderPath(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAssignmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityAssignmentByFacility",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYSERVICE =
		new FinderPath(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAssignmentModelImpl.FINDER_CACHE_ENABLED,
			FacilityAssignmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityAssignmentByService",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYSERVICE =
		new FinderPath(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAssignmentModelImpl.FINDER_CACHE_ENABLED,
			FacilityAssignmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityAssignmentByService",
			new String[] { Long.class.getName() },
			FacilityAssignmentModelImpl.FACILITYSERVICEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYASSIGNMENTBYSERVICE =
		new FinderPath(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAssignmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityAssignmentByService",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAssignmentModelImpl.FINDER_CACHE_ENABLED,
			FacilityAssignmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAssignmentModelImpl.FINDER_CACHE_ENABLED,
			FacilityAssignmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAssignmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the facility assignment in the entity cache if it is enabled.
	 *
	 * @param facilityAssignment the facility assignment
	 */
	public void cacheResult(FacilityAssignment facilityAssignment) {
		EntityCacheUtil.putResult(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAssignmentImpl.class, facilityAssignment.getPrimaryKey(),
			facilityAssignment);

		facilityAssignment.resetOriginalValues();
	}

	/**
	 * Caches the facility assignments in the entity cache if it is enabled.
	 *
	 * @param facilityAssignments the facility assignments
	 */
	public void cacheResult(List<FacilityAssignment> facilityAssignments) {
		for (FacilityAssignment facilityAssignment : facilityAssignments) {
			if (EntityCacheUtil.getResult(
						FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
						FacilityAssignmentImpl.class,
						facilityAssignment.getPrimaryKey()) == null) {
				cacheResult(facilityAssignment);
			}
			else {
				facilityAssignment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all facility assignments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FacilityAssignmentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FacilityAssignmentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the facility assignment.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FacilityAssignment facilityAssignment) {
		EntityCacheUtil.removeResult(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAssignmentImpl.class, facilityAssignment.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FacilityAssignment> facilityAssignments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FacilityAssignment facilityAssignment : facilityAssignments) {
			EntityCacheUtil.removeResult(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
				FacilityAssignmentImpl.class, facilityAssignment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new facility assignment with the primary key. Does not add the facility assignment to the database.
	 *
	 * @param id the primary key for the new facility assignment
	 * @return the new facility assignment
	 */
	public FacilityAssignment create(long id) {
		FacilityAssignment facilityAssignment = new FacilityAssignmentImpl();

		facilityAssignment.setNew(true);
		facilityAssignment.setPrimaryKey(id);

		return facilityAssignment;
	}

	/**
	 * Removes the facility assignment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the facility assignment
	 * @return the facility assignment that was removed
	 * @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a facility assignment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment remove(long id)
		throws NoSuchFacilityAssignmentException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the facility assignment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the facility assignment
	 * @return the facility assignment that was removed
	 * @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a facility assignment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityAssignment remove(Serializable primaryKey)
		throws NoSuchFacilityAssignmentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FacilityAssignment facilityAssignment = (FacilityAssignment)session.get(FacilityAssignmentImpl.class,
					primaryKey);

			if (facilityAssignment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFacilityAssignmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(facilityAssignment);
		}
		catch (NoSuchFacilityAssignmentException nsee) {
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
	protected FacilityAssignment removeImpl(
		FacilityAssignment facilityAssignment) throws SystemException {
		facilityAssignment = toUnwrappedModel(facilityAssignment);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, facilityAssignment);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(facilityAssignment);

		return facilityAssignment;
	}

	@Override
	public FacilityAssignment updateImpl(
		com.pacnet.connect.model.FacilityAssignment facilityAssignment,
		boolean merge) throws SystemException {
		facilityAssignment = toUnwrappedModel(facilityAssignment);

		boolean isNew = facilityAssignment.isNew();

		FacilityAssignmentModelImpl facilityAssignmentModelImpl = (FacilityAssignmentModelImpl)facilityAssignment;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, facilityAssignment, merge);

			facilityAssignment.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FacilityAssignmentModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((facilityAssignmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYCUSTOMERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityAssignmentModelImpl.getOriginalCustomerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYASSIGNMENTBYCUSTOMERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYCUSTOMERID,
					args);

				args = new Object[] {
						Long.valueOf(facilityAssignmentModelImpl.getCustomerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYASSIGNMENTBYCUSTOMERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYCUSTOMERID,
					args);
			}

			if ((facilityAssignmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYFACILITY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityAssignmentModelImpl.getOriginalFaciltyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYASSIGNMENTBYFACILITY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYFACILITY,
					args);

				args = new Object[] {
						Long.valueOf(facilityAssignmentModelImpl.getFaciltyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYASSIGNMENTBYFACILITY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYFACILITY,
					args);
			}

			if ((facilityAssignmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYSERVICE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityAssignmentModelImpl.getOriginalFacilityServiceId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYASSIGNMENTBYSERVICE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYSERVICE,
					args);

				args = new Object[] {
						Long.valueOf(facilityAssignmentModelImpl.getFacilityServiceId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYASSIGNMENTBYSERVICE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYSERVICE,
					args);
			}
		}

		EntityCacheUtil.putResult(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAssignmentImpl.class, facilityAssignment.getPrimaryKey(),
			facilityAssignment);

		return facilityAssignment;
	}

	protected FacilityAssignment toUnwrappedModel(
		FacilityAssignment facilityAssignment) {
		if (facilityAssignment instanceof FacilityAssignmentImpl) {
			return facilityAssignment;
		}

		FacilityAssignmentImpl facilityAssignmentImpl = new FacilityAssignmentImpl();

		facilityAssignmentImpl.setNew(facilityAssignment.isNew());
		facilityAssignmentImpl.setPrimaryKey(facilityAssignment.getPrimaryKey());

		facilityAssignmentImpl.setId(facilityAssignment.getId());
		facilityAssignmentImpl.setCustomerId(facilityAssignment.getCustomerId());
		facilityAssignmentImpl.setFaciltyId(facilityAssignment.getFaciltyId());
		facilityAssignmentImpl.setFacilityServiceId(facilityAssignment.getFacilityServiceId());
		facilityAssignmentImpl.setIsActive(facilityAssignment.isIsActive());
		facilityAssignmentImpl.setCreatedOn(facilityAssignment.getCreatedOn());
		facilityAssignmentImpl.setCreatedBy(facilityAssignment.getCreatedBy());
		facilityAssignmentImpl.setUpdatedOn(facilityAssignment.getUpdatedOn());
		facilityAssignmentImpl.setUpdatedBy(facilityAssignment.getUpdatedBy());

		return facilityAssignmentImpl;
	}

	/**
	 * Returns the facility assignment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility assignment
	 * @return the facility assignment
	 * @throws com.liferay.portal.NoSuchModelException if a facility assignment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityAssignment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility assignment with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityAssignmentException} if it could not be found.
	 *
	 * @param id the primary key of the facility assignment
	 * @return the facility assignment
	 * @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a facility assignment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment findByPrimaryKey(long id)
		throws NoSuchFacilityAssignmentException, SystemException {
		FacilityAssignment facilityAssignment = fetchByPrimaryKey(id);

		if (facilityAssignment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchFacilityAssignmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return facilityAssignment;
	}

	/**
	 * Returns the facility assignment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility assignment
	 * @return the facility assignment, or <code>null</code> if a facility assignment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityAssignment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility assignment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the facility assignment
	 * @return the facility assignment, or <code>null</code> if a facility assignment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment fetchByPrimaryKey(long id)
		throws SystemException {
		FacilityAssignment facilityAssignment = (FacilityAssignment)EntityCacheUtil.getResult(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
				FacilityAssignmentImpl.class, id);

		if (facilityAssignment == _nullFacilityAssignment) {
			return null;
		}

		if (facilityAssignment == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				facilityAssignment = (FacilityAssignment)session.get(FacilityAssignmentImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (facilityAssignment != null) {
					cacheResult(facilityAssignment);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(FacilityAssignmentModelImpl.ENTITY_CACHE_ENABLED,
						FacilityAssignmentImpl.class, id,
						_nullFacilityAssignment);
				}

				closeSession(session);
			}
		}

		return facilityAssignment;
	}

	/**
	 * Returns all the facility assignments where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @return the matching facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAssignment> findByFacilityAssignmentByCustomerId(
		long customerId) throws SystemException {
		return findByFacilityAssignmentByCustomerId(customerId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility assignments where customerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param start the lower bound of the range of facility assignments
	 * @param end the upper bound of the range of facility assignments (not inclusive)
	 * @return the range of matching facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAssignment> findByFacilityAssignmentByCustomerId(
		long customerId, int start, int end) throws SystemException {
		return findByFacilityAssignmentByCustomerId(customerId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility assignments where customerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param start the lower bound of the range of facility assignments
	 * @param end the upper bound of the range of facility assignments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAssignment> findByFacilityAssignmentByCustomerId(
		long customerId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYCUSTOMERID;
			finderArgs = new Object[] { customerId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYCUSTOMERID;
			finderArgs = new Object[] { customerId, start, end, orderByComparator };
		}

		List<FacilityAssignment> list = (List<FacilityAssignment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityAssignment facilityAssignment : list) {
				if ((customerId != facilityAssignment.getCustomerId())) {
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

			query.append(_SQL_SELECT_FACILITYASSIGNMENT_WHERE);

			query.append(_FINDER_COLUMN_FACILITYASSIGNMENTBYCUSTOMERID_CUSTOMERID_2);

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

				list = (List<FacilityAssignment>)QueryUtil.list(q,
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
	 * Returns the first facility assignment in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility assignment
	 * @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment findByFacilityAssignmentByCustomerId_First(
		long customerId, OrderByComparator orderByComparator)
		throws NoSuchFacilityAssignmentException, SystemException {
		FacilityAssignment facilityAssignment = fetchByFacilityAssignmentByCustomerId_First(customerId,
				orderByComparator);

		if (facilityAssignment != null) {
			return facilityAssignment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityAssignmentException(msg.toString());
	}

	/**
	 * Returns the first facility assignment in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment fetchByFacilityAssignmentByCustomerId_First(
		long customerId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FacilityAssignment> list = findByFacilityAssignmentByCustomerId(customerId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility assignment in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility assignment
	 * @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment findByFacilityAssignmentByCustomerId_Last(
		long customerId, OrderByComparator orderByComparator)
		throws NoSuchFacilityAssignmentException, SystemException {
		FacilityAssignment facilityAssignment = fetchByFacilityAssignmentByCustomerId_Last(customerId,
				orderByComparator);

		if (facilityAssignment != null) {
			return facilityAssignment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityAssignmentException(msg.toString());
	}

	/**
	 * Returns the last facility assignment in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment fetchByFacilityAssignmentByCustomerId_Last(
		long customerId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByFacilityAssignmentByCustomerId(customerId);

		List<FacilityAssignment> list = findByFacilityAssignmentByCustomerId(customerId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility assignments before and after the current facility assignment in the ordered set where customerId = &#63;.
	 *
	 * @param id the primary key of the current facility assignment
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility assignment
	 * @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a facility assignment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment[] findByFacilityAssignmentByCustomerId_PrevAndNext(
		long id, long customerId, OrderByComparator orderByComparator)
		throws NoSuchFacilityAssignmentException, SystemException {
		FacilityAssignment facilityAssignment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityAssignment[] array = new FacilityAssignmentImpl[3];

			array[0] = getByFacilityAssignmentByCustomerId_PrevAndNext(session,
					facilityAssignment, customerId, orderByComparator, true);

			array[1] = facilityAssignment;

			array[2] = getByFacilityAssignmentByCustomerId_PrevAndNext(session,
					facilityAssignment, customerId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FacilityAssignment getByFacilityAssignmentByCustomerId_PrevAndNext(
		Session session, FacilityAssignment facilityAssignment,
		long customerId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYASSIGNMENT_WHERE);

		query.append(_FINDER_COLUMN_FACILITYASSIGNMENTBYCUSTOMERID_CUSTOMERID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(facilityAssignment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityAssignment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility assignments where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @return the matching facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAssignment> findByFacilityAssignmentByFacility(
		long faciltyId) throws SystemException {
		return findByFacilityAssignmentByFacility(faciltyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility assignments where faciltyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param faciltyId the facilty ID
	 * @param start the lower bound of the range of facility assignments
	 * @param end the upper bound of the range of facility assignments (not inclusive)
	 * @return the range of matching facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAssignment> findByFacilityAssignmentByFacility(
		long faciltyId, int start, int end) throws SystemException {
		return findByFacilityAssignmentByFacility(faciltyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility assignments where faciltyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param faciltyId the facilty ID
	 * @param start the lower bound of the range of facility assignments
	 * @param end the upper bound of the range of facility assignments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAssignment> findByFacilityAssignmentByFacility(
		long faciltyId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYFACILITY;
			finderArgs = new Object[] { faciltyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYFACILITY;
			finderArgs = new Object[] { faciltyId, start, end, orderByComparator };
		}

		List<FacilityAssignment> list = (List<FacilityAssignment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityAssignment facilityAssignment : list) {
				if ((faciltyId != facilityAssignment.getFaciltyId())) {
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

			query.append(_SQL_SELECT_FACILITYASSIGNMENT_WHERE);

			query.append(_FINDER_COLUMN_FACILITYASSIGNMENTBYFACILITY_FACILTYID_2);

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

				list = (List<FacilityAssignment>)QueryUtil.list(q,
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
	 * Returns the first facility assignment in the ordered set where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility assignment
	 * @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment findByFacilityAssignmentByFacility_First(
		long faciltyId, OrderByComparator orderByComparator)
		throws NoSuchFacilityAssignmentException, SystemException {
		FacilityAssignment facilityAssignment = fetchByFacilityAssignmentByFacility_First(faciltyId,
				orderByComparator);

		if (facilityAssignment != null) {
			return facilityAssignment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("faciltyId=");
		msg.append(faciltyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityAssignmentException(msg.toString());
	}

	/**
	 * Returns the first facility assignment in the ordered set where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment fetchByFacilityAssignmentByFacility_First(
		long faciltyId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FacilityAssignment> list = findByFacilityAssignmentByFacility(faciltyId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility assignment in the ordered set where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility assignment
	 * @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment findByFacilityAssignmentByFacility_Last(
		long faciltyId, OrderByComparator orderByComparator)
		throws NoSuchFacilityAssignmentException, SystemException {
		FacilityAssignment facilityAssignment = fetchByFacilityAssignmentByFacility_Last(faciltyId,
				orderByComparator);

		if (facilityAssignment != null) {
			return facilityAssignment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("faciltyId=");
		msg.append(faciltyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityAssignmentException(msg.toString());
	}

	/**
	 * Returns the last facility assignment in the ordered set where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment fetchByFacilityAssignmentByFacility_Last(
		long faciltyId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByFacilityAssignmentByFacility(faciltyId);

		List<FacilityAssignment> list = findByFacilityAssignmentByFacility(faciltyId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility assignments before and after the current facility assignment in the ordered set where faciltyId = &#63;.
	 *
	 * @param id the primary key of the current facility assignment
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility assignment
	 * @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a facility assignment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment[] findByFacilityAssignmentByFacility_PrevAndNext(
		long id, long faciltyId, OrderByComparator orderByComparator)
		throws NoSuchFacilityAssignmentException, SystemException {
		FacilityAssignment facilityAssignment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityAssignment[] array = new FacilityAssignmentImpl[3];

			array[0] = getByFacilityAssignmentByFacility_PrevAndNext(session,
					facilityAssignment, faciltyId, orderByComparator, true);

			array[1] = facilityAssignment;

			array[2] = getByFacilityAssignmentByFacility_PrevAndNext(session,
					facilityAssignment, faciltyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FacilityAssignment getByFacilityAssignmentByFacility_PrevAndNext(
		Session session, FacilityAssignment facilityAssignment, long faciltyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYASSIGNMENT_WHERE);

		query.append(_FINDER_COLUMN_FACILITYASSIGNMENTBYFACILITY_FACILTYID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(facilityAssignment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityAssignment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility assignments where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @return the matching facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAssignment> findByFacilityAssignmentByService(
		long facilityServiceId) throws SystemException {
		return findByFacilityAssignmentByService(facilityServiceId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility assignments where facilityServiceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityServiceId the facility service ID
	 * @param start the lower bound of the range of facility assignments
	 * @param end the upper bound of the range of facility assignments (not inclusive)
	 * @return the range of matching facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAssignment> findByFacilityAssignmentByService(
		long facilityServiceId, int start, int end) throws SystemException {
		return findByFacilityAssignmentByService(facilityServiceId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the facility assignments where facilityServiceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityServiceId the facility service ID
	 * @param start the lower bound of the range of facility assignments
	 * @param end the upper bound of the range of facility assignments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAssignment> findByFacilityAssignmentByService(
		long facilityServiceId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYSERVICE;
			finderArgs = new Object[] { facilityServiceId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYASSIGNMENTBYSERVICE;
			finderArgs = new Object[] {
					facilityServiceId,
					
					start, end, orderByComparator
				};
		}

		List<FacilityAssignment> list = (List<FacilityAssignment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityAssignment facilityAssignment : list) {
				if ((facilityServiceId != facilityAssignment.getFacilityServiceId())) {
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

			query.append(_SQL_SELECT_FACILITYASSIGNMENT_WHERE);

			query.append(_FINDER_COLUMN_FACILITYASSIGNMENTBYSERVICE_FACILITYSERVICEID_2);

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

				list = (List<FacilityAssignment>)QueryUtil.list(q,
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
	 * Returns the first facility assignment in the ordered set where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility assignment
	 * @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment findByFacilityAssignmentByService_First(
		long facilityServiceId, OrderByComparator orderByComparator)
		throws NoSuchFacilityAssignmentException, SystemException {
		FacilityAssignment facilityAssignment = fetchByFacilityAssignmentByService_First(facilityServiceId,
				orderByComparator);

		if (facilityAssignment != null) {
			return facilityAssignment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityServiceId=");
		msg.append(facilityServiceId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityAssignmentException(msg.toString());
	}

	/**
	 * Returns the first facility assignment in the ordered set where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment fetchByFacilityAssignmentByService_First(
		long facilityServiceId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FacilityAssignment> list = findByFacilityAssignmentByService(facilityServiceId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility assignment in the ordered set where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility assignment
	 * @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment findByFacilityAssignmentByService_Last(
		long facilityServiceId, OrderByComparator orderByComparator)
		throws NoSuchFacilityAssignmentException, SystemException {
		FacilityAssignment facilityAssignment = fetchByFacilityAssignmentByService_Last(facilityServiceId,
				orderByComparator);

		if (facilityAssignment != null) {
			return facilityAssignment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityServiceId=");
		msg.append(facilityServiceId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityAssignmentException(msg.toString());
	}

	/**
	 * Returns the last facility assignment in the ordered set where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment fetchByFacilityAssignmentByService_Last(
		long facilityServiceId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByFacilityAssignmentByService(facilityServiceId);

		List<FacilityAssignment> list = findByFacilityAssignmentByService(facilityServiceId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility assignments before and after the current facility assignment in the ordered set where facilityServiceId = &#63;.
	 *
	 * @param id the primary key of the current facility assignment
	 * @param facilityServiceId the facility service ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility assignment
	 * @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a facility assignment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAssignment[] findByFacilityAssignmentByService_PrevAndNext(
		long id, long facilityServiceId, OrderByComparator orderByComparator)
		throws NoSuchFacilityAssignmentException, SystemException {
		FacilityAssignment facilityAssignment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityAssignment[] array = new FacilityAssignmentImpl[3];

			array[0] = getByFacilityAssignmentByService_PrevAndNext(session,
					facilityAssignment, facilityServiceId, orderByComparator,
					true);

			array[1] = facilityAssignment;

			array[2] = getByFacilityAssignmentByService_PrevAndNext(session,
					facilityAssignment, facilityServiceId, orderByComparator,
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

	protected FacilityAssignment getByFacilityAssignmentByService_PrevAndNext(
		Session session, FacilityAssignment facilityAssignment,
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

		query.append(_SQL_SELECT_FACILITYASSIGNMENT_WHERE);

		query.append(_FINDER_COLUMN_FACILITYASSIGNMENTBYSERVICE_FACILITYSERVICEID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(facilityAssignment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityAssignment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility assignments.
	 *
	 * @return the facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAssignment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility assignments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facility assignments
	 * @param end the upper bound of the range of facility assignments (not inclusive)
	 * @return the range of facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAssignment> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility assignments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facility assignments
	 * @param end the upper bound of the range of facility assignments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAssignment> findAll(int start, int end,
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

		List<FacilityAssignment> list = (List<FacilityAssignment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FACILITYASSIGNMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FACILITYASSIGNMENT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<FacilityAssignment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<FacilityAssignment>)QueryUtil.list(q,
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
	 * Removes all the facility assignments where customerId = &#63; from the database.
	 *
	 * @param customerId the customer ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityAssignmentByCustomerId(long customerId)
		throws SystemException {
		for (FacilityAssignment facilityAssignment : findByFacilityAssignmentByCustomerId(
				customerId)) {
			remove(facilityAssignment);
		}
	}

	/**
	 * Removes all the facility assignments where faciltyId = &#63; from the database.
	 *
	 * @param faciltyId the facilty ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityAssignmentByFacility(long faciltyId)
		throws SystemException {
		for (FacilityAssignment facilityAssignment : findByFacilityAssignmentByFacility(
				faciltyId)) {
			remove(facilityAssignment);
		}
	}

	/**
	 * Removes all the facility assignments where facilityServiceId = &#63; from the database.
	 *
	 * @param facilityServiceId the facility service ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityAssignmentByService(long facilityServiceId)
		throws SystemException {
		for (FacilityAssignment facilityAssignment : findByFacilityAssignmentByService(
				facilityServiceId)) {
			remove(facilityAssignment);
		}
	}

	/**
	 * Removes all the facility assignments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (FacilityAssignment facilityAssignment : findAll()) {
			remove(facilityAssignment);
		}
	}

	/**
	 * Returns the number of facility assignments where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @return the number of matching facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityAssignmentByCustomerId(long customerId)
		throws SystemException {
		Object[] finderArgs = new Object[] { customerId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYASSIGNMENTBYCUSTOMERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITYASSIGNMENT_WHERE);

			query.append(_FINDER_COLUMN_FACILITYASSIGNMENTBYCUSTOMERID_CUSTOMERID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYASSIGNMENTBYCUSTOMERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility assignments where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @return the number of matching facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityAssignmentByFacility(long faciltyId)
		throws SystemException {
		Object[] finderArgs = new Object[] { faciltyId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYASSIGNMENTBYFACILITY,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITYASSIGNMENT_WHERE);

			query.append(_FINDER_COLUMN_FACILITYASSIGNMENTBYFACILITY_FACILTYID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYASSIGNMENTBYFACILITY,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility assignments where facilityServiceId = &#63;.
	 *
	 * @param facilityServiceId the facility service ID
	 * @return the number of matching facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityAssignmentByService(long facilityServiceId)
		throws SystemException {
		Object[] finderArgs = new Object[] { facilityServiceId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYASSIGNMENTBYSERVICE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITYASSIGNMENT_WHERE);

			query.append(_FINDER_COLUMN_FACILITYASSIGNMENTBYSERVICE_FACILITYSERVICEID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYASSIGNMENTBYSERVICE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility assignments.
	 *
	 * @return the number of facility assignments
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FACILITYASSIGNMENT);

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
	 * Initializes the facility assignment persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.FacilityAssignment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FacilityAssignment>> listenersList = new ArrayList<ModelListener<FacilityAssignment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FacilityAssignment>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FacilityAssignmentImpl.class.getName());
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
	private static final String _SQL_SELECT_FACILITYASSIGNMENT = "SELECT facilityAssignment FROM FacilityAssignment facilityAssignment";
	private static final String _SQL_SELECT_FACILITYASSIGNMENT_WHERE = "SELECT facilityAssignment FROM FacilityAssignment facilityAssignment WHERE ";
	private static final String _SQL_COUNT_FACILITYASSIGNMENT = "SELECT COUNT(facilityAssignment) FROM FacilityAssignment facilityAssignment";
	private static final String _SQL_COUNT_FACILITYASSIGNMENT_WHERE = "SELECT COUNT(facilityAssignment) FROM FacilityAssignment facilityAssignment WHERE ";
	private static final String _FINDER_COLUMN_FACILITYASSIGNMENTBYCUSTOMERID_CUSTOMERID_2 =
		"facilityAssignment.customerId = ?";
	private static final String _FINDER_COLUMN_FACILITYASSIGNMENTBYFACILITY_FACILTYID_2 =
		"facilityAssignment.faciltyId = ?";
	private static final String _FINDER_COLUMN_FACILITYASSIGNMENTBYSERVICE_FACILITYSERVICEID_2 =
		"facilityAssignment.facilityServiceId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "facilityAssignment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FacilityAssignment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FacilityAssignment exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FacilityAssignmentPersistenceImpl.class);
	private static FacilityAssignment _nullFacilityAssignment = new FacilityAssignmentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FacilityAssignment> toCacheModel() {
				return _nullFacilityAssignmentCacheModel;
			}
		};

	private static CacheModel<FacilityAssignment> _nullFacilityAssignmentCacheModel =
		new CacheModel<FacilityAssignment>() {
			public FacilityAssignment toEntityModel() {
				return _nullFacilityAssignment;
			}
		};
}