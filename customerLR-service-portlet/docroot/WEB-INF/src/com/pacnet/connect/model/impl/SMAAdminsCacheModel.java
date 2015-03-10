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

import com.pacnet.connect.model.SMAAdmins;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing SMAAdmins in entity cache.
 *
 * @author CloudSmartz
 * @see SMAAdmins
 * @generated
 */
public class SMAAdminsCacheModel implements CacheModel<SMAAdmins>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", radcheckId=");
		sb.append(radcheckId);
		sb.append(", companyId=");
		sb.append(companyId);
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

	public SMAAdmins toEntityModel() {
		SMAAdminsImpl smaAdminsImpl = new SMAAdminsImpl();

		smaAdminsImpl.setId(id);
		smaAdminsImpl.setUserId(userId);
		smaAdminsImpl.setRadcheckId(radcheckId);
		smaAdminsImpl.setCompanyId(companyId);
		smaAdminsImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			smaAdminsImpl.setCreatedOn(null);
		}
		else {
			smaAdminsImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			smaAdminsImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			smaAdminsImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			smaAdminsImpl.setUpdatedOn(null);
		}
		else {
			smaAdminsImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			smaAdminsImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			smaAdminsImpl.setUpdatedBy(updatedBy);
		}

		smaAdminsImpl.resetOriginalValues();

		return smaAdminsImpl;
	}

	public long id;
	public long userId;
	public long radcheckId;
	public long companyId;
	public int isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}