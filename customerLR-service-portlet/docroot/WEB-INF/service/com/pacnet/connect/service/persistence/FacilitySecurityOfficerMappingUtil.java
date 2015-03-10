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

import com.pacnet.connect.model.FacilitySecurityOfficerMapping;

import java.util.List;

/**
 * The persistence utility for the facility security officer mapping service. This utility wraps {@link FacilitySecurityOfficerMappingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilitySecurityOfficerMappingPersistence
 * @see FacilitySecurityOfficerMappingPersistenceImpl
 * @generated
 */
public class FacilitySecurityOfficerMappingUtil {
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
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping) {
		getPersistence().clearCache(facilitySecurityOfficerMapping);
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
	public static List<FacilitySecurityOfficerMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FacilitySecurityOfficerMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FacilitySecurityOfficerMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static FacilitySecurityOfficerMapping update(
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping,
		boolean merge) throws SystemException {
		return getPersistence().update(facilitySecurityOfficerMapping, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static FacilitySecurityOfficerMapping update(
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(facilitySecurityOfficerMapping, merge, serviceContext);
	}

	/**
	* Caches the facility security officer mapping in the entity cache if it is enabled.
	*
	* @param facilitySecurityOfficerMapping the facility security officer mapping
	*/
	public static void cacheResult(
		com.pacnet.connect.model.FacilitySecurityOfficerMapping facilitySecurityOfficerMapping) {
		getPersistence().cacheResult(facilitySecurityOfficerMapping);
	}

	/**
	* Caches the facility security officer mappings in the entity cache if it is enabled.
	*
	* @param facilitySecurityOfficerMappings the facility security officer mappings
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> facilitySecurityOfficerMappings) {
		getPersistence().cacheResult(facilitySecurityOfficerMappings);
	}

	/**
	* Creates a new facility security officer mapping with the primary key. Does not add the facility security officer mapping to the database.
	*
	* @param id the primary key for the new facility security officer mapping
	* @return the new facility security officer mapping
	*/
	public static com.pacnet.connect.model.FacilitySecurityOfficerMapping create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the facility security officer mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility security officer mapping
	* @return the facility security officer mapping that was removed
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a facility security officer mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilitySecurityOfficerMapping remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.FacilitySecurityOfficerMapping updateImpl(
		com.pacnet.connect.model.FacilitySecurityOfficerMapping facilitySecurityOfficerMapping,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(facilitySecurityOfficerMapping, merge);
	}

	/**
	* Returns the facility security officer mapping with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException} if it could not be found.
	*
	* @param id the primary key of the facility security officer mapping
	* @return the facility security officer mapping
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a facility security officer mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilitySecurityOfficerMapping findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the facility security officer mapping with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the facility security officer mapping
	* @return the facility security officer mapping, or <code>null</code> if a facility security officer mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilitySecurityOfficerMapping fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the facility security officer mappings where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @return the matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityByFacility(
		long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFacilitySecurityByFacility(faciltyId);
	}

	/**
	* Returns a range of all the facility security officer mappings where faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility security officer mappings
	* @param end the upper bound of the range of facility security officer mappings (not inclusive)
	* @return the range of matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityByFacility(
		long faciltyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilitySecurityByFacility(faciltyId, start, end);
	}

	/**
	* Returns an ordered range of all the facility security officer mappings where faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility security officer mappings
	* @param end the upper bound of the range of facility security officer mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityByFacility(
		long faciltyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilitySecurityByFacility(faciltyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first facility security officer mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility security officer mapping
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilitySecurityOfficerMapping findByFacilitySecurityByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException {
		return getPersistence()
				   .findByFacilitySecurityByFacility_First(faciltyId,
			orderByComparator);
	}

	/**
	* Returns the first facility security officer mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility security officer mapping, or <code>null</code> if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilitySecurityOfficerMapping fetchByFacilitySecurityByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilitySecurityByFacility_First(faciltyId,
			orderByComparator);
	}

	/**
	* Returns the last facility security officer mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility security officer mapping
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilitySecurityOfficerMapping findByFacilitySecurityByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException {
		return getPersistence()
				   .findByFacilitySecurityByFacility_Last(faciltyId,
			orderByComparator);
	}

	/**
	* Returns the last facility security officer mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility security officer mapping, or <code>null</code> if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilitySecurityOfficerMapping fetchByFacilitySecurityByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilitySecurityByFacility_Last(faciltyId,
			orderByComparator);
	}

	/**
	* Returns the facility security officer mappings before and after the current facility security officer mapping in the ordered set where faciltyId = &#63;.
	*
	* @param id the primary key of the current facility security officer mapping
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility security officer mapping
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a facility security officer mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilitySecurityOfficerMapping[] findByFacilitySecurityByFacility_PrevAndNext(
		long id, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException {
		return getPersistence()
				   .findByFacilitySecurityByFacility_PrevAndNext(id, faciltyId,
			orderByComparator);
	}

	/**
	* Returns all the facility security officer mappings where securityOfficerUserId = &#63;.
	*
	* @param securityOfficerUserId the security officer user ID
	* @return the matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityBySecurityOfficerUserId(
		long securityOfficerUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilitySecurityBySecurityOfficerUserId(securityOfficerUserId);
	}

	/**
	* Returns a range of all the facility security officer mappings where securityOfficerUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param securityOfficerUserId the security officer user ID
	* @param start the lower bound of the range of facility security officer mappings
	* @param end the upper bound of the range of facility security officer mappings (not inclusive)
	* @return the range of matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityBySecurityOfficerUserId(
		long securityOfficerUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilitySecurityBySecurityOfficerUserId(securityOfficerUserId,
			start, end);
	}

	/**
	* Returns an ordered range of all the facility security officer mappings where securityOfficerUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param securityOfficerUserId the security officer user ID
	* @param start the lower bound of the range of facility security officer mappings
	* @param end the upper bound of the range of facility security officer mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findByFacilitySecurityBySecurityOfficerUserId(
		long securityOfficerUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilitySecurityBySecurityOfficerUserId(securityOfficerUserId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first facility security officer mapping in the ordered set where securityOfficerUserId = &#63;.
	*
	* @param securityOfficerUserId the security officer user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility security officer mapping
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilitySecurityOfficerMapping findByFacilitySecurityBySecurityOfficerUserId_First(
		long securityOfficerUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException {
		return getPersistence()
				   .findByFacilitySecurityBySecurityOfficerUserId_First(securityOfficerUserId,
			orderByComparator);
	}

	/**
	* Returns the first facility security officer mapping in the ordered set where securityOfficerUserId = &#63;.
	*
	* @param securityOfficerUserId the security officer user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility security officer mapping, or <code>null</code> if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilitySecurityOfficerMapping fetchByFacilitySecurityBySecurityOfficerUserId_First(
		long securityOfficerUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilitySecurityBySecurityOfficerUserId_First(securityOfficerUserId,
			orderByComparator);
	}

	/**
	* Returns the last facility security officer mapping in the ordered set where securityOfficerUserId = &#63;.
	*
	* @param securityOfficerUserId the security officer user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility security officer mapping
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilitySecurityOfficerMapping findByFacilitySecurityBySecurityOfficerUserId_Last(
		long securityOfficerUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException {
		return getPersistence()
				   .findByFacilitySecurityBySecurityOfficerUserId_Last(securityOfficerUserId,
			orderByComparator);
	}

	/**
	* Returns the last facility security officer mapping in the ordered set where securityOfficerUserId = &#63;.
	*
	* @param securityOfficerUserId the security officer user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility security officer mapping, or <code>null</code> if a matching facility security officer mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilitySecurityOfficerMapping fetchByFacilitySecurityBySecurityOfficerUserId_Last(
		long securityOfficerUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilitySecurityBySecurityOfficerUserId_Last(securityOfficerUserId,
			orderByComparator);
	}

	/**
	* Returns the facility security officer mappings before and after the current facility security officer mapping in the ordered set where securityOfficerUserId = &#63;.
	*
	* @param id the primary key of the current facility security officer mapping
	* @param securityOfficerUserId the security officer user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility security officer mapping
	* @throws com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException if a facility security officer mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilitySecurityOfficerMapping[] findByFacilitySecurityBySecurityOfficerUserId_PrevAndNext(
		long id, long securityOfficerUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException {
		return getPersistence()
				   .findByFacilitySecurityBySecurityOfficerUserId_PrevAndNext(id,
			securityOfficerUserId, orderByComparator);
	}

	/**
	* Returns all the facility security officer mappings.
	*
	* @return the facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the facility security officer mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility security officer mappings
	* @param end the upper bound of the range of facility security officer mappings (not inclusive)
	* @return the range of facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the facility security officer mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility security officer mappings
	* @param end the upper bound of the range of facility security officer mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilitySecurityOfficerMapping> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the facility security officer mappings where faciltyId = &#63; from the database.
	*
	* @param faciltyId the facilty ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilitySecurityByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFacilitySecurityByFacility(faciltyId);
	}

	/**
	* Removes all the facility security officer mappings where securityOfficerUserId = &#63; from the database.
	*
	* @param securityOfficerUserId the security officer user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilitySecurityBySecurityOfficerUserId(
		long securityOfficerUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByFacilitySecurityBySecurityOfficerUserId(securityOfficerUserId);
	}

	/**
	* Removes all the facility security officer mappings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of facility security officer mappings where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @return the number of matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFacilitySecurityByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFacilitySecurityByFacility(faciltyId);
	}

	/**
	* Returns the number of facility security officer mappings where securityOfficerUserId = &#63;.
	*
	* @param securityOfficerUserId the security officer user ID
	* @return the number of matching facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFacilitySecurityBySecurityOfficerUserId(
		long securityOfficerUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByFacilitySecurityBySecurityOfficerUserId(securityOfficerUserId);
	}

	/**
	* Returns the number of facility security officer mappings.
	*
	* @return the number of facility security officer mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FacilitySecurityOfficerMappingPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FacilitySecurityOfficerMappingPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					FacilitySecurityOfficerMappingPersistence.class.getName());

			ReferenceRegistry.registerReference(FacilitySecurityOfficerMappingUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		FacilitySecurityOfficerMappingPersistence persistence) {
	}

	private static FacilitySecurityOfficerMappingPersistence _persistence;
}