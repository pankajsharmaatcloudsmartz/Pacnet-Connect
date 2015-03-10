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
import com.pacnet.connect.model.SMACompanyList;
import com.pacnet.connect.service.base.SMACompanyListLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.SMACompanyListUtil;

/**
 * The implementation of the s m a company list local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.pacnet.connect.service.SMACompanyListLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.SMACompanyListLocalServiceBaseImpl
 * @see com.pacnet.connect.service.SMACompanyListLocalServiceUtil
 */
public class SMACompanyListLocalServiceImpl extends
		SMACompanyListLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.pacnet.connect.service.SMACompanyListLocalServiceUtil} to access the
	 * s m a company list local service.
	 */
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public void clearCache() {
		SMACompanyListUtil.clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public void clearCache(SMACompanyList smaCompanyList) {
		SMACompanyListUtil.clearCache(smaCompanyList);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public List<SMACompanyList> findWithDynamicQuery(DynamicQuery dynamicQuery)
			throws SystemException {
		return SMACompanyListUtil.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	 *      int, int)
	 */
	public List<SMACompanyList> findWithDynamicQuery(DynamicQuery dynamicQuery,
			int start, int end) throws SystemException {
		return SMACompanyListUtil
				.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	 *      int, int, OrderByComparator)
	 */
	public List<SMACompanyList> findWithDynamicQuery(DynamicQuery dynamicQuery,
			int start, int end, OrderByComparator orderByComparator)
			throws SystemException {
		return SMACompanyListUtil.findWithDynamicQuery(dynamicQuery, start,
				end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	 *      boolean)
	 */
	public SMACompanyList update(SMACompanyList smaCompanyList, boolean merge)
			throws SystemException {
		return SMACompanyListUtil.update(smaCompanyList, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	 *      boolean, ServiceContext)
	 */
	public SMACompanyList update(SMACompanyList smaCompanyList, boolean merge,
			ServiceContext serviceContext) throws SystemException {
		return SMACompanyListUtil.update(smaCompanyList, merge, serviceContext);
	}

	/**
	 * Caches the s m a company list in the entity cache if it is enabled.
	 * 
	 * @param smaCompanyList
	 *            the s m a company list
	 */
	public void cacheResult(
			com.pacnet.connect.model.SMACompanyList smaCompanyList) {
		SMACompanyListUtil.cacheResult(smaCompanyList);
	}

	/**
	 * Caches the s m a company lists in the entity cache if it is enabled.
	 * 
	 * @param smaCompanyLists
	 *            the s m a company lists
	 */
	public void cacheResult(
			java.util.List<com.pacnet.connect.model.SMACompanyList> smaCompanyLists) {
		SMACompanyListUtil.cacheResult(smaCompanyLists);
	}

	/**
	 * Creates a new s m a company list with the primary key. Does not add the s
	 * m a company list to the database.
	 * 
	 * @param id
	 *            the primary key for the new s m a company list
	 * @return the new s m a company list
	 */
	public com.pacnet.connect.model.SMACompanyList create(java.lang.String id) {
		return SMACompanyListUtil.create(id);
	}

	/**
	 * Removes the s m a company list with the primary key from the database.
	 * Also notifies the appropriate model listeners.
	 * 
	 * @param id
	 *            the primary key of the s m a company list
	 * @return the s m a company list that was removed
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException
	 *             if a s m a company list with the primary key could not be
	 *             found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList remove(java.lang.String id)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return SMACompanyListUtil.remove(id);
	}

	public com.pacnet.connect.model.SMACompanyList updateImpl(
			com.pacnet.connect.model.SMACompanyList smaCompanyList,
			boolean merge)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.updateImpl(smaCompanyList, merge);
	}

	/**
	 * Returns the s m a company list with the primary key or throws a
	 * {@link com.pacnet.connect.NoSuchSMACompanyListException} if it could not
	 * be found.
	 * 
	 * @param id
	 *            the primary key of the s m a company list
	 * @return the s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException
	 *             if a s m a company list with the primary key could not be
	 *             found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList findByPrimaryKey(
			java.lang.String id)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return SMACompanyListUtil.findByPrimaryKey(id);
	}

	/**
	 * Returns the s m a company list with the primary key or returns
	 * <code>null</code> if it could not be found.
	 * 
	 * @param id
	 *            the primary key of the s m a company list
	 * @return the s m a company list, or <code>null</code> if a s m a company
	 *         list with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList fetchByPrimaryKey(
			java.lang.String id)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the s m a company lists where adminUserId = &#63;.
	 * 
	 * @param adminUserId
	 *            the admin user ID
	 * @return the matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByAdminUserId(
			long adminUserId)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil
				.findBySMACompanyListByAdminUserId(adminUserId);
	}

	/**
	 * Returns a range of all the s m a company lists where adminUserId = &#63;.
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
	 * @param adminUserId
	 *            the admin user ID
	 * @param start
	 *            the lower bound of the range of s m a company lists
	 * @param end
	 *            the upper bound of the range of s m a company lists (not
	 *            inclusive)
	 * @return the range of matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByAdminUserId(
			long adminUserId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.findBySMACompanyListByAdminUserId(
				adminUserId, start, end);
	}

	/**
	 * Returns an ordered range of all the s m a company lists where adminUserId
	 * = &#63;.
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
	 * @param adminUserId
	 *            the admin user ID
	 * @param start
	 *            the lower bound of the range of s m a company lists
	 * @param end
	 *            the upper bound of the range of s m a company lists (not
	 *            inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByAdminUserId(
			long adminUserId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.findBySMACompanyListByAdminUserId(
				adminUserId, start, end, orderByComparator);
	}

	/**
	 * Returns the first s m a company list in the ordered set where adminUserId
	 * = &#63;.
	 * 
	 * @param adminUserId
	 *            the admin user ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException
	 *             if a matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByAdminUserId_First(
			long adminUserId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return SMACompanyListUtil.findBySMACompanyListByAdminUserId_First(
				adminUserId, orderByComparator);
	}

	/**
	 * Returns the first s m a company list in the ordered set where adminUserId
	 * = &#63;.
	 * 
	 * @param adminUserId
	 *            the admin user ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a company list, or <code>null</code> if a
	 *         matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByAdminUserId_First(
			long adminUserId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.fetchBySMACompanyListByAdminUserId_First(
				adminUserId, orderByComparator);
	}

	/**
	 * Returns the last s m a company list in the ordered set where adminUserId
	 * = &#63;.
	 * 
	 * @param adminUserId
	 *            the admin user ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException
	 *             if a matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByAdminUserId_Last(
			long adminUserId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return SMACompanyListUtil.findBySMACompanyListByAdminUserId_Last(
				adminUserId, orderByComparator);
	}

	/**
	 * Returns the last s m a company list in the ordered set where adminUserId
	 * = &#63;.
	 * 
	 * @param adminUserId
	 *            the admin user ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a company list, or <code>null</code> if a
	 *         matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByAdminUserId_Last(
			long adminUserId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.fetchBySMACompanyListByAdminUserId_Last(
				adminUserId, orderByComparator);
	}

	/**
	 * Returns the s m a company lists before and after the current s m a
	 * company list in the ordered set where adminUserId = &#63;.
	 * 
	 * @param id
	 *            the primary key of the current s m a company list
	 * @param adminUserId
	 *            the admin user ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the previous, current, and next s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException
	 *             if a s m a company list with the primary key could not be
	 *             found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByAdminUserId_PrevAndNext(
			java.lang.String id, long adminUserId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return SMACompanyListUtil
				.findBySMACompanyListByAdminUserId_PrevAndNext(id, adminUserId,
						orderByComparator);
	}

	/**
	 * Returns all the s m a company lists where companyId = &#63;.
	 * 
	 * @param companyId
	 *            the company ID
	 * @return the matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCompanyId(
			long companyId)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.findBySMACompanyListByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the s m a company lists where companyId = &#63;.
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
	 * @param companyId
	 *            the company ID
	 * @param start
	 *            the lower bound of the range of s m a company lists
	 * @param end
	 *            the upper bound of the range of s m a company lists (not
	 *            inclusive)
	 * @return the range of matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCompanyId(
			long companyId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.findBySMACompanyListByCompanyId(companyId,
				start, end);
	}

	/**
	 * Returns an ordered range of all the s m a company lists where companyId =
	 * &#63;.
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
	 * @param companyId
	 *            the company ID
	 * @param start
	 *            the lower bound of the range of s m a company lists
	 * @param end
	 *            the upper bound of the range of s m a company lists (not
	 *            inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCompanyId(
			long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.findBySMACompanyListByCompanyId(companyId,
				start, end, orderByComparator);
	}

	/**
	 * Returns the first s m a company list in the ordered set where companyId =
	 * &#63;.
	 * 
	 * @param companyId
	 *            the company ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException
	 *             if a matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return SMACompanyListUtil.findBySMACompanyListByCompanyId_First(
				companyId, orderByComparator);
	}

	/**
	 * Returns the first s m a company list in the ordered set where companyId =
	 * &#63;.
	 * 
	 * @param companyId
	 *            the company ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a company list, or <code>null</code> if a
	 *         matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.fetchBySMACompanyListByCompanyId_First(
				companyId, orderByComparator);
	}

	/**
	 * Returns the last s m a company list in the ordered set where companyId =
	 * &#63;.
	 * 
	 * @param companyId
	 *            the company ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException
	 *             if a matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return SMACompanyListUtil.findBySMACompanyListByCompanyId_Last(
				companyId, orderByComparator);
	}

	/**
	 * Returns the last s m a company list in the ordered set where companyId =
	 * &#63;.
	 * 
	 * @param companyId
	 *            the company ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a company list, or <code>null</code> if a
	 *         matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.fetchBySMACompanyListByCompanyId_Last(
				companyId, orderByComparator);
	}

	/**
	 * Returns the s m a company lists before and after the current s m a
	 * company list in the ordered set where companyId = &#63;.
	 * 
	 * @param id
	 *            the primary key of the current s m a company list
	 * @param companyId
	 *            the company ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the previous, current, and next s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException
	 *             if a s m a company list with the primary key could not be
	 *             found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByCompanyId_PrevAndNext(
			java.lang.String id, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return SMACompanyListUtil.findBySMACompanyListByCompanyId_PrevAndNext(
				id, companyId, orderByComparator);
	}

	/**
	 * Returns all the s m a company lists where customerId = &#63;.
	 * 
	 * @param customerId
	 *            the customer ID
	 * @return the matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCustomerId(
			long customerId)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.findBySMACompanyListByCustomerId(customerId);
	}

	/**
	 * Returns a range of all the s m a company lists where customerId = &#63;.
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
	 * @param customerId
	 *            the customer ID
	 * @param start
	 *            the lower bound of the range of s m a company lists
	 * @param end
	 *            the upper bound of the range of s m a company lists (not
	 *            inclusive)
	 * @return the range of matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCustomerId(
			long customerId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.findBySMACompanyListByCustomerId(customerId,
				start, end);
	}

	/**
	 * Returns an ordered range of all the s m a company lists where customerId
	 * = &#63;.
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
	 * @param customerId
	 *            the customer ID
	 * @param start
	 *            the lower bound of the range of s m a company lists
	 * @param end
	 *            the upper bound of the range of s m a company lists (not
	 *            inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCustomerId(
			long customerId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.findBySMACompanyListByCustomerId(customerId,
				start, end, orderByComparator);
	}

	/**
	 * Returns the first s m a company list in the ordered set where customerId
	 * = &#63;.
	 * 
	 * @param customerId
	 *            the customer ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException
	 *             if a matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCustomerId_First(
			long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return SMACompanyListUtil.findBySMACompanyListByCustomerId_First(
				customerId, orderByComparator);
	}

	/**
	 * Returns the first s m a company list in the ordered set where customerId
	 * = &#63;.
	 * 
	 * @param customerId
	 *            the customer ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a company list, or <code>null</code> if a
	 *         matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCustomerId_First(
			long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.fetchBySMACompanyListByCustomerId_First(
				customerId, orderByComparator);
	}

	/**
	 * Returns the last s m a company list in the ordered set where customerId =
	 * &#63;.
	 * 
	 * @param customerId
	 *            the customer ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException
	 *             if a matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCustomerId_Last(
			long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return SMACompanyListUtil.findBySMACompanyListByCustomerId_Last(
				customerId, orderByComparator);
	}

	/**
	 * Returns the last s m a company list in the ordered set where customerId =
	 * &#63;.
	 * 
	 * @param customerId
	 *            the customer ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a company list, or <code>null</code> if a
	 *         matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCustomerId_Last(
			long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.fetchBySMACompanyListByCustomerId_Last(
				customerId, orderByComparator);
	}

	/**
	 * Returns the s m a company lists before and after the current s m a
	 * company list in the ordered set where customerId = &#63;.
	 * 
	 * @param id
	 *            the primary key of the current s m a company list
	 * @param customerId
	 *            the customer ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the previous, current, and next s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException
	 *             if a s m a company list with the primary key could not be
	 *             found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByCustomerId_PrevAndNext(
			java.lang.String id, long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return SMACompanyListUtil.findBySMACompanyListByCustomerId_PrevAndNext(
				id, customerId, orderByComparator);
	}

	/**
	 * Returns all the s m a company lists where domains = &#63;.
	 * 
	 * @param domains
	 *            the domains
	 * @return the matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByDomains(
			java.lang.String domains)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.findBySMACompanyListByDomains(domains);
	}

	/**
	 * Returns a range of all the s m a company lists where domains = &#63;.
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
	 * @param domains
	 *            the domains
	 * @param start
	 *            the lower bound of the range of s m a company lists
	 * @param end
	 *            the upper bound of the range of s m a company lists (not
	 *            inclusive)
	 * @return the range of matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByDomains(
			java.lang.String domains, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.findBySMACompanyListByDomains(domains, start,
				end);
	}

	/**
	 * Returns an ordered range of all the s m a company lists where domains =
	 * &#63;.
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
	 * @param domains
	 *            the domains
	 * @param start
	 *            the lower bound of the range of s m a company lists
	 * @param end
	 *            the upper bound of the range of s m a company lists (not
	 *            inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByDomains(
			java.lang.String domains, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.findBySMACompanyListByDomains(domains, start,
				end, orderByComparator);
	}

	/**
	 * Returns the first s m a company list in the ordered set where domains =
	 * &#63;.
	 * 
	 * @param domains
	 *            the domains
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException
	 *             if a matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByDomains_First(
			java.lang.String domains,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return SMACompanyListUtil.findBySMACompanyListByDomains_First(domains,
				orderByComparator);
	}

	/**
	 * Returns the first s m a company list in the ordered set where domains =
	 * &#63;.
	 * 
	 * @param domains
	 *            the domains
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a company list, or <code>null</code> if a
	 *         matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByDomains_First(
			java.lang.String domains,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.fetchBySMACompanyListByDomains_First(domains,
				orderByComparator);
	}

	/**
	 * Returns the last s m a company list in the ordered set where domains =
	 * &#63;.
	 * 
	 * @param domains
	 *            the domains
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException
	 *             if a matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByDomains_Last(
			java.lang.String domains,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return SMACompanyListUtil.findBySMACompanyListByDomains_Last(domains,
				orderByComparator);
	}

	/**
	 * Returns the last s m a company list in the ordered set where domains =
	 * &#63;.
	 * 
	 * @param domains
	 *            the domains
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a company list, or <code>null</code> if a
	 *         matching s m a company list could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByDomains_Last(
			java.lang.String domains,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.fetchBySMACompanyListByDomains_Last(domains,
				orderByComparator);
	}

	/**
	 * Returns the s m a company lists before and after the current s m a
	 * company list in the ordered set where domains = &#63;.
	 * 
	 * @param id
	 *            the primary key of the current s m a company list
	 * @param domains
	 *            the domains
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the previous, current, and next s m a company list
	 * @throws com.pacnet.connect.NoSuchSMACompanyListException
	 *             if a s m a company list with the primary key could not be
	 *             found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByDomains_PrevAndNext(
			java.lang.String id, java.lang.String domains,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return SMACompanyListUtil.findBySMACompanyListByDomains_PrevAndNext(id,
				domains, orderByComparator);
	}

	/**
	 * Returns all the s m a company lists.
	 * 
	 * @return the s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findAll()
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.findAll();
	}

	/**
	 * Returns a range of all the s m a company lists.
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
	 *            the lower bound of the range of s m a company lists
	 * @param end
	 *            the upper bound of the range of s m a company lists (not
	 *            inclusive)
	 * @return the range of s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findAll(
			int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the s m a company lists.
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
	 *            the lower bound of the range of s m a company lists
	 * @param end
	 *            the upper bound of the range of s m a company lists (not
	 *            inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findAll(
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the s m a company lists where adminUserId = &#63; from the
	 * database.
	 * 
	 * @param adminUserId
	 *            the admin user ID
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public void removeBySMACompanyListByAdminUserId(long adminUserId)
			throws com.liferay.portal.kernel.exception.SystemException {
		SMACompanyListUtil.removeBySMACompanyListByAdminUserId(adminUserId);
	}

	/**
	 * Removes all the s m a company lists where companyId = &#63; from the
	 * database.
	 * 
	 * @param companyId
	 *            the company ID
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public void removeBySMACompanyListByCompanyId(long companyId)
			throws com.liferay.portal.kernel.exception.SystemException {
		SMACompanyListUtil.removeBySMACompanyListByCompanyId(companyId);
	}

	/**
	 * Removes all the s m a company lists where customerId = &#63; from the
	 * database.
	 * 
	 * @param customerId
	 *            the customer ID
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public void removeBySMACompanyListByCustomerId(long customerId)
			throws com.liferay.portal.kernel.exception.SystemException {
		SMACompanyListUtil.removeBySMACompanyListByCustomerId(customerId);
	}

	/**
	 * Removes all the s m a company lists where domains = &#63; from the
	 * database.
	 * 
	 * @param domains
	 *            the domains
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public void removeBySMACompanyListByDomains(java.lang.String domains)
			throws com.liferay.portal.kernel.exception.SystemException {
		SMACompanyListUtil.removeBySMACompanyListByDomains(domains);
	}

	/**
	 * Removes all the s m a company lists from the database.
	 * 
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public void removeAll()
			throws com.liferay.portal.kernel.exception.SystemException {
		SMACompanyListUtil.removeAll();
	}

	/**
	 * Returns the number of s m a company lists where adminUserId = &#63;.
	 * 
	 * @param adminUserId
	 *            the admin user ID
	 * @return the number of matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countBySMACompanyListByAdminUserId(long adminUserId)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil
				.countBySMACompanyListByAdminUserId(adminUserId);
	}

	/**
	 * Returns the number of s m a company lists where companyId = &#63;.
	 * 
	 * @param companyId
	 *            the company ID
	 * @return the number of matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countBySMACompanyListByCompanyId(long companyId)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.countBySMACompanyListByCompanyId(companyId);
	}

	/**
	 * Returns the number of s m a company lists where customerId = &#63;.
	 * 
	 * @param customerId
	 *            the customer ID
	 * @return the number of matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countBySMACompanyListByCustomerId(long customerId)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.countBySMACompanyListByCustomerId(customerId);
	}

	/**
	 * Returns the number of s m a company lists where domains = &#63;.
	 * 
	 * @param domains
	 *            the domains
	 * @return the number of matching s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countBySMACompanyListByDomains(java.lang.String domains)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.countBySMACompanyListByDomains(domains);
	}

	/**
	 * Returns the number of s m a company lists.
	 * 
	 * @return the number of s m a company lists
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countAll()
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompanyListUtil.countAll();
	}
}