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
 * The utility for the s m a admins local service. This utility wraps {@link com.pacnet.connect.service.impl.SMAAdminsLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see SMAAdminsLocalService
 * @see com.pacnet.connect.service.base.SMAAdminsLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.SMAAdminsLocalServiceImpl
 * @generated
 */
public class SMAAdminsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.SMAAdminsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the s m a admins to the database. Also notifies the appropriate model listeners.
	*
	* @param smaAdmins the s m a admins
	* @return the s m a admins that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins addSMAAdmins(
		com.pacnet.connect.model.SMAAdmins smaAdmins)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSMAAdmins(smaAdmins);
	}

	/**
	* Creates a new s m a admins with the primary key. Does not add the s m a admins to the database.
	*
	* @param id the primary key for the new s m a admins
	* @return the new s m a admins
	*/
	public static com.pacnet.connect.model.SMAAdmins createSMAAdmins(long id) {
		return getService().createSMAAdmins(id);
	}

	/**
	* Deletes the s m a admins with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a admins
	* @return the s m a admins that was removed
	* @throws PortalException if a s m a admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins deleteSMAAdmins(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSMAAdmins(id);
	}

	/**
	* Deletes the s m a admins from the database. Also notifies the appropriate model listeners.
	*
	* @param smaAdmins the s m a admins
	* @return the s m a admins that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins deleteSMAAdmins(
		com.pacnet.connect.model.SMAAdmins smaAdmins)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSMAAdmins(smaAdmins);
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

	public static com.pacnet.connect.model.SMAAdmins fetchSMAAdmins(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSMAAdmins(id);
	}

	/**
	* Returns the s m a admins with the primary key.
	*
	* @param id the primary key of the s m a admins
	* @return the s m a admins
	* @throws PortalException if a s m a admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins getSMAAdmins(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMAAdmins(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the s m a adminses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a adminses
	* @param end the upper bound of the range of s m a adminses (not inclusive)
	* @return the range of s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> getSMAAdminses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMAAdminses(start, end);
	}

	/**
	* Returns the number of s m a adminses.
	*
	* @return the number of s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	public static int getSMAAdminsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMAAdminsesCount();
	}

	/**
	* Updates the s m a admins in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaAdmins the s m a admins
	* @return the s m a admins that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins updateSMAAdmins(
		com.pacnet.connect.model.SMAAdmins smaAdmins)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSMAAdmins(smaAdmins);
	}

	/**
	* Updates the s m a admins in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaAdmins the s m a admins
	* @param merge whether to merge the s m a admins with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s m a admins that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins updateSMAAdmins(
		com.pacnet.connect.model.SMAAdmins smaAdmins, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSMAAdmins(smaAdmins, merge);
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
	public static void clearCache(com.pacnet.connect.model.SMAAdmins smaAdmins) {
		getService().clearCache(smaAdmins);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findWithDynamicQuery(dynamicQuery);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int)
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int, OrderByComparator)
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findWithDynamicQuery(
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
	public static com.pacnet.connect.model.SMAAdmins update(
		com.pacnet.connect.model.SMAAdmins smaAdmins, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().update(smaAdmins, merge);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean, ServiceContext)
	*/
	public static com.pacnet.connect.model.SMAAdmins update(
		com.pacnet.connect.model.SMAAdmins smaAdmins, boolean merge,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().update(smaAdmins, merge, serviceContext);
	}

	/**
	* Caches the s m a admins in the entity cache if it is enabled.
	*
	* @param smaAdmins
	the s m a admins
	*/
	public static void cacheResult(com.pacnet.connect.model.SMAAdmins smaAdmins) {
		getService().cacheResult(smaAdmins);
	}

	/**
	* Caches the s m a adminses in the entity cache if it is enabled.
	*
	* @param smaAdminses
	the s m a adminses
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.SMAAdmins> smaAdminses) {
		getService().cacheResult(smaAdminses);
	}

	/**
	* Creates a new s m a admins with the primary key. Does not add the s m a
	* admins to the database.
	*
	* @param id
	the primary key for the new s m a admins
	* @return the new s m a admins
	*/
	public static com.pacnet.connect.model.SMAAdmins create(long id) {
		return getService().create(id);
	}

	/**
	* Removes the s m a admins with the primary key from the database. Also
	* notifies the appropriate model listeners.
	*
	* @param id
	the primary key of the s m a admins
	* @return the s m a admins that was removed
	* @throws com.pacnet.connect.NoSuchSMAAdminsException
	if a s m a admins with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getService().remove(id);
	}

	public static com.pacnet.connect.model.SMAAdmins updateImpl(
		com.pacnet.connect.model.SMAAdmins smaAdmins, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImpl(smaAdmins, merge);
	}

	/**
	* Returns the s m a admins with the primary key or throws a
	* {@link com.pacnet.connect.NoSuchSMAAdminsException} if it could not be
	* found.
	*
	* @param id
	the primary key of the s m a admins
	* @return the s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException
	if a s m a admins with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getService().findByPrimaryKey(id);
	}

	/**
	* Returns the s m a admins with the primary key or returns
	* <code>null</code> if it could not be found.
	*
	* @param id
	the primary key of the s m a admins
	* @return the s m a admins, or <code>null</code> if a s m a admins with the
	primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the s m a adminses where isActive = &#63; and companyId =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @return the matching s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByCompanyId(
		int isActive, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMAAdminsListByCompanyId(isActive, companyId);
	}

	/**
	* Returns a range of all the s m a adminses where isActive = &#63; and
	* companyId = &#63;.
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
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @param start
	the lower bound of the range of s m a adminses
	* @param end
	the upper bound of the range of s m a adminses (not inclusive)
	* @return the range of matching s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByCompanyId(
		int isActive, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMAAdminsListByCompanyId(isActive, companyId, start,
			end);
	}

	/**
	* Returns an ordered range of all the s m a adminses where isActive = &#63;
	* and companyId = &#63;.
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
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @param start
	the lower bound of the range of s m a adminses
	* @param end
	the upper bound of the range of s m a adminses (not inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByCompanyId(
		int isActive, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMAAdminsListByCompanyId(isActive, companyId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63;
	* and companyId = &#63;.
	*
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException
	if a matching s m a admins could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByCompanyId_First(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getService()
				   .findBySMAAdminsListByCompanyId_First(isActive, companyId,
			orderByComparator);
	}

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63;
	* and companyId = &#63;.
	*
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a admins, or <code>null</code> if a
	matching s m a admins could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByCompanyId_First(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMAAdminsListByCompanyId_First(isActive, companyId,
			orderByComparator);
	}

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63;
	* and companyId = &#63;.
	*
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException
	if a matching s m a admins could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByCompanyId_Last(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getService()
				   .findBySMAAdminsListByCompanyId_Last(isActive, companyId,
			orderByComparator);
	}

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63;
	* and companyId = &#63;.
	*
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a admins, or <code>null</code> if a
	matching s m a admins could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByCompanyId_Last(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMAAdminsListByCompanyId_Last(isActive, companyId,
			orderByComparator);
	}

	/**
	* Returns the s m a adminses before and after the current s m a admins in
	* the ordered set where isActive = &#63; and companyId = &#63;.
	*
	* @param id
	the primary key of the current s m a admins
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException
	if a s m a admins with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins[] findBySMAAdminsListByCompanyId_PrevAndNext(
		long id, int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getService()
				   .findBySMAAdminsListByCompanyId_PrevAndNext(id, isActive,
			companyId, orderByComparator);
	}

	/**
	* Returns all the s m a adminses where isActive = &#63; and userId = &#63;.
	*
	* @param isActive
	the is active
	* @param userId
	the user ID
	* @return the matching s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByUserId(
		int isActive, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMAAdminsListByUserId(isActive, userId);
	}

	/**
	* Returns a range of all the s m a adminses where isActive = &#63; and
	* userId = &#63;.
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
	* @param isActive
	the is active
	* @param userId
	the user ID
	* @param start
	the lower bound of the range of s m a adminses
	* @param end
	the upper bound of the range of s m a adminses (not inclusive)
	* @return the range of matching s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByUserId(
		int isActive, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMAAdminsListByUserId(isActive, userId, start, end);
	}

	/**
	* Returns an ordered range of all the s m a adminses where isActive = &#63;
	* and userId = &#63;.
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
	* @param isActive
	the is active
	* @param userId
	the user ID
	* @param start
	the lower bound of the range of s m a adminses
	* @param end
	the upper bound of the range of s m a adminses (not inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByUserId(
		int isActive, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMAAdminsListByUserId(isActive, userId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63;
	* and userId = &#63;.
	*
	* @param isActive
	the is active
	* @param userId
	the user ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException
	if a matching s m a admins could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByUserId_First(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getService()
				   .findBySMAAdminsListByUserId_First(isActive, userId,
			orderByComparator);
	}

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63;
	* and userId = &#63;.
	*
	* @param isActive
	the is active
	* @param userId
	the user ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a admins, or <code>null</code> if a
	matching s m a admins could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByUserId_First(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMAAdminsListByUserId_First(isActive, userId,
			orderByComparator);
	}

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63;
	* and userId = &#63;.
	*
	* @param isActive
	the is active
	* @param userId
	the user ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException
	if a matching s m a admins could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByUserId_Last(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getService()
				   .findBySMAAdminsListByUserId_Last(isActive, userId,
			orderByComparator);
	}

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63;
	* and userId = &#63;.
	*
	* @param isActive
	the is active
	* @param userId
	the user ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a admins, or <code>null</code> if a
	matching s m a admins could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByUserId_Last(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMAAdminsListByUserId_Last(isActive, userId,
			orderByComparator);
	}

	/**
	* Returns the s m a adminses before and after the current s m a admins in
	* the ordered set where isActive = &#63; and userId = &#63;.
	*
	* @param id
	the primary key of the current s m a admins
	* @param isActive
	the is active
	* @param userId
	the user ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException
	if a s m a admins with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins[] findBySMAAdminsListByUserId_PrevAndNext(
		long id, int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getService()
				   .findBySMAAdminsListByUserId_PrevAndNext(id, isActive,
			userId, orderByComparator);
	}

	/**
	* Returns all the s m a adminses where isActive = &#63; and radcheckId =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @return the matching s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckId(
		int isActive, long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMAAdminsListByRadcheckId(isActive, radcheckId);
	}

	/**
	* Returns a range of all the s m a adminses where isActive = &#63; and
	* radcheckId = &#63;.
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
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @param start
	the lower bound of the range of s m a adminses
	* @param end
	the upper bound of the range of s m a adminses (not inclusive)
	* @return the range of matching s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckId(
		int isActive, long radcheckId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMAAdminsListByRadcheckId(isActive, radcheckId,
			start, end);
	}

	/**
	* Returns an ordered range of all the s m a adminses where isActive = &#63;
	* and radcheckId = &#63;.
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
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @param start
	the lower bound of the range of s m a adminses
	* @param end
	the upper bound of the range of s m a adminses (not inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckId(
		int isActive, long radcheckId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMAAdminsListByRadcheckId(isActive, radcheckId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63;
	* and radcheckId = &#63;.
	*
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException
	if a matching s m a admins could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByRadcheckId_First(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getService()
				   .findBySMAAdminsListByRadcheckId_First(isActive, radcheckId,
			orderByComparator);
	}

	/**
	* Returns the first s m a admins in the ordered set where isActive = &#63;
	* and radcheckId = &#63;.
	*
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a admins, or <code>null</code> if a
	matching s m a admins could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByRadcheckId_First(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMAAdminsListByRadcheckId_First(isActive,
			radcheckId, orderByComparator);
	}

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63;
	* and radcheckId = &#63;.
	*
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException
	if a matching s m a admins could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByRadcheckId_Last(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getService()
				   .findBySMAAdminsListByRadcheckId_Last(isActive, radcheckId,
			orderByComparator);
	}

	/**
	* Returns the last s m a admins in the ordered set where isActive = &#63;
	* and radcheckId = &#63;.
	*
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a admins, or <code>null</code> if a
	matching s m a admins could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByRadcheckId_Last(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMAAdminsListByRadcheckId_Last(isActive, radcheckId,
			orderByComparator);
	}

	/**
	* Returns the s m a adminses before and after the current s m a admins in
	* the ordered set where isActive = &#63; and radcheckId = &#63;.
	*
	* @param id
	the primary key of the current s m a admins
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a admins
	* @throws com.pacnet.connect.NoSuchSMAAdminsException
	if a s m a admins with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAAdmins[] findBySMAAdminsListByRadcheckId_PrevAndNext(
		long id, int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException {
		return getService()
				   .findBySMAAdminsListByRadcheckId_PrevAndNext(id, isActive,
			radcheckId, orderByComparator);
	}

	/**
	* Returns all the s m a adminses.
	*
	* @return the s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll();
	}

	/**
	* Returns a range of all the s m a adminses.
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
	the lower bound of the range of s m a adminses
	* @param end
	the upper bound of the range of s m a adminses (not inclusive)
	* @return the range of s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the s m a adminses.
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
	the lower bound of the range of s m a adminses
	* @param end
	the upper bound of the range of s m a adminses (not inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAAdmins> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the s m a adminses where isActive = &#63; and companyId =
	* &#63; from the database.
	*
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeBySMAAdminsListByCompanyId(int isActive,
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMAAdminsListByCompanyId(isActive, companyId);
	}

	/**
	* Removes all the s m a adminses where isActive = &#63; and userId = &#63;
	* from the database.
	*
	* @param isActive
	the is active
	* @param userId
	the user ID
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeBySMAAdminsListByUserId(int isActive, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMAAdminsListByUserId(isActive, userId);
	}

	/**
	* Removes all the s m a adminses where isActive = &#63; and radcheckId =
	* &#63; from the database.
	*
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeBySMAAdminsListByRadcheckId(int isActive,
		long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMAAdminsListByRadcheckId(isActive, radcheckId);
	}

	/**
	* Removes all the s m a adminses from the database.
	*
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeAll();
	}

	/**
	* Returns the number of s m a adminses where isActive = &#63; and companyId
	* = &#63;.
	*
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @return the number of matching s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countBySMAAdminsListByCompanyId(int isActive,
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countBySMAAdminsListByCompanyId(isActive, companyId);
	}

	/**
	* Returns the number of s m a adminses where isActive = &#63; and userId =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param userId
	the user ID
	* @return the number of matching s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countBySMAAdminsListByUserId(int isActive, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countBySMAAdminsListByUserId(isActive, userId);
	}

	/**
	* Returns the number of s m a adminses where isActive = &#63; and
	* radcheckId = &#63;.
	*
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @return the number of matching s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countBySMAAdminsListByRadcheckId(int isActive,
		long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countBySMAAdminsListByRadcheckId(isActive, radcheckId);
	}

	/**
	* Returns the number of s m a adminses where isActive = &#63; and
	* radcheckId = &#63; and userId = &#63; and companyId = &#63;.
	*
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @param userId
	the user ID
	* @param companyId
	the company ID
	* @return the number of matching s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countBySMAAdminsListByRadcheckIdUserIdCompanyId(
		int isActive, long radcheckId, long userId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countBySMAAdminsListByRadcheckIdUserIdCompanyId(isActive,
			radcheckId, userId, companyId);
	}

	/**
	* Returns the number of s m a adminses.
	*
	* @return the number of s m a adminses
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

	public static SMAAdminsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SMAAdminsLocalService.class.getName());

			if (invokableLocalService instanceof SMAAdminsLocalService) {
				_service = (SMAAdminsLocalService)invokableLocalService;
			}
			else {
				_service = new SMAAdminsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(SMAAdminsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(SMAAdminsLocalService service) {
	}

	private static SMAAdminsLocalService _service;
}