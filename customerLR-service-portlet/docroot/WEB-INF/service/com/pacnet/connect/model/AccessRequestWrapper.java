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
 * This class is a wrapper for {@link AccessRequest}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       AccessRequest
 * @generated
 */
public class AccessRequestWrapper implements AccessRequest,
	ModelWrapper<AccessRequest> {
	public AccessRequestWrapper(AccessRequest accessRequest) {
		_accessRequest = accessRequest;
	}

	public Class<?> getModelClass() {
		return AccessRequest.class;
	}

	public String getModelClassName() {
		return AccessRequest.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("facilityId", getFacilityId());
		attributes.put("customerId", getCustomerId());
		attributes.put("visitorId", getVisitorId());
		attributes.put("accessRequestStatusId", getAccessRequestStatusId());
		attributes.put("dateOfVisit", getDateOfVisit());
		attributes.put("tentativeTimeIn", getTentativeTimeIn());
		attributes.put("tentativeTimeOut", getTentativeTimeOut());
		attributes.put("note", getNote());
		attributes.put("isExternalVisitor", getIsExternalVisitor());
		attributes.put("isActive", getIsActive());
		attributes.put("oneTimeAccess", getOneTimeAccess());
		attributes.put("dateOfVisitGmt", getDateOfVisitGmt());
		attributes.put("dateOfTimeOutGmt", getDateOfTimeOutGmt());
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

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		Long visitorId = (Long)attributes.get("visitorId");

		if (visitorId != null) {
			setVisitorId(visitorId);
		}

		Long accessRequestStatusId = (Long)attributes.get(
				"accessRequestStatusId");

		if (accessRequestStatusId != null) {
			setAccessRequestStatusId(accessRequestStatusId);
		}

		Date dateOfVisit = (Date)attributes.get("dateOfVisit");

		if (dateOfVisit != null) {
			setDateOfVisit(dateOfVisit);
		}

		Long tentativeTimeIn = (Long)attributes.get("tentativeTimeIn");

		if (tentativeTimeIn != null) {
			setTentativeTimeIn(tentativeTimeIn);
		}

		Long tentativeTimeOut = (Long)attributes.get("tentativeTimeOut");

		if (tentativeTimeOut != null) {
			setTentativeTimeOut(tentativeTimeOut);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		Boolean isExternalVisitor = (Boolean)attributes.get("isExternalVisitor");

		if (isExternalVisitor != null) {
			setIsExternalVisitor(isExternalVisitor);
		}

		Boolean isActive = (Boolean)attributes.get("isActive");

		if (isActive != null) {
			setIsActive(isActive);
		}

		Boolean oneTimeAccess = (Boolean)attributes.get("oneTimeAccess");

		if (oneTimeAccess != null) {
			setOneTimeAccess(oneTimeAccess);
		}

		Date dateOfVisitGmt = (Date)attributes.get("dateOfVisitGmt");

		if (dateOfVisitGmt != null) {
			setDateOfVisitGmt(dateOfVisitGmt);
		}

		Date dateOfTimeOutGmt = (Date)attributes.get("dateOfTimeOutGmt");

		if (dateOfTimeOutGmt != null) {
			setDateOfTimeOutGmt(dateOfTimeOutGmt);
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
	* Returns the primary key of this access request.
	*
	* @return the primary key of this access request
	*/
	public long getPrimaryKey() {
		return _accessRequest.getPrimaryKey();
	}

	/**
	* Sets the primary key of this access request.
	*
	* @param primaryKey the primary key of this access request
	*/
	public void setPrimaryKey(long primaryKey) {
		_accessRequest.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this access request.
	*
	* @return the ID of this access request
	*/
	public long getId() {
		return _accessRequest.getId();
	}

	/**
	* Sets the ID of this access request.
	*
	* @param id the ID of this access request
	*/
	public void setId(long id) {
		_accessRequest.setId(id);
	}

	/**
	* Returns the facility ID of this access request.
	*
	* @return the facility ID of this access request
	*/
	public long getFacilityId() {
		return _accessRequest.getFacilityId();
	}

	/**
	* Sets the facility ID of this access request.
	*
	* @param facilityId the facility ID of this access request
	*/
	public void setFacilityId(long facilityId) {
		_accessRequest.setFacilityId(facilityId);
	}

	/**
	* Returns the customer ID of this access request.
	*
	* @return the customer ID of this access request
	*/
	public long getCustomerId() {
		return _accessRequest.getCustomerId();
	}

	/**
	* Sets the customer ID of this access request.
	*
	* @param customerId the customer ID of this access request
	*/
	public void setCustomerId(long customerId) {
		_accessRequest.setCustomerId(customerId);
	}

	/**
	* Returns the visitor ID of this access request.
	*
	* @return the visitor ID of this access request
	*/
	public long getVisitorId() {
		return _accessRequest.getVisitorId();
	}

	/**
	* Sets the visitor ID of this access request.
	*
	* @param visitorId the visitor ID of this access request
	*/
	public void setVisitorId(long visitorId) {
		_accessRequest.setVisitorId(visitorId);
	}

	/**
	* Returns the access request status ID of this access request.
	*
	* @return the access request status ID of this access request
	*/
	public long getAccessRequestStatusId() {
		return _accessRequest.getAccessRequestStatusId();
	}

	/**
	* Sets the access request status ID of this access request.
	*
	* @param accessRequestStatusId the access request status ID of this access request
	*/
	public void setAccessRequestStatusId(long accessRequestStatusId) {
		_accessRequest.setAccessRequestStatusId(accessRequestStatusId);
	}

	/**
	* Returns the date of visit of this access request.
	*
	* @return the date of visit of this access request
	*/
	public java.util.Date getDateOfVisit() {
		return _accessRequest.getDateOfVisit();
	}

	/**
	* Sets the date of visit of this access request.
	*
	* @param dateOfVisit the date of visit of this access request
	*/
	public void setDateOfVisit(java.util.Date dateOfVisit) {
		_accessRequest.setDateOfVisit(dateOfVisit);
	}

	/**
	* Returns the tentative time in of this access request.
	*
	* @return the tentative time in of this access request
	*/
	public long getTentativeTimeIn() {
		return _accessRequest.getTentativeTimeIn();
	}

	/**
	* Sets the tentative time in of this access request.
	*
	* @param tentativeTimeIn the tentative time in of this access request
	*/
	public void setTentativeTimeIn(long tentativeTimeIn) {
		_accessRequest.setTentativeTimeIn(tentativeTimeIn);
	}

	/**
	* Returns the tentative time out of this access request.
	*
	* @return the tentative time out of this access request
	*/
	public long getTentativeTimeOut() {
		return _accessRequest.getTentativeTimeOut();
	}

	/**
	* Sets the tentative time out of this access request.
	*
	* @param tentativeTimeOut the tentative time out of this access request
	*/
	public void setTentativeTimeOut(long tentativeTimeOut) {
		_accessRequest.setTentativeTimeOut(tentativeTimeOut);
	}

	/**
	* Returns the note of this access request.
	*
	* @return the note of this access request
	*/
	public java.lang.String getNote() {
		return _accessRequest.getNote();
	}

	/**
	* Sets the note of this access request.
	*
	* @param note the note of this access request
	*/
	public void setNote(java.lang.String note) {
		_accessRequest.setNote(note);
	}

	/**
	* Returns the is external visitor of this access request.
	*
	* @return the is external visitor of this access request
	*/
	public boolean getIsExternalVisitor() {
		return _accessRequest.getIsExternalVisitor();
	}

	/**
	* Returns <code>true</code> if this access request is is external visitor.
	*
	* @return <code>true</code> if this access request is is external visitor; <code>false</code> otherwise
	*/
	public boolean isIsExternalVisitor() {
		return _accessRequest.isIsExternalVisitor();
	}

	/**
	* Sets whether this access request is is external visitor.
	*
	* @param isExternalVisitor the is external visitor of this access request
	*/
	public void setIsExternalVisitor(boolean isExternalVisitor) {
		_accessRequest.setIsExternalVisitor(isExternalVisitor);
	}

	/**
	* Returns the is active of this access request.
	*
	* @return the is active of this access request
	*/
	public boolean getIsActive() {
		return _accessRequest.getIsActive();
	}

	/**
	* Returns <code>true</code> if this access request is is active.
	*
	* @return <code>true</code> if this access request is is active; <code>false</code> otherwise
	*/
	public boolean isIsActive() {
		return _accessRequest.isIsActive();
	}

	/**
	* Sets whether this access request is is active.
	*
	* @param isActive the is active of this access request
	*/
	public void setIsActive(boolean isActive) {
		_accessRequest.setIsActive(isActive);
	}

	/**
	* Returns the one time access of this access request.
	*
	* @return the one time access of this access request
	*/
	public boolean getOneTimeAccess() {
		return _accessRequest.getOneTimeAccess();
	}

	/**
	* Returns <code>true</code> if this access request is one time access.
	*
	* @return <code>true</code> if this access request is one time access; <code>false</code> otherwise
	*/
	public boolean isOneTimeAccess() {
		return _accessRequest.isOneTimeAccess();
	}

	/**
	* Sets whether this access request is one time access.
	*
	* @param oneTimeAccess the one time access of this access request
	*/
	public void setOneTimeAccess(boolean oneTimeAccess) {
		_accessRequest.setOneTimeAccess(oneTimeAccess);
	}

	/**
	* Returns the date of visit gmt of this access request.
	*
	* @return the date of visit gmt of this access request
	*/
	public java.util.Date getDateOfVisitGmt() {
		return _accessRequest.getDateOfVisitGmt();
	}

	/**
	* Sets the date of visit gmt of this access request.
	*
	* @param dateOfVisitGmt the date of visit gmt of this access request
	*/
	public void setDateOfVisitGmt(java.util.Date dateOfVisitGmt) {
		_accessRequest.setDateOfVisitGmt(dateOfVisitGmt);
	}

	/**
	* Returns the date of time out gmt of this access request.
	*
	* @return the date of time out gmt of this access request
	*/
	public java.util.Date getDateOfTimeOutGmt() {
		return _accessRequest.getDateOfTimeOutGmt();
	}

	/**
	* Sets the date of time out gmt of this access request.
	*
	* @param dateOfTimeOutGmt the date of time out gmt of this access request
	*/
	public void setDateOfTimeOutGmt(java.util.Date dateOfTimeOutGmt) {
		_accessRequest.setDateOfTimeOutGmt(dateOfTimeOutGmt);
	}

	/**
	* Returns the created on of this access request.
	*
	* @return the created on of this access request
	*/
	public java.util.Date getCreatedOn() {
		return _accessRequest.getCreatedOn();
	}

	/**
	* Sets the created on of this access request.
	*
	* @param createdOn the created on of this access request
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_accessRequest.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this access request.
	*
	* @return the created by of this access request
	*/
	public java.lang.String getCreatedBy() {
		return _accessRequest.getCreatedBy();
	}

	/**
	* Sets the created by of this access request.
	*
	* @param createdBy the created by of this access request
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_accessRequest.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this access request.
	*
	* @return the updated on of this access request
	*/
	public java.util.Date getUpdatedOn() {
		return _accessRequest.getUpdatedOn();
	}

	/**
	* Sets the updated on of this access request.
	*
	* @param updatedOn the updated on of this access request
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_accessRequest.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this access request.
	*
	* @return the updated by of this access request
	*/
	public java.lang.String getUpdatedBy() {
		return _accessRequest.getUpdatedBy();
	}

	/**
	* Sets the updated by of this access request.
	*
	* @param updatedBy the updated by of this access request
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_accessRequest.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _accessRequest.isNew();
	}

	public void setNew(boolean n) {
		_accessRequest.setNew(n);
	}

	public boolean isCachedModel() {
		return _accessRequest.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_accessRequest.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _accessRequest.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _accessRequest.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_accessRequest.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _accessRequest.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_accessRequest.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AccessRequestWrapper((AccessRequest)_accessRequest.clone());
	}

	public int compareTo(com.pacnet.connect.model.AccessRequest accessRequest) {
		return _accessRequest.compareTo(accessRequest);
	}

	@Override
	public int hashCode() {
		return _accessRequest.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.AccessRequest> toCacheModel() {
		return _accessRequest.toCacheModel();
	}

	public com.pacnet.connect.model.AccessRequest toEscapedModel() {
		return new AccessRequestWrapper(_accessRequest.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _accessRequest.toString();
	}

	public java.lang.String toXmlString() {
		return _accessRequest.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_accessRequest.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public AccessRequest getWrappedAccessRequest() {
		return _accessRequest;
	}

	public AccessRequest getWrappedModel() {
		return _accessRequest;
	}

	public void resetOriginalValues() {
		_accessRequest.resetOriginalValues();
	}

	private AccessRequest _accessRequest;
}