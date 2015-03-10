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

import com.pacnet.connect.model.SMACompanies;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing SMACompanies in entity cache.
 *
 * @author CloudSmartz
 * @see SMACompanies
 * @generated
 */
public class SMACompaniesCacheModel implements CacheModel<SMACompanies>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", customerId=");
		sb.append(customerId);
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", domains=");
		sb.append(domains);
		sb.append(", groupName=");
		sb.append(groupName);
		sb.append(", attribute=");
		sb.append(attribute);
		sb.append(", op=");
		sb.append(op);
		sb.append(", value=");
		sb.append(value);
		sb.append(", maxUser=");
		sb.append(maxUser);
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

	public SMACompanies toEntityModel() {
		SMACompaniesImpl smaCompaniesImpl = new SMACompaniesImpl();

		smaCompaniesImpl.setId(id);
		smaCompaniesImpl.setCustomerId(customerId);

		if (companyName == null) {
			smaCompaniesImpl.setCompanyName(StringPool.BLANK);
		}
		else {
			smaCompaniesImpl.setCompanyName(companyName);
		}

		if (domains == null) {
			smaCompaniesImpl.setDomains(StringPool.BLANK);
		}
		else {
			smaCompaniesImpl.setDomains(domains);
		}

		if (groupName == null) {
			smaCompaniesImpl.setGroupName(StringPool.BLANK);
		}
		else {
			smaCompaniesImpl.setGroupName(groupName);
		}

		if (attribute == null) {
			smaCompaniesImpl.setAttribute(StringPool.BLANK);
		}
		else {
			smaCompaniesImpl.setAttribute(attribute);
		}

		if (op == null) {
			smaCompaniesImpl.setOp(StringPool.BLANK);
		}
		else {
			smaCompaniesImpl.setOp(op);
		}

		if (value == null) {
			smaCompaniesImpl.setValue(StringPool.BLANK);
		}
		else {
			smaCompaniesImpl.setValue(value);
		}

		smaCompaniesImpl.setMaxUser(maxUser);
		smaCompaniesImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			smaCompaniesImpl.setCreatedOn(null);
		}
		else {
			smaCompaniesImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			smaCompaniesImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			smaCompaniesImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			smaCompaniesImpl.setUpdatedOn(null);
		}
		else {
			smaCompaniesImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			smaCompaniesImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			smaCompaniesImpl.setUpdatedBy(updatedBy);
		}

		smaCompaniesImpl.resetOriginalValues();

		return smaCompaniesImpl;
	}

	public long id;
	public long customerId;
	public String companyName;
	public String domains;
	public String groupName;
	public String attribute;
	public String op;
	public String value;
	public int maxUser;
	public int isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}