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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the facility user service local service. This utility wraps {@link com.pacnet.connect.service.impl.FacilityUserServiceLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityUserServiceLocalService
 * @see com.pacnet.connect.service.base.FacilityUserServiceLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.FacilityUserServiceLocalServiceImpl
 * @generated
 */
public class FacilityUserServiceLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.FacilityUserServiceLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the facility user service to the database. Also notifies the appropriate model listeners.
	*
	* @param facilityUserService the facility user service
	* @return the facility user service that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService addFacilityUserService(
		com.pacnet.connect.model.FacilityUserService facilityUserService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addFacilityUserService(facilityUserService);
	}

	/**
	* Creates a new facility user service with the primary key. Does not add the facility user service to the database.
	*
	* @param id the primary key for the new facility user service
	* @return the new facility user service
	*/
	public static com.pacnet.connect.model.FacilityUserService createFacilityUserService(
		long id) {
		return getService().createFacilityUserService(id);
	}

	/**
	* Deletes the facility user service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility user service
	* @return the facility user service that was removed
	* @throws PortalException if a facility user service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService deleteFacilityUserService(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFacilityUserService(id);
	}

	/**
	* Deletes the facility user service from the database. Also notifies the appropriate model listeners.
	*
	* @param facilityUserService the facility user service
	* @return the facility user service that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService deleteFacilityUserService(
		com.pacnet.connect.model.FacilityUserService facilityUserService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFacilityUserService(facilityUserService);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.pacnet.connect.model.FacilityUserService fetchFacilityUserService(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchFacilityUserService(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> getFacilityUserServices(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFacilityUserServices(start, end);
	}

	/**
	* Returns the number of facility user services.
	*
	* @return the number of facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static int getFacilityUserServicesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFacilityUserServicesCount();
	}

	/**
	* Updates the facility user service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityUserService the facility user service
	* @return the facility user service that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService updateFacilityUserService(
		com.pacnet.connect.model.FacilityUserService facilityUserService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFacilityUserService(facilityUserService);
	}

	/**
	* Updates the facility user service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityUserService the facility user service
	* @param merge whether to merge the facility user service with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the facility user service that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService updateFacilityUserService(
		com.pacnet.connect.model.FacilityUserService facilityUserService,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFacilityUserService(facilityUserService, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.pacnet.connect.model.FacilityUserService createFacilityUserMapping(
		long facilityUserMappingId, long facilityServiceId, boolean isActive,
		java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return getService()
				   .createFacilityUserMapping(facilityUserMappingId,
			facilityServiceId, isActive, createdBy, createdOn, updatedBy,
			updatedOn);
	}

	public static com.pacnet.connect.model.FacilityUserService updateFacilityUserService(
		long id, long facilityUserMappingId, long facilityServiceId,
		boolean isActive, java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return getService()
				   .updateFacilityUserService(id, facilityUserMappingId,
			facilityServiceId, isActive, createdBy, createdOn, updatedBy,
			updatedOn);
	}

	public static boolean deleteFacilityById(long id) {
		return getService().deleteFacilityById(id);
	}

	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static com.pacnet.connect.model.FacilityUserService findByFacilityUserServiceByFacilityUserMapping_First(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getService()
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
	public static com.pacnet.connect.model.FacilityUserService fetchByFacilityUserServiceByFacilityUserMapping_First(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static com.pacnet.connect.model.FacilityUserService findByFacilityUserServiceByFacilityUserMapping_Last(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getService()
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
	public static com.pacnet.connect.model.FacilityUserService fetchByFacilityUserServiceByFacilityUserMapping_Last(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static com.pacnet.connect.model.FacilityUserService[] findByFacilityUserServiceByFacilityUserMapping_PrevAndNext(
		long id, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getService()
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
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserMappingByFacilityService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserMappingByFacilityService(
		long facilityServiceId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserMappingByFacilityService(
		long facilityServiceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static com.pacnet.connect.model.FacilityUserService findByFacilityUserMappingByFacilityService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getService()
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
	public static com.pacnet.connect.model.FacilityUserService fetchByFacilityUserMappingByFacilityService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static com.pacnet.connect.model.FacilityUserService findByFacilityUserMappingByFacilityService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getService()
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
	public static com.pacnet.connect.model.FacilityUserService fetchByFacilityUserMappingByFacilityService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static com.pacnet.connect.model.FacilityUserService[] findByFacilityUserMappingByFacilityService_PrevAndNext(
		long id, long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getService()
				   .findByFacilityUserMappingByFacilityService_PrevAndNext(id,
			facilityServiceId, orderByComparator);
	}

	/**
	* Returns all the facility user services.
	*
	* @return the facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll();
	}

	/**
	* Returns all the facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @return the matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFusByServiceUserMapping(
		long facilityServiceId, long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFusByServiceUserMapping(facilityServiceId,
			facilityUserMappingId);
	}

	public static void clearService() {
		_service = null;
	}

	public static FacilityUserServiceLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					FacilityUserServiceLocalService.class.getName());

			if (invokableLocalService instanceof FacilityUserServiceLocalService) {
				_service = (FacilityUserServiceLocalService)invokableLocalService;
			}
			else {
				_service = new FacilityUserServiceLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(FacilityUserServiceLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(FacilityUserServiceLocalService service) {
	}

	private static FacilityUserServiceLocalService _service;
}