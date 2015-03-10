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

package com.pacnet.connect.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;
import com.pacnet.connect.model.SMARadacct;
import com.pacnet.connect.service.base.SMARadacctLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.SMARadacctUtil;

/**
 * The implementation of the s m a radacct local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.pacnet.connect.service.SMARadacctLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.SMARadacctLocalServiceBaseImpl
 * @see com.pacnet.connect.service.SMARadacctLocalServiceUtil
 */
public class SMARadacctLocalServiceImpl extends SMARadacctLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.pacnet.connect.service.SMARadacctLocalServiceUtil} to access the s m
	 * a radacct local service.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public void clearCache() {
		SMARadacctUtil.clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public void clearCache(SMARadacct smaRadacct) {
		SMARadacctUtil.clearCache(smaRadacct);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public List<SMARadacct> findWithDynamicQuery(DynamicQuery dynamicQuery)
			throws SystemException {
		return SMARadacctUtil.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	 *      int, int)
	 */
	public List<SMARadacct> findWithDynamicQuery(DynamicQuery dynamicQuery,
			int start, int end) throws SystemException {
		return SMARadacctUtil.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	 *      int, int, OrderByComparator)
	 */
	public List<SMARadacct> findWithDynamicQuery(DynamicQuery dynamicQuery,
			int start, int end, OrderByComparator orderByComparator)
			throws SystemException {
		return SMARadacctUtil.findWithDynamicQuery(dynamicQuery, start, end,
				orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	 *      boolean)
	 */
	public SMARadacct update(SMARadacct smaRadacct, boolean merge)
			throws SystemException {
		return SMARadacctUtil.update(smaRadacct, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	 *      boolean, ServiceContext)
	 */
	public SMARadacct update(SMARadacct smaRadacct, boolean merge,
			ServiceContext serviceContext) throws SystemException {
		return SMARadacctUtil.update(smaRadacct, merge, serviceContext);
	}

	/**
	 * Caches the s m a radacct in the entity cache if it is enabled.
	 * 
	 * @param smaRadacct
	 *            the s m a radacct
	 */
	public void cacheResult(com.pacnet.connect.model.SMARadacct smaRadacct) {
		SMARadacctUtil.cacheResult(smaRadacct);
	}

	/**
	 * Caches the s m a radaccts in the entity cache if it is enabled.
	 * 
	 * @param smaRadaccts
	 *            the s m a radaccts
	 */
	public void cacheResult(
			java.util.List<com.pacnet.connect.model.SMARadacct> smaRadaccts) {
		SMARadacctUtil.cacheResult(smaRadaccts);
	}

	/**
	 * Creates a new s m a radacct with the primary key. Does not add the s m a
	 * radacct to the database.
	 * 
	 * @param radAcctId
	 *            the primary key for the new s m a radacct
	 * @return the new s m a radacct
	 */
	public com.pacnet.connect.model.SMARadacct create(long radAcctId) {
		return SMARadacctUtil.create(radAcctId);
	}

	/**
	 * Removes the s m a radacct with the primary key from the database. Also
	 * notifies the appropriate model listeners.
	 * 
	 * @param radAcctId
	 *            the primary key of the s m a radacct
	 * @return the s m a radacct that was removed
	 * @throws com.pacnet.connect.NoSuchSMARadacctException
	 *             if a s m a radacct with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadacct remove(long radAcctId)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadacctException {
		return SMARadacctUtil.remove(radAcctId);
	}

	public com.pacnet.connect.model.SMARadacct updateImpl(
			com.pacnet.connect.model.SMARadacct smaRadacct, boolean merge)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadacctUtil.updateImpl(smaRadacct, merge);
	}

	/**
	 * Returns the s m a radacct with the primary key or throws a
	 * {@link com.pacnet.connect.NoSuchSMARadacctException} if it could not be
	 * found.
	 * 
	 * @param radAcctId
	 *            the primary key of the s m a radacct
	 * @return the s m a radacct
	 * @throws com.pacnet.connect.NoSuchSMARadacctException
	 *             if a s m a radacct with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadacct findByPrimaryKey(long radAcctId)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadacctException {
		return SMARadacctUtil.findByPrimaryKey(radAcctId);
	}

	/**
	 * Returns the s m a radacct with the primary key or returns
	 * <code>null</code> if it could not be found.
	 * 
	 * @param radAcctId
	 *            the primary key of the s m a radacct
	 * @return the s m a radacct, or <code>null</code> if a s m a radacct with
	 *         the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadacct fetchByPrimaryKey(long radAcctId)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadacctUtil.fetchByPrimaryKey(radAcctId);
	}

	/**
	 * Returns all the s m a radaccts where isActive = &#63; and radcheckId =
	 * &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param radcheckId
	 *            the radcheck ID
	 * @return the matching s m a radaccts
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMARadacct> findBySMAActivityListByRadcheckId(
			int isActive, long radcheckId)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadacctUtil.findBySMAActivityListByRadcheckId(isActive,
				radcheckId);
	}

	/**
	 * Returns a range of all the s m a radaccts where isActive = &#63; and
	 * radcheckId = &#63;.
	 * 
	 * <p>
	 * Useful when paginating results. Returns a maximum of
	 * <code>end - start</code> instances. <code>start</code> and
	 * <code>end</code> are not primary keys, they are indexes in the result
	 * set. Thus, <code>0</code> refers to the first result in the set. Setting
	 * both <code>start</code> and <code>end</code> to
	 * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	 * the full result set.
	 * </p>
	 * 
	 * @param isActive
	 *            the is active
	 * @param radcheckId
	 *            the radcheck ID
	 * @param start
	 *            the lower bound of the range of s m a radaccts
	 * @param end
	 *            the upper bound of the range of s m a radaccts (not inclusive)
	 * @return the range of matching s m a radaccts
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMARadacct> findBySMAActivityListByRadcheckId(
			int isActive, long radcheckId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadacctUtil.findBySMAActivityListByRadcheckId(isActive,
				radcheckId, start, end);
	}

	/**
	 * Returns an ordered range of all the s m a radaccts where isActive = &#63;
	 * and radcheckId = &#63;.
	 * 
	 * <p>
	 * Useful when paginating results. Returns a maximum of
	 * <code>end - start</code> instances. <code>start</code> and
	 * <code>end</code> are not primary keys, they are indexes in the result
	 * set. Thus, <code>0</code> refers to the first result in the set. Setting
	 * both <code>start</code> and <code>end</code> to
	 * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	 * the full result set.
	 * </p>
	 * 
	 * @param isActive
	 *            the is active
	 * @param radcheckId
	 *            the radcheck ID
	 * @param start
	 *            the lower bound of the range of s m a radaccts
	 * @param end
	 *            the upper bound of the range of s m a radaccts (not inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of matching s m a radaccts
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMARadacct> findBySMAActivityListByRadcheckId(
			int isActive, long radcheckId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadacctUtil.findBySMAActivityListByRadcheckId(isActive,
				radcheckId, start, end, orderByComparator);
	}

	/**
	 * Returns the first s m a radacct in the ordered set where isActive = &#63;
	 * and radcheckId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param radcheckId
	 *            the radcheck ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a radacct
	 * @throws com.pacnet.connect.NoSuchSMARadacctException
	 *             if a matching s m a radacct could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadacct findBySMAActivityListByRadcheckId_First(
			int isActive, long radcheckId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadacctException {
		return SMARadacctUtil.findBySMAActivityListByRadcheckId_First(isActive,
				radcheckId, orderByComparator);
	}

	/**
	 * Returns the first s m a radacct in the ordered set where isActive = &#63;
	 * and radcheckId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param radcheckId
	 *            the radcheck ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a radacct, or <code>null</code> if a
	 *         matching s m a radacct could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadacct fetchBySMAActivityListByRadcheckId_First(
			int isActive, long radcheckId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadacctUtil.fetchBySMAActivityListByRadcheckId_First(
				isActive, radcheckId, orderByComparator);
	}

	/**
	 * Returns the last s m a radacct in the ordered set where isActive = &#63;
	 * and radcheckId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param radcheckId
	 *            the radcheck ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a radacct
	 * @throws com.pacnet.connect.NoSuchSMARadacctException
	 *             if a matching s m a radacct could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadacct findBySMAActivityListByRadcheckId_Last(
			int isActive, long radcheckId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadacctException {
		return SMARadacctUtil.findBySMAActivityListByRadcheckId_Last(isActive,
				radcheckId, orderByComparator);
	}

	/**
	 * Returns the last s m a radacct in the ordered set where isActive = &#63;
	 * and radcheckId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param radcheckId
	 *            the radcheck ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a radacct, or <code>null</code> if a
	 *         matching s m a radacct could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadacct fetchBySMAActivityListByRadcheckId_Last(
			int isActive, long radcheckId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadacctUtil.fetchBySMAActivityListByRadcheckId_Last(isActive,
				radcheckId, orderByComparator);
	}

	/**
	 * Returns the s m a radaccts before and after the current s m a radacct in
	 * the ordered set where isActive = &#63; and radcheckId = &#63;.
	 * 
	 * @param radAcctId
	 *            the primary key of the current s m a radacct
	 * @param isActive
	 *            the is active
	 * @param radcheckId
	 *            the radcheck ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the previous, current, and next s m a radacct
	 * @throws com.pacnet.connect.NoSuchSMARadacctException
	 *             if a s m a radacct with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadacct[] findBySMAActivityListByRadcheckId_PrevAndNext(
			long radAcctId, int isActive, long radcheckId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadacctException {
		return SMARadacctUtil.findBySMAActivityListByRadcheckId_PrevAndNext(
				radAcctId, isActive, radcheckId, orderByComparator);
	}

	/**
	 * Returns all the s m a radaccts.
	 * 
	 * @return the s m a radaccts
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMARadacct> findAll()
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadacctUtil.findAll();
	}

	/**
	 * Returns a range of all the s m a radaccts.
	 * 
	 * <p>
	 * Useful when paginating results. Returns a maximum of
	 * <code>end - start</code> instances. <code>start</code> and
	 * <code>end</code> are not primary keys, they are indexes in the result
	 * set. Thus, <code>0</code> refers to the first result in the set. Setting
	 * both <code>start</code> and <code>end</code> to
	 * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	 * the full result set.
	 * </p>
	 * 
	 * @param start
	 *            the lower bound of the range of s m a radaccts
	 * @param end
	 *            the upper bound of the range of s m a radaccts (not inclusive)
	 * @return the range of s m a radaccts
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMARadacct> findAll(
			int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadacctUtil.findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the s m a radaccts.
	 * 
	 * <p>
	 * Useful when paginating results. Returns a maximum of
	 * <code>end - start</code> instances. <code>start</code> and
	 * <code>end</code> are not primary keys, they are indexes in the result
	 * set. Thus, <code>0</code> refers to the first result in the set. Setting
	 * both <code>start</code> and <code>end</code> to
	 * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	 * the full result set.
	 * </p>
	 * 
	 * @param start
	 *            the lower bound of the range of s m a radaccts
	 * @param end
	 *            the upper bound of the range of s m a radaccts (not inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of s m a radaccts
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMARadacct> findAll(
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadacctUtil.findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the s m a radaccts where isActive = &#63; and radcheckId =
	 * &#63; from the database.
	 * 
	 * @param isActive
	 *            the is active
	 * @param radcheckId
	 *            the radcheck ID
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public void removeBySMAActivityListByRadcheckId(int isActive,
			long radcheckId)
			throws com.liferay.portal.kernel.exception.SystemException {
		SMARadacctUtil
				.removeBySMAActivityListByRadcheckId(isActive, radcheckId);
	}

	/**
	 * Removes all the s m a radaccts from the database.
	 * 
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public void removeAll()
			throws com.liferay.portal.kernel.exception.SystemException {
		SMARadacctUtil.removeAll();
	}

	/**
	 * Returns the number of s m a radaccts where isActive = &#63; and
	 * radcheckId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param radcheckId
	 *            the radcheck ID
	 * @return the number of matching s m a radaccts
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countBySMAActivityListByRadcheckId(int isActive, long radcheckId)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadacctUtil.countBySMAActivityListByRadcheckId(isActive,
				radcheckId);
	}

	/**
	 * Returns the number of s m a radaccts.
	 * 
	 * @return the number of s m a radaccts
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countAll()
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadacctUtil.countAll();
	}
}