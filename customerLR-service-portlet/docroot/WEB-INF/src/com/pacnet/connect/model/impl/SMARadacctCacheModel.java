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

import com.pacnet.connect.model.SMARadacct;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing SMARadacct in entity cache.
 *
 * @author CloudSmartz
 * @see SMARadacct
 * @generated
 */
public class SMARadacctCacheModel implements CacheModel<SMARadacct>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{radAcctId=");
		sb.append(radAcctId);
		sb.append(", radcheckId=");
		sb.append(radcheckId);
		sb.append(", acctSessionId=");
		sb.append(acctSessionId);
		sb.append(", realm=");
		sb.append(realm);
		sb.append(", acctStartTime=");
		sb.append(acctStartTime);
		sb.append(", acctStopTime=");
		sb.append(acctStopTime);
		sb.append(", acctSessionTime=");
		sb.append(acctSessionTime);
		sb.append(", acctterminateCause=");
		sb.append(acctterminateCause);
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

	public SMARadacct toEntityModel() {
		SMARadacctImpl smaRadacctImpl = new SMARadacctImpl();

		smaRadacctImpl.setRadAcctId(radAcctId);
		smaRadacctImpl.setRadcheckId(radcheckId);

		if (acctSessionId == null) {
			smaRadacctImpl.setAcctSessionId(StringPool.BLANK);
		}
		else {
			smaRadacctImpl.setAcctSessionId(acctSessionId);
		}

		if (realm == null) {
			smaRadacctImpl.setRealm(StringPool.BLANK);
		}
		else {
			smaRadacctImpl.setRealm(realm);
		}

		if (acctStartTime == Long.MIN_VALUE) {
			smaRadacctImpl.setAcctStartTime(null);
		}
		else {
			smaRadacctImpl.setAcctStartTime(new Date(acctStartTime));
		}

		if (acctStopTime == Long.MIN_VALUE) {
			smaRadacctImpl.setAcctStopTime(null);
		}
		else {
			smaRadacctImpl.setAcctStopTime(new Date(acctStopTime));
		}

		smaRadacctImpl.setAcctSessionTime(acctSessionTime);

		if (acctterminateCause == null) {
			smaRadacctImpl.setAcctterminateCause(StringPool.BLANK);
		}
		else {
			smaRadacctImpl.setAcctterminateCause(acctterminateCause);
		}

		smaRadacctImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			smaRadacctImpl.setCreatedOn(null);
		}
		else {
			smaRadacctImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			smaRadacctImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			smaRadacctImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			smaRadacctImpl.setUpdatedOn(null);
		}
		else {
			smaRadacctImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			smaRadacctImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			smaRadacctImpl.setUpdatedBy(updatedBy);
		}

		smaRadacctImpl.resetOriginalValues();

		return smaRadacctImpl;
	}

	public long radAcctId;
	public long radcheckId;
	public String acctSessionId;
	public String realm;
	public long acctStartTime;
	public long acctStopTime;
	public long acctSessionTime;
	public String acctterminateCause;
	public int isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}