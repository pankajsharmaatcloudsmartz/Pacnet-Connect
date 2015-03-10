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
 * This class is a wrapper for {@link SAM_CompaniesService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SAM_CompaniesService
 * @generated
 */
public class SAM_CompaniesServiceWrapper implements SAM_CompaniesService,
	ServiceWrapper<SAM_CompaniesService> {
	public SAM_CompaniesServiceWrapper(
		SAM_CompaniesService sam_CompaniesService) {
		_sam_CompaniesService = sam_CompaniesService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sam_CompaniesService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sam_CompaniesService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sam_CompaniesService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SAM_CompaniesService getWrappedSAM_CompaniesService() {
		return _sam_CompaniesService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSAM_CompaniesService(
		SAM_CompaniesService sam_CompaniesService) {
		_sam_CompaniesService = sam_CompaniesService;
	}

	public SAM_CompaniesService getWrappedService() {
		return _sam_CompaniesService;
	}

	public void setWrappedService(SAM_CompaniesService sam_CompaniesService) {
		_sam_CompaniesService = sam_CompaniesService;
	}

	private SAM_CompaniesService _sam_CompaniesService;
}