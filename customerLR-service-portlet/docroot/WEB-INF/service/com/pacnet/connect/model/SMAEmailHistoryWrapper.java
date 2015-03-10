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
 * This class is a wrapper for {@link SMAEmailHistory}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMAEmailHistory
 * @generated
 */
public class SMAEmailHistoryWrapper implements SMAEmailHistory,
	ModelWrapper<SMAEmailHistory> {
	public SMAEmailHistoryWrapper(SMAEmailHistory smaEmailHistory) {
		_smaEmailHistory = smaEmailHistory;
	}

	public Class<?> getModelClass() {
		return SMAEmailHistory.class;
	}

	public String getModelClassName() {
		return SMAEmailHistory.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("historyType", getHistoryType());
		attributes.put("emailFrom", getEmailFrom());
		attributes.put("emailTo", getEmailTo());
		attributes.put("emailTitle", getEmailTitle());
		attributes.put("emailContent", getEmailContent());
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

		Integer historyType = (Integer)attributes.get("historyType");

		if (historyType != null) {
			setHistoryType(historyType);
		}

		String emailFrom = (String)attributes.get("emailFrom");

		if (emailFrom != null) {
			setEmailFrom(emailFrom);
		}

		String emailTo = (String)attributes.get("emailTo");

		if (emailTo != null) {
			setEmailTo(emailTo);
		}

		String emailTitle = (String)attributes.get("emailTitle");

		if (emailTitle != null) {
			setEmailTitle(emailTitle);
		}

		String emailContent = (String)attributes.get("emailContent");

		if (emailContent != null) {
			setEmailContent(emailContent);
		}

		Integer isActive = (Integer)attributes.get("isActive");

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
	* Returns the primary key of this s m a email history.
	*
	* @return the primary key of this s m a email history
	*/
	public long getPrimaryKey() {
		return _smaEmailHistory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s m a email history.
	*
	* @param primaryKey the primary key of this s m a email history
	*/
	public void setPrimaryKey(long primaryKey) {
		_smaEmailHistory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this s m a email history.
	*
	* @return the ID of this s m a email history
	*/
	public long getId() {
		return _smaEmailHistory.getId();
	}

	/**
	* Sets the ID of this s m a email history.
	*
	* @param id the ID of this s m a email history
	*/
	public void setId(long id) {
		_smaEmailHistory.setId(id);
	}

	/**
	* Returns the name of this s m a email history.
	*
	* @return the name of this s m a email history
	*/
	public java.lang.String getName() {
		return _smaEmailHistory.getName();
	}

	/**
	* Sets the name of this s m a email history.
	*
	* @param name the name of this s m a email history
	*/
	public void setName(java.lang.String name) {
		_smaEmailHistory.setName(name);
	}

	/**
	* Returns the history type of this s m a email history.
	*
	* @return the history type of this s m a email history
	*/
	public int getHistoryType() {
		return _smaEmailHistory.getHistoryType();
	}

	/**
	* Sets the history type of this s m a email history.
	*
	* @param historyType the history type of this s m a email history
	*/
	public void setHistoryType(int historyType) {
		_smaEmailHistory.setHistoryType(historyType);
	}

	/**
	* Returns the email from of this s m a email history.
	*
	* @return the email from of this s m a email history
	*/
	public java.lang.String getEmailFrom() {
		return _smaEmailHistory.getEmailFrom();
	}

	/**
	* Sets the email from of this s m a email history.
	*
	* @param emailFrom the email from of this s m a email history
	*/
	public void setEmailFrom(java.lang.String emailFrom) {
		_smaEmailHistory.setEmailFrom(emailFrom);
	}

	/**
	* Returns the email to of this s m a email history.
	*
	* @return the email to of this s m a email history
	*/
	public java.lang.String getEmailTo() {
		return _smaEmailHistory.getEmailTo();
	}

	/**
	* Sets the email to of this s m a email history.
	*
	* @param emailTo the email to of this s m a email history
	*/
	public void setEmailTo(java.lang.String emailTo) {
		_smaEmailHistory.setEmailTo(emailTo);
	}

	/**
	* Returns the email title of this s m a email history.
	*
	* @return the email title of this s m a email history
	*/
	public java.lang.String getEmailTitle() {
		return _smaEmailHistory.getEmailTitle();
	}

	/**
	* Sets the email title of this s m a email history.
	*
	* @param emailTitle the email title of this s m a email history
	*/
	public void setEmailTitle(java.lang.String emailTitle) {
		_smaEmailHistory.setEmailTitle(emailTitle);
	}

	/**
	* Returns the email content of this s m a email history.
	*
	* @return the email content of this s m a email history
	*/
	public java.lang.String getEmailContent() {
		return _smaEmailHistory.getEmailContent();
	}

	/**
	* Sets the email content of this s m a email history.
	*
	* @param emailContent the email content of this s m a email history
	*/
	public void setEmailContent(java.lang.String emailContent) {
		_smaEmailHistory.setEmailContent(emailContent);
	}

	/**
	* Returns the is active of this s m a email history.
	*
	* @return the is active of this s m a email history
	*/
	public int getIsActive() {
		return _smaEmailHistory.getIsActive();
	}

	/**
	* Sets the is active of this s m a email history.
	*
	* @param isActive the is active of this s m a email history
	*/
	public void setIsActive(int isActive) {
		_smaEmailHistory.setIsActive(isActive);
	}

	/**
	* Returns the created on of this s m a email history.
	*
	* @return the created on of this s m a email history
	*/
	public java.util.Date getCreatedOn() {
		return _smaEmailHistory.getCreatedOn();
	}

	/**
	* Sets the created on of this s m a email history.
	*
	* @param createdOn the created on of this s m a email history
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_smaEmailHistory.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this s m a email history.
	*
	* @return the created by of this s m a email history
	*/
	public java.lang.String getCreatedBy() {
		return _smaEmailHistory.getCreatedBy();
	}

	/**
	* Sets the created by of this s m a email history.
	*
	* @param createdBy the created by of this s m a email history
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_smaEmailHistory.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this s m a email history.
	*
	* @return the updated on of this s m a email history
	*/
	public java.util.Date getUpdatedOn() {
		return _smaEmailHistory.getUpdatedOn();
	}

	/**
	* Sets the updated on of this s m a email history.
	*
	* @param updatedOn the updated on of this s m a email history
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_smaEmailHistory.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this s m a email history.
	*
	* @return the updated by of this s m a email history
	*/
	public java.lang.String getUpdatedBy() {
		return _smaEmailHistory.getUpdatedBy();
	}

	/**
	* Sets the updated by of this s m a email history.
	*
	* @param updatedBy the updated by of this s m a email history
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_smaEmailHistory.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _smaEmailHistory.isNew();
	}

	public void setNew(boolean n) {
		_smaEmailHistory.setNew(n);
	}

	public boolean isCachedModel() {
		return _smaEmailHistory.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_smaEmailHistory.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _smaEmailHistory.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _smaEmailHistory.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_smaEmailHistory.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _smaEmailHistory.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_smaEmailHistory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SMAEmailHistoryWrapper((SMAEmailHistory)_smaEmailHistory.clone());
	}

	public int compareTo(
		com.pacnet.connect.model.SMAEmailHistory smaEmailHistory) {
		return _smaEmailHistory.compareTo(smaEmailHistory);
	}

	@Override
	public int hashCode() {
		return _smaEmailHistory.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.SMAEmailHistory> toCacheModel() {
		return _smaEmailHistory.toCacheModel();
	}

	public com.pacnet.connect.model.SMAEmailHistory toEscapedModel() {
		return new SMAEmailHistoryWrapper(_smaEmailHistory.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _smaEmailHistory.toString();
	}

	public java.lang.String toXmlString() {
		return _smaEmailHistory.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_smaEmailHistory.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SMAEmailHistory getWrappedSMAEmailHistory() {
		return _smaEmailHistory;
	}

	public SMAEmailHistory getWrappedModel() {
		return _smaEmailHistory;
	}

	public void resetOriginalValues() {
		_smaEmailHistory.resetOriginalValues();
	}

	private SMAEmailHistory _smaEmailHistory;
}