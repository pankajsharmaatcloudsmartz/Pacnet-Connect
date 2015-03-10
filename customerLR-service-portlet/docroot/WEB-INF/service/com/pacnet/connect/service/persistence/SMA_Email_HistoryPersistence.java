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

import com.pacnet.connect.model.SMA_Email_History;

/**
 * The persistence interface for the s m a_ email_ history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMA_Email_HistoryPersistenceImpl
 * @see SMA_Email_HistoryUtil
 * @generated
 */
public interface SMA_Email_HistoryPersistence extends BasePersistence<SMA_Email_History> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SMA_Email_HistoryUtil} to access the s m a_ email_ history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the s m a_ email_ history in the entity cache if it is enabled.
	*
	* @param sma_Email_History the s m a_ email_ history
	*/
	public void cacheResult(
		com.pacnet.connect.model.SMA_Email_History sma_Email_History);

	/**
	* Caches the s m a_ email_ histories in the entity cache if it is enabled.
	*
	* @param sma_Email_Histories the s m a_ email_ histories
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SMA_Email_History> sma_Email_Histories);

	/**
	* Creates a new s m a_ email_ history with the primary key. Does not add the s m a_ email_ history to the database.
	*
	* @param id the primary key for the new s m a_ email_ history
	* @return the new s m a_ email_ history
	*/
	public com.pacnet.connect.model.SMA_Email_History create(long id);

	/**
	* Removes the s m a_ email_ history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a_ email_ history
	* @return the s m a_ email_ history that was removed
	* @throws com.pacnet.connect.NoSuchSMA_Email_HistoryException if a s m a_ email_ history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Email_History remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_Email_HistoryException;

	public com.pacnet.connect.model.SMA_Email_History updateImpl(
		com.pacnet.connect.model.SMA_Email_History sma_Email_History,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a_ email_ history with the primary key or throws a {@link com.pacnet.connect.NoSuchSMA_Email_HistoryException} if it could not be found.
	*
	* @param id the primary key of the s m a_ email_ history
	* @return the s m a_ email_ history
	* @throws com.pacnet.connect.NoSuchSMA_Email_HistoryException if a s m a_ email_ history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Email_History findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_Email_HistoryException;

	/**
	* Returns the s m a_ email_ history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s m a_ email_ history
	* @return the s m a_ email_ history, or <code>null</code> if a s m a_ email_ history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Email_History fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the s m a_ email_ histories.
	*
	* @return the s m a_ email_ histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_Email_History> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a_ email_ histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a_ email_ histories
	* @param end the upper bound of the range of s m a_ email_ histories (not inclusive)
	* @return the range of s m a_ email_ histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_Email_History> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a_ email_ histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a_ email_ histories
	* @param end the upper bound of the range of s m a_ email_ histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s m a_ email_ histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_Email_History> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a_ email_ histories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a_ email_ histories.
	*
	* @return the number of s m a_ email_ histories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}