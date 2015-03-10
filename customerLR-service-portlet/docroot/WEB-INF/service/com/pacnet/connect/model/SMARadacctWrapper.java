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
 * This class is a wrapper for {@link SMARadacct}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMARadacct
 * @generated
 */
public class SMARadacctWrapper implements SMARadacct, ModelWrapper<SMARadacct> {
	public SMARadacctWrapper(SMARadacct smaRadacct) {
		_smaRadacct = smaRadacct;
	}

	public Class<?> getModelClass() {
		return SMARadacct.class;
	}

	public String getModelClassName() {
		return SMARadacct.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("radAcctId", getRadAcctId());
		attributes.put("radcheckId", getRadcheckId());
		attributes.put("acctSessionId", getAcctSessionId());
		attributes.put("realm", getRealm());
		attributes.put("acctStartTime", getAcctStartTime());
		attributes.put("acctStopTime", getAcctStopTime());
		attributes.put("acctSessionTime", getAcctSessionTime());
		attributes.put("acctterminateCause", getAcctterminateCause());
		attributes.put("isActive", getIsActive());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedOn", getUpdatedOn());
		attributes.put("updatedBy", getUpdatedBy());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long radAcctId = (Long)attributes.get("radAcctId");

		if (radAcctId != null) {
			setRadAcctId(radAcctId);
		}

		Long radcheckId = (Long)attributes.get("radcheckId");

		if (radcheckId != null) {
			setRadcheckId(radcheckId);
		}

		String acctSessionId = (String)attributes.get("acctSessionId");

		if (acctSessionId != null) {
			setAcctSessionId(acctSessionId);
		}

		String realm = (String)attributes.get("realm");

		if (realm != null) {
			setRealm(realm);
		}

		Date acctStartTime = (Date)attributes.get("acctStartTime");

		if (acctStartTime != null) {
			setAcctStartTime(acctStartTime);
		}

		Date acctStopTime = (Date)attributes.get("acctStopTime");

		if (acctStopTime != null) {
			setAcctStopTime(acctStopTime);
		}

		Long acctSessionTime = (Long)attributes.get("acctSessionTime");

		if (acctSessionTime != null) {
			setAcctSessionTime(acctSessionTime);
		}

		String acctterminateCause = (String)attributes.get("acctterminateCause");

		if (acctterminateCause != null) {
			setAcctterminateCause(acctterminateCause);
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
	* Returns the primary key of this s m a radacct.
	*
	* @return the primary key of this s m a radacct
	*/
	public long getPrimaryKey() {
		return _smaRadacct.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s m a radacct.
	*
	* @param primaryKey the primary key of this s m a radacct
	*/
	public void setPrimaryKey(long primaryKey) {
		_smaRadacct.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the rad acct ID of this s m a radacct.
	*
	* @return the rad acct ID of this s m a radacct
	*/
	public long getRadAcctId() {
		return _smaRadacct.getRadAcctId();
	}

	/**
	* Sets the rad acct ID of this s m a radacct.
	*
	* @param radAcctId the rad acct ID of this s m a radacct
	*/
	public void setRadAcctId(long radAcctId) {
		_smaRadacct.setRadAcctId(radAcctId);
	}

	/**
	* Returns the radcheck ID of this s m a radacct.
	*
	* @return the radcheck ID of this s m a radacct
	*/
	public long getRadcheckId() {
		return _smaRadacct.getRadcheckId();
	}

	/**
	* Sets the radcheck ID of this s m a radacct.
	*
	* @param radcheckId the radcheck ID of this s m a radacct
	*/
	public void setRadcheckId(long radcheckId) {
		_smaRadacct.setRadcheckId(radcheckId);
	}

	/**
	* Returns the acct session ID of this s m a radacct.
	*
	* @return the acct session ID of this s m a radacct
	*/
	public java.lang.String getAcctSessionId() {
		return _smaRadacct.getAcctSessionId();
	}

	/**
	* Sets the acct session ID of this s m a radacct.
	*
	* @param acctSessionId the acct session ID of this s m a radacct
	*/
	public void setAcctSessionId(java.lang.String acctSessionId) {
		_smaRadacct.setAcctSessionId(acctSessionId);
	}

	/**
	* Returns the realm of this s m a radacct.
	*
	* @return the realm of this s m a radacct
	*/
	public java.lang.String getRealm() {
		return _smaRadacct.getRealm();
	}

	/**
	* Sets the realm of this s m a radacct.
	*
	* @param realm the realm of this s m a radacct
	*/
	public void setRealm(java.lang.String realm) {
		_smaRadacct.setRealm(realm);
	}

	/**
	* Returns the acct start time of this s m a radacct.
	*
	* @return the acct start time of this s m a radacct
	*/
	public java.util.Date getAcctStartTime() {
		return _smaRadacct.getAcctStartTime();
	}

	/**
	* Sets the acct start time of this s m a radacct.
	*
	* @param acctStartTime the acct start time of this s m a radacct
	*/
	public void setAcctStartTime(java.util.Date acctStartTime) {
		_smaRadacct.setAcctStartTime(acctStartTime);
	}

	/**
	* Returns the acct stop time of this s m a radacct.
	*
	* @return the acct stop time of this s m a radacct
	*/
	public java.util.Date getAcctStopTime() {
		return _smaRadacct.getAcctStopTime();
	}

	/**
	* Sets the acct stop time of this s m a radacct.
	*
	* @param acctStopTime the acct stop time of this s m a radacct
	*/
	public void setAcctStopTime(java.util.Date acctStopTime) {
		_smaRadacct.setAcctStopTime(acctStopTime);
	}

	/**
	* Returns the acct session time of this s m a radacct.
	*
	* @return the acct session time of this s m a radacct
	*/
	public long getAcctSessionTime() {
		return _smaRadacct.getAcctSessionTime();
	}

	/**
	* Sets the acct session time of this s m a radacct.
	*
	* @param acctSessionTime the acct session time of this s m a radacct
	*/
	public void setAcctSessionTime(long acctSessionTime) {
		_smaRadacct.setAcctSessionTime(acctSessionTime);
	}

	/**
	* Returns the acctterminate cause of this s m a radacct.
	*
	* @return the acctterminate cause of this s m a radacct
	*/
	public java.lang.String getAcctterminateCause() {
		return _smaRadacct.getAcctterminateCause();
	}

	/**
	* Sets the acctterminate cause of this s m a radacct.
	*
	* @param acctterminateCause the acctterminate cause of this s m a radacct
	*/
	public void setAcctterminateCause(java.lang.String acctterminateCause) {
		_smaRadacct.setAcctterminateCause(acctterminateCause);
	}

	/**
	* Returns the is active of this s m a radacct.
	*
	* @return the is active of this s m a radacct
	*/
	public int getIsActive() {
		return _smaRadacct.getIsActive();
	}

	/**
	* Sets the is active of this s m a radacct.
	*
	* @param isActive the is active of this s m a radacct
	*/
	public void setIsActive(int isActive) {
		_smaRadacct.setIsActive(isActive);
	}

	/**
	* Returns the created on of this s m a radacct.
	*
	* @return the created on of this s m a radacct
	*/
	public java.util.Date getCreatedOn() {
		return _smaRadacct.getCreatedOn();
	}

	/**
	* Sets the created on of this s m a radacct.
	*
	* @param createdOn the created on of this s m a radacct
	*/
	public void setCreatedOn(java.util.Date createdOn) {
		_smaRadacct.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this s m a radacct.
	*
	* @return the created by of this s m a radacct
	*/
	public java.lang.String getCreatedBy() {
		return _smaRadacct.getCreatedBy();
	}

	/**
	* Sets the created by of this s m a radacct.
	*
	* @param createdBy the created by of this s m a radacct
	*/
	public void setCreatedBy(java.lang.String createdBy) {
		_smaRadacct.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated on of this s m a radacct.
	*
	* @return the updated on of this s m a radacct
	*/
	public java.util.Date getUpdatedOn() {
		return _smaRadacct.getUpdatedOn();
	}

	/**
	* Sets the updated on of this s m a radacct.
	*
	* @param updatedOn the updated on of this s m a radacct
	*/
	public void setUpdatedOn(java.util.Date updatedOn) {
		_smaRadacct.setUpdatedOn(updatedOn);
	}

	/**
	* Returns the updated by of this s m a radacct.
	*
	* @return the updated by of this s m a radacct
	*/
	public java.lang.String getUpdatedBy() {
		return _smaRadacct.getUpdatedBy();
	}

	/**
	* Sets the updated by of this s m a radacct.
	*
	* @param updatedBy the updated by of this s m a radacct
	*/
	public void setUpdatedBy(java.lang.String updatedBy) {
		_smaRadacct.setUpdatedBy(updatedBy);
	}

	public boolean isNew() {
		return _smaRadacct.isNew();
	}

	public void setNew(boolean n) {
		_smaRadacct.setNew(n);
	}

	public boolean isCachedModel() {
		return _smaRadacct.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_smaRadacct.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _smaRadacct.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _smaRadacct.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_smaRadacct.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _smaRadacct.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_smaRadacct.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SMARadacctWrapper((SMARadacct)_smaRadacct.clone());
	}

	public int compareTo(com.pacnet.connect.model.SMARadacct smaRadacct) {
		return _smaRadacct.compareTo(smaRadacct);
	}

	@Override
	public int hashCode() {
		return _smaRadacct.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.SMARadacct> toCacheModel() {
		return _smaRadacct.toCacheModel();
	}

	public com.pacnet.connect.model.SMARadacct toEscapedModel() {
		return new SMARadacctWrapper(_smaRadacct.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _smaRadacct.toString();
	}

	public java.lang.String toXmlString() {
		return _smaRadacct.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_smaRadacct.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SMARadacct getWrappedSMARadacct() {
		return _smaRadacct;
	}

	public SMARadacct getWrappedModel() {
		return _smaRadacct;
	}

	public void resetOriginalValues() {
		_smaRadacct.resetOriginalValues();
	}

	private SMARadacct _smaRadacct;
}