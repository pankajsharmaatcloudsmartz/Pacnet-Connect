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
 * The utility for the s m a companies local service. This utility wraps {@link com.pacnet.connect.service.impl.SMACompaniesLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see SMACompaniesLocalService
 * @see com.pacnet.connect.service.base.SMACompaniesLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.SMACompaniesLocalServiceImpl
 * @generated
 */
public class SMACompaniesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.SMACompaniesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the s m a companies to the database. Also notifies the appropriate model listeners.
	*
	* @param smaCompanies the s m a companies
	* @return the s m a companies that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanies addSMACompanies(
		com.pacnet.connect.model.SMACompanies smaCompanies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSMACompanies(smaCompanies);
	}

	/**
	* Creates a new s m a companies with the primary key. Does not add the s m a companies to the database.
	*
	* @param id the primary key for the new s m a companies
	* @return the new s m a companies
	*/
	public static com.pacnet.connect.model.SMACompanies createSMACompanies(
		long id) {
		return getService().createSMACompanies(id);
	}

	/**
	* Deletes the s m a companies with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a companies
	* @return the s m a companies that was removed
	* @throws PortalException if a s m a companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanies deleteSMACompanies(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSMACompanies(id);
	}

	/**
	* Deletes the s m a companies from the database. Also notifies the appropriate model listeners.
	*
	* @param smaCompanies the s m a companies
	* @return the s m a companies that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanies deleteSMACompanies(
		com.pacnet.connect.model.SMACompanies smaCompanies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSMACompanies(smaCompanies);
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

	public static com.pacnet.connect.model.SMACompanies fetchSMACompanies(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSMACompanies(id);
	}

	/**
	* Returns the s m a companies with the primary key.
	*
	* @param id the primary key of the s m a companies
	* @return the s m a companies
	* @throws PortalException if a s m a companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanies getSMACompanies(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMACompanies(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> getSMACompanieses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMACompanieses(start, end);
	}

	/**
	* Returns the number of s m a companieses.
	*
	* @return the number of s m a companieses
	* @throws SystemException if a system exception occurred
	*/
	public static int getSMACompaniesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMACompaniesesCount();
	}

	/**
	* Updates the s m a companies in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaCompanies the s m a companies
	* @return the s m a companies that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanies updateSMACompanies(
		com.pacnet.connect.model.SMACompanies smaCompanies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSMACompanies(smaCompanies);
	}

	/**
	* Updates the s m a companies in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaCompanies the s m a companies
	* @param merge whether to merge the s m a companies with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s m a companies that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMACompanies updateSMACompanies(
		com.pacnet.connect.model.SMACompanies smaCompanies, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSMACompanies(smaCompanies, merge);
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
		com.pacnet.connect.model.SMACompanies smaCompanies) {
		getService().clearCache(smaCompanies);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findWithDynamicQuery(dynamicQuery);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int)
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int, OrderByComparator)
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findWithDynamicQuery(
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
	public static com.pacnet.connect.model.SMACompanies update(
		com.pacnet.connect.model.SMACompanies smaCompanies, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().update(smaCompanies, merge);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean, ServiceContext)
	*/
	public static com.pacnet.connect.model.SMACompanies update(
		com.pacnet.connect.model.SMACompanies smaCompanies, boolean merge,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().update(smaCompanies, merge, serviceContext);
	}

	/**
	* Caches the s m a companies in the entity cache if it is enabled.
	*
	* @param smaCompanies
	the s m a companies
	*/
	public static void cacheResult(
		com.pacnet.connect.model.SMACompanies smaCompanies) {
		getService().cacheResult(smaCompanies);
	}

	/**
	* Caches the s m a companieses in the entity cache if it is enabled.
	*
	* @param smaCompanieses
	the s m a companieses
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.SMACompanies> smaCompanieses) {
		getService().cacheResult(smaCompanieses);
	}

	/**
	* Creates a new s m a companies with the primary key. Does not add the s m
	* a companies to the database.
	*
	* @param id
	the primary key for the new s m a companies
	* @return the new s m a companies
	*/
	public static com.pacnet.connect.model.SMACompanies create(long id) {
		return getService().create(id);
	}

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
	public static com.pacnet.connect.model.SMACompanies remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getService().remove(id);
	}

	public static com.pacnet.connect.model.SMACompanies updateImpl(
		com.pacnet.connect.model.SMACompanies smaCompanies, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImpl(smaCompanies, merge);
	}

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
	public static com.pacnet.connect.model.SMACompanies findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getService().findByPrimaryKey(id);
	}

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
	public static com.pacnet.connect.model.SMACompanies fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchByPrimaryKey(id);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findByGetAllCompanies(
		int isActive, java.lang.String createdBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByGetAllCompanies(isActive, createdBy);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findByGetAllCompanies(
		int isActive, java.lang.String createdBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByGetAllCompanies(isActive, createdBy, start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findByGetAllCompanies(
		int isActive, java.lang.String createdBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByGetAllCompanies(isActive, createdBy, start, end,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies findByGetAllCompanies_First(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getService()
				   .findByGetAllCompanies_First(isActive, createdBy,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies fetchByGetAllCompanies_First(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchByGetAllCompanies_First(isActive, createdBy,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies findByGetAllCompanies_Last(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getService()
				   .findByGetAllCompanies_Last(isActive, createdBy,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies fetchByGetAllCompanies_Last(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchByGetAllCompanies_Last(isActive, createdBy,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies[] findByGetAllCompanies_PrevAndNext(
		long id, int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getService()
				   .findByGetAllCompanies_PrevAndNext(id, isActive, createdBy,
			orderByComparator);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByCustomerId(
		int isActive, long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMACompanyListByCustomerId(isActive, customerId);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByCustomerId(
		int isActive, long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMACompanyListByCustomerId(isActive, customerId,
			start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByCustomerId(
		int isActive, long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMACompanyListByCustomerId(isActive, customerId,
			start, end, orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies findBySMACompanyListByCustomerId_First(
		int isActive, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getService()
				   .findBySMACompanyListByCustomerId_First(isActive,
			customerId, orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByCustomerId_First(
		int isActive, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMACompanyListByCustomerId_First(isActive,
			customerId, orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies findBySMACompanyListByCustomerId_Last(
		int isActive, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getService()
				   .findBySMACompanyListByCustomerId_Last(isActive, customerId,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByCustomerId_Last(
		int isActive, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMACompanyListByCustomerId_Last(isActive,
			customerId, orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies[] findBySMACompanyListByCustomerId_PrevAndNext(
		long id, int isActive, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getService()
				   .findBySMACompanyListByCustomerId_PrevAndNext(id, isActive,
			customerId, orderByComparator);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByDomains(
		int isActive, java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMACompanyListByDomains(isActive, domains);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByDomains(
		int isActive, java.lang.String domains, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMACompanyListByDomains(isActive, domains, start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByDomains(
		int isActive, java.lang.String domains, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMACompanyListByDomains(isActive, domains, start,
			end, orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies findBySMACompanyListByDomains_First(
		int isActive, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getService()
				   .findBySMACompanyListByDomains_First(isActive, domains,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByDomains_First(
		int isActive, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMACompanyListByDomains_First(isActive, domains,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies findBySMACompanyListByDomains_Last(
		int isActive, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getService()
				   .findBySMACompanyListByDomains_Last(isActive, domains,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByDomains_Last(
		int isActive, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMACompanyListByDomains_Last(isActive, domains,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies[] findBySMACompanyListByDomains_PrevAndNext(
		long id, int isActive, java.lang.String domains,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getService()
				   .findBySMACompanyListByDomains_PrevAndNext(id, isActive,
			domains, orderByComparator);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByGroupName(
		int isActive, java.lang.String groupName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMACompanyListByGroupName(isActive, groupName);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByGroupName(
		int isActive, java.lang.String groupName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMACompanyListByGroupName(isActive, groupName, start,
			end);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findBySMACompanyListByGroupName(
		int isActive, java.lang.String groupName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMACompanyListByGroupName(isActive, groupName, start,
			end, orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies findBySMACompanyListByGroupName_First(
		int isActive, java.lang.String groupName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getService()
				   .findBySMACompanyListByGroupName_First(isActive, groupName,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByGroupName_First(
		int isActive, java.lang.String groupName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMACompanyListByGroupName_First(isActive, groupName,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies findBySMACompanyListByGroupName_Last(
		int isActive, java.lang.String groupName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getService()
				   .findBySMACompanyListByGroupName_Last(isActive, groupName,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies fetchBySMACompanyListByGroupName_Last(
		int isActive, java.lang.String groupName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMACompanyListByGroupName_Last(isActive, groupName,
			orderByComparator);
	}

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
	public static com.pacnet.connect.model.SMACompanies[] findBySMACompanyListByGroupName_PrevAndNext(
		long id, int isActive, java.lang.String groupName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMACompaniesException {
		return getService()
				   .findBySMACompanyListByGroupName_PrevAndNext(id, isActive,
			groupName, orderByComparator);
	}

	/**
	* Returns all the s m a companieses.
	*
	* @return the s m a companieses
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll();
	}

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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll(start, end);
	}

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
	public static java.util.List<com.pacnet.connect.model.SMACompanies> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll(start, end, orderByComparator);
	}

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
	public static void removeByGetAllCompanies(int isActive,
		java.lang.String createdBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByGetAllCompanies(isActive, createdBy);
	}

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
	public static void removeBySMACompanyListByCustomerId(int isActive,
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMACompanyListByCustomerId(isActive, customerId);
	}

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
	public static void removeBySMACompanyListByDomains(int isActive,
		java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMACompanyListByDomains(isActive, domains);
	}

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
	public static void removeBySMACompanyListByGroupName(int isActive,
		java.lang.String groupName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMACompanyListByGroupName(isActive, groupName);
	}

	/**
	* Removes all the s m a companieses from the database.
	*
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeAll();
	}

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
	public static int countByGetAllCompanies(int isActive,
		java.lang.String createdBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByGetAllCompanies(isActive, createdBy);
	}

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
	public static int countBySMACompanyListByCustomerId(int isActive,
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countBySMACompanyListByCustomerId(isActive, customerId);
	}

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
	public static int countBySMACompanyListByDomains(int isActive,
		java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countBySMACompanyListByDomains(isActive, domains);
	}

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
	public static int countBySMACompanyListByGroupName(int isActive,
		java.lang.String groupName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countBySMACompanyListByGroupName(isActive, groupName);
	}

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
	public static int countBySMACompanyListByCustomerIdDomains(int isActive,
		long customerId, java.lang.String domains)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countBySMACompanyListByCustomerIdDomains(isActive,
			customerId, domains);
	}

	/**
	* Returns the number of s m a companieses.
	*
	* @return the number of s m a companieses
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

	public static SMACompaniesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SMACompaniesLocalService.class.getName());

			if (invokableLocalService instanceof SMACompaniesLocalService) {
				_service = (SMACompaniesLocalService)invokableLocalService;
			}
			else {
				_service = new SMACompaniesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(SMACompaniesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(SMACompaniesLocalService service) {
	}

	private static SMACompaniesLocalService _service;
}