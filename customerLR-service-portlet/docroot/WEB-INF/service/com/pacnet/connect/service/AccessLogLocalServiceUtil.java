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

package com.pacnet.connect.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the access log local service. This utility wraps {@link com.pacnet.connect.service.impl.AccessLogLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see AccessLogLocalService
 * @see com.pacnet.connect.service.base.AccessLogLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.AccessLogLocalServiceImpl
 * @generated
 */
public class AccessLogLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.AccessLogLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the access log to the database. Also notifies the appropriate model listeners.
	*
	* @param accessLog the access log
	* @return the access log that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog addAccessLog(
		com.pacnet.connect.model.AccessLog accessLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAccessLog(accessLog);
	}

	/**
	* Creates a new access log with the primary key. Does not add the access log to the database.
	*
	* @param id the primary key for the new access log
	* @return the new access log
	*/
	public static com.pacnet.connect.model.AccessLog createAccessLog(long id) {
		return getService().createAccessLog(id);
	}

	/**
	* Deletes the access log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access log
	* @return the access log that was removed
	* @throws PortalException if a access log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog deleteAccessLog(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAccessLog(id);
	}

	/**
	* Deletes the access log from the database. Also notifies the appropriate model listeners.
	*
	* @param accessLog the access log
	* @return the access log that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog deleteAccessLog(
		com.pacnet.connect.model.AccessLog accessLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAccessLog(accessLog);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.pacnet.connect.model.AccessLog fetchAccessLog(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAccessLog(id);
	}

	/**
	* Returns the access log with the primary key.
	*
	* @param id the primary key of the access log
	* @return the access log
	* @throws PortalException if a access log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog getAccessLog(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccessLog(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.pacnet.connect.model.AccessLog> getAccessLogs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccessLogs(start, end);
	}

	/**
	* Returns the number of access logs.
	*
	* @return the number of access logs
	* @throws SystemException if a system exception occurred
	*/
	public static int getAccessLogsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccessLogsCount();
	}

	/**
	* Updates the access log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accessLog the access log
	* @return the access log that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog updateAccessLog(
		com.pacnet.connect.model.AccessLog accessLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAccessLog(accessLog);
	}

	/**
	* Updates the access log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accessLog the access log
	* @param merge whether to merge the access log with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the access log that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessLog updateAccessLog(
		com.pacnet.connect.model.AccessLog accessLog, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAccessLog(accessLog, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.pacnet.connect.model.AccessLog createAccessLog(
		long accessRequestId, long facilityUserMappingId,
		java.sql.Date actualDateOfVisit, long timeIn, long timeOut,
		java.lang.String note, boolean isActive, java.lang.String createdBy,
		java.sql.Date createdOn, java.lang.String updatedBy,
		java.sql.Date updatedOn) {
		return getService()
				   .createAccessLog(accessRequestId, facilityUserMappingId,
			actualDateOfVisit, timeIn, timeOut, note, isActive, createdBy,
			createdOn, updatedBy, updatedOn);
	}

	public static com.pacnet.connect.model.AccessLog updateAccessLog(long id,
		long accessRequestId, long facilityUserMappingId,
		java.sql.Date actualDateOfVisit, long timeIn, long timeOut,
		java.lang.String note, boolean isActive, java.lang.String createdBy,
		java.sql.Date createdOn, java.lang.String updatedBy,
		java.sql.Date updatedOn) {
		return getService()
				   .updateAccessLog(id, accessRequestId, facilityUserMappingId,
			actualDateOfVisit, timeIn, timeOut, note, isActive, createdBy,
			createdOn, updatedBy, updatedOn);
	}

	public static boolean deleteFacilityById(long id) {
		return getService().deleteFacilityById(id);
	}

	public static java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByAccessLogByAccessRequest(accessRequestId);
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService().findByAccessLogByDateOfVisit(actualDateOfVisit);
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
				   .findByAccessLogByDateOfVisit_PrevAndNext(id,
			actualDateOfVisit, orderByComparator);
	}

	public static void clearService() {
		_service = null;
	}

	public static AccessLogLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AccessLogLocalService.class.getName());

			if (invokableLocalService instanceof AccessLogLocalService) {
				_service = (AccessLogLocalService)invokableLocalService;
			}
			else {
				_service = new AccessLogLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AccessLogLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(AccessLogLocalService service) {
	}

	private static AccessLogLocalService _service;
}