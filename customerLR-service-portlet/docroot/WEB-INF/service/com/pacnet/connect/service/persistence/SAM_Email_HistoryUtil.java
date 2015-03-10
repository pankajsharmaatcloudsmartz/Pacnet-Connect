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

import com.pacnet.connect.model.SAM_Email_History;

import java.util.List;

/**
 * The persistence utility for the s a m_ email_ history service. This utility wraps {@link SAM_Email_HistoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SAM_Email_HistoryPersistence
 * @see SAM_Email_HistoryPersistenceImpl
 * @generated
 */
public class SAM_Email_HistoryUtil {
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
	public static void clearCache(SAM_Email_History sam_Email_History) {
		getPersistence().clearCache(sam_Email_History);
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
	public static List<SAM_Email_History> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SAM_Email_History> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SAM_Email_History> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static SAM_Email_History update(
		SAM_Email_History sam_Email_History, boolean merge)
		throws SystemException {
		return getPersistence().update(sam_Email_History, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static SAM_Email_History update(
		SAM_Email_History sam_Email_History, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(sam_Email_History, merge, serviceContext);
	}

	/**
	* Caches the s a m_ email_ history in the entity cache if it is enabled.
	*
	* @param sam_Email_History the s a m_ email_ history
	*/
	public static void cacheResult(
		com.pacnet.connect.model.SAM_Email_History sam_Email_History) {
		getPersistence().cacheResult(sam_Email_History);
	}

	/**
	* Caches the s a m_ email_ histories in the entity cache if it is enabled.
	*
	* @param sam_Email_Histories the s a m_ email_ histories
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.SAM_Email_History> sam_Email_Histories) {
		getPersistence().cacheResult(sam_Email_Histories);
	}

	/**
	* Creates a new s a m_ email_ history with the primary key. Does not add the s a m_ email_ history to the database.
	*
	* @param id the primary key for the new s a m_ email_ history
	* @return the new s a m_ email_ history
	*/
	public static com.pacnet.connect.model.SAM_Email_History create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the s a m_ email_ history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s a m_ email_ history
	* @return the s a m_ email_ history that was removed
	* @throws com.pacnet.connect.NoSuchSAM_Email_HistoryException if a s a m_ email_ history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SAM_Email_History remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSAM_Email_HistoryException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.SAM_Email_History updateImpl(
		com.pacnet.connect.model.SAM_Email_History sam_Email_History,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(sam_Email_History, merge);
	}

	/**
	* Returns the s a m_ email_ history with the primary key or throws a {@link com.pacnet.connect.NoSuchSAM_Email_HistoryException} if it could not be found.
	*
	* @param id the primary key of the s a m_ email_ history
	* @return the s a m_ email_ history
	* @throws com.pacnet.connect.NoSuchSAM_Email_HistoryException if a s a m_ email_ history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SAM_Email_History findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSAM_Email_HistoryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the s a m_ email_ history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s a m_ email_ history
	* @return the s a m_ email_ history, or <code>null</code> if a s a m_ email_ history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SAM_Email_History fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the s a m_ email_ histories.
	*
	* @return the s a m_ email_ histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SAM_Email_History> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the s a m_ email_ histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s a m_ email_ histories
	* @param end the upper bound of the range of s a m_ email_ histories (not inclusive)
	* @return the range of s a m_ email_ histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SAM_Email_History> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the s a m_ email_ histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s a m_ email_ histories
	* @param end the upper bound of the range of s a m_ email_ histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s a m_ email_ histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SAM_Email_History> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the s a m_ email_ histories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of s a m_ email_ histories.
	*
	* @return the number of s a m_ email_ histories
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SAM_Email_HistoryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SAM_Email_HistoryPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					SAM_Email_HistoryPersistence.class.getName());

			ReferenceRegistry.registerReference(SAM_Email_HistoryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(SAM_Email_HistoryPersistence persistence) {
	}

	private static SAM_Email_HistoryPersistence _persistence;
}