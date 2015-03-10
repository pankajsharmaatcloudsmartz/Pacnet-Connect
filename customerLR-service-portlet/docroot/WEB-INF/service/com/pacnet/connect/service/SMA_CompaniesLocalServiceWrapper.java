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
 * This class is a wrapper for {@link SMA_CompaniesLocalService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMA_CompaniesLocalService
 * @generated
 */
public class SMA_CompaniesLocalServiceWrapper
	implements SMA_CompaniesLocalService,
		ServiceWrapper<SMA_CompaniesLocalService> {
	public SMA_CompaniesLocalServiceWrapper(
		SMA_CompaniesLocalService sma_CompaniesLocalService) {
		_sma_CompaniesLocalService = sma_CompaniesLocalService;
	}

	/**
	* Adds the s m a_ companies to the database. Also notifies the appropriate model listeners.
	*
	* @param sma_Companies the s m a_ companies
	* @return the s m a_ companies that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Companies addSMA_Companies(
		com.pacnet.connect.model.SMA_Companies sma_Companies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_CompaniesLocalService.addSMA_Companies(sma_Companies);
	}

	/**
	* Creates a new s m a_ companies with the primary key. Does not add the s m a_ companies to the database.
	*
	* @param id the primary key for the new s m a_ companies
	* @return the new s m a_ companies
	*/
	public com.pacnet.connect.model.SMA_Companies createSMA_Companies(long id) {
		return _sma_CompaniesLocalService.createSMA_Companies(id);
	}

	/**
	* Deletes the s m a_ companies with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a_ companies
	* @return the s m a_ companies that was removed
	* @throws PortalException if a s m a_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Companies deleteSMA_Companies(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sma_CompaniesLocalService.deleteSMA_Companies(id);
	}

	/**
	* Deletes the s m a_ companies from the database. Also notifies the appropriate model listeners.
	*
	* @param sma_Companies the s m a_ companies
	* @return the s m a_ companies that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Companies deleteSMA_Companies(
		com.pacnet.connect.model.SMA_Companies sma_Companies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_CompaniesLocalService.deleteSMA_Companies(sma_Companies);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sma_CompaniesLocalService.dynamicQuery();
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
		return _sma_CompaniesLocalService.dynamicQuery(dynamicQuery);
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
		return _sma_CompaniesLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _sma_CompaniesLocalService.dynamicQuery(dynamicQuery, start,
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
		return _sma_CompaniesLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.pacnet.connect.model.SMA_Companies fetchSMA_Companies(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_CompaniesLocalService.fetchSMA_Companies(id);
	}

	/**
	* Returns the s m a_ companies with the primary key.
	*
	* @param id the primary key of the s m a_ companies
	* @return the s m a_ companies
	* @throws PortalException if a s m a_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Companies getSMA_Companies(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sma_CompaniesLocalService.getSMA_Companies(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sma_CompaniesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the s m a_ companieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a_ companieses
	* @param end the upper bound of the range of s m a_ companieses (not inclusive)
	* @return the range of s m a_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_Companies> getSMA_Companieses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_CompaniesLocalService.getSMA_Companieses(start, end);
	}

	/**
	* Returns the number of s m a_ companieses.
	*
	* @return the number of s m a_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public int getSMA_CompaniesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_CompaniesLocalService.getSMA_CompaniesesCount();
	}

	/**
	* Updates the s m a_ companies in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sma_Companies the s m a_ companies
	* @return the s m a_ companies that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Companies updateSMA_Companies(
		com.pacnet.connect.model.SMA_Companies sma_Companies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_CompaniesLocalService.updateSMA_Companies(sma_Companies);
	}

	/**
	* Updates the s m a_ companies in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sma_Companies the s m a_ companies
	* @param merge whether to merge the s m a_ companies with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s m a_ companies that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_Companies updateSMA_Companies(
		com.pacnet.connect.model.SMA_Companies sma_Companies, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_CompaniesLocalService.updateSMA_Companies(sma_Companies,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sma_CompaniesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sma_CompaniesLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sma_CompaniesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<com.pacnet.connect.model.SMA_Companies> findCompniesByCustomerId(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_CompaniesLocalService.findCompniesByCustomerId(customerId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SMA_CompaniesLocalService getWrappedSMA_CompaniesLocalService() {
		return _sma_CompaniesLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSMA_CompaniesLocalService(
		SMA_CompaniesLocalService sma_CompaniesLocalService) {
		_sma_CompaniesLocalService = sma_CompaniesLocalService;
	}

	public SMA_CompaniesLocalService getWrappedService() {
		return _sma_CompaniesLocalService;
	}

	public void setWrappedService(
		SMA_CompaniesLocalService sma_CompaniesLocalService) {
		_sma_CompaniesLocalService = sma_CompaniesLocalService;
	}

	private SMA_CompaniesLocalService _sma_CompaniesLocalService;
}