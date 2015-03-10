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
 * This class is a wrapper for {@link SMAReservationService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMAReservationService
 * @generated
 */
public class SMAReservationServiceWrapper implements SMAReservationService,
	ServiceWrapper<SMAReservationService> {
	public SMAReservationServiceWrapper(
		SMAReservationService smaReservationService) {
		_smaReservationService = smaReservationService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _smaReservationService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_smaReservationService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _smaReservationService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SMAReservationService getWrappedSMAReservationService() {
		return _smaReservationService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSMAReservationService(
		SMAReservationService smaReservationService) {
		_smaReservationService = smaReservationService;
	}

	public SMAReservationService getWrappedService() {
		return _smaReservationService;
	}

	public void setWrappedService(SMAReservationService smaReservationService) {
		_smaReservationService = smaReservationService;
	}

	private SMAReservationService _smaReservationService;
}