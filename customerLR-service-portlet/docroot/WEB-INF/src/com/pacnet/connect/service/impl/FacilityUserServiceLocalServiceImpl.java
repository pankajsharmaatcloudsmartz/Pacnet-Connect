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
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.pacnet.connect.model.FacilityUserService;
import com.pacnet.connect.service.base.FacilityUserServiceLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.FacilityUserServiceUtil;

/**
 * The implementation of the facility user service local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.pacnet.connect.service.FacilityUserServiceLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.FacilityUserServiceLocalServiceBaseImpl
 * @see com.pacnet.connect.service.FacilityUserServiceLocalServiceUtil
 */
public class FacilityUserServiceLocalServiceImpl
	extends FacilityUserServiceLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.pacnet.connect.service.FacilityUserServiceLocalServiceUtil} to access the facility user service local service.
	 */
	public com.pacnet.connect.model.FacilityUserService createFacilityUserMapping(long facilityUserMappingId, long facilityServiceId,
			boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		FacilityUserService facilityUserService = null;
		try{
			facilityUserService = facilityUserServicePersistence.create(0);
			facilityUserService.setFacilityUserMappingId(facilityUserMappingId);
			facilityUserService.setFacilityServiceId(facilityServiceId);
			facilityUserService.setIsActive(isActive);		
			facilityUserService.setCreatedOn(createdOn);
			facilityUserService.setCreatedBy(createdBy);
			facilityUserService.setUpdatedBy(updatedBy);
			facilityUserService.setUpdatedOn(updatedOn);
			facilityUserService = facilityUserServicePersistence.update(facilityUserService, false);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return facilityUserService;
	}
	
	public com.pacnet.connect.model.FacilityUserService updateFacilityUserService(long id, long facilityUserMappingId, long facilityServiceId,
			boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		FacilityUserService facilityUserService = null;
		try{
			facilityUserService = facilityUserServicePersistence.fetchByPrimaryKey(id);
			facilityUserService.setFacilityUserMappingId(facilityUserMappingId);
			facilityUserService.setFacilityServiceId(facilityServiceId);
			facilityUserService.setIsActive(isActive);		
			facilityUserService.setCreatedOn(createdOn);
			facilityUserService.setCreatedBy(createdBy);
			facilityUserService.setUpdatedBy(updatedBy);
			facilityUserService.setUpdatedOn(updatedOn);
			facilityUserService = facilityUserServicePersistence.update(facilityUserService, false);
		}catch(Exception e){
			e.printStackTrace();
		}
		return facilityUserService;
	}
	
	public boolean deleteFacilityById(long id) {
		boolean isDeleted = false;
		try{
			facilityUserServicePersistence.remove(id);
			isDeleted = true;
		}catch(Exception e){
			isDeleted = false;
			e.printStackTrace();
		}
	return isDeleted;
	}
	
	public  java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
			long facilityUserMappingId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserServiceUtil
					   .findByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId);
		}

		/**
		* Returns a range of all the facility user services where facilityUserMappingId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param facilityUserMappingId the facility user mapping ID
		* @param start the lower bound of the range of facility user services
		* @param end the upper bound of the range of facility user services (not inclusive)
		* @return the range of matching facility user services
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
			long facilityUserMappingId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserServiceUtil
					   .findByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId,
				start, end);
		}

		/**
		* Returns an ordered range of all the facility user services where facilityUserMappingId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param facilityUserMappingId the facility user mapping ID
		* @param start the lower bound of the range of facility user services
		* @param end the upper bound of the range of facility user services (not inclusive)
		* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
		* @return the ordered range of matching facility user services
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
			long facilityUserMappingId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserServiceUtil
					   .findByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId,
				start, end, orderByComparator);
		}

		/**
		* Returns the first facility user service in the ordered set where facilityUserMappingId = &#63;.
		*
		* @param facilityUserMappingId the facility user mapping ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility user service
		* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserService findByFacilityUserServiceByFacilityUserMapping_First(
			long facilityUserMappingId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityUserServiceException {
			return FacilityUserServiceUtil
					   .findByFacilityUserServiceByFacilityUserMapping_First(facilityUserMappingId,
				orderByComparator);
		}

		/**
		* Returns the first facility user service in the ordered set where facilityUserMappingId = &#63;.
		*
		* @param facilityUserMappingId the facility user mapping ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility user service, or <code>null</code> if a matching facility user service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserService fetchByFacilityUserServiceByFacilityUserMapping_First(
			long facilityUserMappingId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserServiceUtil
					   .fetchByFacilityUserServiceByFacilityUserMapping_First(facilityUserMappingId,
				orderByComparator);
		}

		/**
		* Returns the last facility user service in the ordered set where facilityUserMappingId = &#63;.
		*
		* @param facilityUserMappingId the facility user mapping ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility user service
		* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserService findByFacilityUserServiceByFacilityUserMapping_Last(
			long facilityUserMappingId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityUserServiceException {
			return FacilityUserServiceUtil
					   .findByFacilityUserServiceByFacilityUserMapping_Last(facilityUserMappingId,
				orderByComparator);
		}

		/**
		* Returns the last facility user service in the ordered set where facilityUserMappingId = &#63;.
		*
		* @param facilityUserMappingId the facility user mapping ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility user service, or <code>null</code> if a matching facility user service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserService fetchByFacilityUserServiceByFacilityUserMapping_Last(
			long facilityUserMappingId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserServiceUtil
					   .fetchByFacilityUserServiceByFacilityUserMapping_Last(facilityUserMappingId,
				orderByComparator);
		}

		/**
		* Returns the facility user services before and after the current facility user service in the ordered set where facilityUserMappingId = &#63;.
		*
		* @param id the primary key of the current facility user service
		* @param facilityUserMappingId the facility user mapping ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the previous, current, and next facility user service
		* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a facility user service with the primary key could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserService[] findByFacilityUserServiceByFacilityUserMapping_PrevAndNext(
			long id, long facilityUserMappingId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityUserServiceException {
			return FacilityUserServiceUtil
					   .findByFacilityUserServiceByFacilityUserMapping_PrevAndNext(id,
				facilityUserMappingId, orderByComparator);
		}

		/**
		* Returns all the facility user services where facilityServiceId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @return the matching facility user services
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserMappingByFacilityService(
			long facilityServiceId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserServiceUtil
					   .findByFacilityUserMappingByFacilityService(facilityServiceId);
		}

		/**
		* Returns a range of all the facility user services where facilityServiceId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param facilityServiceId the facility service ID
		* @param start the lower bound of the range of facility user services
		* @param end the upper bound of the range of facility user services (not inclusive)
		* @return the range of matching facility user services
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserMappingByFacilityService(
			long facilityServiceId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserServiceUtil
					   .findByFacilityUserMappingByFacilityService(facilityServiceId,
				start, end);
		}

		/**
		* Returns an ordered range of all the facility user services where facilityServiceId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param facilityServiceId the facility service ID
		* @param start the lower bound of the range of facility user services
		* @param end the upper bound of the range of facility user services (not inclusive)
		* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
		* @return the ordered range of matching facility user services
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserMappingByFacilityService(
			long facilityServiceId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserServiceUtil
					   .findByFacilityUserMappingByFacilityService(facilityServiceId,
				start, end, orderByComparator);
		}

		/**
		* Returns the first facility user service in the ordered set where facilityServiceId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility user service
		* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserService findByFacilityUserMappingByFacilityService_First(
			long facilityServiceId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityUserServiceException {
			return FacilityUserServiceUtil
					   .findByFacilityUserMappingByFacilityService_First(facilityServiceId,
				orderByComparator);
		}

		/**
		* Returns the first facility user service in the ordered set where facilityServiceId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility user service, or <code>null</code> if a matching facility user service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserService fetchByFacilityUserMappingByFacilityService_First(
			long facilityServiceId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserServiceUtil
					   .fetchByFacilityUserMappingByFacilityService_First(facilityServiceId,
				orderByComparator);
		}

		/**
		* Returns the last facility user service in the ordered set where facilityServiceId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility user service
		* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserService findByFacilityUserMappingByFacilityService_Last(
			long facilityServiceId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityUserServiceException {
			return FacilityUserServiceUtil
					   .findByFacilityUserMappingByFacilityService_Last(facilityServiceId,
				orderByComparator);
		}

		/**
		* Returns the last facility user service in the ordered set where facilityServiceId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility user service, or <code>null</code> if a matching facility user service could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserService fetchByFacilityUserMappingByFacilityService_Last(
			long facilityServiceId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserServiceUtil
					   .fetchByFacilityUserMappingByFacilityService_Last(facilityServiceId,
				orderByComparator);
		}

		/**
		* Returns the facility user services before and after the current facility user service in the ordered set where facilityServiceId = &#63;.
		*
		* @param id the primary key of the current facility user service
		* @param facilityServiceId the facility service ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the previous, current, and next facility user service
		* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a facility user service with the primary key could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserService[] findByFacilityUserMappingByFacilityService_PrevAndNext(
			long id, long facilityServiceId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityUserServiceException {
			return FacilityUserServiceUtil
					   .findByFacilityUserMappingByFacilityService_PrevAndNext(id,
				facilityServiceId, orderByComparator);
		}

		/**
		* Returns all the facility user services.
		*
		* @return the facility user services
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilityUserService> findAll()
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserServiceUtil.findAll();
		}
		/**
		* Returns all the facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @param facilityUserMappingId the facility user mapping ID
		* @return the matching facility user services
		* @throws SystemException if a system exception occurred
		*/
		public List<FacilityUserService> findByFusByServiceUserMapping(
			long facilityServiceId, long facilityUserMappingId)
			throws SystemException {
			return FacilityUserServiceUtil
					   .findByFusByServiceUserMapping(facilityServiceId,
				facilityUserMappingId);
		}
}