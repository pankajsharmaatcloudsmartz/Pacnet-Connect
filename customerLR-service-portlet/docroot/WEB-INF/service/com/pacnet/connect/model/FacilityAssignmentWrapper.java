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
 * This class is a wrapper for {@link FacilityAssignment}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       FacilityAssignment
 * @generated
 */
public class FacilityAssignmentWrapper implements FacilityAssignment,
	ModelWrapper<FacilityAssignment> {
	public FacilityAssignmentWrapper(FacilityAssignment facilityAssignment) {
		_facilityAssignment = facilityAssignment;
	}

	public Class<?> getModelClass() {
		return FacilityAssignment.class;
	}

	public String getModelClassName() {
		return FacilityAssignment.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("customerId", getCustomerId());
		attributes.put("faciltyId", getFaciltyId());
		attributes.put("facilityServiceId", getFacilityServiceId());
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

		Long faciltyId = (Long)attributes.get("faciltyId");

		if (faciltyId != null) {
			setFaciltyId(faciltyId);
		}

		Long facilityServiceId = (Long)attributes.get("facilityServiceId");

		if (facilityServiceId != null) {
			setFacilityServiceId(facilityServiceId);
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
	* Returns the primary key of this facility assignment.
	*
	* @return the primary key of this facility assignment
	*/
	public long getPrimaryKey() {
		return _facilityAssignment.getPrimaryKey();
	}

	/**
	* Sets the primary key of this facility assignment.
	*
	* @param primaryKey the primary key of this facility assignment
	*/
	public void setPrimaryKey(long primaryKey) {
		_facilityAssignment.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this facility assignment.
	*
	* @return the ID of this facility assignment
	*/
	public long getId() {
		return _facilityAssignment.getId();
	}

	/**
	* Sets the ID of this facility assignment.
	*
	* @param id the ID of this facility assignment
	*/
	public void setId(long id) {
		_facilityAssignment.setId(id);
	}

	/**
	* Returns the customer ID of this facility assignment.
	*
	* @return the customer ID of this facility assignment
	*/
	public long getCustomerId() {
		return _facilityAssignment.getCustomerId();
	}

	/**
	* Sets the customer ID of this facility assignment.
	*
	* @param customerId the customer ID of this facility assignment
	*/
	public void setCustomerId(long customerId) {
		_facilityAssignment.setCustomerId(customerId);
	}

	/**
	* Returns the facilty ID of this facility assignment.
	*
	* @return the facilty ID of this facility assignment
	*/
	public long getFaciltyId() {
		return _facilityAssignment.getFaciltyId();
	}

	/**
	* Sets the facilty ID of this facility assignment.
	*
	* @param faciltyId the facilty ID of this facility assignment
	*/
	public void setFaciltyId(long faciltyId) {
		_facilityAssignment.setFaciltyId(faciltyId);
	}

	/**
	* Returns the facility service ID of this facility assignment.
	*
	* @return the facility service ID of this facility assignment
	*/
	public long getFacilityServiceId() {
		return _facilityAssignment.getFacilityServiceId();
	}

	/**
	* Sets the facility service ID of this facility assignment.
	*
	* @param facilityServiceId the facility service ID of this facility assignment
	*/
	public void setFacilityServiceId(long facilityServiceId) {
		_facilityAssignment.setFacilityServiceId(facilityServiceId);
	}

	/**
	* Returns the is active of this facility assignment.
	*
	* @return the is active of this facility assignment
	*/
	public boolean getIsActive() {
		return _facilityAssignment.getIsActive();
	}

	/**
	* Returns <code>true</code> if this facility assignment is is active.
	*
	* @return <code>true</code> if this facility assignment is is active; <code>false</code> otherwise
	*/
	public boolean isIsActive() {
		return _facilityAssignment.isIsActive();
	}

	/**
	* Sets whether this facility assignment is is active.
	*
	* @param isActive the is active of this facility assignment
	*/
	public void setIsActive(boolean isActive) {
		_facilityAssignment.setIsActive(isActive);
	}

	/**
	* Returns the created on of this facility assignment.
	*
	* @return the created on of this facility assignment
	*/
	public java.util.Date getCreatedOn() {
		return _facilityAssignment.getCreatedOn();
	}

	/**
	* Sets the created on of this facility assignment.
	*
	* @param createdOn the created on of this facility assignment
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_facilityAssignment.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this facility assignment.
	*
	* @return the created by of this facility assignment
	*/
	public java.lang.String getCreatedBy() {
		return _facilityAssignment.getCreatedBy();
	}

	/**
	* Sets the created by of this facility assignment.
	*
	* @param createdBy the created by of this facility assignment
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_facilityAssignment.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this facility assignment.
	*
	* @return the updated on of this facility assignment
	*/
	public java.util.Date getUpdatedOn() {
		return _facilityAssignment.getUpdatedOn();
	}

	/**
	* Sets the updated on of this facility assignment.
	*
	* @param updatedOn the updated on of this facility assignment
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_facilityAssignment.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this facility assignment.
	*
	* @return the updated by of this facility assignment
	*/
	public java.lang.String getUpdatedBy() {
		return _facilityAssignment.getUpdatedBy();
	}

	/**
	* Sets the updated by of this facility assignment.
	*
	* @param updatedBy the updated by of this facility assignment
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_facilityAssignment.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _facilityAssignment.isNew();
	}

	public void setNew(boolean n) {
		_facilityAssignment.setNew(n);
	}

	public boolean isCachedModel() {
		return _facilityAssignment.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_facilityAssignment.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _facilityAssignment.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _facilityAssignment.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_facilityAssignment.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _facilityAssignment.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_facilityAssignment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FacilityAssignmentWrapper((FacilityAssignment)_facilityAssignment.clone());
	}

	public int compareTo(
		com.pacnet.connect.model.FacilityAssignment facilityAssignment) {
		return _facilityAssignment.compareTo(facilityAssignment);
	}

	@Override
	public int hashCode() {
		return _facilityAssignment.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.FacilityAssignment> toCacheModel() {
		return _facilityAssignment.toCacheModel();
	}

	public com.pacnet.connect.model.FacilityAssignment toEscapedModel() {
		return new FacilityAssignmentWrapper(_facilityAssignment.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _facilityAssignment.toString();
	}

	public java.lang.String toXmlString() {
		return _facilityAssignment.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_facilityAssignment.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public FacilityAssignment getWrappedFacilityAssignment() {
		return _facilityAssignment;
	}

	public FacilityAssignment getWrappedModel() {
		return _facilityAssignment;
	}

	public void resetOriginalValues() {
		_facilityAssignment.resetOriginalValues();
	}

	private FacilityAssignment _facilityAssignment;
}