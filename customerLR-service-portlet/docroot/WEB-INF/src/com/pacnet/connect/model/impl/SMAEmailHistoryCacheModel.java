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

import com.pacnet.connect.model.SMAEmailHistory;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing SMAEmailHistory in entity cache.
 *
 * @author CloudSmartz
 * @see SMAEmailHistory
 * @generated
 */
public class SMAEmailHistoryCacheModel implements CacheModel<SMAEmailHistory>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", historyType=");
		sb.append(historyType);
		sb.append(", emailFrom=");
		sb.append(emailFrom);
		sb.append(", emailTo=");
		sb.append(emailTo);
		sb.append(", emailTitle=");
		sb.append(emailTitle);
		sb.append(", emailContent=");
		sb.append(emailContent);
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

	public SMAEmailHistory toEntityModel() {
		SMAEmailHistoryImpl smaEmailHistoryImpl = new SMAEmailHistoryImpl();

		smaEmailHistoryImpl.setId(id);

		if (name == null) {
			smaEmailHistoryImpl.setName(StringPool.BLANK);
		}
		else {
			smaEmailHistoryImpl.setName(name);
		}

		smaEmailHistoryImpl.setHistoryType(historyType);

		if (emailFrom == null) {
			smaEmailHistoryImpl.setEmailFrom(StringPool.BLANK);
		}
		else {
			smaEmailHistoryImpl.setEmailFrom(emailFrom);
		}

		if (emailTo == null) {
			smaEmailHistoryImpl.setEmailTo(StringPool.BLANK);
		}
		else {
			smaEmailHistoryImpl.setEmailTo(emailTo);
		}

		if (emailTitle == null) {
			smaEmailHistoryImpl.setEmailTitle(StringPool.BLANK);
		}
		else {
			smaEmailHistoryImpl.setEmailTitle(emailTitle);
		}

		if (emailContent == null) {
			smaEmailHistoryImpl.setEmailContent(StringPool.BLANK);
		}
		else {
			smaEmailHistoryImpl.setEmailContent(emailContent);
		}

		smaEmailHistoryImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			smaEmailHistoryImpl.setCreatedOn(null);
		}
		else {
			smaEmailHistoryImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			smaEmailHistoryImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			smaEmailHistoryImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			smaEmailHistoryImpl.setUpdatedOn(null);
		}
		else {
			smaEmailHistoryImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			smaEmailHistoryImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			smaEmailHistoryImpl.setUpdatedBy(updatedBy);
		}

		smaEmailHistoryImpl.resetOriginalValues();

		return smaEmailHistoryImpl;
	}

	public long id;
	public String name;
	public int historyType;
	public String emailFrom;
	public String emailTo;
	public String emailTitle;
	public String emailContent;
	public int isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}