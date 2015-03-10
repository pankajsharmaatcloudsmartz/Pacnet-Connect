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
 * This class is a wrapper for {@link SMA_radcheckService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMA_radcheckService
 * @generated
 */
public class SMA_radcheckServiceWrapper implements SMA_radcheckService,
	ServiceWrapper<SMA_radcheckService> {
	public SMA_radcheckServiceWrapper(SMA_radcheckService sma_radcheckService) {
		_sma_radcheckService = sma_radcheckService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sma_radcheckService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sma_radcheckService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sma_radcheckService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SMA_radcheckService getWrappedSMA_radcheckService() {
		return _sma_radcheckService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSMA_radcheckService(
		SMA_radcheckService sma_radcheckService) {
		_sma_radcheckService = sma_radcheckService;
	}

	public SMA_radcheckService getWrappedService() {
		return _sma_radcheckService;
	}

	public void setWrappedService(SMA_radcheckService sma_radcheckService) {
		_sma_radcheckService = sma_radcheckService;
	}

	private SMA_radcheckService _sma_radcheckService;
}