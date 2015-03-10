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
 * The utility for the facility staff mapping local service. This utility wraps {@link com.pacnet.connect.service.impl.FacilityStaffMappingLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityStaffMappingLocalService
 * @see com.pacnet.connect.service.base.FacilityStaffMappingLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.FacilityStaffMappingLocalServiceImpl
 * @generated
 */
public class FacilityStaffMappingLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.FacilityStaffMappingLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the facility staff mapping to the database. Also notifies the appropriate model listeners.
	*
	* @param facilityStaffMapping the facility staff mapping
	* @return the facility staff mapping that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityStaffMapping addFacilityStaffMapping(
		com.pacnet.connect.model.FacilityStaffMapping facilityStaffMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addFacilityStaffMapping(facilityStaffMapping);
	}

	/**
	* Creates a new facility staff mapping with the primary key. Does not add the facility staff mapping to the database.
	*
	* @param id the primary key for the new facility staff mapping
	* @return the new facility staff mapping
	*/
	public static com.pacnet.connect.model.FacilityStaffMapping createFacilityStaffMapping(
		long id) {
		return getService().createFacilityStaffMapping(id);
	}

	/**
	* Deletes the facility staff mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility staff mapping
	* @return the facility staff mapping that was removed
	* @throws PortalException if a facility staff mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityStaffMapping deleteFacilityStaffMapping(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFacilityStaffMapping(id);
	}

	/**
	* Deletes the facility staff mapping from the database. Also notifies the appropriate model listeners.
	*
	* @param facilityStaffMapping the facility staff mapping
	* @return the facility staff mapping that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityStaffMapping deleteFacilityStaffMapping(
		com.pacnet.connect.model.FacilityStaffMapping facilityStaffMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFacilityStaffMapping(facilityStaffMapping);
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

	public static com.pacnet.connect.model.FacilityStaffMapping fetchFacilityStaffMapping(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchFacilityStaffMapping(id);
	}

	/**
	* Returns the facility staff mapping with the primary key.
	*
	* @param id the primary key of the facility staff mapping
	* @return the facility staff mapping
	* @throws PortalException if a facility staff mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityStaffMapping getFacilityStaffMapping(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFacilityStaffMapping(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityStaffMapping> getFacilityStaffMappings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFacilityStaffMappings(start, end);
	}

	/**
	* Returns the number of facility staff mappings.
	*
	* @return the number of facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int getFacilityStaffMappingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFacilityStaffMappingsCount();
	}

	/**
	* Updates the facility staff mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityStaffMapping the facility staff mapping
	* @return the facility staff mapping that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityStaffMapping updateFacilityStaffMapping(
		com.pacnet.connect.model.FacilityStaffMapping facilityStaffMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFacilityStaffMapping(facilityStaffMapping);
	}

	/**
	* Updates the facility staff mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityStaffMapping the facility staff mapping
	* @param merge whether to merge the facility staff mapping with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the facility staff mapping that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityStaffMapping updateFacilityStaffMapping(
		com.pacnet.connect.model.FacilityStaffMapping facilityStaffMapping,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateFacilityStaffMapping(facilityStaffMapping, merge);
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

	public static com.pacnet.connect.model.FacilityStaffMapping createFacilityStaff(
		long faciltyId, long staffUserId, boolean isActive,
		java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return getService()
				   .createFacilityStaff(faciltyId, staffUserId, isActive,
			createdBy, createdOn, updatedBy, updatedOn);
	}

	public static com.pacnet.connect.model.FacilityStaffMapping updateFacilityStaff(
		long id, long faciltyId, long staffUserId, boolean isActive,
		java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return getService()
				   .updateFacilityStaff(id, faciltyId, staffUserId, isActive,
			createdBy, createdOn, updatedBy, updatedOn);
	}

	public static boolean deleteFacilityStaffMappingById(long id) {
		return getService().deleteFacilityStaffMappingById(id);
	}

	public static java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByFacility(
		long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByFacilityStaffByFacility(faciltyId);
	}

	/**
	* Returns a range of all the facility staff mappings where faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility staff mappings
	* @param end the upper bound of the range of facility staff mappings (not inclusive)
	* @return the range of matching facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByFacility(
		long faciltyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByFacilityStaffByFacility(faciltyId, start, end);
	}

	public static java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByStaffUserId(
		long staffUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByFacilityStaffByStaffUserId(staffUserId);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByStaffUserId(
		long staffUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFacilityStaffByStaffUserId(staffUserId, start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByStaffUserId(
		long staffUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFacilityStaffByStaffUserId(staffUserId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first facility staff mapping in the ordered set where staffUserId = &#63;.
	*
	* @param staffUserId the staff user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility staff mapping
	* @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a matching facility staff mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityStaffMapping findByFacilityStaffByStaffUserId_First(
		long staffUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityStaffMappingException {
		return getService()
				   .findByFacilityStaffByStaffUserId_First(staffUserId,
			orderByComparator);
	}

	/**
	* Returns the first facility staff mapping in the ordered set where staffUserId = &#63;.
	*
	* @param staffUserId the staff user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility staff mapping, or <code>null</code> if a matching facility staff mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityStaffMapping fetchByFacilityStaffByStaffUserId_First(
		long staffUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchByFacilityStaffByStaffUserId_First(staffUserId,
			orderByComparator);
	}

	/**
	* Returns the last facility staff mapping in the ordered set where staffUserId = &#63;.
	*
	* @param staffUserId the staff user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility staff mapping
	* @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a matching facility staff mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityStaffMapping findByFacilityStaffByStaffUserId_Last(
		long staffUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityStaffMappingException {
		return getService()
				   .findByFacilityStaffByStaffUserId_Last(staffUserId,
			orderByComparator);
	}

	public static java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll();
	}

	public static void removeByFacilityStaffByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByFacilityStaffByFacility(faciltyId);
	}

	/**
	* Removes all the facility staff mappings where staffUserId = &#63; from the database.
	*
	* @param staffUserId the staff user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityStaffByStaffUserId(long staffUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByFacilityStaffByStaffUserId(staffUserId);
	}

	public static void clearService() {
		_service = null;
	}

	public static FacilityStaffMappingLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					FacilityStaffMappingLocalService.class.getName());

			if (invokableLocalService instanceof FacilityStaffMappingLocalService) {
				_service = (FacilityStaffMappingLocalService)invokableLocalService;
			}
			else {
				_service = new FacilityStaffMappingLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(FacilityStaffMappingLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(FacilityStaffMappingLocalService service) {
	}

	private static FacilityStaffMappingLocalService _service;
}