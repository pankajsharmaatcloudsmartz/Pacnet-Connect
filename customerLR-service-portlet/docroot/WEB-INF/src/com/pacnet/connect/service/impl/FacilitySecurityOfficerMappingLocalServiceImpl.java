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
import com.pacnet.connect.model.FacilitySecurityOfficerMapping;
import com.pacnet.connect.service.base.FacilitySecurityOfficerMappingLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.FacilitySecurityOfficerMappingUtil;

/**
 * The implementation of the facility security officer mapping local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.pacnet.connect.service.FacilitySecurityOfficerMappingLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.FacilitySecurityOfficerMappingLocalServiceBaseImpl
 * @see com.pacnet.connect.service.FacilitySecurityOfficerMappingLocalServiceUtil
 */
public class FacilitySecurityOfficerMappingLocalServiceImpl
	extends FacilitySecurityOfficerMappingLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.pacnet.connect.service.FacilitySecurityOfficerMappingLocalServiceUtil} to access the facility security officer mapping local service.
	 */
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping createFacilitySecurityOfficerMapping(long faciltyId, long securityOfficerUserId, 
			boolean isActive, String createdBy,	Date createdOn, String updatedBy, Date updatedOn) {
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping = null;
		try{
		
			facilitySecurityOfficerMapping = facilitySecurityOfficerMappingPersistence.create(0);
			facilitySecurityOfficerMapping.setFaciltyId(faciltyId);
			facilitySecurityOfficerMapping.setSecurityOfficerUserId(securityOfficerUserId);
			facilitySecurityOfficerMapping.setIsActive(isActive);
			facilitySecurityOfficerMapping.setCreatedOn(createdOn);
			facilitySecurityOfficerMapping.setCreatedBy(createdBy);
			facilitySecurityOfficerMapping.setUpdatedBy(updatedBy);
			facilitySecurityOfficerMapping.setUpdatedOn(updatedOn);
			facilitySecurityOfficerMapping = facilitySecurityOfficerMappingPersistence.update(facilitySecurityOfficerMapping, false);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return facilitySecurityOfficerMapping;
	}
	
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping updateFacilitySecurityOfficerMapping(long id, long faciltyId, long securityOfficerUserId, 
			boolean isActive, String createdBy,	Date createdOn, String updatedBy, Date updatedOn) {
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping = null;
		try{
			facilitySecurityOfficerMapping = facilitySecurityOfficerMappingPersistence.fetchByPrimaryKey(id);
			facilitySecurityOfficerMapping.setFaciltyId(faciltyId);
			facilitySecurityOfficerMapping.setSecurityOfficerUserId(securityOfficerUserId);
			facilitySecurityOfficerMapping.setIsActive(isActive);
			facilitySecurityOfficerMapping.setCreatedOn(createdOn);
			facilitySecurityOfficerMapping.setCreatedBy(createdBy);
			facilitySecurityOfficerMapping.setUpdatedBy(updatedBy);
			facilitySecurityOfficerMapping.setUpdatedOn(updatedOn);
			facilitySecurityOfficerMapping = facilitySecurityOfficerMappingPersistence.update(facilitySecurityOfficerMapping, false);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return facilitySecurityOfficerMapping;
	}
	
	
	public boolean deleteFacilityById(long id) {
		boolean isDeleted = false;
		try{
			facilitySecurityOfficerMappingPersistence.remove(id);
			isDeleted = true;
		}catch(Exception e){
			isDeleted = false;
			e.printStackTrace();
		}
	return isDeleted;
 }
	
	public  java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityByFacility(
			long faciltyId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilitySecurityOfficerMappingUtil.findByFacilitySecurityByFacility(faciltyId);
		}

		/**
		* Returns a range of all the facility security officer mappings where faciltyId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param faciltyId the facilty ID
		* @param start the lower bound of the range of facility security officer mappings
		* @param end the upper bound of the range of facility security officer mappings (not inclusive)
		* @return the range of matching facility security officer mappings
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityByFacility(
			long faciltyId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilitySecurityOfficerMappingUtil
					   .findByFacilitySecurityByFacility(faciltyId, start, end);
		}

		/**
		* Returns an ordered range of all the facility security officer mappings where faciltyId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param faciltyId the facilty ID
		* @param start the lower bound of the range of facility security officer mappings
		* @param end the upper bound of the range of facility security officer mappings (not inclusive)
		* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
		* @return the ordered range of matching facility security officer mappings
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityByFacility(
			long faciltyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilitySecurityOfficerMappingUtil
					   .findByFacilitySecurityByFacility(faciltyId, start, end,
				orderByComparator);
		}

		/**
		* Returns the first facility security officer mapping in the ordered set where faciltyId = &#63;.
		*
		* @param faciltyId the facilty ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility security officer mapping
		* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a matching facility security officer mapping could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilitySecurityOfficerMapping findByFacilitySecurityByFacility_First(
			long faciltyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException {
			return FacilitySecurityOfficerMappingUtil
					   .findByFacilitySecurityByFacility_First(faciltyId,
				orderByComparator);
		}

		/**
		* Returns the first facility security officer mapping in the ordered set where faciltyId = &#63;.
		*
		* @param faciltyId the facilty ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility security officer mapping, or <code>null</code> if a matching facility security officer mapping could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilitySecurityOfficerMapping fetchByFacilitySecurityByFacility_First(
			long faciltyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilitySecurityOfficerMappingUtil
					   .fetchByFacilitySecurityByFacility_First(faciltyId,
				orderByComparator);
		}

		/**
		* Returns the last facility security officer mapping in the ordered set where faciltyId = &#63;.
		*
		* @param faciltyId the facilty ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility security officer mapping
		* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a matching facility security officer mapping could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilitySecurityOfficerMapping findByFacilitySecurityByFacility_Last(
			long faciltyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException {
			return FacilitySecurityOfficerMappingUtil
					   .findByFacilitySecurityByFacility_Last(faciltyId,
				orderByComparator);
		}

		/**
		* Returns the last facility security officer mapping in the ordered set where faciltyId = &#63;.
		*
		* @param faciltyId the facilty ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility security officer mapping, or <code>null</code> if a matching facility security officer mapping could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilitySecurityOfficerMapping fetchByFacilitySecurityByFacility_Last(
			long faciltyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilitySecurityOfficerMappingUtil
					   .fetchByFacilitySecurityByFacility_Last(faciltyId,
				orderByComparator);
		}
		
		public java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityBySecurityOfficerUserId(
				long securityOfficerUserId)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilitySecurityOfficerMappingUtil.findByFacilitySecurityBySecurityOfficerUserId(securityOfficerUserId);
			}

		public java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityBySecurityOfficerUserId(
				long securityOfficerUserId, int start, int end)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilitySecurityOfficerMappingUtil.findByFacilitySecurityBySecurityOfficerUserId(securityOfficerUserId,
					start, end);
			}
			
		public java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityBySecurityOfficerUserId(
				long securityOfficerUserId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilitySecurityOfficerMappingUtil.findByFacilitySecurityBySecurityOfficerUserId(securityOfficerUserId,
					start, end, orderByComparator);
			}
		
		
}