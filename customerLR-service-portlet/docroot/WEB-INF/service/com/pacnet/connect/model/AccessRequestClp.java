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

package com.pacnet.connect.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.pacnet.connect.service.AccessRequestLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CloudSmartz
 */
public class AccessRequestClp extends BaseModelImpl<AccessRequest>
	implements AccessRequest {
	public AccessRequestClp() {
	}

	public Class<?> getModelClass() {
		return AccessRequest.class;
	}

	public String getModelClassName() {
		return AccessRequest.class.getName();
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("facilityId", getFacilityId());
		attributes.put("customerId", getCustomerId());
		attributes.put("visitorId", getVisitorId());
		attributes.put("accessRequestStatusId", getAccessRequestStatusId());
		attributes.put("dateOfVisit", getDateOfVisit());
		attributes.put("tentativeTimeIn", getTentativeTimeIn());
		attributes.put("tentativeTimeOut", getTentativeTimeOut());
		attributes.put("note", getNote());
		attributes.put("isExternalVisitor", getIsExternalVisitor());
		attributes.put("isActive", getIsActive());
		attributes.put("oneTimeAccess", getOneTimeAccess());
		attributes.put("dateOfVisitGmt", getDateOfVisitGmt());
		attributes.put("dateOfTimeOutGmt", getDateOfTimeOutGmt());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedOn", getUpdatedOn());
		attributes.put("updatedBy", getUpdatedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long facilityId = (Long)attributes.get("facilityId");

		if (facilityId != null) {
			setFacilityId(facilityId);
		}

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		Long visitorId = (Long)attributes.get("visitorId");

		if (visitorId != null) {
			setVisitorId(visitorId);
		}

		Long accessRequestStatusId = (Long)attributes.get(
				"accessRequestStatusId");

		if (accessRequestStatusId != null) {
			setAccessRequestStatusId(accessRequestStatusId);
		}

		Date dateOfVisit = (Date)attributes.get("dateOfVisit");

		if (dateOfVisit != null) {
			setDateOfVisit(dateOfVisit);
		}

		Long tentativeTimeIn = (Long)attributes.get("tentativeTimeIn");

		if (tentativeTimeIn != null) {
			setTentativeTimeIn(tentativeTimeIn);
		}

		Long tentativeTimeOut = (Long)attributes.get("tentativeTimeOut");

		if (tentativeTimeOut != null) {
			setTentativeTimeOut(tentativeTimeOut);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		Boolean isExternalVisitor = (Boolean)attributes.get("isExternalVisitor");

		if (isExternalVisitor != null) {
			setIsExternalVisitor(isExternalVisitor);
		}

		Boolean isActive = (Boolean)attributes.get("isActive");

		if (isActive != null) {
			setIsActive(isActive);
		}

		Boolean oneTimeAccess = (Boolean)attributes.get("oneTimeAccess");

		if (oneTimeAccess != null) {
			setOneTimeAccess(oneTimeAccess);
		}

		Date dateOfVisitGmt = (Date)attributes.get("dateOfVisitGmt");

		if (dateOfVisitGmt != null) {
			setDateOfVisitGmt(dateOfVisitGmt);
		}

		Date dateOfTimeOutGmt = (Date)attributes.get("dateOfTimeOutGmt");

		if (dateOfTimeOutGmt != null) {
			setDateOfTimeOutGmt(dateOfTimeOutGmt);
		}

		Date createdOn = (Date)attributes.get("createdOn");

		if (createdOn != null) {
			setCreatedOn(createdOn);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date updatedOn = (Date)attributes.get("updatedOn");

		if (updatedOn != null) {
			setUpdatedOn(updatedOn);
		}

		String updatedBy = (String)attributes.get("updatedBy");

		if (updatedBy != null) {
			setUpdatedBy(updatedBy);
		}
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getFacilityId() {
		return _facilityId;
	}

	public void setFacilityId(long facilityId) {
		_facilityId = facilityId;
	}

	public long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(long customerId) {
		_customerId = customerId;
	}

	public long getVisitorId() {
		return _visitorId;
	}

	public void setVisitorId(long visitorId) {
		_visitorId = visitorId;
	}

	public long getAccessRequestStatusId() {
		return _accessRequestStatusId;
	}

	public void setAccessRequestStatusId(long accessRequestStatusId) {
		_accessRequestStatusId = accessRequestStatusId;
	}

	public Date getDateOfVisit() {
		return _dateOfVisit;
	}

	public void setDateOfVisit(Date dateOfVisit) {
		_dateOfVisit = dateOfVisit;
	}

	public long getTentativeTimeIn() {
		return _tentativeTimeIn;
	}

	public void setTentativeTimeIn(long tentativeTimeIn) {
		_tentativeTimeIn = tentativeTimeIn;
	}

	public long getTentativeTimeOut() {
		return _tentativeTimeOut;
	}

	public void setTentativeTimeOut(long tentativeTimeOut) {
		_tentativeTimeOut = tentativeTimeOut;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public boolean getIsExternalVisitor() {
		return _isExternalVisitor;
	}

	public boolean isIsExternalVisitor() {
		return _isExternalVisitor;
	}

	public void setIsExternalVisitor(boolean isExternalVisitor) {
		_isExternalVisitor = isExternalVisitor;
	}

	public boolean getIsActive() {
		return _isActive;
	}

	public boolean isIsActive() {
		return _isActive;
	}

	public void setIsActive(boolean isActive) {
		_isActive = isActive;
	}

	public boolean getOneTimeAccess() {
		return _oneTimeAccess;
	}

	public boolean isOneTimeAccess() {
		return _oneTimeAccess;
	}

	public void setOneTimeAccess(boolean oneTimeAccess) {
		_oneTimeAccess = oneTimeAccess;
	}

	public Date getDateOfVisitGmt() {
		return _dateOfVisitGmt;
	}

	public void setDateOfVisitGmt(Date dateOfVisitGmt) {
		_dateOfVisitGmt = dateOfVisitGmt;
	}

	public Date getDateOfTimeOutGmt() {
		return _dateOfTimeOutGmt;
	}

	public void setDateOfTimeOutGmt(Date dateOfTimeOutGmt) {
		_dateOfTimeOutGmt = dateOfTimeOutGmt;
	}

	public Date getCreatedOn() {
		return _createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		_createdOn = createdOn;
	}

	public String getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;
	}

	public Date getUpdatedOn() {
		return _updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		_updatedOn = updatedOn;
	}

	public String getUpdatedBy() {
		return _updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		_updatedBy = updatedBy;
	}

	public BaseModel<?> getAccessRequestRemoteModel() {
		return _accessRequestRemoteModel;
	}

	public void setAccessRequestRemoteModel(
		BaseModel<?> accessRequestRemoteModel) {
		_accessRequestRemoteModel = accessRequestRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			AccessRequestLocalServiceUtil.addAccessRequest(this);
		}
		else {
			AccessRequestLocalServiceUtil.updateAccessRequest(this);
		}
	}

	@Override
	public AccessRequest toEscapedModel() {
		return (AccessRequest)Proxy.newProxyInstance(AccessRequest.class.getClassLoader(),
			new Class[] { AccessRequest.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AccessRequestClp clone = new AccessRequestClp();

		clone.setId(getId());
		clone.setFacilityId(getFacilityId());
		clone.setCustomerId(getCustomerId());
		clone.setVisitorId(getVisitorId());
		clone.setAccessRequestStatusId(getAccessRequestStatusId());
		clone.setDateOfVisit(getDateOfVisit());
		clone.setTentativeTimeIn(getTentativeTimeIn());
		clone.setTentativeTimeOut(getTentativeTimeOut());
		clone.setNote(getNote());
		clone.setIsExternalVisitor(getIsExternalVisitor());
		clone.setIsActive(getIsActive());
		clone.setOneTimeAccess(getOneTimeAccess());
		clone.setDateOfVisitGmt(getDateOfVisitGmt());
		clone.setDateOfTimeOutGmt(getDateOfTimeOutGmt());
		clone.setCreatedOn(getCreatedOn());
		clone.setCreatedBy(getCreatedBy());
		clone.setUpdatedOn(getUpdatedOn());
		clone.setUpdatedBy(getUpdatedBy());

		return clone;
	}

	public int compareTo(AccessRequest accessRequest) {
		long primaryKey = accessRequest.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		AccessRequestClp accessRequest = null;

		try {
			accessRequest = (AccessRequestClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = accessRequest.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", facilityId=");
		sb.append(getFacilityId());
		sb.append(", customerId=");
		sb.append(getCustomerId());
		sb.append(", visitorId=");
		sb.append(getVisitorId());
		sb.append(", accessRequestStatusId=");
		sb.append(getAccessRequestStatusId());
		sb.append(", dateOfVisit=");
		sb.append(getDateOfVisit());
		sb.append(", tentativeTimeIn=");
		sb.append(getTentativeTimeIn());
		sb.append(", tentativeTimeOut=");
		sb.append(getTentativeTimeOut());
		sb.append(", note=");
		sb.append(getNote());
		sb.append(", isExternalVisitor=");
		sb.append(getIsExternalVisitor());
		sb.append(", isActive=");
		sb.append(getIsActive());
		sb.append(", oneTimeAccess=");
		sb.append(getOneTimeAccess());
		sb.append(", dateOfVisitGmt=");
		sb.append(getDateOfVisitGmt());
		sb.append(", dateOfTimeOutGmt=");
		sb.append(getDateOfTimeOutGmt());
		sb.append(", createdOn=");
		sb.append(getCreatedOn());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", updatedOn=");
		sb.append(getUpdatedOn());
		sb.append(", updatedBy=");
		sb.append(getUpdatedBy());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.AccessRequest");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facilityId</column-name><column-value><![CDATA[");
		sb.append(getFacilityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerId</column-name><column-value><![CDATA[");
		sb.append(getCustomerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visitorId</column-name><column-value><![CDATA[");
		sb.append(getVisitorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accessRequestStatusId</column-name><column-value><![CDATA[");
		sb.append(getAccessRequestStatusId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfVisit</column-name><column-value><![CDATA[");
		sb.append(getDateOfVisit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tentativeTimeIn</column-name><column-value><![CDATA[");
		sb.append(getTentativeTimeIn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tentativeTimeOut</column-name><column-value><![CDATA[");
		sb.append(getTentativeTimeOut());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isExternalVisitor</column-name><column-value><![CDATA[");
		sb.append(getIsExternalVisitor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oneTimeAccess</column-name><column-value><![CDATA[");
		sb.append(getOneTimeAccess());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfVisitGmt</column-name><column-value><![CDATA[");
		sb.append(getDateOfVisitGmt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfTimeOutGmt</column-name><column-value><![CDATA[");
		sb.append(getDateOfTimeOutGmt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdOn</column-name><column-value><![CDATA[");
		sb.append(getCreatedOn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedOn</column-name><column-value><![CDATA[");
		sb.append(getUpdatedOn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedBy</column-name><column-value><![CDATA[");
		sb.append(getUpdatedBy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _facilityId;
	private long _customerId;
	private long _visitorId;
	private long _accessRequestStatusId;
	private Date _dateOfVisit;
	private long _tentativeTimeIn;
	private long _tentativeTimeOut;
	private String _note;
	private boolean _isExternalVisitor;
	private boolean _isActive;
	private boolean _oneTimeAccess;
	private Date _dateOfVisitGmt;
	private Date _dateOfTimeOutGmt;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
	private BaseModel<?> _accessRequestRemoteModel;
}