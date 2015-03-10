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
 * This class is a wrapper for {@link FacilityUserMapping}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       FacilityUserMapping
 * @generated
 */
public class FacilityUserMappingWrapper implements FacilityUserMapping,
	ModelWrapper<FacilityUserMapping> {
	public FacilityUserMappingWrapper(FacilityUserMapping facilityUserMapping) {
		_facilityUserMapping = facilityUserMapping;
	}

	public Class<?> getModelClass() {
		return FacilityUserMapping.class;
	}

	public String getModelClassName() {
		return FacilityUserMapping.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("customerId", getCustomerId());
		attributes.put("faciltyId", getFaciltyId());
		attributes.put("customerContactId", getCustomerContactId());
		attributes.put("isActive", getIsActive());
		attributes.put("nonPacnetUserId", getNonPacnetUserId());
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

		Long customerContactId = (Long)attributes.get("customerContactId");

		if (customerContactId != null) {
			setCustomerContactId(customerContactId);
		}

		Boolean isActive = (Boolean)attributes.get("isActive");

		if (isActive != null) {
			setIsActive(isActive);
		}

		Long nonPacnetUserId = (Long)attributes.get("nonPacnetUserId");

		if (nonPacnetUserId != null) {
			setNonPacnetUserId(nonPacnetUserId);
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
	* Returns the primary key of this facility user mapping.
	*
	* @return the primary key of this facility user mapping
	*/
	public long getPrimaryKey() {
		return _facilityUserMapping.getPrimaryKey();
	}

	/**
	* Sets the primary key of this facility user mapping.
	*
	* @param primaryKey the primary key of this facility user mapping
	*/
	public void setPrimaryKey(long primaryKey) {
		_facilityUserMapping.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this facility user mapping.
	*
	* @return the ID of this facility user mapping
	*/
	public long getId() {
		return _facilityUserMapping.getId();
	}

	/**
	* Sets the ID of this facility user mapping.
	*
	* @param id the ID of this facility user mapping
	*/
	public void setId(long id) {
		_facilityUserMapping.setId(id);
	}

	/**
	* Returns the customer ID of this facility user mapping.
	*
	* @return the customer ID of this facility user mapping
	*/
	public long getCustomerId() {
		return _facilityUserMapping.getCustomerId();
	}

	/**
	* Sets the customer ID of this facility user mapping.
	*
	* @param customerId the customer ID of this facility user mapping
	*/
	public void setCustomerId(long customerId) {
		_facilityUserMapping.setCustomerId(customerId);
	}

	/**
	* Returns the facilty ID of this facility user mapping.
	*
	* @return the facilty ID of this facility user mapping
	*/
	public long getFaciltyId() {
		return _facilityUserMapping.getFaciltyId();
	}

	/**
	* Sets the facilty ID of this facility user mapping.
	*
	* @param faciltyId the facilty ID of this facility user mapping
	*/
	public void setFaciltyId(long faciltyId) {
		_facilityUserMapping.setFaciltyId(faciltyId);
	}

	/**
	* Returns the customer contact ID of this facility user mapping.
	*
	* @return the customer contact ID of this facility user mapping
	*/
	public long getCustomerContactId() {
		return _facilityUserMapping.getCustomerContactId();
	}

	/**
	* Sets the customer contact ID of this facility user mapping.
	*
	* @param customerContactId the customer contact ID of this facility user mapping
	*/
	public void setCustomerContactId(long customerContactId) {
		_facilityUserMapping.setCustomerContactId(customerContactId);
	}

	/**
	* Returns the is active of this facility user mapping.
	*
	* @return the is active of this facility user mapping
	*/
	public boolean getIsActive() {
		return _facilityUserMapping.getIsActive();
	}

	/**
	* Returns <code>true</code> if this facility user mapping is is active.
	*
	* @return <code>true</code> if this facility user mapping is is active; <code>false</code> otherwise
	*/
	public boolean isIsActive() {
		return _facilityUserMapping.isIsActive();
	}

	/**
	* Sets whether this facility user mapping is is active.
	*
	* @param isActive the is active of this facility user mapping
	*/
	public void setIsActive(boolean isActive) {
		_facilityUserMapping.setIsActive(isActive);
	}

	/**
	* Returns the non pacnet user ID of this facility user mapping.
	*
	* @return the non pacnet user ID of this facility user mapping
	*/
	public long getNonPacnetUserId() {
		return _facilityUserMapping.getNonPacnetUserId();
	}

	/**
	* Sets the non pacnet user ID of this facility user mapping.
	*
	* @param nonPacnetUserId the non pacnet user ID of this facility user mapping
	*/
	public void setNonPacnetUserId(long nonPacnetUserId) {
		_facilityUserMapping.setNonPacnetUserId(nonPacnetUserId);
	}

	/**
	* Returns the non pacnet user uuid of this facility user mapping.
	*
	* @return the non pacnet user uuid of this facility user mapping
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getNonPacnetUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityUserMapping.getNonPacnetUserUuid();
	}

	/**
	* Sets the non pacnet user uuid of this facility user mapping.
	*
	* @param nonPacnetUserUuid the non pacnet user uuid of this facility user mapping
	*/
	public void setNonPacnetUserUuid(java.lang.String nonPacnetUserUuid) {
		_facilityUserMapping.setNonPacnetUserUuid(nonPacnetUserUuid);
	}

	/**
	* Returns the created on of this facility user mapping.
	*
	* @return the created on of this facility user mapping
	*/
	public java.util.Date getCreatedOn() {
		return _facilityUserMapping.getCreatedOn();
	}

	/**
	* Sets the created on of this facility user mapping.
	*
	* @param createdOn the created on of this facility user mapping
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_facilityUserMapping.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this facility user mapping.
	*
	* @return the created by of this facility user mapping
	*/
	public java.lang.String getCreatedBy() {
		return _facilityUserMapping.getCreatedBy();
	}

	/**
	* Sets the created by of this facility user mapping.
	*
	* @param createdBy the created by of this facility user mapping
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_facilityUserMapping.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this facility user mapping.
	*
	* @return the updated on of this facility user mapping
	*/
	public java.util.Date getUpdatedOn() {
		return _facilityUserMapping.getUpdatedOn();
	}

	/**
	* Sets the updated on of this facility user mapping.
	*
	* @param updatedOn the updated on of this facility user mapping
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_facilityUserMapping.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this facility user mapping.
	*
	* @return the updated by of this facility user mapping
	*/
	public java.lang.String getUpdatedBy() {
		return _facilityUserMapping.getUpdatedBy();
	}

	/**
	* Sets the updated by of this facility user mapping.
	*
	* @param updatedBy the updated by of this facility user mapping
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_facilityUserMapping.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _facilityUserMapping.isNew();
	}

	public void setNew(boolean n) {
		_facilityUserMapping.setNew(n);
	}

	public boolean isCachedModel() {
		return _facilityUserMapping.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_facilityUserMapping.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _facilityUserMapping.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _facilityUserMapping.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_facilityUserMapping.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _facilityUserMapping.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_facilityUserMapping.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FacilityUserMappingWrapper((FacilityUserMapping)_facilityUserMapping.clone());
	}

	public int compareTo(
		com.pacnet.connect.model.FacilityUserMapping facilityUserMapping) {
		return _facilityUserMapping.compareTo(facilityUserMapping);
	}

	@Override
	public int hashCode() {
		return _facilityUserMapping.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.FacilityUserMapping> toCacheModel() {
		return _facilityUserMapping.toCacheModel();
	}

	public com.pacnet.connect.model.FacilityUserMapping toEscapedModel() {
		return new FacilityUserMappingWrapper(_facilityUserMapping.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _facilityUserMapping.toString();
	}

	public java.lang.String toXmlString() {
		return _facilityUserMapping.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_facilityUserMapping.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public FacilityUserMapping getWrappedFacilityUserMapping() {
		return _facilityUserMapping;
	}

	public FacilityUserMapping getWrappedModel() {
		return _facilityUserMapping;
	}

	public void resetOriginalValues() {
		_facilityUserMapping.resetOriginalValues();
	}

	private FacilityUserMapping _facilityUserMapping;
}