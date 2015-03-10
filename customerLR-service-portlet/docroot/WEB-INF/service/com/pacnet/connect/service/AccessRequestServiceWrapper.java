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
 * This class is a wrapper for {@link AccessRequestService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       AccessRequestService
 * @generated
 */
public class AccessRequestServiceWrapper implements AccessRequestService,
	ServiceWrapper<AccessRequestService> {
	public AccessRequestServiceWrapper(
		AccessRequestService accessRequestService) {
		_accessRequestService = accessRequestService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _accessRequestService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_accessRequestService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _accessRequestService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public AccessRequestService getWrappedAccessRequestService() {
		return _accessRequestService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedAccessRequestService(
		AccessRequestService accessRequestService) {
		_accessRequestService = accessRequestService;
	}

	public AccessRequestService getWrappedService() {
		return _accessRequestService;
	}

	public void setWrappedService(AccessRequestService accessRequestService) {
		_accessRequestService = accessRequestService;
	}

	private AccessRequestService _accessRequestService;
}