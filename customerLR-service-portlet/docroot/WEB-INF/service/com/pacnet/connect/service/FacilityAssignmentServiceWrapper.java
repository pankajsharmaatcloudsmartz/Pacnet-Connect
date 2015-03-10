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
 * This class is a wrapper for {@link FacilityAssignmentService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       FacilityAssignmentService
 * @generated
 */
public class FacilityAssignmentServiceWrapper
	implements FacilityAssignmentService,
		ServiceWrapper<FacilityAssignmentService> {
	public FacilityAssignmentServiceWrapper(
		FacilityAssignmentService facilityAssignmentService) {
		_facilityAssignmentService = facilityAssignmentService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _facilityAssignmentService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_facilityAssignmentService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _facilityAssignmentService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public FacilityAssignmentService getWrappedFacilityAssignmentService() {
		return _facilityAssignmentService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedFacilityAssignmentService(
		FacilityAssignmentService facilityAssignmentService) {
		_facilityAssignmentService = facilityAssignmentService;
	}

	public FacilityAssignmentService getWrappedService() {
		return _facilityAssignmentService;
	}

	public void setWrappedService(
		FacilityAssignmentService facilityAssignmentService) {
		_facilityAssignmentService = facilityAssignmentService;
	}

	private FacilityAssignmentService _facilityAssignmentService;
}