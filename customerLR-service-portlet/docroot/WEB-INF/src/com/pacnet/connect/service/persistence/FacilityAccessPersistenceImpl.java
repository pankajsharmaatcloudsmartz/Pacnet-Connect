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

import com.pacnet.connect.NoSuchFacilityAccessException;
import com.pacnet.connect.model.FacilityAccess;
import com.pacnet.connect.model.impl.FacilityAccessImpl;
import com.pacnet.connect.model.impl.FacilityAccessModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the facility access service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityAccessPersistence
 * @see FacilityAccessUtil
 * @generated
 */
public class FacilityAccessPersistenceImpl extends BasePersistenceImpl<FacilityAccess>
	implements FacilityAccessPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FacilityAccessUtil} to access the facility access persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FacilityAccessImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYSERVICENAME =
		new FinderPath(FacilityAccessModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAccessModelImpl.FINDER_CACHE_ENABLED,
			FacilityAccessImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityServiceName",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSERVICENAME =
		new FinderPath(FacilityAccessModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAccessModelImpl.FINDER_CACHE_ENABLED,
			FacilityAccessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityServiceName",
			new String[] { String.class.getName() },
			FacilityAccessModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYSERVICENAME = new FinderPath(FacilityAccessModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAccessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityServiceName",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FacilityAccessModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAccessModelImpl.FINDER_CACHE_ENABLED,
			FacilityAccessImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FacilityAccessModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAccessModelImpl.FINDER_CACHE_ENABLED,
			FacilityAccessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FacilityAccessModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAccessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the facility access in the entity cache if it is enabled.
	 *
	 * @param facilityAccess the facility access
	 */
	public void cacheResult(FacilityAccess facilityAccess) {
		EntityCacheUtil.putResult(FacilityAccessModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAccessImpl.class, facilityAccess.getPrimaryKey(),
			facilityAccess);

		facilityAccess.resetOriginalValues();
	}

	/**
	 * Caches the facility accesses in the entity cache if it is enabled.
	 *
	 * @param facilityAccesses the facility accesses
	 */
	public void cacheResult(List<FacilityAccess> facilityAccesses) {
		for (FacilityAccess facilityAccess : facilityAccesses) {
			if (EntityCacheUtil.getResult(
						FacilityAccessModelImpl.ENTITY_CACHE_ENABLED,
						FacilityAccessImpl.class, facilityAccess.getPrimaryKey()) == null) {
				cacheResult(facilityAccess);
			}
			else {
				facilityAccess.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all facility accesses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FacilityAccessImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FacilityAccessImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the facility access.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FacilityAccess facilityAccess) {
		EntityCacheUtil.removeResult(FacilityAccessModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAccessImpl.class, facilityAccess.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FacilityAccess> facilityAccesses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FacilityAccess facilityAccess : facilityAccesses) {
			EntityCacheUtil.removeResult(FacilityAccessModelImpl.ENTITY_CACHE_ENABLED,
				FacilityAccessImpl.class, facilityAccess.getPrimaryKey());
		}
	}

	/**
	 * Creates a new facility access with the primary key. Does not add the facility access to the database.
	 *
	 * @param id the primary key for the new facility access
	 * @return the new facility access
	 */
	public FacilityAccess create(long id) {
		FacilityAccess facilityAccess = new FacilityAccessImpl();

		facilityAccess.setNew(true);
		facilityAccess.setPrimaryKey(id);

		return facilityAccess;
	}

	/**
	 * Removes the facility access with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the facility access
	 * @return the facility access that was removed
	 * @throws com.pacnet.connect.NoSuchFacilityAccessException if a facility access with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAccess remove(long id)
		throws NoSuchFacilityAccessException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the facility access with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the facility access
	 * @return the facility access that was removed
	 * @throws com.pacnet.connect.NoSuchFacilityAccessException if a facility access with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityAccess remove(Serializable primaryKey)
		throws NoSuchFacilityAccessException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FacilityAccess facilityAccess = (FacilityAccess)session.get(FacilityAccessImpl.class,
					primaryKey);

			if (facilityAccess == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFacilityAccessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(facilityAccess);
		}
		catch (NoSuchFacilityAccessException nsee) {
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
	protected FacilityAccess removeImpl(FacilityAccess facilityAccess)
		throws SystemException {
		facilityAccess = toUnwrappedModel(facilityAccess);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, facilityAccess);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(facilityAccess);

		return facilityAccess;
	}

	@Override
	public FacilityAccess updateImpl(
		com.pacnet.connect.model.FacilityAccess facilityAccess, boolean merge)
		throws SystemException {
		facilityAccess = toUnwrappedModel(facilityAccess);

		boolean isNew = facilityAccess.isNew();

		FacilityAccessModelImpl facilityAccessModelImpl = (FacilityAccessModelImpl)facilityAccess;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, facilityAccess, merge);

			facilityAccess.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FacilityAccessModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((facilityAccessModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSERVICENAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						facilityAccessModelImpl.getOriginalName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYSERVICENAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSERVICENAME,
					args);

				args = new Object[] { facilityAccessModelImpl.getName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYSERVICENAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSERVICENAME,
					args);
			}
		}

		EntityCacheUtil.putResult(FacilityAccessModelImpl.ENTITY_CACHE_ENABLED,
			FacilityAccessImpl.class, facilityAccess.getPrimaryKey(),
			facilityAccess);

		return facilityAccess;
	}

	protected FacilityAccess toUnwrappedModel(FacilityAccess facilityAccess) {
		if (facilityAccess instanceof FacilityAccessImpl) {
			return facilityAccess;
		}

		FacilityAccessImpl facilityAccessImpl = new FacilityAccessImpl();

		facilityAccessImpl.setNew(facilityAccess.isNew());
		facilityAccessImpl.setPrimaryKey(facilityAccess.getPrimaryKey());

		facilityAccessImpl.setId(facilityAccess.getId());
		facilityAccessImpl.setName(facilityAccess.getName());
		facilityAccessImpl.setLabel(facilityAccess.getLabel());
		facilityAccessImpl.setIsActive(facilityAccess.isIsActive());
		facilityAccessImpl.setCreatedOn(facilityAccess.getCreatedOn());
		facilityAccessImpl.setCreatedBy(facilityAccess.getCreatedBy());
		facilityAccessImpl.setUpdatedOn(facilityAccess.getUpdatedOn());
		facilityAccessImpl.setUpdatedBy(facilityAccess.getUpdatedBy());

		return facilityAccessImpl;
	}

	/**
	 * Returns the facility access with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility access
	 * @return the facility access
	 * @throws com.liferay.portal.NoSuchModelException if a facility access with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityAccess findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility access with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityAccessException} if it could not be found.
	 *
	 * @param id the primary key of the facility access
	 * @return the facility access
	 * @throws com.pacnet.connect.NoSuchFacilityAccessException if a facility access with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAccess findByPrimaryKey(long id)
		throws NoSuchFacilityAccessException, SystemException {
		FacilityAccess facilityAccess = fetchByPrimaryKey(id);

		if (facilityAccess == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchFacilityAccessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return facilityAccess;
	}

	/**
	 * Returns the facility access with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility access
	 * @return the facility access, or <code>null</code> if a facility access with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityAccess fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility access with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the facility access
	 * @return the facility access, or <code>null</code> if a facility access with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAccess fetchByPrimaryKey(long id) throws SystemException {
		FacilityAccess facilityAccess = (FacilityAccess)EntityCacheUtil.getResult(FacilityAccessModelImpl.ENTITY_CACHE_ENABLED,
				FacilityAccessImpl.class, id);

		if (facilityAccess == _nullFacilityAccess) {
			return null;
		}

		if (facilityAccess == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				facilityAccess = (FacilityAccess)session.get(FacilityAccessImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (facilityAccess != null) {
					cacheResult(facilityAccess);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(FacilityAccessModelImpl.ENTITY_CACHE_ENABLED,
						FacilityAccessImpl.class, id, _nullFacilityAccess);
				}

				closeSession(session);
			}
		}

		return facilityAccess;
	}

	/**
	 * Returns all the facility accesses where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching facility accesses
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAccess> findByFacilityServiceName(String name)
		throws SystemException {
		return findByFacilityServiceName(name, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility accesses where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of facility accesses
	 * @param end the upper bound of the range of facility accesses (not inclusive)
	 * @return the range of matching facility accesses
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAccess> findByFacilityServiceName(String name,
		int start, int end) throws SystemException {
		return findByFacilityServiceName(name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility accesses where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of facility accesses
	 * @param end the upper bound of the range of facility accesses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility accesses
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAccess> findByFacilityServiceName(String name,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYSERVICENAME;
			finderArgs = new Object[] { name };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYSERVICENAME;
			finderArgs = new Object[] { name, start, end, orderByComparator };
		}

		List<FacilityAccess> list = (List<FacilityAccess>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityAccess facilityAccess : list) {
				if (!Validator.equals(name, facilityAccess.getName())) {
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

			query.append(_SQL_SELECT_FACILITYACCESS_WHERE);

			if (name == null) {
				query.append(_FINDER_COLUMN_FACILITYSERVICENAME_NAME_1);
			}
			else {
				if (name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FACILITYSERVICENAME_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_FACILITYSERVICENAME_NAME_2);
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

				list = (List<FacilityAccess>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first facility access in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility access
	 * @throws com.pacnet.connect.NoSuchFacilityAccessException if a matching facility access could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAccess findByFacilityServiceName_First(String name,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityAccessException, SystemException {
		FacilityAccess facilityAccess = fetchByFacilityServiceName_First(name,
				orderByComparator);

		if (facilityAccess != null) {
			return facilityAccess;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityAccessException(msg.toString());
	}

	/**
	 * Returns the first facility access in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility access, or <code>null</code> if a matching facility access could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAccess fetchByFacilityServiceName_First(String name,
		OrderByComparator orderByComparator) throws SystemException {
		List<FacilityAccess> list = findByFacilityServiceName(name, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility access in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility access
	 * @throws com.pacnet.connect.NoSuchFacilityAccessException if a matching facility access could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAccess findByFacilityServiceName_Last(String name,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityAccessException, SystemException {
		FacilityAccess facilityAccess = fetchByFacilityServiceName_Last(name,
				orderByComparator);

		if (facilityAccess != null) {
			return facilityAccess;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityAccessException(msg.toString());
	}

	/**
	 * Returns the last facility access in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility access, or <code>null</code> if a matching facility access could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAccess fetchByFacilityServiceName_Last(String name,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFacilityServiceName(name);

		List<FacilityAccess> list = findByFacilityServiceName(name, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility accesses before and after the current facility access in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current facility access
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility access
	 * @throws com.pacnet.connect.NoSuchFacilityAccessException if a facility access with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityAccess[] findByFacilityServiceName_PrevAndNext(long id,
		String name, OrderByComparator orderByComparator)
		throws NoSuchFacilityAccessException, SystemException {
		FacilityAccess facilityAccess = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityAccess[] array = new FacilityAccessImpl[3];

			array[0] = getByFacilityServiceName_PrevAndNext(session,
					facilityAccess, name, orderByComparator, true);

			array[1] = facilityAccess;

			array[2] = getByFacilityServiceName_PrevAndNext(session,
					facilityAccess, name, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FacilityAccess getByFacilityServiceName_PrevAndNext(
		Session session, FacilityAccess facilityAccess, String name,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYACCESS_WHERE);

		if (name == null) {
			query.append(_FINDER_COLUMN_FACILITYSERVICENAME_NAME_1);
		}
		else {
			if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FACILITYSERVICENAME_NAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_FACILITYSERVICENAME_NAME_2);
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
			Object[] values = orderByComparator.getOrderByConditionValues(facilityAccess);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityAccess> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility accesses.
	 *
	 * @return the facility accesses
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAccess> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility accesses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facility accesses
	 * @param end the upper bound of the range of facility accesses (not inclusive)
	 * @return the range of facility accesses
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAccess> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility accesses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facility accesses
	 * @param end the upper bound of the range of facility accesses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of facility accesses
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityAccess> findAll(int start, int end,
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

		List<FacilityAccess> list = (List<FacilityAccess>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FACILITYACCESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FACILITYACCESS;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<FacilityAccess>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<FacilityAccess>)QueryUtil.list(q,
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
	 * Removes all the facility accesses where name = &#63; from the database.
	 *
	 * @param name the name
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityServiceName(String name)
		throws SystemException {
		for (FacilityAccess facilityAccess : findByFacilityServiceName(name)) {
			remove(facilityAccess);
		}
	}

	/**
	 * Removes all the facility accesses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (FacilityAccess facilityAccess : findAll()) {
			remove(facilityAccess);
		}
	}

	/**
	 * Returns the number of facility accesses where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching facility accesses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityServiceName(String name)
		throws SystemException {
		Object[] finderArgs = new Object[] { name };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYSERVICENAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITYACCESS_WHERE);

			if (name == null) {
				query.append(_FINDER_COLUMN_FACILITYSERVICENAME_NAME_1);
			}
			else {
				if (name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FACILITYSERVICENAME_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_FACILITYSERVICENAME_NAME_2);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYSERVICENAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility accesses.
	 *
	 * @return the number of facility accesses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FACILITYACCESS);

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
	 * Initializes the facility access persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.FacilityAccess")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FacilityAccess>> listenersList = new ArrayList<ModelListener<FacilityAccess>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FacilityAccess>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FacilityAccessImpl.class.getName());
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
	private static final String _SQL_SELECT_FACILITYACCESS = "SELECT facilityAccess FROM FacilityAccess facilityAccess";
	private static final String _SQL_SELECT_FACILITYACCESS_WHERE = "SELECT facilityAccess FROM FacilityAccess facilityAccess WHERE ";
	private static final String _SQL_COUNT_FACILITYACCESS = "SELECT COUNT(facilityAccess) FROM FacilityAccess facilityAccess";
	private static final String _SQL_COUNT_FACILITYACCESS_WHERE = "SELECT COUNT(facilityAccess) FROM FacilityAccess facilityAccess WHERE ";
	private static final String _FINDER_COLUMN_FACILITYSERVICENAME_NAME_1 = "facilityAccess.name IS NULL";
	private static final String _FINDER_COLUMN_FACILITYSERVICENAME_NAME_2 = "facilityAccess.name = ?";
	private static final String _FINDER_COLUMN_FACILITYSERVICENAME_NAME_3 = "(facilityAccess.name IS NULL OR facilityAccess.name = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "facilityAccess.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FacilityAccess exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FacilityAccess exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FacilityAccessPersistenceImpl.class);
	private static FacilityAccess _nullFacilityAccess = new FacilityAccessImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FacilityAccess> toCacheModel() {
				return _nullFacilityAccessCacheModel;
			}
		};

	private static CacheModel<FacilityAccess> _nullFacilityAccessCacheModel = new CacheModel<FacilityAccess>() {
			public FacilityAccess toEntityModel() {
				return _nullFacilityAccess;
			}
		};
}