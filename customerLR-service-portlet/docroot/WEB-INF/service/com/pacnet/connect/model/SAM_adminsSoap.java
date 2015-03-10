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
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.SAM_adminsServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.SAM_adminsServiceSoap
 * @generated
 */
public class SAM_adminsSoap implements Serializable {
	public static SAM_adminsSoap toSoapModel(SAM_admins model) {
		SAM_adminsSoap soapModel = new SAM_adminsSoap();

		soapModel.setId(model.getId());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setRadcheck_id(model.getRadcheck_id());
		soapModel.setCompany_id(model.getCompany_id());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreated_On(model.getCreated_On());
		soapModel.setCreated_By(model.getCreated_By());
		soapModel.setUpdated_On(model.getUpdated_On());
		soapModel.setUpdated_By(model.getUpdated_By());

		return soapModel;
	}

	public static SAM_adminsSoap[] toSoapModels(SAM_admins[] models) {
		SAM_adminsSoap[] soapModels = new SAM_adminsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SAM_adminsSoap[][] toSoapModels(SAM_admins[][] models) {
		SAM_adminsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SAM_adminsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SAM_adminsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SAM_adminsSoap[] toSoapModels(List<SAM_admins> models) {
		List<SAM_adminsSoap> soapModels = new ArrayList<SAM_adminsSoap>(models.size());

		for (SAM_admins model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SAM_adminsSoap[soapModels.size()]);
	}

	public SAM_adminsSoap() {
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

	public long getUser_id() {
		return _user_id;
	}

	public void setUser_id(long user_id) {
		_user_id = user_id;
	}

	public long getRadcheck_id() {
		return _radcheck_id;
	}

	public void setRadcheck_id(long radcheck_id) {
		_radcheck_id = radcheck_id;
	}

	public long getCompany_id() {
		return _company_id;
	}

	public void setCompany_id(long company_id) {
		_company_id = company_id;
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
	private long _user_id;
	private long _radcheck_id;
	private long _company_id;
	private int _IsActive;
	private Date _Created_On;
	private String _Created_By;
	private Date _Updated_On;
	private String _Updated_By;
}