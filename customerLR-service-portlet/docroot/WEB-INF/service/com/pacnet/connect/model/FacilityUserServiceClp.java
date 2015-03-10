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

import com.pacnet.connect.service.FacilityUserServiceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CloudSmartz
 */
public class FacilityUserServiceClp extends BaseModelImpl<FacilityUserService>
	implements FacilityUserService {
	public FacilityUserServiceClp() {
	}

	public Class<?> getModelClass() {
		return FacilityUserService.class;
	}

	public String getModelClassName() {
		return FacilityUserService.class.getName();
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
		attributes.put("facilityUserMappingId", getFacilityUserMappingId());
		attributes.put("facilityServiceId", getFacilityServiceId());
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

		Long facilityUserMappingId = (Long)attributes.get(
				"facilityUserMappingId");

		if (facilityUserMappingId != null) {
			setFacilityUserMappingId(facilityUserMappingId);
		}

		Long facilityServiceId = (Long)attributes.get("facilityServiceId");

		if (facilityServiceId != null) {
			setFacilityServiceId(facilityServiceId);
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

	public long getFacilityUserMappingId() {
		return _facilityUserMappingId;
	}

	public void setFacilityUserMappingId(long facilityUserMappingId) {
		_facilityUserMappingId = facilityUserMappingId;
	}

	public long getFacilityServiceId() {
		return _facilityServiceId;
	}

	public void setFacilityServiceId(long facilityServiceId) {
		_facilityServiceId = facilityServiceId;
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

	public BaseModel<?> getFacilityUserServiceRemoteModel() {
		return _facilityUserServiceRemoteModel;
	}

	public void setFacilityUserServiceRemoteModel(
		BaseModel<?> facilityUserServiceRemoteModel) {
		_facilityUserServiceRemoteModel = facilityUserServiceRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			FacilityUserServiceLocalServiceUtil.addFacilityUserService(this);
		}
		else {
			FacilityUserServiceLocalServiceUtil.updateFacilityUserService(this);
		}
	}

	@Override
	public FacilityUserService toEscapedModel() {
		return (FacilityUserService)Proxy.newProxyInstance(FacilityUserService.class.getClassLoader(),
			new Class[] { FacilityUserService.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FacilityUserServiceClp clone = new FacilityUserServiceClp();

		clone.setId(getId());
		clone.setFacilityUserMappingId(getFacilityUserMappingId());
		clone.setFacilityServiceId(getFacilityServiceId());
		clone.setIsActive(getIsActive());
		clone.setCreatedOn(getCreatedOn());
		clone.setCreatedBy(getCreatedBy());
		clone.setUpdatedOn(getUpdatedOn());
		clone.setUpdatedBy(getUpdatedBy());

		return clone;
	}

	public int compareTo(FacilityUserService facilityUserService) {
		long primaryKey = facilityUserService.getPrimaryKey();

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

		FacilityUserServiceClp facilityUserService = null;

		try {
			facilityUserService = (FacilityUserServiceClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = facilityUserService.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", facilityUserMappingId=");
		sb.append(getFacilityUserMappingId());
		sb.append(", facilityServiceId=");
		sb.append(getFacilityServiceId());
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
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.FacilityUserService");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facilityUserMappingId</column-name><column-value><![CDATA[");
		sb.append(getFacilityUserMappingId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facilityServiceId</column-name><column-value><![CDATA[");
		sb.append(getFacilityServiceId());
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
	private long _facilityUserMappingId;
	private long _facilityServiceId;
	private boolean _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
	private BaseModel<?> _facilityUserServiceRemoteModel;
}