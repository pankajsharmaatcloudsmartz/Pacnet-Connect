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

import com.pacnet.connect.model.AccessLog;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing AccessLog in entity cache.
 *
 * @author CloudSmartz
 * @see AccessLog
 * @generated
 */
public class AccessLogCacheModel implements CacheModel<AccessLog>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", accessRequestId=");
		sb.append(accessRequestId);
		sb.append(", facilityUserMappingId=");
		sb.append(facilityUserMappingId);
		sb.append(", actualDateOfVisit=");
		sb.append(actualDateOfVisit);
		sb.append(", timeIn=");
		sb.append(timeIn);
		sb.append(", timeOut=");
		sb.append(timeOut);
		sb.append(", note=");
		sb.append(note);
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

	public AccessLog toEntityModel() {
		AccessLogImpl accessLogImpl = new AccessLogImpl();

		accessLogImpl.setId(id);
		accessLogImpl.setAccessRequestId(accessRequestId);
		accessLogImpl.setFacilityUserMappingId(facilityUserMappingId);

		if (actualDateOfVisit == Long.MIN_VALUE) {
			accessLogImpl.setActualDateOfVisit(null);
		}
		else {
			accessLogImpl.setActualDateOfVisit(new Date(actualDateOfVisit));
		}

		accessLogImpl.setTimeIn(timeIn);
		accessLogImpl.setTimeOut(timeOut);

		if (note == null) {
			accessLogImpl.setNote(StringPool.BLANK);
		}
		else {
			accessLogImpl.setNote(note);
		}

		accessLogImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			accessLogImpl.setCreatedOn(null);
		}
		else {
			accessLogImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			accessLogImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			accessLogImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			accessLogImpl.setUpdatedOn(null);
		}
		else {
			accessLogImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			accessLogImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			accessLogImpl.setUpdatedBy(updatedBy);
		}

		accessLogImpl.resetOriginalValues();

		return accessLogImpl;
	}

	public long id;
	public long accessRequestId;
	public long facilityUserMappingId;
	public long actualDateOfVisit;
	public long timeIn;
	public long timeOut;
	public String note;
	public boolean isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}