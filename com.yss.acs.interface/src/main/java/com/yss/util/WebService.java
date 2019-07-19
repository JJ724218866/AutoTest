package com.yss.util;

import java.sql.SQLException;
import java.util.List;

import com.yss.util.JdbcDao;

import acs.IQsFundService;
import acs.YssFundForQsFundservice;

public class WebService {

	public static IQsFundService getIQsFundService() {
		YssFundForQsFundservice service = new YssFundForQsFundservice();
		IQsFundService ifs = service.getYssFundForQsFundServer();
		return ifs;
	}

	public static List<String> getSqlData(String methodName) {
		List<String> list2 = null;
		try {
			list2 = new JdbcDao().convertArrayList(methodName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list2;
	}
}
