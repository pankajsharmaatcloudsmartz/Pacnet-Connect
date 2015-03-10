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
 * The interface for the s m a companies local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see SMACompaniesLocalServiceUtil
 * @see com.pacnet.connect.service.base.SMACompaniesLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.SMACompaniesLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface SMACompaniesLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SMACompaniesLocalServiceUtil} to access the s m a companies local service. Add custom service methods to {@link com.pacnet.connect.service.impl.SMACompaniesLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the s m a companies to the database. Also notifies the appropriate model listeners.
	*
	* @param smaCompanies the s m a companies
	* @return the s m a companies that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies addSMACompanies(
		com.pacnet.connect.model.SMACompanies smaCompanies)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new s m a companies with the primary key. Does not add the s m a companies to the database.
	*
	* @param id the primary key for the new s m a companies
	* @return the new s m a companies
	*/
	public com.pacnet.connect.model.SMACompanies createSMACompanies(long id);

	/**
	* Deletes the s m a companies with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a companies
	* @return the s m a companies that was removed
	* @throws PortalException if a s m a companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies deleteSMACompanies(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the s m a companies from the database. Also notifies the appropriate model listeners.
	*
	* @param smaCompanies the s m a companies
	* @return the s m a companies that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies deleteSMACompanies(
		com.pacnet.connect.model.SMACompanies smaCompanies)
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
	public com.pacnet.connect.model.SMACompanies fetchSMACompanies(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a companies with the primary key.
	*
	* @param id the primary key of the s m a companies
	* @return the s m a companies
	* @throws PortalException if a s m a companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanies getSMACompanies(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a companieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a companieses
	* @param end the upper bound of the range of s m a companieses (not inclusive)
	* @return the range of s m a companieses
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.pacnet.connect.model.SMACompanies> getSMACompanieses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a companieses.
	*
	* @return the number of s m a companieses
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getSMACompaniesesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the s m a companies in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaCompanies the s m a companies
	* @return the s m a companies that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies updateSMACompanies(
		com.pacnet.connect.model.SMACompanies smaCompanies)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the s m a companies in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaCompanies the s m a companies
	* @param merge whether to merge the s m a companies with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s m a companies that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies updateSMACompanies(
		com.pacnet.connect.model.SMACompanies smaCompanies, boolean merge)
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
	public void clearCache(com.pacnet.connect.model.SMACompanies smaCompanies);

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int)
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int, OrderByComparator)
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean)
	*/
	public com.pacnet.connect.model.SMACompanies update(
		com.pacnet.connect.model.SMACompanies smaCompanies, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean, ServiceContext)
	*/
	public com.pacnet.connect.model.SMACompanies update(
		com.pacnet.connect.model.SMACompanies smaCompanies, boolean merge,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the s m a companies in the entity cache if it is enabled.
	*
	* @param smaCompanies
	the s m a companies
	*/
	public void cacheResult(com.pacnet.connect.model.SMACompanies smaCompanies);

	/**
	* Caches the s m a companieses in the entity cache if it is enabled.
	*
	* @param smaCompanieses
	the s m a companieses
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SMACompanies> smaCompanieses);

	/**
	* Creates a new s m a companies with the primary key. Does not add the s m
	* a companies to the database.
	*
	* @param id
	the primary key for the new s m a companies
	* @return the new s m a companies
	*/
	public com.pacnet.connect.model.SMACompanies create(long id);

	/**
	* Removes the s m a companies with the primary key from the database. Also
	* notifies the appropriate model listeners.
	*
	* @param id
	the primary key of the s m a companies
	* @return the s m a companies that was removed
	* @throws com.pacnet.connect.NoSuchSMACompaniesException
	if a s m a companies with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException;

	public com.pacnet.connect.model.SMACompanies updateImpl(
		com.pacnet.connect.model.SMACompanies smaCompanies, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a companies with the primary key or throws a
	* {@link com.pacnet.connect.NoSuchSMACompaniesException} if it could not be
	* found.
	*
	* @param id
	the primary key of the s m a companies
	* @return the s m a companies
	* @throws com.pacnet.connect.NoSuchSMACompaniesException
	if a s m a companies with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException;

	/**
	* Returns the s m a companies with the primary key or returns
	* <code>null</code> if it could not be found.
	*
	* @param id
	the primary key of the s m a companies
	* @return the s m a companies, or <code>null</code> if a s m a companies
	with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanies fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the s m a companieses where isActive = &#63; and createdBy =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @return the matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findByGetAllCompanies(
		int isActive, java.lang.String createdBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a companieses where isActive = &#63; and
	* createdBy = &#63;.
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
	* @param createdBy
	the created by
	* @param start
	the lower bound of the range of s m a companieses
	* @param end
	the upper bound of the range of s m a companieses (not
	inclusive)
	* @return the range of matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findByGetAllCompanies(
		int isActive, java.lang.String createdBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a companieses where isActive =
	* &#63; and createdBy = &#63;.
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
	* @param createdBy
	the created by
	* @param start
	the lower bound of the range of s m a companieses
	* @param end
	the upper bound of the range of s m a companieses (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findByGetAllCompanies(
		int isActive, java.lang.String createdBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a companies in the ordered set where isActive =
	* &#63; and createdBy = &#63;.
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a companies
	* @throws com.pacnet.connect.NoSuchSMACompaniesException
	if a matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies findByGetAllCompanies_First(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException;

	/**
	* Returns the first s m a companies in the ordered set where isActive =
	* &#63; and createdBy = &#63;.
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a companies, or <code>null</code> if a
	matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanies fetchByGetAllCompanies_First(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a companies in the ordered set where isActive =
	* &#63; and createdBy = &#63;.
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a companies
	* @throws com.pacnet.connect.NoSuchSMACompaniesException
	if a matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies findByGetAllCompanies_Last(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException;

	/**
	* Returns the last s m a companies in the ordered set where isActive =
	* &#63; and createdBy = &#63;.
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a companies, or <code>null</code> if a
	matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanies fetchByGetAllCompanies_Last(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a companieses before and after the current s m a
	* companies in the ordered set where isActive = &#63; and createdBy =
	* &#63;.
	*
	* @param id
	the primary key of the current s m a companies
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a companies
	* @throws com.pacnet.connect.NoSuchSMACompaniesException
	if a s m a companies with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies[] findByGetAllCompanies_PrevAndNext(
		long id, int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException;

	/**
	* Returns all the s m a companieses where isActive = &#63; and customerId =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param customerId
	the customer ID
	* @return the matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByCustomerId(
		int isActive, long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a companieses where isActive = &#63; and
	* customerId = &#63;.
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
	* @param customerId
	the customer ID
	* @param start
	the lower bound of the range of s m a companieses
	* @param end
	the upper bound of the range of s m a companieses (not
	inclusive)
	* @return the range of matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByCustomerId(
		int isActive, long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a companieses where isActive =
	* &#63; and customerId = &#63;.
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
	* @param customerId
	the customer ID
	* @param start
	the lower bound of the range of s m a companieses
	* @param end
	the upper bound of the range of s m a companieses (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByCustomerId(
		int isActive, long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a companies in the ordered set where isActive =
	* &#63; and customerId = &#63;.
	*
	* @param isActive
	the is active
	* @param customerId
	the customer ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a companies
	* @throws com.pacnet.connect.NoSuchSMACompaniesException
	if a matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies findBySMACompanyListByCustomerId_First(
		int isActive, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException;

	/**
	* Returns the first s m a companies in the ordered set where isActive =
	* &#63; and customerId = &#63;.
	*
	* @param isActive
	the is active
	* @param customerId
	the customer ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a companies, or <code>null</code> if a
	matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByCustomerId_First(
		int isActive, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a companies in the ordered set where isActive =
	* &#63; and customerId = &#63;.
	*
	* @param isActive
	the is active
	* @param customerId
	the customer ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a companies
	* @throws com.pacnet.connect.NoSuchSMACompaniesException
	if a matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies findBySMACompanyListByCustomerId_Last(
		int isActive, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException;

	/**
	* Returns the last s m a companies in the ordered set where isActive =
	* &#63; and customerId = &#63;.
	*
	* @param isActive
	the is active
	* @param customerId
	the customer ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a companies, or <code>null</code> if a
	matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByCustomerId_Last(
		int isActive, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a companieses before and after the current s m a
	* companies in the ordered set where isActive = &#63; and customerId =
	* &#63;.
	*
	* @param id
	the primary key of the current s m a companies
	* @param isActive
	the is active
	* @param customerId
	the customer ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a companies
	* @throws com.pacnet.connect.NoSuchSMACompaniesException
	if a s m a companies with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies[] findBySMACompanyListByCustomerId_PrevAndNext(
		long id, int isActive, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException;

	/**
	* Returns all the s m a companieses where isActive = &#63; and domains =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param domains
	the domains
	* @return the matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByDomains(
		int isActive, java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a companieses where isActive = &#63; and
	* domains = &#63;.
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
	* @param domains
	the domains
	* @param start
	the lower bound of the range of s m a companieses
	* @param end
	the upper bound of the range of s m a companieses (not
	inclusive)
	* @return the range of matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByDomains(
		int isActive, java.lang.String domains, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a companieses where isActive =
	* &#63; and domains = &#63;.
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
	* @param domains
	the domains
	* @param start
	the lower bound of the range of s m a companieses
	* @param end
	the upper bound of the range of s m a companieses (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByDomains(
		int isActive, java.lang.String domains, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a companies in the ordered set where isActive =
	* &#63; and domains = &#63;.
	*
	* @param isActive
	the is active
	* @param domains
	the domains
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a companies
	* @throws com.pacnet.connect.NoSuchSMACompaniesException
	if a matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies findBySMACompanyListByDomains_First(
		int isActive, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException;

	/**
	* Returns the first s m a companies in the ordered set where isActive =
	* &#63; and domains = &#63;.
	*
	* @param isActive
	the is active
	* @param domains
	the domains
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a companies, or <code>null</code> if a
	matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByDomains_First(
		int isActive, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a companies in the ordered set where isActive =
	* &#63; and domains = &#63;.
	*
	* @param isActive
	the is active
	* @param domains
	the domains
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a companies
	* @throws com.pacnet.connect.NoSuchSMACompaniesException
	if a matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies findBySMACompanyListByDomains_Last(
		int isActive, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException;

	/**
	* Returns the last s m a companies in the ordered set where isActive =
	* &#63; and domains = &#63;.
	*
	* @param isActive
	the is active
	* @param domains
	the domains
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a companies, or <code>null</code> if a
	matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByDomains_Last(
		int isActive, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a companieses before and after the current s m a
	* companies in the ordered set where isActive = &#63; and domains = &#63;.
	*
	* @param id
	the primary key of the current s m a companies
	* @param isActive
	the is active
	* @param domains
	the domains
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a companies
	* @throws com.pacnet.connect.NoSuchSMACompaniesException
	if a s m a companies with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies[] findBySMACompanyListByDomains_PrevAndNext(
		long id, int isActive, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException;

	/**
	* Returns all the s m a companieses where isActive = &#63; and groupName =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param groupName
	the group name
	* @return the matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByGroupName(
		int isActive, java.lang.String groupName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a companieses where isActive = &#63; and
	* groupName = &#63;.
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
	* @param groupName
	the group name
	* @param start
	the lower bound of the range of s m a companieses
	* @param end
	the upper bound of the range of s m a companieses (not
	inclusive)
	* @return the range of matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByGroupName(
		int isActive, java.lang.String groupName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a companieses where isActive =
	* &#63; and groupName = &#63;.
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
	* @param groupName
	the group name
	* @param start
	the lower bound of the range of s m a companieses
	* @param end
	the upper bound of the range of s m a companieses (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByGroupName(
		int isActive, java.lang.String groupName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a companies in the ordered set where isActive =
	* &#63; and groupName = &#63;.
	*
	* @param isActive
	the is active
	* @param groupName
	the group name
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a companies
	* @throws com.pacnet.connect.NoSuchSMACompaniesException
	if a matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies findBySMACompanyListByGroupName_First(
		int isActive, java.lang.String groupName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException;

	/**
	* Returns the first s m a companies in the ordered set where isActive =
	* &#63; and groupName = &#63;.
	*
	* @param isActive
	the is active
	* @param groupName
	the group name
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a companies, or <code>null</code> if a
	matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByGroupName_First(
		int isActive, java.lang.String groupName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a companies in the ordered set where isActive =
	* &#63; and groupName = &#63;.
	*
	* @param isActive
	the is active
	* @param groupName
	the group name
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a companies
	* @throws com.pacnet.connect.NoSuchSMACompaniesException
	if a matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies findBySMACompanyListByGroupName_Last(
		int isActive, java.lang.String groupName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException;

	/**
	* Returns the last s m a companies in the ordered set where isActive =
	* &#63; and groupName = &#63;.
	*
	* @param isActive
	the is active
	* @param groupName
	the group name
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a companies, or <code>null</code> if a
	matching s m a companies could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByGroupName_Last(
		int isActive, java.lang.String groupName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a companieses before and after the current s m a
	* companies in the ordered set where isActive = &#63; and groupName =
	* &#63;.
	*
	* @param id
	the primary key of the current s m a companies
	* @param isActive
	the is active
	* @param groupName
	the group name
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a companies
	* @throws com.pacnet.connect.NoSuchSMACompaniesException
	if a s m a companies with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMACompanies[] findBySMACompanyListByGroupName_PrevAndNext(
		long id, int isActive, java.lang.String groupName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException;

	/**
	* Returns all the s m a companieses.
	*
	* @return the s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a companieses.
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
	the lower bound of the range of s m a companieses
	* @param end
	the upper bound of the range of s m a companieses (not
	inclusive)
	* @return the range of s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a companieses.
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
	the lower bound of the range of s m a companieses
	* @param end
	the upper bound of the range of s m a companieses (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMACompanies> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a companieses where isActive = &#63; and createdBy =
	* &#63; from the database.
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @throws SystemException
	if a system exception occurred
	*/
	public void removeByGetAllCompanies(int isActive, java.lang.String createdBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a companieses where isActive = &#63; and customerId =
	* &#63; from the database.
	*
	* @param isActive
	the is active
	* @param customerId
	the customer ID
	* @throws SystemException
	if a system exception occurred
	*/
	public void removeBySMACompanyListByCustomerId(int isActive, long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a companieses where isActive = &#63; and domains =
	* &#63; from the database.
	*
	* @param isActive
	the is active
	* @param domains
	the domains
	* @throws SystemException
	if a system exception occurred
	*/
	public void removeBySMACompanyListByDomains(int isActive,
		java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a companieses where isActive = &#63; and groupName =
	* &#63; from the database.
	*
	* @param isActive
	the is active
	* @param groupName
	the group name
	* @throws SystemException
	if a system exception occurred
	*/
	public void removeBySMACompanyListByGroupName(int isActive,
		java.lang.String groupName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a companieses from the database.
	*
	* @throws SystemException
	if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a companieses where isActive = &#63; and
	* createdBy = &#63;.
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @return the number of matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public int countByGetAllCompanies(int isActive, java.lang.String createdBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a companieses where isActive = &#63; and
	* customerId = &#63;.
	*
	* @param isActive
	the is active
	* @param customerId
	the customer ID
	* @return the number of matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public int countBySMACompanyListByCustomerId(int isActive, long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a companieses where isActive = &#63; and
	* domains = &#63;.
	*
	* @param isActive
	the is active
	* @param domains
	the domains
	* @return the number of matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public int countBySMACompanyListByDomains(int isActive,
		java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a companieses where isActive = &#63; and
	* groupName = &#63;.
	*
	* @param isActive
	the is active
	* @param groupName
	the group name
	* @return the number of matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public int countBySMACompanyListByGroupName(int isActive,
		java.lang.String groupName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a companieses where isActive = &#63; and
	* customerId = &#63; and domains = &#63;.
	*
	* @param isActive
	the is active
	* @param customerId
	the customer ID
	* @param domains
	the domains
	* @return the number of matching s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public int countBySMACompanyListByCustomerIdDomains(int isActive,
		long customerId, java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a companieses.
	*
	* @return the number of s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}