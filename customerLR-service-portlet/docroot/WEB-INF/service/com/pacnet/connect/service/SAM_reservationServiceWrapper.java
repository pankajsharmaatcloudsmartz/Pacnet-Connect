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
 * This class is a wrapper for {@link SAM_reservationService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SAM_reservationService
 * @generated
 */
public class SAM_reservationServiceWrapper implements SAM_reservationService,
	ServiceWrapper<SAM_reservationService> {
	public SAM_reservationServiceWrapper(
		SAM_reservationService sam_reservationService) {
		_sam_reservationService = sam_reservationService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sam_reservationService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sam_reservationService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sam_reservationService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SAM_reservationService getWrappedSAM_reservationService() {
		return _sam_reservationService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSAM_reservationService(
		SAM_reservationService sam_reservationService) {
		_sam_reservationService = sam_reservationService;
	}

	public SAM_reservationService getWrappedService() {
		return _sam_reservationService;
	}

	public void setWrappedService(SAM_reservationService sam_reservationService) {
		_sam_reservationService = sam_reservationService;
	}

	private SAM_reservationService _sam_reservationService;
}