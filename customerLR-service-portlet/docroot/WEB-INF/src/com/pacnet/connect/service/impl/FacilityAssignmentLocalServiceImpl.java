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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.pacnet.connect.common.CommonServiceUtils;
import com.pacnet.connect.model.FacilityAssignment;
import com.pacnet.connect.service.FacilityAssignmentLocalServiceUtil;
import com.pacnet.connect.service.base.FacilityAssignmentLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.FacilityAssignmentUtil;

/**
 * The implementation of the facility assignment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.pacnet.connect.service.FacilityAssignmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.FacilityAssignmentLocalServiceBaseImpl
 * @see com.pacnet.connect.service.FacilityAssignmentLocalServiceUtil
 */
public class FacilityAssignmentLocalServiceImpl	extends FacilityAssignmentLocalServiceBaseImpl {
	public com.pacnet.connect.model.FacilityAssignment createFacilityAssignment(long customerId, long facilityId, long facilityServiceId, boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		FacilityAssignment facilityAssignment = null;		
		try{		
			facilityAssignment = facilityAssignmentPersistence.create(0);
			facilityAssignment.setFaciltyId(facilityId);
			facilityAssignment.setCustomerId(customerId);
			facilityAssignment.setFacilityServiceId(facilityServiceId);
			facilityAssignment.setIsActive(isActive);
			facilityAssignment.setCreatedOn(createdOn);
			facilityAssignment.setCreatedBy(createdBy);
			facilityAssignment.setUpdatedBy(updatedBy);
			facilityAssignment.setUpdatedOn(updatedOn);
			facilityAssignment = facilityAssignmentPersistence.update(facilityAssignment, false);
		}catch(Exception e){
			e.printStackTrace();
		}
		return facilityAssignment;
	}
	
	public com.pacnet.connect.model.FacilityAssignment  updateFacilityAssignment(long id, long customerId, long facilityId, long facilityServiceId, boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		FacilityAssignment facilityAssignment = null;		
		try{
			facilityAssignment = facilityAssignmentPersistence.fetchByPrimaryKey(id);
			facilityAssignment.setFaciltyId(facilityId);
			facilityAssignment.setCustomerId(customerId);
			facilityAssignment.setFacilityServiceId(facilityServiceId);
			facilityAssignment.setIsActive(isActive);
			facilityAssignment.setCreatedOn(createdOn);
			facilityAssignment.setCreatedBy(createdBy);
			facilityAssignment.setUpdatedBy(updatedBy);
			facilityAssignment.setUpdatedOn(updatedOn);
			facilityAssignment = facilityAssignmentPersistence.update(facilityAssignment, false);
		}catch(Exception e){
			e.printStackTrace();
		}
		return facilityAssignment;
	}
	
	public boolean deleteFacilityById(long id) {
		boolean isDeleted = false;
		try{
			facilityAssignmentPersistence.remove(id);
			isDeleted = true;
		}catch(Exception e){
			isDeleted = false;
			e.printStackTrace();
		}
		return isDeleted;
	}
	
	public java.util.List<com.pacnet.connect.model.FacilityAssignment> getFacilityAssignmentByStatus(int status){
		java.util.List <FacilityAssignment> facilitiesAss = new java.util.ArrayList <FacilityAssignment>();
		try {			
			DynamicQuery dynamicQuery = new CommonServiceUtils<FacilityAssignment>().getServiceContextLoader(FacilityAssignment.class);
			
			if(status==0){
				dynamicQuery.add(RestrictionsFactoryUtil.eq("isActive", new Boolean(false)));
				facilitiesAss = FacilityAssignmentLocalServiceUtil.dynamicQuery(dynamicQuery);
			}else if(status==1){
				dynamicQuery.add(RestrictionsFactoryUtil.eq("isActive", new Boolean(true)));
				facilitiesAss = FacilityAssignmentLocalServiceUtil.dynamicQuery(dynamicQuery);
			}else{
				facilitiesAss = FacilityAssignmentUtil.findAll();
			}
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			e.printStackTrace();
		}
		return facilitiesAss;
	}
	
	
	public java.util.List<com.pacnet.connect.model.FacilityAssignment> getFacilityAssignmentByStatusAndCustId(int status, long customerId){
		java.util.List <FacilityAssignment> facilitiesAss = new java.util.ArrayList <FacilityAssignment>();
		try {			
			DynamicQuery dynamicQuery = new CommonServiceUtils<FacilityAssignment>().getServiceContextLoader(FacilityAssignment.class);
			
			if(status==0){
				dynamicQuery.add(RestrictionsFactoryUtil.eq("isActive", new Boolean(false)))
				.add(RestrictionsFactoryUtil.eq("customerId", customerId));
				facilitiesAss = FacilityAssignmentLocalServiceUtil.dynamicQuery(dynamicQuery);
			}else if(status==1){
				dynamicQuery.add(RestrictionsFactoryUtil.eq("isActive", new Boolean(true)))
				.add(RestrictionsFactoryUtil.eq("customerId", customerId));
				facilitiesAss = FacilityAssignmentLocalServiceUtil.dynamicQuery(dynamicQuery);
			}else{
				facilitiesAss = FacilityAssignmentUtil.findByFacilityAssignmentByCustomerId(customerId);
			}
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			e.printStackTrace();
		}
		return facilitiesAss;
	}
	
	
	public java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByCustomerId(
			long customerId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityAssignmentUtil.findByFacilityAssignmentByCustomerId(customerId);
		}

		/**
		* Returns a range of all the facility assignments where customerId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param customerId the customer ID
		* @param start the lower bound of the range of facility assignments
		* @param end the upper bound of the range of facility assignments (not inclusive)
		* @return the range of matching facility assignments
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByCustomerId(
			long customerId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityAssignmentUtil
					   .findByFacilityAssignmentByCustomerId(customerId, start, end);
		}

		/**
		* Returns an ordered range of all the facility assignments where customerId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param customerId the customer ID
		* @param start the lower bound of the range of facility assignments
		* @param end the upper bound of the range of facility assignments (not inclusive)
		* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
		* @return the ordered range of matching facility assignments
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByCustomerId(
			long customerId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityAssignmentUtil
					   .findByFacilityAssignmentByCustomerId(customerId, start,
				end, orderByComparator);
		}

		/**
		* Returns the first facility assignment in the ordered set where customerId = &#63;.
		*
		* @param customerId the customer ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility assignment
		* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByCustomerId_First(
			long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityAssignmentException {
			return FacilityAssignmentUtil   .findByFacilityAssignmentByCustomerId_First(customerId,
				orderByComparator);
		}

		/**
		* Returns the first facility assignment in the ordered set where customerId = &#63;.
		*
		* @param customerId the customer ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByCustomerId_First(
			long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityAssignmentUtil
					   .fetchByFacilityAssignmentByCustomerId_First(customerId,
				orderByComparator);
		}

		/**
		* Returns the last facility assignment in the ordered set where customerId = &#63;.
		*
		* @param customerId the customer ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility assignment
		* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByCustomerId_Last(
			long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityAssignmentException {
			return FacilityAssignmentUtil
					   .findByFacilityAssignmentByCustomerId_Last(customerId,
				orderByComparator);
		}

		/**
		* Returns the last facility assignment in the ordered set where customerId = &#63;.
		*
		* @param customerId the customer ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByCustomerId_Last(
			long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityAssignmentUtil
					   .fetchByFacilityAssignmentByCustomerId_Last(customerId,
				orderByComparator);
		}

		
		/**
		* Returns all the facility assignments where faciltyId = &#63;.
		*
		* @param faciltyId the facilty ID
		* @return the matching facility assignments
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByFacility(
			long faciltyId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityAssignmentUtil.findByFacilityAssignmentByFacility(faciltyId);
		}

		/**
		* Returns a range of all the facility assignments where faciltyId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param faciltyId the facilty ID
		* @param start the lower bound of the range of facility assignments
		* @param end the upper bound of the range of facility assignments (not inclusive)
		* @return the range of matching facility assignments
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByFacility(
			long faciltyId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityAssignmentUtil
					   .findByFacilityAssignmentByFacility(faciltyId, start, end);
		}

		/**
		* Returns an ordered range of all the facility assignments where faciltyId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param faciltyId the facilty ID
		* @param start the lower bound of the range of facility assignments
		* @param end the upper bound of the range of facility assignments (not inclusive)
		* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
		* @return the ordered range of matching facility assignments
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByFacility(
			long faciltyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityAssignmentUtil
					   .findByFacilityAssignmentByFacility(faciltyId, start, end,
				orderByComparator);
		}

		/**
		* Returns the first facility assignment in the ordered set where faciltyId = &#63;.
		*
		* @param faciltyId the facilty ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility assignment
		* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByFacility_First(
			long faciltyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityAssignmentException {
			return FacilityAssignmentUtil
					   .findByFacilityAssignmentByFacility_First(faciltyId,
				orderByComparator);
		}

		/**
		* Returns the first facility assignment in the ordered set where faciltyId = &#63;.
		*
		* @param faciltyId the facilty ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByFacility_First(
			long faciltyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityAssignmentUtil
					   .fetchByFacilityAssignmentByFacility_First(faciltyId,
				orderByComparator);
		}

		/**
		* Returns the last facility assignment in the ordered set where faciltyId = &#63;.
		*
		* @param faciltyId the facilty ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility assignment
		* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByFacility_Last(
			long faciltyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityAssignmentException {
			return FacilityAssignmentUtil
					   .findByFacilityAssignmentByFacility_Last(faciltyId,
				orderByComparator);
		}

		/**
		* Returns the last facility assignment in the ordered set where faciltyId = &#63;.
		*
		* @param faciltyId the facilty ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByFacility_Last(
			long faciltyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityAssignmentUtil
					   .fetchByFacilityAssignmentByFacility_Last(faciltyId,
				orderByComparator);
		}

	

		/**
		* Returns all the facility assignments where facilityServiceId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @return the matching facility assignments
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByService(
			long facilityServiceId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityAssignmentUtil
					   .findByFacilityAssignmentByService(facilityServiceId);
		}

		/**
		* Returns a range of all the facility assignments where facilityServiceId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param facilityServiceId the facility service ID
		* @param start the lower bound of the range of facility assignments
		* @param end the upper bound of the range of facility assignments (not inclusive)
		* @return the range of matching facility assignments
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByService(
			long facilityServiceId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityAssignmentUtil
					   .findByFacilityAssignmentByService(facilityServiceId, start,
				end);
		}

		/**
		* Returns an ordered range of all the facility assignments where facilityServiceId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param facilityServiceId the facility service ID
		* @param start the lower bound of the range of facility assignments
		* @param end the upper bound of the range of facility assignments (not inclusive)
		* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
		* @return the ordered range of matching facility assignments
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByService(
			long facilityServiceId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityAssignmentUtil
					   .findByFacilityAssignmentByService(facilityServiceId, start,
				end, orderByComparator);
		}

		/**
		* Returns the first facility assignment in the ordered set where facilityServiceId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility assignment
		* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByService_First(
			long facilityServiceId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityAssignmentException {
			return FacilityAssignmentUtil
					   .findByFacilityAssignmentByService_First(facilityServiceId,
				orderByComparator);
		}

		/**
		* Returns the first facility assignment in the ordered set where facilityServiceId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByService_First(
			long facilityServiceId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityAssignmentUtil
					   .fetchByFacilityAssignmentByService_First(facilityServiceId,
				orderByComparator);
		}

		/**
		* Returns the last facility assignment in the ordered set where facilityServiceId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility assignment
		* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByService_Last(
			long facilityServiceId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityAssignmentException {
			return FacilityAssignmentUtil
					   .findByFacilityAssignmentByService_Last(facilityServiceId,
				orderByComparator);
		}

		/**
		* Returns the last facility assignment in the ordered set where facilityServiceId = &#63;.
		*
		* @param facilityServiceId the facility service ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByService_Last(
			long facilityServiceId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityAssignmentUtil
					   .fetchByFacilityAssignmentByService_Last(facilityServiceId,
				orderByComparator);
		}
}