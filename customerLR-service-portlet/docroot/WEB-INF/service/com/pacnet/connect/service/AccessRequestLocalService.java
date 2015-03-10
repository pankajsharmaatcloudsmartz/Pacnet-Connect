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
 * The interface for the access request local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestLocalServiceUtil
 * @see com.pacnet.connect.service.base.AccessRequestLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.AccessRequestLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AccessRequestLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccessRequestLocalServiceUtil} to access the access request local service. Add custom service methods to {@link com.pacnet.connect.service.impl.AccessRequestLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the access request to the database. Also notifies the appropriate model listeners.
	*
	* @param accessRequest the access request
	* @return the access request that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequest addAccessRequest(
		com.pacnet.connect.model.AccessRequest accessRequest)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new access request with the primary key. Does not add the access request to the database.
	*
	* @param id the primary key for the new access request
	* @return the new access request
	*/
	public com.pacnet.connect.model.AccessRequest createAccessRequest(long id);

	/**
	* Deletes the access request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access request
	* @return the access request that was removed
	* @throws PortalException if a access request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequest deleteAccessRequest(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the access request from the database. Also notifies the appropriate model listeners.
	*
	* @param accessRequest the access request
	* @return the access request that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequest deleteAccessRequest(
		com.pacnet.connect.model.AccessRequest accessRequest)
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
	public com.pacnet.connect.model.AccessRequest fetchAccessRequest(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the access request with the primary key.
	*
	* @param id the primary key of the access request
	* @return the access request
	* @throws PortalException if a access request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.AccessRequest getAccessRequest(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the access requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access requests
	* @param end the upper bound of the range of access requests (not inclusive)
	* @return the range of access requests
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.pacnet.connect.model.AccessRequest> getAccessRequests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of access requests.
	*
	* @return the number of access requests
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getAccessRequestsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the access request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accessRequest the access request
	* @return the access request that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequest updateAccessRequest(
		com.pacnet.connect.model.AccessRequest accessRequest)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the access request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accessRequest the access request
	* @param merge whether to merge the access request with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the access request that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequest updateAccessRequest(
		com.pacnet.connect.model.AccessRequest accessRequest, boolean merge)
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

	public com.pacnet.connect.model.AccessRequest createAccessRequest(
		long facilityId, long customerId, long visitorId,
		java.sql.Date dateOfVisit, java.sql.Date dateOfVisitGmt,
		java.sql.Date dateOfTimeOutGmt, long tentativeTimeIn,
		long tentativeTimeOut, java.lang.String note, boolean oneTimeAccess,
		long accessRequestStatusId, boolean isExternalVisitor,
		boolean isActive, java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn);

	public com.pacnet.connect.model.AccessRequest updateAccessRequest(long id,
		long facilityId, long customerId, long visitorId,
		java.sql.Date dateOfVisit, java.sql.Date dateOfVisitGmt,
		java.sql.Date dateOfTimeOutGmt, long tentativeTimeIn,
		long tentativeTimeOut, java.lang.String note, boolean oneTimeAccess,
		long accessRequestStatusId, boolean isExternalVisitor,
		boolean isActive, java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn);

	public boolean deleteFacilityById(long id);

	public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByFacility(
		long facilityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the access requests where facilityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityId the facility ID
	* @param start the lower bound of the range of access requests
	* @param end the upper bound of the range of access requests (not inclusive)
	* @return the range of matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByFacility(
		long facilityId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the access requests where facilityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityId the facility ID
	* @param start the lower bound of the range of access requests
	* @param end the upper bound of the range of access requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByFacility(
		long facilityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the access requests where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByCustomer(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the access requests where customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param start the lower bound of the range of access requests
	* @param end the upper bound of the range of access requests (not inclusive)
	* @return the range of matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByCustomer(
		long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the access requests where customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param start the lower bound of the range of access requests
	* @param end the upper bound of the range of access requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByCustomer(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the access requests where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @return the matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByVisitor(
		long visitorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the access requests where visitorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param visitorId the visitor ID
	* @param start the lower bound of the range of access requests
	* @param end the upper bound of the range of access requests (not inclusive)
	* @return the range of matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByVisitor(
		long visitorId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the access requests where visitorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param visitorId the visitor ID
	* @param start the lower bound of the range of access requests
	* @param end the upper bound of the range of access requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByVisitor(
		long visitorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first access request in the ordered set where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequest findByAccessRequestByVisitor_First(
		long visitorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException;

	/**
	* Returns the first access request in the ordered set where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request, or <code>null</code> if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.AccessRequest fetchByAccessRequestByVisitor_First(
		long visitorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last access request in the ordered set where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequest findByAccessRequestByVisitor_Last(
		long visitorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException;

	/**
	* Returns the last access request in the ordered set where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request, or <code>null</code> if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.AccessRequest fetchByAccessRequestByVisitor_Last(
		long visitorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the access requests before and after the current access request in the ordered set where visitorId = &#63;.
	*
	* @param id the primary key of the current access request
	* @param visitorId the visitor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next access request
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a access request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequest[] findByAccessRequestByVisitor_PrevAndNext(
		long id, long visitorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException;
}