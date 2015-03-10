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
 * The utility for the access request facility service local service. This utility wraps {@link com.pacnet.connect.service.impl.AccessRequestFacilityServiceLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestFacilityServiceLocalService
 * @see com.pacnet.connect.service.base.AccessRequestFacilityServiceLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.AccessRequestFacilityServiceLocalServiceImpl
 * @generated
 */
public class AccessRequestFacilityServiceLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.AccessRequestFacilityServiceLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the access request facility service to the database. Also notifies the appropriate model listeners.
	*
	* @param accessRequestFacilityService the access request facility service
	* @return the access request facility service that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService addAccessRequestFacilityService(
		com.pacnet.connect.model.AccessRequestFacilityService accessRequestFacilityService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAccessRequestFacilityService(accessRequestFacilityService);
	}

	/**
	* Creates a new access request facility service with the primary key. Does not add the access request facility service to the database.
	*
	* @param id the primary key for the new access request facility service
	* @return the new access request facility service
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService createAccessRequestFacilityService(
		long id) {
		return getService().createAccessRequestFacilityService(id);
	}

	/**
	* Deletes the access request facility service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access request facility service
	* @return the access request facility service that was removed
	* @throws PortalException if a access request facility service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService deleteAccessRequestFacilityService(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAccessRequestFacilityService(id);
	}

	/**
	* Deletes the access request facility service from the database. Also notifies the appropriate model listeners.
	*
	* @param accessRequestFacilityService the access request facility service
	* @return the access request facility service that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService deleteAccessRequestFacilityService(
		com.pacnet.connect.model.AccessRequestFacilityService accessRequestFacilityService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteAccessRequestFacilityService(accessRequestFacilityService);
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

	public static com.pacnet.connect.model.AccessRequestFacilityService fetchAccessRequestFacilityService(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAccessRequestFacilityService(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the access request facility services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access request facility services
	* @param end the upper bound of the range of access request facility services (not inclusive)
	* @return the range of access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> getAccessRequestFacilityServices(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccessRequestFacilityServices(start, end);
	}

	/**
	* Returns the number of access request facility services.
	*
	* @return the number of access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public static int getAccessRequestFacilityServicesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccessRequestFacilityServicesCount();
	}

	/**
	* Updates the access request facility service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accessRequestFacilityService the access request facility service
	* @return the access request facility service that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService updateAccessRequestFacilityService(
		com.pacnet.connect.model.AccessRequestFacilityService accessRequestFacilityService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateAccessRequestFacilityService(accessRequestFacilityService);
	}

	/**
	* Updates the access request facility service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accessRequestFacilityService the access request facility service
	* @param merge whether to merge the access request facility service with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the access request facility service that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService updateAccessRequestFacilityService(
		com.pacnet.connect.model.AccessRequestFacilityService accessRequestFacilityService,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateAccessRequestFacilityService(accessRequestFacilityService,
			merge);
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

	public static com.pacnet.connect.model.AccessRequestFacilityService createAccessRequestFacilityService(
		long accessRequestId, long facilityServiceId, boolean isActive,
		java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return getService()
				   .createAccessRequestFacilityService(accessRequestId,
			facilityServiceId, isActive, createdBy, createdOn, updatedBy,
			updatedOn);
	}

	public static com.pacnet.connect.model.AccessRequestFacilityService updateAccessRequestFacilityService(
		long id, long accessRequestId, long facilityServiceId,
		boolean isActive, java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return getService()
				   .updateAccessRequestFacilityService(id, accessRequestId,
			facilityServiceId, isActive, createdBy, createdOn, updatedBy,
			updatedOn);
	}

	public static boolean deleteFacilityById(long id) {
		return getService().deleteFacilityById(id);
	}

	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByAccessRequest_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
		return getService()
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
	public static com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByAccessRequest_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByAccessRequest_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
		return getService()
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
	public static com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByAccessRequest_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByFacilityService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
		return getService()
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
	public static com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByFacilityService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
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
	public static com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByFacilityService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
		return getService()
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
	public static com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByFacilityService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchByAccessRequestFacilityServiceByFacilityService_Last(facilityServiceId,
			orderByComparator);
	}

	public static void clearService() {
		_service = null;
	}

	public static AccessRequestFacilityServiceLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AccessRequestFacilityServiceLocalService.class.getName());

			if (invokableLocalService instanceof AccessRequestFacilityServiceLocalService) {
				_service = (AccessRequestFacilityServiceLocalService)invokableLocalService;
			}
			else {
				_service = new AccessRequestFacilityServiceLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AccessRequestFacilityServiceLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(AccessRequestFacilityServiceLocalService service) {
	}

	private static AccessRequestFacilityServiceLocalService _service;
}