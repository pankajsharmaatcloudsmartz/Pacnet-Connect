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
 * This class is a wrapper for {@link SMA_radacctService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMA_radacctService
 * @generated
 */
public class SMA_radacctServiceWrapper implements SMA_radacctService,
	ServiceWrapper<SMA_radacctService> {
	public SMA_radacctServiceWrapper(SMA_radacctService sma_radacctService) {
		_sma_radacctService = sma_radacctService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sma_radacctService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sma_radacctService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sma_radacctService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SMA_radacctService getWrappedSMA_radacctService() {
		return _sma_radacctService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSMA_radacctService(
		SMA_radacctService sma_radacctService) {
		_sma_radacctService = sma_radacctService;
	}

	public SMA_radacctService getWrappedService() {
		return _sma_radacctService;
	}

	public void setWrappedService(SMA_radacctService sma_radacctService) {
		_sma_radacctService = sma_radacctService;
	}

	private SMA_radacctService _sma_radacctService;
}