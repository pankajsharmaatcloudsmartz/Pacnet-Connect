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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.SMACompanyListServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.SMACompanyListServiceSoap
 * @generated
 */
public class SMACompanyListSoap implements Serializable {
	public static SMACompanyListSoap toSoapModel(SMACompanyList model) {
		SMACompanyListSoap soapModel = new SMACompanyListSoap();

		soapModel.setId(model.getId());
		soapModel.setAdminUserId(model.getAdminUserId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCustomerId(model.getCustomerId());
		soapModel.setDomains(model.getDomains());

		return soapModel;
	}

	public static SMACompanyListSoap[] toSoapModels(SMACompanyList[] models) {
		SMACompanyListSoap[] soapModels = new SMACompanyListSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SMACompanyListSoap[][] toSoapModels(SMACompanyList[][] models) {
		SMACompanyListSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SMACompanyListSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SMACompanyListSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SMACompanyListSoap[] toSoapModels(List<SMACompanyList> models) {
		List<SMACompanyListSoap> soapModels = new ArrayList<SMACompanyListSoap>(models.size());

		for (SMACompanyList model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SMACompanyListSoap[soapModels.size()]);
	}

	public SMACompanyListSoap() {
	}

	public String getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(String pk) {
		setId(pk);
	}

	public String getId() {
		return _id;
	}

	public void setId(String id) {
		_id = id;
	}

	public long getAdminUserId() {
		return _adminUserId;
	}

	public void setAdminUserId(long adminUserId) {
		_adminUserId = adminUserId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(long customerId) {
		_customerId = customerId;
	}

	public String getDomains() {
		return _domains;
	}

	public void setDomains(String domains) {
		_domains = domains;
	}

	private String _id;
	private long _adminUserId;
	private long _companyId;
	private long _customerId;
	private String _domains;
}