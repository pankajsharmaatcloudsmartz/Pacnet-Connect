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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.pacnet.connect.model.SMACompanies;

import java.util.List;

/**
 * The persistence utility for the s m a companies service. This utility wraps {@link SMACompaniesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMACompaniesPersistence
 * @see SMACompaniesPersistenceImpl
 * @generated
 */
public class SMACompaniesUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(SMACompanies smaCompanies) {
		getPersistence().clearCache(smaCompanies);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SMACompanies> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SMACompanies> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SMACompanies> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static SMACompanies update(SMACompanies smaCompanies, boolean merge)
		throws SystemException {
		return getPersistence().update(smaCompanies, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static SMACompanies update(SMACompanies smaCompanies, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(smaCompanies, merge, serviceContext);
	}

	/**
	* Caches the s m a companies in the entity cache if it is enabled.
	*
	* @param smaCompanies the s m a companies
	*/
	public static void cacheResult(
		com.pacnet.connect.model.SMACompanies smaCompanies) {
		getPersistence().cacheResult(smaCompanies);
	}

	/**
	* Caches the s m a companieses in the entity cache if it is enabled.
	*
	* @param smaCompanieses the s m a companieses
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.SMACompanies> smaCompanieses) {
		getPersistence().cacheResult(smaCompanieses);
	}

	/**
	* Creates a new s m a companies with the primary key. Does not add the s m a companies to the database.
	*
	* @param id the primary key for the new s m a companies
	* @return the new s m a companies
	*/
	public static com.pacnet.connect.model.SMACompanies create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the s m a companies with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a companies
	* @return the s m a companies that was removed
	* @throws com.pacnet.connect.NoSuchSMACompaniesException if a s m a companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanies remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.SMACompanies updateImpl(
		com.pacnet.connect.model.SMACompanies smaCompanies, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(smaCompanies, merge);
	}

	/**
	* Returns the s m a companies with the primary key or throws a {@link com.pacnet.connect.NoSuchSMACompaniesException} if it could not be found.
	*
	* @param id the primary key of the s m a companies
	* @return the s m a companies
	* @throws com.pacnet.connect.NoSuchSMACompaniesException if a s m a companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanies findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the s m a companies with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s m a companies
	* @return the s m a companies, or <code>null</code> if a s m a companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanies fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the s m a companieses where isActive = &#63; and createdBy = &#63;.
	*
	* @param isActive the is active
	* @param createdBy the created by
	* @return the matching s m a companieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findByGetAllCompanies(
		int isActive, java.lang.String createdBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGetAllCompanies(isActive, createdBy);
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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findByGetAllCompanies(
		int isActive, java.lang.String createdBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGetAllCompanies(isActive, createdBy, start, end);
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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findByGetAllCompanies(
		int isActive, java.lang.String createdBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGetAllCompanies(isActive, createdBy, start, end,
			orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies findByGetAllCompanies_First(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence()
				   .findByGetAllCompanies_First(isActive, createdBy,
			orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies fetchByGetAllCompanies_First(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGetAllCompanies_First(isActive, createdBy,
			orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies findByGetAllCompanies_Last(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence()
				   .findByGetAllCompanies_Last(isActive, createdBy,
			orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies fetchByGetAllCompanies_Last(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGetAllCompanies_Last(isActive, createdBy,
			orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies[] findByGetAllCompanies_PrevAndNext(
		long id, int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence()
				   .findByGetAllCompanies_PrevAndNext(id, isActive, createdBy,
			orderByComparator);
	}

	/**
	* Returns all the s m a companieses where isActive = &#63; and customerId = &#63;.
	*
	* @param isActive the is active
	* @param customerId the customer ID
	* @return the matching s m a companieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByCustomerId(
		int isActive, long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMACompanyListByCustomerId(isActive, customerId);
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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByCustomerId(
		int isActive, long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMACompanyListByCustomerId(isActive, customerId,
			start, end);
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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByCustomerId(
		int isActive, long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMACompanyListByCustomerId(isActive, customerId,
			start, end, orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies findBySMACompanyListByCustomerId_First(
		int isActive, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence()
				   .findBySMACompanyListByCustomerId_First(isActive,
			customerId, orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByCustomerId_First(
		int isActive, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMACompanyListByCustomerId_First(isActive,
			customerId, orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies findBySMACompanyListByCustomerId_Last(
		int isActive, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence()
				   .findBySMACompanyListByCustomerId_Last(isActive, customerId,
			orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByCustomerId_Last(
		int isActive, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMACompanyListByCustomerId_Last(isActive,
			customerId, orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies[] findBySMACompanyListByCustomerId_PrevAndNext(
		long id, int isActive, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence()
				   .findBySMACompanyListByCustomerId_PrevAndNext(id, isActive,
			customerId, orderByComparator);
	}

	/**
	* Returns all the s m a companieses where isActive = &#63; and domains = &#63;.
	*
	* @param isActive the is active
	* @param domains the domains
	* @return the matching s m a companieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByDomains(
		int isActive, java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySMACompanyListByDomains(isActive, domains);
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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByDomains(
		int isActive, java.lang.String domains, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMACompanyListByDomains(isActive, domains, start, end);
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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByDomains(
		int isActive, java.lang.String domains, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMACompanyListByDomains(isActive, domains, start,
			end, orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies findBySMACompanyListByDomains_First(
		int isActive, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence()
				   .findBySMACompanyListByDomains_First(isActive, domains,
			orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByDomains_First(
		int isActive, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMACompanyListByDomains_First(isActive, domains,
			orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies findBySMACompanyListByDomains_Last(
		int isActive, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence()
				   .findBySMACompanyListByDomains_Last(isActive, domains,
			orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByDomains_Last(
		int isActive, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMACompanyListByDomains_Last(isActive, domains,
			orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies[] findBySMACompanyListByDomains_PrevAndNext(
		long id, int isActive, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence()
				   .findBySMACompanyListByDomains_PrevAndNext(id, isActive,
			domains, orderByComparator);
	}

	/**
	* Returns all the s m a companieses where isActive = &#63; and groupName = &#63;.
	*
	* @param isActive the is active
	* @param groupName the group name
	* @return the matching s m a companieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByGroupName(
		int isActive, java.lang.String groupName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMACompanyListByGroupName(isActive, groupName);
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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByGroupName(
		int isActive, java.lang.String groupName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMACompanyListByGroupName(isActive, groupName, start,
			end);
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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByGroupName(
		int isActive, java.lang.String groupName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMACompanyListByGroupName(isActive, groupName, start,
			end, orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies findBySMACompanyListByGroupName_First(
		int isActive, java.lang.String groupName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence()
				   .findBySMACompanyListByGroupName_First(isActive, groupName,
			orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByGroupName_First(
		int isActive, java.lang.String groupName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMACompanyListByGroupName_First(isActive, groupName,
			orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies findBySMACompanyListByGroupName_Last(
		int isActive, java.lang.String groupName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence()
				   .findBySMACompanyListByGroupName_Last(isActive, groupName,
			orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByGroupName_Last(
		int isActive, java.lang.String groupName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMACompanyListByGroupName_Last(isActive, groupName,
			orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies[] findBySMACompanyListByGroupName_PrevAndNext(
		long id, int isActive, java.lang.String groupName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence()
				   .findBySMACompanyListByGroupName_PrevAndNext(id, isActive,
			groupName, orderByComparator);
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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByCustomerIdDomains(
		int isActive, long customerId, java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMACompanyListByCustomerIdDomains(isActive,
			customerId, domains);
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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByCustomerIdDomains(
		int isActive, long customerId, java.lang.String domains, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMACompanyListByCustomerIdDomains(isActive,
			customerId, domains, start, end);
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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByCustomerIdDomains(
		int isActive, long customerId, java.lang.String domains, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMACompanyListByCustomerIdDomains(isActive,
			customerId, domains, start, end, orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies findBySMACompanyListByCustomerIdDomains_First(
		int isActive, long customerId, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence()
				   .findBySMACompanyListByCustomerIdDomains_First(isActive,
			customerId, domains, orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByCustomerIdDomains_First(
		int isActive, long customerId, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMACompanyListByCustomerIdDomains_First(isActive,
			customerId, domains, orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies findBySMACompanyListByCustomerIdDomains_Last(
		int isActive, long customerId, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence()
				   .findBySMACompanyListByCustomerIdDomains_Last(isActive,
			customerId, domains, orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByCustomerIdDomains_Last(
		int isActive, long customerId, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMACompanyListByCustomerIdDomains_Last(isActive,
			customerId, domains, orderByComparator);
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
	public static com.pacnet.connect.model.SMACompanies[] findBySMACompanyListByCustomerIdDomains_PrevAndNext(
		long id, int isActive, long customerId, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getPersistence()
				   .findBySMACompanyListByCustomerIdDomains_PrevAndNext(id,
			isActive, customerId, domains, orderByComparator);
	}

	/**
	* Returns all the s m a companieses.
	*
	* @return the s m a companieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the s m a companieses where isActive = &#63; and createdBy = &#63; from the database.
	*
	* @param isActive the is active
	* @param createdBy the created by
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGetAllCompanies(int isActive,
		java.lang.String createdBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGetAllCompanies(isActive, createdBy);
	}

	/**
	* Removes all the s m a companieses where isActive = &#63; and customerId = &#63; from the database.
	*
	* @param isActive the is active
	* @param customerId the customer ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySMACompanyListByCustomerId(int isActive,
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySMACompanyListByCustomerId(isActive, customerId);
	}

	/**
	* Removes all the s m a companieses where isActive = &#63; and domains = &#63; from the database.
	*
	* @param isActive the is active
	* @param domains the domains
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySMACompanyListByDomains(int isActive,
		java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySMACompanyListByDomains(isActive, domains);
	}

	/**
	* Removes all the s m a companieses where isActive = &#63; and groupName = &#63; from the database.
	*
	* @param isActive the is active
	* @param groupName the group name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySMACompanyListByGroupName(int isActive,
		java.lang.String groupName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySMACompanyListByGroupName(isActive, groupName);
	}

	/**
	* Removes all the s m a companieses where isActive = &#63; and customerId = &#63; and domains = &#63; from the database.
	*
	* @param isActive the is active
	* @param customerId the customer ID
	* @param domains the domains
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySMACompanyListByCustomerIdDomains(int isActive,
		long customerId, java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBySMACompanyListByCustomerIdDomains(isActive, customerId,
			domains);
	}

	/**
	* Removes all the s m a companieses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of s m a companieses where isActive = &#63; and createdBy = &#63;.
	*
	* @param isActive the is active
	* @param createdBy the created by
	* @return the number of matching s m a companieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGetAllCompanies(int isActive,
		java.lang.String createdBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGetAllCompanies(isActive, createdBy);
	}

	/**
	* Returns the number of s m a companieses where isActive = &#63; and customerId = &#63;.
	*
	* @param isActive the is active
	* @param customerId the customer ID
	* @return the number of matching s m a companieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySMACompanyListByCustomerId(int isActive,
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBySMACompanyListByCustomerId(isActive, customerId);
	}

	/**
	* Returns the number of s m a companieses where isActive = &#63; and domains = &#63;.
	*
	* @param isActive the is active
	* @param domains the domains
	* @return the number of matching s m a companieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySMACompanyListByDomains(int isActive,
		java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySMACompanyListByDomains(isActive, domains);
	}

	/**
	* Returns the number of s m a companieses where isActive = &#63; and groupName = &#63;.
	*
	* @param isActive the is active
	* @param groupName the group name
	* @return the number of matching s m a companieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySMACompanyListByGroupName(int isActive,
		java.lang.String groupName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBySMACompanyListByGroupName(isActive, groupName);
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
	public static int countBySMACompanyListByCustomerIdDomains(int isActive,
		long customerId, java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBySMACompanyListByCustomerIdDomains(isActive,
			customerId, domains);
	}

	/**
	* Returns the number of s m a companieses.
	*
	* @return the number of s m a companieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SMACompaniesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SMACompaniesPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					SMACompaniesPersistence.class.getName());

			ReferenceRegistry.registerReference(SMACompaniesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(SMACompaniesPersistence persistence) {
	}

	private static SMACompaniesPersistence _persistence;
}