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
 * The utility for the s m a radacct local service. This utility wraps {@link com.pacnet.connect.service.impl.SMARadacctLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see SMARadacctLocalService
 * @see com.pacnet.connect.service.base.SMARadacctLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.SMARadacctLocalServiceImpl
 * @generated
 */
public class SMARadacctLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.SMARadacctLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the s m a radacct to the database. Also notifies the appropriate model listeners.
	*
	* @param smaRadacct the s m a radacct
	* @return the s m a radacct that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct addSMARadacct(
		com.pacnet.connect.model.SMARadacct smaRadacct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSMARadacct(smaRadacct);
	}

	/**
	* Creates a new s m a radacct with the primary key. Does not add the s m a radacct to the database.
	*
	* @param radAcctId the primary key for the new s m a radacct
	* @return the new s m a radacct
	*/
	public static com.pacnet.connect.model.SMARadacct createSMARadacct(
		long radAcctId) {
		return getService().createSMARadacct(radAcctId);
	}

	/**
	* Deletes the s m a radacct with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param radAcctId the primary key of the s m a radacct
	* @return the s m a radacct that was removed
	* @throws PortalException if a s m a radacct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct deleteSMARadacct(
		long radAcctId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSMARadacct(radAcctId);
	}

	/**
	* Deletes the s m a radacct from the database. Also notifies the appropriate model listeners.
	*
	* @param smaRadacct the s m a radacct
	* @return the s m a radacct that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct deleteSMARadacct(
		com.pacnet.connect.model.SMARadacct smaRadacct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSMARadacct(smaRadacct);
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

	public static com.pacnet.connect.model.SMARadacct fetchSMARadacct(
		long radAcctId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSMARadacct(radAcctId);
	}

	/**
	* Returns the s m a radacct with the primary key.
	*
	* @param radAcctId the primary key of the s m a radacct
	* @return the s m a radacct
	* @throws PortalException if a s m a radacct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct getSMARadacct(
		long radAcctId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMARadacct(radAcctId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.pacnet.connect.model.SMARadacct> getSMARadaccts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMARadaccts(start, end);
	}

	/**
	* Returns the number of s m a radaccts.
	*
	* @return the number of s m a radaccts
	* @throws SystemException if a system exception occurred
	*/
	public static int getSMARadacctsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMARadacctsCount();
	}

	/**
	* Updates the s m a radacct in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaRadacct the s m a radacct
	* @return the s m a radacct that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct updateSMARadacct(
		com.pacnet.connect.model.SMARadacct smaRadacct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSMARadacct(smaRadacct);
	}

	/**
	* Updates the s m a radacct in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaRadacct the s m a radacct
	* @param merge whether to merge the s m a radacct with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s m a radacct that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct updateSMARadacct(
		com.pacnet.connect.model.SMARadacct smaRadacct, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSMARadacct(smaRadacct, merge);
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
		com.pacnet.connect.model.SMARadacct smaRadacct) {
		getService().clearCache(smaRadacct);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	*/
	public static java.util.List<com.pacnet.connect.model.SMARadacct> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findWithDynamicQuery(dynamicQuery);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int)
	*/
	public static java.util.List<com.pacnet.connect.model.SMARadacct> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int, OrderByComparator)
	*/
	public static java.util.List<com.pacnet.connect.model.SMARadacct> findWithDynamicQuery(
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
	public static com.pacnet.connect.model.SMARadacct update(
		com.pacnet.connect.model.SMARadacct smaRadacct, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().update(smaRadacct, merge);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean, ServiceContext)
	*/
	public static com.pacnet.connect.model.SMARadacct update(
		com.pacnet.connect.model.SMARadacct smaRadacct, boolean merge,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().update(smaRadacct, merge, serviceContext);
	}

	/**
	* Caches the s m a radacct in the entity cache if it is enabled.
	*
	* @param smaRadacct
	the s m a radacct
	*/
	public static void cacheResult(
		com.pacnet.connect.model.SMARadacct smaRadacct) {
		getService().cacheResult(smaRadacct);
	}

	/**
	* Caches the s m a radaccts in the entity cache if it is enabled.
	*
	* @param smaRadaccts
	the s m a radaccts
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.SMARadacct> smaRadaccts) {
		getService().cacheResult(smaRadaccts);
	}

	/**
	* Creates a new s m a radacct with the primary key. Does not add the s m a
	* radacct to the database.
	*
	* @param radAcctId
	the primary key for the new s m a radacct
	* @return the new s m a radacct
	*/
	public static com.pacnet.connect.model.SMARadacct create(long radAcctId) {
		return getService().create(radAcctId);
	}

	/**
	* Removes the s m a radacct with the primary key from the database. Also
	* notifies the appropriate model listeners.
	*
	* @param radAcctId
	the primary key of the s m a radacct
	* @return the s m a radacct that was removed
	* @throws com.pacnet.connect.NoSuchSMARadacctException
	if a s m a radacct with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct remove(long radAcctId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadacctException {
		return getService().remove(radAcctId);
	}

	public static com.pacnet.connect.model.SMARadacct updateImpl(
		com.pacnet.connect.model.SMARadacct smaRadacct, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImpl(smaRadacct, merge);
	}

	/**
	* Returns the s m a radacct with the primary key or throws a
	* {@link com.pacnet.connect.NoSuchSMARadacctException} if it could not be
	* found.
	*
	* @param radAcctId
	the primary key of the s m a radacct
	* @return the s m a radacct
	* @throws com.pacnet.connect.NoSuchSMARadacctException
	if a s m a radacct with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct findByPrimaryKey(
		long radAcctId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadacctException {
		return getService().findByPrimaryKey(radAcctId);
	}

	/**
	* Returns the s m a radacct with the primary key or returns
	* <code>null</code> if it could not be found.
	*
	* @param radAcctId
	the primary key of the s m a radacct
	* @return the s m a radacct, or <code>null</code> if a s m a radacct with
	the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct fetchByPrimaryKey(
		long radAcctId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchByPrimaryKey(radAcctId);
	}

	/**
	* Returns all the s m a radaccts where isActive = &#63; and radcheckId =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @return the matching s m a radaccts
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMARadacct> findBySMAActivityListByRadcheckId(
		int isActive, long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMAActivityListByRadcheckId(isActive, radcheckId);
	}

	/**
	* Returns a range of all the s m a radaccts where isActive = &#63; and
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
	the lower bound of the range of s m a radaccts
	* @param end
	the upper bound of the range of s m a radaccts (not inclusive)
	* @return the range of matching s m a radaccts
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMARadacct> findBySMAActivityListByRadcheckId(
		int isActive, long radcheckId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMAActivityListByRadcheckId(isActive, radcheckId,
			start, end);
	}

	/**
	* Returns an ordered range of all the s m a radaccts where isActive = &#63;
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
	the lower bound of the range of s m a radaccts
	* @param end
	the upper bound of the range of s m a radaccts (not inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a radaccts
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMARadacct> findBySMAActivityListByRadcheckId(
		int isActive, long radcheckId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMAActivityListByRadcheckId(isActive, radcheckId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first s m a radacct in the ordered set where isActive = &#63;
	* and radcheckId = &#63;.
	*
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a radacct
	* @throws com.pacnet.connect.NoSuchSMARadacctException
	if a matching s m a radacct could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct findBySMAActivityListByRadcheckId_First(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadacctException {
		return getService()
				   .findBySMAActivityListByRadcheckId_First(isActive,
			radcheckId, orderByComparator);
	}

	/**
	* Returns the first s m a radacct in the ordered set where isActive = &#63;
	* and radcheckId = &#63;.
	*
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a radacct, or <code>null</code> if a
	matching s m a radacct could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct fetchBySMAActivityListByRadcheckId_First(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMAActivityListByRadcheckId_First(isActive,
			radcheckId, orderByComparator);
	}

	/**
	* Returns the last s m a radacct in the ordered set where isActive = &#63;
	* and radcheckId = &#63;.
	*
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a radacct
	* @throws com.pacnet.connect.NoSuchSMARadacctException
	if a matching s m a radacct could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct findBySMAActivityListByRadcheckId_Last(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadacctException {
		return getService()
				   .findBySMAActivityListByRadcheckId_Last(isActive,
			radcheckId, orderByComparator);
	}

	/**
	* Returns the last s m a radacct in the ordered set where isActive = &#63;
	* and radcheckId = &#63;.
	*
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a radacct, or <code>null</code> if a
	matching s m a radacct could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct fetchBySMAActivityListByRadcheckId_Last(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMAActivityListByRadcheckId_Last(isActive,
			radcheckId, orderByComparator);
	}

	/**
	* Returns the s m a radaccts before and after the current s m a radacct in
	* the ordered set where isActive = &#63; and radcheckId = &#63;.
	*
	* @param radAcctId
	the primary key of the current s m a radacct
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a radacct
	* @throws com.pacnet.connect.NoSuchSMARadacctException
	if a s m a radacct with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMARadacct[] findBySMAActivityListByRadcheckId_PrevAndNext(
		long radAcctId, int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadacctException {
		return getService()
				   .findBySMAActivityListByRadcheckId_PrevAndNext(radAcctId,
			isActive, radcheckId, orderByComparator);
	}

	/**
	* Returns all the s m a radaccts.
	*
	* @return the s m a radaccts
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMARadacct> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll();
	}

	/**
	* Returns a range of all the s m a radaccts.
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
	the lower bound of the range of s m a radaccts
	* @param end
	the upper bound of the range of s m a radaccts (not inclusive)
	* @return the range of s m a radaccts
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMARadacct> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the s m a radaccts.
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
	the lower bound of the range of s m a radaccts
	* @param end
	the upper bound of the range of s m a radaccts (not inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of s m a radaccts
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMARadacct> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the s m a radaccts where isActive = &#63; and radcheckId =
	* &#63; from the database.
	*
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeBySMAActivityListByRadcheckId(int isActive,
		long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMAActivityListByRadcheckId(isActive, radcheckId);
	}

	/**
	* Removes all the s m a radaccts from the database.
	*
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeAll();
	}

	/**
	* Returns the number of s m a radaccts where isActive = &#63; and
	* radcheckId = &#63;.
	*
	* @param isActive
	the is active
	* @param radcheckId
	the radcheck ID
	* @return the number of matching s m a radaccts
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countBySMAActivityListByRadcheckId(int isActive,
		long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countBySMAActivityListByRadcheckId(isActive, radcheckId);
	}

	/**
	* Returns the number of s m a radaccts.
	*
	* @return the number of s m a radaccts
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

	public static SMARadacctLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SMARadacctLocalService.class.getName());

			if (invokableLocalService instanceof SMARadacctLocalService) {
				_service = (SMARadacctLocalService)invokableLocalService;
			}
			else {
				_service = new SMARadacctLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(SMARadacctLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(SMARadacctLocalService service) {
	}

	private static SMARadacctLocalService _service;
}