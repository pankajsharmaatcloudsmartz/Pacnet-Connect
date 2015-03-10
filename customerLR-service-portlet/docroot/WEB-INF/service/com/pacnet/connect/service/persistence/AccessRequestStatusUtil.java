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

import com.pacnet.connect.model.AccessRequestStatus;

import java.util.List;

/**
 * The persistence utility for the access request status service. This utility wraps {@link AccessRequestStatusPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestStatusPersistence
 * @see AccessRequestStatusPersistenceImpl
 * @generated
 */
public class AccessRequestStatusUtil {
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
	public static void clearCache(AccessRequestStatus accessRequestStatus) {
		getPersistence().clearCache(accessRequestStatus);
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
	public static List<AccessRequestStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccessRequestStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccessRequestStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static AccessRequestStatus update(
		AccessRequestStatus accessRequestStatus, boolean merge)
		throws SystemException {
		return getPersistence().update(accessRequestStatus, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static AccessRequestStatus update(
		AccessRequestStatus accessRequestStatus, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(accessRequestStatus, merge, serviceContext);
	}

	/**
	* Caches the access request status in the entity cache if it is enabled.
	*
	* @param accessRequestStatus the access request status
	*/
	public static void cacheResult(
		com.pacnet.connect.model.AccessRequestStatus accessRequestStatus) {
		getPersistence().cacheResult(accessRequestStatus);
	}

	/**
	* Caches the access request statuses in the entity cache if it is enabled.
	*
	* @param accessRequestStatuses the access request statuses
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.AccessRequestStatus> accessRequestStatuses) {
		getPersistence().cacheResult(accessRequestStatuses);
	}

	/**
	* Creates a new access request status with the primary key. Does not add the access request status to the database.
	*
	* @param id the primary key for the new access request status
	* @return the new access request status
	*/
	public static com.pacnet.connect.model.AccessRequestStatus create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the access request status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access request status
	* @return the access request status that was removed
	* @throws com.pacnet.connect.NoSuchAccessRequestStatusException if a access request status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestStatus remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestStatusException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.AccessRequestStatus updateImpl(
		com.pacnet.connect.model.AccessRequestStatus accessRequestStatus,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(accessRequestStatus, merge);
	}

	/**
	* Returns the access request status with the primary key or throws a {@link com.pacnet.connect.NoSuchAccessRequestStatusException} if it could not be found.
	*
	* @param id the primary key of the access request status
	* @return the access request status
	* @throws com.pacnet.connect.NoSuchAccessRequestStatusException if a access request status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestStatus findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchAccessRequestStatusException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the access request status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the access request status
	* @return the access request status, or <code>null</code> if a access request status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.AccessRequestStatus fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the access request statuses.
	*
	* @return the access request statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the access request statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access request statuses
	* @param end the upper bound of the range of access request statuses (not inclusive)
	* @return the range of access request statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestStatus> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the access request statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access request statuses
	* @param end the upper bound of the range of access request statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of access request statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.AccessRequestStatus> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the access request statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of access request statuses.
	*
	* @return the number of access request statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AccessRequestStatusPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AccessRequestStatusPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					AccessRequestStatusPersistence.class.getName());

			ReferenceRegistry.registerReference(AccessRequestStatusUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(AccessRequestStatusPersistence persistence) {
	}

	private static AccessRequestStatusPersistence _persistence;
}