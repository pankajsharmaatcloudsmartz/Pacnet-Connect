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

import com.pacnet.connect.model.AccessRequestFacilityService;

/**
 * The persistence interface for the access request facility service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestFacilityServicePersistenceImpl
 * @see AccessRequestFacilityServiceUtil
 * @generated
 */
public interface AccessRequestFacilityServicePersistence extends BasePersistence<AccessRequestFacilityService> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccessRequestFacilityServiceUtil} to access the access request facility service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the access request facility service in the entity cache if it is enabled.
	*
	* @param accessRequestFacilityService the access request facility service
	*/
	public void cacheResult(
		com.pacnet.connect.model.AccessRequestFacilityService accessRequestFacilityService);

	/**
	* Caches the access request facility services in the entity cache if it is enabled.
	*
	* @param accessRequestFacilityServices the access request facility services
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> accessRequestFacilityServices);

	/**
	* Creates a new access request facility service with the primary key. Does not add the access request facility service to the database.
	*
	* @param id the primary key for the new access request facility service
	* @return the new access request facility service
	*/
	public com.pacnet.connect.model.AccessRequestFacilityService create(long id);

	/**
	* Removes the access request facility service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access request facility service
	* @return the access request facility service that was removed
	* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a access request facility service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestFacilityService remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException;

	public com.pacnet.connect.model.AccessRequestFacilityService updateImpl(
		com.pacnet.connect.model.AccessRequestFacilityService accessRequestFacilityService,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the access request facility service with the primary key or throws a {@link com.pacnet.connect.NoSuchAccessRequestFacilityServiceException} if it could not be found.
	*
	* @param id the primary key of the access request facility service
	* @return the access request facility service
	* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a access request facility service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestFacilityService findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException;

	/**
	* Returns the access request facility service with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the access request facility service
	* @return the access request facility service, or <code>null</code> if a access request facility service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestFacilityService fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the access request facility services where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the matching access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the access request facility services where accessRequestId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param accessRequestId the access request ID
	* @param start the lower bound of the range of access request facility services
	* @param end the upper bound of the range of access request facility services (not inclusive)
	* @return the range of matching access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the access request facility services where accessRequestId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param accessRequestId the access request ID
	* @param start the lower bound of the range of access request facility services
	* @param end the upper bound of the range of access request facility services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first access request facility service in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request facility service
	* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByAccessRequest_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException;

	/**
	* Returns the first access request facility service in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByAccessRequest_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last access request facility service in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request facility service
	* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByAccessRequest_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException;

	/**
	* Returns the last access request facility service in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByAccessRequest_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the access request facility services before and after the current access request facility service in the ordered set where accessRequestId = &#63;.
	*
	* @param id the primary key of the current access request facility service
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next access request facility service
	* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a access request facility service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestFacilityService[] findByAccessRequestFacilityServiceByAccessRequest_PrevAndNext(
		long id, long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException;

	/**
	* Returns all the access request facility services where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @return the matching access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the access request facility services where facilityServiceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityServiceId the facility service ID
	* @param start the lower bound of the range of access request facility services
	* @param end the upper bound of the range of access request facility services (not inclusive)
	* @return the range of matching access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the access request facility services where facilityServiceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityServiceId the facility service ID
	* @param start the lower bound of the range of access request facility services
	* @param end the upper bound of the range of access request facility services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first access request facility service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request facility service
	* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByFacilityService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException;

	/**
	* Returns the first access request facility service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByFacilityService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last access request facility service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request facility service
	* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByFacilityService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException;

	/**
	* Returns the last access request facility service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByFacilityService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the access request facility services before and after the current access request facility service in the ordered set where facilityServiceId = &#63;.
	*
	* @param id the primary key of the current access request facility service
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next access request facility service
	* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a access request facility service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.AccessRequestFacilityService[] findByAccessRequestFacilityServiceByFacilityService_PrevAndNext(
		long id, long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException;

	/**
	* Returns all the access request facility services.
	*
	* @return the access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the access request facility services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access request facility services
	* @param end the upper bound of the range of access request facility services (not inclusive)
	* @return the range of access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the access request facility services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access request facility services
	* @param end the upper bound of the range of access request facility services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the access request facility services where accessRequestId = &#63; from the database.
	*
	* @param accessRequestId the access request ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the access request facility services where facilityServiceId = &#63; from the database.
	*
	* @param facilityServiceId the facility service ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the access request facility services from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of access request facility services where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the number of matching access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public int countByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of access request facility services where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @return the number of matching access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public int countByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of access request facility services.
	*
	* @return the number of access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}