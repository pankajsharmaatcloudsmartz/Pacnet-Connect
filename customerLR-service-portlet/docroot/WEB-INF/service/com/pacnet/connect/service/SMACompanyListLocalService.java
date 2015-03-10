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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the s m a company list local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see SMACompanyListLocalServiceUtil
 * @see com.pacnet.connect.service.base.SMACompanyListLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.SMACompanyListLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface SMACompanyListLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SMACompanyListLocalServiceUtil} to access the s m a company list local service. Add custom service methods to {@link com.pacnet.connect.service.impl.SMACompanyListLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the s m a company list to the database. Also notifies the appropriate model listeners.
	*
	* @param smaCompanyList the s m a company list
	* @return the s m a company list that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList addSMACompanyList(
		com.pacnet.connect.model.SMACompanyList smaCompanyList)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new s m a company list with the primary key. Does not add the s m a company list to the database.
	*
	* @param id the primary key for the new s m a company list
	* @return the new s m a company list
	*/
	public com.pacnet.connect.model.SMACompanyList createSMACompanyList(
		java.lang.String id);

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
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the s m a company list from the database. Also notifies the appropriate model listeners.
	*
	* @param smaCompanyList the s m a company list
	* @return the s m a company list that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList deleteSMACompanyList(
		com.pacnet.connect.model.SMACompanyList smaCompanyList)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanyList fetchSMACompanyList(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a company list with the primary key.
	*
	* @param id the primary key of the s m a company list
	* @return the s m a company list
	* @throws PortalException if a s m a company list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanyList getSMACompanyList(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.pacnet.connect.model.SMACompanyList> getSMACompanyLists(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a company lists.
	*
	* @return the number of s m a company lists
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getSMACompanyListsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the s m a company list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaCompanyList the s m a company list
	* @return the s m a company list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanyList updateSMACompanyList(
		com.pacnet.connect.model.SMACompanyList smaCompanyList)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	*/
	public void clearCache();

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	*/
	public void clearCache(
		com.pacnet.connect.model.SMACompanyList smaCompanyList);

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int)
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int, OrderByComparator)
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean)
	*/
	public com.pacnet.connect.model.SMACompanyList update(
		com.pacnet.connect.model.SMACompanyList smaCompanyList, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean, ServiceContext)
	*/
	public com.pacnet.connect.model.SMACompanyList update(
		com.pacnet.connect.model.SMACompanyList smaCompanyList, boolean merge,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the s m a company list in the entity cache if it is enabled.
	*
	* @param smaCompanyList
	the s m a company list
	*/
	public void cacheResult(
		com.pacnet.connect.model.SMACompanyList smaCompanyList);

	/**
	* Caches the s m a company lists in the entity cache if it is enabled.
	*
	* @param smaCompanyLists
	the s m a company lists
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SMACompanyList> smaCompanyLists);

	/**
	* Creates a new s m a company list with the primary key. Does not add the s
	* m a company list to the database.
	*
	* @param id
	the primary key for the new s m a company list
	* @return the new s m a company list
	*/
	public com.pacnet.connect.model.SMACompanyList create(java.lang.String id);

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
			com.pacnet.connect.NoSuchSMACompanyListException;

	public com.pacnet.connect.model.SMACompanyList updateImpl(
		com.pacnet.connect.model.SMACompanyList smaCompanyList, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

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
			com.pacnet.connect.NoSuchSMACompanyListException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanyList fetchByPrimaryKey(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
			com.pacnet.connect.NoSuchSMACompanyListException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByAdminUserId_First(
		long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
			com.pacnet.connect.NoSuchSMACompanyListException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByAdminUserId_Last(
		long adminUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
			com.pacnet.connect.NoSuchSMACompanyListException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
			com.pacnet.connect.NoSuchSMACompanyListException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
			com.pacnet.connect.NoSuchSMACompanyListException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
			com.pacnet.connect.NoSuchSMACompanyListException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
			com.pacnet.connect.NoSuchSMACompanyListException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
			com.pacnet.connect.NoSuchSMACompanyListException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
			com.pacnet.connect.NoSuchSMACompanyListException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
			com.pacnet.connect.NoSuchSMACompanyListException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByDomains_First(
		java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
			com.pacnet.connect.NoSuchSMACompanyListException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanyList fetchBySMACompanyListByDomains_Last(
		java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
			com.pacnet.connect.NoSuchSMACompanyListException;

	/**
	* Returns all the s m a company lists.
	*
	* @return the s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanyList> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a company lists from the database.
	*
	* @throws SystemException
	if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a company lists.
	*
	* @return the number of s m a company lists
	* @throws SystemException
	if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}