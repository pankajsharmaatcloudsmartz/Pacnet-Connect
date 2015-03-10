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
 * This class is a wrapper for {@link SMA_reservationService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMA_reservationService
 * @generated
 */
public class SMA_reservationServiceWrapper implements SMA_reservationService,
	ServiceWrapper<SMA_reservationService> {
	public SMA_reservationServiceWrapper(
		SMA_reservationService sma_reservationService) {
		_sma_reservationService = sma_reservationService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sma_reservationService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sma_reservationService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sma_reservationService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SMA_reservationService getWrappedSMA_reservationService() {
		return _sma_reservationService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSMA_reservationService(
		SMA_reservationService sma_reservationService) {
		_sma_reservationService = sma_reservationService;
	}

	public SMA_reservationService getWrappedService() {
		return _sma_reservationService;
	}

	public void setWrappedService(SMA_reservationService sma_reservationService) {
		_sma_reservationService = sma_reservationService;
	}

	private SMA_reservationService _sma_reservationService;
}