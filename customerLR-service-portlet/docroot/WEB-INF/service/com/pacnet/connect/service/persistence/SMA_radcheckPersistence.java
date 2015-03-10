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

import com.pacnet.connect.model.SMA_radcheck;

/**
 * The persistence interface for the s m a_radcheck service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMA_radcheckPersistenceImpl
 * @see SMA_radcheckUtil
 * @generated
 */
public interface SMA_radcheckPersistence extends BasePersistence<SMA_radcheck> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SMA_radcheckUtil} to access the s m a_radcheck persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the s m a_radcheck in the entity cache if it is enabled.
	*
	* @param sma_radcheck the s m a_radcheck
	*/
	public void cacheResult(com.pacnet.connect.model.SMA_radcheck sma_radcheck);

	/**
	* Caches the s m a_radchecks in the entity cache if it is enabled.
	*
	* @param sma_radchecks the s m a_radchecks
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SMA_radcheck> sma_radchecks);

	/**
	* Creates a new s m a_radcheck with the primary key. Does not add the s m a_radcheck to the database.
	*
	* @param id the primary key for the new s m a_radcheck
	* @return the new s m a_radcheck
	*/
	public com.pacnet.connect.model.SMA_radcheck create(long id);

	/**
	* Removes the s m a_radcheck with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a_radcheck
	* @return the s m a_radcheck that was removed
	* @throws com.pacnet.connect.NoSuchSMA_radcheckException if a s m a_radcheck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radcheck remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_radcheckException;

	public com.pacnet.connect.model.SMA_radcheck updateImpl(
		com.pacnet.connect.model.SMA_radcheck sma_radcheck, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a_radcheck with the primary key or throws a {@link com.pacnet.connect.NoSuchSMA_radcheckException} if it could not be found.
	*
	* @param id the primary key of the s m a_radcheck
	* @return the s m a_radcheck
	* @throws com.pacnet.connect.NoSuchSMA_radcheckException if a s m a_radcheck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radcheck findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_radcheckException;

	/**
	* Returns the s m a_radcheck with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s m a_radcheck
	* @return the s m a_radcheck, or <code>null</code> if a s m a_radcheck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radcheck fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the s m a_radchecks where company_id = &#63;.
	*
	* @param company_id the company_id
	* @return the matching s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_radcheck> findBySMAUserListByCompanyId(
		long company_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a_radchecks where company_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param company_id the company_id
	* @param start the lower bound of the range of s m a_radchecks
	* @param end the upper bound of the range of s m a_radchecks (not inclusive)
	* @return the range of matching s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_radcheck> findBySMAUserListByCompanyId(
		long company_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a_radchecks where company_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param company_id the company_id
	* @param start the lower bound of the range of s m a_radchecks
	* @param end the upper bound of the range of s m a_radchecks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_radcheck> findBySMAUserListByCompanyId(
		long company_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first s m a_radcheck in the ordered set where company_id = &#63;.
	*
	* @param company_id the company_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a_radcheck
	* @throws com.pacnet.connect.NoSuchSMA_radcheckException if a matching s m a_radcheck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radcheck findBySMAUserListByCompanyId_First(
		long company_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_radcheckException;

	/**
	* Returns the first s m a_radcheck in the ordered set where company_id = &#63;.
	*
	* @param company_id the company_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching s m a_radcheck, or <code>null</code> if a matching s m a_radcheck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radcheck fetchBySMAUserListByCompanyId_First(
		long company_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last s m a_radcheck in the ordered set where company_id = &#63;.
	*
	* @param company_id the company_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a_radcheck
	* @throws com.pacnet.connect.NoSuchSMA_radcheckException if a matching s m a_radcheck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radcheck findBySMAUserListByCompanyId_Last(
		long company_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_radcheckException;

	/**
	* Returns the last s m a_radcheck in the ordered set where company_id = &#63;.
	*
	* @param company_id the company_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching s m a_radcheck, or <code>null</code> if a matching s m a_radcheck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radcheck fetchBySMAUserListByCompanyId_Last(
		long company_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s m a_radchecks before and after the current s m a_radcheck in the ordered set where company_id = &#63;.
	*
	* @param id the primary key of the current s m a_radcheck
	* @param company_id the company_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next s m a_radcheck
	* @throws com.pacnet.connect.NoSuchSMA_radcheckException if a s m a_radcheck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SMA_radcheck[] findBySMAUserListByCompanyId_PrevAndNext(
		long id, long company_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_radcheckException;

	/**
	* Returns all the s m a_radchecks.
	*
	* @return the s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_radcheck> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s m a_radchecks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a_radchecks
	* @param end the upper bound of the range of s m a_radchecks (not inclusive)
	* @return the range of s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_radcheck> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s m a_radchecks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a_radchecks
	* @param end the upper bound of the range of s m a_radchecks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SMA_radcheck> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a_radchecks where company_id = &#63; from the database.
	*
	* @param company_id the company_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySMAUserListByCompanyId(long company_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s m a_radchecks from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a_radchecks where company_id = &#63;.
	*
	* @param company_id the company_id
	* @return the number of matching s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public int countBySMAUserListByCompanyId(long company_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s m a_radchecks.
	*
	* @return the number of s m a_radchecks
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}