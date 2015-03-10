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
 * The utility for the s m a_ companies local service. This utility wraps {@link com.pacnet.connect.service.impl.SMA_CompaniesLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see SMA_CompaniesLocalService
 * @see com.pacnet.connect.service.base.SMA_CompaniesLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.SMA_CompaniesLocalServiceImpl
 * @generated
 */
public class SMA_CompaniesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.SMA_CompaniesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the s m a_ companies to the database. Also notifies the appropriate model listeners.
	*
	* @param sma_Companies the s m a_ companies
	* @return the s m a_ companies that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_Companies addSMA_Companies(
		com.pacnet.connect.model.SMA_Companies sma_Companies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSMA_Companies(sma_Companies);
	}

	/**
	* Creates a new s m a_ companies with the primary key. Does not add the s m a_ companies to the database.
	*
	* @param id the primary key for the new s m a_ companies
	* @return the new s m a_ companies
	*/
	public static com.pacnet.connect.model.SMA_Companies createSMA_Companies(
		long id) {
		return getService().createSMA_Companies(id);
	}

	/**
	* Deletes the s m a_ companies with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a_ companies
	* @return the s m a_ companies that was removed
	* @throws PortalException if a s m a_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_Companies deleteSMA_Companies(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSMA_Companies(id);
	}

	/**
	* Deletes the s m a_ companies from the database. Also notifies the appropriate model listeners.
	*
	* @param sma_Companies the s m a_ companies
	* @return the s m a_ companies that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_Companies deleteSMA_Companies(
		com.pacnet.connect.model.SMA_Companies sma_Companies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSMA_Companies(sma_Companies);
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

	public static com.pacnet.connect.model.SMA_Companies fetchSMA_Companies(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSMA_Companies(id);
	}

	/**
	* Returns the s m a_ companies with the primary key.
	*
	* @param id the primary key of the s m a_ companies
	* @return the s m a_ companies
	* @throws PortalException if a s m a_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_Companies getSMA_Companies(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMA_Companies(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.pacnet.connect.model.SMA_Companies> getSMA_Companieses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMA_Companieses(start, end);
	}

	/**
	* Returns the number of s m a_ companieses.
	*
	* @return the number of s m a_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public static int getSMA_CompaniesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMA_CompaniesesCount();
	}

	/**
	* Updates the s m a_ companies in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sma_Companies the s m a_ companies
	* @return the s m a_ companies that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_Companies updateSMA_Companies(
		com.pacnet.connect.model.SMA_Companies sma_Companies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSMA_Companies(sma_Companies);
	}

	/**
	* Updates the s m a_ companies in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sma_Companies the s m a_ companies
	* @param merge whether to merge the s m a_ companies with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s m a_ companies that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_Companies updateSMA_Companies(
		com.pacnet.connect.model.SMA_Companies sma_Companies, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSMA_Companies(sma_Companies, merge);
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

	public static java.util.List<com.pacnet.connect.model.SMA_Companies> findCompniesByCustomerId(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findCompniesByCustomerId(customerId);
	}

	public static void clearService() {
		_service = null;
	}

	public static SMA_CompaniesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SMA_CompaniesLocalService.class.getName());

			if (invokableLocalService instanceof SMA_CompaniesLocalService) {
				_service = (SMA_CompaniesLocalService)invokableLocalService;
			}
			else {
				_service = new SMA_CompaniesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(SMA_CompaniesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(SMA_CompaniesLocalService service) {
	}

	private static SMA_CompaniesLocalService _service;
}