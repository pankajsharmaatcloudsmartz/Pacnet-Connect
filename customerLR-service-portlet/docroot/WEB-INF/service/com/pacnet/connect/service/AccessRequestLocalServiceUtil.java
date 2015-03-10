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
 * The utility for the access request local service. This utility wraps {@link com.pacnet.connect.service.impl.AccessRequestLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestLocalService
 * @see com.pacnet.connect.service.base.AccessRequestLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.AccessRequestLocalServiceImpl
 * @generated
 */
public class AccessRequestLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.AccessRequestLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the access request to the database. Also notifies the appropriate model listeners.
	*
	* @param accessRequest the access request
	* @return the access request that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest addAccessRequest(
		com.pacnet.connect.model.AccessRequest accessRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAccessRequest(accessRequest);
	}

	/**
	* Creates a new access request with the primary key. Does not add the access request to the database.
	*
	* @param id the primary key for the new access request
	* @return the new access request
	*/
	public static com.pacnet.connect.model.AccessRequest createAccessRequest(
		long id) {
		return getService().createAccessRequest(id);
	}

	/**
	* Deletes the access request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access request
	* @return the access request that was removed
	* @throws PortalException if a access request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest deleteAccessRequest(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAccessRequest(id);
	}

	/**
	* Deletes the access request from the database. Also notifies the appropriate model listeners.
	*
	* @param accessRequest the access request
	* @return the access request that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest deleteAccessRequest(
		com.pacnet.connect.model.AccessRequest accessRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAccessRequest(accessRequest);
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

	public static com.pacnet.connect.model.AccessRequest fetchAccessRequest(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAccessRequest(id);
	}

	/**
	* Returns the access request with the primary key.
	*
	* @param id the primary key of the access request
	* @return the access request
	* @throws PortalException if a access request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest getAccessRequest(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccessRequest(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the access requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access requests
	* @param end the upper bound of the range of access requests (not inclusive)
	* @return the range of access requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequest> getAccessRequests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccessRequests(start, end);
	}

	/**
	* Returns the number of access requests.
	*
	* @return the number of access requests
	* @throws SystemException if a system exception occurred
	*/
	public static int getAccessRequestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccessRequestsCount();
	}

	/**
	* Updates the access request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accessRequest the access request
	* @return the access request that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest updateAccessRequest(
		com.pacnet.connect.model.AccessRequest accessRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAccessRequest(accessRequest);
	}

	/**
	* Updates the access request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accessRequest the access request
	* @param merge whether to merge the access request with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the access request that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest updateAccessRequest(
		com.pacnet.connect.model.AccessRequest accessRequest, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAccessRequest(accessRequest, merge);
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

	public static com.pacnet.connect.model.AccessRequest createAccessRequest(
		long facilityId, long customerId, long visitorId,
		java.sql.Date dateOfVisit, java.sql.Date dateOfVisitGmt,
		java.sql.Date dateOfTimeOutGmt, long tentativeTimeIn,
		long tentativeTimeOut, java.lang.String note, boolean oneTimeAccess,
		long accessRequestStatusId, boolean isExternalVisitor,
		boolean isActive, java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return getService()
				   .createAccessRequest(facilityId, customerId, visitorId,
			dateOfVisit, dateOfVisitGmt, dateOfTimeOutGmt, tentativeTimeIn,
			tentativeTimeOut, note, oneTimeAccess, accessRequestStatusId,
			isExternalVisitor, isActive, createdBy, createdOn, updatedBy,
			updatedOn);
	}

	public static com.pacnet.connect.model.AccessRequest updateAccessRequest(
		long id, long facilityId, long customerId, long visitorId,
		java.sql.Date dateOfVisit, java.sql.Date dateOfVisitGmt,
		java.sql.Date dateOfTimeOutGmt, long tentativeTimeIn,
		long tentativeTimeOut, java.lang.String note, boolean oneTimeAccess,
		long accessRequestStatusId, boolean isExternalVisitor,
		boolean isActive, java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return getService()
				   .updateAccessRequest(id, facilityId, customerId, visitorId,
			dateOfVisit, dateOfVisitGmt, dateOfTimeOutGmt, tentativeTimeIn,
			tentativeTimeOut, note, oneTimeAccess, accessRequestStatusId,
			isExternalVisitor, isActive, createdBy, createdOn, updatedBy,
			updatedOn);
	}

	public static boolean deleteFacilityById(long id) {
		return getService().deleteFacilityById(id);
	}

	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByFacility(
		long facilityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByAccessRequestByFacility(facilityId);
	}

	/**
	* Returns a range of all the access requests where facilityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityId the facility ID
	* @param start the lower bound of the range of access requests
	* @param end the upper bound of the range of access requests (not inclusive)
	* @return the range of matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByFacility(
		long facilityId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByAccessRequestByFacility(facilityId, start, end);
	}

	/**
	* Returns an ordered range of all the access requests where facilityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityId the facility ID
	* @param start the lower bound of the range of access requests
	* @param end the upper bound of the range of access requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByFacility(
		long facilityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByAccessRequestByFacility(facilityId, start, end,
			orderByComparator);
	}

	/**
	* Returns all the access requests where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByCustomer(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByAccessRequestByCustomer(customerId);
	}

	/**
	* Returns a range of all the access requests where customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param start the lower bound of the range of access requests
	* @param end the upper bound of the range of access requests (not inclusive)
	* @return the range of matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByCustomer(
		long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByAccessRequestByCustomer(customerId, start, end);
	}

	/**
	* Returns an ordered range of all the access requests where customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param start the lower bound of the range of access requests
	* @param end the upper bound of the range of access requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByCustomer(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByAccessRequestByCustomer(customerId, start, end,
			orderByComparator);
	}

	/**
	* Returns all the access requests where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @return the matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByVisitor(
		long visitorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByAccessRequestByVisitor(visitorId);
	}

	/**
	* Returns a range of all the access requests where visitorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param visitorId the visitor ID
	* @param start the lower bound of the range of access requests
	* @param end the upper bound of the range of access requests (not inclusive)
	* @return the range of matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByVisitor(
		long visitorId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByAccessRequestByVisitor(visitorId, start, end);
	}

	/**
	* Returns an ordered range of all the access requests where visitorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param visitorId the visitor ID
	* @param start the lower bound of the range of access requests
	* @param end the upper bound of the range of access requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByVisitor(
		long visitorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByAccessRequestByVisitor(visitorId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first access request in the ordered set where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest findByAccessRequestByVisitor_First(
		long visitorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException {
		return getService()
				   .findByAccessRequestByVisitor_First(visitorId,
			orderByComparator);
	}

	/**
	* Returns the first access request in the ordered set where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request, or <code>null</code> if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest fetchByAccessRequestByVisitor_First(
		long visitorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchByAccessRequestByVisitor_First(visitorId,
			orderByComparator);
	}

	/**
	* Returns the last access request in the ordered set where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest findByAccessRequestByVisitor_Last(
		long visitorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException {
		return getService()
				   .findByAccessRequestByVisitor_Last(visitorId,
			orderByComparator);
	}

	/**
	* Returns the last access request in the ordered set where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request, or <code>null</code> if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest fetchByAccessRequestByVisitor_Last(
		long visitorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchByAccessRequestByVisitor_Last(visitorId,
			orderByComparator);
	}

	/**
	* Returns the access requests before and after the current access request in the ordered set where visitorId = &#63;.
	*
	* @param id the primary key of the current access request
	* @param visitorId the visitor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next access request
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a access request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest[] findByAccessRequestByVisitor_PrevAndNext(
		long id, long visitorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException {
		return getService()
				   .findByAccessRequestByVisitor_PrevAndNext(id, visitorId,
			orderByComparator);
	}

	public static void clearService() {
		_service = null;
	}

	public static AccessRequestLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AccessRequestLocalService.class.getName());

			if (invokableLocalService instanceof AccessRequestLocalService) {
				_service = (AccessRequestLocalService)invokableLocalService;
			}
			else {
				_service = new AccessRequestLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AccessRequestLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(AccessRequestLocalService service) {
	}

	private static AccessRequestLocalService _service;
}