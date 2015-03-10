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
 * This class is a wrapper for {@link SAM_CompaniesLocalService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SAM_CompaniesLocalService
 * @generated
 */
public class SAM_CompaniesLocalServiceWrapper
	implements SAM_CompaniesLocalService,
		ServiceWrapper<SAM_CompaniesLocalService> {
	public SAM_CompaniesLocalServiceWrapper(
		SAM_CompaniesLocalService sam_CompaniesLocalService) {
		_sam_CompaniesLocalService = sam_CompaniesLocalService;
	}

	/**
	* Adds the s a m_ companies to the database. Also notifies the appropriate model listeners.
	*
	* @param sam_Companies the s a m_ companies
	* @return the s a m_ companies that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_Companies addSAM_Companies(
		com.pacnet.connect.model.SAM_Companies sam_Companies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_CompaniesLocalService.addSAM_Companies(sam_Companies);
	}

	/**
	* Creates a new s a m_ companies with the primary key. Does not add the s a m_ companies to the database.
	*
	* @param id the primary key for the new s a m_ companies
	* @return the new s a m_ companies
	*/
	public com.pacnet.connect.model.SAM_Companies createSAM_Companies(long id) {
		return _sam_CompaniesLocalService.createSAM_Companies(id);
	}

	/**
	* Deletes the s a m_ companies with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s a m_ companies
	* @return the s a m_ companies that was removed
	* @throws PortalException if a s a m_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_Companies deleteSAM_Companies(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sam_CompaniesLocalService.deleteSAM_Companies(id);
	}

	/**
	* Deletes the s a m_ companies from the database. Also notifies the appropriate model listeners.
	*
	* @param sam_Companies the s a m_ companies
	* @return the s a m_ companies that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_Companies deleteSAM_Companies(
		com.pacnet.connect.model.SAM_Companies sam_Companies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_CompaniesLocalService.deleteSAM_Companies(sam_Companies);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sam_CompaniesLocalService.dynamicQuery();
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
		return _sam_CompaniesLocalService.dynamicQuery(dynamicQuery);
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
		return _sam_CompaniesLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _sam_CompaniesLocalService.dynamicQuery(dynamicQuery, start,
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
		return _sam_CompaniesLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.pacnet.connect.model.SAM_Companies fetchSAM_Companies(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_CompaniesLocalService.fetchSAM_Companies(id);
	}

	/**
	* Returns the s a m_ companies with the primary key.
	*
	* @param id the primary key of the s a m_ companies
	* @return the s a m_ companies
	* @throws PortalException if a s a m_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_Companies getSAM_Companies(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sam_CompaniesLocalService.getSAM_Companies(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sam_CompaniesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the s a m_ companieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s a m_ companieses
	* @param end the upper bound of the range of s a m_ companieses (not inclusive)
	* @return the range of s a m_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SAM_Companies> getSAM_Companieses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_CompaniesLocalService.getSAM_Companieses(start, end);
	}

	/**
	* Returns the number of s a m_ companieses.
	*
	* @return the number of s a m_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public int getSAM_CompaniesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_CompaniesLocalService.getSAM_CompaniesesCount();
	}

	/**
	* Updates the s a m_ companies in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sam_Companies the s a m_ companies
	* @return the s a m_ companies that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_Companies updateSAM_Companies(
		com.pacnet.connect.model.SAM_Companies sam_Companies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_CompaniesLocalService.updateSAM_Companies(sam_Companies);
	}

	/**
	* Updates the s a m_ companies in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sam_Companies the s a m_ companies
	* @param merge whether to merge the s a m_ companies with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s a m_ companies that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_Companies updateSAM_Companies(
		com.pacnet.connect.model.SAM_Companies sam_Companies, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_CompaniesLocalService.updateSAM_Companies(sam_Companies,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sam_CompaniesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sam_CompaniesLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sam_CompaniesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SAM_CompaniesLocalService getWrappedSAM_CompaniesLocalService() {
		return _sam_CompaniesLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSAM_CompaniesLocalService(
		SAM_CompaniesLocalService sam_CompaniesLocalService) {
		_sam_CompaniesLocalService = sam_CompaniesLocalService;
	}

	public SAM_CompaniesLocalService getWrappedService() {
		return _sam_CompaniesLocalService;
	}

	public void setWrappedService(
		SAM_CompaniesLocalService sam_CompaniesLocalService) {
		_sam_CompaniesLocalService = sam_CompaniesLocalService;
	}

	private SAM_CompaniesLocalService _sam_CompaniesLocalService;
}