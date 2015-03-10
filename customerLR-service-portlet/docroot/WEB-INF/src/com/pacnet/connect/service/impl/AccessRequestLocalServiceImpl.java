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
import com.pacnet.connect.model.AccessRequest;
import com.pacnet.connect.service.base.AccessRequestLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.AccessRequestUtil;

/**
 * The implementation of the access request local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.pacnet.connect.service.AccessRequestLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.AccessRequestLocalServiceBaseImpl
 * @see com.pacnet.connect.service.AccessRequestLocalServiceUtil
 */
public class AccessRequestLocalServiceImpl
	extends AccessRequestLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.pacnet.connect.service.AccessRequestLocalServiceUtil} to access the access request local service.
	 */
	
	public com.pacnet.connect.model.AccessRequest createAccessRequest(long facilityId, long customerId, 
			long visitorId, Date dateOfVisit,Date dateOfVisitGmt,Date dateOfTimeOutGmt, long tentativeTimeIn, long tentativeTimeOut, String note,boolean oneTimeAccess, 
			long accessRequestStatusId, boolean isExternalVisitor,boolean isActive, String createdBy, Date createdOn, 
			String updatedBy, Date updatedOn) {
		AccessRequest accessRequest = null;
		
		try{
		
			accessRequest = accessRequestPersistence.create(0);
			accessRequest.setFacilityId(facilityId);
			accessRequest.setCustomerId(customerId);
			accessRequest.setVisitorId(visitorId);
			accessRequest.setDateOfVisit(dateOfVisit);
			accessRequest.setTentativeTimeIn(tentativeTimeIn);
			accessRequest.setTentativeTimeOut(tentativeTimeOut);
			accessRequest.setNote(note);
			accessRequest.setOneTimeAccess(oneTimeAccess);
			accessRequest.setAccessRequestStatusId(accessRequestStatusId);
			accessRequest.setIsExternalVisitor(isExternalVisitor);
			accessRequest.setIsActive(isActive);
			accessRequest.setCreatedOn(createdOn);
			accessRequest.setCreatedBy(createdBy);
			accessRequest.setUpdatedBy(updatedBy);
			accessRequest.setUpdatedOn(updatedOn);
			accessRequest.setDateOfVisitGmt(dateOfVisitGmt);			
			accessRequest.setDateOfTimeOutGmt(dateOfTimeOutGmt);
			accessRequest = accessRequestPersistence.update(accessRequest, false);
		}catch(Exception e){
			e.printStackTrace();
		}
		return accessRequest;
	}
	
	public com.pacnet.connect.model.AccessRequest updateAccessRequest(long id, long facilityId, long customerId, 
			long visitorId, Date dateOfVisit,Date dateOfVisitGmt,Date dateOfTimeOutGmt, long tentativeTimeIn, long tentativeTimeOut, String note, boolean oneTimeAccess, 
			long accessRequestStatusId,boolean isExternalVisitor, boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		AccessRequest accessRequest = null;
		try{
			accessRequest = accessRequestPersistence.fetchByPrimaryKey(id);
			accessRequest.setFacilityId(facilityId);
			accessRequest.setCustomerId(customerId);
			accessRequest.setVisitorId(visitorId);
			accessRequest.setDateOfVisit(dateOfVisit);
			accessRequest.setTentativeTimeIn(tentativeTimeIn);
			accessRequest.setTentativeTimeOut(tentativeTimeOut);
			accessRequest.setOneTimeAccess(oneTimeAccess);
			accessRequest.setNote(note);
			accessRequest.setAccessRequestStatusId(accessRequestStatusId);
			accessRequest.setIsExternalVisitor(isExternalVisitor);
			accessRequest.setIsActive(isActive);
			accessRequest.setCreatedOn(accessRequest.getCreatedOn());
			accessRequest.setCreatedBy(accessRequest.getCreatedBy());
			accessRequest.setUpdatedBy(updatedBy);
			accessRequest.setUpdatedOn(updatedOn);
			accessRequest.setDateOfVisitGmt(dateOfVisitGmt);
			accessRequest.setDateOfTimeOutGmt(dateOfTimeOutGmt);
			accessRequest = accessRequestPersistence.update(accessRequest, false);
		}catch(Exception e){
			e.printStackTrace();
		}
		return accessRequest;
	}
	
	public boolean deleteFacilityById(long id) {
		boolean isDeleted = false;
		try{
			accessRequestPersistence.remove(id);
			isDeleted = true;
		}catch(Exception e){
			isDeleted = false;
			e.printStackTrace();
		}
		return isDeleted;
	}
	
	public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByFacility(
			long facilityId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestUtil.findByAccessRequestByFacility(facilityId);
		}	

		/**
		* Returns a range of all the access requests where facilityId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param facilityId the facility ID
		* @param start the lower bound of the range of access requests
		* @param end the upper bound of the range of access requests (not inclusive)
		* @return the range of matching access requests
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByFacility(
			long facilityId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestUtil
					   .findByAccessRequestByFacility(facilityId, start, end);
		}

		/**
		* Returns an ordered range of all the access requests where facilityId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param facilityId the facility ID
		* @param start the lower bound of the range of access requests
		* @param end the upper bound of the range of access requests (not inclusive)
		* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
		* @return the ordered range of matching access requests
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByFacility(
			long facilityId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestUtil
					   .findByAccessRequestByFacility(facilityId, start, end,
				orderByComparator);
		}
		

		/**
		* Returns all the access requests where customerId = &#63;.
		*
		* @param customerId the customer ID
		* @return the matching access requests
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByCustomer(
			long customerId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestUtil.findByAccessRequestByCustomer(customerId);
		}

		/**
		* Returns a range of all the access requests where customerId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param customerId the customer ID
		* @param start the lower bound of the range of access requests
		* @param end the upper bound of the range of access requests (not inclusive)
		* @return the range of matching access requests
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByCustomer(
			long customerId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestUtil
					   .findByAccessRequestByCustomer(customerId, start, end);
		}

		/**
		* Returns an ordered range of all the access requests where customerId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param customerId the customer ID
		* @param start the lower bound of the range of access requests
		* @param end the upper bound of the range of access requests (not inclusive)
		* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
		* @return the ordered range of matching access requests
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByCustomer(
			long customerId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestUtil
					   .findByAccessRequestByCustomer(customerId, start, end,
				orderByComparator);
		}

		
		/**
		* Returns all the access requests where visitorId = &#63;.
		*
		* @param visitorId the visitor ID
		* @return the matching access requests
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByVisitor(
			long visitorId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestUtil.findByAccessRequestByVisitor(visitorId);
		}

		/**
		* Returns a range of all the access requests where visitorId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param visitorId the visitor ID
		* @param start the lower bound of the range of access requests
		* @param end the upper bound of the range of access requests (not inclusive)
		* @return the range of matching access requests
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByVisitor(
			long visitorId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestUtil
					   .findByAccessRequestByVisitor(visitorId, start, end);
		}

		/**
		* Returns an ordered range of all the access requests where visitorId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param visitorId the visitor ID
		* @param start the lower bound of the range of access requests
		* @param end the upper bound of the range of access requests (not inclusive)
		* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
		* @return the ordered range of matching access requests
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByVisitor(
			long visitorId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestUtil
					   .findByAccessRequestByVisitor(visitorId, start, end,
				orderByComparator);
		}

		/**
		* Returns the first access request in the ordered set where visitorId = &#63;.
		*
		* @param visitorId the visitor ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching access request
		* @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.AccessRequest findByAccessRequestByVisitor_First(
			long visitorId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessRequestException {
			return AccessRequestUtil
					   .findByAccessRequestByVisitor_First(visitorId,
				orderByComparator);
		}

		/**
		* Returns the first access request in the ordered set where visitorId = &#63;.
		*
		* @param visitorId the visitor ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching access request, or <code>null</code> if a matching access request could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.AccessRequest fetchByAccessRequestByVisitor_First(
			long visitorId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestUtil
					   .fetchByAccessRequestByVisitor_First(visitorId,
				orderByComparator);
		}

		/**
		* Returns the last access request in the ordered set where visitorId = &#63;.
		*
		* @param visitorId the visitor ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching access request
		* @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.AccessRequest findByAccessRequestByVisitor_Last(
			long visitorId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessRequestException {
			return AccessRequestUtil
					   .findByAccessRequestByVisitor_Last(visitorId,
				orderByComparator);
		}

		/**
		* Returns the last access request in the ordered set where visitorId = &#63;.
		*
		* @param visitorId the visitor ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching access request, or <code>null</code> if a matching access request could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.AccessRequest fetchByAccessRequestByVisitor_Last(
			long visitorId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestUtil
					   .fetchByAccessRequestByVisitor_Last(visitorId,
				orderByComparator);
		}

		/**
		* Returns the access requests before and after the current access request in the ordered set where visitorId = &#63;.
		*
		* @param id the primary key of the current access request
		* @param visitorId the visitor ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the previous, current, and next access request
		* @throws com.pacnet.connect.NoSuchAccessRequestException if a access request with the primary key could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.AccessRequest[] findByAccessRequestByVisitor_PrevAndNext(
			long id, long visitorId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessRequestException {
			return AccessRequestUtil
					   .findByAccessRequestByVisitor_PrevAndNext(id, visitorId,
				orderByComparator);
		}
}