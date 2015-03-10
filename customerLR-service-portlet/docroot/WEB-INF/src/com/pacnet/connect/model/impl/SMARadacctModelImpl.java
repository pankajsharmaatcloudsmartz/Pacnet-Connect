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

package com.pacnet.connect.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.pacnet.connect.model.SMARadacct;
import com.pacnet.connect.model.SMARadacctModel;
import com.pacnet.connect.model.SMARadacctSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the SMARadacct service. Represents a row in the &quot;PA_SMA_radacct&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.pacnet.connect.model.SMARadacctModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SMARadacctImpl}.
 * </p>
 *
 * @author CloudSmartz
 * @see SMARadacctImpl
 * @see com.pacnet.connect.model.SMARadacct
 * @see com.pacnet.connect.model.SMARadacctModel
 * @generated
 */
@JSON(strict = true)
public class SMARadacctModelImpl extends BaseModelImpl<SMARadacct>
	implements SMARadacctModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a s m a radacct model instance should use the {@link com.pacnet.connect.model.SMARadacct} interface instead.
	 */
	public static final String TABLE_NAME = "PA_SMA_radacct";
	public static final Object[][] TABLE_COLUMNS = {
			{ "RadAcctId", Types.BIGINT },
			{ "radcheck_id", Types.BIGINT },
			{ "AcctSessionId", Types.VARCHAR },
			{ "Realm", Types.VARCHAR },
			{ "AcctStartTime", Types.TIMESTAMP },
			{ "AcctStopTime", Types.TIMESTAMP },
			{ "AcctSessionTime", Types.BIGINT },
			{ "AcctTerminateCause", Types.VARCHAR },
			{ "IsActive", Types.INTEGER },
			{ "Created_On", Types.TIMESTAMP },
			{ "Created_By", Types.VARCHAR },
			{ "Updated_On", Types.TIMESTAMP },
			{ "Updated_By", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table PA_SMA_radacct (RadAcctId LONG not null primary key IDENTITY,radcheck_id LONG,AcctSessionId VARCHAR(75) null,Realm VARCHAR(75) null,AcctStartTime DATE null,AcctStopTime DATE null,AcctSessionTime LONG,AcctTerminateCause VARCHAR(75) null,IsActive INTEGER,Created_On DATE null,Created_By VARCHAR(75) null,Updated_On DATE null,Updated_By VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table PA_SMA_radacct";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.pacnet.connect.model.SMARadacct"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.pacnet.connect.model.SMARadacct"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.pacnet.connect.model.SMARadacct"),
			true);
	public static long ISACTIVE_COLUMN_BITMASK = 1L;
	public static long RADCHECKID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static SMARadacct toModel(SMARadacctSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		SMARadacct model = new SMARadacctImpl();

		model.setRadAcctId(soapModel.getRadAcctId());
		model.setRadcheckId(soapModel.getRadcheckId());
		model.setAcctSessionId(soapModel.getAcctSessionId());
		model.setRealm(soapModel.getRealm());
		model.setAcctStartTime(soapModel.getAcctStartTime());
		model.setAcctStopTime(soapModel.getAcctStopTime());
		model.setAcctSessionTime(soapModel.getAcctSessionTime());
		model.setAcctterminateCause(soapModel.getAcctterminateCause());
		model.setIsActive(soapModel.getIsActive());
		model.setCreatedOn(soapModel.getCreatedOn());
		model.setCreatedBy(soapModel.getCreatedBy());
		model.setUpdatedOn(soapModel.getUpdatedOn());
		model.setUpdatedBy(soapModel.getUpdatedBy());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<SMARadacct> toModels(SMARadacctSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<SMARadacct> models = new ArrayList<SMARadacct>(soapModels.length);

		for (SMARadacctSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.pacnet.connect.model.SMARadacct"));

	public SMARadacctModelImpl() {
	}

	public long getPrimaryKey() {
		return _radAcctId;
	}

	public void setPrimaryKey(long primaryKey) {
		setRadAcctId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_radAcctId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return SMARadacct.class;
	}

	public String getModelClassName() {
		return SMARadacct.class.getName();
	}

	@Override
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

	@Override
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

	@JSON
	public long getRadAcctId() {
		return _radAcctId;
	}

	public void setRadAcctId(long radAcctId) {
		_radAcctId = radAcctId;
	}

	@JSON
	public long getRadcheckId() {
		return _radcheckId;
	}

	public void setRadcheckId(long radcheckId) {
		_columnBitmask |= RADCHECKID_COLUMN_BITMASK;

		if (!_setOriginalRadcheckId) {
			_setOriginalRadcheckId = true;

			_originalRadcheckId = _radcheckId;
		}

		_radcheckId = radcheckId;
	}

	public long getOriginalRadcheckId() {
		return _originalRadcheckId;
	}

	@JSON
	public String getAcctSessionId() {
		if (_acctSessionId == null) {
			return StringPool.BLANK;
		}
		else {
			return _acctSessionId;
		}
	}

	public void setAcctSessionId(String acctSessionId) {
		_acctSessionId = acctSessionId;
	}

	@JSON
	public String getRealm() {
		if (_realm == null) {
			return StringPool.BLANK;
		}
		else {
			return _realm;
		}
	}

	public void setRealm(String realm) {
		_realm = realm;
	}

	@JSON
	public Date getAcctStartTime() {
		return _acctStartTime;
	}

	public void setAcctStartTime(Date acctStartTime) {
		_acctStartTime = acctStartTime;
	}

	@JSON
	public Date getAcctStopTime() {
		return _acctStopTime;
	}

	public void setAcctStopTime(Date acctStopTime) {
		_acctStopTime = acctStopTime;
	}

	@JSON
	public long getAcctSessionTime() {
		return _acctSessionTime;
	}

	public void setAcctSessionTime(long acctSessionTime) {
		_acctSessionTime = acctSessionTime;
	}

	@JSON
	public String getAcctterminateCause() {
		if (_acctterminateCause == null) {
			return StringPool.BLANK;
		}
		else {
			return _acctterminateCause;
		}
	}

	public void setAcctterminateCause(String acctterminateCause) {
		_acctterminateCause = acctterminateCause;
	}

	@JSON
	public int getIsActive() {
		return _isActive;
	}

	public void setIsActive(int isActive) {
		_columnBitmask |= ISACTIVE_COLUMN_BITMASK;

		if (!_setOriginalIsActive) {
			_setOriginalIsActive = true;

			_originalIsActive = _isActive;
		}

		_isActive = isActive;
	}

	public int getOriginalIsActive() {
		return _originalIsActive;
	}

	@JSON
	public Date getCreatedOn() {
		return _createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		_createdOn = createdOn;
	}

	@JSON
	public String getCreatedBy() {
		if (_createdBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _createdBy;
		}
	}

	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;
	}

	@JSON
	public Date getUpdatedOn() {
		return _updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		_updatedOn = updatedOn;
	}

	@JSON
	public String getUpdatedBy() {
		if (_updatedBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _updatedBy;
		}
	}

	public void setUpdatedBy(String updatedBy) {
		_updatedBy = updatedBy;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			SMARadacct.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SMARadacct toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (SMARadacct)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		SMARadacctImpl smaRadacctImpl = new SMARadacctImpl();

		smaRadacctImpl.setRadAcctId(getRadAcctId());
		smaRadacctImpl.setRadcheckId(getRadcheckId());
		smaRadacctImpl.setAcctSessionId(getAcctSessionId());
		smaRadacctImpl.setRealm(getRealm());
		smaRadacctImpl.setAcctStartTime(getAcctStartTime());
		smaRadacctImpl.setAcctStopTime(getAcctStopTime());
		smaRadacctImpl.setAcctSessionTime(getAcctSessionTime());
		smaRadacctImpl.setAcctterminateCause(getAcctterminateCause());
		smaRadacctImpl.setIsActive(getIsActive());
		smaRadacctImpl.setCreatedOn(getCreatedOn());
		smaRadacctImpl.setCreatedBy(getCreatedBy());
		smaRadacctImpl.setUpdatedOn(getUpdatedOn());
		smaRadacctImpl.setUpdatedBy(getUpdatedBy());

		smaRadacctImpl.resetOriginalValues();

		return smaRadacctImpl;
	}

	public int compareTo(SMARadacct smaRadacct) {
		long primaryKey = smaRadacct.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		SMARadacct smaRadacct = null;

		try {
			smaRadacct = (SMARadacct)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = smaRadacct.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		SMARadacctModelImpl smaRadacctModelImpl = this;

		smaRadacctModelImpl._originalRadcheckId = smaRadacctModelImpl._radcheckId;

		smaRadacctModelImpl._setOriginalRadcheckId = false;

		smaRadacctModelImpl._originalIsActive = smaRadacctModelImpl._isActive;

		smaRadacctModelImpl._setOriginalIsActive = false;

		smaRadacctModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SMARadacct> toCacheModel() {
		SMARadacctCacheModel smaRadacctCacheModel = new SMARadacctCacheModel();

		smaRadacctCacheModel.radAcctId = getRadAcctId();

		smaRadacctCacheModel.radcheckId = getRadcheckId();

		smaRadacctCacheModel.acctSessionId = getAcctSessionId();

		String acctSessionId = smaRadacctCacheModel.acctSessionId;

		if ((acctSessionId != null) && (acctSessionId.length() == 0)) {
			smaRadacctCacheModel.acctSessionId = null;
		}

		smaRadacctCacheModel.realm = getRealm();

		String realm = smaRadacctCacheModel.realm;

		if ((realm != null) && (realm.length() == 0)) {
			smaRadacctCacheModel.realm = null;
		}

		Date acctStartTime = getAcctStartTime();

		if (acctStartTime != null) {
			smaRadacctCacheModel.acctStartTime = acctStartTime.getTime();
		}
		else {
			smaRadacctCacheModel.acctStartTime = Long.MIN_VALUE;
		}

		Date acctStopTime = getAcctStopTime();

		if (acctStopTime != null) {
			smaRadacctCacheModel.acctStopTime = acctStopTime.getTime();
		}
		else {
			smaRadacctCacheModel.acctStopTime = Long.MIN_VALUE;
		}

		smaRadacctCacheModel.acctSessionTime = getAcctSessionTime();

		smaRadacctCacheModel.acctterminateCause = getAcctterminateCause();

		String acctterminateCause = smaRadacctCacheModel.acctterminateCause;

		if ((acctterminateCause != null) && (acctterminateCause.length() == 0)) {
			smaRadacctCacheModel.acctterminateCause = null;
		}

		smaRadacctCacheModel.isActive = getIsActive();

		Date createdOn = getCreatedOn();

		if (createdOn != null) {
			smaRadacctCacheModel.createdOn = createdOn.getTime();
		}
		else {
			smaRadacctCacheModel.createdOn = Long.MIN_VALUE;
		}

		smaRadacctCacheModel.createdBy = getCreatedBy();

		String createdBy = smaRadacctCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			smaRadacctCacheModel.createdBy = null;
		}

		Date updatedOn = getUpdatedOn();

		if (updatedOn != null) {
			smaRadacctCacheModel.updatedOn = updatedOn.getTime();
		}
		else {
			smaRadacctCacheModel.updatedOn = Long.MIN_VALUE;
		}

		smaRadacctCacheModel.updatedBy = getUpdatedBy();

		String updatedBy = smaRadacctCacheModel.updatedBy;

		if ((updatedBy != null) && (updatedBy.length() == 0)) {
			smaRadacctCacheModel.updatedBy = null;
		}

		return smaRadacctCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{radAcctId=");
		sb.append(getRadAcctId());
		sb.append(", radcheckId=");
		sb.append(getRadcheckId());
		sb.append(", acctSessionId=");
		sb.append(getAcctSessionId());
		sb.append(", realm=");
		sb.append(getRealm());
		sb.append(", acctStartTime=");
		sb.append(getAcctStartTime());
		sb.append(", acctStopTime=");
		sb.append(getAcctStopTime());
		sb.append(", acctSessionTime=");
		sb.append(getAcctSessionTime());
		sb.append(", acctterminateCause=");
		sb.append(getAcctterminateCause());
		sb.append(", isActive=");
		sb.append(getIsActive());
		sb.append(", createdOn=");
		sb.append(getCreatedOn());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", updatedOn=");
		sb.append(getUpdatedOn());
		sb.append(", updatedBy=");
		sb.append(getUpdatedBy());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.SMARadacct");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>radAcctId</column-name><column-value><![CDATA[");
		sb.append(getRadAcctId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>radcheckId</column-name><column-value><![CDATA[");
		sb.append(getRadcheckId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acctSessionId</column-name><column-value><![CDATA[");
		sb.append(getAcctSessionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>realm</column-name><column-value><![CDATA[");
		sb.append(getRealm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acctStartTime</column-name><column-value><![CDATA[");
		sb.append(getAcctStartTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acctStopTime</column-name><column-value><![CDATA[");
		sb.append(getAcctStopTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acctSessionTime</column-name><column-value><![CDATA[");
		sb.append(getAcctSessionTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acctterminateCause</column-name><column-value><![CDATA[");
		sb.append(getAcctterminateCause());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdOn</column-name><column-value><![CDATA[");
		sb.append(getCreatedOn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedOn</column-name><column-value><![CDATA[");
		sb.append(getUpdatedOn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedBy</column-name><column-value><![CDATA[");
		sb.append(getUpdatedBy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = SMARadacct.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			SMARadacct.class
		};
	private long _radAcctId;
	private long _radcheckId;
	private long _originalRadcheckId;
	private boolean _setOriginalRadcheckId;
	private String _acctSessionId;
	private String _realm;
	private Date _acctStartTime;
	private Date _acctStopTime;
	private long _acctSessionTime;
	private String _acctterminateCause;
	private int _isActive;
	private int _originalIsActive;
	private boolean _setOriginalIsActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
	private long _columnBitmask;
	private SMARadacct _escapedModelProxy;
}