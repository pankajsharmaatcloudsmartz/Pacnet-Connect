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

import com.pacnet.connect.model.FacilityStaffMapping;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing FacilityStaffMapping in entity cache.
 *
 * @author CloudSmartz
 * @see FacilityStaffMapping
 * @generated
 */
public class FacilityStaffMappingCacheModel implements CacheModel<FacilityStaffMapping>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", facilityId=");
		sb.append(facilityId);
		sb.append(", staffUserId=");
		sb.append(staffUserId);
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

	public FacilityStaffMapping toEntityModel() {
		FacilityStaffMappingImpl facilityStaffMappingImpl = new FacilityStaffMappingImpl();

		facilityStaffMappingImpl.setId(id);
		facilityStaffMappingImpl.setFacilityId(facilityId);
		facilityStaffMappingImpl.setStaffUserId(staffUserId);
		facilityStaffMappingImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			facilityStaffMappingImpl.setCreatedOn(null);
		}
		else {
			facilityStaffMappingImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			facilityStaffMappingImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			facilityStaffMappingImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			facilityStaffMappingImpl.setUpdatedOn(null);
		}
		else {
			facilityStaffMappingImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			facilityStaffMappingImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			facilityStaffMappingImpl.setUpdatedBy(updatedBy);
		}

		facilityStaffMappingImpl.resetOriginalValues();

		return facilityStaffMappingImpl;
	}

	public long id;
	public long facilityId;
	public long staffUserId;
	public boolean isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}