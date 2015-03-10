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

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SMACompanyList}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMACompanyList
 * @generated
 */
public class SMACompanyListWrapper implements SMACompanyList,
	ModelWrapper<SMACompanyList> {
	public SMACompanyListWrapper(SMACompanyList smaCompanyList) {
		_smaCompanyList = smaCompanyList;
	}

	public Class<?> getModelClass() {
		return SMACompanyList.class;
	}

	public String getModelClassName() {
		return SMACompanyList.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("adminUserId", getAdminUserId());
		attributes.put("companyId", getCompanyId());
		attributes.put("customerId", getCustomerId());
		attributes.put("domains", getDomains());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		String id = (String)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long adminUserId = (Long)attributes.get("adminUserId");

		if (adminUserId != null) {
			setAdminUserId(adminUserId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		String domains = (String)attributes.get("domains");

		if (domains != null) {
			setDomains(domains);
		}
	}

	/**
	* Returns the primary key of this s m a company list.
	*
	* @return the primary key of this s m a company list
	*/
	public java.lang.String getPrimaryKey() {
		return _smaCompanyList.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s m a company list.
	*
	* @param primaryKey the primary key of this s m a company list
	*/
	public void setPrimaryKey(java.lang.String primaryKey) {
		_smaCompanyList.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this s m a company list.
	*
	* @return the ID of this s m a company list
	*/
	public java.lang.String getId() {
		return _smaCompanyList.getId();
	}

	/**
	* Sets the ID of this s m a company list.
	*
	* @param id the ID of this s m a company list
	*/
	public void setId(java.lang.String id) {
		_smaCompanyList.setId(id);
	}

	/**
	* Returns the admin user ID of this s m a company list.
	*
	* @return the admin user ID of this s m a company list
	*/
	public long getAdminUserId() {
		return _smaCompanyList.getAdminUserId();
	}

	/**
	* Sets the admin user ID of this s m a company list.
	*
	* @param adminUserId the admin user ID of this s m a company list
	*/
	public void setAdminUserId(long adminUserId) {
		_smaCompanyList.setAdminUserId(adminUserId);
	}

	/**
	* Returns the admin user uuid of this s m a company list.
	*
	* @return the admin user uuid of this s m a company list
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getAdminUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaCompanyList.getAdminUserUuid();
	}

	/**
	* Sets the admin user uuid of this s m a company list.
	*
	* @param adminUserUuid the admin user uuid of this s m a company list
	*/
	public void setAdminUserUuid(java.lang.String adminUserUuid) {
		_smaCompanyList.setAdminUserUuid(adminUserUuid);
	}

	/**
	* Returns the company ID of this s m a company list.
	*
	* @return the company ID of this s m a company list
	*/
	public long getCompanyId() {
		return _smaCompanyList.getCompanyId();
	}

	/**
	* Sets the company ID of this s m a company list.
	*
	* @param companyId the company ID of this s m a company list
	*/
	public void setCompanyId(long companyId) {
		_smaCompanyList.setCompanyId(companyId);
	}

	/**
	* Returns the customer ID of this s m a company list.
	*
	* @return the customer ID of this s m a company list
	*/
	public long getCustomerId() {
		return _smaCompanyList.getCustomerId();
	}

	/**
	* Sets the customer ID of this s m a company list.
	*
	* @param customerId the customer ID of this s m a company list
	*/
	public void setCustomerId(long customerId) {
		_smaCompanyList.setCustomerId(customerId);
	}

	/**
	* Returns the domains of this s m a company list.
	*
	* @return the domains of this s m a company list
	*/
	public java.lang.String getDomains() {
		return _smaCompanyList.getDomains();
	}

	/**
	* Sets the domains of this s m a company list.
	*
	* @param domains the domains of this s m a company list
	*/
	public void setDomains(java.lang.String domains) {
		_smaCompanyList.setDomains(domains);
	}

	public boolean isNew() {
		return _smaCompanyList.isNew();
	}

	public void setNew(boolean n) {
		_smaCompanyList.setNew(n);
	}

	public boolean isCachedModel() {
		return _smaCompanyList.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_smaCompanyList.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _smaCompanyList.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _smaCompanyList.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_smaCompanyList.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _smaCompanyList.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_smaCompanyList.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SMACompanyListWrapper((SMACompanyList)_smaCompanyList.clone());
	}

	public int compareTo(com.pacnet.connect.model.SMACompanyList smaCompanyList) {
		return _smaCompanyList.compareTo(smaCompanyList);
	}

	@Override
	public int hashCode() {
		return _smaCompanyList.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.SMACompanyList> toCacheModel() {
		return _smaCompanyList.toCacheModel();
	}

	public com.pacnet.connect.model.SMACompanyList toEscapedModel() {
		return new SMACompanyListWrapper(_smaCompanyList.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _smaCompanyList.toString();
	}

	public java.lang.String toXmlString() {
		return _smaCompanyList.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_smaCompanyList.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SMACompanyList getWrappedSMACompanyList() {
		return _smaCompanyList;
	}

	public SMACompanyList getWrappedModel() {
		return _smaCompanyList;
	}

	public void resetOriginalValues() {
		_smaCompanyList.resetOriginalValues();
	}

	private SMACompanyList _smaCompanyList;
}