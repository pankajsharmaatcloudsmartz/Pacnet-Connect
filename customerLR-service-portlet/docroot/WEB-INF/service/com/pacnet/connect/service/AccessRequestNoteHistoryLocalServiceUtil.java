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
 * The utility for the access request note history local service. This utility wraps {@link com.pacnet.connect.service.impl.AccessRequestNoteHistoryLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestNoteHistoryLocalService
 * @see com.pacnet.connect.service.base.AccessRequestNoteHistoryLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.AccessRequestNoteHistoryLocalServiceImpl
 * @generated
 */
public class AccessRequestNoteHistoryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.AccessRequestNoteHistoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the access request note history to the database. Also notifies the appropriate model listeners.
	*
	* @param accessRequestNoteHistory the access request note history
	* @return the access request note history that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory addAccessRequestNoteHistory(
		com.pacnet.connect.model.AccessRequestNoteHistory accessRequestNoteHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAccessRequestNoteHistory(accessRequestNoteHistory);
	}

	/**
	* Creates a new access request note history with the primary key. Does not add the access request note history to the database.
	*
	* @param id the primary key for the new access request note history
	* @return the new access request note history
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory createAccessRequestNoteHistory(
		long id) {
		return getService().createAccessRequestNoteHistory(id);
	}

	/**
	* Deletes the access request note history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access request note history
	* @return the access request note history that was removed
	* @throws PortalException if a access request note history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory deleteAccessRequestNoteHistory(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAccessRequestNoteHistory(id);
	}

	/**
	* Deletes the access request note history from the database. Also notifies the appropriate model listeners.
	*
	* @param accessRequestNoteHistory the access request note history
	* @return the access request note history that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory deleteAccessRequestNoteHistory(
		com.pacnet.connect.model.AccessRequestNoteHistory accessRequestNoteHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteAccessRequestNoteHistory(accessRequestNoteHistory);
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

	public static com.pacnet.connect.model.AccessRequestNoteHistory fetchAccessRequestNoteHistory(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAccessRequestNoteHistory(id);
	}

	/**
	* Returns the access request note history with the primary key.
	*
	* @param id the primary key of the access request note history
	* @return the access request note history
	* @throws PortalException if a access request note history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory getAccessRequestNoteHistory(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccessRequestNoteHistory(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the access request note histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access request note histories
	* @param end the upper bound of the range of access request note histories (not inclusive)
	* @return the range of access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> getAccessRequestNoteHistories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccessRequestNoteHistories(start, end);
	}

	/**
	* Returns the number of access request note histories.
	*
	* @return the number of access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static int getAccessRequestNoteHistoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccessRequestNoteHistoriesCount();
	}

	/**
	* Updates the access request note history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accessRequestNoteHistory the access request note history
	* @return the access request note history that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory updateAccessRequestNoteHistory(
		com.pacnet.connect.model.AccessRequestNoteHistory accessRequestNoteHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateAccessRequestNoteHistory(accessRequestNoteHistory);
	}

	/**
	* Updates the access request note history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accessRequestNoteHistory the access request note history
	* @param merge whether to merge the access request note history with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the access request note history that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory updateAccessRequestNoteHistory(
		com.pacnet.connect.model.AccessRequestNoteHistory accessRequestNoteHistory,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateAccessRequestNoteHistory(accessRequestNoteHistory,
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

	public static com.pacnet.connect.model.AccessRequestNoteHistory createAccessRequestNoteHistory(
		long accessRequestId, long customerId, java.lang.String note,
		java.lang.String tableName, boolean isActive,
		java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return getService()
				   .createAccessRequestNoteHistory(accessRequestId, customerId,
			note, tableName, isActive, createdBy, createdOn, updatedBy,
			updatedOn);
	}

	public static com.pacnet.connect.model.AccessRequestNoteHistory updateRequestNoteHistory(
		long id, long accessRequestId, long customerId, java.lang.String note,
		java.lang.String tableName, boolean isActive,
		java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return getService()
				   .updateRequestNoteHistory(id, accessRequestId, customerId,
			note, tableName, isActive, createdBy, createdOn, updatedBy,
			updatedOn);
	}

	public static boolean deleteRequestNoteHistoryById(long id) {
		return getService().deleteRequestNoteHistoryById(id);
	}

	/**
	* Returns all the access request note histories where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqId(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByAccessRequestNoteHistoryByAccReqId(accessRequestId);
	}

	/**
	* Returns a range of all the access request note histories where accessRequestId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param accessRequestId the access request ID
	* @param start the lower bound of the range of access request note histories
	* @param end the upper bound of the range of access request note histories (not inclusive)
	* @return the range of matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqId(
		long accessRequestId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByAccessRequestNoteHistoryByAccReqId(accessRequestId,
			start, end);
	}

	/**
	* Returns an ordered range of all the access request note histories where accessRequestId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param accessRequestId the access request ID
	* @param start the lower bound of the range of access request note histories
	* @param end the upper bound of the range of access request note histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqId(
		long accessRequestId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByAccessRequestNoteHistoryByAccReqId(accessRequestId,
			start, end, orderByComparator);
	}

	/**
	* Returns all the access request note histories where accessRequestId = &#63; and customerId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @return the matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqIdAndCustId(
		long accessRequestId, long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
			customerId);
	}

	/**
	* Returns a range of all the access request note histories where accessRequestId = &#63; and customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param start the lower bound of the range of access request note histories
	* @param end the upper bound of the range of access request note histories (not inclusive)
	* @return the range of matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqIdAndCustId(
		long accessRequestId, long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
			customerId, start, end);
	}

	/**
	* Returns an ordered range of all the access request note histories where accessRequestId = &#63; and customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param start the lower bound of the range of access request note histories
	* @param end the upper bound of the range of access request note histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqIdAndCustId(
		long accessRequestId, long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
			customerId, start, end, orderByComparator);
	}

	/**
	* Returns the first access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request note history
	* @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqIdAndCustId_First(
		long accessRequestId, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException {
		return getService()
				   .findByAccessRequestNoteHistoryByAccReqIdAndCustId_First(accessRequestId,
			customerId, orderByComparator);
	}

	/**
	* Returns all the access request note histories where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param tableName the table name
	* @return the matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqCustTable(
		long accessRequestId, long customerId, java.lang.String tableName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
			customerId, tableName);
	}

	/**
	* Returns a range of all the access request note histories where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param tableName the table name
	* @param start the lower bound of the range of access request note histories
	* @param end the upper bound of the range of access request note histories (not inclusive)
	* @return the range of matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqCustTable(
		long accessRequestId, long customerId, java.lang.String tableName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
			customerId, tableName, start, end);
	}

	/**
	* Returns an ordered range of all the access request note histories where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param tableName the table name
	* @param start the lower bound of the range of access request note histories
	* @param end the upper bound of the range of access request note histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqCustTable(
		long accessRequestId, long customerId, java.lang.String tableName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
			customerId, tableName, start, end, orderByComparator);
	}

	/**
	* Returns the first access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param tableName the table name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request note history
	* @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqCustTable_First(
		long accessRequestId, long customerId, java.lang.String tableName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException {
		return getService()
				   .findByAccessRequestNoteHistoryByAccReqCustTable_First(accessRequestId,
			customerId, tableName, orderByComparator);
	}

	public static void clearService() {
		_service = null;
	}

	public static AccessRequestNoteHistoryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AccessRequestNoteHistoryLocalService.class.getName());

			if (invokableLocalService instanceof AccessRequestNoteHistoryLocalService) {
				_service = (AccessRequestNoteHistoryLocalService)invokableLocalService;
			}
			else {
				_service = new AccessRequestNoteHistoryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AccessRequestNoteHistoryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(AccessRequestNoteHistoryLocalService service) {
	}

	private static AccessRequestNoteHistoryLocalService _service;
}