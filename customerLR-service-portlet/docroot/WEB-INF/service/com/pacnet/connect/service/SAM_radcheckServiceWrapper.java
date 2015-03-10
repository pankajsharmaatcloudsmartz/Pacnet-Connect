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
 * This class is a wrapper for {@link SAM_radcheckService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SAM_radcheckService
 * @generated
 */
public class SAM_radcheckServiceWrapper implements SAM_radcheckService,
	ServiceWrapper<SAM_radcheckService> {
	public SAM_radcheckServiceWrapper(SAM_radcheckService sam_radcheckService) {
		_sam_radcheckService = sam_radcheckService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sam_radcheckService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sam_radcheckService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sam_radcheckService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SAM_radcheckService getWrappedSAM_radcheckService() {
		return _sam_radcheckService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSAM_radcheckService(
		SAM_radcheckService sam_radcheckService) {
		_sam_radcheckService = sam_radcheckService;
	}

	public SAM_radcheckService getWrappedService() {
		return _sam_radcheckService;
	}

	public void setWrappedService(SAM_radcheckService sam_radcheckService) {
		_sam_radcheckService = sam_radcheckService;
	}

	private SAM_radcheckService _sam_radcheckService;
}