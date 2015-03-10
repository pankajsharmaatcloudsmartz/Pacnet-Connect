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

package com.pacnet.connect.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.pacnet.connect.model.AccessRequestNoteHistory;

/**
 * The persistence interface for the access request note history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestNoteHistoryPersistenceImpl
 * @see AccessRequestNoteHistoryUtil
 * @generated
 */
public interface AccessRequestNoteHistoryPersistence extends BasePersistence<AccessRequestNoteHistory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccessRequestNoteHistoryUtil} to access the access request note history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the access request note history in the entity cache if it is enabled.
	*
	* @param accessRequestNoteHistory the access request note history
	*/
	public void cacheResult(
		com.pacnet.connect.model.AccessRequestNoteHistory accessRequestNoteHistory);

	/**
	* Caches the access request note histories in the entity cache if it is enabled.
	*
	* @param accessRequestNoteHistories the access request note histories
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> accessRequestNoteHistories);

	/**
	* Creates a new access request note history with the primary key. Does not add the access request note history to the database.
	*
	* @param id the primary key for the new access request note history
	* @return the new access request note history
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory create(long id);

	/**
	* Removes the access request note history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access request note history
	* @return the access request note history that was removed
	* @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a access request note history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException;

	public com.pacnet.connect.model.AccessRequestNoteHistory updateImpl(
		com.pacnet.connect.model.AccessRequestNoteHistory accessRequestNoteHistory,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the access request note history with the primary key or throws a {@link com.pacnet.connect.NoSuchAccessRequestNoteHistoryException} if it could not be found.
	*
	* @param id the primary key of the access request note history
	* @return the access request note history
	* @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a access request note history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException;

	/**
	* Returns the access request note history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the access request note history
	* @return the access request note history, or <code>null</code> if a access request note history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the access request note histories where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findByAccessRequestNoteHistoryByAccReqId(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first access request note history in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request note history
	* @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqId_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException;

	/**
	* Returns the first access request note history in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request note history, or <code>null</code> if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqId_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last access request note history in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request note history
	* @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqId_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException;

	/**
	* Returns the last access request note history in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request note history, or <code>null</code> if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqId_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the access request note histories before and after the current access request note history in the ordered set where accessRequestId = &#63;.
	*
	* @param id the primary key of the current access request note history
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next access request note history
	* @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a access request note history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory[] findByAccessRequestNoteHistoryByAccReqId_PrevAndNext(
		long id, long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException;

	/**
	* Returns the first access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request note history, or <code>null</code> if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqIdAndCustId_First(
		long accessRequestId, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request note history
	* @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqIdAndCustId_Last(
		long accessRequestId, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException;

	/**
	* Returns the last access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request note history, or <code>null</code> if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqIdAndCustId_Last(
		long accessRequestId, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the access request note histories before and after the current access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63;.
	*
	* @param id the primary key of the current access request note history
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next access request note history
	* @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a access request note history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory[] findByAccessRequestNoteHistoryByAccReqIdAndCustId_PrevAndNext(
		long id, long accessRequestId, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException;

	/**
	* Returns the first access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param tableName the table name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request note history, or <code>null</code> if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqCustTable_First(
		long accessRequestId, long customerId, java.lang.String tableName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param tableName the table name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request note history
	* @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqCustTable_Last(
		long accessRequestId, long customerId, java.lang.String tableName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException;

	/**
	* Returns the last access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param tableName the table name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request note history, or <code>null</code> if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqCustTable_Last(
		long accessRequestId, long customerId, java.lang.String tableName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the access request note histories before and after the current access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	*
	* @param id the primary key of the current access request note history
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param tableName the table name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next access request note history
	* @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a access request note history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestNoteHistory[] findByAccessRequestNoteHistoryByAccReqCustTable_PrevAndNext(
		long id, long accessRequestId, long customerId,
		java.lang.String tableName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException;

	/**
	* Returns all the access request note histories.
	*
	* @return the access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the access request note histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access request note histories
	* @param end the upper bound of the range of access request note histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the access request note histories where accessRequestId = &#63; from the database.
	*
	* @param accessRequestId the access request ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAccessRequestNoteHistoryByAccReqId(long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the access request note histories where accessRequestId = &#63; and customerId = &#63; from the database.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAccessRequestNoteHistoryByAccReqIdAndCustId(
		long accessRequestId, long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the access request note histories where accessRequestId = &#63; and customerId = &#63; and tableName = &#63; from the database.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param tableName the table name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAccessRequestNoteHistoryByAccReqCustTable(
		long accessRequestId, long customerId, java.lang.String tableName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the access request note histories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of access request note histories where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the number of matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public int countByAccessRequestNoteHistoryByAccReqId(long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of access request note histories where accessRequestId = &#63; and customerId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @return the number of matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public int countByAccessRequestNoteHistoryByAccReqIdAndCustId(
		long accessRequestId, long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of access request note histories where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param tableName the table name
	* @return the number of matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public int countByAccessRequestNoteHistoryByAccReqCustTable(
		long accessRequestId, long customerId, java.lang.String tableName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of access request note histories.
	*
	* @return the number of access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}