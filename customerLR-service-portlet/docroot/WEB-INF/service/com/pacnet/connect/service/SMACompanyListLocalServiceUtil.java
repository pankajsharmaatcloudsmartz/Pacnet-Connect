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

package com.pacnet.connect.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the s m a company list local service. This utility wraps {@link com.pacnet.connect.service.impl.SMACompanyListLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see SMACompanyListLocalService
 * @see com.pacnet.connect.service.base.SMACompanyListLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.SMACompanyListLocalServiceImpl
 * @generated
 */
public class SMACompanyListLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.SMACompanyListLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the s m a company list to the database. Also notifies the appropriate model listeners.
	*
	* @param smaCompanyList the s m a company list
	* @return the s m a company list that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList addSMACompanyList(
		com.pacnet.connect.model.SMACompanyList smaCompanyList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSMACompanyList(smaCompanyList);
	}

	/**
	* Creates a new s m a company list with the primary key. Does not add the s m a company list to the database.
	*
	* @param id the primary key for the new s m a company list
	* @return the new s m a company list
	*/
	public static com.pacnet.connect.model.SMACompanyList createSMACompanyList(
		java.lang.String id) {
		return getService().createSMACompanyList(id);
	}

	/**
	* Deletes the s m a company list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a company list
	* @return the s m a company list that was removed
	* @throws PortalException if a s m a company list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList deleteSMACompanyList(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSMACompanyList(id);
	}

	/**
	* Deletes the s m a company list from the database. Also notifies the appropriate model listeners.
	*
	* @param smaCompanyList the s m a company list
	* @return the s m a company list that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList deleteSMACompanyList(
		com.pacnet.connect.model.SMACompanyList smaCompanyList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSMACompanyList(smaCompanyList);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.pacnet.connect.model.SMACompanyList fetchSMACompanyList(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSMACompanyList(id);
	}

	/**
	* Returns the s m a company list with the primary key.
	*
	* @param id the primary key of the s m a company list
	* @return the s m a company list
	* @throws PortalException if a s m a company list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList getSMACompanyList(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMACompanyList(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the s m a company lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a company lists
	* @param end the upper bound of the range of s m a company lists (not inclusive)
	* @return the range of s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> getSMACompanyLists(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMACompanyLists(start, end);
	}

	/**
	* Returns the number of s m a company lists.
	*
	* @return the number of s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public static int getSMACompanyListsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMACompanyListsCount();
	}

	/**
	* Updates the s m a company list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaCompanyList the s m a company list
	* @return the s m a company list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList updateSMACompanyList(
		com.pacnet.connect.model.SMACompanyList smaCompanyList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSMACompanyList(smaCompanyList);
	}

	/**
	* Updates the s m a company list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaCompanyList the s m a company list
	* @param merge whether to merge the s m a company list with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s m a company list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList updateSMACompanyList(
		com.pacnet.connect.model.SMACompanyList smaCompanyList, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSMACompanyList(smaCompanyList, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	*/
	public static void clearCache() {
		getService().clearCache();
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	*/
	public static void clearCache(
		com.pacnet.connect.model.SMACompanyList smaCompanyList) {
		getService().clearCache(smaCompanyList);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findWithDynamicQuery(dynamicQuery);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int)
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int, OrderByComparator)
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean)
	*/
	public static com.pacnet.connect.model.SMACompanyList update(
		com.pacnet.connect.model.SMACompanyList smaCompanyList, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().update(smaCompanyList, merge);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean, ServiceContext)
	*/
	public static com.pacnet.connect.model.SMACompanyList update(
		com.pacnet.connect.model.SMACompanyList smaCompanyList, boolean merge,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().update(smaCompanyList, merge, serviceContext);
	}

	/**
	* Caches the s m a company list in the entity cache if it is enabled.
	*
	* @param smaCompanyList
	the s m a company list
	*/
	public static void cacheResult(
		com.pacnet.connect.model.SMACompanyList smaCompanyList) {
		getService().cacheResult(smaCompanyList);
	}

	/**
	* Caches the s m a company lists in the entity cache if it is enabled.
	*
	* @param smaCompanyLists
	the s m a company lists
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.SMACompanyList> smaCompanyLists) {
		getService().cacheResult(smaCompanyLists);
	}

	/**
	* Creates a new s m a company list with the primary key. Does not add the s
	* m a company list to the database.
	*
	* @param id
	the primary key for the new s m a company list
	* @return the new s m a company list
	*/
	public static com.pacnet.connect.model.SMACompanyList create(
		java.lang.String id) {
		return getService().create(id);
	}

	/**
	* Removes the s m a company list with the primary key from the database.
	* Also notifies the appropriate model listeners.
	*
	* @param id
	the primary key of the s m a company list
	* @return the s m a company list that was removed
	* @throws com.pacnet.connect.NoSuchSMACompanyListException
	if a s m a company list with the primary key could not be
	found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList remove(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return getService().remove(id);
	}

	public static com.pacnet.connect.model.SMACompanyList updateImpl(
		com.pacnet.connect.model.SMACompanyList smaCompanyList, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImpl(smaCompanyList, merge);
	}

	/**
	* Returns the s m a company list with the primary key or throws a
	* {@link com.pacnet.connect.NoSuchSMACompanyListException} if it could not
	* be found.
	*
	* @param id
	the primary key of the s m a company list
	* @return the s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException
	if a s m a company list with the primary key could not be
	found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList findByPrimaryKey(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return getService().findByPrimaryKey(id);
	}

	/**
	* Returns the s m a company list with the primary key or returns
	* <code>null</code> if it could not be found.
	*
	* @param id
	the primary key of the s m a company list
	* @return the s m a company list, or <code>null</code> if a s m a company
	list with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList fetchByPrimaryKey(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the s m a company lists where adminUserId = &#63;.
	*
	* @param adminUserId
	the admin user ID
	* @return the matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByAdminUserId(
		long adminUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMACompanyListByAdminUserId(adminUserId);
	}

	/**
	* Returns a range of all the s m a company lists where adminUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param adminUserId
	the admin user ID
	* @param start
	the lower bound of the range of s m a company lists
	* @param end
	the upper bound of the range of s m a company lists (not
	inclusive)
	* @return the range of matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByAdminUserId(
		long adminUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMACompanyListByAdminUserId(adminUserId, start, end);
	}

	/**
	* Returns an ordered range of all the s m a company lists where adminUserId
	* = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param adminUserId
	the admin user ID
	* @param start
	the lower bound of the range of s m a company lists
	* @param end
	the upper bound of the range of s m a company lists (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByAdminUserId(
		long adminUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMACompanyListByAdminUserId(adminUserId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first s m a company list in the ordered set where adminUserId
	* = &#63;.
	*
	* @param adminUserId
	the admin user ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException
	if a matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList findBySMACompanyListByAdminUserId_First(
		long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return getService()
				   .findBySMACompanyListByAdminUserId_First(adminUserId,
			orderByComparator);
	}

	/**
	* Returns the first s m a company list in the ordered set where adminUserId
	* = &#63;.
	*
	* @param adminUserId
	the admin user ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a company list, or <code>null</code> if a
	matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByAdminUserId_First(
		long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMACompanyListByAdminUserId_First(adminUserId,
			orderByComparator);
	}

	/**
	* Returns the last s m a company list in the ordered set where adminUserId
	* = &#63;.
	*
	* @param adminUserId
	the admin user ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException
	if a matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList findBySMACompanyListByAdminUserId_Last(
		long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return getService()
				   .findBySMACompanyListByAdminUserId_Last(adminUserId,
			orderByComparator);
	}

	/**
	* Returns the last s m a company list in the ordered set where adminUserId
	* = &#63;.
	*
	* @param adminUserId
	the admin user ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a company list, or <code>null</code> if a
	matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByAdminUserId_Last(
		long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMACompanyListByAdminUserId_Last(adminUserId,
			orderByComparator);
	}

	/**
	* Returns the s m a company lists before and after the current s m a
	* company list in the ordered set where adminUserId = &#63;.
	*
	* @param id
	the primary key of the current s m a company list
	* @param adminUserId
	the admin user ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException
	if a s m a company list with the primary key could not be
	found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByAdminUserId_PrevAndNext(
		java.lang.String id, long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return getService()
				   .findBySMACompanyListByAdminUserId_PrevAndNext(id,
			adminUserId, orderByComparator);
	}

	/**
	* Returns all the s m a company lists where companyId = &#63;.
	*
	* @param companyId
	the company ID
	* @return the matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMACompanyListByCompanyId(companyId);
	}

	/**
	* Returns a range of all the s m a company lists where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param companyId
	the company ID
	* @param start
	the lower bound of the range of s m a company lists
	* @param end
	the upper bound of the range of s m a company lists (not
	inclusive)
	* @return the range of matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMACompanyListByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the s m a company lists where companyId =
	* &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param companyId
	the company ID
	* @param start
	the lower bound of the range of s m a company lists
	* @param end
	the upper bound of the range of s m a company lists (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMACompanyListByCompanyId(companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first s m a company list in the ordered set where companyId =
	* &#63;.
	*
	* @param companyId
	the company ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException
	if a matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return getService()
				   .findBySMACompanyListByCompanyId_First(companyId,
			orderByComparator);
	}

	/**
	* Returns the first s m a company list in the ordered set where companyId =
	* &#63;.
	*
	* @param companyId
	the company ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a company list, or <code>null</code> if a
	matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMACompanyListByCompanyId_First(companyId,
			orderByComparator);
	}

	/**
	* Returns the last s m a company list in the ordered set where companyId =
	* &#63;.
	*
	* @param companyId
	the company ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException
	if a matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return getService()
				   .findBySMACompanyListByCompanyId_Last(companyId,
			orderByComparator);
	}

	/**
	* Returns the last s m a company list in the ordered set where companyId =
	* &#63;.
	*
	* @param companyId
	the company ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a company list, or <code>null</code> if a
	matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMACompanyListByCompanyId_Last(companyId,
			orderByComparator);
	}

	/**
	* Returns the s m a company lists before and after the current s m a
	* company list in the ordered set where companyId = &#63;.
	*
	* @param id
	the primary key of the current s m a company list
	* @param companyId
	the company ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException
	if a s m a company list with the primary key could not be
	found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByCompanyId_PrevAndNext(
		java.lang.String id, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return getService()
				   .findBySMACompanyListByCompanyId_PrevAndNext(id, companyId,
			orderByComparator);
	}

	/**
	* Returns all the s m a company lists where customerId = &#63;.
	*
	* @param customerId
	the customer ID
	* @return the matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCustomerId(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMACompanyListByCustomerId(customerId);
	}

	/**
	* Returns a range of all the s m a company lists where customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param customerId
	the customer ID
	* @param start
	the lower bound of the range of s m a company lists
	* @param end
	the upper bound of the range of s m a company lists (not
	inclusive)
	* @return the range of matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCustomerId(
		long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMACompanyListByCustomerId(customerId, start, end);
	}

	/**
	* Returns an ordered range of all the s m a company lists where customerId
	* = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param customerId
	the customer ID
	* @param start
	the lower bound of the range of s m a company lists
	* @param end
	the upper bound of the range of s m a company lists (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCustomerId(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMACompanyListByCustomerId(customerId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first s m a company list in the ordered set where customerId
	* = &#63;.
	*
	* @param customerId
	the customer ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException
	if a matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return getService()
				   .findBySMACompanyListByCustomerId_First(customerId,
			orderByComparator);
	}

	/**
	* Returns the first s m a company list in the ordered set where customerId
	* = &#63;.
	*
	* @param customerId
	the customer ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a company list, or <code>null</code> if a
	matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMACompanyListByCustomerId_First(customerId,
			orderByComparator);
	}

	/**
	* Returns the last s m a company list in the ordered set where customerId =
	* &#63;.
	*
	* @param customerId
	the customer ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException
	if a matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return getService()
				   .findBySMACompanyListByCustomerId_Last(customerId,
			orderByComparator);
	}

	/**
	* Returns the last s m a company list in the ordered set where customerId =
	* &#63;.
	*
	* @param customerId
	the customer ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a company list, or <code>null</code> if a
	matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMACompanyListByCustomerId_Last(customerId,
			orderByComparator);
	}

	/**
	* Returns the s m a company lists before and after the current s m a
	* company list in the ordered set where customerId = &#63;.
	*
	* @param id
	the primary key of the current s m a company list
	* @param customerId
	the customer ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException
	if a s m a company list with the primary key could not be
	found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByCustomerId_PrevAndNext(
		java.lang.String id, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return getService()
				   .findBySMACompanyListByCustomerId_PrevAndNext(id,
			customerId, orderByComparator);
	}

	/**
	* Returns all the s m a company lists where domains = &#63;.
	*
	* @param domains
	the domains
	* @return the matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByDomains(
		java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMACompanyListByDomains(domains);
	}

	/**
	* Returns a range of all the s m a company lists where domains = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param domains
	the domains
	* @param start
	the lower bound of the range of s m a company lists
	* @param end
	the upper bound of the range of s m a company lists (not
	inclusive)
	* @return the range of matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByDomains(
		java.lang.String domains, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMACompanyListByDomains(domains, start, end);
	}

	/**
	* Returns an ordered range of all the s m a company lists where domains =
	* &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param domains
	the domains
	* @param start
	the lower bound of the range of s m a company lists
	* @param end
	the upper bound of the range of s m a company lists (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByDomains(
		java.lang.String domains, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMACompanyListByDomains(domains, start, end,
			orderByComparator);
	}

	/**
	* Returns the first s m a company list in the ordered set where domains =
	* &#63;.
	*
	* @param domains
	the domains
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException
	if a matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList findBySMACompanyListByDomains_First(
		java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return getService()
				   .findBySMACompanyListByDomains_First(domains,
			orderByComparator);
	}

	/**
	* Returns the first s m a company list in the ordered set where domains =
	* &#63;.
	*
	* @param domains
	the domains
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a company list, or <code>null</code> if a
	matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByDomains_First(
		java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMACompanyListByDomains_First(domains,
			orderByComparator);
	}

	/**
	* Returns the last s m a company list in the ordered set where domains =
	* &#63;.
	*
	* @param domains
	the domains
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException
	if a matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList findBySMACompanyListByDomains_Last(
		java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return getService()
				   .findBySMACompanyListByDomains_Last(domains,
			orderByComparator);
	}

	/**
	* Returns the last s m a company list in the ordered set where domains =
	* &#63;.
	*
	* @param domains
	the domains
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a company list, or <code>null</code> if a
	matching s m a company list could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByDomains_Last(
		java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMACompanyListByDomains_Last(domains,
			orderByComparator);
	}

	/**
	* Returns the s m a company lists before and after the current s m a
	* company list in the ordered set where domains = &#63;.
	*
	* @param id
	the primary key of the current s m a company list
	* @param domains
	the domains
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a company list
	* @throws com.pacnet.connect.NoSuchSMACompanyListException
	if a s m a company list with the primary key could not be
	found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByDomains_PrevAndNext(
		java.lang.String id, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return getService()
				   .findBySMACompanyListByDomains_PrevAndNext(id, domains,
			orderByComparator);
	}

	/**
	* Returns all the s m a company lists.
	*
	* @return the s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll();
	}

	/**
	* Returns a range of all the s m a company lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param start
	the lower bound of the range of s m a company lists
	* @param end
	the upper bound of the range of s m a company lists (not
	inclusive)
	* @return the range of s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the s m a company lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param start
	the lower bound of the range of s m a company lists
	* @param end
	the upper bound of the range of s m a company lists (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanyList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the s m a company lists where adminUserId = &#63; from the
	* database.
	*
	* @param adminUserId
	the admin user ID
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeBySMACompanyListByAdminUserId(long adminUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMACompanyListByAdminUserId(adminUserId);
	}

	/**
	* Removes all the s m a company lists where companyId = &#63; from the
	* database.
	*
	* @param companyId
	the company ID
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeBySMACompanyListByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMACompanyListByCompanyId(companyId);
	}

	/**
	* Removes all the s m a company lists where customerId = &#63; from the
	* database.
	*
	* @param customerId
	the customer ID
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeBySMACompanyListByCustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMACompanyListByCustomerId(customerId);
	}

	/**
	* Removes all the s m a company lists where domains = &#63; from the
	* database.
	*
	* @param domains
	the domains
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeBySMACompanyListByDomains(java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMACompanyListByDomains(domains);
	}

	/**
	* Removes all the s m a company lists from the database.
	*
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeAll();
	}

	/**
	* Returns the number of s m a company lists where adminUserId = &#63;.
	*
	* @param adminUserId
	the admin user ID
	* @return the number of matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countBySMACompanyListByAdminUserId(long adminUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countBySMACompanyListByAdminUserId(adminUserId);
	}

	/**
	* Returns the number of s m a company lists where companyId = &#63;.
	*
	* @param companyId
	the company ID
	* @return the number of matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countBySMACompanyListByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countBySMACompanyListByCompanyId(companyId);
	}

	/**
	* Returns the number of s m a company lists where customerId = &#63;.
	*
	* @param customerId
	the customer ID
	* @return the number of matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countBySMACompanyListByCustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countBySMACompanyListByCustomerId(customerId);
	}

	/**
	* Returns the number of s m a company lists where domains = &#63;.
	*
	* @param domains
	the domains
	* @return the number of matching s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countBySMACompanyListByDomains(java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countBySMACompanyListByDomains(domains);
	}

	/**
	* Returns the number of s m a company lists.
	*
	* @return the number of s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countAll();
	}

	public static void clearService() {
		_service = null;
	}

	public static SMACompanyListLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SMACompanyListLocalService.class.getName());

			if (invokableLocalService instanceof SMACompanyListLocalService) {
				_service = (SMACompanyListLocalService)invokableLocalService;
			}
			else {
				_service = new SMACompanyListLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(SMACompanyListLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(SMACompanyListLocalService service) {
	}

	private static SMACompanyListLocalService _service;
}