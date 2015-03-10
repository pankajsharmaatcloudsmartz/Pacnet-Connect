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

import com.pacnet.connect.model.SMAAdmins;

import java.util.List;

/**
 * The persistence utility for the s m a admins service. This utility wraps {@link SMAAdminsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMAAdminsPersistence
 * @see SMAAdminsPersistenceImpl
 * @generated
 */
public class SMAAdminsUtil {
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
	public static void clearCache(SMAAdmins smaAdmins) {
		getPersistence().clearCache(smaAdmins);
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
	public static List<SMAAdmins> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SMAAdmins> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SMAAdmins> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static SMAAdmins update(SMAAdmins smaAdmins, boolean merge)
		throws SystemException {
		return getPersistence().update(smaAdmins, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static SMAAdmins update(SMAAdmins smaAdmins, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(smaAdmins, merge, serviceContext);
	}

	/**
	* Caches the s m a admins in the entity cache if it is enabled.
	*
	* @param smaAdmins the s m a admins
	*/
	public static void cacheResult(com.pacnet.connect.model.SMAAdmins smaAdmins) {
		getPersistence().cacheResult(smaAdmins);
	}

	/**
	* Caches the s m a adminses in the entity cache if it is enabled.
	*
	* @param smaAdminses the s m a adminses
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.SMAAdmins> smaAdminses) {
		getPersistence().cacheResult(smaAdminses);
	}

	/**
	* Creates a new s m a admins with the primary key. Does not add the s m a admins to the database.
	*
	* @param id the primary key for the new s m a admins
	* @return the new s m a admins
	*/
	public static com.pacnet.connect.model.SMAAdmins create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the s m a admins with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a admins
	* @return the s m a admins that was removed
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a s m a admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.SMAAdmins updateImpl(
		com.pacnet.connect.model.SMAAdmins smaAdmins, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(smaAdmins, merge);
	}

	/**
	* Returns the s m a admins with the primary key or throws a {@link com.pacnet.connect.NoSuchSMAAdminsException} if it could not be found.
	*
	* @param id the primary key of the s m a admins
	* @return the s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException if a s m a admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the s m a admins with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s m a admins
	* @return the s m a admins, or <code>null</code> if a s m a admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the s m a adminses where isActive = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param companyId the company ID
	* @return the matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByCompanyId(
		int isActive, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAAdminsListByCompanyId(isActive, companyId);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByCompanyId(
		int isActive, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAAdminsListByCompanyId(isActive, companyId, start,
			end);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByCompanyId(
		int isActive, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAAdminsListByCompanyId(isActive, companyId, start,
			end, orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByCompanyId_First(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getPersistence()
				   .findBySMAAdminsListByCompanyId_First(isActive, companyId,
			orderByComparator);
	}

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByCompanyId_First(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMAAdminsListByCompanyId_First(isActive, companyId,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByCompanyId_Last(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getPersistence()
				   .findBySMAAdminsListByCompanyId_Last(isActive, companyId,
			orderByComparator);
	}

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByCompanyId_Last(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMAAdminsListByCompanyId_Last(isActive, companyId,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMAAdmins[] findBySMAAdminsListByCompanyId_PrevAndNext(
		long id, int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getPersistence()
				   .findBySMAAdminsListByCompanyId_PrevAndNext(id, isActive,
			companyId, orderByComparator);
	}

	/**
	* Returns all the s m a adminses where isActive = &#63; and userId = &#63;.
	*
	* @param isActive the is active
	* @param userId the user ID
	* @return the matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByUserId(
		int isActive, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySMAAdminsListByUserId(isActive, userId);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByUserId(
		int isActive, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAAdminsListByUserId(isActive, userId, start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByUserId(
		int isActive, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAAdminsListByUserId(isActive, userId, start, end,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByUserId_First(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getPersistence()
				   .findBySMAAdminsListByUserId_First(isActive, userId,
			orderByComparator);
	}

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63; and userId = &#63;.
	*
	* @param isActive the is active
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByUserId_First(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMAAdminsListByUserId_First(isActive, userId,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByUserId_Last(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getPersistence()
				   .findBySMAAdminsListByUserId_Last(isActive, userId,
			orderByComparator);
	}

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63; and userId = &#63;.
	*
	* @param isActive the is active
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByUserId_Last(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMAAdminsListByUserId_Last(isActive, userId,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMAAdmins[] findBySMAAdminsListByUserId_PrevAndNext(
		long id, int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getPersistence()
				   .findBySMAAdminsListByUserId_PrevAndNext(id, isActive,
			userId, orderByComparator);
	}

	/**
	* Returns all the s m a adminses where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @return the matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckId(
		int isActive, long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAAdminsListByRadcheckId(isActive, radcheckId);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckId(
		int isActive, long radcheckId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAAdminsListByRadcheckId(isActive, radcheckId,
			start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckId(
		int isActive, long radcheckId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAAdminsListByRadcheckId(isActive, radcheckId,
			start, end, orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByRadcheckId_First(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getPersistence()
				   .findBySMAAdminsListByRadcheckId_First(isActive, radcheckId,
			orderByComparator);
	}

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByRadcheckId_First(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMAAdminsListByRadcheckId_First(isActive,
			radcheckId, orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByRadcheckId_Last(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getPersistence()
				   .findBySMAAdminsListByRadcheckId_Last(isActive, radcheckId,
			orderByComparator);
	}

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a admins, or <code>null</code> if a matching s m a admins could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByRadcheckId_Last(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMAAdminsListByRadcheckId_Last(isActive, radcheckId,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMAAdmins[] findBySMAAdminsListByRadcheckId_PrevAndNext(
		long id, int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getPersistence()
				   .findBySMAAdminsListByRadcheckId_PrevAndNext(id, isActive,
			radcheckId, orderByComparator);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckIdUserIdCompanyId(
		int isActive, long radcheckId, long userId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAAdminsListByRadcheckIdUserIdCompanyId(isActive,
			radcheckId, userId, companyId);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckIdUserIdCompanyId(
		int isActive, long radcheckId, long userId, long companyId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAAdminsListByRadcheckIdUserIdCompanyId(isActive,
			radcheckId, userId, companyId, start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckIdUserIdCompanyId(
		int isActive, long radcheckId, long userId, long companyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAAdminsListByRadcheckIdUserIdCompanyId(isActive,
			radcheckId, userId, companyId, start, end, orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByRadcheckIdUserIdCompanyId_First(
		int isActive, long radcheckId, long userId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getPersistence()
				   .findBySMAAdminsListByRadcheckIdUserIdCompanyId_First(isActive,
			radcheckId, userId, companyId, orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByRadcheckIdUserIdCompanyId_First(
		int isActive, long radcheckId, long userId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMAAdminsListByRadcheckIdUserIdCompanyId_First(isActive,
			radcheckId, userId, companyId, orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByRadcheckIdUserIdCompanyId_Last(
		int isActive, long radcheckId, long userId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getPersistence()
				   .findBySMAAdminsListByRadcheckIdUserIdCompanyId_Last(isActive,
			radcheckId, userId, companyId, orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByRadcheckIdUserIdCompanyId_Last(
		int isActive, long radcheckId, long userId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMAAdminsListByRadcheckIdUserIdCompanyId_Last(isActive,
			radcheckId, userId, companyId, orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMAAdmins[] findBySMAAdminsListByRadcheckIdUserIdCompanyId_PrevAndNext(
		long id, int isActive, long radcheckId, long userId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getPersistence()
				   .findBySMAAdminsListByRadcheckIdUserIdCompanyId_PrevAndNext(id,
			isActive, radcheckId, userId, companyId, orderByComparator);
	}

	/**
	* Returns all the s m a adminses.
	*
	* @return the s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the s m a adminses where isActive = &#63; and companyId = &#63; from the database.
	*
	* @param isActive the is active
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySMAAdminsListByCompanyId(int isActive,
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySMAAdminsListByCompanyId(isActive, companyId);
	}

	/**
	* Removes all the s m a adminses where isActive = &#63; and userId = &#63; from the database.
	*
	* @param isActive the is active
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySMAAdminsListByUserId(int isActive, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySMAAdminsListByUserId(isActive, userId);
	}

	/**
	* Removes all the s m a adminses where isActive = &#63; and radcheckId = &#63; from the database.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySMAAdminsListByRadcheckId(int isActive,
		long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySMAAdminsListByRadcheckId(isActive, radcheckId);
	}

	/**
	* Removes all the s m a adminses where isActive = &#63; and radcheckId = &#63; and userId = &#63; and companyId = &#63; from the database.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param userId the user ID
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySMAAdminsListByRadcheckIdUserIdCompanyId(
		int isActive, long radcheckId, long userId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBySMAAdminsListByRadcheckIdUserIdCompanyId(isActive,
			radcheckId, userId, companyId);
	}

	/**
	* Removes all the s m a adminses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of s m a adminses where isActive = &#63; and companyId = &#63;.
	*
	* @param isActive the is active
	* @param companyId the company ID
	* @return the number of matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySMAAdminsListByCompanyId(int isActive,
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBySMAAdminsListByCompanyId(isActive, companyId);
	}

	/**
	* Returns the number of s m a adminses where isActive = &#63; and userId = &#63;.
	*
	* @param isActive the is active
	* @param userId the user ID
	* @return the number of matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySMAAdminsListByUserId(int isActive, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySMAAdminsListByUserId(isActive, userId);
	}

	/**
	* Returns the number of s m a adminses where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @return the number of matching s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySMAAdminsListByRadcheckId(int isActive,
		long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBySMAAdminsListByRadcheckId(isActive, radcheckId);
	}

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
	public static int countBySMAAdminsListByRadcheckIdUserIdCompanyId(
		int isActive, long radcheckId, long userId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBySMAAdminsListByRadcheckIdUserIdCompanyId(isActive,
			radcheckId, userId, companyId);
	}

	/**
	* Returns the number of s m a adminses.
	*
	* @return the number of s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SMAAdminsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SMAAdminsPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					SMAAdminsPersistence.class.getName());

			ReferenceRegistry.registerReference(SMAAdminsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(SMAAdminsPersistence persistence) {
	}

	private static SMAAdminsPersistence _persistence;
}