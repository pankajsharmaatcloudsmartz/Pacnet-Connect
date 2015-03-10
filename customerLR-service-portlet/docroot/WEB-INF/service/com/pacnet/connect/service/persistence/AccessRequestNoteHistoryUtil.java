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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.pacnet.connect.model.AccessRequestNoteHistory;

import java.util.List;

/**
 * The persistence utility for the access request note history service. This utility wraps {@link AccessRequestNoteHistoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestNoteHistoryPersistence
 * @see AccessRequestNoteHistoryPersistenceImpl
 * @generated
 */
public class AccessRequestNoteHistoryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(
		AccessRequestNoteHistory accessRequestNoteHistory) {
		getPersistence().clearCache(accessRequestNoteHistory);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccessRequestNoteHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccessRequestNoteHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccessRequestNoteHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static AccessRequestNoteHistory update(
		AccessRequestNoteHistory accessRequestNoteHistory, boolean merge)
		throws SystemException {
		return getPersistence().update(accessRequestNoteHistory, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static AccessRequestNoteHistory update(
		AccessRequestNoteHistory accessRequestNoteHistory, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(accessRequestNoteHistory, merge, serviceContext);
	}

	/**
	* Caches the access request note history in the entity cache if it is enabled.
	*
	* @param accessRequestNoteHistory the access request note history
	*/
	public static void cacheResult(
		com.pacnet.connect.model.AccessRequestNoteHistory accessRequestNoteHistory) {
		getPersistence().cacheResult(accessRequestNoteHistory);
	}

	/**
	* Caches the access request note histories in the entity cache if it is enabled.
	*
	* @param accessRequestNoteHistories the access request note histories
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> accessRequestNoteHistories) {
		getPersistence().cacheResult(accessRequestNoteHistories);
	}

	/**
	* Creates a new access request note history with the primary key. Does not add the access request note history to the database.
	*
	* @param id the primary key for the new access request note history
	* @return the new access request note history
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the access request note history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access request note history
	* @return the access request note history that was removed
	* @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a access request note history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.AccessRequestNoteHistory updateImpl(
		com.pacnet.connect.model.AccessRequestNoteHistory accessRequestNoteHistory,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(accessRequestNoteHistory, merge);
	}

	/**
	* Returns the access request note history with the primary key or throws a {@link com.pacnet.connect.NoSuchAccessRequestNoteHistoryException} if it could not be found.
	*
	* @param id the primary key of the access request note history
	* @return the access request note history
	* @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a access request note history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the access request note history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the access request note history
	* @return the access request note history, or <code>null</code> if a access request note history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
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
		return getPersistence()
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
		return getPersistence()
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
		return getPersistence()
				   .findByAccessRequestNoteHistoryByAccReqId(accessRequestId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first access request note history in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request note history
	* @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqId_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException {
		return getPersistence()
				   .findByAccessRequestNoteHistoryByAccReqId_First(accessRequestId,
			orderByComparator);
	}

	/**
	* Returns the first access request note history in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request note history, or <code>null</code> if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqId_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestNoteHistoryByAccReqId_First(accessRequestId,
			orderByComparator);
	}

	/**
	* Returns the last access request note history in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request note history
	* @throws com.pacnet.connect.NoSuchAccessRequestNoteHistoryException if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqId_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException {
		return getPersistence()
				   .findByAccessRequestNoteHistoryByAccReqId_Last(accessRequestId,
			orderByComparator);
	}

	/**
	* Returns the last access request note history in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request note history, or <code>null</code> if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqId_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestNoteHistoryByAccReqId_Last(accessRequestId,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.AccessRequestNoteHistory[] findByAccessRequestNoteHistoryByAccReqId_PrevAndNext(
		long id, long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException {
		return getPersistence()
				   .findByAccessRequestNoteHistoryByAccReqId_PrevAndNext(id,
			accessRequestId, orderByComparator);
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
		return getPersistence()
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
		return getPersistence()
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
		return getPersistence()
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
		return getPersistence()
				   .findByAccessRequestNoteHistoryByAccReqIdAndCustId_First(accessRequestId,
			customerId, orderByComparator);
	}

	/**
	* Returns the first access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request note history, or <code>null</code> if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqIdAndCustId_First(
		long accessRequestId, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestNoteHistoryByAccReqIdAndCustId_First(accessRequestId,
			customerId, orderByComparator);
	}

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
	public static com.pacnet.connect.model.AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqIdAndCustId_Last(
		long accessRequestId, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException {
		return getPersistence()
				   .findByAccessRequestNoteHistoryByAccReqIdAndCustId_Last(accessRequestId,
			customerId, orderByComparator);
	}

	/**
	* Returns the last access request note history in the ordered set where accessRequestId = &#63; and customerId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request note history, or <code>null</code> if a matching access request note history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqIdAndCustId_Last(
		long accessRequestId, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestNoteHistoryByAccReqIdAndCustId_Last(accessRequestId,
			customerId, orderByComparator);
	}

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
	public static com.pacnet.connect.model.AccessRequestNoteHistory[] findByAccessRequestNoteHistoryByAccReqIdAndCustId_PrevAndNext(
		long id, long accessRequestId, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException {
		return getPersistence()
				   .findByAccessRequestNoteHistoryByAccReqIdAndCustId_PrevAndNext(id,
			accessRequestId, customerId, orderByComparator);
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
		return getPersistence()
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
		return getPersistence()
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
		return getPersistence()
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
		return getPersistence()
				   .findByAccessRequestNoteHistoryByAccReqCustTable_First(accessRequestId,
			customerId, tableName, orderByComparator);
	}

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
	public static com.pacnet.connect.model.AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqCustTable_First(
		long accessRequestId, long customerId, java.lang.String tableName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestNoteHistoryByAccReqCustTable_First(accessRequestId,
			customerId, tableName, orderByComparator);
	}

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
	public static com.pacnet.connect.model.AccessRequestNoteHistory findByAccessRequestNoteHistoryByAccReqCustTable_Last(
		long accessRequestId, long customerId, java.lang.String tableName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException {
		return getPersistence()
				   .findByAccessRequestNoteHistoryByAccReqCustTable_Last(accessRequestId,
			customerId, tableName, orderByComparator);
	}

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
	public static com.pacnet.connect.model.AccessRequestNoteHistory fetchByAccessRequestNoteHistoryByAccReqCustTable_Last(
		long accessRequestId, long customerId, java.lang.String tableName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestNoteHistoryByAccReqCustTable_Last(accessRequestId,
			customerId, tableName, orderByComparator);
	}

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
	public static com.pacnet.connect.model.AccessRequestNoteHistory[] findByAccessRequestNoteHistoryByAccReqCustTable_PrevAndNext(
		long id, long accessRequestId, long customerId,
		java.lang.String tableName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestNoteHistoryException {
		return getPersistence()
				   .findByAccessRequestNoteHistoryByAccReqCustTable_PrevAndNext(id,
			accessRequestId, customerId, tableName, orderByComparator);
	}

	/**
	* Returns all the access request note histories.
	*
	* @return the access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.AccessRequestNoteHistory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the access request note histories where accessRequestId = &#63; from the database.
	*
	* @param accessRequestId the access request ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAccessRequestNoteHistoryByAccReqId(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByAccessRequestNoteHistoryByAccReqId(accessRequestId);
	}

	/**
	* Removes all the access request note histories where accessRequestId = &#63; and customerId = &#63; from the database.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAccessRequestNoteHistoryByAccReqIdAndCustId(
		long accessRequestId, long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
			customerId);
	}

	/**
	* Removes all the access request note histories where accessRequestId = &#63; and customerId = &#63; and tableName = &#63; from the database.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param tableName the table name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAccessRequestNoteHistoryByAccReqCustTable(
		long accessRequestId, long customerId, java.lang.String tableName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
			customerId, tableName);
	}

	/**
	* Removes all the access request note histories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of access request note histories where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the number of matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAccessRequestNoteHistoryByAccReqId(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByAccessRequestNoteHistoryByAccReqId(accessRequestId);
	}

	/**
	* Returns the number of access request note histories where accessRequestId = &#63; and customerId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @return the number of matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAccessRequestNoteHistoryByAccReqIdAndCustId(
		long accessRequestId, long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByAccessRequestNoteHistoryByAccReqIdAndCustId(accessRequestId,
			customerId);
	}

	/**
	* Returns the number of access request note histories where accessRequestId = &#63; and customerId = &#63; and tableName = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param customerId the customer ID
	* @param tableName the table name
	* @return the number of matching access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAccessRequestNoteHistoryByAccReqCustTable(
		long accessRequestId, long customerId, java.lang.String tableName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByAccessRequestNoteHistoryByAccReqCustTable(accessRequestId,
			customerId, tableName);
	}

	/**
	* Returns the number of access request note histories.
	*
	* @return the number of access request note histories
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AccessRequestNoteHistoryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AccessRequestNoteHistoryPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					AccessRequestNoteHistoryPersistence.class.getName());

			ReferenceRegistry.registerReference(AccessRequestNoteHistoryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(AccessRequestNoteHistoryPersistence persistence) {
	}

	private static AccessRequestNoteHistoryPersistence _persistence;
}