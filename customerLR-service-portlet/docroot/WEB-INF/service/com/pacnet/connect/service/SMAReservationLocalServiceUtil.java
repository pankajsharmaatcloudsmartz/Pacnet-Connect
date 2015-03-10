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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the s m a reservation local service. This utility wraps {@link com.pacnet.connect.service.impl.SMAReservationLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see SMAReservationLocalService
 * @see com.pacnet.connect.service.base.SMAReservationLocalServiceBaseImpl
 * @see com.pacnet.connect.service.impl.SMAReservationLocalServiceImpl
 * @generated
 */
public class SMAReservationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.pacnet.connect.service.impl.SMAReservationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the s m a reservation to the database. Also notifies the appropriate model listeners.
	*
	* @param smaReservation the s m a reservation
	* @return the s m a reservation that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation addSMAReservation(
		com.pacnet.connect.model.SMAReservation smaReservation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSMAReservation(smaReservation);
	}

	/**
	* Creates a new s m a reservation with the primary key. Does not add the s m a reservation to the database.
	*
	* @param id the primary key for the new s m a reservation
	* @return the new s m a reservation
	*/
	public static com.pacnet.connect.model.SMAReservation createSMAReservation(
		long id) {
		return getService().createSMAReservation(id);
	}

	/**
	* Deletes the s m a reservation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a reservation
	* @return the s m a reservation that was removed
	* @throws PortalException if a s m a reservation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation deleteSMAReservation(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSMAReservation(id);
	}

	/**
	* Deletes the s m a reservation from the database. Also notifies the appropriate model listeners.
	*
	* @param smaReservation the s m a reservation
	* @return the s m a reservation that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation deleteSMAReservation(
		com.pacnet.connect.model.SMAReservation smaReservation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSMAReservation(smaReservation);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.pacnet.connect.model.SMAReservation fetchSMAReservation(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSMAReservation(id);
	}

	/**
	* Returns the s m a reservation with the primary key.
	*
	* @param id the primary key of the s m a reservation
	* @return the s m a reservation
	* @throws PortalException if a s m a reservation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation getSMAReservation(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMAReservation(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the s m a reservations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a reservations
	* @param end the upper bound of the range of s m a reservations (not inclusive)
	* @return the range of s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> getSMAReservations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMAReservations(start, end);
	}

	/**
	* Returns the number of s m a reservations.
	*
	* @return the number of s m a reservations
	* @throws SystemException if a system exception occurred
	*/
	public static int getSMAReservationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSMAReservationsCount();
	}

	/**
	* Updates the s m a reservation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaReservation the s m a reservation
	* @return the s m a reservation that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation updateSMAReservation(
		com.pacnet.connect.model.SMAReservation smaReservation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSMAReservation(smaReservation);
	}

	/**
	* Updates the s m a reservation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smaReservation the s m a reservation
	* @param merge whether to merge the s m a reservation with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s m a reservation that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation updateSMAReservation(
		com.pacnet.connect.model.SMAReservation smaReservation, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSMAReservation(smaReservation, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	*/
	public static void clearCache() {
		getService().clearCache();
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	*/
	public static void clearCache(
		com.pacnet.connect.model.SMAReservation smaReservation) {
		getService().clearCache(smaReservation);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findWithDynamicQuery(dynamicQuery);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int)
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery,
	int, int, OrderByComparator)
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean)
	*/
	public static com.pacnet.connect.model.SMAReservation update(
		com.pacnet.connect.model.SMAReservation smaReservation, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().update(smaReservation, merge);
	}

	/**
	* @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel,
	boolean, ServiceContext)
	*/
	public static com.pacnet.connect.model.SMAReservation update(
		com.pacnet.connect.model.SMAReservation smaReservation, boolean merge,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().update(smaReservation, merge, serviceContext);
	}

	/**
	* Caches the s m a reservation in the entity cache if it is enabled.
	*
	* @param smaReservation
	the s m a reservation
	*/
	public static void cacheResult(
		com.pacnet.connect.model.SMAReservation smaReservation) {
		getService().cacheResult(smaReservation);
	}

	/**
	* Caches the s m a reservations in the entity cache if it is enabled.
	*
	* @param smaReservations
	the s m a reservations
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.SMAReservation> smaReservations) {
		getService().cacheResult(smaReservations);
	}

	/**
	* Creates a new s m a reservation with the primary key. Does not add the s
	* m a reservation to the database.
	*
	* @param id
	the primary key for the new s m a reservation
	* @return the new s m a reservation
	*/
	public static com.pacnet.connect.model.SMAReservation create(long id) {
		return getService().create(id);
	}

	/**
	* Removes the s m a reservation with the primary key from the database.
	* Also notifies the appropriate model listeners.
	*
	* @param id
	the primary key of the s m a reservation
	* @return the s m a reservation that was removed
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a s m a reservation with the primary key could not be
	found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService().remove(id);
	}

	public static com.pacnet.connect.model.SMAReservation updateImpl(
		com.pacnet.connect.model.SMAReservation smaReservation, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImpl(smaReservation, merge);
	}

	/**
	* Returns the s m a reservation with the primary key or throws a
	* {@link com.pacnet.connect.NoSuchSMAReservationException} if it could not
	* be found.
	*
	* @param id
	the primary key of the s m a reservation
	* @return the s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a s m a reservation with the primary key could not be
	found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService().findByPrimaryKey(id);
	}

	/**
	* Returns the s m a reservation with the primary key or returns
	* <code>null</code> if it could not be found.
	*
	* @param id
	the primary key of the s m a reservation
	* @return the s m a reservation, or <code>null</code> if a s m a
	reservation with the primary key could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the s m a reservations where isActive = &#63; and createdBy =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @return the matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByCreatedBy(
		int isActive, java.lang.String createdBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMADomainsListByCreatedBy(isActive, createdBy);
	}

	/**
	* Returns a range of all the s m a reservations where isActive = &#63; and
	* createdBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @param start
	the lower bound of the range of s m a reservations
	* @param end
	the upper bound of the range of s m a reservations (not
	inclusive)
	* @return the range of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByCreatedBy(
		int isActive, java.lang.String createdBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMADomainsListByCreatedBy(isActive, createdBy, start,
			end);
	}

	/**
	* Returns an ordered range of all the s m a reservations where isActive =
	* &#63; and createdBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @param start
	the lower bound of the range of s m a reservations
	* @param end
	the upper bound of the range of s m a reservations (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByCreatedBy(
		int isActive, java.lang.String createdBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMADomainsListByCreatedBy(isActive, createdBy, start,
			end, orderByComparator);
	}

	/**
	* Returns the first s m a reservation in the ordered set where isActive =
	* &#63; and createdBy = &#63;.
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation findBySMADomainsListByCreatedBy_First(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByCreatedBy_First(isActive, createdBy,
			orderByComparator);
	}

	/**
	* Returns the first s m a reservation in the ordered set where isActive =
	* &#63; and createdBy = &#63;.
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a reservation, or <code>null</code> if a
	matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByCreatedBy_First(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMADomainsListByCreatedBy_First(isActive, createdBy,
			orderByComparator);
	}

	/**
	* Returns the last s m a reservation in the ordered set where isActive =
	* &#63; and createdBy = &#63;.
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation findBySMADomainsListByCreatedBy_Last(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByCreatedBy_Last(isActive, createdBy,
			orderByComparator);
	}

	/**
	* Returns the last s m a reservation in the ordered set where isActive =
	* &#63; and createdBy = &#63;.
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a reservation, or <code>null</code> if a
	matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByCreatedBy_Last(
		int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMADomainsListByCreatedBy_Last(isActive, createdBy,
			orderByComparator);
	}

	/**
	* Returns the s m a reservations before and after the current s m a
	* reservation in the ordered set where isActive = &#63; and createdBy =
	* &#63;.
	*
	* @param id
	the primary key of the current s m a reservation
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a s m a reservation with the primary key could not be
	found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation[] findBySMADomainsListByCreatedBy_PrevAndNext(
		long id, int isActive, java.lang.String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByCreatedBy_PrevAndNext(id, isActive,
			createdBy, orderByComparator);
	}

	/**
	* Returns all the s m a reservations where isActive = &#63; and name =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param name
	the name
	* @return the matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByName(
		int isActive, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMADomainsListByName(isActive, name);
	}

	/**
	* Returns a range of all the s m a reservations where isActive = &#63; and
	* name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param isActive
	the is active
	* @param name
	the name
	* @param start
	the lower bound of the range of s m a reservations
	* @param end
	the upper bound of the range of s m a reservations (not
	inclusive)
	* @return the range of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByName(
		int isActive, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMADomainsListByName(isActive, name, start, end);
	}

	/**
	* Returns an ordered range of all the s m a reservations where isActive =
	* &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param isActive
	the is active
	* @param name
	the name
	* @param start
	the lower bound of the range of s m a reservations
	* @param end
	the upper bound of the range of s m a reservations (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByName(
		int isActive, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMADomainsListByName(isActive, name, start, end,
			orderByComparator);
	}

	/**
	* Returns the first s m a reservation in the ordered set where isActive =
	* &#63; and name = &#63;.
	*
	* @param isActive
	the is active
	* @param name
	the name
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation findBySMADomainsListByName_First(
		int isActive, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByName_First(isActive, name,
			orderByComparator);
	}

	/**
	* Returns the first s m a reservation in the ordered set where isActive =
	* &#63; and name = &#63;.
	*
	* @param isActive
	the is active
	* @param name
	the name
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a reservation, or <code>null</code> if a
	matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByName_First(
		int isActive, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMADomainsListByName_First(isActive, name,
			orderByComparator);
	}

	/**
	* Returns the last s m a reservation in the ordered set where isActive =
	* &#63; and name = &#63;.
	*
	* @param isActive
	the is active
	* @param name
	the name
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation findBySMADomainsListByName_Last(
		int isActive, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByName_Last(isActive, name,
			orderByComparator);
	}

	/**
	* Returns the last s m a reservation in the ordered set where isActive =
	* &#63; and name = &#63;.
	*
	* @param isActive
	the is active
	* @param name
	the name
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a reservation, or <code>null</code> if a
	matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByName_Last(
		int isActive, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMADomainsListByName_Last(isActive, name,
			orderByComparator);
	}

	/**
	* Returns the s m a reservations before and after the current s m a
	* reservation in the ordered set where isActive = &#63; and name = &#63;.
	*
	* @param id
	the primary key of the current s m a reservation
	* @param isActive
	the is active
	* @param name
	the name
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a s m a reservation with the primary key could not be
	found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation[] findBySMADomainsListByName_PrevAndNext(
		long id, int isActive, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByName_PrevAndNext(id, isActive, name,
			orderByComparator);
	}

	/**
	* Returns all the s m a reservations where isActive = &#63; and owner =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param owner
	the owner
	* @return the matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByOwner(
		int isActive, java.lang.String owner)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMADomainsListByOwner(isActive, owner);
	}

	/**
	* Returns a range of all the s m a reservations where isActive = &#63; and
	* owner = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param isActive
	the is active
	* @param owner
	the owner
	* @param start
	the lower bound of the range of s m a reservations
	* @param end
	the upper bound of the range of s m a reservations (not
	inclusive)
	* @return the range of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByOwner(
		int isActive, java.lang.String owner, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMADomainsListByOwner(isActive, owner, start, end);
	}

	/**
	* Returns an ordered range of all the s m a reservations where isActive =
	* &#63; and owner = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param isActive
	the is active
	* @param owner
	the owner
	* @param start
	the lower bound of the range of s m a reservations
	* @param end
	the upper bound of the range of s m a reservations (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByOwner(
		int isActive, java.lang.String owner, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMADomainsListByOwner(isActive, owner, start, end,
			orderByComparator);
	}

	/**
	* Returns the first s m a reservation in the ordered set where isActive =
	* &#63; and owner = &#63;.
	*
	* @param isActive
	the is active
	* @param owner
	the owner
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation findBySMADomainsListByOwner_First(
		int isActive, java.lang.String owner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByOwner_First(isActive, owner,
			orderByComparator);
	}

	/**
	* Returns the first s m a reservation in the ordered set where isActive =
	* &#63; and owner = &#63;.
	*
	* @param isActive
	the is active
	* @param owner
	the owner
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a reservation, or <code>null</code> if a
	matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByOwner_First(
		int isActive, java.lang.String owner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMADomainsListByOwner_First(isActive, owner,
			orderByComparator);
	}

	/**
	* Returns the last s m a reservation in the ordered set where isActive =
	* &#63; and owner = &#63;.
	*
	* @param isActive
	the is active
	* @param owner
	the owner
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation findBySMADomainsListByOwner_Last(
		int isActive, java.lang.String owner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByOwner_Last(isActive, owner,
			orderByComparator);
	}

	/**
	* Returns the last s m a reservation in the ordered set where isActive =
	* &#63; and owner = &#63;.
	*
	* @param isActive
	the is active
	* @param owner
	the owner
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a reservation, or <code>null</code> if a
	matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByOwner_Last(
		int isActive, java.lang.String owner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMADomainsListByOwner_Last(isActive, owner,
			orderByComparator);
	}

	/**
	* Returns the s m a reservations before and after the current s m a
	* reservation in the ordered set where isActive = &#63; and owner = &#63;.
	*
	* @param id
	the primary key of the current s m a reservation
	* @param isActive
	the is active
	* @param owner
	the owner
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a s m a reservation with the primary key could not be
	found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation[] findBySMADomainsListByOwner_PrevAndNext(
		long id, int isActive, java.lang.String owner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByOwner_PrevAndNext(id, isActive,
			owner, orderByComparator);
	}

	/**
	* Returns all the s m a reservations where isActive = &#63; and startDate =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param startDate
	the start date
	* @return the matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByStartDate(
		int isActive, java.util.Date startDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMADomainsListByStartDate(isActive, startDate);
	}

	/**
	* Returns a range of all the s m a reservations where isActive = &#63; and
	* startDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param isActive
	the is active
	* @param startDate
	the start date
	* @param start
	the lower bound of the range of s m a reservations
	* @param end
	the upper bound of the range of s m a reservations (not
	inclusive)
	* @return the range of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByStartDate(
		int isActive, java.util.Date startDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMADomainsListByStartDate(isActive, startDate, start,
			end);
	}

	/**
	* Returns an ordered range of all the s m a reservations where isActive =
	* &#63; and startDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param isActive
	the is active
	* @param startDate
	the start date
	* @param start
	the lower bound of the range of s m a reservations
	* @param end
	the upper bound of the range of s m a reservations (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByStartDate(
		int isActive, java.util.Date startDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMADomainsListByStartDate(isActive, startDate, start,
			end, orderByComparator);
	}

	/**
	* Returns the first s m a reservation in the ordered set where isActive =
	* &#63; and startDate = &#63;.
	*
	* @param isActive
	the is active
	* @param startDate
	the start date
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation findBySMADomainsListByStartDate_First(
		int isActive, java.util.Date startDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByStartDate_First(isActive, startDate,
			orderByComparator);
	}

	/**
	* Returns the first s m a reservation in the ordered set where isActive =
	* &#63; and startDate = &#63;.
	*
	* @param isActive
	the is active
	* @param startDate
	the start date
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a reservation, or <code>null</code> if a
	matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByStartDate_First(
		int isActive, java.util.Date startDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMADomainsListByStartDate_First(isActive, startDate,
			orderByComparator);
	}

	/**
	* Returns the last s m a reservation in the ordered set where isActive =
	* &#63; and startDate = &#63;.
	*
	* @param isActive
	the is active
	* @param startDate
	the start date
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation findBySMADomainsListByStartDate_Last(
		int isActive, java.util.Date startDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByStartDate_Last(isActive, startDate,
			orderByComparator);
	}

	/**
	* Returns the last s m a reservation in the ordered set where isActive =
	* &#63; and startDate = &#63;.
	*
	* @param isActive
	the is active
	* @param startDate
	the start date
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a reservation, or <code>null</code> if a
	matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByStartDate_Last(
		int isActive, java.util.Date startDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMADomainsListByStartDate_Last(isActive, startDate,
			orderByComparator);
	}

	/**
	* Returns the s m a reservations before and after the current s m a
	* reservation in the ordered set where isActive = &#63; and startDate =
	* &#63;.
	*
	* @param id
	the primary key of the current s m a reservation
	* @param isActive
	the is active
	* @param startDate
	the start date
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a s m a reservation with the primary key could not be
	found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation[] findBySMADomainsListByStartDate_PrevAndNext(
		long id, int isActive, java.util.Date startDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByStartDate_PrevAndNext(id, isActive,
			startDate, orderByComparator);
	}

	/**
	* Returns all the s m a reservations where isActive = &#63; and endDate =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param endDate
	the end date
	* @return the matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByEndDate(
		int isActive, java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMADomainsListByEndDate(isActive, endDate);
	}

	/**
	* Returns a range of all the s m a reservations where isActive = &#63; and
	* endDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param isActive
	the is active
	* @param endDate
	the end date
	* @param start
	the lower bound of the range of s m a reservations
	* @param end
	the upper bound of the range of s m a reservations (not
	inclusive)
	* @return the range of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByEndDate(
		int isActive, java.util.Date endDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMADomainsListByEndDate(isActive, endDate, start, end);
	}

	/**
	* Returns an ordered range of all the s m a reservations where isActive =
	* &#63; and endDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param isActive
	the is active
	* @param endDate
	the end date
	* @param start
	the lower bound of the range of s m a reservations
	* @param end
	the upper bound of the range of s m a reservations (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByEndDate(
		int isActive, java.util.Date endDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMADomainsListByEndDate(isActive, endDate, start,
			end, orderByComparator);
	}

	/**
	* Returns the first s m a reservation in the ordered set where isActive =
	* &#63; and endDate = &#63;.
	*
	* @param isActive
	the is active
	* @param endDate
	the end date
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation findBySMADomainsListByEndDate_First(
		int isActive, java.util.Date endDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByEndDate_First(isActive, endDate,
			orderByComparator);
	}

	/**
	* Returns the first s m a reservation in the ordered set where isActive =
	* &#63; and endDate = &#63;.
	*
	* @param isActive
	the is active
	* @param endDate
	the end date
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a reservation, or <code>null</code> if a
	matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByEndDate_First(
		int isActive, java.util.Date endDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMADomainsListByEndDate_First(isActive, endDate,
			orderByComparator);
	}

	/**
	* Returns the last s m a reservation in the ordered set where isActive =
	* &#63; and endDate = &#63;.
	*
	* @param isActive
	the is active
	* @param endDate
	the end date
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation findBySMADomainsListByEndDate_Last(
		int isActive, java.util.Date endDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByEndDate_Last(isActive, endDate,
			orderByComparator);
	}

	/**
	* Returns the last s m a reservation in the ordered set where isActive =
	* &#63; and endDate = &#63;.
	*
	* @param isActive
	the is active
	* @param endDate
	the end date
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a reservation, or <code>null</code> if a
	matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByEndDate_Last(
		int isActive, java.util.Date endDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMADomainsListByEndDate_Last(isActive, endDate,
			orderByComparator);
	}

	/**
	* Returns the s m a reservations before and after the current s m a
	* reservation in the ordered set where isActive = &#63; and endDate =
	* &#63;.
	*
	* @param id
	the primary key of the current s m a reservation
	* @param isActive
	the is active
	* @param endDate
	the end date
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a s m a reservation with the primary key could not be
	found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation[] findBySMADomainsListByEndDate_PrevAndNext(
		long id, int isActive, java.util.Date endDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByEndDate_PrevAndNext(id, isActive,
			endDate, orderByComparator);
	}

	/**
	* Returns all the s m a reservations where isActive = &#63; and provision =
	* &#63;.
	*
	* @param isActive
	the is active
	* @param provision
	the provision
	* @return the matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByProvision(
		int isActive, int provision)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySMADomainsListByProvision(isActive, provision);
	}

	/**
	* Returns a range of all the s m a reservations where isActive = &#63; and
	* provision = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param isActive
	the is active
	* @param provision
	the provision
	* @param start
	the lower bound of the range of s m a reservations
	* @param end
	the upper bound of the range of s m a reservations (not
	inclusive)
	* @return the range of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByProvision(
		int isActive, int provision, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMADomainsListByProvision(isActive, provision, start,
			end);
	}

	/**
	* Returns an ordered range of all the s m a reservations where isActive =
	* &#63; and provision = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param isActive
	the is active
	* @param provision
	the provision
	* @param start
	the lower bound of the range of s m a reservations
	* @param end
	the upper bound of the range of s m a reservations (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findBySMADomainsListByProvision(
		int isActive, int provision, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySMADomainsListByProvision(isActive, provision, start,
			end, orderByComparator);
	}

	/**
	* Returns the first s m a reservation in the ordered set where isActive =
	* &#63; and provision = &#63;.
	*
	* @param isActive
	the is active
	* @param provision
	the provision
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation findBySMADomainsListByProvision_First(
		int isActive, int provision,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByProvision_First(isActive, provision,
			orderByComparator);
	}

	/**
	* Returns the first s m a reservation in the ordered set where isActive =
	* &#63; and provision = &#63;.
	*
	* @param isActive
	the is active
	* @param provision
	the provision
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the first matching s m a reservation, or <code>null</code> if a
	matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByProvision_First(
		int isActive, int provision,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMADomainsListByProvision_First(isActive, provision,
			orderByComparator);
	}

	/**
	* Returns the last s m a reservation in the ordered set where isActive =
	* &#63; and provision = &#63;.
	*
	* @param isActive
	the is active
	* @param provision
	the provision
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation findBySMADomainsListByProvision_Last(
		int isActive, int provision,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByProvision_Last(isActive, provision,
			orderByComparator);
	}

	/**
	* Returns the last s m a reservation in the ordered set where isActive =
	* &#63; and provision = &#63;.
	*
	* @param isActive
	the is active
	* @param provision
	the provision
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the last matching s m a reservation, or <code>null</code> if a
	matching s m a reservation could not be found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation fetchBySMADomainsListByProvision_Last(
		int isActive, int provision,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchBySMADomainsListByProvision_Last(isActive, provision,
			orderByComparator);
	}

	/**
	* Returns the s m a reservations before and after the current s m a
	* reservation in the ordered set where isActive = &#63; and provision =
	* &#63;.
	*
	* @param id
	the primary key of the current s m a reservation
	* @param isActive
	the is active
	* @param provision
	the provision
	* @param orderByComparator
	the comparator to order the set by (optionally
	<code>null</code>)
	* @return the previous, current, and next s m a reservation
	* @throws com.pacnet.connect.NoSuchSMAReservationException
	if a s m a reservation with the primary key could not be
	found
	* @throws SystemException
	if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMAReservation[] findBySMADomainsListByProvision_PrevAndNext(
		long id, int isActive, int provision,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMAReservationException {
		return getService()
				   .findBySMADomainsListByProvision_PrevAndNext(id, isActive,
			provision, orderByComparator);
	}

	/**
	* Returns all the s m a reservations.
	*
	* @return the s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll();
	}

	/**
	* Returns a range of all the s m a reservations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param start
	the lower bound of the range of s m a reservations
	* @param end
	the upper bound of the range of s m a reservations (not
	inclusive)
	* @return the range of s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the s m a reservations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of
	* <code>end - start</code> instances. <code>start</code> and
	* <code>end</code> are not primary keys, they are indexes in the result
	* set. Thus, <code>0</code> refers to the first result in the set. Setting
	* both <code>start</code> and <code>end</code> to
	* {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
	* the full result set.
	* </p>
	*
	* @param start
	the lower bound of the range of s m a reservations
	* @param end
	the upper bound of the range of s m a reservations (not
	inclusive)
	* @param orderByComparator
	the comparator to order the results by (optionally
	<code>null</code>)
	* @return the ordered range of s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMAReservation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the s m a reservations where isActive = &#63; and createdBy =
	* &#63; from the database.
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeBySMADomainsListByCreatedBy(int isActive,
		java.lang.String createdBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMADomainsListByCreatedBy(isActive, createdBy);
	}

	/**
	* Removes all the s m a reservations where isActive = &#63; and name =
	* &#63; from the database.
	*
	* @param isActive
	the is active
	* @param name
	the name
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeBySMADomainsListByName(int isActive,
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMADomainsListByName(isActive, name);
	}

	/**
	* Removes all the s m a reservations where isActive = &#63; and owner =
	* &#63; from the database.
	*
	* @param isActive
	the is active
	* @param owner
	the owner
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeBySMADomainsListByOwner(int isActive,
		java.lang.String owner)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMADomainsListByOwner(isActive, owner);
	}

	/**
	* Removes all the s m a reservations where isActive = &#63; and startDate =
	* &#63; from the database.
	*
	* @param isActive
	the is active
	* @param startDate
	the start date
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeBySMADomainsListByStartDate(int isActive,
		java.util.Date startDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMADomainsListByStartDate(isActive, startDate);
	}

	/**
	* Removes all the s m a reservations where isActive = &#63; and endDate =
	* &#63; from the database.
	*
	* @param isActive
	the is active
	* @param endDate
	the end date
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeBySMADomainsListByEndDate(int isActive,
		java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMADomainsListByEndDate(isActive, endDate);
	}

	/**
	* Removes all the s m a reservations where isActive = &#63; and provision =
	* &#63; from the database.
	*
	* @param isActive
	the is active
	* @param provision
	the provision
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeBySMADomainsListByProvision(int isActive,
		int provision)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeBySMADomainsListByProvision(isActive, provision);
	}

	/**
	* Removes all the s m a reservations from the database.
	*
	* @throws SystemException
	if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeAll();
	}

	/**
	* Returns the number of s m a reservations where isActive = &#63; and
	* createdBy = &#63;.
	*
	* @param isActive
	the is active
	* @param createdBy
	the created by
	* @return the number of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countBySMADomainsListByCreatedBy(int isActive,
		java.lang.String createdBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countBySMADomainsListByCreatedBy(isActive, createdBy);
	}

	/**
	* Returns the number of s m a reservations where isActive = &#63; and name
	* = &#63;.
	*
	* @param isActive
	the is active
	* @param name
	the name
	* @return the number of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countBySMADomainsListByName(int isActive,
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countBySMADomainsListByName(isActive, name);
	}

	/**
	* Returns the number of s m a reservations where isActive = &#63; and owner
	* = &#63;.
	*
	* @param isActive
	the is active
	* @param owner
	the owner
	* @return the number of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countBySMADomainsListByOwner(int isActive,
		java.lang.String owner)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countBySMADomainsListByOwner(isActive, owner);
	}

	/**
	* Returns the number of s m a reservations where isActive = &#63; and
	* startDate = &#63;.
	*
	* @param isActive
	the is active
	* @param startDate
	the start date
	* @return the number of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countBySMADomainsListByStartDate(int isActive,
		java.util.Date startDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countBySMADomainsListByStartDate(isActive, startDate);
	}

	/**
	* Returns the number of s m a reservations where isActive = &#63; and
	* endDate = &#63;.
	*
	* @param isActive
	the is active
	* @param endDate
	the end date
	* @return the number of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countBySMADomainsListByEndDate(int isActive,
		java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countBySMADomainsListByEndDate(isActive, endDate);
	}

	/**
	* Returns the number of s m a reservations where isActive = &#63; and
	* provision = &#63;.
	*
	* @param isActive
	the is active
	* @param provision
	the provision
	* @return the number of matching s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countBySMADomainsListByProvision(int isActive,
		int provision)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countBySMADomainsListByProvision(isActive, provision);
	}

	/**
	* Returns the number of s m a reservations.
	*
	* @return the number of s m a reservations
	* @throws SystemException
	if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countAll();
	}

	public static void clearService() {
		_service = null;
	}

	public static SMAReservationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SMAReservationLocalService.class.getName());

			if (invokableLocalService instanceof SMAReservationLocalService) {
				_service = (SMAReservationLocalService)invokableLocalService;
			}
			else {
				_service = new SMAReservationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(SMAReservationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(SMAReservationLocalService service) {
	}

	private static SMAReservationLocalService _service;
}