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
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.AccessRequestServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.AccessRequestServiceSoap
 * @generated
 */
public class AccessRequestSoap implements Serializable {
	public static AccessRequestSoap toSoapModel(AccessRequest model) {
		AccessRequestSoap soapModel = new AccessRequestSoap();

		soapModel.setId(model.getId());
		soapModel.setFacilityId(model.getFacilityId());
		soapModel.setCustomerId(model.getCustomerId());
		soapModel.setVisitorId(model.getVisitorId());
		soapModel.setAccessRequestStatusId(model.getAccessRequestStatusId());
		soapModel.setDateOfVisit(model.getDateOfVisit());
		soapModel.setTentativeTimeIn(model.getTentativeTimeIn());
		soapModel.setTentativeTimeOut(model.getTentativeTimeOut());
		soapModel.setNote(model.getNote());
		soapModel.setIsExternalVisitor(model.getIsExternalVisitor());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setOneTimeAccess(model.getOneTimeAccess());
		soapModel.setDateOfVisitGmt(model.getDateOfVisitGmt());
		soapModel.setDateOfTimeOutGmt(model.getDateOfTimeOutGmt());
		soapModel.setCreatedOn(model.getCreatedOn());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedOn(model.getUpdatedOn());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static AccessRequestSoap[] toSoapModels(AccessRequest[] models) {
		AccessRequestSoap[] soapModels = new AccessRequestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AccessRequestSoap[][] toSoapModels(AccessRequest[][] models) {
		AccessRequestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AccessRequestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AccessRequestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AccessRequestSoap[] toSoapModels(List<AccessRequest> models) {
		List<AccessRequestSoap> soapModels = new ArrayList<AccessRequestSoap>(models.size());

		for (AccessRequest model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AccessRequestSoap[soapModels.size()]);
	}

	public AccessRequestSoap() {
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

	public long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(long customerId) {
		_customerId = customerId;
	}

	public long getVisitorId() {
		return _visitorId;
	}

	public void setVisitorId(long visitorId) {
		_visitorId = visitorId;
	}

	public long getAccessRequestStatusId() {
		return _accessRequestStatusId;
	}

	public void setAccessRequestStatusId(long accessRequestStatusId) {
		_accessRequestStatusId = accessRequestStatusId;
	}

	public Date getDateOfVisit() {
		return _dateOfVisit;
	}

	public void setDateOfVisit(Date dateOfVisit) {
		_dateOfVisit = dateOfVisit;
	}

	public long getTentativeTimeIn() {
		return _tentativeTimeIn;
	}

	public void setTentativeTimeIn(long tentativeTimeIn) {
		_tentativeTimeIn = tentativeTimeIn;
	}

	public long getTentativeTimeOut() {
		return _tentativeTimeOut;
	}

	public void setTentativeTimeOut(long tentativeTimeOut) {
		_tentativeTimeOut = tentativeTimeOut;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public boolean getIsExternalVisitor() {
		return _isExternalVisitor;
	}

	public boolean isIsExternalVisitor() {
		return _isExternalVisitor;
	}

	public void setIsExternalVisitor(boolean isExternalVisitor) {
		_isExternalVisitor = isExternalVisitor;
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

	public boolean getOneTimeAccess() {
		return _oneTimeAccess;
	}

	public boolean isOneTimeAccess() {
		return _oneTimeAccess;
	}

	public void setOneTimeAccess(boolean oneTimeAccess) {
		_oneTimeAccess = oneTimeAccess;
	}

	public Date getDateOfVisitGmt() {
		return _dateOfVisitGmt;
	}

	public void setDateOfVisitGmt(Date dateOfVisitGmt) {
		_dateOfVisitGmt = dateOfVisitGmt;
	}

	public Date getDateOfTimeOutGmt() {
		return _dateOfTimeOutGmt;
	}

	public void setDateOfTimeOutGmt(Date dateOfTimeOutGmt) {
		_dateOfTimeOutGmt = dateOfTimeOutGmt;
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
	private long _customerId;
	private long _visitorId;
	private long _accessRequestStatusId;
	private Date _dateOfVisit;
	private long _tentativeTimeIn;
	private long _tentativeTimeOut;
	private String _note;
	private boolean _isExternalVisitor;
	private boolean _isActive;
	private boolean _oneTimeAccess;
	private Date _dateOfVisitGmt;
	private Date _dateOfTimeOutGmt;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
}