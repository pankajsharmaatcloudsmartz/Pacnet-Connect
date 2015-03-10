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

import com.pacnet.connect.service.SMAEmailHistoryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CloudSmartz
 */
public class SMAEmailHistoryClp extends BaseModelImpl<SMAEmailHistory>
	implements SMAEmailHistory {
	public SMAEmailHistoryClp() {
	}

	public Class<?> getModelClass() {
		return SMAEmailHistory.class;
	}

	public String getModelClassName() {
		return SMAEmailHistory.class.getName();
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
		attributes.put("historyType", getHistoryType());
		attributes.put("emailFrom", getEmailFrom());
		attributes.put("emailTo", getEmailTo());
		attributes.put("emailTitle", getEmailTitle());
		attributes.put("emailContent", getEmailContent());
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer historyType = (Integer)attributes.get("historyType");

		if (historyType != null) {
			setHistoryType(historyType);
		}

		String emailFrom = (String)attributes.get("emailFrom");

		if (emailFrom != null) {
			setEmailFrom(emailFrom);
		}

		String emailTo = (String)attributes.get("emailTo");

		if (emailTo != null) {
			setEmailTo(emailTo);
		}

		String emailTitle = (String)attributes.get("emailTitle");

		if (emailTitle != null) {
			setEmailTitle(emailTitle);
		}

		String emailContent = (String)attributes.get("emailContent");

		if (emailContent != null) {
			setEmailContent(emailContent);
		}

		Integer isActive = (Integer)attributes.get("isActive");

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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public int getHistoryType() {
		return _historyType;
	}

	public void setHistoryType(int historyType) {
		_historyType = historyType;
	}

	public String getEmailFrom() {
		return _emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		_emailFrom = emailFrom;
	}

	public String getEmailTo() {
		return _emailTo;
	}

	public void setEmailTo(String emailTo) {
		_emailTo = emailTo;
	}

	public String getEmailTitle() {
		return _emailTitle;
	}

	public void setEmailTitle(String emailTitle) {
		_emailTitle = emailTitle;
	}

	public String getEmailContent() {
		return _emailContent;
	}

	public void setEmailContent(String emailContent) {
		_emailContent = emailContent;
	}

	public int getIsActive() {
		return _isActive;
	}

	public void setIsActive(int isActive) {
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

	public BaseModel<?> getSMAEmailHistoryRemoteModel() {
		return _smaEmailHistoryRemoteModel;
	}

	public void setSMAEmailHistoryRemoteModel(
		BaseModel<?> smaEmailHistoryRemoteModel) {
		_smaEmailHistoryRemoteModel = smaEmailHistoryRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			SMAEmailHistoryLocalServiceUtil.addSMAEmailHistory(this);
		}
		else {
			SMAEmailHistoryLocalServiceUtil.updateSMAEmailHistory(this);
		}
	}

	@Override
	public SMAEmailHistory toEscapedModel() {
		return (SMAEmailHistory)Proxy.newProxyInstance(SMAEmailHistory.class.getClassLoader(),
			new Class[] { SMAEmailHistory.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SMAEmailHistoryClp clone = new SMAEmailHistoryClp();

		clone.setId(getId());
		clone.setName(getName());
		clone.setHistoryType(getHistoryType());
		clone.setEmailFrom(getEmailFrom());
		clone.setEmailTo(getEmailTo());
		clone.setEmailTitle(getEmailTitle());
		clone.setEmailContent(getEmailContent());
		clone.setIsActive(getIsActive());
		clone.setCreatedOn(getCreatedOn());
		clone.setCreatedBy(getCreatedBy());
		clone.setUpdatedOn(getUpdatedOn());
		clone.setUpdatedBy(getUpdatedBy());

		return clone;
	}

	public int compareTo(SMAEmailHistory smaEmailHistory) {
		long primaryKey = smaEmailHistory.getPrimaryKey();

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

		SMAEmailHistoryClp smaEmailHistory = null;

		try {
			smaEmailHistory = (SMAEmailHistoryClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = smaEmailHistory.getPrimaryKey();

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
		sb.append(", name=");
		sb.append(getName());
		sb.append(", historyType=");
		sb.append(getHistoryType());
		sb.append(", emailFrom=");
		sb.append(getEmailFrom());
		sb.append(", emailTo=");
		sb.append(getEmailTo());
		sb.append(", emailTitle=");
		sb.append(getEmailTitle());
		sb.append(", emailContent=");
		sb.append(getEmailContent());
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
		sb.append("com.pacnet.connect.model.SMAEmailHistory");
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
			"<column><column-name>historyType</column-name><column-value><![CDATA[");
		sb.append(getHistoryType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailFrom</column-name><column-value><![CDATA[");
		sb.append(getEmailFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailTo</column-name><column-value><![CDATA[");
		sb.append(getEmailTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailTitle</column-name><column-value><![CDATA[");
		sb.append(getEmailTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailContent</column-name><column-value><![CDATA[");
		sb.append(getEmailContent());
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
	private String _name;
	private int _historyType;
	private String _emailFrom;
	private String _emailTo;
	private String _emailTitle;
	private String _emailContent;
	private int _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
	private BaseModel<?> _smaEmailHistoryRemoteModel;
}