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

import com.pacnet.connect.service.SMACompaniesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CloudSmartz
 */
public class SMACompaniesClp extends BaseModelImpl<SMACompanies>
	implements SMACompanies {
	public SMACompaniesClp() {
	}

	public Class<?> getModelClass() {
		return SMACompanies.class;
	}

	public String getModelClassName() {
		return SMACompanies.class.getName();
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
		attributes.put("companyName", getCompanyName());
		attributes.put("domains", getDomains());
		attributes.put("groupName", getGroupName());
		attributes.put("attribute", getAttribute());
		attributes.put("op", getOp());
		attributes.put("value", getValue());
		attributes.put("maxUser", getMaxUser());
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

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String domains = (String)attributes.get("domains");

		if (domains != null) {
			setDomains(domains);
		}

		String groupName = (String)attributes.get("groupName");

		if (groupName != null) {
			setGroupName(groupName);
		}

		String attribute = (String)attributes.get("attribute");

		if (attribute != null) {
			setAttribute(attribute);
		}

		String op = (String)attributes.get("op");

		if (op != null) {
			setOp(op);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		Integer maxUser = (Integer)attributes.get("maxUser");

		if (maxUser != null) {
			setMaxUser(maxUser);
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

	public long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(long customerId) {
		_customerId = customerId;
	}

	public String getCompanyName() {
		return _companyName;
	}

	public void setCompanyName(String companyName) {
		_companyName = companyName;
	}

	public String getDomains() {
		return _domains;
	}

	public void setDomains(String domains) {
		_domains = domains;
	}

	public String getGroupName() {
		return _groupName;
	}

	public void setGroupName(String groupName) {
		_groupName = groupName;
	}

	public String getAttribute() {
		return _attribute;
	}

	public void setAttribute(String attribute) {
		_attribute = attribute;
	}

	public String getOp() {
		return _op;
	}

	public void setOp(String op) {
		_op = op;
	}

	public String getValue() {
		return _value;
	}

	public void setValue(String value) {
		_value = value;
	}

	public int getMaxUser() {
		return _maxUser;
	}

	public void setMaxUser(int maxUser) {
		_maxUser = maxUser;
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

	public BaseModel<?> getSMACompaniesRemoteModel() {
		return _smaCompaniesRemoteModel;
	}

	public void setSMACompaniesRemoteModel(BaseModel<?> smaCompaniesRemoteModel) {
		_smaCompaniesRemoteModel = smaCompaniesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			SMACompaniesLocalServiceUtil.addSMACompanies(this);
		}
		else {
			SMACompaniesLocalServiceUtil.updateSMACompanies(this);
		}
	}

	@Override
	public SMACompanies toEscapedModel() {
		return (SMACompanies)Proxy.newProxyInstance(SMACompanies.class.getClassLoader(),
			new Class[] { SMACompanies.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SMACompaniesClp clone = new SMACompaniesClp();

		clone.setId(getId());
		clone.setCustomerId(getCustomerId());
		clone.setCompanyName(getCompanyName());
		clone.setDomains(getDomains());
		clone.setGroupName(getGroupName());
		clone.setAttribute(getAttribute());
		clone.setOp(getOp());
		clone.setValue(getValue());
		clone.setMaxUser(getMaxUser());
		clone.setIsActive(getIsActive());
		clone.setCreatedOn(getCreatedOn());
		clone.setCreatedBy(getCreatedBy());
		clone.setUpdatedOn(getUpdatedOn());
		clone.setUpdatedBy(getUpdatedBy());

		return clone;
	}

	public int compareTo(SMACompanies smaCompanies) {
		long primaryKey = smaCompanies.getPrimaryKey();

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

		SMACompaniesClp smaCompanies = null;

		try {
			smaCompanies = (SMACompaniesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = smaCompanies.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", customerId=");
		sb.append(getCustomerId());
		sb.append(", companyName=");
		sb.append(getCompanyName());
		sb.append(", domains=");
		sb.append(getDomains());
		sb.append(", groupName=");
		sb.append(getGroupName());
		sb.append(", attribute=");
		sb.append(getAttribute());
		sb.append(", op=");
		sb.append(getOp());
		sb.append(", value=");
		sb.append(getValue());
		sb.append(", maxUser=");
		sb.append(getMaxUser());
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
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.SMACompanies");
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
			"<column><column-name>companyName</column-name><column-value><![CDATA[");
		sb.append(getCompanyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>domains</column-name><column-value><![CDATA[");
		sb.append(getDomains());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupName</column-name><column-value><![CDATA[");
		sb.append(getGroupName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attribute</column-name><column-value><![CDATA[");
		sb.append(getAttribute());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>op</column-name><column-value><![CDATA[");
		sb.append(getOp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>value</column-name><column-value><![CDATA[");
		sb.append(getValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maxUser</column-name><column-value><![CDATA[");
		sb.append(getMaxUser());
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
	private long _customerId;
	private String _companyName;
	private String _domains;
	private String _groupName;
	private String _attribute;
	private String _op;
	private String _value;
	private int _maxUser;
	private int _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
	private BaseModel<?> _smaCompaniesRemoteModel;
}