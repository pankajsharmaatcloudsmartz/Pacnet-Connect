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

import com.pacnet.connect.model.Facility;

/**
 * The persistence interface for the facility service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityPersistenceImpl
 * @see FacilityUtil
 * @generated
 */
public interface FacilityPersistence extends BasePersistence<Facility> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FacilityUtil} to access the facility persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the facility in the entity cache if it is enabled.
	*
	* @param facility the facility
	*/
	public void cacheResult(com.pacnet.connect.model.Facility facility);

	/**
	* Caches the facilities in the entity cache if it is enabled.
	*
	* @param facilities the facilities
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.Facility> facilities);

	/**
	* Creates a new facility with the primary key. Does not add the facility to the database.
	*
	* @param id the primary key for the new facility
	* @return the new facility
	*/
	public com.pacnet.connect.model.Facility create(long id);

	/**
	* Removes the facility with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility
	* @return the facility that was removed
	* @throws com.pacnet.connect.NoSuchFacilityException if a facility with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityException;

	public com.pacnet.connect.model.Facility updateImpl(
		com.pacnet.connect.model.Facility facility, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityException} if it could not be found.
	*
	* @param id the primary key of the facility
	* @return the facility
	* @throws com.pacnet.connect.NoSuchFacilityException if a facility with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityException;

	/**
	* Returns the facility with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the facility
	* @return the facility, or <code>null</code> if a facility with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the facilities where name = &#63;.
	*
	* @param name the name
	* @return the matching facilities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.Facility> findByFacilityName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facilities where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of facilities
	* @param end the upper bound of the range of facilities (not inclusive)
	* @return the range of matching facilities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.Facility> findByFacilityName(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facilities where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of facilities
	* @param end the upper bound of the range of facilities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facilities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.Facility> findByFacilityName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility
	* @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility findByFacilityName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityException;

	/**
	* Returns the first facility in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility, or <code>null</code> if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility fetchByFacilityName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility
	* @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility findByFacilityName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityException;

	/**
	* Returns the last facility in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility, or <code>null</code> if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility fetchByFacilityName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facilities before and after the current facility in the ordered set where name = &#63;.
	*
	* @param id the primary key of the current facility
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility
	* @throws com.pacnet.connect.NoSuchFacilityException if a facility with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility[] findByFacilityName_PrevAndNext(
		long id, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityException;

	/**
	* Returns all the facilities where countryId = &#63;.
	*
	* @param countryId the country ID
	* @return the matching facilities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.Facility> findByFacilityByCountryId(
		long countryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facilities where countryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param countryId the country ID
	* @param start the lower bound of the range of facilities
	* @param end the upper bound of the range of facilities (not inclusive)
	* @return the range of matching facilities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.Facility> findByFacilityByCountryId(
		long countryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facilities where countryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param countryId the country ID
	* @param start the lower bound of the range of facilities
	* @param end the upper bound of the range of facilities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facilities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.Facility> findByFacilityByCountryId(
		long countryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility in the ordered set where countryId = &#63;.
	*
	* @param countryId the country ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility
	* @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility findByFacilityByCountryId_First(
		long countryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityException;

	/**
	* Returns the first facility in the ordered set where countryId = &#63;.
	*
	* @param countryId the country ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility, or <code>null</code> if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility fetchByFacilityByCountryId_First(
		long countryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility in the ordered set where countryId = &#63;.
	*
	* @param countryId the country ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility
	* @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility findByFacilityByCountryId_Last(
		long countryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityException;

	/**
	* Returns the last facility in the ordered set where countryId = &#63;.
	*
	* @param countryId the country ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility, or <code>null</code> if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility fetchByFacilityByCountryId_Last(
		long countryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facilities before and after the current facility in the ordered set where countryId = &#63;.
	*
	* @param id the primary key of the current facility
	* @param countryId the country ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility
	* @throws com.pacnet.connect.NoSuchFacilityException if a facility with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility[] findByFacilityByCountryId_PrevAndNext(
		long id, long countryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityException;

	/**
	* Returns all the facilities where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @return the matching facilities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.Facility> findByFacilityByManagerId(
		long managerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facilities where managerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param managerId the manager ID
	* @param start the lower bound of the range of facilities
	* @param end the upper bound of the range of facilities (not inclusive)
	* @return the range of matching facilities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.Facility> findByFacilityByManagerId(
		long managerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facilities where managerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param managerId the manager ID
	* @param start the lower bound of the range of facilities
	* @param end the upper bound of the range of facilities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facilities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.Facility> findByFacilityByManagerId(
		long managerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility
	* @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility findByFacilityByManagerId_First(
		long managerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityException;

	/**
	* Returns the first facility in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility, or <code>null</code> if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility fetchByFacilityByManagerId_First(
		long managerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility
	* @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility findByFacilityByManagerId_Last(
		long managerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityException;

	/**
	* Returns the last facility in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility, or <code>null</code> if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility fetchByFacilityByManagerId_Last(
		long managerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facilities before and after the current facility in the ordered set where managerId = &#63;.
	*
	* @param id the primary key of the current facility
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility
	* @throws com.pacnet.connect.NoSuchFacilityException if a facility with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.Facility[] findByFacilityByManagerId_PrevAndNext(
		long id, long managerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityException;

	/**
	* Returns all the facilities.
	*
	* @return the facilities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.Facility> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facilities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facilities
	* @param end the upper bound of the range of facilities (not inclusive)
	* @return the range of facilities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.Facility> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facilities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facilities
	* @param end the upper bound of the range of facilities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of facilities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.Facility> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facilities where name = &#63; from the database.
	*
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facilities where countryId = &#63; from the database.
	*
	* @param countryId the country ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityByCountryId(long countryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facilities where managerId = &#63; from the database.
	*
	* @param managerId the manager ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityByManagerId(long managerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facilities from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facilities where name = &#63;.
	*
	* @param name the name
	* @return the number of matching facilities
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facilities where countryId = &#63;.
	*
	* @param countryId the country ID
	* @return the number of matching facilities
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityByCountryId(long countryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facilities where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @return the number of matching facilities
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityByManagerId(long managerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facilities.
	*
	* @return the number of facilities
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}