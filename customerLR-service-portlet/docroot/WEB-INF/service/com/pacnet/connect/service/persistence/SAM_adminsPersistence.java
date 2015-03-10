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

import com.pacnet.connect.model.SAM_admins;

/**
 * The persistence interface for the s a m_admins service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SAM_adminsPersistenceImpl
 * @see SAM_adminsUtil
 * @generated
 */
public interface SAM_adminsPersistence extends BasePersistence<SAM_admins> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SAM_adminsUtil} to access the s a m_admins persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the s a m_admins in the entity cache if it is enabled.
	*
	* @param sam_admins the s a m_admins
	*/
	public void cacheResult(com.pacnet.connect.model.SAM_admins sam_admins);

	/**
	* Caches the s a m_adminses in the entity cache if it is enabled.
	*
	* @param sam_adminses the s a m_adminses
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SAM_admins> sam_adminses);

	/**
	* Creates a new s a m_admins with the primary key. Does not add the s a m_admins to the database.
	*
	* @param id the primary key for the new s a m_admins
	* @return the new s a m_admins
	*/
	public com.pacnet.connect.model.SAM_admins create(long id);

	/**
	* Removes the s a m_admins with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s a m_admins
	* @return the s a m_admins that was removed
	* @throws com.pacnet.connect.NoSuchSAM_adminsException if a s a m_admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_admins remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSAM_adminsException;

	public com.pacnet.connect.model.SAM_admins updateImpl(
		com.pacnet.connect.model.SAM_admins sam_admins, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s a m_admins with the primary key or throws a {@link com.pacnet.connect.NoSuchSAM_adminsException} if it could not be found.
	*
	* @param id the primary key of the s a m_admins
	* @return the s a m_admins
	* @throws com.pacnet.connect.NoSuchSAM_adminsException if a s a m_admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_admins findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSAM_adminsException;

	/**
	* Returns the s a m_admins with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s a m_admins
	* @return the s a m_admins, or <code>null</code> if a s a m_admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_admins fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the s a m_adminses.
	*
	* @return the s a m_adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SAM_admins> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s a m_adminses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s a m_adminses
	* @param end the upper bound of the range of s a m_adminses (not inclusive)
	* @return the range of s a m_adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SAM_admins> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s a m_adminses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s a m_adminses
	* @param end the upper bound of the range of s a m_adminses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s a m_adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SAM_admins> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s a m_adminses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s a m_adminses.
	*
	* @return the number of s a m_adminses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}