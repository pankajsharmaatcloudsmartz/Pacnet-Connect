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
 * This class is a wrapper for {@link SMAAdmins}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMAAdmins
 * @generated
 */
public class SMAAdminsWrapper implements SMAAdmins, ModelWrapper<SMAAdmins> {
	public SMAAdminsWrapper(SMAAdmins smaAdmins) {
		_smaAdmins = smaAdmins;
	}

	public Class<?> getModelClass() {
		return SMAAdmins.class;
	}

	public String getModelClassName() {
		return SMAAdmins.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("radcheckId", getRadcheckId());
		attributes.put("companyId", getCompanyId());
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

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long radcheckId = (Long)attributes.get("radcheckId");

		if (radcheckId != null) {
			setRadcheckId(radcheckId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
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
	* Returns the primary key of this s m a admins.
	*
	* @return the primary key of this s m a admins
	*/
	public long getPrimaryKey() {
		return _smaAdmins.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s m a admins.
	*
	* @param primaryKey the primary key of this s m a admins
	*/
	public void setPrimaryKey(long primaryKey) {
		_smaAdmins.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this s m a admins.
	*
	* @return the ID of this s m a admins
	*/
	public long getId() {
		return _smaAdmins.getId();
	}

	/**
	* Sets the ID of this s m a admins.
	*
	* @param id the ID of this s m a admins
	*/
	public void setId(long id) {
		_smaAdmins.setId(id);
	}

	/**
	* Returns the user ID of this s m a admins.
	*
	* @return the user ID of this s m a admins
	*/
	public long getUserId() {
		return _smaAdmins.getUserId();
	}

	/**
	* Sets the user ID of this s m a admins.
	*
	* @param userId the user ID of this s m a admins
	*/
	public void setUserId(long userId) {
		_smaAdmins.setUserId(userId);
	}

	/**
	* Returns the user uuid of this s m a admins.
	*
	* @return the user uuid of this s m a admins
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smaAdmins.getUserUuid();
	}

	/**
	* Sets the user uuid of this s m a admins.
	*
	* @param userUuid the user uuid of this s m a admins
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_smaAdmins.setUserUuid(userUuid);
	}

	/**
	* Returns the radcheck ID of this s m a admins.
	*
	* @return the radcheck ID of this s m a admins
	*/
	public long getRadcheckId() {
		return _smaAdmins.getRadcheckId();
	}

	/**
	* Sets the radcheck ID of this s m a admins.
	*
	* @param radcheckId the radcheck ID of this s m a admins
	*/
	public void setRadcheckId(long radcheckId) {
		_smaAdmins.setRadcheckId(radcheckId);
	}

	/**
	* Returns the company ID of this s m a admins.
	*
	* @return the company ID of this s m a admins
	*/
	public long getCompanyId() {
		return _smaAdmins.getCompanyId();
	}

	/**
	* Sets the company ID of this s m a admins.
	*
	* @param companyId the company ID of this s m a admins
	*/
	public void setCompanyId(long companyId) {
		_smaAdmins.setCompanyId(companyId);
	}

	/**
	* Returns the is active of this s m a admins.
	*
	* @return the is active of this s m a admins
	*/
	public int getIsActive() {
		return _smaAdmins.getIsActive();
	}

	/**
	* Sets the is active of this s m a admins.
	*
	* @param isActive the is active of this s m a admins
	*/
	public void setIsActive(int isActive) {
		_smaAdmins.setIsActive(isActive);
	}

	/**
	* Returns the created on of this s m a admins.
	*
	* @return the created on of this s m a admins
	*/
	public java.util.Date getCreatedOn() {
		return _smaAdmins.getCreatedOn();
	}

	/**
	* Sets the created on of this s m a admins.
	*
	* @param createdOn the created on of this s m a admins
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_smaAdmins.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this s m a admins.
	*
	* @return the created by of this s m a admins
	*/
	public java.lang.String getCreatedBy() {
		return _smaAdmins.getCreatedBy();
	}

	/**
	* Sets the created by of this s m a admins.
	*
	* @param createdBy the created by of this s m a admins
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_smaAdmins.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this s m a admins.
	*
	* @return the updated on of this s m a admins
	*/
	public java.util.Date getUpdatedOn() {
		return _smaAdmins.getUpdatedOn();
	}

	/**
	* Sets the updated on of this s m a admins.
	*
	* @param updatedOn the updated on of this s m a admins
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_smaAdmins.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this s m a admins.
	*
	* @return the updated by of this s m a admins
	*/
	public java.lang.String getUpdatedBy() {
		return _smaAdmins.getUpdatedBy();
	}

	/**
	* Sets the updated by of this s m a admins.
	*
	* @param updatedBy the updated by of this s m a admins
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_smaAdmins.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _smaAdmins.isNew();
	}

	public void setNew(boolean n) {
		_smaAdmins.setNew(n);
	}

	public boolean isCachedModel() {
		return _smaAdmins.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_smaAdmins.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _smaAdmins.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _smaAdmins.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_smaAdmins.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _smaAdmins.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_smaAdmins.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SMAAdminsWrapper((SMAAdmins)_smaAdmins.clone());
	}

	public int compareTo(com.pacnet.connect.model.SMAAdmins smaAdmins) {
		return _smaAdmins.compareTo(smaAdmins);
	}

	@Override
	public int hashCode() {
		return _smaAdmins.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.SMAAdmins> toCacheModel() {
		return _smaAdmins.toCacheModel();
	}

	public com.pacnet.connect.model.SMAAdmins toEscapedModel() {
		return new SMAAdminsWrapper(_smaAdmins.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _smaAdmins.toString();
	}

	public java.lang.String toXmlString() {
		return _smaAdmins.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_smaAdmins.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SMAAdmins getWrappedSMAAdmins() {
		return _smaAdmins;
	}

	public SMAAdmins getWrappedModel() {
		return _smaAdmins;
	}

	public void resetOriginalValues() {
		_smaAdmins.resetOriginalValues();
	}

	private SMAAdmins _smaAdmins;
}