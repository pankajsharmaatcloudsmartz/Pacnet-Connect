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

import com.pacnet.connect.service.SMAAdminsLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class SMAAdminsLocalServiceClpInvoker {
	public SMAAdminsLocalServiceClpInvoker() {
		_methodName0 = "addSMAAdmins";

		_methodParameterTypes0 = new String[] {
				"com.pacnet.connect.model.SMAAdmins"
			};

		_methodName1 = "createSMAAdmins";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteSMAAdmins";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteSMAAdmins";

		_methodParameterTypes3 = new String[] {
				"com.pacnet.connect.model.SMAAdmins"
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

		_methodName9 = "fetchSMAAdmins";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getSMAAdmins";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getSMAAdminses";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getSMAAdminsesCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateSMAAdmins";

		_methodParameterTypes14 = new String[] {
				"com.pacnet.connect.model.SMAAdmins"
			};

		_methodName15 = "updateSMAAdmins";

		_methodParameterTypes15 = new String[] {
				"com.pacnet.connect.model.SMAAdmins", "boolean"
			};

		_methodName152 = "getBeanIdentifier";

		_methodParameterTypes152 = new String[] {  };

		_methodName153 = "setBeanIdentifier";

		_methodParameterTypes153 = new String[] { "java.lang.String" };

		_methodName158 = "clearCache";

		_methodParameterTypes158 = new String[] {  };

		_methodName159 = "clearCache";

		_methodParameterTypes159 = new String[] {
				"com.pacnet.connect.model.SMAAdmins"
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
				"com.pacnet.connect.model.SMAAdmins", "boolean"
			};

		_methodName164 = "update";

		_methodParameterTypes164 = new String[] {
				"com.pacnet.connect.model.SMAAdmins", "boolean",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName165 = "cacheResult";

		_methodParameterTypes165 = new String[] {
				"com.pacnet.connect.model.SMAAdmins"
			};

		_methodName166 = "cacheResult";

		_methodParameterTypes166 = new String[] { "java.util.List" };

		_methodName167 = "create";

		_methodParameterTypes167 = new String[] { "long" };

		_methodName168 = "remove";

		_methodParameterTypes168 = new String[] { "long" };

		_methodName169 = "updateImpl";

		_methodParameterTypes169 = new String[] {
				"com.pacnet.connect.model.SMAAdmins", "boolean"
			};

		_methodName170 = "findByPrimaryKey";

		_methodParameterTypes170 = new String[] { "long" };

		_methodName171 = "fetchByPrimaryKey";

		_methodParameterTypes171 = new String[] { "long" };

		_methodName172 = "findBySMAAdminsListByCompanyId";

		_methodParameterTypes172 = new String[] { "int", "long" };

		_methodName173 = "findBySMAAdminsListByCompanyId";

		_methodParameterTypes173 = new String[] { "int", "long", "int", "int" };

		_methodName174 = "findBySMAAdminsListByCompanyId";

		_methodParameterTypes174 = new String[] {
				"int", "long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName175 = "findBySMAAdminsListByCompanyId_First";

		_methodParameterTypes175 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName176 = "fetchBySMAAdminsListByCompanyId_First";

		_methodParameterTypes176 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName177 = "findBySMAAdminsListByCompanyId_Last";

		_methodParameterTypes177 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName178 = "fetchBySMAAdminsListByCompanyId_Last";

		_methodParameterTypes178 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName179 = "findBySMAAdminsListByCompanyId_PrevAndNext";

		_methodParameterTypes179 = new String[] {
				"long", "int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName180 = "findBySMAAdminsListByUserId";

		_methodParameterTypes180 = new String[] { "int", "long" };

		_methodName181 = "findBySMAAdminsListByUserId";

		_methodParameterTypes181 = new String[] { "int", "long", "int", "int" };

		_methodName182 = "findBySMAAdminsListByUserId";

		_methodParameterTypes182 = new String[] {
				"int", "long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName183 = "findBySMAAdminsListByUserId_First";

		_methodParameterTypes183 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName184 = "fetchBySMAAdminsListByUserId_First";

		_methodParameterTypes184 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName185 = "findBySMAAdminsListByUserId_Last";

		_methodParameterTypes185 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName186 = "fetchBySMAAdminsListByUserId_Last";

		_methodParameterTypes186 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName187 = "findBySMAAdminsListByUserId_PrevAndNext";

		_methodParameterTypes187 = new String[] {
				"long", "int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName188 = "findBySMAAdminsListByRadcheckId";

		_methodParameterTypes188 = new String[] { "int", "long" };

		_methodName189 = "findBySMAAdminsListByRadcheckId";

		_methodParameterTypes189 = new String[] { "int", "long", "int", "int" };

		_methodName190 = "findBySMAAdminsListByRadcheckId";

		_methodParameterTypes190 = new String[] {
				"int", "long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName191 = "findBySMAAdminsListByRadcheckId_First";

		_methodParameterTypes191 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName192 = "fetchBySMAAdminsListByRadcheckId_First";

		_methodParameterTypes192 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName193 = "findBySMAAdminsListByRadcheckId_Last";

		_methodParameterTypes193 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName194 = "fetchBySMAAdminsListByRadcheckId_Last";

		_methodParameterTypes194 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName195 = "findBySMAAdminsListByRadcheckId_PrevAndNext";

		_methodParameterTypes195 = new String[] {
				"long", "int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName196 = "findAll";

		_methodParameterTypes196 = new String[] {  };

		_methodName197 = "findAll";

		_methodParameterTypes197 = new String[] { "int", "int" };

		_methodName198 = "findAll";

		_methodParameterTypes198 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName199 = "removeBySMAAdminsListByCompanyId";

		_methodParameterTypes199 = new String[] { "int", "long" };

		_methodName200 = "removeBySMAAdminsListByUserId";

		_methodParameterTypes200 = new String[] { "int", "long" };

		_methodName201 = "removeBySMAAdminsListByRadcheckId";

		_methodParameterTypes201 = new String[] { "int", "long" };

		_methodName202 = "removeAll";

		_methodParameterTypes202 = new String[] {  };

		_methodName203 = "countBySMAAdminsListByCompanyId";

		_methodParameterTypes203 = new String[] { "int", "long" };

		_methodName204 = "countBySMAAdminsListByUserId";

		_methodParameterTypes204 = new String[] { "int", "long" };

		_methodName205 = "countBySMAAdminsListByRadcheckId";

		_methodParameterTypes205 = new String[] { "int", "long" };

		_methodName206 = "countBySMAAdminsListByRadcheckIdUserIdCompanyId";

		_methodParameterTypes206 = new String[] { "int", "long", "long", "long" };

		_methodName207 = "countAll";

		_methodParameterTypes207 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.addSMAAdmins((com.pacnet.connect.model.SMAAdmins)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.createSMAAdmins(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.deleteSMAAdmins(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.deleteSMAAdmins((com.pacnet.connect.model.SMAAdmins)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.fetchSMAAdmins(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.getSMAAdmins(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.getSMAAdminses(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.getSMAAdminsesCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.updateSMAAdmins((com.pacnet.connect.model.SMAAdmins)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.updateSMAAdmins((com.pacnet.connect.model.SMAAdmins)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			SMAAdminsLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			SMAAdminsLocalServiceUtil.clearCache();
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			SMAAdminsLocalServiceUtil.clearCache((com.pacnet.connect.model.SMAAdmins)arguments[0]);
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findWithDynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findWithDynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName162.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes162, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findWithDynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName163.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes163, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.update((com.pacnet.connect.model.SMAAdmins)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.update((com.pacnet.connect.model.SMAAdmins)arguments[0],
				((Boolean)arguments[1]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName165.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
			SMAAdminsLocalServiceUtil.cacheResult((com.pacnet.connect.model.SMAAdmins)arguments[0]);
		}

		if (_methodName166.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes166, parameterTypes)) {
			SMAAdminsLocalServiceUtil.cacheResult((java.util.List<com.pacnet.connect.model.SMAAdmins>)arguments[0]);
		}

		if (_methodName167.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes167, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.create(((Long)arguments[0]).longValue());
		}

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.remove(((Long)arguments[0]).longValue());
		}

		if (_methodName169.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes169, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.updateImpl((com.pacnet.connect.model.SMAAdmins)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findByPrimaryKey(((Long)arguments[0]).longValue());
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.fetchByPrimaryKey(((Long)arguments[0]).longValue());
		}

		if (_methodName172.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByCompanyId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName173.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByCompanyId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName174.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes174, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByCompanyId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName175.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes175, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByCompanyId_First(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.fetchBySMAAdminsListByCompanyId_First(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByCompanyId_Last(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.fetchBySMAAdminsListByCompanyId_Last(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName179.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByCompanyId_PrevAndNext(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Long)arguments[2]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName180.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes180, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByUserId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName181.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes181, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByUserId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName182.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes182, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByUserId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName183.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes183, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByUserId_First(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName184.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes184, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.fetchBySMAAdminsListByUserId_First(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName185.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes185, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByUserId_Last(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName186.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes186, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.fetchBySMAAdminsListByUserId_Last(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName187.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes187, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByUserId_PrevAndNext(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Long)arguments[2]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName188.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes188, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByRadcheckId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName189.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes189, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByRadcheckId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName190.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes190, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByRadcheckId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName191.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes191, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByRadcheckId_First(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName192.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes192, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.fetchBySMAAdminsListByRadcheckId_First(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName193.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes193, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByRadcheckId_Last(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName194.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes194, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.fetchBySMAAdminsListByRadcheckId_Last(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName195.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes195, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findBySMAAdminsListByRadcheckId_PrevAndNext(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Long)arguments[2]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName196.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes196, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findAll();
		}

		if (_methodName197.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes197, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findAll(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName198.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes198, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.findAll(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName199.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes199, parameterTypes)) {
			SMAAdminsLocalServiceUtil.removeBySMAAdminsListByCompanyId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName200.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes200, parameterTypes)) {
			SMAAdminsLocalServiceUtil.removeBySMAAdminsListByUserId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName201.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes201, parameterTypes)) {
			SMAAdminsLocalServiceUtil.removeBySMAAdminsListByRadcheckId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName202.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes202, parameterTypes)) {
			SMAAdminsLocalServiceUtil.removeAll();
		}

		if (_methodName203.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes203, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.countBySMAAdminsListByCompanyId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName204.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes204, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.countBySMAAdminsListByUserId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName205.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes205, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.countBySMAAdminsListByRadcheckId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName206.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes206, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.countBySMAAdminsListByRadcheckIdUserIdCompanyId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue());
		}

		if (_methodName207.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes207, parameterTypes)) {
			return SMAAdminsLocalServiceUtil.countAll();
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
}