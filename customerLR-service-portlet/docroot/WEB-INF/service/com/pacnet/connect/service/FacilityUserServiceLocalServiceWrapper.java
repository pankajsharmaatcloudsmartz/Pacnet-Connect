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
 * This class is a wrapper for {@link FacilityUserServiceLocalService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       FacilityUserServiceLocalService
 * @generated
 */
public class FacilityUserServiceLocalServiceWrapper
	implements FacilityUserServiceLocalService,
		ServiceWrapper<FacilityUserServiceLocalService> {
	public FacilityUserServiceLocalServiceWrapper(
		FacilityUserServiceLocalService facilityUserServiceLocalService) {
		_facilityUserServiceLocalService = facilityUserServiceLocalService;
	}

	/**
	* Adds the facility user service to the database. Also notifies the appropriate model listeners.
	*
	* @param facilityUserService the facility user service
	* @return the facility user service that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService addFacilityUserService(
		com.pacnet.connect.model.FacilityUserService facilityUserService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.addFacilityUserService(facilityUserService);
	}

	/**
	* Creates a new facility user service with the primary key. Does not add the facility user service to the database.
	*
	* @param id the primary key for the new facility user service
	* @return the new facility user service
	*/
	public com.pacnet.connect.model.FacilityUserService createFacilityUserService(
		long id) {
		return _facilityUserServiceLocalService.createFacilityUserService(id);
	}

	/**
	* Deletes the facility user service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility user service
	* @return the facility user service that was removed
	* @throws PortalException if a facility user service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService deleteFacilityUserService(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.deleteFacilityUserService(id);
	}

	/**
	* Deletes the facility user service from the database. Also notifies the appropriate model listeners.
	*
	* @param facilityUserService the facility user service
	* @return the facility user service that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService deleteFacilityUserService(
		com.pacnet.connect.model.FacilityUserService facilityUserService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.deleteFacilityUserService(facilityUserService);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _facilityUserServiceLocalService.dynamicQuery();
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
		return _facilityUserServiceLocalService.dynamicQuery(dynamicQuery);
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
		return _facilityUserServiceLocalService.dynamicQuery(dynamicQuery,
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
		return _facilityUserServiceLocalService.dynamicQuery(dynamicQuery,
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
		return _facilityUserServiceLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.pacnet.connect.model.FacilityUserService fetchFacilityUserService(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.fetchFacilityUserService(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the facility user services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility user services
	* @param end the upper bound of the range of facility user services (not inclusive)
	* @return the range of facility user services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserService> getFacilityUserServices(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.getFacilityUserServices(start,
			end);
	}

	/**
	* Returns the number of facility user services.
	*
	* @return the number of facility user services
	* @throws SystemException if a system exception occurred
	*/
	public int getFacilityUserServicesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.getFacilityUserServicesCount();
	}

	/**
	* Updates the facility user service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityUserService the facility user service
	* @return the facility user service that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService updateFacilityUserService(
		com.pacnet.connect.model.FacilityUserService facilityUserService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.updateFacilityUserService(facilityUserService);
	}

	/**
	* Updates the facility user service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityUserService the facility user service
	* @param merge whether to merge the facility user service with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the facility user service that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService updateFacilityUserService(
		com.pacnet.connect.model.FacilityUserService facilityUserService,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.updateFacilityUserService(facilityUserService,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _facilityUserServiceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_facilityUserServiceLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _facilityUserServiceLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public com.pacnet.connect.model.FacilityUserService createFacilityUserMapping(
		long facilityUserMappingId, long facilityServiceId, boolean isActive,
		java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return _facilityUserServiceLocalService.createFacilityUserMapping(facilityUserMappingId,
			facilityServiceId, isActive, createdBy, createdOn, updatedBy,
			updatedOn);
	}

	public com.pacnet.connect.model.FacilityUserService updateFacilityUserService(
		long id, long facilityUserMappingId, long facilityServiceId,
		boolean isActive, java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return _facilityUserServiceLocalService.updateFacilityUserService(id,
			facilityUserMappingId, facilityServiceId, isActive, createdBy,
			createdOn, updatedBy, updatedOn);
	}

	public boolean deleteFacilityById(long id) {
		return _facilityUserServiceLocalService.deleteFacilityById(id);
	}

	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.findByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId);
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
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.findByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId,
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
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.findByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId,
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
	public com.pacnet.connect.model.FacilityUserService findByFacilityUserServiceByFacilityUserMapping_First(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return _facilityUserServiceLocalService.findByFacilityUserServiceByFacilityUserMapping_First(facilityUserMappingId,
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
	public com.pacnet.connect.model.FacilityUserService fetchByFacilityUserServiceByFacilityUserMapping_First(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.fetchByFacilityUserServiceByFacilityUserMapping_First(facilityUserMappingId,
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
	public com.pacnet.connect.model.FacilityUserService findByFacilityUserServiceByFacilityUserMapping_Last(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return _facilityUserServiceLocalService.findByFacilityUserServiceByFacilityUserMapping_Last(facilityUserMappingId,
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
	public com.pacnet.connect.model.FacilityUserService fetchByFacilityUserServiceByFacilityUserMapping_Last(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.fetchByFacilityUserServiceByFacilityUserMapping_Last(facilityUserMappingId,
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
	public com.pacnet.connect.model.FacilityUserService[] findByFacilityUserServiceByFacilityUserMapping_PrevAndNext(
		long id, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return _facilityUserServiceLocalService.findByFacilityUserServiceByFacilityUserMapping_PrevAndNext(id,
			facilityUserMappingId, orderByComparator);
	}

	/**
	* Returns all the facility user services where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @return the matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserMappingByFacilityService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.findByFacilityUserMappingByFacilityService(facilityServiceId);
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
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserMappingByFacilityService(
		long facilityServiceId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.findByFacilityUserMappingByFacilityService(facilityServiceId,
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
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserMappingByFacilityService(
		long facilityServiceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.findByFacilityUserMappingByFacilityService(facilityServiceId,
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
	public com.pacnet.connect.model.FacilityUserService findByFacilityUserMappingByFacilityService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return _facilityUserServiceLocalService.findByFacilityUserMappingByFacilityService_First(facilityServiceId,
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
	public com.pacnet.connect.model.FacilityUserService fetchByFacilityUserMappingByFacilityService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.fetchByFacilityUserMappingByFacilityService_First(facilityServiceId,
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
	public com.pacnet.connect.model.FacilityUserService findByFacilityUserMappingByFacilityService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return _facilityUserServiceLocalService.findByFacilityUserMappingByFacilityService_Last(facilityServiceId,
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
	public com.pacnet.connect.model.FacilityUserService fetchByFacilityUserMappingByFacilityService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.fetchByFacilityUserMappingByFacilityService_Last(facilityServiceId,
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
	public com.pacnet.connect.model.FacilityUserService[] findByFacilityUserMappingByFacilityService_PrevAndNext(
		long id, long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return _facilityUserServiceLocalService.findByFacilityUserMappingByFacilityService_PrevAndNext(id,
			facilityServiceId, orderByComparator);
	}

	/**
	* Returns all the facility user services.
	*
	* @return the facility user services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.findAll();
	}

	/**
	* Returns all the facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @return the matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFusByServiceUserMapping(
		long facilityServiceId, long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserServiceLocalService.findByFusByServiceUserMapping(facilityServiceId,
			facilityUserMappingId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public FacilityUserServiceLocalService getWrappedFacilityUserServiceLocalService() {
		return _facilityUserServiceLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedFacilityUserServiceLocalService(
		FacilityUserServiceLocalService facilityUserServiceLocalService) {
		_facilityUserServiceLocalService = facilityUserServiceLocalService;
	}

	public FacilityUserServiceLocalService getWrappedService() {
		return _facilityUserServiceLocalService;
	}

	public void setWrappedService(
		FacilityUserServiceLocalService facilityUserServiceLocalService) {
		_facilityUserServiceLocalService = facilityUserServiceLocalService;
	}

	private FacilityUserServiceLocalService _facilityUserServiceLocalService;
}