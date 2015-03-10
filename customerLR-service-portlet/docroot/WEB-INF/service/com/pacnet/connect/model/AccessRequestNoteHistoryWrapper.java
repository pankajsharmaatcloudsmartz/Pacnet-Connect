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
 * This class is a wrapper for {@link AccessRequestNoteHistory}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       AccessRequestNoteHistory
 * @generated
 */
public class AccessRequestNoteHistoryWrapper implements AccessRequestNoteHistory,
	ModelWrapper<AccessRequestNoteHistory> {
	public AccessRequestNoteHistoryWrapper(
		AccessRequestNoteHistory accessRequestNoteHistory) {
		_accessRequestNoteHistory = accessRequestNoteHistory;
	}

	public Class<?> getModelClass() {
		return AccessRequestNoteHistory.class;
	}

	public String getModelClassName() {
		return AccessRequestNoteHistory.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("accessRequestId", getAccessRequestId());
		attributes.put("customerId", getCustomerId());
		attributes.put("note", getNote());
		attributes.put("tableName", getTableName());
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

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		String tableName = (String)attributes.get("tableName");

		if (tableName != null) {
			setTableName(tableName);
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
	* Returns the primary key of this access request note history.
	*
	* @return the primary key of this access request note history
	*/
	public long getPrimaryKey() {
		return _accessRequestNoteHistory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this access request note history.
	*
	* @param primaryKey the primary key of this access request note history
	*/
	public void setPrimaryKey(long primaryKey) {
		_accessRequestNoteHistory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this access request note history.
	*
	* @return the ID of this access request note history
	*/
	public long getId() {
		return _accessRequestNoteHistory.getId();
	}

	/**
	* Sets the ID of this access request note history.
	*
	* @param id the ID of this access request note history
	*/
	public void setId(long id) {
		_accessRequestNoteHistory.setId(id);
	}

	/**
	* Returns the access request ID of this access request note history.
	*
	* @return the access request ID of this access request note history
	*/
	public long getAccessRequestId() {
		return _accessRequestNoteHistory.getAccessRequestId();
	}

	/**
	* Sets the access request ID of this access request note history.
	*
	* @param accessRequestId the access request ID of this access request note history
	*/
	public void setAccessRequestId(long accessRequestId) {
		_accessRequestNoteHistory.setAccessRequestId(accessRequestId);
	}

	/**
	* Returns the customer ID of this access request note history.
	*
	* @return the customer ID of this access request note history
	*/
	public long getCustomerId() {
		return _accessRequestNoteHistory.getCustomerId();
	}

	/**
	* Sets the customer ID of this access request note history.
	*
	* @param customerId the customer ID of this access request note history
	*/
	public void setCustomerId(long customerId) {
		_accessRequestNoteHistory.setCustomerId(customerId);
	}

	/**
	* Returns the note of this access request note history.
	*
	* @return the note of this access request note history
	*/
	public java.lang.String getNote() {
		return _accessRequestNoteHistory.getNote();
	}

	/**
	* Sets the note of this access request note history.
	*
	* @param note the note of this access request note history
	*/
	public void setNote(java.lang.String note) {
		_accessRequestNoteHistory.setNote(note);
	}

	/**
	* Returns the table name of this access request note history.
	*
	* @return the table name of this access request note history
	*/
	public java.lang.String getTableName() {
		return _accessRequestNoteHistory.getTableName();
	}

	/**
	* Sets the table name of this access request note history.
	*
	* @param tableName the table name of this access request note history
	*/
	public void setTableName(java.lang.String tableName) {
		_accessRequestNoteHistory.setTableName(tableName);
	}

	/**
	* Returns the is active of this access request note history.
	*
	* @return the is active of this access request note history
	*/
	public boolean getIsActive() {
		return _accessRequestNoteHistory.getIsActive();
	}

	/**
	* Returns <code>true</code> if this access request note history is is active.
	*
	* @return <code>true</code> if this access request note history is is active; <code>false</code> otherwise
	*/
	public boolean isIsActive() {
		return _accessRequestNoteHistory.isIsActive();
	}

	/**
	* Sets whether this access request note history is is active.
	*
	* @param isActive the is active of this access request note history
	*/
	public void setIsActive(boolean isActive) {
		_accessRequestNoteHistory.setIsActive(isActive);
	}

	/**
	* Returns the created on of this access request note history.
	*
	* @return the created on of this access request note history
	*/
	public java.util.Date getCreatedOn() {
		return _accessRequestNoteHistory.getCreatedOn();
	}

	/**
	* Sets the created on of this access request note history.
	*
	* @param createdOn the created on of this access request note history
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_accessRequestNoteHistory.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this access request note history.
	*
	* @return the created by of this access request note history
	*/
	public java.lang.String getCreatedBy() {
		return _accessRequestNoteHistory.getCreatedBy();
	}

	/**
	* Sets the created by of this access request note history.
	*
	* @param createdBy the created by of this access request note history
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_accessRequestNoteHistory.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this access request note history.
	*
	* @return the updated on of this access request note history
	*/
	public java.util.Date getUpdatedOn() {
		return _accessRequestNoteHistory.getUpdatedOn();
	}

	/**
	* Sets the updated on of this access request note history.
	*
	* @param updatedOn the updated on of this access request note history
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_accessRequestNoteHistory.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this access request note history.
	*
	* @return the updated by of this access request note history
	*/
	public java.lang.String getUpdatedBy() {
		return _accessRequestNoteHistory.getUpdatedBy();
	}

	/**
	* Sets the updated by of this access request note history.
	*
	* @param updatedBy the updated by of this access request note history
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_accessRequestNoteHistory.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _accessRequestNoteHistory.isNew();
	}

	public void setNew(boolean n) {
		_accessRequestNoteHistory.setNew(n);
	}

	public boolean isCachedModel() {
		return _accessRequestNoteHistory.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_accessRequestNoteHistory.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _accessRequestNoteHistory.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _accessRequestNoteHistory.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_accessRequestNoteHistory.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _accessRequestNoteHistory.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_accessRequestNoteHistory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AccessRequestNoteHistoryWrapper((AccessRequestNoteHistory)_accessRequestNoteHistory.clone());
	}

	public int compareTo(
		com.pacnet.connect.model.AccessRequestNoteHistory accessRequestNoteHistory) {
		return _accessRequestNoteHistory.compareTo(accessRequestNoteHistory);
	}

	@Override
	public int hashCode() {
		return _accessRequestNoteHistory.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.AccessRequestNoteHistory> toCacheModel() {
		return _accessRequestNoteHistory.toCacheModel();
	}

	public com.pacnet.connect.model.AccessRequestNoteHistory toEscapedModel() {
		return new AccessRequestNoteHistoryWrapper(_accessRequestNoteHistory.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _accessRequestNoteHistory.toString();
	}

	public java.lang.String toXmlString() {
		return _accessRequestNoteHistory.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_accessRequestNoteHistory.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public AccessRequestNoteHistory getWrappedAccessRequestNoteHistory() {
		return _accessRequestNoteHistory;
	}

	public AccessRequestNoteHistory getWrappedModel() {
		return _accessRequestNoteHistory;
	}

	public void resetOriginalValues() {
		_accessRequestNoteHistory.resetOriginalValues();
	}

	private AccessRequestNoteHistory _accessRequestNoteHistory;
}