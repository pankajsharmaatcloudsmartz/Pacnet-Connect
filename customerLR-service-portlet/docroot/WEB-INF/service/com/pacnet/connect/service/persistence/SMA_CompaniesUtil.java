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

import com.pacnet.connect.model.SMA_Companies;

import java.util.List;

/**
 * The persistence utility for the s m a_ companies service. This utility wraps {@link SMA_CompaniesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMA_CompaniesPersistence
 * @see SMA_CompaniesPersistenceImpl
 * @generated
 */
public class SMA_CompaniesUtil {
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
	public static void clearCache(SMA_Companies sma_Companies) {
		getPersistence().clearCache(sma_Companies);
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
	public static List<SMA_Companies> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SMA_Companies> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SMA_Companies> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static SMA_Companies update(SMA_Companies sma_Companies,
		boolean merge) throws SystemException {
		return getPersistence().update(sma_Companies, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static SMA_Companies update(SMA_Companies sma_Companies,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(sma_Companies, merge, serviceContext);
	}

	/**
	* Caches the s m a_ companies in the entity cache if it is enabled.
	*
	* @param sma_Companies the s m a_ companies
	*/
	public static void cacheResult(
		com.pacnet.connect.model.SMA_Companies sma_Companies) {
		getPersistence().cacheResult(sma_Companies);
	}

	/**
	* Caches the s m a_ companieses in the entity cache if it is enabled.
	*
	* @param sma_Companieses the s m a_ companieses
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.SMA_Companies> sma_Companieses) {
		getPersistence().cacheResult(sma_Companieses);
	}

	/**
	* Creates a new s m a_ companies with the primary key. Does not add the s m a_ companies to the database.
	*
	* @param id the primary key for the new s m a_ companies
	* @return the new s m a_ companies
	*/
	public static com.pacnet.connect.model.SMA_Companies create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the s m a_ companies with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a_ companies
	* @return the s m a_ companies that was removed
	* @throws com.pacnet.connect.NoSuchSMA_CompaniesException if a s m a_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_Companies remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_CompaniesException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.SMA_Companies updateImpl(
		com.pacnet.connect.model.SMA_Companies sma_Companies, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(sma_Companies, merge);
	}

	/**
	* Returns the s m a_ companies with the primary key or throws a {@link com.pacnet.connect.NoSuchSMA_CompaniesException} if it could not be found.
	*
	* @param id the primary key of the s m a_ companies
	* @return the s m a_ companies
	* @throws com.pacnet.connect.NoSuchSMA_CompaniesException if a s m a_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_Companies findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_CompaniesException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the s m a_ companies with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s m a_ companies
	* @return the s m a_ companies, or <code>null</code> if a s m a_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_Companies fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the s m a_ companieses where customer_id = &#63;.
	*
	* @param customer_id the customer_id
	* @return the matching s m a_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMA_Companies> findBySMACompanyListByCustomerId(
		long customer_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySMACompanyListByCustomerId(customer_id);
	}

	/**
	* Returns a range of all the s m a_ companieses where customer_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customer_id the customer_id
	* @param start the lower bound of the range of s m a_ companieses
	* @param end the upper bound of the range of s m a_ companieses (not inclusive)
	* @return the range of matching s m a_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMA_Companies> findBySMACompanyListByCustomerId(
		long customer_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMACompanyListByCustomerId(customer_id, start, end);
	}

	/**
	* Returns an ordered range of all the s m a_ companieses where customer_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customer_id the customer_id
	* @param start the lower bound of the range of s m a_ companieses
	* @param end the upper bound of the range of s m a_ companieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMA_Companies> findBySMACompanyListByCustomerId(
		long customer_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMACompanyListByCustomerId(customer_id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first s m a_ companies in the ordered set where customer_id = &#63;.
	*
	* @param customer_id the customer_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a_ companies
	* @throws com.pacnet.connect.NoSuchSMA_CompaniesException if a matching s m a_ companies could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_Companies findBySMACompanyListByCustomerId_First(
		long customer_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_CompaniesException {
		return getPersistence()
				   .findBySMACompanyListByCustomerId_First(customer_id,
			orderByComparator);
	}

	/**
	* Returns the first s m a_ companies in the ordered set where customer_id = &#63;.
	*
	* @param customer_id the customer_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a_ companies, or <code>null</code> if a matching s m a_ companies could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_Companies fetchBySMACompanyListByCustomerId_First(
		long customer_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMACompanyListByCustomerId_First(customer_id,
			orderByComparator);
	}

	/**
	* Returns the last s m a_ companies in the ordered set where customer_id = &#63;.
	*
	* @param customer_id the customer_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a_ companies
	* @throws com.pacnet.connect.NoSuchSMA_CompaniesException if a matching s m a_ companies could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_Companies findBySMACompanyListByCustomerId_Last(
		long customer_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_CompaniesException {
		return getPersistence()
				   .findBySMACompanyListByCustomerId_Last(customer_id,
			orderByComparator);
	}

	/**
	* Returns the last s m a_ companies in the ordered set where customer_id = &#63;.
	*
	* @param customer_id the customer_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a_ companies, or <code>null</code> if a matching s m a_ companies could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_Companies fetchBySMACompanyListByCustomerId_Last(
		long customer_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMACompanyListByCustomerId_Last(customer_id,
			orderByComparator);
	}

	/**
	* Returns the s m a_ companieses before and after the current s m a_ companies in the ordered set where customer_id = &#63;.
	*
	* @param id the primary key of the current s m a_ companies
	* @param customer_id the customer_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a_ companies
	* @throws com.pacnet.connect.NoSuchSMA_CompaniesException if a s m a_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_Companies[] findBySMACompanyListByCustomerId_PrevAndNext(
		long id, long customer_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_CompaniesException {
		return getPersistence()
				   .findBySMACompanyListByCustomerId_PrevAndNext(id,
			customer_id, orderByComparator);
	}

	/**
	* Returns all the s m a_ companieses.
	*
	* @return the s m a_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMA_Companies> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the s m a_ companieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a_ companieses
	* @param end the upper bound of the range of s m a_ companieses (not inclusive)
	* @return the range of s m a_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMA_Companies> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the s m a_ companieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a_ companieses
	* @param end the upper bound of the range of s m a_ companieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s m a_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMA_Companies> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the s m a_ companieses where customer_id = &#63; from the database.
	*
	* @param customer_id the customer_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySMACompanyListByCustomerId(long customer_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySMACompanyListByCustomerId(customer_id);
	}

	/**
	* Removes all the s m a_ companieses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of s m a_ companieses where customer_id = &#63;.
	*
	* @param customer_id the customer_id
	* @return the number of matching s m a_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySMACompanyListByCustomerId(long customer_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySMACompanyListByCustomerId(customer_id);
	}

	/**
	* Returns the number of s m a_ companieses.
	*
	* @return the number of s m a_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SMA_CompaniesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SMA_CompaniesPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					SMA_CompaniesPersistence.class.getName());

			ReferenceRegistry.registerReference(SMA_CompaniesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(SMA_CompaniesPersistence persistence) {
	}

	private static SMA_CompaniesPersistence _persistence;
}