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
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.FacilityAccessServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.FacilityAccessServiceSoap
 * @generated
 */
public class FacilityAccessSoap implements Serializable {
	public static FacilityAccessSoap toSoapModel(FacilityAccess model) {
		FacilityAccessSoap soapModel = new FacilityAccessSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setLabel(model.getLabel());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedOn(model.getCreatedOn());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedOn(model.getUpdatedOn());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static FacilityAccessSoap[] toSoapModels(FacilityAccess[] models) {
		FacilityAccessSoap[] soapModels = new FacilityAccessSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FacilityAccessSoap[][] toSoapModels(FacilityAccess[][] models) {
		FacilityAccessSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FacilityAccessSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FacilityAccessSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FacilityAccessSoap[] toSoapModels(List<FacilityAccess> models) {
		List<FacilityAccessSoap> soapModels = new ArrayList<FacilityAccessSoap>(models.size());

		for (FacilityAccess model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FacilityAccessSoap[soapModels.size()]);
	}

	public FacilityAccessSoap() {
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

	public String getLabel() {
		return _label;
	}

	public void setLabel(String label) {
		_label = label;
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
	private String _name;
	private String _label;
	private boolean _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
}