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

import com.pacnet.connect.model.FacilityAccess;

import java.util.List;

/**
 * The persistence utility for the facility access service. This utility wraps {@link FacilityAccessPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityAccessPersistence
 * @see FacilityAccessPersistenceImpl
 * @generated
 */
public class FacilityAccessUtil {
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
	public static void clearCache(FacilityAccess facilityAccess) {
		getPersistence().clearCache(facilityAccess);
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
	public static List<FacilityAccess> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FacilityAccess> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FacilityAccess> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static FacilityAccess update(FacilityAccess facilityAccess,
		boolean merge) throws SystemException {
		return getPersistence().update(facilityAccess, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static FacilityAccess update(FacilityAccess facilityAccess,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(facilityAccess, merge, serviceContext);
	}

	/**
	* Caches the facility access in the entity cache if it is enabled.
	*
	* @param facilityAccess the facility access
	*/
	public static void cacheResult(
		com.pacnet.connect.model.FacilityAccess facilityAccess) {
		getPersistence().cacheResult(facilityAccess);
	}

	/**
	* Caches the facility accesses in the entity cache if it is enabled.
	*
	* @param facilityAccesses the facility accesses
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.FacilityAccess> facilityAccesses) {
		getPersistence().cacheResult(facilityAccesses);
	}

	/**
	* Creates a new facility access with the primary key. Does not add the facility access to the database.
	*
	* @param id the primary key for the new facility access
	* @return the new facility access
	*/
	public static com.pacnet.connect.model.FacilityAccess create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the facility access with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility access
	* @return the facility access that was removed
	* @throws com.pacnet.connect.NoSuchFacilityAccessException if a facility access with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAccess remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAccessException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.FacilityAccess updateImpl(
		com.pacnet.connect.model.FacilityAccess facilityAccess, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(facilityAccess, merge);
	}

	/**
	* Returns the facility access with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityAccessException} if it could not be found.
	*
	* @param id the primary key of the facility access
	* @return the facility access
	* @throws com.pacnet.connect.NoSuchFacilityAccessException if a facility access with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAccess findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAccessException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the facility access with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the facility access
	* @return the facility access, or <code>null</code> if a facility access with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAccess fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the facility accesses where name = &#63;.
	*
	* @param name the name
	* @return the matching facility accesses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityAccess> findByFacilityServiceName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFacilityServiceName(name);
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
	public static java.util.List<com.pacnet.connect.model.FacilityAccess> findByFacilityServiceName(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFacilityServiceName(name, start, end);
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
	public static java.util.List<com.pacnet.connect.model.FacilityAccess> findByFacilityServiceName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityServiceName(name, start, end,
			orderByComparator);
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
	public static com.pacnet.connect.model.FacilityAccess findByFacilityServiceName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAccessException {
		return getPersistence()
				   .findByFacilityServiceName_First(name, orderByComparator);
	}

	/**
	* Returns the first facility access in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility access, or <code>null</code> if a matching facility access could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAccess fetchByFacilityServiceName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityServiceName_First(name, orderByComparator);
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
	public static com.pacnet.connect.model.FacilityAccess findByFacilityServiceName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAccessException {
		return getPersistence()
				   .findByFacilityServiceName_Last(name, orderByComparator);
	}

	/**
	* Returns the last facility access in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility access, or <code>null</code> if a matching facility access could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityAccess fetchByFacilityServiceName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityServiceName_Last(name, orderByComparator);
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
	public static com.pacnet.connect.model.FacilityAccess[] findByFacilityServiceName_PrevAndNext(
		long id, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAccessException {
		return getPersistence()
				   .findByFacilityServiceName_PrevAndNext(id, name,
			orderByComparator);
	}

	/**
	* Returns all the facility accesses.
	*
	* @return the facility accesses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityAccess> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.pacnet.connect.model.FacilityAccess> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the facility accesses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility accesses
	* @param end the upper bound of the range of facility accesses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of facility accesses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityAccess> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the facility accesses where name = &#63; from the database.
	*
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityServiceName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFacilityServiceName(name);
	}

	/**
	* Removes all the facility accesses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of facility accesses where name = &#63;.
	*
	* @param name the name
	* @return the number of matching facility accesses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFacilityServiceName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFacilityServiceName(name);
	}

	/**
	* Returns the number of facility accesses.
	*
	* @return the number of facility accesses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FacilityAccessPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FacilityAccessPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					FacilityAccessPersistence.class.getName());

			ReferenceRegistry.registerReference(FacilityAccessUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(FacilityAccessPersistence persistence) {
	}

	private static FacilityAccessPersistence _persistence;
}