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

import com.pacnet.connect.model.FacilityExternalVisitor;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing FacilityExternalVisitor in entity cache.
 *
 * @author CloudSmartz
 * @see FacilityExternalVisitor
 * @generated
 */
public class FacilityExternalVisitorCacheModel implements CacheModel<FacilityExternalVisitor>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(id);
		sb.append(", facilityId=");
		sb.append(facilityId);
		sb.append(", accessRequestId=");
		sb.append(accessRequestId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", mobileNumber=");
		sb.append(mobileNumber);
		sb.append(", email=");
		sb.append(email);
		sb.append(", address=");
		sb.append(address);
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", documentType=");
		sb.append(documentType);
		sb.append(", documentId=");
		sb.append(documentId);
		sb.append(", remarks=");
		sb.append(remarks);
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

	public FacilityExternalVisitor toEntityModel() {
		FacilityExternalVisitorImpl facilityExternalVisitorImpl = new FacilityExternalVisitorImpl();

		facilityExternalVisitorImpl.setId(id);
		facilityExternalVisitorImpl.setFacilityId(facilityId);
		facilityExternalVisitorImpl.setAccessRequestId(accessRequestId);

		if (name == null) {
			facilityExternalVisitorImpl.setName(StringPool.BLANK);
		}
		else {
			facilityExternalVisitorImpl.setName(name);
		}

		if (mobileNumber == null) {
			facilityExternalVisitorImpl.setMobileNumber(StringPool.BLANK);
		}
		else {
			facilityExternalVisitorImpl.setMobileNumber(mobileNumber);
		}

		if (email == null) {
			facilityExternalVisitorImpl.setEmail(StringPool.BLANK);
		}
		else {
			facilityExternalVisitorImpl.setEmail(email);
		}

		if (address == null) {
			facilityExternalVisitorImpl.setAddress(StringPool.BLANK);
		}
		else {
			facilityExternalVisitorImpl.setAddress(address);
		}

		if (companyName == null) {
			facilityExternalVisitorImpl.setCompanyName(StringPool.BLANK);
		}
		else {
			facilityExternalVisitorImpl.setCompanyName(companyName);
		}

		if (documentType == null) {
			facilityExternalVisitorImpl.setDocumentType(StringPool.BLANK);
		}
		else {
			facilityExternalVisitorImpl.setDocumentType(documentType);
		}

		if (documentId == null) {
			facilityExternalVisitorImpl.setDocumentId(StringPool.BLANK);
		}
		else {
			facilityExternalVisitorImpl.setDocumentId(documentId);
		}

		if (remarks == null) {
			facilityExternalVisitorImpl.setRemarks(StringPool.BLANK);
		}
		else {
			facilityExternalVisitorImpl.setRemarks(remarks);
		}

		facilityExternalVisitorImpl.setIsActive(isActive);

		if (createdOn == Long.MIN_VALUE) {
			facilityExternalVisitorImpl.setCreatedOn(null);
		}
		else {
			facilityExternalVisitorImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			facilityExternalVisitorImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			facilityExternalVisitorImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			facilityExternalVisitorImpl.setUpdatedOn(null);
		}
		else {
			facilityExternalVisitorImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			facilityExternalVisitorImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			facilityExternalVisitorImpl.setUpdatedBy(updatedBy);
		}

		facilityExternalVisitorImpl.resetOriginalValues();

		return facilityExternalVisitorImpl;
	}

	public long id;
	public long facilityId;
	public long accessRequestId;
	public String name;
	public String mobileNumber;
	public String email;
	public String address;
	public String companyName;
	public String documentType;
	public String documentId;
	public String remarks;
	public boolean isActive;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}