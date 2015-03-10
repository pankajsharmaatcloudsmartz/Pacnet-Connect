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
import com.pacnet.connect.model.Facility;
import com.pacnet.connect.model.FacilityStaffMapping;
import com.pacnet.connect.service.base.FacilityStaffMappingLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.FacilityStaffMappingUtil;

/**
 * The implementation of the facility staff mapping local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.pacnet.connect.service.FacilityStaffMappingLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.FacilityStaffMappingLocalServiceBaseImpl
 * @see com.pacnet.connect.service.FacilityStaffMappingLocalServiceUtil
 */
public class FacilityStaffMappingLocalServiceImpl
	extends FacilityStaffMappingLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.pacnet.connect.service.FacilityStaffMappingLocalServiceUtil} to access the facility staff mapping local service.
	 */
	
	public com.pacnet.connect.model.FacilityStaffMapping createFacilityStaff(long faciltyId, long staffUserId , 
			boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		FacilityStaffMapping facilityStaffMapping = null;
		try{
		
		facilityStaffMapping = facilityStaffMappingPersistence.create(0);
		facilityStaffMapping.setFacilityId(faciltyId);
		facilityStaffMapping.setStaffUserId(staffUserId);
		facilityStaffMapping.setIsActive(isActive);
		facilityStaffMapping.setCreatedOn(createdOn);
		facilityStaffMapping.setCreatedBy(createdBy);
		facilityStaffMapping.setUpdatedBy(updatedBy);
		facilityStaffMapping.setUpdatedOn(updatedOn);
		facilityStaffMapping = facilityStaffMappingPersistence.update(facilityStaffMapping, false);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return facilityStaffMapping;
	}
	
	public com.pacnet.connect.model.FacilityStaffMapping updateFacilityStaff(long id, long faciltyId, long staffUserId, 
			boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		FacilityStaffMapping facilityStaffMapping = null;
		try{
		
		facilityStaffMapping = facilityStaffMappingPersistence.fetchByPrimaryKey(id);
		facilityStaffMapping.setFacilityId(faciltyId);
		facilityStaffMapping.setStaffUserId(staffUserId);
		facilityStaffMapping.setIsActive(isActive);
		facilityStaffMapping.setCreatedOn(createdOn);
		facilityStaffMapping.setCreatedBy(createdBy);
		facilityStaffMapping.setUpdatedBy(updatedBy);
		facilityStaffMapping.setUpdatedOn(updatedOn);
		facilityStaffMapping = facilityStaffMappingPersistence.update(facilityStaffMapping, false);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return facilityStaffMapping;
	}
	
	
	
	
	public boolean deleteFacilityStaffMappingById(long id) {
		boolean isDeleted = false;
		try{
			facilityStaffMappingPersistence.remove(id);
			isDeleted = true;
		}catch(Exception e){
			isDeleted = false;
			e.printStackTrace();
		}
		return isDeleted;
 }
	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByFacility(
			long faciltyId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityStaffMappingUtil.findByFacilityStaffByFacility(faciltyId);
		}

		/**
		* Returns a range of all the facility staff mappings where faciltyId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param faciltyId the facilty ID
		* @param start the lower bound of the range of facility staff mappings
		* @param end the upper bound of the range of facility staff mappings (not inclusive)
		* @return the range of matching facility staff mappings
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByFacility(
			long faciltyId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityStaffMappingUtil.findByFacilityStaffByFacility(faciltyId, start, end);
		}

		public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByStaffUserId(
				long staffUserId)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilityStaffMappingUtil.findByFacilityStaffByStaffUserId(staffUserId);
			}

			/**
			* Returns a range of all the facility staff mappings where staffUserId = &#63;.
			*
			* <p>
			* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
			* </p>
			*
			* @param staffUserId the staff user ID
			* @param start the lower bound of the range of facility staff mappings
			* @param end the upper bound of the range of facility staff mappings (not inclusive)
			* @return the range of matching facility staff mappings
			* @throws SystemException if a system exception occurred
			*/
			public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByStaffUserId(
				long staffUserId, int start, int end)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilityStaffMappingUtil.findByFacilityStaffByStaffUserId(staffUserId, start, end);
			}

			/**
			* Returns an ordered range of all the facility staff mappings where staffUserId = &#63;.
			*
			* <p>
			* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
			* </p>
			*
			* @param staffUserId the staff user ID
			* @param start the lower bound of the range of facility staff mappings
			* @param end the upper bound of the range of facility staff mappings (not inclusive)
			* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
			* @return the ordered range of matching facility staff mappings
			* @throws SystemException if a system exception occurred
			*/
			public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByStaffUserId(
				long staffUserId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilityStaffMappingUtil.findByFacilityStaffByStaffUserId(staffUserId, start, end,
					orderByComparator);
			}

			/**
			* Returns the first facility staff mapping in the ordered set where staffUserId = &#63;.
			*
			* @param staffUserId the staff user ID
			* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
			* @return the first matching facility staff mapping
			* @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a matching facility staff mapping could not be found
			* @throws SystemException if a system exception occurred
			*/
			public com.pacnet.connect.model.FacilityStaffMapping findByFacilityStaffByStaffUserId_First(
				long staffUserId,
				com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
				throws com.liferay.portal.kernel.exception.SystemException,
					com.pacnet.connect.NoSuchFacilityStaffMappingException {
				return FacilityStaffMappingUtil.findByFacilityStaffByStaffUserId_First(staffUserId,
					orderByComparator);
			}

			/**
			* Returns the first facility staff mapping in the ordered set where staffUserId = &#63;.
			*
			* @param staffUserId the staff user ID
			* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
			* @return the first matching facility staff mapping, or <code>null</code> if a matching facility staff mapping could not be found
			* @throws SystemException if a system exception occurred
			*/
			public com.pacnet.connect.model.FacilityStaffMapping fetchByFacilityStaffByStaffUserId_First(
				long staffUserId,
				com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilityStaffMappingUtil.fetchByFacilityStaffByStaffUserId_First(staffUserId,
					orderByComparator);
			}

			/**
			* Returns the last facility staff mapping in the ordered set where staffUserId = &#63;.
			*
			* @param staffUserId the staff user ID
			* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
			* @return the last matching facility staff mapping
			* @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a matching facility staff mapping could not be found
			* @throws SystemException if a system exception occurred
			*/
			public com.pacnet.connect.model.FacilityStaffMapping findByFacilityStaffByStaffUserId_Last(
				long staffUserId,
				com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
				throws com.liferay.portal.kernel.exception.SystemException,
					com.pacnet.connect.NoSuchFacilityStaffMappingException {
				return FacilityStaffMappingUtil.findByFacilityStaffByStaffUserId_Last(staffUserId,
					orderByComparator);
			}
			
		public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findAll()
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityStaffMappingUtil.findAll();
		}
		
		
		public void removeByFacilityStaffByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		FacilityStaffMappingUtil.removeByFacilityStaffByFacility(faciltyId);
	}

	/**
	* Removes all the facility staff mappings where staffUserId = &#63; from the database.
	*
	* @param staffUserId the staff user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityStaffByStaffUserId(long staffUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		FacilityStaffMappingUtil.removeByFacilityStaffByStaffUserId(staffUserId);
	}
		
}