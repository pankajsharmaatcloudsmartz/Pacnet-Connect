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

import com.pacnet.connect.model.SMA_radacct;

/**
 * The persistence interface for the s m a_radacct service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMA_radacctPersistenceImpl
 * @see SMA_radacctUtil
 * @generated
 */
public interface SMA_radacctPersistence extends BasePersistence<SMA_radacct> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SMA_radacctUtil} to access the s m a_radacct persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the s m a_radacct in the entity cache if it is enabled.
	*
	* @param sma_radacct the s m a_radacct
	*/
	public void cacheResult(com.pacnet.connect.model.SMA_radacct sma_radacct);

	/**
	* Caches the s m a_radaccts in the entity cache if it is enabled.
	*
	* @param sma_radaccts the s m a_radaccts
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SMA_radacct> sma_radaccts);

	/**
	* Creates a new s m a_radacct with the primary key. Does not add the s m a_radacct to the database.
	*
	* @param RadAcctId the primary key for the new s m a_radacct
	* @return the new s m a_radacct
	*/
	public com.pacnet.connect.model.SMA_radacct create(long RadAcctId);

	/**
	* Removes the s m a_radacct with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param RadAcctId the primary key of the s m a_radacct
	* @return the s m a_radacct that was removed
	* @throws com.pacnet.connect.NoSuchSMA_radacctException if a s m a_radacct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radacct remove(long RadAcctId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_radacctException;

	public com.pacnet.connect.model.SMA_radacct updateImpl(
		com.pacnet.connect.model.SMA_radacct sma_radacct, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a_radacct with the primary key or throws a {@link com.pacnet.connect.NoSuchSMA_radacctException} if it could not be found.
	*
	* @param RadAcctId the primary key of the s m a_radacct
	* @return the s m a_radacct
	* @throws com.pacnet.connect.NoSuchSMA_radacctException if a s m a_radacct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radacct findByPrimaryKey(long RadAcctId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_radacctException;

	/**
	* Returns the s m a_radacct with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param RadAcctId the primary key of the s m a_radacct
	* @return the s m a_radacct, or <code>null</code> if a s m a_radacct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radacct fetchByPrimaryKey(
		long RadAcctId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the s m a_radaccts.
	*
	* @return the s m a_radaccts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_radacct> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a_radaccts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a_radaccts
	* @param end the upper bound of the range of s m a_radaccts (not inclusive)
	* @return the range of s m a_radaccts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_radacct> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a_radaccts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a_radaccts
	* @param end the upper bound of the range of s m a_radaccts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s m a_radaccts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_radacct> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a_radaccts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a_radaccts.
	*
	* @return the number of s m a_radaccts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}