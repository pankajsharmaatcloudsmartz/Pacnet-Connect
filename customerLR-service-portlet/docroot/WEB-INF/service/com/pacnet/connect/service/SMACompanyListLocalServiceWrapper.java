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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link SMACompanyListLocalService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMACompanyListLocalService
 * @generated
 */
public class SMACompanyListLocalServiceWrapper
	implements SMACompanyListLocalService,
		ServiceWrapper<SMACompanyListLocalService> {
	public SMACompanyListLocalServiceWrapper(
		SMACompanyListLocalService smaCompanyListLocalService) {
		_smaCompanyListLocalService = smaCompanyListLocalService;
	}

	/**
	* Adds the s m a company list to the database. Also notifies the appropriate model listeners.
	*
	* @param smaCompanyList the s m a company list
	* @return the s m a company list that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList addSMACompanyList(
		com.pacnet.connect.model.SMACompanyList smaCompanyList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.addSMACompanyList(smaCompanyList);
	}

	/**
	* Creates a new s m a company list with the primary key. Does not add the s m a company list to the database.
	*
	* @param id the primary key for the new s m a company list
	* @return the new s m a company list
	*/
	public com.pacnet.connect.model.SMACompanyList createSMACompanyList(
		java.lang.String id) {
		return _smaCompanyListLocalService.createSMACompanyList(id);
	}

	/**
	* Deletes the s m a company list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a company list
	* @return the s m a company list that was removed
	* @throws PortalException if a s m a company list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList deleteSMACompanyList(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.deleteSMACompanyList(id);
	}

	/**
	* Deletes the s m a company list from the database. Also notifies the appropriate model listeners.
	*
	* @param smaCompanyList the s m a company list
	* @return the s m a company list that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList deleteSMACompanyList(
		com.pacnet.connect.model.SMACompanyList smaCompanyList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.deleteSMACompanyList(smaCompanyList);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _smaCompanyListLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.pacnet.connect.model.SMACompanyList fetchSMACompanyList(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.fetchSMACompanyList(id);
	}

	/**
	* Returns the s m a company list with the primary key.
	*
	* @param id the primary key of the s m a company list
	* @return the s m a company list
	* @throws PortalException if a s m a company list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList getSMACompanyList(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.getSMACompanyList(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.pacnet.connect.model.SMACompanyList> getSMACompanyLists(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.getSMACompanyLists(start, end);
	}

	/**
	* Returns the number of s m a company lists.
	*
	* @return the number of s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	public int getSMACompanyListsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.getSMACompanyListsCount();
	}

	/**
	* Updates the s m a company list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaCompanyList the s m a company list
	* @return the s m a company list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList updateSMACompanyList(
		com.pacnet.connect.model.SMACompanyList smaCompanyList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.updateSMACompanyList(smaCompanyList);
	}

	/**
	* Updates the s m a company list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaCompanyList the s m a company list
	* @param merge whether to merge the s m a company list with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s m a company list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList updateSMACompanyList(
		com.pacnet.connect.model.SMACompanyList smaCompanyList, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.updateSMACompanyList(smaCompanyList,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _smaCompanyListLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_smaCompanyListLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _smaCompanyListLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	*/
	public void clearCache() {
		_smaCompanyListLocalService.clearCache();
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	*/
	public void clearCache(
		com.pacnet.connect.model.SMACompanyList smaCompanyList) {
		_smaCompanyListLocalService.clearCache(smaCompanyList);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findWithDynamicQuery(dynamicQuery);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int)
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int, OrderByComparator)
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean)
	*/
	public com.pacnet.connect.model.SMACompanyList update(
		com.pacnet.connect.model.SMACompanyList smaCompanyList, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.update(smaCompanyList, merge);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean, ServiceContext)
	*/
	public com.pacnet.connect.model.SMACompanyList update(
		com.pacnet.connect.model.SMACompanyList smaCompanyList, boolean merge,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.update(smaCompanyList, merge,
			serviceContext);
	}

	/**
	* Caches the s m a company list in the entity cache if it is enabled.
	*
	* @param smaCompanyList
	the s m a company list
	*/
	public void cacheResult(
		com.pacnet.connect.model.SMACompanyList smaCompanyList) {
		_smaCompanyListLocalService.cacheResult(smaCompanyList);
	}

	/**
	* Caches the s m a company lists in the entity cache if it is enabled.
	*
	* @param smaCompanyLists
	the s m a company lists
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SMACompanyList> smaCompanyLists) {
		_smaCompanyListLocalService.cacheResult(smaCompanyLists);
	}

	/**
	* Creates a new s m a company list with the primary key. Does not add the s
	* m a company list to the database.
	*
	* @param id
	the primary key for the new s m a company list
	* @return the new s m a company list
	*/
	public com.pacnet.connect.model.SMACompanyList create(java.lang.String id) {
		return _smaCompanyListLocalService.create(id);
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
	public com.pacnet.connect.model.SMACompanyList remove(java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return _smaCompanyListLocalService.remove(id);
	}

	public com.pacnet.connect.model.SMACompanyList updateImpl(
		com.pacnet.connect.model.SMACompanyList smaCompanyList, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.updateImpl(smaCompanyList, merge);
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
	public com.pacnet.connect.model.SMACompanyList findByPrimaryKey(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return _smaCompanyListLocalService.findByPrimaryKey(id);
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
	public com.pacnet.connect.model.SMACompanyList fetchByPrimaryKey(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.fetchByPrimaryKey(id);
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
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByAdminUserId(
		long adminUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findBySMACompanyListByAdminUserId(adminUserId);
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
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByAdminUserId(
		long adminUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findBySMACompanyListByAdminUserId(adminUserId,
			start, end);
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
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByAdminUserId(
		long adminUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findBySMACompanyListByAdminUserId(adminUserId,
			start, end, orderByComparator);
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
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByAdminUserId_First(
		long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return _smaCompanyListLocalService.findBySMACompanyListByAdminUserId_First(adminUserId,
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
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByAdminUserId_First(
		long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.fetchBySMACompanyListByAdminUserId_First(adminUserId,
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
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByAdminUserId_Last(
		long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return _smaCompanyListLocalService.findBySMACompanyListByAdminUserId_Last(adminUserId,
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
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByAdminUserId_Last(
		long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.fetchBySMACompanyListByAdminUserId_Last(adminUserId,
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
	public com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByAdminUserId_PrevAndNext(
		java.lang.String id, long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return _smaCompanyListLocalService.findBySMACompanyListByAdminUserId_PrevAndNext(id,
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
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findBySMACompanyListByCompanyId(companyId);
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
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findBySMACompanyListByCompanyId(companyId,
			start, end);
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
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findBySMACompanyListByCompanyId(companyId,
			start, end, orderByComparator);
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
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return _smaCompanyListLocalService.findBySMACompanyListByCompanyId_First(companyId,
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
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.fetchBySMACompanyListByCompanyId_First(companyId,
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
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return _smaCompanyListLocalService.findBySMACompanyListByCompanyId_Last(companyId,
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
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.fetchBySMACompanyListByCompanyId_Last(companyId,
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
	public com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByCompanyId_PrevAndNext(
		java.lang.String id, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return _smaCompanyListLocalService.findBySMACompanyListByCompanyId_PrevAndNext(id,
			companyId, orderByComparator);
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
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCustomerId(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findBySMACompanyListByCustomerId(customerId);
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
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCustomerId(
		long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findBySMACompanyListByCustomerId(customerId,
			start, end);
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
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByCustomerId(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findBySMACompanyListByCustomerId(customerId,
			start, end, orderByComparator);
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
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return _smaCompanyListLocalService.findBySMACompanyListByCustomerId_First(customerId,
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
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.fetchBySMACompanyListByCustomerId_First(customerId,
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
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return _smaCompanyListLocalService.findBySMACompanyListByCustomerId_Last(customerId,
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
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.fetchBySMACompanyListByCustomerId_Last(customerId,
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
	public com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByCustomerId_PrevAndNext(
		java.lang.String id, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return _smaCompanyListLocalService.findBySMACompanyListByCustomerId_PrevAndNext(id,
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
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByDomains(
		java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findBySMACompanyListByDomains(domains);
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
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByDomains(
		java.lang.String domains, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findBySMACompanyListByDomains(domains,
			start, end);
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
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findBySMACompanyListByDomains(
		java.lang.String domains, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findBySMACompanyListByDomains(domains,
			start, end, orderByComparator);
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
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByDomains_First(
		java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return _smaCompanyListLocalService.findBySMACompanyListByDomains_First(domains,
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
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByDomains_First(
		java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.fetchBySMACompanyListByDomains_First(domains,
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
	public com.pacnet.connect.model.SMACompanyList findBySMACompanyListByDomains_Last(
		java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return _smaCompanyListLocalService.findBySMACompanyListByDomains_Last(domains,
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
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByDomains_Last(
		java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.fetchBySMACompanyListByDomains_Last(domains,
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
	public com.pacnet.connect.model.SMACompanyList[] findBySMACompanyListByDomains_PrevAndNext(
		java.lang.String id, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompanyListException {
		return _smaCompanyListLocalService.findBySMACompanyListByDomains_PrevAndNext(id,
			domains, orderByComparator);
	}

	/**
	* Returns all the s m a company lists.
	*
	* @return the s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findAll();
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
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findAll(start, end);
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
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.findAll(start, end, orderByComparator);
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
	public void removeBySMACompanyListByAdminUserId(long adminUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_smaCompanyListLocalService.removeBySMACompanyListByAdminUserId(adminUserId);
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
	public void removeBySMACompanyListByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_smaCompanyListLocalService.removeBySMACompanyListByCompanyId(companyId);
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
	public void removeBySMACompanyListByCustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_smaCompanyListLocalService.removeBySMACompanyListByCustomerId(customerId);
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
	public void removeBySMACompanyListByDomains(java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		_smaCompanyListLocalService.removeBySMACompanyListByDomains(domains);
	}

	/**
	* Removes all the s m a company lists from the database.
	*
	* @throws SystemException
	if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		_smaCompanyListLocalService.removeAll();
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
	public int countBySMACompanyListByAdminUserId(long adminUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.countBySMACompanyListByAdminUserId(adminUserId);
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
	public int countBySMACompanyListByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.countBySMACompanyListByCompanyId(companyId);
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
	public int countBySMACompanyListByCustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.countBySMACompanyListByCustomerId(customerId);
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
	public int countBySMACompanyListByDomains(java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.countBySMACompanyListByDomains(domains);
	}

	/**
	* Returns the number of s m a company lists.
	*
	* @return the number of s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyListLocalService.countAll();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SMACompanyListLocalService getWrappedSMACompanyListLocalService() {
		return _smaCompanyListLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSMACompanyListLocalService(
		SMACompanyListLocalService smaCompanyListLocalService) {
		_smaCompanyListLocalService = smaCompanyListLocalService;
	}

	public SMACompanyListLocalService getWrappedService() {
		return _smaCompanyListLocalService;
	}

	public void setWrappedService(
		SMACompanyListLocalService smaCompanyListLocalService) {
		_smaCompanyListLocalService = smaCompanyListLocalService;
	}

	private SMACompanyListLocalService _smaCompanyListLocalService;
}