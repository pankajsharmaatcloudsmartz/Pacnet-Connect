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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SMACompanies}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMACompanies
 * @generated
 */
public class SMACompaniesWrapper implements SMACompanies,
	ModelWrapper<SMACompanies> {
	public SMACompaniesWrapper(SMACompanies smaCompanies) {
		_smaCompanies = smaCompanies;
	}

	public Class<?> getModelClass() {
		return SMACompanies.class;
	}

	public String getModelClassName() {
		return SMACompanies.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("customerId", getCustomerId());
		attributes.put("companyName", getCompanyName());
		attributes.put("domains", getDomains());
		attributes.put("groupName", getGroupName());
		attributes.put("attribute", getAttribute());
		attributes.put("op", getOp());
		attributes.put("value", getValue());
		attributes.put("maxUser", getMaxUser());
		attributes.put("isActive", getIsActive());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedOn", getUpdatedOn());
		attributes.put("updatedBy", getUpdatedBy());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String domains = (String)attributes.get("domains");

		if (domains != null) {
			setDomains(domains);
		}

		String groupName = (String)attributes.get("groupName");

		if (groupName != null) {
			setGroupName(groupName);
		}

		String attribute = (String)attributes.get("attribute");

		if (attribute != null) {
			setAttribute(attribute);
		}

		String op = (String)attributes.get("op");

		if (op != null) {
			setOp(op);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		Integer maxUser = (Integer)attributes.get("maxUser");

		if (maxUser != null) {
			setMaxUser(maxUser);
		}

		Integer isActive = (Integer)attributes.get("isActive");

		if (isActive != null) {
			setIsActive(isActive);
		}

		Date createdOn = (Date)attributes.get("createdOn");

		if (createdOn != null) {
			setCreatedOn(createdOn);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date updatedOn = (Date)attributes.get("updatedOn");

		if (updatedOn != null) {
			setUpdatedOn(updatedOn);
		}

		String updatedBy = (String)attributes.get("updatedBy");

		if (updatedBy != null) {
			setUpdatedBy(updatedBy);
		}
	}

	/**
	* Returns the primary key of this s m a companies.
	*
	* @return the primary key of this s m a companies
	*/
	public long getPrimaryKey() {
		return _smaCompanies.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s m a companies.
	*
	* @param primaryKey the primary key of this s m a companies
	*/
	public void setPrimaryKey(long primaryKey) {
		_smaCompanies.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this s m a companies.
	*
	* @return the ID of this s m a companies
	*/
	public long getId() {
		return _smaCompanies.getId();
	}

	/**
	* Sets the ID of this s m a companies.
	*
	* @param id the ID of this s m a companies
	*/
	public void setId(long id) {
		_smaCompanies.setId(id);
	}

	/**
	* Returns the customer ID of this s m a companies.
	*
	* @return the customer ID of this s m a companies
	*/
	public long getCustomerId() {
		return _smaCompanies.getCustomerId();
	}

	/**
	* Sets the customer ID of this s m a companies.
	*
	* @param customerId the customer ID of this s m a companies
	*/
	public void setCustomerId(long customerId) {
		_smaCompanies.setCustomerId(customerId);
	}

	/**
	* Returns the company name of this s m a companies.
	*
	* @return the company name of this s m a companies
	*/
	public java.lang.String getCompanyName() {
		return _smaCompanies.getCompanyName();
	}

	/**
	* Sets the company name of this s m a companies.
	*
	* @param companyName the company name of this s m a companies
	*/
	public void setCompanyName(java.lang.String companyName) {
		_smaCompanies.setCompanyName(companyName);
	}

	/**
	* Returns the domains of this s m a companies.
	*
	* @return the domains of this s m a companies
	*/
	public java.lang.String getDomains() {
		return _smaCompanies.getDomains();
	}

	/**
	* Sets the domains of this s m a companies.
	*
	* @param domains the domains of this s m a companies
	*/
	public void setDomains(java.lang.String domains) {
		_smaCompanies.setDomains(domains);
	}

	/**
	* Returns the group name of this s m a companies.
	*
	* @return the group name of this s m a companies
	*/
	public java.lang.String getGroupName() {
		return _smaCompanies.getGroupName();
	}

	/**
	* Sets the group name of this s m a companies.
	*
	* @param groupName the group name of this s m a companies
	*/
	public void setGroupName(java.lang.String groupName) {
		_smaCompanies.setGroupName(groupName);
	}

	/**
	* Returns the attribute of this s m a companies.
	*
	* @return the attribute of this s m a companies
	*/
	public java.lang.String getAttribute() {
		return _smaCompanies.getAttribute();
	}

	/**
	* Sets the attribute of this s m a companies.
	*
	* @param attribute the attribute of this s m a companies
	*/
	public void setAttribute(java.lang.String attribute) {
		_smaCompanies.setAttribute(attribute);
	}

	/**
	* Returns the op of this s m a companies.
	*
	* @return the op of this s m a companies
	*/
	public java.lang.String getOp() {
		return _smaCompanies.getOp();
	}

	/**
	* Sets the op of this s m a companies.
	*
	* @param op the op of this s m a companies
	*/
	public void setOp(java.lang.String op) {
		_smaCompanies.setOp(op);
	}

	/**
	* Returns the value of this s m a companies.
	*
	* @return the value of this s m a companies
	*/
	public java.lang.String getValue() {
		return _smaCompanies.getValue();
	}

	/**
	* Sets the value of this s m a companies.
	*
	* @param value the value of this s m a companies
	*/
	public void setValue(java.lang.String value) {
		_smaCompanies.setValue(value);
	}

	/**
	* Returns the max user of this s m a companies.
	*
	* @return the max user of this s m a companies
	*/
	public int getMaxUser() {
		return _smaCompanies.getMaxUser();
	}

	/**
	* Sets the max user of this s m a companies.
	*
	* @param maxUser the max user of this s m a companies
	*/
	public void setMaxUser(int maxUser) {
		_smaCompanies.setMaxUser(maxUser);
	}

	/**
	* Returns the is active of this s m a companies.
	*
	* @return the is active of this s m a companies
	*/
	public int getIsActive() {
		return _smaCompanies.getIsActive();
	}

	/**
	* Sets the is active of this s m a companies.
	*
	* @param isActive the is active of this s m a companies
	*/
	public void setIsActive(int isActive) {
		_smaCompanies.setIsActive(isActive);
	}

	/**
	* Returns the created on of this s m a companies.
	*
	* @return the created on of this s m a companies
	*/
	public java.util.Date getCreatedOn() {
		return _smaCompanies.getCreatedOn();
	}

	/**
	* Sets the created on of this s m a companies.
	*
	* @param createdOn the created on of this s m a companies
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_smaCompanies.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this s m a companies.
	*
	* @return the created by of this s m a companies
	*/
	public java.lang.String getCreatedBy() {
		return _smaCompanies.getCreatedBy();
	}

	/**
	* Sets the created by of this s m a companies.
	*
	* @param createdBy the created by of this s m a companies
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_smaCompanies.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this s m a companies.
	*
	* @return the updated on of this s m a companies
	*/
	public java.util.Date getUpdatedOn() {
		return _smaCompanies.getUpdatedOn();
	}

	/**
	* Sets the updated on of this s m a companies.
	*
	* @param updatedOn the updated on of this s m a companies
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_smaCompanies.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this s m a companies.
	*
	* @return the updated by of this s m a companies
	*/
	public java.lang.String getUpdatedBy() {
		return _smaCompanies.getUpdatedBy();
	}

	/**
	* Sets the updated by of this s m a companies.
	*
	* @param updatedBy the updated by of this s m a companies
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_smaCompanies.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _smaCompanies.isNew();
	}

	public void setNew(boolean n) {
		_smaCompanies.setNew(n);
	}

	public boolean isCachedModel() {
		return _smaCompanies.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_smaCompanies.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _smaCompanies.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _smaCompanies.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_smaCompanies.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _smaCompanies.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_smaCompanies.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SMACompaniesWrapper((SMACompanies)_smaCompanies.clone());
	}

	public int compareTo(com.pacnet.connect.model.SMACompanies smaCompanies) {
		return _smaCompanies.compareTo(smaCompanies);
	}

	@Override
	public int hashCode() {
		return _smaCompanies.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.SMACompanies> toCacheModel() {
		return _smaCompanies.toCacheModel();
	}

	public com.pacnet.connect.model.SMACompanies toEscapedModel() {
		return new SMACompaniesWrapper(_smaCompanies.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _smaCompanies.toString();
	}

	public java.lang.String toXmlString() {
		return _smaCompanies.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_smaCompanies.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SMACompanies getWrappedSMACompanies() {
		return _smaCompanies;
	}

	public SMACompanies getWrappedModel() {
		return _smaCompanies;
	}

	public void resetOriginalValues() {
		_smaCompanies.resetOriginalValues();
	}

	private SMACompanies _smaCompanies;
}