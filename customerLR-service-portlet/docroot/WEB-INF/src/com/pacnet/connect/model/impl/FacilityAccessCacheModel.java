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

import com.pacnet.connect.model.FacilityAccess;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing FacilityAccess in entity cache.
 *
 * @author CloudSmartz
 * @see FacilityAccess
 * @generated
 */
public class FacilityAccessCacheModel implements CacheModel<FacilityAccess>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", label=");
		sb.append(label);
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

	public FacilityAccess toEntityModel() {
		FacilityAccessImpl facilityAccessImpl = new FacilityAccessImpl();

		facilityAccessImpl.setId(id);

		if (name == null) {
			facilityAccessImpl.setName(StringPool.BLANK);
		}
		else {
			facilityAccessImpl.setName(name);
		}

		if (label == null) {
			facilityAccessImpl.setLabel(StringPool.BLANK);
		}
		else {
			facilityAccessImpl.setLabel(label);
		}

		facilityAccessImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			facilityAccessImpl.setCreatedOn(null);
		}
		else {
			facilityAccessImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			facilityAccessImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			facilityAccessImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			facilityAccessImpl.setUpdatedOn(null);
		}
		else {
			facilityAccessImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			facilityAccessImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			facilityAccessImpl.setUpdatedBy(updatedBy);
		}

		facilityAccessImpl.resetOriginalValues();

		return facilityAccessImpl;
	}

	public long id;
	public String name;
	public String label;
	public boolean isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}