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

import com.pacnet.connect.model.AccessRequestFacilityService;

import java.util.List;

/**
 * The persistence utility for the access request facility service service. This utility wraps {@link AccessRequestFacilityServicePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestFacilityServicePersistence
 * @see AccessRequestFacilityServicePersistenceImpl
 * @generated
 */
public class AccessRequestFacilityServiceUtil {
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
	public static void clearCache(
		AccessRequestFacilityService accessRequestFacilityService) {
		getPersistence().clearCache(accessRequestFacilityService);
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
	public static List<AccessRequestFacilityService> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccessRequestFacilityService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccessRequestFacilityService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static AccessRequestFacilityService update(
		AccessRequestFacilityService accessRequestFacilityService, boolean merge)
		throws SystemException {
		return getPersistence().update(accessRequestFacilityService, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static AccessRequestFacilityService update(
		AccessRequestFacilityService accessRequestFacilityService,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(accessRequestFacilityService, merge, serviceContext);
	}

	/**
	* Caches the access request facility service in the entity cache if it is enabled.
	*
	* @param accessRequestFacilityService the access request facility service
	*/
	public static void cacheResult(
		com.pacnet.connect.model.AccessRequestFacilityService accessRequestFacilityService) {
		getPersistence().cacheResult(accessRequestFacilityService);
	}

	/**
	* Caches the access request facility services in the entity cache if it is enabled.
	*
	* @param accessRequestFacilityServices the access request facility services
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> accessRequestFacilityServices) {
		getPersistence().cacheResult(accessRequestFacilityServices);
	}

	/**
	* Creates a new access request facility service with the primary key. Does not add the access request facility service to the database.
	*
	* @param id the primary key for the new access request facility service
	* @return the new access request facility service
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the access request facility service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access request facility service
	* @return the access request facility service that was removed
	* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a access request facility service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.AccessRequestFacilityService updateImpl(
		com.pacnet.connect.model.AccessRequestFacilityService accessRequestFacilityService,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(accessRequestFacilityService, merge);
	}

	/**
	* Returns the access request facility service with the primary key or throws a {@link com.pacnet.connect.NoSuchAccessRequestFacilityServiceException} if it could not be found.
	*
	* @param id the primary key of the access request facility service
	* @return the access request facility service
	* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a access request facility service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the access request facility service with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the access request facility service
	* @return the access request facility service, or <code>null</code> if a access request facility service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the access request facility services where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the matching access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessRequestFacilityServiceByAccessRequest(accessRequestId);
	}

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
	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessRequestFacilityServiceByAccessRequest(accessRequestId,
			start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessRequestFacilityServiceByAccessRequest(accessRequestId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first access request facility service in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request facility service
	* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByAccessRequest_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
		return getPersistence()
				   .findByAccessRequestFacilityServiceByAccessRequest_First(accessRequestId,
			orderByComparator);
	}

	/**
	* Returns the first access request facility service in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByAccessRequest_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestFacilityServiceByAccessRequest_First(accessRequestId,
			orderByComparator);
	}

	/**
	* Returns the last access request facility service in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request facility service
	* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByAccessRequest_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
		return getPersistence()
				   .findByAccessRequestFacilityServiceByAccessRequest_Last(accessRequestId,
			orderByComparator);
	}

	/**
	* Returns the last access request facility service in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByAccessRequest_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestFacilityServiceByAccessRequest_Last(accessRequestId,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.AccessRequestFacilityService[] findByAccessRequestFacilityServiceByAccessRequest_PrevAndNext(
		long id, long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
		return getPersistence()
				   .findByAccessRequestFacilityServiceByAccessRequest_PrevAndNext(id,
			accessRequestId, orderByComparator);
	}

	/**
	* Returns all the access request facility services where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @return the matching access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessRequestFacilityServiceByFacilityService(facilityServiceId);
	}

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
	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessRequestFacilityServiceByFacilityService(facilityServiceId,
			start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessRequestFacilityServiceByFacilityService(facilityServiceId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first access request facility service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request facility service
	* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByFacilityService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
		return getPersistence()
				   .findByAccessRequestFacilityServiceByFacilityService_First(facilityServiceId,
			orderByComparator);
	}

	/**
	* Returns the first access request facility service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByFacilityService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestFacilityServiceByFacilityService_First(facilityServiceId,
			orderByComparator);
	}

	/**
	* Returns the last access request facility service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request facility service
	* @throws com.pacnet.connect.NoSuchAccessRequestFacilityServiceException if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService findByAccessRequestFacilityServiceByFacilityService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
		return getPersistence()
				   .findByAccessRequestFacilityServiceByFacilityService_Last(facilityServiceId,
			orderByComparator);
	}

	/**
	* Returns the last access request facility service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request facility service, or <code>null</code> if a matching access request facility service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestFacilityService fetchByAccessRequestFacilityServiceByFacilityService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestFacilityServiceByFacilityService_Last(facilityServiceId,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.AccessRequestFacilityService[] findByAccessRequestFacilityServiceByFacilityService_PrevAndNext(
		long id, long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestFacilityServiceException {
		return getPersistence()
				   .findByAccessRequestFacilityServiceByFacilityService_PrevAndNext(id,
			facilityServiceId, orderByComparator);
	}

	/**
	* Returns all the access request facility services.
	*
	* @return the access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.AccessRequestFacilityService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the access request facility services where accessRequestId = &#63; from the database.
	*
	* @param accessRequestId the access request ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByAccessRequestFacilityServiceByAccessRequest(accessRequestId);
	}

	/**
	* Removes all the access request facility services where facilityServiceId = &#63; from the database.
	*
	* @param facilityServiceId the facility service ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByAccessRequestFacilityServiceByFacilityService(facilityServiceId);
	}

	/**
	* Removes all the access request facility services from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of access request facility services where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the number of matching access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAccessRequestFacilityServiceByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByAccessRequestFacilityServiceByAccessRequest(accessRequestId);
	}

	/**
	* Returns the number of access request facility services where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @return the number of matching access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAccessRequestFacilityServiceByFacilityService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByAccessRequestFacilityServiceByFacilityService(facilityServiceId);
	}

	/**
	* Returns the number of access request facility services.
	*
	* @return the number of access request facility services
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AccessRequestFacilityServicePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AccessRequestFacilityServicePersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					AccessRequestFacilityServicePersistence.class.getName());

			ReferenceRegistry.registerReference(AccessRequestFacilityServiceUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		AccessRequestFacilityServicePersistence persistence) {
	}

	private static AccessRequestFacilityServicePersistence _persistence;
}