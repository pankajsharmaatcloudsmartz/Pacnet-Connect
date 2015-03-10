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
 * The utility for the access request status local service. This utility wraps {@link com.pacnet.connect.service.impl.AccessRequestStatusLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestStatusLocalService
 * @see com.pacnet.connect.service.base.AccessRequestStatusLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.AccessRequestStatusLocalServiceImpl
 * @generated
 */
public class AccessRequestStatusLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.AccessRequestStatusLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the access request status to the database. Also notifies the appropriate model listeners.
	*
	* @param accessRequestStatus the access request status
	* @return the access request status that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestStatus addAccessRequestStatus(
		com.pacnet.connect.model.AccessRequestStatus accessRequestStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAccessRequestStatus(accessRequestStatus);
	}

	/**
	* Creates a new access request status with the primary key. Does not add the access request status to the database.
	*
	* @param id the primary key for the new access request status
	* @return the new access request status
	*/
	public static com.pacnet.connect.model.AccessRequestStatus createAccessRequestStatus(
		long id) {
		return getService().createAccessRequestStatus(id);
	}

	/**
	* Deletes the access request status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access request status
	* @return the access request status that was removed
	* @throws PortalException if a access request status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestStatus deleteAccessRequestStatus(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAccessRequestStatus(id);
	}

	/**
	* Deletes the access request status from the database. Also notifies the appropriate model listeners.
	*
	* @param accessRequestStatus the access request status
	* @return the access request status that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestStatus deleteAccessRequestStatus(
		com.pacnet.connect.model.AccessRequestStatus accessRequestStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAccessRequestStatus(accessRequestStatus);
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

	public static com.pacnet.connect.model.AccessRequestStatus fetchAccessRequestStatus(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAccessRequestStatus(id);
	}

	/**
	* Returns the access request status with the primary key.
	*
	* @param id the primary key of the access request status
	* @return the access request status
	* @throws PortalException if a access request status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestStatus getAccessRequestStatus(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccessRequestStatus(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the access request statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access request statuses
	* @param end the upper bound of the range of access request statuses (not inclusive)
	* @return the range of access request statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestStatus> getAccessRequestStatuses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccessRequestStatuses(start, end);
	}

	/**
	* Returns the number of access request statuses.
	*
	* @return the number of access request statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int getAccessRequestStatusesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccessRequestStatusesCount();
	}

	/**
	* Updates the access request status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accessRequestStatus the access request status
	* @return the access request status that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestStatus updateAccessRequestStatus(
		com.pacnet.connect.model.AccessRequestStatus accessRequestStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAccessRequestStatus(accessRequestStatus);
	}

	/**
	* Updates the access request status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accessRequestStatus the access request status
	* @param merge whether to merge the access request status with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the access request status that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestStatus updateAccessRequestStatus(
		com.pacnet.connect.model.AccessRequestStatus accessRequestStatus,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAccessRequestStatus(accessRequestStatus, merge);
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

	public static void clearService() {
		_service = null;
	}

	public static AccessRequestStatusLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AccessRequestStatusLocalService.class.getName());

			if (invokableLocalService instanceof AccessRequestStatusLocalService) {
				_service = (AccessRequestStatusLocalService)invokableLocalService;
			}
			else {
				_service = new AccessRequestStatusLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AccessRequestStatusLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(AccessRequestStatusLocalService service) {
	}

	private static AccessRequestStatusLocalService _service;
}