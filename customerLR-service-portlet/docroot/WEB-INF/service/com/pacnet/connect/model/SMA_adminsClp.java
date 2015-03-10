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

import com.pacnet.connect.service.SMA_adminsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CloudSmartz
 */
public class SMA_adminsClp extends BaseModelImpl<SMA_admins>
	implements SMA_admins {
	public SMA_adminsClp() {
	}

	public Class<?> getModelClass() {
		return SMA_admins.class;
	}

	public String getModelClassName() {
		return SMA_admins.class.getName();
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
		attributes.put("user_id", getUser_id());
		attributes.put("radcheck_id", getRadcheck_id());
		attributes.put("company_id", getCompany_id());
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

		Long user_id = (Long)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}

		Long radcheck_id = (Long)attributes.get("radcheck_id");

		if (radcheck_id != null) {
			setRadcheck_id(radcheck_id);
		}

		Long company_id = (Long)attributes.get("company_id");

		if (company_id != null) {
			setCompany_id(company_id);
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

	public long getUser_id() {
		return _user_id;
	}

	public void setUser_id(long user_id) {
		_user_id = user_id;
	}

	public long getRadcheck_id() {
		return _radcheck_id;
	}

	public void setRadcheck_id(long radcheck_id) {
		_radcheck_id = radcheck_id;
	}

	public long getCompany_id() {
		return _company_id;
	}

	public void setCompany_id(long company_id) {
		_company_id = company_id;
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

	public BaseModel<?> getSMA_adminsRemoteModel() {
		return _sma_adminsRemoteModel;
	}

	public void setSMA_adminsRemoteModel(BaseModel<?> sma_adminsRemoteModel) {
		_sma_adminsRemoteModel = sma_adminsRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			SMA_adminsLocalServiceUtil.addSMA_admins(this);
		}
		else {
			SMA_adminsLocalServiceUtil.updateSMA_admins(this);
		}
	}

	@Override
	public SMA_admins toEscapedModel() {
		return (SMA_admins)Proxy.newProxyInstance(SMA_admins.class.getClassLoader(),
			new Class[] { SMA_admins.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SMA_adminsClp clone = new SMA_adminsClp();

		clone.setId(getId());
		clone.setUser_id(getUser_id());
		clone.setRadcheck_id(getRadcheck_id());
		clone.setCompany_id(getCompany_id());
		clone.setIsActive(getIsActive());
		clone.setCreated_On(getCreated_On());
		clone.setCreated_By(getCreated_By());
		clone.setUpdated_On(getUpdated_On());
		clone.setUpdated_By(getUpdated_By());

		return clone;
	}

	public int compareTo(SMA_admins sma_admins) {
		long primaryKey = sma_admins.getPrimaryKey();

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

		SMA_adminsClp sma_admins = null;

		try {
			sma_admins = (SMA_adminsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = sma_admins.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", user_id=");
		sb.append(getUser_id());
		sb.append(", radcheck_id=");
		sb.append(getRadcheck_id());
		sb.append(", company_id=");
		sb.append(getCompany_id());
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
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.SMA_admins");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>user_id</column-name><column-value><![CDATA[");
		sb.append(getUser_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>radcheck_id</column-name><column-value><![CDATA[");
		sb.append(getRadcheck_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>company_id</column-name><column-value><![CDATA[");
		sb.append(getCompany_id());
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
	private long _user_id;
	private long _radcheck_id;
	private long _company_id;
	private int _IsActive;
	private Date _Created_On;
	private String _Created_By;
	private Date _Updated_On;
	private String _Updated_By;
	private BaseModel<?> _sma_adminsRemoteModel;
}