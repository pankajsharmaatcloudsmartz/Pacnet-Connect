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
 * This class is a wrapper for {@link SAM_Email_HistoryService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SAM_Email_HistoryService
 * @generated
 */
public class SAM_Email_HistoryServiceWrapper implements SAM_Email_HistoryService,
	ServiceWrapper<SAM_Email_HistoryService> {
	public SAM_Email_HistoryServiceWrapper(
		SAM_Email_HistoryService sam_Email_HistoryService) {
		_sam_Email_HistoryService = sam_Email_HistoryService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sam_Email_HistoryService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sam_Email_HistoryService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sam_Email_HistoryService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SAM_Email_HistoryService getWrappedSAM_Email_HistoryService() {
		return _sam_Email_HistoryService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSAM_Email_HistoryService(
		SAM_Email_HistoryService sam_Email_HistoryService) {
		_sam_Email_HistoryService = sam_Email_HistoryService;
	}

	public SAM_Email_HistoryService getWrappedService() {
		return _sam_Email_HistoryService;
	}

	public void setWrappedService(
		SAM_Email_HistoryService sam_Email_HistoryService) {
		_sam_Email_HistoryService = sam_Email_HistoryService;
	}

	private SAM_Email_HistoryService _sam_Email_HistoryService;
}