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

import com.pacnet.connect.model.SMACompanyList;

/**
 * The persistence interface for the s m a company list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMACompanyListPersistenceImpl
 * @see SMACompanyListUtil
 * @generated
 */
public interface SMACompanyListPersistence extends BasePersistence<SMACompanyList> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SMACompanyListUtil} to access the s m a company list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the s m a company list in the entity cache if it is enabled.
	*
	* @param smaCompanyList the s m a company list
	*/
	public void cacheResult(
		com.pacnet.connect.model.SMACompanyList smaCompanyList);

	/**
	* Caches the s m a company lists in the entity cache if it is enabled.
	*
	* @param smaCompanyLists the s m a company lists
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SMACompanyList> smaCompanyLists);

	/**
	* Creates a new s m a company list with the primary key. Does not add the s m a company list to the database.
	*
	* @param id the primary key for the new s m a company list
	* @return the new s m a company list
	*/
	public com.pacnet.connect.model.SMACompanyList create(java.lang.String id);

	/**
	* Removes the s m a company list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a company list
	* @return the s m a company list that was removed
	* @throws com.pacnet.connect.NoSuchSMACompanyListException if a s m a company list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList remove(java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException;

	public com.pacnet.connect.model.SMACompanyList updateImpl(
		com.pacnet.connect.model.SMACompanyList smaCompanyList, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a company list with the primary key or throws a {@link com.pacnet.connect.NoSuchSMACompanyListException} if it could not be found.
	*
	* @param id the primary key of the s m a company list
	* @return the s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException if a s m a company list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList findByPrimaryKey(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException;

	/**
	* Returns the s m a company list with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s m a company list
	* @return the s m a company list, or <code>null</code> if a s m a company list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList fetchByPrimaryKey(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the s m a company lists where adminUserId = &#63;.
	*
	* @param adminUserId the admin user ID
	* @return the matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByAdminUserId(
		long adminUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a company lists where adminUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param adminUserId the admin user ID
	* @param start the lower bound of the range of s m a company lists
	* @param end the upper bound of the range of s m a company lists (not inclusive)
	* @return the range of matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByAdminUserId(
		long adminUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a company lists where adminUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param adminUserId the admin user ID
	* @param start the lower bound of the range of s m a company lists
	* @param end the upper bound of the range of s m a company lists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByAdminUserId(
		long adminUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a company list in the ordered set where adminUserId = &#63;.
	*
	* @param adminUserId the admin user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByAdminUserId_First(
		long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException;

	/**
	* Returns the first s m a company list in the ordered set where adminUserId = &#63;.
	*
	* @param adminUserId the admin user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByAdminUserId_First(
		long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a company list in the ordered set where adminUserId = &#63;.
	*
	* @param adminUserId the admin user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByAdminUserId_Last(
		long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException;

	/**
	* Returns the last s m a company list in the ordered set where adminUserId = &#63;.
	*
	* @param adminUserId the admin user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByAdminUserId_Last(
		long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a company lists before and after the current s m a company list in the ordered set where adminUserId = &#63;.
	*
	* @param id the primary key of the current s m a company list
	* @param adminUserId the admin user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException if a s m a company list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByAdminUserId_PrevAndNext(
		java.lang.String id, long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException;

	/**
	* Returns all the s m a company lists where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a company lists where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of s m a company lists
	* @param end the upper bound of the range of s m a company lists (not inclusive)
	* @return the range of matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a company lists where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of s m a company lists
	* @param end the upper bound of the range of s m a company lists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a company list in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException;

	/**
	* Returns the first s m a company list in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a company list in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException;

	/**
	* Returns the last s m a company list in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a company lists before and after the current s m a company list in the ordered set where companyId = &#63;.
	*
	* @param id the primary key of the current s m a company list
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException if a s m a company list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByCompanyId_PrevAndNext(
		java.lang.String id, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException;

	/**
	* Returns all the s m a company lists where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCustomerId(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a company lists where customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param start the lower bound of the range of s m a company lists
	* @param end the upper bound of the range of s m a company lists (not inclusive)
	* @return the range of matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCustomerId(
		long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a company lists where customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param start the lower bound of the range of s m a company lists
	* @param end the upper bound of the range of s m a company lists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCustomerId(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a company list in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException;

	/**
	* Returns the first s m a company list in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a company list in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException;

	/**
	* Returns the last s m a company list in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a company lists before and after the current s m a company list in the ordered set where customerId = &#63;.
	*
	* @param id the primary key of the current s m a company list
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException if a s m a company list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByCustomerId_PrevAndNext(
		java.lang.String id, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException;

	/**
	* Returns all the s m a company lists where domains = &#63;.
	*
	* @param domains the domains
	* @return the matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByDomains(
		java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a company lists where domains = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param domains the domains
	* @param start the lower bound of the range of s m a company lists
	* @param end the upper bound of the range of s m a company lists (not inclusive)
	* @return the range of matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByDomains(
		java.lang.String domains, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a company lists where domains = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param domains the domains
	* @param start the lower bound of the range of s m a company lists
	* @param end the upper bound of the range of s m a company lists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByDomains(
		java.lang.String domains, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a company list in the ordered set where domains = &#63;.
	*
	* @param domains the domains
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByDomains_First(
		java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException;

	/**
	* Returns the first s m a company list in the ordered set where domains = &#63;.
	*
	* @param domains the domains
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByDomains_First(
		java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a company list in the ordered set where domains = &#63;.
	*
	* @param domains the domains
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByDomains_Last(
		java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException;

	/**
	* Returns the last s m a company list in the ordered set where domains = &#63;.
	*
	* @param domains the domains
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a company list, or <code>null</code> if a matching s m a company list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByDomains_Last(
		java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a company lists before and after the current s m a company list in the ordered set where domains = &#63;.
	*
	* @param id the primary key of the current s m a company list
	* @param domains the domains
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException if a s m a company list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByDomains_PrevAndNext(
		java.lang.String id, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException;

	/**
	* Returns all the s m a company lists.
	*
	* @return the s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a company lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a company lists
	* @param end the upper bound of the range of s m a company lists (not inclusive)
	* @return the range of s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a company lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a company lists
	* @param end the upper bound of the range of s m a company lists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a company lists where adminUserId = &#63; from the database.
	*
	* @param adminUserId the admin user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMACompanyListByAdminUserId(long adminUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a company lists where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMACompanyListByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a company lists where customerId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMACompanyListByCustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a company lists where domains = &#63; from the database.
	*
	* @param domains the domains
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMACompanyListByDomains(java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a company lists from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a company lists where adminUserId = &#63;.
	*
	* @param adminUserId the admin user ID
	* @return the number of matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMACompanyListByAdminUserId(long adminUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a company lists where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMACompanyListByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a company lists where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the number of matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMACompanyListByCustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a company lists where domains = &#63;.
	*
	* @param domains the domains
	* @return the number of matching s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMACompanyListByDomains(java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a company lists.
	*
	* @return the number of s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}