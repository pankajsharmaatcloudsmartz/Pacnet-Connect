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

import com.pacnet.connect.service.SMARadcheckLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class SMARadcheckLocalServiceClpInvoker {
	public SMARadcheckLocalServiceClpInvoker() {
		_methodName0 = "addSMARadcheck";

		_methodParameterTypes0 = new String[] {
				"com.pacnet.connect.model.SMARadcheck"
			};

		_methodName1 = "createSMARadcheck";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteSMARadcheck";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteSMARadcheck";

		_methodParameterTypes3 = new String[] {
				"com.pacnet.connect.model.SMARadcheck"
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

		_methodName9 = "fetchSMARadcheck";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getSMARadcheck";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getSMARadchecks";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getSMARadchecksCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateSMARadcheck";

		_methodParameterTypes14 = new String[] {
				"com.pacnet.connect.model.SMARadcheck"
			};

		_methodName15 = "updateSMARadcheck";

		_methodParameterTypes15 = new String[] {
				"com.pacnet.connect.model.SMARadcheck", "boolean"
			};

		_methodName152 = "getBeanIdentifier";

		_methodParameterTypes152 = new String[] {  };

		_methodName153 = "setBeanIdentifier";

		_methodParameterTypes153 = new String[] { "java.lang.String" };

		_methodName158 = "clearCache";

		_methodParameterTypes158 = new String[] {  };

		_methodName159 = "clearCache";

		_methodParameterTypes159 = new String[] {
				"com.pacnet.connect.model.SMARadcheck"
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
				"com.pacnet.connect.model.SMARadcheck", "boolean"
			};

		_methodName164 = "update";

		_methodParameterTypes164 = new String[] {
				"com.pacnet.connect.model.SMARadcheck", "boolean",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName165 = "cacheResult";

		_methodParameterTypes165 = new String[] {
				"com.pacnet.connect.model.SMARadcheck"
			};

		_methodName166 = "cacheResult";

		_methodParameterTypes166 = new String[] { "java.util.List" };

		_methodName167 = "create";

		_methodParameterTypes167 = new String[] { "long" };

		_methodName168 = "remove";

		_methodParameterTypes168 = new String[] { "long" };

		_methodName169 = "updateImpl";

		_methodParameterTypes169 = new String[] {
				"com.pacnet.connect.model.SMARadcheck", "boolean"
			};

		_methodName170 = "findByPrimaryKey";

		_methodParameterTypes170 = new String[] { "long" };

		_methodName171 = "fetchByPrimaryKey";

		_methodParameterTypes171 = new String[] { "long" };

		_methodName172 = "findBySMAUserListByCompanyId";

		_methodParameterTypes172 = new String[] { "int", "long" };

		_methodName173 = "findBySMAUserListByCompanyId";

		_methodParameterTypes173 = new String[] { "int", "long", "int", "int" };

		_methodName174 = "findBySMAUserListByCompanyId";

		_methodParameterTypes174 = new String[] {
				"int", "long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName175 = "findBySMAUserListByCompanyId_First";

		_methodParameterTypes175 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName176 = "fetchBySMAUserListByCompanyId_First";

		_methodParameterTypes176 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName177 = "findBySMAUserListByCompanyId_Last";

		_methodParameterTypes177 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName178 = "fetchBySMAUserListByCompanyId_Last";

		_methodParameterTypes178 = new String[] {
				"int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName179 = "findBySMAUserListByCompanyId_PrevAndNext";

		_methodParameterTypes179 = new String[] {
				"long", "int", "long",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName180 = "findBySMAUserListByIsAdmin";

		_methodParameterTypes180 = new String[] { "int", "int" };

		_methodName181 = "findBySMAUserListByIsAdmin";

		_methodParameterTypes181 = new String[] { "int", "int", "int", "int" };

		_methodName182 = "findBySMAUserListByIsAdmin";

		_methodParameterTypes182 = new String[] {
				"int", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName183 = "findBySMAUserListByIsAdmin_First";

		_methodParameterTypes183 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName184 = "fetchBySMAUserListByIsAdmin_First";

		_methodParameterTypes184 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName185 = "findBySMAUserListByIsAdmin_Last";

		_methodParameterTypes185 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName186 = "fetchBySMAUserListByIsAdmin_Last";

		_methodParameterTypes186 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName187 = "findBySMAUserListByIsAdmin_PrevAndNext";

		_methodParameterTypes187 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName188 = "findAll";

		_methodParameterTypes188 = new String[] {  };

		_methodName189 = "findAll";

		_methodParameterTypes189 = new String[] { "int", "int" };

		_methodName190 = "findAll";

		_methodParameterTypes190 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName191 = "removeBySMAUserListByCompanyId";

		_methodParameterTypes191 = new String[] { "int", "long" };

		_methodName192 = "removeBySMAUserListByIsAdmin";

		_methodParameterTypes192 = new String[] { "int", "int" };

		_methodName193 = "removeAll";

		_methodParameterTypes193 = new String[] {  };

		_methodName194 = "countBySMAUserListByCompanyId";

		_methodParameterTypes194 = new String[] { "int", "long" };

		_methodName195 = "countBySMAUserListByIsAdmin";

		_methodParameterTypes195 = new String[] { "int", "int" };

		_methodName196 = "countBySMAUserListByIsAdminCompanyId";

		_methodParameterTypes196 = new String[] { "int", "int", "long" };

		_methodName197 = "countAll";

		_methodParameterTypes197 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.addSMARadcheck((com.pacnet.connect.model.SMARadcheck)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.createSMARadcheck(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.deleteSMARadcheck(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.deleteSMARadcheck((com.pacnet.connect.model.SMARadcheck)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.fetchSMARadcheck(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.getSMARadcheck(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.getSMARadchecks(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.getSMARadchecksCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.updateSMARadcheck((com.pacnet.connect.model.SMARadcheck)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.updateSMARadcheck((com.pacnet.connect.model.SMARadcheck)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			SMARadcheckLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			SMARadcheckLocalServiceUtil.clearCache();
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			SMARadcheckLocalServiceUtil.clearCache((com.pacnet.connect.model.SMARadcheck)arguments[0]);
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findWithDynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findWithDynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName162.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes162, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findWithDynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName163.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes163, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.update((com.pacnet.connect.model.SMARadcheck)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.update((com.pacnet.connect.model.SMARadcheck)arguments[0],
				((Boolean)arguments[1]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName165.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
			SMARadcheckLocalServiceUtil.cacheResult((com.pacnet.connect.model.SMARadcheck)arguments[0]);
		}

		if (_methodName166.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes166, parameterTypes)) {
			SMARadcheckLocalServiceUtil.cacheResult((java.util.List<com.pacnet.connect.model.SMARadcheck>)arguments[0]);
		}

		if (_methodName167.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes167, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.create(((Long)arguments[0]).longValue());
		}

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.remove(((Long)arguments[0]).longValue());
		}

		if (_methodName169.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes169, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.updateImpl((com.pacnet.connect.model.SMARadcheck)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findByPrimaryKey(((Long)arguments[0]).longValue());
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.fetchByPrimaryKey(((Long)arguments[0]).longValue());
		}

		if (_methodName172.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findBySMAUserListByCompanyId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName173.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findBySMAUserListByCompanyId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName174.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes174, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findBySMAUserListByCompanyId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName175.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes175, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findBySMAUserListByCompanyId_First(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.fetchBySMAUserListByCompanyId_First(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findBySMAUserListByCompanyId_Last(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.fetchBySMAUserListByCompanyId_Last(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName179.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findBySMAUserListByCompanyId_PrevAndNext(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Long)arguments[2]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName180.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes180, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findBySMAUserListByIsAdmin(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName181.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes181, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findBySMAUserListByIsAdmin(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName182.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes182, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findBySMAUserListByIsAdmin(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName183.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes183, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findBySMAUserListByIsAdmin_First(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName184.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes184, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.fetchBySMAUserListByIsAdmin_First(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName185.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes185, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findBySMAUserListByIsAdmin_Last(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName186.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes186, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.fetchBySMAUserListByIsAdmin_Last(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName187.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes187, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findBySMAUserListByIsAdmin_PrevAndNext(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName188.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes188, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findAll();
		}

		if (_methodName189.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes189, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findAll(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName190.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes190, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.findAll(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName191.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes191, parameterTypes)) {
			SMARadcheckLocalServiceUtil.removeBySMAUserListByCompanyId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName192.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes192, parameterTypes)) {
			SMARadcheckLocalServiceUtil.removeBySMAUserListByIsAdmin(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName193.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes193, parameterTypes)) {
			SMARadcheckLocalServiceUtil.removeAll();
		}

		if (_methodName194.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes194, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.countBySMAUserListByCompanyId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName195.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes195, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.countBySMAUserListByIsAdmin(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName196.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes196, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.countBySMAUserListByIsAdminCompanyId(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName197.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes197, parameterTypes)) {
			return SMARadcheckLocalServiceUtil.countAll();
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
}