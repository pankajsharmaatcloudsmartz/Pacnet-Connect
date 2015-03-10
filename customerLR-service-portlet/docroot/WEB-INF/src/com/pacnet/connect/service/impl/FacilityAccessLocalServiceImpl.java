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

package com.pacnet.connect.service.impl;

import java.sql.Date;

import com.liferay.portal.kernel.exception.SystemException;
import com.pacnet.connect.model.FacilityAccess;
import com.pacnet.connect.service.base.FacilityAccessLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.FacilityAccessUtil;

/**
 * The implementation of the facility access local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.pacnet.connect.service.FacilityAccessLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.FacilityAccessLocalServiceBaseImpl
 * @see com.pacnet.connect.service.FacilityAccessLocalServiceUtil
 */
public class FacilityAccessLocalServiceImpl
	extends FacilityAccessLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.pacnet.connect.service.FacilityAccessLocalServiceUtil} to access the facility access local service.
	 */
	
	public com.pacnet.connect.model.FacilityAccess createFacilityAccess(String name, boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		FacilityAccess facilityAccess = null;		
		try{		
			facilityAccess = facilityAccessPersistence.create(0);
			facilityAccess.setName(name);
			facilityAccess.setIsActive(isActive);
			facilityAccess.setCreatedOn(createdOn);
			facilityAccess.setCreatedBy(createdBy);
			facilityAccess.setUpdatedBy(updatedBy);
			facilityAccess.setUpdatedOn(updatedOn);
			facilityAccess = facilityAccessPersistence.update(facilityAccess, false);
		}catch(Exception e){
			e.printStackTrace();
		}
		return facilityAccess;
	}
	
	public com.pacnet.connect.model.FacilityAccess  updateFacilityAccess(long id, String name, boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		FacilityAccess facilityAccess = null;		
		try{
			facilityAccess = facilityAccessPersistence.fetchByPrimaryKey(id);
			facilityAccess.setName(name);
			facilityAccess.setIsActive(isActive);
			facilityAccess.setCreatedOn(createdOn);
			facilityAccess.setCreatedBy(createdBy);
			facilityAccess.setUpdatedBy(updatedBy);
			facilityAccess.setUpdatedOn(updatedOn);
			facilityAccess = facilityAccessPersistence.update(facilityAccess, false);
		}catch(Exception e){
			e.printStackTrace();
		}
		return facilityAccess;
	}
	
	public boolean deleteFacilityById(long id) {
		boolean isDeleted = false;
		try{
			facilityAccessPersistence.remove(id);
			isDeleted = true;
		}catch(Exception e){
			isDeleted = false;
			e.printStackTrace();
		}
		return isDeleted;
	}
	/**
	* Returns all the facility accesses where name = &#63;.
	*
	* @param name the name
	* @return the matching facility accesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAccess> findByFacilityServiceName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return FacilityAccessUtil.findByFacilityServiceName(name);
	}

	/**
	* Returns a range of all the facility accesses where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of facility accesses
	* @param end the upper bound of the range of facility accesses (not inclusive)
	* @return the range of matching facility accesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAccess> findByFacilityServiceName(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return FacilityAccessUtil.findByFacilityServiceName(name, start, end);
	}

	/**
	* Returns an ordered range of all the facility accesses where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of facility accesses
	* @param end the upper bound of the range of facility accesses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility accesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityAccess> findByFacilityServiceName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return FacilityAccessUtil
				   .findByFacilityServiceName(name, start, end,
			orderByComparator);
	}

	/**
	* Returns the first facility access in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility access
	* @throws com.pacnet.connect.NoSuchFacilityAccessException if a matching facility access could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess findByFacilityServiceName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAccessException {
		return FacilityAccessUtil
				   .findByFacilityServiceName_First(name, orderByComparator);
	}

	/**
	* Returns the first facility access in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility access, or <code>null</code> if a matching facility access could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess fetchByFacilityServiceName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return FacilityAccessUtil
				   .fetchByFacilityServiceName_First(name, orderByComparator);
	}

	/**
	* Returns the last facility access in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility access
	* @throws com.pacnet.connect.NoSuchFacilityAccessException if a matching facility access could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess findByFacilityServiceName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAccessException {
		return FacilityAccessUtil
				   .findByFacilityServiceName_Last(name, orderByComparator);
	}

	/**
	* Returns the last facility access in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility access, or <code>null</code> if a matching facility access could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess fetchByFacilityServiceName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return FacilityAccessUtil
				   .fetchByFacilityServiceName_Last(name, orderByComparator);
	}

	/**
	* Returns the facility accesses before and after the current facility access in the ordered set where name = &#63;.
	*
	* @param id the primary key of the current facility access
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next facility access
	* @throws com.pacnet.connect.NoSuchFacilityAccessException if a facility access with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityAccess[] findByFacilityServiceName_PrevAndNext(
		long id, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityAccessException {
		return FacilityAccessUtil
				   .findByFacilityServiceName_PrevAndNext(id, name,
			orderByComparator);
	}
}