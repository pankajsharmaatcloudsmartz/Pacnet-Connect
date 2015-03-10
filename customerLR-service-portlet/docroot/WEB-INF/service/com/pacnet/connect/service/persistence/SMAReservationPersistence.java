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

import com.pacnet.connect.model.SMAReservation;

/**
 * The persistence interface for the s m a reservation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMAReservationPersistenceImpl
 * @see SMAReservationUtil
 * @generated
 */
public interface SMAReservationPersistence extends BasePersistence<SMAReservation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SMAReservationUtil} to access the s m a reservation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the s m a reservation in the entity cache if it is enabled.
	*
	* @param smaReservation the s m a reservation
	*/
	public void cacheResult(
		com.pacnet.connect.model.SMAReservation smaReservation);

	/**
	* Caches the s m a reservations in the entity cache if it is enabled.
	*
	* @param smaReservations the s m a reservations
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SMAReservation> smaReservations);

	/**
	* Creates a new s m a reservation with the primary key. Does not add the s m a reservation to the database.
	*
	* @param id the primary key for the new s m a reservation
	* @return the new s m a reservation
	*/
	public com.pacnet.connect.model.SMAReservation create(long id);

	/**
	* Removes the s m a reservation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a reservation
	* @return the s m a reservation that was removed
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	public com.pacnet.connect.model.SMAReservation updateImpl(
		com.pacnet.connect.model.SMAReservation smaReservation, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a reservation with the primary key or throws a {@link com.pacnet.connect.NoSuchSMAReservationException} if it could not be found.
	*
	* @param id the primary key of the s m a reservation
	* @return the s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns the s m a reservation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s m a reservation
	* @return the s m a reservation, or <code>null</code> if a s m a reservation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the s m a reservations where isActive = &#63; and createdBy = &#63;.
	*
	* @param isActive the is active
	* @param createdBy the created by
	* @return the matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByCreatedBy(
		int isActive, java.lang.String createdBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a reservations where isActive = &#63; and createdBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param createdBy the created by
	* @param start the lower bound of the range of s m a reservations
	* @param end the upper bound of the range of s m a reservations (not inclusive)
	* @return the range of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByCreatedBy(
		int isActive, java.lang.String createdBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a reservations where isActive = &#63; and createdBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param createdBy the created by
	* @param start the lower bound of the range of s m a reservations
	* @param end the upper bound of the range of s m a reservations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByCreatedBy(
		int isActive, java.lang.String createdBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a reservation in the ordered set where isActive = &#63; and createdBy = &#63;.
	*
	* @param isActive the is active
	* @param createdBy the created by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation findBySMADomainsListByCreatedBy_First(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns the first s m a reservation in the ordered set where isActive = &#63; and createdBy = &#63;.
	*
	* @param isActive the is active
	* @param createdBy the created by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByCreatedBy_First(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a reservation in the ordered set where isActive = &#63; and createdBy = &#63;.
	*
	* @param isActive the is active
	* @param createdBy the created by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation findBySMADomainsListByCreatedBy_Last(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns the last s m a reservation in the ordered set where isActive = &#63; and createdBy = &#63;.
	*
	* @param isActive the is active
	* @param createdBy the created by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByCreatedBy_Last(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a reservations before and after the current s m a reservation in the ordered set where isActive = &#63; and createdBy = &#63;.
	*
	* @param id the primary key of the current s m a reservation
	* @param isActive the is active
	* @param createdBy the created by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation[] findBySMADomainsListByCreatedBy_PrevAndNext(
		long id, int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns all the s m a reservations where isActive = &#63; and name = &#63;.
	*
	* @param isActive the is active
	* @param name the name
	* @return the matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByName(
		int isActive, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a reservations where isActive = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param name the name
	* @param start the lower bound of the range of s m a reservations
	* @param end the upper bound of the range of s m a reservations (not inclusive)
	* @return the range of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByName(
		int isActive, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a reservations where isActive = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param name the name
	* @param start the lower bound of the range of s m a reservations
	* @param end the upper bound of the range of s m a reservations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByName(
		int isActive, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a reservation in the ordered set where isActive = &#63; and name = &#63;.
	*
	* @param isActive the is active
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation findBySMADomainsListByName_First(
		int isActive, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns the first s m a reservation in the ordered set where isActive = &#63; and name = &#63;.
	*
	* @param isActive the is active
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByName_First(
		int isActive, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a reservation in the ordered set where isActive = &#63; and name = &#63;.
	*
	* @param isActive the is active
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation findBySMADomainsListByName_Last(
		int isActive, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns the last s m a reservation in the ordered set where isActive = &#63; and name = &#63;.
	*
	* @param isActive the is active
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByName_Last(
		int isActive, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a reservations before and after the current s m a reservation in the ordered set where isActive = &#63; and name = &#63;.
	*
	* @param id the primary key of the current s m a reservation
	* @param isActive the is active
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation[] findBySMADomainsListByName_PrevAndNext(
		long id, int isActive, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns all the s m a reservations where isActive = &#63; and owner = &#63;.
	*
	* @param isActive the is active
	* @param owner the owner
	* @return the matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByOwner(
		int isActive, java.lang.String owner)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a reservations where isActive = &#63; and owner = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param owner the owner
	* @param start the lower bound of the range of s m a reservations
	* @param end the upper bound of the range of s m a reservations (not inclusive)
	* @return the range of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByOwner(
		int isActive, java.lang.String owner, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a reservations where isActive = &#63; and owner = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param owner the owner
	* @param start the lower bound of the range of s m a reservations
	* @param end the upper bound of the range of s m a reservations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByOwner(
		int isActive, java.lang.String owner, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a reservation in the ordered set where isActive = &#63; and owner = &#63;.
	*
	* @param isActive the is active
	* @param owner the owner
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation findBySMADomainsListByOwner_First(
		int isActive, java.lang.String owner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns the first s m a reservation in the ordered set where isActive = &#63; and owner = &#63;.
	*
	* @param isActive the is active
	* @param owner the owner
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByOwner_First(
		int isActive, java.lang.String owner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a reservation in the ordered set where isActive = &#63; and owner = &#63;.
	*
	* @param isActive the is active
	* @param owner the owner
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation findBySMADomainsListByOwner_Last(
		int isActive, java.lang.String owner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns the last s m a reservation in the ordered set where isActive = &#63; and owner = &#63;.
	*
	* @param isActive the is active
	* @param owner the owner
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByOwner_Last(
		int isActive, java.lang.String owner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a reservations before and after the current s m a reservation in the ordered set where isActive = &#63; and owner = &#63;.
	*
	* @param id the primary key of the current s m a reservation
	* @param isActive the is active
	* @param owner the owner
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation[] findBySMADomainsListByOwner_PrevAndNext(
		long id, int isActive, java.lang.String owner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns all the s m a reservations where isActive = &#63; and startDate = &#63;.
	*
	* @param isActive the is active
	* @param startDate the start date
	* @return the matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByStartDate(
		int isActive, java.util.Date startDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a reservations where isActive = &#63; and startDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param startDate the start date
	* @param start the lower bound of the range of s m a reservations
	* @param end the upper bound of the range of s m a reservations (not inclusive)
	* @return the range of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByStartDate(
		int isActive, java.util.Date startDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a reservations where isActive = &#63; and startDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param startDate the start date
	* @param start the lower bound of the range of s m a reservations
	* @param end the upper bound of the range of s m a reservations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByStartDate(
		int isActive, java.util.Date startDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a reservation in the ordered set where isActive = &#63; and startDate = &#63;.
	*
	* @param isActive the is active
	* @param startDate the start date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation findBySMADomainsListByStartDate_First(
		int isActive, java.util.Date startDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns the first s m a reservation in the ordered set where isActive = &#63; and startDate = &#63;.
	*
	* @param isActive the is active
	* @param startDate the start date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByStartDate_First(
		int isActive, java.util.Date startDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a reservation in the ordered set where isActive = &#63; and startDate = &#63;.
	*
	* @param isActive the is active
	* @param startDate the start date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation findBySMADomainsListByStartDate_Last(
		int isActive, java.util.Date startDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns the last s m a reservation in the ordered set where isActive = &#63; and startDate = &#63;.
	*
	* @param isActive the is active
	* @param startDate the start date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByStartDate_Last(
		int isActive, java.util.Date startDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a reservations before and after the current s m a reservation in the ordered set where isActive = &#63; and startDate = &#63;.
	*
	* @param id the primary key of the current s m a reservation
	* @param isActive the is active
	* @param startDate the start date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation[] findBySMADomainsListByStartDate_PrevAndNext(
		long id, int isActive, java.util.Date startDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns all the s m a reservations where isActive = &#63; and endDate = &#63;.
	*
	* @param isActive the is active
	* @param endDate the end date
	* @return the matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByEndDate(
		int isActive, java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a reservations where isActive = &#63; and endDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param endDate the end date
	* @param start the lower bound of the range of s m a reservations
	* @param end the upper bound of the range of s m a reservations (not inclusive)
	* @return the range of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByEndDate(
		int isActive, java.util.Date endDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a reservations where isActive = &#63; and endDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param endDate the end date
	* @param start the lower bound of the range of s m a reservations
	* @param end the upper bound of the range of s m a reservations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByEndDate(
		int isActive, java.util.Date endDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a reservation in the ordered set where isActive = &#63; and endDate = &#63;.
	*
	* @param isActive the is active
	* @param endDate the end date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation findBySMADomainsListByEndDate_First(
		int isActive, java.util.Date endDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns the first s m a reservation in the ordered set where isActive = &#63; and endDate = &#63;.
	*
	* @param isActive the is active
	* @param endDate the end date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByEndDate_First(
		int isActive, java.util.Date endDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a reservation in the ordered set where isActive = &#63; and endDate = &#63;.
	*
	* @param isActive the is active
	* @param endDate the end date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation findBySMADomainsListByEndDate_Last(
		int isActive, java.util.Date endDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns the last s m a reservation in the ordered set where isActive = &#63; and endDate = &#63;.
	*
	* @param isActive the is active
	* @param endDate the end date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByEndDate_Last(
		int isActive, java.util.Date endDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a reservations before and after the current s m a reservation in the ordered set where isActive = &#63; and endDate = &#63;.
	*
	* @param id the primary key of the current s m a reservation
	* @param isActive the is active
	* @param endDate the end date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation[] findBySMADomainsListByEndDate_PrevAndNext(
		long id, int isActive, java.util.Date endDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns all the s m a reservations where isActive = &#63; and provision = &#63;.
	*
	* @param isActive the is active
	* @param provision the provision
	* @return the matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByProvision(
		int isActive, int provision)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a reservations where isActive = &#63; and provision = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param provision the provision
	* @param start the lower bound of the range of s m a reservations
	* @param end the upper bound of the range of s m a reservations (not inclusive)
	* @return the range of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByProvision(
		int isActive, int provision, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a reservations where isActive = &#63; and provision = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param provision the provision
	* @param start the lower bound of the range of s m a reservations
	* @param end the upper bound of the range of s m a reservations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByProvision(
		int isActive, int provision, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a reservation in the ordered set where isActive = &#63; and provision = &#63;.
	*
	* @param isActive the is active
	* @param provision the provision
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation findBySMADomainsListByProvision_First(
		int isActive, int provision,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns the first s m a reservation in the ordered set where isActive = &#63; and provision = &#63;.
	*
	* @param isActive the is active
	* @param provision the provision
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByProvision_First(
		int isActive, int provision,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a reservation in the ordered set where isActive = &#63; and provision = &#63;.
	*
	* @param isActive the is active
	* @param provision the provision
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation findBySMADomainsListByProvision_Last(
		int isActive, int provision,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns the last s m a reservation in the ordered set where isActive = &#63; and provision = &#63;.
	*
	* @param isActive the is active
	* @param provision the provision
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a reservation, or <code>null</code> if a matching s m a reservation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByProvision_Last(
		int isActive, int provision,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a reservations before and after the current s m a reservation in the ordered set where isActive = &#63; and provision = &#63;.
	*
	* @param id the primary key of the current s m a reservation
	* @param isActive the is active
	* @param provision the provision
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException if a s m a reservation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAReservation[] findBySMADomainsListByProvision_PrevAndNext(
		long id, int isActive, int provision,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException;

	/**
	* Returns all the s m a reservations.
	*
	* @return the s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a reservations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a reservations
	* @param end the upper bound of the range of s m a reservations (not inclusive)
	* @return the range of s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a reservations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a reservations
	* @param end the upper bound of the range of s m a reservations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAReservation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a reservations where isActive = &#63; and createdBy = &#63; from the database.
	*
	* @param isActive the is active
	* @param createdBy the created by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMADomainsListByCreatedBy(int isActive,
		java.lang.String createdBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a reservations where isActive = &#63; and name = &#63; from the database.
	*
	* @param isActive the is active
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMADomainsListByName(int isActive, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a reservations where isActive = &#63; and owner = &#63; from the database.
	*
	* @param isActive the is active
	* @param owner the owner
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMADomainsListByOwner(int isActive,
		java.lang.String owner)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a reservations where isActive = &#63; and startDate = &#63; from the database.
	*
	* @param isActive the is active
	* @param startDate the start date
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMADomainsListByStartDate(int isActive,
		java.util.Date startDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a reservations where isActive = &#63; and endDate = &#63; from the database.
	*
	* @param isActive the is active
	* @param endDate the end date
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMADomainsListByEndDate(int isActive,
		java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a reservations where isActive = &#63; and provision = &#63; from the database.
	*
	* @param isActive the is active
	* @param provision the provision
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMADomainsListByProvision(int isActive, int provision)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a reservations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a reservations where isActive = &#63; and createdBy = &#63;.
	*
	* @param isActive the is active
	* @param createdBy the created by
	* @return the number of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMADomainsListByCreatedBy(int isActive,
		java.lang.String createdBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a reservations where isActive = &#63; and name = &#63;.
	*
	* @param isActive the is active
	* @param name the name
	* @return the number of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMADomainsListByName(int isActive, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a reservations where isActive = &#63; and owner = &#63;.
	*
	* @param isActive the is active
	* @param owner the owner
	* @return the number of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMADomainsListByOwner(int isActive, java.lang.String owner)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a reservations where isActive = &#63; and startDate = &#63;.
	*
	* @param isActive the is active
	* @param startDate the start date
	* @return the number of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMADomainsListByStartDate(int isActive,
		java.util.Date startDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a reservations where isActive = &#63; and endDate = &#63;.
	*
	* @param isActive the is active
	* @param endDate the end date
	* @return the number of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMADomainsListByEndDate(int isActive,
		java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a reservations where isActive = &#63; and provision = &#63;.
	*
	* @param isActive the is active
	* @param provision the provision
	* @return the number of matching s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMADomainsListByProvision(int isActive, int provision)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a reservations.
	*
	* @return the number of s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}