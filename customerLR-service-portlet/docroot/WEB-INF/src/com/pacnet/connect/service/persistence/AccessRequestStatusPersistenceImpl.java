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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.pacnet.connect.NoSuchAccessRequestStatusException;
import com.pacnet.connect.model.AccessRequestStatus;
import com.pacnet.connect.model.impl.AccessRequestStatusImpl;
import com.pacnet.connect.model.impl.AccessRequestStatusModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the access request status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestStatusPersistence
 * @see AccessRequestStatusUtil
 * @generated
 */
public class AccessRequestStatusPersistenceImpl extends BasePersistenceImpl<AccessRequestStatus>
	implements AccessRequestStatusPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AccessRequestStatusUtil} to access the access request status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AccessRequestStatusImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AccessRequestStatusModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestStatusModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AccessRequestStatusModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestStatusModelImpl.FINDER_CACHE_ENABLED,
			AccessRequestStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AccessRequestStatusModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the access request status in the entity cache if it is enabled.
	 *
	 * @param accessRequestStatus the access request status
	 */
	public void cacheResult(AccessRequestStatus accessRequestStatus) {
		EntityCacheUtil.putResult(AccessRequestStatusModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestStatusImpl.class, accessRequestStatus.getPrimaryKey(),
			accessRequestStatus);

		accessRequestStatus.resetOriginalValues();
	}

	/**
	 * Caches the access request statuses in the entity cache if it is enabled.
	 *
	 * @param accessRequestStatuses the access request statuses
	 */
	public void cacheResult(List<AccessRequestStatus> accessRequestStatuses) {
		for (AccessRequestStatus accessRequestStatus : accessRequestStatuses) {
			if (EntityCacheUtil.getResult(
						AccessRequestStatusModelImpl.ENTITY_CACHE_ENABLED,
						AccessRequestStatusImpl.class,
						accessRequestStatus.getPrimaryKey()) == null) {
				cacheResult(accessRequestStatus);
			}
			else {
				accessRequestStatus.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all access request statuses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AccessRequestStatusImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AccessRequestStatusImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the access request status.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AccessRequestStatus accessRequestStatus) {
		EntityCacheUtil.removeResult(AccessRequestStatusModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestStatusImpl.class, accessRequestStatus.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AccessRequestStatus> accessRequestStatuses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AccessRequestStatus accessRequestStatus : accessRequestStatuses) {
			EntityCacheUtil.removeResult(AccessRequestStatusModelImpl.ENTITY_CACHE_ENABLED,
				AccessRequestStatusImpl.class,
				accessRequestStatus.getPrimaryKey());
		}
	}

	/**
	 * Creates a new access request status with the primary key. Does not add the access request status to the database.
	 *
	 * @param id the primary key for the new access request status
	 * @return the new access request status
	 */
	public AccessRequestStatus create(long id) {
		AccessRequestStatus accessRequestStatus = new AccessRequestStatusImpl();

		accessRequestStatus.setNew(true);
		accessRequestStatus.setPrimaryKey(id);

		return accessRequestStatus;
	}

	/**
	 * Removes the access request status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the access request status
	 * @return the access request status that was removed
	 * @throws com.pacnet.connect.NoSuchAccessRequestStatusException if a access request status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestStatus remove(long id)
		throws NoSuchAccessRequestStatusException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the access request status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the access request status
	 * @return the access request status that was removed
	 * @throws com.pacnet.connect.NoSuchAccessRequestStatusException if a access request status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccessRequestStatus remove(Serializable primaryKey)
		throws NoSuchAccessRequestStatusException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AccessRequestStatus accessRequestStatus = (AccessRequestStatus)session.get(AccessRequestStatusImpl.class,
					primaryKey);

			if (accessRequestStatus == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAccessRequestStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(accessRequestStatus);
		}
		catch (NoSuchAccessRequestStatusException nsee) {
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
	protected AccessRequestStatus removeImpl(
		AccessRequestStatus accessRequestStatus) throws SystemException {
		accessRequestStatus = toUnwrappedModel(accessRequestStatus);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, accessRequestStatus);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(accessRequestStatus);

		return accessRequestStatus;
	}

	@Override
	public AccessRequestStatus updateImpl(
		com.pacnet.connect.model.AccessRequestStatus accessRequestStatus,
		boolean merge) throws SystemException {
		accessRequestStatus = toUnwrappedModel(accessRequestStatus);

		boolean isNew = accessRequestStatus.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, accessRequestStatus, merge);

			accessRequestStatus.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(AccessRequestStatusModelImpl.ENTITY_CACHE_ENABLED,
			AccessRequestStatusImpl.class, accessRequestStatus.getPrimaryKey(),
			accessRequestStatus);

		return accessRequestStatus;
	}

	protected AccessRequestStatus toUnwrappedModel(
		AccessRequestStatus accessRequestStatus) {
		if (accessRequestStatus instanceof AccessRequestStatusImpl) {
			return accessRequestStatus;
		}

		AccessRequestStatusImpl accessRequestStatusImpl = new AccessRequestStatusImpl();

		accessRequestStatusImpl.setNew(accessRequestStatus.isNew());
		accessRequestStatusImpl.setPrimaryKey(accessRequestStatus.getPrimaryKey());

		accessRequestStatusImpl.setId(accessRequestStatus.getId());
		accessRequestStatusImpl.setName(accessRequestStatus.getName());
		accessRequestStatusImpl.setDescription(accessRequestStatus.getDescription());
		accessRequestStatusImpl.setIsActive(accessRequestStatus.isIsActive());
		accessRequestStatusImpl.setCreatedOn(accessRequestStatus.getCreatedOn());
		accessRequestStatusImpl.setCreatedBy(accessRequestStatus.getCreatedBy());
		accessRequestStatusImpl.setUpdatedOn(accessRequestStatus.getUpdatedOn());
		accessRequestStatusImpl.setUpdatedBy(accessRequestStatus.getUpdatedBy());

		return accessRequestStatusImpl;
	}

	/**
	 * Returns the access request status with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the access request status
	 * @return the access request status
	 * @throws com.liferay.portal.NoSuchModelException if a access request status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccessRequestStatus findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the access request status with the primary key or throws a {@link com.pacnet.connect.NoSuchAccessRequestStatusException} if it could not be found.
	 *
	 * @param id the primary key of the access request status
	 * @return the access request status
	 * @throws com.pacnet.connect.NoSuchAccessRequestStatusException if a access request status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestStatus findByPrimaryKey(long id)
		throws NoSuchAccessRequestStatusException, SystemException {
		AccessRequestStatus accessRequestStatus = fetchByPrimaryKey(id);

		if (accessRequestStatus == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchAccessRequestStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return accessRequestStatus;
	}

	/**
	 * Returns the access request status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the access request status
	 * @return the access request status, or <code>null</code> if a access request status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccessRequestStatus fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the access request status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the access request status
	 * @return the access request status, or <code>null</code> if a access request status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessRequestStatus fetchByPrimaryKey(long id)
		throws SystemException {
		AccessRequestStatus accessRequestStatus = (AccessRequestStatus)EntityCacheUtil.getResult(AccessRequestStatusModelImpl.ENTITY_CACHE_ENABLED,
				AccessRequestStatusImpl.class, id);

		if (accessRequestStatus == _nullAccessRequestStatus) {
			return null;
		}

		if (accessRequestStatus == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				accessRequestStatus = (AccessRequestStatus)session.get(AccessRequestStatusImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (accessRequestStatus != null) {
					cacheResult(accessRequestStatus);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(AccessRequestStatusModelImpl.ENTITY_CACHE_ENABLED,
						AccessRequestStatusImpl.class, id,
						_nullAccessRequestStatus);
				}

				closeSession(session);
			}
		}

		return accessRequestStatus;
	}

	/**
	 * Returns all the access request statuses.
	 *
	 * @return the access request statuses
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestStatus> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the access request statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of access request statuses
	 * @param end the upper bound of the range of access request statuses (not inclusive)
	 * @return the range of access request statuses
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestStatus> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the access request statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of access request statuses
	 * @param end the upper bound of the range of access request statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of access request statuses
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessRequestStatus> findAll(int start, int end,
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

		List<AccessRequestStatus> list = (List<AccessRequestStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACCESSREQUESTSTATUS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACCESSREQUESTSTATUS;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<AccessRequestStatus>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<AccessRequestStatus>)QueryUtil.list(q,
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
	 * Removes all the access request statuses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (AccessRequestStatus accessRequestStatus : findAll()) {
			remove(accessRequestStatus);
		}
	}

	/**
	 * Returns the number of access request statuses.
	 *
	 * @return the number of access request statuses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ACCESSREQUESTSTATUS);

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
	 * Initializes the access request status persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.AccessRequestStatus")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AccessRequestStatus>> listenersList = new ArrayList<ModelListener<AccessRequestStatus>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AccessRequestStatus>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AccessRequestStatusImpl.class.getName());
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
	private static final String _SQL_SELECT_ACCESSREQUESTSTATUS = "SELECT accessRequestStatus FROM AccessRequestStatus accessRequestStatus";
	private static final String _SQL_COUNT_ACCESSREQUESTSTATUS = "SELECT COUNT(accessRequestStatus) FROM AccessRequestStatus accessRequestStatus";
	private static final String _ORDER_BY_ENTITY_ALIAS = "accessRequestStatus.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AccessRequestStatus exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AccessRequestStatusPersistenceImpl.class);
	private static AccessRequestStatus _nullAccessRequestStatus = new AccessRequestStatusImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AccessRequestStatus> toCacheModel() {
				return _nullAccessRequestStatusCacheModel;
			}
		};

	private static CacheModel<AccessRequestStatus> _nullAccessRequestStatusCacheModel =
		new CacheModel<AccessRequestStatus>() {
			public AccessRequestStatus toEntityModel() {
				return _nullAccessRequestStatus;
			}
		};
}