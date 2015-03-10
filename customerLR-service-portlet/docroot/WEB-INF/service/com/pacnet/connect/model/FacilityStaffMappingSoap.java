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
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.FacilityStaffMappingServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.FacilityStaffMappingServiceSoap
 * @generated
 */
public class FacilityStaffMappingSoap implements Serializable {
	public static FacilityStaffMappingSoap toSoapModel(
		FacilityStaffMapping model) {
		FacilityStaffMappingSoap soapModel = new FacilityStaffMappingSoap();

		soapModel.setId(model.getId());
		soapModel.setFacilityId(model.getFacilityId());
		soapModel.setStaffUserId(model.getStaffUserId());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedOn(model.getCreatedOn());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedOn(model.getUpdatedOn());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static FacilityStaffMappingSoap[] toSoapModels(
		FacilityStaffMapping[] models) {
		FacilityStaffMappingSoap[] soapModels = new FacilityStaffMappingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FacilityStaffMappingSoap[][] toSoapModels(
		FacilityStaffMapping[][] models) {
		FacilityStaffMappingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FacilityStaffMappingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FacilityStaffMappingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FacilityStaffMappingSoap[] toSoapModels(
		List<FacilityStaffMapping> models) {
		List<FacilityStaffMappingSoap> soapModels = new ArrayList<FacilityStaffMappingSoap>(models.size());

		for (FacilityStaffMapping model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FacilityStaffMappingSoap[soapModels.size()]);
	}

	public FacilityStaffMappingSoap() {
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

	public long getFacilityId() {
		return _facilityId;
	}

	public void setFacilityId(long facilityId) {
		_facilityId = facilityId;
	}

	public long getStaffUserId() {
		return _staffUserId;
	}

	public void setStaffUserId(long staffUserId) {
		_staffUserId = staffUserId;
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

	private long _id;
	private long _facilityId;
	private long _staffUserId;
	private boolean _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
}