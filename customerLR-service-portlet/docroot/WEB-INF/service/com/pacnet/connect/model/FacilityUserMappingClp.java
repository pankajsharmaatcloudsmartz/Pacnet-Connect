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
import com.liferay.portal.util.PortalUtil;

import com.pacnet.connect.service.FacilityUserMappingLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CloudSmartz
 */
public class FacilityUserMappingClp extends BaseModelImpl<FacilityUserMapping>
	implements FacilityUserMapping {
	public FacilityUserMappingClp() {
	}

	public Class<?> getModelClass() {
		return FacilityUserMapping.class;
	}

	public String getModelClassName() {
		return FacilityUserMapping.class.getName();
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
		attributes.put("customerId", getCustomerId());
		attributes.put("faciltyId", getFaciltyId());
		attributes.put("customerContactId", getCustomerContactId());
		attributes.put("isActive", getIsActive());
		attributes.put("nonPacnetUserId", getNonPacnetUserId());
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

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		Long faciltyId = (Long)attributes.get("faciltyId");

		if (faciltyId != null) {
			setFaciltyId(faciltyId);
		}

		Long customerContactId = (Long)attributes.get("customerContactId");

		if (customerContactId != null) {
			setCustomerContactId(customerContactId);
		}

		Boolean isActive = (Boolean)attributes.get("isActive");

		if (isActive != null) {
			setIsActive(isActive);
		}

		Long nonPacnetUserId = (Long)attributes.get("nonPacnetUserId");

		if (nonPacnetUserId != null) {
			setNonPacnetUserId(nonPacnetUserId);
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

	public long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(long customerId) {
		_customerId = customerId;
	}

	public long getFaciltyId() {
		return _faciltyId;
	}

	public void setFaciltyId(long faciltyId) {
		_faciltyId = faciltyId;
	}

	public long getCustomerContactId() {
		return _customerContactId;
	}

	public void setCustomerContactId(long customerContactId) {
		_customerContactId = customerContactId;
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

	public long getNonPacnetUserId() {
		return _nonPacnetUserId;
	}

	public void setNonPacnetUserId(long nonPacnetUserId) {
		_nonPacnetUserId = nonPacnetUserId;
	}

	public String getNonPacnetUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getNonPacnetUserId(), "uuid",
			_nonPacnetUserUuid);
	}

	public void setNonPacnetUserUuid(String nonPacnetUserUuid) {
		_nonPacnetUserUuid = nonPacnetUserUuid;
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

	public BaseModel<?> getFacilityUserMappingRemoteModel() {
		return _facilityUserMappingRemoteModel;
	}

	public void setFacilityUserMappingRemoteModel(
		BaseModel<?> facilityUserMappingRemoteModel) {
		_facilityUserMappingRemoteModel = facilityUserMappingRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			FacilityUserMappingLocalServiceUtil.addFacilityUserMapping(this);
		}
		else {
			FacilityUserMappingLocalServiceUtil.updateFacilityUserMapping(this);
		}
	}

	@Override
	public FacilityUserMapping toEscapedModel() {
		return (FacilityUserMapping)Proxy.newProxyInstance(FacilityUserMapping.class.getClassLoader(),
			new Class[] { FacilityUserMapping.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FacilityUserMappingClp clone = new FacilityUserMappingClp();

		clone.setId(getId());
		clone.setCustomerId(getCustomerId());
		clone.setFaciltyId(getFaciltyId());
		clone.setCustomerContactId(getCustomerContactId());
		clone.setIsActive(getIsActive());
		clone.setNonPacnetUserId(getNonPacnetUserId());
		clone.setCreatedOn(getCreatedOn());
		clone.setCreatedBy(getCreatedBy());
		clone.setUpdatedOn(getUpdatedOn());
		clone.setUpdatedBy(getUpdatedBy());

		return clone;
	}

	public int compareTo(FacilityUserMapping facilityUserMapping) {
		long primaryKey = facilityUserMapping.getPrimaryKey();

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

		FacilityUserMappingClp facilityUserMapping = null;

		try {
			facilityUserMapping = (FacilityUserMappingClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = facilityUserMapping.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", customerId=");
		sb.append(getCustomerId());
		sb.append(", faciltyId=");
		sb.append(getFaciltyId());
		sb.append(", customerContactId=");
		sb.append(getCustomerContactId());
		sb.append(", isActive=");
		sb.append(getIsActive());
		sb.append(", nonPacnetUserId=");
		sb.append(getNonPacnetUserId());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.FacilityUserMapping");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerId</column-name><column-value><![CDATA[");
		sb.append(getCustomerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>faciltyId</column-name><column-value><![CDATA[");
		sb.append(getFaciltyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerContactId</column-name><column-value><![CDATA[");
		sb.append(getCustomerContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nonPacnetUserId</column-name><column-value><![CDATA[");
		sb.append(getNonPacnetUserId());
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
	private long _customerId;
	private long _faciltyId;
	private long _customerContactId;
	private boolean _isActive;
	private long _nonPacnetUserId;
	private String _nonPacnetUserUuid;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
	private BaseModel<?> _facilityUserMappingRemoteModel;
}