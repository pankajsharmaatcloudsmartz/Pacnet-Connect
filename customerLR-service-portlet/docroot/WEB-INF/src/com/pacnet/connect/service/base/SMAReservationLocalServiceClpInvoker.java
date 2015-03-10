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

import com.pacnet.connect.service.SMAReservationLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class SMAReservationLocalServiceClpInvoker {
	public SMAReservationLocalServiceClpInvoker() {
		_methodName0 = "addSMAReservation";

		_methodParameterTypes0 = new String[] {
				"com.pacnet.connect.model.SMAReservation"
			};

		_methodName1 = "createSMAReservation";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteSMAReservation";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteSMAReservation";

		_methodParameterTypes3 = new String[] {
				"com.pacnet.connect.model.SMAReservation"
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

		_methodName9 = "fetchSMAReservation";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getSMAReservation";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getSMAReservations";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getSMAReservationsCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateSMAReservation";

		_methodParameterTypes14 = new String[] {
				"com.pacnet.connect.model.SMAReservation"
			};

		_methodName15 = "updateSMAReservation";

		_methodParameterTypes15 = new String[] {
				"com.pacnet.connect.model.SMAReservation", "boolean"
			};

		_methodName152 = "getBeanIdentifier";

		_methodParameterTypes152 = new String[] {  };

		_methodName153 = "setBeanIdentifier";

		_methodParameterTypes153 = new String[] { "java.lang.String" };

		_methodName158 = "clearCache";

		_methodParameterTypes158 = new String[] {  };

		_methodName159 = "clearCache";

		_methodParameterTypes159 = new String[] {
				"com.pacnet.connect.model.SMAReservation"
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
				"com.pacnet.connect.model.SMAReservation", "boolean"
			};

		_methodName164 = "update";

		_methodParameterTypes164 = new String[] {
				"com.pacnet.connect.model.SMAReservation", "boolean",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName165 = "cacheResult";

		_methodParameterTypes165 = new String[] {
				"com.pacnet.connect.model.SMAReservation"
			};

		_methodName166 = "cacheResult";

		_methodParameterTypes166 = new String[] { "java.util.List" };

		_methodName167 = "create";

		_methodParameterTypes167 = new String[] { "long" };

		_methodName168 = "remove";

		_methodParameterTypes168 = new String[] { "long" };

		_methodName169 = "updateImpl";

		_methodParameterTypes169 = new String[] {
				"com.pacnet.connect.model.SMAReservation", "boolean"
			};

		_methodName170 = "findByPrimaryKey";

		_methodParameterTypes170 = new String[] { "long" };

		_methodName171 = "fetchByPrimaryKey";

		_methodParameterTypes171 = new String[] { "long" };

		_methodName172 = "findBySMADomainsListByCreatedBy";

		_methodParameterTypes172 = new String[] { "int", "java.lang.String" };

		_methodName173 = "findBySMADomainsListByCreatedBy";

		_methodParameterTypes173 = new String[] {
				"int", "java.lang.String", "int", "int"
			};

		_methodName174 = "findBySMADomainsListByCreatedBy";

		_methodParameterTypes174 = new String[] {
				"int", "java.lang.String", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName175 = "findBySMADomainsListByCreatedBy_First";

		_methodParameterTypes175 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName176 = "fetchBySMADomainsListByCreatedBy_First";

		_methodParameterTypes176 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName177 = "findBySMADomainsListByCreatedBy_Last";

		_methodParameterTypes177 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName178 = "fetchBySMADomainsListByCreatedBy_Last";

		_methodParameterTypes178 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName179 = "findBySMADomainsListByCreatedBy_PrevAndNext";

		_methodParameterTypes179 = new String[] {
				"long", "int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName180 = "findBySMADomainsListByName";

		_methodParameterTypes180 = new String[] { "int", "java.lang.String" };

		_methodName181 = "findBySMADomainsListByName";

		_methodParameterTypes181 = new String[] {
				"int", "java.lang.String", "int", "int"
			};

		_methodName182 = "findBySMADomainsListByName";

		_methodParameterTypes182 = new String[] {
				"int", "java.lang.String", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName183 = "findBySMADomainsListByName_First";

		_methodParameterTypes183 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName184 = "fetchBySMADomainsListByName_First";

		_methodParameterTypes184 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName185 = "findBySMADomainsListByName_Last";

		_methodParameterTypes185 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName186 = "fetchBySMADomainsListByName_Last";

		_methodParameterTypes186 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName187 = "findBySMADomainsListByName_PrevAndNext";

		_methodParameterTypes187 = new String[] {
				"long", "int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName188 = "findBySMADomainsListByOwner";

		_methodParameterTypes188 = new String[] { "int", "java.lang.String" };

		_methodName189 = "findBySMADomainsListByOwner";

		_methodParameterTypes189 = new String[] {
				"int", "java.lang.String", "int", "int"
			};

		_methodName190 = "findBySMADomainsListByOwner";

		_methodParameterTypes190 = new String[] {
				"int", "java.lang.String", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName191 = "findBySMADomainsListByOwner_First";

		_methodParameterTypes191 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName192 = "fetchBySMADomainsListByOwner_First";

		_methodParameterTypes192 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName193 = "findBySMADomainsListByOwner_Last";

		_methodParameterTypes193 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName194 = "fetchBySMADomainsListByOwner_Last";

		_methodParameterTypes194 = new String[] {
				"int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName195 = "findBySMADomainsListByOwner_PrevAndNext";

		_methodParameterTypes195 = new String[] {
				"long", "int", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName196 = "findBySMADomainsListByStartDate";

		_methodParameterTypes196 = new String[] { "int", "java.util.Date" };

		_methodName197 = "findBySMADomainsListByStartDate";

		_methodParameterTypes197 = new String[] {
				"int", "java.util.Date", "int", "int"
			};

		_methodName198 = "findBySMADomainsListByStartDate";

		_methodParameterTypes198 = new String[] {
				"int", "java.util.Date", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName199 = "findBySMADomainsListByStartDate_First";

		_methodParameterTypes199 = new String[] {
				"int", "java.util.Date",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName200 = "fetchBySMADomainsListByStartDate_First";

		_methodParameterTypes200 = new String[] {
				"int", "java.util.Date",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName201 = "findBySMADomainsListByStartDate_Last";

		_methodParameterTypes201 = new String[] {
				"int", "java.util.Date",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName202 = "fetchBySMADomainsListByStartDate_Last";

		_methodParameterTypes202 = new String[] {
				"int", "java.util.Date",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName203 = "findBySMADomainsListByStartDate_PrevAndNext";

		_methodParameterTypes203 = new String[] {
				"long", "int", "java.util.Date",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName204 = "findBySMADomainsListByEndDate";

		_methodParameterTypes204 = new String[] { "int", "java.util.Date" };

		_methodName205 = "findBySMADomainsListByEndDate";

		_methodParameterTypes205 = new String[] {
				"int", "java.util.Date", "int", "int"
			};

		_methodName206 = "findBySMADomainsListByEndDate";

		_methodParameterTypes206 = new String[] {
				"int", "java.util.Date", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName207 = "findBySMADomainsListByEndDate_First";

		_methodParameterTypes207 = new String[] {
				"int", "java.util.Date",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName208 = "fetchBySMADomainsListByEndDate_First";

		_methodParameterTypes208 = new String[] {
				"int", "java.util.Date",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName209 = "findBySMADomainsListByEndDate_Last";

		_methodParameterTypes209 = new String[] {
				"int", "java.util.Date",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName210 = "fetchBySMADomainsListByEndDate_Last";

		_methodParameterTypes210 = new String[] {
				"int", "java.util.Date",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName211 = "findBySMADomainsListByEndDate_PrevAndNext";

		_methodParameterTypes211 = new String[] {
				"long", "int", "java.util.Date",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName212 = "findBySMADomainsListByProvision";

		_methodParameterTypes212 = new String[] { "int", "int" };

		_methodName213 = "findBySMADomainsListByProvision";

		_methodParameterTypes213 = new String[] { "int", "int", "int", "int" };

		_methodName214 = "findBySMADomainsListByProvision";

		_methodParameterTypes214 = new String[] {
				"int", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName215 = "findBySMADomainsListByProvision_First";

		_methodParameterTypes215 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName216 = "fetchBySMADomainsListByProvision_First";

		_methodParameterTypes216 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName217 = "findBySMADomainsListByProvision_Last";

		_methodParameterTypes217 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName218 = "fetchBySMADomainsListByProvision_Last";

		_methodParameterTypes218 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName219 = "findBySMADomainsListByProvision_PrevAndNext";

		_methodParameterTypes219 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName220 = "findAll";

		_methodParameterTypes220 = new String[] {  };

		_methodName221 = "findAll";

		_methodParameterTypes221 = new String[] { "int", "int" };

		_methodName222 = "findAll";

		_methodParameterTypes222 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName223 = "removeBySMADomainsListByCreatedBy";

		_methodParameterTypes223 = new String[] { "int", "java.lang.String" };

		_methodName224 = "removeBySMADomainsListByName";

		_methodParameterTypes224 = new String[] { "int", "java.lang.String" };

		_methodName225 = "removeBySMADomainsListByOwner";

		_methodParameterTypes225 = new String[] { "int", "java.lang.String" };

		_methodName226 = "removeBySMADomainsListByStartDate";

		_methodParameterTypes226 = new String[] { "int", "java.util.Date" };

		_methodName227 = "removeBySMADomainsListByEndDate";

		_methodParameterTypes227 = new String[] { "int", "java.util.Date" };

		_methodName228 = "removeBySMADomainsListByProvision";

		_methodParameterTypes228 = new String[] { "int", "int" };

		_methodName229 = "removeAll";

		_methodParameterTypes229 = new String[] {  };

		_methodName230 = "countBySMADomainsListByCreatedBy";

		_methodParameterTypes230 = new String[] { "int", "java.lang.String" };

		_methodName231 = "countBySMADomainsListByName";

		_methodParameterTypes231 = new String[] { "int", "java.lang.String" };

		_methodName232 = "countBySMADomainsListByOwner";

		_methodParameterTypes232 = new String[] { "int", "java.lang.String" };

		_methodName233 = "countBySMADomainsListByStartDate";

		_methodParameterTypes233 = new String[] { "int", "java.util.Date" };

		_methodName234 = "countBySMADomainsListByEndDate";

		_methodParameterTypes234 = new String[] { "int", "java.util.Date" };

		_methodName235 = "countBySMADomainsListByProvision";

		_methodParameterTypes235 = new String[] { "int", "int" };

		_methodName236 = "countAll";

		_methodParameterTypes236 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return SMAReservationLocalServiceUtil.addSMAReservation((com.pacnet.connect.model.SMAReservation)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return SMAReservationLocalServiceUtil.createSMAReservation(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return SMAReservationLocalServiceUtil.deleteSMAReservation(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return SMAReservationLocalServiceUtil.deleteSMAReservation((com.pacnet.connect.model.SMAReservation)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return SMAReservationLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return SMAReservationLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return SMAReservationLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return SMAReservationLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return SMAReservationLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return SMAReservationLocalServiceUtil.fetchSMAReservation(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return SMAReservationLocalServiceUtil.getSMAReservation(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return SMAReservationLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return SMAReservationLocalServiceUtil.getSMAReservations(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return SMAReservationLocalServiceUtil.getSMAReservationsCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return SMAReservationLocalServiceUtil.updateSMAReservation((com.pacnet.connect.model.SMAReservation)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return SMAReservationLocalServiceUtil.updateSMAReservation((com.pacnet.connect.model.SMAReservation)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return SMAReservationLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			SMAReservationLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			SMAReservationLocalServiceUtil.clearCache();
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			SMAReservationLocalServiceUtil.clearCache((com.pacnet.connect.model.SMAReservation)arguments[0]);
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findWithDynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findWithDynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName162.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes162, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findWithDynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName163.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes163, parameterTypes)) {
			return SMAReservationLocalServiceUtil.update((com.pacnet.connect.model.SMAReservation)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			return SMAReservationLocalServiceUtil.update((com.pacnet.connect.model.SMAReservation)arguments[0],
				((Boolean)arguments[1]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName165.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
			SMAReservationLocalServiceUtil.cacheResult((com.pacnet.connect.model.SMAReservation)arguments[0]);
		}

		if (_methodName166.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes166, parameterTypes)) {
			SMAReservationLocalServiceUtil.cacheResult((java.util.List<com.pacnet.connect.model.SMAReservation>)arguments[0]);
		}

		if (_methodName167.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes167, parameterTypes)) {
			return SMAReservationLocalServiceUtil.create(((Long)arguments[0]).longValue());
		}

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			return SMAReservationLocalServiceUtil.remove(((Long)arguments[0]).longValue());
		}

		if (_methodName169.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes169, parameterTypes)) {
			return SMAReservationLocalServiceUtil.updateImpl((com.pacnet.connect.model.SMAReservation)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findByPrimaryKey(((Long)arguments[0]).longValue());
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			return SMAReservationLocalServiceUtil.fetchByPrimaryKey(((Long)arguments[0]).longValue());
		}

		if (_methodName172.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByCreatedBy(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName173.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByCreatedBy(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName174.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes174, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByCreatedBy(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName175.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes175, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByCreatedBy_First(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			return SMAReservationLocalServiceUtil.fetchBySMADomainsListByCreatedBy_First(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByCreatedBy_Last(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			return SMAReservationLocalServiceUtil.fetchBySMADomainsListByCreatedBy_Last(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName179.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByCreatedBy_PrevAndNext(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName180.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes180, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByName(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName181.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes181, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByName(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName182.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes182, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByName(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName183.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes183, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByName_First(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName184.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes184, parameterTypes)) {
			return SMAReservationLocalServiceUtil.fetchBySMADomainsListByName_First(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName185.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes185, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByName_Last(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName186.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes186, parameterTypes)) {
			return SMAReservationLocalServiceUtil.fetchBySMADomainsListByName_Last(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName187.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes187, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByName_PrevAndNext(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName188.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes188, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByOwner(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName189.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes189, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByOwner(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName190.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes190, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByOwner(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName191.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes191, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByOwner_First(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName192.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes192, parameterTypes)) {
			return SMAReservationLocalServiceUtil.fetchBySMADomainsListByOwner_First(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName193.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes193, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByOwner_Last(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName194.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes194, parameterTypes)) {
			return SMAReservationLocalServiceUtil.fetchBySMADomainsListByOwner_Last(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName195.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes195, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByOwner_PrevAndNext(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName196.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes196, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByStartDate(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1]);
		}

		if (_methodName197.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes197, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByStartDate(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName198.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes198, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByStartDate(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName199.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes199, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByStartDate_First(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName200.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes200, parameterTypes)) {
			return SMAReservationLocalServiceUtil.fetchBySMADomainsListByStartDate_First(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName201.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes201, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByStartDate_Last(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName202.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes202, parameterTypes)) {
			return SMAReservationLocalServiceUtil.fetchBySMADomainsListByStartDate_Last(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName203.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes203, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByStartDate_PrevAndNext(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				(java.util.Date)arguments[2],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName204.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes204, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByEndDate(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1]);
		}

		if (_methodName205.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes205, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByEndDate(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName206.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes206, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByEndDate(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName207.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes207, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByEndDate_First(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName208.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes208, parameterTypes)) {
			return SMAReservationLocalServiceUtil.fetchBySMADomainsListByEndDate_First(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName209.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes209, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByEndDate_Last(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName210.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes210, parameterTypes)) {
			return SMAReservationLocalServiceUtil.fetchBySMADomainsListByEndDate_Last(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName211.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes211, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByEndDate_PrevAndNext(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				(java.util.Date)arguments[2],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName212.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes212, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByProvision(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName213.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes213, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByProvision(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName214.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes214, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByProvision(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName215.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes215, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByProvision_First(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName216.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes216, parameterTypes)) {
			return SMAReservationLocalServiceUtil.fetchBySMADomainsListByProvision_First(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName217.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes217, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByProvision_Last(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName218.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes218, parameterTypes)) {
			return SMAReservationLocalServiceUtil.fetchBySMADomainsListByProvision_Last(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName219.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes219, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findBySMADomainsListByProvision_PrevAndNext(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName220.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes220, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findAll();
		}

		if (_methodName221.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes221, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findAll(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName222.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes222, parameterTypes)) {
			return SMAReservationLocalServiceUtil.findAll(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName223.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes223, parameterTypes)) {
			SMAReservationLocalServiceUtil.removeBySMADomainsListByCreatedBy(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName224.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes224, parameterTypes)) {
			SMAReservationLocalServiceUtil.removeBySMADomainsListByName(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName225.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes225, parameterTypes)) {
			SMAReservationLocalServiceUtil.removeBySMADomainsListByOwner(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName226.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes226, parameterTypes)) {
			SMAReservationLocalServiceUtil.removeBySMADomainsListByStartDate(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1]);
		}

		if (_methodName227.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes227, parameterTypes)) {
			SMAReservationLocalServiceUtil.removeBySMADomainsListByEndDate(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1]);
		}

		if (_methodName228.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes228, parameterTypes)) {
			SMAReservationLocalServiceUtil.removeBySMADomainsListByProvision(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName229.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes229, parameterTypes)) {
			SMAReservationLocalServiceUtil.removeAll();
		}

		if (_methodName230.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes230, parameterTypes)) {
			return SMAReservationLocalServiceUtil.countBySMADomainsListByCreatedBy(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName231.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes231, parameterTypes)) {
			return SMAReservationLocalServiceUtil.countBySMADomainsListByName(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName232.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes232, parameterTypes)) {
			return SMAReservationLocalServiceUtil.countBySMADomainsListByOwner(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName233.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes233, parameterTypes)) {
			return SMAReservationLocalServiceUtil.countBySMADomainsListByStartDate(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1]);
		}

		if (_methodName234.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes234, parameterTypes)) {
			return SMAReservationLocalServiceUtil.countBySMADomainsListByEndDate(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1]);
		}

		if (_methodName235.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes235, parameterTypes)) {
			return SMAReservationLocalServiceUtil.countBySMADomainsListByProvision(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName236.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes236, parameterTypes)) {
			return SMAReservationLocalServiceUtil.countAll();
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
	private String _methodName218;
	private String[] _methodParameterTypes218;
	private String _methodName219;
	private String[] _methodParameterTypes219;
	private String _methodName220;
	private String[] _methodParameterTypes220;
	private String _methodName221;
	private String[] _methodParameterTypes221;
	private String _methodName222;
	private String[] _methodParameterTypes222;
	private String _methodName223;
	private String[] _methodParameterTypes223;
	private String _methodName224;
	private String[] _methodParameterTypes224;
	private String _methodName225;
	private String[] _methodParameterTypes225;
	private String _methodName226;
	private String[] _methodParameterTypes226;
	private String _methodName227;
	private String[] _methodParameterTypes227;
	private String _methodName228;
	private String[] _methodParameterTypes228;
	private String _methodName229;
	private String[] _methodParameterTypes229;
	private String _methodName230;
	private String[] _methodParameterTypes230;
	private String _methodName231;
	private String[] _methodParameterTypes231;
	private String _methodName232;
	private String[] _methodParameterTypes232;
	private String _methodName233;
	private String[] _methodParameterTypes233;
	private String _methodName234;
	private String[] _methodParameterTypes234;
	private String _methodName235;
	private String[] _methodParameterTypes235;
	private String _methodName236;
	private String[] _methodParameterTypes236;
}