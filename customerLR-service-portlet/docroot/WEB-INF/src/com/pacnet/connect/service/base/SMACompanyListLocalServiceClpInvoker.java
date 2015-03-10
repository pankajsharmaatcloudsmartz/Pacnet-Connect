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

package com.pacnet.connect.service.base;

import com.pacnet.connect.service.SMACompanyListLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class SMACompanyListLocalServiceClpInvoker {
	public SMACompanyListLocalServiceClpInvoker() {
		_methodName0 = "addSMACompanyList";

		_methodParameterTypes0 = new String[] {
				"com.pacnet.connect.model.SMACompanyList"
			};

		_methodName1 = "createSMACompanyList";

		_methodParameterTypes1 = new String[] { "java.lang.String" };

		_methodName2 = "deleteSMACompanyList";

		_methodParameterTypes2 = new String[] { "java.lang.String" };

		_methodName3 = "deleteSMACompanyList";

		_methodParameterTypes3 = new String[] {
				"com.pacnet.connect.model.SMACompanyList"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "fetchSMACompanyList";

		_methodParameterTypes9 = new String[] { "java.lang.String" };

		_methodName10 = "getSMACompanyList";

		_methodParameterTypes10 = new String[] { "java.lang.String" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getSMACompanyLists";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getSMACompanyListsCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateSMACompanyList";

		_methodParameterTypes14 = new String[] {
				"com.pacnet.connect.model.SMACompanyList"
			};

		_methodName15 = "updateSMACompanyList";

		_methodParameterTypes15 = new String[] {
				"com.pacnet.connect.model.SMACompanyList", "boolean"
			};

		_methodName152 = "getBeanIdentifier";

		_methodParameterTypes152 = new String[] {  };

		_methodName153 = "setBeanIdentifier";

		_methodParameterTypes153 = new String[] { "java.lang.String" };

		_methodName158 = "clearCache";

		_methodParameterTypes158 = new String[] {  };

		_methodName159 = "clearCache";

		_methodParameterTypes159 = new String[] {
				"com.pacnet.connect.model.SMACompanyList"
			};

		_methodName160 = "findWithDynamicQuery";

		_methodParameterTypes160 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName161 = "findWithDynamicQuery";

		_methodParameterTypes161 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName162 = "findWithDynamicQuery";

		_methodParameterTypes162 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName163 = "update";

		_methodParameterTypes163 = new String[] {
				"com.pacnet.connect.model.SMACompanyList", "boolean"
			};

		_methodName164 = "update";

		_methodParameterTypes164 = new String[] {
				"com.pacnet.connect.model.SMACompanyList", "boolean",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName165 = "cacheResult";

		_methodParameterTypes165 = new String[] {
				"com.pacnet.connect.model.SMACompanyList"
			};

		_methodName166 = "cacheResult";

		_methodParameterTypes166 = new String[] { "java.util.List" };

		_methodName167 = "create";

		_methodParameterTypes167 = new String[] { "java.lang.String" };

		_methodName168 = "remove";

		_methodParameterTypes168 = new String[] { "java.lang.String" };

		_methodName169 = "updateImpl";

		_methodParameterTypes169 = new String[] {
				"com.pacnet.connect.model.SMACompanyList", "boolean"
			};

		_methodName170 = "findByPrimaryKey";

		_methodParameterTypes170 = new String[] { "java.lang.String" };

		_methodName171 = "fetchByPrimaryKey";

		_methodParameterTypes171 = new String[] { "java.lang.String" };

		_methodName172 = "findBySMACompanyListByAdminUserId";

		_methodParameterTypes172 = new String[] { "long" };

		_methodName173 = "findBySMACompanyListByAdminUserId";

		_methodParameterTypes173 = new String[] { "long", "int", "int" };

		_methodName174 = "findBySMACompanyListByAdminUserId";

		_methodParameterTypes174 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName175 = "findBySMACompanyListByAdminUserId_First";

		_methodParameterTypes175 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName176 = "fetchBySMACompanyListByAdminUserId_First";

		_methodParameterTypes176 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName177 = "findBySMACompanyListByAdminUserId_Last";

		_methodParameterTypes177 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName178 = "fetchBySMACompanyListByAdminUserId_Last";

		_methodParameterTypes178 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName179 = "findBySMACompanyListByAdminUserId_PrevAndNext";

		_methodParameterTypes179 = new String[] {
				"java.lang.String", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName180 = "findBySMACompanyListByCompanyId";

		_methodParameterTypes180 = new String[] { "long" };

		_methodName181 = "findBySMACompanyListByCompanyId";

		_methodParameterTypes181 = new String[] { "long", "int", "int" };

		_methodName182 = "findBySMACompanyListByCompanyId";

		_methodParameterTypes182 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName183 = "findBySMACompanyListByCompanyId_First";

		_methodParameterTypes183 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName184 = "fetchBySMACompanyListByCompanyId_First";

		_methodParameterTypes184 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName185 = "findBySMACompanyListByCompanyId_Last";

		_methodParameterTypes185 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName186 = "fetchBySMACompanyListByCompanyId_Last";

		_methodParameterTypes186 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName187 = "findBySMACompanyListByCompanyId_PrevAndNext";

		_methodParameterTypes187 = new String[] {
				"java.lang.String", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName188 = "findBySMACompanyListByCustomerId";

		_methodParameterTypes188 = new String[] { "long" };

		_methodName189 = "findBySMACompanyListByCustomerId";

		_methodParameterTypes189 = new String[] { "long", "int", "int" };

		_methodName190 = "findBySMACompanyListByCustomerId";

		_methodParameterTypes190 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName191 = "findBySMACompanyListByCustomerId_First";

		_methodParameterTypes191 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName192 = "fetchBySMACompanyListByCustomerId_First";

		_methodParameterTypes192 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName193 = "findBySMACompanyListByCustomerId_Last";

		_methodParameterTypes193 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName194 = "fetchBySMACompanyListByCustomerId_Last";

		_methodParameterTypes194 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName195 = "findBySMACompanyListByCustomerId_PrevAndNext";

		_methodParameterTypes195 = new String[] {
				"java.lang.String", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName196 = "findBySMACompanyListByDomains";

		_methodParameterTypes196 = new String[] { "java.lang.String" };

		_methodName197 = "findBySMACompanyListByDomains";

		_methodParameterTypes197 = new String[] { "java.lang.String", "int", "int" };

		_methodName198 = "findBySMACompanyListByDomains";

		_methodParameterTypes198 = new String[] {
				"java.lang.String", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName199 = "findBySMACompanyListByDomains_First";

		_methodParameterTypes199 = new String[] {
				"java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName200 = "fetchBySMACompanyListByDomains_First";

		_methodParameterTypes200 = new String[] {
				"java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName201 = "findBySMACompanyListByDomains_Last";

		_methodParameterTypes201 = new String[] {
				"java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName202 = "fetchBySMACompanyListByDomains_Last";

		_methodParameterTypes202 = new String[] {
				"java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName203 = "findBySMACompanyListByDomains_PrevAndNext";

		_methodParameterTypes203 = new String[] {
				"java.lang.String", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName204 = "findAll";

		_methodParameterTypes204 = new String[] {  };

		_methodName205 = "findAll";

		_methodParameterTypes205 = new String[] { "int", "int" };

		_methodName206 = "findAll";

		_methodParameterTypes206 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName207 = "removeBySMACompanyListByAdminUserId";

		_methodParameterTypes207 = new String[] { "long" };

		_methodName208 = "removeBySMACompanyListByCompanyId";

		_methodParameterTypes208 = new String[] { "long" };

		_methodName209 = "removeBySMACompanyListByCustomerId";

		_methodParameterTypes209 = new String[] { "long" };

		_methodName210 = "removeBySMACompanyListByDomains";

		_methodParameterTypes210 = new String[] { "java.lang.String" };

		_methodName211 = "removeAll";

		_methodParameterTypes211 = new String[] {  };

		_methodName212 = "countBySMACompanyListByAdminUserId";

		_methodParameterTypes212 = new String[] { "long" };

		_methodName213 = "countBySMACompanyListByCompanyId";

		_methodParameterTypes213 = new String[] { "long" };

		_methodName214 = "countBySMACompanyListByCustomerId";

		_methodParameterTypes214 = new String[] { "long" };

		_methodName215 = "countBySMACompanyListByDomains";

		_methodParameterTypes215 = new String[] { "java.lang.String" };

		_methodName216 = "countAll";

		_methodParameterTypes216 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.addSMACompanyList((com.pacnet.connect.model.SMACompanyList)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.createSMACompanyList((java.lang.String)arguments[0]);
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.deleteSMACompanyList((java.lang.String)arguments[0]);
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.deleteSMACompanyList((com.pacnet.connect.model.SMACompanyList)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.fetchSMACompanyList((java.lang.String)arguments[0]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.getSMACompanyList((java.lang.String)arguments[0]);
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.getSMACompanyLists(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.getSMACompanyListsCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.updateSMACompanyList((com.pacnet.connect.model.SMACompanyList)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.updateSMACompanyList((com.pacnet.connect.model.SMACompanyList)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			SMACompanyListLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			SMACompanyListLocalServiceUtil.clearCache();
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			SMACompanyListLocalServiceUtil.clearCache((com.pacnet.connect.model.SMACompanyList)arguments[0]);
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findWithDynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findWithDynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName162.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes162, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findWithDynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName163.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes163, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.update((com.pacnet.connect.model.SMACompanyList)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.update((com.pacnet.connect.model.SMACompanyList)arguments[0],
				((Boolean)arguments[1]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName165.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
			SMACompanyListLocalServiceUtil.cacheResult((com.pacnet.connect.model.SMACompanyList)arguments[0]);
		}

		if (_methodName166.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes166, parameterTypes)) {
			SMACompanyListLocalServiceUtil.cacheResult((java.util.List<com.pacnet.connect.model.SMACompanyList>)arguments[0]);
		}

		if (_methodName167.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes167, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.create((java.lang.String)arguments[0]);
		}

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.remove((java.lang.String)arguments[0]);
		}

		if (_methodName169.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes169, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.updateImpl((com.pacnet.connect.model.SMACompanyList)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findByPrimaryKey((java.lang.String)arguments[0]);
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.fetchByPrimaryKey((java.lang.String)arguments[0]);
		}

		if (_methodName172.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByAdminUserId(((Long)arguments[0]).longValue());
		}

		if (_methodName173.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByAdminUserId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName174.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes174, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByAdminUserId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName175.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes175, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByAdminUserId_First(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.fetchBySMACompanyListByAdminUserId_First(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByAdminUserId_Last(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.fetchBySMACompanyListByAdminUserId_Last(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName179.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByAdminUserId_PrevAndNext((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName180.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes180, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByCompanyId(((Long)arguments[0]).longValue());
		}

		if (_methodName181.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes181, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByCompanyId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName182.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes182, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByCompanyId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName183.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes183, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByCompanyId_First(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName184.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes184, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.fetchBySMACompanyListByCompanyId_First(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName185.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes185, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByCompanyId_Last(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName186.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes186, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.fetchBySMACompanyListByCompanyId_Last(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName187.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes187, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByCompanyId_PrevAndNext((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName188.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes188, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByCustomerId(((Long)arguments[0]).longValue());
		}

		if (_methodName189.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes189, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByCustomerId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName190.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes190, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByCustomerId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName191.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes191, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByCustomerId_First(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName192.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes192, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.fetchBySMACompanyListByCustomerId_First(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName193.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes193, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByCustomerId_Last(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName194.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes194, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.fetchBySMACompanyListByCustomerId_Last(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName195.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes195, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByCustomerId_PrevAndNext((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName196.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes196, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByDomains((java.lang.String)arguments[0]);
		}

		if (_methodName197.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes197, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByDomains((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName198.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes198, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByDomains((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName199.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes199, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByDomains_First((java.lang.String)arguments[0],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName200.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes200, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.fetchBySMACompanyListByDomains_First((java.lang.String)arguments[0],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName201.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes201, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByDomains_Last((java.lang.String)arguments[0],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName202.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes202, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.fetchBySMACompanyListByDomains_Last((java.lang.String)arguments[0],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName203.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes203, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findBySMACompanyListByDomains_PrevAndNext((java.lang.String)arguments[0],
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName204.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes204, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findAll();
		}

		if (_methodName205.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes205, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findAll(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName206.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes206, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.findAll(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName207.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes207, parameterTypes)) {
			SMACompanyListLocalServiceUtil.removeBySMACompanyListByAdminUserId(((Long)arguments[0]).longValue());
		}

		if (_methodName208.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes208, parameterTypes)) {
			SMACompanyListLocalServiceUtil.removeBySMACompanyListByCompanyId(((Long)arguments[0]).longValue());
		}

		if (_methodName209.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes209, parameterTypes)) {
			SMACompanyListLocalServiceUtil.removeBySMACompanyListByCustomerId(((Long)arguments[0]).longValue());
		}

		if (_methodName210.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes210, parameterTypes)) {
			SMACompanyListLocalServiceUtil.removeBySMACompanyListByDomains((java.lang.String)arguments[0]);
		}

		if (_methodName211.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes211, parameterTypes)) {
			SMACompanyListLocalServiceUtil.removeAll();
		}

		if (_methodName212.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes212, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.countBySMACompanyListByAdminUserId(((Long)arguments[0]).longValue());
		}

		if (_methodName213.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes213, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.countBySMACompanyListByCompanyId(((Long)arguments[0]).longValue());
		}

		if (_methodName214.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes214, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.countBySMACompanyListByCustomerId(((Long)arguments[0]).longValue());
		}

		if (_methodName215.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes215, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.countBySMACompanyListByDomains((java.lang.String)arguments[0]);
		}

		if (_methodName216.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes216, parameterTypes)) {
			return SMACompanyListLocalServiceUtil.countAll();
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName152;
	private String[] _methodParameterTypes152;
	private String _methodName153;
	private String[] _methodParameterTypes153;
	private String _methodName158;
	private String[] _methodParameterTypes158;
	private String _methodName159;
	private String[] _methodParameterTypes159;
	private String _methodName160;
	private String[] _methodParameterTypes160;
	private String _methodName161;
	private String[] _methodParameterTypes161;
	private String _methodName162;
	private String[] _methodParameterTypes162;
	private String _methodName163;
	private String[] _methodParameterTypes163;
	private String _methodName164;
	private String[] _methodParameterTypes164;
	private String _methodName165;
	private String[] _methodParameterTypes165;
	private String _methodName166;
	private String[] _methodParameterTypes166;
	private String _methodName167;
	private String[] _methodParameterTypes167;
	private String _methodName168;
	private String[] _methodParameterTypes168;
	private String _methodName169;
	private String[] _methodParameterTypes169;
	private String _methodName170;
	private String[] _methodParameterTypes170;
	private String _methodName171;
	private String[] _methodParameterTypes171;
	private String _methodName172;
	private String[] _methodParameterTypes172;
	private String _methodName173;
	private String[] _methodParameterTypes173;
	private String _methodName174;
	private String[] _methodParameterTypes174;
	private String _methodName175;
	private String[] _methodParameterTypes175;
	private String _methodName176;
	private String[] _methodParameterTypes176;
	private String _methodName177;
	private String[] _methodParameterTypes177;
	private String _methodName178;
	private String[] _methodParameterTypes178;
	private String _methodName179;
	private String[] _methodParameterTypes179;
	private String _methodName180;
	private String[] _methodParameterTypes180;
	private String _methodName181;
	private String[] _methodParameterTypes181;
	private String _methodName182;
	private String[] _methodParameterTypes182;
	private String _methodName183;
	private String[] _methodParameterTypes183;
	private String _methodName184;
	private String[] _methodParameterTypes184;
	private String _methodName185;
	private String[] _methodParameterTypes185;
	private String _methodName186;
	private String[] _methodParameterTypes186;
	private String _methodName187;
	private String[] _methodParameterTypes187;
	private String _methodName188;
	private String[] _methodParameterTypes188;
	private String _methodName189;
	private String[] _methodParameterTypes189;
	private String _methodName190;
	private String[] _methodParameterTypes190;
	private String _methodName191;
	private String[] _methodParameterTypes191;
	private String _methodName192;
	private String[] _methodParameterTypes192;
	private String _methodName193;
	private String[] _methodParameterTypes193;
	private String _methodName194;
	private String[] _methodParameterTypes194;
	private String _methodName195;
	private String[] _methodParameterTypes195;
	private String _methodName196;
	private String[] _methodParameterTypes196;
	private String _methodName197;
	private String[] _methodParameterTypes197;
	private String _methodName198;
	private String[] _methodParameterTypes198;
	private String _methodName199;
	private String[] _methodParameterTypes199;
	private String _methodName200;
	private String[] _methodParameterTypes200;
	private String _methodName201;
	private String[] _methodParameterTypes201;
	private String _methodName202;
	private String[] _methodParameterTypes202;
	private String _methodName203;
	private String[] _methodParameterTypes203;
	private String _methodName204;
	private String[] _methodParameterTypes204;
	private String _methodName205;
	private String[] _methodParameterTypes205;
	private String _methodName206;
	private String[] _methodParameterTypes206;
	private String _methodName207;
	private String[] _methodParameterTypes207;
	private String _methodName208;
	private String[] _methodParameterTypes208;
	private String _methodName209;
	private String[] _methodParameterTypes209;
	private String _methodName210;
	private String[] _methodParameterTypes210;
	private String _methodName211;
	private String[] _methodParameterTypes211;
	private String _methodName212;
	private String[] _methodParameterTypes212;
	private String _methodName213;
	private String[] _methodParameterTypes213;
	private String _methodName214;
	private String[] _methodParameterTypes214;
	private String _methodName215;
	private String[] _methodParameterTypes215;
	private String _methodName216;
	private String[] _methodParameterTypes216;
}