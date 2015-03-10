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
import com.pacnet.connect.service.base.FacilityExternalVisitorLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.FacilityExternalVisitorUtil;

/**
 * The implementation of the facility external visitor local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.pacnet.connect.service.FacilityExternalVisitorLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.FacilityExternalVisitorLocalServiceBaseImpl
 * @see com.pacnet.connect.service.FacilityExternalVisitorLocalServiceUtil
 */
public class FacilityExternalVisitorLocalServiceImpl
	extends FacilityExternalVisitorLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.pacnet.connect.service.FacilityExternalVisitorLocalServiceUtil} to access the facility external visitor local service.
	 */
	
	public com.pacnet.connect.model.FacilityExternalVisitor createFacilityExternalVisitor(long faciltyId, long accessRequestId, 
			String name, String mobileNumber, String email, String address, String companyName,String documentId,String documentType,String remarks, boolean isActive, String createdBy, 
			Date createdOn, String updatedBy, Date updatedOn) {
		com.pacnet.connect.model.FacilityExternalVisitor facilityExternalVisitor = null;
		try{
		
		facilityExternalVisitor = facilityExternalVisitorPersistence.create(0);
		facilityExternalVisitor.setFacilityId(faciltyId);
		facilityExternalVisitor.setAccessRequestId(accessRequestId);
		facilityExternalVisitor.setName(name);
		facilityExternalVisitor.setMobileNumber(mobileNumber);
		facilityExternalVisitor.setEmail(email);
		facilityExternalVisitor.setAddress(address);
		facilityExternalVisitor.setCompanyName(companyName);
		facilityExternalVisitor.setIsActive(isActive);
		facilityExternalVisitor.setCreatedOn(createdOn);
		facilityExternalVisitor.setCreatedBy(createdBy);
		facilityExternalVisitor.setUpdatedBy(updatedBy);
		facilityExternalVisitor.setUpdatedOn(updatedOn);
		facilityExternalVisitor.setDocumentId(documentId);
		facilityExternalVisitor.setDocumentType(documentType);
		facilityExternalVisitor.setRemarks(remarks);
		facilityExternalVisitor = facilityExternalVisitorPersistence.update(facilityExternalVisitor, false);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return facilityExternalVisitor;
	}
	
	public com.pacnet.connect.model.FacilityExternalVisitor updateFacilityExternalVisitor(long id, long faciltyId, long accessRequestId, 
			String name, String mobileNumber, String email, String address, String companyName,String documentId,String documentType,String remarks, boolean isActive, String createdBy, 
			Date createdOn, String updatedBy, Date updatedOn) {
		com.pacnet.connect.model.FacilityExternalVisitor facilityExternalVisitor = null;
		try{
		
		facilityExternalVisitor = facilityExternalVisitorPersistence.fetchByPrimaryKey(id);
		facilityExternalVisitor.setFacilityId(faciltyId);
		facilityExternalVisitor.setAccessRequestId(accessRequestId);
		facilityExternalVisitor.setName(name);
		facilityExternalVisitor.setMobileNumber(mobileNumber);
		facilityExternalVisitor.setEmail(email);
		facilityExternalVisitor.setAddress(address);
		facilityExternalVisitor.setCompanyName(companyName);
		facilityExternalVisitor.setIsActive(isActive);
		facilityExternalVisitor.setCreatedOn(createdOn);
		facilityExternalVisitor.setCreatedBy(createdBy);
		facilityExternalVisitor.setUpdatedBy(updatedBy);
		facilityExternalVisitor.setUpdatedOn(updatedOn);
		facilityExternalVisitor.setDocumentId(documentId);
		facilityExternalVisitor.setDocumentType(documentType);
		facilityExternalVisitor.setRemarks(remarks);
		
		facilityExternalVisitor = facilityExternalVisitorPersistence.update(facilityExternalVisitor, false);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return facilityExternalVisitor;
	}
	
	
	public boolean deleteFacilityExternalVisitorId(long id) {
		boolean isDeleted = false;
		try{
			facilityExternalVisitorPersistence.remove(id);
			isDeleted = true;
		}catch(Exception e){
			isDeleted = false;
			e.printStackTrace();
		}
		return isDeleted;
 }
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByFacility(
			long faciltyId)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityExternalVisitorUtil.findByFacilityExternalVisitorByFacility(faciltyId);
		}

		/**
		* Returns a range of all the facility external visitors where faciltyId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param faciltyId the facilty ID
		* @param start the lower bound of the range of facility external visitors
		* @param end the upper bound of the range of facility external visitors (not inclusive)
		* @return the range of matching facility external visitors
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByFacility(
			long faciltyId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityExternalVisitorUtil
					   .findByFacilityExternalVisitorByFacility(faciltyId, start,
				end);
		}

		/**
		* Returns an ordered range of all the facility external visitors where faciltyId = &#63;.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param faciltyId the facilty ID
		* @param start the lower bound of the range of facility external visitors
		* @param end the upper bound of the range of facility external visitors (not inclusive)
		* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
		* @return the ordered range of matching facility external visitors
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByFacility(
			long faciltyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityExternalVisitorUtil
					   .findByFacilityExternalVisitorByFacility(faciltyId, start,
				end, orderByComparator);
		}
		
		public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByAccessRequest(
				long accessRequestId)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilityExternalVisitorUtil
						   .findByFacilityExternalVisitorByAccessRequest(accessRequestId);
			}

			/**
			* Returns a range of all the facility external visitors where accessRequestId = &#63;.
			*
			* <p>
			* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
			* </p>
			*
			* @param accessRequestId the access request ID
			* @param start the lower bound of the range of facility external visitors
			* @param end the upper bound of the range of facility external visitors (not inclusive)
			* @return the range of matching facility external visitors
			* @throws SystemException if a system exception occurred
			*/
			public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByAccessRequest(
				long accessRequestId, int start, int end)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilityExternalVisitorUtil
						   .findByFacilityExternalVisitorByAccessRequest(accessRequestId,
					start, end);
			}

			/**
			* Returns an ordered range of all the facility external visitors where accessRequestId = &#63;.
			*
			* <p>
			* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
			* </p>
			*
			* @param accessRequestId the access request ID
			* @param start the lower bound of the range of facility external visitors
			* @param end the upper bound of the range of facility external visitors (not inclusive)
			* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
			* @return the ordered range of matching facility external visitors
			* @throws SystemException if a system exception occurred
			*/
			public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByAccessRequest(
				long accessRequestId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilityExternalVisitorUtil
						   .findByFacilityExternalVisitorByAccessRequest(accessRequestId,
					start, end, orderByComparator);
			}
			
			public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findAll()
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityExternalVisitorUtil.findAll();
		}

		/**
		* Returns a range of all the facility external visitors.
		*
		* <p>
		* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
		* </p>
		*
		* @param start the lower bound of the range of facility external visitors
		* @param end the upper bound of the range of facility external visitors (not inclusive)
		* @return the range of facility external visitors
		* @throws SystemException if a system exception occurred
		*/
		public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findAll(
			int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityExternalVisitorUtil.findAll(start, end);
		}
		
		
		public void removeByFacilityExternalVisitorByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		FacilityExternalVisitorUtil.removeByFacilityExternalVisitorByFacility(faciltyId);
	}

	/**
	* Removes all the facility external visitors where accessRequestId = &#63; from the database.
	*
	* @param accessRequestId the access request ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityExternalVisitorByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		FacilityExternalVisitorUtil
			.removeByFacilityExternalVisitorByAccessRequest(accessRequestId);
	}
}