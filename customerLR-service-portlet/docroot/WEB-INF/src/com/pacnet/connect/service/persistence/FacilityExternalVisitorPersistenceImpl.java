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

import com.pacnet.connect.NoSuchFacilityExternalVisitorException;
import com.pacnet.connect.model.FacilityExternalVisitor;
import com.pacnet.connect.model.impl.FacilityExternalVisitorImpl;
import com.pacnet.connect.model.impl.FacilityExternalVisitorModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the facility external visitor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityExternalVisitorPersistence
 * @see FacilityExternalVisitorUtil
 * @generated
 */
public class FacilityExternalVisitorPersistenceImpl extends BasePersistenceImpl<FacilityExternalVisitor>
	implements FacilityExternalVisitorPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FacilityExternalVisitorUtil} to access the facility external visitor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FacilityExternalVisitorImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYEXTERNALVISITORBYFACILITY =
		new FinderPath(FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
			FacilityExternalVisitorModelImpl.FINDER_CACHE_ENABLED,
			FacilityExternalVisitorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityExternalVisitorByFacility",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYEXTERNALVISITORBYFACILITY =
		new FinderPath(FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
			FacilityExternalVisitorModelImpl.FINDER_CACHE_ENABLED,
			FacilityExternalVisitorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityExternalVisitorByFacility",
			new String[] { Long.class.getName() },
			FacilityExternalVisitorModelImpl.FACILITYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYEXTERNALVISITORBYFACILITY =
		new FinderPath(FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
			FacilityExternalVisitorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityExternalVisitorByFacility",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYEXTERNALVISITORBYACCESSREQUEST =
		new FinderPath(FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
			FacilityExternalVisitorModelImpl.FINDER_CACHE_ENABLED,
			FacilityExternalVisitorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityExternalVisitorByAccessRequest",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYEXTERNALVISITORBYACCESSREQUEST =
		new FinderPath(FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
			FacilityExternalVisitorModelImpl.FINDER_CACHE_ENABLED,
			FacilityExternalVisitorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityExternalVisitorByAccessRequest",
			new String[] { Long.class.getName() },
			FacilityExternalVisitorModelImpl.ACCESSREQUESTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYEXTERNALVISITORBYACCESSREQUEST =
		new FinderPath(FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
			FacilityExternalVisitorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityExternalVisitorByAccessRequest",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
			FacilityExternalVisitorModelImpl.FINDER_CACHE_ENABLED,
			FacilityExternalVisitorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
			FacilityExternalVisitorModelImpl.FINDER_CACHE_ENABLED,
			FacilityExternalVisitorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
			FacilityExternalVisitorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the facility external visitor in the entity cache if it is enabled.
	 *
	 * @param facilityExternalVisitor the facility external visitor
	 */
	public void cacheResult(FacilityExternalVisitor facilityExternalVisitor) {
		EntityCacheUtil.putResult(FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
			FacilityExternalVisitorImpl.class,
			facilityExternalVisitor.getPrimaryKey(), facilityExternalVisitor);

		facilityExternalVisitor.resetOriginalValues();
	}

	/**
	 * Caches the facility external visitors in the entity cache if it is enabled.
	 *
	 * @param facilityExternalVisitors the facility external visitors
	 */
	public void cacheResult(
		List<FacilityExternalVisitor> facilityExternalVisitors) {
		for (FacilityExternalVisitor facilityExternalVisitor : facilityExternalVisitors) {
			if (EntityCacheUtil.getResult(
						FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
						FacilityExternalVisitorImpl.class,
						facilityExternalVisitor.getPrimaryKey()) == null) {
				cacheResult(facilityExternalVisitor);
			}
			else {
				facilityExternalVisitor.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all facility external visitors.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FacilityExternalVisitorImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FacilityExternalVisitorImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the facility external visitor.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FacilityExternalVisitor facilityExternalVisitor) {
		EntityCacheUtil.removeResult(FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
			FacilityExternalVisitorImpl.class,
			facilityExternalVisitor.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<FacilityExternalVisitor> facilityExternalVisitors) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FacilityExternalVisitor facilityExternalVisitor : facilityExternalVisitors) {
			EntityCacheUtil.removeResult(FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
				FacilityExternalVisitorImpl.class,
				facilityExternalVisitor.getPrimaryKey());
		}
	}

	/**
	 * Creates a new facility external visitor with the primary key. Does not add the facility external visitor to the database.
	 *
	 * @param id the primary key for the new facility external visitor
	 * @return the new facility external visitor
	 */
	public FacilityExternalVisitor create(long id) {
		FacilityExternalVisitor facilityExternalVisitor = new FacilityExternalVisitorImpl();

		facilityExternalVisitor.setNew(true);
		facilityExternalVisitor.setPrimaryKey(id);

		return facilityExternalVisitor;
	}

	/**
	 * Removes the facility external visitor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the facility external visitor
	 * @return the facility external visitor that was removed
	 * @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a facility external visitor with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityExternalVisitor remove(long id)
		throws NoSuchFacilityExternalVisitorException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the facility external visitor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the facility external visitor
	 * @return the facility external visitor that was removed
	 * @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a facility external visitor with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityExternalVisitor remove(Serializable primaryKey)
		throws NoSuchFacilityExternalVisitorException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FacilityExternalVisitor facilityExternalVisitor = (FacilityExternalVisitor)session.get(FacilityExternalVisitorImpl.class,
					primaryKey);

			if (facilityExternalVisitor == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFacilityExternalVisitorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(facilityExternalVisitor);
		}
		catch (NoSuchFacilityExternalVisitorException nsee) {
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
	protected FacilityExternalVisitor removeImpl(
		FacilityExternalVisitor facilityExternalVisitor)
		throws SystemException {
		facilityExternalVisitor = toUnwrappedModel(facilityExternalVisitor);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, facilityExternalVisitor);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(facilityExternalVisitor);

		return facilityExternalVisitor;
	}

	@Override
	public FacilityExternalVisitor updateImpl(
		com.pacnet.connect.model.FacilityExternalVisitor facilityExternalVisitor,
		boolean merge) throws SystemException {
		facilityExternalVisitor = toUnwrappedModel(facilityExternalVisitor);

		boolean isNew = facilityExternalVisitor.isNew();

		FacilityExternalVisitorModelImpl facilityExternalVisitorModelImpl = (FacilityExternalVisitorModelImpl)facilityExternalVisitor;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, facilityExternalVisitor, merge);

			facilityExternalVisitor.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FacilityExternalVisitorModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((facilityExternalVisitorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYEXTERNALVISITORBYFACILITY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityExternalVisitorModelImpl.getOriginalFacilityId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYEXTERNALVISITORBYFACILITY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYEXTERNALVISITORBYFACILITY,
					args);

				args = new Object[] {
						Long.valueOf(facilityExternalVisitorModelImpl.getFacilityId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYEXTERNALVISITORBYFACILITY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYEXTERNALVISITORBYFACILITY,
					args);
			}

			if ((facilityExternalVisitorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYEXTERNALVISITORBYACCESSREQUEST.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityExternalVisitorModelImpl.getOriginalAccessRequestId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYEXTERNALVISITORBYACCESSREQUEST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYEXTERNALVISITORBYACCESSREQUEST,
					args);

				args = new Object[] {
						Long.valueOf(facilityExternalVisitorModelImpl.getAccessRequestId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYEXTERNALVISITORBYACCESSREQUEST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYEXTERNALVISITORBYACCESSREQUEST,
					args);
			}
		}

		EntityCacheUtil.putResult(FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
			FacilityExternalVisitorImpl.class,
			facilityExternalVisitor.getPrimaryKey(), facilityExternalVisitor);

		return facilityExternalVisitor;
	}

	protected FacilityExternalVisitor toUnwrappedModel(
		FacilityExternalVisitor facilityExternalVisitor) {
		if (facilityExternalVisitor instanceof FacilityExternalVisitorImpl) {
			return facilityExternalVisitor;
		}

		FacilityExternalVisitorImpl facilityExternalVisitorImpl = new FacilityExternalVisitorImpl();

		facilityExternalVisitorImpl.setNew(facilityExternalVisitor.isNew());
		facilityExternalVisitorImpl.setPrimaryKey(facilityExternalVisitor.getPrimaryKey());

		facilityExternalVisitorImpl.setId(facilityExternalVisitor.getId());
		facilityExternalVisitorImpl.setFacilityId(facilityExternalVisitor.getFacilityId());
		facilityExternalVisitorImpl.setAccessRequestId(facilityExternalVisitor.getAccessRequestId());
		facilityExternalVisitorImpl.setName(facilityExternalVisitor.getName());
		facilityExternalVisitorImpl.setMobileNumber(facilityExternalVisitor.getMobileNumber());
		facilityExternalVisitorImpl.setEmail(facilityExternalVisitor.getEmail());
		facilityExternalVisitorImpl.setAddress(facilityExternalVisitor.getAddress());
		facilityExternalVisitorImpl.setCompanyName(facilityExternalVisitor.getCompanyName());
		facilityExternalVisitorImpl.setDocumentType(facilityExternalVisitor.getDocumentType());
		facilityExternalVisitorImpl.setDocumentId(facilityExternalVisitor.getDocumentId());
		facilityExternalVisitorImpl.setRemarks(facilityExternalVisitor.getRemarks());
		facilityExternalVisitorImpl.setIsActive(facilityExternalVisitor.isIsActive());
		facilityExternalVisitorImpl.setCreatedOn(facilityExternalVisitor.getCreatedOn());
		facilityExternalVisitorImpl.setCreatedBy(facilityExternalVisitor.getCreatedBy());
		facilityExternalVisitorImpl.setUpdatedOn(facilityExternalVisitor.getUpdatedOn());
		facilityExternalVisitorImpl.setUpdatedBy(facilityExternalVisitor.getUpdatedBy());

		return facilityExternalVisitorImpl;
	}

	/**
	 * Returns the facility external visitor with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility external visitor
	 * @return the facility external visitor
	 * @throws com.liferay.portal.NoSuchModelException if a facility external visitor with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityExternalVisitor findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility external visitor with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityExternalVisitorException} if it could not be found.
	 *
	 * @param id the primary key of the facility external visitor
	 * @return the facility external visitor
	 * @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a facility external visitor with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityExternalVisitor findByPrimaryKey(long id)
		throws NoSuchFacilityExternalVisitorException, SystemException {
		FacilityExternalVisitor facilityExternalVisitor = fetchByPrimaryKey(id);

		if (facilityExternalVisitor == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchFacilityExternalVisitorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return facilityExternalVisitor;
	}

	/**
	 * Returns the facility external visitor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility external visitor
	 * @return the facility external visitor, or <code>null</code> if a facility external visitor with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityExternalVisitor fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility external visitor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the facility external visitor
	 * @return the facility external visitor, or <code>null</code> if a facility external visitor with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityExternalVisitor fetchByPrimaryKey(long id)
		throws SystemException {
		FacilityExternalVisitor facilityExternalVisitor = (FacilityExternalVisitor)EntityCacheUtil.getResult(FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
				FacilityExternalVisitorImpl.class, id);

		if (facilityExternalVisitor == _nullFacilityExternalVisitor) {
			return null;
		}

		if (facilityExternalVisitor == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				facilityExternalVisitor = (FacilityExternalVisitor)session.get(FacilityExternalVisitorImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (facilityExternalVisitor != null) {
					cacheResult(facilityExternalVisitor);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(FacilityExternalVisitorModelImpl.ENTITY_CACHE_ENABLED,
						FacilityExternalVisitorImpl.class, id,
						_nullFacilityExternalVisitor);
				}

				closeSession(session);
			}
		}

		return facilityExternalVisitor;
	}

	/**
	 * Returns all the facility external visitors where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @return the matching facility external visitors
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityExternalVisitor> findByFacilityExternalVisitorByFacility(
		long facilityId) throws SystemException {
		return findByFacilityExternalVisitorByFacility(facilityId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility external visitors where facilityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityId the facility ID
	 * @param start the lower bound of the range of facility external visitors
	 * @param end the upper bound of the range of facility external visitors (not inclusive)
	 * @return the range of matching facility external visitors
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityExternalVisitor> findByFacilityExternalVisitorByFacility(
		long facilityId, int start, int end) throws SystemException {
		return findByFacilityExternalVisitorByFacility(facilityId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the facility external visitors where facilityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param facilityId the facility ID
	 * @param start the lower bound of the range of facility external visitors
	 * @param end the upper bound of the range of facility external visitors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility external visitors
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityExternalVisitor> findByFacilityExternalVisitorByFacility(
		long facilityId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYEXTERNALVISITORBYFACILITY;
			finderArgs = new Object[] { facilityId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYEXTERNALVISITORBYFACILITY;
			finderArgs = new Object[] { facilityId, start, end, orderByComparator };
		}

		List<FacilityExternalVisitor> list = (List<FacilityExternalVisitor>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityExternalVisitor facilityExternalVisitor : list) {
				if ((facilityId != facilityExternalVisitor.getFacilityId())) {
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

			query.append(_SQL_SELECT_FACILITYEXTERNALVISITOR_WHERE);

			query.append(_FINDER_COLUMN_FACILITYEXTERNALVISITORBYFACILITY_FACILITYID_2);

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

				list = (List<FacilityExternalVisitor>)QueryUtil.list(q,
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
	 * Returns the first facility external visitor in the ordered set where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility external visitor
	 * @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a matching facility external visitor could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityExternalVisitor findByFacilityExternalVisitorByFacility_First(
		long facilityId, OrderByComparator orderByComparator)
		throws NoSuchFacilityExternalVisitorException, SystemException {
		FacilityExternalVisitor facilityExternalVisitor = fetchByFacilityExternalVisitorByFacility_First(facilityId,
				orderByComparator);

		if (facilityExternalVisitor != null) {
			return facilityExternalVisitor;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityId=");
		msg.append(facilityId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityExternalVisitorException(msg.toString());
	}

	/**
	 * Returns the first facility external visitor in the ordered set where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility external visitor, or <code>null</code> if a matching facility external visitor could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityExternalVisitor fetchByFacilityExternalVisitorByFacility_First(
		long facilityId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FacilityExternalVisitor> list = findByFacilityExternalVisitorByFacility(facilityId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility external visitor in the ordered set where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility external visitor
	 * @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a matching facility external visitor could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityExternalVisitor findByFacilityExternalVisitorByFacility_Last(
		long facilityId, OrderByComparator orderByComparator)
		throws NoSuchFacilityExternalVisitorException, SystemException {
		FacilityExternalVisitor facilityExternalVisitor = fetchByFacilityExternalVisitorByFacility_Last(facilityId,
				orderByComparator);

		if (facilityExternalVisitor != null) {
			return facilityExternalVisitor;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("facilityId=");
		msg.append(facilityId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityExternalVisitorException(msg.toString());
	}

	/**
	 * Returns the last facility external visitor in the ordered set where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility external visitor, or <code>null</code> if a matching facility external visitor could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityExternalVisitor fetchByFacilityExternalVisitorByFacility_Last(
		long facilityId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByFacilityExternalVisitorByFacility(facilityId);

		List<FacilityExternalVisitor> list = findByFacilityExternalVisitorByFacility(facilityId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility external visitors before and after the current facility external visitor in the ordered set where facilityId = &#63;.
	 *
	 * @param id the primary key of the current facility external visitor
	 * @param facilityId the facility ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility external visitor
	 * @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a facility external visitor with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityExternalVisitor[] findByFacilityExternalVisitorByFacility_PrevAndNext(
		long id, long facilityId, OrderByComparator orderByComparator)
		throws NoSuchFacilityExternalVisitorException, SystemException {
		FacilityExternalVisitor facilityExternalVisitor = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityExternalVisitor[] array = new FacilityExternalVisitorImpl[3];

			array[0] = getByFacilityExternalVisitorByFacility_PrevAndNext(session,
					facilityExternalVisitor, facilityId, orderByComparator, true);

			array[1] = facilityExternalVisitor;

			array[2] = getByFacilityExternalVisitorByFacility_PrevAndNext(session,
					facilityExternalVisitor, facilityId, orderByComparator,
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

	protected FacilityExternalVisitor getByFacilityExternalVisitorByFacility_PrevAndNext(
		Session session, FacilityExternalVisitor facilityExternalVisitor,
		long facilityId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYEXTERNALVISITOR_WHERE);

		query.append(_FINDER_COLUMN_FACILITYEXTERNALVISITORBYFACILITY_FACILITYID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(facilityExternalVisitor);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityExternalVisitor> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility external visitors where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @return the matching facility external visitors
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityExternalVisitor> findByFacilityExternalVisitorByAccessRequest(
		long accessRequestId) throws SystemException {
		return findByFacilityExternalVisitorByAccessRequest(accessRequestId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility external visitors where accessRequestId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param accessRequestId the access request ID
	 * @param start the lower bound of the range of facility external visitors
	 * @param end the upper bound of the range of facility external visitors (not inclusive)
	 * @return the range of matching facility external visitors
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityExternalVisitor> findByFacilityExternalVisitorByAccessRequest(
		long accessRequestId, int start, int end) throws SystemException {
		return findByFacilityExternalVisitorByAccessRequest(accessRequestId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility external visitors where accessRequestId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param accessRequestId the access request ID
	 * @param start the lower bound of the range of facility external visitors
	 * @param end the upper bound of the range of facility external visitors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility external visitors
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityExternalVisitor> findByFacilityExternalVisitorByAccessRequest(
		long accessRequestId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYEXTERNALVISITORBYACCESSREQUEST;
			finderArgs = new Object[] { accessRequestId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYEXTERNALVISITORBYACCESSREQUEST;
			finderArgs = new Object[] {
					accessRequestId,
					
					start, end, orderByComparator
				};
		}

		List<FacilityExternalVisitor> list = (List<FacilityExternalVisitor>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityExternalVisitor facilityExternalVisitor : list) {
				if ((accessRequestId != facilityExternalVisitor.getAccessRequestId())) {
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

			query.append(_SQL_SELECT_FACILITYEXTERNALVISITOR_WHERE);

			query.append(_FINDER_COLUMN_FACILITYEXTERNALVISITORBYACCESSREQUEST_ACCESSREQUESTID_2);

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

				list = (List<FacilityExternalVisitor>)QueryUtil.list(q,
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
	 * Returns the first facility external visitor in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility external visitor
	 * @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a matching facility external visitor could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityExternalVisitor findByFacilityExternalVisitorByAccessRequest_First(
		long accessRequestId, OrderByComparator orderByComparator)
		throws NoSuchFacilityExternalVisitorException, SystemException {
		FacilityExternalVisitor facilityExternalVisitor = fetchByFacilityExternalVisitorByAccessRequest_First(accessRequestId,
				orderByComparator);

		if (facilityExternalVisitor != null) {
			return facilityExternalVisitor;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("accessRequestId=");
		msg.append(accessRequestId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityExternalVisitorException(msg.toString());
	}

	/**
	 * Returns the first facility external visitor in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility external visitor, or <code>null</code> if a matching facility external visitor could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityExternalVisitor fetchByFacilityExternalVisitorByAccessRequest_First(
		long accessRequestId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FacilityExternalVisitor> list = findByFacilityExternalVisitorByAccessRequest(accessRequestId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility external visitor in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility external visitor
	 * @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a matching facility external visitor could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityExternalVisitor findByFacilityExternalVisitorByAccessRequest_Last(
		long accessRequestId, OrderByComparator orderByComparator)
		throws NoSuchFacilityExternalVisitorException, SystemException {
		FacilityExternalVisitor facilityExternalVisitor = fetchByFacilityExternalVisitorByAccessRequest_Last(accessRequestId,
				orderByComparator);

		if (facilityExternalVisitor != null) {
			return facilityExternalVisitor;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("accessRequestId=");
		msg.append(accessRequestId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityExternalVisitorException(msg.toString());
	}

	/**
	 * Returns the last facility external visitor in the ordered set where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility external visitor, or <code>null</code> if a matching facility external visitor could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityExternalVisitor fetchByFacilityExternalVisitorByAccessRequest_Last(
		long accessRequestId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByFacilityExternalVisitorByAccessRequest(accessRequestId);

		List<FacilityExternalVisitor> list = findByFacilityExternalVisitorByAccessRequest(accessRequestId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility external visitors before and after the current facility external visitor in the ordered set where accessRequestId = &#63;.
	 *
	 * @param id the primary key of the current facility external visitor
	 * @param accessRequestId the access request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility external visitor
	 * @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a facility external visitor with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityExternalVisitor[] findByFacilityExternalVisitorByAccessRequest_PrevAndNext(
		long id, long accessRequestId, OrderByComparator orderByComparator)
		throws NoSuchFacilityExternalVisitorException, SystemException {
		FacilityExternalVisitor facilityExternalVisitor = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityExternalVisitor[] array = new FacilityExternalVisitorImpl[3];

			array[0] = getByFacilityExternalVisitorByAccessRequest_PrevAndNext(session,
					facilityExternalVisitor, accessRequestId,
					orderByComparator, true);

			array[1] = facilityExternalVisitor;

			array[2] = getByFacilityExternalVisitorByAccessRequest_PrevAndNext(session,
					facilityExternalVisitor, accessRequestId,
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

	protected FacilityExternalVisitor getByFacilityExternalVisitorByAccessRequest_PrevAndNext(
		Session session, FacilityExternalVisitor facilityExternalVisitor,
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

		query.append(_SQL_SELECT_FACILITYEXTERNALVISITOR_WHERE);

		query.append(_FINDER_COLUMN_FACILITYEXTERNALVISITORBYACCESSREQUEST_ACCESSREQUESTID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(facilityExternalVisitor);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityExternalVisitor> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility external visitors.
	 *
	 * @return the facility external visitors
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityExternalVisitor> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility external visitors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facility external visitors
	 * @param end the upper bound of the range of facility external visitors (not inclusive)
	 * @return the range of facility external visitors
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityExternalVisitor> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility external visitors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facility external visitors
	 * @param end the upper bound of the range of facility external visitors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of facility external visitors
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityExternalVisitor> findAll(int start, int end,
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

		List<FacilityExternalVisitor> list = (List<FacilityExternalVisitor>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FACILITYEXTERNALVISITOR);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FACILITYEXTERNALVISITOR;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<FacilityExternalVisitor>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<FacilityExternalVisitor>)QueryUtil.list(q,
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
	 * Removes all the facility external visitors where facilityId = &#63; from the database.
	 *
	 * @param facilityId the facility ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityExternalVisitorByFacility(long facilityId)
		throws SystemException {
		for (FacilityExternalVisitor facilityExternalVisitor : findByFacilityExternalVisitorByFacility(
				facilityId)) {
			remove(facilityExternalVisitor);
		}
	}

	/**
	 * Removes all the facility external visitors where accessRequestId = &#63; from the database.
	 *
	 * @param accessRequestId the access request ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityExternalVisitorByAccessRequest(
		long accessRequestId) throws SystemException {
		for (FacilityExternalVisitor facilityExternalVisitor : findByFacilityExternalVisitorByAccessRequest(
				accessRequestId)) {
			remove(facilityExternalVisitor);
		}
	}

	/**
	 * Removes all the facility external visitors from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (FacilityExternalVisitor facilityExternalVisitor : findAll()) {
			remove(facilityExternalVisitor);
		}
	}

	/**
	 * Returns the number of facility external visitors where facilityId = &#63;.
	 *
	 * @param facilityId the facility ID
	 * @return the number of matching facility external visitors
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityExternalVisitorByFacility(long facilityId)
		throws SystemException {
		Object[] finderArgs = new Object[] { facilityId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYEXTERNALVISITORBYFACILITY,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITYEXTERNALVISITOR_WHERE);

			query.append(_FINDER_COLUMN_FACILITYEXTERNALVISITORBYFACILITY_FACILITYID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYEXTERNALVISITORBYFACILITY,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility external visitors where accessRequestId = &#63;.
	 *
	 * @param accessRequestId the access request ID
	 * @return the number of matching facility external visitors
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityExternalVisitorByAccessRequest(
		long accessRequestId) throws SystemException {
		Object[] finderArgs = new Object[] { accessRequestId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYEXTERNALVISITORBYACCESSREQUEST,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITYEXTERNALVISITOR_WHERE);

			query.append(_FINDER_COLUMN_FACILITYEXTERNALVISITORBYACCESSREQUEST_ACCESSREQUESTID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYEXTERNALVISITORBYACCESSREQUEST,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility external visitors.
	 *
	 * @return the number of facility external visitors
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FACILITYEXTERNALVISITOR);

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
	 * Initializes the facility external visitor persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.FacilityExternalVisitor")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FacilityExternalVisitor>> listenersList = new ArrayList<ModelListener<FacilityExternalVisitor>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FacilityExternalVisitor>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FacilityExternalVisitorImpl.class.getName());
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
	private static final String _SQL_SELECT_FACILITYEXTERNALVISITOR = "SELECT facilityExternalVisitor FROM FacilityExternalVisitor facilityExternalVisitor";
	private static final String _SQL_SELECT_FACILITYEXTERNALVISITOR_WHERE = "SELECT facilityExternalVisitor FROM FacilityExternalVisitor facilityExternalVisitor WHERE ";
	private static final String _SQL_COUNT_FACILITYEXTERNALVISITOR = "SELECT COUNT(facilityExternalVisitor) FROM FacilityExternalVisitor facilityExternalVisitor";
	private static final String _SQL_COUNT_FACILITYEXTERNALVISITOR_WHERE = "SELECT COUNT(facilityExternalVisitor) FROM FacilityExternalVisitor facilityExternalVisitor WHERE ";
	private static final String _FINDER_COLUMN_FACILITYEXTERNALVISITORBYFACILITY_FACILITYID_2 =
		"facilityExternalVisitor.facilityId = ?";
	private static final String _FINDER_COLUMN_FACILITYEXTERNALVISITORBYACCESSREQUEST_ACCESSREQUESTID_2 =
		"facilityExternalVisitor.accessRequestId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "facilityExternalVisitor.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FacilityExternalVisitor exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FacilityExternalVisitor exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FacilityExternalVisitorPersistenceImpl.class);
	private static FacilityExternalVisitor _nullFacilityExternalVisitor = new FacilityExternalVisitorImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FacilityExternalVisitor> toCacheModel() {
				return _nullFacilityExternalVisitorCacheModel;
			}
		};

	private static CacheModel<FacilityExternalVisitor> _nullFacilityExternalVisitorCacheModel =
		new CacheModel<FacilityExternalVisitor>() {
			public FacilityExternalVisitor toEntityModel() {
				return _nullFacilityExternalVisitor;
			}
		};
}