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

import com.pacnet.connect.model.FacilityUserMapping;

/**
 * The persistence interface for the facility user mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityUserMappingPersistenceImpl
 * @see FacilityUserMappingUtil
 * @generated
 */
public interface FacilityUserMappingPersistence extends BasePersistence<FacilityUserMapping> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FacilityUserMappingUtil} to access the facility user mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the facility user mapping in the entity cache if it is enabled.
	*
	* @param facilityUserMapping the facility user mapping
	*/
	public void cacheResult(
		com.pacnet.connect.model.FacilityUserMapping facilityUserMapping);

	/**
	* Caches the facility user mappings in the entity cache if it is enabled.
	*
	* @param facilityUserMappings the facility user mappings
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.FacilityUserMapping> facilityUserMappings);

	/**
	* Creates a new facility user mapping with the primary key. Does not add the facility user mapping to the database.
	*
	* @param id the primary key for the new facility user mapping
	* @return the new facility user mapping
	*/
	public com.pacnet.connect.model.FacilityUserMapping create(long id);

	/**
	* Removes the facility user mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility user mapping
	* @return the facility user mapping that was removed
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	public com.pacnet.connect.model.FacilityUserMapping updateImpl(
		com.pacnet.connect.model.FacilityUserMapping facilityUserMapping,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility user mapping with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityUserMappingException} if it could not be found.
	*
	* @param id the primary key of the facility user mapping
	* @return the facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns the facility user mapping with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the facility user mapping
	* @return the facility user mapping, or <code>null</code> if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the facility user mappings where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByCustomerId(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility user mappings where customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @return the range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByCustomerId(
		long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility user mappings where customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByCustomerId(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility user mappings before and after the current facility user mapping in the ordered set where customerId = &#63;.
	*
	* @param id the primary key of the current facility user mapping
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping[] findByFacilityUserMappingByCustomerId_PrevAndNext(
		long id, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns all the facility user mappings where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @return the matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByFacility(
		long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility user mappings where faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @return the range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByFacility(
		long faciltyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility user mappings where faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByFacility(
		long faciltyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility user mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns the first facility user mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility user mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns the last facility user mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility user mappings before and after the current facility user mapping in the ordered set where faciltyId = &#63;.
	*
	* @param id the primary key of the current facility user mapping
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping[] findByFacilityUserMappingByFacility_PrevAndNext(
		long id, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns all the facility user mappings where customerId = &#63; and customerContactId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @return the matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByCustomerContact(
		long customerId, long customerContactId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility user mappings where customerId = &#63; and customerContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @return the range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByCustomerContact(
		long customerId, long customerContactId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility user mappings where customerId = &#63; and customerContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByCustomerContact(
		long customerId, long customerContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping findByFacilityByCustomerContact_First(
		long customerId, long customerContactId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping fetchByFacilityByCustomerContact_First(
		long customerId, long customerContactId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping findByFacilityByCustomerContact_Last(
		long customerId, long customerContactId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping fetchByFacilityByCustomerContact_Last(
		long customerId, long customerContactId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility user mappings before and after the current facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63;.
	*
	* @param id the primary key of the current facility user mapping
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping[] findByFacilityByCustomerContact_PrevAndNext(
		long id, long customerId, long customerContactId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns all the facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @return the matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFumByFacilityCustomerContact(
		long customerId, long customerContactId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @return the range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFumByFacilityCustomerContact(
		long customerId, long customerContactId, long faciltyId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFumByFacilityCustomerContact(
		long customerId, long customerContactId, long faciltyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping findByFumByFacilityCustomerContact_First(
		long customerId, long customerContactId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping fetchByFumByFacilityCustomerContact_First(
		long customerId, long customerContactId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping findByFumByFacilityCustomerContact_Last(
		long customerId, long customerContactId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping fetchByFumByFacilityCustomerContact_Last(
		long customerId, long customerContactId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility user mappings before and after the current facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* @param id the primary key of the current facility user mapping
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping[] findByFumByFacilityCustomerContact_PrevAndNext(
		long id, long customerId, long customerContactId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @return the matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByNonPacnetUserId(
		long customerId, long nonPacnetUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @return the range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByNonPacnetUserId(
		long customerId, long nonPacnetUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByNonPacnetUserId(
		long customerId, long nonPacnetUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping findByFacilityByNonPacnetUserId_First(
		long customerId, long nonPacnetUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping fetchByFacilityByNonPacnetUserId_First(
		long customerId, long nonPacnetUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping findByFacilityByNonPacnetUserId_Last(
		long customerId, long nonPacnetUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping fetchByFacilityByNonPacnetUserId_Last(
		long customerId, long nonPacnetUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility user mappings before and after the current facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* @param id the primary key of the current facility user mapping
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping[] findByFacilityByNonPacnetUserId_PrevAndNext(
		long id, long customerId, long nonPacnetUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @return the matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByFacilityAndNonPacnetUserId(
		long customerId, long nonPacnetUserId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @return the range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByFacilityAndNonPacnetUserId(
		long customerId, long nonPacnetUserId, long faciltyId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByFacilityAndNonPacnetUserId(
		long customerId, long nonPacnetUserId, long faciltyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping findByFacilityByFacilityAndNonPacnetUserId_First(
		long customerId, long nonPacnetUserId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping fetchByFacilityByFacilityAndNonPacnetUserId_First(
		long customerId, long nonPacnetUserId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping findByFacilityByFacilityAndNonPacnetUserId_Last(
		long customerId, long nonPacnetUserId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping fetchByFacilityByFacilityAndNonPacnetUserId_Last(
		long customerId, long nonPacnetUserId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility user mappings before and after the current facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* @param id the primary key of the current facility user mapping
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserMapping[] findByFacilityByFacilityAndNonPacnetUserId_PrevAndNext(
		long id, long customerId, long nonPacnetUserId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException;

	/**
	* Returns all the facility user mappings.
	*
	* @return the facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility user mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @return the range of facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility user mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserMapping> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility user mappings where customerId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityUserMappingByCustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility user mappings where faciltyId = &#63; from the database.
	*
	* @param faciltyId the facilty ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityUserMappingByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility user mappings where customerId = &#63; and customerContactId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityByCustomerContact(long customerId,
		long customerContactId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFumByFacilityCustomerContact(long customerId,
		long customerContactId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityByNonPacnetUserId(long customerId,
		long nonPacnetUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityByFacilityAndNonPacnetUserId(long customerId,
		long nonPacnetUserId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility user mappings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility user mappings where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the number of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityUserMappingByCustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility user mappings where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @return the number of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityUserMappingByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility user mappings where customerId = &#63; and customerContactId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @return the number of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityByCustomerContact(long customerId,
		long customerContactId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @return the number of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByFumByFacilityCustomerContact(long customerId,
		long customerContactId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility user mappings where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @return the number of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityByNonPacnetUserId(long customerId,
		long nonPacnetUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @return the number of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityByFacilityAndNonPacnetUserId(long customerId,
		long nonPacnetUserId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility user mappings.
	*
	* @return the number of facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}