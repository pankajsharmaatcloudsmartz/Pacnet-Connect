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

import com.pacnet.connect.model.FacilityExternalVisitor;

import java.util.List;

/**
 * The persistence utility for the facility external visitor service. This utility wraps {@link FacilityExternalVisitorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityExternalVisitorPersistence
 * @see FacilityExternalVisitorPersistenceImpl
 * @generated
 */
public class FacilityExternalVisitorUtil {
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
		FacilityExternalVisitor facilityExternalVisitor) {
		getPersistence().clearCache(facilityExternalVisitor);
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
	public static List<FacilityExternalVisitor> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FacilityExternalVisitor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FacilityExternalVisitor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static FacilityExternalVisitor update(
		FacilityExternalVisitor facilityExternalVisitor, boolean merge)
		throws SystemException {
		return getPersistence().update(facilityExternalVisitor, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static FacilityExternalVisitor update(
		FacilityExternalVisitor facilityExternalVisitor, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(facilityExternalVisitor, merge, serviceContext);
	}

	/**
	* Caches the facility external visitor in the entity cache if it is enabled.
	*
	* @param facilityExternalVisitor the facility external visitor
	*/
	public static void cacheResult(
		com.pacnet.connect.model.FacilityExternalVisitor facilityExternalVisitor) {
		getPersistence().cacheResult(facilityExternalVisitor);
	}

	/**
	* Caches the facility external visitors in the entity cache if it is enabled.
	*
	* @param facilityExternalVisitors the facility external visitors
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> facilityExternalVisitors) {
		getPersistence().cacheResult(facilityExternalVisitors);
	}

	/**
	* Creates a new facility external visitor with the primary key. Does not add the facility external visitor to the database.
	*
	* @param id the primary key for the new facility external visitor
	* @return the new facility external visitor
	*/
	public static com.pacnet.connect.model.FacilityExternalVisitor create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the facility external visitor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility external visitor
	* @return the facility external visitor that was removed
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a facility external visitor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityExternalVisitor remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.FacilityExternalVisitor updateImpl(
		com.pacnet.connect.model.FacilityExternalVisitor facilityExternalVisitor,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(facilityExternalVisitor, merge);
	}

	/**
	* Returns the facility external visitor with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityExternalVisitorException} if it could not be found.
	*
	* @param id the primary key of the facility external visitor
	* @return the facility external visitor
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a facility external visitor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityExternalVisitor findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the facility external visitor with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the facility external visitor
	* @return the facility external visitor, or <code>null</code> if a facility external visitor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityExternalVisitor fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the facility external visitors where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @return the matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByFacility(
		long facilityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityExternalVisitorByFacility(facilityId);
	}

	/**
	* Returns a range of all the facility external visitors where facilityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityId the facility ID
	* @param start the lower bound of the range of facility external visitors
	* @param end the upper bound of the range of facility external visitors (not inclusive)
	* @return the range of matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByFacility(
		long facilityId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityExternalVisitorByFacility(facilityId, start,
			end);
	}

	/**
	* Returns an ordered range of all the facility external visitors where facilityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityId the facility ID
	* @param start the lower bound of the range of facility external visitors
	* @param end the upper bound of the range of facility external visitors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByFacility(
		long facilityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityExternalVisitorByFacility(facilityId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first facility external visitor in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility external visitor
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityExternalVisitor findByFacilityExternalVisitorByFacility_First(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException {
		return getPersistence()
				   .findByFacilityExternalVisitorByFacility_First(facilityId,
			orderByComparator);
	}

	/**
	* Returns the first facility external visitor in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility external visitor, or <code>null</code> if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityExternalVisitor fetchByFacilityExternalVisitorByFacility_First(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityExternalVisitorByFacility_First(facilityId,
			orderByComparator);
	}

	/**
	* Returns the last facility external visitor in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility external visitor
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityExternalVisitor findByFacilityExternalVisitorByFacility_Last(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException {
		return getPersistence()
				   .findByFacilityExternalVisitorByFacility_Last(facilityId,
			orderByComparator);
	}

	/**
	* Returns the last facility external visitor in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility external visitor, or <code>null</code> if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityExternalVisitor fetchByFacilityExternalVisitorByFacility_Last(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityExternalVisitorByFacility_Last(facilityId,
			orderByComparator);
	}

	/**
	* Returns the facility external visitors before and after the current facility external visitor in the ordered set where facilityId = &#63;.
	*
	* @param id the primary key of the current facility external visitor
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility external visitor
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a facility external visitor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityExternalVisitor[] findByFacilityExternalVisitorByFacility_PrevAndNext(
		long id, long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException {
		return getPersistence()
				   .findByFacilityExternalVisitorByFacility_PrevAndNext(id,
			facilityId, orderByComparator);
	}

	/**
	* Returns all the facility external visitors where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityExternalVisitorByAccessRequest(accessRequestId);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByAccessRequest(
		long accessRequestId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityExternalVisitorByAccessRequest(accessRequestId,
			start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByAccessRequest(
		long accessRequestId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFacilityExternalVisitorByAccessRequest(accessRequestId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first facility external visitor in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility external visitor
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityExternalVisitor findByFacilityExternalVisitorByAccessRequest_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException {
		return getPersistence()
				   .findByFacilityExternalVisitorByAccessRequest_First(accessRequestId,
			orderByComparator);
	}

	/**
	* Returns the first facility external visitor in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility external visitor, or <code>null</code> if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityExternalVisitor fetchByFacilityExternalVisitorByAccessRequest_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityExternalVisitorByAccessRequest_First(accessRequestId,
			orderByComparator);
	}

	/**
	* Returns the last facility external visitor in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility external visitor
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityExternalVisitor findByFacilityExternalVisitorByAccessRequest_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException {
		return getPersistence()
				   .findByFacilityExternalVisitorByAccessRequest_Last(accessRequestId,
			orderByComparator);
	}

	/**
	* Returns the last facility external visitor in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility external visitor, or <code>null</code> if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityExternalVisitor fetchByFacilityExternalVisitorByAccessRequest_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFacilityExternalVisitorByAccessRequest_Last(accessRequestId,
			orderByComparator);
	}

	/**
	* Returns the facility external visitors before and after the current facility external visitor in the ordered set where accessRequestId = &#63;.
	*
	* @param id the primary key of the current facility external visitor
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility external visitor
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a facility external visitor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.FacilityExternalVisitor[] findByFacilityExternalVisitorByAccessRequest_PrevAndNext(
		long id, long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException {
		return getPersistence()
				   .findByFacilityExternalVisitorByAccessRequest_PrevAndNext(id,
			accessRequestId, orderByComparator);
	}

	/**
	* Returns all the facility external visitors.
	*
	* @return the facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the facility external visitors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility external visitors
	* @param end the upper bound of the range of facility external visitors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the facility external visitors where facilityId = &#63; from the database.
	*
	* @param facilityId the facility ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityExternalVisitorByFacility(
		long facilityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFacilityExternalVisitorByFacility(facilityId);
	}

	/**
	* Removes all the facility external visitors where accessRequestId = &#63; from the database.
	*
	* @param accessRequestId the access request ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFacilityExternalVisitorByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByFacilityExternalVisitorByAccessRequest(accessRequestId);
	}

	/**
	* Removes all the facility external visitors from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of facility external visitors where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @return the number of matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFacilityExternalVisitorByFacility(long facilityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByFacilityExternalVisitorByFacility(facilityId);
	}

	/**
	* Returns the number of facility external visitors where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the number of matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFacilityExternalVisitorByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByFacilityExternalVisitorByAccessRequest(accessRequestId);
	}

	/**
	* Returns the number of facility external visitors.
	*
	* @return the number of facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FacilityExternalVisitorPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FacilityExternalVisitorPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					FacilityExternalVisitorPersistence.class.getName());

			ReferenceRegistry.registerReference(FacilityExternalVisitorUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(FacilityExternalVisitorPersistence persistence) {
	}

	private static FacilityExternalVisitorPersistence _persistence;
}