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
 * This class is a wrapper for {@link FacilityUserService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       FacilityUserService
 * @generated
 */
public class FacilityUserServiceWrapper implements FacilityUserService,
	ModelWrapper<FacilityUserService> {
	public FacilityUserServiceWrapper(FacilityUserService facilityUserService) {
		_facilityUserService = facilityUserService;
	}

	public Class<?> getModelClass() {
		return FacilityUserService.class;
	}

	public String getModelClassName() {
		return FacilityUserService.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("facilityUserMappingId", getFacilityUserMappingId());
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

		Long facilityUserMappingId = (Long)attributes.get(
				"facilityUserMappingId");

		if (facilityUserMappingId != null) {
			setFacilityUserMappingId(facilityUserMappingId);
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
	* Returns the primary key of this facility user service.
	*
	* @return the primary key of this facility user service
	*/
	public long getPrimaryKey() {
		return _facilityUserService.getPrimaryKey();
	}

	/**
	* Sets the primary key of this facility user service.
	*
	* @param primaryKey the primary key of this facility user service
	*/
	public void setPrimaryKey(long primaryKey) {
		_facilityUserService.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this facility user service.
	*
	* @return the ID of this facility user service
	*/
	public long getId() {
		return _facilityUserService.getId();
	}

	/**
	* Sets the ID of this facility user service.
	*
	* @param id the ID of this facility user service
	*/
	public void setId(long id) {
		_facilityUserService.setId(id);
	}

	/**
	* Returns the facility user mapping ID of this facility user service.
	*
	* @return the facility user mapping ID of this facility user service
	*/
	public long getFacilityUserMappingId() {
		return _facilityUserService.getFacilityUserMappingId();
	}

	/**
	* Sets the facility user mapping ID of this facility user service.
	*
	* @param facilityUserMappingId the facility user mapping ID of this facility user service
	*/
	public void setFacilityUserMappingId(long facilityUserMappingId) {
		_facilityUserService.setFacilityUserMappingId(facilityUserMappingId);
	}

	/**
	* Returns the facility service ID of this facility user service.
	*
	* @return the facility service ID of this facility user service
	*/
	public long getFacilityServiceId() {
		return _facilityUserService.getFacilityServiceId();
	}

	/**
	* Sets the facility service ID of this facility user service.
	*
	* @param facilityServiceId the facility service ID of this facility user service
	*/
	public void setFacilityServiceId(long facilityServiceId) {
		_facilityUserService.setFacilityServiceId(facilityServiceId);
	}

	/**
	* Returns the is active of this facility user service.
	*
	* @return the is active of this facility user service
	*/
	public boolean getIsActive() {
		return _facilityUserService.getIsActive();
	}

	/**
	* Returns <code>true</code> if this facility user service is is active.
	*
	* @return <code>true</code> if this facility user service is is active; <code>false</code> otherwise
	*/
	public boolean isIsActive() {
		return _facilityUserService.isIsActive();
	}

	/**
	* Sets whether this facility user service is is active.
	*
	* @param isActive the is active of this facility user service
	*/
	public void setIsActive(boolean isActive) {
		_facilityUserService.setIsActive(isActive);
	}

	/**
	* Returns the created on of this facility user service.
	*
	* @return the created on of this facility user service
	*/
	public java.util.Date getCreatedOn() {
		return _facilityUserService.getCreatedOn();
	}

	/**
	* Sets the created on of this facility user service.
	*
	* @param createdOn the created on of this facility user service
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_facilityUserService.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this facility user service.
	*
	* @return the created by of this facility user service
	*/
	public java.lang.String getCreatedBy() {
		return _facilityUserService.getCreatedBy();
	}

	/**
	* Sets the created by of this facility user service.
	*
	* @param createdBy the created by of this facility user service
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_facilityUserService.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this facility user service.
	*
	* @return the updated on of this facility user service
	*/
	public java.util.Date getUpdatedOn() {
		return _facilityUserService.getUpdatedOn();
	}

	/**
	* Sets the updated on of this facility user service.
	*
	* @param updatedOn the updated on of this facility user service
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_facilityUserService.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this facility user service.
	*
	* @return the updated by of this facility user service
	*/
	public java.lang.String getUpdatedBy() {
		return _facilityUserService.getUpdatedBy();
	}

	/**
	* Sets the updated by of this facility user service.
	*
	* @param updatedBy the updated by of this facility user service
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_facilityUserService.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _facilityUserService.isNew();
	}

	public void setNew(boolean n) {
		_facilityUserService.setNew(n);
	}

	public boolean isCachedModel() {
		return _facilityUserService.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_facilityUserService.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _facilityUserService.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _facilityUserService.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_facilityUserService.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _facilityUserService.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_facilityUserService.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FacilityUserServiceWrapper((FacilityUserService)_facilityUserService.clone());
	}

	public int compareTo(
		com.pacnet.connect.model.FacilityUserService facilityUserService) {
		return _facilityUserService.compareTo(facilityUserService);
	}

	@Override
	public int hashCode() {
		return _facilityUserService.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.FacilityUserService> toCacheModel() {
		return _facilityUserService.toCacheModel();
	}

	public com.pacnet.connect.model.FacilityUserService toEscapedModel() {
		return new FacilityUserServiceWrapper(_facilityUserService.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _facilityUserService.toString();
	}

	public java.lang.String toXmlString() {
		return _facilityUserService.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_facilityUserService.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public FacilityUserService getWrappedFacilityUserService() {
		return _facilityUserService;
	}

	public FacilityUserService getWrappedModel() {
		return _facilityUserService;
	}

	public void resetOriginalValues() {
		_facilityUserService.resetOriginalValues();
	}

	private FacilityUserService _facilityUserService;
}