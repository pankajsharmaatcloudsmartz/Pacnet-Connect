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

import com.pacnet.connect.NoSuchFacilityException;
import com.pacnet.connect.model.Facility;
import com.pacnet.connect.model.impl.FacilityImpl;
import com.pacnet.connect.model.impl.FacilityModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the facility service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityPersistence
 * @see FacilityUtil
 * @generated
 */
public class FacilityPersistenceImpl extends BasePersistenceImpl<Facility>
	implements FacilityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FacilityUtil} to access the facility persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FacilityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYNAME =
		new FinderPath(FacilityModelImpl.ENTITY_CACHE_ENABLED,
			FacilityModelImpl.FINDER_CACHE_ENABLED, FacilityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFacilityName",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYNAME =
		new FinderPath(FacilityModelImpl.ENTITY_CACHE_ENABLED,
			FacilityModelImpl.FINDER_CACHE_ENABLED, FacilityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFacilityName",
			new String[] { String.class.getName() },
			FacilityModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYNAME = new FinderPath(FacilityModelImpl.ENTITY_CACHE_ENABLED,
			FacilityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFacilityName",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYBYCOUNTRYID =
		new FinderPath(FacilityModelImpl.ENTITY_CACHE_ENABLED,
			FacilityModelImpl.FINDER_CACHE_ENABLED, FacilityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityByCountryId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYCOUNTRYID =
		new FinderPath(FacilityModelImpl.ENTITY_CACHE_ENABLED,
			FacilityModelImpl.FINDER_CACHE_ENABLED, FacilityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityByCountryId", new String[] { Long.class.getName() },
			FacilityModelImpl.COUNTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYBYCOUNTRYID = new FinderPath(FacilityModelImpl.ENTITY_CACHE_ENABLED,
			FacilityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityByCountryId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYBYMANAGERID =
		new FinderPath(FacilityModelImpl.ENTITY_CACHE_ENABLED,
			FacilityModelImpl.FINDER_CACHE_ENABLED, FacilityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityByManagerId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYMANAGERID =
		new FinderPath(FacilityModelImpl.ENTITY_CACHE_ENABLED,
			FacilityModelImpl.FINDER_CACHE_ENABLED, FacilityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityByManagerId", new String[] { Long.class.getName() },
			FacilityModelImpl.MANAGERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYBYMANAGERID = new FinderPath(FacilityModelImpl.ENTITY_CACHE_ENABLED,
			FacilityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityByManagerId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FacilityModelImpl.ENTITY_CACHE_ENABLED,
			FacilityModelImpl.FINDER_CACHE_ENABLED, FacilityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FacilityModelImpl.ENTITY_CACHE_ENABLED,
			FacilityModelImpl.FINDER_CACHE_ENABLED, FacilityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FacilityModelImpl.ENTITY_CACHE_ENABLED,
			FacilityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the facility in the entity cache if it is enabled.
	 *
	 * @param facility the facility
	 */
	public void cacheResult(Facility facility) {
		EntityCacheUtil.putResult(FacilityModelImpl.ENTITY_CACHE_ENABLED,
			FacilityImpl.class, facility.getPrimaryKey(), facility);

		facility.resetOriginalValues();
	}

	/**
	 * Caches the facilities in the entity cache if it is enabled.
	 *
	 * @param facilities the facilities
	 */
	public void cacheResult(List<Facility> facilities) {
		for (Facility facility : facilities) {
			if (EntityCacheUtil.getResult(
						FacilityModelImpl.ENTITY_CACHE_ENABLED,
						FacilityImpl.class, facility.getPrimaryKey()) == null) {
				cacheResult(facility);
			}
			else {
				facility.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all facilities.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FacilityImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FacilityImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the facility.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Facility facility) {
		EntityCacheUtil.removeResult(FacilityModelImpl.ENTITY_CACHE_ENABLED,
			FacilityImpl.class, facility.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Facility> facilities) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Facility facility : facilities) {
			EntityCacheUtil.removeResult(FacilityModelImpl.ENTITY_CACHE_ENABLED,
				FacilityImpl.class, facility.getPrimaryKey());
		}
	}

	/**
	 * Creates a new facility with the primary key. Does not add the facility to the database.
	 *
	 * @param id the primary key for the new facility
	 * @return the new facility
	 */
	public Facility create(long id) {
		Facility facility = new FacilityImpl();

		facility.setNew(true);
		facility.setPrimaryKey(id);

		return facility;
	}

	/**
	 * Removes the facility with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the facility
	 * @return the facility that was removed
	 * @throws com.pacnet.connect.NoSuchFacilityException if a facility with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility remove(long id)
		throws NoSuchFacilityException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the facility with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the facility
	 * @return the facility that was removed
	 * @throws com.pacnet.connect.NoSuchFacilityException if a facility with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Facility remove(Serializable primaryKey)
		throws NoSuchFacilityException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Facility facility = (Facility)session.get(FacilityImpl.class,
					primaryKey);

			if (facility == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFacilityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(facility);
		}
		catch (NoSuchFacilityException nsee) {
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
	protected Facility removeImpl(Facility facility) throws SystemException {
		facility = toUnwrappedModel(facility);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, facility);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(facility);

		return facility;
	}

	@Override
	public Facility updateImpl(com.pacnet.connect.model.Facility facility,
		boolean merge) throws SystemException {
		facility = toUnwrappedModel(facility);

		boolean isNew = facility.isNew();

		FacilityModelImpl facilityModelImpl = (FacilityModelImpl)facility;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, facility, merge);

			facility.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FacilityModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((facilityModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { facilityModelImpl.getOriginalName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYNAME,
					args);

				args = new Object[] { facilityModelImpl.getName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYNAME,
					args);
			}

			if ((facilityModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYCOUNTRYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityModelImpl.getOriginalCountryId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYBYCOUNTRYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYCOUNTRYID,
					args);

				args = new Object[] {
						Long.valueOf(facilityModelImpl.getCountryId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYBYCOUNTRYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYCOUNTRYID,
					args);
			}

			if ((facilityModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYMANAGERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityModelImpl.getOriginalManagerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYBYMANAGERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYMANAGERID,
					args);

				args = new Object[] {
						Long.valueOf(facilityModelImpl.getManagerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYBYMANAGERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYMANAGERID,
					args);
			}
		}

		EntityCacheUtil.putResult(FacilityModelImpl.ENTITY_CACHE_ENABLED,
			FacilityImpl.class, facility.getPrimaryKey(), facility);

		return facility;
	}

	protected Facility toUnwrappedModel(Facility facility) {
		if (facility instanceof FacilityImpl) {
			return facility;
		}

		FacilityImpl facilityImpl = new FacilityImpl();

		facilityImpl.setNew(facility.isNew());
		facilityImpl.setPrimaryKey(facility.getPrimaryKey());

		facilityImpl.setId(facility.getId());
		facilityImpl.setName(facility.getName());
		facilityImpl.setAddress(facility.getAddress());
		facilityImpl.setPhoneNumber(facility.getPhoneNumber());
		facilityImpl.setCity(facility.getCity());
		facilityImpl.setStateId(facility.getStateId());
		facilityImpl.setCountryId(facility.getCountryId());
		facilityImpl.setIsThirdParty(facility.getIsThirdParty());
		facilityImpl.setManagerId(facility.getManagerId());
		facilityImpl.setEscalationEmail(facility.getEscalationEmail());
		facilityImpl.setIsActive(facility.isIsActive());
		facilityImpl.setCreatedOn(facility.getCreatedOn());
		facilityImpl.setCreatedBy(facility.getCreatedBy());
		facilityImpl.setUpdatedOn(facility.getUpdatedOn());
		facilityImpl.setUpdatedBy(facility.getUpdatedBy());
		facilityImpl.setTimezone(facility.getTimezone());

		return facilityImpl;
	}

	/**
	 * Returns the facility with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility
	 * @return the facility
	 * @throws com.liferay.portal.NoSuchModelException if a facility with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Facility findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityException} if it could not be found.
	 *
	 * @param id the primary key of the facility
	 * @return the facility
	 * @throws com.pacnet.connect.NoSuchFacilityException if a facility with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility findByPrimaryKey(long id)
		throws NoSuchFacilityException, SystemException {
		Facility facility = fetchByPrimaryKey(id);

		if (facility == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchFacilityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return facility;
	}

	/**
	 * Returns the facility with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility
	 * @return the facility, or <code>null</code> if a facility with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Facility fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the facility
	 * @return the facility, or <code>null</code> if a facility with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility fetchByPrimaryKey(long id) throws SystemException {
		Facility facility = (Facility)EntityCacheUtil.getResult(FacilityModelImpl.ENTITY_CACHE_ENABLED,
				FacilityImpl.class, id);

		if (facility == _nullFacility) {
			return null;
		}

		if (facility == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				facility = (Facility)session.get(FacilityImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (facility != null) {
					cacheResult(facility);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(FacilityModelImpl.ENTITY_CACHE_ENABLED,
						FacilityImpl.class, id, _nullFacility);
				}

				closeSession(session);
			}
		}

		return facility;
	}

	/**
	 * Returns all the facilities where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching facilities
	 * @throws SystemException if a system exception occurred
	 */
	public List<Facility> findByFacilityName(String name)
		throws SystemException {
		return findByFacilityName(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the facilities where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of facilities
	 * @param end the upper bound of the range of facilities (not inclusive)
	 * @return the range of matching facilities
	 * @throws SystemException if a system exception occurred
	 */
	public List<Facility> findByFacilityName(String name, int start, int end)
		throws SystemException {
		return findByFacilityName(name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the facilities where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of facilities
	 * @param end the upper bound of the range of facilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facilities
	 * @throws SystemException if a system exception occurred
	 */
	public List<Facility> findByFacilityName(String name, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYNAME;
			finderArgs = new Object[] { name };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYNAME;
			finderArgs = new Object[] { name, start, end, orderByComparator };
		}

		List<Facility> list = (List<Facility>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Facility facility : list) {
				if (!Validator.equals(name, facility.getName())) {
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

			query.append(_SQL_SELECT_FACILITY_WHERE);

			if (name == null) {
				query.append(_FINDER_COLUMN_FACILITYNAME_NAME_1);
			}
			else {
				if (name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FACILITYNAME_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_FACILITYNAME_NAME_2);
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

				if (name != null) {
					qPos.add(name);
				}

				list = (List<Facility>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first facility in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility
	 * @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility findByFacilityName_First(String name,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityException, SystemException {
		Facility facility = fetchByFacilityName_First(name, orderByComparator);

		if (facility != null) {
			return facility;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityException(msg.toString());
	}

	/**
	 * Returns the first facility in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility, or <code>null</code> if a matching facility could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility fetchByFacilityName_First(String name,
		OrderByComparator orderByComparator) throws SystemException {
		List<Facility> list = findByFacilityName(name, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility
	 * @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility findByFacilityName_Last(String name,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityException, SystemException {
		Facility facility = fetchByFacilityName_Last(name, orderByComparator);

		if (facility != null) {
			return facility;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityException(msg.toString());
	}

	/**
	 * Returns the last facility in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility, or <code>null</code> if a matching facility could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility fetchByFacilityName_Last(String name,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFacilityName(name);

		List<Facility> list = findByFacilityName(name, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facilities before and after the current facility in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current facility
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility
	 * @throws com.pacnet.connect.NoSuchFacilityException if a facility with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility[] findByFacilityName_PrevAndNext(long id, String name,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityException, SystemException {
		Facility facility = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Facility[] array = new FacilityImpl[3];

			array[0] = getByFacilityName_PrevAndNext(session, facility, name,
					orderByComparator, true);

			array[1] = facility;

			array[2] = getByFacilityName_PrevAndNext(session, facility, name,
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

	protected Facility getByFacilityName_PrevAndNext(Session session,
		Facility facility, String name, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITY_WHERE);

		if (name == null) {
			query.append(_FINDER_COLUMN_FACILITYNAME_NAME_1);
		}
		else {
			if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FACILITYNAME_NAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_FACILITYNAME_NAME_2);
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

		if (name != null) {
			qPos.add(name);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(facility);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Facility> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facilities where countryId = &#63;.
	 *
	 * @param countryId the country ID
	 * @return the matching facilities
	 * @throws SystemException if a system exception occurred
	 */
	public List<Facility> findByFacilityByCountryId(long countryId)
		throws SystemException {
		return findByFacilityByCountryId(countryId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facilities where countryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param countryId the country ID
	 * @param start the lower bound of the range of facilities
	 * @param end the upper bound of the range of facilities (not inclusive)
	 * @return the range of matching facilities
	 * @throws SystemException if a system exception occurred
	 */
	public List<Facility> findByFacilityByCountryId(long countryId, int start,
		int end) throws SystemException {
		return findByFacilityByCountryId(countryId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the facilities where countryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param countryId the country ID
	 * @param start the lower bound of the range of facilities
	 * @param end the upper bound of the range of facilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facilities
	 * @throws SystemException if a system exception occurred
	 */
	public List<Facility> findByFacilityByCountryId(long countryId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYCOUNTRYID;
			finderArgs = new Object[] { countryId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYBYCOUNTRYID;
			finderArgs = new Object[] { countryId, start, end, orderByComparator };
		}

		List<Facility> list = (List<Facility>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Facility facility : list) {
				if ((countryId != facility.getCountryId())) {
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

			query.append(_SQL_SELECT_FACILITY_WHERE);

			query.append(_FINDER_COLUMN_FACILITYBYCOUNTRYID_COUNTRYID_2);

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

				qPos.add(countryId);

				list = (List<Facility>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first facility in the ordered set where countryId = &#63;.
	 *
	 * @param countryId the country ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility
	 * @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility findByFacilityByCountryId_First(long countryId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityException, SystemException {
		Facility facility = fetchByFacilityByCountryId_First(countryId,
				orderByComparator);

		if (facility != null) {
			return facility;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("countryId=");
		msg.append(countryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityException(msg.toString());
	}

	/**
	 * Returns the first facility in the ordered set where countryId = &#63;.
	 *
	 * @param countryId the country ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility, or <code>null</code> if a matching facility could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility fetchByFacilityByCountryId_First(long countryId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Facility> list = findByFacilityByCountryId(countryId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility in the ordered set where countryId = &#63;.
	 *
	 * @param countryId the country ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility
	 * @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility findByFacilityByCountryId_Last(long countryId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityException, SystemException {
		Facility facility = fetchByFacilityByCountryId_Last(countryId,
				orderByComparator);

		if (facility != null) {
			return facility;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("countryId=");
		msg.append(countryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityException(msg.toString());
	}

	/**
	 * Returns the last facility in the ordered set where countryId = &#63;.
	 *
	 * @param countryId the country ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility, or <code>null</code> if a matching facility could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility fetchByFacilityByCountryId_Last(long countryId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFacilityByCountryId(countryId);

		List<Facility> list = findByFacilityByCountryId(countryId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facilities before and after the current facility in the ordered set where countryId = &#63;.
	 *
	 * @param id the primary key of the current facility
	 * @param countryId the country ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility
	 * @throws com.pacnet.connect.NoSuchFacilityException if a facility with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility[] findByFacilityByCountryId_PrevAndNext(long id,
		long countryId, OrderByComparator orderByComparator)
		throws NoSuchFacilityException, SystemException {
		Facility facility = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Facility[] array = new FacilityImpl[3];

			array[0] = getByFacilityByCountryId_PrevAndNext(session, facility,
					countryId, orderByComparator, true);

			array[1] = facility;

			array[2] = getByFacilityByCountryId_PrevAndNext(session, facility,
					countryId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Facility getByFacilityByCountryId_PrevAndNext(Session session,
		Facility facility, long countryId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITY_WHERE);

		query.append(_FINDER_COLUMN_FACILITYBYCOUNTRYID_COUNTRYID_2);

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

		qPos.add(countryId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(facility);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Facility> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facilities where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @return the matching facilities
	 * @throws SystemException if a system exception occurred
	 */
	public List<Facility> findByFacilityByManagerId(long managerId)
		throws SystemException {
		return findByFacilityByManagerId(managerId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facilities where managerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param managerId the manager ID
	 * @param start the lower bound of the range of facilities
	 * @param end the upper bound of the range of facilities (not inclusive)
	 * @return the range of matching facilities
	 * @throws SystemException if a system exception occurred
	 */
	public List<Facility> findByFacilityByManagerId(long managerId, int start,
		int end) throws SystemException {
		return findByFacilityByManagerId(managerId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the facilities where managerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param managerId the manager ID
	 * @param start the lower bound of the range of facilities
	 * @param end the upper bound of the range of facilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facilities
	 * @throws SystemException if a system exception occurred
	 */
	public List<Facility> findByFacilityByManagerId(long managerId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYMANAGERID;
			finderArgs = new Object[] { managerId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYBYMANAGERID;
			finderArgs = new Object[] { managerId, start, end, orderByComparator };
		}

		List<Facility> list = (List<Facility>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Facility facility : list) {
				if ((managerId != facility.getManagerId())) {
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

			query.append(_SQL_SELECT_FACILITY_WHERE);

			query.append(_FINDER_COLUMN_FACILITYBYMANAGERID_MANAGERID_2);

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

				qPos.add(managerId);

				list = (List<Facility>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first facility in the ordered set where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility
	 * @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility findByFacilityByManagerId_First(long managerId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityException, SystemException {
		Facility facility = fetchByFacilityByManagerId_First(managerId,
				orderByComparator);

		if (facility != null) {
			return facility;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("managerId=");
		msg.append(managerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityException(msg.toString());
	}

	/**
	 * Returns the first facility in the ordered set where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility, or <code>null</code> if a matching facility could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility fetchByFacilityByManagerId_First(long managerId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Facility> list = findByFacilityByManagerId(managerId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility in the ordered set where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility
	 * @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility findByFacilityByManagerId_Last(long managerId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityException, SystemException {
		Facility facility = fetchByFacilityByManagerId_Last(managerId,
				orderByComparator);

		if (facility != null) {
			return facility;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("managerId=");
		msg.append(managerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityException(msg.toString());
	}

	/**
	 * Returns the last facility in the ordered set where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility, or <code>null</code> if a matching facility could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility fetchByFacilityByManagerId_Last(long managerId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFacilityByManagerId(managerId);

		List<Facility> list = findByFacilityByManagerId(managerId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facilities before and after the current facility in the ordered set where managerId = &#63;.
	 *
	 * @param id the primary key of the current facility
	 * @param managerId the manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility
	 * @throws com.pacnet.connect.NoSuchFacilityException if a facility with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Facility[] findByFacilityByManagerId_PrevAndNext(long id,
		long managerId, OrderByComparator orderByComparator)
		throws NoSuchFacilityException, SystemException {
		Facility facility = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Facility[] array = new FacilityImpl[3];

			array[0] = getByFacilityByManagerId_PrevAndNext(session, facility,
					managerId, orderByComparator, true);

			array[1] = facility;

			array[2] = getByFacilityByManagerId_PrevAndNext(session, facility,
					managerId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Facility getByFacilityByManagerId_PrevAndNext(Session session,
		Facility facility, long managerId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITY_WHERE);

		query.append(_FINDER_COLUMN_FACILITYBYMANAGERID_MANAGERID_2);

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

		qPos.add(managerId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(facility);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Facility> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facilities.
	 *
	 * @return the facilities
	 * @throws SystemException if a system exception occurred
	 */
	public List<Facility> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facilities
	 * @param end the upper bound of the range of facilities (not inclusive)
	 * @return the range of facilities
	 * @throws SystemException if a system exception occurred
	 */
	public List<Facility> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the facilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facilities
	 * @param end the upper bound of the range of facilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of facilities
	 * @throws SystemException if a system exception occurred
	 */
	public List<Facility> findAll(int start, int end,
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

		List<Facility> list = (List<Facility>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FACILITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FACILITY;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Facility>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Facility>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the facilities where name = &#63; from the database.
	 *
	 * @param name the name
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityName(String name) throws SystemException {
		for (Facility facility : findByFacilityName(name)) {
			remove(facility);
		}
	}

	/**
	 * Removes all the facilities where countryId = &#63; from the database.
	 *
	 * @param countryId the country ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityByCountryId(long countryId)
		throws SystemException {
		for (Facility facility : findByFacilityByCountryId(countryId)) {
			remove(facility);
		}
	}

	/**
	 * Removes all the facilities where managerId = &#63; from the database.
	 *
	 * @param managerId the manager ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityByManagerId(long managerId)
		throws SystemException {
		for (Facility facility : findByFacilityByManagerId(managerId)) {
			remove(facility);
		}
	}

	/**
	 * Removes all the facilities from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Facility facility : findAll()) {
			remove(facility);
		}
	}

	/**
	 * Returns the number of facilities where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching facilities
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityName(String name) throws SystemException {
		Object[] finderArgs = new Object[] { name };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYNAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITY_WHERE);

			if (name == null) {
				query.append(_FINDER_COLUMN_FACILITYNAME_NAME_1);
			}
			else {
				if (name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FACILITYNAME_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_FACILITYNAME_NAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (name != null) {
					qPos.add(name);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYNAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facilities where countryId = &#63;.
	 *
	 * @param countryId the country ID
	 * @return the number of matching facilities
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityByCountryId(long countryId)
		throws SystemException {
		Object[] finderArgs = new Object[] { countryId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYBYCOUNTRYID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITY_WHERE);

			query.append(_FINDER_COLUMN_FACILITYBYCOUNTRYID_COUNTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(countryId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYBYCOUNTRYID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facilities where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @return the number of matching facilities
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityByManagerId(long managerId)
		throws SystemException {
		Object[] finderArgs = new Object[] { managerId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYBYMANAGERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITY_WHERE);

			query.append(_FINDER_COLUMN_FACILITYBYMANAGERID_MANAGERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(managerId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYBYMANAGERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facilities.
	 *
	 * @return the number of facilities
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FACILITY);

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
	 * Initializes the facility persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.Facility")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Facility>> listenersList = new ArrayList<ModelListener<Facility>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Facility>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FacilityImpl.class.getName());
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
	private static final String _SQL_SELECT_FACILITY = "SELECT facility FROM Facility facility";
	private static final String _SQL_SELECT_FACILITY_WHERE = "SELECT facility FROM Facility facility WHERE ";
	private static final String _SQL_COUNT_FACILITY = "SELECT COUNT(facility) FROM Facility facility";
	private static final String _SQL_COUNT_FACILITY_WHERE = "SELECT COUNT(facility) FROM Facility facility WHERE ";
	private static final String _FINDER_COLUMN_FACILITYNAME_NAME_1 = "facility.name IS NULL";
	private static final String _FINDER_COLUMN_FACILITYNAME_NAME_2 = "facility.name = ?";
	private static final String _FINDER_COLUMN_FACILITYNAME_NAME_3 = "(facility.name IS NULL OR facility.name = ?)";
	private static final String _FINDER_COLUMN_FACILITYBYCOUNTRYID_COUNTRYID_2 = "facility.countryId = ?";
	private static final String _FINDER_COLUMN_FACILITYBYMANAGERID_MANAGERID_2 = "facility.managerId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "facility.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Facility exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Facility exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FacilityPersistenceImpl.class);
	private static Facility _nullFacility = new FacilityImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Facility> toCacheModel() {
				return _nullFacilityCacheModel;
			}
		};

	private static CacheModel<Facility> _nullFacilityCacheModel = new CacheModel<Facility>() {
			public Facility toEntityModel() {
				return _nullFacility;
			}
		};
}