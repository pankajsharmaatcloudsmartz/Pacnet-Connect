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
 * This class is a wrapper for {@link SAM_Email_History}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SAM_Email_History
 * @generated
 */
public class SAM_Email_HistoryWrapper implements SAM_Email_History,
	ModelWrapper<SAM_Email_History> {
	public SAM_Email_HistoryWrapper(SAM_Email_History sam_Email_History) {
		_sam_Email_History = sam_Email_History;
	}

	public Class<?> getModelClass() {
		return SAM_Email_History.class;
	}

	public String getModelClassName() {
		return SAM_Email_History.class.getName();
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
		attributes.put("IsActive", getIsActive());
		attributes.put("Created_On", getCreated_On());
		attributes.put("Created_By", getCreated_By());
		attributes.put("Updated_On", getUpdated_On());
		attributes.put("Updated_By", getUpdated_By());

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

		Integer IsActive = (Integer)attributes.get("IsActive");

		if (IsActive != null) {
			setIsActive(IsActive);
		}

		Date Created_On = (Date)attributes.get("Created_On");

		if (Created_On != null) {
			setCreated_On(Created_On);
		}

		String Created_By = (String)attributes.get("Created_By");

		if (Created_By != null) {
			setCreated_By(Created_By);
		}

		Date Updated_On = (Date)attributes.get("Updated_On");

		if (Updated_On != null) {
			setUpdated_On(Updated_On);
		}

		String Updated_By = (String)attributes.get("Updated_By");

		if (Updated_By != null) {
			setUpdated_By(Updated_By);
		}
	}

	/**
	* Returns the primary key of this s a m_ email_ history.
	*
	* @return the primary key of this s a m_ email_ history
	*/
	public long getPrimaryKey() {
		return _sam_Email_History.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s a m_ email_ history.
	*
	* @param primaryKey the primary key of this s a m_ email_ history
	*/
	public void setPrimaryKey(long primaryKey) {
		_sam_Email_History.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this s a m_ email_ history.
	*
	* @return the ID of this s a m_ email_ history
	*/
	public long getId() {
		return _sam_Email_History.getId();
	}

	/**
	* Sets the ID of this s a m_ email_ history.
	*
	* @param id the ID of this s a m_ email_ history
	*/
	public void setId(long id) {
		_sam_Email_History.setId(id);
	}

	/**
	* Returns the name of this s a m_ email_ history.
	*
	* @return the name of this s a m_ email_ history
	*/
	public java.lang.String getName() {
		return _sam_Email_History.getName();
	}

	/**
	* Sets the name of this s a m_ email_ history.
	*
	* @param name the name of this s a m_ email_ history
	*/
	public void setName(java.lang.String name) {
		_sam_Email_History.setName(name);
	}

	/**
	* Returns the history type of this s a m_ email_ history.
	*
	* @return the history type of this s a m_ email_ history
	*/
	public int getHistoryType() {
		return _sam_Email_History.getHistoryType();
	}

	/**
	* Sets the history type of this s a m_ email_ history.
	*
	* @param historyType the history type of this s a m_ email_ history
	*/
	public void setHistoryType(int historyType) {
		_sam_Email_History.setHistoryType(historyType);
	}

	/**
	* Returns the email from of this s a m_ email_ history.
	*
	* @return the email from of this s a m_ email_ history
	*/
	public java.lang.String getEmailFrom() {
		return _sam_Email_History.getEmailFrom();
	}

	/**
	* Sets the email from of this s a m_ email_ history.
	*
	* @param emailFrom the email from of this s a m_ email_ history
	*/
	public void setEmailFrom(java.lang.String emailFrom) {
		_sam_Email_History.setEmailFrom(emailFrom);
	}

	/**
	* Returns the email to of this s a m_ email_ history.
	*
	* @return the email to of this s a m_ email_ history
	*/
	public java.lang.String getEmailTo() {
		return _sam_Email_History.getEmailTo();
	}

	/**
	* Sets the email to of this s a m_ email_ history.
	*
	* @param emailTo the email to of this s a m_ email_ history
	*/
	public void setEmailTo(java.lang.String emailTo) {
		_sam_Email_History.setEmailTo(emailTo);
	}

	/**
	* Returns the email title of this s a m_ email_ history.
	*
	* @return the email title of this s a m_ email_ history
	*/
	public java.lang.String getEmailTitle() {
		return _sam_Email_History.getEmailTitle();
	}

	/**
	* Sets the email title of this s a m_ email_ history.
	*
	* @param emailTitle the email title of this s a m_ email_ history
	*/
	public void setEmailTitle(java.lang.String emailTitle) {
		_sam_Email_History.setEmailTitle(emailTitle);
	}

	/**
	* Returns the email content of this s a m_ email_ history.
	*
	* @return the email content of this s a m_ email_ history
	*/
	public java.lang.String getEmailContent() {
		return _sam_Email_History.getEmailContent();
	}

	/**
	* Sets the email content of this s a m_ email_ history.
	*
	* @param emailContent the email content of this s a m_ email_ history
	*/
	public void setEmailContent(java.lang.String emailContent) {
		_sam_Email_History.setEmailContent(emailContent);
	}

	/**
	* Returns the is active of this s a m_ email_ history.
	*
	* @return the is active of this s a m_ email_ history
	*/
	public int getIsActive() {
		return _sam_Email_History.getIsActive();
	}

	/**
	* Sets the is active of this s a m_ email_ history.
	*
	* @param IsActive the is active of this s a m_ email_ history
	*/
	public void setIsActive(int IsActive) {
		_sam_Email_History.setIsActive(IsActive);
	}

	/**
	* Returns the created_ on of this s a m_ email_ history.
	*
	* @return the created_ on of this s a m_ email_ history
	*/
	public java.util.Date getCreated_On() {
		return _sam_Email_History.getCreated_On();
	}

	/**
	* Sets the created_ on of this s a m_ email_ history.
	*
	* @param Created_On the created_ on of this s a m_ email_ history
	*/
	public void setCreated_On(java.util.Date Created_On) {
		_sam_Email_History.setCreated_On(Created_On);
	}

	/**
	* Returns the created_ by of this s a m_ email_ history.
	*
	* @return the created_ by of this s a m_ email_ history
	*/
	public java.lang.String getCreated_By() {
		return _sam_Email_History.getCreated_By();
	}

	/**
	* Sets the created_ by of this s a m_ email_ history.
	*
	* @param Created_By the created_ by of this s a m_ email_ history
	*/
	public void setCreated_By(java.lang.String Created_By) {
		_sam_Email_History.setCreated_By(Created_By);
	}

	/**
	* Returns the updated_ on of this s a m_ email_ history.
	*
	* @return the updated_ on of this s a m_ email_ history
	*/
	public java.util.Date getUpdated_On() {
		return _sam_Email_History.getUpdated_On();
	}

	/**
	* Sets the updated_ on of this s a m_ email_ history.
	*
	* @param Updated_On the updated_ on of this s a m_ email_ history
	*/
	public void setUpdated_On(java.util.Date Updated_On) {
		_sam_Email_History.setUpdated_On(Updated_On);
	}

	/**
	* Returns the updated_ by of this s a m_ email_ history.
	*
	* @return the updated_ by of this s a m_ email_ history
	*/
	public java.lang.String getUpdated_By() {
		return _sam_Email_History.getUpdated_By();
	}

	/**
	* Sets the updated_ by of this s a m_ email_ history.
	*
	* @param Updated_By the updated_ by of this s a m_ email_ history
	*/
	public void setUpdated_By(java.lang.String Updated_By) {
		_sam_Email_History.setUpdated_By(Updated_By);
	}

	public boolean isNew() {
		return _sam_Email_History.isNew();
	}

	public void setNew(boolean n) {
		_sam_Email_History.setNew(n);
	}

	public boolean isCachedModel() {
		return _sam_Email_History.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_sam_Email_History.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _sam_Email_History.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _sam_Email_History.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sam_Email_History.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sam_Email_History.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sam_Email_History.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SAM_Email_HistoryWrapper((SAM_Email_History)_sam_Email_History.clone());
	}

	public int compareTo(SAM_Email_History sam_Email_History) {
		return _sam_Email_History.compareTo(sam_Email_History);
	}

	@Override
	public int hashCode() {
		return _sam_Email_History.hashCode();
	}

	public com.liferay.portal.model.CacheModel<SAM_Email_History> toCacheModel() {
		return _sam_Email_History.toCacheModel();
	}

	public SAM_Email_History toEscapedModel() {
		return new SAM_Email_HistoryWrapper(_sam_Email_History.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sam_Email_History.toString();
	}

	public java.lang.String toXmlString() {
		return _sam_Email_History.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sam_Email_History.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SAM_Email_History getWrappedSAM_Email_History() {
		return _sam_Email_History;
	}

	public SAM_Email_History getWrappedModel() {
		return _sam_Email_History;
	}

	public void resetOriginalValues() {
		_sam_Email_History.resetOriginalValues();
	}

	private SAM_Email_History _sam_Email_History;
}