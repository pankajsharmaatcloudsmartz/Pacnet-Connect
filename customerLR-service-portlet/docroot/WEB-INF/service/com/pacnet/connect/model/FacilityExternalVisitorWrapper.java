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
 * This class is a wrapper for {@link FacilityExternalVisitor}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       FacilityExternalVisitor
 * @generated
 */
public class FacilityExternalVisitorWrapper implements FacilityExternalVisitor,
	ModelWrapper<FacilityExternalVisitor> {
	public FacilityExternalVisitorWrapper(
		FacilityExternalVisitor facilityExternalVisitor) {
		_facilityExternalVisitor = facilityExternalVisitor;
	}

	public Class<?> getModelClass() {
		return FacilityExternalVisitor.class;
	}

	public String getModelClassName() {
		return FacilityExternalVisitor.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("facilityId", getFacilityId());
		attributes.put("accessRequestId", getAccessRequestId());
		attributes.put("name", getName());
		attributes.put("mobileNumber", getMobileNumber());
		attributes.put("email", getEmail());
		attributes.put("address", getAddress());
		attributes.put("companyName", getCompanyName());
		attributes.put("documentType", getDocumentType());
		attributes.put("documentId", getDocumentId());
		attributes.put("remarks", getRemarks());
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

		Long facilityId = (Long)attributes.get("facilityId");

		if (facilityId != null) {
			setFacilityId(facilityId);
		}

		Long accessRequestId = (Long)attributes.get("accessRequestId");

		if (accessRequestId != null) {
			setAccessRequestId(accessRequestId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String mobileNumber = (String)attributes.get("mobileNumber");

		if (mobileNumber != null) {
			setMobileNumber(mobileNumber);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String documentType = (String)attributes.get("documentType");

		if (documentType != null) {
			setDocumentType(documentType);
		}

		String documentId = (String)attributes.get("documentId");

		if (documentId != null) {
			setDocumentId(documentId);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
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
	* Returns the primary key of this facility external visitor.
	*
	* @return the primary key of this facility external visitor
	*/
	public long getPrimaryKey() {
		return _facilityExternalVisitor.getPrimaryKey();
	}

	/**
	* Sets the primary key of this facility external visitor.
	*
	* @param primaryKey the primary key of this facility external visitor
	*/
	public void setPrimaryKey(long primaryKey) {
		_facilityExternalVisitor.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this facility external visitor.
	*
	* @return the ID of this facility external visitor
	*/
	public long getId() {
		return _facilityExternalVisitor.getId();
	}

	/**
	* Sets the ID of this facility external visitor.
	*
	* @param id the ID of this facility external visitor
	*/
	public void setId(long id) {
		_facilityExternalVisitor.setId(id);
	}

	/**
	* Returns the facility ID of this facility external visitor.
	*
	* @return the facility ID of this facility external visitor
	*/
	public long getFacilityId() {
		return _facilityExternalVisitor.getFacilityId();
	}

	/**
	* Sets the facility ID of this facility external visitor.
	*
	* @param facilityId the facility ID of this facility external visitor
	*/
	public void setFacilityId(long facilityId) {
		_facilityExternalVisitor.setFacilityId(facilityId);
	}

	/**
	* Returns the access request ID of this facility external visitor.
	*
	* @return the access request ID of this facility external visitor
	*/
	public long getAccessRequestId() {
		return _facilityExternalVisitor.getAccessRequestId();
	}

	/**
	* Sets the access request ID of this facility external visitor.
	*
	* @param accessRequestId the access request ID of this facility external visitor
	*/
	public void setAccessRequestId(long accessRequestId) {
		_facilityExternalVisitor.setAccessRequestId(accessRequestId);
	}

	/**
	* Returns the name of this facility external visitor.
	*
	* @return the name of this facility external visitor
	*/
	public java.lang.String getName() {
		return _facilityExternalVisitor.getName();
	}

	/**
	* Sets the name of this facility external visitor.
	*
	* @param name the name of this facility external visitor
	*/
	public void setName(java.lang.String name) {
		_facilityExternalVisitor.setName(name);
	}

	/**
	* Returns the mobile number of this facility external visitor.
	*
	* @return the mobile number of this facility external visitor
	*/
	public java.lang.String getMobileNumber() {
		return _facilityExternalVisitor.getMobileNumber();
	}

	/**
	* Sets the mobile number of this facility external visitor.
	*
	* @param mobileNumber the mobile number of this facility external visitor
	*/
	public void setMobileNumber(java.lang.String mobileNumber) {
		_facilityExternalVisitor.setMobileNumber(mobileNumber);
	}

	/**
	* Returns the email of this facility external visitor.
	*
	* @return the email of this facility external visitor
	*/
	public java.lang.String getEmail() {
		return _facilityExternalVisitor.getEmail();
	}

	/**
	* Sets the email of this facility external visitor.
	*
	* @param email the email of this facility external visitor
	*/
	public void setEmail(java.lang.String email) {
		_facilityExternalVisitor.setEmail(email);
	}

	/**
	* Returns the address of this facility external visitor.
	*
	* @return the address of this facility external visitor
	*/
	public java.lang.String getAddress() {
		return _facilityExternalVisitor.getAddress();
	}

	/**
	* Sets the address of this facility external visitor.
	*
	* @param address the address of this facility external visitor
	*/
	public void setAddress(java.lang.String address) {
		_facilityExternalVisitor.setAddress(address);
	}

	/**
	* Returns the company name of this facility external visitor.
	*
	* @return the company name of this facility external visitor
	*/
	public java.lang.String getCompanyName() {
		return _facilityExternalVisitor.getCompanyName();
	}

	/**
	* Sets the company name of this facility external visitor.
	*
	* @param companyName the company name of this facility external visitor
	*/
	public void setCompanyName(java.lang.String companyName) {
		_facilityExternalVisitor.setCompanyName(companyName);
	}

	/**
	* Returns the document type of this facility external visitor.
	*
	* @return the document type of this facility external visitor
	*/
	public java.lang.String getDocumentType() {
		return _facilityExternalVisitor.getDocumentType();
	}

	/**
	* Sets the document type of this facility external visitor.
	*
	* @param documentType the document type of this facility external visitor
	*/
	public void setDocumentType(java.lang.String documentType) {
		_facilityExternalVisitor.setDocumentType(documentType);
	}

	/**
	* Returns the document ID of this facility external visitor.
	*
	* @return the document ID of this facility external visitor
	*/
	public java.lang.String getDocumentId() {
		return _facilityExternalVisitor.getDocumentId();
	}

	/**
	* Sets the document ID of this facility external visitor.
	*
	* @param documentId the document ID of this facility external visitor
	*/
	public void setDocumentId(java.lang.String documentId) {
		_facilityExternalVisitor.setDocumentId(documentId);
	}

	/**
	* Returns the remarks of this facility external visitor.
	*
	* @return the remarks of this facility external visitor
	*/
	public java.lang.String getRemarks() {
		return _facilityExternalVisitor.getRemarks();
	}

	/**
	* Sets the remarks of this facility external visitor.
	*
	* @param remarks the remarks of this facility external visitor
	*/
	public void setRemarks(java.lang.String remarks) {
		_facilityExternalVisitor.setRemarks(remarks);
	}

	/**
	* Returns the is active of this facility external visitor.
	*
	* @return the is active of this facility external visitor
	*/
	public boolean getIsActive() {
		return _facilityExternalVisitor.getIsActive();
	}

	/**
	* Returns <code>true</code> if this facility external visitor is is active.
	*
	* @return <code>true</code> if this facility external visitor is is active; <code>false</code> otherwise
	*/
	public boolean isIsActive() {
		return _facilityExternalVisitor.isIsActive();
	}

	/**
	* Sets whether this facility external visitor is is active.
	*
	* @param isActive the is active of this facility external visitor
	*/
	public void setIsActive(boolean isActive) {
		_facilityExternalVisitor.setIsActive(isActive);
	}

	/**
	* Returns the created on of this facility external visitor.
	*
	* @return the created on of this facility external visitor
	*/
	public java.util.Date getCreatedOn() {
		return _facilityExternalVisitor.getCreatedOn();
	}

	/**
	* Sets the created on of this facility external visitor.
	*
	* @param createdOn the created on of this facility external visitor
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_facilityExternalVisitor.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this facility external visitor.
	*
	* @return the created by of this facility external visitor
	*/
	public java.lang.String getCreatedBy() {
		return _facilityExternalVisitor.getCreatedBy();
	}

	/**
	* Sets the created by of this facility external visitor.
	*
	* @param createdBy the created by of this facility external visitor
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_facilityExternalVisitor.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this facility external visitor.
	*
	* @return the updated on of this facility external visitor
	*/
	public java.util.Date getUpdatedOn() {
		return _facilityExternalVisitor.getUpdatedOn();
	}

	/**
	* Sets the updated on of this facility external visitor.
	*
	* @param updatedOn the updated on of this facility external visitor
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_facilityExternalVisitor.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this facility external visitor.
	*
	* @return the updated by of this facility external visitor
	*/
	public java.lang.String getUpdatedBy() {
		return _facilityExternalVisitor.getUpdatedBy();
	}

	/**
	* Sets the updated by of this facility external visitor.
	*
	* @param updatedBy the updated by of this facility external visitor
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_facilityExternalVisitor.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _facilityExternalVisitor.isNew();
	}

	public void setNew(boolean n) {
		_facilityExternalVisitor.setNew(n);
	}

	public boolean isCachedModel() {
		return _facilityExternalVisitor.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_facilityExternalVisitor.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _facilityExternalVisitor.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _facilityExternalVisitor.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_facilityExternalVisitor.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _facilityExternalVisitor.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_facilityExternalVisitor.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FacilityExternalVisitorWrapper((FacilityExternalVisitor)_facilityExternalVisitor.clone());
	}

	public int compareTo(
		com.pacnet.connect.model.FacilityExternalVisitor facilityExternalVisitor) {
		return _facilityExternalVisitor.compareTo(facilityExternalVisitor);
	}

	@Override
	public int hashCode() {
		return _facilityExternalVisitor.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.FacilityExternalVisitor> toCacheModel() {
		return _facilityExternalVisitor.toCacheModel();
	}

	public com.pacnet.connect.model.FacilityExternalVisitor toEscapedModel() {
		return new FacilityExternalVisitorWrapper(_facilityExternalVisitor.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _facilityExternalVisitor.toString();
	}

	public java.lang.String toXmlString() {
		return _facilityExternalVisitor.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_facilityExternalVisitor.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public FacilityExternalVisitor getWrappedFacilityExternalVisitor() {
		return _facilityExternalVisitor;
	}

	public FacilityExternalVisitor getWrappedModel() {
		return _facilityExternalVisitor;
	}

	public void resetOriginalValues() {
		_facilityExternalVisitor.resetOriginalValues();
	}

	private FacilityExternalVisitor _facilityExternalVisitor;
}