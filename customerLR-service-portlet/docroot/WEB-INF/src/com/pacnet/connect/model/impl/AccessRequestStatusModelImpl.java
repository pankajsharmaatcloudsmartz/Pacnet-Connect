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

import com.pacnet.connect.model.AccessRequestStatus;
import com.pacnet.connect.model.AccessRequestStatusModel;
import com.pacnet.connect.model.AccessRequestStatusSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the AccessRequestStatus service. Represents a row in the &quot;Access_Request_Status&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.pacnet.connect.model.AccessRequestStatusModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AccessRequestStatusImpl}.
 * </p>
 *
 * @author CloudSmartz
 * @see AccessRequestStatusImpl
 * @see com.pacnet.connect.model.AccessRequestStatus
 * @see com.pacnet.connect.model.AccessRequestStatusModel
 * @generated
 */
@JSON(strict = true)
public class AccessRequestStatusModelImpl extends BaseModelImpl<AccessRequestStatus>
	implements AccessRequestStatusModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a access request status model instance should use the {@link com.pacnet.connect.model.AccessRequestStatus} interface instead.
	 */
	public static final String TABLE_NAME = "Access_Request_Status";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "Name", Types.VARCHAR },
			{ "Description", Types.BIGINT },
			{ "IsActive", Types.BOOLEAN },
			{ "Created_On", Types.TIMESTAMP },
			{ "Created_By", Types.VARCHAR },
			{ "Updated_On", Types.TIMESTAMP },
			{ "Updated_By", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Access_Request_Status (ID LONG not null primary key IDENTITY,Name VARCHAR(75) null,Description LONG,IsActive BOOLEAN,Created_On DATE null,Created_By VARCHAR(75) null,Updated_On DATE null,Updated_By VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Access_Request_Status";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.pacnet.connect.model.AccessRequestStatus"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.pacnet.connect.model.AccessRequestStatus"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static AccessRequestStatus toModel(AccessRequestStatusSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		AccessRequestStatus model = new AccessRequestStatusImpl();

		model.setId(soapModel.getId());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());
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
	public static List<AccessRequestStatus> toModels(
		AccessRequestStatusSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<AccessRequestStatus> models = new ArrayList<AccessRequestStatus>(soapModels.length);

		for (AccessRequestStatusSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.pacnet.connect.model.AccessRequestStatus"));

	public AccessRequestStatusModelImpl() {
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
		return AccessRequestStatus.class;
	}

	public String getModelClassName() {
		return AccessRequestStatus.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long description = (Long)attributes.get("description");

		if (description != null) {
			setDescription(description);
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

	@JSON
	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	@JSON
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_name = name;
	}

	@JSON
	public long getDescription() {
		return _description;
	}

	public void setDescription(long description) {
		_description = description;
	}

	@JSON
	public boolean getIsActive() {
		return _isActive;
	}

	public boolean isIsActive() {
		return _isActive;
	}

	public void setIsActive(boolean isActive) {
		_isActive = isActive;
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

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			AccessRequestStatus.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AccessRequestStatus toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (AccessRequestStatus)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		AccessRequestStatusImpl accessRequestStatusImpl = new AccessRequestStatusImpl();

		accessRequestStatusImpl.setId(getId());
		accessRequestStatusImpl.setName(getName());
		accessRequestStatusImpl.setDescription(getDescription());
		accessRequestStatusImpl.setIsActive(getIsActive());
		accessRequestStatusImpl.setCreatedOn(getCreatedOn());
		accessRequestStatusImpl.setCreatedBy(getCreatedBy());
		accessRequestStatusImpl.setUpdatedOn(getUpdatedOn());
		accessRequestStatusImpl.setUpdatedBy(getUpdatedBy());

		accessRequestStatusImpl.resetOriginalValues();

		return accessRequestStatusImpl;
	}

	public int compareTo(AccessRequestStatus accessRequestStatus) {
		long primaryKey = accessRequestStatus.getPrimaryKey();

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

		AccessRequestStatus accessRequestStatus = null;

		try {
			accessRequestStatus = (AccessRequestStatus)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = accessRequestStatus.getPrimaryKey();

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
	}

	@Override
	public CacheModel<AccessRequestStatus> toCacheModel() {
		AccessRequestStatusCacheModel accessRequestStatusCacheModel = new AccessRequestStatusCacheModel();

		accessRequestStatusCacheModel.id = getId();

		accessRequestStatusCacheModel.name = getName();

		String name = accessRequestStatusCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			accessRequestStatusCacheModel.name = null;
		}

		accessRequestStatusCacheModel.description = getDescription();

		accessRequestStatusCacheModel.isActive = getIsActive();

		Date createdOn = getCreatedOn();

		if (createdOn != null) {
			accessRequestStatusCacheModel.createdOn = createdOn.getTime();
		}
		else {
			accessRequestStatusCacheModel.createdOn = Long.MIN_VALUE;
		}

		accessRequestStatusCacheModel.createdBy = getCreatedBy();

		String createdBy = accessRequestStatusCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			accessRequestStatusCacheModel.createdBy = null;
		}

		Date updatedOn = getUpdatedOn();

		if (updatedOn != null) {
			accessRequestStatusCacheModel.updatedOn = updatedOn.getTime();
		}
		else {
			accessRequestStatusCacheModel.updatedOn = Long.MIN_VALUE;
		}

		accessRequestStatusCacheModel.updatedBy = getUpdatedBy();

		String updatedBy = accessRequestStatusCacheModel.updatedBy;

		if ((updatedBy != null) && (updatedBy.length() == 0)) {
			accessRequestStatusCacheModel.updatedBy = null;
		}

		return accessRequestStatusCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
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
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.AccessRequestStatus");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
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

	private static ClassLoader _classLoader = AccessRequestStatus.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			AccessRequestStatus.class
		};
	private long _id;
	private String _name;
	private long _description;
	private boolean _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
	private AccessRequestStatus _escapedModelProxy;
}