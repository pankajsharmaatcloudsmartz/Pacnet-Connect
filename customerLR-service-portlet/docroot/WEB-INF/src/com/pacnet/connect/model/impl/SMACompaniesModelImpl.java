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

import com.pacnet.connect.model.SMACompanies;
import com.pacnet.connect.model.SMACompaniesModel;
import com.pacnet.connect.model.SMACompaniesSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the SMACompanies service. Represents a row in the &quot;PA_SMA_companies&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.pacnet.connect.model.SMACompaniesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SMACompaniesImpl}.
 * </p>
 *
 * @author CloudSmartz
 * @see SMACompaniesImpl
 * @see com.pacnet.connect.model.SMACompanies
 * @see com.pacnet.connect.model.SMACompaniesModel
 * @generated
 */
@JSON(strict = true)
public class SMACompaniesModelImpl extends BaseModelImpl<SMACompanies>
	implements SMACompaniesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a s m a companies model instance should use the {@link com.pacnet.connect.model.SMACompanies} interface instead.
	 */
	public static final String TABLE_NAME = "PA_SMA_companies";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "customer_id", Types.BIGINT },
			{ "companyName", Types.VARCHAR },
			{ "domains", Types.VARCHAR },
			{ "groupname", Types.VARCHAR },
			{ "attribute", Types.VARCHAR },
			{ "op", Types.VARCHAR },
			{ "value", Types.VARCHAR },
			{ "maxUser", Types.INTEGER },
			{ "IsActive", Types.INTEGER },
			{ "Created_On", Types.TIMESTAMP },
			{ "Created_By", Types.VARCHAR },
			{ "Updated_On", Types.TIMESTAMP },
			{ "Updated_By", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table PA_SMA_companies (id LONG not null primary key IDENTITY,customer_id LONG,companyName VARCHAR(75) null,domains VARCHAR(75) null,groupname VARCHAR(75) null,attribute VARCHAR(75) null,op VARCHAR(75) null,value VARCHAR(75) null,maxUser INTEGER,IsActive INTEGER,Created_On DATE null,Created_By VARCHAR(75) null,Updated_On DATE null,Updated_By VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table PA_SMA_companies";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.pacnet.connect.model.SMACompanies"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.pacnet.connect.model.SMACompanies"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.pacnet.connect.model.SMACompanies"),
			true);
	public static long CREATEDBY_COLUMN_BITMASK = 1L;
	public static long CUSTOMERID_COLUMN_BITMASK = 2L;
	public static long DOMAINS_COLUMN_BITMASK = 4L;
	public static long GROUPNAME_COLUMN_BITMASK = 8L;
	public static long ISACTIVE_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static SMACompanies toModel(SMACompaniesSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		SMACompanies model = new SMACompaniesImpl();

		model.setId(soapModel.getId());
		model.setCustomerId(soapModel.getCustomerId());
		model.setCompanyName(soapModel.getCompanyName());
		model.setDomains(soapModel.getDomains());
		model.setGroupName(soapModel.getGroupName());
		model.setAttribute(soapModel.getAttribute());
		model.setOp(soapModel.getOp());
		model.setValue(soapModel.getValue());
		model.setMaxUser(soapModel.getMaxUser());
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
	public static List<SMACompanies> toModels(SMACompaniesSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<SMACompanies> models = new ArrayList<SMACompanies>(soapModels.length);

		for (SMACompaniesSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.pacnet.connect.model.SMACompanies"));

	public SMACompaniesModelImpl() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return SMACompanies.class;
	}

	public String getModelClassName() {
		return SMACompanies.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("customerId", getCustomerId());
		attributes.put("companyName", getCompanyName());
		attributes.put("domains", getDomains());
		attributes.put("groupName", getGroupName());
		attributes.put("attribute", getAttribute());
		attributes.put("op", getOp());
		attributes.put("value", getValue());
		attributes.put("maxUser", getMaxUser());
		attributes.put("isActive", getIsActive());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedOn", getUpdatedOn());
		attributes.put("updatedBy", getUpdatedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String domains = (String)attributes.get("domains");

		if (domains != null) {
			setDomains(domains);
		}

		String groupName = (String)attributes.get("groupName");

		if (groupName != null) {
			setGroupName(groupName);
		}

		String attribute = (String)attributes.get("attribute");

		if (attribute != null) {
			setAttribute(attribute);
		}

		String op = (String)attributes.get("op");

		if (op != null) {
			setOp(op);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		Integer maxUser = (Integer)attributes.get("maxUser");

		if (maxUser != null) {
			setMaxUser(maxUser);
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
	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	@JSON
	public long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(long customerId) {
		_columnBitmask |= CUSTOMERID_COLUMN_BITMASK;

		if (!_setOriginalCustomerId) {
			_setOriginalCustomerId = true;

			_originalCustomerId = _customerId;
		}

		_customerId = customerId;
	}

	public long getOriginalCustomerId() {
		return _originalCustomerId;
	}

	@JSON
	public String getCompanyName() {
		if (_companyName == null) {
			return StringPool.BLANK;
		}
		else {
			return _companyName;
		}
	}

	public void setCompanyName(String companyName) {
		_companyName = companyName;
	}

	@JSON
	public String getDomains() {
		if (_domains == null) {
			return StringPool.BLANK;
		}
		else {
			return _domains;
		}
	}

	public void setDomains(String domains) {
		_columnBitmask |= DOMAINS_COLUMN_BITMASK;

		if (_originalDomains == null) {
			_originalDomains = _domains;
		}

		_domains = domains;
	}

	public String getOriginalDomains() {
		return GetterUtil.getString(_originalDomains);
	}

	@JSON
	public String getGroupName() {
		if (_groupName == null) {
			return StringPool.BLANK;
		}
		else {
			return _groupName;
		}
	}

	public void setGroupName(String groupName) {
		_columnBitmask |= GROUPNAME_COLUMN_BITMASK;

		if (_originalGroupName == null) {
			_originalGroupName = _groupName;
		}

		_groupName = groupName;
	}

	public String getOriginalGroupName() {
		return GetterUtil.getString(_originalGroupName);
	}

	@JSON
	public String getAttribute() {
		if (_attribute == null) {
			return StringPool.BLANK;
		}
		else {
			return _attribute;
		}
	}

	public void setAttribute(String attribute) {
		_attribute = attribute;
	}

	@JSON
	public String getOp() {
		if (_op == null) {
			return StringPool.BLANK;
		}
		else {
			return _op;
		}
	}

	public void setOp(String op) {
		_op = op;
	}

	@JSON
	public String getValue() {
		if (_value == null) {
			return StringPool.BLANK;
		}
		else {
			return _value;
		}
	}

	public void setValue(String value) {
		_value = value;
	}

	@JSON
	public int getMaxUser() {
		return _maxUser;
	}

	public void setMaxUser(int maxUser) {
		_maxUser = maxUser;
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
		_columnBitmask |= CREATEDBY_COLUMN_BITMASK;

		if (_originalCreatedBy == null) {
			_originalCreatedBy = _createdBy;
		}

		_createdBy = createdBy;
	}

	public String getOriginalCreatedBy() {
		return GetterUtil.getString(_originalCreatedBy);
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
			SMACompanies.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SMACompanies toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (SMACompanies)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		SMACompaniesImpl smaCompaniesImpl = new SMACompaniesImpl();

		smaCompaniesImpl.setId(getId());
		smaCompaniesImpl.setCustomerId(getCustomerId());
		smaCompaniesImpl.setCompanyName(getCompanyName());
		smaCompaniesImpl.setDomains(getDomains());
		smaCompaniesImpl.setGroupName(getGroupName());
		smaCompaniesImpl.setAttribute(getAttribute());
		smaCompaniesImpl.setOp(getOp());
		smaCompaniesImpl.setValue(getValue());
		smaCompaniesImpl.setMaxUser(getMaxUser());
		smaCompaniesImpl.setIsActive(getIsActive());
		smaCompaniesImpl.setCreatedOn(getCreatedOn());
		smaCompaniesImpl.setCreatedBy(getCreatedBy());
		smaCompaniesImpl.setUpdatedOn(getUpdatedOn());
		smaCompaniesImpl.setUpdatedBy(getUpdatedBy());

		smaCompaniesImpl.resetOriginalValues();

		return smaCompaniesImpl;
	}

	public int compareTo(SMACompanies smaCompanies) {
		long primaryKey = smaCompanies.getPrimaryKey();

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

		SMACompanies smaCompanies = null;

		try {
			smaCompanies = (SMACompanies)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = smaCompanies.getPrimaryKey();

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
		SMACompaniesModelImpl smaCompaniesModelImpl = this;

		smaCompaniesModelImpl._originalCustomerId = smaCompaniesModelImpl._customerId;

		smaCompaniesModelImpl._setOriginalCustomerId = false;

		smaCompaniesModelImpl._originalDomains = smaCompaniesModelImpl._domains;

		smaCompaniesModelImpl._originalGroupName = smaCompaniesModelImpl._groupName;

		smaCompaniesModelImpl._originalIsActive = smaCompaniesModelImpl._isActive;

		smaCompaniesModelImpl._setOriginalIsActive = false;

		smaCompaniesModelImpl._originalCreatedBy = smaCompaniesModelImpl._createdBy;

		smaCompaniesModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SMACompanies> toCacheModel() {
		SMACompaniesCacheModel smaCompaniesCacheModel = new SMACompaniesCacheModel();

		smaCompaniesCacheModel.id = getId();

		smaCompaniesCacheModel.customerId = getCustomerId();

		smaCompaniesCacheModel.companyName = getCompanyName();

		String companyName = smaCompaniesCacheModel.companyName;

		if ((companyName != null) && (companyName.length() == 0)) {
			smaCompaniesCacheModel.companyName = null;
		}

		smaCompaniesCacheModel.domains = getDomains();

		String domains = smaCompaniesCacheModel.domains;

		if ((domains != null) && (domains.length() == 0)) {
			smaCompaniesCacheModel.domains = null;
		}

		smaCompaniesCacheModel.groupName = getGroupName();

		String groupName = smaCompaniesCacheModel.groupName;

		if ((groupName != null) && (groupName.length() == 0)) {
			smaCompaniesCacheModel.groupName = null;
		}

		smaCompaniesCacheModel.attribute = getAttribute();

		String attribute = smaCompaniesCacheModel.attribute;

		if ((attribute != null) && (attribute.length() == 0)) {
			smaCompaniesCacheModel.attribute = null;
		}

		smaCompaniesCacheModel.op = getOp();

		String op = smaCompaniesCacheModel.op;

		if ((op != null) && (op.length() == 0)) {
			smaCompaniesCacheModel.op = null;
		}

		smaCompaniesCacheModel.value = getValue();

		String value = smaCompaniesCacheModel.value;

		if ((value != null) && (value.length() == 0)) {
			smaCompaniesCacheModel.value = null;
		}

		smaCompaniesCacheModel.maxUser = getMaxUser();

		smaCompaniesCacheModel.isActive = getIsActive();

		Date createdOn = getCreatedOn();

		if (createdOn != null) {
			smaCompaniesCacheModel.createdOn = createdOn.getTime();
		}
		else {
			smaCompaniesCacheModel.createdOn = Long.MIN_VALUE;
		}

		smaCompaniesCacheModel.createdBy = getCreatedBy();

		String createdBy = smaCompaniesCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			smaCompaniesCacheModel.createdBy = null;
		}

		Date updatedOn = getUpdatedOn();

		if (updatedOn != null) {
			smaCompaniesCacheModel.updatedOn = updatedOn.getTime();
		}
		else {
			smaCompaniesCacheModel.updatedOn = Long.MIN_VALUE;
		}

		smaCompaniesCacheModel.updatedBy = getUpdatedBy();

		String updatedBy = smaCompaniesCacheModel.updatedBy;

		if ((updatedBy != null) && (updatedBy.length() == 0)) {
			smaCompaniesCacheModel.updatedBy = null;
		}

		return smaCompaniesCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", customerId=");
		sb.append(getCustomerId());
		sb.append(", companyName=");
		sb.append(getCompanyName());
		sb.append(", domains=");
		sb.append(getDomains());
		sb.append(", groupName=");
		sb.append(getGroupName());
		sb.append(", attribute=");
		sb.append(getAttribute());
		sb.append(", op=");
		sb.append(getOp());
		sb.append(", value=");
		sb.append(getValue());
		sb.append(", maxUser=");
		sb.append(getMaxUser());
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
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.SMACompanies");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerId</column-name><column-value><![CDATA[");
		sb.append(getCustomerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyName</column-name><column-value><![CDATA[");
		sb.append(getCompanyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>domains</column-name><column-value><![CDATA[");
		sb.append(getDomains());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupName</column-name><column-value><![CDATA[");
		sb.append(getGroupName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attribute</column-name><column-value><![CDATA[");
		sb.append(getAttribute());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>op</column-name><column-value><![CDATA[");
		sb.append(getOp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>value</column-name><column-value><![CDATA[");
		sb.append(getValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maxUser</column-name><column-value><![CDATA[");
		sb.append(getMaxUser());
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

	private static ClassLoader _classLoader = SMACompanies.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			SMACompanies.class
		};
	private long _id;
	private long _customerId;
	private long _originalCustomerId;
	private boolean _setOriginalCustomerId;
	private String _companyName;
	private String _domains;
	private String _originalDomains;
	private String _groupName;
	private String _originalGroupName;
	private String _attribute;
	private String _op;
	private String _value;
	private int _maxUser;
	private int _isActive;
	private int _originalIsActive;
	private boolean _setOriginalIsActive;
	private Date _createdOn;
	private String _createdBy;
	private String _originalCreatedBy;
	private Date _updatedOn;
	private String _updatedBy;
	private long _columnBitmask;
	private SMACompanies _escapedModelProxy;
}