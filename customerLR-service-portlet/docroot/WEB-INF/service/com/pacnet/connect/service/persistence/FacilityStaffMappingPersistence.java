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

import com.pacnet.connect.model.FacilityStaffMapping;

/**
 * The persistence interface for the facility staff mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityStaffMappingPersistenceImpl
 * @see FacilityStaffMappingUtil
 * @generated
 */
public interface FacilityStaffMappingPersistence extends BasePersistence<FacilityStaffMapping> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FacilityStaffMappingUtil} to access the facility staff mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the facility staff mapping in the entity cache if it is enabled.
	*
	* @param facilityStaffMapping the facility staff mapping
	*/
	public void cacheResult(
		com.pacnet.connect.model.FacilityStaffMapping facilityStaffMapping);

	/**
	* Caches the facility staff mappings in the entity cache if it is enabled.
	*
	* @param facilityStaffMappings the facility staff mappings
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.FacilityStaffMapping> facilityStaffMappings);

	/**
	* Creates a new facility staff mapping with the primary key. Does not add the facility staff mapping to the database.
	*
	* @param id the primary key for the new facility staff mapping
	* @return the new facility staff mapping
	*/
	public com.pacnet.connect.model.FacilityStaffMapping create(long id);

	/**
	* Removes the facility staff mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility staff mapping
	* @return the facility staff mapping that was removed
	* @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a facility staff mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityStaffMappingException;

	public com.pacnet.connect.model.FacilityStaffMapping updateImpl(
		com.pacnet.connect.model.FacilityStaffMapping facilityStaffMapping,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility staff mapping with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityStaffMappingException} if it could not be found.
	*
	* @param id the primary key of the facility staff mapping
	* @return the facility staff mapping
	* @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a facility staff mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityStaffMappingException;

	/**
	* Returns the facility staff mapping with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the facility staff mapping
	* @return the facility staff mapping, or <code>null</code> if a facility staff mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the facility staff mappings where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @return the matching facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByFacility(
		long facilityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility staff mappings where facilityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityId the facility ID
	* @param start the lower bound of the range of facility staff mappings
	* @param end the upper bound of the range of facility staff mappings (not inclusive)
	* @return the range of matching facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByFacility(
		long facilityId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility staff mappings where facilityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityId the facility ID
	* @param start the lower bound of the range of facility staff mappings
	* @param end the upper bound of the range of facility staff mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByFacility(
		long facilityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility staff mapping in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility staff mapping
	* @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a matching facility staff mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping findByFacilityStaffByFacility_First(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityStaffMappingException;

	/**
	* Returns the first facility staff mapping in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility staff mapping, or <code>null</code> if a matching facility staff mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping fetchByFacilityStaffByFacility_First(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility staff mapping in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility staff mapping
	* @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a matching facility staff mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping findByFacilityStaffByFacility_Last(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityStaffMappingException;

	/**
	* Returns the last facility staff mapping in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility staff mapping, or <code>null</code> if a matching facility staff mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping fetchByFacilityStaffByFacility_Last(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility staff mappings before and after the current facility staff mapping in the ordered set where facilityId = &#63;.
	*
	* @param id the primary key of the current facility staff mapping
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility staff mapping
	* @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a facility staff mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping[] findByFacilityStaffByFacility_PrevAndNext(
		long id, long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityStaffMappingException;

	/**
	* Returns all the facility staff mappings where staffUserId = &#63;.
	*
	* @param staffUserId the staff user ID
	* @return the matching facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByStaffUserId(
		long staffUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility staff mappings where staffUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param staffUserId the staff user ID
	* @param start the lower bound of the range of facility staff mappings
	* @param end the upper bound of the range of facility staff mappings (not inclusive)
	* @return the range of matching facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByStaffUserId(
		long staffUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility staff mappings where staffUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param staffUserId the staff user ID
	* @param start the lower bound of the range of facility staff mappings
	* @param end the upper bound of the range of facility staff mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByStaffUserId(
		long staffUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility staff mapping in the ordered set where staffUserId = &#63;.
	*
	* @param staffUserId the staff user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility staff mapping
	* @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a matching facility staff mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping findByFacilityStaffByStaffUserId_First(
		long staffUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityStaffMappingException;

	/**
	* Returns the first facility staff mapping in the ordered set where staffUserId = &#63;.
	*
	* @param staffUserId the staff user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility staff mapping, or <code>null</code> if a matching facility staff mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping fetchByFacilityStaffByStaffUserId_First(
		long staffUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility staff mapping in the ordered set where staffUserId = &#63;.
	*
	* @param staffUserId the staff user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility staff mapping
	* @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a matching facility staff mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping findByFacilityStaffByStaffUserId_Last(
		long staffUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityStaffMappingException;

	/**
	* Returns the last facility staff mapping in the ordered set where staffUserId = &#63;.
	*
	* @param staffUserId the staff user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility staff mapping, or <code>null</code> if a matching facility staff mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping fetchByFacilityStaffByStaffUserId_Last(
		long staffUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility staff mappings before and after the current facility staff mapping in the ordered set where staffUserId = &#63;.
	*
	* @param id the primary key of the current facility staff mapping
	* @param staffUserId the staff user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility staff mapping
	* @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a facility staff mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping[] findByFacilityStaffByStaffUserId_PrevAndNext(
		long id, long staffUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityStaffMappingException;

	/**
	* Returns all the facility staff mappings.
	*
	* @return the facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility staff mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility staff mappings
	* @param end the upper bound of the range of facility staff mappings (not inclusive)
	* @return the range of facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility staff mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility staff mappings
	* @param end the upper bound of the range of facility staff mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility staff mappings where facilityId = &#63; from the database.
	*
	* @param facilityId the facility ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityStaffByFacility(long facilityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility staff mappings where staffUserId = &#63; from the database.
	*
	* @param staffUserId the staff user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityStaffByStaffUserId(long staffUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility staff mappings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility staff mappings where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @return the number of matching facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityStaffByFacility(long facilityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility staff mappings where staffUserId = &#63;.
	*
	* @param staffUserId the staff user ID
	* @return the number of matching facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityStaffByStaffUserId(long staffUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility staff mappings.
	*
	* @return the number of facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}