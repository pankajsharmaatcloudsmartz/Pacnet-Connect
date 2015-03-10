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
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.SMARadacctServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.SMARadacctServiceSoap
 * @generated
 */
public class SMARadacctSoap implements Serializable {
	public static SMARadacctSoap toSoapModel(SMARadacct model) {
		SMARadacctSoap soapModel = new SMARadacctSoap();

		soapModel.setRadAcctId(model.getRadAcctId());
		soapModel.setRadcheckId(model.getRadcheckId());
		soapModel.setAcctSessionId(model.getAcctSessionId());
		soapModel.setRealm(model.getRealm());
		soapModel.setAcctStartTime(model.getAcctStartTime());
		soapModel.setAcctStopTime(model.getAcctStopTime());
		soapModel.setAcctSessionTime(model.getAcctSessionTime());
		soapModel.setAcctterminateCause(model.getAcctterminateCause());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedOn(model.getCreatedOn());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedOn(model.getUpdatedOn());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static SMARadacctSoap[] toSoapModels(SMARadacct[] models) {
		SMARadacctSoap[] soapModels = new SMARadacctSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SMARadacctSoap[][] toSoapModels(SMARadacct[][] models) {
		SMARadacctSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SMARadacctSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SMARadacctSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SMARadacctSoap[] toSoapModels(List<SMARadacct> models) {
		List<SMARadacctSoap> soapModels = new ArrayList<SMARadacctSoap>(models.size());

		for (SMARadacct model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SMARadacctSoap[soapModels.size()]);
	}

	public SMARadacctSoap() {
	}

	public long getPrimaryKey() {
		return _radAcctId;
	}

	public void setPrimaryKey(long pk) {
		setRadAcctId(pk);
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
}