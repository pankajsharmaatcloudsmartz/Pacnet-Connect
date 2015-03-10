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

import com.pacnet.connect.service.SMACompaniesLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class SMACompaniesLocalServiceClpInvoker {
	public SMACompaniesLocalServiceClpInvoker() {
		_methodName0 = "addSMACompanies";

		_methodParameterTypes0 = new String[] {
				"com.pacnet.connect.model.SMACompanies"
			};

		_methodName1 = "createSMACompanies";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteSMACompanies";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteSMACompanies";

		_methodParameterTypes3 = new String[] {
				"com.pacnet.connect.model.SMACompanies"
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

		_methodName9 = "fetchSMACompanies";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getSMACompanies";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getSMACompanieses";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getSMACompaniesesCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateSMACompanies";

		_methodParameterTypes14 = new String[] {
				"com.pacnet.connect.model.SMACompanies"
			};

		_methodName15 = "updateSMACompanies";

		_methodParameterTypes15 = new String[] {
				"com.pacnet.connect.model.SMACompanies", "boolean"
			};

		_methodName152 = "getBeanIdentifier";

		_methodParameterTypes152 = new String[] {  };

		_methodName153 = "setBeanIdentifier";

		_methodParameterTypes153 = new String[] { "java.lang.String" };

		_methodName158 = "clearCache";

		_methodParameterTypes158 = new String[] {  };

		_methodName159 = "clearCache";

		_methodParameterTypes159 = new String[] {
				"com.pacnet.connect.model.SMACompanies"
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
				"com.pacnet.connect.model.SMACompanies", "boolean"
			};

		_methodName164 = "update";

		_methodParameterTypes164 = new String[] {
				"com.pacnet.connect.model.SMACompanies", "boolean",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName165 = "cacheResult";

		_methodParameterTypes165 = new String[] {
				"com.pacnet.connect.model.SMACompanies"
			};

		_methodName166 = "cacheResult";

		_methodParameterTypes166 = new String[] { "java.util.List" };

		_methodName167 = "create";

		_methodParameterTypes167 = new String[] { "long" };

		_methodName168 = "remove";

		_methodParameterTypes168 = new String[] { "long" };

		_methodName169 = "updateImpl";

		_methodParameterTypes169 = new String[] {
				"com.pacnet.connect.model.SMACompanies", "boolean"
			};

		_methodName170 = "findByPrimaryKey";

		_methodParameterTypes170 = new String[] { "long" };

		_methodName171 = "fetchByPrimaryKey";

		_methodParameterTypes171 = new String[] { "long" };

		_methodName172 = "findByGetAllCompanies";

		_methodParameterTypes172 = new String[] { "int", "java.lang.String" };

		_methodName173 = "findByGetAllCompanies";

		_methodParameterTypes173 = new String[] {
				"int", "java.lang.String", "int", "int"
			};

		_methodName174 = "findByGetAllCompanies";

		_methodParameterTypes174 = new String[] {
				"int", "java.lang.String", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName175 = "findByGetAllCompanies_First";

		_methodParameterTypes175 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName176 = "fetchByGetAllCompanies_First";

		_methodParameterTypes176 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName177 = "findByGetAllCompanies_Last";

		_methodParameterTypes177 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName178 = "fetchByGetAllCompanies_Last";

		_methodParameterTypes178 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName179 = "findByGetAllCompanies_PrevAndNext";

		_methodParameterTypes179 = new String[] {
				"long", "int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName180 = "findBySMACompanyListByCustomerId";

		_methodParameterTypes180 = new String[] { "int", "long" };

		_methodName181 = "findBySMACompanyListByCustomerId";

		_methodParameterTypes181 = new String[] { "int", "long", "int", "int" };

		_methodName182 = "findBySMACompanyListByCustomerId";

		_methodParameterTypes182 = new String[] {
				"int", "long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName183 = "findBySMACompanyListByCustomerId_First";

		_methodParameterTypes183 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName184 = "fetchBySMACompanyListByCustomerId_First";

		_methodParameterTypes184 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName185 = "findBySMACompanyListByCustomerId_Last";

		_methodParameterTypes185 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName186 = "fetchBySMACompanyListByCustomerId_Last";

		_methodParameterTypes186 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName187 = "findBySMACompanyListByCustomerId_PrevAndNext";

		_methodParameterTypes187 = new String[] {
				"long", "int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName188 = "findBySMACompanyListByDomains";

		_methodParameterTypes188 = new String[] { "int", "java.lang.String" };

		_methodName189 = "findBySMACompanyListByDomains";

		_methodParameterTypes189 = new String[] {
				"int", "java.lang.String", "int", "int"
			};

		_methodName190 = "findBySMACompanyListByDomains";

		_methodParameterTypes190 = new String[] {
				"int", "java.lang.String", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName191 = "findBySMACompanyListByDomains_First";

		_methodParameterTypes191 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName192 = "fetchBySMACompanyListByDomains_First";

		_methodParameterTypes192 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName193 = "findBySMACompanyListByDomains_Last";

		_methodParameterTypes193 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName194 = "fetchBySMACompanyListByDomains_Last";

		_methodParameterTypes194 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName195 = "findBySMACompanyListByDomains_PrevAndNext";

		_methodParameterTypes195 = new String[] {
				"long", "int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName196 = "findBySMACompanyListByGroupName";

		_methodParameterTypes196 = new String[] { "int", "java.lang.String" };

		_methodName197 = "findBySMACompanyListByGroupName";

		_methodParameterTypes197 = new String[] {
				"int", "java.lang.String", "int", "int"
			};

		_methodName198 = "findBySMACompanyListByGroupName";

		_methodParameterTypes198 = new String[] {
				"int", "java.lang.String", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName199 = "findBySMACompanyListByGroupName_First";

		_methodParameterTypes199 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName200 = "fetchBySMACompanyListByGroupName_First";

		_methodParameterTypes200 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName201 = "findBySMACompanyListByGroupName_Last";

		_methodParameterTypes201 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName202 = "fetchBySMACompanyListByGroupName_Last";

		_methodParameterTypes202 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName203 = "findBySMACompanyListByGroupName_PrevAndNext";

		_methodParameterTypes203 = new String[] {
				"long", "int", "java.lang.String",
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

		_methodName207 = "removeByGetAllCompanies";

		_methodParameterTypes207 = new String[] { "int", "java.lang.String" };

		_methodName208 = "removeBySMACompanyListByCustomerId";

		_methodParameterTypes208 = new String[] { "int", "long" };

		_methodName209 = "removeBySMACompanyListByDomains";

		_methodParameterTypes209 = new String[] { "int", "java.lang.String" };

		_methodName210 = "removeBySMACompanyListByGroupName";

		_methodParameterTypes210 = new String[] { "int", "java.lang.String" };

		_methodName211 = "removeAll";

		_methodParameterTypes211 = new String[] {  };

		_methodName212 = "countByGetAllCompanies";

		_methodParameterTypes212 = new String[] { "int", "java.lang.String" };

		_methodName213 = "countBySMACompanyListByCustomerId";

		_methodParameterTypes213 = new String[] { "int", "long" };

		_methodName214 = "countBySMACompanyListByDomains";

		_methodParameterTypes214 = new String[] { "int", "java.lang.String" };

		_methodName215 = "countBySMACompanyListByGroupName";

		_methodParameterTypes215 = new String[] { "int", "java.lang.String" };

		_methodName216 = "countBySMACompanyListByCustomerIdDomains";

		_methodParameterTypes216 = new String[] {
				"int", "long", "java.lang.String"
			};

		_methodName217 = "countAll";

		_methodParameterTypes217 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.addSMACompanies((com.pacnet.connect.model.SMACompanies)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.createSMACompanies(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.deleteSMACompanies(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.deleteSMACompanies((com.pacnet.connect.model.SMACompanies)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.fetchSMACompanies(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.getSMACompanies(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.getSMACompanieses(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.getSMACompaniesesCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.updateSMACompanies((com.pacnet.connect.model.SMACompanies)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.updateSMACompanies((com.pacnet.connect.model.SMACompanies)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			SMACompaniesLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			SMACompaniesLocalServiceUtil.clearCache();
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			SMACompaniesLocalServiceUtil.clearCache((com.pacnet.connect.model.SMACompanies)arguments[0]);
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findWithDynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findWithDynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName162.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes162, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findWithDynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName163.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes163, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.update((com.pacnet.connect.model.SMACompanies)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.update((com.pacnet.connect.model.SMACompanies)arguments[0],
				((Boolean)arguments[1]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName165.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
			SMACompaniesLocalServiceUtil.cacheResult((com.pacnet.connect.model.SMACompanies)arguments[0]);
		}

		if (_methodName166.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes166, parameterTypes)) {
			SMACompaniesLocalServiceUtil.cacheResult((java.util.List<com.pacnet.connect.model.SMACompanies>)arguments[0]);
		}

		if (_methodName167.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes167, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.create(((Long)arguments[0]).longValue());
		}

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.remove(((Long)arguments[0]).longValue());
		}

		if (_methodName169.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes169, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.updateImpl((com.pacnet.connect.model.SMACompanies)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findByPrimaryKey(((Long)arguments[0]).longValue());
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.fetchByPrimaryKey(((Long)arguments[0]).longValue());
		}

		if (_methodName172.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findByGetAllCompanies(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName173.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findByGetAllCompanies(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName174.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes174, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findByGetAllCompanies(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName175.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes175, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findByGetAllCompanies_First(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.fetchByGetAllCompanies_First(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findByGetAllCompanies_Last(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.fetchByGetAllCompanies_Last(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName179.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findByGetAllCompanies_PrevAndNext(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName180.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes180, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByCustomerId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName181.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes181, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByCustomerId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName182.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes182, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByCustomerId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName183.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes183, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByCustomerId_First(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName184.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes184, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.fetchBySMACompanyListByCustomerId_First(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName185.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes185, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByCustomerId_Last(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName186.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes186, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.fetchBySMACompanyListByCustomerId_Last(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName187.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes187, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByCustomerId_PrevAndNext(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Long)arguments[2]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName188.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes188, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByDomains(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName189.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes189, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByDomains(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName190.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes190, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByDomains(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName191.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes191, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByDomains_First(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName192.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes192, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.fetchBySMACompanyListByDomains_First(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName193.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes193, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByDomains_Last(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName194.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes194, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.fetchBySMACompanyListByDomains_Last(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName195.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes195, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByDomains_PrevAndNext(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName196.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes196, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByGroupName(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName197.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes197, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByGroupName(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName198.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes198, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByGroupName(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName199.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes199, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByGroupName_First(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName200.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes200, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.fetchBySMACompanyListByGroupName_First(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName201.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes201, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByGroupName_Last(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName202.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes202, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.fetchBySMACompanyListByGroupName_Last(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName203.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes203, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findBySMACompanyListByGroupName_PrevAndNext(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName204.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes204, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findAll();
		}

		if (_methodName205.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes205, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findAll(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName206.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes206, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.findAll(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName207.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes207, parameterTypes)) {
			SMACompaniesLocalServiceUtil.removeByGetAllCompanies(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName208.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes208, parameterTypes)) {
			SMACompaniesLocalServiceUtil.removeBySMACompanyListByCustomerId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName209.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes209, parameterTypes)) {
			SMACompaniesLocalServiceUtil.removeBySMACompanyListByDomains(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName210.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes210, parameterTypes)) {
			SMACompaniesLocalServiceUtil.removeBySMACompanyListByGroupName(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName211.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes211, parameterTypes)) {
			SMACompaniesLocalServiceUtil.removeAll();
		}

		if (_methodName212.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes212, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.countByGetAllCompanies(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName213.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes213, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.countBySMACompanyListByCustomerId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName214.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes214, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.countBySMACompanyListByDomains(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName215.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes215, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.countBySMACompanyListByGroupName(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName216.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes216, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.countBySMACompanyListByCustomerIdDomains(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(), (java.lang.String)arguments[2]);
		}

		if (_methodName217.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes217, parameterTypes)) {
			return SMACompaniesLocalServiceUtil.countAll();
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
	private String _methodName217;
	private String[] _methodParameterTypes217;
}