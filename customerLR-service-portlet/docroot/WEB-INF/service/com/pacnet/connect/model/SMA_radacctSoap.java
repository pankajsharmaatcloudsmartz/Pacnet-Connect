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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.SMA_radacctServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.SMA_radacctServiceSoap
 * @generated
 */
public class SMA_radacctSoap implements Serializable {
	public static SMA_radacctSoap toSoapModel(SMA_radacct model) {
		SMA_radacctSoap soapModel = new SMA_radacctSoap();

		soapModel.setRadAcctId(model.getRadAcctId());
		soapModel.setRadcheck_id(model.getRadcheck_id());
		soapModel.setAcctSessionId(model.getAcctSessionId());
		soapModel.setAcctUniqueId(model.getAcctUniqueId());
		soapModel.setRealm(model.getRealm());
		soapModel.setNASIPAddress(model.getNASIPAddress());
		soapModel.setNASPortId(model.getNASPortId());
		soapModel.setNASPortType(model.getNASPortType());
		soapModel.setAcctStartTime(model.getAcctStartTime());
		soapModel.setAcctStopTime(model.getAcctStopTime());
		soapModel.setAcctSessionTime(model.getAcctSessionTime());
		soapModel.setAcctAuthentic(model.getAcctAuthentic());
		soapModel.setConnectInfo_start(model.getConnectInfo_start());
		soapModel.setConnectInfo_stop(model.getConnectInfo_stop());
		soapModel.setAcctInputOctets(model.getAcctInputOctets());
		soapModel.setAcctOutputOctets(model.getAcctOutputOctets());
		soapModel.setCalledStationId(model.getCalledStationId());
		soapModel.setCallingStationId(model.getCallingStationId());
		soapModel.setAcctterminateCause(model.getAcctterminateCause());
		soapModel.setServiceTypr(model.getServiceTypr());
		soapModel.setFramedProtocol(model.getFramedProtocol());
		soapModel.setFramedIPAddress(model.getFramedIPAddress());
		soapModel.setAcctStartDelay(model.getAcctStartDelay());
		soapModel.setAcctStopDelay(model.getAcctStopDelay());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreated_On(model.getCreated_On());
		soapModel.setCreated_By(model.getCreated_By());
		soapModel.setUpdated_On(model.getUpdated_On());
		soapModel.setUpdated_By(model.getUpdated_By());

		return soapModel;
	}

	public static SMA_radacctSoap[] toSoapModels(SMA_radacct[] models) {
		SMA_radacctSoap[] soapModels = new SMA_radacctSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SMA_radacctSoap[][] toSoapModels(SMA_radacct[][] models) {
		SMA_radacctSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SMA_radacctSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SMA_radacctSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SMA_radacctSoap[] toSoapModels(List<SMA_radacct> models) {
		List<SMA_radacctSoap> soapModels = new ArrayList<SMA_radacctSoap>(models.size());

		for (SMA_radacct model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SMA_radacctSoap[soapModels.size()]);
	}

	public SMA_radacctSoap() {
	}

	public long getPrimaryKey() {
		return _RadAcctId;
	}

	public void setPrimaryKey(long pk) {
		setRadAcctId(pk);
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
}