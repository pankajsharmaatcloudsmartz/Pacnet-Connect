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
import com.pacnet.connect.model.SMACompanies;
import com.pacnet.connect.service.base.SMACompaniesLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.SMACompaniesUtil;

/**
 * The implementation of the s m a companies local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.pacnet.connect.service.SMACompaniesLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.SMACompaniesLocalServiceBaseImpl
 * @see com.pacnet.connect.service.SMACompaniesLocalServiceUtil
 */
public class SMACompaniesLocalServiceImpl extends
		SMACompaniesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.pacnet.connect.service.SMACompaniesLocalServiceUtil} to access the s
	 * m a companies local service.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public void clearCache() {
		SMACompaniesUtil.clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public void clearCache(SMACompanies smaCompanies) {
		SMACompaniesUtil.clearCache(smaCompanies);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public List<SMACompanies> findWithDynamicQuery(DynamicQuery dynamicQuery)
			throws SystemException {
		return SMACompaniesUtil.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	 *      int, int)
	 */
	public List<SMACompanies> findWithDynamicQuery(DynamicQuery dynamicQuery,
			int start, int end) throws SystemException {
		return SMACompaniesUtil.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	 *      int, int, OrderByComparator)
	 */
	public List<SMACompanies> findWithDynamicQuery(DynamicQuery dynamicQuery,
			int start, int end, OrderByComparator orderByComparator)
			throws SystemException {
		return SMACompaniesUtil.findWithDynamicQuery(dynamicQuery, start, end,
				orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	 *      boolean)
	 */
	public SMACompanies update(SMACompanies smaCompanies, boolean merge)
			throws SystemException {
		return SMACompaniesUtil.update(smaCompanies, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	 *      boolean, ServiceContext)
	 */
	public SMACompanies update(SMACompanies smaCompanies, boolean merge,
			ServiceContext serviceContext) throws SystemException {
		return SMACompaniesUtil.update(smaCompanies, merge, serviceContext);
	}

	/**
	 * Caches the s m a companies in the entity cache if it is enabled.
	 * 
	 * @param smaCompanies
	 *            the s m a companies
	 */
	public void cacheResult(com.pacnet.connect.model.SMACompanies smaCompanies) {
		SMACompaniesUtil.cacheResult(smaCompanies);
	}

	/**
	 * Caches the s m a companieses in the entity cache if it is enabled.
	 * 
	 * @param smaCompanieses
	 *            the s m a companieses
	 */
	public void cacheResult(
			java.util.List<com.pacnet.connect.model.SMACompanies> smaCompanieses) {
		SMACompaniesUtil.cacheResult(smaCompanieses);
	}

	/**
	 * Creates a new s m a companies with the primary key. Does not add the s m
	 * a companies to the database.
	 * 
	 * @param id
	 *            the primary key for the new s m a companies
	 * @return the new s m a companies
	 */
	public com.pacnet.connect.model.SMACompanies create(long id) {
		return SMACompaniesUtil.create(id);
	}

	/**
	 * Removes the s m a companies with the primary key from the database. Also
	 * notifies the appropriate model listeners.
	 * 
	 * @param id
	 *            the primary key of the s m a companies
	 * @return the s m a companies that was removed
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException
	 *             if a s m a companies with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies remove(long id)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return SMACompaniesUtil.remove(id);
	}

	public com.pacnet.connect.model.SMACompanies updateImpl(
			com.pacnet.connect.model.SMACompanies smaCompanies, boolean merge)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.updateImpl(smaCompanies, merge);
	}

	/**
	 * Returns the s m a companies with the primary key or throws a
	 * {@link com.pacnet.connect.NoSuchSMACompaniesException} if it could not be
	 * found.
	 * 
	 * @param id
	 *            the primary key of the s m a companies
	 * @return the s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException
	 *             if a s m a companies with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies findByPrimaryKey(long id)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return SMACompaniesUtil.findByPrimaryKey(id);
	}

	/**
	 * Returns the s m a companies with the primary key or returns
	 * <code>null</code> if it could not be found.
	 * 
	 * @param id
	 *            the primary key of the s m a companies
	 * @return the s m a companies, or <code>null</code> if a s m a companies
	 *         with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies fetchByPrimaryKey(long id)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the s m a companieses where isActive = &#63; and createdBy =
	 * &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param createdBy
	 *            the created by
	 * @return the matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanies> findByGetAllCompanies(
			int isActive, java.lang.String createdBy)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.findByGetAllCompanies(isActive, createdBy);
	}

	/**
	 * Returns a range of all the s m a companieses where isActive = &#63; and
	 * createdBy = &#63;.
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
	 * @param createdBy
	 *            the created by
	 * @param start
	 *            the lower bound of the range of s m a companieses
	 * @param end
	 *            the upper bound of the range of s m a companieses (not
	 *            inclusive)
	 * @return the range of matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanies> findByGetAllCompanies(
			int isActive, java.lang.String createdBy, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.findByGetAllCompanies(isActive, createdBy,
				start, end);
	}

	/**
	 * Returns an ordered range of all the s m a companieses where isActive =
	 * &#63; and createdBy = &#63;.
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
	 * @param createdBy
	 *            the created by
	 * @param start
	 *            the lower bound of the range of s m a companieses
	 * @param end
	 *            the upper bound of the range of s m a companieses (not
	 *            inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanies> findByGetAllCompanies(
			int isActive, java.lang.String createdBy, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.findByGetAllCompanies(isActive, createdBy,
				start, end, orderByComparator);
	}

	/**
	 * Returns the first s m a companies in the ordered set where isActive =
	 * &#63; and createdBy = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param createdBy
	 *            the created by
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException
	 *             if a matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies findByGetAllCompanies_First(
			int isActive, java.lang.String createdBy,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return SMACompaniesUtil.findByGetAllCompanies_First(isActive,
				createdBy, orderByComparator);
	}

	/**
	 * Returns the first s m a companies in the ordered set where isActive =
	 * &#63; and createdBy = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param createdBy
	 *            the created by
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a companies, or <code>null</code> if a
	 *         matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies fetchByGetAllCompanies_First(
			int isActive, java.lang.String createdBy,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.fetchByGetAllCompanies_First(isActive,
				createdBy, orderByComparator);
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive =
	 * &#63; and createdBy = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param createdBy
	 *            the created by
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException
	 *             if a matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies findByGetAllCompanies_Last(
			int isActive, java.lang.String createdBy,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return SMACompaniesUtil.findByGetAllCompanies_Last(isActive, createdBy,
				orderByComparator);
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive =
	 * &#63; and createdBy = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param createdBy
	 *            the created by
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a companies, or <code>null</code> if a
	 *         matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies fetchByGetAllCompanies_Last(
			int isActive, java.lang.String createdBy,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.fetchByGetAllCompanies_Last(isActive,
				createdBy, orderByComparator);
	}

	/**
	 * Returns the s m a companieses before and after the current s m a
	 * companies in the ordered set where isActive = &#63; and createdBy =
	 * &#63;.
	 * 
	 * @param id
	 *            the primary key of the current s m a companies
	 * @param isActive
	 *            the is active
	 * @param createdBy
	 *            the created by
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the previous, current, and next s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException
	 *             if a s m a companies with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies[] findByGetAllCompanies_PrevAndNext(
			long id, int isActive, java.lang.String createdBy,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return SMACompaniesUtil.findByGetAllCompanies_PrevAndNext(id, isActive,
				createdBy, orderByComparator);
	}

	/**
	 * Returns all the s m a companieses where isActive = &#63; and customerId =
	 * &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param customerId
	 *            the customer ID
	 * @return the matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByCustomerId(
			int isActive, long customerId)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.findBySMACompanyListByCustomerId(isActive,
				customerId);
	}

	/**
	 * Returns a range of all the s m a companieses where isActive = &#63; and
	 * customerId = &#63;.
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
	 * @param customerId
	 *            the customer ID
	 * @param start
	 *            the lower bound of the range of s m a companieses
	 * @param end
	 *            the upper bound of the range of s m a companieses (not
	 *            inclusive)
	 * @return the range of matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByCustomerId(
			int isActive, long customerId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.findBySMACompanyListByCustomerId(isActive,
				customerId, start, end);
	}

	/**
	 * Returns an ordered range of all the s m a companieses where isActive =
	 * &#63; and customerId = &#63;.
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
	 * @param customerId
	 *            the customer ID
	 * @param start
	 *            the lower bound of the range of s m a companieses
	 * @param end
	 *            the upper bound of the range of s m a companieses (not
	 *            inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByCustomerId(
			int isActive, long customerId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.findBySMACompanyListByCustomerId(isActive,
				customerId, start, end, orderByComparator);
	}

	/**
	 * Returns the first s m a companies in the ordered set where isActive =
	 * &#63; and customerId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param customerId
	 *            the customer ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException
	 *             if a matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies findBySMACompanyListByCustomerId_First(
			int isActive, long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return SMACompaniesUtil.findBySMACompanyListByCustomerId_First(
				isActive, customerId, orderByComparator);
	}

	/**
	 * Returns the first s m a companies in the ordered set where isActive =
	 * &#63; and customerId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param customerId
	 *            the customer ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a companies, or <code>null</code> if a
	 *         matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByCustomerId_First(
			int isActive, long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.fetchBySMACompanyListByCustomerId_First(
				isActive, customerId, orderByComparator);
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive =
	 * &#63; and customerId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param customerId
	 *            the customer ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException
	 *             if a matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies findBySMACompanyListByCustomerId_Last(
			int isActive, long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return SMACompaniesUtil.findBySMACompanyListByCustomerId_Last(isActive,
				customerId, orderByComparator);
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive =
	 * &#63; and customerId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param customerId
	 *            the customer ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a companies, or <code>null</code> if a
	 *         matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByCustomerId_Last(
			int isActive, long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.fetchBySMACompanyListByCustomerId_Last(
				isActive, customerId, orderByComparator);
	}

	/**
	 * Returns the s m a companieses before and after the current s m a
	 * companies in the ordered set where isActive = &#63; and customerId =
	 * &#63;.
	 * 
	 * @param id
	 *            the primary key of the current s m a companies
	 * @param isActive
	 *            the is active
	 * @param customerId
	 *            the customer ID
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the previous, current, and next s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException
	 *             if a s m a companies with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies[] findBySMACompanyListByCustomerId_PrevAndNext(
			long id, int isActive, long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return SMACompaniesUtil.findBySMACompanyListByCustomerId_PrevAndNext(
				id, isActive, customerId, orderByComparator);
	}

	/**
	 * Returns all the s m a companieses where isActive = &#63; and domains =
	 * &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param domains
	 *            the domains
	 * @return the matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByDomains(
			int isActive, java.lang.String domains)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil
				.findBySMACompanyListByDomains(isActive, domains);
	}

	/**
	 * Returns a range of all the s m a companieses where isActive = &#63; and
	 * domains = &#63;.
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
	 * @param domains
	 *            the domains
	 * @param start
	 *            the lower bound of the range of s m a companieses
	 * @param end
	 *            the upper bound of the range of s m a companieses (not
	 *            inclusive)
	 * @return the range of matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByDomains(
			int isActive, java.lang.String domains, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.findBySMACompanyListByDomains(isActive,
				domains, start, end);
	}

	/**
	 * Returns an ordered range of all the s m a companieses where isActive =
	 * &#63; and domains = &#63;.
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
	 * @param domains
	 *            the domains
	 * @param start
	 *            the lower bound of the range of s m a companieses
	 * @param end
	 *            the upper bound of the range of s m a companieses (not
	 *            inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByDomains(
			int isActive, java.lang.String domains, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.findBySMACompanyListByDomains(isActive,
				domains, start, end, orderByComparator);
	}

	/**
	 * Returns the first s m a companies in the ordered set where isActive =
	 * &#63; and domains = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param domains
	 *            the domains
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException
	 *             if a matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies findBySMACompanyListByDomains_First(
			int isActive, java.lang.String domains,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return SMACompaniesUtil.findBySMACompanyListByDomains_First(isActive,
				domains, orderByComparator);
	}

	/**
	 * Returns the first s m a companies in the ordered set where isActive =
	 * &#63; and domains = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param domains
	 *            the domains
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a companies, or <code>null</code> if a
	 *         matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByDomains_First(
			int isActive, java.lang.String domains,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.fetchBySMACompanyListByDomains_First(isActive,
				domains, orderByComparator);
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive =
	 * &#63; and domains = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param domains
	 *            the domains
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException
	 *             if a matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies findBySMACompanyListByDomains_Last(
			int isActive, java.lang.String domains,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return SMACompaniesUtil.findBySMACompanyListByDomains_Last(isActive,
				domains, orderByComparator);
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive =
	 * &#63; and domains = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param domains
	 *            the domains
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a companies, or <code>null</code> if a
	 *         matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByDomains_Last(
			int isActive, java.lang.String domains,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.fetchBySMACompanyListByDomains_Last(isActive,
				domains, orderByComparator);
	}

	/**
	 * Returns the s m a companieses before and after the current s m a
	 * companies in the ordered set where isActive = &#63; and domains = &#63;.
	 * 
	 * @param id
	 *            the primary key of the current s m a companies
	 * @param isActive
	 *            the is active
	 * @param domains
	 *            the domains
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the previous, current, and next s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException
	 *             if a s m a companies with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies[] findBySMACompanyListByDomains_PrevAndNext(
			long id, int isActive, java.lang.String domains,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return SMACompaniesUtil.findBySMACompanyListByDomains_PrevAndNext(id,
				isActive, domains, orderByComparator);
	}

	/**
	 * Returns all the s m a companieses where isActive = &#63; and groupName =
	 * &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param groupName
	 *            the group name
	 * @return the matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByGroupName(
			int isActive, java.lang.String groupName)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.findBySMACompanyListByGroupName(isActive,
				groupName);
	}

	/**
	 * Returns a range of all the s m a companieses where isActive = &#63; and
	 * groupName = &#63;.
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
	 * @param groupName
	 *            the group name
	 * @param start
	 *            the lower bound of the range of s m a companieses
	 * @param end
	 *            the upper bound of the range of s m a companieses (not
	 *            inclusive)
	 * @return the range of matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByGroupName(
			int isActive, java.lang.String groupName, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.findBySMACompanyListByGroupName(isActive,
				groupName, start, end);
	}

	/**
	 * Returns an ordered range of all the s m a companieses where isActive =
	 * &#63; and groupName = &#63;.
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
	 * @param groupName
	 *            the group name
	 * @param start
	 *            the lower bound of the range of s m a companieses
	 * @param end
	 *            the upper bound of the range of s m a companieses (not
	 *            inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByGroupName(
			int isActive, java.lang.String groupName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.findBySMACompanyListByGroupName(isActive,
				groupName, start, end, orderByComparator);
	}

	/**
	 * Returns the first s m a companies in the ordered set where isActive =
	 * &#63; and groupName = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param groupName
	 *            the group name
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException
	 *             if a matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies findBySMACompanyListByGroupName_First(
			int isActive, java.lang.String groupName,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return SMACompaniesUtil.findBySMACompanyListByGroupName_First(isActive,
				groupName, orderByComparator);
	}

	/**
	 * Returns the first s m a companies in the ordered set where isActive =
	 * &#63; and groupName = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param groupName
	 *            the group name
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the first matching s m a companies, or <code>null</code> if a
	 *         matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByGroupName_First(
			int isActive, java.lang.String groupName,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.fetchBySMACompanyListByGroupName_First(
				isActive, groupName, orderByComparator);
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive =
	 * &#63; and groupName = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param groupName
	 *            the group name
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException
	 *             if a matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies findBySMACompanyListByGroupName_Last(
			int isActive, java.lang.String groupName,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return SMACompaniesUtil.findBySMACompanyListByGroupName_Last(isActive,
				groupName, orderByComparator);
	}

	/**
	 * Returns the last s m a companies in the ordered set where isActive =
	 * &#63; and groupName = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param groupName
	 *            the group name
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the last matching s m a companies, or <code>null</code> if a
	 *         matching s m a companies could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByGroupName_Last(
			int isActive, java.lang.String groupName,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.fetchBySMACompanyListByGroupName_Last(isActive,
				groupName, orderByComparator);
	}

	/**
	 * Returns the s m a companieses before and after the current s m a
	 * companies in the ordered set where isActive = &#63; and groupName =
	 * &#63;.
	 * 
	 * @param id
	 *            the primary key of the current s m a companies
	 * @param isActive
	 *            the is active
	 * @param groupName
	 *            the group name
	 * @param orderByComparator
	 *            the comparator to order the set by (optionally
	 *            <code>null</code>)
	 * @return the previous, current, and next s m a companies
	 * @throws com.pacnet.connect.NoSuchSMACompaniesException
	 *             if a s m a companies with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public com.pacnet.connect.model.SMACompanies[] findBySMACompanyListByGroupName_PrevAndNext(
			long id, int isActive, java.lang.String groupName,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return SMACompaniesUtil.findBySMACompanyListByGroupName_PrevAndNext(id,
				isActive, groupName, orderByComparator);
	}

	/**
	 * Returns all the s m a companieses.
	 * 
	 * @return the s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanies> findAll()
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.findAll();
	}

	/**
	 * Returns a range of all the s m a companieses.
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
	 *            the lower bound of the range of s m a companieses
	 * @param end
	 *            the upper bound of the range of s m a companieses (not
	 *            inclusive)
	 * @return the range of s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanies> findAll(
			int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the s m a companieses.
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
	 *            the lower bound of the range of s m a companieses
	 * @param end
	 *            the upper bound of the range of s m a companieses (not
	 *            inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public java.util.List<com.pacnet.connect.model.SMACompanies> findAll(
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the s m a companieses where isActive = &#63; and createdBy =
	 * &#63; from the database.
	 * 
	 * @param isActive
	 *            the is active
	 * @param createdBy
	 *            the created by
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public void removeByGetAllCompanies(int isActive, java.lang.String createdBy)
			throws com.liferay.portal.kernel.exception.SystemException {
		SMACompaniesUtil.removeByGetAllCompanies(isActive, createdBy);
	}

	/**
	 * Removes all the s m a companieses where isActive = &#63; and customerId =
	 * &#63; from the database.
	 * 
	 * @param isActive
	 *            the is active
	 * @param customerId
	 *            the customer ID
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public void removeBySMACompanyListByCustomerId(int isActive, long customerId)
			throws com.liferay.portal.kernel.exception.SystemException {
		SMACompaniesUtil.removeBySMACompanyListByCustomerId(isActive,
				customerId);
	}

	/**
	 * Removes all the s m a companieses where isActive = &#63; and domains =
	 * &#63; from the database.
	 * 
	 * @param isActive
	 *            the is active
	 * @param domains
	 *            the domains
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public void removeBySMACompanyListByDomains(int isActive,
			java.lang.String domains)
			throws com.liferay.portal.kernel.exception.SystemException {
		SMACompaniesUtil.removeBySMACompanyListByDomains(isActive, domains);
	}

	/**
	 * Removes all the s m a companieses where isActive = &#63; and groupName =
	 * &#63; from the database.
	 * 
	 * @param isActive
	 *            the is active
	 * @param groupName
	 *            the group name
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public void removeBySMACompanyListByGroupName(int isActive,
			java.lang.String groupName)
			throws com.liferay.portal.kernel.exception.SystemException {
		SMACompaniesUtil.removeBySMACompanyListByGroupName(isActive, groupName);
	}

	/**
	 * Removes all the s m a companieses from the database.
	 * 
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public void removeAll()
			throws com.liferay.portal.kernel.exception.SystemException {
		SMACompaniesUtil.removeAll();
	}

	/**
	 * Returns the number of s m a companieses where isActive = &#63; and
	 * createdBy = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param createdBy
	 *            the created by
	 * @return the number of matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countByGetAllCompanies(int isActive, java.lang.String createdBy)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.countByGetAllCompanies(isActive, createdBy);
	}

	/**
	 * Returns the number of s m a companieses where isActive = &#63; and
	 * customerId = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param customerId
	 *            the customer ID
	 * @return the number of matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countBySMACompanyListByCustomerId(int isActive, long customerId)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.countBySMACompanyListByCustomerId(isActive,
				customerId);
	}

	/**
	 * Returns the number of s m a companieses where isActive = &#63; and
	 * domains = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param domains
	 *            the domains
	 * @return the number of matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countBySMACompanyListByDomains(int isActive,
			java.lang.String domains)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.countBySMACompanyListByDomains(isActive,
				domains);
	}

	/**
	 * Returns the number of s m a companieses where isActive = &#63; and
	 * groupName = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param groupName
	 *            the group name
	 * @return the number of matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countBySMACompanyListByGroupName(int isActive,
			java.lang.String groupName)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.countBySMACompanyListByGroupName(isActive,
				groupName);
	}

	/**
	 * Returns the number of s m a companieses where isActive = &#63; and
	 * customerId = &#63; and domains = &#63;.
	 * 
	 * @param isActive
	 *            the is active
	 * @param customerId
	 *            the customer ID
	 * @param domains
	 *            the domains
	 * @return the number of matching s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countBySMACompanyListByCustomerIdDomains(int isActive,
			long customerId, java.lang.String domains)
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.countBySMACompanyListByCustomerIdDomains(
				isActive, customerId, domains);
	}

	/**
	 * Returns the number of s m a companieses.
	 * 
	 * @return the number of s m a companieses
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public int countAll()
			throws com.liferay.portal.kernel.exception.SystemException {
		return SMACompaniesUtil.countAll();
	}

}