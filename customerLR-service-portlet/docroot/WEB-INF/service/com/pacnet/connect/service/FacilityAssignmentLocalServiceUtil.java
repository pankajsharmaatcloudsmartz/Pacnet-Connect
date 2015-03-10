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

package com.pacnet.connect.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the facility assignment local service. This utility wraps {@link com.pacnet.connect.service.impl.FacilityAssignmentLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityAssignmentLocalService
 * @see com.pacnet.connect.service.base.FacilityAssignmentLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.FacilityAssignmentLocalServiceImpl
 * @generated
 */
public class FacilityAssignmentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.FacilityAssignmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the facility assignment to the database. Also notifies the appropriate model listeners.
	*
	* @param facilityAssignment the facility assignment
	* @return the facility assignment that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment addFacilityAssignment(
		com.pacnet.connect.model.FacilityAssignment facilityAssignment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addFacilityAssignment(facilityAssignment);
	}

	/**
	* Creates a new facility assignment with the primary key. Does not add the facility assignment to the database.
	*
	* @param id the primary key for the new facility assignment
	* @return the new facility assignment
	*/
	public static com.pacnet.connect.model.FacilityAssignment createFacilityAssignment(
		long id) {
		return getService().createFacilityAssignment(id);
	}

	/**
	* Deletes the facility assignment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility assignment
	* @return the facility assignment that was removed
	* @throws PortalException if a facility assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment deleteFacilityAssignment(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFacilityAssignment(id);
	}

	/**
	* Deletes the facility assignment from the database. Also notifies the appropriate model listeners.
	*
	* @param facilityAssignment the facility assignment
	* @return the facility assignment that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment deleteFacilityAssignment(
		com.pacnet.connect.model.FacilityAssignment facilityAssignment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFacilityAssignment(facilityAssignment);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.pacnet.connect.model.FacilityAssignment fetchFacilityAssignment(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchFacilityAssignment(id);
	}

	/**
	* Returns the facility assignment with the primary key.
	*
	* @param id the primary key of the facility assignment
	* @return the facility assignment
	* @throws PortalException if a facility assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment getFacilityAssignment(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFacilityAssignment(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> getFacilityAssignments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFacilityAssignments(start, end);
	}

	/**
	* Returns the number of facility assignments.
	*
	* @return the number of facility assignments
	* @throws SystemException if a system exception occurred
	*/
	public static int getFacilityAssignmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFacilityAssignmentsCount();
	}

	/**
	* Updates the facility assignment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityAssignment the facility assignment
	* @return the facility assignment that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment updateFacilityAssignment(
		com.pacnet.connect.model.FacilityAssignment facilityAssignment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFacilityAssignment(facilityAssignment);
	}

	/**
	* Updates the facility assignment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityAssignment the facility assignment
	* @param merge whether to merge the facility assignment with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the facility assignment that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAssignment updateFacilityAssignment(
		com.pacnet.connect.model.FacilityAssignment facilityAssignment,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFacilityAssignment(facilityAssignment, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.pacnet.connect.model.FacilityAssignment createFacilityAssignment(
		long customerId, long facilityId, long facilityServiceId,
		boolean isActive, java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return getService()
				   .createFacilityAssignment(customerId, facilityId,
			facilityServiceId, isActive, createdBy, createdOn, updatedBy,
			updatedOn);
	}

	public static com.pacnet.connect.model.FacilityAssignment updateFacilityAssignment(
		long id, long customerId, long facilityId, long facilityServiceId,
		boolean isActive, java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return getService()
				   .updateFacilityAssignment(id, customerId, facilityId,
			facilityServiceId, isActive, createdBy, createdOn, updatedBy,
			updatedOn);
	}

	public static boolean deleteFacilityById(long id) {
		return getService().deleteFacilityById(id);
	}

	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> getFacilityAssignmentByStatus(
		int status) {
		return getService().getFacilityAssignmentByStatus(status);
	}

	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> getFacilityAssignmentByStatusAndCustId(
		int status, long customerId) {
		return getService()
				   .getFacilityAssignmentByStatusAndCustId(status, customerId);
	}

	public static java.util.List<com.pacnet.connect.model.FacilityAssignment> findByFacilityAssignmentByCustomerId(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByFacilityAssignmentByCustomerId(customerId);
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
				   .fetchByFacilityAssignmentByCustomerId_Last(customerId,
			orderByComparator);
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
		return getService().findByFacilityAssignmentByFacility(faciltyId);
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
				   .fetchByFacilityAssignmentByFacility_Last(faciltyId,
			orderByComparator);
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
		return getService().findByFacilityAssignmentByService(facilityServiceId);
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
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
		return getService()
				   .fetchByFacilityAssignmentByService_Last(facilityServiceId,
			orderByComparator);
	}

	public static void clearService() {
		_service = null;
	}

	public static FacilityAssignmentLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					FacilityAssignmentLocalService.class.getName());

			if (invokableLocalService instanceof FacilityAssignmentLocalService) {
				_service = (FacilityAssignmentLocalService)invokableLocalService;
			}
			else {
				_service = new FacilityAssignmentLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(FacilityAssignmentLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(FacilityAssignmentLocalService service) {
	}

	private static FacilityAssignmentLocalService _service;
}