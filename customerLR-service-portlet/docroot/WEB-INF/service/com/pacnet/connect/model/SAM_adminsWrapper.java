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
 * This class is a wrapper for {@link SAM_admins}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SAM_admins
 * @generated
 */
public class SAM_adminsWrapper implements SAM_admins, ModelWrapper<SAM_admins> {
	public SAM_adminsWrapper(SAM_admins sam_admins) {
		_sam_admins = sam_admins;
	}

	public Class<?> getModelClass() {
		return SAM_admins.class;
	}

	public String getModelClassName() {
		return SAM_admins.class.getName();
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
	* Returns the primary key of this s a m_admins.
	*
	* @return the primary key of this s a m_admins
	*/
	public long getPrimaryKey() {
		return _sam_admins.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s a m_admins.
	*
	* @param primaryKey the primary key of this s a m_admins
	*/
	public void setPrimaryKey(long primaryKey) {
		_sam_admins.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this s a m_admins.
	*
	* @return the ID of this s a m_admins
	*/
	public long getId() {
		return _sam_admins.getId();
	}

	/**
	* Sets the ID of this s a m_admins.
	*
	* @param id the ID of this s a m_admins
	*/
	public void setId(long id) {
		_sam_admins.setId(id);
	}

	/**
	* Returns the user_id of this s a m_admins.
	*
	* @return the user_id of this s a m_admins
	*/
	public long getUser_id() {
		return _sam_admins.getUser_id();
	}

	/**
	* Sets the user_id of this s a m_admins.
	*
	* @param user_id the user_id of this s a m_admins
	*/
	public void setUser_id(long user_id) {
		_sam_admins.setUser_id(user_id);
	}

	/**
	* Returns the radcheck_id of this s a m_admins.
	*
	* @return the radcheck_id of this s a m_admins
	*/
	public long getRadcheck_id() {
		return _sam_admins.getRadcheck_id();
	}

	/**
	* Sets the radcheck_id of this s a m_admins.
	*
	* @param radcheck_id the radcheck_id of this s a m_admins
	*/
	public void setRadcheck_id(long radcheck_id) {
		_sam_admins.setRadcheck_id(radcheck_id);
	}

	/**
	* Returns the company_id of this s a m_admins.
	*
	* @return the company_id of this s a m_admins
	*/
	public long getCompany_id() {
		return _sam_admins.getCompany_id();
	}

	/**
	* Sets the company_id of this s a m_admins.
	*
	* @param company_id the company_id of this s a m_admins
	*/
	public void setCompany_id(long company_id) {
		_sam_admins.setCompany_id(company_id);
	}

	/**
	* Returns the is active of this s a m_admins.
	*
	* @return the is active of this s a m_admins
	*/
	public int getIsActive() {
		return _sam_admins.getIsActive();
	}

	/**
	* Sets the is active of this s a m_admins.
	*
	* @param IsActive the is active of this s a m_admins
	*/
	public void setIsActive(int IsActive) {
		_sam_admins.setIsActive(IsActive);
	}

	/**
	* Returns the created_ on of this s a m_admins.
	*
	* @return the created_ on of this s a m_admins
	*/
	public java.util.Date getCreated_On() {
		return _sam_admins.getCreated_On();
	}

	/**
	* Sets the created_ on of this s a m_admins.
	*
	* @param Created_On the created_ on of this s a m_admins
	*/
	public void setCreated_On(java.util.Date Created_On) {
		_sam_admins.setCreated_On(Created_On);
	}

	/**
	* Returns the created_ by of this s a m_admins.
	*
	* @return the created_ by of this s a m_admins
	*/
	public java.lang.String getCreated_By() {
		return _sam_admins.getCreated_By();
	}

	/**
	* Sets the created_ by of this s a m_admins.
	*
	* @param Created_By the created_ by of this s a m_admins
	*/
	public void setCreated_By(java.lang.String Created_By) {
		_sam_admins.setCreated_By(Created_By);
	}

	/**
	* Returns the updated_ on of this s a m_admins.
	*
	* @return the updated_ on of this s a m_admins
	*/
	public java.util.Date getUpdated_On() {
		return _sam_admins.getUpdated_On();
	}

	/**
	* Sets the updated_ on of this s a m_admins.
	*
	* @param Updated_On the updated_ on of this s a m_admins
	*/
	public void setUpdated_On(java.util.Date Updated_On) {
		_sam_admins.setUpdated_On(Updated_On);
	}

	/**
	* Returns the updated_ by of this s a m_admins.
	*
	* @return the updated_ by of this s a m_admins
	*/
	public java.lang.String getUpdated_By() {
		return _sam_admins.getUpdated_By();
	}

	/**
	* Sets the updated_ by of this s a m_admins.
	*
	* @param Updated_By the updated_ by of this s a m_admins
	*/
	public void setUpdated_By(java.lang.String Updated_By) {
		_sam_admins.setUpdated_By(Updated_By);
	}

	public boolean isNew() {
		return _sam_admins.isNew();
	}

	public void setNew(boolean n) {
		_sam_admins.setNew(n);
	}

	public boolean isCachedModel() {
		return _sam_admins.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_sam_admins.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _sam_admins.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _sam_admins.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sam_admins.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sam_admins.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sam_admins.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SAM_adminsWrapper((SAM_admins)_sam_admins.clone());
	}

	public int compareTo(SAM_admins sam_admins) {
		return _sam_admins.compareTo(sam_admins);
	}

	@Override
	public int hashCode() {
		return _sam_admins.hashCode();
	}

	public com.liferay.portal.model.CacheModel<SAM_admins> toCacheModel() {
		return _sam_admins.toCacheModel();
	}

	public SAM_admins toEscapedModel() {
		return new SAM_adminsWrapper(_sam_admins.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sam_admins.toString();
	}

	public java.lang.String toXmlString() {
		return _sam_admins.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sam_admins.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SAM_admins getWrappedSAM_admins() {
		return _sam_admins;
	}

	public SAM_admins getWrappedModel() {
		return _sam_admins;
	}

	public void resetOriginalValues() {
		_sam_admins.resetOriginalValues();
	}

	private SAM_admins _sam_admins;
}