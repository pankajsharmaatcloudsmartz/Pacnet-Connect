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

import com.pacnet.connect.model.AccessRequestStatus;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing AccessRequestStatus in entity cache.
 *
 * @author CloudSmartz
 * @see AccessRequestStatus
 * @generated
 */
public class AccessRequestStatusCacheModel implements CacheModel<AccessRequestStatus>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
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

	public AccessRequestStatus toEntityModel() {
		AccessRequestStatusImpl accessRequestStatusImpl = new AccessRequestStatusImpl();

		accessRequestStatusImpl.setId(id);

		if (name == null) {
			accessRequestStatusImpl.setName(StringPool.BLANK);
		}
		else {
			accessRequestStatusImpl.setName(name);
		}

		accessRequestStatusImpl.setDescription(description);
		accessRequestStatusImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			accessRequestStatusImpl.setCreatedOn(null);
		}
		else {
			accessRequestStatusImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			accessRequestStatusImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			accessRequestStatusImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			accessRequestStatusImpl.setUpdatedOn(null);
		}
		else {
			accessRequestStatusImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			accessRequestStatusImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			accessRequestStatusImpl.setUpdatedBy(updatedBy);
		}

		accessRequestStatusImpl.resetOriginalValues();

		return accessRequestStatusImpl;
	}

	public long id;
	public String name;
	public long description;
	public boolean isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}