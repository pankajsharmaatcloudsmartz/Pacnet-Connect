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

import com.pacnet.connect.model.FacilityUserMapping;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing FacilityUserMapping in entity cache.
 *
 * @author CloudSmartz
 * @see FacilityUserMapping
 * @generated
 */
public class FacilityUserMappingCacheModel implements CacheModel<FacilityUserMapping>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", customerId=");
		sb.append(customerId);
		sb.append(", faciltyId=");
		sb.append(faciltyId);
		sb.append(", customerContactId=");
		sb.append(customerContactId);
		sb.append(", isActive=");
		sb.append(isActive);
		sb.append(", nonPacnetUserId=");
		sb.append(nonPacnetUserId);
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

	public FacilityUserMapping toEntityModel() {
		FacilityUserMappingImpl facilityUserMappingImpl = new FacilityUserMappingImpl();

		facilityUserMappingImpl.setId(id);
		facilityUserMappingImpl.setCustomerId(customerId);
		facilityUserMappingImpl.setFaciltyId(faciltyId);
		facilityUserMappingImpl.setCustomerContactId(customerContactId);
		facilityUserMappingImpl.setIsActive(isActive);
		facilityUserMappingImpl.setNonPacnetUserId(nonPacnetUserId);

		if (createdOn == Long.MIN_VALUE) {
			facilityUserMappingImpl.setCreatedOn(null);
		}
		else {
			facilityUserMappingImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			facilityUserMappingImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			facilityUserMappingImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			facilityUserMappingImpl.setUpdatedOn(null);
		}
		else {
			facilityUserMappingImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			facilityUserMappingImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			facilityUserMappingImpl.setUpdatedBy(updatedBy);
		}

		facilityUserMappingImpl.resetOriginalValues();

		return facilityUserMappingImpl;
	}

	public long id;
	public long customerId;
	public long faciltyId;
	public long customerContactId;
	public boolean isActive;
	public long nonPacnetUserId;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}