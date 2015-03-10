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

import com.pacnet.connect.model.FacilitySecurityOfficerMapping;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing FacilitySecurityOfficerMapping in entity cache.
 *
 * @author CloudSmartz
 * @see FacilitySecurityOfficerMapping
 * @generated
 */
public class FacilitySecurityOfficerMappingCacheModel implements CacheModel<FacilitySecurityOfficerMapping>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", faciltyId=");
		sb.append(faciltyId);
		sb.append(", securityOfficerUserId=");
		sb.append(securityOfficerUserId);
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

	public FacilitySecurityOfficerMapping toEntityModel() {
		FacilitySecurityOfficerMappingImpl facilitySecurityOfficerMappingImpl = new FacilitySecurityOfficerMappingImpl();

		facilitySecurityOfficerMappingImpl.setId(id);
		facilitySecurityOfficerMappingImpl.setFaciltyId(faciltyId);
		facilitySecurityOfficerMappingImpl.setSecurityOfficerUserId(securityOfficerUserId);
		facilitySecurityOfficerMappingImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			facilitySecurityOfficerMappingImpl.setCreatedOn(null);
		}
		else {
			facilitySecurityOfficerMappingImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			facilitySecurityOfficerMappingImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			facilitySecurityOfficerMappingImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			facilitySecurityOfficerMappingImpl.setUpdatedOn(null);
		}
		else {
			facilitySecurityOfficerMappingImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			facilitySecurityOfficerMappingImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			facilitySecurityOfficerMappingImpl.setUpdatedBy(updatedBy);
		}

		facilitySecurityOfficerMappingImpl.resetOriginalValues();

		return facilitySecurityOfficerMappingImpl;
	}

	public long id;
	public long faciltyId;
	public long securityOfficerUserId;
	public boolean isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}