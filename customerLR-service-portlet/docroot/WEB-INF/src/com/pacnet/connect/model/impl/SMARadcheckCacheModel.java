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

import com.pacnet.connect.model.SMARadcheck;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing SMARadcheck in entity cache.
 *
 * @author CloudSmartz
 * @see SMARadcheck
 * @generated
 */
public class SMARadcheckCacheModel implements CacheModel<SMARadcheck>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", username=");
		sb.append(username);
		sb.append(", attribute=");
		sb.append(attribute);
		sb.append(", op=");
		sb.append(op);
		sb.append(", value=");
		sb.append(value);
		sb.append(", isAdmin=");
		sb.append(isAdmin);
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

	public SMARadcheck toEntityModel() {
		SMARadcheckImpl smaRadcheckImpl = new SMARadcheckImpl();

		smaRadcheckImpl.setId(id);
		smaRadcheckImpl.setCompanyId(companyId);

		if (username == null) {
			smaRadcheckImpl.setUsername(StringPool.BLANK);
		}
		else {
			smaRadcheckImpl.setUsername(username);
		}

		if (attribute == null) {
			smaRadcheckImpl.setAttribute(StringPool.BLANK);
		}
		else {
			smaRadcheckImpl.setAttribute(attribute);
		}

		if (op == null) {
			smaRadcheckImpl.setOp(StringPool.BLANK);
		}
		else {
			smaRadcheckImpl.setOp(op);
		}

		if (value == null) {
			smaRadcheckImpl.setValue(StringPool.BLANK);
		}
		else {
			smaRadcheckImpl.setValue(value);
		}

		smaRadcheckImpl.setIsAdmin(isAdmin);
		smaRadcheckImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			smaRadcheckImpl.setCreatedOn(null);
		}
		else {
			smaRadcheckImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			smaRadcheckImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			smaRadcheckImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			smaRadcheckImpl.setUpdatedOn(null);
		}
		else {
			smaRadcheckImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			smaRadcheckImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			smaRadcheckImpl.setUpdatedBy(updatedBy);
		}

		smaRadcheckImpl.resetOriginalValues();

		return smaRadcheckImpl;
	}

	public long id;
	public long companyId;
	public String username;
	public String attribute;
	public String op;
	public String value;
	public int isAdmin;
	public int isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}