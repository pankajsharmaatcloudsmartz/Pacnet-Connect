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
 * This class is a wrapper for {@link SMA_radacct}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       SMA_radacct
 * @generated
 */
public class SMA_radacctWrapper implements SMA_radacct,
	ModelWrapper<SMA_radacct> {
	public SMA_radacctWrapper(SMA_radacct sma_radacct) {
		_sma_radacct = sma_radacct;
	}

	public Class<?> getModelClass() {
		return SMA_radacct.class;
	}

	public String getModelClassName() {
		return SMA_radacct.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("RadAcctId", getRadAcctId());
		attributes.put("radcheck_id", getRadcheck_id());
		attributes.put("AcctSessionId", getAcctSessionId());
		attributes.put("AcctUniqueId", getAcctUniqueId());
		attributes.put("Realm", getRealm());
		attributes.put("NASIPAddress", getNASIPAddress());
		attributes.put("NASPortId", getNASPortId());
		attributes.put("NASPortType", getNASPortType());
		attributes.put("AcctStartTime", getAcctStartTime());
		attributes.put("AcctStopTime", getAcctStopTime());
		attributes.put("AcctSessionTime", getAcctSessionTime());
		attributes.put("AcctAuthentic", getAcctAuthentic());
		attributes.put("ConnectInfo_start", getConnectInfo_start());
		attributes.put("ConnectInfo_stop", getConnectInfo_stop());
		attributes.put("AcctInputOctets", getAcctInputOctets());
		attributes.put("AcctOutputOctets", getAcctOutputOctets());
		attributes.put("CalledStationId", getCalledStationId());
		attributes.put("CallingStationId", getCallingStationId());
		attributes.put("AcctterminateCause", getAcctterminateCause());
		attributes.put("ServiceTypr", getServiceTypr());
		attributes.put("FramedProtocol", getFramedProtocol());
		attributes.put("FramedIPAddress", getFramedIPAddress());
		attributes.put("AcctStartDelay", getAcctStartDelay());
		attributes.put("AcctStopDelay", getAcctStopDelay());
		attributes.put("IsActive", getIsActive());
		attributes.put("Created_On", getCreated_On());
		attributes.put("Created_By", getCreated_By());
		attributes.put("Updated_On", getUpdated_On());
		attributes.put("Updated_By", getUpdated_By());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long RadAcctId = (Long)attributes.get("RadAcctId");

		if (RadAcctId != null) {
			setRadAcctId(RadAcctId);
		}

		Long radcheck_id = (Long)attributes.get("radcheck_id");

		if (radcheck_id != null) {
			setRadcheck_id(radcheck_id);
		}

		String AcctSessionId = (String)attributes.get("AcctSessionId");

		if (AcctSessionId != null) {
			setAcctSessionId(AcctSessionId);
		}

		String AcctUniqueId = (String)attributes.get("AcctUniqueId");

		if (AcctUniqueId != null) {
			setAcctUniqueId(AcctUniqueId);
		}

		String Realm = (String)attributes.get("Realm");

		if (Realm != null) {
			setRealm(Realm);
		}

		String NASIPAddress = (String)attributes.get("NASIPAddress");

		if (NASIPAddress != null) {
			setNASIPAddress(NASIPAddress);
		}

		String NASPortId = (String)attributes.get("NASPortId");

		if (NASPortId != null) {
			setNASPortId(NASPortId);
		}

		String NASPortType = (String)attributes.get("NASPortType");

		if (NASPortType != null) {
			setNASPortType(NASPortType);
		}

		Date AcctStartTime = (Date)attributes.get("AcctStartTime");

		if (AcctStartTime != null) {
			setAcctStartTime(AcctStartTime);
		}

		Date AcctStopTime = (Date)attributes.get("AcctStopTime");

		if (AcctStopTime != null) {
			setAcctStopTime(AcctStopTime);
		}

		Long AcctSessionTime = (Long)attributes.get("AcctSessionTime");

		if (AcctSessionTime != null) {
			setAcctSessionTime(AcctSessionTime);
		}

		String AcctAuthentic = (String)attributes.get("AcctAuthentic");

		if (AcctAuthentic != null) {
			setAcctAuthentic(AcctAuthentic);
		}

		String ConnectInfo_start = (String)attributes.get("ConnectInfo_start");

		if (ConnectInfo_start != null) {
			setConnectInfo_start(ConnectInfo_start);
		}

		String ConnectInfo_stop = (String)attributes.get("ConnectInfo_stop");

		if (ConnectInfo_stop != null) {
			setConnectInfo_stop(ConnectInfo_stop);
		}

		Long AcctInputOctets = (Long)attributes.get("AcctInputOctets");

		if (AcctInputOctets != null) {
			setAcctInputOctets(AcctInputOctets);
		}

		Long AcctOutputOctets = (Long)attributes.get("AcctOutputOctets");

		if (AcctOutputOctets != null) {
			setAcctOutputOctets(AcctOutputOctets);
		}

		String CalledStationId = (String)attributes.get("CalledStationId");

		if (CalledStationId != null) {
			setCalledStationId(CalledStationId);
		}

		String CallingStationId = (String)attributes.get("CallingStationId");

		if (CallingStationId != null) {
			setCallingStationId(CallingStationId);
		}

		String AcctterminateCause = (String)attributes.get("AcctterminateCause");

		if (AcctterminateCause != null) {
			setAcctterminateCause(AcctterminateCause);
		}

		String ServiceTypr = (String)attributes.get("ServiceTypr");

		if (ServiceTypr != null) {
			setServiceTypr(ServiceTypr);
		}

		String FramedProtocol = (String)attributes.get("FramedProtocol");

		if (FramedProtocol != null) {
			setFramedProtocol(FramedProtocol);
		}

		String FramedIPAddress = (String)attributes.get("FramedIPAddress");

		if (FramedIPAddress != null) {
			setFramedIPAddress(FramedIPAddress);
		}

		Long AcctStartDelay = (Long)attributes.get("AcctStartDelay");

		if (AcctStartDelay != null) {
			setAcctStartDelay(AcctStartDelay);
		}

		Long AcctStopDelay = (Long)attributes.get("AcctStopDelay");

		if (AcctStopDelay != null) {
			setAcctStopDelay(AcctStopDelay);
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
	* Returns the primary key of this s m a_radacct.
	*
	* @return the primary key of this s m a_radacct
	*/
	public long getPrimaryKey() {
		return _sma_radacct.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s m a_radacct.
	*
	* @param primaryKey the primary key of this s m a_radacct
	*/
	public void setPrimaryKey(long primaryKey) {
		_sma_radacct.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the rad acct ID of this s m a_radacct.
	*
	* @return the rad acct ID of this s m a_radacct
	*/
	public long getRadAcctId() {
		return _sma_radacct.getRadAcctId();
	}

	/**
	* Sets the rad acct ID of this s m a_radacct.
	*
	* @param RadAcctId the rad acct ID of this s m a_radacct
	*/
	public void setRadAcctId(long RadAcctId) {
		_sma_radacct.setRadAcctId(RadAcctId);
	}

	/**
	* Returns the radcheck_id of this s m a_radacct.
	*
	* @return the radcheck_id of this s m a_radacct
	*/
	public long getRadcheck_id() {
		return _sma_radacct.getRadcheck_id();
	}

	/**
	* Sets the radcheck_id of this s m a_radacct.
	*
	* @param radcheck_id the radcheck_id of this s m a_radacct
	*/
	public void setRadcheck_id(long radcheck_id) {
		_sma_radacct.setRadcheck_id(radcheck_id);
	}

	/**
	* Returns the acct session ID of this s m a_radacct.
	*
	* @return the acct session ID of this s m a_radacct
	*/
	public java.lang.String getAcctSessionId() {
		return _sma_radacct.getAcctSessionId();
	}

	/**
	* Sets the acct session ID of this s m a_radacct.
	*
	* @param AcctSessionId the acct session ID of this s m a_radacct
	*/
	public void setAcctSessionId(java.lang.String AcctSessionId) {
		_sma_radacct.setAcctSessionId(AcctSessionId);
	}

	/**
	* Returns the acct unique ID of this s m a_radacct.
	*
	* @return the acct unique ID of this s m a_radacct
	*/
	public java.lang.String getAcctUniqueId() {
		return _sma_radacct.getAcctUniqueId();
	}

	/**
	* Sets the acct unique ID of this s m a_radacct.
	*
	* @param AcctUniqueId the acct unique ID of this s m a_radacct
	*/
	public void setAcctUniqueId(java.lang.String AcctUniqueId) {
		_sma_radacct.setAcctUniqueId(AcctUniqueId);
	}

	/**
	* Returns the realm of this s m a_radacct.
	*
	* @return the realm of this s m a_radacct
	*/
	public java.lang.String getRealm() {
		return _sma_radacct.getRealm();
	}

	/**
	* Sets the realm of this s m a_radacct.
	*
	* @param Realm the realm of this s m a_radacct
	*/
	public void setRealm(java.lang.String Realm) {
		_sma_radacct.setRealm(Realm);
	}

	/**
	* Returns the n a s i p address of this s m a_radacct.
	*
	* @return the n a s i p address of this s m a_radacct
	*/
	public java.lang.String getNASIPAddress() {
		return _sma_radacct.getNASIPAddress();
	}

	/**
	* Sets the n a s i p address of this s m a_radacct.
	*
	* @param NASIPAddress the n a s i p address of this s m a_radacct
	*/
	public void setNASIPAddress(java.lang.String NASIPAddress) {
		_sma_radacct.setNASIPAddress(NASIPAddress);
	}

	/**
	* Returns the n a s port ID of this s m a_radacct.
	*
	* @return the n a s port ID of this s m a_radacct
	*/
	public java.lang.String getNASPortId() {
		return _sma_radacct.getNASPortId();
	}

	/**
	* Sets the n a s port ID of this s m a_radacct.
	*
	* @param NASPortId the n a s port ID of this s m a_radacct
	*/
	public void setNASPortId(java.lang.String NASPortId) {
		_sma_radacct.setNASPortId(NASPortId);
	}

	/**
	* Returns the n a s port type of this s m a_radacct.
	*
	* @return the n a s port type of this s m a_radacct
	*/
	public java.lang.String getNASPortType() {
		return _sma_radacct.getNASPortType();
	}

	/**
	* Sets the n a s port type of this s m a_radacct.
	*
	* @param NASPortType the n a s port type of this s m a_radacct
	*/
	public void setNASPortType(java.lang.String NASPortType) {
		_sma_radacct.setNASPortType(NASPortType);
	}

	/**
	* Returns the acct start time of this s m a_radacct.
	*
	* @return the acct start time of this s m a_radacct
	*/
	public java.util.Date getAcctStartTime() {
		return _sma_radacct.getAcctStartTime();
	}

	/**
	* Sets the acct start time of this s m a_radacct.
	*
	* @param AcctStartTime the acct start time of this s m a_radacct
	*/
	public void setAcctStartTime(java.util.Date AcctStartTime) {
		_sma_radacct.setAcctStartTime(AcctStartTime);
	}

	/**
	* Returns the acct stop time of this s m a_radacct.
	*
	* @return the acct stop time of this s m a_radacct
	*/
	public java.util.Date getAcctStopTime() {
		return _sma_radacct.getAcctStopTime();
	}

	/**
	* Sets the acct stop time of this s m a_radacct.
	*
	* @param AcctStopTime the acct stop time of this s m a_radacct
	*/
	public void setAcctStopTime(java.util.Date AcctStopTime) {
		_sma_radacct.setAcctStopTime(AcctStopTime);
	}

	/**
	* Returns the acct session time of this s m a_radacct.
	*
	* @return the acct session time of this s m a_radacct
	*/
	public long getAcctSessionTime() {
		return _sma_radacct.getAcctSessionTime();
	}

	/**
	* Sets the acct session time of this s m a_radacct.
	*
	* @param AcctSessionTime the acct session time of this s m a_radacct
	*/
	public void setAcctSessionTime(long AcctSessionTime) {
		_sma_radacct.setAcctSessionTime(AcctSessionTime);
	}

	/**
	* Returns the acct authentic of this s m a_radacct.
	*
	* @return the acct authentic of this s m a_radacct
	*/
	public java.lang.String getAcctAuthentic() {
		return _sma_radacct.getAcctAuthentic();
	}

	/**
	* Sets the acct authentic of this s m a_radacct.
	*
	* @param AcctAuthentic the acct authentic of this s m a_radacct
	*/
	public void setAcctAuthentic(java.lang.String AcctAuthentic) {
		_sma_radacct.setAcctAuthentic(AcctAuthentic);
	}

	/**
	* Returns the connect info_start of this s m a_radacct.
	*
	* @return the connect info_start of this s m a_radacct
	*/
	public java.lang.String getConnectInfo_start() {
		return _sma_radacct.getConnectInfo_start();
	}

	/**
	* Sets the connect info_start of this s m a_radacct.
	*
	* @param ConnectInfo_start the connect info_start of this s m a_radacct
	*/
	public void setConnectInfo_start(java.lang.String ConnectInfo_start) {
		_sma_radacct.setConnectInfo_start(ConnectInfo_start);
	}

	/**
	* Returns the connect info_stop of this s m a_radacct.
	*
	* @return the connect info_stop of this s m a_radacct
	*/
	public java.lang.String getConnectInfo_stop() {
		return _sma_radacct.getConnectInfo_stop();
	}

	/**
	* Sets the connect info_stop of this s m a_radacct.
	*
	* @param ConnectInfo_stop the connect info_stop of this s m a_radacct
	*/
	public void setConnectInfo_stop(java.lang.String ConnectInfo_stop) {
		_sma_radacct.setConnectInfo_stop(ConnectInfo_stop);
	}

	/**
	* Returns the acct input octets of this s m a_radacct.
	*
	* @return the acct input octets of this s m a_radacct
	*/
	public long getAcctInputOctets() {
		return _sma_radacct.getAcctInputOctets();
	}

	/**
	* Sets the acct input octets of this s m a_radacct.
	*
	* @param AcctInputOctets the acct input octets of this s m a_radacct
	*/
	public void setAcctInputOctets(long AcctInputOctets) {
		_sma_radacct.setAcctInputOctets(AcctInputOctets);
	}

	/**
	* Returns the acct output octets of this s m a_radacct.
	*
	* @return the acct output octets of this s m a_radacct
	*/
	public long getAcctOutputOctets() {
		return _sma_radacct.getAcctOutputOctets();
	}

	/**
	* Sets the acct output octets of this s m a_radacct.
	*
	* @param AcctOutputOctets the acct output octets of this s m a_radacct
	*/
	public void setAcctOutputOctets(long AcctOutputOctets) {
		_sma_radacct.setAcctOutputOctets(AcctOutputOctets);
	}

	/**
	* Returns the called station ID of this s m a_radacct.
	*
	* @return the called station ID of this s m a_radacct
	*/
	public java.lang.String getCalledStationId() {
		return _sma_radacct.getCalledStationId();
	}

	/**
	* Sets the called station ID of this s m a_radacct.
	*
	* @param CalledStationId the called station ID of this s m a_radacct
	*/
	public void setCalledStationId(java.lang.String CalledStationId) {
		_sma_radacct.setCalledStationId(CalledStationId);
	}

	/**
	* Returns the calling station ID of this s m a_radacct.
	*
	* @return the calling station ID of this s m a_radacct
	*/
	public java.lang.String getCallingStationId() {
		return _sma_radacct.getCallingStationId();
	}

	/**
	* Sets the calling station ID of this s m a_radacct.
	*
	* @param CallingStationId the calling station ID of this s m a_radacct
	*/
	public void setCallingStationId(java.lang.String CallingStationId) {
		_sma_radacct.setCallingStationId(CallingStationId);
	}

	/**
	* Returns the acctterminate cause of this s m a_radacct.
	*
	* @return the acctterminate cause of this s m a_radacct
	*/
	public java.lang.String getAcctterminateCause() {
		return _sma_radacct.getAcctterminateCause();
	}

	/**
	* Sets the acctterminate cause of this s m a_radacct.
	*
	* @param AcctterminateCause the acctterminate cause of this s m a_radacct
	*/
	public void setAcctterminateCause(java.lang.String AcctterminateCause) {
		_sma_radacct.setAcctterminateCause(AcctterminateCause);
	}

	/**
	* Returns the service typr of this s m a_radacct.
	*
	* @return the service typr of this s m a_radacct
	*/
	public java.lang.String getServiceTypr() {
		return _sma_radacct.getServiceTypr();
	}

	/**
	* Sets the service typr of this s m a_radacct.
	*
	* @param ServiceTypr the service typr of this s m a_radacct
	*/
	public void setServiceTypr(java.lang.String ServiceTypr) {
		_sma_radacct.setServiceTypr(ServiceTypr);
	}

	/**
	* Returns the framed protocol of this s m a_radacct.
	*
	* @return the framed protocol of this s m a_radacct
	*/
	public java.lang.String getFramedProtocol() {
		return _sma_radacct.getFramedProtocol();
	}

	/**
	* Sets the framed protocol of this s m a_radacct.
	*
	* @param FramedProtocol the framed protocol of this s m a_radacct
	*/
	public void setFramedProtocol(java.lang.String FramedProtocol) {
		_sma_radacct.setFramedProtocol(FramedProtocol);
	}

	/**
	* Returns the framed i p address of this s m a_radacct.
	*
	* @return the framed i p address of this s m a_radacct
	*/
	public java.lang.String getFramedIPAddress() {
		return _sma_radacct.getFramedIPAddress();
	}

	/**
	* Sets the framed i p address of this s m a_radacct.
	*
	* @param FramedIPAddress the framed i p address of this s m a_radacct
	*/
	public void setFramedIPAddress(java.lang.String FramedIPAddress) {
		_sma_radacct.setFramedIPAddress(FramedIPAddress);
	}

	/**
	* Returns the acct start delay of this s m a_radacct.
	*
	* @return the acct start delay of this s m a_radacct
	*/
	public long getAcctStartDelay() {
		return _sma_radacct.getAcctStartDelay();
	}

	/**
	* Sets the acct start delay of this s m a_radacct.
	*
	* @param AcctStartDelay the acct start delay of this s m a_radacct
	*/
	public void setAcctStartDelay(long AcctStartDelay) {
		_sma_radacct.setAcctStartDelay(AcctStartDelay);
	}

	/**
	* Returns the acct stop delay of this s m a_radacct.
	*
	* @return the acct stop delay of this s m a_radacct
	*/
	public long getAcctStopDelay() {
		return _sma_radacct.getAcctStopDelay();
	}

	/**
	* Sets the acct stop delay of this s m a_radacct.
	*
	* @param AcctStopDelay the acct stop delay of this s m a_radacct
	*/
	public void setAcctStopDelay(long AcctStopDelay) {
		_sma_radacct.setAcctStopDelay(AcctStopDelay);
	}

	/**
	* Returns the is active of this s m a_radacct.
	*
	* @return the is active of this s m a_radacct
	*/
	public int getIsActive() {
		return _sma_radacct.getIsActive();
	}

	/**
	* Sets the is active of this s m a_radacct.
	*
	* @param IsActive the is active of this s m a_radacct
	*/
	public void setIsActive(int IsActive) {
		_sma_radacct.setIsActive(IsActive);
	}

	/**
	* Returns the created_ on of this s m a_radacct.
	*
	* @return the created_ on of this s m a_radacct
	*/
	public java.util.Date getCreated_On() {
		return _sma_radacct.getCreated_On();
	}

	/**
	* Sets the created_ on of this s m a_radacct.
	*
	* @param Created_On the created_ on of this s m a_radacct
	*/
	public void setCreated_On(java.util.Date Created_On) {
		_sma_radacct.setCreated_On(Created_On);
	}

	/**
	* Returns the created_ by of this s m a_radacct.
	*
	* @return the created_ by of this s m a_radacct
	*/
	public java.lang.String getCreated_By() {
		return _sma_radacct.getCreated_By();
	}

	/**
	* Sets the created_ by of this s m a_radacct.
	*
	* @param Created_By the created_ by of this s m a_radacct
	*/
	public void setCreated_By(java.lang.String Created_By) {
		_sma_radacct.setCreated_By(Created_By);
	}

	/**
	* Returns the updated_ on of this s m a_radacct.
	*
	* @return the updated_ on of this s m a_radacct
	*/
	public java.util.Date getUpdated_On() {
		return _sma_radacct.getUpdated_On();
	}

	/**
	* Sets the updated_ on of this s m a_radacct.
	*
	* @param Updated_On the updated_ on of this s m a_radacct
	*/
	public void setUpdated_On(java.util.Date Updated_On) {
		_sma_radacct.setUpdated_On(Updated_On);
	}

	/**
	* Returns the updated_ by of this s m a_radacct.
	*
	* @return the updated_ by of this s m a_radacct
	*/
	public java.lang.String getUpdated_By() {
		return _sma_radacct.getUpdated_By();
	}

	/**
	* Sets the updated_ by of this s m a_radacct.
	*
	* @param Updated_By the updated_ by of this s m a_radacct
	*/
	public void setUpdated_By(java.lang.String Updated_By) {
		_sma_radacct.setUpdated_By(Updated_By);
	}

	public boolean isNew() {
		return _sma_radacct.isNew();
	}

	public void setNew(boolean n) {
		_sma_radacct.setNew(n);
	}

	public boolean isCachedModel() {
		return _sma_radacct.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_sma_radacct.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _sma_radacct.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _sma_radacct.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sma_radacct.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sma_radacct.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sma_radacct.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SMA_radacctWrapper((SMA_radacct)_sma_radacct.clone());
	}

	public int compareTo(com.pacnet.connect.model.SMA_radacct sma_radacct) {
		return _sma_radacct.compareTo(sma_radacct);
	}

	@Override
	public int hashCode() {
		return _sma_radacct.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.pacnet.connect.model.SMA_radacct> toCacheModel() {
		return _sma_radacct.toCacheModel();
	}

	public com.pacnet.connect.model.SMA_radacct toEscapedModel() {
		return new SMA_radacctWrapper(_sma_radacct.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sma_radacct.toString();
	}

	public java.lang.String toXmlString() {
		return _sma_radacct.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sma_radacct.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SMA_radacct getWrappedSMA_radacct() {
		return _sma_radacct;
	}

	public SMA_radacct getWrappedModel() {
		return _sma_radacct;
	}

	public void resetOriginalValues() {
		_sma_radacct.resetOriginalValues();
	}

	private SMA_radacct _sma_radacct;
}