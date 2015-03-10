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

import com.pacnet.connect.service.SMARadacctLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CloudSmartz
 */
public class SMARadacctClp extends BaseModelImpl<SMARadacct>
	implements SMARadacct {
	public SMARadacctClp() {
	}

	public Class<?> getModelClass() {
		return SMARadacct.class;
	}

	public String getModelClassName() {
		return SMARadacct.class.getName();
	}

	public long getPrimaryKey() {
		return _radAcctId;
	}

	public void setPrimaryKey(long primaryKey) {
		setRadAcctId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_radAcctId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("radAcctId", getRadAcctId());
		attributes.put("radcheckId", getRadcheckId());
		attributes.put("acctSessionId", getAcctSessionId());
		attributes.put("realm", getRealm());
		attributes.put("acctStartTime", getAcctStartTime());
		attributes.put("acctStopTime", getAcctStopTime());
		attributes.put("acctSessionTime", getAcctSessionTime());
		attributes.put("acctterminateCause", getAcctterminateCause());
		attributes.put("isActive", getIsActive());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedOn", getUpdatedOn());
		attributes.put("updatedBy", getUpdatedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long radAcctId = (Long)attributes.get("radAcctId");

		if (radAcctId != null) {
			setRadAcctId(radAcctId);
		}

		Long radcheckId = (Long)attributes.get("radcheckId");

		if (radcheckId != null) {
			setRadcheckId(radcheckId);
		}

		String acctSessionId = (String)attributes.get("acctSessionId");

		if (acctSessionId != null) {
			setAcctSessionId(acctSessionId);
		}

		String realm = (String)attributes.get("realm");

		if (realm != null) {
			setRealm(realm);
		}

		Date acctStartTime = (Date)attributes.get("acctStartTime");

		if (acctStartTime != null) {
			setAcctStartTime(acctStartTime);
		}

		Date acctStopTime = (Date)attributes.get("acctStopTime");

		if (acctStopTime != null) {
			setAcctStopTime(acctStopTime);
		}

		Long acctSessionTime = (Long)attributes.get("acctSessionTime");

		if (acctSessionTime != null) {
			setAcctSessionTime(acctSessionTime);
		}

		String acctterminateCause = (String)attributes.get("acctterminateCause");

		if (acctterminateCause != null) {
			setAcctterminateCause(acctterminateCause);
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

	public long getRadAcctId() {
		return _radAcctId;
	}

	public void setRadAcctId(long radAcctId) {
		_radAcctId = radAcctId;
	}

	public long getRadcheckId() {
		return _radcheckId;
	}

	public void setRadcheckId(long radcheckId) {
		_radcheckId = radcheckId;
	}

	public String getAcctSessionId() {
		return _acctSessionId;
	}

	public void setAcctSessionId(String acctSessionId) {
		_acctSessionId = acctSessionId;
	}

	public String getRealm() {
		return _realm;
	}

	public void setRealm(String realm) {
		_realm = realm;
	}

	public Date getAcctStartTime() {
		return _acctStartTime;
	}

	public void setAcctStartTime(Date acctStartTime) {
		_acctStartTime = acctStartTime;
	}

	public Date getAcctStopTime() {
		return _acctStopTime;
	}

	public void setAcctStopTime(Date acctStopTime) {
		_acctStopTime = acctStopTime;
	}

	public long getAcctSessionTime() {
		return _acctSessionTime;
	}

	public void setAcctSessionTime(long acctSessionTime) {
		_acctSessionTime = acctSessionTime;
	}

	public String getAcctterminateCause() {
		return _acctterminateCause;
	}

	public void setAcctterminateCause(String acctterminateCause) {
		_acctterminateCause = acctterminateCause;
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

	public BaseModel<?> getSMARadacctRemoteModel() {
		return _smaRadacctRemoteModel;
	}

	public void setSMARadacctRemoteModel(BaseModel<?> smaRadacctRemoteModel) {
		_smaRadacctRemoteModel = smaRadacctRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			SMARadacctLocalServiceUtil.addSMARadacct(this);
		}
		else {
			SMARadacctLocalServiceUtil.updateSMARadacct(this);
		}
	}

	@Override
	public SMARadacct toEscapedModel() {
		return (SMARadacct)Proxy.newProxyInstance(SMARadacct.class.getClassLoader(),
			new Class[] { SMARadacct.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SMARadacctClp clone = new SMARadacctClp();

		clone.setRadAcctId(getRadAcctId());
		clone.setRadcheckId(getRadcheckId());
		clone.setAcctSessionId(getAcctSessionId());
		clone.setRealm(getRealm());
		clone.setAcctStartTime(getAcctStartTime());
		clone.setAcctStopTime(getAcctStopTime());
		clone.setAcctSessionTime(getAcctSessionTime());
		clone.setAcctterminateCause(getAcctterminateCause());
		clone.setIsActive(getIsActive());
		clone.setCreatedOn(getCreatedOn());
		clone.setCreatedBy(getCreatedBy());
		clone.setUpdatedOn(getUpdatedOn());
		clone.setUpdatedBy(getUpdatedBy());

		return clone;
	}

	public int compareTo(SMARadacct smaRadacct) {
		long primaryKey = smaRadacct.getPrimaryKey();

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

		SMARadacctClp smaRadacct = null;

		try {
			smaRadacct = (SMARadacctClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = smaRadacct.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{radAcctId=");
		sb.append(getRadAcctId());
		sb.append(", radcheckId=");
		sb.append(getRadcheckId());
		sb.append(", acctSessionId=");
		sb.append(getAcctSessionId());
		sb.append(", realm=");
		sb.append(getRealm());
		sb.append(", acctStartTime=");
		sb.append(getAcctStartTime());
		sb.append(", acctStopTime=");
		sb.append(getAcctStopTime());
		sb.append(", acctSessionTime=");
		sb.append(getAcctSessionTime());
		sb.append(", acctterminateCause=");
		sb.append(getAcctterminateCause());
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
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.SMARadacct");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>radAcctId</column-name><column-value><![CDATA[");
		sb.append(getRadAcctId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>radcheckId</column-name><column-value><![CDATA[");
		sb.append(getRadcheckId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acctSessionId</column-name><column-value><![CDATA[");
		sb.append(getAcctSessionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>realm</column-name><column-value><![CDATA[");
		sb.append(getRealm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acctStartTime</column-name><column-value><![CDATA[");
		sb.append(getAcctStartTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acctStopTime</column-name><column-value><![CDATA[");
		sb.append(getAcctStopTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acctSessionTime</column-name><column-value><![CDATA[");
		sb.append(getAcctSessionTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acctterminateCause</column-name><column-value><![CDATA[");
		sb.append(getAcctterminateCause());
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

	private long _radAcctId;
	private long _radcheckId;
	private String _acctSessionId;
	private String _realm;
	private Date _acctStartTime;
	private Date _acctStopTime;
	private long _acctSessionTime;
	private String _acctterminateCause;
	private int _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
	private BaseModel<?> _smaRadacctRemoteModel;
}