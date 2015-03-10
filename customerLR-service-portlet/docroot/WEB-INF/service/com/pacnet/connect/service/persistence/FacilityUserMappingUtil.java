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

import com.pacnet.connect.model.FacilityUserMapping;

import java.util.List;

/**
 * The persistence utility for the facility user mapping service. This utility wraps {@link FacilityUserMappingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityUserMappingPersistence
 * @see FacilityUserMappingPersistenceImpl
 * @generated
 */
public class FacilityUserMappingUtil {
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
	public static void clearCache(FacilityUserMapping facilityUserMapping) {
		getPersistence().clearCache(facilityUserMapping);
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
	public static List<FacilityUserMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FacilityUserMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FacilityUserMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static FacilityUserMapping update(
		FacilityUserMapping facilityUserMapping, boolean merge)
		throws SystemException {
		return getPersistence().update(facilityUserMapping, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static FacilityUserMapping update(
		FacilityUserMapping facilityUserMapping, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(facilityUserMapping, merge, serviceContext);
	}

	/**
	* Caches the facility user mapping in the entity cache if it is enabled.
	*
	* @param facilityUserMapping the facility user mapping
	*/
	public static void cacheResult(
		com.pacnet.connect.model.FacilityUserMapping facilityUserMapping) {
		getPersistence().cacheResult(facilityUserMapping);
	}

	/**
	* Caches the facility user mappings in the entity cache if it is enabled.
	*
	* @param facilityUserMappings the facility user mappings
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.FacilityUserMapping> facilityUserMappings) {
		getPersistence().cacheResult(facilityUserMappings);
	}

	/**
	* Creates a new facility user mapping with the primary key. Does not add the facility user mapping to the database.
	*
	* @param id the primary key for the new facility user mapping
	* @return the new facility user mapping
	*/
	public static com.pacnet.connect.model.FacilityUserMapping create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the facility user mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility user mapping
	* @return the facility user mapping that was removed
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.FacilityUserMapping updateImpl(
		com.pacnet.connect.model.FacilityUserMapping facilityUserMapping,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(facilityUserMapping, merge);
	}

	/**
	* Returns the facility user mapping with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityUserMappingException} if it could not be found.
	*
	* @param id the primary key of the facility user mapping
	* @return the facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the facility user mapping with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the facility user mapping
	* @return the facility user mapping, or <code>null</code> if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the facility user mappings where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByCustomerId(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFacilityUserMappingByCustomerId(customerId);
	}

	/**
	* Returns a range of all the facility user mappings where customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @return the range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByCustomerId(
		long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityUserMappingByCustomerId(customerId, start, end);
	}

	/**
	* Returns an ordered range of all the facility user mappings where customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByCustomerId(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityUserMappingByCustomerId(customerId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFacilityUserMappingByCustomerId_First(customerId,
			orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityUserMappingByCustomerId_First(customerId,
			orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFacilityUserMappingByCustomerId_Last(customerId,
			orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityUserMappingByCustomerId_Last(customerId,
			orderByComparator);
	}

	/**
	* Returns the facility user mappings before and after the current facility user mapping in the ordered set where customerId = &#63;.
	*
	* @param id the primary key of the current facility user mapping
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping[] findByFacilityUserMappingByCustomerId_PrevAndNext(
		long id, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFacilityUserMappingByCustomerId_PrevAndNext(id,
			customerId, orderByComparator);
	}

	/**
	* Returns all the facility user mappings where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @return the matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByFacility(
		long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFacilityUserMappingByFacility(faciltyId);
	}

	/**
	* Returns a range of all the facility user mappings where faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @return the range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByFacility(
		long faciltyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityUserMappingByFacility(faciltyId, start, end);
	}

	/**
	* Returns an ordered range of all the facility user mappings where faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityUserMappingByFacility(
		long faciltyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityUserMappingByFacility(faciltyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFacilityUserMappingByFacility_First(faciltyId,
			orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByFacility_First(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityUserMappingByFacility_First(faciltyId,
			orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFacilityUserMappingByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFacilityUserMappingByFacility_Last(faciltyId,
			orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFacilityUserMappingByFacility_Last(
		long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityUserMappingByFacility_Last(faciltyId,
			orderByComparator);
	}

	/**
	* Returns the facility user mappings before and after the current facility user mapping in the ordered set where faciltyId = &#63;.
	*
	* @param id the primary key of the current facility user mapping
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping[] findByFacilityUserMappingByFacility_PrevAndNext(
		long id, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFacilityUserMappingByFacility_PrevAndNext(id,
			faciltyId, orderByComparator);
	}

	/**
	* Returns all the facility user mappings where customerId = &#63; and customerContactId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @return the matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByCustomerContact(
		long customerId, long customerContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityByCustomerContact(customerId,
			customerContactId);
	}

	/**
	* Returns a range of all the facility user mappings where customerId = &#63; and customerContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @return the range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByCustomerContact(
		long customerId, long customerContactId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityByCustomerContact(customerId,
			customerContactId, start, end);
	}

	/**
	* Returns an ordered range of all the facility user mappings where customerId = &#63; and customerContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByCustomerContact(
		long customerId, long customerContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityByCustomerContact(customerId,
			customerContactId, start, end, orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFacilityByCustomerContact_First(
		long customerId, long customerContactId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFacilityByCustomerContact_First(customerId,
			customerContactId, orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFacilityByCustomerContact_First(
		long customerId, long customerContactId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityByCustomerContact_First(customerId,
			customerContactId, orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFacilityByCustomerContact_Last(
		long customerId, long customerContactId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFacilityByCustomerContact_Last(customerId,
			customerContactId, orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFacilityByCustomerContact_Last(
		long customerId, long customerContactId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityByCustomerContact_Last(customerId,
			customerContactId, orderByComparator);
	}

	/**
	* Returns the facility user mappings before and after the current facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63;.
	*
	* @param id the primary key of the current facility user mapping
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping[] findByFacilityByCustomerContact_PrevAndNext(
		long id, long customerId, long customerContactId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFacilityByCustomerContact_PrevAndNext(id, customerId,
			customerContactId, orderByComparator);
	}

	/**
	* Returns all the facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @return the matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFumByFacilityCustomerContact(
		long customerId, long customerContactId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFumByFacilityCustomerContact(customerId,
			customerContactId, faciltyId);
	}

	/**
	* Returns a range of all the facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @return the range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFumByFacilityCustomerContact(
		long customerId, long customerContactId, long faciltyId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFumByFacilityCustomerContact(customerId,
			customerContactId, faciltyId, start, end);
	}

	/**
	* Returns an ordered range of all the facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFumByFacilityCustomerContact(
		long customerId, long customerContactId, long faciltyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFumByFacilityCustomerContact(customerId,
			customerContactId, faciltyId, start, end, orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFumByFacilityCustomerContact_First(
		long customerId, long customerContactId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFumByFacilityCustomerContact_First(customerId,
			customerContactId, faciltyId, orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFumByFacilityCustomerContact_First(
		long customerId, long customerContactId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFumByFacilityCustomerContact_First(customerId,
			customerContactId, faciltyId, orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFumByFacilityCustomerContact_Last(
		long customerId, long customerContactId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFumByFacilityCustomerContact_Last(customerId,
			customerContactId, faciltyId, orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFumByFacilityCustomerContact_Last(
		long customerId, long customerContactId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFumByFacilityCustomerContact_Last(customerId,
			customerContactId, faciltyId, orderByComparator);
	}

	/**
	* Returns the facility user mappings before and after the current facility user mapping in the ordered set where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* @param id the primary key of the current facility user mapping
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping[] findByFumByFacilityCustomerContact_PrevAndNext(
		long id, long customerId, long customerContactId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFumByFacilityCustomerContact_PrevAndNext(id,
			customerId, customerContactId, faciltyId, orderByComparator);
	}

	/**
	* Returns all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @return the matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByNonPacnetUserId(
		long customerId, long nonPacnetUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityByNonPacnetUserId(customerId, nonPacnetUserId);
	}

	/**
	* Returns a range of all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @return the range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByNonPacnetUserId(
		long customerId, long nonPacnetUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityByNonPacnetUserId(customerId,
			nonPacnetUserId, start, end);
	}

	/**
	* Returns an ordered range of all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByNonPacnetUserId(
		long customerId, long nonPacnetUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityByNonPacnetUserId(customerId,
			nonPacnetUserId, start, end, orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFacilityByNonPacnetUserId_First(
		long customerId, long nonPacnetUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFacilityByNonPacnetUserId_First(customerId,
			nonPacnetUserId, orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFacilityByNonPacnetUserId_First(
		long customerId, long nonPacnetUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityByNonPacnetUserId_First(customerId,
			nonPacnetUserId, orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFacilityByNonPacnetUserId_Last(
		long customerId, long nonPacnetUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFacilityByNonPacnetUserId_Last(customerId,
			nonPacnetUserId, orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFacilityByNonPacnetUserId_Last(
		long customerId, long nonPacnetUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityByNonPacnetUserId_Last(customerId,
			nonPacnetUserId, orderByComparator);
	}

	/**
	* Returns the facility user mappings before and after the current facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* @param id the primary key of the current facility user mapping
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping[] findByFacilityByNonPacnetUserId_PrevAndNext(
		long id, long customerId, long nonPacnetUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFacilityByNonPacnetUserId_PrevAndNext(id, customerId,
			nonPacnetUserId, orderByComparator);
	}

	/**
	* Returns all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @return the matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByFacilityAndNonPacnetUserId(
		long customerId, long nonPacnetUserId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityByFacilityAndNonPacnetUserId(customerId,
			nonPacnetUserId, faciltyId);
	}

	/**
	* Returns a range of all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @return the range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByFacilityAndNonPacnetUserId(
		long customerId, long nonPacnetUserId, long faciltyId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityByFacilityAndNonPacnetUserId(customerId,
			nonPacnetUserId, faciltyId, start, end);
	}

	/**
	* Returns an ordered range of all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findByFacilityByFacilityAndNonPacnetUserId(
		long customerId, long nonPacnetUserId, long faciltyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityByFacilityAndNonPacnetUserId(customerId,
			nonPacnetUserId, faciltyId, start, end, orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFacilityByFacilityAndNonPacnetUserId_First(
		long customerId, long nonPacnetUserId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFacilityByFacilityAndNonPacnetUserId_First(customerId,
			nonPacnetUserId, faciltyId, orderByComparator);
	}

	/**
	* Returns the first facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFacilityByFacilityAndNonPacnetUserId_First(
		long customerId, long nonPacnetUserId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityByFacilityAndNonPacnetUserId_First(customerId,
			nonPacnetUserId, faciltyId, orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping findByFacilityByFacilityAndNonPacnetUserId_Last(
		long customerId, long nonPacnetUserId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFacilityByFacilityAndNonPacnetUserId_Last(customerId,
			nonPacnetUserId, faciltyId, orderByComparator);
	}

	/**
	* Returns the last facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility user mapping, or <code>null</code> if a matching facility user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping fetchByFacilityByFacilityAndNonPacnetUserId_Last(
		long customerId, long nonPacnetUserId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityByFacilityAndNonPacnetUserId_Last(customerId,
			nonPacnetUserId, faciltyId, orderByComparator);
	}

	/**
	* Returns the facility user mappings before and after the current facility user mapping in the ordered set where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* @param id the primary key of the current facility user mapping
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility user mapping
	* @throws com.pacnet.connect.NoSuchFacilityUserMappingException if a facility user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityUserMapping[] findByFacilityByFacilityAndNonPacnetUserId_PrevAndNext(
		long id, long customerId, long nonPacnetUserId, long faciltyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityUserMappingException {
		return getPersistence()
				   .findByFacilityByFacilityAndNonPacnetUserId_PrevAndNext(id,
			customerId, nonPacnetUserId, faciltyId, orderByComparator);
	}

	/**
	* Returns all the facility user mappings.
	*
	* @return the facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the facility user mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @return the range of facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the facility user mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility user mappings
	* @param end the upper bound of the range of facility user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityUserMapping> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the facility user mappings where customerId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityUserMappingByCustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFacilityUserMappingByCustomerId(customerId);
	}

	/**
	* Removes all the facility user mappings where faciltyId = &#63; from the database.
	*
	* @param faciltyId the facilty ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityUserMappingByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFacilityUserMappingByFacility(faciltyId);
	}

	/**
	* Removes all the facility user mappings where customerId = &#63; and customerContactId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityByCustomerContact(long customerId,
		long customerContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByFacilityByCustomerContact(customerId, customerContactId);
	}

	/**
	* Removes all the facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFumByFacilityCustomerContact(long customerId,
		long customerContactId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByFumByFacilityCustomerContact(customerId,
			customerContactId, faciltyId);
	}

	/**
	* Removes all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityByNonPacnetUserId(long customerId,
		long nonPacnetUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByFacilityByNonPacnetUserId(customerId, nonPacnetUserId);
	}

	/**
	* Removes all the facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityByFacilityAndNonPacnetUserId(
		long customerId, long nonPacnetUserId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByFacilityByFacilityAndNonPacnetUserId(customerId,
			nonPacnetUserId, faciltyId);
	}

	/**
	* Removes all the facility user mappings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of facility user mappings where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the number of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFacilityUserMappingByCustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByFacilityUserMappingByCustomerId(customerId);
	}

	/**
	* Returns the number of facility user mappings where faciltyId = &#63;.
	*
	* @param faciltyId the facilty ID
	* @return the number of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFacilityUserMappingByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFacilityUserMappingByFacility(faciltyId);
	}

	/**
	* Returns the number of facility user mappings where customerId = &#63; and customerContactId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @return the number of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFacilityByCustomerContact(long customerId,
		long customerContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByFacilityByCustomerContact(customerId,
			customerContactId);
	}

	/**
	* Returns the number of facility user mappings where customerId = &#63; and customerContactId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param customerContactId the customer contact ID
	* @param faciltyId the facilty ID
	* @return the number of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFumByFacilityCustomerContact(long customerId,
		long customerContactId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByFumByFacilityCustomerContact(customerId,
			customerContactId, faciltyId);
	}

	/**
	* Returns the number of facility user mappings where customerId = &#63; and nonPacnetUserId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @return the number of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFacilityByNonPacnetUserId(long customerId,
		long nonPacnetUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByFacilityByNonPacnetUserId(customerId, nonPacnetUserId);
	}

	/**
	* Returns the number of facility user mappings where customerId = &#63; and nonPacnetUserId = &#63; and faciltyId = &#63;.
	*
	* @param customerId the customer ID
	* @param nonPacnetUserId the non pacnet user ID
	* @param faciltyId the facilty ID
	* @return the number of matching facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFacilityByFacilityAndNonPacnetUserId(
		long customerId, long nonPacnetUserId, long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByFacilityByFacilityAndNonPacnetUserId(customerId,
			nonPacnetUserId, faciltyId);
	}

	/**
	* Returns the number of facility user mappings.
	*
	* @return the number of facility user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FacilityUserMappingPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FacilityUserMappingPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					FacilityUserMappingPersistence.class.getName());

			ReferenceRegistry.registerReference(FacilityUserMappingUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(FacilityUserMappingPersistence persistence) {
	}

	private static FacilityUserMappingPersistence _persistence;
}