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
 * This class is a wrapper for {@link SAM_reservation}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SAM_reservation
 * @generated
 */
public class SAM_reservationWrapper implements SAM_reservation,
	ModelWrapper<SAM_reservation> {
	public SAM_reservationWrapper(SAM_reservation sam_reservation) {
		_sam_reservation = sam_reservation;
	}

	public Class<?> getModelClass() {
		return SAM_reservation.class;
	}

	public String getModelClassName() {
		return SAM_reservation.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("owner", getOwner());
		attributes.put("provision", getProvision());
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

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		String owner = (String)attributes.get("owner");

		if (owner != null) {
			setOwner(owner);
		}

		Integer provision = (Integer)attributes.get("provision");

		if (provision != null) {
			setProvision(provision);
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
	* Returns the primary key of this s a m_reservation.
	*
	* @return the primary key of this s a m_reservation
	*/
	public long getPrimaryKey() {
		return _sam_reservation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s a m_reservation.
	*
	* @param primaryKey the primary key of this s a m_reservation
	*/
	public void setPrimaryKey(long primaryKey) {
		_sam_reservation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this s a m_reservation.
	*
	* @return the ID of this s a m_reservation
	*/
	public long getId() {
		return _sam_reservation.getId();
	}

	/**
	* Sets the ID of this s a m_reservation.
	*
	* @param id the ID of this s a m_reservation
	*/
	public void setId(long id) {
		_sam_reservation.setId(id);
	}

	/**
	* Returns the name of this s a m_reservation.
	*
	* @return the name of this s a m_reservation
	*/
	public java.lang.String getName() {
		return _sam_reservation.getName();
	}

	/**
	* Sets the name of this s a m_reservation.
	*
	* @param name the name of this s a m_reservation
	*/
	public void setName(java.lang.String name) {
		_sam_reservation.setName(name);
	}

	/**
	* Returns the start date of this s a m_reservation.
	*
	* @return the start date of this s a m_reservation
	*/
	public java.util.Date getStartDate() {
		return _sam_reservation.getStartDate();
	}

	/**
	* Sets the start date of this s a m_reservation.
	*
	* @param startDate the start date of this s a m_reservation
	*/
	public void setStartDate(java.util.Date startDate) {
		_sam_reservation.setStartDate(startDate);
	}

	/**
	* Returns the end date of this s a m_reservation.
	*
	* @return the end date of this s a m_reservation
	*/
	public java.util.Date getEndDate() {
		return _sam_reservation.getEndDate();
	}

	/**
	* Sets the end date of this s a m_reservation.
	*
	* @param endDate the end date of this s a m_reservation
	*/
	public void setEndDate(java.util.Date endDate) {
		_sam_reservation.setEndDate(endDate);
	}

	/**
	* Returns the owner of this s a m_reservation.
	*
	* @return the owner of this s a m_reservation
	*/
	public java.lang.String getOwner() {
		return _sam_reservation.getOwner();
	}

	/**
	* Sets the owner of this s a m_reservation.
	*
	* @param owner the owner of this s a m_reservation
	*/
	public void setOwner(java.lang.String owner) {
		_sam_reservation.setOwner(owner);
	}

	/**
	* Returns the provision of this s a m_reservation.
	*
	* @return the provision of this s a m_reservation
	*/
	public int getProvision() {
		return _sam_reservation.getProvision();
	}

	/**
	* Sets the provision of this s a m_reservation.
	*
	* @param provision the provision of this s a m_reservation
	*/
	public void setProvision(int provision) {
		_sam_reservation.setProvision(provision);
	}

	/**
	* Returns the is active of this s a m_reservation.
	*
	* @return the is active of this s a m_reservation
	*/
	public int getIsActive() {
		return _sam_reservation.getIsActive();
	}

	/**
	* Sets the is active of this s a m_reservation.
	*
	* @param IsActive the is active of this s a m_reservation
	*/
	public void setIsActive(int IsActive) {
		_sam_reservation.setIsActive(IsActive);
	}

	/**
	* Returns the created_ on of this s a m_reservation.
	*
	* @return the created_ on of this s a m_reservation
	*/
	public java.util.Date getCreated_On() {
		return _sam_reservation.getCreated_On();
	}

	/**
	* Sets the created_ on of this s a m_reservation.
	*
	* @param Created_On the created_ on of this s a m_reservation
	*/
	public void setCreated_On(java.util.Date Created_On) {
		_sam_reservation.setCreated_On(Created_On);
	}

	/**
	* Returns the created_ by of this s a m_reservation.
	*
	* @return the created_ by of this s a m_reservation
	*/
	public java.lang.String getCreated_By() {
		return _sam_reservation.getCreated_By();
	}

	/**
	* Sets the created_ by of this s a m_reservation.
	*
	* @param Created_By the created_ by of this s a m_reservation
	*/
	public void setCreated_By(java.lang.String Created_By) {
		_sam_reservation.setCreated_By(Created_By);
	}

	/**
	* Returns the updated_ on of this s a m_reservation.
	*
	* @return the updated_ on of this s a m_reservation
	*/
	public java.util.Date getUpdated_On() {
		return _sam_reservation.getUpdated_On();
	}

	/**
	* Sets the updated_ on of this s a m_reservation.
	*
	* @param Updated_On the updated_ on of this s a m_reservation
	*/
	public void setUpdated_On(java.util.Date Updated_On) {
		_sam_reservation.setUpdated_On(Updated_On);
	}

	/**
	* Returns the updated_ by of this s a m_reservation.
	*
	* @return the updated_ by of this s a m_reservation
	*/
	public java.lang.String getUpdated_By() {
		return _sam_reservation.getUpdated_By();
	}

	/**
	* Sets the updated_ by of this s a m_reservation.
	*
	* @param Updated_By the updated_ by of this s a m_reservation
	*/
	public void setUpdated_By(java.lang.String Updated_By) {
		_sam_reservation.setUpdated_By(Updated_By);
	}

	public boolean isNew() {
		return _sam_reservation.isNew();
	}

	public void setNew(boolean n) {
		_sam_reservation.setNew(n);
	}

	public boolean isCachedModel() {
		return _sam_reservation.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_sam_reservation.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _sam_reservation.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _sam_reservation.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sam_reservation.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sam_reservation.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sam_reservation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SAM_reservationWrapper((SAM_reservation)_sam_reservation.clone());
	}

	public int compareTo(SAM_reservation sam_reservation) {
		return _sam_reservation.compareTo(sam_reservation);
	}

	@Override
	public int hashCode() {
		return _sam_reservation.hashCode();
	}

	public com.liferay.portal.model.CacheModel<SAM_reservation> toCacheModel() {
		return _sam_reservation.toCacheModel();
	}

	public SAM_reservation toEscapedModel() {
		return new SAM_reservationWrapper(_sam_reservation.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sam_reservation.toString();
	}

	public java.lang.String toXmlString() {
		return _sam_reservation.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sam_reservation.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SAM_reservation getWrappedSAM_reservation() {
		return _sam_reservation;
	}

	public SAM_reservation getWrappedModel() {
		return _sam_reservation;
	}

	public void resetOriginalValues() {
		_sam_reservation.resetOriginalValues();
	}

	private SAM_reservation _sam_reservation;
}