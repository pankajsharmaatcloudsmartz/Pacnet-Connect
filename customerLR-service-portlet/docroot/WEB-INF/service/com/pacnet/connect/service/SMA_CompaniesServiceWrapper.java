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
 * This class is a wrapper for {@link SMA_CompaniesService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMA_CompaniesService
 * @generated
 */
public class SMA_CompaniesServiceWrapper implements SMA_CompaniesService,
	ServiceWrapper<SMA_CompaniesService> {
	public SMA_CompaniesServiceWrapper(
		SMA_CompaniesService sma_CompaniesService) {
		_sma_CompaniesService = sma_CompaniesService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sma_CompaniesService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sma_CompaniesService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sma_CompaniesService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SMA_CompaniesService getWrappedSMA_CompaniesService() {
		return _sma_CompaniesService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSMA_CompaniesService(
		SMA_CompaniesService sma_CompaniesService) {
		_sma_CompaniesService = sma_CompaniesService;
	}

	public SMA_CompaniesService getWrappedService() {
		return _sma_CompaniesService;
	}

	public void setWrappedService(SMA_CompaniesService sma_CompaniesService) {
		_sma_CompaniesService = sma_CompaniesService;
	}

	private SMA_CompaniesService _sma_CompaniesService;
}