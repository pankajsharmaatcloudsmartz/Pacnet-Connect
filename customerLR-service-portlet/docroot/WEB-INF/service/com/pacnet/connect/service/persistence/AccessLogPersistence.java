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

import com.pacnet.connect.model.AccessLog;

/**
 * The persistence interface for the access log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see AccessLogPersistenceImpl
 * @see AccessLogUtil
 * @generated
 */
public interface AccessLogPersistence extends BasePersistence<AccessLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccessLogUtil} to access the access log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the access log in the entity cache if it is enabled.
	*
	* @param accessLog the access log
	*/
	public void cacheResult(com.pacnet.connect.model.AccessLog accessLog);

	/**
	* Caches the access logs in the entity cache if it is enabled.
	*
	* @param accessLogs the access logs
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.AccessLog> accessLogs);

	/**
	* Creates a new access log with the primary key. Does not add the access log to the database.
	*
	* @param id the primary key for the new access log
	* @return the new access log
	*/
	public com.pacnet.connect.model.AccessLog create(long id);

	/**
	* Removes the access log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access log
	* @return the access log that was removed
	* @throws com.pacnet.connect.NoSuchAccessLogException if a access log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessLog remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException;

	public com.pacnet.connect.model.AccessLog updateImpl(
		com.pacnet.connect.model.AccessLog accessLog, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the access log with the primary key or throws a {@link com.pacnet.connect.NoSuchAccessLogException} if it could not be found.
	*
	* @param id the primary key of the access log
	* @return the access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a access log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessLog findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException;

	/**
	* Returns the access log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the access log
	* @return the access log, or <code>null</code> if a access log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessLog fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the access logs where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByAccessRequest(
		long accessRequestId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByAccessRequest(
		long accessRequestId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first access log in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessLog findByAccessLogByAccessRequest_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException;

	/**
	* Returns the first access log in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access log, or <code>null</code> if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessLog fetchByAccessLogByAccessRequest_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last access log in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessLog findByAccessLogByAccessRequest_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException;

	/**
	* Returns the last access log in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access log, or <code>null</code> if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessLog fetchByAccessLogByAccessRequest_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.AccessLog[] findByAccessLogByAccessRequest_PrevAndNext(
		long id, long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException;

	/**
	* Returns all the access logs where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @return the matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByFacilityUserMapping(
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByFacilityUserMapping(
		long facilityUserMappingId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByFacilityUserMapping(
		long facilityUserMappingId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first access log in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessLog findByAccessLogByFacilityUserMapping_First(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException;

	/**
	* Returns the first access log in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access log, or <code>null</code> if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessLog fetchByAccessLogByFacilityUserMapping_First(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last access log in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessLog findByAccessLogByFacilityUserMapping_Last(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException;

	/**
	* Returns the last access log in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access log, or <code>null</code> if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessLog fetchByAccessLogByFacilityUserMapping_Last(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.AccessLog[] findByAccessLogByFacilityUserMapping_PrevAndNext(
		long id, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException;

	/**
	* Returns all the access logs where actualDateOfVisit = &#63;.
	*
	* @param actualDateOfVisit the actual date of visit
	* @return the matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByDateOfVisit(
		java.util.Date actualDateOfVisit)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByDateOfVisit(
		java.util.Date actualDateOfVisit, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByDateOfVisit(
		java.util.Date actualDateOfVisit, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first access log in the ordered set where actualDateOfVisit = &#63;.
	*
	* @param actualDateOfVisit the actual date of visit
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessLog findByAccessLogByDateOfVisit_First(
		java.util.Date actualDateOfVisit,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException;

	/**
	* Returns the first access log in the ordered set where actualDateOfVisit = &#63;.
	*
	* @param actualDateOfVisit the actual date of visit
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access log, or <code>null</code> if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessLog fetchByAccessLogByDateOfVisit_First(
		java.util.Date actualDateOfVisit,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last access log in the ordered set where actualDateOfVisit = &#63;.
	*
	* @param actualDateOfVisit the actual date of visit
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access log
	* @throws com.pacnet.connect.NoSuchAccessLogException if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessLog findByAccessLogByDateOfVisit_Last(
		java.util.Date actualDateOfVisit,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException;

	/**
	* Returns the last access log in the ordered set where actualDateOfVisit = &#63;.
	*
	* @param actualDateOfVisit the actual date of visit
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access log, or <code>null</code> if a matching access log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessLog fetchByAccessLogByDateOfVisit_Last(
		java.util.Date actualDateOfVisit,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.AccessLog[] findByAccessLogByDateOfVisit_PrevAndNext(
		long id, java.util.Date actualDateOfVisit,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessLogException;

	/**
	* Returns all the access logs.
	*
	* @return the access logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessLog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.AccessLog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.AccessLog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the access logs where accessRequestId = &#63; from the database.
	*
	* @param accessRequestId the access request ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAccessLogByAccessRequest(long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the access logs where facilityUserMappingId = &#63; from the database.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAccessLogByFacilityUserMapping(
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the access logs where actualDateOfVisit = &#63; from the database.
	*
	* @param actualDateOfVisit the actual date of visit
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAccessLogByDateOfVisit(java.util.Date actualDateOfVisit)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the access logs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of access logs where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the number of matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByAccessLogByAccessRequest(long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of access logs where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @return the number of matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByAccessLogByFacilityUserMapping(long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of access logs where actualDateOfVisit = &#63;.
	*
	* @param actualDateOfVisit the actual date of visit
	* @return the number of matching access logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByAccessLogByDateOfVisit(java.util.Date actualDateOfVisit)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of access logs.
	*
	* @return the number of access logs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}