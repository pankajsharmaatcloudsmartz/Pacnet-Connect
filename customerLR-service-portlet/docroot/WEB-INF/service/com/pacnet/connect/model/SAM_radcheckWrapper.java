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
 * This class is a wrapper for {@link SAM_radcheck}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SAM_radcheck
 * @generated
 */
public class SAM_radcheckWrapper implements SAM_radcheck,
	ModelWrapper<SAM_radcheck> {
	public SAM_radcheckWrapper(SAM_radcheck sam_radcheck) {
		_sam_radcheck = sam_radcheck;
	}

	public Class<?> getModelClass() {
		return SAM_radcheck.class;
	}

	public String getModelClassName() {
		return SAM_radcheck.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("company_id", getCompany_id());
		attributes.put("username", getUsername());
		attributes.put("attribute", getAttribute());
		attributes.put("op", getOp());
		attributes.put("value", getValue());
		attributes.put("IsAdmin", getIsAdmin());
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

		Long company_id = (Long)attributes.get("company_id");

		if (company_id != null) {
			setCompany_id(company_id);
		}

		String username = (String)attributes.get("username");

		if (username != null) {
			setUsername(username);
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

		Integer IsAdmin = (Integer)attributes.get("IsAdmin");

		if (IsAdmin != null) {
			setIsAdmin(IsAdmin);
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
	* Returns the primary key of this s a m_radcheck.
	*
	* @return the primary key of this s a m_radcheck
	*/
	public long getPrimaryKey() {
		return _sam_radcheck.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s a m_radcheck.
	*
	* @param primaryKey the primary key of this s a m_radcheck
	*/
	public void setPrimaryKey(long primaryKey) {
		_sam_radcheck.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this s a m_radcheck.
	*
	* @return the ID of this s a m_radcheck
	*/
	public long getId() {
		return _sam_radcheck.getId();
	}

	/**
	* Sets the ID of this s a m_radcheck.
	*
	* @param id the ID of this s a m_radcheck
	*/
	public void setId(long id) {
		_sam_radcheck.setId(id);
	}

	/**
	* Returns the company_id of this s a m_radcheck.
	*
	* @return the company_id of this s a m_radcheck
	*/
	public long getCompany_id() {
		return _sam_radcheck.getCompany_id();
	}

	/**
	* Sets the company_id of this s a m_radcheck.
	*
	* @param company_id the company_id of this s a m_radcheck
	*/
	public void setCompany_id(long company_id) {
		_sam_radcheck.setCompany_id(company_id);
	}

	/**
	* Returns the username of this s a m_radcheck.
	*
	* @return the username of this s a m_radcheck
	*/
	public java.lang.String getUsername() {
		return _sam_radcheck.getUsername();
	}

	/**
	* Sets the username of this s a m_radcheck.
	*
	* @param username the username of this s a m_radcheck
	*/
	public void setUsername(java.lang.String username) {
		_sam_radcheck.setUsername(username);
	}

	/**
	* Returns the attribute of this s a m_radcheck.
	*
	* @return the attribute of this s a m_radcheck
	*/
	public java.lang.String getAttribute() {
		return _sam_radcheck.getAttribute();
	}

	/**
	* Sets the attribute of this s a m_radcheck.
	*
	* @param attribute the attribute of this s a m_radcheck
	*/
	public void setAttribute(java.lang.String attribute) {
		_sam_radcheck.setAttribute(attribute);
	}

	/**
	* Returns the op of this s a m_radcheck.
	*
	* @return the op of this s a m_radcheck
	*/
	public java.lang.String getOp() {
		return _sam_radcheck.getOp();
	}

	/**
	* Sets the op of this s a m_radcheck.
	*
	* @param op the op of this s a m_radcheck
	*/
	public void setOp(java.lang.String op) {
		_sam_radcheck.setOp(op);
	}

	/**
	* Returns the value of this s a m_radcheck.
	*
	* @return the value of this s a m_radcheck
	*/
	public java.lang.String getValue() {
		return _sam_radcheck.getValue();
	}

	/**
	* Sets the value of this s a m_radcheck.
	*
	* @param value the value of this s a m_radcheck
	*/
	public void setValue(java.lang.String value) {
		_sam_radcheck.setValue(value);
	}

	/**
	* Returns the is admin of this s a m_radcheck.
	*
	* @return the is admin of this s a m_radcheck
	*/
	public int getIsAdmin() {
		return _sam_radcheck.getIsAdmin();
	}

	/**
	* Sets the is admin of this s a m_radcheck.
	*
	* @param IsAdmin the is admin of this s a m_radcheck
	*/
	public void setIsAdmin(int IsAdmin) {
		_sam_radcheck.setIsAdmin(IsAdmin);
	}

	/**
	* Returns the is active of this s a m_radcheck.
	*
	* @return the is active of this s a m_radcheck
	*/
	public int getIsActive() {
		return _sam_radcheck.getIsActive();
	}

	/**
	* Sets the is active of this s a m_radcheck.
	*
	* @param IsActive the is active of this s a m_radcheck
	*/
	public void setIsActive(int IsActive) {
		_sam_radcheck.setIsActive(IsActive);
	}

	/**
	* Returns the created_ on of this s a m_radcheck.
	*
	* @return the created_ on of this s a m_radcheck
	*/
	public java.util.Date getCreated_On() {
		return _sam_radcheck.getCreated_On();
	}

	/**
	* Sets the created_ on of this s a m_radcheck.
	*
	* @param Created_On the created_ on of this s a m_radcheck
	*/
	public void setCreated_On(java.util.Date Created_On) {
		_sam_radcheck.setCreated_On(Created_On);
	}

	/**
	* Returns the created_ by of this s a m_radcheck.
	*
	* @return the created_ by of this s a m_radcheck
	*/
	public java.lang.String getCreated_By() {
		return _sam_radcheck.getCreated_By();
	}

	/**
	* Sets the created_ by of this s a m_radcheck.
	*
	* @param Created_By the created_ by of this s a m_radcheck
	*/
	public void setCreated_By(java.lang.String Created_By) {
		_sam_radcheck.setCreated_By(Created_By);
	}

	/**
	* Returns the updated_ on of this s a m_radcheck.
	*
	* @return the updated_ on of this s a m_radcheck
	*/
	public java.util.Date getUpdated_On() {
		return _sam_radcheck.getUpdated_On();
	}

	/**
	* Sets the updated_ on of this s a m_radcheck.
	*
	* @param Updated_On the updated_ on of this s a m_radcheck
	*/
	public void setUpdated_On(java.util.Date Updated_On) {
		_sam_radcheck.setUpdated_On(Updated_On);
	}

	/**
	* Returns the updated_ by of this s a m_radcheck.
	*
	* @return the updated_ by of this s a m_radcheck
	*/
	public java.lang.String getUpdated_By() {
		return _sam_radcheck.getUpdated_By();
	}

	/**
	* Sets the updated_ by of this s a m_radcheck.
	*
	* @param Updated_By the updated_ by of this s a m_radcheck
	*/
	public void setUpdated_By(java.lang.String Updated_By) {
		_sam_radcheck.setUpdated_By(Updated_By);
	}

	public boolean isNew() {
		return _sam_radcheck.isNew();
	}

	public void setNew(boolean n) {
		_sam_radcheck.setNew(n);
	}

	public boolean isCachedModel() {
		return _sam_radcheck.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_sam_radcheck.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _sam_radcheck.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _sam_radcheck.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sam_radcheck.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sam_radcheck.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sam_radcheck.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SAM_radcheckWrapper((SAM_radcheck)_sam_radcheck.clone());
	}

	public int compareTo(SAM_radcheck sam_radcheck) {
		return _sam_radcheck.compareTo(sam_radcheck);
	}

	@Override
	public int hashCode() {
		return _sam_radcheck.hashCode();
	}

	public com.liferay.portal.model.CacheModel<SAM_radcheck> toCacheModel() {
		return _sam_radcheck.toCacheModel();
	}

	public SAM_radcheck toEscapedModel() {
		return new SAM_radcheckWrapper(_sam_radcheck.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sam_radcheck.toString();
	}

	public java.lang.String toXmlString() {
		return _sam_radcheck.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sam_radcheck.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SAM_radcheck getWrappedSAM_radcheck() {
		return _sam_radcheck;
	}

	public SAM_radcheck getWrappedModel() {
		return _sam_radcheck;
	}

	public void resetOriginalValues() {
		_sam_radcheck.resetOriginalValues();
	}

	private SAM_radcheck _sam_radcheck;
}