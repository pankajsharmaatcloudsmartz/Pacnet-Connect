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
import com.pacnet.connect.model.SMARadcheck;
import com.pacnet.connect.service.base.SMARadcheckLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.SMARadcheckUtil;

/**
 * The implementation of the s m a radcheck local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.pacnet.connect.service.SMARadcheckLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.SMARadcheckLocalServiceBaseImpl
 * @see com.pacnet.connect.service.SMARadcheckLocalServiceUtil
 */
public class SMARadcheckLocalServiceImpl extends
		SMARadcheckLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.pacnet.connect.service.SMARadcheckLocalServiceUtil} to access the s m
	 * a radcheck local service.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public void clearCache() {
		SMARadcheckUtil.clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public void clearCache(SMARadcheck smaRadcheck) {
		SMARadcheckUtil.clearCache(smaRadcheck);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public List<SMARadcheck> findWithDynamicQuery(DynamicQuery dynamicQuery)
			throws SystemException {
		return SMARadcheckUtil.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	 *      int, int)
	 */
	public List<SMARadcheck> findWithDynamicQuery(DynamicQuery dynamicQuery,
			int start, int end) throws SystemException {
		return SMARadcheckUtil.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	 *      int, int, OrderByComparator)
	 */
	public List<SMARadcheck> findWithDynamicQuery(DynamicQuery dynamicQuery,
			int start, int end, OrderByComparator orderByComparator)
			throws SystemException {
		return SMARadcheckUtil.findWithDynamicQuery(dynamicQuery, start, end,
				orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	 *      boolean)
	 */
	public SMARadcheck update(SMARadcheck smaRadcheck, boolean merge)
			throws SystemException {
		return SMARadcheckUtil.update(smaRadcheck, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	 *      boolean, ServiceContext)
	 */
	public SMARadcheck update(SMARadcheck smaRadcheck, boolean merge,
			ServiceContext serviceContext) throws SystemException {
		return SMARadcheckUtil.update(smaRadcheck, merge, serviceContext);
	}

	/**
	 * Caches the s m a radcheck in the entity cache if it is enabled.
	 * 
	 * @param smaRadcheck
	 *            the s m a radcheck
	 */
	public void cacheResult(com.pacnet.connect.model.SMARadcheck smaRadcheck) {
		SMARadcheckUtil.cacheResult(smaRadcheck);
	}

	/**
	 * Caches the s m a radchecks in the entity cache if it is enabled.
	 * 
	 * @param smaRadchecks
	 *            the s m a radchecks
	 */
	public void cacheResult(
			java.util.List<com.pacnet.connect.model.SMARadcheck> smaRadchecks) {
		SMARadcheckUtil.cacheResult(smaRadchecks);
	}

	/**
	 * Creates a new s m a radcheck with the primary key. Does not add the s m a
	 * radcheck to the database.
	 * 
	 * @param id
	 *            the primary key for the new s m a radcheck
	 * @return the new s m a radcheck
	 */
	public com.pacnet.connect.model.SMARadcheck create(long id) {
		return SMARadcheckUtil.create(id);
	}

	/**
	 * Removes the s m a radcheck with the primary key from the database. Also
	 * notifies the appropriate model listeners.
	 * 
	 * @param id
	 *            the primary key of the s m a radcheck
	 * @return the s m a radcheck that was removed
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException
	 *             if a s m a radcheck with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadcheck remove(long id)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return SMARadcheckUtil.remove(id);
	}

	public com.pacnet.connect.model.SMARadcheck updateImpl(
			com.pacnet.connect.model.SMARadcheck smaRadcheck, boolean merge)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.updateImpl(smaRadcheck, merge);
	}

	/**
	 * Returns the s m a radcheck with the primary key or throws a
	 * {@link com.pacnet.connect.NoSuchSMARadcheckException} if it could not be
	 * found.
	 * 
	 * @param id
	 *            the primary key of the s m a radcheck
	 * @return the s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException
	 *             if a s m a radcheck with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadcheck findByPrimaryKey(long id)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return SMARadcheckUtil.findByPrimaryKey(id);
	}

	/**
	 * Returns the s m a radcheck with the primary key or returns
	 * <code>null</code> if it could not be found.
	 * 
	 * @param id
	 *            the primary key of the s m a radcheck
	 * @return the s m a radcheck, or <code>null</code> if a s m a radcheck with
	 *         the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadcheck fetchByPrimaryKey(long id)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the s m a radchecks where isActive = &#63; and companyId =
	 * &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param companyId
	 *            the company ID
	 * @return the matching s m a radchecks
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findBySMAUserListByCompanyId(
			int isActive, long companyId)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil
				.findBySMAUserListByCompanyId(isActive, companyId);
	}

	/**
	 * Returns a range of all the s m a radchecks where isActive = &#63; and
	 * companyId = &#63;.
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
	 * @param companyId
	 *            the company ID
	 * @param start
	 *            the lower bound of the range of s m a radchecks
	 * @param end
	 *            the upper bound of the range of s m a radchecks (not
	 *            inclusive)
	 * @return the range of matching s m a radchecks
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findBySMAUserListByCompanyId(
			int isActive, long companyId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.findBySMAUserListByCompanyId(isActive,
				companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the s m a radchecks where isActive =
	 * &#63; and companyId = &#63;.
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
	 * @param companyId
	 *            the company ID
	 * @param start
	 *            the lower bound of the range of s m a radchecks
	 * @param end
	 *            the upper bound of the range of s m a radchecks (not
	 *            inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of matching s m a radchecks
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findBySMAUserListByCompanyId(
			int isActive, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.findBySMAUserListByCompanyId(isActive,
				companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the first s m a radcheck in the ordered set where isActive =
	 * &#63; and companyId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param companyId
	 *            the company ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException
	 *             if a matching s m a radcheck could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadcheck findBySMAUserListByCompanyId_First(
			int isActive, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return SMARadcheckUtil.findBySMAUserListByCompanyId_First(isActive,
				companyId, orderByComparator);
	}

	/**
	 * Returns the first s m a radcheck in the ordered set where isActive =
	 * &#63; and companyId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param companyId
	 *            the company ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a radcheck, or <code>null</code> if a
	 *         matching s m a radcheck could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadcheck fetchBySMAUserListByCompanyId_First(
			int isActive, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.fetchBySMAUserListByCompanyId_First(isActive,
				companyId, orderByComparator);
	}

	/**
	 * Returns the last s m a radcheck in the ordered set where isActive = &#63;
	 * and companyId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param companyId
	 *            the company ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException
	 *             if a matching s m a radcheck could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadcheck findBySMAUserListByCompanyId_Last(
			int isActive, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return SMARadcheckUtil.findBySMAUserListByCompanyId_Last(isActive,
				companyId, orderByComparator);
	}

	/**
	 * Returns the last s m a radcheck in the ordered set where isActive = &#63;
	 * and companyId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param companyId
	 *            the company ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a radcheck, or <code>null</code> if a
	 *         matching s m a radcheck could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadcheck fetchBySMAUserListByCompanyId_Last(
			int isActive, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.fetchBySMAUserListByCompanyId_Last(isActive,
				companyId, orderByComparator);
	}

	/**
	 * Returns the s m a radchecks before and after the current s m a radcheck
	 * in the ordered set where isActive = &#63; and companyId = &#63;.
	 * 
	 * @param id
	 *            the primary key of the current s m a radcheck
	 * @param isActive
	 *            the is active
	 * @param companyId
	 *            the company ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the previous, current, and next s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException
	 *             if a s m a radcheck with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadcheck[] findBySMAUserListByCompanyId_PrevAndNext(
			long id, int isActive, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return SMARadcheckUtil.findBySMAUserListByCompanyId_PrevAndNext(id,
				isActive, companyId, orderByComparator);
	}

	/**
	 * Returns all the s m a radchecks where isActive = &#63; and isAdmin =
	 * &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param isAdmin
	 *            the is admin
	 * @return the matching s m a radchecks
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findBySMAUserListByIsAdmin(
			int isActive, int isAdmin)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.findBySMAUserListByIsAdmin(isActive, isAdmin);
	}

	/**
	 * Returns a range of all the s m a radchecks where isActive = &#63; and
	 * isAdmin = &#63;.
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
	 * @param isAdmin
	 *            the is admin
	 * @param start
	 *            the lower bound of the range of s m a radchecks
	 * @param end
	 *            the upper bound of the range of s m a radchecks (not
	 *            inclusive)
	 * @return the range of matching s m a radchecks
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findBySMAUserListByIsAdmin(
			int isActive, int isAdmin, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.findBySMAUserListByIsAdmin(isActive, isAdmin,
				start, end);
	}

	/**
	 * Returns an ordered range of all the s m a radchecks where isActive =
	 * &#63; and isAdmin = &#63;.
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
	 * @param isAdmin
	 *            the is admin
	 * @param start
	 *            the lower bound of the range of s m a radchecks
	 * @param end
	 *            the upper bound of the range of s m a radchecks (not
	 *            inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of matching s m a radchecks
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findBySMAUserListByIsAdmin(
			int isActive, int isAdmin, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.findBySMAUserListByIsAdmin(isActive, isAdmin,
				start, end, orderByComparator);
	}

	/**
	 * Returns the first s m a radcheck in the ordered set where isActive =
	 * &#63; and isAdmin = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param isAdmin
	 *            the is admin
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException
	 *             if a matching s m a radcheck could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadcheck findBySMAUserListByIsAdmin_First(
			int isActive, int isAdmin,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return SMARadcheckUtil.findBySMAUserListByIsAdmin_First(isActive,
				isAdmin, orderByComparator);
	}

	/**
	 * Returns the first s m a radcheck in the ordered set where isActive =
	 * &#63; and isAdmin = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param isAdmin
	 *            the is admin
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a radcheck, or <code>null</code> if a
	 *         matching s m a radcheck could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadcheck fetchBySMAUserListByIsAdmin_First(
			int isActive, int isAdmin,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.fetchBySMAUserListByIsAdmin_First(isActive,
				isAdmin, orderByComparator);
	}

	/**
	 * Returns the last s m a radcheck in the ordered set where isActive = &#63;
	 * and isAdmin = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param isAdmin
	 *            the is admin
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException
	 *             if a matching s m a radcheck could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadcheck findBySMAUserListByIsAdmin_Last(
			int isActive, int isAdmin,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return SMARadcheckUtil.findBySMAUserListByIsAdmin_Last(isActive,
				isAdmin, orderByComparator);
	}

	/**
	 * Returns the last s m a radcheck in the ordered set where isActive = &#63;
	 * and isAdmin = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param isAdmin
	 *            the is admin
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a radcheck, or <code>null</code> if a
	 *         matching s m a radcheck could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadcheck fetchBySMAUserListByIsAdmin_Last(
			int isActive, int isAdmin,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.fetchBySMAUserListByIsAdmin_Last(isActive,
				isAdmin, orderByComparator);
	}

	/**
	 * Returns the s m a radchecks before and after the current s m a radcheck
	 * in the ordered set where isActive = &#63; and isAdmin = &#63;.
	 * 
	 * @param id
	 *            the primary key of the current s m a radcheck
	 * @param isActive
	 *            the is active
	 * @param isAdmin
	 *            the is admin
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the previous, current, and next s m a radcheck
	 * @throws com.pacnet.connect.NoSuchSMARadcheckException
	 *             if a s m a radcheck with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMARadcheck[] findBySMAUserListByIsAdmin_PrevAndNext(
			long id, int isActive, int isAdmin,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return SMARadcheckUtil.findBySMAUserListByIsAdmin_PrevAndNext(id,
				isActive, isAdmin, orderByComparator);
	}

	/**
	 * Returns all the s m a radchecks.
	 * 
	 * @return the s m a radchecks
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findAll()
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.findAll();
	}

	/**
	 * Returns a range of all the s m a radchecks.
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
	 *            the lower bound of the range of s m a radchecks
	 * @param end
	 *            the upper bound of the range of s m a radchecks (not
	 *            inclusive)
	 * @return the range of s m a radchecks
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findAll(
			int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the s m a radchecks.
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
	 *            the lower bound of the range of s m a radchecks
	 * @param end
	 *            the upper bound of the range of s m a radchecks (not
	 *            inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of s m a radchecks
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findAll(
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the s m a radchecks where isActive = &#63; and companyId =
	 * &#63; from the database.
	 * 
	 * @param isActive
	 *            the is active
	 * @param companyId
	 *            the company ID
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public void removeBySMAUserListByCompanyId(int isActive, long companyId)
			throws com.liferay.portal.kernel.exception.SystemException {
		SMARadcheckUtil.removeBySMAUserListByCompanyId(isActive, companyId);
	}

	/**
	 * Removes all the s m a radchecks where isActive = &#63; and isAdmin =
	 * &#63; from the database.
	 * 
	 * @param isActive
	 *            the is active
	 * @param isAdmin
	 *            the is admin
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public void removeBySMAUserListByIsAdmin(int isActive, int isAdmin)
			throws com.liferay.portal.kernel.exception.SystemException {
		SMARadcheckUtil.removeBySMAUserListByIsAdmin(isActive, isAdmin);
	}

	/**
	 * Removes all the s m a radchecks from the database.
	 * 
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public void removeAll()
			throws com.liferay.portal.kernel.exception.SystemException {
		SMARadcheckUtil.removeAll();
	}

	/**
	 * Returns the number of s m a radchecks where isActive = &#63; and
	 * companyId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param companyId
	 *            the company ID
	 * @return the number of matching s m a radchecks
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countBySMAUserListByCompanyId(int isActive, long companyId)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.countBySMAUserListByCompanyId(isActive,
				companyId);
	}

	/**
	 * Returns the number of s m a radchecks where isActive = &#63; and isAdmin
	 * = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param isAdmin
	 *            the is admin
	 * @return the number of matching s m a radchecks
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countBySMAUserListByIsAdmin(int isActive, int isAdmin)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.countBySMAUserListByIsAdmin(isActive, isAdmin);
	}

	/**
	 * Returns the number of s m a radchecks where isActive = &#63; and isAdmin
	 * = &#63; and companyId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param isAdmin
	 *            the is admin
	 * @param companyId
	 *            the company ID
	 * @return the number of matching s m a radchecks
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countBySMAUserListByIsAdminCompanyId(int isActive, int isAdmin,
			long companyId)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.countBySMAUserListByIsAdminCompanyId(isActive,
				isAdmin, companyId);
	}

	/**
	 * Returns the number of s m a radchecks.
	 * 
	 * @return the number of s m a radchecks
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countAll()
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMARadcheckUtil.countAll();
	}

}