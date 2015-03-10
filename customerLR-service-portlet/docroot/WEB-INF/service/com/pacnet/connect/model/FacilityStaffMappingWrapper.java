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
 * This class is a wrapper for {@link FacilityStaffMapping}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       FacilityStaffMapping
 * @generated
 */
public class FacilityStaffMappingWrapper implements FacilityStaffMapping,
	ModelWrapper<FacilityStaffMapping> {
	public FacilityStaffMappingWrapper(
		FacilityStaffMapping facilityStaffMapping) {
		_facilityStaffMapping = facilityStaffMapping;
	}

	public Class<?> getModelClass() {
		return FacilityStaffMapping.class;
	}

	public String getModelClassName() {
		return FacilityStaffMapping.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("facilityId", getFacilityId());
		attributes.put("staffUserId", getStaffUserId());
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

		Long facilityId = (Long)attributes.get("facilityId");

		if (facilityId != null) {
			setFacilityId(facilityId);
		}

		Long staffUserId = (Long)attributes.get("staffUserId");

		if (staffUserId != null) {
			setStaffUserId(staffUserId);
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
	* Returns the primary key of this facility staff mapping.
	*
	* @return the primary key of this facility staff mapping
	*/
	public long getPrimaryKey() {
		return _facilityStaffMapping.getPrimaryKey();
	}

	/**
	* Sets the primary key of this facility staff mapping.
	*
	* @param primaryKey the primary key of this facility staff mapping
	*/
	public void setPrimaryKey(long primaryKey) {
		_facilityStaffMapping.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this facility staff mapping.
	*
	* @return the ID of this facility staff mapping
	*/
	public long getId() {
		return _facilityStaffMapping.getId();
	}

	/**
	* Sets the ID of this facility staff mapping.
	*
	* @param id the ID of this facility staff mapping
	*/
	public void setId(long id) {
		_facilityStaffMapping.setId(id);
	}

	/**
	* Returns the facility ID of this facility staff mapping.
	*
	* @return the facility ID of this facility staff mapping
	*/
	public long getFacilityId() {
		return _facilityStaffMapping.getFacilityId();
	}

	/**
	* Sets the facility ID of this facility staff mapping.
	*
	* @param facilityId the facility ID of this facility staff mapping
	*/
	public void setFacilityId(long facilityId) {
		_facilityStaffMapping.setFacilityId(facilityId);
	}

	/**
	* Returns the staff user ID of this facility staff mapping.
	*
	* @return the staff user ID of this facility staff mapping
	*/
	public long getStaffUserId() {
		return _facilityStaffMapping.getStaffUserId();
	}

	/**
	* Sets the staff user ID of this facility staff mapping.
	*
	* @param staffUserId the staff user ID of this facility staff mapping
	*/
	public void setStaffUserId(long staffUserId) {
		_facilityStaffMapping.setStaffUserId(staffUserId);
	}

	/**
	* Returns the staff user uuid of this facility staff mapping.
	*
	* @return the staff user uuid of this facility staff mapping
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getStaffUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMapping.getStaffUserUuid();
	}

	/**
	* Sets the staff user uuid of this facility staff mapping.
	*
	* @param staffUserUuid the staff user uuid of this facility staff mapping
	*/
	public void setStaffUserUuid(java.lang.String staffUserUuid) {
		_facilityStaffMapping.setStaffUserUuid(staffUserUuid);
	}

	/**
	* Returns the is active of this facility staff mapping.
	*
	* @return the is active of this facility staff mapping
	*/
	public boolean getIsActive() {
		return _facilityStaffMapping.getIsActive();
	}

	/**
	* Returns <code>true</code> if this facility staff mapping is is active.
	*
	* @return <code>true</code> if this facility staff mapping is is active; <code>false</code> otherwise
	*/
	public boolean isIsActive() {
		return _facilityStaffMapping.isIsActive();
	}

	/**
	* Sets whether this facility staff mapping is is active.
	*
	* @param isActive the is active of this facility staff mapping
	*/
	public void setIsActive(boolean isActive) {
		_facilityStaffMapping.setIsActive(isActive);
	}

	/**
	* Returns the created on of this facility staff mapping.
	*
	* @return the created on of this facility staff mapping
	*/
	public java.util.Date getCreatedOn() {
		return _facilityStaffMapping.getCreatedOn();
	}

	/**
	* Sets the created on of this facility staff mapping.
	*
	* @param createdOn the created on of this facility staff mapping
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_facilityStaffMapping.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this facility staff mapping.
	*
	* @return the created by of this facility staff mapping
	*/
	public java.lang.String getCreatedBy() {
		return _facilityStaffMapping.getCreatedBy();
	}

	/**
	* Sets the created by of this facility staff mapping.
	*
	* @param createdBy the created by of this facility staff mapping
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_facilityStaffMapping.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this facility staff mapping.
	*
	* @return the updated on of this facility staff mapping
	*/
	public java.util.Date getUpdatedOn() {
		return _facilityStaffMapping.getUpdatedOn();
	}

	/**
	* Sets the updated on of this facility staff mapping.
	*
	* @param updatedOn the updated on of this facility staff mapping
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_facilityStaffMapping.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this facility staff mapping.
	*
	* @return the updated by of this facility staff mapping
	*/
	public java.lang.String getUpdatedBy() {
		return _facilityStaffMapping.getUpdatedBy();
	}

	/**
	* Sets the updated by of this facility staff mapping.
	*
	* @param updatedBy the updated by of this facility staff mapping
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_facilityStaffMapping.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _facilityStaffMapping.isNew();
	}

	public void setNew(boolean n) {
		_facilityStaffMapping.setNew(n);
	}

	public boolean isCachedModel() {
		return _facilityStaffMapping.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_facilityStaffMapping.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _facilityStaffMapping.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _facilityStaffMapping.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_facilityStaffMapping.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _facilityStaffMapping.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_facilityStaffMapping.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FacilityStaffMappingWrapper((FacilityStaffMapping)_facilityStaffMapping.clone());
	}

	public int compareTo(
		com.pacnet.connect.model.FacilityStaffMapping facilityStaffMapping) {
		return _facilityStaffMapping.compareTo(facilityStaffMapping);
	}

	@Override
	public int hashCode() {
		return _facilityStaffMapping.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.FacilityStaffMapping> toCacheModel() {
		return _facilityStaffMapping.toCacheModel();
	}

	public com.pacnet.connect.model.FacilityStaffMapping toEscapedModel() {
		return new FacilityStaffMappingWrapper(_facilityStaffMapping.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _facilityStaffMapping.toString();
	}

	public java.lang.String toXmlString() {
		return _facilityStaffMapping.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_facilityStaffMapping.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public FacilityStaffMapping getWrappedFacilityStaffMapping() {
		return _facilityStaffMapping;
	}

	public FacilityStaffMapping getWrappedModel() {
		return _facilityStaffMapping;
	}

	public void resetOriginalValues() {
		_facilityStaffMapping.resetOriginalValues();
	}

	private FacilityStaffMapping _facilityStaffMapping;
}