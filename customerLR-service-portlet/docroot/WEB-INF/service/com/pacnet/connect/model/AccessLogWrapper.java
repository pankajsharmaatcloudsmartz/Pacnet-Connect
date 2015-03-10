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
 * This class is a wrapper for {@link AccessLog}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       AccessLog
 * @generated
 */
public class AccessLogWrapper implements AccessLog, ModelWrapper<AccessLog> {
	public AccessLogWrapper(AccessLog accessLog) {
		_accessLog = accessLog;
	}

	public Class<?> getModelClass() {
		return AccessLog.class;
	}

	public String getModelClassName() {
		return AccessLog.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("accessRequestId", getAccessRequestId());
		attributes.put("facilityUserMappingId", getFacilityUserMappingId());
		attributes.put("actualDateOfVisit", getActualDateOfVisit());
		attributes.put("timeIn", getTimeIn());
		attributes.put("timeOut", getTimeOut());
		attributes.put("note", getNote());
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

		Long facilityUserMappingId = (Long)attributes.get(
				"facilityUserMappingId");

		if (facilityUserMappingId != null) {
			setFacilityUserMappingId(facilityUserMappingId);
		}

		Date actualDateOfVisit = (Date)attributes.get("actualDateOfVisit");

		if (actualDateOfVisit != null) {
			setActualDateOfVisit(actualDateOfVisit);
		}

		Long timeIn = (Long)attributes.get("timeIn");

		if (timeIn != null) {
			setTimeIn(timeIn);
		}

		Long timeOut = (Long)attributes.get("timeOut");

		if (timeOut != null) {
			setTimeOut(timeOut);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
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
	* Returns the primary key of this access log.
	*
	* @return the primary key of this access log
	*/
	public long getPrimaryKey() {
		return _accessLog.getPrimaryKey();
	}

	/**
	* Sets the primary key of this access log.
	*
	* @param primaryKey the primary key of this access log
	*/
	public void setPrimaryKey(long primaryKey) {
		_accessLog.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this access log.
	*
	* @return the ID of this access log
	*/
	public long getId() {
		return _accessLog.getId();
	}

	/**
	* Sets the ID of this access log.
	*
	* @param id the ID of this access log
	*/
	public void setId(long id) {
		_accessLog.setId(id);
	}

	/**
	* Returns the access request ID of this access log.
	*
	* @return the access request ID of this access log
	*/
	public long getAccessRequestId() {
		return _accessLog.getAccessRequestId();
	}

	/**
	* Sets the access request ID of this access log.
	*
	* @param accessRequestId the access request ID of this access log
	*/
	public void setAccessRequestId(long accessRequestId) {
		_accessLog.setAccessRequestId(accessRequestId);
	}

	/**
	* Returns the facility user mapping ID of this access log.
	*
	* @return the facility user mapping ID of this access log
	*/
	public long getFacilityUserMappingId() {
		return _accessLog.getFacilityUserMappingId();
	}

	/**
	* Sets the facility user mapping ID of this access log.
	*
	* @param facilityUserMappingId the facility user mapping ID of this access log
	*/
	public void setFacilityUserMappingId(long facilityUserMappingId) {
		_accessLog.setFacilityUserMappingId(facilityUserMappingId);
	}

	/**
	* Returns the actual date of visit of this access log.
	*
	* @return the actual date of visit of this access log
	*/
	public java.util.Date getActualDateOfVisit() {
		return _accessLog.getActualDateOfVisit();
	}

	/**
	* Sets the actual date of visit of this access log.
	*
	* @param actualDateOfVisit the actual date of visit of this access log
	*/
	public void setActualDateOfVisit(java.util.Date actualDateOfVisit) {
		_accessLog.setActualDateOfVisit(actualDateOfVisit);
	}

	/**
	* Returns the time in of this access log.
	*
	* @return the time in of this access log
	*/
	public long getTimeIn() {
		return _accessLog.getTimeIn();
	}

	/**
	* Sets the time in of this access log.
	*
	* @param timeIn the time in of this access log
	*/
	public void setTimeIn(long timeIn) {
		_accessLog.setTimeIn(timeIn);
	}

	/**
	* Returns the time out of this access log.
	*
	* @return the time out of this access log
	*/
	public long getTimeOut() {
		return _accessLog.getTimeOut();
	}

	/**
	* Sets the time out of this access log.
	*
	* @param timeOut the time out of this access log
	*/
	public void setTimeOut(long timeOut) {
		_accessLog.setTimeOut(timeOut);
	}

	/**
	* Returns the note of this access log.
	*
	* @return the note of this access log
	*/
	public java.lang.String getNote() {
		return _accessLog.getNote();
	}

	/**
	* Sets the note of this access log.
	*
	* @param note the note of this access log
	*/
	public void setNote(java.lang.String note) {
		_accessLog.setNote(note);
	}

	/**
	* Returns the is active of this access log.
	*
	* @return the is active of this access log
	*/
	public boolean getIsActive() {
		return _accessLog.getIsActive();
	}

	/**
	* Returns <code>true</code> if this access log is is active.
	*
	* @return <code>true</code> if this access log is is active; <code>false</code> otherwise
	*/
	public boolean isIsActive() {
		return _accessLog.isIsActive();
	}

	/**
	* Sets whether this access log is is active.
	*
	* @param isActive the is active of this access log
	*/
	public void setIsActive(boolean isActive) {
		_accessLog.setIsActive(isActive);
	}

	/**
	* Returns the created on of this access log.
	*
	* @return the created on of this access log
	*/
	public java.util.Date getCreatedOn() {
		return _accessLog.getCreatedOn();
	}

	/**
	* Sets the created on of this access log.
	*
	* @param createdOn the created on of this access log
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_accessLog.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this access log.
	*
	* @return the created by of this access log
	*/
	public java.lang.String getCreatedBy() {
		return _accessLog.getCreatedBy();
	}

	/**
	* Sets the created by of this access log.
	*
	* @param createdBy the created by of this access log
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_accessLog.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this access log.
	*
	* @return the updated on of this access log
	*/
	public java.util.Date getUpdatedOn() {
		return _accessLog.getUpdatedOn();
	}

	/**
	* Sets the updated on of this access log.
	*
	* @param updatedOn the updated on of this access log
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_accessLog.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this access log.
	*
	* @return the updated by of this access log
	*/
	public java.lang.String getUpdatedBy() {
		return _accessLog.getUpdatedBy();
	}

	/**
	* Sets the updated by of this access log.
	*
	* @param updatedBy the updated by of this access log
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_accessLog.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _accessLog.isNew();
	}

	public void setNew(boolean n) {
		_accessLog.setNew(n);
	}

	public boolean isCachedModel() {
		return _accessLog.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_accessLog.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _accessLog.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _accessLog.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_accessLog.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _accessLog.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_accessLog.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AccessLogWrapper((AccessLog)_accessLog.clone());
	}

	public int compareTo(com.pacnet.connect.model.AccessLog accessLog) {
		return _accessLog.compareTo(accessLog);
	}

	@Override
	public int hashCode() {
		return _accessLog.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.AccessLog> toCacheModel() {
		return _accessLog.toCacheModel();
	}

	public com.pacnet.connect.model.AccessLog toEscapedModel() {
		return new AccessLogWrapper(_accessLog.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _accessLog.toString();
	}

	public java.lang.String toXmlString() {
		return _accessLog.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_accessLog.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public AccessLog getWrappedAccessLog() {
		return _accessLog;
	}

	public AccessLog getWrappedModel() {
		return _accessLog;
	}

	public void resetOriginalValues() {
		_accessLog.resetOriginalValues();
	}

	private AccessLog _accessLog;
}