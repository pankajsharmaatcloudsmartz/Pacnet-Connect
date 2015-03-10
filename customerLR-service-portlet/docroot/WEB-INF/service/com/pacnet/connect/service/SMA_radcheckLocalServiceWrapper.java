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
 * This class is a wrapper for {@link SMA_radcheckLocalService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMA_radcheckLocalService
 * @generated
 */
public class SMA_radcheckLocalServiceWrapper implements SMA_radcheckLocalService,
	ServiceWrapper<SMA_radcheckLocalService> {
	public SMA_radcheckLocalServiceWrapper(
		SMA_radcheckLocalService sma_radcheckLocalService) {
		_sma_radcheckLocalService = sma_radcheckLocalService;
	}

	/**
	* Adds the s m a_radcheck to the database. Also notifies the appropriate model listeners.
	*
	* @param sma_radcheck the s m a_radcheck
	* @return the s m a_radcheck that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radcheck addSMA_radcheck(
		com.pacnet.connect.model.SMA_radcheck sma_radcheck)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_radcheckLocalService.addSMA_radcheck(sma_radcheck);
	}

	/**
	* Creates a new s m a_radcheck with the primary key. Does not add the s m a_radcheck to the database.
	*
	* @param id the primary key for the new s m a_radcheck
	* @return the new s m a_radcheck
	*/
	public com.pacnet.connect.model.SMA_radcheck createSMA_radcheck(long id) {
		return _sma_radcheckLocalService.createSMA_radcheck(id);
	}

	/**
	* Deletes the s m a_radcheck with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a_radcheck
	* @return the s m a_radcheck that was removed
	* @throws PortalException if a s m a_radcheck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radcheck deleteSMA_radcheck(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sma_radcheckLocalService.deleteSMA_radcheck(id);
	}

	/**
	* Deletes the s m a_radcheck from the database. Also notifies the appropriate model listeners.
	*
	* @param sma_radcheck the s m a_radcheck
	* @return the s m a_radcheck that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radcheck deleteSMA_radcheck(
		com.pacnet.connect.model.SMA_radcheck sma_radcheck)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_radcheckLocalService.deleteSMA_radcheck(sma_radcheck);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sma_radcheckLocalService.dynamicQuery();
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
		return _sma_radcheckLocalService.dynamicQuery(dynamicQuery);
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
		return _sma_radcheckLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _sma_radcheckLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _sma_radcheckLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.pacnet.connect.model.SMA_radcheck fetchSMA_radcheck(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_radcheckLocalService.fetchSMA_radcheck(id);
	}

	/**
	* Returns the s m a_radcheck with the primary key.
	*
	* @param id the primary key of the s m a_radcheck
	* @return the s m a_radcheck
	* @throws PortalException if a s m a_radcheck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radcheck getSMA_radcheck(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sma_radcheckLocalService.getSMA_radcheck(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sma_radcheckLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the s m a_radchecks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a_radchecks
	* @param end the upper bound of the range of s m a_radchecks (not inclusive)
	* @return the range of s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_radcheck> getSMA_radchecks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_radcheckLocalService.getSMA_radchecks(start, end);
	}

	/**
	* Returns the number of s m a_radchecks.
	*
	* @return the number of s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public int getSMA_radchecksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_radcheckLocalService.getSMA_radchecksCount();
	}

	/**
	* Updates the s m a_radcheck in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sma_radcheck the s m a_radcheck
	* @return the s m a_radcheck that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radcheck updateSMA_radcheck(
		com.pacnet.connect.model.SMA_radcheck sma_radcheck)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_radcheckLocalService.updateSMA_radcheck(sma_radcheck);
	}

	/**
	* Updates the s m a_radcheck in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sma_radcheck the s m a_radcheck
	* @param merge whether to merge the s m a_radcheck with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s m a_radcheck that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radcheck updateSMA_radcheck(
		com.pacnet.connect.model.SMA_radcheck sma_radcheck, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_radcheckLocalService.updateSMA_radcheck(sma_radcheck, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sma_radcheckLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sma_radcheckLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sma_radcheckLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<com.pacnet.connect.model.SMA_radcheck> findUsersByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_radcheckLocalService.findUsersByCompanyId(companyId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SMA_radcheckLocalService getWrappedSMA_radcheckLocalService() {
		return _sma_radcheckLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSMA_radcheckLocalService(
		SMA_radcheckLocalService sma_radcheckLocalService) {
		_sma_radcheckLocalService = sma_radcheckLocalService;
	}

	public SMA_radcheckLocalService getWrappedService() {
		return _sma_radcheckLocalService;
	}

	public void setWrappedService(
		SMA_radcheckLocalService sma_radcheckLocalService) {
		_sma_radcheckLocalService = sma_radcheckLocalService;
	}

	private SMA_radcheckLocalService _sma_radcheckLocalService;
}