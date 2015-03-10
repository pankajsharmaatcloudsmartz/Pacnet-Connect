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
 * This class is a wrapper for {@link SMARadcheck}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMARadcheck
 * @generated
 */
public class SMARadcheckWrapper implements SMARadcheck,
	ModelWrapper<SMARadcheck> {
	public SMARadcheckWrapper(SMARadcheck smaRadcheck) {
		_smaRadcheck = smaRadcheck;
	}

	public Class<?> getModelClass() {
		return SMARadcheck.class;
	}

	public String getModelClassName() {
		return SMARadcheck.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("username", getUsername());
		attributes.put("attribute", getAttribute());
		attributes.put("op", getOp());
		attributes.put("value", getValue());
		attributes.put("isAdmin", getIsAdmin());
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

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
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

		Integer isAdmin = (Integer)attributes.get("isAdmin");

		if (isAdmin != null) {
			setIsAdmin(isAdmin);
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
	* Returns the primary key of this s m a radcheck.
	*
	* @return the primary key of this s m a radcheck
	*/
	public long getPrimaryKey() {
		return _smaRadcheck.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s m a radcheck.
	*
	* @param primaryKey the primary key of this s m a radcheck
	*/
	public void setPrimaryKey(long primaryKey) {
		_smaRadcheck.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this s m a radcheck.
	*
	* @return the ID of this s m a radcheck
	*/
	public long getId() {
		return _smaRadcheck.getId();
	}

	/**
	* Sets the ID of this s m a radcheck.
	*
	* @param id the ID of this s m a radcheck
	*/
	public void setId(long id) {
		_smaRadcheck.setId(id);
	}

	/**
	* Returns the company ID of this s m a radcheck.
	*
	* @return the company ID of this s m a radcheck
	*/
	public long getCompanyId() {
		return _smaRadcheck.getCompanyId();
	}

	/**
	* Sets the company ID of this s m a radcheck.
	*
	* @param companyId the company ID of this s m a radcheck
	*/
	public void setCompanyId(long companyId) {
		_smaRadcheck.setCompanyId(companyId);
	}

	/**
	* Returns the username of this s m a radcheck.
	*
	* @return the username of this s m a radcheck
	*/
	public java.lang.String getUsername() {
		return _smaRadcheck.getUsername();
	}

	/**
	* Sets the username of this s m a radcheck.
	*
	* @param username the username of this s m a radcheck
	*/
	public void setUsername(java.lang.String username) {
		_smaRadcheck.setUsername(username);
	}

	/**
	* Returns the attribute of this s m a radcheck.
	*
	* @return the attribute of this s m a radcheck
	*/
	public java.lang.String getAttribute() {
		return _smaRadcheck.getAttribute();
	}

	/**
	* Sets the attribute of this s m a radcheck.
	*
	* @param attribute the attribute of this s m a radcheck
	*/
	public void setAttribute(java.lang.String attribute) {
		_smaRadcheck.setAttribute(attribute);
	}

	/**
	* Returns the op of this s m a radcheck.
	*
	* @return the op of this s m a radcheck
	*/
	public java.lang.String getOp() {
		return _smaRadcheck.getOp();
	}

	/**
	* Sets the op of this s m a radcheck.
	*
	* @param op the op of this s m a radcheck
	*/
	public void setOp(java.lang.String op) {
		_smaRadcheck.setOp(op);
	}

	/**
	* Returns the value of this s m a radcheck.
	*
	* @return the value of this s m a radcheck
	*/
	public java.lang.String getValue() {
		return _smaRadcheck.getValue();
	}

	/**
	* Sets the value of this s m a radcheck.
	*
	* @param value the value of this s m a radcheck
	*/
	public void setValue(java.lang.String value) {
		_smaRadcheck.setValue(value);
	}

	/**
	* Returns the is admin of this s m a radcheck.
	*
	* @return the is admin of this s m a radcheck
	*/
	public int getIsAdmin() {
		return _smaRadcheck.getIsAdmin();
	}

	/**
	* Sets the is admin of this s m a radcheck.
	*
	* @param isAdmin the is admin of this s m a radcheck
	*/
	public void setIsAdmin(int isAdmin) {
		_smaRadcheck.setIsAdmin(isAdmin);
	}

	/**
	* Returns the is active of this s m a radcheck.
	*
	* @return the is active of this s m a radcheck
	*/
	public int getIsActive() {
		return _smaRadcheck.getIsActive();
	}

	/**
	* Sets the is active of this s m a radcheck.
	*
	* @param isActive the is active of this s m a radcheck
	*/
	public void setIsActive(int isActive) {
		_smaRadcheck.setIsActive(isActive);
	}

	/**
	* Returns the created on of this s m a radcheck.
	*
	* @return the created on of this s m a radcheck
	*/
	public java.util.Date getCreatedOn() {
		return _smaRadcheck.getCreatedOn();
	}

	/**
	* Sets the created on of this s m a radcheck.
	*
	* @param createdOn the created on of this s m a radcheck
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_smaRadcheck.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this s m a radcheck.
	*
	* @return the created by of this s m a radcheck
	*/
	public java.lang.String getCreatedBy() {
		return _smaRadcheck.getCreatedBy();
	}

	/**
	* Sets the created by of this s m a radcheck.
	*
	* @param createdBy the created by of this s m a radcheck
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_smaRadcheck.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this s m a radcheck.
	*
	* @return the updated on of this s m a radcheck
	*/
	public java.util.Date getUpdatedOn() {
		return _smaRadcheck.getUpdatedOn();
	}

	/**
	* Sets the updated on of this s m a radcheck.
	*
	* @param updatedOn the updated on of this s m a radcheck
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_smaRadcheck.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this s m a radcheck.
	*
	* @return the updated by of this s m a radcheck
	*/
	public java.lang.String getUpdatedBy() {
		return _smaRadcheck.getUpdatedBy();
	}

	/**
	* Sets the updated by of this s m a radcheck.
	*
	* @param updatedBy the updated by of this s m a radcheck
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_smaRadcheck.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _smaRadcheck.isNew();
	}

	public void setNew(boolean n) {
		_smaRadcheck.setNew(n);
	}

	public boolean isCachedModel() {
		return _smaRadcheck.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_smaRadcheck.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _smaRadcheck.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _smaRadcheck.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_smaRadcheck.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _smaRadcheck.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_smaRadcheck.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SMARadcheckWrapper((SMARadcheck)_smaRadcheck.clone());
	}

	public int compareTo(com.pacnet.connect.model.SMARadcheck smaRadcheck) {
		return _smaRadcheck.compareTo(smaRadcheck);
	}

	@Override
	public int hashCode() {
		return _smaRadcheck.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.SMARadcheck> toCacheModel() {
		return _smaRadcheck.toCacheModel();
	}

	public com.pacnet.connect.model.SMARadcheck toEscapedModel() {
		return new SMARadcheckWrapper(_smaRadcheck.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _smaRadcheck.toString();
	}

	public java.lang.String toXmlString() {
		return _smaRadcheck.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_smaRadcheck.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SMARadcheck getWrappedSMARadcheck() {
		return _smaRadcheck;
	}

	public SMARadcheck getWrappedModel() {
		return _smaRadcheck;
	}

	public void resetOriginalValues() {
		_smaRadcheck.resetOriginalValues();
	}

	private SMARadcheck _smaRadcheck;
}