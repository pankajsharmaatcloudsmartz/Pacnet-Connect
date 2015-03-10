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

import com.pacnet.connect.model.Facility;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Facility in entity cache.
 *
 * @author CloudSmartz
 * @see Facility
 * @generated
 */
public class FacilityCacheModel implements CacheModel<Facility>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", address=");
		sb.append(address);
		sb.append(", phoneNumber=");
		sb.append(phoneNumber);
		sb.append(", city=");
		sb.append(city);
		sb.append(", stateId=");
		sb.append(stateId);
		sb.append(", countryId=");
		sb.append(countryId);
		sb.append(", isThirdParty=");
		sb.append(isThirdParty);
		sb.append(", managerId=");
		sb.append(managerId);
		sb.append(", escalationEmail=");
		sb.append(escalationEmail);
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
		sb.append(", timezone=");
		sb.append(timezone);
		sb.append("}");

		return sb.toString();
	}

	public Facility toEntityModel() {
		FacilityImpl facilityImpl = new FacilityImpl();

		facilityImpl.setId(id);

		if (name == null) {
			facilityImpl.setName(StringPool.BLANK);
		}
		else {
			facilityImpl.setName(name);
		}

		if (address == null) {
			facilityImpl.setAddress(StringPool.BLANK);
		}
		else {
			facilityImpl.setAddress(address);
		}

		if (phoneNumber == null) {
			facilityImpl.setPhoneNumber(StringPool.BLANK);
		}
		else {
			facilityImpl.setPhoneNumber(phoneNumber);
		}

		if (city == null) {
			facilityImpl.setCity(StringPool.BLANK);
		}
		else {
			facilityImpl.setCity(city);
		}

		facilityImpl.setStateId(stateId);
		facilityImpl.setCountryId(countryId);
		facilityImpl.setIsThirdParty(isThirdParty);
		facilityImpl.setManagerId(managerId);

		if (escalationEmail == null) {
			facilityImpl.setEscalationEmail(StringPool.BLANK);
		}
		else {
			facilityImpl.setEscalationEmail(escalationEmail);
		}

		facilityImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			facilityImpl.setCreatedOn(null);
		}
		else {
			facilityImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			facilityImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			facilityImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			facilityImpl.setUpdatedOn(null);
		}
		else {
			facilityImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			facilityImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			facilityImpl.setUpdatedBy(updatedBy);
		}

		if (timezone == null) {
			facilityImpl.setTimezone(StringPool.BLANK);
		}
		else {
			facilityImpl.setTimezone(timezone);
		}

		facilityImpl.resetOriginalValues();

		return facilityImpl;
	}

	public long id;
	public String name;
	public String address;
	public String phoneNumber;
	public String city;
	public long stateId;
	public long countryId;
	public int isThirdParty;
	public long managerId;
	public String escalationEmail;
	public boolean isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
	public String timezone;
}