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
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.SAM_CompaniesServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.SAM_CompaniesServiceSoap
 * @generated
 */
public class SAM_CompaniesSoap implements Serializable {
	public static SAM_CompaniesSoap toSoapModel(SAM_Companies model) {
		SAM_CompaniesSoap soapModel = new SAM_CompaniesSoap();

		soapModel.setId(model.getId());
		soapModel.setCustomer_id(model.getCustomer_id());
		soapModel.setCompanyName(model.getCompanyName());
		soapModel.setDomains(model.getDomains());
		soapModel.setGroupname(model.getGroupname());
		soapModel.setAttribute(model.getAttribute());
		soapModel.setOp(model.getOp());
		soapModel.setValue(model.getValue());
		soapModel.setMaxUser(model.getMaxUser());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreated_On(model.getCreated_On());
		soapModel.setCreated_By(model.getCreated_By());
		soapModel.setUpdated_On(model.getUpdated_On());
		soapModel.setUpdated_By(model.getUpdated_By());

		return soapModel;
	}

	public static SAM_CompaniesSoap[] toSoapModels(SAM_Companies[] models) {
		SAM_CompaniesSoap[] soapModels = new SAM_CompaniesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SAM_CompaniesSoap[][] toSoapModels(SAM_Companies[][] models) {
		SAM_CompaniesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SAM_CompaniesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SAM_CompaniesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SAM_CompaniesSoap[] toSoapModels(List<SAM_Companies> models) {
		List<SAM_CompaniesSoap> soapModels = new ArrayList<SAM_CompaniesSoap>(models.size());

		for (SAM_Companies model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SAM_CompaniesSoap[soapModels.size()]);
	}

	public SAM_CompaniesSoap() {
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

	public long getCustomer_id() {
		return _customer_id;
	}

	public void setCustomer_id(long customer_id) {
		_customer_id = customer_id;
	}

	public String getCompanyName() {
		return _companyName;
	}

	public void setCompanyName(String companyName) {
		_companyName = companyName;
	}

	public String getDomains() {
		return _domains;
	}

	public void setDomains(String domains) {
		_domains = domains;
	}

	public String getGroupname() {
		return _groupname;
	}

	public void setGroupname(String groupname) {
		_groupname = groupname;
	}

	public String getAttribute() {
		return _attribute;
	}

	public void setAttribute(String attribute) {
		_attribute = attribute;
	}

	public String getOp() {
		return _op;
	}

	public void setOp(String op) {
		_op = op;
	}

	public String getValue() {
		return _value;
	}

	public void setValue(String value) {
		_value = value;
	}

	public int getMaxUser() {
		return _maxUser;
	}

	public void setMaxUser(int maxUser) {
		_maxUser = maxUser;
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
	private long _customer_id;
	private String _companyName;
	private String _domains;
	private String _groupname;
	private String _attribute;
	private String _op;
	private String _value;
	private int _maxUser;
	private int _IsActive;
	private Date _Created_On;
	private String _Created_By;
	private Date _Updated_On;
	private String _Updated_By;
}