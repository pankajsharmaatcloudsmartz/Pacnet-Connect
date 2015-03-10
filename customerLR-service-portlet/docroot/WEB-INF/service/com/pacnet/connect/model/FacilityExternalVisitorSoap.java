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
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.FacilityExternalVisitorServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.FacilityExternalVisitorServiceSoap
 * @generated
 */
public class FacilityExternalVisitorSoap implements Serializable {
	public static FacilityExternalVisitorSoap toSoapModel(
		FacilityExternalVisitor model) {
		FacilityExternalVisitorSoap soapModel = new FacilityExternalVisitorSoap();

		soapModel.setId(model.getId());
		soapModel.setFacilityId(model.getFacilityId());
		soapModel.setAccessRequestId(model.getAccessRequestId());
		soapModel.setName(model.getName());
		soapModel.setMobileNumber(model.getMobileNumber());
		soapModel.setEmail(model.getEmail());
		soapModel.setAddress(model.getAddress());
		soapModel.setCompanyName(model.getCompanyName());
		soapModel.setDocumentType(model.getDocumentType());
		soapModel.setDocumentId(model.getDocumentId());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedOn(model.getCreatedOn());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedOn(model.getUpdatedOn());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static FacilityExternalVisitorSoap[] toSoapModels(
		FacilityExternalVisitor[] models) {
		FacilityExternalVisitorSoap[] soapModels = new FacilityExternalVisitorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FacilityExternalVisitorSoap[][] toSoapModels(
		FacilityExternalVisitor[][] models) {
		FacilityExternalVisitorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FacilityExternalVisitorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FacilityExternalVisitorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FacilityExternalVisitorSoap[] toSoapModels(
		List<FacilityExternalVisitor> models) {
		List<FacilityExternalVisitorSoap> soapModels = new ArrayList<FacilityExternalVisitorSoap>(models.size());

		for (FacilityExternalVisitor model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FacilityExternalVisitorSoap[soapModels.size()]);
	}

	public FacilityExternalVisitorSoap() {
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

	public long getAccessRequestId() {
		return _accessRequestId;
	}

	public void setAccessRequestId(long accessRequestId) {
		_accessRequestId = accessRequestId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getMobileNumber() {
		return _mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		_mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getCompanyName() {
		return _companyName;
	}

	public void setCompanyName(String companyName) {
		_companyName = companyName;
	}

	public String getDocumentType() {
		return _documentType;
	}

	public void setDocumentType(String documentType) {
		_documentType = documentType;
	}

	public String getDocumentId() {
		return _documentId;
	}

	public void setDocumentId(String documentId) {
		_documentId = documentId;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
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
	private long _accessRequestId;
	private String _name;
	private String _mobileNumber;
	private String _email;
	private String _address;
	private String _companyName;
	private String _documentType;
	private String _documentId;
	private String _remarks;
	private boolean _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
}