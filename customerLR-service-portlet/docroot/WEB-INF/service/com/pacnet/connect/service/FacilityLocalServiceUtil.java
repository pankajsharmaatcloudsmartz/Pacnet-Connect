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
 * The utility for the facility local service. This utility wraps {@link com.pacnet.connect.service.impl.FacilityLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityLocalService
 * @see com.pacnet.connect.service.base.FacilityLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.FacilityLocalServiceImpl
 * @generated
 */
public class FacilityLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.FacilityLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the facility to the database. Also notifies the appropriate model listeners.
	*
	* @param facility the facility
	* @return the facility that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.Facility addFacility(
		com.pacnet.connect.model.Facility facility)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addFacility(facility);
	}

	/**
	* Creates a new facility with the primary key. Does not add the facility to the database.
	*
	* @param id the primary key for the new facility
	* @return the new facility
	*/
	public static com.pacnet.connect.model.Facility createFacility(long id) {
		return getService().createFacility(id);
	}

	/**
	* Deletes the facility with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility
	* @return the facility that was removed
	* @throws PortalException if a facility with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.Facility deleteFacility(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFacility(id);
	}

	/**
	* Deletes the facility from the database. Also notifies the appropriate model listeners.
	*
	* @param facility the facility
	* @return the facility that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.Facility deleteFacility(
		com.pacnet.connect.model.Facility facility)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFacility(facility);
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

	public static com.pacnet.connect.model.Facility fetchFacility(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchFacility(id);
	}

	/**
	* Returns the facility with the primary key.
	*
	* @param id the primary key of the facility
	* @return the facility
	* @throws PortalException if a facility with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.Facility getFacility(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFacility(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

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
	public static java.util.List<com.pacnet.connect.model.Facility> getFacilities(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFacilities(start, end);
	}

	/**
	* Returns the number of facilities.
	*
	* @return the number of facilities
	* @throws SystemException if a system exception occurred
	*/
	public static int getFacilitiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFacilitiesCount();
	}

	/**
	* Updates the facility in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facility the facility
	* @return the facility that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.Facility updateFacility(
		com.pacnet.connect.model.Facility facility)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFacility(facility);
	}

	/**
	* Updates the facility in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facility the facility
	* @param merge whether to merge the facility with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the facility that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.Facility updateFacility(
		com.pacnet.connect.model.Facility facility, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFacility(facility, merge);
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

	public static com.pacnet.connect.model.Facility createFacility(
		java.lang.String facilityName, java.lang.String address,
		java.lang.String phoneNumber, java.lang.String city, long stateId,
		long countryId, int isThirdParty, java.lang.String escalationEmail,
		boolean isActive, java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn,
		java.lang.String timezone) {
		return getService()
				   .createFacility(facilityName, address, phoneNumber, city,
			stateId, countryId, isThirdParty, escalationEmail, isActive,
			createdBy, createdOn, updatedBy, updatedOn, timezone);
	}

	public static com.pacnet.connect.model.Facility updateFacility(long id,
		java.lang.String facilityName, java.lang.String address,
		java.lang.String phoneNumber, java.lang.String city, long stateId,
		long countryId, int isThirdParty, java.lang.String escalationEmail,
		boolean isActive, java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn,
		java.lang.String timezone) {
		return getService()
				   .updateFacility(id, facilityName, address, phoneNumber,
			city, stateId, countryId, isThirdParty, escalationEmail, isActive,
			createdBy, createdOn, updatedBy, updatedOn, timezone);
	}

	public static boolean deleteFacilityById(long id) {
		return getService().deleteFacilityById(id);
	}

	public static java.util.List<com.pacnet.connect.model.Facility> findByFacilityName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFacilityName(name, start, end, orderByComparator);
	}

	public static java.util.List<com.pacnet.connect.model.Facility> getAllThirdPartyFacility() {
		return getService().getAllThirdPartyFacility();
	}

	/**
	* Returns the first facility in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility
	* @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.Facility findByFacilityName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityException {
		return getService().findByFacilityName_First(name, orderByComparator);
	}

	/**
	* Returns the first facility in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility, or <code>null</code> if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.Facility fetchByFacilityName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchByFacilityName_First(name, orderByComparator);
	}

	/**
	* Returns the last facility in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility
	* @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.Facility findByFacilityName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityException {
		return getService().findByFacilityName_Last(name, orderByComparator);
	}

	/**
	* Returns the last facility in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility, or <code>null</code> if a matching facility could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.Facility fetchByFacilityName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchByFacilityName_Last(name, orderByComparator);
	}

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
	public static com.pacnet.connect.model.Facility[] findByFacilityName_PrevAndNext(
		long id, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityException {
		return getService()
				   .findByFacilityName_PrevAndNext(id, name, orderByComparator);
	}

	public static java.util.List<com.pacnet.connect.model.Facility> findByFacilityByCountryId(
		long countryId) {
		return getService().findByFacilityByCountryId(countryId);
	}

	public static java.util.List<com.pacnet.connect.model.Facility> findByFacilityByManagerId(
		long managerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByFacilityByManagerId(managerId);
	}

	public static java.util.List<com.pacnet.connect.model.Facility> findByFacilityByManagerId(
		long managerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByFacilityByManagerId(managerId, start, end);
	}

	public static java.util.List<com.pacnet.connect.model.Facility> findByFacilityByManagerId(
		long managerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFacilityByManagerId(managerId, start, end,
			orderByComparator);
	}

	public static void clearService() {
		_service = null;
	}

	public static FacilityLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					FacilityLocalService.class.getName());

			if (invokableLocalService instanceof FacilityLocalService) {
				_service = (FacilityLocalService)invokableLocalService;
			}
			else {
				_service = new FacilityLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(FacilityLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(FacilityLocalService service) {
	}

	private static FacilityLocalService _service;
}