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

import com.pacnet.connect.model.AccessRequestNoteHistory;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing AccessRequestNoteHistory in entity cache.
 *
 * @author CloudSmartz
 * @see AccessRequestNoteHistory
 * @generated
 */
public class AccessRequestNoteHistoryCacheModel implements CacheModel<AccessRequestNoteHistory>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", accessRequestId=");
		sb.append(accessRequestId);
		sb.append(", customerId=");
		sb.append(customerId);
		sb.append(", note=");
		sb.append(note);
		sb.append(", tableName=");
		sb.append(tableName);
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

	public AccessRequestNoteHistory toEntityModel() {
		AccessRequestNoteHistoryImpl accessRequestNoteHistoryImpl = new AccessRequestNoteHistoryImpl();

		accessRequestNoteHistoryImpl.setId(id);
		accessRequestNoteHistoryImpl.setAccessRequestId(accessRequestId);
		accessRequestNoteHistoryImpl.setCustomerId(customerId);

		if (note == null) {
			accessRequestNoteHistoryImpl.setNote(StringPool.BLANK);
		}
		else {
			accessRequestNoteHistoryImpl.setNote(note);
		}

		if (tableName == null) {
			accessRequestNoteHistoryImpl.setTableName(StringPool.BLANK);
		}
		else {
			accessRequestNoteHistoryImpl.setTableName(tableName);
		}

		accessRequestNoteHistoryImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			accessRequestNoteHistoryImpl.setCreatedOn(null);
		}
		else {
			accessRequestNoteHistoryImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			accessRequestNoteHistoryImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			accessRequestNoteHistoryImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			accessRequestNoteHistoryImpl.setUpdatedOn(null);
		}
		else {
			accessRequestNoteHistoryImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			accessRequestNoteHistoryImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			accessRequestNoteHistoryImpl.setUpdatedBy(updatedBy);
		}

		accessRequestNoteHistoryImpl.resetOriginalValues();

		return accessRequestNoteHistoryImpl;
	}

	public long id;
	public long accessRequestId;
	public long customerId;
	public String note;
	public String tableName;
	public boolean isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}