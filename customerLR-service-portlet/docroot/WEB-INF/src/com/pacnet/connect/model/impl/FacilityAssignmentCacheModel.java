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

import com.pacnet.connect.model.FacilityAssignment;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing FacilityAssignment in entity cache.
 *
 * @author CloudSmartz
 * @see FacilityAssignment
 * @generated
 */
public class FacilityAssignmentCacheModel implements CacheModel<FacilityAssignment>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", customerId=");
		sb.append(customerId);
		sb.append(", faciltyId=");
		sb.append(faciltyId);
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

	public FacilityAssignment toEntityModel() {
		FacilityAssignmentImpl facilityAssignmentImpl = new FacilityAssignmentImpl();

		facilityAssignmentImpl.setId(id);
		facilityAssignmentImpl.setCustomerId(customerId);
		facilityAssignmentImpl.setFaciltyId(faciltyId);
		facilityAssignmentImpl.setFacilityServiceId(facilityServiceId);
		facilityAssignmentImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			facilityAssignmentImpl.setCreatedOn(null);
		}
		else {
			facilityAssignmentImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			facilityAssignmentImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			facilityAssignmentImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			facilityAssignmentImpl.setUpdatedOn(null);
		}
		else {
			facilityAssignmentImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			facilityAssignmentImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			facilityAssignmentImpl.setUpdatedBy(updatedBy);
		}

		facilityAssignmentImpl.resetOriginalValues();

		return facilityAssignmentImpl;
	}

	public long id;
	public long customerId;
	public long faciltyId;
	public long facilityServiceId;
	public boolean isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}