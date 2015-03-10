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

import com.pacnet.connect.model.SAM_Companies;

/**
 * The persistence interface for the s a m_ companies service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SAM_CompaniesPersistenceImpl
 * @see SAM_CompaniesUtil
 * @generated
 */
public interface SAM_CompaniesPersistence extends BasePersistence<SAM_Companies> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SAM_CompaniesUtil} to access the s a m_ companies persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the s a m_ companies in the entity cache if it is enabled.
	*
	* @param sam_Companies the s a m_ companies
	*/
	public void cacheResult(
		com.pacnet.connect.model.SAM_Companies sam_Companies);

	/**
	* Caches the s a m_ companieses in the entity cache if it is enabled.
	*
	* @param sam_Companieses the s a m_ companieses
	*/
	public void cacheResult(
		java.util.List<com.pacnet.connect.model.SAM_Companies> sam_Companieses);

	/**
	* Creates a new s a m_ companies with the primary key. Does not add the s a m_ companies to the database.
	*
	* @param id the primary key for the new s a m_ companies
	* @return the new s a m_ companies
	*/
	public com.pacnet.connect.model.SAM_Companies create(long id);

	/**
	* Removes the s a m_ companies with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s a m_ companies
	* @return the s a m_ companies that was removed
	* @throws com.pacnet.connect.NoSuchSAM_CompaniesException if a s a m_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_Companies remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSAM_CompaniesException;

	public com.pacnet.connect.model.SAM_Companies updateImpl(
		com.pacnet.connect.model.SAM_Companies sam_Companies, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s a m_ companies with the primary key or throws a {@link com.pacnet.connect.NoSuchSAM_CompaniesException} if it could not be found.
	*
	* @param id the primary key of the s a m_ companies
	* @return the s a m_ companies
	* @throws com.pacnet.connect.NoSuchSAM_CompaniesException if a s a m_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_Companies findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSAM_CompaniesException;

	/**
	* Returns the s a m_ companies with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s a m_ companies
	* @return the s a m_ companies, or <code>null</code> if a s a m_ companies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.SAM_Companies fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the s a m_ companieses.
	*
	* @return the s a m_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SAM_Companies> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the s a m_ companieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s a m_ companieses
	* @param end the upper bound of the range of s a m_ companieses (not inclusive)
	* @return the range of s a m_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SAM_Companies> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the s a m_ companieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s a m_ companieses
	* @param end the upper bound of the range of s a m_ companieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s a m_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.SAM_Companies> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s a m_ companieses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s a m_ companieses.
	*
	* @return the number of s a m_ companieses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}