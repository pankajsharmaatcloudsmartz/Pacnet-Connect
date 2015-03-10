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
 * This class is a wrapper for {@link SMA_Companies}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMA_Companies
 * @generated
 */
public class SMA_CompaniesWrapper implements SMA_Companies,
	ModelWrapper<SMA_Companies> {
	public SMA_CompaniesWrapper(SMA_Companies sma_Companies) {
		_sma_Companies = sma_Companies;
	}

	public Class<?> getModelClass() {
		return SMA_Companies.class;
	}

	public String getModelClassName() {
		return SMA_Companies.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("customer_id", getCustomer_id());
		attributes.put("companyName", getCompanyName());
		attributes.put("domains", getDomains());
		attributes.put("groupname", getGroupname());
		attributes.put("attribute", getAttribute());
		attributes.put("op", getOp());
		attributes.put("value", getValue());
		attributes.put("maxUser", getMaxUser());
		attributes.put("IsActive", getIsActive());
		attributes.put("Created_On", getCreated_On());
		attributes.put("Created_By", getCreated_By());
		attributes.put("Updated_On", getUpdated_On());
		attributes.put("Updated_By", getUpdated_By());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long customer_id = (Long)attributes.get("customer_id");

		if (customer_id != null) {
			setCustomer_id(customer_id);
		}

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String domains = (String)attributes.get("domains");

		if (domains != null) {
			setDomains(domains);
		}

		String groupname = (String)attributes.get("groupname");

		if (groupname != null) {
			setGroupname(groupname);
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

		Integer IsActive = (Integer)attributes.get("IsActive");

		if (IsActive != null) {
			setIsActive(IsActive);
		}

		Date Created_On = (Date)attributes.get("Created_On");

		if (Created_On != null) {
			setCreated_On(Created_On);
		}

		String Created_By = (String)attributes.get("Created_By");

		if (Created_By != null) {
			setCreated_By(Created_By);
		}

		Date Updated_On = (Date)attributes.get("Updated_On");

		if (Updated_On != null) {
			setUpdated_On(Updated_On);
		}

		String Updated_By = (String)attributes.get("Updated_By");

		if (Updated_By != null) {
			setUpdated_By(Updated_By);
		}
	}

	/**
	* Returns the primary key of this s m a_ companies.
	*
	* @return the primary key of this s m a_ companies
	*/
	public long getPrimaryKey() {
		return _sma_Companies.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s m a_ companies.
	*
	* @param primaryKey the primary key of this s m a_ companies
	*/
	public void setPrimaryKey(long primaryKey) {
		_sma_Companies.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this s m a_ companies.
	*
	* @return the ID of this s m a_ companies
	*/
	public long getId() {
		return _sma_Companies.getId();
	}

	/**
	* Sets the ID of this s m a_ companies.
	*
	* @param id the ID of this s m a_ companies
	*/
	public void setId(long id) {
		_sma_Companies.setId(id);
	}

	/**
	* Returns the customer_id of this s m a_ companies.
	*
	* @return the customer_id of this s m a_ companies
	*/
	public long getCustomer_id() {
		return _sma_Companies.getCustomer_id();
	}

	/**
	* Sets the customer_id of this s m a_ companies.
	*
	* @param customer_id the customer_id of this s m a_ companies
	*/
	public void setCustomer_id(long customer_id) {
		_sma_Companies.setCustomer_id(customer_id);
	}

	/**
	* Returns the company name of this s m a_ companies.
	*
	* @return the company name of this s m a_ companies
	*/
	public java.lang.String getCompanyName() {
		return _sma_Companies.getCompanyName();
	}

	/**
	* Sets the company name of this s m a_ companies.
	*
	* @param companyName the company name of this s m a_ companies
	*/
	public void setCompanyName(java.lang.String companyName) {
		_sma_Companies.setCompanyName(companyName);
	}

	/**
	* Returns the domains of this s m a_ companies.
	*
	* @return the domains of this s m a_ companies
	*/
	public java.lang.String getDomains() {
		return _sma_Companies.getDomains();
	}

	/**
	* Sets the domains of this s m a_ companies.
	*
	* @param domains the domains of this s m a_ companies
	*/
	public void setDomains(java.lang.String domains) {
		_sma_Companies.setDomains(domains);
	}

	/**
	* Returns the groupname of this s m a_ companies.
	*
	* @return the groupname of this s m a_ companies
	*/
	public java.lang.String getGroupname() {
		return _sma_Companies.getGroupname();
	}

	/**
	* Sets the groupname of this s m a_ companies.
	*
	* @param groupname the groupname of this s m a_ companies
	*/
	public void setGroupname(java.lang.String groupname) {
		_sma_Companies.setGroupname(groupname);
	}

	/**
	* Returns the attribute of this s m a_ companies.
	*
	* @return the attribute of this s m a_ companies
	*/
	public java.lang.String getAttribute() {
		return _sma_Companies.getAttribute();
	}

	/**
	* Sets the attribute of this s m a_ companies.
	*
	* @param attribute the attribute of this s m a_ companies
	*/
	public void setAttribute(java.lang.String attribute) {
		_sma_Companies.setAttribute(attribute);
	}

	/**
	* Returns the op of this s m a_ companies.
	*
	* @return the op of this s m a_ companies
	*/
	public java.lang.String getOp() {
		return _sma_Companies.getOp();
	}

	/**
	* Sets the op of this s m a_ companies.
	*
	* @param op the op of this s m a_ companies
	*/
	public void setOp(java.lang.String op) {
		_sma_Companies.setOp(op);
	}

	/**
	* Returns the value of this s m a_ companies.
	*
	* @return the value of this s m a_ companies
	*/
	public java.lang.String getValue() {
		return _sma_Companies.getValue();
	}

	/**
	* Sets the value of this s m a_ companies.
	*
	* @param value the value of this s m a_ companies
	*/
	public void setValue(java.lang.String value) {
		_sma_Companies.setValue(value);
	}

	/**
	* Returns the max user of this s m a_ companies.
	*
	* @return the max user of this s m a_ companies
	*/
	public int getMaxUser() {
		return _sma_Companies.getMaxUser();
	}

	/**
	* Sets the max user of this s m a_ companies.
	*
	* @param maxUser the max user of this s m a_ companies
	*/
	public void setMaxUser(int maxUser) {
		_sma_Companies.setMaxUser(maxUser);
	}

	/**
	* Returns the is active of this s m a_ companies.
	*
	* @return the is active of this s m a_ companies
	*/
	public int getIsActive() {
		return _sma_Companies.getIsActive();
	}

	/**
	* Sets the is active of this s m a_ companies.
	*
	* @param IsActive the is active of this s m a_ companies
	*/
	public void setIsActive(int IsActive) {
		_sma_Companies.setIsActive(IsActive);
	}

	/**
	* Returns the created_ on of this s m a_ companies.
	*
	* @return the created_ on of this s m a_ companies
	*/
	public java.util.Date getCreated_On() {
		return _sma_Companies.getCreated_On();
	}

	/**
	* Sets the created_ on of this s m a_ companies.
	*
	* @param Created_On the created_ on of this s m a_ companies
	*/
	public void setCreated_On(java.util.Date Created_On) {
		_sma_Companies.setCreated_On(Created_On);
	}

	/**
	* Returns the created_ by of this s m a_ companies.
	*
	* @return the created_ by of this s m a_ companies
	*/
	public java.lang.String getCreated_By() {
		return _sma_Companies.getCreated_By();
	}

	/**
	* Sets the created_ by of this s m a_ companies.
	*
	* @param Created_By the created_ by of this s m a_ companies
	*/
	public void setCreated_By(java.lang.String Created_By) {
		_sma_Companies.setCreated_By(Created_By);
	}

	/**
	* Returns the updated_ on of this s m a_ companies.
	*
	* @return the updated_ on of this s m a_ companies
	*/
	public java.util.Date getUpdated_On() {
		return _sma_Companies.getUpdated_On();
	}

	/**
	* Sets the updated_ on of this s m a_ companies.
	*
	* @param Updated_On the updated_ on of this s m a_ companies
	*/
	public void setUpdated_On(java.util.Date Updated_On) {
		_sma_Companies.setUpdated_On(Updated_On);
	}

	/**
	* Returns the updated_ by of this s m a_ companies.
	*
	* @return the updated_ by of this s m a_ companies
	*/
	public java.lang.String getUpdated_By() {
		return _sma_Companies.getUpdated_By();
	}

	/**
	* Sets the updated_ by of this s m a_ companies.
	*
	* @param Updated_By the updated_ by of this s m a_ companies
	*/
	public void setUpdated_By(java.lang.String Updated_By) {
		_sma_Companies.setUpdated_By(Updated_By);
	}

	public boolean isNew() {
		return _sma_Companies.isNew();
	}

	public void setNew(boolean n) {
		_sma_Companies.setNew(n);
	}

	public boolean isCachedModel() {
		return _sma_Companies.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_sma_Companies.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _sma_Companies.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _sma_Companies.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sma_Companies.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sma_Companies.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sma_Companies.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SMA_CompaniesWrapper((SMA_Companies)_sma_Companies.clone());
	}

	public int compareTo(com.pacnet.connect.model.SMA_Companies sma_Companies) {
		return _sma_Companies.compareTo(sma_Companies);
	}

	@Override
	public int hashCode() {
		return _sma_Companies.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.SMA_Companies> toCacheModel() {
		return _sma_Companies.toCacheModel();
	}

	public com.pacnet.connect.model.SMA_Companies toEscapedModel() {
		return new SMA_CompaniesWrapper(_sma_Companies.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sma_Companies.toString();
	}

	public java.lang.String toXmlString() {
		return _sma_Companies.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sma_Companies.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SMA_Companies getWrappedSMA_Companies() {
		return _sma_Companies;
	}

	public SMA_Companies getWrappedModel() {
		return _sma_Companies;
	}

	public void resetOriginalValues() {
		_sma_Companies.resetOriginalValues();
	}

	private SMA_Companies _sma_Companies;
}