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

import com.pacnet.connect.model.AccessRequest;

import java.util.List;

/**
 * The persistence utility for the access request service. This utility wraps {@link AccessRequestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestPersistence
 * @see AccessRequestPersistenceImpl
 * @generated
 */
public class AccessRequestUtil {
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
	public static void clearCache(AccessRequest accessRequest) {
		getPersistence().clearCache(accessRequest);
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
	public static List<AccessRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccessRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccessRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static AccessRequest update(AccessRequest accessRequest,
		boolean merge) throws SystemException {
		return getPersistence().update(accessRequest, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static AccessRequest update(AccessRequest accessRequest,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(accessRequest, merge, serviceContext);
	}

	/**
	* Caches the access request in the entity cache if it is enabled.
	*
	* @param accessRequest the access request
	*/
	public static void cacheResult(
		com.pacnet.connect.model.AccessRequest accessRequest) {
		getPersistence().cacheResult(accessRequest);
	}

	/**
	* Caches the access requests in the entity cache if it is enabled.
	*
	* @param accessRequests the access requests
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.AccessRequest> accessRequests) {
		getPersistence().cacheResult(accessRequests);
	}

	/**
	* Creates a new access request with the primary key. Does not add the access request to the database.
	*
	* @param id the primary key for the new access request
	* @return the new access request
	*/
	public static com.pacnet.connect.model.AccessRequest create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the access request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access request
	* @return the access request that was removed
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a access request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.AccessRequest updateImpl(
		com.pacnet.connect.model.AccessRequest accessRequest, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(accessRequest, merge);
	}

	/**
	* Returns the access request with the primary key or throws a {@link com.pacnet.connect.NoSuchAccessRequestException} if it could not be found.
	*
	* @param id the primary key of the access request
	* @return the access request
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a access request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the access request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the access request
	* @return the access request, or <code>null</code> if a access request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the access requests where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @return the matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByFacility(
		long facilityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAccessRequestByFacility(facilityId);
	}

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
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByFacility(
		long facilityId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessRequestByFacility(facilityId, start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByFacility(
		long facilityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessRequestByFacility(facilityId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first access request in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest findByAccessRequestByFacility_First(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException {
		return getPersistence()
				   .findByAccessRequestByFacility_First(facilityId,
			orderByComparator);
	}

	/**
	* Returns the first access request in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request, or <code>null</code> if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest fetchByAccessRequestByFacility_First(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestByFacility_First(facilityId,
			orderByComparator);
	}

	/**
	* Returns the last access request in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest findByAccessRequestByFacility_Last(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException {
		return getPersistence()
				   .findByAccessRequestByFacility_Last(facilityId,
			orderByComparator);
	}

	/**
	* Returns the last access request in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request, or <code>null</code> if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest fetchByAccessRequestByFacility_Last(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestByFacility_Last(facilityId,
			orderByComparator);
	}

	/**
	* Returns the access requests before and after the current access request in the ordered set where facilityId = &#63;.
	*
	* @param id the primary key of the current access request
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next access request
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a access request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest[] findByAccessRequestByFacility_PrevAndNext(
		long id, long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException {
		return getPersistence()
				   .findByAccessRequestByFacility_PrevAndNext(id, facilityId,
			orderByComparator);
	}

	/**
	* Returns all the access requests where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByCustomer(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAccessRequestByCustomer(customerId);
	}

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
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByCustomer(
		long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessRequestByCustomer(customerId, start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByCustomer(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessRequestByCustomer(customerId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first access request in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest findByAccessRequestByCustomer_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException {
		return getPersistence()
				   .findByAccessRequestByCustomer_First(customerId,
			orderByComparator);
	}

	/**
	* Returns the first access request in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request, or <code>null</code> if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest fetchByAccessRequestByCustomer_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestByCustomer_First(customerId,
			orderByComparator);
	}

	/**
	* Returns the last access request in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest findByAccessRequestByCustomer_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException {
		return getPersistence()
				   .findByAccessRequestByCustomer_Last(customerId,
			orderByComparator);
	}

	/**
	* Returns the last access request in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request, or <code>null</code> if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest fetchByAccessRequestByCustomer_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestByCustomer_Last(customerId,
			orderByComparator);
	}

	/**
	* Returns the access requests before and after the current access request in the ordered set where customerId = &#63;.
	*
	* @param id the primary key of the current access request
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next access request
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a access request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest[] findByAccessRequestByCustomer_PrevAndNext(
		long id, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException {
		return getPersistence()
				   .findByAccessRequestByCustomer_PrevAndNext(id, customerId,
			orderByComparator);
	}

	/**
	* Returns all the access requests where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @return the matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByVisitor(
		long visitorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAccessRequestByVisitor(visitorId);
	}

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
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByVisitor(
		long visitorId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessRequestByVisitor(visitorId, start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findByAccessRequestByVisitor(
		long visitorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAccessRequestByVisitor(visitorId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first access request in the ordered set where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest findByAccessRequestByVisitor_First(
		long visitorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException {
		return getPersistence()
				   .findByAccessRequestByVisitor_First(visitorId,
			orderByComparator);
	}

	/**
	* Returns the first access request in the ordered set where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access request, or <code>null</code> if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest fetchByAccessRequestByVisitor_First(
		long visitorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestByVisitor_First(visitorId,
			orderByComparator);
	}

	/**
	* Returns the last access request in the ordered set where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request
	* @throws com.pacnet.connect.NoSuchAccessRequestException if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest findByAccessRequestByVisitor_Last(
		long visitorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException {
		return getPersistence()
				   .findByAccessRequestByVisitor_Last(visitorId,
			orderByComparator);
	}

	/**
	* Returns the last access request in the ordered set where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access request, or <code>null</code> if a matching access request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequest fetchByAccessRequestByVisitor_Last(
		long visitorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAccessRequestByVisitor_Last(visitorId,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.AccessRequest[] findByAccessRequestByVisitor_PrevAndNext(
		long id, long visitorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestException {
		return getPersistence()
				   .findByAccessRequestByVisitor_PrevAndNext(id, visitorId,
			orderByComparator);
	}

	/**
	* Returns all the access requests.
	*
	* @return the access requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the access requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access requests
	* @param end the upper bound of the range of access requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of access requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the access requests where facilityId = &#63; from the database.
	*
	* @param facilityId the facility ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAccessRequestByFacility(long facilityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAccessRequestByFacility(facilityId);
	}

	/**
	* Removes all the access requests where customerId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAccessRequestByCustomer(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAccessRequestByCustomer(customerId);
	}

	/**
	* Removes all the access requests where visitorId = &#63; from the database.
	*
	* @param visitorId the visitor ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAccessRequestByVisitor(long visitorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAccessRequestByVisitor(visitorId);
	}

	/**
	* Removes all the access requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of access requests where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @return the number of matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAccessRequestByFacility(long facilityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAccessRequestByFacility(facilityId);
	}

	/**
	* Returns the number of access requests where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the number of matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAccessRequestByCustomer(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAccessRequestByCustomer(customerId);
	}

	/**
	* Returns the number of access requests where visitorId = &#63;.
	*
	* @param visitorId the visitor ID
	* @return the number of matching access requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAccessRequestByVisitor(long visitorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAccessRequestByVisitor(visitorId);
	}

	/**
	* Returns the number of access requests.
	*
	* @return the number of access requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AccessRequestPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AccessRequestPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					AccessRequestPersistence.class.getName());

			ReferenceRegistry.registerReference(AccessRequestUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(AccessRequestPersistence persistence) {
	}

	private static AccessRequestPersistence _persistence;
}