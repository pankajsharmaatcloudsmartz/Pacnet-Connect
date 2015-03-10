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

import com.pacnet.connect.NoSuchSMARadacctException;
import com.pacnet.connect.model.SMARadacct;
import com.pacnet.connect.model.impl.SMARadacctImpl;
import com.pacnet.connect.model.impl.SMARadacctModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the s m a radacct service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMARadacctPersistence
 * @see SMARadacctUtil
 * @generated
 */
public class SMARadacctPersistenceImpl extends BasePersistenceImpl<SMARadacct>
	implements SMARadacctPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SMARadacctUtil} to access the s m a radacct persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SMARadacctImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAACTIVITYLISTBYRADCHECKID =
		new FinderPath(SMARadacctModelImpl.ENTITY_CACHE_ENABLED,
			SMARadacctModelImpl.FINDER_CACHE_ENABLED, SMARadacctImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySMAActivityListByRadcheckId",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAACTIVITYLISTBYRADCHECKID =
		new FinderPath(SMARadacctModelImpl.ENTITY_CACHE_ENABLED,
			SMARadacctModelImpl.FINDER_CACHE_ENABLED, SMARadacctImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySMAActivityListByRadcheckId",
			new String[] { Integer.class.getName(), Long.class.getName() },
			SMARadacctModelImpl.ISACTIVE_COLUMN_BITMASK |
			SMARadacctModelImpl.RADCHECKID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SMAACTIVITYLISTBYRADCHECKID =
		new FinderPath(SMARadacctModelImpl.ENTITY_CACHE_ENABLED,
			SMARadacctModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySMAActivityListByRadcheckId",
			new String[] { Integer.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SMARadacctModelImpl.ENTITY_CACHE_ENABLED,
			SMARadacctModelImpl.FINDER_CACHE_ENABLED, SMARadacctImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SMARadacctModelImpl.ENTITY_CACHE_ENABLED,
			SMARadacctModelImpl.FINDER_CACHE_ENABLED, SMARadacctImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SMARadacctModelImpl.ENTITY_CACHE_ENABLED,
			SMARadacctModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the s m a radacct in the entity cache if it is enabled.
	 *
	 * @param smaRadacct the s m a radacct
	 */
	public void cacheResult(SMARadacct smaRadacct) {
		EntityCacheUtil.putResult(SMARadacctModelImpl.ENTITY_CACHE_ENABLED,
			SMARadacctImpl.class, smaRadacct.getPrimaryKey(), smaRadacct);

		smaRadacct.resetOriginalValues();
	}

	/**
	 * Caches the s m a radaccts in the entity cache if it is enabled.
	 *
	 * @param smaRadaccts the s m a radaccts
	 */
	public void cacheResult(List<SMARadacct> smaRadaccts) {
		for (SMARadacct smaRadacct : smaRadaccts) {
			if (EntityCacheUtil.getResult(
						SMARadacctModelImpl.ENTITY_CACHE_ENABLED,
						SMARadacctImpl.class, smaRadacct.getPrimaryKey()) == null) {
				cacheResult(smaRadacct);
			}
			else {
				smaRadacct.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all s m a radaccts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SMARadacctImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SMARadacctImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the s m a radacct.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SMARadacct smaRadacct) {
		EntityCacheUtil.removeResult(SMARadacctModelImpl.ENTITY_CACHE_ENABLED,
			SMARadacctImpl.class, smaRadacct.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SMARadacct> smaRadaccts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SMARadacct smaRadacct : smaRadaccts) {
			EntityCacheUtil.removeResult(SMARadacctModelImpl.ENTITY_CACHE_ENABLED,
				SMARadacctImpl.class, smaRadacct.getPrimaryKey());
		}
	}

	/**
	 * Creates a new s m a radacct with the primary key. Does not add the s m a radacct to the database.
	 *
	 * @param radAcctId the primary key for the new s m a radacct
	 * @return the new s m a radacct
	 */
	public SMARadacct create(long radAcctId) {
		SMARadacct smaRadacct = new SMARadacctImpl();

		smaRadacct.setNew(true);
		smaRadacct.setPrimaryKey(radAcctId);

		return smaRadacct;
	}

	/**
	 * Removes the s m a radacct with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radAcctId the primary key of the s m a radacct
	 * @return the s m a radacct that was removed
	 * @throws com.pacnet.connect.NoSuchSMARadacctException if a s m a radacct with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadacct remove(long radAcctId)
		throws NoSuchSMARadacctException, SystemException {
		return remove(Long.valueOf(radAcctId));
	}

	/**
	 * Removes the s m a radacct with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the s m a radacct
	 * @return the s m a radacct that was removed
	 * @throws com.pacnet.connect.NoSuchSMARadacctException if a s m a radacct with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMARadacct remove(Serializable primaryKey)
		throws NoSuchSMARadacctException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SMARadacct smaRadacct = (SMARadacct)session.get(SMARadacctImpl.class,
					primaryKey);

			if (smaRadacct == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSMARadacctException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(smaRadacct);
		}
		catch (NoSuchSMARadacctException nsee) {
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
	protected SMARadacct removeImpl(SMARadacct smaRadacct)
		throws SystemException {
		smaRadacct = toUnwrappedModel(smaRadacct);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, smaRadacct);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(smaRadacct);

		return smaRadacct;
	}

	@Override
	public SMARadacct updateImpl(
		com.pacnet.connect.model.SMARadacct smaRadacct, boolean merge)
		throws SystemException {
		smaRadacct = toUnwrappedModel(smaRadacct);

		boolean isNew = smaRadacct.isNew();

		SMARadacctModelImpl smaRadacctModelImpl = (SMARadacctModelImpl)smaRadacct;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, smaRadacct, merge);

			smaRadacct.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SMARadacctModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((smaRadacctModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAACTIVITYLISTBYRADCHECKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(smaRadacctModelImpl.getOriginalIsActive()),
						Long.valueOf(smaRadacctModelImpl.getOriginalRadcheckId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAACTIVITYLISTBYRADCHECKID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAACTIVITYLISTBYRADCHECKID,
					args);

				args = new Object[] {
						Integer.valueOf(smaRadacctModelImpl.getIsActive()),
						Long.valueOf(smaRadacctModelImpl.getRadcheckId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SMAACTIVITYLISTBYRADCHECKID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAACTIVITYLISTBYRADCHECKID,
					args);
			}
		}

		EntityCacheUtil.putResult(SMARadacctModelImpl.ENTITY_CACHE_ENABLED,
			SMARadacctImpl.class, smaRadacct.getPrimaryKey(), smaRadacct);

		return smaRadacct;
	}

	protected SMARadacct toUnwrappedModel(SMARadacct smaRadacct) {
		if (smaRadacct instanceof SMARadacctImpl) {
			return smaRadacct;
		}

		SMARadacctImpl smaRadacctImpl = new SMARadacctImpl();

		smaRadacctImpl.setNew(smaRadacct.isNew());
		smaRadacctImpl.setPrimaryKey(smaRadacct.getPrimaryKey());

		smaRadacctImpl.setRadAcctId(smaRadacct.getRadAcctId());
		smaRadacctImpl.setRadcheckId(smaRadacct.getRadcheckId());
		smaRadacctImpl.setAcctSessionId(smaRadacct.getAcctSessionId());
		smaRadacctImpl.setRealm(smaRadacct.getRealm());
		smaRadacctImpl.setAcctStartTime(smaRadacct.getAcctStartTime());
		smaRadacctImpl.setAcctStopTime(smaRadacct.getAcctStopTime());
		smaRadacctImpl.setAcctSessionTime(smaRadacct.getAcctSessionTime());
		smaRadacctImpl.setAcctterminateCause(smaRadacct.getAcctterminateCause());
		smaRadacctImpl.setIsActive(smaRadacct.getIsActive());
		smaRadacctImpl.setCreatedOn(smaRadacct.getCreatedOn());
		smaRadacctImpl.setCreatedBy(smaRadacct.getCreatedBy());
		smaRadacctImpl.setUpdatedOn(smaRadacct.getUpdatedOn());
		smaRadacctImpl.setUpdatedBy(smaRadacct.getUpdatedBy());

		return smaRadacctImpl;
	}

	/**
	 * Returns the s m a radacct with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the s m a radacct
	 * @return the s m a radacct
	 * @throws com.liferay.portal.NoSuchModelException if a s m a radacct with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMARadacct findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the s m a radacct with the primary key or throws a {@link com.pacnet.connect.NoSuchSMARadacctException} if it could not be found.
	 *
	 * @param radAcctId the primary key of the s m a radacct
	 * @return the s m a radacct
	 * @throws com.pacnet.connect.NoSuchSMARadacctException if a s m a radacct with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadacct findByPrimaryKey(long radAcctId)
		throws NoSuchSMARadacctException, SystemException {
		SMARadacct smaRadacct = fetchByPrimaryKey(radAcctId);

		if (smaRadacct == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + radAcctId);
			}

			throw new NoSuchSMARadacctException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				radAcctId);
		}

		return smaRadacct;
	}

	/**
	 * Returns the s m a radacct with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the s m a radacct
	 * @return the s m a radacct, or <code>null</code> if a s m a radacct with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SMARadacct fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the s m a radacct with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radAcctId the primary key of the s m a radacct
	 * @return the s m a radacct, or <code>null</code> if a s m a radacct with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadacct fetchByPrimaryKey(long radAcctId)
		throws SystemException {
		SMARadacct smaRadacct = (SMARadacct)EntityCacheUtil.getResult(SMARadacctModelImpl.ENTITY_CACHE_ENABLED,
				SMARadacctImpl.class, radAcctId);

		if (smaRadacct == _nullSMARadacct) {
			return null;
		}

		if (smaRadacct == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				smaRadacct = (SMARadacct)session.get(SMARadacctImpl.class,
						Long.valueOf(radAcctId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (smaRadacct != null) {
					cacheResult(smaRadacct);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(SMARadacctModelImpl.ENTITY_CACHE_ENABLED,
						SMARadacctImpl.class, radAcctId, _nullSMARadacct);
				}

				closeSession(session);
			}
		}

		return smaRadacct;
	}

	/**
	 * Returns all the s m a radaccts where isActive = &#63; and radcheckId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @return the matching s m a radaccts
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadacct> findBySMAActivityListByRadcheckId(int isActive,
		long radcheckId) throws SystemException {
		return findBySMAActivityListByRadcheckId(isActive, radcheckId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a radaccts where isActive = &#63; and radcheckId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param start the lower bound of the range of s m a radaccts
	 * @param end the upper bound of the range of s m a radaccts (not inclusive)
	 * @return the range of matching s m a radaccts
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadacct> findBySMAActivityListByRadcheckId(int isActive,
		long radcheckId, int start, int end) throws SystemException {
		return findBySMAActivityListByRadcheckId(isActive, radcheckId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the s m a radaccts where isActive = &#63; and radcheckId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param start the lower bound of the range of s m a radaccts
	 * @param end the upper bound of the range of s m a radaccts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching s m a radaccts
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadacct> findBySMAActivityListByRadcheckId(int isActive,
		long radcheckId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SMAACTIVITYLISTBYRADCHECKID;
			finderArgs = new Object[] { isActive, radcheckId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SMAACTIVITYLISTBYRADCHECKID;
			finderArgs = new Object[] {
					isActive, radcheckId,
					
					start, end, orderByComparator
				};
		}

		List<SMARadacct> list = (List<SMARadacct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SMARadacct smaRadacct : list) {
				if ((isActive != smaRadacct.getIsActive()) ||
						(radcheckId != smaRadacct.getRadcheckId())) {
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

			query.append(_SQL_SELECT_SMARADACCT_WHERE);

			query.append(_FINDER_COLUMN_SMAACTIVITYLISTBYRADCHECKID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAACTIVITYLISTBYRADCHECKID_RADCHECKID_2);

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

				qPos.add(radcheckId);

				list = (List<SMARadacct>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first s m a radacct in the ordered set where isActive = &#63; and radcheckId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a radacct
	 * @throws com.pacnet.connect.NoSuchSMARadacctException if a matching s m a radacct could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadacct findBySMAActivityListByRadcheckId_First(int isActive,
		long radcheckId, OrderByComparator orderByComparator)
		throws NoSuchSMARadacctException, SystemException {
		SMARadacct smaRadacct = fetchBySMAActivityListByRadcheckId_First(isActive,
				radcheckId, orderByComparator);

		if (smaRadacct != null) {
			return smaRadacct;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", radcheckId=");
		msg.append(radcheckId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMARadacctException(msg.toString());
	}

	/**
	 * Returns the first s m a radacct in the ordered set where isActive = &#63; and radcheckId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching s m a radacct, or <code>null</code> if a matching s m a radacct could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadacct fetchBySMAActivityListByRadcheckId_First(int isActive,
		long radcheckId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SMARadacct> list = findBySMAActivityListByRadcheckId(isActive,
				radcheckId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last s m a radacct in the ordered set where isActive = &#63; and radcheckId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a radacct
	 * @throws com.pacnet.connect.NoSuchSMARadacctException if a matching s m a radacct could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadacct findBySMAActivityListByRadcheckId_Last(int isActive,
		long radcheckId, OrderByComparator orderByComparator)
		throws NoSuchSMARadacctException, SystemException {
		SMARadacct smaRadacct = fetchBySMAActivityListByRadcheckId_Last(isActive,
				radcheckId, orderByComparator);

		if (smaRadacct != null) {
			return smaRadacct;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActive=");
		msg.append(isActive);

		msg.append(", radcheckId=");
		msg.append(radcheckId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSMARadacctException(msg.toString());
	}

	/**
	 * Returns the last s m a radacct in the ordered set where isActive = &#63; and radcheckId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching s m a radacct, or <code>null</code> if a matching s m a radacct could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadacct fetchBySMAActivityListByRadcheckId_Last(int isActive,
		long radcheckId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySMAActivityListByRadcheckId(isActive, radcheckId);

		List<SMARadacct> list = findBySMAActivityListByRadcheckId(isActive,
				radcheckId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the s m a radaccts before and after the current s m a radacct in the ordered set where isActive = &#63; and radcheckId = &#63;.
	 *
	 * @param radAcctId the primary key of the current s m a radacct
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next s m a radacct
	 * @throws com.pacnet.connect.NoSuchSMARadacctException if a s m a radacct with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SMARadacct[] findBySMAActivityListByRadcheckId_PrevAndNext(
		long radAcctId, int isActive, long radcheckId,
		OrderByComparator orderByComparator)
		throws NoSuchSMARadacctException, SystemException {
		SMARadacct smaRadacct = findByPrimaryKey(radAcctId);

		Session session = null;

		try {
			session = openSession();

			SMARadacct[] array = new SMARadacctImpl[3];

			array[0] = getBySMAActivityListByRadcheckId_PrevAndNext(session,
					smaRadacct, isActive, radcheckId, orderByComparator, true);

			array[1] = smaRadacct;

			array[2] = getBySMAActivityListByRadcheckId_PrevAndNext(session,
					smaRadacct, isActive, radcheckId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SMARadacct getBySMAActivityListByRadcheckId_PrevAndNext(
		Session session, SMARadacct smaRadacct, int isActive, long radcheckId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SMARADACCT_WHERE);

		query.append(_FINDER_COLUMN_SMAACTIVITYLISTBYRADCHECKID_ISACTIVE_2);

		query.append(_FINDER_COLUMN_SMAACTIVITYLISTBYRADCHECKID_RADCHECKID_2);

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

		qPos.add(radcheckId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(smaRadacct);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SMARadacct> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the s m a radaccts.
	 *
	 * @return the s m a radaccts
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadacct> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s m a radaccts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s m a radaccts
	 * @param end the upper bound of the range of s m a radaccts (not inclusive)
	 * @return the range of s m a radaccts
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadacct> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the s m a radaccts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s m a radaccts
	 * @param end the upper bound of the range of s m a radaccts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of s m a radaccts
	 * @throws SystemException if a system exception occurred
	 */
	public List<SMARadacct> findAll(int start, int end,
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

		List<SMARadacct> list = (List<SMARadacct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SMARADACCT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SMARADACCT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<SMARadacct>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<SMARadacct>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the s m a radaccts where isActive = &#63; and radcheckId = &#63; from the database.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySMAActivityListByRadcheckId(int isActive,
		long radcheckId) throws SystemException {
		for (SMARadacct smaRadacct : findBySMAActivityListByRadcheckId(
				isActive, radcheckId)) {
			remove(smaRadacct);
		}
	}

	/**
	 * Removes all the s m a radaccts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (SMARadacct smaRadacct : findAll()) {
			remove(smaRadacct);
		}
	}

	/**
	 * Returns the number of s m a radaccts where isActive = &#63; and radcheckId = &#63;.
	 *
	 * @param isActive the is active
	 * @param radcheckId the radcheck ID
	 * @return the number of matching s m a radaccts
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySMAActivityListByRadcheckId(int isActive, long radcheckId)
		throws SystemException {
		Object[] finderArgs = new Object[] { isActive, radcheckId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SMAACTIVITYLISTBYRADCHECKID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SMARADACCT_WHERE);

			query.append(_FINDER_COLUMN_SMAACTIVITYLISTBYRADCHECKID_ISACTIVE_2);

			query.append(_FINDER_COLUMN_SMAACTIVITYLISTBYRADCHECKID_RADCHECKID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActive);

				qPos.add(radcheckId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SMAACTIVITYLISTBYRADCHECKID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of s m a radaccts.
	 *
	 * @return the number of s m a radaccts
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SMARADACCT);

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
	 * Initializes the s m a radacct persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.pacnet.connect.model.SMARadacct")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SMARadacct>> listenersList = new ArrayList<ModelListener<SMARadacct>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SMARadacct>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SMARadacctImpl.class.getName());
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
	private static final String _SQL_SELECT_SMARADACCT = "SELECT smaRadacct FROM SMARadacct smaRadacct";
	private static final String _SQL_SELECT_SMARADACCT_WHERE = "SELECT smaRadacct FROM SMARadacct smaRadacct WHERE ";
	private static final String _SQL_COUNT_SMARADACCT = "SELECT COUNT(smaRadacct) FROM SMARadacct smaRadacct";
	private static final String _SQL_COUNT_SMARADACCT_WHERE = "SELECT COUNT(smaRadacct) FROM SMARadacct smaRadacct WHERE ";
	private static final String _FINDER_COLUMN_SMAACTIVITYLISTBYRADCHECKID_ISACTIVE_2 =
		"smaRadacct.isActive = ? AND ";
	private static final String _FINDER_COLUMN_SMAACTIVITYLISTBYRADCHECKID_RADCHECKID_2 =
		"smaRadacct.radcheckId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "smaRadacct.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SMARadacct exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SMARadacct exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SMARadacctPersistenceImpl.class);
	private static SMARadacct _nullSMARadacct = new SMARadacctImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SMARadacct> toCacheModel() {
				return _nullSMARadacctCacheModel;
			}
		};

	private static CacheModel<SMARadacct> _nullSMARadacctCacheModel = new CacheModel<SMARadacct>() {
			public SMARadacct toEntityModel() {
				return _nullSMARadacct;
			}
		};
}