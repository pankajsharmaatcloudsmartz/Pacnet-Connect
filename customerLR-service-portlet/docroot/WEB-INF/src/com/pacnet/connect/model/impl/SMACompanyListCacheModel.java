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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.pacnet.connect.model.SMACompanyList;

import java.io.Serializable;

/**
 * The cache model class for representing SMACompanyList in entity cache.
 *
 * @author CloudSmartz
 * @see SMACompanyList
 * @generated
 */
public class SMACompanyListCacheModel implements CacheModel<SMACompanyList>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", adminUserId=");
		sb.append(adminUserId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", customerId=");
		sb.append(customerId);
		sb.append(", domains=");
		sb.append(domains);
		sb.append("}");

		return sb.toString();
	}

	public SMACompanyList toEntityModel() {
		SMACompanyListImpl smaCompanyListImpl = new SMACompanyListImpl();

		if (id == null) {
			smaCompanyListImpl.setId(StringPool.BLANK);
		}
		else {
			smaCompanyListImpl.setId(id);
		}

		smaCompanyListImpl.setAdminUserId(adminUserId);
		smaCompanyListImpl.setCompanyId(companyId);
		smaCompanyListImpl.setCustomerId(customerId);

		if (domains == null) {
			smaCompanyListImpl.setDomains(StringPool.BLANK);
		}
		else {
			smaCompanyListImpl.setDomains(domains);
		}

		smaCompanyListImpl.resetOriginalValues();

		return smaCompanyListImpl;
	}

	public String id;
	public long adminUserId;
	public long companyId;
	public long customerId;
	public String domains;
}