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
 * This class is a wrapper for {@link SAM_Companies}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SAM_Companies
 * @generated
 */
public class SAM_CompaniesWrapper implements SAM_Companies,
	ModelWrapper<SAM_Companies> {
	public SAM_CompaniesWrapper(SAM_Companies sam_Companies) {
		_sam_Companies = sam_Companies;
	}

	public Class<?> getModelClass() {
		return SAM_Companies.class;
	}

	public String getModelClassName() {
		return SAM_Companies.class.getName();
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
	* Returns the primary key of this s a m_ companies.
	*
	* @return the primary key of this s a m_ companies
	*/
	public long getPrimaryKey() {
		return _sam_Companies.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s a m_ companies.
	*
	* @param primaryKey the primary key of this s a m_ companies
	*/
	public void setPrimaryKey(long primaryKey) {
		_sam_Companies.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this s a m_ companies.
	*
	* @return the ID of this s a m_ companies
	*/
	public long getId() {
		return _sam_Companies.getId();
	}

	/**
	* Sets the ID of this s a m_ companies.
	*
	* @param id the ID of this s a m_ companies
	*/
	public void setId(long id) {
		_sam_Companies.setId(id);
	}

	/**
	* Returns the customer_id of this s a m_ companies.
	*
	* @return the customer_id of this s a m_ companies
	*/
	public long getCustomer_id() {
		return _sam_Companies.getCustomer_id();
	}

	/**
	* Sets the customer_id of this s a m_ companies.
	*
	* @param customer_id the customer_id of this s a m_ companies
	*/
	public void setCustomer_id(long customer_id) {
		_sam_Companies.setCustomer_id(customer_id);
	}

	/**
	* Returns the company name of this s a m_ companies.
	*
	* @return the company name of this s a m_ companies
	*/
	public java.lang.String getCompanyName() {
		return _sam_Companies.getCompanyName();
	}

	/**
	* Sets the company name of this s a m_ companies.
	*
	* @param companyName the company name of this s a m_ companies
	*/
	public void setCompanyName(java.lang.String companyName) {
		_sam_Companies.setCompanyName(companyName);
	}

	/**
	* Returns the domains of this s a m_ companies.
	*
	* @return the domains of this s a m_ companies
	*/
	public java.lang.String getDomains() {
		return _sam_Companies.getDomains();
	}

	/**
	* Sets the domains of this s a m_ companies.
	*
	* @param domains the domains of this s a m_ companies
	*/
	public void setDomains(java.lang.String domains) {
		_sam_Companies.setDomains(domains);
	}

	/**
	* Returns the groupname of this s a m_ companies.
	*
	* @return the groupname of this s a m_ companies
	*/
	public java.lang.String getGroupname() {
		return _sam_Companies.getGroupname();
	}

	/**
	* Sets the groupname of this s a m_ companies.
	*
	* @param groupname the groupname of this s a m_ companies
	*/
	public void setGroupname(java.lang.String groupname) {
		_sam_Companies.setGroupname(groupname);
	}

	/**
	* Returns the attribute of this s a m_ companies.
	*
	* @return the attribute of this s a m_ companies
	*/
	public java.lang.String getAttribute() {
		return _sam_Companies.getAttribute();
	}

	/**
	* Sets the attribute of this s a m_ companies.
	*
	* @param attribute the attribute of this s a m_ companies
	*/
	public void setAttribute(java.lang.String attribute) {
		_sam_Companies.setAttribute(attribute);
	}

	/**
	* Returns the op of this s a m_ companies.
	*
	* @return the op of this s a m_ companies
	*/
	public java.lang.String getOp() {
		return _sam_Companies.getOp();
	}

	/**
	* Sets the op of this s a m_ companies.
	*
	* @param op the op of this s a m_ companies
	*/
	public void setOp(java.lang.String op) {
		_sam_Companies.setOp(op);
	}

	/**
	* Returns the value of this s a m_ companies.
	*
	* @return the value of this s a m_ companies
	*/
	public java.lang.String getValue() {
		return _sam_Companies.getValue();
	}

	/**
	* Sets the value of this s a m_ companies.
	*
	* @param value the value of this s a m_ companies
	*/
	public void setValue(java.lang.String value) {
		_sam_Companies.setValue(value);
	}

	/**
	* Returns the max user of this s a m_ companies.
	*
	* @return the max user of this s a m_ companies
	*/
	public int getMaxUser() {
		return _sam_Companies.getMaxUser();
	}

	/**
	* Sets the max user of this s a m_ companies.
	*
	* @param maxUser the max user of this s a m_ companies
	*/
	public void setMaxUser(int maxUser) {
		_sam_Companies.setMaxUser(maxUser);
	}

	/**
	* Returns the is active of this s a m_ companies.
	*
	* @return the is active of this s a m_ companies
	*/
	public int getIsActive() {
		return _sam_Companies.getIsActive();
	}

	/**
	* Sets the is active of this s a m_ companies.
	*
	* @param IsActive the is active of this s a m_ companies
	*/
	public void setIsActive(int IsActive) {
		_sam_Companies.setIsActive(IsActive);
	}

	/**
	* Returns the created_ on of this s a m_ companies.
	*
	* @return the created_ on of this s a m_ companies
	*/
	public java.util.Date getCreated_On() {
		return _sam_Companies.getCreated_On();
	}

	/**
	* Sets the created_ on of this s a m_ companies.
	*
	* @param Created_On the created_ on of this s a m_ companies
	*/
	public void setCreated_On(java.util.Date Created_On) {
		_sam_Companies.setCreated_On(Created_On);
	}

	/**
	* Returns the created_ by of this s a m_ companies.
	*
	* @return the created_ by of this s a m_ companies
	*/
	public java.lang.String getCreated_By() {
		return _sam_Companies.getCreated_By();
	}

	/**
	* Sets the created_ by of this s a m_ companies.
	*
	* @param Created_By the created_ by of this s a m_ companies
	*/
	public void setCreated_By(java.lang.String Created_By) {
		_sam_Companies.setCreated_By(Created_By);
	}

	/**
	* Returns the updated_ on of this s a m_ companies.
	*
	* @return the updated_ on of this s a m_ companies
	*/
	public java.util.Date getUpdated_On() {
		return _sam_Companies.getUpdated_On();
	}

	/**
	* Sets the updated_ on of this s a m_ companies.
	*
	* @param Updated_On the updated_ on of this s a m_ companies
	*/
	public void setUpdated_On(java.util.Date Updated_On) {
		_sam_Companies.setUpdated_On(Updated_On);
	}

	/**
	* Returns the updated_ by of this s a m_ companies.
	*
	* @return the updated_ by of this s a m_ companies
	*/
	public java.lang.String getUpdated_By() {
		return _sam_Companies.getUpdated_By();
	}

	/**
	* Sets the updated_ by of this s a m_ companies.
	*
	* @param Updated_By the updated_ by of this s a m_ companies
	*/
	public void setUpdated_By(java.lang.String Updated_By) {
		_sam_Companies.setUpdated_By(Updated_By);
	}

	public boolean isNew() {
		return _sam_Companies.isNew();
	}

	public void setNew(boolean n) {
		_sam_Companies.setNew(n);
	}

	public boolean isCachedModel() {
		return _sam_Companies.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_sam_Companies.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _sam_Companies.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _sam_Companies.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sam_Companies.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sam_Companies.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sam_Companies.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SAM_CompaniesWrapper((SAM_Companies)_sam_Companies.clone());
	}

	public int compareTo(SAM_Companies sam_Companies) {
		return _sam_Companies.compareTo(sam_Companies);
	}

	@Override
	public int hashCode() {
		return _sam_Companies.hashCode();
	}

	public com.liferay.portal.model.CacheModel<SAM_Companies> toCacheModel() {
		return _sam_Companies.toCacheModel();
	}

	public SAM_Companies toEscapedModel() {
		return new SAM_CompaniesWrapper(_sam_Companies.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sam_Companies.toString();
	}

	public java.lang.String toXmlString() {
		return _sam_Companies.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sam_Companies.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SAM_Companies getWrappedSAM_Companies() {
		return _sam_Companies;
	}

	public SAM_Companies getWrappedModel() {
		return _sam_Companies;
	}

	public void resetOriginalValues() {
		_sam_Companies.resetOriginalValues();
	}

	private SAM_Companies _sam_Companies;
}