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
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.FacilityUserMappingServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.FacilityUserMappingServiceSoap
 * @generated
 */
public class FacilityUserMappingSoap implements Serializable {
	public static FacilityUserMappingSoap toSoapModel(FacilityUserMapping model) {
		FacilityUserMappingSoap soapModel = new FacilityUserMappingSoap();

		soapModel.setId(model.getId());
		soapModel.setCustomerId(model.getCustomerId());
		soapModel.setFaciltyId(model.getFaciltyId());
		soapModel.setCustomerContactId(model.getCustomerContactId());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setNonPacnetUserId(model.getNonPacnetUserId());
		soapModel.setCreatedOn(model.getCreatedOn());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedOn(model.getUpdatedOn());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static FacilityUserMappingSoap[] toSoapModels(
		FacilityUserMapping[] models) {
		FacilityUserMappingSoap[] soapModels = new FacilityUserMappingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FacilityUserMappingSoap[][] toSoapModels(
		FacilityUserMapping[][] models) {
		FacilityUserMappingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FacilityUserMappingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FacilityUserMappingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FacilityUserMappingSoap[] toSoapModels(
		List<FacilityUserMapping> models) {
		List<FacilityUserMappingSoap> soapModels = new ArrayList<FacilityUserMappingSoap>(models.size());

		for (FacilityUserMapping model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FacilityUserMappingSoap[soapModels.size()]);
	}

	public FacilityUserMappingSoap() {
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

	public long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(long customerId) {
		_customerId = customerId;
	}

	public long getFaciltyId() {
		return _faciltyId;
	}

	public void setFaciltyId(long faciltyId) {
		_faciltyId = faciltyId;
	}

	public long getCustomerContactId() {
		return _customerContactId;
	}

	public void setCustomerContactId(long customerContactId) {
		_customerContactId = customerContactId;
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

	public long getNonPacnetUserId() {
		return _nonPacnetUserId;
	}

	public void setNonPacnetUserId(long nonPacnetUserId) {
		_nonPacnetUserId = nonPacnetUserId;
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
	private long _customerId;
	private long _faciltyId;
	private long _customerContactId;
	private boolean _isActive;
	private long _nonPacnetUserId;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
}