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
import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.pacnet.connect.common.CommonServiceUtils;
import com.pacnet.connect.model.Facility;
import com.pacnet.connect.service.FacilityLocalServiceUtil;
import com.pacnet.connect.service.base.FacilityLocalServiceBaseImpl;
import com.pacnet.connect.service.persistence.FacilityUtil;

/**
 * The implementation of the facility local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.pacnet.connect.service.FacilityLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloudSmartz
 * @see com.pacnet.connect.service.base.FacilityLocalServiceBaseImpl
 * @see com.pacnet.connect.service.FacilityLocalServiceUtil
 */
public class FacilityLocalServiceImpl extends FacilityLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.pacnet.connect.service.FacilityLocalServiceUtil} to access the facility local service.
	 */
	public com.pacnet.connect.model.Facility createFacility(String facilityName, String address, 
			String phoneNumber, String city, long stateId, long countryId, int isThirdParty, /*long managerId,*/ String escalationEmail, boolean isActive, String createdBy, 
			Date createdOn, String updatedBy, Date updatedOn,String timezone) {
		Facility facility = null;
		try{
		
		facility = facilityPersistence.create(0);
		facility.setName(facilityName);
		facility.setAddress(address);
		facility.setPhoneNumber(phoneNumber);
		facility.setCity(city);
		facility.setStateId(stateId);
		facility.setCountryId(countryId);
		facility.setIsThirdParty(isThirdParty);
//		facility.setManagerId(managerId);
		facility.setEscalationEmail(escalationEmail);
		facility.setIsActive(isActive);
		facility.setCreatedOn(createdOn);
		facility.setCreatedBy(createdBy);
		facility.setUpdatedBy(updatedBy);
		facility.setUpdatedOn(updatedOn);
		facility.setTimezone(timezone);
		facility = facilityPersistence.update(facility, false);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return facility;
	}
	
	public com.pacnet.connect.model.Facility updateFacility(long id, String facilityName, String address, 
			String phoneNumber, String city, long stateId, long countryId, int isThirdParty, /*long managerId,*/ String escalationEmail, boolean isActive, String createdBy, Date createdOn, String updatedBy, Date updatedOn,String timezone) {
			Facility facility = null;
		try{
		facility = facilityPersistence.fetchByPrimaryKey(id);
		facility.setName(facilityName);
		facility.setAddress(address);
		facility.setPhoneNumber(phoneNumber);
		facility.setCity(city);
		facility.setStateId(stateId);
		facility.setCountryId(countryId);
		facility.setIsThirdParty(isThirdParty);
//		facility.setManagerId(managerId);
		facility.setEscalationEmail(escalationEmail);
		facility.setIsActive(isActive);
		facility.setCreatedOn(createdOn);
		facility.setCreatedBy(createdBy);
		facility.setUpdatedBy(updatedBy);
		facility.setUpdatedOn(updatedOn);
		facility.setTimezone(timezone);
		facility = facilityPersistence.update(facility, false);
		}catch(Exception e){
			e.printStackTrace();
		}
		return facility;
	}
	
	
	public boolean deleteFacilityById(long id) {
		boolean isDeleted = false;
		try{
			facilityPersistence.remove(id);
			isDeleted = true;
		}catch(Exception e){
			isDeleted = false;
			e.printStackTrace();
		}
		return isDeleted;
 }
	
	public java.util.List<com.pacnet.connect.model.Facility> findByFacilityName(
			java.lang.String name, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUtil
					   .findByFacilityName(name, start, end, orderByComparator);
		}
	
	public java.util.List<com.pacnet.connect.model.Facility> getAllThirdPartyFacility(){
		List<Facility> facilities = new ArrayList<Facility>();
		try {
			/*ClassLoader classLoader = (ClassLoader) PortletBeanLocatorUtil.locate(serviceContextPath,"portletClassLoader");
			DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Facility.class,classLoader);
			*/
			CommonServiceUtils<Facility> common = new CommonServiceUtils<Facility>();
			DynamicQuery dynamicQuery = common.getServiceContextLoader(Facility.class);
			dynamicQuery.add(RestrictionsFactoryUtil.eq("isThirdParty", new Integer(1)));
			
				facilities = FacilityLocalServiceUtil.dynamicQuery(dynamicQuery);
			} catch (com.liferay.portal.kernel.exception.SystemException e) {
				e.printStackTrace();
			}
		return facilities;
		}

		/**
		* Returns the first facility in the ordered set where name = &#63;.
		*
		* @param name the name
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility
		* @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.Facility findByFacilityName_First(
			java.lang.String name,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityException {
			return FacilityUtil.findByFacilityName_First(name, orderByComparator);
		}

		/**
		* Returns the first facility in the ordered set where name = &#63;.
		*
		* @param name the name
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the first matching facility, or <code>null</code> if a matching facility could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.Facility fetchByFacilityName_First(
			java.lang.String name,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUtil
					   .fetchByFacilityName_First(name, orderByComparator);
		}

		/**
		* Returns the last facility in the ordered set where name = &#63;.
		*
		* @param name the name
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility
		* @throws com.pacnet.connect.NoSuchFacilityException if a matching facility could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.Facility findByFacilityName_Last(
			java.lang.String name,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityException {
			return FacilityUtil.findByFacilityName_Last(name, orderByComparator);
		}

		/**
		* Returns the last facility in the ordered set where name = &#63;.
		*
		* @param name the name
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the last matching facility, or <code>null</code> if a matching facility could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.Facility fetchByFacilityName_Last(
			java.lang.String name,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FacilityUtil.fetchByFacilityName_Last(name, orderByComparator);
		}

		/**
		* Returns the facilities before and after the current facility in the ordered set where name = &#63;.
		*
		* @param id the primary key of the current facility
		* @param name the name
		* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
		* @return the previous, current, and next facility
		* @throws com.pacnet.connect.NoSuchFacilityException if a facility with the primary key could not be found
		* @throws SystemException if a system exception occurred
		*/
		public com.pacnet.connect.model.Facility[] findByFacilityName_PrevAndNext(
			long id, java.lang.String name,
			com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException,
				com.pacnet.connect.NoSuchFacilityException {
			return FacilityUtil
					   .findByFacilityName_PrevAndNext(id, name, orderByComparator);
		}
		
		public java.util.List<com.pacnet.connect.model.Facility> findByFacilityByCountryId(long countryId){
			List<Facility> facilities = new ArrayList<Facility>();
			try{
				facilities =  FacilityUtil.findByFacilityByCountryId(countryId);
				}
			catch(Exception e){
				e.printStackTrace();
			}
			return facilities;
		}
		
		
		public java.util.List<com.pacnet.connect.model.Facility> findByFacilityByManagerId(
				long managerId)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilityUtil.findByFacilityByManagerId(managerId);
			}

			public java.util.List<com.pacnet.connect.model.Facility> findByFacilityByManagerId(
				long managerId, int start, int end)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilityUtil.findByFacilityByManagerId(managerId, start, end);
			}

			
			public java.util.List<com.pacnet.connect.model.Facility> findByFacilityByManagerId(
				long managerId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
				throws com.liferay.portal.kernel.exception.SystemException {
				return FacilityUtil.findByFacilityByManagerId(managerId, start, end,
					orderByComparator);
			}
			
	

}