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

import com.pacnet.connect.NoSuchFacilityUserMappingException;
import com.pacnet.connect.model.FacilityUserMapping;
import com.pacnet.connect.model.impl.FacilityUserMappingImpl;
import com.pacnet.connect.model.impl.FacilityUserMappingModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the facility user mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityUserMappingPersistence
 * @see FacilityUserMappingUtil
 * @generated
 */
public class FacilityUserMappingPersistenceImpl extends BasePersistenceImpl<FacilityUserMapping>
	implements FacilityUserMappingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FacilityUserMappingUtil} to access the facility user mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FacilityUserMappingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYCUSTOMERID =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityUserMappingByCustomerId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYCUSTOMERID =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityUserMappingByCustomerId",
			new String[] { Long.class.getName() },
			FacilityUserMappingModelImpl.CUSTOMERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYUSERMAPPINGBYCUSTOMERID =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityUserMappingByCustomerId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYFACILITY =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityUserMappingByFacility",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYFACILITY =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityUserMappingByFacility",
			new String[] { Long.class.getName() },
			FacilityUserMappingModelImpl.FACILTYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYUSERMAPPINGBYFACILITY =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityUserMappingByFacility",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYBYCUSTOMERCONTACT =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityByCustomerContact",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYCUSTOMERCONTACT =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityByCustomerContact",
			new String[] { Long.class.getName(), Long.class.getName() },
			FacilityUserMappingModelImpl.CUSTOMERID_COLUMN_BITMASK |
			FacilityUserMappingModelImpl.CUSTOMERCONTACTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYBYCUSTOMERCONTACT =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityByCustomerContact",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FUMBYFACILITYCUSTOMERCONTACT =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFumByFacilityCustomerContact",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FUMBYFACILITYCUSTOMERCONTACT =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFumByFacilityCustomerContact",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			FacilityUserMappingModelImpl.CUSTOMERID_COLUMN_BITMASK |
			FacilityUserMappingModelImpl.CUSTOMERCONTACTID_COLUMN_BITMASK |
			FacilityUserMappingModelImpl.FACILTYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FUMBYFACILITYCUSTOMERCONTACT =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFumByFacilityCustomerContact",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYBYNONPACNETUSERID =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityByNonPacnetUserId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYNONPACNETUSERID =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityByNonPacnetUserId",
			new String[] { Long.class.getName(), Long.class.getName() },
			FacilityUserMappingModelImpl.CUSTOMERID_COLUMN_BITMASK |
			FacilityUserMappingModelImpl.NONPACNETUSERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYBYNONPACNETUSERID =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityByNonPacnetUserId",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYBYFACILITYANDNONPACNETUSERID =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFacilityByFacilityAndNonPacnetUserId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYFACILITYANDNONPACNETUSERID =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFacilityByFacilityAndNonPacnetUserId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			FacilityUserMappingModelImpl.CUSTOMERID_COLUMN_BITMASK |
			FacilityUserMappingModelImpl.NONPACNETUSERID_COLUMN_BITMASK |
			FacilityUserMappingModelImpl.FACILTYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FACILITYBYFACILITYANDNONPACNETUSERID =
		new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFacilityByFacilityAndNonPacnetUserId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED,
			FacilityUserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the facility user mapping in the entity cache if it is enabled.
	 *
	 * @param facilityUserMapping the facility user mapping
	 */
	public void cacheResult(FacilityUserMapping facilityUserMapping) {
		EntityCacheUtil.putResult(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingImpl.class, facilityUserMapping.getPrimaryKey(),
			facilityUserMapping);

		facilityUserMapping.resetOriginalValues();
	}

	/**
	 * Caches the facility user mappings in the entity cache if it is enabled.
	 *
	 * @param facilityUserMappings the facility user mappings
	 */
	public void cacheResult(List<FacilityUserMapping> facilityUserMappings) {
		for (FacilityUserMapping facilityUserMapping : facilityUserMappings) {
			if (EntityCacheUtil.getResult(
						FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
						FacilityUserMappingImpl.class,
						facilityUserMapping.getPrimaryKey()) == null) {
				cacheResult(facilityUserMapping);
			}
			else {
				facilityUserMapping.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all facility user mappings.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FacilityUserMappingImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FacilityUserMappingImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the facility user mapping.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FacilityUserMapping facilityUserMapping) {
		EntityCacheUtil.removeResult(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingImpl.class, facilityUserMapping.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FacilityUserMapping> facilityUserMappings) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FacilityUserMapping facilityUserMapping : facilityUserMappings) {
			EntityCacheUtil.removeResult(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
				FacilityUserMappingImpl.class,
				facilityUserMapping.getPrimaryKey());
		}
	}

	/**
	 * Creates a new facility user mapping with the primary key. Does not add the facility user mapping to the database.
	 *
	 * @param id the primary key for the new facility user mapping
	 * @return the new facility user mapping
	 */
	public FacilityUserMapping create(long id) {
		FacilityUserMapping facilityUserMapping = new FacilityUserMappingImpl();

		facilityUserMapping.setNew(true);
		facilityUserMapping.setPrimaryKey(id);

		return facilityUserMapping;
	}

	/**
	 * Removes the facility user mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the facility user mapping
	 * @return the facility user mapping that was removed
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping remove(long id)
		throws NoSuchFacilityUserMappingException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the facility user mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the facility user mapping
	 * @return the facility user mapping that was removed
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityUserMapping remove(Serializable primaryKey)
		throws NoSuchFacilityUserMappingException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FacilityUserMapping facilityUserMapping = (FacilityUserMapping)session.get(FacilityUserMappingImpl.class,
					primaryKey);

			if (facilityUserMapping == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFacilityUserMappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(facilityUserMapping);
		}
		catch (NoSuchFacilityUserMappingException nsee) {
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
	protected FacilityUserMapping removeImpl(
		FacilityUserMapping facilityUserMapping) throws SystemException {
		facilityUserMapping = toUnwrappedModel(facilityUserMapping);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, facilityUserMapping);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(facilityUserMapping);

		return facilityUserMapping;
	}

	@Override
	public FacilityUserMapping updateImpl(
		com.pacnet.connect.model.FacilityUserMapping facilityUserMapping,
		boolean merge) throws SystemException {
		facilityUserMapping = toUnwrappedModel(facilityUserMapping);

		boolean isNew = facilityUserMapping.isNew();

		FacilityUserMappingModelImpl facilityUserMappingModelImpl = (FacilityUserMappingModelImpl)facilityUserMapping;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, facilityUserMapping, merge);

			facilityUserMapping.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FacilityUserMappingModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((facilityUserMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYCUSTOMERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityUserMappingModelImpl.getOriginalCustomerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYUSERMAPPINGBYCUSTOMERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYCUSTOMERID,
					args);

				args = new Object[] {
						Long.valueOf(facilityUserMappingModelImpl.getCustomerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYUSERMAPPINGBYCUSTOMERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYCUSTOMERID,
					args);
			}

			if ((facilityUserMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYFACILITY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityUserMappingModelImpl.getOriginalFaciltyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYUSERMAPPINGBYFACILITY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYFACILITY,
					args);

				args = new Object[] {
						Long.valueOf(facilityUserMappingModelImpl.getFaciltyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYUSERMAPPINGBYFACILITY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYFACILITY,
					args);
			}

			if ((facilityUserMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYCUSTOMERCONTACT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityUserMappingModelImpl.getOriginalCustomerId()),
						Long.valueOf(facilityUserMappingModelImpl.getOriginalCustomerContactId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYBYCUSTOMERCONTACT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYCUSTOMERCONTACT,
					args);

				args = new Object[] {
						Long.valueOf(facilityUserMappingModelImpl.getCustomerId()),
						Long.valueOf(facilityUserMappingModelImpl.getCustomerContactId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYBYCUSTOMERCONTACT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYCUSTOMERCONTACT,
					args);
			}

			if ((facilityUserMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FUMBYFACILITYCUSTOMERCONTACT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityUserMappingModelImpl.getOriginalCustomerId()),
						Long.valueOf(facilityUserMappingModelImpl.getOriginalCustomerContactId()),
						Long.valueOf(facilityUserMappingModelImpl.getOriginalFaciltyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FUMBYFACILITYCUSTOMERCONTACT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FUMBYFACILITYCUSTOMERCONTACT,
					args);

				args = new Object[] {
						Long.valueOf(facilityUserMappingModelImpl.getCustomerId()),
						Long.valueOf(facilityUserMappingModelImpl.getCustomerContactId()),
						Long.valueOf(facilityUserMappingModelImpl.getFaciltyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FUMBYFACILITYCUSTOMERCONTACT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FUMBYFACILITYCUSTOMERCONTACT,
					args);
			}

			if ((facilityUserMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYNONPACNETUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityUserMappingModelImpl.getOriginalCustomerId()),
						Long.valueOf(facilityUserMappingModelImpl.getOriginalNonPacnetUserId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYBYNONPACNETUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYNONPACNETUSERID,
					args);

				args = new Object[] {
						Long.valueOf(facilityUserMappingModelImpl.getCustomerId()),
						Long.valueOf(facilityUserMappingModelImpl.getNonPacnetUserId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYBYNONPACNETUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYNONPACNETUSERID,
					args);
			}

			if ((facilityUserMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYFACILITYANDNONPACNETUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(facilityUserMappingModelImpl.getOriginalCustomerId()),
						Long.valueOf(facilityUserMappingModelImpl.getOriginalNonPacnetUserId()),
						Long.valueOf(facilityUserMappingModelImpl.getOriginalFaciltyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYBYFACILITYANDNONPACNETUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYFACILITYANDNONPACNETUSERID,
					args);

				args = new Object[] {
						Long.valueOf(facilityUserMappingModelImpl.getCustomerId()),
						Long.valueOf(facilityUserMappingModelImpl.getNonPacnetUserId()),
						Long.valueOf(facilityUserMappingModelImpl.getFaciltyId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FACILITYBYFACILITYANDNONPACNETUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYFACILITYANDNONPACNETUSERID,
					args);
			}
		}

		EntityCacheUtil.putResult(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
			FacilityUserMappingImpl.class, facilityUserMapping.getPrimaryKey(),
			facilityUserMapping);

		return facilityUserMapping;
	}

	protected FacilityUserMapping toUnwrappedModel(
		FacilityUserMapping facilityUserMapping) {
		if (facilityUserMapping instanceof FacilityUserMappingImpl) {
			return facilityUserMapping;
		}

		FacilityUserMappingImpl facilityUserMappingImpl = new FacilityUserMappingImpl();

		facilityUserMappingImpl.setNew(facilityUserMapping.isNew());
		facilityUserMappingImpl.setPrimaryKey(facilityUserMapping.getPrimaryKey());

		facilityUserMappingImpl.setId(facilityUserMapping.getId());
		facilityUserMappingImpl.setCustomerId(facilityUserMapping.getCustomerId());
		facilityUserMappingImpl.setFaciltyId(facilityUserMapping.getFaciltyId());
		facilityUserMappingImpl.setCustomerContactId(facilityUserMapping.getCustomerContactId());
		facilityUserMappingImpl.setIsActive(facilityUserMapping.isIsActive());
		facilityUserMappingImpl.setNonPacnetUserId(facilityUserMapping.getNonPacnetUserId());
		facilityUserMappingImpl.setCreatedOn(facilityUserMapping.getCreatedOn());
		facilityUserMappingImpl.setCreatedBy(facilityUserMapping.getCreatedBy());
		facilityUserMappingImpl.setUpdatedOn(facilityUserMapping.getUpdatedOn());
		facilityUserMappingImpl.setUpdatedBy(facilityUserMapping.getUpdatedBy());

		return facilityUserMappingImpl;
	}

	/**
	 * Returns the facility user mapping with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility user mapping
	 * @return the facility user mapping
	 * @throws com.liferay.portal.NoSuchModelException if a facility user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityUserMapping findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility user mapping with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityUserMappingException} if it could not be found.
	 *
	 * @param id the primary key of the facility user mapping
	 * @return the facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping findByPrimaryKey(long id)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = fetchByPrimaryKey(id);

		if (facilityUserMapping == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchFacilityUserMappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return facilityUserMapping;
	}

	/**
	 * Returns the facility user mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the facility user mapping
	 * @return the facility user mapping, or <code>null</code> if a facility user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FacilityUserMapping fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the facility user mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the facility user mapping
	 * @return the facility user mapping, or <code>null</code> if a facility user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping fetchByPrimaryKey(long id)
		throws SystemException {
		FacilityUserMapping facilityUserMapping = (FacilityUserMapping)EntityCacheUtil.getResult(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
				FacilityUserMappingImpl.class, id);

		if (facilityUserMapping == _nullFacilityUserMapping) {
			return null;
		}

		if (facilityUserMapping == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				facilityUserMapping = (FacilityUserMapping)session.get(FacilityUserMappingImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (facilityUserMapping != null) {
					cacheResult(facilityUserMapping);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(FacilityUserMappingModelImpl.ENTITY_CACHE_ENABLED,
						FacilityUserMappingImpl.class, id,
						_nullFacilityUserMapping);
				}

				closeSession(session);
			}
		}

		return facilityUserMapping;
	}

	/**
	 * Returns all the facility user mappings where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @return the matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFacilityUserMappingByCustomerId(
		long customerId) throws SystemException {
		return findByFacilityUserMappingByCustomerId(customerId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility user mappings where customerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param start the lower bound of the range of facility user mappings
	 * @param end the upper bound of the range of facility user mappings (not inclusive)
	 * @return the range of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFacilityUserMappingByCustomerId(
		long customerId, int start, int end) throws SystemException {
		return findByFacilityUserMappingByCustomerId(customerId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the facility user mappings where customerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param start the lower bound of the range of facility user mappings
	 * @param end the upper bound of the range of facility user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFacilityUserMappingByCustomerId(
		long customerId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYCUSTOMERID;
			finderArgs = new Object[] { customerId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYCUSTOMERID;
			finderArgs = new Object[] { customerId, start, end, orderByComparator };
		}

		List<FacilityUserMapping> list = (List<FacilityUserMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityUserMapping facilityUserMapping : list) {
				if ((customerId != facilityUserMapping.getCustomerId())) {
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

			query.append(_SQL_SELECT_FACILITYUSERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYUSERMAPPINGBYCUSTOMERID_CUSTOMERID_2);

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

				list = (List<FacilityUserMapping>)QueryUtil.list(q,
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
	 * Returns the first facility user mapping in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping findByFacilityUserMappingByCustomerId_First(
		long customerId, OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = fetchByFacilityUserMappingByCustomerId_First(customerId,
				orderByComparator);

		if (facilityUserMapping != null) {
			return facilityUserMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserMappingException(msg.toString());
	}

	/**
	 * Returns the first facility user mapping in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping fetchByFacilityUserMappingByCustomerId_First(
		long customerId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FacilityUserMapping> list = findByFacilityUserMappingByCustomerId(customerId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility user mapping in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping findByFacilityUserMappingByCustomerId_Last(
		long customerId, OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = fetchByFacilityUserMappingByCustomerId_Last(customerId,
				orderByComparator);

		if (facilityUserMapping != null) {
			return facilityUserMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserMappingException(msg.toString());
	}

	/**
	 * Returns the last facility user mapping in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping fetchByFacilityUserMappingByCustomerId_Last(
		long customerId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByFacilityUserMappingByCustomerId(customerId);

		List<FacilityUserMapping> list = findByFacilityUserMappingByCustomerId(customerId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility user mappings before and after the current facility user mapping in the ordered set where customerId = &#63;.
	 *
	 * @param id the primary key of the current facility user mapping
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping[] findByFacilityUserMappingByCustomerId_PrevAndNext(
		long id, long customerId, OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityUserMapping[] array = new FacilityUserMappingImpl[3];

			array[0] = getByFacilityUserMappingByCustomerId_PrevAndNext(session,
					facilityUserMapping, customerId, orderByComparator, true);

			array[1] = facilityUserMapping;

			array[2] = getByFacilityUserMappingByCustomerId_PrevAndNext(session,
					facilityUserMapping, customerId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FacilityUserMapping getByFacilityUserMappingByCustomerId_PrevAndNext(
		Session session, FacilityUserMapping facilityUserMapping,
		long customerId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYUSERMAPPING_WHERE);

		query.append(_FINDER_COLUMN_FACILITYUSERMAPPINGBYCUSTOMERID_CUSTOMERID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(facilityUserMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityUserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility user mappings where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @return the matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFacilityUserMappingByFacility(
		long faciltyId) throws SystemException {
		return findByFacilityUserMappingByFacility(faciltyId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility user mappings where faciltyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param faciltyId the facilty ID
	 * @param start the lower bound of the range of facility user mappings
	 * @param end the upper bound of the range of facility user mappings (not inclusive)
	 * @return the range of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFacilityUserMappingByFacility(
		long faciltyId, int start, int end) throws SystemException {
		return findByFacilityUserMappingByFacility(faciltyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility user mappings where faciltyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param faciltyId the facilty ID
	 * @param start the lower bound of the range of facility user mappings
	 * @param end the upper bound of the range of facility user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFacilityUserMappingByFacility(
		long faciltyId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYFACILITY;
			finderArgs = new Object[] { faciltyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYUSERMAPPINGBYFACILITY;
			finderArgs = new Object[] { faciltyId, start, end, orderByComparator };
		}

		List<FacilityUserMapping> list = (List<FacilityUserMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityUserMapping facilityUserMapping : list) {
				if ((faciltyId != facilityUserMapping.getFaciltyId())) {
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

			query.append(_SQL_SELECT_FACILITYUSERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYUSERMAPPINGBYFACILITY_FACILTYID_2);

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

				list = (List<FacilityUserMapping>)QueryUtil.list(q,
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
	 * Returns the first facility user mapping in the ordered set where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping findByFacilityUserMappingByFacility_First(
		long faciltyId, OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = fetchByFacilityUserMappingByFacility_First(faciltyId,
				orderByComparator);

		if (facilityUserMapping != null) {
			return facilityUserMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("faciltyId=");
		msg.append(faciltyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserMappingException(msg.toString());
	}

	/**
	 * Returns the first facility user mapping in the ordered set where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping fetchByFacilityUserMappingByFacility_First(
		long faciltyId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FacilityUserMapping> list = findByFacilityUserMappingByFacility(faciltyId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility user mapping in the ordered set where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping findByFacilityUserMappingByFacility_Last(
		long faciltyId, OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = fetchByFacilityUserMappingByFacility_Last(faciltyId,
				orderByComparator);

		if (facilityUserMapping != null) {
			return facilityUserMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("faciltyId=");
		msg.append(faciltyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserMappingException(msg.toString());
	}

	/**
	 * Returns the last facility user mapping in the ordered set where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping fetchByFacilityUserMappingByFacility_Last(
		long faciltyId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByFacilityUserMappingByFacility(faciltyId);

		List<FacilityUserMapping> list = findByFacilityUserMappingByFacility(faciltyId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility user mappings before and after the current facility user mapping in the ordered set where faciltyId = &#63;.
	 *
	 * @param id the primary key of the current facility user mapping
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping[] findByFacilityUserMappingByFacility_PrevAndNext(
		long id, long faciltyId, OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityUserMapping[] array = new FacilityUserMappingImpl[3];

			array[0] = getByFacilityUserMappingByFacility_PrevAndNext(session,
					facilityUserMapping, faciltyId, orderByComparator, true);

			array[1] = facilityUserMapping;

			array[2] = getByFacilityUserMappingByFacility_PrevAndNext(session,
					facilityUserMapping, faciltyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FacilityUserMapping getByFacilityUserMappingByFacility_PrevAndNext(
		Session session, FacilityUserMapping facilityUserMapping,
		long faciltyId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYUSERMAPPING_WHERE);

		query.append(_FINDER_COLUMN_FACILITYUSERMAPPINGBYFACILITY_FACILTYID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(facilityUserMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityUserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility user mappings where customerId = &#63; and customerContactId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @return the matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFacilityByCustomerContact(
		long customerId, long customerContactId) throws SystemException {
		return findByFacilityByCustomerContact(customerId, customerContactId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility user mappings where customerId = &#63; and customerContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param start the lower bound of the range of facility user mappings
	 * @param end the upper bound of the range of facility user mappings (not inclusive)
	 * @return the range of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFacilityByCustomerContact(
		long customerId, long customerContactId, int start, int end)
		throws SystemException {
		return findByFacilityByCustomerContact(customerId, customerContactId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility user mappings where customerId = &#63; and customerContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param start the lower bound of the range of facility user mappings
	 * @param end the upper bound of the range of facility user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFacilityByCustomerContact(
		long customerId, long customerContactId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYCUSTOMERCONTACT;
			finderArgs = new Object[] { customerId, customerContactId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYBYCUSTOMERCONTACT;
			finderArgs = new Object[] {
					customerId, customerContactId,
					
					start, end, orderByComparator
				};
		}

		List<FacilityUserMapping> list = (List<FacilityUserMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityUserMapping facilityUserMapping : list) {
				if ((customerId != facilityUserMapping.getCustomerId()) ||
						(customerContactId != facilityUserMapping.getCustomerContactId())) {
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

			query.append(_SQL_SELECT_FACILITYUSERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYBYCUSTOMERCONTACT_CUSTOMERID_2);

			query.append(_FINDER_COLUMN_FACILITYBYCUSTOMERCONTACT_CUSTOMERCONTACTID_2);

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

				qPos.add(customerContactId);

				list = (List<FacilityUserMapping>)QueryUtil.list(q,
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
	 * Returns the first facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping findByFacilityByCustomerContact_First(
		long customerId, long customerContactId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = fetchByFacilityByCustomerContact_First(customerId,
				customerContactId, orderByComparator);

		if (facilityUserMapping != null) {
			return facilityUserMapping;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(", customerContactId=");
		msg.append(customerContactId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserMappingException(msg.toString());
	}

	/**
	 * Returns the first facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping fetchByFacilityByCustomerContact_First(
		long customerId, long customerContactId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FacilityUserMapping> list = findByFacilityByCustomerContact(customerId,
				customerContactId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping findByFacilityByCustomerContact_Last(
		long customerId, long customerContactId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = fetchByFacilityByCustomerContact_Last(customerId,
				customerContactId, orderByComparator);

		if (facilityUserMapping != null) {
			return facilityUserMapping;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(", customerContactId=");
		msg.append(customerContactId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserMappingException(msg.toString());
	}

	/**
	 * Returns the last facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping fetchByFacilityByCustomerContact_Last(
		long customerId, long customerContactId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFacilityByCustomerContact(customerId,
				customerContactId);

		List<FacilityUserMapping> list = findByFacilityByCustomerContact(customerId,
				customerContactId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility user mappings before and after the current facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63;.
	 *
	 * @param id the primary key of the current facility user mapping
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping[] findByFacilityByCustomerContact_PrevAndNext(
		long id, long customerId, long customerContactId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityUserMapping[] array = new FacilityUserMappingImpl[3];

			array[0] = getByFacilityByCustomerContact_PrevAndNext(session,
					facilityUserMapping, customerId, customerContactId,
					orderByComparator, true);

			array[1] = facilityUserMapping;

			array[2] = getByFacilityByCustomerContact_PrevAndNext(session,
					facilityUserMapping, customerId, customerContactId,
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

	protected FacilityUserMapping getByFacilityByCustomerContact_PrevAndNext(
		Session session, FacilityUserMapping facilityUserMapping,
		long customerId, long customerContactId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYUSERMAPPING_WHERE);

		query.append(_FINDER_COLUMN_FACILITYBYCUSTOMERCONTACT_CUSTOMERID_2);

		query.append(_FINDER_COLUMN_FACILITYBYCUSTOMERCONTACT_CUSTOMERCONTACTID_2);

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

		qPos.add(customerContactId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(facilityUserMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityUserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param faciltyId the facilty ID
	 * @return the matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFumByFacilityCustomerContact(
		long customerId, long customerContactId, long faciltyId)
		throws SystemException {
		return findByFumByFacilityCustomerContact(customerId,
			customerContactId, faciltyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param faciltyId the facilty ID
	 * @param start the lower bound of the range of facility user mappings
	 * @param end the upper bound of the range of facility user mappings (not inclusive)
	 * @return the range of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFumByFacilityCustomerContact(
		long customerId, long customerContactId, long faciltyId, int start,
		int end) throws SystemException {
		return findByFumByFacilityCustomerContact(customerId,
			customerContactId, faciltyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param faciltyId the facilty ID
	 * @param start the lower bound of the range of facility user mappings
	 * @param end the upper bound of the range of facility user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFumByFacilityCustomerContact(
		long customerId, long customerContactId, long faciltyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FUMBYFACILITYCUSTOMERCONTACT;
			finderArgs = new Object[] { customerId, customerContactId, faciltyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FUMBYFACILITYCUSTOMERCONTACT;
			finderArgs = new Object[] {
					customerId, customerContactId, faciltyId,
					
					start, end, orderByComparator
				};
		}

		List<FacilityUserMapping> list = (List<FacilityUserMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityUserMapping facilityUserMapping : list) {
				if ((customerId != facilityUserMapping.getCustomerId()) ||
						(customerContactId != facilityUserMapping.getCustomerContactId()) ||
						(faciltyId != facilityUserMapping.getFaciltyId())) {
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

			query.append(_SQL_SELECT_FACILITYUSERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FUMBYFACILITYCUSTOMERCONTACT_CUSTOMERID_2);

			query.append(_FINDER_COLUMN_FUMBYFACILITYCUSTOMERCONTACT_CUSTOMERCONTACTID_2);

			query.append(_FINDER_COLUMN_FUMBYFACILITYCUSTOMERCONTACT_FACILTYID_2);

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

				qPos.add(customerContactId);

				qPos.add(faciltyId);

				list = (List<FacilityUserMapping>)QueryUtil.list(q,
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
	 * Returns the first facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping findByFumByFacilityCustomerContact_First(
		long customerId, long customerContactId, long faciltyId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = fetchByFumByFacilityCustomerContact_First(customerId,
				customerContactId, faciltyId, orderByComparator);

		if (facilityUserMapping != null) {
			return facilityUserMapping;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(", customerContactId=");
		msg.append(customerContactId);

		msg.append(", faciltyId=");
		msg.append(faciltyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserMappingException(msg.toString());
	}

	/**
	 * Returns the first facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping fetchByFumByFacilityCustomerContact_First(
		long customerId, long customerContactId, long faciltyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FacilityUserMapping> list = findByFumByFacilityCustomerContact(customerId,
				customerContactId, faciltyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping findByFumByFacilityCustomerContact_Last(
		long customerId, long customerContactId, long faciltyId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = fetchByFumByFacilityCustomerContact_Last(customerId,
				customerContactId, faciltyId, orderByComparator);

		if (facilityUserMapping != null) {
			return facilityUserMapping;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(", customerContactId=");
		msg.append(customerContactId);

		msg.append(", faciltyId=");
		msg.append(faciltyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserMappingException(msg.toString());
	}

	/**
	 * Returns the last facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping fetchByFumByFacilityCustomerContact_Last(
		long customerId, long customerContactId, long faciltyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFumByFacilityCustomerContact(customerId,
				customerContactId, faciltyId);

		List<FacilityUserMapping> list = findByFumByFacilityCustomerContact(customerId,
				customerContactId, faciltyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility user mappings before and after the current facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	 *
	 * @param id the primary key of the current facility user mapping
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping[] findByFumByFacilityCustomerContact_PrevAndNext(
		long id, long customerId, long customerContactId, long faciltyId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityUserMapping[] array = new FacilityUserMappingImpl[3];

			array[0] = getByFumByFacilityCustomerContact_PrevAndNext(session,
					facilityUserMapping, customerId, customerContactId,
					faciltyId, orderByComparator, true);

			array[1] = facilityUserMapping;

			array[2] = getByFumByFacilityCustomerContact_PrevAndNext(session,
					facilityUserMapping, customerId, customerContactId,
					faciltyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FacilityUserMapping getByFumByFacilityCustomerContact_PrevAndNext(
		Session session, FacilityUserMapping facilityUserMapping,
		long customerId, long customerContactId, long faciltyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYUSERMAPPING_WHERE);

		query.append(_FINDER_COLUMN_FUMBYFACILITYCUSTOMERCONTACT_CUSTOMERID_2);

		query.append(_FINDER_COLUMN_FUMBYFACILITYCUSTOMERCONTACT_CUSTOMERCONTACTID_2);

		query.append(_FINDER_COLUMN_FUMBYFACILITYCUSTOMERCONTACT_FACILTYID_2);

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

		qPos.add(customerContactId);

		qPos.add(faciltyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(facilityUserMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityUserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @return the matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFacilityByNonPacnetUserId(
		long customerId, long nonPacnetUserId) throws SystemException {
		return findByFacilityByNonPacnetUserId(customerId, nonPacnetUserId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param start the lower bound of the range of facility user mappings
	 * @param end the upper bound of the range of facility user mappings (not inclusive)
	 * @return the range of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFacilityByNonPacnetUserId(
		long customerId, long nonPacnetUserId, int start, int end)
		throws SystemException {
		return findByFacilityByNonPacnetUserId(customerId, nonPacnetUserId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param start the lower bound of the range of facility user mappings
	 * @param end the upper bound of the range of facility user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFacilityByNonPacnetUserId(
		long customerId, long nonPacnetUserId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYNONPACNETUSERID;
			finderArgs = new Object[] { customerId, nonPacnetUserId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYBYNONPACNETUSERID;
			finderArgs = new Object[] {
					customerId, nonPacnetUserId,
					
					start, end, orderByComparator
				};
		}

		List<FacilityUserMapping> list = (List<FacilityUserMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityUserMapping facilityUserMapping : list) {
				if ((customerId != facilityUserMapping.getCustomerId()) ||
						(nonPacnetUserId != facilityUserMapping.getNonPacnetUserId())) {
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

			query.append(_SQL_SELECT_FACILITYUSERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYBYNONPACNETUSERID_CUSTOMERID_2);

			query.append(_FINDER_COLUMN_FACILITYBYNONPACNETUSERID_NONPACNETUSERID_2);

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

				qPos.add(nonPacnetUserId);

				list = (List<FacilityUserMapping>)QueryUtil.list(q,
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
	 * Returns the first facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping findByFacilityByNonPacnetUserId_First(
		long customerId, long nonPacnetUserId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = fetchByFacilityByNonPacnetUserId_First(customerId,
				nonPacnetUserId, orderByComparator);

		if (facilityUserMapping != null) {
			return facilityUserMapping;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(", nonPacnetUserId=");
		msg.append(nonPacnetUserId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserMappingException(msg.toString());
	}

	/**
	 * Returns the first facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping fetchByFacilityByNonPacnetUserId_First(
		long customerId, long nonPacnetUserId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FacilityUserMapping> list = findByFacilityByNonPacnetUserId(customerId,
				nonPacnetUserId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping findByFacilityByNonPacnetUserId_Last(
		long customerId, long nonPacnetUserId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = fetchByFacilityByNonPacnetUserId_Last(customerId,
				nonPacnetUserId, orderByComparator);

		if (facilityUserMapping != null) {
			return facilityUserMapping;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(", nonPacnetUserId=");
		msg.append(nonPacnetUserId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserMappingException(msg.toString());
	}

	/**
	 * Returns the last facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping fetchByFacilityByNonPacnetUserId_Last(
		long customerId, long nonPacnetUserId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFacilityByNonPacnetUserId(customerId, nonPacnetUserId);

		List<FacilityUserMapping> list = findByFacilityByNonPacnetUserId(customerId,
				nonPacnetUserId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility user mappings before and after the current facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63;.
	 *
	 * @param id the primary key of the current facility user mapping
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping[] findByFacilityByNonPacnetUserId_PrevAndNext(
		long id, long customerId, long nonPacnetUserId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityUserMapping[] array = new FacilityUserMappingImpl[3];

			array[0] = getByFacilityByNonPacnetUserId_PrevAndNext(session,
					facilityUserMapping, customerId, nonPacnetUserId,
					orderByComparator, true);

			array[1] = facilityUserMapping;

			array[2] = getByFacilityByNonPacnetUserId_PrevAndNext(session,
					facilityUserMapping, customerId, nonPacnetUserId,
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

	protected FacilityUserMapping getByFacilityByNonPacnetUserId_PrevAndNext(
		Session session, FacilityUserMapping facilityUserMapping,
		long customerId, long nonPacnetUserId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYUSERMAPPING_WHERE);

		query.append(_FINDER_COLUMN_FACILITYBYNONPACNETUSERID_CUSTOMERID_2);

		query.append(_FINDER_COLUMN_FACILITYBYNONPACNETUSERID_NONPACNETUSERID_2);

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

		qPos.add(nonPacnetUserId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(facilityUserMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityUserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param faciltyId the facilty ID
	 * @return the matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFacilityByFacilityAndNonPacnetUserId(
		long customerId, long nonPacnetUserId, long faciltyId)
		throws SystemException {
		return findByFacilityByFacilityAndNonPacnetUserId(customerId,
			nonPacnetUserId, faciltyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param faciltyId the facilty ID
	 * @param start the lower bound of the range of facility user mappings
	 * @param end the upper bound of the range of facility user mappings (not inclusive)
	 * @return the range of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFacilityByFacilityAndNonPacnetUserId(
		long customerId, long nonPacnetUserId, long faciltyId, int start,
		int end) throws SystemException {
		return findByFacilityByFacilityAndNonPacnetUserId(customerId,
			nonPacnetUserId, faciltyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param faciltyId the facilty ID
	 * @param start the lower bound of the range of facility user mappings
	 * @param end the upper bound of the range of facility user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findByFacilityByFacilityAndNonPacnetUserId(
		long customerId, long nonPacnetUserId, long faciltyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FACILITYBYFACILITYANDNONPACNETUSERID;
			finderArgs = new Object[] { customerId, nonPacnetUserId, faciltyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FACILITYBYFACILITYANDNONPACNETUSERID;
			finderArgs = new Object[] {
					customerId, nonPacnetUserId, faciltyId,
					
					start, end, orderByComparator
				};
		}

		List<FacilityUserMapping> list = (List<FacilityUserMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FacilityUserMapping facilityUserMapping : list) {
				if ((customerId != facilityUserMapping.getCustomerId()) ||
						(nonPacnetUserId != facilityUserMapping.getNonPacnetUserId()) ||
						(faciltyId != facilityUserMapping.getFaciltyId())) {
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

			query.append(_SQL_SELECT_FACILITYUSERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYBYFACILITYANDNONPACNETUSERID_CUSTOMERID_2);

			query.append(_FINDER_COLUMN_FACILITYBYFACILITYANDNONPACNETUSERID_NONPACNETUSERID_2);

			query.append(_FINDER_COLUMN_FACILITYBYFACILITYANDNONPACNETUSERID_FACILTYID_2);

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

				qPos.add(nonPacnetUserId);

				qPos.add(faciltyId);

				list = (List<FacilityUserMapping>)QueryUtil.list(q,
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
	 * Returns the first facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping findByFacilityByFacilityAndNonPacnetUserId_First(
		long customerId, long nonPacnetUserId, long faciltyId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = fetchByFacilityByFacilityAndNonPacnetUserId_First(customerId,
				nonPacnetUserId, faciltyId, orderByComparator);

		if (facilityUserMapping != null) {
			return facilityUserMapping;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(", nonPacnetUserId=");
		msg.append(nonPacnetUserId);

		msg.append(", faciltyId=");
		msg.append(faciltyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserMappingException(msg.toString());
	}

	/**
	 * Returns the first facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping fetchByFacilityByFacilityAndNonPacnetUserId_First(
		long customerId, long nonPacnetUserId, long faciltyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FacilityUserMapping> list = findByFacilityByFacilityAndNonPacnetUserId(customerId,
				nonPacnetUserId, faciltyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping findByFacilityByFacilityAndNonPacnetUserId_Last(
		long customerId, long nonPacnetUserId, long faciltyId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = fetchByFacilityByFacilityAndNonPacnetUserId_Last(customerId,
				nonPacnetUserId, faciltyId, orderByComparator);

		if (facilityUserMapping != null) {
			return facilityUserMapping;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customerId=");
		msg.append(customerId);

		msg.append(", nonPacnetUserId=");
		msg.append(nonPacnetUserId);

		msg.append(", faciltyId=");
		msg.append(faciltyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFacilityUserMappingException(msg.toString());
	}

	/**
	 * Returns the last facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping fetchByFacilityByFacilityAndNonPacnetUserId_Last(
		long customerId, long nonPacnetUserId, long faciltyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFacilityByFacilityAndNonPacnetUserId(customerId,
				nonPacnetUserId, faciltyId);

		List<FacilityUserMapping> list = findByFacilityByFacilityAndNonPacnetUserId(customerId,
				nonPacnetUserId, faciltyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the facility user mappings before and after the current facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	 *
	 * @param id the primary key of the current facility user mapping
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param faciltyId the facilty ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next facility user mapping
	 * @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping[] findByFacilityByFacilityAndNonPacnetUserId_PrevAndNext(
		long id, long customerId, long nonPacnetUserId, long faciltyId,
		OrderByComparator orderByComparator)
		throws NoSuchFacilityUserMappingException, SystemException {
		FacilityUserMapping facilityUserMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FacilityUserMapping[] array = new FacilityUserMappingImpl[3];

			array[0] = getByFacilityByFacilityAndNonPacnetUserId_PrevAndNext(session,
					facilityUserMapping, customerId, nonPacnetUserId,
					faciltyId, orderByComparator, true);

			array[1] = facilityUserMapping;

			array[2] = getByFacilityByFacilityAndNonPacnetUserId_PrevAndNext(session,
					facilityUserMapping, customerId, nonPacnetUserId,
					faciltyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FacilityUserMapping getByFacilityByFacilityAndNonPacnetUserId_PrevAndNext(
		Session session, FacilityUserMapping facilityUserMapping,
		long customerId, long nonPacnetUserId, long faciltyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACILITYUSERMAPPING_WHERE);

		query.append(_FINDER_COLUMN_FACILITYBYFACILITYANDNONPACNETUSERID_CUSTOMERID_2);

		query.append(_FINDER_COLUMN_FACILITYBYFACILITYANDNONPACNETUSERID_NONPACNETUSERID_2);

		query.append(_FINDER_COLUMN_FACILITYBYFACILITYANDNONPACNETUSERID_FACILTYID_2);

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

		qPos.add(nonPacnetUserId);

		qPos.add(faciltyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(facilityUserMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FacilityUserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the facility user mappings.
	 *
	 * @return the facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facility user mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facility user mappings
	 * @param end the upper bound of the range of facility user mappings (not inclusive)
	 * @return the range of facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the facility user mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facility user mappings
	 * @param end the upper bound of the range of facility user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> findAll(int start, int end,
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

		List<FacilityUserMapping> list = (List<FacilityUserMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FACILITYUSERMAPPING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FACILITYUSERMAPPING;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<FacilityUserMapping>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<FacilityUserMapping>)QueryUtil.list(q,
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
	 * Removes all the facility user mappings where customerId = &#63; from the database.
	 *
	 * @param customerId the customer ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityUserMappingByCustomerId(long customerId)
		throws SystemException {
		for (FacilityUserMapping facilityUserMapping : findByFacilityUserMappingByCustomerId(
				customerId)) {
			remove(facilityUserMapping);
		}
	}

	/**
	 * Removes all the facility user mappings where faciltyId = &#63; from the database.
	 *
	 * @param faciltyId the facilty ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityUserMappingByFacility(long faciltyId)
		throws SystemException {
		for (FacilityUserMapping facilityUserMapping : findByFacilityUserMappingByFacility(
				faciltyId)) {
			remove(facilityUserMapping);
		}
	}

	/**
	 * Removes all the facility user mappings where customerId = &#63; and customerContactId = &#63; from the database.
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityByCustomerContact(long customerId,
		long customerContactId) throws SystemException {
		for (FacilityUserMapping facilityUserMapping : findByFacilityByCustomerContact(
				customerId, customerContactId)) {
			remove(facilityUserMapping);
		}
	}

	/**
	 * Removes all the facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63; from the database.
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param faciltyId the facilty ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFumByFacilityCustomerContact(long customerId,
		long customerContactId, long faciltyId) throws SystemException {
		for (FacilityUserMapping facilityUserMapping : findByFumByFacilityCustomerContact(
				customerId, customerContactId, faciltyId)) {
			remove(facilityUserMapping);
		}
	}

	/**
	 * Removes all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; from the database.
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityByNonPacnetUserId(long customerId,
		long nonPacnetUserId) throws SystemException {
		for (FacilityUserMapping facilityUserMapping : findByFacilityByNonPacnetUserId(
				customerId, nonPacnetUserId)) {
			remove(facilityUserMapping);
		}
	}

	/**
	 * Removes all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63; from the database.
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param faciltyId the facilty ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFacilityByFacilityAndNonPacnetUserId(long customerId,
		long nonPacnetUserId, long faciltyId) throws SystemException {
		for (FacilityUserMapping facilityUserMapping : findByFacilityByFacilityAndNonPacnetUserId(
				customerId, nonPacnetUserId, faciltyId)) {
			remove(facilityUserMapping);
		}
	}

	/**
	 * Removes all the facility user mappings from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (FacilityUserMapping facilityUserMapping : findAll()) {
			remove(facilityUserMapping);
		}
	}

	/**
	 * Returns the number of facility user mappings where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @return the number of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityUserMappingByCustomerId(long customerId)
		throws SystemException {
		Object[] finderArgs = new Object[] { customerId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYUSERMAPPINGBYCUSTOMERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITYUSERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYUSERMAPPINGBYCUSTOMERID_CUSTOMERID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYUSERMAPPINGBYCUSTOMERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility user mappings where faciltyId = &#63;.
	 *
	 * @param faciltyId the facilty ID
	 * @return the number of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityUserMappingByFacility(long faciltyId)
		throws SystemException {
		Object[] finderArgs = new Object[] { faciltyId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYUSERMAPPINGBYFACILITY,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACILITYUSERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYUSERMAPPINGBYFACILITY_FACILTYID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYUSERMAPPINGBYFACILITY,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility user mappings where customerId = &#63; and customerContactId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @return the number of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityByCustomerContact(long customerId,
		long customerContactId) throws SystemException {
		Object[] finderArgs = new Object[] { customerId, customerContactId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYBYCUSTOMERCONTACT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FACILITYUSERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYBYCUSTOMERCONTACT_CUSTOMERID_2);

			query.append(_FINDER_COLUMN_FACILITYBYCUSTOMERCONTACT_CUSTOMERCONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(customerId);

				qPos.add(customerContactId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYBYCUSTOMERCONTACT,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param customerContactId the customer contact ID
	 * @param faciltyId the facilty ID
	 * @return the number of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFumByFacilityCustomerContact(long customerId,
		long customerContactId, long faciltyId) throws SystemException {
		Object[] finderArgs = new Object[] {
				customerId, customerContactId, faciltyId
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FUMBYFACILITYCUSTOMERCONTACT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_FACILITYUSERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FUMBYFACILITYCUSTOMERCONTACT_CUSTOMERID_2);

			query.append(_FINDER_COLUMN_FUMBYFACILITYCUSTOMERCONTACT_CUSTOMERCONTACTID_2);

			query.append(_FINDER_COLUMN_FUMBYFACILITYCUSTOMERCONTACT_FACILTYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(customerId);

				qPos.add(customerContactId);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FUMBYFACILITYCUSTOMERCONTACT,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility user mappings where customerId = &#63; and nonPacnetUserId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @return the number of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityByNonPacnetUserId(long customerId,
		long nonPacnetUserId) throws SystemException {
		Object[] finderArgs = new Object[] { customerId, nonPacnetUserId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYBYNONPACNETUSERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FACILITYUSERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYBYNONPACNETUSERID_CUSTOMERID_2);

			query.append(_FINDER_COLUMN_FACILITYBYNONPACNETUSERID_NONPACNETUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(customerId);

				qPos.add(nonPacnetUserId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYBYNONPACNETUSERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param nonPacnetUserId the non pacnet user ID
	 * @param faciltyId the facilty ID
	 * @return the number of matching facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFacilityByFacilityAndNonPacnetUserId(long customerId,
		long nonPacnetUserId, long faciltyId) throws SystemException {
		Object[] finderArgs = new Object[] {
				customerId, nonPacnetUserId, faciltyId
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FACILITYBYFACILITYANDNONPACNETUSERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_FACILITYUSERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_FACILITYBYFACILITYANDNONPACNETUSERID_CUSTOMERID_2);

			query.append(_FINDER_COLUMN_FACILITYBYFACILITYANDNONPACNETUSERID_NONPACNETUSERID_2);

			query.append(_FINDER_COLUMN_FACILITYBYFACILITYANDNONPACNETUSERID_FACILTYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(customerId);

				qPos.add(nonPacnetUserId);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FACILITYBYFACILITYANDNONPACNETUSERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of facility user mappings.
	 *
	 * @return the number of facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FACILITYUSERMAPPING);

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
	 * Initializes the facility user mapping persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.FacilityUserMapping")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FacilityUserMapping>> listenersList = new ArrayList<ModelListener<FacilityUserMapping>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FacilityUserMapping>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FacilityUserMappingImpl.class.getName());
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
	private static final String _SQL_SELECT_FACILITYUSERMAPPING = "SELECT facilityUserMapping FROM FacilityUserMapping facilityUserMapping";
	private static final String _SQL_SELECT_FACILITYUSERMAPPING_WHERE = "SELECT facilityUserMapping FROM FacilityUserMapping facilityUserMapping WHERE ";
	private static final String _SQL_COUNT_FACILITYUSERMAPPING = "SELECT COUNT(facilityUserMapping) FROM FacilityUserMapping facilityUserMapping";
	private static final String _SQL_COUNT_FACILITYUSERMAPPING_WHERE = "SELECT COUNT(facilityUserMapping) FROM FacilityUserMapping facilityUserMapping WHERE ";
	private static final String _FINDER_COLUMN_FACILITYUSERMAPPINGBYCUSTOMERID_CUSTOMERID_2 =
		"facilityUserMapping.customerId = ?";
	private static final String _FINDER_COLUMN_FACILITYUSERMAPPINGBYFACILITY_FACILTYID_2 =
		"facilityUserMapping.faciltyId = ?";
	private static final String _FINDER_COLUMN_FACILITYBYCUSTOMERCONTACT_CUSTOMERID_2 =
		"facilityUserMapping.customerId = ? AND ";
	private static final String _FINDER_COLUMN_FACILITYBYCUSTOMERCONTACT_CUSTOMERCONTACTID_2 =
		"facilityUserMapping.customerContactId = ?";
	private static final String _FINDER_COLUMN_FUMBYFACILITYCUSTOMERCONTACT_CUSTOMERID_2 =
		"facilityUserMapping.customerId = ? AND ";
	private static final String _FINDER_COLUMN_FUMBYFACILITYCUSTOMERCONTACT_CUSTOMERCONTACTID_2 =
		"facilityUserMapping.customerContactId = ? AND ";
	private static final String _FINDER_COLUMN_FUMBYFACILITYCUSTOMERCONTACT_FACILTYID_2 =
		"facilityUserMapping.faciltyId = ?";
	private static final String _FINDER_COLUMN_FACILITYBYNONPACNETUSERID_CUSTOMERID_2 =
		"facilityUserMapping.customerId = ? AND ";
	private static final String _FINDER_COLUMN_FACILITYBYNONPACNETUSERID_NONPACNETUSERID_2 =
		"facilityUserMapping.nonPacnetUserId = ?";
	private static final String _FINDER_COLUMN_FACILITYBYFACILITYANDNONPACNETUSERID_CUSTOMERID_2 =
		"facilityUserMapping.customerId = ? AND ";
	private static final String _FINDER_COLUMN_FACILITYBYFACILITYANDNONPACNETUSERID_NONPACNETUSERID_2 =
		"facilityUserMapping.nonPacnetUserId = ? AND ";
	private static final String _FINDER_COLUMN_FACILITYBYFACILITYANDNONPACNETUSERID_FACILTYID_2 =
		"facilityUserMapping.faciltyId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "facilityUserMapping.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FacilityUserMapping exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FacilityUserMapping exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FacilityUserMappingPersistenceImpl.class);
	private static FacilityUserMapping _nullFacilityUserMapping = new FacilityUserMappingImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FacilityUserMapping> toCacheModel() {
				return _nullFacilityUserMappingCacheModel;
			}
		};

	private static CacheModel<FacilityUserMapping> _nullFacilityUserMappingCacheModel =
		new CacheModel<FacilityUserMapping>() {
			public FacilityUserMapping toEntityModel() {
				return _nullFacilityUserMapping;
			}
		};
}