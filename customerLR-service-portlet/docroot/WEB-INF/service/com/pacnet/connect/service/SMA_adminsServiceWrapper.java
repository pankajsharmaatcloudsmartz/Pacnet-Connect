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
 * This class is a wrapper for {@link SMA_adminsService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMA_adminsService
 * @generated
 */
public class SMA_adminsServiceWrapper implements SMA_adminsService,
	ServiceWrapper<SMA_adminsService> {
	public SMA_adminsServiceWrapper(SMA_adminsService sma_adminsService) {
		_sma_adminsService = sma_adminsService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sma_adminsService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sma_adminsService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sma_adminsService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SMA_adminsService getWrappedSMA_adminsService() {
		return _sma_adminsService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSMA_adminsService(SMA_adminsService sma_adminsService) {
		_sma_adminsService = sma_adminsService;
	}

	public SMA_adminsService getWrappedService() {
		return _sma_adminsService;
	}

	public void setWrappedService(SMA_adminsService sma_adminsService) {
		_sma_adminsService = sma_adminsService;
	}

	private SMA_adminsService _sma_adminsService;
}