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

package com.pacnet.connect.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.pacnet.connect.model.FacilityUserService;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing FacilityUserService in entity cache.
 *
 * @author CloudSmartz
 * @see FacilityUserService
 * @generated
 */
public class FacilityUserServiceCacheModel implements CacheModel<FacilityUserService>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", facilityUserMappingId=");
		sb.append(facilityUserMappingId);
		sb.append(", facilityServiceId=");
		sb.append(facilityServiceId);
		sb.append(", isActive=");
		sb.append(isActive);
		sb.append(", createdOn=");
		sb.append(createdOn);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", updatedOn=");
		sb.append(updatedOn);
		sb.append(", updatedBy=");
		sb.append(updatedBy);
		sb.append("}");

		return sb.toString();
	}

	public FacilityUserService toEntityModel() {
		FacilityUserServiceImpl facilityUserServiceImpl = new FacilityUserServiceImpl();

		facilityUserServiceImpl.setId(id);
		facilityUserServiceImpl.setFacilityUserMappingId(facilityUserMappingId);
		facilityUserServiceImpl.setFacilityServiceId(facilityServiceId);
		facilityUserServiceImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			facilityUserServiceImpl.setCreatedOn(null);
		}
		else {
			facilityUserServiceImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			facilityUserServiceImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			facilityUserServiceImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			facilityUserServiceImpl.setUpdatedOn(null);
		}
		else {
			facilityUserServiceImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			facilityUserServiceImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			facilityUserServiceImpl.setUpdatedBy(updatedBy);
		}

		facilityUserServiceImpl.resetOriginalValues();

		return facilityUserServiceImpl;
	}

	public long id;
	public long facilityUserMappingId;
	public long facilityServiceId;
	public boolean isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}