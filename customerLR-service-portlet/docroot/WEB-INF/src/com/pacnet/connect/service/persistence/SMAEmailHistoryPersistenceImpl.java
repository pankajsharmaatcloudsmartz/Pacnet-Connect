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

import com.pacnet.connect.NoSuchSMAEmailHistoryException;
import com.pacnet.connect.model.SMAEmailHistory;
import com.pacnet.connect.model.impl.SMAEmailHistoryImpl;
import com.pacnet.connect.model.impl.SMAEmailHistoryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the s m a email history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMAEmailHistoryPersistence
 * @see SMAEmailHistoryUtil
 * @generated
 */
public class SMAEmailHistoryPersistenceImpl extends BasePersistenceImpl<SMAEmailHistory>
	implements SMAEmailHistoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SMAEmailHistoryUtil} to access the s m a email history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SMAEmailHistoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SMAEmailHistoryModelImpl.ENTITY_CACHE_ENABLED,
			SMAEmailHistoryModelImpl.FINDER_CACHE_ENABLED,
			SMAEmailHistoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SMAEmailHistoryModelImpl.ENTITY_CACHE_ENABLED,
			SMAEmailHistoryModelImpl.FINDER_CACHE_ENABLED,
			SMAEmailHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SMAEmailHistoryModelImpl.ENTITY_CACHE_ENABLED,
			SMAEmailHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the s m a email history in the entity cache if it is enabled.
	 *
	 * @param smaEmailHistory the s m a email history
	 */
	public void cacheResult(SMAEmailHistory smaEmailHistory) {
		EntityCacheUtil.putResult(SMAEmailHistoryModelImpl.ENTITY_CACHE_ENABLED,
			SMAEmailHistoryImpl.class, smaEmailHistory.getPrimaryKey(),
			smaEmailHistory);

		smaEmailHistory.resetOriginalValues();
	}

	/**
	 * Caches the s m a email histories in the entity cache if it is enabled.
	 *
	 * @param smaEmailHistories the s m a email histories
	 */
	public void cacheResult(List<SMAEmailHistory> smaEmailHistories) {
		for (SMAEmailHistory smaEmailHistory : smaEmailHistories) {
			if (EntityCacheUtil.getResult(
						SMAEmailHistoryModelImpl.ENTITY_CACHE_ENABLED,
						SMAEmailHistoryImpl.class,
						smaEmailHistory.getPrimaryKey()) == null) {
				cacheResult(smaEmailHistory);
			}
			else {
				smaEmailHistory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all s m a email histories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SMAEmailHistoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SMAEmailHistoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the s m a email history.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SMAEmailHistory smaEmailHistory) {
		EntityCacheUtil.removeResult(SMAEmailHistoryModelImpl.ENTITY_CACHE_ENABLED,
			SMAEmailHistoryImpl.class, smaEmailHistory.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SMAEmailHistory> smaEmailHistories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SMAEmailHistory smaEmailHistory : smaEmailHistories) {
			EntityCacheUtil.removeResult(SMAEmailHistoryModelImpl.ENTITY_CACHE_ENABLED,
				SMAEmailHistoryImpl.class, smaEmailHistory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new s m a email history with the primary key. Does not add the s m a email history to the database.
	 *
	 * @param id the primary key for the new s m a email history
	 * @return the new s m a email history
	 */
	public SMAEmailHistory create(long id) {
		SMAEmailHistory smaEmailHistory = new SMAEmailHistoryImpl();

		smaEmailHistory.setNew(true);
		smaEmailHistory.setPrimaryKey(id);

		return smaEmailHistory;
	}

	/**
	 * Removes the s m a email history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the s m a email history
	 * @return the s m a email history that was removed
	 * @throws com.pacnet.connect.NoSuchSMAEmailHistoryException if a s m a email history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAEmailHistory remove(long id)
		throws NoSuchSMAEmailHistoryException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the s m a email history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the s m a email history
	 * @return the s m a email history that was removed
	 * @throws com.pacnet.connect.NoSuchSMAEmailHistoryException if a s m a email history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMAEmailHistory remove(Serializable primaryKey)
		throws NoSuchSMAEmailHistoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SMAEmailHistory smaEmailHistory = (SMAEmailHistory)session.get(SMAEmailHistoryImpl.class,
					primaryKey);

			if (smaEmailHistory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSMAEmailHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(smaEmailHistory);
		}
		catch (NoSuchSMAEmailHistoryException nsee) {
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
	protected SMAEmailHistory removeImpl(SMAEmailHistory smaEmailHistory)
		throws SystemException {
		smaEmailHistory = toUnwrappedModel(smaEmailHistory);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, smaEmailHistory);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(smaEmailHistory);

		return smaEmailHistory;
	}

	@Override
	public SMAEmailHistory updateImpl(
		com.pacnet.connect.model.SMAEmailHistory smaEmailHistory, boolean merge)
		throws SystemException {
		smaEmailHistory = toUnwrappedModel(smaEmailHistory);

		boolean isNew = smaEmailHistory.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, smaEmailHistory, merge);

			smaEmailHistory.setNew(false);
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

		EntityCacheUtil.putResult(SMAEmailHistoryModelImpl.ENTITY_CACHE_ENABLED,
			SMAEmailHistoryImpl.class, smaEmailHistory.getPrimaryKey(),
			smaEmailHistory);

		return smaEmailHistory;
	}

	protected SMAEmailHistory toUnwrappedModel(SMAEmailHistory smaEmailHistory) {
		if (smaEmailHistory instanceof SMAEmailHistoryImpl) {
			return smaEmailHistory;
		}

		SMAEmailHistoryImpl smaEmailHistoryImpl = new SMAEmailHistoryImpl();

		smaEmailHistoryImpl.setNew(smaEmailHistory.isNew());
		smaEmailHistoryImpl.setPrimaryKey(smaEmailHistory.getPrimaryKey());

		smaEmailHistoryImpl.setId(smaEmailHistory.getId());
		smaEmailHistoryImpl.setName(smaEmailHistory.getName());
		smaEmailHistoryImpl.setHistoryType(smaEmailHistory.getHistoryType());
		smaEmailHistoryImpl.setEmailFrom(smaEmailHistory.getEmailFrom());
		smaEmailHistoryImpl.setEmailTo(smaEmailHistory.getEmailTo());
		smaEmailHistoryImpl.setEmailTitle(smaEmailHistory.getEmailTitle());
		smaEmailHistoryImpl.setEmailContent(smaEmailHistory.getEmailContent());
		smaEmailHistoryImpl.setIsActive(smaEmailHistory.getIsActive());
		smaEmailHistoryImpl.setCreatedOn(smaEmailHistory.getCreatedOn());
		smaEmailHistoryImpl.setCreatedBy(smaEmailHistory.getCreatedBy());
		smaEmailHistoryImpl.setUpdatedOn(smaEmailHistory.getUpdatedOn());
		smaEmailHistoryImpl.setUpdatedBy(smaEmailHistory.getUpdatedBy());

		return smaEmailHistoryImpl;
	}

	/**
	 * Returns the s m a email history with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the s m a email history
	 * @return the s m a email history
	 * @throws com.liferay.portal.NoSuchModelException if a s m a email history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMAEmailHistory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the s m a email history with the primary key or throws a {@link com.pacnet.connect.NoSuchSMAEmailHistoryException} if it could not be found.
	 *
	 * @param id the primary key of the s m a email history
	 * @return the s m a email history
	 * @throws com.pacnet.connect.NoSuchSMAEmailHistoryException if a s m a email history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAEmailHistory findByPrimaryKey(long id)
		throws NoSuchSMAEmailHistoryException, SystemException {
		SMAEmailHistory smaEmailHistory = fetchByPrimaryKey(id);

		if (smaEmailHistory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchSMAEmailHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return smaEmailHistory;
	}

	/**
	 * Returns the s m a email history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the s m a email history
	 * @return the s m a email history, or <code>null</code> if a s m a email history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMAEmailHistory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the s m a email history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the s m a email history
	 * @return the s m a email history, or <code>null</code> if a s m a email history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAEmailHistory fetchByPrimaryKey(long id) throws SystemException {
		SMAEmailHistory smaEmailHistory = (SMAEmailHistory)EntityCacheUtil.getResult(SMAEmailHistoryModelImpl.ENTITY_CACHE_ENABLED,
				SMAEmailHistoryImpl.class, id);

		if (smaEmailHistory == _nullSMAEmailHistory) {
			return null;
		}

		if (smaEmailHistory == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				smaEmailHistory = (SMAEmailHistory)session.get(SMAEmailHistoryImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (smaEmailHistory != null) {
					cacheResult(smaEmailHistory);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(SMAEmailHistoryModelImpl.ENTITY_CACHE_ENABLED,
						SMAEmailHistoryImpl.class, id, _nullSMAEmailHistory);
				}

				closeSession(session);
			}
		}

		return smaEmailHistory;
	}

	/**
	 * Returns all the s m a email histories.
	 *
	 * @return the s m a email histories
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAEmailHistory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a email histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s m a email histories
	 * @param end the upper bound of the range of s m a email histories (not inclusive)
	 * @return the range of s m a email histories
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAEmailHistory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a email histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s m a email histories
	 * @param end the upper bound of the range of s m a email histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of s m a email histories
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAEmailHistory> findAll(int start, int end,
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

		List<SMAEmailHistory> list = (List<SMAEmailHistory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SMAEMAILHISTORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SMAEMAILHISTORY;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<SMAEmailHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<SMAEmailHistory>)QueryUtil.list(q,
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
	 * Removes all the s m a email histories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (SMAEmailHistory smaEmailHistory : findAll()) {
			remove(smaEmailHistory);
		}
	}

	/**
	 * Returns the number of s m a email histories.
	 *
	 * @return the number of s m a email histories
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SMAEMAILHISTORY);

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
	 * Initializes the s m a email history persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.SMAEmailHistory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SMAEmailHistory>> listenersList = new ArrayList<ModelListener<SMAEmailHistory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SMAEmailHistory>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SMAEmailHistoryImpl.class.getName());
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
	private static final String _SQL_SELECT_SMAEMAILHISTORY = "SELECT smaEmailHistory FROM SMAEmailHistory smaEmailHistory";
	private static final String _SQL_COUNT_SMAEMAILHISTORY = "SELECT COUNT(smaEmailHistory) FROM SMAEmailHistory smaEmailHistory";
	private static final String _ORDER_BY_ENTITY_ALIAS = "smaEmailHistory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SMAEmailHistory exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SMAEmailHistoryPersistenceImpl.class);
	private static SMAEmailHistory _nullSMAEmailHistory = new SMAEmailHistoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SMAEmailHistory> toCacheModel() {
				return _nullSMAEmailHistoryCacheModel;
			}
		};

	private static CacheModel<SMAEmailHistory> _nullSMAEmailHistoryCacheModel = new CacheModel<SMAEmailHistory>() {
			public SMAEmailHistory toEntityModel() {
				return _nullSMAEmailHistory;
			}
		};
}