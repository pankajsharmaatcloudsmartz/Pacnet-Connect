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
 * This class is a wrapper for {@link SMA_admins}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMA_admins
 * @generated
 */
public class SMA_adminsWrapper implements SMA_admins, ModelWrapper<SMA_admins> {
	public SMA_adminsWrapper(SMA_admins sma_admins) {
		_sma_admins = sma_admins;
	}

	public Class<?> getModelClass() {
		return SMA_admins.class;
	}

	public String getModelClassName() {
		return SMA_admins.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("user_id", getUser_id());
		attributes.put("radcheck_id", getRadcheck_id());
		attributes.put("company_id", getCompany_id());
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

		Long user_id = (Long)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}

		Long radcheck_id = (Long)attributes.get("radcheck_id");

		if (radcheck_id != null) {
			setRadcheck_id(radcheck_id);
		}

		Long company_id = (Long)attributes.get("company_id");

		if (company_id != null) {
			setCompany_id(company_id);
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
	* Returns the primary key of this s m a_admins.
	*
	* @return the primary key of this s m a_admins
	*/
	public long getPrimaryKey() {
		return _sma_admins.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s m a_admins.
	*
	* @param primaryKey the primary key of this s m a_admins
	*/
	public void setPrimaryKey(long primaryKey) {
		_sma_admins.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this s m a_admins.
	*
	* @return the ID of this s m a_admins
	*/
	public long getId() {
		return _sma_admins.getId();
	}

	/**
	* Sets the ID of this s m a_admins.
	*
	* @param id the ID of this s m a_admins
	*/
	public void setId(long id) {
		_sma_admins.setId(id);
	}

	/**
	* Returns the user_id of this s m a_admins.
	*
	* @return the user_id of this s m a_admins
	*/
	public long getUser_id() {
		return _sma_admins.getUser_id();
	}

	/**
	* Sets the user_id of this s m a_admins.
	*
	* @param user_id the user_id of this s m a_admins
	*/
	public void setUser_id(long user_id) {
		_sma_admins.setUser_id(user_id);
	}

	/**
	* Returns the radcheck_id of this s m a_admins.
	*
	* @return the radcheck_id of this s m a_admins
	*/
	public long getRadcheck_id() {
		return _sma_admins.getRadcheck_id();
	}

	/**
	* Sets the radcheck_id of this s m a_admins.
	*
	* @param radcheck_id the radcheck_id of this s m a_admins
	*/
	public void setRadcheck_id(long radcheck_id) {
		_sma_admins.setRadcheck_id(radcheck_id);
	}

	/**
	* Returns the company_id of this s m a_admins.
	*
	* @return the company_id of this s m a_admins
	*/
	public long getCompany_id() {
		return _sma_admins.getCompany_id();
	}

	/**
	* Sets the company_id of this s m a_admins.
	*
	* @param company_id the company_id of this s m a_admins
	*/
	public void setCompany_id(long company_id) {
		_sma_admins.setCompany_id(company_id);
	}

	/**
	* Returns the is active of this s m a_admins.
	*
	* @return the is active of this s m a_admins
	*/
	public int getIsActive() {
		return _sma_admins.getIsActive();
	}

	/**
	* Sets the is active of this s m a_admins.
	*
	* @param IsActive the is active of this s m a_admins
	*/
	public void setIsActive(int IsActive) {
		_sma_admins.setIsActive(IsActive);
	}

	/**
	* Returns the created_ on of this s m a_admins.
	*
	* @return the created_ on of this s m a_admins
	*/
	public java.util.Date getCreated_On() {
		return _sma_admins.getCreated_On();
	}

	/**
	* Sets the created_ on of this s m a_admins.
	*
	* @param Created_On the created_ on of this s m a_admins
	*/
	public void setCreated_On(java.util.Date Created_On) {
		_sma_admins.setCreated_On(Created_On);
	}

	/**
	* Returns the created_ by of this s m a_admins.
	*
	* @return the created_ by of this s m a_admins
	*/
	public java.lang.String getCreated_By() {
		return _sma_admins.getCreated_By();
	}

	/**
	* Sets the created_ by of this s m a_admins.
	*
	* @param Created_By the created_ by of this s m a_admins
	*/
	public void setCreated_By(java.lang.String Created_By) {
		_sma_admins.setCreated_By(Created_By);
	}

	/**
	* Returns the updated_ on of this s m a_admins.
	*
	* @return the updated_ on of this s m a_admins
	*/
	public java.util.Date getUpdated_On() {
		return _sma_admins.getUpdated_On();
	}

	/**
	* Sets the updated_ on of this s m a_admins.
	*
	* @param Updated_On the updated_ on of this s m a_admins
	*/
	public void setUpdated_On(java.util.Date Updated_On) {
		_sma_admins.setUpdated_On(Updated_On);
	}

	/**
	* Returns the updated_ by of this s m a_admins.
	*
	* @return the updated_ by of this s m a_admins
	*/
	public java.lang.String getUpdated_By() {
		return _sma_admins.getUpdated_By();
	}

	/**
	* Sets the updated_ by of this s m a_admins.
	*
	* @param Updated_By the updated_ by of this s m a_admins
	*/
	public void setUpdated_By(java.lang.String Updated_By) {
		_sma_admins.setUpdated_By(Updated_By);
	}

	public boolean isNew() {
		return _sma_admins.isNew();
	}

	public void setNew(boolean n) {
		_sma_admins.setNew(n);
	}

	public boolean isCachedModel() {
		return _sma_admins.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_sma_admins.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _sma_admins.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _sma_admins.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sma_admins.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sma_admins.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sma_admins.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SMA_adminsWrapper((SMA_admins)_sma_admins.clone());
	}

	public int compareTo(com.pacnet.connect.model.SMA_admins sma_admins) {
		return _sma_admins.compareTo(sma_admins);
	}

	@Override
	public int hashCode() {
		return _sma_admins.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.SMA_admins> toCacheModel() {
		return _sma_admins.toCacheModel();
	}

	public com.pacnet.connect.model.SMA_admins toEscapedModel() {
		return new SMA_adminsWrapper(_sma_admins.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sma_admins.toString();
	}

	public java.lang.String toXmlString() {
		return _sma_admins.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sma_admins.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SMA_admins getWrappedSMA_admins() {
		return _sma_admins;
	}

	public SMA_admins getWrappedModel() {
		return _sma_admins;
	}

	public void resetOriginalValues() {
		_sma_admins.resetOriginalValues();
	}

	private SMA_admins _sma_admins;
}