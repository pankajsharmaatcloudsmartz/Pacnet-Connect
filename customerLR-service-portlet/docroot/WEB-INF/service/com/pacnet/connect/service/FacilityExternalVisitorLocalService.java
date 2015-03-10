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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the facility external visitor local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityExternalVisitorLocalServiceUtil
 * @see com.pacnet.connect.service.base.FacilityExternalVisitorLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.FacilityExternalVisitorLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface FacilityExternalVisitorLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FacilityExternalVisitorLocalServiceUtil} to access the facility external visitor local service. Add custom service methods to {@link com.pacnet.connect.service.impl.FacilityExternalVisitorLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the facility external visitor to the database. Also notifies the appropriate model listeners.
	*
	* @param facilityExternalVisitor the facility external visitor
	* @return the facility external visitor that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor addFacilityExternalVisitor(
		com.pacnet.connect.model.FacilityExternalVisitor facilityExternalVisitor)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new facility external visitor with the primary key. Does not add the facility external visitor to the database.
	*
	* @param id the primary key for the new facility external visitor
	* @return the new facility external visitor
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor createFacilityExternalVisitor(
		long id);

	/**
	* Deletes the facility external visitor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility external visitor
	* @return the facility external visitor that was removed
	* @throws PortalException if a facility external visitor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor deleteFacilityExternalVisitor(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the facility external visitor from the database. Also notifies the appropriate model listeners.
	*
	* @param facilityExternalVisitor the facility external visitor
	* @return the facility external visitor that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor deleteFacilityExternalVisitor(
		com.pacnet.connect.model.FacilityExternalVisitor facilityExternalVisitor)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.FacilityExternalVisitor fetchFacilityExternalVisitor(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility external visitor with the primary key.
	*
	* @param id the primary key of the facility external visitor
	* @return the facility external visitor
	* @throws PortalException if a facility external visitor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.FacilityExternalVisitor getFacilityExternalVisitor(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility external visitors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility external visitors
	* @param end the upper bound of the range of facility external visitors (not inclusive)
	* @return the range of facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> getFacilityExternalVisitors(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility external visitors.
	*
	* @return the number of facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFacilityExternalVisitorsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the facility external visitor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityExternalVisitor the facility external visitor
	* @return the facility external visitor that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor updateFacilityExternalVisitor(
		com.pacnet.connect.model.FacilityExternalVisitor facilityExternalVisitor)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the facility external visitor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityExternalVisitor the facility external visitor
	* @param merge whether to merge the facility external visitor with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the facility external visitor that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor updateFacilityExternalVisitor(
		com.pacnet.connect.model.FacilityExternalVisitor facilityExternalVisitor,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public com.pacnet.connect.model.FacilityExternalVisitor createFacilityExternalVisitor(
		long faciltyId, long accessRequestId, java.lang.String name,
		java.lang.String mobileNumber, java.lang.String email,
		java.lang.String address, java.lang.String companyName,
		java.lang.String documentId, java.lang.String documentType,
		java.lang.String remarks, boolean isActive, java.lang.String createdBy,
		java.sql.Date createdOn, java.lang.String updatedBy,
		java.sql.Date updatedOn);

	public com.pacnet.connect.model.FacilityExternalVisitor updateFacilityExternalVisitor(
		long id, long faciltyId, long accessRequestId, java.lang.String name,
		java.lang.String mobileNumber, java.lang.String email,
		java.lang.String address, java.lang.String companyName,
		java.lang.String documentId, java.lang.String documentType,
		java.lang.String remarks, boolean isActive, java.lang.String createdBy,
		java.sql.Date createdOn, java.lang.String updatedBy,
		java.sql.Date updatedOn);

	public boolean deleteFacilityExternalVisitorId(long id);

	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByFacility(
		long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility external visitors where faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility external visitors
	* @param end the upper bound of the range of facility external visitors (not inclusive)
	* @return the range of matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByFacility(
		long faciltyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility external visitors where faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility external visitors
	* @param end the upper bound of the range of facility external visitors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByFacility(
		long faciltyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility external visitors where accessRequestId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param accessRequestId the access request ID
	* @param start the lower bound of the range of facility external visitors
	* @param end the upper bound of the range of facility external visitors (not inclusive)
	* @return the range of matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByAccessRequest(
		long accessRequestId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility external visitors where accessRequestId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param accessRequestId the access request ID
	* @param start the lower bound of the range of facility external visitors
	* @param end the upper bound of the range of facility external visitors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByAccessRequest(
		long accessRequestId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility external visitors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility external visitors
	* @param end the upper bound of the range of facility external visitors (not inclusive)
	* @return the range of facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByFacilityExternalVisitorByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility external visitors where accessRequestId = &#63; from the database.
	*
	* @param accessRequestId the access request ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityExternalVisitorByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException;
}