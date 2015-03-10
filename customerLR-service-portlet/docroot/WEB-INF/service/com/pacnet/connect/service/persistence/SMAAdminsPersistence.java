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

import com.pacnet.connect.model.SMAAdmins;

/**
 * The persistence interface for the s m a admins service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMAAdminsPersistenceImpl
 * @see SMAAdminsUtil
 * @generated
 */
public interface SMAAdminsPersistence extends BasePersistence<SMAAdmins> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SMAAdminsUtil} to access the s m a admins persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the s m a admins in the entity cache if it is enabled.
	*
	* @param smaAdmins the s m a admins
	*/
	public void cacheResult(com.pacnet.connect.model.SMAAdmins smaAdmins);

	/**
	* Caches the s m a adminses in the entity cache if it is enabled.
	*
	* @param smaAdminses the s m a adminses
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SMAAdmins> smaAdminses);

	/**
	* Creates a new s m a admins with the primary key. Does not add the s m a admins to the database.
	*
	* @param id the primary key for the new s m a admins
	* @return the new s m a admins
	*/
	public com.pacnet.connect.model.SMAAdmins create(long id);

	/**
	* Removes the s m a admins with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a admins
	* @return the s m a admins that was removed
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a s m a admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	public com.pacnet.connect.model.SMAAdmins updateImpl(
		com.pacnet.connect.model.SMAAdmins smaAdmins, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a admins with the primary key or throws a {@link com.pacnet.connect.NoSuchSMAAdminsException} if it could not be found.
	*
	* @param id the primary key of the s m a admins
	* @return the s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a s m a admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	/**
	* Returns the s m a admins with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s m a admins
	* @return the s m a admins, or <code>null</code> if a s m a admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the s m a adminses where isActive = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param companyId the company ID
	* @return the matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByCompanyId(
		int isActive, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a adminses where isActive = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param companyId the company ID
	* @param start the lower bound of the range of s m a adminses
	* @param end the upper bound of the range of s m a adminses (not inclusive)
	* @return the range of matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByCompanyId(
		int isActive, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a adminses where isActive = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param companyId the company ID
	* @param start the lower bound of the range of s m a adminses
	* @param end the upper bound of the range of s m a adminses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByCompanyId(
		int isActive, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByCompanyId_First(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByCompanyId_First(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByCompanyId_Last(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByCompanyId_Last(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a adminses before and after the current s m a admins in the ordered set where isActive = &#63; and companyId = &#63;.
	*
	* @param id the primary key of the current s m a admins
	* @param isActive the is active
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a s m a admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins[] findBySMAAdminsListByCompanyId_PrevAndNext(
		long id, int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	/**
	* Returns all the s m a adminses where isActive = &#63; and userId = &#63;.
	*
	* @param isActive the is active
	* @param userId the user ID
	* @return the matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByUserId(
		int isActive, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a adminses where isActive = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param userId the user ID
	* @param start the lower bound of the range of s m a adminses
	* @param end the upper bound of the range of s m a adminses (not inclusive)
	* @return the range of matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByUserId(
		int isActive, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a adminses where isActive = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param userId the user ID
	* @param start the lower bound of the range of s m a adminses
	* @param end the upper bound of the range of s m a adminses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByUserId(
		int isActive, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63; and userId = &#63;.
	*
	* @param isActive the is active
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByUserId_First(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63; and userId = &#63;.
	*
	* @param isActive the is active
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByUserId_First(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63; and userId = &#63;.
	*
	* @param isActive the is active
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByUserId_Last(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63; and userId = &#63;.
	*
	* @param isActive the is active
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByUserId_Last(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a adminses before and after the current s m a admins in the ordered set where isActive = &#63; and userId = &#63;.
	*
	* @param id the primary key of the current s m a admins
	* @param isActive the is active
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a s m a admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins[] findBySMAAdminsListByUserId_PrevAndNext(
		long id, int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	/**
	* Returns all the s m a adminses where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @return the matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckId(
		int isActive, long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a adminses where isActive = &#63; and radcheckId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param start the lower bound of the range of s m a adminses
	* @param end the upper bound of the range of s m a adminses (not inclusive)
	* @return the range of matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckId(
		int isActive, long radcheckId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a adminses where isActive = &#63; and radcheckId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param start the lower bound of the range of s m a adminses
	* @param end the upper bound of the range of s m a adminses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckId(
		int isActive, long radcheckId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByRadcheckId_First(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByRadcheckId_First(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByRadcheckId_Last(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByRadcheckId_Last(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a adminses before and after the current s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63;.
	*
	* @param id the primary key of the current s m a admins
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a s m a admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins[] findBySMAAdminsListByRadcheckId_PrevAndNext(
		long id, int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	/**
	* Returns all the s m a adminses where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param userId the user ID
	* @param companyId the company ID
	* @return the matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckIdUserIdCompanyId(
		int isActive, long radcheckId, long userId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a adminses where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param userId the user ID
	* @param companyId the company ID
	* @param start the lower bound of the range of s m a adminses
	* @param end the upper bound of the range of s m a adminses (not inclusive)
	* @return the range of matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckIdUserIdCompanyId(
		int isActive, long radcheckId, long userId, long companyId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a adminses where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param userId the user ID
	* @param companyId the company ID
	* @param start the lower bound of the range of s m a adminses
	* @param end the upper bound of the range of s m a adminses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckIdUserIdCompanyId(
		int isActive, long radcheckId, long userId, long companyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param userId the user ID
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByRadcheckIdUserIdCompanyId_First(
		int isActive, long radcheckId, long userId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param userId the user ID
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByRadcheckIdUserIdCompanyId_First(
		int isActive, long radcheckId, long userId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param userId the user ID
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByRadcheckIdUserIdCompanyId_Last(
		int isActive, long radcheckId, long userId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param userId the user ID
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByRadcheckIdUserIdCompanyId_Last(
		int isActive, long radcheckId, long userId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a adminses before and after the current s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	*
	* @param id the primary key of the current s m a admins
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param userId the user ID
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a s m a admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins[] findBySMAAdminsListByRadcheckIdUserIdCompanyId_PrevAndNext(
		long id, int isActive, long radcheckId, long userId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	/**
	* Returns all the s m a adminses.
	*
	* @return the s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a adminses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a adminses
	* @param end the upper bound of the range of s m a adminses (not inclusive)
	* @return the range of s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a adminses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a adminses
	* @param end the upper bound of the range of s m a adminses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a adminses where isActive = &#63; and companyId = &#63; from the database.
	*
	* @param isActive the is active
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMAAdminsListByCompanyId(int isActive, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a adminses where isActive = &#63; and userId = &#63; from the database.
	*
	* @param isActive the is active
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMAAdminsListByUserId(int isActive, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a adminses where isActive = &#63; and radcheckId = &#63; from the database.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMAAdminsListByRadcheckId(int isActive, long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a adminses where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63; from the database.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param userId the user ID
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMAAdminsListByRadcheckIdUserIdCompanyId(int isActive,
		long radcheckId, long userId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a adminses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a adminses where isActive = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param companyId the company ID
	* @return the number of matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMAAdminsListByCompanyId(int isActive, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a adminses where isActive = &#63; and userId = &#63;.
	*
	* @param isActive the is active
	* @param userId the user ID
	* @return the number of matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMAAdminsListByUserId(int isActive, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a adminses where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @return the number of matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMAAdminsListByRadcheckId(int isActive, long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a adminses where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param userId the user ID
	* @param companyId the company ID
	* @return the number of matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMAAdminsListByRadcheckIdUserIdCompanyId(int isActive,
		long radcheckId, long userId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a adminses.
	*
	* @return the number of s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}