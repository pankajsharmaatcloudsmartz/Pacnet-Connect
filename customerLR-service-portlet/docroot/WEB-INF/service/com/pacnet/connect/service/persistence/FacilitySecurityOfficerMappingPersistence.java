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

import com.pacnet.connect.model.FacilitySecurityOfficerMapping;

/**
 * The persistence interface for the facility security officer mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilitySecurityOfficerMappingPersistenceImpl
 * @see FacilitySecurityOfficerMappingUtil
 * @generated
 */
public interface FacilitySecurityOfficerMappingPersistence
	extends BasePersistence<FacilitySecurityOfficerMapping> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FacilitySecurityOfficerMappingUtil} to access the facility security officer mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the facility security officer mapping in the entity cache if it is enabled.
	*
	* @param facilitySecurityOfficerMapping the facility security officer mapping
	*/
	public void cacheResult(
		com.pacnet.connect.model.FacilitySecurityOfficerMapping facilitySecurityOfficerMapping);

	/**
	* Caches the facility security officer mappings in the entity cache if it is enabled.
	*
	* @param facilitySecurityOfficerMappings the facility security officer mappings
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> facilitySecurityOfficerMappings);

	/**
	* Creates a new facility security officer mapping with the primary key. Does not add the facility security officer mapping to the database.
	*
	* @param id the primary key for the new facility security officer mapping
	* @return the new facility security officer mapping
	*/
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping create(
		long id);

	/**
	* Removes the facility security officer mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility security officer mapping
	* @return the facility security officer mapping that was removed
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a facility security officer mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException;

	public com.pacnet.connect.model.FacilitySecurityOfficerMapping updateImpl(
		com.pacnet.connect.model.FacilitySecurityOfficerMapping facilitySecurityOfficerMapping,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility security officer mapping with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException} if it could not be found.
	*
	* @param id the primary key of the facility security officer mapping
	* @return the facility security officer mapping
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a facility security officer mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException;

	/**
	* Returns the facility security officer mapping with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the facility security officer mapping
	* @return the facility security officer mapping, or <code>null</code> if a facility security officer mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the facility security officer mappings where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @return the matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityByFacility(
		long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility security officer mappings where faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility security officer mappings
	* @param end the upper bound of the range of facility security officer mappings (not inclusive)
	* @return the range of matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityByFacility(
		long faciltyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility security officer mappings where faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility security officer mappings
	* @param end the upper bound of the range of facility security officer mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityByFacility(
		long faciltyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility security officer mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility security officer mapping
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping findByFacilitySecurityByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException;

	/**
	* Returns the first facility security officer mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility security officer mapping, or <code>null</code> if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping fetchByFacilitySecurityByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility security officer mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility security officer mapping
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping findByFacilitySecurityByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException;

	/**
	* Returns the last facility security officer mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility security officer mapping, or <code>null</code> if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping fetchByFacilitySecurityByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility security officer mappings before and after the current facility security officer mapping in the ordered set where faciltyId = &#63;.
	*
	* @param id the primary key of the current facility security officer mapping
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility security officer mapping
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a facility security officer mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping[] findByFacilitySecurityByFacility_PrevAndNext(
		long id, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException;

	/**
	* Returns all the facility security officer mappings where securityOfficerUserId = &#63;.
	*
	* @param securityOfficerUserId the security officer user ID
	* @return the matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityBySecurityOfficerUserId(
		long securityOfficerUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility security officer mappings where securityOfficerUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param securityOfficerUserId the security officer user ID
	* @param start the lower bound of the range of facility security officer mappings
	* @param end the upper bound of the range of facility security officer mappings (not inclusive)
	* @return the range of matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityBySecurityOfficerUserId(
		long securityOfficerUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility security officer mappings where securityOfficerUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param securityOfficerUserId the security officer user ID
	* @param start the lower bound of the range of facility security officer mappings
	* @param end the upper bound of the range of facility security officer mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityBySecurityOfficerUserId(
		long securityOfficerUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility security officer mapping in the ordered set where securityOfficerUserId = &#63;.
	*
	* @param securityOfficerUserId the security officer user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility security officer mapping
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping findByFacilitySecurityBySecurityOfficerUserId_First(
		long securityOfficerUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException;

	/**
	* Returns the first facility security officer mapping in the ordered set where securityOfficerUserId = &#63;.
	*
	* @param securityOfficerUserId the security officer user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility security officer mapping, or <code>null</code> if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping fetchByFacilitySecurityBySecurityOfficerUserId_First(
		long securityOfficerUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility security officer mapping in the ordered set where securityOfficerUserId = &#63;.
	*
	* @param securityOfficerUserId the security officer user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility security officer mapping
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping findByFacilitySecurityBySecurityOfficerUserId_Last(
		long securityOfficerUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException;

	/**
	* Returns the last facility security officer mapping in the ordered set where securityOfficerUserId = &#63;.
	*
	* @param securityOfficerUserId the security officer user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility security officer mapping, or <code>null</code> if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping fetchByFacilitySecurityBySecurityOfficerUserId_Last(
		long securityOfficerUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility security officer mappings before and after the current facility security officer mapping in the ordered set where securityOfficerUserId = &#63;.
	*
	* @param id the primary key of the current facility security officer mapping
	* @param securityOfficerUserId the security officer user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility security officer mapping
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a facility security officer mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilitySecurityOfficerMapping[] findByFacilitySecurityBySecurityOfficerUserId_PrevAndNext(
		long id, long securityOfficerUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException;

	/**
	* Returns all the facility security officer mappings.
	*
	* @return the facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility security officer mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility security officer mappings
	* @param end the upper bound of the range of facility security officer mappings (not inclusive)
	* @return the range of facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility security officer mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility security officer mappings
	* @param end the upper bound of the range of facility security officer mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility security officer mappings where faciltyId = &#63; from the database.
	*
	* @param faciltyId the facilty ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilitySecurityByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility security officer mappings where securityOfficerUserId = &#63; from the database.
	*
	* @param securityOfficerUserId the security officer user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilitySecurityBySecurityOfficerUserId(
		long securityOfficerUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility security officer mappings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility security officer mappings where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @return the number of matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilitySecurityByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility security officer mappings where securityOfficerUserId = &#63;.
	*
	* @param securityOfficerUserId the security officer user ID
	* @return the number of matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilitySecurityBySecurityOfficerUserId(
		long securityOfficerUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility security officer mappings.
	*
	* @return the number of facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}