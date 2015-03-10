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
 * This class is a wrapper for {@link AccessRequestNoteHistoryLocalService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       AccessRequestNoteHistoryLocalService
 * @generated
 */
public class AccessRequestNoteHistoryLocalServiceWrapper
	implements AccessRequestNoteHistoryLocalService,
		ServiceWrapper<AccessRequestNoteHistoryLocalService> {
	public AccessRequestNoteHistoryLocalServiceWrapper(
		AccessRequestNoteHistoryLocalService accessRequestNoteHistoryLocalService) {
		_accessRequestNoteHistoryLocalService = accessRequestNoteHistoryLocalService;
	}

	/**
	* Adds the access request note history to the database. Also notifies the appropriate model listeners.
	*
	* @param accessRequestNoteHistory the access request note history
	* @return the access request note history that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory addAccessRequestNoteHistory(
		com.pacnet.connect.model.AccessRequestNoteHistory accessRequestNoteHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.addAccessRequestNoteHistory(accessRequestNoteHistory);
	}

	/**
	* Creates a new access request note history with the primary key. Does not add the access request note history to the database.
	*
	* @param id the primary key for the new access request note history
	* @return the new access request note history
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory createAccessRequestNoteHistory(
		long id) {
		return _accessRequestNoteHistoryLocalService.createAccessRequestNoteHistory(id);
	}

	/**
	* Deletes the access request note history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access request note history
	* @return the access request note history that was removed
	* @throws PortalException if a access request note history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory deleteAccessRequestNoteHistory(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.deleteAccessRequestNoteHistory(id);
	}

	/**
	* Deletes the access request note history from the database. Also notifies the appropriate model listeners.
	*
	* @param accessRequestNoteHistory the access request note history
	* @return the access request note history that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory deleteAccessRequestNoteHistory(
		com.pacnet.connect.model.AccessRequestNoteHistory accessRequestNoteHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.deleteAccessRequestNoteHistory(accessRequestNoteHistory);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accessRequestNoteHistoryLocalService.dynamicQuery();
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
		return _accessRequestNoteHistoryLocalService.dynamicQuery(dynamicQuery);
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
		return _accessRequestNoteHistoryLocalService.dynamicQuery(dynamicQuery,
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
		return _accessRequestNoteHistoryLocalService.dynamicQuery(dynamicQuery,
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
		return _accessRequestNoteHistoryLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.pacnet.connect.model.AccessRequestNoteHistory fetchAccessRequestNoteHistory(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.fetchAccessRequestNoteHistory(id);
	}

	/**
	* Returns the access request note history with the primary key.
	*
	* @param id the primary key of the access request note history
	* @return the access request note history
	* @throws PortalException if a access request note history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory getAccessRequestNoteHistory(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.getAccessRequestNoteHistory(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> getAccessRequestNoteHistories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.getAccessRequestNoteHistories(start,
			end);
	}

	/**
	* Returns the number of access request note histories.
	*
	* @return the number of access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public int getAccessRequestNoteHistoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.getAccessRequestNoteHistoriesCount();
	}

	/**
	* Updates the access request note history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accessRequestNoteHistory the access request note history
	* @return the access request note history that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory updateAccessRequestNoteHistory(
		com.pacnet.connect.model.AccessRequestNoteHistory accessRequestNoteHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.updateAccessRequestNoteHistory(accessRequestNoteHistory);
	}

	/**
	* Updates the access request note history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accessRequestNoteHistory the access request note history
	* @param merge whether to merge the access request note history with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the access request note history that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory updateAccessRequestNoteHistory(
		com.pacnet.connect.model.AccessRequestNoteHistory accessRequestNoteHistory,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.updateAccessRequestNoteHistory(accessRequestNoteHistory,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _accessRequestNoteHistoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_accessRequestNoteHistoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _accessRequestNoteHistoryLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public com.pacnet.connect.model.AccessRequestNoteHistory createAccessRequestNoteHistory(
		long accessRequestId, long customerId, java.lang.String note,
		java.lang.String tableName, boolean isActive,
		java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return _accessRequestNoteHistoryLocalService.createAccessRequestNoteHistory(accessRequestId,
			customerId, note, tableName, isActive, createdBy, createdOn,
			updatedBy, updatedOn);
	}

	public com.pacnet.connect.model.AccessRequestNoteHistory updateRequestNoteHistory(
		long id, long accessRequestId, long customerId, java.lang.String note,
		java.lang.String tableName, boolean isActive,
		java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return _accessRequestNoteHistoryLocalService.updateRequestNoteHistory(id,
			accessRequestId, customerId, note, tableName, isActive, createdBy,
			createdOn, updatedBy, updatedOn);
	}

	public boolean deleteRequestNoteHistoryById(long id) {
		return _accessRequestNoteHistoryLocalService.deleteRequestNoteHistoryById(id);
	}

	/**
	* Returns all the access request note histories where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqId(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.findByAccessRequestNoteHistoryByAccReqId(accessRequestId);
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
	public java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqId(
		long accessRequestId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.findByAccessRequestNoteHistoryByAccReqId(accessRequestId,
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
	public java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqId(
		long accessRequestId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.findByAccessRequestNoteHistoryByAccReqId(accessRequestId,
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
	public java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqIdAndCustId(
		long accessRequestId, long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.findByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
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
	public java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqIdAndCustId(
		long accessRequestId, long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.findByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
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
	public java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqIdAndCustId(
		long accessRequestId, long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.findByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
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
	public com.pacnet.connect.model.AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqIdAndCustId_First(
		long accessRequestId, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException {
		return _accessRequestNoteHistoryLocalService.findByAccessRequestNoteHistoryByAccReqIdAndCustId_First(accessRequestId,
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
	public java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqCustTable(
		long accessRequestId, long customerId, java.lang.String tableName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.findByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
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
	public java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqCustTable(
		long accessRequestId, long customerId, java.lang.String tableName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.findByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
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
	public java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqCustTable(
		long accessRequestId, long customerId, java.lang.String tableName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accessRequestNoteHistoryLocalService.findByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
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
	public com.pacnet.connect.model.AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqCustTable_First(
		long accessRequestId, long customerId, java.lang.String tableName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException {
		return _accessRequestNoteHistoryLocalService.findByAccessRequestNoteHistoryByAccReqCustTable_First(accessRequestId,
			customerId, tableName, orderByComparator);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public AccessRequestNoteHistoryLocalService getWrappedAccessRequestNoteHistoryLocalService() {
		return _accessRequestNoteHistoryLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedAccessRequestNoteHistoryLocalService(
		AccessRequestNoteHistoryLocalService accessRequestNoteHistoryLocalService) {
		_accessRequestNoteHistoryLocalService = accessRequestNoteHistoryLocalService;
	}

	public AccessRequestNoteHistoryLocalService getWrappedService() {
		return _accessRequestNoteHistoryLocalService;
	}

	public void setWrappedService(
		AccessRequestNoteHistoryLocalService accessRequestNoteHistoryLocalService) {
		_accessRequestNoteHistoryLocalService = accessRequestNoteHistoryLocalService;
	}

	private AccessRequestNoteHistoryLocalService _accessRequestNoteHistoryLocalService;
}