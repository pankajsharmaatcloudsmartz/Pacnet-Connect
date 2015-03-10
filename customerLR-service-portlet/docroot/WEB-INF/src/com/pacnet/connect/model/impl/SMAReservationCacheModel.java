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

import com.pacnet.connect.model.SMAReservation;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing SMAReservation in entity cache.
 *
 * @author CloudSmartz
 * @see SMAReservation
 * @generated
 */
public class SMAReservationCacheModel implements CacheModel<SMAReservation>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", owner=");
		sb.append(owner);
		sb.append(", provision=");
		sb.append(provision);
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

	public SMAReservation toEntityModel() {
		SMAReservationImpl smaReservationImpl = new SMAReservationImpl();

		smaReservationImpl.setId(id);

		if (name == null) {
			smaReservationImpl.setName(StringPool.BLANK);
		}
		else {
			smaReservationImpl.setName(name);
		}

		if (startDate == Long.MIN_VALUE) {
			smaReservationImpl.setStartDate(null);
		}
		else {
			smaReservationImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			smaReservationImpl.setEndDate(null);
		}
		else {
			smaReservationImpl.setEndDate(new Date(endDate));
		}

		if (owner == null) {
			smaReservationImpl.setOwner(StringPool.BLANK);
		}
		else {
			smaReservationImpl.setOwner(owner);
		}

		smaReservationImpl.setProvision(provision);
		smaReservationImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			smaReservationImpl.setCreatedOn(null);
		}
		else {
			smaReservationImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			smaReservationImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			smaReservationImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			smaReservationImpl.setUpdatedOn(null);
		}
		else {
			smaReservationImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			smaReservationImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			smaReservationImpl.setUpdatedBy(updatedBy);
		}

		smaReservationImpl.resetOriginalValues();

		return smaReservationImpl;
	}

	public long id;
	public String name;
	public long startDate;
	public long endDate;
	public String owner;
	public int provision;
	public int isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}