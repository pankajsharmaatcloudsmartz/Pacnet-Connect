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
import com.pacnet.connect.model.AccessRequestNoteHistory;
import com.pacnet.connect.service.base.AccessRequestNoteHistoryLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.AccessRequestNoteHistoryUtil;

/**
 * The implementation of the access request note history local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.pacnet.connect.service.AccessRequestNoteHistoryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.AccessRequestNoteHistoryLocalServiceBaseImpl
 * @see com.pacnet.connect.service.AccessRequestNoteHistoryLocalServiceUtil
 */
public class AccessRequestNoteHistoryLocalServiceImpl
	extends AccessRequestNoteHistoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.pacnet.connect.service.AccessRequestNoteHistoryLocalServiceUtil} to access the access request note history local service.
	 */
	
	public com.pacnet.connect.model.AccessRequestNoteHistory createAccessRequestNoteHistory(long accessRequestId, long customerId, 
			String note, String tableName, boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		AccessRequestNoteHistory accessRequestNoteHistory = null;
		try{
		
		accessRequestNoteHistory = accessRequestNoteHistoryPersistence.create(0);
		accessRequestNoteHistory.setAccessRequestId(accessRequestId);
		accessRequestNoteHistory.setCustomerId(customerId);
		accessRequestNoteHistory.setNote(note);
		accessRequestNoteHistory.setTableName(tableName);
		
		accessRequestNoteHistory.setIsActive(isActive);
		accessRequestNoteHistory.setCreatedOn(createdOn);
		accessRequestNoteHistory.setCreatedBy(createdBy);
		accessRequestNoteHistory.setUpdatedBy(updatedBy);
		accessRequestNoteHistory.setUpdatedOn(updatedOn);
		accessRequestNoteHistory = accessRequestNoteHistoryPersistence.update(accessRequestNoteHistory, false);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return accessRequestNoteHistory;
	}
	
	public com.pacnet.connect.model.AccessRequestNoteHistory updateRequestNoteHistory(long id, long accessRequestId, long customerId, 
			String note, String tableName, boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		AccessRequestNoteHistory accessRequestNoteHistory = null;
		try{
		
		accessRequestNoteHistory = accessRequestNoteHistoryPersistence.fetchByPrimaryKey(id);
		accessRequestNoteHistory.setAccessRequestId(accessRequestId);
		accessRequestNoteHistory.setCustomerId(customerId);
		accessRequestNoteHistory.setNote(note);
		accessRequestNoteHistory.setTableName(tableName);
		
		accessRequestNoteHistory.setIsActive(isActive);
		accessRequestNoteHistory.setCreatedOn(accessRequestNoteHistory.getCreatedOn());
		accessRequestNoteHistory.setCreatedBy(accessRequestNoteHistory.getCreatedBy());
		accessRequestNoteHistory.setUpdatedBy(updatedBy);
		accessRequestNoteHistory.setUpdatedOn(updatedOn);
		accessRequestNoteHistory = accessRequestNoteHistoryPersistence.update(accessRequestNoteHistory, false);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return accessRequestNoteHistory;
	}
	
	
	public boolean deleteRequestNoteHistoryById(long id) {
		boolean isDeleted = false;
		try{
			accessRequestNoteHistoryPersistence.remove(id);
			isDeleted = true;
		}catch(Exception e){
			isDeleted = false;
			e.printStackTrace();
		}
		return isDeleted;
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
		return AccessRequestNoteHistoryUtil.findByAccessRequestNoteHistoryByAccReqId(accessRequestId);
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
		return AccessRequestNoteHistoryUtil.findByAccessRequestNoteHistoryByAccReqId(accessRequestId,
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
		return AccessRequestNoteHistoryUtil.findByAccessRequestNoteHistoryByAccReqId(accessRequestId,
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
		return AccessRequestNoteHistoryUtil.findByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
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
		return AccessRequestNoteHistoryUtil.findByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
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
		return AccessRequestNoteHistoryUtil.findByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
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
		return AccessRequestNoteHistoryUtil.findByAccessRequestNoteHistoryByAccReqIdAndCustId_First(accessRequestId,
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
		return AccessRequestNoteHistoryUtil.findByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
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
		return AccessRequestNoteHistoryUtil.findByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
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
		return AccessRequestNoteHistoryUtil.findByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
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
		return AccessRequestNoteHistoryUtil.findByAccessRequestNoteHistoryByAccReqCustTable_First(accessRequestId,
			customerId, tableName, orderByComparator);
	}


}