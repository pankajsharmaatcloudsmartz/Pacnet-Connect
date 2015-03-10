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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link FacilityAccessLocalService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       FacilityAccessLocalService
 * @generated
 */
public class FacilityAccessLocalServiceWrapper
	implements FacilityAccessLocalService,
		ServiceWrapper<FacilityAccessLocalService> {
	public FacilityAccessLocalServiceWrapper(
		FacilityAccessLocalService facilityAccessLocalService) {
		_facilityAccessLocalService = facilityAccessLocalService;
	}

	/**
	* Adds the facility access to the database. Also notifies the appropriate model listeners.
	*
	* @param facilityAccess the facility access
	* @return the facility access that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess addFacilityAccess(
		com.pacnet.connect.model.FacilityAccess facilityAccess)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.addFacilityAccess(facilityAccess);
	}

	/**
	* Creates a new facility access with the primary key. Does not add the facility access to the database.
	*
	* @param id the primary key for the new facility access
	* @return the new facility access
	*/
	public com.pacnet.connect.model.FacilityAccess createFacilityAccess(long id) {
		return _facilityAccessLocalService.createFacilityAccess(id);
	}

	/**
	* Deletes the facility access with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility access
	* @return the facility access that was removed
	* @throws PortalException if a facility access with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess deleteFacilityAccess(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.deleteFacilityAccess(id);
	}

	/**
	* Deletes the facility access from the database. Also notifies the appropriate model listeners.
	*
	* @param facilityAccess the facility access
	* @return the facility access that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess deleteFacilityAccess(
		com.pacnet.connect.model.FacilityAccess facilityAccess)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.deleteFacilityAccess(facilityAccess);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _facilityAccessLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.pacnet.connect.model.FacilityAccess fetchFacilityAccess(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.fetchFacilityAccess(id);
	}

	/**
	* Returns the facility access with the primary key.
	*
	* @param id the primary key of the facility access
	* @return the facility access
	* @throws PortalException if a facility access with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess getFacilityAccess(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.getFacilityAccess(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the facility accesses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility accesses
	* @param end the upper bound of the range of facility accesses (not inclusive)
	* @return the range of facility accesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAccess> getFacilityAccesses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.getFacilityAccesses(start, end);
	}

	/**
	* Returns the number of facility accesses.
	*
	* @return the number of facility accesses
	* @throws SystemException if a system exception occurred
	*/
	public int getFacilityAccessesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.getFacilityAccessesCount();
	}

	/**
	* Updates the facility access in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityAccess the facility access
	* @return the facility access that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess updateFacilityAccess(
		com.pacnet.connect.model.FacilityAccess facilityAccess)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.updateFacilityAccess(facilityAccess);
	}

	/**
	* Updates the facility access in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityAccess the facility access
	* @param merge whether to merge the facility access with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the facility access that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess updateFacilityAccess(
		com.pacnet.connect.model.FacilityAccess facilityAccess, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.updateFacilityAccess(facilityAccess,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _facilityAccessLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_facilityAccessLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _facilityAccessLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public com.pacnet.connect.model.FacilityAccess createFacilityAccess(
		java.lang.String name, boolean isActive, java.lang.String createdBy,
		java.sql.Date createdOn, java.lang.String updatedBy,
		java.sql.Date updatedOn) {
		return _facilityAccessLocalService.createFacilityAccess(name, isActive,
			createdBy, createdOn, updatedBy, updatedOn);
	}

	public com.pacnet.connect.model.FacilityAccess updateFacilityAccess(
		long id, java.lang.String name, boolean isActive,
		java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return _facilityAccessLocalService.updateFacilityAccess(id, name,
			isActive, createdBy, createdOn, updatedBy, updatedOn);
	}

	public boolean deleteFacilityById(long id) {
		return _facilityAccessLocalService.deleteFacilityById(id);
	}

	/**
	* Returns all the facility accesses where name = &#63;.
	*
	* @param name the name
	* @return the matching facility accesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAccess> findByFacilityServiceName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.findByFacilityServiceName(name);
	}

	/**
	* Returns a range of all the facility accesses where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of facility accesses
	* @param end the upper bound of the range of facility accesses (not inclusive)
	* @return the range of matching facility accesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAccess> findByFacilityServiceName(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.findByFacilityServiceName(name,
			start, end);
	}

	/**
	* Returns an ordered range of all the facility accesses where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of facility accesses
	* @param end the upper bound of the range of facility accesses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility accesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAccess> findByFacilityServiceName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.findByFacilityServiceName(name,
			start, end, orderByComparator);
	}

	/**
	* Returns the first facility access in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility access
	* @throws com.pacnet.connect.NoSuchFacilityAccessException if a matching facility access could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess findByFacilityServiceName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAccessException {
		return _facilityAccessLocalService.findByFacilityServiceName_First(name,
			orderByComparator);
	}

	/**
	* Returns the first facility access in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility access, or <code>null</code> if a matching facility access could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess fetchByFacilityServiceName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.fetchByFacilityServiceName_First(name,
			orderByComparator);
	}

	/**
	* Returns the last facility access in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility access
	* @throws com.pacnet.connect.NoSuchFacilityAccessException if a matching facility access could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess findByFacilityServiceName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAccessException {
		return _facilityAccessLocalService.findByFacilityServiceName_Last(name,
			orderByComparator);
	}

	/**
	* Returns the last facility access in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility access, or <code>null</code> if a matching facility access could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess fetchByFacilityServiceName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityAccessLocalService.fetchByFacilityServiceName_Last(name,
			orderByComparator);
	}

	/**
	* Returns the facility accesses before and after the current facility access in the ordered set where name = &#63;.
	*
	* @param id the primary key of the current facility access
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility access
	* @throws com.pacnet.connect.NoSuchFacilityAccessException if a facility access with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess[] findByFacilityServiceName_PrevAndNext(
		long id, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAccessException {
		return _facilityAccessLocalService.findByFacilityServiceName_PrevAndNext(id,
			name, orderByComparator);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public FacilityAccessLocalService getWrappedFacilityAccessLocalService() {
		return _facilityAccessLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedFacilityAccessLocalService(
		FacilityAccessLocalService facilityAccessLocalService) {
		_facilityAccessLocalService = facilityAccessLocalService;
	}

	public FacilityAccessLocalService getWrappedService() {
		return _facilityAccessLocalService;
	}

	public void setWrappedService(
		FacilityAccessLocalService facilityAccessLocalService) {
		_facilityAccessLocalService = facilityAccessLocalService;
	}

	private FacilityAccessLocalService _facilityAccessLocalService;
}