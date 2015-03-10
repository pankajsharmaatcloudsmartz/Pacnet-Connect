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
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.AccessRequestNoteHistoryServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.AccessRequestNoteHistoryServiceSoap
 * @generated
 */
public class AccessRequestNoteHistorySoap implements Serializable {
	public static AccessRequestNoteHistorySoap toSoapModel(
		AccessRequestNoteHistory model) {
		AccessRequestNoteHistorySoap soapModel = new AccessRequestNoteHistorySoap();

		soapModel.setId(model.getId());
		soapModel.setAccessRequestId(model.getAccessRequestId());
		soapModel.setCustomerId(model.getCustomerId());
		soapModel.setNote(model.getNote());
		soapModel.setTableName(model.getTableName());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedOn(model.getCreatedOn());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedOn(model.getUpdatedOn());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static AccessRequestNoteHistorySoap[] toSoapModels(
		AccessRequestNoteHistory[] models) {
		AccessRequestNoteHistorySoap[] soapModels = new AccessRequestNoteHistorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AccessRequestNoteHistorySoap[][] toSoapModels(
		AccessRequestNoteHistory[][] models) {
		AccessRequestNoteHistorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AccessRequestNoteHistorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new AccessRequestNoteHistorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AccessRequestNoteHistorySoap[] toSoapModels(
		List<AccessRequestNoteHistory> models) {
		List<AccessRequestNoteHistorySoap> soapModels = new ArrayList<AccessRequestNoteHistorySoap>(models.size());

		for (AccessRequestNoteHistory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AccessRequestNoteHistorySoap[soapModels.size()]);
	}

	public AccessRequestNoteHistorySoap() {
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

	public long getAccessRequestId() {
		return _accessRequestId;
	}

	public void setAccessRequestId(long accessRequestId) {
		_accessRequestId = accessRequestId;
	}

	public long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(long customerId) {
		_customerId = customerId;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public String getTableName() {
		return _tableName;
	}

	public void setTableName(String tableName) {
		_tableName = tableName;
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
	private long _accessRequestId;
	private long _customerId;
	private String _note;
	private String _tableName;
	private boolean _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
}