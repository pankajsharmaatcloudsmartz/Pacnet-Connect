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

import com.pacnet.connect.service.SMA_CompaniesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CloudSmartz
 */
public class SMA_CompaniesClp extends BaseModelImpl<SMA_Companies>
	implements SMA_Companies {
	public SMA_CompaniesClp() {
	}

	public Class<?> getModelClass() {
		return SMA_Companies.class;
	}

	public String getModelClassName() {
		return SMA_Companies.class.getName();
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
		attributes.put("customer_id", getCustomer_id());
		attributes.put("companyName", getCompanyName());
		attributes.put("domains", getDomains());
		attributes.put("groupname", getGroupname());
		attributes.put("attribute", getAttribute());
		attributes.put("op", getOp());
		attributes.put("value", getValue());
		attributes.put("maxUser", getMaxUser());
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

		Long customer_id = (Long)attributes.get("customer_id");

		if (customer_id != null) {
			setCustomer_id(customer_id);
		}

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String domains = (String)attributes.get("domains");

		if (domains != null) {
			setDomains(domains);
		}

		String groupname = (String)attributes.get("groupname");

		if (groupname != null) {
			setGroupname(groupname);
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

	public long getCustomer_id() {
		return _customer_id;
	}

	public void setCustomer_id(long customer_id) {
		_customer_id = customer_id;
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

	public String getGroupname() {
		return _groupname;
	}

	public void setGroupname(String groupname) {
		_groupname = groupname;
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

	public BaseModel<?> getSMA_CompaniesRemoteModel() {
		return _sma_CompaniesRemoteModel;
	}

	public void setSMA_CompaniesRemoteModel(
		BaseModel<?> sma_CompaniesRemoteModel) {
		_sma_CompaniesRemoteModel = sma_CompaniesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			SMA_CompaniesLocalServiceUtil.addSMA_Companies(this);
		}
		else {
			SMA_CompaniesLocalServiceUtil.updateSMA_Companies(this);
		}
	}

	@Override
	public SMA_Companies toEscapedModel() {
		return (SMA_Companies)Proxy.newProxyInstance(SMA_Companies.class.getClassLoader(),
			new Class[] { SMA_Companies.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SMA_CompaniesClp clone = new SMA_CompaniesClp();

		clone.setId(getId());
		clone.setCustomer_id(getCustomer_id());
		clone.setCompanyName(getCompanyName());
		clone.setDomains(getDomains());
		clone.setGroupname(getGroupname());
		clone.setAttribute(getAttribute());
		clone.setOp(getOp());
		clone.setValue(getValue());
		clone.setMaxUser(getMaxUser());
		clone.setIsActive(getIsActive());
		clone.setCreated_On(getCreated_On());
		clone.setCreated_By(getCreated_By());
		clone.setUpdated_On(getUpdated_On());
		clone.setUpdated_By(getUpdated_By());

		return clone;
	}

	public int compareTo(SMA_Companies sma_Companies) {
		long primaryKey = sma_Companies.getPrimaryKey();

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

		SMA_CompaniesClp sma_Companies = null;

		try {
			sma_Companies = (SMA_CompaniesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = sma_Companies.getPrimaryKey();

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
		sb.append(", customer_id=");
		sb.append(getCustomer_id());
		sb.append(", companyName=");
		sb.append(getCompanyName());
		sb.append(", domains=");
		sb.append(getDomains());
		sb.append(", groupname=");
		sb.append(getGroupname());
		sb.append(", attribute=");
		sb.append(getAttribute());
		sb.append(", op=");
		sb.append(getOp());
		sb.append(", value=");
		sb.append(getValue());
		sb.append(", maxUser=");
		sb.append(getMaxUser());
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
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.SMA_Companies");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customer_id</column-name><column-value><![CDATA[");
		sb.append(getCustomer_id());
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
			"<column><column-name>groupname</column-name><column-value><![CDATA[");
		sb.append(getGroupname());
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
	private long _customer_id;
	private String _companyName;
	private String _domains;
	private String _groupname;
	private String _attribute;
	private String _op;
	private String _value;
	private int _maxUser;
	private int _IsActive;
	private Date _Created_On;
	private String _Created_By;
	private Date _Updated_On;
	private String _Updated_By;
	private BaseModel<?> _sma_CompaniesRemoteModel;
}