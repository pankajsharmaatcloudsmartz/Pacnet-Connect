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

import com.pacnet.connect.model.FacilityUserService;

import java.util.List;

/**
 * The persistence utility for the facility user service service. This utility wraps {@link FacilityUserServicePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityUserServicePersistence
 * @see FacilityUserServicePersistenceImpl
 * @generated
 */
public class FacilityUserServiceUtil {
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
	public static void clearCache(FacilityUserService facilityUserService) {
		getPersistence().clearCache(facilityUserService);
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
	public static List<FacilityUserService> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FacilityUserService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FacilityUserService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static FacilityUserService update(
		FacilityUserService facilityUserService, boolean merge)
		throws SystemException {
		return getPersistence().update(facilityUserService, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static FacilityUserService update(
		FacilityUserService facilityUserService, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(facilityUserService, merge, serviceContext);
	}

	/**
	* Caches the facility user service in the entity cache if it is enabled.
	*
	* @param facilityUserService the facility user service
	*/
	public static void cacheResult(
		com.pacnet.connect.model.FacilityUserService facilityUserService) {
		getPersistence().cacheResult(facilityUserService);
	}

	/**
	* Caches the facility user services in the entity cache if it is enabled.
	*
	* @param facilityUserServices the facility user services
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.FacilityUserService> facilityUserServices) {
		getPersistence().cacheResult(facilityUserServices);
	}

	/**
	* Creates a new facility user service with the primary key. Does not add the facility user service to the database.
	*
	* @param id the primary key for the new facility user service
	* @return the new facility user service
	*/
	public static com.pacnet.connect.model.FacilityUserService create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the facility user service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility user service
	* @return the facility user service that was removed
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a facility user service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.FacilityUserService updateImpl(
		com.pacnet.connect.model.FacilityUserService facilityUserService,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(facilityUserService, merge);
	}

	/**
	* Returns the facility user service with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityUserServiceException} if it could not be found.
	*
	* @param id the primary key of the facility user service
	* @return the facility user service
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a facility user service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the facility user service with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the facility user service
	* @return the facility user service, or <code>null</code> if a facility user service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the facility user services where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @return the matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId);
	}

	/**
	* Returns a range of all the facility user services where facilityUserMappingId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param start the lower bound of the range of facility user services
	* @param end the upper bound of the range of facility user services (not inclusive)
	* @return the range of matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId,
			start, end);
	}

	/**
	* Returns an ordered range of all the facility user services where facilityUserMappingId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param start the lower bound of the range of facility user services
	* @param end the upper bound of the range of facility user services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first facility user service in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user service
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService findByFacilityUserServiceByFacilityUserMapping_First(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getPersistence()
				   .findByFacilityUserServiceByFacilityUserMapping_First(facilityUserMappingId,
			orderByComparator);
	}

	/**
	* Returns the first facility user service in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user service, or <code>null</code> if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService fetchByFacilityUserServiceByFacilityUserMapping_First(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityUserServiceByFacilityUserMapping_First(facilityUserMappingId,
			orderByComparator);
	}

	/**
	* Returns the last facility user service in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user service
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService findByFacilityUserServiceByFacilityUserMapping_Last(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getPersistence()
				   .findByFacilityUserServiceByFacilityUserMapping_Last(facilityUserMappingId,
			orderByComparator);
	}

	/**
	* Returns the last facility user service in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user service, or <code>null</code> if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService fetchByFacilityUserServiceByFacilityUserMapping_Last(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityUserServiceByFacilityUserMapping_Last(facilityUserMappingId,
			orderByComparator);
	}

	/**
	* Returns the facility user services before and after the current facility user service in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param id the primary key of the current facility user service
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility user service
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a facility user service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService[] findByFacilityUserServiceByFacilityUserMapping_PrevAndNext(
		long id, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getPersistence()
				   .findByFacilityUserServiceByFacilityUserMapping_PrevAndNext(id,
			facilityUserMappingId, orderByComparator);
	}

	/**
	* Returns all the facility user services where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @return the matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserMappingByFacilityService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityUserMappingByFacilityService(facilityServiceId);
	}

	/**
	* Returns a range of all the facility user services where facilityServiceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityServiceId the facility service ID
	* @param start the lower bound of the range of facility user services
	* @param end the upper bound of the range of facility user services (not inclusive)
	* @return the range of matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserMappingByFacilityService(
		long facilityServiceId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityUserMappingByFacilityService(facilityServiceId,
			start, end);
	}

	/**
	* Returns an ordered range of all the facility user services where facilityServiceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityServiceId the facility service ID
	* @param start the lower bound of the range of facility user services
	* @param end the upper bound of the range of facility user services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserMappingByFacilityService(
		long facilityServiceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityUserMappingByFacilityService(facilityServiceId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first facility user service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user service
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService findByFacilityUserMappingByFacilityService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getPersistence()
				   .findByFacilityUserMappingByFacilityService_First(facilityServiceId,
			orderByComparator);
	}

	/**
	* Returns the first facility user service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user service, or <code>null</code> if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService fetchByFacilityUserMappingByFacilityService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityUserMappingByFacilityService_First(facilityServiceId,
			orderByComparator);
	}

	/**
	* Returns the last facility user service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user service
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService findByFacilityUserMappingByFacilityService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getPersistence()
				   .findByFacilityUserMappingByFacilityService_Last(facilityServiceId,
			orderByComparator);
	}

	/**
	* Returns the last facility user service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user service, or <code>null</code> if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService fetchByFacilityUserMappingByFacilityService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityUserMappingByFacilityService_Last(facilityServiceId,
			orderByComparator);
	}

	/**
	* Returns the facility user services before and after the current facility user service in the ordered set where facilityServiceId = &#63;.
	*
	* @param id the primary key of the current facility user service
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility user service
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a facility user service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService[] findByFacilityUserMappingByFacilityService_PrevAndNext(
		long id, long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getPersistence()
				   .findByFacilityUserMappingByFacilityService_PrevAndNext(id,
			facilityServiceId, orderByComparator);
	}

	/**
	* Returns all the facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @return the matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFusByServiceUserMapping(
		long facilityServiceId, long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFusByServiceUserMapping(facilityServiceId,
			facilityUserMappingId);
	}

	/**
	* Returns a range of all the facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @param start the lower bound of the range of facility user services
	* @param end the upper bound of the range of facility user services (not inclusive)
	* @return the range of matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFusByServiceUserMapping(
		long facilityServiceId, long facilityUserMappingId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFusByServiceUserMapping(facilityServiceId,
			facilityUserMappingId, start, end);
	}

	/**
	* Returns an ordered range of all the facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @param start the lower bound of the range of facility user services
	* @param end the upper bound of the range of facility user services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findByFusByServiceUserMapping(
		long facilityServiceId, long facilityUserMappingId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFusByServiceUserMapping(facilityServiceId,
			facilityUserMappingId, start, end, orderByComparator);
	}

	/**
	* Returns the first facility user service in the ordered set where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user service
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService findByFusByServiceUserMapping_First(
		long facilityServiceId, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getPersistence()
				   .findByFusByServiceUserMapping_First(facilityServiceId,
			facilityUserMappingId, orderByComparator);
	}

	/**
	* Returns the first facility user service in the ordered set where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user service, or <code>null</code> if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService fetchByFusByServiceUserMapping_First(
		long facilityServiceId, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFusByServiceUserMapping_First(facilityServiceId,
			facilityUserMappingId, orderByComparator);
	}

	/**
	* Returns the last facility user service in the ordered set where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user service
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService findByFusByServiceUserMapping_Last(
		long facilityServiceId, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getPersistence()
				   .findByFusByServiceUserMapping_Last(facilityServiceId,
			facilityUserMappingId, orderByComparator);
	}

	/**
	* Returns the last facility user service in the ordered set where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user service, or <code>null</code> if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService fetchByFusByServiceUserMapping_Last(
		long facilityServiceId, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFusByServiceUserMapping_Last(facilityServiceId,
			facilityUserMappingId, orderByComparator);
	}

	/**
	* Returns the facility user services before and after the current facility user service in the ordered set where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	*
	* @param id the primary key of the current facility user service
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility user service
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a facility user service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserService[] findByFusByServiceUserMapping_PrevAndNext(
		long id, long facilityServiceId, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException {
		return getPersistence()
				   .findByFusByServiceUserMapping_PrevAndNext(id,
			facilityServiceId, facilityUserMappingId, orderByComparator);
	}

	/**
	* Returns all the facility user services.
	*
	* @return the facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the facility user services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility user services
	* @param end the upper bound of the range of facility user services (not inclusive)
	* @return the range of facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the facility user services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility user services
	* @param end the upper bound of the range of facility user services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the facility user services where facilityUserMappingId = &#63; from the database.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId);
	}

	/**
	* Removes all the facility user services where facilityServiceId = &#63; from the database.
	*
	* @param facilityServiceId the facility service ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityUserMappingByFacilityService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByFacilityUserMappingByFacilityService(facilityServiceId);
	}

	/**
	* Removes all the facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63; from the database.
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFusByServiceUserMapping(long facilityServiceId,
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByFusByServiceUserMapping(facilityServiceId,
			facilityUserMappingId);
	}

	/**
	* Removes all the facility user services from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of facility user services where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @return the number of matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByFacilityUserServiceByFacilityUserMapping(facilityUserMappingId);
	}

	/**
	* Returns the number of facility user services where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @return the number of matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFacilityUserMappingByFacilityService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByFacilityUserMappingByFacilityService(facilityServiceId);
	}

	/**
	* Returns the number of facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @return the number of matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFusByServiceUserMapping(long facilityServiceId,
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByFusByServiceUserMapping(facilityServiceId,
			facilityUserMappingId);
	}

	/**
	* Returns the number of facility user services.
	*
	* @return the number of facility user services
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FacilityUserServicePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FacilityUserServicePersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					FacilityUserServicePersistence.class.getName());

			ReferenceRegistry.registerReference(FacilityUserServiceUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(FacilityUserServicePersistence persistence) {
	}

	private static FacilityUserServicePersistence _persistence;
}