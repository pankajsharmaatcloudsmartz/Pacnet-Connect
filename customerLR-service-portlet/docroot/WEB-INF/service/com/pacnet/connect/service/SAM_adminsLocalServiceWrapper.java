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
 * This class is a wrapper for {@link SAM_adminsLocalService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SAM_adminsLocalService
 * @generated
 */
public class SAM_adminsLocalServiceWrapper implements SAM_adminsLocalService,
	ServiceWrapper<SAM_adminsLocalService> {
	public SAM_adminsLocalServiceWrapper(
		SAM_adminsLocalService sam_adminsLocalService) {
		_sam_adminsLocalService = sam_adminsLocalService;
	}

	/**
	* Adds the s a m_admins to the database. Also notifies the appropriate model listeners.
	*
	* @param sam_admins the s a m_admins
	* @return the s a m_admins that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_admins addSAM_admins(
		com.pacnet.connect.model.SAM_admins sam_admins)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_adminsLocalService.addSAM_admins(sam_admins);
	}

	/**
	* Creates a new s a m_admins with the primary key. Does not add the s a m_admins to the database.
	*
	* @param id the primary key for the new s a m_admins
	* @return the new s a m_admins
	*/
	public com.pacnet.connect.model.SAM_admins createSAM_admins(long id) {
		return _sam_adminsLocalService.createSAM_admins(id);
	}

	/**
	* Deletes the s a m_admins with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s a m_admins
	* @return the s a m_admins that was removed
	* @throws PortalException if a s a m_admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_admins deleteSAM_admins(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sam_adminsLocalService.deleteSAM_admins(id);
	}

	/**
	* Deletes the s a m_admins from the database. Also notifies the appropriate model listeners.
	*
	* @param sam_admins the s a m_admins
	* @return the s a m_admins that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_admins deleteSAM_admins(
		com.pacnet.connect.model.SAM_admins sam_admins)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_adminsLocalService.deleteSAM_admins(sam_admins);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sam_adminsLocalService.dynamicQuery();
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
		return _sam_adminsLocalService.dynamicQuery(dynamicQuery);
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
		return _sam_adminsLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _sam_adminsLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _sam_adminsLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.pacnet.connect.model.SAM_admins fetchSAM_admins(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_adminsLocalService.fetchSAM_admins(id);
	}

	/**
	* Returns the s a m_admins with the primary key.
	*
	* @param id the primary key of the s a m_admins
	* @return the s a m_admins
	* @throws PortalException if a s a m_admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_admins getSAM_admins(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sam_adminsLocalService.getSAM_admins(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sam_adminsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the s a m_adminses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s a m_adminses
	* @param end the upper bound of the range of s a m_adminses (not inclusive)
	* @return the range of s a m_adminses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SAM_admins> getSAM_adminses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_adminsLocalService.getSAM_adminses(start, end);
	}

	/**
	* Returns the number of s a m_adminses.
	*
	* @return the number of s a m_adminses
	* @throws SystemException if a system exception occurred
	*/
	public int getSAM_adminsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_adminsLocalService.getSAM_adminsesCount();
	}

	/**
	* Updates the s a m_admins in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sam_admins the s a m_admins
	* @return the s a m_admins that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_admins updateSAM_admins(
		com.pacnet.connect.model.SAM_admins sam_admins)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_adminsLocalService.updateSAM_admins(sam_admins);
	}

	/**
	* Updates the s a m_admins in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sam_admins the s a m_admins
	* @param merge whether to merge the s a m_admins with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s a m_admins that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_admins updateSAM_admins(
		com.pacnet.connect.model.SAM_admins sam_admins, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_adminsLocalService.updateSAM_admins(sam_admins, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sam_adminsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sam_adminsLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sam_adminsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SAM_adminsLocalService getWrappedSAM_adminsLocalService() {
		return _sam_adminsLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSAM_adminsLocalService(
		SAM_adminsLocalService sam_adminsLocalService) {
		_sam_adminsLocalService = sam_adminsLocalService;
	}

	public SAM_adminsLocalService getWrappedService() {
		return _sam_adminsLocalService;
	}

	public void setWrappedService(SAM_adminsLocalService sam_adminsLocalService) {
		_sam_adminsLocalService = sam_adminsLocalService;
	}

	private SAM_adminsLocalService _sam_adminsLocalService;
}