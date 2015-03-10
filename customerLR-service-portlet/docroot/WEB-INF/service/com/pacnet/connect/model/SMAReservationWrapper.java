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
 * This class is a wrapper for {@link SMAReservation}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMAReservation
 * @generated
 */
public class SMAReservationWrapper implements SMAReservation,
	ModelWrapper<SMAReservation> {
	public SMAReservationWrapper(SMAReservation smaReservation) {
		_smaReservation = smaReservation;
	}

	public Class<?> getModelClass() {
		return SMAReservation.class;
	}

	public String getModelClassName() {
		return SMAReservation.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("owner", getOwner());
		attributes.put("provision", getProvision());
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
	* Returns the primary key of this s m a reservation.
	*
	* @return the primary key of this s m a reservation
	*/
	public long getPrimaryKey() {
		return _smaReservation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s m a reservation.
	*
	* @param primaryKey the primary key of this s m a reservation
	*/
	public void setPrimaryKey(long primaryKey) {
		_smaReservation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this s m a reservation.
	*
	* @return the ID of this s m a reservation
	*/
	public long getId() {
		return _smaReservation.getId();
	}

	/**
	* Sets the ID of this s m a reservation.
	*
	* @param id the ID of this s m a reservation
	*/
	public void setId(long id) {
		_smaReservation.setId(id);
	}

	/**
	* Returns the name of this s m a reservation.
	*
	* @return the name of this s m a reservation
	*/
	public java.lang.String getName() {
		return _smaReservation.getName();
	}

	/**
	* Sets the name of this s m a reservation.
	*
	* @param name the name of this s m a reservation
	*/
	public void setName(java.lang.String name) {
		_smaReservation.setName(name);
	}

	/**
	* Returns the start date of this s m a reservation.
	*
	* @return the start date of this s m a reservation
	*/
	public java.util.Date getStartDate() {
		return _smaReservation.getStartDate();
	}

	/**
	* Sets the start date of this s m a reservation.
	*
	* @param startDate the start date of this s m a reservation
	*/
	public void setStartDate(java.util.Date startDate) {
		_smaReservation.setStartDate(startDate);
	}

	/**
	* Returns the end date of this s m a reservation.
	*
	* @return the end date of this s m a reservation
	*/
	public java.util.Date getEndDate() {
		return _smaReservation.getEndDate();
	}

	/**
	* Sets the end date of this s m a reservation.
	*
	* @param endDate the end date of this s m a reservation
	*/
	public void setEndDate(java.util.Date endDate) {
		_smaReservation.setEndDate(endDate);
	}

	/**
	* Returns the owner of this s m a reservation.
	*
	* @return the owner of this s m a reservation
	*/
	public java.lang.String getOwner() {
		return _smaReservation.getOwner();
	}

	/**
	* Sets the owner of this s m a reservation.
	*
	* @param owner the owner of this s m a reservation
	*/
	public void setOwner(java.lang.String owner) {
		_smaReservation.setOwner(owner);
	}

	/**
	* Returns the provision of this s m a reservation.
	*
	* @return the provision of this s m a reservation
	*/
	public int getProvision() {
		return _smaReservation.getProvision();
	}

	/**
	* Sets the provision of this s m a reservation.
	*
	* @param provision the provision of this s m a reservation
	*/
	public void setProvision(int provision) {
		_smaReservation.setProvision(provision);
	}

	/**
	* Returns the is active of this s m a reservation.
	*
	* @return the is active of this s m a reservation
	*/
	public int getIsActive() {
		return _smaReservation.getIsActive();
	}

	/**
	* Sets the is active of this s m a reservation.
	*
	* @param isActive the is active of this s m a reservation
	*/
	public void setIsActive(int isActive) {
		_smaReservation.setIsActive(isActive);
	}

	/**
	* Returns the created on of this s m a reservation.
	*
	* @return the created on of this s m a reservation
	*/
	public java.util.Date getCreatedOn() {
		return _smaReservation.getCreatedOn();
	}

	/**
	* Sets the created on of this s m a reservation.
	*
	* @param createdOn the created on of this s m a reservation
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_smaReservation.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this s m a reservation.
	*
	* @return the created by of this s m a reservation
	*/
	public java.lang.String getCreatedBy() {
		return _smaReservation.getCreatedBy();
	}

	/**
	* Sets the created by of this s m a reservation.
	*
	* @param createdBy the created by of this s m a reservation
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_smaReservation.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this s m a reservation.
	*
	* @return the updated on of this s m a reservation
	*/
	public java.util.Date getUpdatedOn() {
		return _smaReservation.getUpdatedOn();
	}

	/**
	* Sets the updated on of this s m a reservation.
	*
	* @param updatedOn the updated on of this s m a reservation
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_smaReservation.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this s m a reservation.
	*
	* @return the updated by of this s m a reservation
	*/
	public java.lang.String getUpdatedBy() {
		return _smaReservation.getUpdatedBy();
	}

	/**
	* Sets the updated by of this s m a reservation.
	*
	* @param updatedBy the updated by of this s m a reservation
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_smaReservation.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _smaReservation.isNew();
	}

	public void setNew(boolean n) {
		_smaReservation.setNew(n);
	}

	public boolean isCachedModel() {
		return _smaReservation.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_smaReservation.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _smaReservation.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _smaReservation.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_smaReservation.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _smaReservation.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_smaReservation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SMAReservationWrapper((SMAReservation)_smaReservation.clone());
	}

	public int compareTo(com.pacnet.connect.model.SMAReservation smaReservation) {
		return _smaReservation.compareTo(smaReservation);
	}

	@Override
	public int hashCode() {
		return _smaReservation.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.SMAReservation> toCacheModel() {
		return _smaReservation.toCacheModel();
	}

	public com.pacnet.connect.model.SMAReservation toEscapedModel() {
		return new SMAReservationWrapper(_smaReservation.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _smaReservation.toString();
	}

	public java.lang.String toXmlString() {
		return _smaReservation.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_smaReservation.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SMAReservation getWrappedSMAReservation() {
		return _smaReservation;
	}

	public SMAReservation getWrappedModel() {
		return _smaReservation;
	}

	public void resetOriginalValues() {
		_smaReservation.resetOriginalValues();
	}

	private SMAReservation _smaReservation;
}