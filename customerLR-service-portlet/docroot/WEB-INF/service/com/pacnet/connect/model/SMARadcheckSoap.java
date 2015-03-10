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
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.SMARadcheckServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.SMARadcheckServiceSoap
 * @generated
 */
public class SMARadcheckSoap implements Serializable {
	public static SMARadcheckSoap toSoapModel(SMARadcheck model) {
		SMARadcheckSoap soapModel = new SMARadcheckSoap();

		soapModel.setId(model.getId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUsername(model.getUsername());
		soapModel.setAttribute(model.getAttribute());
		soapModel.setOp(model.getOp());
		soapModel.setValue(model.getValue());
		soapModel.setIsAdmin(model.getIsAdmin());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedOn(model.getCreatedOn());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedOn(model.getUpdatedOn());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static SMARadcheckSoap[] toSoapModels(SMARadcheck[] models) {
		SMARadcheckSoap[] soapModels = new SMARadcheckSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SMARadcheckSoap[][] toSoapModels(SMARadcheck[][] models) {
		SMARadcheckSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SMARadcheckSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SMARadcheckSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SMARadcheckSoap[] toSoapModels(List<SMARadcheck> models) {
		List<SMARadcheckSoap> soapModels = new ArrayList<SMARadcheckSoap>(models.size());

		for (SMARadcheck model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SMARadcheckSoap[soapModels.size()]);
	}

	public SMARadcheckSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public String getUsername() {
		return _username;
	}

	public void setUsername(String username) {
		_username = username;
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

	public int getIsAdmin() {
		return _isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		_isAdmin = isAdmin;
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

	private long _id;
	private long _companyId;
	private String _username;
	private String _attribute;
	private String _op;
	private String _value;
	private int _isAdmin;
	private int _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
}