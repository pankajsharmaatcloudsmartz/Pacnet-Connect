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
 * This class is a wrapper for {@link AccessRequestFacilityService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       AccessRequestFacilityService
 * @generated
 */
public class AccessRequestFacilityServiceWrapper
	implements AccessRequestFacilityService,
		ModelWrapper<AccessRequestFacilityService> {
	public AccessRequestFacilityServiceWrapper(
		AccessRequestFacilityService accessRequestFacilityService) {
		_accessRequestFacilityService = accessRequestFacilityService;
	}

	public Class<?> getModelClass() {
		return AccessRequestFacilityService.class;
	}

	public String getModelClassName() {
		return AccessRequestFacilityService.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("accessRequestId", getAccessRequestId());
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

		Long accessRequestId = (Long)attributes.get("accessRequestId");

		if (accessRequestId != null) {
			setAccessRequestId(accessRequestId);
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
	* Returns the primary key of this access request facility service.
	*
	* @return the primary key of this access request facility service
	*/
	public long getPrimaryKey() {
		return _accessRequestFacilityService.getPrimaryKey();
	}

	/**
	* Sets the primary key of this access request facility service.
	*
	* @param primaryKey the primary key of this access request facility service
	*/
	public void setPrimaryKey(long primaryKey) {
		_accessRequestFacilityService.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this access request facility service.
	*
	* @return the ID of this access request facility service
	*/
	public long getId() {
		return _accessRequestFacilityService.getId();
	}

	/**
	* Sets the ID of this access request facility service.
	*
	* @param id the ID of this access request facility service
	*/
	public void setId(long id) {
		_accessRequestFacilityService.setId(id);
	}

	/**
	* Returns the access request ID of this access request facility service.
	*
	* @return the access request ID of this access request facility service
	*/
	public long getAccessRequestId() {
		return _accessRequestFacilityService.getAccessRequestId();
	}

	/**
	* Sets the access request ID of this access request facility service.
	*
	* @param accessRequestId the access request ID of this access request facility service
	*/
	public void setAccessRequestId(long accessRequestId) {
		_accessRequestFacilityService.setAccessRequestId(accessRequestId);
	}

	/**
	* Returns the facility service ID of this access request facility service.
	*
	* @return the facility service ID of this access request facility service
	*/
	public long getFacilityServiceId() {
		return _accessRequestFacilityService.getFacilityServiceId();
	}

	/**
	* Sets the facility service ID of this access request facility service.
	*
	* @param facilityServiceId the facility service ID of this access request facility service
	*/
	public void setFacilityServiceId(long facilityServiceId) {
		_accessRequestFacilityService.setFacilityServiceId(facilityServiceId);
	}

	/**
	* Returns the is active of this access request facility service.
	*
	* @return the is active of this access request facility service
	*/
	public boolean getIsActive() {
		return _accessRequestFacilityService.getIsActive();
	}

	/**
	* Returns <code>true</code> if this access request facility service is is active.
	*
	* @return <code>true</code> if this access request facility service is is active; <code>false</code> otherwise
	*/
	public boolean isIsActive() {
		return _accessRequestFacilityService.isIsActive();
	}

	/**
	* Sets whether this access request facility service is is active.
	*
	* @param isActive the is active of this access request facility service
	*/
	public void setIsActive(boolean isActive) {
		_accessRequestFacilityService.setIsActive(isActive);
	}

	/**
	* Returns the created on of this access request facility service.
	*
	* @return the created on of this access request facility service
	*/
	public java.util.Date getCreatedOn() {
		return _accessRequestFacilityService.getCreatedOn();
	}

	/**
	* Sets the created on of this access request facility service.
	*
	* @param createdOn the created on of this access request facility service
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_accessRequestFacilityService.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this access request facility service.
	*
	* @return the created by of this access request facility service
	*/
	public java.lang.String getCreatedBy() {
		return _accessRequestFacilityService.getCreatedBy();
	}

	/**
	* Sets the created by of this access request facility service.
	*
	* @param createdBy the created by of this access request facility service
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_accessRequestFacilityService.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this access request facility service.
	*
	* @return the updated on of this access request facility service
	*/
	public java.util.Date getUpdatedOn() {
		return _accessRequestFacilityService.getUpdatedOn();
	}

	/**
	* Sets the updated on of this access request facility service.
	*
	* @param updatedOn the updated on of this access request facility service
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_accessRequestFacilityService.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this access request facility service.
	*
	* @return the updated by of this access request facility service
	*/
	public java.lang.String getUpdatedBy() {
		return _accessRequestFacilityService.getUpdatedBy();
	}

	/**
	* Sets the updated by of this access request facility service.
	*
	* @param updatedBy the updated by of this access request facility service
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_accessRequestFacilityService.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _accessRequestFacilityService.isNew();
	}

	public void setNew(boolean n) {
		_accessRequestFacilityService.setNew(n);
	}

	public boolean isCachedModel() {
		return _accessRequestFacilityService.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_accessRequestFacilityService.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _accessRequestFacilityService.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _accessRequestFacilityService.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_accessRequestFacilityService.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _accessRequestFacilityService.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_accessRequestFacilityService.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AccessRequestFacilityServiceWrapper((AccessRequestFacilityService)_accessRequestFacilityService.clone());
	}

	public int compareTo(
		com.pacnet.connect.model.AccessRequestFacilityService accessRequestFacilityService) {
		return _accessRequestFacilityService.compareTo(accessRequestFacilityService);
	}

	@Override
	public int hashCode() {
		return _accessRequestFacilityService.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.AccessRequestFacilityService> toCacheModel() {
		return _accessRequestFacilityService.toCacheModel();
	}

	public com.pacnet.connect.model.AccessRequestFacilityService toEscapedModel() {
		return new AccessRequestFacilityServiceWrapper(_accessRequestFacilityService.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _accessRequestFacilityService.toString();
	}

	public java.lang.String toXmlString() {
		return _accessRequestFacilityService.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_accessRequestFacilityService.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public AccessRequestFacilityService getWrappedAccessRequestFacilityService() {
		return _accessRequestFacilityService;
	}

	public AccessRequestFacilityService getWrappedModel() {
		return _accessRequestFacilityService;
	}

	public void resetOriginalValues() {
		_accessRequestFacilityService.resetOriginalValues();
	}

	private AccessRequestFacilityService _accessRequestFacilityService;
}