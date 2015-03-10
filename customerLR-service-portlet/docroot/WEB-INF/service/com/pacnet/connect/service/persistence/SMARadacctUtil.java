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

import com.pacnet.connect.model.SMARadacct;

import java.util.List;

/**
 * The persistence utility for the s m a radacct service. This utility wraps {@link SMARadacctPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMARadacctPersistence
 * @see SMARadacctPersistenceImpl
 * @generated
 */
public class SMARadacctUtil {
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
	public static void clearCache(SMARadacct smaRadacct) {
		getPersistence().clearCache(smaRadacct);
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
	public static List<SMARadacct> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SMARadacct> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SMARadacct> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static SMARadacct update(SMARadacct smaRadacct, boolean merge)
		throws SystemException {
		return getPersistence().update(smaRadacct, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static SMARadacct update(SMARadacct smaRadacct, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(smaRadacct, merge, serviceContext);
	}

	/**
	* Caches the s m a radacct in the entity cache if it is enabled.
	*
	* @param smaRadacct the s m a radacct
	*/
	public static void cacheResult(
		com.pacnet.connect.model.SMARadacct smaRadacct) {
		getPersistence().cacheResult(smaRadacct);
	}

	/**
	* Caches the s m a radaccts in the entity cache if it is enabled.
	*
	* @param smaRadaccts the s m a radaccts
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.SMARadacct> smaRadaccts) {
		getPersistence().cacheResult(smaRadaccts);
	}

	/**
	* Creates a new s m a radacct with the primary key. Does not add the s m a radacct to the database.
	*
	* @param radAcctId the primary key for the new s m a radacct
	* @return the new s m a radacct
	*/
	public static com.pacnet.connect.model.SMARadacct create(long radAcctId) {
		return getPersistence().create(radAcctId);
	}

	/**
	* Removes the s m a radacct with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param radAcctId the primary key of the s m a radacct
	* @return the s m a radacct that was removed
	* @throws com.pacnet.connect.NoSuchSMARadacctException if a s m a radacct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct remove(long radAcctId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadacctException {
		return getPersistence().remove(radAcctId);
	}

	public static com.pacnet.connect.model.SMARadacct updateImpl(
		com.pacnet.connect.model.SMARadacct smaRadacct, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(smaRadacct, merge);
	}

	/**
	* Returns the s m a radacct with the primary key or throws a {@link com.pacnet.connect.NoSuchSMARadacctException} if it could not be found.
	*
	* @param radAcctId the primary key of the s m a radacct
	* @return the s m a radacct
	* @throws com.pacnet.connect.NoSuchSMARadacctException if a s m a radacct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct findByPrimaryKey(
		long radAcctId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadacctException {
		return getPersistence().findByPrimaryKey(radAcctId);
	}

	/**
	* Returns the s m a radacct with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param radAcctId the primary key of the s m a radacct
	* @return the s m a radacct, or <code>null</code> if a s m a radacct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct fetchByPrimaryKey(
		long radAcctId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(radAcctId);
	}

	/**
	* Returns all the s m a radaccts where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @return the matching s m a radaccts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMARadacct> findBySMAActivityListByRadcheckId(
		int isActive, long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAActivityListByRadcheckId(isActive, radcheckId);
	}

	/**
	* Returns a range of all the s m a radaccts where isActive = &#63; and radcheckId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param start the lower bound of the range of s m a radaccts
	* @param end the upper bound of the range of s m a radaccts (not inclusive)
	* @return the range of matching s m a radaccts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMARadacct> findBySMAActivityListByRadcheckId(
		int isActive, long radcheckId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAActivityListByRadcheckId(isActive, radcheckId,
			start, end);
	}

	/**
	* Returns an ordered range of all the s m a radaccts where isActive = &#63; and radcheckId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param start the lower bound of the range of s m a radaccts
	* @param end the upper bound of the range of s m a radaccts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a radaccts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMARadacct> findBySMAActivityListByRadcheckId(
		int isActive, long radcheckId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAActivityListByRadcheckId(isActive, radcheckId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first s m a radacct in the ordered set where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a radacct
	* @throws com.pacnet.connect.NoSuchSMARadacctException if a matching s m a radacct could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct findBySMAActivityListByRadcheckId_First(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadacctException {
		return getPersistence()
				   .findBySMAActivityListByRadcheckId_First(isActive,
			radcheckId, orderByComparator);
	}

	/**
	* Returns the first s m a radacct in the ordered set where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a radacct, or <code>null</code> if a matching s m a radacct could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct fetchBySMAActivityListByRadcheckId_First(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMAActivityListByRadcheckId_First(isActive,
			radcheckId, orderByComparator);
	}

	/**
	* Returns the last s m a radacct in the ordered set where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a radacct
	* @throws com.pacnet.connect.NoSuchSMARadacctException if a matching s m a radacct could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct findBySMAActivityListByRadcheckId_Last(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadacctException {
		return getPersistence()
				   .findBySMAActivityListByRadcheckId_Last(isActive,
			radcheckId, orderByComparator);
	}

	/**
	* Returns the last s m a radacct in the ordered set where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a radacct, or <code>null</code> if a matching s m a radacct could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct fetchBySMAActivityListByRadcheckId_Last(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMAActivityListByRadcheckId_Last(isActive,
			radcheckId, orderByComparator);
	}

	/**
	* Returns the s m a radaccts before and after the current s m a radacct in the ordered set where isActive = &#63; and radcheckId = &#63;.
	*
	* @param radAcctId the primary key of the current s m a radacct
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a radacct
	* @throws com.pacnet.connect.NoSuchSMARadacctException if a s m a radacct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct[] findBySMAActivityListByRadcheckId_PrevAndNext(
		long radAcctId, int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadacctException {
		return getPersistence()
				   .findBySMAActivityListByRadcheckId_PrevAndNext(radAcctId,
			isActive, radcheckId, orderByComparator);
	}

	/**
	* Returns all the s m a radaccts.
	*
	* @return the s m a radaccts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMARadacct> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the s m a radaccts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a radaccts
	* @param end the upper bound of the range of s m a radaccts (not inclusive)
	* @return the range of s m a radaccts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMARadacct> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the s m a radaccts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a radaccts
	* @param end the upper bound of the range of s m a radaccts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s m a radaccts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMARadacct> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the s m a radaccts where isActive = &#63; and radcheckId = &#63; from the database.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySMAActivityListByRadcheckId(int isActive,
		long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBySMAActivityListByRadcheckId(isActive, radcheckId);
	}

	/**
	* Removes all the s m a radaccts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of s m a radaccts where isActive = &#63; and radcheckId = &#63;.
	*
	* @param isActive the is active
	* @param radcheckId the radcheck ID
	* @return the number of matching s m a radaccts
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySMAActivityListByRadcheckId(int isActive,
		long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBySMAActivityListByRadcheckId(isActive, radcheckId);
	}

	/**
	* Returns the number of s m a radaccts.
	*
	* @return the number of s m a radaccts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SMARadacctPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SMARadacctPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					SMARadacctPersistence.class.getName());

			ReferenceRegistry.registerReference(SMARadacctUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(SMARadacctPersistence persistence) {
	}

	private static SMARadacctPersistence _persistence;
}