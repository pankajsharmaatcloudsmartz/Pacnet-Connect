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

import com.pacnet.connect.service.SMA_Email_HistoryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CloudSmartz
 */
public class SMA_Email_HistoryClp extends BaseModelImpl<SMA_Email_History>
	implements SMA_Email_History {
	public SMA_Email_HistoryClp() {
	}

	public Class<?> getModelClass() {
		return SMA_Email_History.class;
	}

	public String getModelClassName() {
		return SMA_Email_History.class.getName();
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

	public BaseModel<?> getSMA_Email_HistoryRemoteModel() {
		return _sma_Email_HistoryRemoteModel;
	}

	public void setSMA_Email_HistoryRemoteModel(
		BaseModel<?> sma_Email_HistoryRemoteModel) {
		_sma_Email_HistoryRemoteModel = sma_Email_HistoryRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			SMA_Email_HistoryLocalServiceUtil.addSMA_Email_History(this);
		}
		else {
			SMA_Email_HistoryLocalServiceUtil.updateSMA_Email_History(this);
		}
	}

	@Override
	public SMA_Email_History toEscapedModel() {
		return (SMA_Email_History)Proxy.newProxyInstance(SMA_Email_History.class.getClassLoader(),
			new Class[] { SMA_Email_History.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SMA_Email_HistoryClp clone = new SMA_Email_HistoryClp();

		clone.setId(getId());
		clone.setName(getName());
		clone.setHistoryType(getHistoryType());
		clone.setEmailFrom(getEmailFrom());
		clone.setEmailTo(getEmailTo());
		clone.setEmailTitle(getEmailTitle());
		clone.setEmailContent(getEmailContent());
		clone.setIsActive(getIsActive());
		clone.setCreated_On(getCreated_On());
		clone.setCreated_By(getCreated_By());
		clone.setUpdated_On(getUpdated_On());
		clone.setUpdated_By(getUpdated_By());

		return clone;
	}

	public int compareTo(SMA_Email_History sma_Email_History) {
		long primaryKey = sma_Email_History.getPrimaryKey();

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

		SMA_Email_HistoryClp sma_Email_History = null;

		try {
			sma_Email_History = (SMA_Email_HistoryClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = sma_Email_History.getPrimaryKey();

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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.SMA_Email_History");
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
	private int _historyType;
	private String _emailFrom;
	private String _emailTo;
	private String _emailTitle;
	private String _emailContent;
	private int _IsActive;
	private Date _Created_On;
	private String _Created_By;
	private Date _Updated_On;
	private String _Updated_By;
	private BaseModel<?> _sma_Email_HistoryRemoteModel;
}