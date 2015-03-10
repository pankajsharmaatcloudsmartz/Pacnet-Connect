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

import com.pacnet.connect.model.SMA_radcheck;

import java.util.List;

/**
 * The persistence utility for the s m a_radcheck service. This utility wraps {@link SMA_radcheckPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMA_radcheckPersistence
 * @see SMA_radcheckPersistenceImpl
 * @generated
 */
public class SMA_radcheckUtil {
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
	public static void clearCache(SMA_radcheck sma_radcheck) {
		getPersistence().clearCache(sma_radcheck);
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
	public static List<SMA_radcheck> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SMA_radcheck> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SMA_radcheck> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static SMA_radcheck update(SMA_radcheck sma_radcheck, boolean merge)
		throws SystemException {
		return getPersistence().update(sma_radcheck, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static SMA_radcheck update(SMA_radcheck sma_radcheck, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(sma_radcheck, merge, serviceContext);
	}

	/**
	* Caches the s m a_radcheck in the entity cache if it is enabled.
	*
	* @param sma_radcheck the s m a_radcheck
	*/
	public static void cacheResult(
		com.pacnet.connect.model.SMA_radcheck sma_radcheck) {
		getPersistence().cacheResult(sma_radcheck);
	}

	/**
	* Caches the s m a_radchecks in the entity cache if it is enabled.
	*
	* @param sma_radchecks the s m a_radchecks
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.SMA_radcheck> sma_radchecks) {
		getPersistence().cacheResult(sma_radchecks);
	}

	/**
	* Creates a new s m a_radcheck with the primary key. Does not add the s m a_radcheck to the database.
	*
	* @param id the primary key for the new s m a_radcheck
	* @return the new s m a_radcheck
	*/
	public static com.pacnet.connect.model.SMA_radcheck create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the s m a_radcheck with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a_radcheck
	* @return the s m a_radcheck that was removed
	* @throws com.pacnet.connect.NoSuchSMA_radcheckException if a s m a_radcheck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_radcheck remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_radcheckException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.SMA_radcheck updateImpl(
		com.pacnet.connect.model.SMA_radcheck sma_radcheck, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(sma_radcheck, merge);
	}

	/**
	* Returns the s m a_radcheck with the primary key or throws a {@link com.pacnet.connect.NoSuchSMA_radcheckException} if it could not be found.
	*
	* @param id the primary key of the s m a_radcheck
	* @return the s m a_radcheck
	* @throws com.pacnet.connect.NoSuchSMA_radcheckException if a s m a_radcheck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_radcheck findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_radcheckException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the s m a_radcheck with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s m a_radcheck
	* @return the s m a_radcheck, or <code>null</code> if a s m a_radcheck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_radcheck fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the s m a_radchecks where company_id = &#63;.
	*
	* @param company_id the company_id
	* @return the matching s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMA_radcheck> findBySMAUserListByCompanyId(
		long company_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySMAUserListByCompanyId(company_id);
	}

	/**
	* Returns a range of all the s m a_radchecks where company_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param company_id the company_id
	* @param start the lower bound of the range of s m a_radchecks
	* @param end the upper bound of the range of s m a_radchecks (not inclusive)
	* @return the range of matching s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMA_radcheck> findBySMAUserListByCompanyId(
		long company_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAUserListByCompanyId(company_id, start, end);
	}

	/**
	* Returns an ordered range of all the s m a_radchecks where company_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param company_id the company_id
	* @param start the lower bound of the range of s m a_radchecks
	* @param end the upper bound of the range of s m a_radchecks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMA_radcheck> findBySMAUserListByCompanyId(
		long company_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySMAUserListByCompanyId(company_id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first s m a_radcheck in the ordered set where company_id = &#63;.
	*
	* @param company_id the company_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a_radcheck
	* @throws com.pacnet.connect.NoSuchSMA_radcheckException if a matching s m a_radcheck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_radcheck findBySMAUserListByCompanyId_First(
		long company_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_radcheckException {
		return getPersistence()
				   .findBySMAUserListByCompanyId_First(company_id,
			orderByComparator);
	}

	/**
	* Returns the first s m a_radcheck in the ordered set where company_id = &#63;.
	*
	* @param company_id the company_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a_radcheck, or <code>null</code> if a matching s m a_radcheck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_radcheck fetchBySMAUserListByCompanyId_First(
		long company_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMAUserListByCompanyId_First(company_id,
			orderByComparator);
	}

	/**
	* Returns the last s m a_radcheck in the ordered set where company_id = &#63;.
	*
	* @param company_id the company_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a_radcheck
	* @throws com.pacnet.connect.NoSuchSMA_radcheckException if a matching s m a_radcheck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_radcheck findBySMAUserListByCompanyId_Last(
		long company_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_radcheckException {
		return getPersistence()
				   .findBySMAUserListByCompanyId_Last(company_id,
			orderByComparator);
	}

	/**
	* Returns the last s m a_radcheck in the ordered set where company_id = &#63;.
	*
	* @param company_id the company_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a_radcheck, or <code>null</code> if a matching s m a_radcheck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_radcheck fetchBySMAUserListByCompanyId_Last(
		long company_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySMAUserListByCompanyId_Last(company_id,
			orderByComparator);
	}

	/**
	* Returns the s m a_radchecks before and after the current s m a_radcheck in the ordered set where company_id = &#63;.
	*
	* @param id the primary key of the current s m a_radcheck
	* @param company_id the company_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a_radcheck
	* @throws com.pacnet.connect.NoSuchSMA_radcheckException if a s m a_radcheck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_radcheck[] findBySMAUserListByCompanyId_PrevAndNext(
		long id, long company_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_radcheckException {
		return getPersistence()
				   .findBySMAUserListByCompanyId_PrevAndNext(id, company_id,
			orderByComparator);
	}

	/**
	* Returns all the s m a_radchecks.
	*
	* @return the s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMA_radcheck> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the s m a_radchecks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a_radchecks
	* @param end the upper bound of the range of s m a_radchecks (not inclusive)
	* @return the range of s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMA_radcheck> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the s m a_radchecks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a_radchecks
	* @param end the upper bound of the range of s m a_radchecks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMA_radcheck> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the s m a_radchecks where company_id = &#63; from the database.
	*
	* @param company_id the company_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySMAUserListByCompanyId(long company_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySMAUserListByCompanyId(company_id);
	}

	/**
	* Removes all the s m a_radchecks from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of s m a_radchecks where company_id = &#63;.
	*
	* @param company_id the company_id
	* @return the number of matching s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySMAUserListByCompanyId(long company_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySMAUserListByCompanyId(company_id);
	}

	/**
	* Returns the number of s m a_radchecks.
	*
	* @return the number of s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SMA_radcheckPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SMA_radcheckPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					SMA_radcheckPersistence.class.getName());

			ReferenceRegistry.registerReference(SMA_radcheckUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(SMA_radcheckPersistence persistence) {
	}

	private static SMA_radcheckPersistence _persistence;
}