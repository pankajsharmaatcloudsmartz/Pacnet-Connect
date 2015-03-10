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
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.FacilityServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.FacilityServiceSoap
 * @generated
 */
public class FacilitySoap implements Serializable {
	public static FacilitySoap toSoapModel(Facility model) {
		FacilitySoap soapModel = new FacilitySoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setAddress(model.getAddress());
		soapModel.setPhoneNumber(model.getPhoneNumber());
		soapModel.setCity(model.getCity());
		soapModel.setStateId(model.getStateId());
		soapModel.setCountryId(model.getCountryId());
		soapModel.setIsThirdParty(model.getIsThirdParty());
		soapModel.setManagerId(model.getManagerId());
		soapModel.setEscalationEmail(model.getEscalationEmail());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedOn(model.getCreatedOn());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedOn(model.getUpdatedOn());
		soapModel.setUpdatedBy(model.getUpdatedBy());
		soapModel.setTimezone(model.getTimezone());

		return soapModel;
	}

	public static FacilitySoap[] toSoapModels(Facility[] models) {
		FacilitySoap[] soapModels = new FacilitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FacilitySoap[][] toSoapModels(Facility[][] models) {
		FacilitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FacilitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new FacilitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FacilitySoap[] toSoapModels(List<Facility> models) {
		List<FacilitySoap> soapModels = new ArrayList<FacilitySoap>(models.size());

		for (Facility model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FacilitySoap[soapModels.size()]);
	}

	public FacilitySoap() {
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getPhoneNumber() {
		return _phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public long getStateId() {
		return _stateId;
	}

	public void setStateId(long stateId) {
		_stateId = stateId;
	}

	public long getCountryId() {
		return _countryId;
	}

	public void setCountryId(long countryId) {
		_countryId = countryId;
	}

	public int getIsThirdParty() {
		return _isThirdParty;
	}

	public void setIsThirdParty(int isThirdParty) {
		_isThirdParty = isThirdParty;
	}

	public long getManagerId() {
		return _managerId;
	}

	public void setManagerId(long managerId) {
		_managerId = managerId;
	}

	public String getEscalationEmail() {
		return _escalationEmail;
	}

	public void setEscalationEmail(String escalationEmail) {
		_escalationEmail = escalationEmail;
	}

	public boolean getIsActive() {
		return _isActive;
	}

	public boolean isIsActive() {
		return _isActive;
	}

	public void setIsActive(boolean isActive) {
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

	public String getTimezone() {
		return _timezone;
	}

	public void setTimezone(String timezone) {
		_timezone = timezone;
	}

	private long _id;
	private String _name;
	private String _address;
	private String _phoneNumber;
	private String _city;
	private long _stateId;
	private long _countryId;
	private int _isThirdParty;
	private long _managerId;
	private String _escalationEmail;
	private boolean _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
	private String _timezone;
}