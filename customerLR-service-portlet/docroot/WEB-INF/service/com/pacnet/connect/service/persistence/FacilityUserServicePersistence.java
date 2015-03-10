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

import com.pacnet.connect.model.FacilityUserService;

/**
 * The persistence interface for the facility user service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityUserServicePersistenceImpl
 * @see FacilityUserServiceUtil
 * @generated
 */
public interface FacilityUserServicePersistence extends BasePersistence<FacilityUserService> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FacilityUserServiceUtil} to access the facility user service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the facility user service in the entity cache if it is enabled.
	*
	* @param facilityUserService the facility user service
	*/
	public void cacheResult(
		com.pacnet.connect.model.FacilityUserService facilityUserService);

	/**
	* Caches the facility user services in the entity cache if it is enabled.
	*
	* @param facilityUserServices the facility user services
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.FacilityUserService> facilityUserServices);

	/**
	* Creates a new facility user service with the primary key. Does not add the facility user service to the database.
	*
	* @param id the primary key for the new facility user service
	* @return the new facility user service
	*/
	public com.pacnet.connect.model.FacilityUserService create(long id);

	/**
	* Removes the facility user service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility user service
	* @return the facility user service that was removed
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a facility user service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException;

	public com.pacnet.connect.model.FacilityUserService updateImpl(
		com.pacnet.connect.model.FacilityUserService facilityUserService,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility user service with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityUserServiceException} if it could not be found.
	*
	* @param id the primary key of the facility user service
	* @return the facility user service
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a facility user service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException;

	/**
	* Returns the facility user service with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the facility user service
	* @return the facility user service, or <code>null</code> if a facility user service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the facility user services where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @return the matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility user service in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user service
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService findByFacilityUserServiceByFacilityUserMapping_First(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException;

	/**
	* Returns the first facility user service in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user service, or <code>null</code> if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService fetchByFacilityUserServiceByFacilityUserMapping_First(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility user service in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user service
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService findByFacilityUserServiceByFacilityUserMapping_Last(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException;

	/**
	* Returns the last facility user service in the ordered set where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user service, or <code>null</code> if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService fetchByFacilityUserServiceByFacilityUserMapping_Last(
		long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.FacilityUserService[] findByFacilityUserServiceByFacilityUserMapping_PrevAndNext(
		long id, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException;

	/**
	* Returns all the facility user services where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @return the matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserMappingByFacilityService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserMappingByFacilityService(
		long facilityServiceId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFacilityUserMappingByFacilityService(
		long facilityServiceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility user service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user service
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService findByFacilityUserMappingByFacilityService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException;

	/**
	* Returns the first facility user service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user service, or <code>null</code> if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService fetchByFacilityUserMappingByFacilityService_First(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility user service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user service
	* @throws com.pacnet.connect.NoSuchFacilityUserServiceException if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService findByFacilityUserMappingByFacilityService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException;

	/**
	* Returns the last facility user service in the ordered set where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user service, or <code>null</code> if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService fetchByFacilityUserMappingByFacilityService_Last(
		long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.FacilityUserService[] findByFacilityUserMappingByFacilityService_PrevAndNext(
		long id, long facilityServiceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException;

	/**
	* Returns all the facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @return the matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFusByServiceUserMapping(
		long facilityServiceId, long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFusByServiceUserMapping(
		long facilityServiceId, long facilityUserMappingId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findByFusByServiceUserMapping(
		long facilityServiceId, long facilityUserMappingId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.FacilityUserService findByFusByServiceUserMapping_First(
		long facilityServiceId, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException;

	/**
	* Returns the first facility user service in the ordered set where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user service, or <code>null</code> if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService fetchByFusByServiceUserMapping_First(
		long facilityServiceId, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.FacilityUserService findByFusByServiceUserMapping_Last(
		long facilityServiceId, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException;

	/**
	* Returns the last facility user service in the ordered set where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user service, or <code>null</code> if a matching facility user service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityUserService fetchByFusByServiceUserMapping_Last(
		long facilityServiceId, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.FacilityUserService[] findByFusByServiceUserMapping_PrevAndNext(
		long id, long facilityServiceId, long facilityUserMappingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserServiceException;

	/**
	* Returns all the facility user services.
	*
	* @return the facility user services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.FacilityUserService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility user services where facilityUserMappingId = &#63; from the database.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility user services where facilityServiceId = &#63; from the database.
	*
	* @param facilityServiceId the facility service ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityUserMappingByFacilityService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63; from the database.
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFusByServiceUserMapping(long facilityServiceId,
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility user services from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility user services where facilityUserMappingId = &#63;.
	*
	* @param facilityUserMappingId the facility user mapping ID
	* @return the number of matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityUserServiceByFacilityUserMapping(
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility user services where facilityServiceId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @return the number of matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityUserMappingByFacilityService(
		long facilityServiceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility user services where facilityServiceId = &#63; and facilityUserMappingId = &#63;.
	*
	* @param facilityServiceId the facility service ID
	* @param facilityUserMappingId the facility user mapping ID
	* @return the number of matching facility user services
	* @throws SystemException if a system exception occurred
	*/
	public int countByFusByServiceUserMapping(long facilityServiceId,
		long facilityUserMappingId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility user services.
	*
	* @return the number of facility user services
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}