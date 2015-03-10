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

import com.pacnet.connect.model.SMAEmailHistory;

import java.util.List;

/**
 * The persistence utility for the s m a email history service. This utility wraps {@link SMAEmailHistoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMAEmailHistoryPersistence
 * @see SMAEmailHistoryPersistenceImpl
 * @generated
 */
public class SMAEmailHistoryUtil {
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
	public static void clearCache(SMAEmailHistory smaEmailHistory) {
		getPersistence().clearCache(smaEmailHistory);
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
	public static List<SMAEmailHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SMAEmailHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SMAEmailHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static SMAEmailHistory update(SMAEmailHistory smaEmailHistory,
		boolean merge) throws SystemException {
		return getPersistence().update(smaEmailHistory, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static SMAEmailHistory update(SMAEmailHistory smaEmailHistory,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(smaEmailHistory, merge, serviceContext);
	}

	/**
	* Caches the s m a email history in the entity cache if it is enabled.
	*
	* @param smaEmailHistory the s m a email history
	*/
	public static void cacheResult(
		com.pacnet.connect.model.SMAEmailHistory smaEmailHistory) {
		getPersistence().cacheResult(smaEmailHistory);
	}

	/**
	* Caches the s m a email histories in the entity cache if it is enabled.
	*
	* @param smaEmailHistories the s m a email histories
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.SMAEmailHistory> smaEmailHistories) {
		getPersistence().cacheResult(smaEmailHistories);
	}

	/**
	* Creates a new s m a email history with the primary key. Does not add the s m a email history to the database.
	*
	* @param id the primary key for the new s m a email history
	* @return the new s m a email history
	*/
	public static com.pacnet.connect.model.SMAEmailHistory create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the s m a email history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a email history
	* @return the s m a email history that was removed
	* @throws com.pacnet.connect.NoSuchSMAEmailHistoryException if a s m a email history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAEmailHistory remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAEmailHistoryException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.SMAEmailHistory updateImpl(
		com.pacnet.connect.model.SMAEmailHistory smaEmailHistory, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(smaEmailHistory, merge);
	}

	/**
	* Returns the s m a email history with the primary key or throws a {@link com.pacnet.connect.NoSuchSMAEmailHistoryException} if it could not be found.
	*
	* @param id the primary key of the s m a email history
	* @return the s m a email history
	* @throws com.pacnet.connect.NoSuchSMAEmailHistoryException if a s m a email history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAEmailHistory findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAEmailHistoryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the s m a email history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s m a email history
	* @return the s m a email history, or <code>null</code> if a s m a email history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAEmailHistory fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the s m a email histories.
	*
	* @return the s m a email histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAEmailHistory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the s m a email histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a email histories
	* @param end the upper bound of the range of s m a email histories (not inclusive)
	* @return the range of s m a email histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAEmailHistory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the s m a email histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a email histories
	* @param end the upper bound of the range of s m a email histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s m a email histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAEmailHistory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the s m a email histories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of s m a email histories.
	*
	* @return the number of s m a email histories
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SMAEmailHistoryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SMAEmailHistoryPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					SMAEmailHistoryPersistence.class.getName());

			ReferenceRegistry.registerReference(SMAEmailHistoryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(SMAEmailHistoryPersistence persistence) {
	}

	private static SMAEmailHistoryPersistence _persistence;
}