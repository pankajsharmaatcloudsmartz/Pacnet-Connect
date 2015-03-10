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

import com.pacnet.connect.model.AccessRequest;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing AccessRequest in entity cache.
 *
 * @author CloudSmartz
 * @see AccessRequest
 * @generated
 */
public class AccessRequestCacheModel implements CacheModel<AccessRequest>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(id);
		sb.append(", facilityId=");
		sb.append(facilityId);
		sb.append(", customerId=");
		sb.append(customerId);
		sb.append(", visitorId=");
		sb.append(visitorId);
		sb.append(", accessRequestStatusId=");
		sb.append(accessRequestStatusId);
		sb.append(", dateOfVisit=");
		sb.append(dateOfVisit);
		sb.append(", tentativeTimeIn=");
		sb.append(tentativeTimeIn);
		sb.append(", tentativeTimeOut=");
		sb.append(tentativeTimeOut);
		sb.append(", note=");
		sb.append(note);
		sb.append(", isExternalVisitor=");
		sb.append(isExternalVisitor);
		sb.append(", isActive=");
		sb.append(isActive);
		sb.append(", oneTimeAccess=");
		sb.append(oneTimeAccess);
		sb.append(", dateOfVisitGmt=");
		sb.append(dateOfVisitGmt);
		sb.append(", dateOfTimeOutGmt=");
		sb.append(dateOfTimeOutGmt);
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

	public AccessRequest toEntityModel() {
		AccessRequestImpl accessRequestImpl = new AccessRequestImpl();

		accessRequestImpl.setId(id);
		accessRequestImpl.setFacilityId(facilityId);
		accessRequestImpl.setCustomerId(customerId);
		accessRequestImpl.setVisitorId(visitorId);
		accessRequestImpl.setAccessRequestStatusId(accessRequestStatusId);

		if (dateOfVisit == Long.MIN_VALUE) {
			accessRequestImpl.setDateOfVisit(null);
		}
		else {
			accessRequestImpl.setDateOfVisit(new Date(dateOfVisit));
		}

		accessRequestImpl.setTentativeTimeIn(tentativeTimeIn);
		accessRequestImpl.setTentativeTimeOut(tentativeTimeOut);

		if (note == null) {
			accessRequestImpl.setNote(StringPool.BLANK);
		}
		else {
			accessRequestImpl.setNote(note);
		}

		accessRequestImpl.setIsExternalVisitor(isExternalVisitor);
		accessRequestImpl.setIsActive(isActive);
		accessRequestImpl.setOneTimeAccess(oneTimeAccess);

		if (dateOfVisitGmt == Long.MIN_VALUE) {
			accessRequestImpl.setDateOfVisitGmt(null);
		}
		else {
			accessRequestImpl.setDateOfVisitGmt(new Date(dateOfVisitGmt));
		}

		if (dateOfTimeOutGmt == Long.MIN_VALUE) {
			accessRequestImpl.setDateOfTimeOutGmt(null);
		}
		else {
			accessRequestImpl.setDateOfTimeOutGmt(new Date(dateOfTimeOutGmt));
		}

		if (createdOn == Long.MIN_VALUE) {
			accessRequestImpl.setCreatedOn(null);
		}
		else {
			accessRequestImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			accessRequestImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			accessRequestImpl.setCreatedBy(createdBy);
		}

		if (updatedOn == Long.MIN_VALUE) {
			accessRequestImpl.setUpdatedOn(null);
		}
		else {
			accessRequestImpl.setUpdatedOn(new Date(updatedOn));
		}

		if (updatedBy == null) {
			accessRequestImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			accessRequestImpl.setUpdatedBy(updatedBy);
		}

		accessRequestImpl.resetOriginalValues();

		return accessRequestImpl;
	}

	public long id;
	public long facilityId;
	public long customerId;
	public long visitorId;
	public long accessRequestStatusId;
	public long dateOfVisit;
	public long tentativeTimeIn;
	public long tentativeTimeOut;
	public String note;
	public boolean isExternalVisitor;
	public boolean isActive;
	public boolean oneTimeAccess;
	public long dateOfVisitGmt;
	public long dateOfTimeOutGmt;
	public long createdOn;
	public String createdBy;
	public long updatedOn;
	public String updatedBy;
}