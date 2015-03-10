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

package com.pacnet.connect.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.pacnet.connect.service.AccessLogLocalServiceUtil;
import com.pacnet.connect.service.AccessLogServiceUtil;
import com.pacnet.connect.service.AccessRequestFacilityServiceLocalServiceUtil;
import com.pacnet.connect.service.AccessRequestFacilityServiceServiceUtil;
import com.pacnet.connect.service.AccessRequestLocalServiceUtil;
import com.pacnet.connect.service.AccessRequestNoteHistoryLocalServiceUtil;
import com.pacnet.connect.service.AccessRequestNoteHistoryServiceUtil;
import com.pacnet.connect.service.AccessRequestServiceUtil;
import com.pacnet.connect.service.AccessRequestStatusLocalServiceUtil;
import com.pacnet.connect.service.AccessRequestStatusServiceUtil;
import com.pacnet.connect.service.ClpSerializer;
import com.pacnet.connect.service.FacilityAccessLocalServiceUtil;
import com.pacnet.connect.service.FacilityAccessServiceUtil;
import com.pacnet.connect.service.FacilityAssignmentLocalServiceUtil;
import com.pacnet.connect.service.FacilityAssignmentServiceUtil;
import com.pacnet.connect.service.FacilityExternalVisitorLocalServiceUtil;
import com.pacnet.connect.service.FacilityExternalVisitorServiceUtil;
import com.pacnet.connect.service.FacilityLocalServiceUtil;
import com.pacnet.connect.service.FacilitySecurityOfficerMappingLocalServiceUtil;
import com.pacnet.connect.service.FacilitySecurityOfficerMappingServiceUtil;
import com.pacnet.connect.service.FacilityServiceUtil;
import com.pacnet.connect.service.FacilityStaffMappingLocalServiceUtil;
import com.pacnet.connect.service.FacilityStaffMappingServiceUtil;
import com.pacnet.connect.service.FacilityUserMappingLocalServiceUtil;
import com.pacnet.connect.service.FacilityUserMappingServiceUtil;
import com.pacnet.connect.service.FacilityUserServiceLocalServiceUtil;
import com.pacnet.connect.service.FacilityUserServiceServiceUtil;
import com.pacnet.connect.service.SMAAdminsLocalServiceUtil;
import com.pacnet.connect.service.SMAAdminsServiceUtil;
import com.pacnet.connect.service.SMACompaniesLocalServiceUtil;
import com.pacnet.connect.service.SMACompaniesServiceUtil;
import com.pacnet.connect.service.SMACompanyListLocalServiceUtil;
import com.pacnet.connect.service.SMACompanyListServiceUtil;
import com.pacnet.connect.service.SMAEmailHistoryLocalServiceUtil;
import com.pacnet.connect.service.SMAEmailHistoryServiceUtil;
import com.pacnet.connect.service.SMARadacctLocalServiceUtil;
import com.pacnet.connect.service.SMARadacctServiceUtil;
import com.pacnet.connect.service.SMARadcheckLocalServiceUtil;
import com.pacnet.connect.service.SMARadcheckServiceUtil;
import com.pacnet.connect.service.SMAReservationLocalServiceUtil;
import com.pacnet.connect.service.SMAReservationServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			AccessLogLocalServiceUtil.clearService();

			AccessLogServiceUtil.clearService();
			AccessRequestLocalServiceUtil.clearService();

			AccessRequestServiceUtil.clearService();
			AccessRequestFacilityServiceLocalServiceUtil.clearService();

			AccessRequestFacilityServiceServiceUtil.clearService();
			AccessRequestNoteHistoryLocalServiceUtil.clearService();

			AccessRequestNoteHistoryServiceUtil.clearService();
			AccessRequestStatusLocalServiceUtil.clearService();

			AccessRequestStatusServiceUtil.clearService();
			FacilityLocalServiceUtil.clearService();

			FacilityServiceUtil.clearService();
			FacilityAccessLocalServiceUtil.clearService();

			FacilityAccessServiceUtil.clearService();
			FacilityAssignmentLocalServiceUtil.clearService();

			FacilityAssignmentServiceUtil.clearService();
			FacilityExternalVisitorLocalServiceUtil.clearService();

			FacilityExternalVisitorServiceUtil.clearService();
			FacilitySecurityOfficerMappingLocalServiceUtil.clearService();

			FacilitySecurityOfficerMappingServiceUtil.clearService();
			FacilityStaffMappingLocalServiceUtil.clearService();

			FacilityStaffMappingServiceUtil.clearService();
			FacilityUserMappingLocalServiceUtil.clearService();

			FacilityUserMappingServiceUtil.clearService();
			FacilityUserServiceLocalServiceUtil.clearService();

			FacilityUserServiceServiceUtil.clearService();
			SMAAdminsLocalServiceUtil.clearService();

			SMAAdminsServiceUtil.clearService();
			SMACompaniesLocalServiceUtil.clearService();

			SMACompaniesServiceUtil.clearService();
			SMACompanyListLocalServiceUtil.clearService();

			SMACompanyListServiceUtil.clearService();
			SMAEmailHistoryLocalServiceUtil.clearService();

			SMAEmailHistoryServiceUtil.clearService();
			SMARadacctLocalServiceUtil.clearService();

			SMARadacctServiceUtil.clearService();
			SMARadcheckLocalServiceUtil.clearService();

			SMARadcheckServiceUtil.clearService();
			SMAReservationLocalServiceUtil.clearService();

			SMAReservationServiceUtil.clearService();
		}
	}
}