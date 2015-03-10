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

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.pacnet.connect.model.FacilityUserMapping;
import com.pacnet.connect.service.AccessLogLocalService;
import com.pacnet.connect.service.AccessLogService;
import com.pacnet.connect.service.AccessRequestFacilityServiceLocalService;
import com.pacnet.connect.service.AccessRequestFacilityServiceService;
import com.pacnet.connect.service.AccessRequestLocalService;
import com.pacnet.connect.service.AccessRequestNoteHistoryLocalService;
import com.pacnet.connect.service.AccessRequestNoteHistoryService;
import com.pacnet.connect.service.AccessRequestService;
import com.pacnet.connect.service.AccessRequestStatusLocalService;
import com.pacnet.connect.service.AccessRequestStatusService;
import com.pacnet.connect.service.FacilityAccessLocalService;
import com.pacnet.connect.service.FacilityAccessService;
import com.pacnet.connect.service.FacilityAssignmentLocalService;
import com.pacnet.connect.service.FacilityAssignmentService;
import com.pacnet.connect.service.FacilityExternalVisitorLocalService;
import com.pacnet.connect.service.FacilityExternalVisitorService;
import com.pacnet.connect.service.FacilityLocalService;
import com.pacnet.connect.service.FacilitySecurityOfficerMappingLocalService;
import com.pacnet.connect.service.FacilitySecurityOfficerMappingService;
import com.pacnet.connect.service.FacilityService;
import com.pacnet.connect.service.FacilityStaffMappingLocalService;
import com.pacnet.connect.service.FacilityStaffMappingService;
import com.pacnet.connect.service.FacilityUserMappingLocalService;
import com.pacnet.connect.service.FacilityUserMappingService;
import com.pacnet.connect.service.FacilityUserServiceLocalService;
import com.pacnet.connect.service.FacilityUserServiceService;
import com.pacnet.connect.service.SMAAdminsLocalService;
import com.pacnet.connect.service.SMAAdminsService;
import com.pacnet.connect.service.SMACompaniesLocalService;
import com.pacnet.connect.service.SMACompaniesService;
import com.pacnet.connect.service.SMACompanyListLocalService;
import com.pacnet.connect.service.SMACompanyListService;
import com.pacnet.connect.service.SMAEmailHistoryLocalService;
import com.pacnet.connect.service.SMAEmailHistoryService;
import com.pacnet.connect.service.SMARadacctLocalService;
import com.pacnet.connect.service.SMARadacctService;
import com.pacnet.connect.service.SMARadcheckLocalService;
import com.pacnet.connect.service.SMARadcheckService;
import com.pacnet.connect.service.SMAReservationLocalService;
import com.pacnet.connect.service.SMAReservationService;
import com.pacnet.connect.service.persistence.AccessLogPersistence;
import com.pacnet.connect.service.persistence.AccessRequestFacilityServicePersistence;
import com.pacnet.connect.service.persistence.AccessRequestNoteHistoryPersistence;
import com.pacnet.connect.service.persistence.AccessRequestPersistence;
import com.pacnet.connect.service.persistence.AccessRequestStatusPersistence;
import com.pacnet.connect.service.persistence.FacilityAccessPersistence;
import com.pacnet.connect.service.persistence.FacilityAssignmentPersistence;
import com.pacnet.connect.service.persistence.FacilityExternalVisitorPersistence;
import com.pacnet.connect.service.persistence.FacilityPersistence;
import com.pacnet.connect.service.persistence.FacilitySecurityOfficerMappingPersistence;
import com.pacnet.connect.service.persistence.FacilityStaffMappingPersistence;
import com.pacnet.connect.service.persistence.FacilityUserMappingPersistence;
import com.pacnet.connect.service.persistence.FacilityUserServicePersistence;
import com.pacnet.connect.service.persistence.SMAAdminsPersistence;
import com.pacnet.connect.service.persistence.SMACompaniesPersistence;
import com.pacnet.connect.service.persistence.SMACompanyListPersistence;
import com.pacnet.connect.service.persistence.SMAEmailHistoryPersistence;
import com.pacnet.connect.service.persistence.SMARadacctPersistence;
import com.pacnet.connect.service.persistence.SMARadcheckPersistence;
import com.pacnet.connect.service.persistence.SMAReservationPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the facility user mapping local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.pacnet.connect.service.impl.FacilityUserMappingLocalServiceImpl}.
 * </p>
 *
 * @author CloudSmartz
 * @see com.pacnet.connect.service.impl.FacilityUserMappingLocalServiceImpl
 * @see com.pacnet.connect.service.FacilityUserMappingLocalServiceUtil
 * @generated
 */
public abstract class FacilityUserMappingLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements FacilityUserMappingLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.pacnet.connect.service.FacilityUserMappingLocalServiceUtil} to access the facility user mapping local service.
	 */

	/**
	 * Adds the facility user mapping to the database. Also notifies the appropriate model listeners.
	 *
	 * @param facilityUserMapping the facility user mapping
	 * @return the facility user mapping that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public FacilityUserMapping addFacilityUserMapping(
		FacilityUserMapping facilityUserMapping) throws SystemException {
		facilityUserMapping.setNew(true);

		return facilityUserMappingPersistence.update(facilityUserMapping, false);
	}

	/**
	 * Creates a new facility user mapping with the primary key. Does not add the facility user mapping to the database.
	 *
	 * @param id the primary key for the new facility user mapping
	 * @return the new facility user mapping
	 */
	public FacilityUserMapping createFacilityUserMapping(long id) {
		return facilityUserMappingPersistence.create(id);
	}

	/**
	 * Deletes the facility user mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the facility user mapping
	 * @return the facility user mapping that was removed
	 * @throws PortalException if a facility user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public FacilityUserMapping deleteFacilityUserMapping(long id)
		throws PortalException, SystemException {
		return facilityUserMappingPersistence.remove(id);
	}

	/**
	 * Deletes the facility user mapping from the database. Also notifies the appropriate model listeners.
	 *
	 * @param facilityUserMapping the facility user mapping
	 * @return the facility user mapping that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public FacilityUserMapping deleteFacilityUserMapping(
		FacilityUserMapping facilityUserMapping) throws SystemException {
		return facilityUserMappingPersistence.remove(facilityUserMapping);
	}

	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(FacilityUserMapping.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return facilityUserMappingPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return facilityUserMappingPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return facilityUserMappingPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return facilityUserMappingPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public FacilityUserMapping fetchFacilityUserMapping(long id)
		throws SystemException {
		return facilityUserMappingPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the facility user mapping with the primary key.
	 *
	 * @param id the primary key of the facility user mapping
	 * @return the facility user mapping
	 * @throws PortalException if a facility user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FacilityUserMapping getFacilityUserMapping(long id)
		throws PortalException, SystemException {
		return facilityUserMappingPersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return facilityUserMappingPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the facility user mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of facility user mappings
	 * @param end the upper bound of the range of facility user mappings (not inclusive)
	 * @return the range of facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public List<FacilityUserMapping> getFacilityUserMappings(int start, int end)
		throws SystemException {
		return facilityUserMappingPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of facility user mappings.
	 *
	 * @return the number of facility user mappings
	 * @throws SystemException if a system exception occurred
	 */
	public int getFacilityUserMappingsCount() throws SystemException {
		return facilityUserMappingPersistence.countAll();
	}

	/**
	 * Updates the facility user mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param facilityUserMapping the facility user mapping
	 * @return the facility user mapping that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public FacilityUserMapping updateFacilityUserMapping(
		FacilityUserMapping facilityUserMapping) throws SystemException {
		return updateFacilityUserMapping(facilityUserMapping, true);
	}

	/**
	 * Updates the facility user mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param facilityUserMapping the facility user mapping
	 * @param merge whether to merge the facility user mapping with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the facility user mapping that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public FacilityUserMapping updateFacilityUserMapping(
		FacilityUserMapping facilityUserMapping, boolean merge)
		throws SystemException {
		facilityUserMapping.setNew(false);

		return facilityUserMappingPersistence.update(facilityUserMapping, merge);
	}

	/**
	 * Returns the access log local service.
	 *
	 * @return the access log local service
	 */
	public AccessLogLocalService getAccessLogLocalService() {
		return accessLogLocalService;
	}

	/**
	 * Sets the access log local service.
	 *
	 * @param accessLogLocalService the access log local service
	 */
	public void setAccessLogLocalService(
		AccessLogLocalService accessLogLocalService) {
		this.accessLogLocalService = accessLogLocalService;
	}

	/**
	 * Returns the access log remote service.
	 *
	 * @return the access log remote service
	 */
	public AccessLogService getAccessLogService() {
		return accessLogService;
	}

	/**
	 * Sets the access log remote service.
	 *
	 * @param accessLogService the access log remote service
	 */
	public void setAccessLogService(AccessLogService accessLogService) {
		this.accessLogService = accessLogService;
	}

	/**
	 * Returns the access log persistence.
	 *
	 * @return the access log persistence
	 */
	public AccessLogPersistence getAccessLogPersistence() {
		return accessLogPersistence;
	}

	/**
	 * Sets the access log persistence.
	 *
	 * @param accessLogPersistence the access log persistence
	 */
	public void setAccessLogPersistence(
		AccessLogPersistence accessLogPersistence) {
		this.accessLogPersistence = accessLogPersistence;
	}

	/**
	 * Returns the access request local service.
	 *
	 * @return the access request local service
	 */
	public AccessRequestLocalService getAccessRequestLocalService() {
		return accessRequestLocalService;
	}

	/**
	 * Sets the access request local service.
	 *
	 * @param accessRequestLocalService the access request local service
	 */
	public void setAccessRequestLocalService(
		AccessRequestLocalService accessRequestLocalService) {
		this.accessRequestLocalService = accessRequestLocalService;
	}

	/**
	 * Returns the access request remote service.
	 *
	 * @return the access request remote service
	 */
	public AccessRequestService getAccessRequestService() {
		return accessRequestService;
	}

	/**
	 * Sets the access request remote service.
	 *
	 * @param accessRequestService the access request remote service
	 */
	public void setAccessRequestService(
		AccessRequestService accessRequestService) {
		this.accessRequestService = accessRequestService;
	}

	/**
	 * Returns the access request persistence.
	 *
	 * @return the access request persistence
	 */
	public AccessRequestPersistence getAccessRequestPersistence() {
		return accessRequestPersistence;
	}

	/**
	 * Sets the access request persistence.
	 *
	 * @param accessRequestPersistence the access request persistence
	 */
	public void setAccessRequestPersistence(
		AccessRequestPersistence accessRequestPersistence) {
		this.accessRequestPersistence = accessRequestPersistence;
	}

	/**
	 * Returns the access request facility service local service.
	 *
	 * @return the access request facility service local service
	 */
	public AccessRequestFacilityServiceLocalService getAccessRequestFacilityServiceLocalService() {
		return accessRequestFacilityServiceLocalService;
	}

	/**
	 * Sets the access request facility service local service.
	 *
	 * @param accessRequestFacilityServiceLocalService the access request facility service local service
	 */
	public void setAccessRequestFacilityServiceLocalService(
		AccessRequestFacilityServiceLocalService accessRequestFacilityServiceLocalService) {
		this.accessRequestFacilityServiceLocalService = accessRequestFacilityServiceLocalService;
	}

	/**
	 * Returns the access request facility service remote service.
	 *
	 * @return the access request facility service remote service
	 */
	public AccessRequestFacilityServiceService getAccessRequestFacilityServiceService() {
		return accessRequestFacilityServiceService;
	}

	/**
	 * Sets the access request facility service remote service.
	 *
	 * @param accessRequestFacilityServiceService the access request facility service remote service
	 */
	public void setAccessRequestFacilityServiceService(
		AccessRequestFacilityServiceService accessRequestFacilityServiceService) {
		this.accessRequestFacilityServiceService = accessRequestFacilityServiceService;
	}

	/**
	 * Returns the access request facility service persistence.
	 *
	 * @return the access request facility service persistence
	 */
	public AccessRequestFacilityServicePersistence getAccessRequestFacilityServicePersistence() {
		return accessRequestFacilityServicePersistence;
	}

	/**
	 * Sets the access request facility service persistence.
	 *
	 * @param accessRequestFacilityServicePersistence the access request facility service persistence
	 */
	public void setAccessRequestFacilityServicePersistence(
		AccessRequestFacilityServicePersistence accessRequestFacilityServicePersistence) {
		this.accessRequestFacilityServicePersistence = accessRequestFacilityServicePersistence;
	}

	/**
	 * Returns the access request note history local service.
	 *
	 * @return the access request note history local service
	 */
	public AccessRequestNoteHistoryLocalService getAccessRequestNoteHistoryLocalService() {
		return accessRequestNoteHistoryLocalService;
	}

	/**
	 * Sets the access request note history local service.
	 *
	 * @param accessRequestNoteHistoryLocalService the access request note history local service
	 */
	public void setAccessRequestNoteHistoryLocalService(
		AccessRequestNoteHistoryLocalService accessRequestNoteHistoryLocalService) {
		this.accessRequestNoteHistoryLocalService = accessRequestNoteHistoryLocalService;
	}

	/**
	 * Returns the access request note history remote service.
	 *
	 * @return the access request note history remote service
	 */
	public AccessRequestNoteHistoryService getAccessRequestNoteHistoryService() {
		return accessRequestNoteHistoryService;
	}

	/**
	 * Sets the access request note history remote service.
	 *
	 * @param accessRequestNoteHistoryService the access request note history remote service
	 */
	public void setAccessRequestNoteHistoryService(
		AccessRequestNoteHistoryService accessRequestNoteHistoryService) {
		this.accessRequestNoteHistoryService = accessRequestNoteHistoryService;
	}

	/**
	 * Returns the access request note history persistence.
	 *
	 * @return the access request note history persistence
	 */
	public AccessRequestNoteHistoryPersistence getAccessRequestNoteHistoryPersistence() {
		return accessRequestNoteHistoryPersistence;
	}

	/**
	 * Sets the access request note history persistence.
	 *
	 * @param accessRequestNoteHistoryPersistence the access request note history persistence
	 */
	public void setAccessRequestNoteHistoryPersistence(
		AccessRequestNoteHistoryPersistence accessRequestNoteHistoryPersistence) {
		this.accessRequestNoteHistoryPersistence = accessRequestNoteHistoryPersistence;
	}

	/**
	 * Returns the access request status local service.
	 *
	 * @return the access request status local service
	 */
	public AccessRequestStatusLocalService getAccessRequestStatusLocalService() {
		return accessRequestStatusLocalService;
	}

	/**
	 * Sets the access request status local service.
	 *
	 * @param accessRequestStatusLocalService the access request status local service
	 */
	public void setAccessRequestStatusLocalService(
		AccessRequestStatusLocalService accessRequestStatusLocalService) {
		this.accessRequestStatusLocalService = accessRequestStatusLocalService;
	}

	/**
	 * Returns the access request status remote service.
	 *
	 * @return the access request status remote service
	 */
	public AccessRequestStatusService getAccessRequestStatusService() {
		return accessRequestStatusService;
	}

	/**
	 * Sets the access request status remote service.
	 *
	 * @param accessRequestStatusService the access request status remote service
	 */
	public void setAccessRequestStatusService(
		AccessRequestStatusService accessRequestStatusService) {
		this.accessRequestStatusService = accessRequestStatusService;
	}

	/**
	 * Returns the access request status persistence.
	 *
	 * @return the access request status persistence
	 */
	public AccessRequestStatusPersistence getAccessRequestStatusPersistence() {
		return accessRequestStatusPersistence;
	}

	/**
	 * Sets the access request status persistence.
	 *
	 * @param accessRequestStatusPersistence the access request status persistence
	 */
	public void setAccessRequestStatusPersistence(
		AccessRequestStatusPersistence accessRequestStatusPersistence) {
		this.accessRequestStatusPersistence = accessRequestStatusPersistence;
	}

	/**
	 * Returns the facility local service.
	 *
	 * @return the facility local service
	 */
	public FacilityLocalService getFacilityLocalService() {
		return facilityLocalService;
	}

	/**
	 * Sets the facility local service.
	 *
	 * @param facilityLocalService the facility local service
	 */
	public void setFacilityLocalService(
		FacilityLocalService facilityLocalService) {
		this.facilityLocalService = facilityLocalService;
	}

	/**
	 * Returns the facility remote service.
	 *
	 * @return the facility remote service
	 */
	public FacilityService getFacilityService() {
		return facilityService;
	}

	/**
	 * Sets the facility remote service.
	 *
	 * @param facilityService the facility remote service
	 */
	public void setFacilityService(FacilityService facilityService) {
		this.facilityService = facilityService;
	}

	/**
	 * Returns the facility persistence.
	 *
	 * @return the facility persistence
	 */
	public FacilityPersistence getFacilityPersistence() {
		return facilityPersistence;
	}

	/**
	 * Sets the facility persistence.
	 *
	 * @param facilityPersistence the facility persistence
	 */
	public void setFacilityPersistence(FacilityPersistence facilityPersistence) {
		this.facilityPersistence = facilityPersistence;
	}

	/**
	 * Returns the facility access local service.
	 *
	 * @return the facility access local service
	 */
	public FacilityAccessLocalService getFacilityAccessLocalService() {
		return facilityAccessLocalService;
	}

	/**
	 * Sets the facility access local service.
	 *
	 * @param facilityAccessLocalService the facility access local service
	 */
	public void setFacilityAccessLocalService(
		FacilityAccessLocalService facilityAccessLocalService) {
		this.facilityAccessLocalService = facilityAccessLocalService;
	}

	/**
	 * Returns the facility access remote service.
	 *
	 * @return the facility access remote service
	 */
	public FacilityAccessService getFacilityAccessService() {
		return facilityAccessService;
	}

	/**
	 * Sets the facility access remote service.
	 *
	 * @param facilityAccessService the facility access remote service
	 */
	public void setFacilityAccessService(
		FacilityAccessService facilityAccessService) {
		this.facilityAccessService = facilityAccessService;
	}

	/**
	 * Returns the facility access persistence.
	 *
	 * @return the facility access persistence
	 */
	public FacilityAccessPersistence getFacilityAccessPersistence() {
		return facilityAccessPersistence;
	}

	/**
	 * Sets the facility access persistence.
	 *
	 * @param facilityAccessPersistence the facility access persistence
	 */
	public void setFacilityAccessPersistence(
		FacilityAccessPersistence facilityAccessPersistence) {
		this.facilityAccessPersistence = facilityAccessPersistence;
	}

	/**
	 * Returns the facility assignment local service.
	 *
	 * @return the facility assignment local service
	 */
	public FacilityAssignmentLocalService getFacilityAssignmentLocalService() {
		return facilityAssignmentLocalService;
	}

	/**
	 * Sets the facility assignment local service.
	 *
	 * @param facilityAssignmentLocalService the facility assignment local service
	 */
	public void setFacilityAssignmentLocalService(
		FacilityAssignmentLocalService facilityAssignmentLocalService) {
		this.facilityAssignmentLocalService = facilityAssignmentLocalService;
	}

	/**
	 * Returns the facility assignment remote service.
	 *
	 * @return the facility assignment remote service
	 */
	public FacilityAssignmentService getFacilityAssignmentService() {
		return facilityAssignmentService;
	}

	/**
	 * Sets the facility assignment remote service.
	 *
	 * @param facilityAssignmentService the facility assignment remote service
	 */
	public void setFacilityAssignmentService(
		FacilityAssignmentService facilityAssignmentService) {
		this.facilityAssignmentService = facilityAssignmentService;
	}

	/**
	 * Returns the facility assignment persistence.
	 *
	 * @return the facility assignment persistence
	 */
	public FacilityAssignmentPersistence getFacilityAssignmentPersistence() {
		return facilityAssignmentPersistence;
	}

	/**
	 * Sets the facility assignment persistence.
	 *
	 * @param facilityAssignmentPersistence the facility assignment persistence
	 */
	public void setFacilityAssignmentPersistence(
		FacilityAssignmentPersistence facilityAssignmentPersistence) {
		this.facilityAssignmentPersistence = facilityAssignmentPersistence;
	}

	/**
	 * Returns the facility external visitor local service.
	 *
	 * @return the facility external visitor local service
	 */
	public FacilityExternalVisitorLocalService getFacilityExternalVisitorLocalService() {
		return facilityExternalVisitorLocalService;
	}

	/**
	 * Sets the facility external visitor local service.
	 *
	 * @param facilityExternalVisitorLocalService the facility external visitor local service
	 */
	public void setFacilityExternalVisitorLocalService(
		FacilityExternalVisitorLocalService facilityExternalVisitorLocalService) {
		this.facilityExternalVisitorLocalService = facilityExternalVisitorLocalService;
	}

	/**
	 * Returns the facility external visitor remote service.
	 *
	 * @return the facility external visitor remote service
	 */
	public FacilityExternalVisitorService getFacilityExternalVisitorService() {
		return facilityExternalVisitorService;
	}

	/**
	 * Sets the facility external visitor remote service.
	 *
	 * @param facilityExternalVisitorService the facility external visitor remote service
	 */
	public void setFacilityExternalVisitorService(
		FacilityExternalVisitorService facilityExternalVisitorService) {
		this.facilityExternalVisitorService = facilityExternalVisitorService;
	}

	/**
	 * Returns the facility external visitor persistence.
	 *
	 * @return the facility external visitor persistence
	 */
	public FacilityExternalVisitorPersistence getFacilityExternalVisitorPersistence() {
		return facilityExternalVisitorPersistence;
	}

	/**
	 * Sets the facility external visitor persistence.
	 *
	 * @param facilityExternalVisitorPersistence the facility external visitor persistence
	 */
	public void setFacilityExternalVisitorPersistence(
		FacilityExternalVisitorPersistence facilityExternalVisitorPersistence) {
		this.facilityExternalVisitorPersistence = facilityExternalVisitorPersistence;
	}

	/**
	 * Returns the facility security officer mapping local service.
	 *
	 * @return the facility security officer mapping local service
	 */
	public FacilitySecurityOfficerMappingLocalService getFacilitySecurityOfficerMappingLocalService() {
		return facilitySecurityOfficerMappingLocalService;
	}

	/**
	 * Sets the facility security officer mapping local service.
	 *
	 * @param facilitySecurityOfficerMappingLocalService the facility security officer mapping local service
	 */
	public void setFacilitySecurityOfficerMappingLocalService(
		FacilitySecurityOfficerMappingLocalService facilitySecurityOfficerMappingLocalService) {
		this.facilitySecurityOfficerMappingLocalService = facilitySecurityOfficerMappingLocalService;
	}

	/**
	 * Returns the facility security officer mapping remote service.
	 *
	 * @return the facility security officer mapping remote service
	 */
	public FacilitySecurityOfficerMappingService getFacilitySecurityOfficerMappingService() {
		return facilitySecurityOfficerMappingService;
	}

	/**
	 * Sets the facility security officer mapping remote service.
	 *
	 * @param facilitySecurityOfficerMappingService the facility security officer mapping remote service
	 */
	public void setFacilitySecurityOfficerMappingService(
		FacilitySecurityOfficerMappingService facilitySecurityOfficerMappingService) {
		this.facilitySecurityOfficerMappingService = facilitySecurityOfficerMappingService;
	}

	/**
	 * Returns the facility security officer mapping persistence.
	 *
	 * @return the facility security officer mapping persistence
	 */
	public FacilitySecurityOfficerMappingPersistence getFacilitySecurityOfficerMappingPersistence() {
		return facilitySecurityOfficerMappingPersistence;
	}

	/**
	 * Sets the facility security officer mapping persistence.
	 *
	 * @param facilitySecurityOfficerMappingPersistence the facility security officer mapping persistence
	 */
	public void setFacilitySecurityOfficerMappingPersistence(
		FacilitySecurityOfficerMappingPersistence facilitySecurityOfficerMappingPersistence) {
		this.facilitySecurityOfficerMappingPersistence = facilitySecurityOfficerMappingPersistence;
	}

	/**
	 * Returns the facility staff mapping local service.
	 *
	 * @return the facility staff mapping local service
	 */
	public FacilityStaffMappingLocalService getFacilityStaffMappingLocalService() {
		return facilityStaffMappingLocalService;
	}

	/**
	 * Sets the facility staff mapping local service.
	 *
	 * @param facilityStaffMappingLocalService the facility staff mapping local service
	 */
	public void setFacilityStaffMappingLocalService(
		FacilityStaffMappingLocalService facilityStaffMappingLocalService) {
		this.facilityStaffMappingLocalService = facilityStaffMappingLocalService;
	}

	/**
	 * Returns the facility staff mapping remote service.
	 *
	 * @return the facility staff mapping remote service
	 */
	public FacilityStaffMappingService getFacilityStaffMappingService() {
		return facilityStaffMappingService;
	}

	/**
	 * Sets the facility staff mapping remote service.
	 *
	 * @param facilityStaffMappingService the facility staff mapping remote service
	 */
	public void setFacilityStaffMappingService(
		FacilityStaffMappingService facilityStaffMappingService) {
		this.facilityStaffMappingService = facilityStaffMappingService;
	}

	/**
	 * Returns the facility staff mapping persistence.
	 *
	 * @return the facility staff mapping persistence
	 */
	public FacilityStaffMappingPersistence getFacilityStaffMappingPersistence() {
		return facilityStaffMappingPersistence;
	}

	/**
	 * Sets the facility staff mapping persistence.
	 *
	 * @param facilityStaffMappingPersistence the facility staff mapping persistence
	 */
	public void setFacilityStaffMappingPersistence(
		FacilityStaffMappingPersistence facilityStaffMappingPersistence) {
		this.facilityStaffMappingPersistence = facilityStaffMappingPersistence;
	}

	/**
	 * Returns the facility user mapping local service.
	 *
	 * @return the facility user mapping local service
	 */
	public FacilityUserMappingLocalService getFacilityUserMappingLocalService() {
		return facilityUserMappingLocalService;
	}

	/**
	 * Sets the facility user mapping local service.
	 *
	 * @param facilityUserMappingLocalService the facility user mapping local service
	 */
	public void setFacilityUserMappingLocalService(
		FacilityUserMappingLocalService facilityUserMappingLocalService) {
		this.facilityUserMappingLocalService = facilityUserMappingLocalService;
	}

	/**
	 * Returns the facility user mapping remote service.
	 *
	 * @return the facility user mapping remote service
	 */
	public FacilityUserMappingService getFacilityUserMappingService() {
		return facilityUserMappingService;
	}

	/**
	 * Sets the facility user mapping remote service.
	 *
	 * @param facilityUserMappingService the facility user mapping remote service
	 */
	public void setFacilityUserMappingService(
		FacilityUserMappingService facilityUserMappingService) {
		this.facilityUserMappingService = facilityUserMappingService;
	}

	/**
	 * Returns the facility user mapping persistence.
	 *
	 * @return the facility user mapping persistence
	 */
	public FacilityUserMappingPersistence getFacilityUserMappingPersistence() {
		return facilityUserMappingPersistence;
	}

	/**
	 * Sets the facility user mapping persistence.
	 *
	 * @param facilityUserMappingPersistence the facility user mapping persistence
	 */
	public void setFacilityUserMappingPersistence(
		FacilityUserMappingPersistence facilityUserMappingPersistence) {
		this.facilityUserMappingPersistence = facilityUserMappingPersistence;
	}

	/**
	 * Returns the facility user service local service.
	 *
	 * @return the facility user service local service
	 */
	public FacilityUserServiceLocalService getFacilityUserServiceLocalService() {
		return facilityUserServiceLocalService;
	}

	/**
	 * Sets the facility user service local service.
	 *
	 * @param facilityUserServiceLocalService the facility user service local service
	 */
	public void setFacilityUserServiceLocalService(
		FacilityUserServiceLocalService facilityUserServiceLocalService) {
		this.facilityUserServiceLocalService = facilityUserServiceLocalService;
	}

	/**
	 * Returns the facility user service remote service.
	 *
	 * @return the facility user service remote service
	 */
	public FacilityUserServiceService getFacilityUserServiceService() {
		return facilityUserServiceService;
	}

	/**
	 * Sets the facility user service remote service.
	 *
	 * @param facilityUserServiceService the facility user service remote service
	 */
	public void setFacilityUserServiceService(
		FacilityUserServiceService facilityUserServiceService) {
		this.facilityUserServiceService = facilityUserServiceService;
	}

	/**
	 * Returns the facility user service persistence.
	 *
	 * @return the facility user service persistence
	 */
	public FacilityUserServicePersistence getFacilityUserServicePersistence() {
		return facilityUserServicePersistence;
	}

	/**
	 * Sets the facility user service persistence.
	 *
	 * @param facilityUserServicePersistence the facility user service persistence
	 */
	public void setFacilityUserServicePersistence(
		FacilityUserServicePersistence facilityUserServicePersistence) {
		this.facilityUserServicePersistence = facilityUserServicePersistence;
	}

	/**
	 * Returns the s m a admins local service.
	 *
	 * @return the s m a admins local service
	 */
	public SMAAdminsLocalService getSMAAdminsLocalService() {
		return smaAdminsLocalService;
	}

	/**
	 * Sets the s m a admins local service.
	 *
	 * @param smaAdminsLocalService the s m a admins local service
	 */
	public void setSMAAdminsLocalService(
		SMAAdminsLocalService smaAdminsLocalService) {
		this.smaAdminsLocalService = smaAdminsLocalService;
	}

	/**
	 * Returns the s m a admins remote service.
	 *
	 * @return the s m a admins remote service
	 */
	public SMAAdminsService getSMAAdminsService() {
		return smaAdminsService;
	}

	/**
	 * Sets the s m a admins remote service.
	 *
	 * @param smaAdminsService the s m a admins remote service
	 */
	public void setSMAAdminsService(SMAAdminsService smaAdminsService) {
		this.smaAdminsService = smaAdminsService;
	}

	/**
	 * Returns the s m a admins persistence.
	 *
	 * @return the s m a admins persistence
	 */
	public SMAAdminsPersistence getSMAAdminsPersistence() {
		return smaAdminsPersistence;
	}

	/**
	 * Sets the s m a admins persistence.
	 *
	 * @param smaAdminsPersistence the s m a admins persistence
	 */
	public void setSMAAdminsPersistence(
		SMAAdminsPersistence smaAdminsPersistence) {
		this.smaAdminsPersistence = smaAdminsPersistence;
	}

	/**
	 * Returns the s m a companies local service.
	 *
	 * @return the s m a companies local service
	 */
	public SMACompaniesLocalService getSMACompaniesLocalService() {
		return smaCompaniesLocalService;
	}

	/**
	 * Sets the s m a companies local service.
	 *
	 * @param smaCompaniesLocalService the s m a companies local service
	 */
	public void setSMACompaniesLocalService(
		SMACompaniesLocalService smaCompaniesLocalService) {
		this.smaCompaniesLocalService = smaCompaniesLocalService;
	}

	/**
	 * Returns the s m a companies remote service.
	 *
	 * @return the s m a companies remote service
	 */
	public SMACompaniesService getSMACompaniesService() {
		return smaCompaniesService;
	}

	/**
	 * Sets the s m a companies remote service.
	 *
	 * @param smaCompaniesService the s m a companies remote service
	 */
	public void setSMACompaniesService(SMACompaniesService smaCompaniesService) {
		this.smaCompaniesService = smaCompaniesService;
	}

	/**
	 * Returns the s m a companies persistence.
	 *
	 * @return the s m a companies persistence
	 */
	public SMACompaniesPersistence getSMACompaniesPersistence() {
		return smaCompaniesPersistence;
	}

	/**
	 * Sets the s m a companies persistence.
	 *
	 * @param smaCompaniesPersistence the s m a companies persistence
	 */
	public void setSMACompaniesPersistence(
		SMACompaniesPersistence smaCompaniesPersistence) {
		this.smaCompaniesPersistence = smaCompaniesPersistence;
	}

	/**
	 * Returns the s m a company list local service.
	 *
	 * @return the s m a company list local service
	 */
	public SMACompanyListLocalService getSMACompanyListLocalService() {
		return smaCompanyListLocalService;
	}

	/**
	 * Sets the s m a company list local service.
	 *
	 * @param smaCompanyListLocalService the s m a company list local service
	 */
	public void setSMACompanyListLocalService(
		SMACompanyListLocalService smaCompanyListLocalService) {
		this.smaCompanyListLocalService = smaCompanyListLocalService;
	}

	/**
	 * Returns the s m a company list remote service.
	 *
	 * @return the s m a company list remote service
	 */
	public SMACompanyListService getSMACompanyListService() {
		return smaCompanyListService;
	}

	/**
	 * Sets the s m a company list remote service.
	 *
	 * @param smaCompanyListService the s m a company list remote service
	 */
	public void setSMACompanyListService(
		SMACompanyListService smaCompanyListService) {
		this.smaCompanyListService = smaCompanyListService;
	}

	/**
	 * Returns the s m a company list persistence.
	 *
	 * @return the s m a company list persistence
	 */
	public SMACompanyListPersistence getSMACompanyListPersistence() {
		return smaCompanyListPersistence;
	}

	/**
	 * Sets the s m a company list persistence.
	 *
	 * @param smaCompanyListPersistence the s m a company list persistence
	 */
	public void setSMACompanyListPersistence(
		SMACompanyListPersistence smaCompanyListPersistence) {
		this.smaCompanyListPersistence = smaCompanyListPersistence;
	}

	/**
	 * Returns the s m a email history local service.
	 *
	 * @return the s m a email history local service
	 */
	public SMAEmailHistoryLocalService getSMAEmailHistoryLocalService() {
		return smaEmailHistoryLocalService;
	}

	/**
	 * Sets the s m a email history local service.
	 *
	 * @param smaEmailHistoryLocalService the s m a email history local service
	 */
	public void setSMAEmailHistoryLocalService(
		SMAEmailHistoryLocalService smaEmailHistoryLocalService) {
		this.smaEmailHistoryLocalService = smaEmailHistoryLocalService;
	}

	/**
	 * Returns the s m a email history remote service.
	 *
	 * @return the s m a email history remote service
	 */
	public SMAEmailHistoryService getSMAEmailHistoryService() {
		return smaEmailHistoryService;
	}

	/**
	 * Sets the s m a email history remote service.
	 *
	 * @param smaEmailHistoryService the s m a email history remote service
	 */
	public void setSMAEmailHistoryService(
		SMAEmailHistoryService smaEmailHistoryService) {
		this.smaEmailHistoryService = smaEmailHistoryService;
	}

	/**
	 * Returns the s m a email history persistence.
	 *
	 * @return the s m a email history persistence
	 */
	public SMAEmailHistoryPersistence getSMAEmailHistoryPersistence() {
		return smaEmailHistoryPersistence;
	}

	/**
	 * Sets the s m a email history persistence.
	 *
	 * @param smaEmailHistoryPersistence the s m a email history persistence
	 */
	public void setSMAEmailHistoryPersistence(
		SMAEmailHistoryPersistence smaEmailHistoryPersistence) {
		this.smaEmailHistoryPersistence = smaEmailHistoryPersistence;
	}

	/**
	 * Returns the s m a radacct local service.
	 *
	 * @return the s m a radacct local service
	 */
	public SMARadacctLocalService getSMARadacctLocalService() {
		return smaRadacctLocalService;
	}

	/**
	 * Sets the s m a radacct local service.
	 *
	 * @param smaRadacctLocalService the s m a radacct local service
	 */
	public void setSMARadacctLocalService(
		SMARadacctLocalService smaRadacctLocalService) {
		this.smaRadacctLocalService = smaRadacctLocalService;
	}

	/**
	 * Returns the s m a radacct remote service.
	 *
	 * @return the s m a radacct remote service
	 */
	public SMARadacctService getSMARadacctService() {
		return smaRadacctService;
	}

	/**
	 * Sets the s m a radacct remote service.
	 *
	 * @param smaRadacctService the s m a radacct remote service
	 */
	public void setSMARadacctService(SMARadacctService smaRadacctService) {
		this.smaRadacctService = smaRadacctService;
	}

	/**
	 * Returns the s m a radacct persistence.
	 *
	 * @return the s m a radacct persistence
	 */
	public SMARadacctPersistence getSMARadacctPersistence() {
		return smaRadacctPersistence;
	}

	/**
	 * Sets the s m a radacct persistence.
	 *
	 * @param smaRadacctPersistence the s m a radacct persistence
	 */
	public void setSMARadacctPersistence(
		SMARadacctPersistence smaRadacctPersistence) {
		this.smaRadacctPersistence = smaRadacctPersistence;
	}

	/**
	 * Returns the s m a radcheck local service.
	 *
	 * @return the s m a radcheck local service
	 */
	public SMARadcheckLocalService getSMARadcheckLocalService() {
		return smaRadcheckLocalService;
	}

	/**
	 * Sets the s m a radcheck local service.
	 *
	 * @param smaRadcheckLocalService the s m a radcheck local service
	 */
	public void setSMARadcheckLocalService(
		SMARadcheckLocalService smaRadcheckLocalService) {
		this.smaRadcheckLocalService = smaRadcheckLocalService;
	}

	/**
	 * Returns the s m a radcheck remote service.
	 *
	 * @return the s m a radcheck remote service
	 */
	public SMARadcheckService getSMARadcheckService() {
		return smaRadcheckService;
	}

	/**
	 * Sets the s m a radcheck remote service.
	 *
	 * @param smaRadcheckService the s m a radcheck remote service
	 */
	public void setSMARadcheckService(SMARadcheckService smaRadcheckService) {
		this.smaRadcheckService = smaRadcheckService;
	}

	/**
	 * Returns the s m a radcheck persistence.
	 *
	 * @return the s m a radcheck persistence
	 */
	public SMARadcheckPersistence getSMARadcheckPersistence() {
		return smaRadcheckPersistence;
	}

	/**
	 * Sets the s m a radcheck persistence.
	 *
	 * @param smaRadcheckPersistence the s m a radcheck persistence
	 */
	public void setSMARadcheckPersistence(
		SMARadcheckPersistence smaRadcheckPersistence) {
		this.smaRadcheckPersistence = smaRadcheckPersistence;
	}

	/**
	 * Returns the s m a reservation local service.
	 *
	 * @return the s m a reservation local service
	 */
	public SMAReservationLocalService getSMAReservationLocalService() {
		return smaReservationLocalService;
	}

	/**
	 * Sets the s m a reservation local service.
	 *
	 * @param smaReservationLocalService the s m a reservation local service
	 */
	public void setSMAReservationLocalService(
		SMAReservationLocalService smaReservationLocalService) {
		this.smaReservationLocalService = smaReservationLocalService;
	}

	/**
	 * Returns the s m a reservation remote service.
	 *
	 * @return the s m a reservation remote service
	 */
	public SMAReservationService getSMAReservationService() {
		return smaReservationService;
	}

	/**
	 * Sets the s m a reservation remote service.
	 *
	 * @param smaReservationService the s m a reservation remote service
	 */
	public void setSMAReservationService(
		SMAReservationService smaReservationService) {
		this.smaReservationService = smaReservationService;
	}

	/**
	 * Returns the s m a reservation persistence.
	 *
	 * @return the s m a reservation persistence
	 */
	public SMAReservationPersistence getSMAReservationPersistence() {
		return smaReservationPersistence;
	}

	/**
	 * Sets the s m a reservation persistence.
	 *
	 * @param smaReservationPersistence the s m a reservation persistence
	 */
	public void setSMAReservationPersistence(
		SMAReservationPersistence smaReservationPersistence) {
		this.smaReservationPersistence = smaReservationPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		PersistedModelLocalServiceRegistryUtil.register("com.pacnet.connect.model.FacilityUserMapping",
			facilityUserMappingLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.pacnet.connect.model.FacilityUserMapping");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return FacilityUserMapping.class;
	}

	protected String getModelClassName() {
		return FacilityUserMapping.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = facilityUserMappingPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = AccessLogLocalService.class)
	protected AccessLogLocalService accessLogLocalService;
	@BeanReference(type = AccessLogService.class)
	protected AccessLogService accessLogService;
	@BeanReference(type = AccessLogPersistence.class)
	protected AccessLogPersistence accessLogPersistence;
	@BeanReference(type = AccessRequestLocalService.class)
	protected AccessRequestLocalService accessRequestLocalService;
	@BeanReference(type = AccessRequestService.class)
	protected AccessRequestService accessRequestService;
	@BeanReference(type = AccessRequestPersistence.class)
	protected AccessRequestPersistence accessRequestPersistence;
	@BeanReference(type = AccessRequestFacilityServiceLocalService.class)
	protected AccessRequestFacilityServiceLocalService accessRequestFacilityServiceLocalService;
	@BeanReference(type = AccessRequestFacilityServiceService.class)
	protected AccessRequestFacilityServiceService accessRequestFacilityServiceService;
	@BeanReference(type = AccessRequestFacilityServicePersistence.class)
	protected AccessRequestFacilityServicePersistence accessRequestFacilityServicePersistence;
	@BeanReference(type = AccessRequestNoteHistoryLocalService.class)
	protected AccessRequestNoteHistoryLocalService accessRequestNoteHistoryLocalService;
	@BeanReference(type = AccessRequestNoteHistoryService.class)
	protected AccessRequestNoteHistoryService accessRequestNoteHistoryService;
	@BeanReference(type = AccessRequestNoteHistoryPersistence.class)
	protected AccessRequestNoteHistoryPersistence accessRequestNoteHistoryPersistence;
	@BeanReference(type = AccessRequestStatusLocalService.class)
	protected AccessRequestStatusLocalService accessRequestStatusLocalService;
	@BeanReference(type = AccessRequestStatusService.class)
	protected AccessRequestStatusService accessRequestStatusService;
	@BeanReference(type = AccessRequestStatusPersistence.class)
	protected AccessRequestStatusPersistence accessRequestStatusPersistence;
	@BeanReference(type = FacilityLocalService.class)
	protected FacilityLocalService facilityLocalService;
	@BeanReference(type = FacilityService.class)
	protected FacilityService facilityService;
	@BeanReference(type = FacilityPersistence.class)
	protected FacilityPersistence facilityPersistence;
	@BeanReference(type = FacilityAccessLocalService.class)
	protected FacilityAccessLocalService facilityAccessLocalService;
	@BeanReference(type = FacilityAccessService.class)
	protected FacilityAccessService facilityAccessService;
	@BeanReference(type = FacilityAccessPersistence.class)
	protected FacilityAccessPersistence facilityAccessPersistence;
	@BeanReference(type = FacilityAssignmentLocalService.class)
	protected FacilityAssignmentLocalService facilityAssignmentLocalService;
	@BeanReference(type = FacilityAssignmentService.class)
	protected FacilityAssignmentService facilityAssignmentService;
	@BeanReference(type = FacilityAssignmentPersistence.class)
	protected FacilityAssignmentPersistence facilityAssignmentPersistence;
	@BeanReference(type = FacilityExternalVisitorLocalService.class)
	protected FacilityExternalVisitorLocalService facilityExternalVisitorLocalService;
	@BeanReference(type = FacilityExternalVisitorService.class)
	protected FacilityExternalVisitorService facilityExternalVisitorService;
	@BeanReference(type = FacilityExternalVisitorPersistence.class)
	protected FacilityExternalVisitorPersistence facilityExternalVisitorPersistence;
	@BeanReference(type = FacilitySecurityOfficerMappingLocalService.class)
	protected FacilitySecurityOfficerMappingLocalService facilitySecurityOfficerMappingLocalService;
	@BeanReference(type = FacilitySecurityOfficerMappingService.class)
	protected FacilitySecurityOfficerMappingService facilitySecurityOfficerMappingService;
	@BeanReference(type = FacilitySecurityOfficerMappingPersistence.class)
	protected FacilitySecurityOfficerMappingPersistence facilitySecurityOfficerMappingPersistence;
	@BeanReference(type = FacilityStaffMappingLocalService.class)
	protected FacilityStaffMappingLocalService facilityStaffMappingLocalService;
	@BeanReference(type = FacilityStaffMappingService.class)
	protected FacilityStaffMappingService facilityStaffMappingService;
	@BeanReference(type = FacilityStaffMappingPersistence.class)
	protected FacilityStaffMappingPersistence facilityStaffMappingPersistence;
	@BeanReference(type = FacilityUserMappingLocalService.class)
	protected FacilityUserMappingLocalService facilityUserMappingLocalService;
	@BeanReference(type = FacilityUserMappingService.class)
	protected FacilityUserMappingService facilityUserMappingService;
	@BeanReference(type = FacilityUserMappingPersistence.class)
	protected FacilityUserMappingPersistence facilityUserMappingPersistence;
	@BeanReference(type = FacilityUserServiceLocalService.class)
	protected FacilityUserServiceLocalService facilityUserServiceLocalService;
	@BeanReference(type = FacilityUserServiceService.class)
	protected FacilityUserServiceService facilityUserServiceService;
	@BeanReference(type = FacilityUserServicePersistence.class)
	protected FacilityUserServicePersistence facilityUserServicePersistence;
	@BeanReference(type = SMAAdminsLocalService.class)
	protected SMAAdminsLocalService smaAdminsLocalService;
	@BeanReference(type = SMAAdminsService.class)
	protected SMAAdminsService smaAdminsService;
	@BeanReference(type = SMAAdminsPersistence.class)
	protected SMAAdminsPersistence smaAdminsPersistence;
	@BeanReference(type = SMACompaniesLocalService.class)
	protected SMACompaniesLocalService smaCompaniesLocalService;
	@BeanReference(type = SMACompaniesService.class)
	protected SMACompaniesService smaCompaniesService;
	@BeanReference(type = SMACompaniesPersistence.class)
	protected SMACompaniesPersistence smaCompaniesPersistence;
	@BeanReference(type = SMACompanyListLocalService.class)
	protected SMACompanyListLocalService smaCompanyListLocalService;
	@BeanReference(type = SMACompanyListService.class)
	protected SMACompanyListService smaCompanyListService;
	@BeanReference(type = SMACompanyListPersistence.class)
	protected SMACompanyListPersistence smaCompanyListPersistence;
	@BeanReference(type = SMAEmailHistoryLocalService.class)
	protected SMAEmailHistoryLocalService smaEmailHistoryLocalService;
	@BeanReference(type = SMAEmailHistoryService.class)
	protected SMAEmailHistoryService smaEmailHistoryService;
	@BeanReference(type = SMAEmailHistoryPersistence.class)
	protected SMAEmailHistoryPersistence smaEmailHistoryPersistence;
	@BeanReference(type = SMARadacctLocalService.class)
	protected SMARadacctLocalService smaRadacctLocalService;
	@BeanReference(type = SMARadacctService.class)
	protected SMARadacctService smaRadacctService;
	@BeanReference(type = SMARadacctPersistence.class)
	protected SMARadacctPersistence smaRadacctPersistence;
	@BeanReference(type = SMARadcheckLocalService.class)
	protected SMARadcheckLocalService smaRadcheckLocalService;
	@BeanReference(type = SMARadcheckService.class)
	protected SMARadcheckService smaRadcheckService;
	@BeanReference(type = SMARadcheckPersistence.class)
	protected SMARadcheckPersistence smaRadcheckPersistence;
	@BeanReference(type = SMAReservationLocalService.class)
	protected SMAReservationLocalService smaReservationLocalService;
	@BeanReference(type = SMAReservationService.class)
	protected SMAReservationService smaReservationService;
	@BeanReference(type = SMAReservationPersistence.class)
	protected SMAReservationPersistence smaReservationPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private FacilityUserMappingLocalServiceClpInvoker _clpInvoker = new FacilityUserMappingLocalServiceClpInvoker();
}