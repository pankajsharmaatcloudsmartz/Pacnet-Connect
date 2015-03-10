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
 * This class is a wrapper for {@link SMA_radacctLocalService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMA_radacctLocalService
 * @generated
 */
public class SMA_radacctLocalServiceWrapper implements SMA_radacctLocalService,
	ServiceWrapper<SMA_radacctLocalService> {
	public SMA_radacctLocalServiceWrapper(
		SMA_radacctLocalService sma_radacctLocalService) {
		_sma_radacctLocalService = sma_radacctLocalService;
	}

	/**
	* Adds the s m a_radacct to the database. Also notifies the appropriate model listeners.
	*
	* @param sma_radacct the s m a_radacct
	* @return the s m a_radacct that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radacct addSMA_radacct(
		com.pacnet.connect.model.SMA_radacct sma_radacct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_radacctLocalService.addSMA_radacct(sma_radacct);
	}

	/**
	* Creates a new s m a_radacct with the primary key. Does not add the s m a_radacct to the database.
	*
	* @param RadAcctId the primary key for the new s m a_radacct
	* @return the new s m a_radacct
	*/
	public com.pacnet.connect.model.SMA_radacct createSMA_radacct(
		long RadAcctId) {
		return _sma_radacctLocalService.createSMA_radacct(RadAcctId);
	}

	/**
	* Deletes the s m a_radacct with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param RadAcctId the primary key of the s m a_radacct
	* @return the s m a_radacct that was removed
	* @throws PortalException if a s m a_radacct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radacct deleteSMA_radacct(
		long RadAcctId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sma_radacctLocalService.deleteSMA_radacct(RadAcctId);
	}

	/**
	* Deletes the s m a_radacct from the database. Also notifies the appropriate model listeners.
	*
	* @param sma_radacct the s m a_radacct
	* @return the s m a_radacct that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radacct deleteSMA_radacct(
		com.pacnet.connect.model.SMA_radacct sma_radacct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_radacctLocalService.deleteSMA_radacct(sma_radacct);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sma_radacctLocalService.dynamicQuery();
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
		return _sma_radacctLocalService.dynamicQuery(dynamicQuery);
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
		return _sma_radacctLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _sma_radacctLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _sma_radacctLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.pacnet.connect.model.SMA_radacct fetchSMA_radacct(long RadAcctId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_radacctLocalService.fetchSMA_radacct(RadAcctId);
	}

	/**
	* Returns the s m a_radacct with the primary key.
	*
	* @param RadAcctId the primary key of the s m a_radacct
	* @return the s m a_radacct
	* @throws PortalException if a s m a_radacct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radacct getSMA_radacct(long RadAcctId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sma_radacctLocalService.getSMA_radacct(RadAcctId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sma_radacctLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the s m a_radaccts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a_radaccts
	* @param end the upper bound of the range of s m a_radaccts (not inclusive)
	* @return the range of s m a_radaccts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_radacct> getSMA_radaccts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_radacctLocalService.getSMA_radaccts(start, end);
	}

	/**
	* Returns the number of s m a_radaccts.
	*
	* @return the number of s m a_radaccts
	* @throws SystemException if a system exception occurred
	*/
	public int getSMA_radacctsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_radacctLocalService.getSMA_radacctsCount();
	}

	/**
	* Updates the s m a_radacct in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sma_radacct the s m a_radacct
	* @return the s m a_radacct that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radacct updateSMA_radacct(
		com.pacnet.connect.model.SMA_radacct sma_radacct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_radacctLocalService.updateSMA_radacct(sma_radacct);
	}

	/**
	* Updates the s m a_radacct in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sma_radacct the s m a_radacct
	* @param merge whether to merge the s m a_radacct with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s m a_radacct that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radacct updateSMA_radacct(
		com.pacnet.connect.model.SMA_radacct sma_radacct, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sma_radacctLocalService.updateSMA_radacct(sma_radacct, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sma_radacctLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sma_radacctLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sma_radacctLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SMA_radacctLocalService getWrappedSMA_radacctLocalService() {
		return _sma_radacctLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSMA_radacctLocalService(
		SMA_radacctLocalService sma_radacctLocalService) {
		_sma_radacctLocalService = sma_radacctLocalService;
	}

	public SMA_radacctLocalService getWrappedService() {
		return _sma_radacctLocalService;
	}

	public void setWrappedService(
		SMA_radacctLocalService sma_radacctLocalService) {
		_sma_radacctLocalService = sma_radacctLocalService;
	}

	private SMA_radacctLocalService _sma_radacctLocalService;
}