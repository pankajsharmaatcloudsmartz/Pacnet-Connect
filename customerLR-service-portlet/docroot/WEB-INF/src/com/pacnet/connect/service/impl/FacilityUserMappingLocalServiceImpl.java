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
import com.pacnet.connect.model.FacilityUserMapping;
import com.pacnet.connect.service.base.FacilityUserMappingLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.FacilityUserMappingUtil;

/**
 * The implementation of the facility user mapping local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.pacnet.connect.service.FacilityUserMappingLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.FacilityUserMappingLocalServiceBaseImpl
 * @see com.pacnet.connect.service.FacilityUserMappingLocalServiceUtil
 */
public class FacilityUserMappingLocalServiceImpl
	extends FacilityUserMappingLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.pacnet.connect.service.FacilityUserMappingLocalServiceUtil} to access the facility user mapping local service.
	 */
	public com.pacnet.connect.model.FacilityUserMapping createFacilityUserMapping(long customerId, long faciltyId, long  customerContactId,
			boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn,long nonPacnetUserId) {
		FacilityUserMapping facilityUserMapping = null;
		try{
		facilityUserMapping = facilityUserMappingPersistence.create(0);
		facilityUserMapping.setCustomerId(customerId);
		facilityUserMapping.setFaciltyId(faciltyId);
		facilityUserMapping.setCustomerContactId(customerContactId);
		facilityUserMapping.setIsActive(isActive);		
		facilityUserMapping.setCreatedOn(createdOn);
		facilityUserMapping.setCreatedBy(createdBy);
		facilityUserMapping.setUpdatedBy(updatedBy);
		facilityUserMapping.setUpdatedOn(updatedOn);
		facilityUserMapping.setNonPacnetUserId(nonPacnetUserId);
		facilityUserMapping = facilityUserMappingPersistence.update(facilityUserMapping, false);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return facilityUserMapping;
	}
	
	public com.pacnet.connect.model.FacilityUserMapping updateFacilityUserMapping(long id, long customerId, long faciltyId, long  customerContactId,
			boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn,long nonPacnetUserId) {
		FacilityUserMapping facilityUserMapping = null;
		try{
			facilityUserMapping = facilityUserMappingPersistence.fetchByPrimaryKey(id);
			facilityUserMapping.setCustomerId(customerId);
			facilityUserMapping.setFaciltyId(faciltyId);
			facilityUserMapping.setCustomerContactId(customerContactId);
			facilityUserMapping.setIsActive(isActive);		
			facilityUserMapping.setCreatedOn(createdOn);
			facilityUserMapping.setCreatedBy(createdBy);
			facilityUserMapping.setUpdatedBy(updatedBy);
			facilityUserMapping.setUpdatedOn(updatedOn);
			facilityUserMapping.setNonPacnetUserId(nonPacnetUserId);
			facilityUserMapping = facilityUserMappingPersistence.update(facilityUserMapping, false);
		}catch(Exception e){
			e.printStackTrace();
		}
		return facilityUserMapping;
	}
	
	public boolean deleteFacilityById(long id) {
		boolean isDeleted = false;
		try{
			facilityUserMappingPersistence.remove(id);
			isDeleted = true;
		}catch(Exception e){
			isDeleted = false;
			e.printStackTrace();
		}
	return isDeleted;
	}
	
	public  java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByCustomerId(
			long customerId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserMappingUtil.findByFacilityUserMappingByCustomerId(customerId);
		}
	
		public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findAll() throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserMappingUtil.findAll();
		}
		
		public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByCustomerContact(
				long customerId, long customerContactId)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilityUserMappingUtil.findByFacilityByCustomerContact(customerId, customerContactId);
			}
		/**
		* Returns a range of all the facility user mappings where customerId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param customerId the customer ID
		* @param start the lower bound of the range of facility user mappings
		* @param end the upper bound of the range of facility user mappings (not inclusive)
		* @return the range of matching facility user mappings
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByCustomerId(
			long customerId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserMappingUtil
					   .findByFacilityUserMappingByCustomerId(customerId, start, end);
		}

		/**
		* Returns an ordered range of all the facility user mappings where customerId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param customerId the customer ID
		* @param start the lower bound of the range of facility user mappings
		* @param end the upper bound of the range of facility user mappings (not inclusive)
		* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
		* @return the ordered range of matching facility user mappings
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByCustomerId(
			long customerId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserMappingUtil
					   .findByFacilityUserMappingByCustomerId(customerId, start,
				end, orderByComparator);
		}

		/**
		* Returns the first facility user mapping in the ordered set where customerId = &#63;.
		*
		* @param customerId the customer ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility user mapping
		* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByCustomerId_First(
			long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityUserMappingException {
			return FacilityUserMappingUtil
					   .findByFacilityUserMappingByCustomerId_First(customerId,
				orderByComparator);
		}

		/**
		* Returns the first facility user mapping in the ordered set where customerId = &#63;.
		*
		* @param customerId the customer ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByCustomerId_First(
			long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserMappingUtil
					   .fetchByFacilityUserMappingByCustomerId_First(customerId,
				orderByComparator);
		}

		/**
		* Returns the last facility user mapping in the ordered set where customerId = &#63;.
		*
		* @param customerId the customer ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility user mapping
		* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByCustomerId_Last(
			long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityUserMappingException {
			return FacilityUserMappingUtil
					   .findByFacilityUserMappingByCustomerId_Last(customerId,
				orderByComparator);
		}

		/**
		* Returns the last facility user mapping in the ordered set where customerId = &#63;.
		*
		* @param customerId the customer ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByCustomerId_Last(
			long customerId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserMappingUtil
					   .fetchByFacilityUserMappingByCustomerId_Last(customerId,
				orderByComparator);
		}

		/**
		* Returns all the facility user mappings where faciltyId = &#63;.
		*
		* @param faciltyId the facilty ID
		* @return the matching facility user mappings
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByFacility(
			long faciltyId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserMappingUtil.findByFacilityUserMappingByFacility(faciltyId);
		}

		/**
		* Returns a range of all the facility user mappings where faciltyId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param faciltyId the facilty ID
		* @param start the lower bound of the range of facility user mappings
		* @param end the upper bound of the range of facility user mappings (not inclusive)
		* @return the range of matching facility user mappings
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByFacility(
			long faciltyId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserMappingUtil
					   .findByFacilityUserMappingByFacility(faciltyId, start, end);
		}

		/**
		* Returns an ordered range of all the facility user mappings where faciltyId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param faciltyId the facilty ID
		* @param start the lower bound of the range of facility user mappings
		* @param end the upper bound of the range of facility user mappings (not inclusive)
		* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
		* @return the ordered range of matching facility user mappings
		* @throws SystemException if a system exception occurred
		*/
		public  java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByFacility(
			long faciltyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserMappingUtil
					   .findByFacilityUserMappingByFacility(faciltyId, start, end,
				orderByComparator);
		}

		/**
		* Returns the first facility user mapping in the ordered set where faciltyId = &#63;.
		*
		* @param faciltyId the facilty ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility user mapping
		* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByFacility_First(
			long faciltyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityUserMappingException {
			return FacilityUserMappingUtil
					   .findByFacilityUserMappingByFacility_First(faciltyId,
				orderByComparator);
		}

		/**
		* Returns the first facility user mapping in the ordered set where faciltyId = &#63;.
		*
		* @param faciltyId the facilty ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByFacility_First(
			long faciltyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserMappingUtil
					   .fetchByFacilityUserMappingByFacility_First(faciltyId,
				orderByComparator);
		}

		/**
		* Returns the last facility user mapping in the ordered set where faciltyId = &#63;.
		*
		* @param faciltyId the facilty ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility user mapping
		* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByFacility_Last(
			long faciltyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityUserMappingException {
			return FacilityUserMappingUtil
					   .findByFacilityUserMappingByFacility_Last(faciltyId,
				orderByComparator);
		}

		/**
		* Returns the last facility user mapping in the ordered set where faciltyId = &#63;.
		*
		* @param faciltyId the facilty ID
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
		* @throws SystemException if a system exception occurred
		*/
		public  com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByFacility_Last(
			long faciltyId,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserMappingUtil
					   .fetchByFacilityUserMappingByFacility_Last(faciltyId,
				orderByComparator);
		}
		
		/**
		* Returns all the facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
		*
		* @param customerId the customer ID
		* @param customerContactId the customer contact ID
		* @param faciltyId the facilty ID
		* @return the matching facility user mappings
		* @throws SystemException if a system exception occurred
		*/
		public List<FacilityUserMapping> findByFumByFacilityCustomerContact(
			long customerId, long customerContactId, long faciltyId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUserMappingUtil
					   .findByFumByFacilityCustomerContact(customerId,
				customerContactId, faciltyId);
		}
		
		/**
		* Removes all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; from the database.
		*
		* @param customerId the customer ID
		* @param nonPacnetUserId the non pacnet user ID
		* @throws SystemException if a system exception occurred
		*/
		public  void removeByFacilityByNonPacnetUserId(long customerId,
			long nonPacnetUserId)
			throws com.liferay.portal.kernel.exception.SystemException {
			FacilityUserMappingUtil.removeByFacilityByNonPacnetUserId(customerId, nonPacnetUserId);
		}

		/**
		* Removes all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63; from the database.
		*
		* @param customerId the customer ID
		* @param nonPacnetUserId the non pacnet user ID
		* @param faciltyId the facilty ID
		* @throws SystemException if a system exception occurred
		*/
		public  void removeByFacilityByFacilityAndNonPacnetUserId(
			long customerId, long nonPacnetUserId, long faciltyId)
			throws com.liferay.portal.kernel.exception.SystemException {
			FacilityUserMappingUtil.removeByFacilityByFacilityAndNonPacnetUserId(customerId,
				nonPacnetUserId, faciltyId);
		}
		
		public  java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByFacilityAndNonPacnetUserId(
				long customerId, long nonPacnetUserId, long faciltyId)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilityUserMappingUtil.findByFacilityByFacilityAndNonPacnetUserId(customerId,
					nonPacnetUserId, faciltyId);
			}
		
		public  java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByNonPacnetUserId(
				long customerId, long nonPacnetUserId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilityUserMappingUtil.findByFacilityByNonPacnetUserId(customerId,
					nonPacnetUserId, start, end, orderByComparator);
			}
		
		public  java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByNonPacnetUserId(
				long customerId, long nonPacnetUserId)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilityUserMappingUtil.findByFacilityByNonPacnetUserId(customerId, nonPacnetUserId);
			}
}