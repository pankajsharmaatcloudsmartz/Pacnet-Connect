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

import com.pacnet.connect.model.FacilityAssignment;

/**
 * The persistence interface for the facility assignment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityAssignmentPersistenceImpl
 * @see FacilityAssignmentUtil
 * @generated
 */
public interface FacilityAssignmentPersistence extends BasePersistence<FacilityAssignment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FacilityAssignmentUtil} to access the facility assignment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the facility assignment in the entity cache if it is enabled.
	*
	* @param facilityAssignment the facility assignment
	*/
	public void cacheResult(
		com.pacnet.connect.model.FacilityAssignment facilityAssignment);

	/**
	* Caches the facility assignments in the entity cache if it is enabled.
	*
	* @param facilityAssignments the facility assignments
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.FacilityAssignment> facilityAssignments);

	/**
	* Creates a new facility assignment with the primary key. Does not add the facility assignment to the database.
	*
	* @param id the primary key for the new facility assignment
	* @return the new facility assignment
	*/
	public com.pacnet.connect.model.FacilityAssignment create(long id);

	/**
	* Removes the facility assignment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility assignment
	* @return the facility assignment that was removed
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a facility assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException;

	public com.pacnet.connect.model.FacilityAssignment updateImpl(
		com.pacnet.connect.model.FacilityAssignment facilityAssignment,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility assignment with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityAssignmentException} if it could not be found.
	*
	* @param id the primary key of the facility assignment
	* @return the facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a facility assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException;

	/**
	* Returns the facility assignment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the facility assignment
	* @return the facility assignment, or <code>null</code> if a facility assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the facility assignments where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByCustomerId(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility assignments where customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param start the lower bound of the range of facility assignments
	* @param end the upper bound of the range of facility assignments (not inclusive)
	* @return the range of matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByCustomerId(
		long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility assignments where customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param start the lower bound of the range of facility assignments
	* @param end the upper bound of the range of facility assignments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByCustomerId(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility assignment in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException;

	/**
	* Returns the first facility assignment in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility assignment in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException;

	/**
	* Returns the last facility assignment in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility assignments before and after the current facility assignment in the ordered set where customerId = &#63;.
	*
	* @param id the primary key of the current facility assignment
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a facility assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment[] findByFacilityAssignmentByCustomerId_PrevAndNext(
		long id, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException;

	/**
	* Returns all the facility assignments where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @return the matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByFacility(
		long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility assignments where faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility assignments
	* @param end the upper bound of the range of facility assignments (not inclusive)
	* @return the range of matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByFacility(
		long faciltyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility assignments where faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility assignments
	* @param end the upper bound of the range of facility assignments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByFacility(
		long faciltyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility assignment in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException;

	/**
	* Returns the first facility assignment in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility assignment in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException;

	/**
	* Returns the last facility assignment in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility assignments before and after the current facility assignment in the ordered set where faciltyId = &#63;.
	*
	* @param id the primary key of the current facility assignment
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a facility assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment[] findByFacilityAssignmentByFacility_PrevAndNext(
		long id, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException;

	/**
	* Returns all the facility assignments where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @return the matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility assignments where facilityServiceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityServiceId the facility service ID
	* @param start the lower bound of the range of facility assignments
	* @param end the upper bound of the range of facility assignments (not inclusive)
	* @return the range of matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByService(
		long facilityServiceId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility assignments where facilityServiceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityServiceId the facility service ID
	* @param start the lower bound of the range of facility assignments
	* @param end the upper bound of the range of facility assignments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByService(
		long facilityServiceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility assignment in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException;

	/**
	* Returns the first facility assignment in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility assignment in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException;

	/**
	* Returns the last facility assignment in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility assignments before and after the current facility assignment in the ordered set where facilityServiceId = &#63;.
	*
	* @param id the primary key of the current facility assignment
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a facility assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAssignment[] findByFacilityAssignmentByService_PrevAndNext(
		long id, long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException;

	/**
	* Returns all the facility assignments.
	*
	* @return the facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAssignment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility assignments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility assignments
	* @param end the upper bound of the range of facility assignments (not inclusive)
	* @return the range of facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAssignment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility assignments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility assignments
	* @param end the upper bound of the range of facility assignments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAssignment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility assignments where customerId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityAssignmentByCustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility assignments where faciltyId = &#63; from the database.
	*
	* @param faciltyId the facilty ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityAssignmentByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility assignments where facilityServiceId = &#63; from the database.
	*
	* @param facilityServiceId the facility service ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityAssignmentByService(long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility assignments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility assignments where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the number of matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityAssignmentByCustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility assignments where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @return the number of matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityAssignmentByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility assignments where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @return the number of matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityAssignmentByService(long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility assignments.
	*
	* @return the number of facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}