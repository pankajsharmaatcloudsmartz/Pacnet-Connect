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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.pacnet.connect.model.FacilityAssignment;

import java.util.List;

/**
 * The persistence utility for the facility assignment service. This utility wraps {@link FacilityAssignmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityAssignmentPersistence
 * @see FacilityAssignmentPersistenceImpl
 * @generated
 */
public class FacilityAssignmentUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(FacilityAssignment facilityAssignment) {
		getPersistence().clearCache(facilityAssignment);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FacilityAssignment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FacilityAssignment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FacilityAssignment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static FacilityAssignment update(
		FacilityAssignment facilityAssignment, boolean merge)
		throws SystemException {
		return getPersistence().update(facilityAssignment, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static FacilityAssignment update(
		FacilityAssignment facilityAssignment, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(facilityAssignment, merge, serviceContext);
	}

	/**
	* Caches the facility assignment in the entity cache if it is enabled.
	*
	* @param facilityAssignment the facility assignment
	*/
	public static void cacheResult(
		com.pacnet.connect.model.FacilityAssignment facilityAssignment) {
		getPersistence().cacheResult(facilityAssignment);
	}

	/**
	* Caches the facility assignments in the entity cache if it is enabled.
	*
	* @param facilityAssignments the facility assignments
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.FacilityAssignment> facilityAssignments) {
		getPersistence().cacheResult(facilityAssignments);
	}

	/**
	* Creates a new facility assignment with the primary key. Does not add the facility assignment to the database.
	*
	* @param id the primary key for the new facility assignment
	* @return the new facility assignment
	*/
	public static com.pacnet.connect.model.FacilityAssignment create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the facility assignment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility assignment
	* @return the facility assignment that was removed
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a facility assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.FacilityAssignment updateImpl(
		com.pacnet.connect.model.FacilityAssignment facilityAssignment,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(facilityAssignment, merge);
	}

	/**
	* Returns the facility assignment with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityAssignmentException} if it could not be found.
	*
	* @param id the primary key of the facility assignment
	* @return the facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a facility assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the facility assignment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the facility assignment
	* @return the facility assignment, or <code>null</code> if a facility assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the facility assignments where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByCustomerId(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFacilityAssignmentByCustomerId(customerId);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByCustomerId(
		long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityAssignmentByCustomerId(customerId, start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByCustomerId(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityAssignmentByCustomerId(customerId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first facility assignment in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException {
		return getPersistence()
				   .findByFacilityAssignmentByCustomerId_First(customerId,
			orderByComparator);
	}

	/**
	* Returns the first facility assignment in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityAssignmentByCustomerId_First(customerId,
			orderByComparator);
	}

	/**
	* Returns the last facility assignment in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException {
		return getPersistence()
				   .findByFacilityAssignmentByCustomerId_Last(customerId,
			orderByComparator);
	}

	/**
	* Returns the last facility assignment in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityAssignmentByCustomerId_Last(customerId,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.FacilityAssignment[] findByFacilityAssignmentByCustomerId_PrevAndNext(
		long id, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException {
		return getPersistence()
				   .findByFacilityAssignmentByCustomerId_PrevAndNext(id,
			customerId, orderByComparator);
	}

	/**
	* Returns all the facility assignments where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @return the matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByFacility(
		long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFacilityAssignmentByFacility(faciltyId);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByFacility(
		long faciltyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityAssignmentByFacility(faciltyId, start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByFacility(
		long faciltyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityAssignmentByFacility(faciltyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first facility assignment in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException {
		return getPersistence()
				   .findByFacilityAssignmentByFacility_First(faciltyId,
			orderByComparator);
	}

	/**
	* Returns the first facility assignment in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityAssignmentByFacility_First(faciltyId,
			orderByComparator);
	}

	/**
	* Returns the last facility assignment in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException {
		return getPersistence()
				   .findByFacilityAssignmentByFacility_Last(faciltyId,
			orderByComparator);
	}

	/**
	* Returns the last facility assignment in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityAssignmentByFacility_Last(faciltyId,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.FacilityAssignment[] findByFacilityAssignmentByFacility_PrevAndNext(
		long id, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException {
		return getPersistence()
				   .findByFacilityAssignmentByFacility_PrevAndNext(id,
			faciltyId, orderByComparator);
	}

	/**
	* Returns all the facility assignments where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @return the matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityAssignmentByService(facilityServiceId);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByService(
		long facilityServiceId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityAssignmentByService(facilityServiceId, start,
			end);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByService(
		long facilityServiceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityAssignmentByService(facilityServiceId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first facility assignment in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException {
		return getPersistence()
				   .findByFacilityAssignmentByService_First(facilityServiceId,
			orderByComparator);
	}

	/**
	* Returns the first facility assignment in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityAssignmentByService_First(facilityServiceId,
			orderByComparator);
	}

	/**
	* Returns the last facility assignment in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility assignment
	* @throws com.pacnet.connect.NoSuchFacilityAssignmentException if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment findByFacilityAssignmentByService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException {
		return getPersistence()
				   .findByFacilityAssignmentByService_Last(facilityServiceId,
			orderByComparator);
	}

	/**
	* Returns the last facility assignment in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility assignment, or <code>null</code> if a matching facility assignment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment fetchByFacilityAssignmentByService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityAssignmentByService_Last(facilityServiceId,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.FacilityAssignment[] findByFacilityAssignmentByService_PrevAndNext(
		long id, long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAssignmentException {
		return getPersistence()
				   .findByFacilityAssignmentByService_PrevAndNext(id,
			facilityServiceId, orderByComparator);
	}

	/**
	* Returns all the facility assignments.
	*
	* @return the facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the facility assignments where customerId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityAssignmentByCustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFacilityAssignmentByCustomerId(customerId);
	}

	/**
	* Removes all the facility assignments where faciltyId = &#63; from the database.
	*
	* @param faciltyId the facilty ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityAssignmentByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFacilityAssignmentByFacility(faciltyId);
	}

	/**
	* Removes all the facility assignments where facilityServiceId = &#63; from the database.
	*
	* @param facilityServiceId the facility service ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityAssignmentByService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFacilityAssignmentByService(facilityServiceId);
	}

	/**
	* Removes all the facility assignments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of facility assignments where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the number of matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFacilityAssignmentByCustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFacilityAssignmentByCustomerId(customerId);
	}

	/**
	* Returns the number of facility assignments where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @return the number of matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFacilityAssignmentByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFacilityAssignmentByFacility(faciltyId);
	}

	/**
	* Returns the number of facility assignments where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @return the number of matching facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFacilityAssignmentByService(long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByFacilityAssignmentByService(facilityServiceId);
	}

	/**
	* Returns the number of facility assignments.
	*
	* @return the number of facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FacilityAssignmentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FacilityAssignmentPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					FacilityAssignmentPersistence.class.getName());

			ReferenceRegistry.registerReference(FacilityAssignmentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(FacilityAssignmentPersistence persistence) {
	}

	private static FacilityAssignmentPersistence _persistence;
}