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
 * The interface for the s m a admins local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see SMAAdminsLocalServiceUtil
 * @see com.pacnet.connect.service.base.SMAAdminsLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.SMAAdminsLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface SMAAdminsLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SMAAdminsLocalServiceUtil} to access the s m a admins local service. Add custom service methods to {@link com.pacnet.connect.service.impl.SMAAdminsLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the s m a admins to the database. Also notifies the appropriate model listeners.
	*
	* @param smaAdmins the s m a admins
	* @return the s m a admins that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins addSMAAdmins(
		com.pacnet.connect.model.SMAAdmins smaAdmins)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new s m a admins with the primary key. Does not add the s m a admins to the database.
	*
	* @param id the primary key for the new s m a admins
	* @return the new s m a admins
	*/
	public com.pacnet.connect.model.SMAAdmins createSMAAdmins(long id);

	/**
	* Deletes the s m a admins with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a admins
	* @return the s m a admins that was removed
	* @throws PortalException if a s m a admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins deleteSMAAdmins(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the s m a admins from the database. Also notifies the appropriate model listeners.
	*
	* @param smaAdmins the s m a admins
	* @return the s m a admins that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins deleteSMAAdmins(
		com.pacnet.connect.model.SMAAdmins smaAdmins)
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
	public com.pacnet.connect.model.SMAAdmins fetchSMAAdmins(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a admins with the primary key.
	*
	* @param id the primary key of the s m a admins
	* @return the s m a admins
	* @throws PortalException if a s m a admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMAAdmins getSMAAdmins(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.pacnet.connect.model.SMAAdmins> getSMAAdminses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a adminses.
	*
	* @return the number of s m a adminses
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getSMAAdminsesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the s m a admins in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaAdmins the s m a admins
	* @return the s m a admins that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins updateSMAAdmins(
		com.pacnet.connect.model.SMAAdmins smaAdmins)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the s m a admins in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaAdmins the s m a admins
	* @param merge whether to merge the s m a admins with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s m a admins that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMAAdmins updateSMAAdmins(
		com.pacnet.connect.model.SMAAdmins smaAdmins, boolean merge)
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
	public void clearCache(com.pacnet.connect.model.SMAAdmins smaAdmins);

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int)
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int, OrderByComparator)
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean)
	*/
	public com.pacnet.connect.model.SMAAdmins update(
		com.pacnet.connect.model.SMAAdmins smaAdmins, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean, ServiceContext)
	*/
	public com.pacnet.connect.model.SMAAdmins update(
		com.pacnet.connect.model.SMAAdmins smaAdmins, boolean merge,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the s m a admins in the entity cache if it is enabled.
	*
	* @param smaAdmins
	the s m a admins
	*/
	public void cacheResult(com.pacnet.connect.model.SMAAdmins smaAdmins);

	/**
	* Caches the s m a adminses in the entity cache if it is enabled.
	*
	* @param smaAdminses
	the s m a adminses
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SMAAdmins> smaAdminses);

	/**
	* Creates a new s m a admins with the primary key. Does not add the s m a
	* admins to the database.
	*
	* @param id
	the primary key for the new s m a admins
	* @return the new s m a admins
	*/
	public com.pacnet.connect.model.SMAAdmins create(long id);

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
	public com.pacnet.connect.model.SMAAdmins remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	public com.pacnet.connect.model.SMAAdmins updateImpl(
		com.pacnet.connect.model.SMAAdmins smaAdmins, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.SMAAdmins findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMAAdmins fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByCompanyId(
		int isActive, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByCompanyId(
		int isActive, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByCompanyId(
		int isActive, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByCompanyId_First(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByCompanyId_First(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByCompanyId_Last(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByCompanyId_Last(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.SMAAdmins[] findBySMAAdminsListByCompanyId_PrevAndNext(
		long id, int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

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
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByUserId(
		int isActive, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByUserId(
		int isActive, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByUserId(
		int isActive, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByUserId_First(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByUserId_First(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByUserId_Last(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByUserId_Last(
		int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.SMAAdmins[] findBySMAAdminsListByUserId_PrevAndNext(
		long id, int isActive, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

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
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckId(
		int isActive, long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckId(
		int isActive, long radcheckId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findBySMAAdminsListByRadcheckId(
		int isActive, long radcheckId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByRadcheckId_First(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByRadcheckId_First(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.SMAAdmins findBySMAAdminsListByRadcheckId_Last(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMAAdmins fetchBySMAAdminsListByRadcheckId_Last(
		int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.pacnet.connect.model.SMAAdmins[] findBySMAAdminsListByRadcheckId_PrevAndNext(
		long id, int isActive, long radcheckId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAAdminsException;

	/**
	* Returns all the s m a adminses.
	*
	* @return the s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.pacnet.connect.model.SMAAdmins> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public void removeBySMAAdminsListByCompanyId(int isActive, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public void removeBySMAAdminsListByUserId(int isActive, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public void removeBySMAAdminsListByRadcheckId(int isActive, long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a adminses from the database.
	*
	* @throws SystemException
	if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countBySMAAdminsListByCompanyId(int isActive, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countBySMAAdminsListByUserId(int isActive, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countBySMAAdminsListByRadcheckId(int isActive, long radcheckId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countBySMAAdminsListByRadcheckIdUserIdCompanyId(int isActive,
		long radcheckId, long userId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a adminses.
	*
	* @return the number of s m a adminses
	* @throws SystemException
	if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}