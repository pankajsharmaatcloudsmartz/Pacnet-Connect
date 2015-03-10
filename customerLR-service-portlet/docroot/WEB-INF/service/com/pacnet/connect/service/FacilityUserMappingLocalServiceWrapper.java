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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link FacilityUserMappingLocalService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       FacilityUserMappingLocalService
 * @generated
 */
public class FacilityUserMappingLocalServiceWrapper
	implements FacilityUserMappingLocalService,
		ServiceWrapper<FacilityUserMappingLocalService> {
	public FacilityUserMappingLocalServiceWrapper(
		FacilityUserMappingLocalService facilityUserMappingLocalService) {
		_facilityUserMappingLocalService = facilityUserMappingLocalService;
	}

	/**
	* Adds the facility user mapping to the database. Also notifies the appropriate model listeners.
	*
	* @param facilityUserMapping the facility user mapping
	* @return the facility user mapping that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping addFacilityUserMapping(
		com.pacnet.connect.model.FacilityUserMapping facilityUserMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.addFacilityUserMapping(facilityUserMapping);
	}

	/**
	* Creates a new facility user mapping with the primary key. Does not add the facility user mapping to the database.
	*
	* @param id the primary key for the new facility user mapping
	* @return the new facility user mapping
	*/
	public com.pacnet.connect.model.FacilityUserMapping createFacilityUserMapping(
		long id) {
		return _facilityUserMappingLocalService.createFacilityUserMapping(id);
	}

	/**
	* Deletes the facility user mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility user mapping
	* @return the facility user mapping that was removed
	* @throws PortalException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping deleteFacilityUserMapping(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.deleteFacilityUserMapping(id);
	}

	/**
	* Deletes the facility user mapping from the database. Also notifies the appropriate model listeners.
	*
	* @param facilityUserMapping the facility user mapping
	* @return the facility user mapping that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping deleteFacilityUserMapping(
		com.pacnet.connect.model.FacilityUserMapping facilityUserMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.deleteFacilityUserMapping(facilityUserMapping);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _facilityUserMappingLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.pacnet.connect.model.FacilityUserMapping fetchFacilityUserMapping(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.fetchFacilityUserMapping(id);
	}

	/**
	* Returns the facility user mapping with the primary key.
	*
	* @param id the primary key of the facility user mapping
	* @return the facility user mapping
	* @throws PortalException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping getFacilityUserMapping(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.getFacilityUserMapping(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the facility user mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @return the range of facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> getFacilityUserMappings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.getFacilityUserMappings(start,
			end);
	}

	/**
	* Returns the number of facility user mappings.
	*
	* @return the number of facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int getFacilityUserMappingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.getFacilityUserMappingsCount();
	}

	/**
	* Updates the facility user mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityUserMapping the facility user mapping
	* @return the facility user mapping that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping updateFacilityUserMapping(
		com.pacnet.connect.model.FacilityUserMapping facilityUserMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.updateFacilityUserMapping(facilityUserMapping);
	}

	/**
	* Updates the facility user mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityUserMapping the facility user mapping
	* @param merge whether to merge the facility user mapping with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the facility user mapping that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping updateFacilityUserMapping(
		com.pacnet.connect.model.FacilityUserMapping facilityUserMapping,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.updateFacilityUserMapping(facilityUserMapping,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _facilityUserMappingLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_facilityUserMappingLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _facilityUserMappingLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public com.pacnet.connect.model.FacilityUserMapping createFacilityUserMapping(
		long customerId, long faciltyId, long customerContactId,
		boolean isActive, java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn,
		long nonPacnetUserId) {
		return _facilityUserMappingLocalService.createFacilityUserMapping(customerId,
			faciltyId, customerContactId, isActive, createdBy, createdOn,
			updatedBy, updatedOn, nonPacnetUserId);
	}

	public com.pacnet.connect.model.FacilityUserMapping updateFacilityUserMapping(
		long id, long customerId, long faciltyId, long customerContactId,
		boolean isActive, java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn,
		long nonPacnetUserId) {
		return _facilityUserMappingLocalService.updateFacilityUserMapping(id,
			customerId, faciltyId, customerContactId, isActive, createdBy,
			createdOn, updatedBy, updatedOn, nonPacnetUserId);
	}

	public boolean deleteFacilityById(long id) {
		return _facilityUserMappingLocalService.deleteFacilityById(id);
	}

	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByCustomerId(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.findByFacilityUserMappingByCustomerId(customerId);
	}

	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.findAll();
	}

	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByCustomerContact(
		long customerId, long customerContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.findByFacilityByCustomerContact(customerId,
			customerContactId);
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
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByCustomerId(
		long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.findByFacilityUserMappingByCustomerId(customerId,
			start, end);
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
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByCustomerId(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.findByFacilityUserMappingByCustomerId(customerId,
			start, end, orderByComparator);
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
	public com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return _facilityUserMappingLocalService.findByFacilityUserMappingByCustomerId_First(customerId,
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
	public com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.fetchByFacilityUserMappingByCustomerId_First(customerId,
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
	public com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return _facilityUserMappingLocalService.findByFacilityUserMappingByCustomerId_Last(customerId,
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
	public com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.fetchByFacilityUserMappingByCustomerId_Last(customerId,
			orderByComparator);
	}

	/**
	* Returns all the facility user mappings where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @return the matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByFacility(
		long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.findByFacilityUserMappingByFacility(faciltyId);
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
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByFacility(
		long faciltyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.findByFacilityUserMappingByFacility(faciltyId,
			start, end);
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
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByFacility(
		long faciltyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.findByFacilityUserMappingByFacility(faciltyId,
			start, end, orderByComparator);
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
	public com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return _facilityUserMappingLocalService.findByFacilityUserMappingByFacility_First(faciltyId,
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
	public com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.fetchByFacilityUserMappingByFacility_First(faciltyId,
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
	public com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return _facilityUserMappingLocalService.findByFacilityUserMappingByFacility_Last(faciltyId,
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
	public com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.fetchByFacilityUserMappingByFacility_Last(faciltyId,
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
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFumByFacilityCustomerContact(
		long customerId, long customerContactId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.findByFumByFacilityCustomerContact(customerId,
			customerContactId, faciltyId);
	}

	/**
	* Removes all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityByNonPacnetUserId(long customerId,
		long nonPacnetUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_facilityUserMappingLocalService.removeByFacilityByNonPacnetUserId(customerId,
			nonPacnetUserId);
	}

	/**
	* Removes all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityByFacilityAndNonPacnetUserId(long customerId,
		long nonPacnetUserId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_facilityUserMappingLocalService.removeByFacilityByFacilityAndNonPacnetUserId(customerId,
			nonPacnetUserId, faciltyId);
	}

	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByFacilityAndNonPacnetUserId(
		long customerId, long nonPacnetUserId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.findByFacilityByFacilityAndNonPacnetUserId(customerId,
			nonPacnetUserId, faciltyId);
	}

	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByNonPacnetUserId(
		long customerId, long nonPacnetUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.findByFacilityByNonPacnetUserId(customerId,
			nonPacnetUserId, start, end, orderByComparator);
	}

	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByNonPacnetUserId(
		long customerId, long nonPacnetUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMappingLocalService.findByFacilityByNonPacnetUserId(customerId,
			nonPacnetUserId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public FacilityUserMappingLocalService getWrappedFacilityUserMappingLocalService() {
		return _facilityUserMappingLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedFacilityUserMappingLocalService(
		FacilityUserMappingLocalService facilityUserMappingLocalService) {
		_facilityUserMappingLocalService = facilityUserMappingLocalService;
	}

	public FacilityUserMappingLocalService getWrappedService() {
		return _facilityUserMappingLocalService;
	}

	public void setWrappedService(
		FacilityUserMappingLocalService facilityUserMappingLocalService) {
		_facilityUserMappingLocalService = facilityUserMappingLocalService;
	}

	private FacilityUserMappingLocalService _facilityUserMappingLocalService;
}