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

import com.pacnet.connect.service.AccessLogLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CloudSmartz
 */
public class AccessLogClp extends BaseModelImpl<AccessLog> implements AccessLog {
	public AccessLogClp() {
	}

	public Class<?> getModelClass() {
		return AccessLog.class;
	}

	public String getModelClassName() {
		return AccessLog.class.getName();
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
		attributes.put("accessRequestId", getAccessRequestId());
		attributes.put("facilityUserMappingId", getFacilityUserMappingId());
		attributes.put("actualDateOfVisit", getActualDateOfVisit());
		attributes.put("timeIn", getTimeIn());
		attributes.put("timeOut", getTimeOut());
		attributes.put("note", getNote());
		attributes.put("isActive", getIsActive());
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

		Long accessRequestId = (Long)attributes.get("accessRequestId");

		if (accessRequestId != null) {
			setAccessRequestId(accessRequestId);
		}

		Long facilityUserMappingId = (Long)attributes.get(
				"facilityUserMappingId");

		if (facilityUserMappingId != null) {
			setFacilityUserMappingId(facilityUserMappingId);
		}

		Date actualDateOfVisit = (Date)attributes.get("actualDateOfVisit");

		if (actualDateOfVisit != null) {
			setActualDateOfVisit(actualDateOfVisit);
		}

		Long timeIn = (Long)attributes.get("timeIn");

		if (timeIn != null) {
			setTimeIn(timeIn);
		}

		Long timeOut = (Long)attributes.get("timeOut");

		if (timeOut != null) {
			setTimeOut(timeOut);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		Boolean isActive = (Boolean)attributes.get("isActive");

		if (isActive != null) {
			setIsActive(isActive);
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

	public long getAccessRequestId() {
		return _accessRequestId;
	}

	public void setAccessRequestId(long accessRequestId) {
		_accessRequestId = accessRequestId;
	}

	public long getFacilityUserMappingId() {
		return _facilityUserMappingId;
	}

	public void setFacilityUserMappingId(long facilityUserMappingId) {
		_facilityUserMappingId = facilityUserMappingId;
	}

	public Date getActualDateOfVisit() {
		return _actualDateOfVisit;
	}

	public void setActualDateOfVisit(Date actualDateOfVisit) {
		_actualDateOfVisit = actualDateOfVisit;
	}

	public long getTimeIn() {
		return _timeIn;
	}

	public void setTimeIn(long timeIn) {
		_timeIn = timeIn;
	}

	public long getTimeOut() {
		return _timeOut;
	}

	public void setTimeOut(long timeOut) {
		_timeOut = timeOut;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
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

	public BaseModel<?> getAccessLogRemoteModel() {
		return _accessLogRemoteModel;
	}

	public void setAccessLogRemoteModel(BaseModel<?> accessLogRemoteModel) {
		_accessLogRemoteModel = accessLogRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			AccessLogLocalServiceUtil.addAccessLog(this);
		}
		else {
			AccessLogLocalServiceUtil.updateAccessLog(this);
		}
	}

	@Override
	public AccessLog toEscapedModel() {
		return (AccessLog)Proxy.newProxyInstance(AccessLog.class.getClassLoader(),
			new Class[] { AccessLog.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AccessLogClp clone = new AccessLogClp();

		clone.setId(getId());
		clone.setAccessRequestId(getAccessRequestId());
		clone.setFacilityUserMappingId(getFacilityUserMappingId());
		clone.setActualDateOfVisit(getActualDateOfVisit());
		clone.setTimeIn(getTimeIn());
		clone.setTimeOut(getTimeOut());
		clone.setNote(getNote());
		clone.setIsActive(getIsActive());
		clone.setCreatedOn(getCreatedOn());
		clone.setCreatedBy(getCreatedBy());
		clone.setUpdatedOn(getUpdatedOn());
		clone.setUpdatedBy(getUpdatedBy());

		return clone;
	}

	public int compareTo(AccessLog accessLog) {
		long primaryKey = accessLog.getPrimaryKey();

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

		AccessLogClp accessLog = null;

		try {
			accessLog = (AccessLogClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = accessLog.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", accessRequestId=");
		sb.append(getAccessRequestId());
		sb.append(", facilityUserMappingId=");
		sb.append(getFacilityUserMappingId());
		sb.append(", actualDateOfVisit=");
		sb.append(getActualDateOfVisit());
		sb.append(", timeIn=");
		sb.append(getTimeIn());
		sb.append(", timeOut=");
		sb.append(getTimeOut());
		sb.append(", note=");
		sb.append(getNote());
		sb.append(", isActive=");
		sb.append(getIsActive());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.AccessLog");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accessRequestId</column-name><column-value><![CDATA[");
		sb.append(getAccessRequestId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facilityUserMappingId</column-name><column-value><![CDATA[");
		sb.append(getFacilityUserMappingId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actualDateOfVisit</column-name><column-value><![CDATA[");
		sb.append(getActualDateOfVisit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeIn</column-name><column-value><![CDATA[");
		sb.append(getTimeIn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeOut</column-name><column-value><![CDATA[");
		sb.append(getTimeOut());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
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
	private long _accessRequestId;
	private long _facilityUserMappingId;
	private Date _actualDateOfVisit;
	private long _timeIn;
	private long _timeOut;
	private String _note;
	private boolean _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
	private BaseModel<?> _accessLogRemoteModel;
}