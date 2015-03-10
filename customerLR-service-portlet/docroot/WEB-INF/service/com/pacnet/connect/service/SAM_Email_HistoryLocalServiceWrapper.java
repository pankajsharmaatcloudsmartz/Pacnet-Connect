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
 * This class is a wrapper for {@link SAM_Email_HistoryLocalService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SAM_Email_HistoryLocalService
 * @generated
 */
public class SAM_Email_HistoryLocalServiceWrapper
	implements SAM_Email_HistoryLocalService,
		ServiceWrapper<SAM_Email_HistoryLocalService> {
	public SAM_Email_HistoryLocalServiceWrapper(
		SAM_Email_HistoryLocalService sam_Email_HistoryLocalService) {
		_sam_Email_HistoryLocalService = sam_Email_HistoryLocalService;
	}

	/**
	* Adds the s a m_ email_ history to the database. Also notifies the appropriate model listeners.
	*
	* @param sam_Email_History the s a m_ email_ history
	* @return the s a m_ email_ history that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_Email_History addSAM_Email_History(
		com.pacnet.connect.model.SAM_Email_History sam_Email_History)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_Email_HistoryLocalService.addSAM_Email_History(sam_Email_History);
	}

	/**
	* Creates a new s a m_ email_ history with the primary key. Does not add the s a m_ email_ history to the database.
	*
	* @param id the primary key for the new s a m_ email_ history
	* @return the new s a m_ email_ history
	*/
	public com.pacnet.connect.model.SAM_Email_History createSAM_Email_History(
		long id) {
		return _sam_Email_HistoryLocalService.createSAM_Email_History(id);
	}

	/**
	* Deletes the s a m_ email_ history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s a m_ email_ history
	* @return the s a m_ email_ history that was removed
	* @throws PortalException if a s a m_ email_ history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_Email_History deleteSAM_Email_History(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sam_Email_HistoryLocalService.deleteSAM_Email_History(id);
	}

	/**
	* Deletes the s a m_ email_ history from the database. Also notifies the appropriate model listeners.
	*
	* @param sam_Email_History the s a m_ email_ history
	* @return the s a m_ email_ history that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_Email_History deleteSAM_Email_History(
		com.pacnet.connect.model.SAM_Email_History sam_Email_History)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_Email_HistoryLocalService.deleteSAM_Email_History(sam_Email_History);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sam_Email_HistoryLocalService.dynamicQuery();
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
		return _sam_Email_HistoryLocalService.dynamicQuery(dynamicQuery);
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
		return _sam_Email_HistoryLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
		return _sam_Email_HistoryLocalService.dynamicQuery(dynamicQuery, start,
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
		return _sam_Email_HistoryLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.pacnet.connect.model.SAM_Email_History fetchSAM_Email_History(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_Email_HistoryLocalService.fetchSAM_Email_History(id);
	}

	/**
	* Returns the s a m_ email_ history with the primary key.
	*
	* @param id the primary key of the s a m_ email_ history
	* @return the s a m_ email_ history
	* @throws PortalException if a s a m_ email_ history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_Email_History getSAM_Email_History(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sam_Email_HistoryLocalService.getSAM_Email_History(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sam_Email_HistoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the s a m_ email_ histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s a m_ email_ histories
	* @param end the upper bound of the range of s a m_ email_ histories (not inclusive)
	* @return the range of s a m_ email_ histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SAM_Email_History> getSAM_Email_Histories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_Email_HistoryLocalService.getSAM_Email_Histories(start, end);
	}

	/**
	* Returns the number of s a m_ email_ histories.
	*
	* @return the number of s a m_ email_ histories
	* @throws SystemException if a system exception occurred
	*/
	public int getSAM_Email_HistoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_Email_HistoryLocalService.getSAM_Email_HistoriesCount();
	}

	/**
	* Updates the s a m_ email_ history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sam_Email_History the s a m_ email_ history
	* @return the s a m_ email_ history that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_Email_History updateSAM_Email_History(
		com.pacnet.connect.model.SAM_Email_History sam_Email_History)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_Email_HistoryLocalService.updateSAM_Email_History(sam_Email_History);
	}

	/**
	* Updates the s a m_ email_ history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sam_Email_History the s a m_ email_ history
	* @param merge whether to merge the s a m_ email_ history with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s a m_ email_ history that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_Email_History updateSAM_Email_History(
		com.pacnet.connect.model.SAM_Email_History sam_Email_History,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sam_Email_HistoryLocalService.updateSAM_Email_History(sam_Email_History,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sam_Email_HistoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sam_Email_HistoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sam_Email_HistoryLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SAM_Email_HistoryLocalService getWrappedSAM_Email_HistoryLocalService() {
		return _sam_Email_HistoryLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSAM_Email_HistoryLocalService(
		SAM_Email_HistoryLocalService sam_Email_HistoryLocalService) {
		_sam_Email_HistoryLocalService = sam_Email_HistoryLocalService;
	}

	public SAM_Email_HistoryLocalService getWrappedService() {
		return _sam_Email_HistoryLocalService;
	}

	public void setWrappedService(
		SAM_Email_HistoryLocalService sam_Email_HistoryLocalService) {
		_sam_Email_HistoryLocalService = sam_Email_HistoryLocalService;
	}

	private SAM_Email_HistoryLocalService _sam_Email_HistoryLocalService;
}