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

import com.pacnet.connect.model.SAM_reservation;

/**
 * The persistence interface for the s a m_reservation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SAM_reservationPersistenceImpl
 * @see SAM_reservationUtil
 * @generated
 */
public interface SAM_reservationPersistence extends BasePersistence<SAM_reservation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SAM_reservationUtil} to access the s a m_reservation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the s a m_reservation in the entity cache if it is enabled.
	*
	* @param sam_reservation the s a m_reservation
	*/
	public void cacheResult(
		com.pacnet.connect.model.SAM_reservation sam_reservation);

	/**
	* Caches the s a m_reservations in the entity cache if it is enabled.
	*
	* @param sam_reservations the s a m_reservations
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SAM_reservation> sam_reservations);

	/**
	* Creates a new s a m_reservation with the primary key. Does not add the s a m_reservation to the database.
	*
	* @param id the primary key for the new s a m_reservation
	* @return the new s a m_reservation
	*/
	public com.pacnet.connect.model.SAM_reservation create(long id);

	/**
	* Removes the s a m_reservation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s a m_reservation
	* @return the s a m_reservation that was removed
	* @throws com.pacnet.connect.NoSuchSAM_reservationException if a s a m_reservation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_reservation remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSAM_reservationException;

	public com.pacnet.connect.model.SAM_reservation updateImpl(
		com.pacnet.connect.model.SAM_reservation sam_reservation, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s a m_reservation with the primary key or throws a {@link com.pacnet.connect.NoSuchSAM_reservationException} if it could not be found.
	*
	* @param id the primary key of the s a m_reservation
	* @return the s a m_reservation
	* @throws com.pacnet.connect.NoSuchSAM_reservationException if a s a m_reservation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_reservation findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSAM_reservationException;

	/**
	* Returns the s a m_reservation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s a m_reservation
	* @return the s a m_reservation, or <code>null</code> if a s a m_reservation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_reservation fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the s a m_reservations.
	*
	* @return the s a m_reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SAM_reservation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s a m_reservations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s a m_reservations
	* @param end the upper bound of the range of s a m_reservations (not inclusive)
	* @return the range of s a m_reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SAM_reservation> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s a m_reservations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s a m_reservations
	* @param end the upper bound of the range of s a m_reservations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s a m_reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SAM_reservation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s a m_reservations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s a m_reservations.
	*
	* @return the number of s a m_reservations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}