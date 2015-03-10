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
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.SMA_reservationServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.SMA_reservationServiceSoap
 * @generated
 */
public class SMA_reservationSoap implements Serializable {
	public static SMA_reservationSoap toSoapModel(SMA_reservation model) {
		SMA_reservationSoap soapModel = new SMA_reservationSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setOwner(model.getOwner());
		soapModel.setProvision(model.getProvision());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreated_On(model.getCreated_On());
		soapModel.setCreated_By(model.getCreated_By());
		soapModel.setUpdated_On(model.getUpdated_On());
		soapModel.setUpdated_By(model.getUpdated_By());

		return soapModel;
	}

	public static SMA_reservationSoap[] toSoapModels(SMA_reservation[] models) {
		SMA_reservationSoap[] soapModels = new SMA_reservationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SMA_reservationSoap[][] toSoapModels(
		SMA_reservation[][] models) {
		SMA_reservationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SMA_reservationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SMA_reservationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SMA_reservationSoap[] toSoapModels(
		List<SMA_reservation> models) {
		List<SMA_reservationSoap> soapModels = new ArrayList<SMA_reservationSoap>(models.size());

		for (SMA_reservation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SMA_reservationSoap[soapModels.size()]);
	}

	public SMA_reservationSoap() {
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

	public Date getStartDate() {
		return _startDate;
	}

	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	public String getOwner() {
		return _owner;
	}

	public void setOwner(String owner) {
		_owner = owner;
	}

	public int getProvision() {
		return _provision;
	}

	public void setProvision(int provision) {
		_provision = provision;
	}

	public int getIsActive() {
		return _IsActive;
	}

	public void setIsActive(int IsActive) {
		_IsActive = IsActive;
	}

	public Date getCreated_On() {
		return _Created_On;
	}

	public void setCreated_On(Date Created_On) {
		_Created_On = Created_On;
	}

	public String getCreated_By() {
		return _Created_By;
	}

	public void setCreated_By(String Created_By) {
		_Created_By = Created_By;
	}

	public Date getUpdated_On() {
		return _Updated_On;
	}

	public void setUpdated_On(Date Updated_On) {
		_Updated_On = Updated_On;
	}

	public String getUpdated_By() {
		return _Updated_By;
	}

	public void setUpdated_By(String Updated_By) {
		_Updated_By = Updated_By;
	}

	private long _id;
	private String _name;
	private Date _startDate;
	private Date _endDate;
	private String _owner;
	private int _provision;
	private int _IsActive;
	private Date _Created_On;
	private String _Created_By;
	private Date _Updated_On;
	private String _Updated_By;
}