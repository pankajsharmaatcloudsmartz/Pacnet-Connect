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

import com.pacnet.connect.model.SAM_radacct;

/**
 * The persistence interface for the s a m_radacct service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SAM_radacctPersistenceImpl
 * @see SAM_radacctUtil
 * @generated
 */
public interface SAM_radacctPersistence extends BasePersistence<SAM_radacct> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SAM_radacctUtil} to access the s a m_radacct persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the s a m_radacct in the entity cache if it is enabled.
	*
	* @param sam_radacct the s a m_radacct
	*/
	public void cacheResult(com.pacnet.connect.model.SAM_radacct sam_radacct);

	/**
	* Caches the s a m_radaccts in the entity cache if it is enabled.
	*
	* @param sam_radaccts the s a m_radaccts
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SAM_radacct> sam_radaccts);

	/**
	* Creates a new s a m_radacct with the primary key. Does not add the s a m_radacct to the database.
	*
	* @param RadAcctId the primary key for the new s a m_radacct
	* @return the new s a m_radacct
	*/
	public com.pacnet.connect.model.SAM_radacct create(long RadAcctId);

	/**
	* Removes the s a m_radacct with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param RadAcctId the primary key of the s a m_radacct
	* @return the s a m_radacct that was removed
	* @throws com.pacnet.connect.NoSuchSAM_radacctException if a s a m_radacct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_radacct remove(long RadAcctId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSAM_radacctException;

	public com.pacnet.connect.model.SAM_radacct updateImpl(
		com.pacnet.connect.model.SAM_radacct sam_radacct, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s a m_radacct with the primary key or throws a {@link com.pacnet.connect.NoSuchSAM_radacctException} if it could not be found.
	*
	* @param RadAcctId the primary key of the s a m_radacct
	* @return the s a m_radacct
	* @throws com.pacnet.connect.NoSuchSAM_radacctException if a s a m_radacct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_radacct findByPrimaryKey(long RadAcctId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSAM_radacctException;

	/**
	* Returns the s a m_radacct with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param RadAcctId the primary key of the s a m_radacct
	* @return the s a m_radacct, or <code>null</code> if a s a m_radacct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_radacct fetchByPrimaryKey(
		long RadAcctId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the s a m_radaccts.
	*
	* @return the s a m_radaccts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SAM_radacct> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s a m_radaccts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s a m_radaccts
	* @param end the upper bound of the range of s a m_radaccts (not inclusive)
	* @return the range of s a m_radaccts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SAM_radacct> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s a m_radaccts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s a m_radaccts
	* @param end the upper bound of the range of s a m_radaccts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s a m_radaccts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SAM_radacct> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s a m_radaccts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s a m_radaccts.
	*
	* @return the number of s a m_radaccts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}