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
import com.pacnet.connect.model.AccessRequestFacilityService;
import com.pacnet.connect.service.base.AccessRequestFacilityServiceLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.AccessRequestFacilityServiceUtil;

/**
 * The implementation of the access request facility service local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.pacnet.connect.service.AccessRequestFacilityServiceLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.AccessRequestFacilityServiceLocalServiceBaseImpl
 * @see com.pacnet.connect.service.AccessRequestFacilityServiceLocalServiceUtil
 */
public class AccessRequestFacilityServiceLocalServiceImpl
	extends AccessRequestFacilityServiceLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.pacnet.connect.service.AccessRequestFacilityServiceLocalServiceUtil} to access the access request facility service local service.
	 */
	public com.pacnet.connect.model.AccessRequestFacilityService createAccessRequestFacilityService(long accessRequestId, long facilityServiceId,
			boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		AccessRequestFacilityService accessRequestFacilityService = null;
		try{
			accessRequestFacilityService = accessRequestFacilityServicePersistence.create(0);
			accessRequestFacilityService.setAccessRequestId(accessRequestId);
			accessRequestFacilityService.setFacilityServiceId(facilityServiceId);
			accessRequestFacilityService.setIsActive(isActive);
			accessRequestFacilityService.setCreatedOn(createdOn);
			accessRequestFacilityService.setCreatedBy(createdBy);
			accessRequestFacilityService.setUpdatedBy(updatedBy);
			accessRequestFacilityService.setUpdatedOn(updatedOn);
			accessRequestFacilityService = accessRequestFacilityServicePersistence.update(accessRequestFacilityService, false);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return accessRequestFacilityService;
	}
	
	public com.pacnet.connect.model.AccessRequestFacilityService updateAccessRequestFacilityService(long id, long accessRequestId, long facilityServiceId,
			boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		AccessRequestFacilityService accessRequestFacilityService = null;
		try{
			accessRequestFacilityService = accessRequestFacilityServicePersistence.fetchByPrimaryKey(id);
			accessRequestFacilityService.setAccessRequestId(accessRequestId);
			accessRequestFacilityService.setFacilityServiceId(facilityServiceId);
			accessRequestFacilityService.setIsActive(isActive);
			accessRequestFacilityService.setCreatedOn(createdOn);
			accessRequestFacilityService.setCreatedBy(createdBy);
			accessRequestFacilityService.setUpdatedBy(updatedBy);
			accessRequestFacilityService.setUpdatedOn(updatedOn);
			accessRequestFacilityService = accessRequestFacilityServicePersistence.update(accessRequestFacilityService, false);
		}catch(Exception e){
			e.printStackTrace();
		}
		return accessRequestFacilityService;
	}
	
	
	public boolean deleteFacilityById(long id) {
		boolean isDeleted = false;
		try{
			accessRequestFacilityServicePersistence.remove(id);
			isDeleted = true;
		}catch(Exception e){
			isDeleted = false;
			e.printStackTrace();
		}
	return isDeleted;
 }
	public  java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByAccessRequest(
			long accessRequestId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestFacilityServiceUtil
					   .findByAccessRequestFacilityServiceByAccessRequest(accessRequestId);
		}

		/**
		* Returns a range of all the access request facility services where accessRequestId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param accessRequestId the access request ID
		* @param start the lower bound of the range of access request facility services
		* @param end the upper bound of the range of access request facility services (not inclusive)
		* @return the range of matching access request facility services
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByAccessRequest(
			long accessRequestId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestFacilityServiceUtil
					   .findByAccessRequestFacilityServiceByAccessRequest(accessRequestId,
				start, end);
		}

		/**
		* Returns an ordered range of all the access request facility services where accessRequestId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param accessRequestId the access request ID
		* @param start the lower bound of the range of access request facility services
		* @param end the upper bound of the range of access request facility services (not inclusive)
		* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
		* @return the ordered range of matching access request facility services
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByAccessRequest(
			long accessRequestId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestFacilityServiceUtil
					   .findByAccessRequestFacilityServiceByAccessRequest(accessRequestId,
				start, end, orderByComparator);
		}

		/**
		* Returns the first access request facility service in the ordered set where accessRequestId = &#63;.
		*
		* @param accessRequestId the access request ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching access request facility service
		* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByAccessRequest_First(
			long accessRequestId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
			return AccessRequestFacilityServiceUtil
					   .findByAccessRequestFacilityServiceByAccessRequest_First(accessRequestId,
				orderByComparator);
		}

		/**
		* Returns the first access request facility service in the ordered set where accessRequestId = &#63;.
		*
		* @param accessRequestId the access request ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByAccessRequest_First(
			long accessRequestId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestFacilityServiceUtil
					   .fetchByAccessRequestFacilityServiceByAccessRequest_First(accessRequestId,
				orderByComparator);
		}

		/**
		* Returns the last access request facility service in the ordered set where accessRequestId = &#63;.
		*
		* @param accessRequestId the access request ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching access request facility service
		* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByAccessRequest_Last(
			long accessRequestId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
			return AccessRequestFacilityServiceUtil
					   .findByAccessRequestFacilityServiceByAccessRequest_Last(accessRequestId,
				orderByComparator);
		}

		/**
		* Returns the last access request facility service in the ordered set where accessRequestId = &#63;.
		*
		* @param accessRequestId the access request ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByAccessRequest_Last(
			long accessRequestId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestFacilityServiceUtil
					   .fetchByAccessRequestFacilityServiceByAccessRequest_Last(accessRequestId,
				orderByComparator);
		}


		/**
		* Returns all the access request facility services where facilityServiceId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @return the matching access request facility services
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByFacilityService(
			long facilityServiceId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestFacilityServiceUtil
					   .findByAccessRequestFacilityServiceByFacilityService(facilityServiceId);
		}

		/**
		* Returns a range of all the access request facility services where facilityServiceId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param facilityServiceId the facility service ID
		* @param start the lower bound of the range of access request facility services
		* @param end the upper bound of the range of access request facility services (not inclusive)
		* @return the range of matching access request facility services
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByFacilityService(
			long facilityServiceId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestFacilityServiceUtil
					   .findByAccessRequestFacilityServiceByFacilityService(facilityServiceId,
				start, end);
		}

		/**
		* Returns an ordered range of all the access request facility services where facilityServiceId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param facilityServiceId the facility service ID
		* @param start the lower bound of the range of access request facility services
		* @param end the upper bound of the range of access request facility services (not inclusive)
		* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
		* @return the ordered range of matching access request facility services
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByFacilityService(
			long facilityServiceId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestFacilityServiceUtil
					   .findByAccessRequestFacilityServiceByFacilityService(facilityServiceId,
				start, end, orderByComparator);
		}

		/**
		* Returns the first access request facility service in the ordered set where facilityServiceId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching access request facility service
		* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByFacilityService_First(
			long facilityServiceId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
			return AccessRequestFacilityServiceUtil
					   .findByAccessRequestFacilityServiceByFacilityService_First(facilityServiceId,
				orderByComparator);
		}

		/**
		* Returns the first access request facility service in the ordered set where facilityServiceId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByFacilityService_First(
			long facilityServiceId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestFacilityServiceUtil
					   .fetchByAccessRequestFacilityServiceByFacilityService_First(facilityServiceId,
				orderByComparator);
		}

		/**
		* Returns the last access request facility service in the ordered set where facilityServiceId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching access request facility service
		* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByFacilityService_Last(
			long facilityServiceId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
			return AccessRequestFacilityServiceUtil
					   .findByAccessRequestFacilityServiceByFacilityService_Last(facilityServiceId,
				orderByComparator);
		}

		/**
		* Returns the last access request facility service in the ordered set where facilityServiceId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByFacilityService_Last(
			long facilityServiceId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return AccessRequestFacilityServiceUtil
					   .fetchByAccessRequestFacilityServiceByFacilityService_Last(facilityServiceId,
				orderByComparator);
		}
}