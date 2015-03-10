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

import com.pacnet.connect.service.SMACompanyListLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CloudSmartz
 */
public class SMACompanyListClp extends BaseModelImpl<SMACompanyList>
	implements SMACompanyList {
	public SMACompanyListClp() {
	}

	public Class<?> getModelClass() {
		return SMACompanyList.class;
	}

	public String getModelClassName() {
		return SMACompanyList.class.getName();
	}

	public String getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(String primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("adminUserId", getAdminUserId());
		attributes.put("companyId", getCompanyId());
		attributes.put("customerId", getCustomerId());
		attributes.put("domains", getDomains());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String id = (String)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long adminUserId = (Long)attributes.get("adminUserId");

		if (adminUserId != null) {
			setAdminUserId(adminUserId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		String domains = (String)attributes.get("domains");

		if (domains != null) {
			setDomains(domains);
		}
	}

	public String getId() {
		return _id;
	}

	public void setId(String id) {
		_id = id;
	}

	public long getAdminUserId() {
		return _adminUserId;
	}

	public void setAdminUserId(long adminUserId) {
		_adminUserId = adminUserId;
	}

	public String getAdminUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getAdminUserId(), "uuid", _adminUserUuid);
	}

	public void setAdminUserUuid(String adminUserUuid) {
		_adminUserUuid = adminUserUuid;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(long customerId) {
		_customerId = customerId;
	}

	public String getDomains() {
		return _domains;
	}

	public void setDomains(String domains) {
		_domains = domains;
	}

	public BaseModel<?> getSMACompanyListRemoteModel() {
		return _smaCompanyListRemoteModel;
	}

	public void setSMACompanyListRemoteModel(
		BaseModel<?> smaCompanyListRemoteModel) {
		_smaCompanyListRemoteModel = smaCompanyListRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			SMACompanyListLocalServiceUtil.addSMACompanyList(this);
		}
		else {
			SMACompanyListLocalServiceUtil.updateSMACompanyList(this);
		}
	}

	@Override
	public SMACompanyList toEscapedModel() {
		return (SMACompanyList)Proxy.newProxyInstance(SMACompanyList.class.getClassLoader(),
			new Class[] { SMACompanyList.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SMACompanyListClp clone = new SMACompanyListClp();

		clone.setId(getId());
		clone.setAdminUserId(getAdminUserId());
		clone.setCompanyId(getCompanyId());
		clone.setCustomerId(getCustomerId());
		clone.setDomains(getDomains());

		return clone;
	}

	public int compareTo(SMACompanyList smaCompanyList) {
		String primaryKey = smaCompanyList.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		SMACompanyListClp smaCompanyList = null;

		try {
			smaCompanyList = (SMACompanyListClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String primaryKey = smaCompanyList.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", adminUserId=");
		sb.append(getAdminUserId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", customerId=");
		sb.append(getCustomerId());
		sb.append(", domains=");
		sb.append(getDomains());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.SMACompanyList");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>adminUserId</column-name><column-value><![CDATA[");
		sb.append(getAdminUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerId</column-name><column-value><![CDATA[");
		sb.append(getCustomerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>domains</column-name><column-value><![CDATA[");
		sb.append(getDomains());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _id;
	private long _adminUserId;
	private String _adminUserUuid;
	private long _companyId;
	private long _customerId;
	private String _domains;
	private BaseModel<?> _smaCompanyListRemoteModel;
}