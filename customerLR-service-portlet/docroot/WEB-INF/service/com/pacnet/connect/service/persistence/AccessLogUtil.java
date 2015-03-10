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

import com.pacnet.connect.model.AccessLog;

import java.util.List;

/**
 * The persistence utility for the access log service. This utility wraps {@link AccessLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see AccessLogPersistence
 * @see AccessLogPersistenceImpl
 * @generated
 */
public class AccessLogUtil {
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
	public static void clearCache(AccessLog accessLog) {
		getPersistence().clearCache(accessLog);
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
	public static List<AccessLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccessLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccessLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static AccessLog update(AccessLog accessLog, boolean merge)
		throws SystemException {
		return getPersistence().update(accessLog, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static AccessLog update(AccessLog accessLog, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(accessLog, merge, serviceContext);
	}

	/**
	* Caches the access log in the entity cache if it is enabled.
	*
	* @param accessLog the access log
	*/
	public static void cacheResult(com.pacnet.connect.model.AccessLog accessLog) {
		getPersistence().cacheResult(accessLog);
	}

	/**
	* Caches the access logs in the entity cache if it is enabled.
	*
	* @param accessLogs the access logs
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.AccessLog> accessLogs) {
		getPersistence().cacheResult(accessLogs);
	}

	/**
	* Creates a new access log with the primary key. Does not add the access log to the database.
	*
	* @param id the primary key for the new access log
	* @return the new access log
	*/
	public static com.pacnet.connect.model.AccessLog create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the access log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access log
	* @return the access log that was removed
	* @throws com.pacnet.connect.NoSuchAccessLogException if a access log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.AccessLog updateImpl(
		com.pacnet.connect.model.AccessLog accessLog, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(accessLog, merge);
	}

	/**
	* Returns the access log with the primary key or throws a {@link com.pacnet.connect.NoSuchAccessLogException} if it could not be found.
	*
	* @param id the primary key of the access log
	* @return the access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a access log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the access log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the access log
	* @return the access log, or <code>null</code> if a access log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the access logs where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAccessLogByAccessRequest(accessRequestId);
	}

	/**
	* Returns a range of all the access logs where accessRequestId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param accessRequestId the access request ID
	* @param start the lower bound of the range of access logs
	* @param end the upper bound of the range of access logs (not inclusive)
	* @return the range of matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByAccessRequest(
		long accessRequestId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessLogByAccessRequest(accessRequestId, start, end);
	}

	/**
	* Returns an ordered range of all the access logs where accessRequestId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param accessRequestId the access request ID
	* @param start the lower bound of the range of access logs
	* @param end the upper bound of the range of access logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByAccessRequest(
		long accessRequestId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessLogByAccessRequest(accessRequestId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first access log in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog findByAccessLogByAccessRequest_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException {
		return getPersistence()
				   .findByAccessLogByAccessRequest_First(accessRequestId,
			orderByComparator);
	}

	/**
	* Returns the first access log in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access log, or <code>null</code> if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog fetchByAccessLogByAccessRequest_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessLogByAccessRequest_First(accessRequestId,
			orderByComparator);
	}

	/**
	* Returns the last access log in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog findByAccessLogByAccessRequest_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException {
		return getPersistence()
				   .findByAccessLogByAccessRequest_Last(accessRequestId,
			orderByComparator);
	}

	/**
	* Returns the last access log in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access log, or <code>null</code> if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog fetchByAccessLogByAccessRequest_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessLogByAccessRequest_Last(accessRequestId,
			orderByComparator);
	}

	/**
	* Returns the access logs before and after the current access log in the ordered set where accessRequestId = &#63;.
	*
	* @param id the primary key of the current access log
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a access log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog[] findByAccessLogByAccessRequest_PrevAndNext(
		long id, long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException {
		return getPersistence()
				   .findByAccessLogByAccessRequest_PrevAndNext(id,
			accessRequestId, orderByComparator);
	}

	/**
	* Returns all the access logs where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @return the matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByFacilityUserMapping(
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessLogByFacilityUserMapping(facilityUserMappingId);
	}

	/**
	* Returns a range of all the access logs where facilityUserMappingId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param start the lower bound of the range of access logs
	* @param end the upper bound of the range of access logs (not inclusive)
	* @return the range of matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByFacilityUserMapping(
		long facilityUserMappingId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessLogByFacilityUserMapping(facilityUserMappingId,
			start, end);
	}

	/**
	* Returns an ordered range of all the access logs where facilityUserMappingId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param start the lower bound of the range of access logs
	* @param end the upper bound of the range of access logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByFacilityUserMapping(
		long facilityUserMappingId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessLogByFacilityUserMapping(facilityUserMappingId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first access log in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog findByAccessLogByFacilityUserMapping_First(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException {
		return getPersistence()
				   .findByAccessLogByFacilityUserMapping_First(facilityUserMappingId,
			orderByComparator);
	}

	/**
	* Returns the first access log in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access log, or <code>null</code> if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog fetchByAccessLogByFacilityUserMapping_First(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessLogByFacilityUserMapping_First(facilityUserMappingId,
			orderByComparator);
	}

	/**
	* Returns the last access log in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog findByAccessLogByFacilityUserMapping_Last(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException {
		return getPersistence()
				   .findByAccessLogByFacilityUserMapping_Last(facilityUserMappingId,
			orderByComparator);
	}

	/**
	* Returns the last access log in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access log, or <code>null</code> if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog fetchByAccessLogByFacilityUserMapping_Last(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessLogByFacilityUserMapping_Last(facilityUserMappingId,
			orderByComparator);
	}

	/**
	* Returns the access logs before and after the current access log in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param id the primary key of the current access log
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a access log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog[] findByAccessLogByFacilityUserMapping_PrevAndNext(
		long id, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException {
		return getPersistence()
				   .findByAccessLogByFacilityUserMapping_PrevAndNext(id,
			facilityUserMappingId, orderByComparator);
	}

	/**
	* Returns all the access logs where actualDateOfVisit = &#63;.
	*
	* @param actualDateOfVisit the actual date of visit
	* @return the matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByDateOfVisit(
		java.util.Date actualDateOfVisit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAccessLogByDateOfVisit(actualDateOfVisit);
	}

	/**
	* Returns a range of all the access logs where actualDateOfVisit = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param actualDateOfVisit the actual date of visit
	* @param start the lower bound of the range of access logs
	* @param end the upper bound of the range of access logs (not inclusive)
	* @return the range of matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByDateOfVisit(
		java.util.Date actualDateOfVisit, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessLogByDateOfVisit(actualDateOfVisit, start, end);
	}

	/**
	* Returns an ordered range of all the access logs where actualDateOfVisit = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param actualDateOfVisit the actual date of visit
	* @param start the lower bound of the range of access logs
	* @param end the upper bound of the range of access logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByDateOfVisit(
		java.util.Date actualDateOfVisit, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessLogByDateOfVisit(actualDateOfVisit, start, end,
			orderByComparator);
	}

	/**
	* Returns the first access log in the ordered set where actualDateOfVisit = &#63;.
	*
	* @param actualDateOfVisit the actual date of visit
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog findByAccessLogByDateOfVisit_First(
		java.util.Date actualDateOfVisit,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException {
		return getPersistence()
				   .findByAccessLogByDateOfVisit_First(actualDateOfVisit,
			orderByComparator);
	}

	/**
	* Returns the first access log in the ordered set where actualDateOfVisit = &#63;.
	*
	* @param actualDateOfVisit the actual date of visit
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access log, or <code>null</code> if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog fetchByAccessLogByDateOfVisit_First(
		java.util.Date actualDateOfVisit,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessLogByDateOfVisit_First(actualDateOfVisit,
			orderByComparator);
	}

	/**
	* Returns the last access log in the ordered set where actualDateOfVisit = &#63;.
	*
	* @param actualDateOfVisit the actual date of visit
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog findByAccessLogByDateOfVisit_Last(
		java.util.Date actualDateOfVisit,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException {
		return getPersistence()
				   .findByAccessLogByDateOfVisit_Last(actualDateOfVisit,
			orderByComparator);
	}

	/**
	* Returns the last access log in the ordered set where actualDateOfVisit = &#63;.
	*
	* @param actualDateOfVisit the actual date of visit
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access log, or <code>null</code> if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog fetchByAccessLogByDateOfVisit_Last(
		java.util.Date actualDateOfVisit,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessLogByDateOfVisit_Last(actualDateOfVisit,
			orderByComparator);
	}

	/**
	* Returns the access logs before and after the current access log in the ordered set where actualDateOfVisit = &#63;.
	*
	* @param id the primary key of the current access log
	* @param actualDateOfVisit the actual date of visit
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a access log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog[] findByAccessLogByDateOfVisit_PrevAndNext(
		long id, java.util.Date actualDateOfVisit,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException {
		return getPersistence()
				   .findByAccessLogByDateOfVisit_PrevAndNext(id,
			actualDateOfVisit, orderByComparator);
	}

	/**
	* Returns all the access logs.
	*
	* @return the access logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessLog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the access logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access logs
	* @param end the upper bound of the range of access logs (not inclusive)
	* @return the range of access logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessLog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the access logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access logs
	* @param end the upper bound of the range of access logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of access logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessLog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the access logs where accessRequestId = &#63; from the database.
	*
	* @param accessRequestId the access request ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAccessLogByAccessRequest(long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAccessLogByAccessRequest(accessRequestId);
	}

	/**
	* Removes all the access logs where facilityUserMappingId = &#63; from the database.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAccessLogByFacilityUserMapping(
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByAccessLogByFacilityUserMapping(facilityUserMappingId);
	}

	/**
	* Removes all the access logs where actualDateOfVisit = &#63; from the database.
	*
	* @param actualDateOfVisit the actual date of visit
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAccessLogByDateOfVisit(
		java.util.Date actualDateOfVisit)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAccessLogByDateOfVisit(actualDateOfVisit);
	}

	/**
	* Removes all the access logs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of access logs where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the number of matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAccessLogByAccessRequest(long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAccessLogByAccessRequest(accessRequestId);
	}

	/**
	* Returns the number of access logs where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @return the number of matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAccessLogByFacilityUserMapping(
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByAccessLogByFacilityUserMapping(facilityUserMappingId);
	}

	/**
	* Returns the number of access logs where actualDateOfVisit = &#63;.
	*
	* @param actualDateOfVisit the actual date of visit
	* @return the number of matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAccessLogByDateOfVisit(
		java.util.Date actualDateOfVisit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAccessLogByDateOfVisit(actualDateOfVisit);
	}

	/**
	* Returns the number of access logs.
	*
	* @return the number of access logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AccessLogPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AccessLogPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					AccessLogPersistence.class.getName());

			ReferenceRegistry.registerReference(AccessLogUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(AccessLogPersistence persistence) {
	}

	private static AccessLogPersistence _persistence;
}