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
 * This class is a wrapper for {@link SAM_radacctService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SAM_radacctService
 * @generated
 */
public class SAM_radacctServiceWrapper implements SAM_radacctService,
	ServiceWrapper<SAM_radacctService> {
	public SAM_radacctServiceWrapper(SAM_radacctService sam_radacctService) {
		_sam_radacctService = sam_radacctService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sam_radacctService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sam_radacctService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sam_radacctService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SAM_radacctService getWrappedSAM_radacctService() {
		return _sam_radacctService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSAM_radacctService(
		SAM_radacctService sam_radacctService) {
		_sam_radacctService = sam_radacctService;
	}

	public SAM_radacctService getWrappedService() {
		return _sam_radacctService;
	}

	public void setWrappedService(SAM_radacctService sam_radacctService) {
		_sam_radacctService = sam_radacctService;
	}

	private SAM_radacctService _sam_radacctService;
}