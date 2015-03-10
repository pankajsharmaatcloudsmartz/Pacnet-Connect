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

import com.pacnet.connect.service.SAM_reservationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CloudSmartz
 */
public class SAM_reservationClp extends BaseModelImpl<SAM_reservation>
	implements SAM_reservation {
	public SAM_reservationClp() {
	}

	public Class<?> getModelClass() {
		return SAM_reservation.class;
	}

	public String getModelClassName() {
		return SAM_reservation.class.getName();
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
		attributes.put("name", getName());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("owner", getOwner());
		attributes.put("provision", getProvision());
		attributes.put("IsActive", getIsActive());
		attributes.put("Created_On", getCreated_On());
		attributes.put("Created_By", getCreated_By());
		attributes.put("Updated_On", getUpdated_On());
		attributes.put("Updated_By", getUpdated_By());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		String owner = (String)attributes.get("owner");

		if (owner != null) {
			setOwner(owner);
		}

		Integer provision = (Integer)attributes.get("provision");

		if (provision != null) {
			setProvision(provision);
		}

		Integer IsActive = (Integer)attributes.get("IsActive");

		if (IsActive != null) {
			setIsActive(IsActive);
		}

		Date Created_On = (Date)attributes.get("Created_On");

		if (Created_On != null) {
			setCreated_On(Created_On);
		}

		String Created_By = (String)attributes.get("Created_By");

		if (Created_By != null) {
			setCreated_By(Created_By);
		}

		Date Updated_On = (Date)attributes.get("Updated_On");

		if (Updated_On != null) {
			setUpdated_On(Updated_On);
		}

		String Updated_By = (String)attributes.get("Updated_By");

		if (Updated_By != null) {
			setUpdated_By(Updated_By);
		}
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Date getStartDate() {
		return _startDate;
	}

	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	public String getOwner() {
		return _owner;
	}

	public void setOwner(String owner) {
		_owner = owner;
	}

	public int getProvision() {
		return _provision;
	}

	public void setProvision(int provision) {
		_provision = provision;
	}

	public int getIsActive() {
		return _IsActive;
	}

	public void setIsActive(int IsActive) {
		_IsActive = IsActive;
	}

	public Date getCreated_On() {
		return _Created_On;
	}

	public void setCreated_On(Date Created_On) {
		_Created_On = Created_On;
	}

	public String getCreated_By() {
		return _Created_By;
	}

	public void setCreated_By(String Created_By) {
		_Created_By = Created_By;
	}

	public Date getUpdated_On() {
		return _Updated_On;
	}

	public void setUpdated_On(Date Updated_On) {
		_Updated_On = Updated_On;
	}

	public String getUpdated_By() {
		return _Updated_By;
	}

	public void setUpdated_By(String Updated_By) {
		_Updated_By = Updated_By;
	}

	public BaseModel<?> getSAM_reservationRemoteModel() {
		return _sam_reservationRemoteModel;
	}

	public void setSAM_reservationRemoteModel(
		BaseModel<?> sam_reservationRemoteModel) {
		_sam_reservationRemoteModel = sam_reservationRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			SAM_reservationLocalServiceUtil.addSAM_reservation(this);
		}
		else {
			SAM_reservationLocalServiceUtil.updateSAM_reservation(this);
		}
	}

	@Override
	public SAM_reservation toEscapedModel() {
		return (SAM_reservation)Proxy.newProxyInstance(SAM_reservation.class.getClassLoader(),
			new Class[] { SAM_reservation.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SAM_reservationClp clone = new SAM_reservationClp();

		clone.setId(getId());
		clone.setName(getName());
		clone.setStartDate(getStartDate());
		clone.setEndDate(getEndDate());
		clone.setOwner(getOwner());
		clone.setProvision(getProvision());
		clone.setIsActive(getIsActive());
		clone.setCreated_On(getCreated_On());
		clone.setCreated_By(getCreated_By());
		clone.setUpdated_On(getUpdated_On());
		clone.setUpdated_By(getUpdated_By());

		return clone;
	}

	public int compareTo(SAM_reservation sam_reservation) {
		long primaryKey = sam_reservation.getPrimaryKey();

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

		SAM_reservationClp sam_reservation = null;

		try {
			sam_reservation = (SAM_reservationClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = sam_reservation.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", startDate=");
		sb.append(getStartDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append(", owner=");
		sb.append(getOwner());
		sb.append(", provision=");
		sb.append(getProvision());
		sb.append(", IsActive=");
		sb.append(getIsActive());
		sb.append(", Created_On=");
		sb.append(getCreated_On());
		sb.append(", Created_By=");
		sb.append(getCreated_By());
		sb.append(", Updated_On=");
		sb.append(getUpdated_On());
		sb.append(", Updated_By=");
		sb.append(getUpdated_By());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.SAM_reservation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startDate</column-name><column-value><![CDATA[");
		sb.append(getStartDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>owner</column-name><column-value><![CDATA[");
		sb.append(getOwner());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>provision</column-name><column-value><![CDATA[");
		sb.append(getProvision());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Created_On</column-name><column-value><![CDATA[");
		sb.append(getCreated_On());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Created_By</column-name><column-value><![CDATA[");
		sb.append(getCreated_By());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Updated_On</column-name><column-value><![CDATA[");
		sb.append(getUpdated_On());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Updated_By</column-name><column-value><![CDATA[");
		sb.append(getUpdated_By());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _name;
	private Date _startDate;
	private Date _endDate;
	private String _owner;
	private int _provision;
	private int _IsActive;
	private Date _Created_On;
	private String _Created_By;
	private Date _Updated_On;
	private String _Updated_By;
	private BaseModel<?> _sam_reservationRemoteModel;
}