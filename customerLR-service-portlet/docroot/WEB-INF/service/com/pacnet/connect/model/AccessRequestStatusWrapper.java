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
 * This class is a wrapper for {@link AccessRequestStatus}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       AccessRequestStatus
 * @generated
 */
public class AccessRequestStatusWrapper implements AccessRequestStatus,
	ModelWrapper<AccessRequestStatus> {
	public AccessRequestStatusWrapper(AccessRequestStatus accessRequestStatus) {
		_accessRequestStatus = accessRequestStatus;
	}

	public Class<?> getModelClass() {
		return AccessRequestStatus.class;
	}

	public String getModelClassName() {
		return AccessRequestStatus.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long description = (Long)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Boolean isActive = (Boolean)attributes.get("isActive");

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
	* Returns the primary key of this access request status.
	*
	* @return the primary key of this access request status
	*/
	public long getPrimaryKey() {
		return _accessRequestStatus.getPrimaryKey();
	}

	/**
	* Sets the primary key of this access request status.
	*
	* @param primaryKey the primary key of this access request status
	*/
	public void setPrimaryKey(long primaryKey) {
		_accessRequestStatus.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this access request status.
	*
	* @return the ID of this access request status
	*/
	public long getId() {
		return _accessRequestStatus.getId();
	}

	/**
	* Sets the ID of this access request status.
	*
	* @param id the ID of this access request status
	*/
	public void setId(long id) {
		_accessRequestStatus.setId(id);
	}

	/**
	* Returns the name of this access request status.
	*
	* @return the name of this access request status
	*/
	public java.lang.String getName() {
		return _accessRequestStatus.getName();
	}

	/**
	* Sets the name of this access request status.
	*
	* @param name the name of this access request status
	*/
	public void setName(java.lang.String name) {
		_accessRequestStatus.setName(name);
	}

	/**
	* Returns the description of this access request status.
	*
	* @return the description of this access request status
	*/
	public long getDescription() {
		return _accessRequestStatus.getDescription();
	}

	/**
	* Sets the description of this access request status.
	*
	* @param description the description of this access request status
	*/
	public void setDescription(long description) {
		_accessRequestStatus.setDescription(description);
	}

	/**
	* Returns the is active of this access request status.
	*
	* @return the is active of this access request status
	*/
	public boolean getIsActive() {
		return _accessRequestStatus.getIsActive();
	}

	/**
	* Returns <code>true</code> if this access request status is is active.
	*
	* @return <code>true</code> if this access request status is is active; <code>false</code> otherwise
	*/
	public boolean isIsActive() {
		return _accessRequestStatus.isIsActive();
	}

	/**
	* Sets whether this access request status is is active.
	*
	* @param isActive the is active of this access request status
	*/
	public void setIsActive(boolean isActive) {
		_accessRequestStatus.setIsActive(isActive);
	}

	/**
	* Returns the created on of this access request status.
	*
	* @return the created on of this access request status
	*/
	public java.util.Date getCreatedOn() {
		return _accessRequestStatus.getCreatedOn();
	}

	/**
	* Sets the created on of this access request status.
	*
	* @param createdOn the created on of this access request status
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_accessRequestStatus.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this access request status.
	*
	* @return the created by of this access request status
	*/
	public java.lang.String getCreatedBy() {
		return _accessRequestStatus.getCreatedBy();
	}

	/**
	* Sets the created by of this access request status.
	*
	* @param createdBy the created by of this access request status
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_accessRequestStatus.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this access request status.
	*
	* @return the updated on of this access request status
	*/
	public java.util.Date getUpdatedOn() {
		return _accessRequestStatus.getUpdatedOn();
	}

	/**
	* Sets the updated on of this access request status.
	*
	* @param updatedOn the updated on of this access request status
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_accessRequestStatus.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this access request status.
	*
	* @return the updated by of this access request status
	*/
	public java.lang.String getUpdatedBy() {
		return _accessRequestStatus.getUpdatedBy();
	}

	/**
	* Sets the updated by of this access request status.
	*
	* @param updatedBy the updated by of this access request status
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_accessRequestStatus.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _accessRequestStatus.isNew();
	}

	public void setNew(boolean n) {
		_accessRequestStatus.setNew(n);
	}

	public boolean isCachedModel() {
		return _accessRequestStatus.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_accessRequestStatus.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _accessRequestStatus.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _accessRequestStatus.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_accessRequestStatus.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _accessRequestStatus.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_accessRequestStatus.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AccessRequestStatusWrapper((AccessRequestStatus)_accessRequestStatus.clone());
	}

	public int compareTo(
		com.pacnet.connect.model.AccessRequestStatus accessRequestStatus) {
		return _accessRequestStatus.compareTo(accessRequestStatus);
	}

	@Override
	public int hashCode() {
		return _accessRequestStatus.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.AccessRequestStatus> toCacheModel() {
		return _accessRequestStatus.toCacheModel();
	}

	public com.pacnet.connect.model.AccessRequestStatus toEscapedModel() {
		return new AccessRequestStatusWrapper(_accessRequestStatus.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _accessRequestStatus.toString();
	}

	public java.lang.String toXmlString() {
		return _accessRequestStatus.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_accessRequestStatus.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public AccessRequestStatus getWrappedAccessRequestStatus() {
		return _accessRequestStatus;
	}

	public AccessRequestStatus getWrappedModel() {
		return _accessRequestStatus;
	}

	public void resetOriginalValues() {
		_accessRequestStatus.resetOriginalValues();
	}

	private AccessRequestStatus _accessRequestStatus;
}