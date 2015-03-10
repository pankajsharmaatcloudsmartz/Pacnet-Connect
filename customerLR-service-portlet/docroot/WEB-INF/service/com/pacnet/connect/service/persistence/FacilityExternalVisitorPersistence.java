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

package com.pacnet.connect.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.pacnet.connect.model.FacilityExternalVisitor;

/**
 * The persistence interface for the facility external visitor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityExternalVisitorPersistenceImpl
 * @see FacilityExternalVisitorUtil
 * @generated
 */
public interface FacilityExternalVisitorPersistence extends BasePersistence<FacilityExternalVisitor> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FacilityExternalVisitorUtil} to access the facility external visitor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the facility external visitor in the entity cache if it is enabled.
	*
	* @param facilityExternalVisitor the facility external visitor
	*/
	public void cacheResult(
		com.pacnet.connect.model.FacilityExternalVisitor facilityExternalVisitor);

	/**
	* Caches the facility external visitors in the entity cache if it is enabled.
	*
	* @param facilityExternalVisitors the facility external visitors
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> facilityExternalVisitors);

	/**
	* Creates a new facility external visitor with the primary key. Does not add the facility external visitor to the database.
	*
	* @param id the primary key for the new facility external visitor
	* @return the new facility external visitor
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor create(long id);

	/**
	* Removes the facility external visitor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility external visitor
	* @return the facility external visitor that was removed
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a facility external visitor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException;

	public com.pacnet.connect.model.FacilityExternalVisitor updateImpl(
		com.pacnet.connect.model.FacilityExternalVisitor facilityExternalVisitor,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility external visitor with the primary key or throws a {@link com.pacnet.connect.NoSuchFacilityExternalVisitorException} if it could not be found.
	*
	* @param id the primary key of the facility external visitor
	* @return the facility external visitor
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a facility external visitor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException;

	/**
	* Returns the facility external visitor with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the facility external visitor
	* @return the facility external visitor, or <code>null</code> if a facility external visitor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the facility external visitors where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @return the matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByFacility(
		long facilityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility external visitors where facilityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityId the facility ID
	* @param start the lower bound of the range of facility external visitors
	* @param end the upper bound of the range of facility external visitors (not inclusive)
	* @return the range of matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByFacility(
		long facilityId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility external visitors where facilityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facilityId the facility ID
	* @param start the lower bound of the range of facility external visitors
	* @param end the upper bound of the range of facility external visitors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByFacility(
		long facilityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility external visitor in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility external visitor
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor findByFacilityExternalVisitorByFacility_First(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException;

	/**
	* Returns the first facility external visitor in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility external visitor, or <code>null</code> if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor fetchByFacilityExternalVisitorByFacility_First(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility external visitor in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility external visitor
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor findByFacilityExternalVisitorByFacility_Last(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException;

	/**
	* Returns the last facility external visitor in the ordered set where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility external visitor, or <code>null</code> if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor fetchByFacilityExternalVisitorByFacility_Last(
		long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility external visitors before and after the current facility external visitor in the ordered set where facilityId = &#63;.
	*
	* @param id the primary key of the current facility external visitor
	* @param facilityId the facility ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility external visitor
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a facility external visitor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor[] findByFacilityExternalVisitorByFacility_PrevAndNext(
		long id, long facilityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException;

	/**
	* Returns all the facility external visitors where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility external visitors where accessRequestId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param accessRequestId the access request ID
	* @param start the lower bound of the range of facility external visitors
	* @param end the upper bound of the range of facility external visitors (not inclusive)
	* @return the range of matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByAccessRequest(
		long accessRequestId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility external visitors where accessRequestId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param accessRequestId the access request ID
	* @param start the lower bound of the range of facility external visitors
	* @param end the upper bound of the range of facility external visitors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findByFacilityExternalVisitorByAccessRequest(
		long accessRequestId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first facility external visitor in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility external visitor
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor findByFacilityExternalVisitorByAccessRequest_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException;

	/**
	* Returns the first facility external visitor in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility external visitor, or <code>null</code> if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor fetchByFacilityExternalVisitorByAccessRequest_First(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last facility external visitor in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility external visitor
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor findByFacilityExternalVisitorByAccessRequest_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException;

	/**
	* Returns the last facility external visitor in the ordered set where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility external visitor, or <code>null</code> if a matching facility external visitor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor fetchByFacilityExternalVisitorByAccessRequest_Last(
		long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the facility external visitors before and after the current facility external visitor in the ordered set where accessRequestId = &#63;.
	*
	* @param id the primary key of the current facility external visitor
	* @param accessRequestId the access request ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility external visitor
	* @throws com.pacnet.connect.NoSuchFacilityExternalVisitorException if a facility external visitor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityExternalVisitor[] findByFacilityExternalVisitorByAccessRequest_PrevAndNext(
		long id, long accessRequestId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityExternalVisitorException;

	/**
	* Returns all the facility external visitors.
	*
	* @return the facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the facility external visitors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility external visitors
	* @param end the upper bound of the range of facility external visitors (not inclusive)
	* @return the range of facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the facility external visitors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility external visitors
	* @param end the upper bound of the range of facility external visitors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityExternalVisitor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility external visitors where facilityId = &#63; from the database.
	*
	* @param facilityId the facility ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityExternalVisitorByFacility(long facilityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility external visitors where accessRequestId = &#63; from the database.
	*
	* @param accessRequestId the access request ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityExternalVisitorByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facility external visitors from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility external visitors where facilityId = &#63;.
	*
	* @param facilityId the facility ID
	* @return the number of matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityExternalVisitorByFacility(long facilityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility external visitors where accessRequestId = &#63;.
	*
	* @param accessRequestId the access request ID
	* @return the number of matching facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public int countByFacilityExternalVisitorByAccessRequest(
		long accessRequestId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of facility external visitors.
	*
	* @return the number of facility external visitors
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}