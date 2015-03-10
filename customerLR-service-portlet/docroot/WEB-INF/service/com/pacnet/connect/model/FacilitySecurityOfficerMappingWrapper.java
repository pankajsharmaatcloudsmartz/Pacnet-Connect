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
 * This class is a wrapper for {@link FacilitySecurityOfficerMapping}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       FacilitySecurityOfficerMapping
 * @generated
 */
public class FacilitySecurityOfficerMappingWrapper
	implements FacilitySecurityOfficerMapping,
		ModelWrapper<FacilitySecurityOfficerMapping> {
	public FacilitySecurityOfficerMappingWrapper(
		FacilitySecurityOfficerMapping facilitySecurityOfficerMapping) {
		_facilitySecurityOfficerMapping = facilitySecurityOfficerMapping;
	}

	public Class<?> getModelClass() {
		return FacilitySecurityOfficerMapping.class;
	}

	public String getModelClassName() {
		return FacilitySecurityOfficerMapping.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("faciltyId", getFaciltyId());
		attributes.put("securityOfficerUserId", getSecurityOfficerUserId());
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

		Long faciltyId = (Long)attributes.get("faciltyId");

		if (faciltyId != null) {
			setFaciltyId(faciltyId);
		}

		Long securityOfficerUserId = (Long)attributes.get(
				"securityOfficerUserId");

		if (securityOfficerUserId != null) {
			setSecurityOfficerUserId(securityOfficerUserId);
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
	* Returns the primary key of this facility security officer mapping.
	*
	* @return the primary key of this facility security officer mapping
	*/
	public long getPrimaryKey() {
		return _facilitySecurityOfficerMapping.getPrimaryKey();
	}

	/**
	* Sets the primary key of this facility security officer mapping.
	*
	* @param primaryKey the primary key of this facility security officer mapping
	*/
	public void setPrimaryKey(long primaryKey) {
		_facilitySecurityOfficerMapping.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this facility security officer mapping.
	*
	* @return the ID of this facility security officer mapping
	*/
	public long getId() {
		return _facilitySecurityOfficerMapping.getId();
	}

	/**
	* Sets the ID of this facility security officer mapping.
	*
	* @param id the ID of this facility security officer mapping
	*/
	public void setId(long id) {
		_facilitySecurityOfficerMapping.setId(id);
	}

	/**
	* Returns the facilty ID of this facility security officer mapping.
	*
	* @return the facilty ID of this facility security officer mapping
	*/
	public long getFaciltyId() {
		return _facilitySecurityOfficerMapping.getFaciltyId();
	}

	/**
	* Sets the facilty ID of this facility security officer mapping.
	*
	* @param faciltyId the facilty ID of this facility security officer mapping
	*/
	public void setFaciltyId(long faciltyId) {
		_facilitySecurityOfficerMapping.setFaciltyId(faciltyId);
	}

	/**
	* Returns the security officer user ID of this facility security officer mapping.
	*
	* @return the security officer user ID of this facility security officer mapping
	*/
	public long getSecurityOfficerUserId() {
		return _facilitySecurityOfficerMapping.getSecurityOfficerUserId();
	}

	/**
	* Sets the security officer user ID of this facility security officer mapping.
	*
	* @param securityOfficerUserId the security officer user ID of this facility security officer mapping
	*/
	public void setSecurityOfficerUserId(long securityOfficerUserId) {
		_facilitySecurityOfficerMapping.setSecurityOfficerUserId(securityOfficerUserId);
	}

	/**
	* Returns the security officer user uuid of this facility security officer mapping.
	*
	* @return the security officer user uuid of this facility security officer mapping
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getSecurityOfficerUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilitySecurityOfficerMapping.getSecurityOfficerUserUuid();
	}

	/**
	* Sets the security officer user uuid of this facility security officer mapping.
	*
	* @param securityOfficerUserUuid the security officer user uuid of this facility security officer mapping
	*/
	public void setSecurityOfficerUserUuid(
		java.lang.String securityOfficerUserUuid) {
		_facilitySecurityOfficerMapping.setSecurityOfficerUserUuid(securityOfficerUserUuid);
	}

	/**
	* Returns the is active of this facility security officer mapping.
	*
	* @return the is active of this facility security officer mapping
	*/
	public boolean getIsActive() {
		return _facilitySecurityOfficerMapping.getIsActive();
	}

	/**
	* Returns <code>true</code> if this facility security officer mapping is is active.
	*
	* @return <code>true</code> if this facility security officer mapping is is active; <code>false</code> otherwise
	*/
	public boolean isIsActive() {
		return _facilitySecurityOfficerMapping.isIsActive();
	}

	/**
	* Sets whether this facility security officer mapping is is active.
	*
	* @param isActive the is active of this facility security officer mapping
	*/
	public void setIsActive(boolean isActive) {
		_facilitySecurityOfficerMapping.setIsActive(isActive);
	}

	/**
	* Returns the created on of this facility security officer mapping.
	*
	* @return the created on of this facility security officer mapping
	*/
	public java.util.Date getCreatedOn() {
		return _facilitySecurityOfficerMapping.getCreatedOn();
	}

	/**
	* Sets the created on of this facility security officer mapping.
	*
	* @param createdOn the created on of this facility security officer mapping
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_facilitySecurityOfficerMapping.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this facility security officer mapping.
	*
	* @return the created by of this facility security officer mapping
	*/
	public java.lang.String getCreatedBy() {
		return _facilitySecurityOfficerMapping.getCreatedBy();
	}

	/**
	* Sets the created by of this facility security officer mapping.
	*
	* @param createdBy the created by of this facility security officer mapping
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_facilitySecurityOfficerMapping.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this facility security officer mapping.
	*
	* @return the updated on of this facility security officer mapping
	*/
	public java.util.Date getUpdatedOn() {
		return _facilitySecurityOfficerMapping.getUpdatedOn();
	}

	/**
	* Sets the updated on of this facility security officer mapping.
	*
	* @param updatedOn the updated on of this facility security officer mapping
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_facilitySecurityOfficerMapping.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this facility security officer mapping.
	*
	* @return the updated by of this facility security officer mapping
	*/
	public java.lang.String getUpdatedBy() {
		return _facilitySecurityOfficerMapping.getUpdatedBy();
	}

	/**
	* Sets the updated by of this facility security officer mapping.
	*
	* @param updatedBy the updated by of this facility security officer mapping
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_facilitySecurityOfficerMapping.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _facilitySecurityOfficerMapping.isNew();
	}

	public void setNew(boolean n) {
		_facilitySecurityOfficerMapping.setNew(n);
	}

	public boolean isCachedModel() {
		return _facilitySecurityOfficerMapping.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_facilitySecurityOfficerMapping.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _facilitySecurityOfficerMapping.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _facilitySecurityOfficerMapping.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_facilitySecurityOfficerMapping.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _facilitySecurityOfficerMapping.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_facilitySecurityOfficerMapping.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FacilitySecurityOfficerMappingWrapper((FacilitySecurityOfficerMapping)_facilitySecurityOfficerMapping.clone());
	}

	public int compareTo(
		com.pacnet.connect.model.FacilitySecurityOfficerMapping facilitySecurityOfficerMapping) {
		return _facilitySecurityOfficerMapping.compareTo(facilitySecurityOfficerMapping);
	}

	@Override
	public int hashCode() {
		return _facilitySecurityOfficerMapping.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.FacilitySecurityOfficerMapping> toCacheModel() {
		return _facilitySecurityOfficerMapping.toCacheModel();
	}

	public com.pacnet.connect.model.FacilitySecurityOfficerMapping toEscapedModel() {
		return new FacilitySecurityOfficerMappingWrapper(_facilitySecurityOfficerMapping.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _facilitySecurityOfficerMapping.toString();
	}

	public java.lang.String toXmlString() {
		return _facilitySecurityOfficerMapping.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_facilitySecurityOfficerMapping.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public FacilitySecurityOfficerMapping getWrappedFacilitySecurityOfficerMapping() {
		return _facilitySecurityOfficerMapping;
	}

	public FacilitySecurityOfficerMapping getWrappedModel() {
		return _facilitySecurityOfficerMapping;
	}

	public void resetOriginalValues() {
		_facilitySecurityOfficerMapping.resetOriginalValues();
	}

	private FacilitySecurityOfficerMapping _facilitySecurityOfficerMapping;
}