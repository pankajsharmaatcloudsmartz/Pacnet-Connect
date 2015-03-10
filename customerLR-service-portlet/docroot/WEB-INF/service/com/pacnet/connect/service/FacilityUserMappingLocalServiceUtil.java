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
 * The utility for the facility user mapping local service. This utility wraps {@link com.pacnet.connect.service.impl.FacilityUserMappingLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityUserMappingLocalService
 * @see com.pacnet.connect.service.base.FacilityUserMappingLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.FacilityUserMappingLocalServiceImpl
 * @generated
 */
public class FacilityUserMappingLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.FacilityUserMappingLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the facility user mapping to the database. Also notifies the appropriate model listeners.
	*
	* @param facilityUserMapping the facility user mapping
	* @return the facility user mapping that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping addFacilityUserMapping(
		com.pacnet.connect.model.FacilityUserMapping facilityUserMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addFacilityUserMapping(facilityUserMapping);
	}

	/**
	* Creates a new facility user mapping with the primary key. Does not add the facility user mapping to the database.
	*
	* @param id the primary key for the new facility user mapping
	* @return the new facility user mapping
	*/
	public static com.pacnet.connect.model.FacilityUserMapping createFacilityUserMapping(
		long id) {
		return getService().createFacilityUserMapping(id);
	}

	/**
	* Deletes the facility user mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility user mapping
	* @return the facility user mapping that was removed
	* @throws PortalException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping deleteFacilityUserMapping(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFacilityUserMapping(id);
	}

	/**
	* Deletes the facility user mapping from the database. Also notifies the appropriate model listeners.
	*
	* @param facilityUserMapping the facility user mapping
	* @return the facility user mapping that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping deleteFacilityUserMapping(
		com.pacnet.connect.model.FacilityUserMapping facilityUserMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFacilityUserMapping(facilityUserMapping);
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

	public static com.pacnet.connect.model.FacilityUserMapping fetchFacilityUserMapping(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchFacilityUserMapping(id);
	}

	/**
	* Returns the facility user mapping with the primary key.
	*
	* @param id the primary key of the facility user mapping
	* @return the facility user mapping
	* @throws PortalException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping getFacilityUserMapping(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFacilityUserMapping(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> getFacilityUserMappings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFacilityUserMappings(start, end);
	}

	/**
	* Returns the number of facility user mappings.
	*
	* @return the number of facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int getFacilityUserMappingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFacilityUserMappingsCount();
	}

	/**
	* Updates the facility user mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityUserMapping the facility user mapping
	* @return the facility user mapping that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping updateFacilityUserMapping(
		com.pacnet.connect.model.FacilityUserMapping facilityUserMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFacilityUserMapping(facilityUserMapping);
	}

	/**
	* Updates the facility user mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityUserMapping the facility user mapping
	* @param merge whether to merge the facility user mapping with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the facility user mapping that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping updateFacilityUserMapping(
		com.pacnet.connect.model.FacilityUserMapping facilityUserMapping,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFacilityUserMapping(facilityUserMapping, merge);
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

	public static com.pacnet.connect.model.FacilityUserMapping createFacilityUserMapping(
		long customerId, long faciltyId, long customerContactId,
		boolean isActive, java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn,
		long nonPacnetUserId) {
		return getService()
				   .createFacilityUserMapping(customerId, faciltyId,
			customerContactId, isActive, createdBy, createdOn, updatedBy,
			updatedOn, nonPacnetUserId);
	}

	public static com.pacnet.connect.model.FacilityUserMapping updateFacilityUserMapping(
		long id, long customerId, long faciltyId, long customerContactId,
		boolean isActive, java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn,
		long nonPacnetUserId) {
		return getService()
				   .updateFacilityUserMapping(id, customerId, faciltyId,
			customerContactId, isActive, createdBy, createdOn, updatedBy,
			updatedOn, nonPacnetUserId);
	}

	public static boolean deleteFacilityById(long id) {
		return getService().deleteFacilityById(id);
	}

	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByCustomerId(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByFacilityUserMappingByCustomerId(customerId);
	}

	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll();
	}

	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByCustomerContact(
		long customerId, long customerContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFacilityByCustomerContact(customerId,
			customerContactId);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByCustomerId(
		long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFacilityUserMappingByCustomerId(customerId, start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByCustomerId(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFacilityUserMappingByCustomerId(customerId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getService()
				   .findByFacilityUserMappingByCustomerId_First(customerId,
			orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchByFacilityUserMappingByCustomerId_First(customerId,
			orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getService()
				   .findByFacilityUserMappingByCustomerId_Last(customerId,
			orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchByFacilityUserMappingByCustomerId_Last(customerId,
			orderByComparator);
	}

	/**
	* Returns all the facility user mappings where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @return the matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByFacility(
		long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByFacilityUserMappingByFacility(faciltyId);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByFacility(
		long faciltyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFacilityUserMappingByFacility(faciltyId, start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByFacility(
		long faciltyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFacilityUserMappingByFacility(faciltyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getService()
				   .findByFacilityUserMappingByFacility_First(faciltyId,
			orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchByFacilityUserMappingByFacility_First(faciltyId,
			orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getService()
				   .findByFacilityUserMappingByFacility_Last(faciltyId,
			orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchByFacilityUserMappingByFacility_Last(faciltyId,
			orderByComparator);
	}

	/**
	* Returns all the facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @return the matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFumByFacilityCustomerContact(
		long customerId, long customerContactId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFumByFacilityCustomerContact(customerId,
			customerContactId, faciltyId);
	}

	/**
	* Removes all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityByNonPacnetUserId(long customerId,
		long nonPacnetUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.removeByFacilityByNonPacnetUserId(customerId, nonPacnetUserId);
	}

	/**
	* Removes all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityByFacilityAndNonPacnetUserId(
		long customerId, long nonPacnetUserId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.removeByFacilityByFacilityAndNonPacnetUserId(customerId,
			nonPacnetUserId, faciltyId);
	}

	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByFacilityAndNonPacnetUserId(
		long customerId, long nonPacnetUserId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFacilityByFacilityAndNonPacnetUserId(customerId,
			nonPacnetUserId, faciltyId);
	}

	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByNonPacnetUserId(
		long customerId, long nonPacnetUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFacilityByNonPacnetUserId(customerId,
			nonPacnetUserId, start, end, orderByComparator);
	}

	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByNonPacnetUserId(
		long customerId, long nonPacnetUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFacilityByNonPacnetUserId(customerId, nonPacnetUserId);
	}

	public static void clearService() {
		_service = null;
	}

	public static FacilityUserMappingLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					FacilityUserMappingLocalService.class.getName());

			if (invokableLocalService instanceof FacilityUserMappingLocalService) {
				_service = (FacilityUserMappingLocalService)invokableLocalService;
			}
			else {
				_service = new FacilityUserMappingLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(FacilityUserMappingLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(FacilityUserMappingLocalService service) {
	}

	private static FacilityUserMappingLocalService _service;
}