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
 * This class is a wrapper for {@link SAM_adminsService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SAM_adminsService
 * @generated
 */
public class SAM_adminsServiceWrapper implements SAM_adminsService,
	ServiceWrapper<SAM_adminsService> {
	public SAM_adminsServiceWrapper(SAM_adminsService sam_adminsService) {
		_sam_adminsService = sam_adminsService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sam_adminsService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sam_adminsService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sam_adminsService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SAM_adminsService getWrappedSAM_adminsService() {
		return _sam_adminsService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSAM_adminsService(SAM_adminsService sam_adminsService) {
		_sam_adminsService = sam_adminsService;
	}

	public SAM_adminsService getWrappedService() {
		return _sam_adminsService;
	}

	public void setWrappedService(SAM_adminsService sam_adminsService) {
		_sam_adminsService = sam_adminsService;
	}

	private SAM_adminsService _sam_adminsService;
}