package com.yss.common;

import java.util.List;
import java.util.Map;

import com.autotest.webserivce.model.WebAPITestCase;
import com.yss.util.WebService;

import acs.AccountDataBean;
import acs.CwjySj;
import acs.SubjectAccrualBean;
import acs.SubjectBalanceDataBean;
import acs.TransferAmountBean;
import acs.YssException_Exception;

public class CommonResources extends WebService {
	public List<AccountDataBean> getParam_AccountSubject(WebAPITestCase testCase) {
		Map<?, ?> map = testCase.getTestPoint().getParams();
		@SuppressWarnings("unchecked")
		List<String> list1 = (List<String>) map.get("资产代码");
		@SuppressWarnings("unchecked")
		List<String> list2 = (List<String>) map.get("科目代码/科目性质");
		List<AccountDataBean> accountDataBeanList = getIQsFundService().getAccountSubject(list1, (String) map.get("年份"),
				(String) map.get("标志位标明是用科目代码还是科目性质"), list2);
		return accountDataBeanList;
	}

	public List<CwjySj> getParam_Cwjysj(WebAPITestCase testCase) {
		Map<?, ?> map = testCase.getTestPoint().getParams();
		List<CwjySj> list = getIQsFundService().getCwjysj((String) map.get("资产代码"), (String) map.get("清算日期"),
				(String) map.get("取数方式"), (String) map.get("划款类型"));
		return list;
	}

	public List<SubjectAccrualBean> getParam_KmfsBalance(WebAPITestCase testCase) throws YssException_Exception {
		Map<?, ?> map = testCase.getTestPoint().getParams();
		@SuppressWarnings("unchecked")
		List<String> fassetIDList = (List<String>) map.get("产品代码");
		@SuppressWarnings("unchecked")
		List<String> facctList = (List<String>) map.get("科目代码/科目性质");
		List<SubjectAccrualBean> subjectAccrualBeanList = getIQsFundService().getKmfsBalance(fassetIDList,
				(String) map.get("日期"), facctList, (String) map.get("标志位标明是用科目代码还是科目性质"), (String) map.get("借贷方向"));
		return subjectAccrualBeanList;
	}

	public List<SubjectBalanceDataBean> getParam_SubjectBalance(WebAPITestCase testCase) {
		Map<?, ?> map = testCase.getTestPoint().getParams();
		@SuppressWarnings("unchecked")
		List<String> list1 = (List<String>) map.get("产品代码");
		@SuppressWarnings("unchecked")
		List<String> list2 = (List<String>) map.get("科目代码/科目性质");
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = getIQsFundService().getSubjectBalance(list1,
				(String) map.get("结转日期"), list2, (String) map.get("标志位标明是用科目代码还是科目性质"));
		return subjectBalanceDataBeanList;
	}

	public List<TransferAmountBean> getParam_TransferAmount(WebAPITestCase testCase) {
		Map<?, ?> map = testCase.getTestPoint().getParams();
		@SuppressWarnings("unchecked")
		List<String> list1 = (List<String>) map.get("产品代码");
		List<TransferAmountBean> transferAmountBeanList = getIQsFundService().getTransferAmount(list1,
				(String) map.get("结转日期"));
		return transferAmountBeanList;
	}
}
