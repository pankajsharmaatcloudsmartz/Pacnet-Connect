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

import java.sql.Date;

import com.liferay.portal.kernel.exception.SystemException;
import com.pacnet.connect.model.AccessLog;
import com.pacnet.connect.service.base.AccessLogLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.AccessLogUtil;

/**
 * The implementation of the access log local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.pacnet.connect.service.AccessLogLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.AccessLogLocalServiceBaseImpl
 * @see com.pacnet.connect.service.AccessLogLocalServiceUtil
 */
public class AccessLogLocalServiceImpl extends AccessLogLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.pacnet.connect.service.AccessLogLocalServiceUtil} to access the access log local service.
	 */
	public com.pacnet.connect.model.AccessLog createAccessLog(long accessRequestId, long facilityUserMappingId, Date actualDateOfVisit, long timeIn, long timeOut, String note,
			boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		AccessLog accessLog = null;
		try{
		
		accessLog = accessLogPersistence.create(0);
		accessLog.setAccessRequestId(accessRequestId);
		accessLog.setFacilityUserMappingId(facilityUserMappingId);
		accessLog.setActualDateOfVisit(actualDateOfVisit);
		accessLog.setTimeIn(timeIn);
		accessLog.setTimeOut(timeOut);
		accessLog.setNote(note);
		accessLog.setIsActive(isActive);
		accessLog.setCreatedOn(createdOn);
		accessLog.setCreatedBy(createdBy);
		accessLog.setUpdatedBy(updatedBy);
		accessLog.setUpdatedOn(updatedOn);
		accessLog = accessLogPersistence.update(accessLog, false);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return accessLog;
	}
	
	public com.pacnet.connect.model.AccessLog updateAccessLog(long id, long accessRequestId, long facilityUserMappingId, Date actualDateOfVisit, long timeIn, long timeOut, String note,
			boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		AccessLog accessLog = null;
		try{
			accessLog = accessLogPersistence.fetchByPrimaryKey(id);
			accessLog.setAccessRequestId(accessRequestId);
			accessLog.setFacilityUserMappingId(facilityUserMappingId);
			accessLog.setActualDateOfVisit(actualDateOfVisit);
			accessLog.setTimeIn(timeIn);
			accessLog.setTimeOut(timeOut);
			accessLog.setNote(note);
			accessLog.setIsActive(isActive);
			accessLog.setCreatedOn(createdOn);
			accessLog.setCreatedBy(createdBy);
			accessLog.setUpdatedBy(updatedBy);
			accessLog.setUpdatedOn(updatedOn);
			accessLog = accessLogPersistence.update(accessLog, false);
		}catch(Exception e){
			e.printStackTrace();
		}
		return accessLog;
	}
	
	
	public boolean deleteFacilityById(long id) {
		boolean isDeleted = false;
		try{
			accessLogPersistence.remove(id);
			isDeleted = true;
		}catch(Exception e){
			isDeleted = false;
			e.printStackTrace();
		}
	return isDeleted;
 }
	public  java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByAccessRequest(
			long accessRequestId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessLogUtil.findByAccessLogByAccessRequest(accessRequestId);
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
		public  java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByAccessRequest(
			long accessRequestId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessLogUtil
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
		public  java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByAccessRequest(
			long accessRequestId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessLogUtil
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
		public  com.pacnet.connect.model.AccessLog findByAccessLogByAccessRequest_First(
			long accessRequestId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessLogException {
			return AccessLogUtil
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
		public  com.pacnet.connect.model.AccessLog fetchByAccessLogByAccessRequest_First(
			long accessRequestId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessLogUtil
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
		public  com.pacnet.connect.model.AccessLog findByAccessLogByAccessRequest_Last(
			long accessRequestId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessLogException {
			return AccessLogUtil
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
		public  com.pacnet.connect.model.AccessLog fetchByAccessLogByAccessRequest_Last(
			long accessRequestId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessLogUtil
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
		public  com.pacnet.connect.model.AccessLog[] findByAccessLogByAccessRequest_PrevAndNext(
			long id, long accessRequestId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessLogException {
			return AccessLogUtil
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
		public  java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByFacilityUserMapping(
			long facilityUserMappingId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessLogUtil
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
		public  java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByFacilityUserMapping(
			long facilityUserMappingId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessLogUtil
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
		public  java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByFacilityUserMapping(
			long facilityUserMappingId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessLogUtil
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
		public  com.pacnet.connect.model.AccessLog findByAccessLogByFacilityUserMapping_First(
			long facilityUserMappingId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessLogException {
			return AccessLogUtil
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
		public  com.pacnet.connect.model.AccessLog fetchByAccessLogByFacilityUserMapping_First(
			long facilityUserMappingId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessLogUtil
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
		public  com.pacnet.connect.model.AccessLog findByAccessLogByFacilityUserMapping_Last(
			long facilityUserMappingId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessLogException {
			return AccessLogUtil
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
		public  com.pacnet.connect.model.AccessLog fetchByAccessLogByFacilityUserMapping_Last(
			long facilityUserMappingId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessLogUtil
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
		public  com.pacnet.connect.model.AccessLog[] findByAccessLogByFacilityUserMapping_PrevAndNext(
			long id, long facilityUserMappingId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessLogException {
			return AccessLogUtil
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
		public  java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByDateOfVisit(
			java.util.Date actualDateOfVisit)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessLogUtil.findByAccessLogByDateOfVisit(actualDateOfVisit);
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
		public  java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByDateOfVisit(
			java.util.Date actualDateOfVisit, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessLogUtil
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
		public  java.util.List<com.pacnet.connect.model.AccessLog> findByAccessLogByDateOfVisit(
			java.util.Date actualDateOfVisit, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessLogUtil
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
		public  com.pacnet.connect.model.AccessLog findByAccessLogByDateOfVisit_First(
			java.util.Date actualDateOfVisit,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessLogException {
			return AccessLogUtil
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
		public  com.pacnet.connect.model.AccessLog fetchByAccessLogByDateOfVisit_First(
			java.util.Date actualDateOfVisit,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessLogUtil
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
		public  com.pacnet.connect.model.AccessLog findByAccessLogByDateOfVisit_Last(
			java.util.Date actualDateOfVisit,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessLogException {
			return AccessLogUtil
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
		public  com.pacnet.connect.model.AccessLog fetchByAccessLogByDateOfVisit_Last(
			java.util.Date actualDateOfVisit,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessLogUtil
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
		public  com.pacnet.connect.model.AccessLog[] findByAccessLogByDateOfVisit_PrevAndNext(
			long id, java.util.Date actualDateOfVisit,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessLogException {
			return AccessLogUtil
					   .findByAccessLogByDateOfVisit_PrevAndNext(id,
				actualDateOfVisit, orderByComparator);
		}
}