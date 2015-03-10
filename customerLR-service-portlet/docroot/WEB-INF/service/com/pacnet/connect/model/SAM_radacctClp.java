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

import com.pacnet.connect.service.SAM_radacctLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CloudSmartz
 */
public class SAM_radacctClp extends BaseModelImpl<SAM_radacct>
	implements SAM_radacct {
	public SAM_radacctClp() {
	}

	public Class<?> getModelClass() {
		return SAM_radacct.class;
	}

	public String getModelClassName() {
		return SAM_radacct.class.getName();
	}

	public long getPrimaryKey() {
		return _RadAcctId;
	}

	public void setPrimaryKey(long primaryKey) {
		setRadAcctId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_RadAcctId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("RadAcctId", getRadAcctId());
		attributes.put("radcheck_id", getRadcheck_id());
		attributes.put("AcctSessionId", getAcctSessionId());
		attributes.put("AcctUniqueId", getAcctUniqueId());
		attributes.put("Realm", getRealm());
		attributes.put("NASIPAddress", getNASIPAddress());
		attributes.put("NASPortId", getNASPortId());
		attributes.put("NASPortType", getNASPortType());
		attributes.put("AcctStartTime", getAcctStartTime());
		attributes.put("AcctStopTime", getAcctStopTime());
		attributes.put("AcctSessionTime", getAcctSessionTime());
		attributes.put("AcctAuthentic", getAcctAuthentic());
		attributes.put("ConnectInfo_start", getConnectInfo_start());
		attributes.put("ConnectInfo_stop", getConnectInfo_stop());
		attributes.put("AcctInputOctets", getAcctInputOctets());
		attributes.put("AcctOutputOctets", getAcctOutputOctets());
		attributes.put("CalledStationId", getCalledStationId());
		attributes.put("CallingStationId", getCallingStationId());
		attributes.put("AcctterminateCause", getAcctterminateCause());
		attributes.put("ServiceTypr", getServiceTypr());
		attributes.put("FramedProtocol", getFramedProtocol());
		attributes.put("FramedIPAddress", getFramedIPAddress());
		attributes.put("AcctStartDelay", getAcctStartDelay());
		attributes.put("AcctStopDelay", getAcctStopDelay());
		attributes.put("IsActive", getIsActive());
		attributes.put("Created_On", getCreated_On());
		attributes.put("Created_By", getCreated_By());
		attributes.put("Updated_On", getUpdated_On());
		attributes.put("Updated_By", getUpdated_By());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long RadAcctId = (Long)attributes.get("RadAcctId");

		if (RadAcctId != null) {
			setRadAcctId(RadAcctId);
		}

		Long radcheck_id = (Long)attributes.get("radcheck_id");

		if (radcheck_id != null) {
			setRadcheck_id(radcheck_id);
		}

		String AcctSessionId = (String)attributes.get("AcctSessionId");

		if (AcctSessionId != null) {
			setAcctSessionId(AcctSessionId);
		}

		String AcctUniqueId = (String)attributes.get("AcctUniqueId");

		if (AcctUniqueId != null) {
			setAcctUniqueId(AcctUniqueId);
		}

		String Realm = (String)attributes.get("Realm");

		if (Realm != null) {
			setRealm(Realm);
		}

		String NASIPAddress = (String)attributes.get("NASIPAddress");

		if (NASIPAddress != null) {
			setNASIPAddress(NASIPAddress);
		}

		String NASPortId = (String)attributes.get("NASPortId");

		if (NASPortId != null) {
			setNASPortId(NASPortId);
		}

		String NASPortType = (String)attributes.get("NASPortType");

		if (NASPortType != null) {
			setNASPortType(NASPortType);
		}

		Date AcctStartTime = (Date)attributes.get("AcctStartTime");

		if (AcctStartTime != null) {
			setAcctStartTime(AcctStartTime);
		}

		Date AcctStopTime = (Date)attributes.get("AcctStopTime");

		if (AcctStopTime != null) {
			setAcctStopTime(AcctStopTime);
		}

		Long AcctSessionTime = (Long)attributes.get("AcctSessionTime");

		if (AcctSessionTime != null) {
			setAcctSessionTime(AcctSessionTime);
		}

		String AcctAuthentic = (String)attributes.get("AcctAuthentic");

		if (AcctAuthentic != null) {
			setAcctAuthentic(AcctAuthentic);
		}

		String ConnectInfo_start = (String)attributes.get("ConnectInfo_start");

		if (ConnectInfo_start != null) {
			setConnectInfo_start(ConnectInfo_start);
		}

		String ConnectInfo_stop = (String)attributes.get("ConnectInfo_stop");

		if (ConnectInfo_stop != null) {
			setConnectInfo_stop(ConnectInfo_stop);
		}

		Long AcctInputOctets = (Long)attributes.get("AcctInputOctets");

		if (AcctInputOctets != null) {
			setAcctInputOctets(AcctInputOctets);
		}

		Long AcctOutputOctets = (Long)attributes.get("AcctOutputOctets");

		if (AcctOutputOctets != null) {
			setAcctOutputOctets(AcctOutputOctets);
		}

		String CalledStationId = (String)attributes.get("CalledStationId");

		if (CalledStationId != null) {
			setCalledStationId(CalledStationId);
		}

		String CallingStationId = (String)attributes.get("CallingStationId");

		if (CallingStationId != null) {
			setCallingStationId(CallingStationId);
		}

		String AcctterminateCause = (String)attributes.get("AcctterminateCause");

		if (AcctterminateCause != null) {
			setAcctterminateCause(AcctterminateCause);
		}

		String ServiceTypr = (String)attributes.get("ServiceTypr");

		if (ServiceTypr != null) {
			setServiceTypr(ServiceTypr);
		}

		String FramedProtocol = (String)attributes.get("FramedProtocol");

		if (FramedProtocol != null) {
			setFramedProtocol(FramedProtocol);
		}

		String FramedIPAddress = (String)attributes.get("FramedIPAddress");

		if (FramedIPAddress != null) {
			setFramedIPAddress(FramedIPAddress);
		}

		Long AcctStartDelay = (Long)attributes.get("AcctStartDelay");

		if (AcctStartDelay != null) {
			setAcctStartDelay(AcctStartDelay);
		}

		Long AcctStopDelay = (Long)attributes.get("AcctStopDelay");

		if (AcctStopDelay != null) {
			setAcctStopDelay(AcctStopDelay);
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

	public long getRadAcctId() {
		return _RadAcctId;
	}

	public void setRadAcctId(long RadAcctId) {
		_RadAcctId = RadAcctId;
	}

	public long getRadcheck_id() {
		return _radcheck_id;
	}

	public void setRadcheck_id(long radcheck_id) {
		_radcheck_id = radcheck_id;
	}

	public String getAcctSessionId() {
		return _AcctSessionId;
	}

	public void setAcctSessionId(String AcctSessionId) {
		_AcctSessionId = AcctSessionId;
	}

	public String getAcctUniqueId() {
		return _AcctUniqueId;
	}

	public void setAcctUniqueId(String AcctUniqueId) {
		_AcctUniqueId = AcctUniqueId;
	}

	public String getRealm() {
		return _Realm;
	}

	public void setRealm(String Realm) {
		_Realm = Realm;
	}

	public String getNASIPAddress() {
		return _NASIPAddress;
	}

	public void setNASIPAddress(String NASIPAddress) {
		_NASIPAddress = NASIPAddress;
	}

	public String getNASPortId() {
		return _NASPortId;
	}

	public void setNASPortId(String NASPortId) {
		_NASPortId = NASPortId;
	}

	public String getNASPortType() {
		return _NASPortType;
	}

	public void setNASPortType(String NASPortType) {
		_NASPortType = NASPortType;
	}

	public Date getAcctStartTime() {
		return _AcctStartTime;
	}

	public void setAcctStartTime(Date AcctStartTime) {
		_AcctStartTime = AcctStartTime;
	}

	public Date getAcctStopTime() {
		return _AcctStopTime;
	}

	public void setAcctStopTime(Date AcctStopTime) {
		_AcctStopTime = AcctStopTime;
	}

	public long getAcctSessionTime() {
		return _AcctSessionTime;
	}

	public void setAcctSessionTime(long AcctSessionTime) {
		_AcctSessionTime = AcctSessionTime;
	}

	public String getAcctAuthentic() {
		return _AcctAuthentic;
	}

	public void setAcctAuthentic(String AcctAuthentic) {
		_AcctAuthentic = AcctAuthentic;
	}

	public String getConnectInfo_start() {
		return _ConnectInfo_start;
	}

	public void setConnectInfo_start(String ConnectInfo_start) {
		_ConnectInfo_start = ConnectInfo_start;
	}

	public String getConnectInfo_stop() {
		return _ConnectInfo_stop;
	}

	public void setConnectInfo_stop(String ConnectInfo_stop) {
		_ConnectInfo_stop = ConnectInfo_stop;
	}

	public long getAcctInputOctets() {
		return _AcctInputOctets;
	}

	public void setAcctInputOctets(long AcctInputOctets) {
		_AcctInputOctets = AcctInputOctets;
	}

	public long getAcctOutputOctets() {
		return _AcctOutputOctets;
	}

	public void setAcctOutputOctets(long AcctOutputOctets) {
		_AcctOutputOctets = AcctOutputOctets;
	}

	public String getCalledStationId() {
		return _CalledStationId;
	}

	public void setCalledStationId(String CalledStationId) {
		_CalledStationId = CalledStationId;
	}

	public String getCallingStationId() {
		return _CallingStationId;
	}

	public void setCallingStationId(String CallingStationId) {
		_CallingStationId = CallingStationId;
	}

	public String getAcctterminateCause() {
		return _AcctterminateCause;
	}

	public void setAcctterminateCause(String AcctterminateCause) {
		_AcctterminateCause = AcctterminateCause;
	}

	public String getServiceTypr() {
		return _ServiceTypr;
	}

	public void setServiceTypr(String ServiceTypr) {
		_ServiceTypr = ServiceTypr;
	}

	public String getFramedProtocol() {
		return _FramedProtocol;
	}

	public void setFramedProtocol(String FramedProtocol) {
		_FramedProtocol = FramedProtocol;
	}

	public String getFramedIPAddress() {
		return _FramedIPAddress;
	}

	public void setFramedIPAddress(String FramedIPAddress) {
		_FramedIPAddress = FramedIPAddress;
	}

	public long getAcctStartDelay() {
		return _AcctStartDelay;
	}

	public void setAcctStartDelay(long AcctStartDelay) {
		_AcctStartDelay = AcctStartDelay;
	}

	public long getAcctStopDelay() {
		return _AcctStopDelay;
	}

	public void setAcctStopDelay(long AcctStopDelay) {
		_AcctStopDelay = AcctStopDelay;
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

	public BaseModel<?> getSAM_radacctRemoteModel() {
		return _sam_radacctRemoteModel;
	}

	public void setSAM_radacctRemoteModel(BaseModel<?> sam_radacctRemoteModel) {
		_sam_radacctRemoteModel = sam_radacctRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			SAM_radacctLocalServiceUtil.addSAM_radacct(this);
		}
		else {
			SAM_radacctLocalServiceUtil.updateSAM_radacct(this);
		}
	}

	@Override
	public SAM_radacct toEscapedModel() {
		return (SAM_radacct)Proxy.newProxyInstance(SAM_radacct.class.getClassLoader(),
			new Class[] { SAM_radacct.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SAM_radacctClp clone = new SAM_radacctClp();

		clone.setRadAcctId(getRadAcctId());
		clone.setRadcheck_id(getRadcheck_id());
		clone.setAcctSessionId(getAcctSessionId());
		clone.setAcctUniqueId(getAcctUniqueId());
		clone.setRealm(getRealm());
		clone.setNASIPAddress(getNASIPAddress());
		clone.setNASPortId(getNASPortId());
		clone.setNASPortType(getNASPortType());
		clone.setAcctStartTime(getAcctStartTime());
		clone.setAcctStopTime(getAcctStopTime());
		clone.setAcctSessionTime(getAcctSessionTime());
		clone.setAcctAuthentic(getAcctAuthentic());
		clone.setConnectInfo_start(getConnectInfo_start());
		clone.setConnectInfo_stop(getConnectInfo_stop());
		clone.setAcctInputOctets(getAcctInputOctets());
		clone.setAcctOutputOctets(getAcctOutputOctets());
		clone.setCalledStationId(getCalledStationId());
		clone.setCallingStationId(getCallingStationId());
		clone.setAcctterminateCause(getAcctterminateCause());
		clone.setServiceTypr(getServiceTypr());
		clone.setFramedProtocol(getFramedProtocol());
		clone.setFramedIPAddress(getFramedIPAddress());
		clone.setAcctStartDelay(getAcctStartDelay());
		clone.setAcctStopDelay(getAcctStopDelay());
		clone.setIsActive(getIsActive());
		clone.setCreated_On(getCreated_On());
		clone.setCreated_By(getCreated_By());
		clone.setUpdated_On(getUpdated_On());
		clone.setUpdated_By(getUpdated_By());

		return clone;
	}

	public int compareTo(SAM_radacct sam_radacct) {
		long primaryKey = sam_radacct.getPrimaryKey();

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

		SAM_radacctClp sam_radacct = null;

		try {
			sam_radacct = (SAM_radacctClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = sam_radacct.getPrimaryKey();

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
		StringBundler sb = new StringBundler(59);

		sb.append("{RadAcctId=");
		sb.append(getRadAcctId());
		sb.append(", radcheck_id=");
		sb.append(getRadcheck_id());
		sb.append(", AcctSessionId=");
		sb.append(getAcctSessionId());
		sb.append(", AcctUniqueId=");
		sb.append(getAcctUniqueId());
		sb.append(", Realm=");
		sb.append(getRealm());
		sb.append(", NASIPAddress=");
		sb.append(getNASIPAddress());
		sb.append(", NASPortId=");
		sb.append(getNASPortId());
		sb.append(", NASPortType=");
		sb.append(getNASPortType());
		sb.append(", AcctStartTime=");
		sb.append(getAcctStartTime());
		sb.append(", AcctStopTime=");
		sb.append(getAcctStopTime());
		sb.append(", AcctSessionTime=");
		sb.append(getAcctSessionTime());
		sb.append(", AcctAuthentic=");
		sb.append(getAcctAuthentic());
		sb.append(", ConnectInfo_start=");
		sb.append(getConnectInfo_start());
		sb.append(", ConnectInfo_stop=");
		sb.append(getConnectInfo_stop());
		sb.append(", AcctInputOctets=");
		sb.append(getAcctInputOctets());
		sb.append(", AcctOutputOctets=");
		sb.append(getAcctOutputOctets());
		sb.append(", CalledStationId=");
		sb.append(getCalledStationId());
		sb.append(", CallingStationId=");
		sb.append(getCallingStationId());
		sb.append(", AcctterminateCause=");
		sb.append(getAcctterminateCause());
		sb.append(", ServiceTypr=");
		sb.append(getServiceTypr());
		sb.append(", FramedProtocol=");
		sb.append(getFramedProtocol());
		sb.append(", FramedIPAddress=");
		sb.append(getFramedIPAddress());
		sb.append(", AcctStartDelay=");
		sb.append(getAcctStartDelay());
		sb.append(", AcctStopDelay=");
		sb.append(getAcctStopDelay());
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
		StringBundler sb = new StringBundler(91);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.SAM_radacct");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>RadAcctId</column-name><column-value><![CDATA[");
		sb.append(getRadAcctId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>radcheck_id</column-name><column-value><![CDATA[");
		sb.append(getRadcheck_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AcctSessionId</column-name><column-value><![CDATA[");
		sb.append(getAcctSessionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AcctUniqueId</column-name><column-value><![CDATA[");
		sb.append(getAcctUniqueId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Realm</column-name><column-value><![CDATA[");
		sb.append(getRealm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NASIPAddress</column-name><column-value><![CDATA[");
		sb.append(getNASIPAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NASPortId</column-name><column-value><![CDATA[");
		sb.append(getNASPortId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NASPortType</column-name><column-value><![CDATA[");
		sb.append(getNASPortType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AcctStartTime</column-name><column-value><![CDATA[");
		sb.append(getAcctStartTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AcctStopTime</column-name><column-value><![CDATA[");
		sb.append(getAcctStopTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AcctSessionTime</column-name><column-value><![CDATA[");
		sb.append(getAcctSessionTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AcctAuthentic</column-name><column-value><![CDATA[");
		sb.append(getAcctAuthentic());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ConnectInfo_start</column-name><column-value><![CDATA[");
		sb.append(getConnectInfo_start());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ConnectInfo_stop</column-name><column-value><![CDATA[");
		sb.append(getConnectInfo_stop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AcctInputOctets</column-name><column-value><![CDATA[");
		sb.append(getAcctInputOctets());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AcctOutputOctets</column-name><column-value><![CDATA[");
		sb.append(getAcctOutputOctets());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CalledStationId</column-name><column-value><![CDATA[");
		sb.append(getCalledStationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CallingStationId</column-name><column-value><![CDATA[");
		sb.append(getCallingStationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AcctterminateCause</column-name><column-value><![CDATA[");
		sb.append(getAcctterminateCause());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ServiceTypr</column-name><column-value><![CDATA[");
		sb.append(getServiceTypr());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FramedProtocol</column-name><column-value><![CDATA[");
		sb.append(getFramedProtocol());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FramedIPAddress</column-name><column-value><![CDATA[");
		sb.append(getFramedIPAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AcctStartDelay</column-name><column-value><![CDATA[");
		sb.append(getAcctStartDelay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AcctStopDelay</column-name><column-value><![CDATA[");
		sb.append(getAcctStopDelay());
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

	private long _RadAcctId;
	private long _radcheck_id;
	private String _AcctSessionId;
	private String _AcctUniqueId;
	private String _Realm;
	private String _NASIPAddress;
	private String _NASPortId;
	private String _NASPortType;
	private Date _AcctStartTime;
	private Date _AcctStopTime;
	private long _AcctSessionTime;
	private String _AcctAuthentic;
	private String _ConnectInfo_start;
	private String _ConnectInfo_stop;
	private long _AcctInputOctets;
	private long _AcctOutputOctets;
	private String _CalledStationId;
	private String _CallingStationId;
	private String _AcctterminateCause;
	private String _ServiceTypr;
	private String _FramedProtocol;
	private String _FramedIPAddress;
	private long _AcctStartDelay;
	private long _AcctStopDelay;
	private int _IsActive;
	private Date _Created_On;
	private String _Created_By;
	private Date _Updated_On;
	private String _Updated_By;
	private BaseModel<?> _sam_radacctRemoteModel;
}