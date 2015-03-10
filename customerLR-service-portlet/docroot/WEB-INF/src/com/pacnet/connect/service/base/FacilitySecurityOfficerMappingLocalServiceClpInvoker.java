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

import com.pacnet.connect.service.FacilitySecurityOfficerMappingLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class FacilitySecurityOfficerMappingLocalServiceClpInvoker {
	public FacilitySecurityOfficerMappingLocalServiceClpInvoker() {
		_methodName0 = "addFacilitySecurityOfficerMapping";

		_methodParameterTypes0 = new String[] {
				"com.pacnet.connect.model.FacilitySecurityOfficerMapping"
			};

		_methodName1 = "createFacilitySecurityOfficerMapping";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteFacilitySecurityOfficerMapping";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteFacilitySecurityOfficerMapping";

		_methodParameterTypes3 = new String[] {
				"com.pacnet.connect.model.FacilitySecurityOfficerMapping"
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

		_methodName9 = "fetchFacilitySecurityOfficerMapping";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getFacilitySecurityOfficerMapping";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getFacilitySecurityOfficerMappings";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getFacilitySecurityOfficerMappingsCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateFacilitySecurityOfficerMapping";

		_methodParameterTypes14 = new String[] {
				"com.pacnet.connect.model.FacilitySecurityOfficerMapping"
			};

		_methodName15 = "updateFacilitySecurityOfficerMapping";

		_methodParameterTypes15 = new String[] {
				"com.pacnet.connect.model.FacilitySecurityOfficerMapping",
				"boolean"
			};

		_methodName152 = "getBeanIdentifier";

		_methodParameterTypes152 = new String[] {  };

		_methodName153 = "setBeanIdentifier";

		_methodParameterTypes153 = new String[] { "java.lang.String" };

		_methodName158 = "createFacilitySecurityOfficerMapping";

		_methodParameterTypes158 = new String[] {
				"long", "long", "boolean", "java.lang.String", "java.sql.Date",
				"java.lang.String", "java.sql.Date"
			};

		_methodName159 = "updateFacilitySecurityOfficerMapping";

		_methodParameterTypes159 = new String[] {
				"long", "long", "long", "boolean", "java.lang.String",
				"java.sql.Date", "java.lang.String", "java.sql.Date"
			};

		_methodName160 = "deleteFacilityById";

		_methodParameterTypes160 = new String[] { "long" };

		_methodName161 = "findByFacilitySecurityByFacility";

		_methodParameterTypes161 = new String[] { "long" };

		_methodName162 = "findByFacilitySecurityByFacility";

		_methodParameterTypes162 = new String[] { "long", "int", "int" };

		_methodName163 = "findByFacilitySecurityByFacility";

		_methodParameterTypes163 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName164 = "findByFacilitySecurityByFacility_First";

		_methodParameterTypes164 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName165 = "fetchByFacilitySecurityByFacility_First";

		_methodParameterTypes165 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName166 = "findByFacilitySecurityByFacility_Last";

		_methodParameterTypes166 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName167 = "fetchByFacilitySecurityByFacility_Last";

		_methodParameterTypes167 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName168 = "findByFacilitySecurityBySecurityOfficerUserId";

		_methodParameterTypes168 = new String[] { "long" };

		_methodName169 = "findByFacilitySecurityBySecurityOfficerUserId";

		_methodParameterTypes169 = new String[] { "long", "int", "int" };

		_methodName170 = "findByFacilitySecurityBySecurityOfficerUserId";

		_methodParameterTypes170 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.addFacilitySecurityOfficerMapping((com.pacnet.connect.model.FacilitySecurityOfficerMapping)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.createFacilitySecurityOfficerMapping(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.deleteFacilitySecurityOfficerMapping(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.deleteFacilitySecurityOfficerMapping((com.pacnet.connect.model.FacilitySecurityOfficerMapping)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.fetchFacilitySecurityOfficerMapping(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.getFacilitySecurityOfficerMapping(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.getFacilitySecurityOfficerMappings(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.getFacilitySecurityOfficerMappingsCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.updateFacilitySecurityOfficerMapping((com.pacnet.connect.model.FacilitySecurityOfficerMapping)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.updateFacilitySecurityOfficerMapping((com.pacnet.connect.model.FacilitySecurityOfficerMapping)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			FacilitySecurityOfficerMappingLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.createFacilitySecurityOfficerMapping(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Boolean)arguments[2]).booleanValue(),
				(java.lang.String)arguments[3], (java.sql.Date)arguments[4],
				(java.lang.String)arguments[5], (java.sql.Date)arguments[6]);
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.updateFacilitySecurityOfficerMapping(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Boolean)arguments[3]).booleanValue(),
				(java.lang.String)arguments[4], (java.sql.Date)arguments[5],
				(java.lang.String)arguments[6], (java.sql.Date)arguments[7]);
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.deleteFacilityById(((Long)arguments[0]).longValue());
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.findByFacilitySecurityByFacility(((Long)arguments[0]).longValue());
		}

		if (_methodName162.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes162, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.findByFacilitySecurityByFacility(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName163.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes163, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.findByFacilitySecurityByFacility(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.findByFacilitySecurityByFacility_First(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName165.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.fetchByFacilitySecurityByFacility_First(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName166.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes166, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.findByFacilitySecurityByFacility_Last(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName167.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes167, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.fetchByFacilitySecurityByFacility_Last(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.findByFacilitySecurityBySecurityOfficerUserId(((Long)arguments[0]).longValue());
		}

		if (_methodName169.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes169, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.findByFacilitySecurityBySecurityOfficerUserId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return FacilitySecurityOfficerMappingLocalServiceUtil.findByFacilitySecurityBySecurityOfficerUserId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
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
}