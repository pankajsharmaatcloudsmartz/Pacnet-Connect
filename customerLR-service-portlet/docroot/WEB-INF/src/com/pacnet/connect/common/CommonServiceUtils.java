package com.pacnet.connect.common;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;

public class CommonServiceUtils<T> {
	
		public final static String SERVICE_CONTEXT_LOCATION="customerLR-service-portlet";
		
		public DynamicQuery getServiceContextLoader(Class<T> clazz){
		ClassLoader classLoader = (ClassLoader) PortletBeanLocatorUtil.locate(SERVICE_CONTEXT_LOCATION,"portletClassLoader");
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(clazz,classLoader);	
		return dynamicQuery;
	}		
}
