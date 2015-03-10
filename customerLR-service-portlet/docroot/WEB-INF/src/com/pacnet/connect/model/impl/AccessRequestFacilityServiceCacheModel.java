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

import com.pacnet.connect.model.AccessRequestFacilityService;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing AccessRequestFacilityService in entity cache.
 *
 * @author CloudSmartz
 * @see AccessRequestFacilityService
 * @generated
 */
public class AccessRequestFacilityServiceCacheModel implements CacheModel<AccessRequestFacilityService>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", accessRequestId=");
		sb.append(accessRequestId);
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

	public AccessRequestFacilityService toEntityModel() {
		AccessRequestFacilityServiceImpl accessRequestFacilityServiceImpl = new AccessRequestFacilityServiceImpl();

		accessRequestFacilityServiceImpl.setId(id);
		accessRequestFacilityServiceImpl.setAccessRequestId(accessRequestId);
		accessRequestFacilityServiceImpl.setFacilityServiceId(facilityServiceId);
		accessRequestFacilityServiceImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			accessRequestFacilityServiceImpl.setCreatedOn(null);
		}
		else {
			accessRequestFacilityServiceImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			accessRequestFacilityServiceImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			accessRequestFacilityServiceImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			accessRequestFacilityServiceImpl.setUpdatedOn(null);
		}
		else {
			accessRequestFacilityServiceImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			accessRequestFacilityServiceImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			accessRequestFacilityServiceImpl.setUpdatedBy(updatedBy);
		}

		accessRequestFacilityServiceImpl.resetOriginalValues();

		return accessRequestFacilityServiceImpl;
	}

	public long id;
	public long accessRequestId;
	public long facilityServiceId;
	public boolean isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}