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

package com.pacnet.connect.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import com.pacnet.connect.model.AccessLogClp;
import com.pacnet.connect.model.AccessRequestClp;
import com.pacnet.connect.model.AccessRequestFacilityServiceClp;
import com.pacnet.connect.model.AccessRequestNoteHistoryClp;
import com.pacnet.connect.model.AccessRequestStatusClp;
import com.pacnet.connect.model.FacilityAccessClp;
import com.pacnet.connect.model.FacilityAssignmentClp;
import com.pacnet.connect.model.FacilityClp;
import com.pacnet.connect.model.FacilityExternalVisitorClp;
import com.pacnet.connect.model.FacilitySecurityOfficerMappingClp;
import com.pacnet.connect.model.FacilityStaffMappingClp;
import com.pacnet.connect.model.FacilityUserMappingClp;
import com.pacnet.connect.model.FacilityUserServiceClp;
import com.pacnet.connect.model.SMAAdminsClp;
import com.pacnet.connect.model.SMACompaniesClp;
import com.pacnet.connect.model.SMACompanyListClp;
import com.pacnet.connect.model.SMAEmailHistoryClp;
import com.pacnet.connect.model.SMARadacctClp;
import com.pacnet.connect.model.SMARadcheckClp;
import com.pacnet.connect.model.SMAReservationClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"customerLR-service-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"customerLR-service-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "customerLR-service-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(AccessLogClp.class.getName())) {
			return translateInputAccessLog(oldModel);
		}

		if (oldModelClassName.equals(AccessRequestClp.class.getName())) {
			return translateInputAccessRequest(oldModel);
		}

		if (oldModelClassName.equals(
					AccessRequestFacilityServiceClp.class.getName())) {
			return translateInputAccessRequestFacilityService(oldModel);
		}

		if (oldModelClassName.equals(
					AccessRequestNoteHistoryClp.class.getName())) {
			return translateInputAccessRequestNoteHistory(oldModel);
		}

		if (oldModelClassName.equals(AccessRequestStatusClp.class.getName())) {
			return translateInputAccessRequestStatus(oldModel);
		}

		if (oldModelClassName.equals(FacilityClp.class.getName())) {
			return translateInputFacility(oldModel);
		}

		if (oldModelClassName.equals(FacilityAccessClp.class.getName())) {
			return translateInputFacilityAccess(oldModel);
		}

		if (oldModelClassName.equals(FacilityAssignmentClp.class.getName())) {
			return translateInputFacilityAssignment(oldModel);
		}

		if (oldModelClassName.equals(FacilityExternalVisitorClp.class.getName())) {
			return translateInputFacilityExternalVisitor(oldModel);
		}

		if (oldModelClassName.equals(
					FacilitySecurityOfficerMappingClp.class.getName())) {
			return translateInputFacilitySecurityOfficerMapping(oldModel);
		}

		if (oldModelClassName.equals(FacilityStaffMappingClp.class.getName())) {
			return translateInputFacilityStaffMapping(oldModel);
		}

		if (oldModelClassName.equals(FacilityUserMappingClp.class.getName())) {
			return translateInputFacilityUserMapping(oldModel);
		}

		if (oldModelClassName.equals(FacilityUserServiceClp.class.getName())) {
			return translateInputFacilityUserService(oldModel);
		}

		if (oldModelClassName.equals(SMAAdminsClp.class.getName())) {
			return translateInputSMAAdmins(oldModel);
		}

		if (oldModelClassName.equals(SMACompaniesClp.class.getName())) {
			return translateInputSMACompanies(oldModel);
		}

		if (oldModelClassName.equals(SMACompanyListClp.class.getName())) {
			return translateInputSMACompanyList(oldModel);
		}

		if (oldModelClassName.equals(SMAEmailHistoryClp.class.getName())) {
			return translateInputSMAEmailHistory(oldModel);
		}

		if (oldModelClassName.equals(SMARadacctClp.class.getName())) {
			return translateInputSMARadacct(oldModel);
		}

		if (oldModelClassName.equals(SMARadcheckClp.class.getName())) {
			return translateInputSMARadcheck(oldModel);
		}

		if (oldModelClassName.equals(SMAReservationClp.class.getName())) {
			return translateInputSMAReservation(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputAccessLog(BaseModel<?> oldModel) {
		AccessLogClp oldClpModel = (AccessLogClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAccessLogRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAccessRequest(BaseModel<?> oldModel) {
		AccessRequestClp oldClpModel = (AccessRequestClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAccessRequestRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAccessRequestFacilityService(
		BaseModel<?> oldModel) {
		AccessRequestFacilityServiceClp oldClpModel = (AccessRequestFacilityServiceClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAccessRequestFacilityServiceRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAccessRequestNoteHistory(
		BaseModel<?> oldModel) {
		AccessRequestNoteHistoryClp oldClpModel = (AccessRequestNoteHistoryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAccessRequestNoteHistoryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAccessRequestStatus(
		BaseModel<?> oldModel) {
		AccessRequestStatusClp oldClpModel = (AccessRequestStatusClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAccessRequestStatusRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFacility(BaseModel<?> oldModel) {
		FacilityClp oldClpModel = (FacilityClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFacilityRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFacilityAccess(BaseModel<?> oldModel) {
		FacilityAccessClp oldClpModel = (FacilityAccessClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFacilityAccessRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFacilityAssignment(BaseModel<?> oldModel) {
		FacilityAssignmentClp oldClpModel = (FacilityAssignmentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFacilityAssignmentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFacilityExternalVisitor(
		BaseModel<?> oldModel) {
		FacilityExternalVisitorClp oldClpModel = (FacilityExternalVisitorClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFacilityExternalVisitorRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFacilitySecurityOfficerMapping(
		BaseModel<?> oldModel) {
		FacilitySecurityOfficerMappingClp oldClpModel = (FacilitySecurityOfficerMappingClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFacilitySecurityOfficerMappingRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFacilityStaffMapping(
		BaseModel<?> oldModel) {
		FacilityStaffMappingClp oldClpModel = (FacilityStaffMappingClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFacilityStaffMappingRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFacilityUserMapping(
		BaseModel<?> oldModel) {
		FacilityUserMappingClp oldClpModel = (FacilityUserMappingClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFacilityUserMappingRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFacilityUserService(
		BaseModel<?> oldModel) {
		FacilityUserServiceClp oldClpModel = (FacilityUserServiceClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFacilityUserServiceRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSMAAdmins(BaseModel<?> oldModel) {
		SMAAdminsClp oldClpModel = (SMAAdminsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSMAAdminsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSMACompanies(BaseModel<?> oldModel) {
		SMACompaniesClp oldClpModel = (SMACompaniesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSMACompaniesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSMACompanyList(BaseModel<?> oldModel) {
		SMACompanyListClp oldClpModel = (SMACompanyListClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSMACompanyListRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSMAEmailHistory(BaseModel<?> oldModel) {
		SMAEmailHistoryClp oldClpModel = (SMAEmailHistoryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSMAEmailHistoryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSMARadacct(BaseModel<?> oldModel) {
		SMARadacctClp oldClpModel = (SMARadacctClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSMARadacctRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSMARadcheck(BaseModel<?> oldModel) {
		SMARadcheckClp oldClpModel = (SMARadcheckClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSMARadcheckRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSMAReservation(BaseModel<?> oldModel) {
		SMAReservationClp oldClpModel = (SMAReservationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSMAReservationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.AccessLogImpl")) {
			return translateOutputAccessLog(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.AccessRequestImpl")) {
			return translateOutputAccessRequest(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.AccessRequestFacilityServiceImpl")) {
			return translateOutputAccessRequestFacilityService(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.AccessRequestNoteHistoryImpl")) {
			return translateOutputAccessRequestNoteHistory(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.AccessRequestStatusImpl")) {
			return translateOutputAccessRequestStatus(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.FacilityImpl")) {
			return translateOutputFacility(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.FacilityAccessImpl")) {
			return translateOutputFacilityAccess(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.FacilityAssignmentImpl")) {
			return translateOutputFacilityAssignment(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.FacilityExternalVisitorImpl")) {
			return translateOutputFacilityExternalVisitor(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.FacilitySecurityOfficerMappingImpl")) {
			return translateOutputFacilitySecurityOfficerMapping(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.FacilityStaffMappingImpl")) {
			return translateOutputFacilityStaffMapping(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.FacilityUserMappingImpl")) {
			return translateOutputFacilityUserMapping(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.FacilityUserServiceImpl")) {
			return translateOutputFacilityUserService(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.SMAAdminsImpl")) {
			return translateOutputSMAAdmins(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.SMACompaniesImpl")) {
			return translateOutputSMACompanies(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.SMACompanyListImpl")) {
			return translateOutputSMACompanyList(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.SMAEmailHistoryImpl")) {
			return translateOutputSMAEmailHistory(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.SMARadacctImpl")) {
			return translateOutputSMARadacct(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.SMARadcheckImpl")) {
			return translateOutputSMARadcheck(oldModel);
		}

		if (oldModelClassName.equals(
					"com.pacnet.connect.model.impl.SMAReservationImpl")) {
			return translateOutputSMAReservation(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals("com.pacnet.connect.NoSuchAccessLogException")) {
			return new com.pacnet.connect.NoSuchAccessLogException();
		}

		if (className.equals("com.pacnet.connect.NoSuchAccessRequestException")) {
			return new com.pacnet.connect.NoSuchAccessRequestException();
		}

		if (className.equals(
					"com.pacnet.connect.NoSuchAccessRequestFacilityServiceException")) {
			return new com.pacnet.connect.NoSuchAccessRequestFacilityServiceException();
		}

		if (className.equals(
					"com.pacnet.connect.NoSuchAccessRequestNoteHistoryException")) {
			return new com.pacnet.connect.NoSuchAccessRequestNoteHistoryException();
		}

		if (className.equals(
					"com.pacnet.connect.NoSuchAccessRequestStatusException")) {
			return new com.pacnet.connect.NoSuchAccessRequestStatusException();
		}

		if (className.equals("com.pacnet.connect.NoSuchFacilityException")) {
			return new com.pacnet.connect.NoSuchFacilityException();
		}

		if (className.equals("com.pacnet.connect.NoSuchFacilityAccessException")) {
			return new com.pacnet.connect.NoSuchFacilityAccessException();
		}

		if (className.equals(
					"com.pacnet.connect.NoSuchFacilityAssignmentException")) {
			return new com.pacnet.connect.NoSuchFacilityAssignmentException();
		}

		if (className.equals(
					"com.pacnet.connect.NoSuchFacilityExternalVisitorException")) {
			return new com.pacnet.connect.NoSuchFacilityExternalVisitorException();
		}

		if (className.equals(
					"com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException")) {
			return new com.pacnet.connect.NoSuchFacilitySecurityOfficerMappingException();
		}

		if (className.equals(
					"com.pacnet.connect.NoSuchFacilityStaffMappingException")) {
			return new com.pacnet.connect.NoSuchFacilityStaffMappingException();
		}

		if (className.equals(
					"com.pacnet.connect.NoSuchFacilityUserMappingException")) {
			return new com.pacnet.connect.NoSuchFacilityUserMappingException();
		}

		if (className.equals(
					"com.pacnet.connect.NoSuchFacilityUserServiceException")) {
			return new com.pacnet.connect.NoSuchFacilityUserServiceException();
		}

		if (className.equals("com.pacnet.connect.NoSuchSMAAdminsException")) {
			return new com.pacnet.connect.NoSuchSMAAdminsException();
		}

		if (className.equals("com.pacnet.connect.NoSuchSMACompaniesException")) {
			return new com.pacnet.connect.NoSuchSMACompaniesException();
		}

		if (className.equals("com.pacnet.connect.NoSuchSMACompanyListException")) {
			return new com.pacnet.connect.NoSuchSMACompanyListException();
		}

		if (className.equals(
					"com.pacnet.connect.NoSuchSMAEmailHistoryException")) {
			return new com.pacnet.connect.NoSuchSMAEmailHistoryException();
		}

		if (className.equals("com.pacnet.connect.NoSuchSMARadacctException")) {
			return new com.pacnet.connect.NoSuchSMARadacctException();
		}

		if (className.equals("com.pacnet.connect.NoSuchSMARadcheckException")) {
			return new com.pacnet.connect.NoSuchSMARadcheckException();
		}

		if (className.equals("com.pacnet.connect.NoSuchSMAReservationException")) {
			return new com.pacnet.connect.NoSuchSMAReservationException();
		}

		return throwable;
	}

	public static Object translateOutputAccessLog(BaseModel<?> oldModel) {
		AccessLogClp newModel = new AccessLogClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAccessLogRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAccessRequest(BaseModel<?> oldModel) {
		AccessRequestClp newModel = new AccessRequestClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAccessRequestRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAccessRequestFacilityService(
		BaseModel<?> oldModel) {
		AccessRequestFacilityServiceClp newModel = new AccessRequestFacilityServiceClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAccessRequestFacilityServiceRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAccessRequestNoteHistory(
		BaseModel<?> oldModel) {
		AccessRequestNoteHistoryClp newModel = new AccessRequestNoteHistoryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAccessRequestNoteHistoryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAccessRequestStatus(
		BaseModel<?> oldModel) {
		AccessRequestStatusClp newModel = new AccessRequestStatusClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAccessRequestStatusRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFacility(BaseModel<?> oldModel) {
		FacilityClp newModel = new FacilityClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFacilityRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFacilityAccess(BaseModel<?> oldModel) {
		FacilityAccessClp newModel = new FacilityAccessClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFacilityAccessRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFacilityAssignment(
		BaseModel<?> oldModel) {
		FacilityAssignmentClp newModel = new FacilityAssignmentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFacilityAssignmentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFacilityExternalVisitor(
		BaseModel<?> oldModel) {
		FacilityExternalVisitorClp newModel = new FacilityExternalVisitorClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFacilityExternalVisitorRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFacilitySecurityOfficerMapping(
		BaseModel<?> oldModel) {
		FacilitySecurityOfficerMappingClp newModel = new FacilitySecurityOfficerMappingClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFacilitySecurityOfficerMappingRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFacilityStaffMapping(
		BaseModel<?> oldModel) {
		FacilityStaffMappingClp newModel = new FacilityStaffMappingClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFacilityStaffMappingRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFacilityUserMapping(
		BaseModel<?> oldModel) {
		FacilityUserMappingClp newModel = new FacilityUserMappingClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFacilityUserMappingRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFacilityUserService(
		BaseModel<?> oldModel) {
		FacilityUserServiceClp newModel = new FacilityUserServiceClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFacilityUserServiceRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSMAAdmins(BaseModel<?> oldModel) {
		SMAAdminsClp newModel = new SMAAdminsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSMAAdminsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSMACompanies(BaseModel<?> oldModel) {
		SMACompaniesClp newModel = new SMACompaniesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSMACompaniesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSMACompanyList(BaseModel<?> oldModel) {
		SMACompanyListClp newModel = new SMACompanyListClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSMACompanyListRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSMAEmailHistory(BaseModel<?> oldModel) {
		SMAEmailHistoryClp newModel = new SMAEmailHistoryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSMAEmailHistoryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSMARadacct(BaseModel<?> oldModel) {
		SMARadacctClp newModel = new SMARadacctClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSMARadacctRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSMARadcheck(BaseModel<?> oldModel) {
		SMARadcheckClp newModel = new SMARadcheckClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSMARadcheckRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSMAReservation(BaseModel<?> oldModel) {
		SMAReservationClp newModel = new SMAReservationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSMAReservationRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}