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
 * This class is a wrapper for {@link Facility}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       Facility
 * @generated
 */
public class FacilityWrapper implements Facility, ModelWrapper<Facility> {
	public FacilityWrapper(Facility facility) {
		_facility = facility;
	}

	public Class<?> getModelClass() {
		return Facility.class;
	}

	public String getModelClassName() {
		return Facility.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("address", getAddress());
		attributes.put("phoneNumber", getPhoneNumber());
		attributes.put("city", getCity());
		attributes.put("stateId", getStateId());
		attributes.put("countryId", getCountryId());
		attributes.put("isThirdParty", getIsThirdParty());
		attributes.put("managerId", getManagerId());
		attributes.put("escalationEmail", getEscalationEmail());
		attributes.put("isActive", getIsActive());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedOn", getUpdatedOn());
		attributes.put("updatedBy", getUpdatedBy());
		attributes.put("timezone", getTimezone());

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

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String phoneNumber = (String)attributes.get("phoneNumber");

		if (phoneNumber != null) {
			setPhoneNumber(phoneNumber);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		Long stateId = (Long)attributes.get("stateId");

		if (stateId != null) {
			setStateId(stateId);
		}

		Long countryId = (Long)attributes.get("countryId");

		if (countryId != null) {
			setCountryId(countryId);
		}

		Integer isThirdParty = (Integer)attributes.get("isThirdParty");

		if (isThirdParty != null) {
			setIsThirdParty(isThirdParty);
		}

		Long managerId = (Long)attributes.get("managerId");

		if (managerId != null) {
			setManagerId(managerId);
		}

		String escalationEmail = (String)attributes.get("escalationEmail");

		if (escalationEmail != null) {
			setEscalationEmail(escalationEmail);
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

		String timezone = (String)attributes.get("timezone");

		if (timezone != null) {
			setTimezone(timezone);
		}
	}

	/**
	* Returns the primary key of this facility.
	*
	* @return the primary key of this facility
	*/
	public long getPrimaryKey() {
		return _facility.getPrimaryKey();
	}

	/**
	* Sets the primary key of this facility.
	*
	* @param primaryKey the primary key of this facility
	*/
	public void setPrimaryKey(long primaryKey) {
		_facility.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this facility.
	*
	* @return the ID of this facility
	*/
	public long getId() {
		return _facility.getId();
	}

	/**
	* Sets the ID of this facility.
	*
	* @param id the ID of this facility
	*/
	public void setId(long id) {
		_facility.setId(id);
	}

	/**
	* Returns the name of this facility.
	*
	* @return the name of this facility
	*/
	public java.lang.String getName() {
		return _facility.getName();
	}

	/**
	* Sets the name of this facility.
	*
	* @param name the name of this facility
	*/
	public void setName(java.lang.String name) {
		_facility.setName(name);
	}

	/**
	* Returns the address of this facility.
	*
	* @return the address of this facility
	*/
	public java.lang.String getAddress() {
		return _facility.getAddress();
	}

	/**
	* Sets the address of this facility.
	*
	* @param address the address of this facility
	*/
	public void setAddress(java.lang.String address) {
		_facility.setAddress(address);
	}

	/**
	* Returns the phone number of this facility.
	*
	* @return the phone number of this facility
	*/
	public java.lang.String getPhoneNumber() {
		return _facility.getPhoneNumber();
	}

	/**
	* Sets the phone number of this facility.
	*
	* @param phoneNumber the phone number of this facility
	*/
	public void setPhoneNumber(java.lang.String phoneNumber) {
		_facility.setPhoneNumber(phoneNumber);
	}

	/**
	* Returns the city of this facility.
	*
	* @return the city of this facility
	*/
	public java.lang.String getCity() {
		return _facility.getCity();
	}

	/**
	* Sets the city of this facility.
	*
	* @param city the city of this facility
	*/
	public void setCity(java.lang.String city) {
		_facility.setCity(city);
	}

	/**
	* Returns the state ID of this facility.
	*
	* @return the state ID of this facility
	*/
	public long getStateId() {
		return _facility.getStateId();
	}

	/**
	* Sets the state ID of this facility.
	*
	* @param stateId the state ID of this facility
	*/
	public void setStateId(long stateId) {
		_facility.setStateId(stateId);
	}

	/**
	* Returns the country ID of this facility.
	*
	* @return the country ID of this facility
	*/
	public long getCountryId() {
		return _facility.getCountryId();
	}

	/**
	* Sets the country ID of this facility.
	*
	* @param countryId the country ID of this facility
	*/
	public void setCountryId(long countryId) {
		_facility.setCountryId(countryId);
	}

	/**
	* Returns the is third party of this facility.
	*
	* @return the is third party of this facility
	*/
	public int getIsThirdParty() {
		return _facility.getIsThirdParty();
	}

	/**
	* Sets the is third party of this facility.
	*
	* @param isThirdParty the is third party of this facility
	*/
	public void setIsThirdParty(int isThirdParty) {
		_facility.setIsThirdParty(isThirdParty);
	}

	/**
	* Returns the manager ID of this facility.
	*
	* @return the manager ID of this facility
	*/
	public long getManagerId() {
		return _facility.getManagerId();
	}

	/**
	* Sets the manager ID of this facility.
	*
	* @param managerId the manager ID of this facility
	*/
	public void setManagerId(long managerId) {
		_facility.setManagerId(managerId);
	}

	/**
	* Returns the escalation email of this facility.
	*
	* @return the escalation email of this facility
	*/
	public java.lang.String getEscalationEmail() {
		return _facility.getEscalationEmail();
	}

	/**
	* Sets the escalation email of this facility.
	*
	* @param escalationEmail the escalation email of this facility
	*/
	public void setEscalationEmail(java.lang.String escalationEmail) {
		_facility.setEscalationEmail(escalationEmail);
	}

	/**
	* Returns the is active of this facility.
	*
	* @return the is active of this facility
	*/
	public boolean getIsActive() {
		return _facility.getIsActive();
	}

	/**
	* Returns <code>true</code> if this facility is is active.
	*
	* @return <code>true</code> if this facility is is active; <code>false</code> otherwise
	*/
	public boolean isIsActive() {
		return _facility.isIsActive();
	}

	/**
	* Sets whether this facility is is active.
	*
	* @param isActive the is active of this facility
	*/
	public void setIsActive(boolean isActive) {
		_facility.setIsActive(isActive);
	}

	/**
	* Returns the created on of this facility.
	*
	* @return the created on of this facility
	*/
	public java.util.Date getCreatedOn() {
		return _facility.getCreatedOn();
	}

	/**
	* Sets the created on of this facility.
	*
	* @param createdOn the created on of this facility
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_facility.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this facility.
	*
	* @return the created by of this facility
	*/
	public java.lang.String getCreatedBy() {
		return _facility.getCreatedBy();
	}

	/**
	* Sets the created by of this facility.
	*
	* @param createdBy the created by of this facility
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_facility.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this facility.
	*
	* @return the updated on of this facility
	*/
	public java.util.Date getUpdatedOn() {
		return _facility.getUpdatedOn();
	}

	/**
	* Sets the updated on of this facility.
	*
	* @param updatedOn the updated on of this facility
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_facility.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this facility.
	*
	* @return the updated by of this facility
	*/
	public java.lang.String getUpdatedBy() {
		return _facility.getUpdatedBy();
	}

	/**
	* Sets the updated by of this facility.
	*
	* @param updatedBy the updated by of this facility
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_facility.setUpdatedBy(updatedBy);
	}

	/**
	* Returns the timezone of this facility.
	*
	* @return the timezone of this facility
	*/
	public java.lang.String getTimezone() {
		return _facility.getTimezone();
	}

	/**
	* Sets the timezone of this facility.
	*
	* @param timezone the timezone of this facility
	*/
	public void setTimezone(java.lang.String timezone) {
		_facility.setTimezone(timezone);
	}

	public boolean isNew() {
		return _facility.isNew();
	}

	public void setNew(boolean n) {
		_facility.setNew(n);
	}

	public boolean isCachedModel() {
		return _facility.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_facility.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _facility.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _facility.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_facility.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _facility.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_facility.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FacilityWrapper((Facility)_facility.clone());
	}

	public int compareTo(com.pacnet.connect.model.Facility facility) {
		return _facility.compareTo(facility);
	}

	@Override
	public int hashCode() {
		return _facility.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.Facility> toCacheModel() {
		return _facility.toCacheModel();
	}

	public com.pacnet.connect.model.Facility toEscapedModel() {
		return new FacilityWrapper(_facility.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _facility.toString();
	}

	public java.lang.String toXmlString() {
		return _facility.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_facility.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Facility getWrappedFacility() {
		return _facility;
	}

	public Facility getWrappedModel() {
		return _facility;
	}

	public void resetOriginalValues() {
		_facility.resetOriginalValues();
	}

	private Facility _facility;
}