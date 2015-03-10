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

import com.pacnet.connect.NoSuchSMACompaniesException;
import com.pacnet.connect.model.SMACompanies;
import com.pacnet.connect.model.impl.SMACompaniesImpl;
import com.pacnet.connect.model.impl.SMACompaniesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the s m a companies service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMACompaniesPersistence
 * @see SMACompaniesUtil
 * @generated
 */
public class SMACompaniesPersistenceImpl extends BasePersistenceImpl<SMACompanies>
	implements SMACompaniesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SMACompaniesUtil} to access the s m a companies persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SMACompaniesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GETALLCOMPANIES =
		new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, SMACompaniesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGetAllCompanies",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GETALLCOMPANIES =
		new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, SMACompaniesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGetAllCompanies",
			new String[] { Integer.class.getName(), String.class.getName() },
			SMACompaniesModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMACompaniesModelImpl.CREATEDBY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GETALLCOMPANIES = new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGetAllCompanies",
			new String[] { Integer.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERID =
		new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, SMACompaniesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMACompanyListByCustomerId",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERID =
		new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, SMACompaniesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMACompanyListByCustomerId",
			new String[] { Integer.class.getName(), Long.class.getName() },
			SMACompaniesModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMACompaniesModelImpl.CUSTOMERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCUSTOMERID =
		new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMACompanyListByCustomerId",
			new String[] { Integer.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYDOMAINS =
		new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, SMACompaniesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMACompanyListByDomains",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYDOMAINS =
		new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, SMACompaniesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMACompanyListByDomains",
			new String[] { Integer.class.getName(), String.class.getName() },
			SMACompaniesModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMACompaniesModelImpl.DOMAINS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYDOMAINS = new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMACompanyListByDomains",
			new String[] { Integer.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYGROUPNAME =
		new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, SMACompaniesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMACompanyListByGroupName",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYGROUPNAME =
		new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, SMACompaniesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMACompanyListByGroupName",
			new String[] { Integer.class.getName(), String.class.getName() },
			SMACompaniesModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMACompaniesModelImpl.GROUPNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYGROUPNAME =
		new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMACompanyListByGroupName",
			new String[] { Integer.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERIDDOMAINS =
		new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, SMACompaniesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMACompanyListByCustomerIdDomains",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERIDDOMAINS =
		new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, SMACompaniesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMACompanyListByCustomerIdDomains",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			SMACompaniesModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMACompaniesModelImpl.CUSTOMERID_COLUMN_BITMASK |
			SMACompaniesModelImpl.DOMAINS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCUSTOMERIDDOMAINS =
		new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMACompanyListByCustomerIdDomains",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, SMACompaniesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, SMACompaniesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the s m a companies in the entity cache if it is enabled.
	 *
	 * @param smaCompanies the s m a companies
	 */
	public void cacheResult(SMACompanies smaCompanies) {
		EntityCacheUtil.putResult(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesImpl.class, smaCompanies.getPrimaryKey(), smaCompanies);

		smaCompanies.resetOriginalValues();
	}

	/**
	 * Caches the s m a companieses in the entity cache if it is enabled.
	 *
	 * @param smaCompanieses the s m a companieses
	 */
	public void cacheResult(List<SMACompanies> smaCompanieses) {
		for (SMACompanies smaCompanies : smaCompanieses) {
			if (EntityCacheUtil.getResult(
						SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
						SMACompaniesImpl.class, smaCompanies.getPrimaryKey()) == null) {
				cacheResult(smaCompanies);
			}
			else {
				smaCompanies.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all s m a companieses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SMACompaniesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SMACompaniesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the s m a companies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SMACompanies smaCompanies) {
		EntityCacheUtil.removeResult(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesImpl.class, smaCompanies.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SMACompanies> smaCompanieses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SMACompanies smaCompanies : smaCompanieses) {
			EntityCacheUtil.removeResult(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
				SMACompaniesImpl.class, smaCompanies.getPrimaryKey());
		}
	}

	/**
	 * Creates a new s m a companies with the primary key. Does not add the s m a companies to the database.
	 *
	 * @param id the primary key for the new s m a companies
	 * @return the new s m a companies
	 */
	public SMACompanies create(long id) {
		SMACompanies smaCompanies = new SMACompaniesImpl();

		smaCompanies.setNew(true);
		smaCompanies.setPrimaryKey(id);

		return smaCompanies;
	}

	/**
	 * Removes the s m a companies with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the s m a companies
	 * @return the s m a companies that was removed
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a s m a companies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies remove(long id)
		throws NoSuchSMACompaniesException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the s m a companies with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the s m a companies
	 * @return the s m a companies that was removed
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a s m a companies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMACompanies remove(Serializable primaryKey)
		throws NoSuchSMACompaniesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SMACompanies smaCompanies = (SMACompanies)session.get(SMACompaniesImpl.class,
					primaryKey);

			if (smaCompanies == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSMACompaniesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(smaCompanies);
		}
		catch (NoSuchSMACompaniesException nsee) {
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
	protected SMACompanies removeImpl(SMACompanies smaCompanies)
		throws SystemException {
		smaCompanies = toUnwrappedModel(smaCompanies);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, smaCompanies);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(smaCompanies);

		return smaCompanies;
	}

	@Override
	public SMACompanies updateImpl(
		com.pacnet.connect.model.SMACompanies smaCompanies, boolean merge)
		throws SystemException {
		smaCompanies = toUnwrappedModel(smaCompanies);

		boolean isNew = smaCompanies.isNew();

		SMACompaniesModelImpl smaCompaniesModelImpl = (SMACompaniesModelImpl)smaCompanies;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, smaCompanies, merge);

			smaCompanies.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SMACompaniesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((smaCompaniesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GETALLCOMPANIES.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaCompaniesModelImpl.getOriginalIsActive()),
						
						smaCompaniesModelImpl.getOriginalCreatedBy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GETALLCOMPANIES,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GETALLCOMPANIES,
					args);

				args = new Object[] {
						Integer.valueOf(smaCompaniesModelImpl.getIsActive()),
						
						smaCompaniesModelImpl.getCreatedBy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GETALLCOMPANIES,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GETALLCOMPANIES,
					args);
			}

			if ((smaCompaniesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaCompaniesModelImpl.getOriginalIsActive()),
						Long.valueOf(smaCompaniesModelImpl.getOriginalCustomerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCUSTOMERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERID,
					args);

				args = new Object[] {
						Integer.valueOf(smaCompaniesModelImpl.getIsActive()),
						Long.valueOf(smaCompaniesModelImpl.getCustomerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCUSTOMERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERID,
					args);
			}

			if ((smaCompaniesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYDOMAINS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaCompaniesModelImpl.getOriginalIsActive()),
						
						smaCompaniesModelImpl.getOriginalDomains()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYDOMAINS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYDOMAINS,
					args);

				args = new Object[] {
						Integer.valueOf(smaCompaniesModelImpl.getIsActive()),
						
						smaCompaniesModelImpl.getDomains()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYDOMAINS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYDOMAINS,
					args);
			}

			if ((smaCompaniesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYGROUPNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaCompaniesModelImpl.getOriginalIsActive()),
						
						smaCompaniesModelImpl.getOriginalGroupName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYGROUPNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYGROUPNAME,
					args);

				args = new Object[] {
						Integer.valueOf(smaCompaniesModelImpl.getIsActive()),
						
						smaCompaniesModelImpl.getGroupName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYGROUPNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYGROUPNAME,
					args);
			}

			if ((smaCompaniesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERIDDOMAINS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaCompaniesModelImpl.getOriginalIsActive()),
						Long.valueOf(smaCompaniesModelImpl.getOriginalCustomerId()),
						
						smaCompaniesModelImpl.getOriginalDomains()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCUSTOMERIDDOMAINS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERIDDOMAINS,
					args);

				args = new Object[] {
						Integer.valueOf(smaCompaniesModelImpl.getIsActive()),
						Long.valueOf(smaCompaniesModelImpl.getCustomerId()),
						
						smaCompaniesModelImpl.getDomains()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCUSTOMERIDDOMAINS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERIDDOMAINS,
					args);
			}
		}

		EntityCacheUtil.putResult(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
			SMACompaniesImpl.class, smaCompanies.getPrimaryKey(), smaCompanies);

		return smaCompanies;
	}

	protected SMACompanies toUnwrappedModel(SMACompanies smaCompanies) {
		if (smaCompanies instanceof SMACompaniesImpl) {
			return smaCompanies;
		}

		SMACompaniesImpl smaCompaniesImpl = new SMACompaniesImpl();

		smaCompaniesImpl.setNew(smaCompanies.isNew());
		smaCompaniesImpl.setPrimaryKey(smaCompanies.getPrimaryKey());

		smaCompaniesImpl.setId(smaCompanies.getId());
		smaCompaniesImpl.setCustomerId(smaCompanies.getCustomerId());
		smaCompaniesImpl.setCompanyName(smaCompanies.getCompanyName());
		smaCompaniesImpl.setDomains(smaCompanies.getDomains());
		smaCompaniesImpl.setGroupName(smaCompanies.getGroupName());
		smaCompaniesImpl.setAttribute(smaCompanies.getAttribute());
		smaCompaniesImpl.setOp(smaCompanies.getOp());
		smaCompaniesImpl.setValue(smaCompanies.getValue());
		smaCompaniesImpl.setMaxUser(smaCompanies.getMaxUser());
		smaCompaniesImpl.setIsActive(smaCompanies.getIsActive());
		smaCompaniesImpl.setCreatedOn(smaCompanies.getCreatedOn());
		smaCompaniesImpl.setCreatedBy(smaCompanies.getCreatedBy());
		smaCompaniesImpl.setUpdatedOn(smaCompanies.getUpdatedOn());
		smaCompaniesImpl.setUpdatedBy(smaCompanies.getUpdatedBy());

		return smaCompaniesImpl;
	}

	/**
	 * Returns the s m a companies with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the s m a companies
	 * @return the s m a companies
	 * @throws com.liferay.portal.NoSuchModelException if a s m a companies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMACompanies findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the s m a companies with the primary key or throws a {@link com.pacnet.connect.NoSuchSMACompaniesException} if it could not be found.
	 *
	 * @param id the primary key of the s m a companies
	 * @return the s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a s m a companies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies findByPrimaryKey(long id)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = fetchByPrimaryKey(id);

		if (smaCompanies == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchSMACompaniesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return smaCompanies;
	}

	/**
	 * Returns the s m a companies with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the s m a companies
	 * @return the s m a companies, or <code>null</code> if a s m a companies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMACompanies fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the s m a companies with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the s m a companies
	 * @return the s m a companies, or <code>null</code> if a s m a companies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies fetchByPrimaryKey(long id) throws SystemException {
		SMACompanies smaCompanies = (SMACompanies)EntityCacheUtil.getResult(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
				SMACompaniesImpl.class, id);

		if (smaCompanies == _nullSMACompanies) {
			return null;
		}

		if (smaCompanies == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				smaCompanies = (SMACompanies)session.get(SMACompaniesImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (smaCompanies != null) {
					cacheResult(smaCompanies);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(SMACompaniesModelImpl.ENTITY_CACHE_ENABLED,
						SMACompaniesImpl.class, id, _nullSMACompanies);
				}

				closeSession(session);
			}
		}

		return smaCompanies;
	}

	/**
	 * Returns all the s m a companieses where isActive = &#63; and createdBy = &#63;.
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @return the matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findByGetAllCompanies(int isActive,
		String createdBy) throws SystemException {
		return findByGetAllCompanies(isActive, createdBy, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a companieses where isActive = &#63; and createdBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @param start the lower bound of the range of s m a companieses
	 * @param end the upper bound of the range of s m a companieses (not inclusive)
	 * @return the range of matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findByGetAllCompanies(int isActive,
		String createdBy, int start, int end) throws SystemException {
		return findByGetAllCompanies(isActive, createdBy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a companieses where isActive = &#63; and createdBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @param start the lower bound of the range of s m a companieses
	 * @param end the upper bound of the range of s m a companieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findByGetAllCompanies(int isActive,
		String createdBy, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GETALLCOMPANIES;
			finderArgs = new Object[] { isActive, createdBy };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GETALLCOMPANIES;
			finderArgs = new Object[] {
					isActive, createdBy,
					
					start, end, orderByComparator
				};
		}

		List<SMACompanies> list = (List<SMACompanies>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMACompanies smaCompanies : list) {
				if ((isActive != smaCompanies.getIsActive()) ||
						!Validator.equals(createdBy, smaCompanies.getCreatedBy())) {
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

			query.append(_SQL_SELECT_SMACOMPANIES_WHERE);

			query.append(_FINDER_COLUMN_GETALLCOMPANIES_ISACTIVE_2);

			if (createdBy == null) {
				query.append(_FINDER_COLUMN_GETALLCOMPANIES_CREATEDBY_1);
			}
			else {
				if (createdBy.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GETALLCOMPANIES_CREATEDBY_3);
				}
				else {
					query.append(_FINDER_COLUMN_GETALLCOMPANIES_CREATEDBY_2);
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

				list = (List<SMACompanies>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first s m a companies in the ordered set where isActive = &#63; and createdBy = &#63;.
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies findByGetAllCompanies_First(int isActive,
		String createdBy, OrderByComparator orderByComparator)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = fetchByGetAllCompanies_First(isActive,
				createdBy, orderByComparator);

		if (smaCompanies != null) {
			return smaCompanies;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", createdBy=");
		msg.append(createdBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompaniesException(msg.toString());
	}

	/**
	 * Returns the first s m a companies in the ordered set where isActive = &#63; and createdBy = &#63;.
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a companies, or <code>null</code> if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies fetchByGetAllCompanies_First(int isActive,
		String createdBy, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMACompanies> list = findByGetAllCompanies(isActive, createdBy, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive = &#63; and createdBy = &#63;.
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies findByGetAllCompanies_Last(int isActive,
		String createdBy, OrderByComparator orderByComparator)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = fetchByGetAllCompanies_Last(isActive,
				createdBy, orderByComparator);

		if (smaCompanies != null) {
			return smaCompanies;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", createdBy=");
		msg.append(createdBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompaniesException(msg.toString());
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive = &#63; and createdBy = &#63;.
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a companies, or <code>null</code> if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies fetchByGetAllCompanies_Last(int isActive,
		String createdBy, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByGetAllCompanies(isActive, createdBy);

		List<SMACompanies> list = findByGetAllCompanies(isActive, createdBy,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a companieses before and after the current s m a companies in the ordered set where isActive = &#63; and createdBy = &#63;.
	 *
	 * @param id the primary key of the current s m a companies
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a s m a companies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies[] findByGetAllCompanies_PrevAndNext(long id,
		int isActive, String createdBy, OrderByComparator orderByComparator)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMACompanies[] array = new SMACompaniesImpl[3];

			array[0] = getByGetAllCompanies_PrevAndNext(session, smaCompanies,
					isActive, createdBy, orderByComparator, true);

			array[1] = smaCompanies;

			array[2] = getByGetAllCompanies_PrevAndNext(session, smaCompanies,
					isActive, createdBy, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMACompanies getByGetAllCompanies_PrevAndNext(Session session,
		SMACompanies smaCompanies, int isActive, String createdBy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMACOMPANIES_WHERE);

		query.append(_FINDER_COLUMN_GETALLCOMPANIES_ISACTIVE_2);

		if (createdBy == null) {
			query.append(_FINDER_COLUMN_GETALLCOMPANIES_CREATEDBY_1);
		}
		else {
			if (createdBy.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GETALLCOMPANIES_CREATEDBY_3);
			}
			else {
				query.append(_FINDER_COLUMN_GETALLCOMPANIES_CREATEDBY_2);
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
			Object[] values = orderByComparator.getOrderByConditionValues(smaCompanies);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMACompanies> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a companieses where isActive = &#63; and customerId = &#63;.
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @return the matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findBySMACompanyListByCustomerId(int isActive,
		long customerId) throws SystemException {
		return findBySMACompanyListByCustomerId(isActive, customerId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a companieses where isActive = &#63; and customerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param start the lower bound of the range of s m a companieses
	 * @param end the upper bound of the range of s m a companieses (not inclusive)
	 * @return the range of matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findBySMACompanyListByCustomerId(int isActive,
		long customerId, int start, int end) throws SystemException {
		return findBySMACompanyListByCustomerId(isActive, customerId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the s m a companieses where isActive = &#63; and customerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param start the lower bound of the range of s m a companieses
	 * @param end the upper bound of the range of s m a companieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findBySMACompanyListByCustomerId(int isActive,
		long customerId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERID;
			finderArgs = new Object[] { isActive, customerId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERID;
			finderArgs = new Object[] {
					isActive, customerId,
					
					start, end, orderByComparator
				};
		}

		List<SMACompanies> list = (List<SMACompanies>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMACompanies smaCompanies : list) {
				if ((isActive != smaCompanies.getIsActive()) ||
						(customerId != smaCompanies.getCustomerId())) {
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

			query.append(_SQL_SELECT_SMACOMPANIES_WHERE);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERID_CUSTOMERID_2);

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

				qPos.add(customerId);

				list = (List<SMACompanies>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first s m a companies in the ordered set where isActive = &#63; and customerId = &#63;.
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies findBySMACompanyListByCustomerId_First(int isActive,
		long customerId, OrderByComparator orderByComparator)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = fetchBySMACompanyListByCustomerId_First(isActive,
				customerId, orderByComparator);

		if (smaCompanies != null) {
			return smaCompanies;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", customerId=");
		msg.append(customerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompaniesException(msg.toString());
	}

	/**
	 * Returns the first s m a companies in the ordered set where isActive = &#63; and customerId = &#63;.
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a companies, or <code>null</code> if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies fetchBySMACompanyListByCustomerId_First(int isActive,
		long customerId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMACompanies> list = findBySMACompanyListByCustomerId(isActive,
				customerId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive = &#63; and customerId = &#63;.
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies findBySMACompanyListByCustomerId_Last(int isActive,
		long customerId, OrderByComparator orderByComparator)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = fetchBySMACompanyListByCustomerId_Last(isActive,
				customerId, orderByComparator);

		if (smaCompanies != null) {
			return smaCompanies;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", customerId=");
		msg.append(customerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompaniesException(msg.toString());
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive = &#63; and customerId = &#63;.
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a companies, or <code>null</code> if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies fetchBySMACompanyListByCustomerId_Last(int isActive,
		long customerId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMACompanyListByCustomerId(isActive, customerId);

		List<SMACompanies> list = findBySMACompanyListByCustomerId(isActive,
				customerId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a companieses before and after the current s m a companies in the ordered set where isActive = &#63; and customerId = &#63;.
	 *
	 * @param id the primary key of the current s m a companies
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a s m a companies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies[] findBySMACompanyListByCustomerId_PrevAndNext(
		long id, int isActive, long customerId,
		OrderByComparator orderByComparator)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMACompanies[] array = new SMACompaniesImpl[3];

			array[0] = getBySMACompanyListByCustomerId_PrevAndNext(session,
					smaCompanies, isActive, customerId, orderByComparator, true);

			array[1] = smaCompanies;

			array[2] = getBySMACompanyListByCustomerId_PrevAndNext(session,
					smaCompanies, isActive, customerId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMACompanies getBySMACompanyListByCustomerId_PrevAndNext(
		Session session, SMACompanies smaCompanies, int isActive,
		long customerId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMACOMPANIES_WHERE);

		query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERID_ISACTIVE_2);

		query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERID_CUSTOMERID_2);

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

		qPos.add(customerId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaCompanies);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMACompanies> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a companieses where isActive = &#63; and domains = &#63;.
	 *
	 * @param isActive the is active
	 * @param domains the domains
	 * @return the matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findBySMACompanyListByDomains(int isActive,
		String domains) throws SystemException {
		return findBySMACompanyListByDomains(isActive, domains,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a companieses where isActive = &#63; and domains = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param domains the domains
	 * @param start the lower bound of the range of s m a companieses
	 * @param end the upper bound of the range of s m a companieses (not inclusive)
	 * @return the range of matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findBySMACompanyListByDomains(int isActive,
		String domains, int start, int end) throws SystemException {
		return findBySMACompanyListByDomains(isActive, domains, start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a companieses where isActive = &#63; and domains = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param domains the domains
	 * @param start the lower bound of the range of s m a companieses
	 * @param end the upper bound of the range of s m a companieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findBySMACompanyListByDomains(int isActive,
		String domains, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYDOMAINS;
			finderArgs = new Object[] { isActive, domains };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYDOMAINS;
			finderArgs = new Object[] {
					isActive, domains,
					
					start, end, orderByComparator
				};
		}

		List<SMACompanies> list = (List<SMACompanies>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMACompanies smaCompanies : list) {
				if ((isActive != smaCompanies.getIsActive()) ||
						!Validator.equals(domains, smaCompanies.getDomains())) {
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

			query.append(_SQL_SELECT_SMACOMPANIES_WHERE);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_ISACTIVE_2);

			if (domains == null) {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_1);
			}
			else {
				if (domains.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_3);
				}
				else {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_2);
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

				if (domains != null) {
					qPos.add(domains);
				}

				list = (List<SMACompanies>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first s m a companies in the ordered set where isActive = &#63; and domains = &#63;.
	 *
	 * @param isActive the is active
	 * @param domains the domains
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies findBySMACompanyListByDomains_First(int isActive,
		String domains, OrderByComparator orderByComparator)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = fetchBySMACompanyListByDomains_First(isActive,
				domains, orderByComparator);

		if (smaCompanies != null) {
			return smaCompanies;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", domains=");
		msg.append(domains);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompaniesException(msg.toString());
	}

	/**
	 * Returns the first s m a companies in the ordered set where isActive = &#63; and domains = &#63;.
	 *
	 * @param isActive the is active
	 * @param domains the domains
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a companies, or <code>null</code> if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies fetchBySMACompanyListByDomains_First(int isActive,
		String domains, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMACompanies> list = findBySMACompanyListByDomains(isActive,
				domains, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive = &#63; and domains = &#63;.
	 *
	 * @param isActive the is active
	 * @param domains the domains
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies findBySMACompanyListByDomains_Last(int isActive,
		String domains, OrderByComparator orderByComparator)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = fetchBySMACompanyListByDomains_Last(isActive,
				domains, orderByComparator);

		if (smaCompanies != null) {
			return smaCompanies;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", domains=");
		msg.append(domains);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompaniesException(msg.toString());
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive = &#63; and domains = &#63;.
	 *
	 * @param isActive the is active
	 * @param domains the domains
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a companies, or <code>null</code> if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies fetchBySMACompanyListByDomains_Last(int isActive,
		String domains, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMACompanyListByDomains(isActive, domains);

		List<SMACompanies> list = findBySMACompanyListByDomains(isActive,
				domains, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a companieses before and after the current s m a companies in the ordered set where isActive = &#63; and domains = &#63;.
	 *
	 * @param id the primary key of the current s m a companies
	 * @param isActive the is active
	 * @param domains the domains
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a s m a companies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies[] findBySMACompanyListByDomains_PrevAndNext(long id,
		int isActive, String domains, OrderByComparator orderByComparator)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMACompanies[] array = new SMACompaniesImpl[3];

			array[0] = getBySMACompanyListByDomains_PrevAndNext(session,
					smaCompanies, isActive, domains, orderByComparator, true);

			array[1] = smaCompanies;

			array[2] = getBySMACompanyListByDomains_PrevAndNext(session,
					smaCompanies, isActive, domains, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMACompanies getBySMACompanyListByDomains_PrevAndNext(
		Session session, SMACompanies smaCompanies, int isActive,
		String domains, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMACOMPANIES_WHERE);

		query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_ISACTIVE_2);

		if (domains == null) {
			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_1);
		}
		else {
			if (domains.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_3);
			}
			else {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_2);
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

		if (domains != null) {
			qPos.add(domains);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaCompanies);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMACompanies> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a companieses where isActive = &#63; and groupName = &#63;.
	 *
	 * @param isActive the is active
	 * @param groupName the group name
	 * @return the matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findBySMACompanyListByGroupName(int isActive,
		String groupName) throws SystemException {
		return findBySMACompanyListByGroupName(isActive, groupName,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a companieses where isActive = &#63; and groupName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param groupName the group name
	 * @param start the lower bound of the range of s m a companieses
	 * @param end the upper bound of the range of s m a companieses (not inclusive)
	 * @return the range of matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findBySMACompanyListByGroupName(int isActive,
		String groupName, int start, int end) throws SystemException {
		return findBySMACompanyListByGroupName(isActive, groupName, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the s m a companieses where isActive = &#63; and groupName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param groupName the group name
	 * @param start the lower bound of the range of s m a companieses
	 * @param end the upper bound of the range of s m a companieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findBySMACompanyListByGroupName(int isActive,
		String groupName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYGROUPNAME;
			finderArgs = new Object[] { isActive, groupName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYGROUPNAME;
			finderArgs = new Object[] {
					isActive, groupName,
					
					start, end, orderByComparator
				};
		}

		List<SMACompanies> list = (List<SMACompanies>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMACompanies smaCompanies : list) {
				if ((isActive != smaCompanies.getIsActive()) ||
						!Validator.equals(groupName, smaCompanies.getGroupName())) {
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

			query.append(_SQL_SELECT_SMACOMPANIES_WHERE);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_ISACTIVE_2);

			if (groupName == null) {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_GROUPNAME_1);
			}
			else {
				if (groupName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_GROUPNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_GROUPNAME_2);
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

				if (groupName != null) {
					qPos.add(groupName);
				}

				list = (List<SMACompanies>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first s m a companies in the ordered set where isActive = &#63; and groupName = &#63;.
	 *
	 * @param isActive the is active
	 * @param groupName the group name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies findBySMACompanyListByGroupName_First(int isActive,
		String groupName, OrderByComparator orderByComparator)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = fetchBySMACompanyListByGroupName_First(isActive,
				groupName, orderByComparator);

		if (smaCompanies != null) {
			return smaCompanies;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", groupName=");
		msg.append(groupName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompaniesException(msg.toString());
	}

	/**
	 * Returns the first s m a companies in the ordered set where isActive = &#63; and groupName = &#63;.
	 *
	 * @param isActive the is active
	 * @param groupName the group name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a companies, or <code>null</code> if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies fetchBySMACompanyListByGroupName_First(int isActive,
		String groupName, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMACompanies> list = findBySMACompanyListByGroupName(isActive,
				groupName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive = &#63; and groupName = &#63;.
	 *
	 * @param isActive the is active
	 * @param groupName the group name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies findBySMACompanyListByGroupName_Last(int isActive,
		String groupName, OrderByComparator orderByComparator)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = fetchBySMACompanyListByGroupName_Last(isActive,
				groupName, orderByComparator);

		if (smaCompanies != null) {
			return smaCompanies;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", groupName=");
		msg.append(groupName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompaniesException(msg.toString());
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive = &#63; and groupName = &#63;.
	 *
	 * @param isActive the is active
	 * @param groupName the group name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a companies, or <code>null</code> if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies fetchBySMACompanyListByGroupName_Last(int isActive,
		String groupName, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMACompanyListByGroupName(isActive, groupName);

		List<SMACompanies> list = findBySMACompanyListByGroupName(isActive,
				groupName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a companieses before and after the current s m a companies in the ordered set where isActive = &#63; and groupName = &#63;.
	 *
	 * @param id the primary key of the current s m a companies
	 * @param isActive the is active
	 * @param groupName the group name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a s m a companies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies[] findBySMACompanyListByGroupName_PrevAndNext(long id,
		int isActive, String groupName, OrderByComparator orderByComparator)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMACompanies[] array = new SMACompaniesImpl[3];

			array[0] = getBySMACompanyListByGroupName_PrevAndNext(session,
					smaCompanies, isActive, groupName, orderByComparator, true);

			array[1] = smaCompanies;

			array[2] = getBySMACompanyListByGroupName_PrevAndNext(session,
					smaCompanies, isActive, groupName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMACompanies getBySMACompanyListByGroupName_PrevAndNext(
		Session session, SMACompanies smaCompanies, int isActive,
		String groupName, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMACOMPANIES_WHERE);

		query.append(_FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_ISACTIVE_2);

		if (groupName == null) {
			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_GROUPNAME_1);
		}
		else {
			if (groupName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_GROUPNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_GROUPNAME_2);
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

		if (groupName != null) {
			qPos.add(groupName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaCompanies);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMACompanies> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a companieses where isActive = &#63; and customerId = &#63; and domains = &#63;.
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param domains the domains
	 * @return the matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findBySMACompanyListByCustomerIdDomains(
		int isActive, long customerId, String domains)
		throws SystemException {
		return findBySMACompanyListByCustomerIdDomains(isActive, customerId,
			domains, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a companieses where isActive = &#63; and customerId = &#63; and domains = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param domains the domains
	 * @param start the lower bound of the range of s m a companieses
	 * @param end the upper bound of the range of s m a companieses (not inclusive)
	 * @return the range of matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findBySMACompanyListByCustomerIdDomains(
		int isActive, long customerId, String domains, int start, int end)
		throws SystemException {
		return findBySMACompanyListByCustomerIdDomains(isActive, customerId,
			domains, start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a companieses where isActive = &#63; and customerId = &#63; and domains = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param domains the domains
	 * @param start the lower bound of the range of s m a companieses
	 * @param end the upper bound of the range of s m a companieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findBySMACompanyListByCustomerIdDomains(
		int isActive, long customerId, String domains, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERIDDOMAINS;
			finderArgs = new Object[] { isActive, customerId, domains };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMACOMPANYLISTBYCUSTOMERIDDOMAINS;
			finderArgs = new Object[] {
					isActive, customerId, domains,
					
					start, end, orderByComparator
				};
		}

		List<SMACompanies> list = (List<SMACompanies>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMACompanies smaCompanies : list) {
				if ((isActive != smaCompanies.getIsActive()) ||
						(customerId != smaCompanies.getCustomerId()) ||
						!Validator.equals(domains, smaCompanies.getDomains())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_SMACOMPANIES_WHERE);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_CUSTOMERID_2);

			if (domains == null) {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_DOMAINS_1);
			}
			else {
				if (domains.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_DOMAINS_3);
				}
				else {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_DOMAINS_2);
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

				qPos.add(customerId);

				if (domains != null) {
					qPos.add(domains);
				}

				list = (List<SMACompanies>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first s m a companies in the ordered set where isActive = &#63; and customerId = &#63; and domains = &#63;.
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param domains the domains
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies findBySMACompanyListByCustomerIdDomains_First(
		int isActive, long customerId, String domains,
		OrderByComparator orderByComparator)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = fetchBySMACompanyListByCustomerIdDomains_First(isActive,
				customerId, domains, orderByComparator);

		if (smaCompanies != null) {
			return smaCompanies;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", customerId=");
		msg.append(customerId);

		msg.append(", domains=");
		msg.append(domains);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompaniesException(msg.toString());
	}

	/**
	 * Returns the first s m a companies in the ordered set where isActive = &#63; and customerId = &#63; and domains = &#63;.
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param domains the domains
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a companies, or <code>null</code> if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies fetchBySMACompanyListByCustomerIdDomains_First(
		int isActive, long customerId, String domains,
		OrderByComparator orderByComparator) throws SystemException {
		List<SMACompanies> list = findBySMACompanyListByCustomerIdDomains(isActive,
				customerId, domains, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive = &#63; and customerId = &#63; and domains = &#63;.
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param domains the domains
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies findBySMACompanyListByCustomerIdDomains_Last(
		int isActive, long customerId, String domains,
		OrderByComparator orderByComparator)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = fetchBySMACompanyListByCustomerIdDomains_Last(isActive,
				customerId, domains, orderByComparator);

		if (smaCompanies != null) {
			return smaCompanies;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", customerId=");
		msg.append(customerId);

		msg.append(", domains=");
		msg.append(domains);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMACompaniesException(msg.toString());
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive = &#63; and customerId = &#63; and domains = &#63;.
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param domains the domains
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a companies, or <code>null</code> if a matching s m a companies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies fetchBySMACompanyListByCustomerIdDomains_Last(
		int isActive, long customerId, String domains,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBySMACompanyListByCustomerIdDomains(isActive,
				customerId, domains);

		List<SMACompanies> list = findBySMACompanyListByCustomerIdDomains(isActive,
				customerId, domains, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a companieses before and after the current s m a companies in the ordered set where isActive = &#63; and customerId = &#63; and domains = &#63;.
	 *
	 * @param id the primary key of the current s m a companies
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param domains the domains
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException if a s m a companies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMACompanies[] findBySMACompanyListByCustomerIdDomains_PrevAndNext(
		long id, int isActive, long customerId, String domains,
		OrderByComparator orderByComparator)
		throws NoSuchSMACompaniesException, SystemException {
		SMACompanies smaCompanies = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SMACompanies[] array = new SMACompaniesImpl[3];

			array[0] = getBySMACompanyListByCustomerIdDomains_PrevAndNext(session,
					smaCompanies, isActive, customerId, domains,
					orderByComparator, true);

			array[1] = smaCompanies;

			array[2] = getBySMACompanyListByCustomerIdDomains_PrevAndNext(session,
					smaCompanies, isActive, customerId, domains,
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

	protected SMACompanies getBySMACompanyListByCustomerIdDomains_PrevAndNext(
		Session session, SMACompanies smaCompanies, int isActive,
		long customerId, String domains, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMACOMPANIES_WHERE);

		query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_ISACTIVE_2);

		query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_CUSTOMERID_2);

		if (domains == null) {
			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_DOMAINS_1);
		}
		else {
			if (domains.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_DOMAINS_3);
			}
			else {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_DOMAINS_2);
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

		qPos.add(customerId);

		if (domains != null) {
			qPos.add(domains);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaCompanies);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMACompanies> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a companieses.
	 *
	 * @return the s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a companieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s m a companieses
	 * @param end the upper bound of the range of s m a companieses (not inclusive)
	 * @return the range of s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a companieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s m a companieses
	 * @param end the upper bound of the range of s m a companieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMACompanies> findAll(int start, int end,
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

		List<SMACompanies> list = (List<SMACompanies>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SMACOMPANIES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SMACOMPANIES;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<SMACompanies>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<SMACompanies>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the s m a companieses where isActive = &#63; and createdBy = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGetAllCompanies(int isActive, String createdBy)
		throws SystemException {
		for (SMACompanies smaCompanies : findByGetAllCompanies(isActive,
				createdBy)) {
			remove(smaCompanies);
		}
	}

	/**
	 * Removes all the s m a companieses where isActive = &#63; and customerId = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMACompanyListByCustomerId(int isActive, long customerId)
		throws SystemException {
		for (SMACompanies smaCompanies : findBySMACompanyListByCustomerId(
				isActive, customerId)) {
			remove(smaCompanies);
		}
	}

	/**
	 * Removes all the s m a companieses where isActive = &#63; and domains = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param domains the domains
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMACompanyListByDomains(int isActive, String domains)
		throws SystemException {
		for (SMACompanies smaCompanies : findBySMACompanyListByDomains(
				isActive, domains)) {
			remove(smaCompanies);
		}
	}

	/**
	 * Removes all the s m a companieses where isActive = &#63; and groupName = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param groupName the group name
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMACompanyListByGroupName(int isActive, String groupName)
		throws SystemException {
		for (SMACompanies smaCompanies : findBySMACompanyListByGroupName(
				isActive, groupName)) {
			remove(smaCompanies);
		}
	}

	/**
	 * Removes all the s m a companieses where isActive = &#63; and customerId = &#63; and domains = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param domains the domains
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMACompanyListByCustomerIdDomains(int isActive,
		long customerId, String domains) throws SystemException {
		for (SMACompanies smaCompanies : findBySMACompanyListByCustomerIdDomains(
				isActive, customerId, domains)) {
			remove(smaCompanies);
		}
	}

	/**
	 * Removes all the s m a companieses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (SMACompanies smaCompanies : findAll()) {
			remove(smaCompanies);
		}
	}

	/**
	 * Returns the number of s m a companieses where isActive = &#63; and createdBy = &#63;.
	 *
	 * @param isActive the is active
	 * @param createdBy the created by
	 * @return the number of matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGetAllCompanies(int isActive, String createdBy)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, createdBy };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GETALLCOMPANIES,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMACOMPANIES_WHERE);

			query.append(_FINDER_COLUMN_GETALLCOMPANIES_ISACTIVE_2);

			if (createdBy == null) {
				query.append(_FINDER_COLUMN_GETALLCOMPANIES_CREATEDBY_1);
			}
			else {
				if (createdBy.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GETALLCOMPANIES_CREATEDBY_3);
				}
				else {
					query.append(_FINDER_COLUMN_GETALLCOMPANIES_CREATEDBY_2);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GETALLCOMPANIES,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a companieses where isActive = &#63; and customerId = &#63;.
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @return the number of matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMACompanyListByCustomerId(int isActive, long customerId)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, customerId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCUSTOMERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMACOMPANIES_WHERE);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERID_CUSTOMERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCUSTOMERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a companieses where isActive = &#63; and domains = &#63;.
	 *
	 * @param isActive the is active
	 * @param domains the domains
	 * @return the number of matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMACompanyListByDomains(int isActive, String domains)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, domains };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYDOMAINS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMACOMPANIES_WHERE);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_ISACTIVE_2);

			if (domains == null) {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_1);
			}
			else {
				if (domains.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_3);
				}
				else {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				if (domains != null) {
					qPos.add(domains);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYDOMAINS,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a companieses where isActive = &#63; and groupName = &#63;.
	 *
	 * @param isActive the is active
	 * @param groupName the group name
	 * @return the number of matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMACompanyListByGroupName(int isActive, String groupName)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, groupName };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYGROUPNAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMACOMPANIES_WHERE);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_ISACTIVE_2);

			if (groupName == null) {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_GROUPNAME_1);
			}
			else {
				if (groupName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_GROUPNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_GROUPNAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				if (groupName != null) {
					qPos.add(groupName);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYGROUPNAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a companieses where isActive = &#63; and customerId = &#63; and domains = &#63;.
	 *
	 * @param isActive the is active
	 * @param customerId the customer ID
	 * @param domains the domains
	 * @return the number of matching s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMACompanyListByCustomerIdDomains(int isActive,
		long customerId, String domains) throws SystemException {
		Object[] finderArgs = new Object[] { isActive, customerId, domains };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCUSTOMERIDDOMAINS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_SMACOMPANIES_WHERE);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_CUSTOMERID_2);

			if (domains == null) {
				query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_DOMAINS_1);
			}
			else {
				if (domains.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_DOMAINS_3);
				}
				else {
					query.append(_FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_DOMAINS_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				qPos.add(customerId);

				if (domains != null) {
					qPos.add(domains);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMACOMPANYLISTBYCUSTOMERIDDOMAINS,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a companieses.
	 *
	 * @return the number of s m a companieses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SMACOMPANIES);

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
	 * Initializes the s m a companies persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.SMACompanies")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SMACompanies>> listenersList = new ArrayList<ModelListener<SMACompanies>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SMACompanies>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SMACompaniesImpl.class.getName());
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
	private static final String _SQL_SELECT_SMACOMPANIES = "SELECT smaCompanies FROM SMACompanies smaCompanies";
	private static final String _SQL_SELECT_SMACOMPANIES_WHERE = "SELECT smaCompanies FROM SMACompanies smaCompanies WHERE ";
	private static final String _SQL_COUNT_SMACOMPANIES = "SELECT COUNT(smaCompanies) FROM SMACompanies smaCompanies";
	private static final String _SQL_COUNT_SMACOMPANIES_WHERE = "SELECT COUNT(smaCompanies) FROM SMACompanies smaCompanies WHERE ";
	private static final String _FINDER_COLUMN_GETALLCOMPANIES_ISACTIVE_2 = "smaCompanies.isActive = ? AND ";
	private static final String _FINDER_COLUMN_GETALLCOMPANIES_CREATEDBY_1 = "smaCompanies.createdBy IS NULL";
	private static final String _FINDER_COLUMN_GETALLCOMPANIES_CREATEDBY_2 = "smaCompanies.createdBy = ?";
	private static final String _FINDER_COLUMN_GETALLCOMPANIES_CREATEDBY_3 = "(smaCompanies.createdBy IS NULL OR smaCompanies.createdBy = ?)";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERID_ISACTIVE_2 =
		"smaCompanies.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERID_CUSTOMERID_2 =
		"smaCompanies.customerId = ?";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_ISACTIVE_2 =
		"smaCompanies.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_1 =
		"smaCompanies.domains IS NULL";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_2 =
		"smaCompanies.domains = ?";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYDOMAINS_DOMAINS_3 =
		"(smaCompanies.domains IS NULL OR smaCompanies.domains = ?)";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_ISACTIVE_2 =
		"smaCompanies.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_GROUPNAME_1 =
		"smaCompanies.groupName IS NULL";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_GROUPNAME_2 =
		"smaCompanies.groupName = ?";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYGROUPNAME_GROUPNAME_3 =
		"(smaCompanies.groupName IS NULL OR smaCompanies.groupName = ?)";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_ISACTIVE_2 =
		"smaCompanies.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_CUSTOMERID_2 =
		"smaCompanies.customerId = ? AND ";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_DOMAINS_1 =
		"smaCompanies.domains IS NULL";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_DOMAINS_2 =
		"smaCompanies.domains = ?";
	private static final String _FINDER_COLUMN_SMACOMPANYLISTBYCUSTOMERIDDOMAINS_DOMAINS_3 =
		"(smaCompanies.domains IS NULL OR smaCompanies.domains = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "smaCompanies.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SMACompanies exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SMACompanies exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SMACompaniesPersistenceImpl.class);
	private static SMACompanies _nullSMACompanies = new SMACompaniesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SMACompanies> toCacheModel() {
				return _nullSMACompaniesCacheModel;
			}
		};

	private static CacheModel<SMACompanies> _nullSMACompaniesCacheModel = new CacheModel<SMACompanies>() {
			public SMACompanies toEntityModel() {
				return _nullSMACompanies;
			}
		};
}