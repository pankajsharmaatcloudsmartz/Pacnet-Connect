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

import com.liferay.portal.service.persistence.BasePersistence;

import com.pacnet.connect.model.SMA_Companies;

/**
 * The persistence interface for the s m a_ companies service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMA_CompaniesPersistenceImpl
 * @see SMA_CompaniesUtil
 * @generated
 */
public interface SMA_CompaniesPersistence extends BasePersistence<SMA_Companies> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SMA_CompaniesUtil} to access the s m a_ companies persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the s m a_ companies in the entity cache if it is enabled.
	*
	* @param sma_Companies the s m a_ companies
	*/
	public void cacheResult(
		com.pacnet.connect.model.SMA_Companies sma_Companies);

	/**
	* Caches the s m a_ companieses in the entity cache if it is enabled.
	*
	* @param sma_Companieses the s m a_ companieses
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SMA_Companies> sma_Companieses);

	/**
	* Creates a new s m a_ companies with the primary key. Does not add the s m a_ companies to the database.
	*
	* @param id the primary key for the new s m a_ companies
	* @return the new s m a_ companies
	*/
	public com.pacnet.connect.model.SMA_Companies create(long id);

	/**
	* Removes the s m a_ companies with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a_ companies
	* @return the s m a_ companies that was removed
	* @throws com.pacnet.connect.NoSuchSMA_CompaniesException if a s m a_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Companies remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_CompaniesException;

	public com.pacnet.connect.model.SMA_Companies updateImpl(
		com.pacnet.connect.model.SMA_Companies sma_Companies, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a_ companies with the primary key or throws a {@link com.pacnet.connect.NoSuchSMA_CompaniesException} if it could not be found.
	*
	* @param id the primary key of the s m a_ companies
	* @return the s m a_ companies
	* @throws com.pacnet.connect.NoSuchSMA_CompaniesException if a s m a_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Companies findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_CompaniesException;

	/**
	* Returns the s m a_ companies with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s m a_ companies
	* @return the s m a_ companies, or <code>null</code> if a s m a_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Companies fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the s m a_ companieses where customer_id = &#63;.
	*
	* @param customer_id the customer_id
	* @return the matching s m a_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_Companies> findBySMACompanyListByCustomerId(
		long customer_id)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.SMA_Companies> findBySMACompanyListByCustomerId(
		long customer_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.SMA_Companies> findBySMACompanyListByCustomerId(
		long customer_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a_ companies in the ordered set where customer_id = &#63;.
	*
	* @param customer_id the customer_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a_ companies
	* @throws com.pacnet.connect.NoSuchSMA_CompaniesException if a matching s m a_ companies could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Companies findBySMACompanyListByCustomerId_First(
		long customer_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_CompaniesException;

	/**
	* Returns the first s m a_ companies in the ordered set where customer_id = &#63;.
	*
	* @param customer_id the customer_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a_ companies, or <code>null</code> if a matching s m a_ companies could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Companies fetchBySMACompanyListByCustomerId_First(
		long customer_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a_ companies in the ordered set where customer_id = &#63;.
	*
	* @param customer_id the customer_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a_ companies
	* @throws com.pacnet.connect.NoSuchSMA_CompaniesException if a matching s m a_ companies could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Companies findBySMACompanyListByCustomerId_Last(
		long customer_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_CompaniesException;

	/**
	* Returns the last s m a_ companies in the ordered set where customer_id = &#63;.
	*
	* @param customer_id the customer_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a_ companies, or <code>null</code> if a matching s m a_ companies could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Companies fetchBySMACompanyListByCustomerId_Last(
		long customer_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.SMA_Companies[] findBySMACompanyListByCustomerId_PrevAndNext(
		long id, long customer_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_CompaniesException;

	/**
	* Returns all the s m a_ companieses.
	*
	* @return the s m a_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_Companies> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.SMA_Companies> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.SMA_Companies> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a_ companieses where customer_id = &#63; from the database.
	*
	* @param customer_id the customer_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMACompanyListByCustomerId(long customer_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a_ companieses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a_ companieses where customer_id = &#63;.
	*
	* @param customer_id the customer_id
	* @return the number of matching s m a_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMACompanyListByCustomerId(long customer_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a_ companieses.
	*
	* @return the number of s m a_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}