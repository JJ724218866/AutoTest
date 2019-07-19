package com.yss.testcase;

import java.util.ArrayList;
import java.util.List;

import com.yss.util.WebService;

import acs.AssetDataBean;

public class ACS_Interfaces_GetAssetData extends WebService {
	// sql:中去重是否可以拿掉
	public static void testGetAssetData() {
		List<String> list = new ArrayList<String>();
		List<AssetDataBean> list1 = getIQsFundService().getAssetData();
		for (AssetDataBean assetDataBean : list1) {
			String s = assetDataBean.getFassetid();
			list.add(s);
		}
		boolean flag = list.containsAll(getSqlData("getAssetData"));
		if (list1.size() == (getSqlData("getAssetData").size()) || flag) {
			System.out.println("核算系统提供获取未封账资产的资产信息服务:getAssetData接口测试通过!");
		} else {
			System.out.println("核算系统提供获取未封账资产的资产信息服务:getAssetData接口测试不通过!");
		}
	}

	public static void main(String[] args) {
		ACS_Interfaces_GetAssetData.testGetAssetData();
	}
}
