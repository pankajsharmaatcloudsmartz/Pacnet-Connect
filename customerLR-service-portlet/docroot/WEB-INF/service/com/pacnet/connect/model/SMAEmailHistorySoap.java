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
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.SMAEmailHistoryServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.SMAEmailHistoryServiceSoap
 * @generated
 */
public class SMAEmailHistorySoap implements Serializable {
	public static SMAEmailHistorySoap toSoapModel(SMAEmailHistory model) {
		SMAEmailHistorySoap soapModel = new SMAEmailHistorySoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setHistoryType(model.getHistoryType());
		soapModel.setEmailFrom(model.getEmailFrom());
		soapModel.setEmailTo(model.getEmailTo());
		soapModel.setEmailTitle(model.getEmailTitle());
		soapModel.setEmailContent(model.getEmailContent());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedOn(model.getCreatedOn());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedOn(model.getUpdatedOn());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static SMAEmailHistorySoap[] toSoapModels(SMAEmailHistory[] models) {
		SMAEmailHistorySoap[] soapModels = new SMAEmailHistorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SMAEmailHistorySoap[][] toSoapModels(
		SMAEmailHistory[][] models) {
		SMAEmailHistorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SMAEmailHistorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new SMAEmailHistorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SMAEmailHistorySoap[] toSoapModels(
		List<SMAEmailHistory> models) {
		List<SMAEmailHistorySoap> soapModels = new ArrayList<SMAEmailHistorySoap>(models.size());

		for (SMAEmailHistory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SMAEmailHistorySoap[soapModels.size()]);
	}

	public SMAEmailHistorySoap() {
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

	public int getHistoryType() {
		return _historyType;
	}

	public void setHistoryType(int historyType) {
		_historyType = historyType;
	}

	public String getEmailFrom() {
		return _emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		_emailFrom = emailFrom;
	}

	public String getEmailTo() {
		return _emailTo;
	}

	public void setEmailTo(String emailTo) {
		_emailTo = emailTo;
	}

	public String getEmailTitle() {
		return _emailTitle;
	}

	public void setEmailTitle(String emailTitle) {
		_emailTitle = emailTitle;
	}

	public String getEmailContent() {
		return _emailContent;
	}

	public void setEmailContent(String emailContent) {
		_emailContent = emailContent;
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
	private String _name;
	private int _historyType;
	private String _emailFrom;
	private String _emailTo;
	private String _emailTitle;
	private String _emailContent;
	private int _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
}