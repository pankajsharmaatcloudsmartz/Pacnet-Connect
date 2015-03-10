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

import com.pacnet.connect.service.FacilityAccessLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class FacilityAccessLocalServiceClpInvoker {
	public FacilityAccessLocalServiceClpInvoker() {
		_methodName0 = "addFacilityAccess";

		_methodParameterTypes0 = new String[] {
				"com.pacnet.connect.model.FacilityAccess"
			};

		_methodName1 = "createFacilityAccess";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteFacilityAccess";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteFacilityAccess";

		_methodParameterTypes3 = new String[] {
				"com.pacnet.connect.model.FacilityAccess"
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

		_methodName9 = "fetchFacilityAccess";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getFacilityAccess";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getFacilityAccesses";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getFacilityAccessesCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateFacilityAccess";

		_methodParameterTypes14 = new String[] {
				"com.pacnet.connect.model.FacilityAccess"
			};

		_methodName15 = "updateFacilityAccess";

		_methodParameterTypes15 = new String[] {
				"com.pacnet.connect.model.FacilityAccess", "boolean"
			};

		_methodName152 = "getBeanIdentifier";

		_methodParameterTypes152 = new String[] {  };

		_methodName153 = "setBeanIdentifier";

		_methodParameterTypes153 = new String[] { "java.lang.String" };

		_methodName158 = "createFacilityAccess";

		_methodParameterTypes158 = new String[] {
				"java.lang.String", "boolean", "java.lang.String",
				"java.sql.Date", "java.lang.String", "java.sql.Date"
			};

		_methodName159 = "updateFacilityAccess";

		_methodParameterTypes159 = new String[] {
				"long", "java.lang.String", "boolean", "java.lang.String",
				"java.sql.Date", "java.lang.String", "java.sql.Date"
			};

		_methodName160 = "deleteFacilityById";

		_methodParameterTypes160 = new String[] { "long" };

		_methodName161 = "findByFacilityServiceName";

		_methodParameterTypes161 = new String[] { "java.lang.String" };

		_methodName162 = "findByFacilityServiceName";

		_methodParameterTypes162 = new String[] { "java.lang.String", "int", "int" };

		_methodName163 = "findByFacilityServiceName";

		_methodParameterTypes163 = new String[] {
				"java.lang.String", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName164 = "findByFacilityServiceName_First";

		_methodParameterTypes164 = new String[] {
				"java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName165 = "fetchByFacilityServiceName_First";

		_methodParameterTypes165 = new String[] {
				"java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName166 = "findByFacilityServiceName_Last";

		_methodParameterTypes166 = new String[] {
				"java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName167 = "fetchByFacilityServiceName_Last";

		_methodParameterTypes167 = new String[] {
				"java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName168 = "findByFacilityServiceName_PrevAndNext";

		_methodParameterTypes168 = new String[] {
				"long", "java.lang.String",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.addFacilityAccess((com.pacnet.connect.model.FacilityAccess)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.createFacilityAccess(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.deleteFacilityAccess(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.deleteFacilityAccess((com.pacnet.connect.model.FacilityAccess)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.fetchFacilityAccess(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.getFacilityAccess(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.getFacilityAccesses(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.getFacilityAccessesCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.updateFacilityAccess((com.pacnet.connect.model.FacilityAccess)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.updateFacilityAccess((com.pacnet.connect.model.FacilityAccess)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			FacilityAccessLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.createFacilityAccess((java.lang.String)arguments[0],
				((Boolean)arguments[1]).booleanValue(),
				(java.lang.String)arguments[2], (java.sql.Date)arguments[3],
				(java.lang.String)arguments[4], (java.sql.Date)arguments[5]);
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.updateFacilityAccess(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Boolean)arguments[2]).booleanValue(),
				(java.lang.String)arguments[3], (java.sql.Date)arguments[4],
				(java.lang.String)arguments[5], (java.sql.Date)arguments[6]);
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.deleteFacilityById(((Long)arguments[0]).longValue());
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.findByFacilityServiceName((java.lang.String)arguments[0]);
		}

		if (_methodName162.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes162, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.findByFacilityServiceName((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName163.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes163, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.findByFacilityServiceName((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.findByFacilityServiceName_First((java.lang.String)arguments[0],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName165.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.fetchByFacilityServiceName_First((java.lang.String)arguments[0],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName166.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes166, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.findByFacilityServiceName_Last((java.lang.String)arguments[0],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName167.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes167, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.fetchByFacilityServiceName_Last((java.lang.String)arguments[0],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			return FacilityAccessLocalServiceUtil.findByFacilityServiceName_PrevAndNext(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
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
}