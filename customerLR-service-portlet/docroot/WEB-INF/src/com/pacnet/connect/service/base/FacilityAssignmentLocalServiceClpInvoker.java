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

import com.pacnet.connect.service.FacilityAssignmentLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class FacilityAssignmentLocalServiceClpInvoker {
	public FacilityAssignmentLocalServiceClpInvoker() {
		_methodName0 = "addFacilityAssignment";

		_methodParameterTypes0 = new String[] {
				"com.pacnet.connect.model.FacilityAssignment"
			};

		_methodName1 = "createFacilityAssignment";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteFacilityAssignment";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteFacilityAssignment";

		_methodParameterTypes3 = new String[] {
				"com.pacnet.connect.model.FacilityAssignment"
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

		_methodName9 = "fetchFacilityAssignment";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getFacilityAssignment";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getFacilityAssignments";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getFacilityAssignmentsCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateFacilityAssignment";

		_methodParameterTypes14 = new String[] {
				"com.pacnet.connect.model.FacilityAssignment"
			};

		_methodName15 = "updateFacilityAssignment";

		_methodParameterTypes15 = new String[] {
				"com.pacnet.connect.model.FacilityAssignment", "boolean"
			};

		_methodName152 = "getBeanIdentifier";

		_methodParameterTypes152 = new String[] {  };

		_methodName153 = "setBeanIdentifier";

		_methodParameterTypes153 = new String[] { "java.lang.String" };

		_methodName158 = "createFacilityAssignment";

		_methodParameterTypes158 = new String[] {
				"long", "long", "long", "boolean", "java.lang.String",
				"java.sql.Date", "java.lang.String", "java.sql.Date"
			};

		_methodName159 = "updateFacilityAssignment";

		_methodParameterTypes159 = new String[] {
				"long", "long", "long", "long", "boolean", "java.lang.String",
				"java.sql.Date", "java.lang.String", "java.sql.Date"
			};

		_methodName160 = "deleteFacilityById";

		_methodParameterTypes160 = new String[] { "long" };

		_methodName161 = "getFacilityAssignmentByStatus";

		_methodParameterTypes161 = new String[] { "int" };

		_methodName162 = "getFacilityAssignmentByStatusAndCustId";

		_methodParameterTypes162 = new String[] { "int", "long" };

		_methodName163 = "findByFacilityAssignmentByCustomerId";

		_methodParameterTypes163 = new String[] { "long" };

		_methodName164 = "findByFacilityAssignmentByCustomerId";

		_methodParameterTypes164 = new String[] { "long", "int", "int" };

		_methodName165 = "findByFacilityAssignmentByCustomerId";

		_methodParameterTypes165 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName166 = "findByFacilityAssignmentByCustomerId_First";

		_methodParameterTypes166 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName167 = "fetchByFacilityAssignmentByCustomerId_First";

		_methodParameterTypes167 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName168 = "findByFacilityAssignmentByCustomerId_Last";

		_methodParameterTypes168 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName169 = "fetchByFacilityAssignmentByCustomerId_Last";

		_methodParameterTypes169 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName170 = "findByFacilityAssignmentByFacility";

		_methodParameterTypes170 = new String[] { "long" };

		_methodName171 = "findByFacilityAssignmentByFacility";

		_methodParameterTypes171 = new String[] { "long", "int", "int" };

		_methodName172 = "findByFacilityAssignmentByFacility";

		_methodParameterTypes172 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName173 = "findByFacilityAssignmentByFacility_First";

		_methodParameterTypes173 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName174 = "fetchByFacilityAssignmentByFacility_First";

		_methodParameterTypes174 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName175 = "findByFacilityAssignmentByFacility_Last";

		_methodParameterTypes175 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName176 = "fetchByFacilityAssignmentByFacility_Last";

		_methodParameterTypes176 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName177 = "findByFacilityAssignmentByService";

		_methodParameterTypes177 = new String[] { "long" };

		_methodName178 = "findByFacilityAssignmentByService";

		_methodParameterTypes178 = new String[] { "long", "int", "int" };

		_methodName179 = "findByFacilityAssignmentByService";

		_methodParameterTypes179 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName180 = "findByFacilityAssignmentByService_First";

		_methodParameterTypes180 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName181 = "fetchByFacilityAssignmentByService_First";

		_methodParameterTypes181 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName182 = "findByFacilityAssignmentByService_Last";

		_methodParameterTypes182 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName183 = "fetchByFacilityAssignmentByService_Last";

		_methodParameterTypes183 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.addFacilityAssignment((com.pacnet.connect.model.FacilityAssignment)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.createFacilityAssignment(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.deleteFacilityAssignment(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.deleteFacilityAssignment((com.pacnet.connect.model.FacilityAssignment)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.fetchFacilityAssignment(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.getFacilityAssignment(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.getFacilityAssignments(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.getFacilityAssignmentsCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.updateFacilityAssignment((com.pacnet.connect.model.FacilityAssignment)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.updateFacilityAssignment((com.pacnet.connect.model.FacilityAssignment)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			FacilityAssignmentLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.createFacilityAssignment(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Boolean)arguments[3]).booleanValue(),
				(java.lang.String)arguments[4], (java.sql.Date)arguments[5],
				(java.lang.String)arguments[6], (java.sql.Date)arguments[7]);
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.updateFacilityAssignment(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue(),
				((Boolean)arguments[4]).booleanValue(),
				(java.lang.String)arguments[5], (java.sql.Date)arguments[6],
				(java.lang.String)arguments[7], (java.sql.Date)arguments[8]);
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.deleteFacilityById(((Long)arguments[0]).longValue());
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.getFacilityAssignmentByStatus(((Integer)arguments[0]).intValue());
		}

		if (_methodName162.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes162, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.getFacilityAssignmentByStatusAndCustId(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName163.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes163, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.findByFacilityAssignmentByCustomerId(((Long)arguments[0]).longValue());
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.findByFacilityAssignmentByCustomerId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName165.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.findByFacilityAssignmentByCustomerId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName166.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes166, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.findByFacilityAssignmentByCustomerId_First(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName167.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes167, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.fetchByFacilityAssignmentByCustomerId_First(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.findByFacilityAssignmentByCustomerId_Last(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName169.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes169, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.fetchByFacilityAssignmentByCustomerId_Last(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.findByFacilityAssignmentByFacility(((Long)arguments[0]).longValue());
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.findByFacilityAssignmentByFacility(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName172.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.findByFacilityAssignmentByFacility(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName173.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.findByFacilityAssignmentByFacility_First(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName174.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes174, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.fetchByFacilityAssignmentByFacility_First(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName175.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes175, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.findByFacilityAssignmentByFacility_Last(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.fetchByFacilityAssignmentByFacility_Last(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.findByFacilityAssignmentByService(((Long)arguments[0]).longValue());
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.findByFacilityAssignmentByService(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName179.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.findByFacilityAssignmentByService(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName180.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes180, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.findByFacilityAssignmentByService_First(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName181.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes181, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.fetchByFacilityAssignmentByService_First(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName182.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes182, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.findByFacilityAssignmentByService_Last(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName183.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes183, parameterTypes)) {
			return FacilityAssignmentLocalServiceUtil.fetchByFacilityAssignmentByService_Last(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
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
}