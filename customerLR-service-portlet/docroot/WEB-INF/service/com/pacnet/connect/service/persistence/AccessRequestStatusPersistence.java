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

import com.pacnet.connect.model.AccessRequestStatus;

/**
 * The persistence interface for the access request status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestStatusPersistenceImpl
 * @see AccessRequestStatusUtil
 * @generated
 */
public interface AccessRequestStatusPersistence extends BasePersistence<AccessRequestStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccessRequestStatusUtil} to access the access request status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the access request status in the entity cache if it is enabled.
	*
	* @param accessRequestStatus the access request status
	*/
	public void cacheResult(
		com.pacnet.connect.model.AccessRequestStatus accessRequestStatus);

	/**
	* Caches the access request statuses in the entity cache if it is enabled.
	*
	* @param accessRequestStatuses the access request statuses
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.AccessRequestStatus> accessRequestStatuses);

	/**
	* Creates a new access request status with the primary key. Does not add the access request status to the database.
	*
	* @param id the primary key for the new access request status
	* @return the new access request status
	*/
	public com.pacnet.connect.model.AccessRequestStatus create(long id);

	/**
	* Removes the access request status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access request status
	* @return the access request status that was removed
	* @throws com.pacnet.connect.NoSuchAccessRequestStatusException if a access request status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestStatus remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestStatusException;

	public com.pacnet.connect.model.AccessRequestStatus updateImpl(
		com.pacnet.connect.model.AccessRequestStatus accessRequestStatus,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the access request status with the primary key or throws a {@link com.pacnet.connect.NoSuchAccessRequestStatusException} if it could not be found.
	*
	* @param id the primary key of the access request status
	* @return the access request status
	* @throws com.pacnet.connect.NoSuchAccessRequestStatusException if a access request status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestStatus findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestStatusException;

	/**
	* Returns the access request status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the access request status
	* @return the access request status, or <code>null</code> if a access request status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestStatus fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the access request statuses.
	*
	* @return the access request statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequestStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.AccessRequestStatus> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the access request statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access request statuses
	* @param end the upper bound of the range of access request statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of access request statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequestStatus> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the access request statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of access request statuses.
	*
	* @return the number of access request statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}