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
 * This class is a wrapper for {@link SMARadcheckLocalService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMARadcheckLocalService
 * @generated
 */
public class SMARadcheckLocalServiceWrapper implements SMARadcheckLocalService,
	ServiceWrapper<SMARadcheckLocalService> {
	public SMARadcheckLocalServiceWrapper(
		SMARadcheckLocalService smaRadcheckLocalService) {
		_smaRadcheckLocalService = smaRadcheckLocalService;
	}

	/**
	* Adds the s m a radcheck to the database. Also notifies the appropriate model listeners.
	*
	* @param smaRadcheck the s m a radcheck
	* @return the s m a radcheck that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck addSMARadcheck(
		com.pacnet.connect.model.SMARadcheck smaRadcheck)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.addSMARadcheck(smaRadcheck);
	}

	/**
	* Creates a new s m a radcheck with the primary key. Does not add the s m a radcheck to the database.
	*
	* @param id the primary key for the new s m a radcheck
	* @return the new s m a radcheck
	*/
	public com.pacnet.connect.model.SMARadcheck createSMARadcheck(long id) {
		return _smaRadcheckLocalService.createSMARadcheck(id);
	}

	/**
	* Deletes the s m a radcheck with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a radcheck
	* @return the s m a radcheck that was removed
	* @throws PortalException if a s m a radcheck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck deleteSMARadcheck(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.deleteSMARadcheck(id);
	}

	/**
	* Deletes the s m a radcheck from the database. Also notifies the appropriate model listeners.
	*
	* @param smaRadcheck the s m a radcheck
	* @return the s m a radcheck that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck deleteSMARadcheck(
		com.pacnet.connect.model.SMARadcheck smaRadcheck)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.deleteSMARadcheck(smaRadcheck);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _smaRadcheckLocalService.dynamicQuery();
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
		return _smaRadcheckLocalService.dynamicQuery(dynamicQuery);
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
		return _smaRadcheckLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _smaRadcheckLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _smaRadcheckLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.pacnet.connect.model.SMARadcheck fetchSMARadcheck(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.fetchSMARadcheck(id);
	}

	/**
	* Returns the s m a radcheck with the primary key.
	*
	* @param id the primary key of the s m a radcheck
	* @return the s m a radcheck
	* @throws PortalException if a s m a radcheck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck getSMARadcheck(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.getSMARadcheck(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the s m a radchecks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a radchecks
	* @param end the upper bound of the range of s m a radchecks (not inclusive)
	* @return the range of s m a radchecks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMARadcheck> getSMARadchecks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.getSMARadchecks(start, end);
	}

	/**
	* Returns the number of s m a radchecks.
	*
	* @return the number of s m a radchecks
	* @throws SystemException if a system exception occurred
	*/
	public int getSMARadchecksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.getSMARadchecksCount();
	}

	/**
	* Updates the s m a radcheck in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaRadcheck the s m a radcheck
	* @return the s m a radcheck that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck updateSMARadcheck(
		com.pacnet.connect.model.SMARadcheck smaRadcheck)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.updateSMARadcheck(smaRadcheck);
	}

	/**
	* Updates the s m a radcheck in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaRadcheck the s m a radcheck
	* @param merge whether to merge the s m a radcheck with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s m a radcheck that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck updateSMARadcheck(
		com.pacnet.connect.model.SMARadcheck smaRadcheck, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.updateSMARadcheck(smaRadcheck, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _smaRadcheckLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_smaRadcheckLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _smaRadcheckLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	*/
	public void clearCache() {
		_smaRadcheckLocalService.clearCache();
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	*/
	public void clearCache(com.pacnet.connect.model.SMARadcheck smaRadcheck) {
		_smaRadcheckLocalService.clearCache(smaRadcheck);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	*/
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.findWithDynamicQuery(dynamicQuery);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int)
	*/
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int, OrderByComparator)
	*/
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean)
	*/
	public com.pacnet.connect.model.SMARadcheck update(
		com.pacnet.connect.model.SMARadcheck smaRadcheck, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.update(smaRadcheck, merge);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean, ServiceContext)
	*/
	public com.pacnet.connect.model.SMARadcheck update(
		com.pacnet.connect.model.SMARadcheck smaRadcheck, boolean merge,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.update(smaRadcheck, merge,
			serviceContext);
	}

	/**
	* Caches the s m a radcheck in the entity cache if it is enabled.
	*
	* @param smaRadcheck
	the s m a radcheck
	*/
	public void cacheResult(com.pacnet.connect.model.SMARadcheck smaRadcheck) {
		_smaRadcheckLocalService.cacheResult(smaRadcheck);
	}

	/**
	* Caches the s m a radchecks in the entity cache if it is enabled.
	*
	* @param smaRadchecks
	the s m a radchecks
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SMARadcheck> smaRadchecks) {
		_smaRadcheckLocalService.cacheResult(smaRadchecks);
	}

	/**
	* Creates a new s m a radcheck with the primary key. Does not add the s m a
	* radcheck to the database.
	*
	* @param id
	the primary key for the new s m a radcheck
	* @return the new s m a radcheck
	*/
	public com.pacnet.connect.model.SMARadcheck create(long id) {
		return _smaRadcheckLocalService.create(id);
	}

	/**
	* Removes the s m a radcheck with the primary key from the database. Also
	* notifies the appropriate model listeners.
	*
	* @param id
	the primary key of the s m a radcheck
	* @return the s m a radcheck that was removed
	* @throws com.pacnet.connect.NoSuchSMARadcheckException
	if a s m a radcheck with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return _smaRadcheckLocalService.remove(id);
	}

	public com.pacnet.connect.model.SMARadcheck updateImpl(
		com.pacnet.connect.model.SMARadcheck smaRadcheck, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.updateImpl(smaRadcheck, merge);
	}

	/**
	* Returns the s m a radcheck with the primary key or throws a
	* {@link com.pacnet.connect.NoSuchSMARadcheckException} if it could not be
	* found.
	*
	* @param id
	the primary key of the s m a radcheck
	* @return the s m a radcheck
	* @throws com.pacnet.connect.NoSuchSMARadcheckException
	if a s m a radcheck with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return _smaRadcheckLocalService.findByPrimaryKey(id);
	}

	/**
	* Returns the s m a radcheck with the primary key or returns
	* <code>null</code> if it could not be found.
	*
	* @param id
	the primary key of the s m a radcheck
	* @return the s m a radcheck, or <code>null</code> if a s m a radcheck with
	the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.fetchByPrimaryKey(id);
	}

	/**
	* Returns all the s m a radchecks where isActive = &#63; and companyId =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @return the matching s m a radchecks
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findBySMAUserListByCompanyId(
		int isActive, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.findBySMAUserListByCompanyId(isActive,
			companyId);
	}

	/**
	* Returns a range of all the s m a radchecks where isActive = &#63; and
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
	the lower bound of the range of s m a radchecks
	* @param end
	the upper bound of the range of s m a radchecks (not
	inclusive)
	* @return the range of matching s m a radchecks
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findBySMAUserListByCompanyId(
		int isActive, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.findBySMAUserListByCompanyId(isActive,
			companyId, start, end);
	}

	/**
	* Returns an ordered range of all the s m a radchecks where isActive =
	* &#63; and companyId = &#63;.
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
	the lower bound of the range of s m a radchecks
	* @param end
	the upper bound of the range of s m a radchecks (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a radchecks
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findBySMAUserListByCompanyId(
		int isActive, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.findBySMAUserListByCompanyId(isActive,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first s m a radcheck in the ordered set where isActive =
	* &#63; and companyId = &#63;.
	*
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a radcheck
	* @throws com.pacnet.connect.NoSuchSMARadcheckException
	if a matching s m a radcheck could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck findBySMAUserListByCompanyId_First(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return _smaRadcheckLocalService.findBySMAUserListByCompanyId_First(isActive,
			companyId, orderByComparator);
	}

	/**
	* Returns the first s m a radcheck in the ordered set where isActive =
	* &#63; and companyId = &#63;.
	*
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a radcheck, or <code>null</code> if a
	matching s m a radcheck could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck fetchBySMAUserListByCompanyId_First(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.fetchBySMAUserListByCompanyId_First(isActive,
			companyId, orderByComparator);
	}

	/**
	* Returns the last s m a radcheck in the ordered set where isActive = &#63;
	* and companyId = &#63;.
	*
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a radcheck
	* @throws com.pacnet.connect.NoSuchSMARadcheckException
	if a matching s m a radcheck could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck findBySMAUserListByCompanyId_Last(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return _smaRadcheckLocalService.findBySMAUserListByCompanyId_Last(isActive,
			companyId, orderByComparator);
	}

	/**
	* Returns the last s m a radcheck in the ordered set where isActive = &#63;
	* and companyId = &#63;.
	*
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a radcheck, or <code>null</code> if a
	matching s m a radcheck could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck fetchBySMAUserListByCompanyId_Last(
		int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.fetchBySMAUserListByCompanyId_Last(isActive,
			companyId, orderByComparator);
	}

	/**
	* Returns the s m a radchecks before and after the current s m a radcheck
	* in the ordered set where isActive = &#63; and companyId = &#63;.
	*
	* @param id
	the primary key of the current s m a radcheck
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a radcheck
	* @throws com.pacnet.connect.NoSuchSMARadcheckException
	if a s m a radcheck with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck[] findBySMAUserListByCompanyId_PrevAndNext(
		long id, int isActive, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return _smaRadcheckLocalService.findBySMAUserListByCompanyId_PrevAndNext(id,
			isActive, companyId, orderByComparator);
	}

	/**
	* Returns all the s m a radchecks where isActive = &#63; and isAdmin =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param isAdmin
	the is admin
	* @return the matching s m a radchecks
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findBySMAUserListByIsAdmin(
		int isActive, int isAdmin)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.findBySMAUserListByIsAdmin(isActive,
			isAdmin);
	}

	/**
	* Returns a range of all the s m a radchecks where isActive = &#63; and
	* isAdmin = &#63;.
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
	* @param isAdmin
	the is admin
	* @param start
	the lower bound of the range of s m a radchecks
	* @param end
	the upper bound of the range of s m a radchecks (not
	inclusive)
	* @return the range of matching s m a radchecks
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findBySMAUserListByIsAdmin(
		int isActive, int isAdmin, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.findBySMAUserListByIsAdmin(isActive,
			isAdmin, start, end);
	}

	/**
	* Returns an ordered range of all the s m a radchecks where isActive =
	* &#63; and isAdmin = &#63;.
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
	* @param isAdmin
	the is admin
	* @param start
	the lower bound of the range of s m a radchecks
	* @param end
	the upper bound of the range of s m a radchecks (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a radchecks
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findBySMAUserListByIsAdmin(
		int isActive, int isAdmin, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.findBySMAUserListByIsAdmin(isActive,
			isAdmin, start, end, orderByComparator);
	}

	/**
	* Returns the first s m a radcheck in the ordered set where isActive =
	* &#63; and isAdmin = &#63;.
	*
	* @param isActive
	the is active
	* @param isAdmin
	the is admin
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a radcheck
	* @throws com.pacnet.connect.NoSuchSMARadcheckException
	if a matching s m a radcheck could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck findBySMAUserListByIsAdmin_First(
		int isActive, int isAdmin,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return _smaRadcheckLocalService.findBySMAUserListByIsAdmin_First(isActive,
			isAdmin, orderByComparator);
	}

	/**
	* Returns the first s m a radcheck in the ordered set where isActive =
	* &#63; and isAdmin = &#63;.
	*
	* @param isActive
	the is active
	* @param isAdmin
	the is admin
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a radcheck, or <code>null</code> if a
	matching s m a radcheck could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck fetchBySMAUserListByIsAdmin_First(
		int isActive, int isAdmin,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.fetchBySMAUserListByIsAdmin_First(isActive,
			isAdmin, orderByComparator);
	}

	/**
	* Returns the last s m a radcheck in the ordered set where isActive = &#63;
	* and isAdmin = &#63;.
	*
	* @param isActive
	the is active
	* @param isAdmin
	the is admin
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a radcheck
	* @throws com.pacnet.connect.NoSuchSMARadcheckException
	if a matching s m a radcheck could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck findBySMAUserListByIsAdmin_Last(
		int isActive, int isAdmin,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return _smaRadcheckLocalService.findBySMAUserListByIsAdmin_Last(isActive,
			isAdmin, orderByComparator);
	}

	/**
	* Returns the last s m a radcheck in the ordered set where isActive = &#63;
	* and isAdmin = &#63;.
	*
	* @param isActive
	the is active
	* @param isAdmin
	the is admin
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a radcheck, or <code>null</code> if a
	matching s m a radcheck could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck fetchBySMAUserListByIsAdmin_Last(
		int isActive, int isAdmin,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.fetchBySMAUserListByIsAdmin_Last(isActive,
			isAdmin, orderByComparator);
	}

	/**
	* Returns the s m a radchecks before and after the current s m a radcheck
	* in the ordered set where isActive = &#63; and isAdmin = &#63;.
	*
	* @param id
	the primary key of the current s m a radcheck
	* @param isActive
	the is active
	* @param isAdmin
	the is admin
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a radcheck
	* @throws com.pacnet.connect.NoSuchSMARadcheckException
	if a s m a radcheck with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public com.pacnet.connect.model.SMARadcheck[] findBySMAUserListByIsAdmin_PrevAndNext(
		long id, int isActive, int isAdmin,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMARadcheckException {
		return _smaRadcheckLocalService.findBySMAUserListByIsAdmin_PrevAndNext(id,
			isActive, isAdmin, orderByComparator);
	}

	/**
	* Returns all the s m a radchecks.
	*
	* @return the s m a radchecks
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.findAll();
	}

	/**
	* Returns a range of all the s m a radchecks.
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
	the lower bound of the range of s m a radchecks
	* @param end
	the upper bound of the range of s m a radchecks (not
	inclusive)
	* @return the range of s m a radchecks
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.findAll(start, end);
	}

	/**
	* Returns an ordered range of all the s m a radchecks.
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
	the lower bound of the range of s m a radchecks
	* @param end
	the upper bound of the range of s m a radchecks (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of s m a radchecks
	* @throws SystemException
	if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMARadcheck> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the s m a radchecks where isActive = &#63; and companyId =
	* &#63; from the database.
	*
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @throws SystemException
	if a system exception occurred
	*/
	public void removeBySMAUserListByCompanyId(int isActive, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_smaRadcheckLocalService.removeBySMAUserListByCompanyId(isActive,
			companyId);
	}

	/**
	* Removes all the s m a radchecks where isActive = &#63; and isAdmin =
	* &#63; from the database.
	*
	* @param isActive
	the is active
	* @param isAdmin
	the is admin
	* @throws SystemException
	if a system exception occurred
	*/
	public void removeBySMAUserListByIsAdmin(int isActive, int isAdmin)
		throws com.liferay.portal.kernel.exception.SystemException {
		_smaRadcheckLocalService.removeBySMAUserListByIsAdmin(isActive, isAdmin);
	}

	/**
	* Removes all the s m a radchecks from the database.
	*
	* @throws SystemException
	if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		_smaRadcheckLocalService.removeAll();
	}

	/**
	* Returns the number of s m a radchecks where isActive = &#63; and
	* companyId = &#63;.
	*
	* @param isActive
	the is active
	* @param companyId
	the company ID
	* @return the number of matching s m a radchecks
	* @throws SystemException
	if a system exception occurred
	*/
	public int countBySMAUserListByCompanyId(int isActive, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.countBySMAUserListByCompanyId(isActive,
			companyId);
	}

	/**
	* Returns the number of s m a radchecks where isActive = &#63; and isAdmin
	* = &#63;.
	*
	* @param isActive
	the is active
	* @param isAdmin
	the is admin
	* @return the number of matching s m a radchecks
	* @throws SystemException
	if a system exception occurred
	*/
	public int countBySMAUserListByIsAdmin(int isActive, int isAdmin)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.countBySMAUserListByIsAdmin(isActive,
			isAdmin);
	}

	/**
	* Returns the number of s m a radchecks where isActive = &#63; and isAdmin
	* = &#63; and companyId = &#63;.
	*
	* @param isActive
	the is active
	* @param isAdmin
	the is admin
	* @param companyId
	the company ID
	* @return the number of matching s m a radchecks
	* @throws SystemException
	if a system exception occurred
	*/
	public int countBySMAUserListByIsAdminCompanyId(int isActive, int isAdmin,
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.countBySMAUserListByIsAdminCompanyId(isActive,
			isAdmin, companyId);
	}

	/**
	* Returns the number of s m a radchecks.
	*
	* @return the number of s m a radchecks
	* @throws SystemException
	if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaRadcheckLocalService.countAll();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SMARadcheckLocalService getWrappedSMARadcheckLocalService() {
		return _smaRadcheckLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSMARadcheckLocalService(
		SMARadcheckLocalService smaRadcheckLocalService) {
		_smaRadcheckLocalService = smaRadcheckLocalService;
	}

	public SMARadcheckLocalService getWrappedService() {
		return _smaRadcheckLocalService;
	}

	public void setWrappedService(
		SMARadcheckLocalService smaRadcheckLocalService) {
		_smaRadcheckLocalService = smaRadcheckLocalService;
	}

	private SMARadcheckLocalService _smaRadcheckLocalService;
}