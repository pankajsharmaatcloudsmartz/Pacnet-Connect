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
import com.liferay.portal.kernel.util.CalendarUtil;
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

import com.pacnet.connect.NoSuchSMAReservationException;
import com.pacnet.connect.model.SMAReservation;
import com.pacnet.connect.model.impl.SMAReservationImpl;
import com.pacnet.connect.model.impl.SMAReservationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the s m a reservation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMAReservationPersistence
 * @see SMAReservationUtil
 * @generated
 */
public class SMAReservationPersistenceImpl extends BasePersistenceImpl<SMAReservation>
	implements SMAReservationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SMAReservationUtil} to access the s m a reservation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SMAReservationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMADOMAINSLISTBYCREATEDBY =
		new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED,
			SMAReservationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMADomainsListByCreatedBy",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYCREATEDBY =
		new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED,
			SMAReservationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMADomainsListByCreatedBy",
			new String[] { Integer.class.getName(), String.class.getName() },
			SMAReservationModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMAReservationModelImpl.CREATEDBY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYCREATEDBY =
		new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMADomainsListByCreatedBy",
			new String[] { Integer.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMADOMAINSLISTBYNAME =
		new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED,
			SMAReservationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMADomainsListByName",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYNAME =
		new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED,
			SMAReservationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMADomainsListByName",
			new String[] { Integer.class.getName(), String.class.getName() },
			SMAReservationModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMAReservationModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYNAME = new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMADomainsListByName",
			new String[] { Integer.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMADOMAINSLISTBYOWNER =
		new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED,
			SMAReservationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMADomainsListByOwner",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYOWNER =
		new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED,
			SMAReservationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMADomainsListByOwner",
			new String[] { Integer.class.getName(), String.class.getName() },
			SMAReservationModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMAReservationModelImpl.OWNER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYOWNER = new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMADomainsListByOwner",
			new String[] { Integer.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMADOMAINSLISTBYSTARTDATE =
		new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED,
			SMAReservationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMADomainsListByStartDate",
			new String[] {
				Integer.class.getName(), Date.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYSTARTDATE =
		new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED,
			SMAReservationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMADomainsListByStartDate",
			new String[] { Integer.class.getName(), Date.class.getName() },
			SMAReservationModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMAReservationModelImpl.STARTDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYSTARTDATE =
		new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMADomainsListByStartDate",
			new String[] { Integer.class.getName(), Date.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMADOMAINSLISTBYENDDATE =
		new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED,
			SMAReservationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMADomainsListByEndDate",
			new String[] {
				Integer.class.getName(), Date.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYENDDATE =
		new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED,
			SMAReservationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMADomainsListByEndDate",
			new String[] { Integer.class.getName(), Date.class.getName() },
			SMAReservationModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMAReservationModelImpl.ENDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYENDDATE = new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMADomainsListByEndDate",
			new String[] { Integer.class.getName(), Date.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMADOMAINSLISTBYPROVISION =
		new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED,
			SMAReservationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMADomainsListByProvision",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYPROVISION =
		new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED,
			SMAReservationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMADomainsListByProvision",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			SMAReservationModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMAReservationModelImpl.PROVISION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYPROVISION =
		new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMADomainsListByProvision",
			new String[] { Integer.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED,
			SMAReservationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED,
			SMAReservationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the s m a reservation in the entity cache if it is enabled.
	 *
	 * @param smaReservation the s m a reservation
	 */
	public void cacheResult(SMAReservation smaReservation) {
		EntityCacheUtil.putResult(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationImpl.class, smaReservation.getPrimaryKey(),
			smaReservation);

		smaReservation.resetOriginalValues();
	}

	/**
	 * Caches the s m a reservations in the entity cache if it is enabled.
	 *
	 * @param smaReservations the s m a reservations
	 */
	public void cacheResult(List<SMAReservation> smaReservations) {
		for (SMAReservation smaReservation : smaReservations) {
			if (EntityCacheUtil.getResult(
						SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
						SMAReservationImpl.class, smaReservation.getPrimaryKey()) == null) {
				cacheResult(smaReservation);
			}
			else {
				smaReservation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all s m a reservations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SMAReservationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SMAReservationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the s m a reservation.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SMAReservation smaReservation) {
		EntityCacheUtil.removeResult(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationImpl.class, smaReservation.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SMAReservation> smaReservations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SMAReservation smaReservation : smaReservations) {
			EntityCacheUtil.removeResult(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
				SMAReservationImpl.class, smaReservation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new s m a reservation with the primary key. Does not add the s m a reservation to the database.
	 *
	 * @param id the primary key for the new s m a reservation
	 * @return the new s m a reservation
	 */
	public SMAReservation create(long id) {
		SMAReservation smaReservation = new SMAReservationImpl();

		smaReservation.setNew(true);
		smaReservation.setPrimaryKey(id);

		return smaReservation;
	}

	/**
	 * Removes the s m a reservation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the s m a reservation
	 * @return the s m a reservation that was removed
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation remove(long id)
		throws NoSuchSMAReservationException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the s m a reservation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the s m a reservation
	 * @return the s m a reservation that was removed
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMAReservation remove(Serializable primaryKey)
		throws NoSuchSMAReservationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SMAReservation smaReservation = (SMAReservation)session.get(SMAReservationImpl.class,
					primaryKey);

			if (smaReservation == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSMAReservationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(smaReservation);
		}
		catch (NoSuchSMAReservationException nsee) {
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
	protected SMAReservation removeImpl(SMAReservation smaReservation)
		throws SystemException {
		smaReservation = toUnwrappedModel(smaReservation);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, smaReservation);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(smaReservation);

		return smaReservation;
	}

	@Override
	public SMAReservation updateImpl(
		com.pacnet.connect.model.SMAReservation smaReservation, boolean merge)
		throws SystemException {
		smaReservation = toUnwrappedModel(smaReservation);

		boolean isNew = smaReservation.isNew();

		SMAReservationModelImpl smaReservationModelImpl = (SMAReservationModelImpl)smaReservation;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, smaReservation, merge);

			smaReservation.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SMAReservationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((smaReservationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYCREATEDBY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaReservationModelImpl.getOriginalIsActive()),
						
						smaReservationModelImpl.getOriginalCreatedBy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYCREATEDBY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYCREATEDBY,
					args);

				args = new Object[] {
						Integer.valueOf(smaReservationModelImpl.getIsActive()),
						
						smaReservationModelImpl.getCreatedBy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYCREATEDBY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYCREATEDBY,
					args);
			}

			if ((smaReservationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaReservationModelImpl.getOriginalIsActive()),
						
						smaReservationModelImpl.getOriginalName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYNAME,
					args);

				args = new Object[] {
						Integer.valueOf(smaReservationModelImpl.getIsActive()),
						
						smaReservationModelImpl.getName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYNAME,
					args);
			}

			if ((smaReservationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYOWNER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaReservationModelImpl.getOriginalIsActive()),
						
						smaReservationModelImpl.getOriginalOwner()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYOWNER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYOWNER,
					args);

				args = new Object[] {
						Integer.valueOf(smaReservationModelImpl.getIsActive()),
						
						smaReservationModelImpl.getOwner()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYOWNER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYOWNER,
					args);
			}

			if ((smaReservationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYSTARTDATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaReservationModelImpl.getOriginalIsActive()),
						
						smaReservationModelImpl.getOriginalStartDate()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYSTARTDATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYSTARTDATE,
					args);

				args = new Object[] {
						Integer.valueOf(smaReservationModelImpl.getIsActive()),
						
						smaReservationModelImpl.getStartDate()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYSTARTDATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYSTARTDATE,
					args);
			}

			if ((smaReservationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYENDDATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaReservationModelImpl.getOriginalIsActive()),
						
						smaReservationModelImpl.getOriginalEndDate()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYENDDATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYENDDATE,
					args);

				args = new Object[] {
						Integer.valueOf(smaReservationModelImpl.getIsActive()),
						
						smaReservationModelImpl.getEndDate()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYENDDATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYENDDATE,
					args);
			}

			if ((smaReservationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYPROVISION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaReservationModelImpl.getOriginalIsActive()),
						Integer.valueOf(smaReservationModelImpl.getOriginalProvision())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYPROVISION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYPROVISION,
					args);

				args = new Object[] {
						Integer.valueOf(smaReservationModelImpl.getIsActive()),
						Integer.valueOf(smaReservationModelImpl.getProvision())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYPROVISION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYPROVISION,
					args);
			}
		}

		EntityCacheUtil.putResult(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
			SMAReservationImpl.class, smaReservation.getPrimaryKey(),
			smaReservation);

		return smaReservation;
	}

	protected SMAReservation toUnwrappedModel(SMAReservation smaReservation) {
		if (smaReservation instanceof SMAReservationImpl) {
			return smaReservation;
		}

		SMAReservationImpl smaReservationImpl = new SMAReservationImpl();

		smaReservationImpl.setNew(smaReservation.isNew());
		smaReservationImpl.setPrimaryKey(smaReservation.getPrimaryKey());

		smaReservationImpl.setId(smaReservation.getId());
		smaReservationImpl.setName(smaReservation.getName());
		smaReservationImpl.setStartDate(smaReservation.getStartDate());
		smaReservationImpl.setEndDate(smaReservation.getEndDate());
		smaReservationImpl.setOwner(smaReservation.getOwner());
		smaReservationImpl.setProvision(smaReservation.getProvision());
		smaReservationImpl.setIsActive(smaReservation.getIsActive());
		smaReservationImpl.setCreatedOn(smaReservation.getCreatedOn());
		smaReservationImpl.setCreatedBy(smaReservation.getCreatedBy());
		smaReservationImpl.setUpdatedOn(smaReservation.getUpdatedOn());
		smaReservationImpl.setUpdatedBy(smaReservation.getUpdatedBy());

		return smaReservationImpl;
	}

	/**
	 * Returns the s m a reservation with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the s m a reservation
	 * @return the s m a reservation
	 * @throws com.liferay.portal.NoSuchModelException if a s m a reservation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMAReservation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the s m a reservation with the primary key or throws a {@link com.pacnet.connect.NoSuchSMAReservationException} if it could not be found.
	 *
	 * @param id the primary key of the s m a reservation
	 * @return the s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation findByPrimaryKey(long id)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = fetchByPrimaryKey(id);

		if (smaReservation == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchSMAReservationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return smaReservation;
	}

	/**
	 * Returns the s m a reservation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the s m a reservation
	 * @return the s m a reservation, or <code>null</code> if a s m a reservation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMAReservation fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the s m a reservation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the s m a reservation
	 * @return the s m a reservation, or <code>null</code> if a s m a reservation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation fetchByPrimaryKey(long id) throws SystemException {
		SMAReservation smaReservation = (SMAReservation)EntityCacheUtil.getResult(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
				SMAReservationImpl.class, id);

		if (smaReservation == _nullSMAReservation) {
			return null;
		}

		if (smaReservation == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				smaReservation = (SMAReservation)session.get(SMAReservationImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (smaReservation != null) {
					cacheResult(smaReservation);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(SMAReservationModelImpl.ENTITY_CACHE_ENABLED,
						SMAReservationImpl.class, id, _nullSMAReservation);
				}

				closeSession(session);
			}
		}

		return smaReservation;
	}

	/**
	 * Returns all the s m a reservations where isActive = &#63; and createdBy = &#63;.
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @return the matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByCreatedBy(int isActive,
		String createdBy) throws SystemException {
		return findBySMADomainsListByCreatedBy(isActive, createdBy,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a reservations where isActive = &#63; and createdBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @param start the lower bound of the range of s m a reservations
	 * @param end the upper bound of the range of s m a reservations (not inclusive)
	 * @return the range of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByCreatedBy(int isActive,
		String createdBy, int start, int end) throws SystemException {
		return findBySMADomainsListByCreatedBy(isActive, createdBy, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the s m a reservations where isActive = &#63; and createdBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @param start the lower bound of the range of s m a reservations
	 * @param end the upper bound of the range of s m a reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByCreatedBy(int isActive,
		String createdBy, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYCREATEDBY;
			finderArgs = new Object[] { isActive, createdBy };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMADOMAINSLISTBYCREATEDBY;
			finderArgs = new Object[] {
					isActive, createdBy,
					
					start, end, orderByComparator
				};
		}

		List<SMAReservation> list = (List<SMAReservation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMAReservation smaReservation : list) {
				if ((isActive != smaReservation.getIsActive()) ||
						!Validator.equals(createdBy,
							smaReservation.getCreatedBy())) {
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

			query.append(_SQL_SELECT_SMARESERVATION_WHERE);

			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_ISACTIVE_2);

			if (createdBy == null) {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_CREATEDBY_1);
			}
			else {
				if (createdBy.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_CREATEDBY_3);
				}
				else {
					query.append(_FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_CREATEDBY_2);
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

				qPos.add(isActive);

				if (createdBy != null) {
					qPos.add(createdBy);
				}

				list = (List<SMAReservation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first s m a reservation in the ordered set where isActive = &#63; and createdBy = &#63;.
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation findBySMADomainsListByCreatedBy_First(int isActive,
		String createdBy, OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = fetchBySMADomainsListByCreatedBy_First(isActive,
				createdBy, orderByComparator);

		if (smaReservation != null) {
			return smaReservation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", createdBy=");
		msg.append(createdBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAReservationException(msg.toString());
	}

	/**
	 * Returns the first s m a reservation in the ordered set where isActive = &#63; and createdBy = &#63;.
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation fetchBySMADomainsListByCreatedBy_First(int isActive,
		String createdBy, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMAReservation> list = findBySMADomainsListByCreatedBy(isActive,
				createdBy, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a reservation in the ordered set where isActive = &#63; and createdBy = &#63;.
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation findBySMADomainsListByCreatedBy_Last(int isActive,
		String createdBy, OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = fetchBySMADomainsListByCreatedBy_Last(isActive,
				createdBy, orderByComparator);

		if (smaReservation != null) {
			return smaReservation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", createdBy=");
		msg.append(createdBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAReservationException(msg.toString());
	}

	/**
	 * Returns the last s m a reservation in the ordered set where isActive = &#63; and createdBy = &#63;.
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation fetchBySMADomainsListByCreatedBy_Last(int isActive,
		String createdBy, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMADomainsListByCreatedBy(isActive, createdBy);

		List<SMAReservation> list = findBySMADomainsListByCreatedBy(isActive,
				createdBy, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a reservations before and after the current s m a reservation in the ordered set where isActive = &#63; and createdBy = &#63;.
	 *
	 * @param id the primary key of the current s m a reservation
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation[] findBySMADomainsListByCreatedBy_PrevAndNext(
		long id, int isActive, String createdBy,
		OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMAReservation[] array = new SMAReservationImpl[3];

			array[0] = getBySMADomainsListByCreatedBy_PrevAndNext(session,
					smaReservation, isActive, createdBy, orderByComparator, true);

			array[1] = smaReservation;

			array[2] = getBySMADomainsListByCreatedBy_PrevAndNext(session,
					smaReservation, isActive, createdBy, orderByComparator,
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

	protected SMAReservation getBySMADomainsListByCreatedBy_PrevAndNext(
		Session session, SMAReservation smaReservation, int isActive,
		String createdBy, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMARESERVATION_WHERE);

		query.append(_FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_ISACTIVE_2);

		if (createdBy == null) {
			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_CREATEDBY_1);
		}
		else {
			if (createdBy.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_CREATEDBY_3);
			}
			else {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_CREATEDBY_2);
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

		qPos.add(isActive);

		if (createdBy != null) {
			qPos.add(createdBy);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaReservation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMAReservation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a reservations where isActive = &#63; and name = &#63;.
	 *
	 * @param isActive the is active
	 * @param name the name
	 * @return the matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByName(int isActive,
		String name) throws SystemException {
		return findBySMADomainsListByName(isActive, name, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a reservations where isActive = &#63; and name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param name the name
	 * @param start the lower bound of the range of s m a reservations
	 * @param end the upper bound of the range of s m a reservations (not inclusive)
	 * @return the range of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByName(int isActive,
		String name, int start, int end) throws SystemException {
		return findBySMADomainsListByName(isActive, name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a reservations where isActive = &#63; and name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param name the name
	 * @param start the lower bound of the range of s m a reservations
	 * @param end the upper bound of the range of s m a reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByName(int isActive,
		String name, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYNAME;
			finderArgs = new Object[] { isActive, name };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMADOMAINSLISTBYNAME;
			finderArgs = new Object[] {
					isActive, name,
					
					start, end, orderByComparator
				};
		}

		List<SMAReservation> list = (List<SMAReservation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMAReservation smaReservation : list) {
				if ((isActive != smaReservation.getIsActive()) ||
						!Validator.equals(name, smaReservation.getName())) {
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

			query.append(_SQL_SELECT_SMARESERVATION_WHERE);

			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYNAME_ISACTIVE_2);

			if (name == null) {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYNAME_NAME_1);
			}
			else {
				if (name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SMADOMAINSLISTBYNAME_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_SMADOMAINSLISTBYNAME_NAME_2);
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

				qPos.add(isActive);

				if (name != null) {
					qPos.add(name);
				}

				list = (List<SMAReservation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first s m a reservation in the ordered set where isActive = &#63; and name = &#63;.
	 *
	 * @param isActive the is active
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation findBySMADomainsListByName_First(int isActive,
		String name, OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = fetchBySMADomainsListByName_First(isActive,
				name, orderByComparator);

		if (smaReservation != null) {
			return smaReservation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAReservationException(msg.toString());
	}

	/**
	 * Returns the first s m a reservation in the ordered set where isActive = &#63; and name = &#63;.
	 *
	 * @param isActive the is active
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation fetchBySMADomainsListByName_First(int isActive,
		String name, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMAReservation> list = findBySMADomainsListByName(isActive, name,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a reservation in the ordered set where isActive = &#63; and name = &#63;.
	 *
	 * @param isActive the is active
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation findBySMADomainsListByName_Last(int isActive,
		String name, OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = fetchBySMADomainsListByName_Last(isActive,
				name, orderByComparator);

		if (smaReservation != null) {
			return smaReservation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAReservationException(msg.toString());
	}

	/**
	 * Returns the last s m a reservation in the ordered set where isActive = &#63; and name = &#63;.
	 *
	 * @param isActive the is active
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation fetchBySMADomainsListByName_Last(int isActive,
		String name, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMADomainsListByName(isActive, name);

		List<SMAReservation> list = findBySMADomainsListByName(isActive, name,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a reservations before and after the current s m a reservation in the ordered set where isActive = &#63; and name = &#63;.
	 *
	 * @param id the primary key of the current s m a reservation
	 * @param isActive the is active
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation[] findBySMADomainsListByName_PrevAndNext(long id,
		int isActive, String name, OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMAReservation[] array = new SMAReservationImpl[3];

			array[0] = getBySMADomainsListByName_PrevAndNext(session,
					smaReservation, isActive, name, orderByComparator, true);

			array[1] = smaReservation;

			array[2] = getBySMADomainsListByName_PrevAndNext(session,
					smaReservation, isActive, name, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMAReservation getBySMADomainsListByName_PrevAndNext(
		Session session, SMAReservation smaReservation, int isActive,
		String name, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMARESERVATION_WHERE);

		query.append(_FINDER_COLUMN_SMADOMAINSLISTBYNAME_ISACTIVE_2);

		if (name == null) {
			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYNAME_NAME_1);
		}
		else {
			if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYNAME_NAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYNAME_NAME_2);
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

		qPos.add(isActive);

		if (name != null) {
			qPos.add(name);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaReservation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMAReservation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a reservations where isActive = &#63; and owner = &#63;.
	 *
	 * @param isActive the is active
	 * @param owner the owner
	 * @return the matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByOwner(int isActive,
		String owner) throws SystemException {
		return findBySMADomainsListByOwner(isActive, owner, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a reservations where isActive = &#63; and owner = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param owner the owner
	 * @param start the lower bound of the range of s m a reservations
	 * @param end the upper bound of the range of s m a reservations (not inclusive)
	 * @return the range of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByOwner(int isActive,
		String owner, int start, int end) throws SystemException {
		return findBySMADomainsListByOwner(isActive, owner, start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a reservations where isActive = &#63; and owner = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param owner the owner
	 * @param start the lower bound of the range of s m a reservations
	 * @param end the upper bound of the range of s m a reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByOwner(int isActive,
		String owner, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYOWNER;
			finderArgs = new Object[] { isActive, owner };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMADOMAINSLISTBYOWNER;
			finderArgs = new Object[] {
					isActive, owner,
					
					start, end, orderByComparator
				};
		}

		List<SMAReservation> list = (List<SMAReservation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMAReservation smaReservation : list) {
				if ((isActive != smaReservation.getIsActive()) ||
						!Validator.equals(owner, smaReservation.getOwner())) {
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

			query.append(_SQL_SELECT_SMARESERVATION_WHERE);

			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYOWNER_ISACTIVE_2);

			if (owner == null) {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYOWNER_OWNER_1);
			}
			else {
				if (owner.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SMADOMAINSLISTBYOWNER_OWNER_3);
				}
				else {
					query.append(_FINDER_COLUMN_SMADOMAINSLISTBYOWNER_OWNER_2);
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

				qPos.add(isActive);

				if (owner != null) {
					qPos.add(owner);
				}

				list = (List<SMAReservation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first s m a reservation in the ordered set where isActive = &#63; and owner = &#63;.
	 *
	 * @param isActive the is active
	 * @param owner the owner
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation findBySMADomainsListByOwner_First(int isActive,
		String owner, OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = fetchBySMADomainsListByOwner_First(isActive,
				owner, orderByComparator);

		if (smaReservation != null) {
			return smaReservation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", owner=");
		msg.append(owner);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAReservationException(msg.toString());
	}

	/**
	 * Returns the first s m a reservation in the ordered set where isActive = &#63; and owner = &#63;.
	 *
	 * @param isActive the is active
	 * @param owner the owner
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation fetchBySMADomainsListByOwner_First(int isActive,
		String owner, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMAReservation> list = findBySMADomainsListByOwner(isActive,
				owner, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a reservation in the ordered set where isActive = &#63; and owner = &#63;.
	 *
	 * @param isActive the is active
	 * @param owner the owner
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation findBySMADomainsListByOwner_Last(int isActive,
		String owner, OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = fetchBySMADomainsListByOwner_Last(isActive,
				owner, orderByComparator);

		if (smaReservation != null) {
			return smaReservation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", owner=");
		msg.append(owner);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAReservationException(msg.toString());
	}

	/**
	 * Returns the last s m a reservation in the ordered set where isActive = &#63; and owner = &#63;.
	 *
	 * @param isActive the is active
	 * @param owner the owner
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation fetchBySMADomainsListByOwner_Last(int isActive,
		String owner, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMADomainsListByOwner(isActive, owner);

		List<SMAReservation> list = findBySMADomainsListByOwner(isActive,
				owner, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a reservations before and after the current s m a reservation in the ordered set where isActive = &#63; and owner = &#63;.
	 *
	 * @param id the primary key of the current s m a reservation
	 * @param isActive the is active
	 * @param owner the owner
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation[] findBySMADomainsListByOwner_PrevAndNext(long id,
		int isActive, String owner, OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMAReservation[] array = new SMAReservationImpl[3];

			array[0] = getBySMADomainsListByOwner_PrevAndNext(session,
					smaReservation, isActive, owner, orderByComparator, true);

			array[1] = smaReservation;

			array[2] = getBySMADomainsListByOwner_PrevAndNext(session,
					smaReservation, isActive, owner, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMAReservation getBySMADomainsListByOwner_PrevAndNext(
		Session session, SMAReservation smaReservation, int isActive,
		String owner, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMARESERVATION_WHERE);

		query.append(_FINDER_COLUMN_SMADOMAINSLISTBYOWNER_ISACTIVE_2);

		if (owner == null) {
			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYOWNER_OWNER_1);
		}
		else {
			if (owner.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYOWNER_OWNER_3);
			}
			else {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYOWNER_OWNER_2);
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

		qPos.add(isActive);

		if (owner != null) {
			qPos.add(owner);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaReservation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMAReservation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a reservations where isActive = &#63; and startDate = &#63;.
	 *
	 * @param isActive the is active
	 * @param startDate the start date
	 * @return the matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByStartDate(int isActive,
		Date startDate) throws SystemException {
		return findBySMADomainsListByStartDate(isActive, startDate,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a reservations where isActive = &#63; and startDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param startDate the start date
	 * @param start the lower bound of the range of s m a reservations
	 * @param end the upper bound of the range of s m a reservations (not inclusive)
	 * @return the range of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByStartDate(int isActive,
		Date startDate, int start, int end) throws SystemException {
		return findBySMADomainsListByStartDate(isActive, startDate, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the s m a reservations where isActive = &#63; and startDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param startDate the start date
	 * @param start the lower bound of the range of s m a reservations
	 * @param end the upper bound of the range of s m a reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByStartDate(int isActive,
		Date startDate, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYSTARTDATE;
			finderArgs = new Object[] { isActive, startDate };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMADOMAINSLISTBYSTARTDATE;
			finderArgs = new Object[] {
					isActive, startDate,
					
					start, end, orderByComparator
				};
		}

		List<SMAReservation> list = (List<SMAReservation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMAReservation smaReservation : list) {
				if ((isActive != smaReservation.getIsActive()) ||
						!Validator.equals(startDate,
							smaReservation.getStartDate())) {
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

			query.append(_SQL_SELECT_SMARESERVATION_WHERE);

			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYSTARTDATE_ISACTIVE_2);

			if (startDate == null) {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYSTARTDATE_STARTDATE_1);
			}
			else {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYSTARTDATE_STARTDATE_2);
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

				qPos.add(isActive);

				if (startDate != null) {
					qPos.add(CalendarUtil.getTimestamp(startDate));
				}

				list = (List<SMAReservation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first s m a reservation in the ordered set where isActive = &#63; and startDate = &#63;.
	 *
	 * @param isActive the is active
	 * @param startDate the start date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation findBySMADomainsListByStartDate_First(int isActive,
		Date startDate, OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = fetchBySMADomainsListByStartDate_First(isActive,
				startDate, orderByComparator);

		if (smaReservation != null) {
			return smaReservation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", startDate=");
		msg.append(startDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAReservationException(msg.toString());
	}

	/**
	 * Returns the first s m a reservation in the ordered set where isActive = &#63; and startDate = &#63;.
	 *
	 * @param isActive the is active
	 * @param startDate the start date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation fetchBySMADomainsListByStartDate_First(int isActive,
		Date startDate, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMAReservation> list = findBySMADomainsListByStartDate(isActive,
				startDate, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a reservation in the ordered set where isActive = &#63; and startDate = &#63;.
	 *
	 * @param isActive the is active
	 * @param startDate the start date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation findBySMADomainsListByStartDate_Last(int isActive,
		Date startDate, OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = fetchBySMADomainsListByStartDate_Last(isActive,
				startDate, orderByComparator);

		if (smaReservation != null) {
			return smaReservation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", startDate=");
		msg.append(startDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAReservationException(msg.toString());
	}

	/**
	 * Returns the last s m a reservation in the ordered set where isActive = &#63; and startDate = &#63;.
	 *
	 * @param isActive the is active
	 * @param startDate the start date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation fetchBySMADomainsListByStartDate_Last(int isActive,
		Date startDate, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMADomainsListByStartDate(isActive, startDate);

		List<SMAReservation> list = findBySMADomainsListByStartDate(isActive,
				startDate, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a reservations before and after the current s m a reservation in the ordered set where isActive = &#63; and startDate = &#63;.
	 *
	 * @param id the primary key of the current s m a reservation
	 * @param isActive the is active
	 * @param startDate the start date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation[] findBySMADomainsListByStartDate_PrevAndNext(
		long id, int isActive, Date startDate,
		OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMAReservation[] array = new SMAReservationImpl[3];

			array[0] = getBySMADomainsListByStartDate_PrevAndNext(session,
					smaReservation, isActive, startDate, orderByComparator, true);

			array[1] = smaReservation;

			array[2] = getBySMADomainsListByStartDate_PrevAndNext(session,
					smaReservation, isActive, startDate, orderByComparator,
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

	protected SMAReservation getBySMADomainsListByStartDate_PrevAndNext(
		Session session, SMAReservation smaReservation, int isActive,
		Date startDate, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMARESERVATION_WHERE);

		query.append(_FINDER_COLUMN_SMADOMAINSLISTBYSTARTDATE_ISACTIVE_2);

		if (startDate == null) {
			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYSTARTDATE_STARTDATE_1);
		}
		else {
			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYSTARTDATE_STARTDATE_2);
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

		qPos.add(isActive);

		if (startDate != null) {
			qPos.add(CalendarUtil.getTimestamp(startDate));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaReservation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMAReservation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a reservations where isActive = &#63; and endDate = &#63;.
	 *
	 * @param isActive the is active
	 * @param endDate the end date
	 * @return the matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByEndDate(int isActive,
		Date endDate) throws SystemException {
		return findBySMADomainsListByEndDate(isActive, endDate,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a reservations where isActive = &#63; and endDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param endDate the end date
	 * @param start the lower bound of the range of s m a reservations
	 * @param end the upper bound of the range of s m a reservations (not inclusive)
	 * @return the range of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByEndDate(int isActive,
		Date endDate, int start, int end) throws SystemException {
		return findBySMADomainsListByEndDate(isActive, endDate, start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a reservations where isActive = &#63; and endDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param endDate the end date
	 * @param start the lower bound of the range of s m a reservations
	 * @param end the upper bound of the range of s m a reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByEndDate(int isActive,
		Date endDate, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYENDDATE;
			finderArgs = new Object[] { isActive, endDate };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMADOMAINSLISTBYENDDATE;
			finderArgs = new Object[] {
					isActive, endDate,
					
					start, end, orderByComparator
				};
		}

		List<SMAReservation> list = (List<SMAReservation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMAReservation smaReservation : list) {
				if ((isActive != smaReservation.getIsActive()) ||
						!Validator.equals(endDate, smaReservation.getEndDate())) {
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

			query.append(_SQL_SELECT_SMARESERVATION_WHERE);

			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYENDDATE_ISACTIVE_2);

			if (endDate == null) {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYENDDATE_ENDDATE_1);
			}
			else {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYENDDATE_ENDDATE_2);
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

				qPos.add(isActive);

				if (endDate != null) {
					qPos.add(CalendarUtil.getTimestamp(endDate));
				}

				list = (List<SMAReservation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first s m a reservation in the ordered set where isActive = &#63; and endDate = &#63;.
	 *
	 * @param isActive the is active
	 * @param endDate the end date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation findBySMADomainsListByEndDate_First(int isActive,
		Date endDate, OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = fetchBySMADomainsListByEndDate_First(isActive,
				endDate, orderByComparator);

		if (smaReservation != null) {
			return smaReservation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", endDate=");
		msg.append(endDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAReservationException(msg.toString());
	}

	/**
	 * Returns the first s m a reservation in the ordered set where isActive = &#63; and endDate = &#63;.
	 *
	 * @param isActive the is active
	 * @param endDate the end date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation fetchBySMADomainsListByEndDate_First(int isActive,
		Date endDate, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMAReservation> list = findBySMADomainsListByEndDate(isActive,
				endDate, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a reservation in the ordered set where isActive = &#63; and endDate = &#63;.
	 *
	 * @param isActive the is active
	 * @param endDate the end date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation findBySMADomainsListByEndDate_Last(int isActive,
		Date endDate, OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = fetchBySMADomainsListByEndDate_Last(isActive,
				endDate, orderByComparator);

		if (smaReservation != null) {
			return smaReservation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", endDate=");
		msg.append(endDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAReservationException(msg.toString());
	}

	/**
	 * Returns the last s m a reservation in the ordered set where isActive = &#63; and endDate = &#63;.
	 *
	 * @param isActive the is active
	 * @param endDate the end date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation fetchBySMADomainsListByEndDate_Last(int isActive,
		Date endDate, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMADomainsListByEndDate(isActive, endDate);

		List<SMAReservation> list = findBySMADomainsListByEndDate(isActive,
				endDate, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a reservations before and after the current s m a reservation in the ordered set where isActive = &#63; and endDate = &#63;.
	 *
	 * @param id the primary key of the current s m a reservation
	 * @param isActive the is active
	 * @param endDate the end date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation[] findBySMADomainsListByEndDate_PrevAndNext(long id,
		int isActive, Date endDate, OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMAReservation[] array = new SMAReservationImpl[3];

			array[0] = getBySMADomainsListByEndDate_PrevAndNext(session,
					smaReservation, isActive, endDate, orderByComparator, true);

			array[1] = smaReservation;

			array[2] = getBySMADomainsListByEndDate_PrevAndNext(session,
					smaReservation, isActive, endDate, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMAReservation getBySMADomainsListByEndDate_PrevAndNext(
		Session session, SMAReservation smaReservation, int isActive,
		Date endDate, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMARESERVATION_WHERE);

		query.append(_FINDER_COLUMN_SMADOMAINSLISTBYENDDATE_ISACTIVE_2);

		if (endDate == null) {
			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYENDDATE_ENDDATE_1);
		}
		else {
			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYENDDATE_ENDDATE_2);
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

		qPos.add(isActive);

		if (endDate != null) {
			qPos.add(CalendarUtil.getTimestamp(endDate));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaReservation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMAReservation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a reservations where isActive = &#63; and provision = &#63;.
	 *
	 * @param isActive the is active
	 * @param provision the provision
	 * @return the matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByProvision(int isActive,
		int provision) throws SystemException {
		return findBySMADomainsListByProvision(isActive, provision,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a reservations where isActive = &#63; and provision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param provision the provision
	 * @param start the lower bound of the range of s m a reservations
	 * @param end the upper bound of the range of s m a reservations (not inclusive)
	 * @return the range of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByProvision(int isActive,
		int provision, int start, int end) throws SystemException {
		return findBySMADomainsListByProvision(isActive, provision, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the s m a reservations where isActive = &#63; and provision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param provision the provision
	 * @param start the lower bound of the range of s m a reservations
	 * @param end the upper bound of the range of s m a reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findBySMADomainsListByProvision(int isActive,
		int provision, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMADOMAINSLISTBYPROVISION;
			finderArgs = new Object[] { isActive, provision };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMADOMAINSLISTBYPROVISION;
			finderArgs = new Object[] {
					isActive, provision,
					
					start, end, orderByComparator
				};
		}

		List<SMAReservation> list = (List<SMAReservation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMAReservation smaReservation : list) {
				if ((isActive != smaReservation.getIsActive()) ||
						(provision != smaReservation.getProvision())) {
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

			query.append(_SQL_SELECT_SMARESERVATION_WHERE);

			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYPROVISION_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYPROVISION_PROVISION_2);

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

				qPos.add(isActive);

				qPos.add(provision);

				list = (List<SMAReservation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first s m a reservation in the ordered set where isActive = &#63; and provision = &#63;.
	 *
	 * @param isActive the is active
	 * @param provision the provision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation findBySMADomainsListByProvision_First(int isActive,
		int provision, OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = fetchBySMADomainsListByProvision_First(isActive,
				provision, orderByComparator);

		if (smaReservation != null) {
			return smaReservation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", provision=");
		msg.append(provision);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAReservationException(msg.toString());
	}

	/**
	 * Returns the first s m a reservation in the ordered set where isActive = &#63; and provision = &#63;.
	 *
	 * @param isActive the is active
	 * @param provision the provision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation fetchBySMADomainsListByProvision_First(int isActive,
		int provision, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMAReservation> list = findBySMADomainsListByProvision(isActive,
				provision, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a reservation in the ordered set where isActive = &#63; and provision = &#63;.
	 *
	 * @param isActive the is active
	 * @param provision the provision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation findBySMADomainsListByProvision_Last(int isActive,
		int provision, OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = fetchBySMADomainsListByProvision_Last(isActive,
				provision, orderByComparator);

		if (smaReservation != null) {
			return smaReservation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", provision=");
		msg.append(provision);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMAReservationException(msg.toString());
	}

	/**
	 * Returns the last s m a reservation in the ordered set where isActive = &#63; and provision = &#63;.
	 *
	 * @param isActive the is active
	 * @param provision the provision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation fetchBySMADomainsListByProvision_Last(int isActive,
		int provision, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMADomainsListByProvision(isActive, provision);

		List<SMAReservation> list = findBySMADomainsListByProvision(isActive,
				provision, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a reservations before and after the current s m a reservation in the ordered set where isActive = &#63; and provision = &#63;.
	 *
	 * @param id the primary key of the current s m a reservation
	 * @param isActive the is active
	 * @param provision the provision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a reservation
	 * @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMAReservation[] findBySMADomainsListByProvision_PrevAndNext(
		long id, int isActive, int provision,
		OrderByComparator orderByComparator)
		throws NoSuchSMAReservationException, SystemException {
		SMAReservation smaReservation = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMAReservation[] array = new SMAReservationImpl[3];

			array[0] = getBySMADomainsListByProvision_PrevAndNext(session,
					smaReservation, isActive, provision, orderByComparator, true);

			array[1] = smaReservation;

			array[2] = getBySMADomainsListByProvision_PrevAndNext(session,
					smaReservation, isActive, provision, orderByComparator,
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

	protected SMAReservation getBySMADomainsListByProvision_PrevAndNext(
		Session session, SMAReservation smaReservation, int isActive,
		int provision, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMARESERVATION_WHERE);

		query.append(_FINDER_COLUMN_SMADOMAINSLISTBYPROVISION_ISACTIVE_2);

		query.append(_FINDER_COLUMN_SMADOMAINSLISTBYPROVISION_PROVISION_2);

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

		qPos.add(isActive);

		qPos.add(provision);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaReservation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMAReservation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a reservations.
	 *
	 * @return the s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a reservations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s m a reservations
	 * @param end the upper bound of the range of s m a reservations (not inclusive)
	 * @return the range of s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a reservations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s m a reservations
	 * @param end the upper bound of the range of s m a reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMAReservation> findAll(int start, int end,
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

		List<SMAReservation> list = (List<SMAReservation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SMARESERVATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SMARESERVATION;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<SMAReservation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<SMAReservation>)QueryUtil.list(q,
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
	 * Removes all the s m a reservations where isActive = &#63; and createdBy = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMADomainsListByCreatedBy(int isActive, String createdBy)
		throws SystemException {
		for (SMAReservation smaReservation : findBySMADomainsListByCreatedBy(
				isActive, createdBy)) {
			remove(smaReservation);
		}
	}

	/**
	 * Removes all the s m a reservations where isActive = &#63; and name = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param name the name
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMADomainsListByName(int isActive, String name)
		throws SystemException {
		for (SMAReservation smaReservation : findBySMADomainsListByName(
				isActive, name)) {
			remove(smaReservation);
		}
	}

	/**
	 * Removes all the s m a reservations where isActive = &#63; and owner = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param owner the owner
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMADomainsListByOwner(int isActive, String owner)
		throws SystemException {
		for (SMAReservation smaReservation : findBySMADomainsListByOwner(
				isActive, owner)) {
			remove(smaReservation);
		}
	}

	/**
	 * Removes all the s m a reservations where isActive = &#63; and startDate = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param startDate the start date
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMADomainsListByStartDate(int isActive, Date startDate)
		throws SystemException {
		for (SMAReservation smaReservation : findBySMADomainsListByStartDate(
				isActive, startDate)) {
			remove(smaReservation);
		}
	}

	/**
	 * Removes all the s m a reservations where isActive = &#63; and endDate = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param endDate the end date
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMADomainsListByEndDate(int isActive, Date endDate)
		throws SystemException {
		for (SMAReservation smaReservation : findBySMADomainsListByEndDate(
				isActive, endDate)) {
			remove(smaReservation);
		}
	}

	/**
	 * Removes all the s m a reservations where isActive = &#63; and provision = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param provision the provision
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMADomainsListByProvision(int isActive, int provision)
		throws SystemException {
		for (SMAReservation smaReservation : findBySMADomainsListByProvision(
				isActive, provision)) {
			remove(smaReservation);
		}
	}

	/**
	 * Removes all the s m a reservations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (SMAReservation smaReservation : findAll()) {
			remove(smaReservation);
		}
	}

	/**
	 * Returns the number of s m a reservations where isActive = &#63; and createdBy = &#63;.
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @return the number of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMADomainsListByCreatedBy(int isActive, String createdBy)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, createdBy };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYCREATEDBY,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMARESERVATION_WHERE);

			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_ISACTIVE_2);

			if (createdBy == null) {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_CREATEDBY_1);
			}
			else {
				if (createdBy.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_CREATEDBY_3);
				}
				else {
					query.append(_FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_CREATEDBY_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				if (createdBy != null) {
					qPos.add(createdBy);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYCREATEDBY,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a reservations where isActive = &#63; and name = &#63;.
	 *
	 * @param isActive the is active
	 * @param name the name
	 * @return the number of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMADomainsListByName(int isActive, String name)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, name };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYNAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMARESERVATION_WHERE);

			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYNAME_ISACTIVE_2);

			if (name == null) {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYNAME_NAME_1);
			}
			else {
				if (name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SMADOMAINSLISTBYNAME_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_SMADOMAINSLISTBYNAME_NAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYNAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a reservations where isActive = &#63; and owner = &#63;.
	 *
	 * @param isActive the is active
	 * @param owner the owner
	 * @return the number of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMADomainsListByOwner(int isActive, String owner)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, owner };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYOWNER,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMARESERVATION_WHERE);

			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYOWNER_ISACTIVE_2);

			if (owner == null) {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYOWNER_OWNER_1);
			}
			else {
				if (owner.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SMADOMAINSLISTBYOWNER_OWNER_3);
				}
				else {
					query.append(_FINDER_COLUMN_SMADOMAINSLISTBYOWNER_OWNER_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				if (owner != null) {
					qPos.add(owner);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYOWNER,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a reservations where isActive = &#63; and startDate = &#63;.
	 *
	 * @param isActive the is active
	 * @param startDate the start date
	 * @return the number of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMADomainsListByStartDate(int isActive, Date startDate)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, startDate };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYSTARTDATE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMARESERVATION_WHERE);

			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYSTARTDATE_ISACTIVE_2);

			if (startDate == null) {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYSTARTDATE_STARTDATE_1);
			}
			else {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYSTARTDATE_STARTDATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				if (startDate != null) {
					qPos.add(CalendarUtil.getTimestamp(startDate));
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYSTARTDATE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a reservations where isActive = &#63; and endDate = &#63;.
	 *
	 * @param isActive the is active
	 * @param endDate the end date
	 * @return the number of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMADomainsListByEndDate(int isActive, Date endDate)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, endDate };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYENDDATE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMARESERVATION_WHERE);

			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYENDDATE_ISACTIVE_2);

			if (endDate == null) {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYENDDATE_ENDDATE_1);
			}
			else {
				query.append(_FINDER_COLUMN_SMADOMAINSLISTBYENDDATE_ENDDATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				if (endDate != null) {
					qPos.add(CalendarUtil.getTimestamp(endDate));
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYENDDATE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a reservations where isActive = &#63; and provision = &#63;.
	 *
	 * @param isActive the is active
	 * @param provision the provision
	 * @return the number of matching s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMADomainsListByProvision(int isActive, int provision)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, provision };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYPROVISION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMARESERVATION_WHERE);

			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYPROVISION_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMADOMAINSLISTBYPROVISION_PROVISION_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				qPos.add(provision);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMADOMAINSLISTBYPROVISION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a reservations.
	 *
	 * @return the number of s m a reservations
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SMARESERVATION);

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
	 * Initializes the s m a reservation persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.SMAReservation")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SMAReservation>> listenersList = new ArrayList<ModelListener<SMAReservation>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SMAReservation>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SMAReservationImpl.class.getName());
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
	private static final String _SQL_SELECT_SMARESERVATION = "SELECT smaReservation FROM SMAReservation smaReservation";
	private static final String _SQL_SELECT_SMARESERVATION_WHERE = "SELECT smaReservation FROM SMAReservation smaReservation WHERE ";
	private static final String _SQL_COUNT_SMARESERVATION = "SELECT COUNT(smaReservation) FROM SMAReservation smaReservation";
	private static final String _SQL_COUNT_SMARESERVATION_WHERE = "SELECT COUNT(smaReservation) FROM SMAReservation smaReservation WHERE ";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_ISACTIVE_2 =
		"smaReservation.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_CREATEDBY_1 =
		"smaReservation.createdBy IS NULL";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_CREATEDBY_2 =
		"smaReservation.createdBy = ?";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYCREATEDBY_CREATEDBY_3 =
		"(smaReservation.createdBy IS NULL OR smaReservation.createdBy = ?)";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYNAME_ISACTIVE_2 = "smaReservation.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYNAME_NAME_1 = "smaReservation.name IS NULL";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYNAME_NAME_2 = "smaReservation.name = ?";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYNAME_NAME_3 = "(smaReservation.name IS NULL OR smaReservation.name = ?)";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYOWNER_ISACTIVE_2 = "smaReservation.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYOWNER_OWNER_1 = "smaReservation.owner IS NULL";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYOWNER_OWNER_2 = "smaReservation.owner = ?";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYOWNER_OWNER_3 = "(smaReservation.owner IS NULL OR smaReservation.owner = ?)";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYSTARTDATE_ISACTIVE_2 =
		"smaReservation.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYSTARTDATE_STARTDATE_1 =
		"smaReservation.startDate IS NULL";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYSTARTDATE_STARTDATE_2 =
		"smaReservation.startDate = ?";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYENDDATE_ISACTIVE_2 =
		"smaReservation.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYENDDATE_ENDDATE_1 =
		"smaReservation.endDate IS NULL";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYENDDATE_ENDDATE_2 =
		"smaReservation.endDate = ?";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYPROVISION_ISACTIVE_2 =
		"smaReservation.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMADOMAINSLISTBYPROVISION_PROVISION_2 =
		"smaReservation.provision = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "smaReservation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SMAReservation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SMAReservation exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SMAReservationPersistenceImpl.class);
	private static SMAReservation _nullSMAReservation = new SMAReservationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SMAReservation> toCacheModel() {
				return _nullSMAReservationCacheModel;
			}
		};

	private static CacheModel<SMAReservation> _nullSMAReservationCacheModel = new CacheModel<SMAReservation>() {
			public SMAReservation toEntityModel() {
				return _nullSMAReservation;
			}
		};
}