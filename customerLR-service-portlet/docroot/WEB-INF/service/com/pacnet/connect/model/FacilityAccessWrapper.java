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
 * This class is a wrapper for {@link FacilityAccess}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       FacilityAccess
 * @generated
 */
public class FacilityAccessWrapper implements FacilityAccess,
	ModelWrapper<FacilityAccess> {
	public FacilityAccessWrapper(FacilityAccess facilityAccess) {
		_facilityAccess = facilityAccess;
	}

	public Class<?> getModelClass() {
		return FacilityAccess.class;
	}

	public String getModelClassName() {
		return FacilityAccess.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("label", getLabel());
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

		String label = (String)attributes.get("label");

		if (label != null) {
			setLabel(label);
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
	* Returns the primary key of this facility access.
	*
	* @return the primary key of this facility access
	*/
	public long getPrimaryKey() {
		return _facilityAccess.getPrimaryKey();
	}

	/**
	* Sets the primary key of this facility access.
	*
	* @param primaryKey the primary key of this facility access
	*/
	public void setPrimaryKey(long primaryKey) {
		_facilityAccess.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this facility access.
	*
	* @return the ID of this facility access
	*/
	public long getId() {
		return _facilityAccess.getId();
	}

	/**
	* Sets the ID of this facility access.
	*
	* @param id the ID of this facility access
	*/
	public void setId(long id) {
		_facilityAccess.setId(id);
	}

	/**
	* Returns the name of this facility access.
	*
	* @return the name of this facility access
	*/
	public java.lang.String getName() {
		return _facilityAccess.getName();
	}

	/**
	* Sets the name of this facility access.
	*
	* @param name the name of this facility access
	*/
	public void setName(java.lang.String name) {
		_facilityAccess.setName(name);
	}

	/**
	* Returns the label of this facility access.
	*
	* @return the label of this facility access
	*/
	public java.lang.String getLabel() {
		return _facilityAccess.getLabel();
	}

	/**
	* Sets the label of this facility access.
	*
	* @param label the label of this facility access
	*/
	public void setLabel(java.lang.String label) {
		_facilityAccess.setLabel(label);
	}

	/**
	* Returns the is active of this facility access.
	*
	* @return the is active of this facility access
	*/
	public boolean getIsActive() {
		return _facilityAccess.getIsActive();
	}

	/**
	* Returns <code>true</code> if this facility access is is active.
	*
	* @return <code>true</code> if this facility access is is active; <code>false</code> otherwise
	*/
	public boolean isIsActive() {
		return _facilityAccess.isIsActive();
	}

	/**
	* Sets whether this facility access is is active.
	*
	* @param isActive the is active of this facility access
	*/
	public void setIsActive(boolean isActive) {
		_facilityAccess.setIsActive(isActive);
	}

	/**
	* Returns the created on of this facility access.
	*
	* @return the created on of this facility access
	*/
	public java.util.Date getCreatedOn() {
		return _facilityAccess.getCreatedOn();
	}

	/**
	* Sets the created on of this facility access.
	*
	* @param createdOn the created on of this facility access
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_facilityAccess.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this facility access.
	*
	* @return the created by of this facility access
	*/
	public java.lang.String getCreatedBy() {
		return _facilityAccess.getCreatedBy();
	}

	/**
	* Sets the created by of this facility access.
	*
	* @param createdBy the created by of this facility access
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_facilityAccess.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this facility access.
	*
	* @return the updated on of this facility access
	*/
	public java.util.Date getUpdatedOn() {
		return _facilityAccess.getUpdatedOn();
	}

	/**
	* Sets the updated on of this facility access.
	*
	* @param updatedOn the updated on of this facility access
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_facilityAccess.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this facility access.
	*
	* @return the updated by of this facility access
	*/
	public java.lang.String getUpdatedBy() {
		return _facilityAccess.getUpdatedBy();
	}

	/**
	* Sets the updated by of this facility access.
	*
	* @param updatedBy the updated by of this facility access
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_facilityAccess.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _facilityAccess.isNew();
	}

	public void setNew(boolean n) {
		_facilityAccess.setNew(n);
	}

	public boolean isCachedModel() {
		return _facilityAccess.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_facilityAccess.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _facilityAccess.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _facilityAccess.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_facilityAccess.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _facilityAccess.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_facilityAccess.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FacilityAccessWrapper((FacilityAccess)_facilityAccess.clone());
	}

	public int compareTo(com.pacnet.connect.model.FacilityAccess facilityAccess) {
		return _facilityAccess.compareTo(facilityAccess);
	}

	@Override
	public int hashCode() {
		return _facilityAccess.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.FacilityAccess> toCacheModel() {
		return _facilityAccess.toCacheModel();
	}

	public com.pacnet.connect.model.FacilityAccess toEscapedModel() {
		return new FacilityAccessWrapper(_facilityAccess.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _facilityAccess.toString();
	}

	public java.lang.String toXmlString() {
		return _facilityAccess.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_facilityAccess.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public FacilityAccess getWrappedFacilityAccess() {
		return _facilityAccess;
	}

	public FacilityAccess getWrappedModel() {
		return _facilityAccess;
	}

	public void resetOriginalValues() {
		_facilityAccess.resetOriginalValues();
	}

	private FacilityAccess _facilityAccess;
}