package com.yss.testcase;

import java.util.ArrayList;
import java.util.List;

import com.autotest.enumeration.TestResultEnum;
import com.autotest.utils.TestLog;
import com.autotest.webserivce.model.WebAPITestCase;
import com.yss.common.CommonResources;
import com.yss.util.WebService;

import acs.TransferAmountBean;

/**
 * 获取TA结转划款金额
 * 
 * @author Administrator
 *
 */
public class ACS_Interfaces_GetTransferAmount extends WebService {

	@SuppressWarnings("unlikely-arg-type")
	public Object getTransferAmount_1(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<TransferAmountBean> transferAmountBeanList = new CommonResources().getParam_TransferAmount(testCase);
		List<String> list = new ArrayList<String>();
		for (TransferAmountBean adb : transferAmountBeanList) {
			list.add(String.valueOf(adb.getTransferAmount().doubleValue()));
		}
		List<String> list1 = new ArrayList<String>();
		list1.add("100.0");
		if (list.size() == list1.size() || list.contains(list1)) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	@SuppressWarnings("unlikely-arg-type")
	public Object getTransferAmount_2(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<TransferAmountBean> transferAmountBeanList = new CommonResources().getParam_TransferAmount(testCase);
		List<String> list = new ArrayList<String>();
		for (TransferAmountBean adb : transferAmountBeanList) {
			list.add(String.valueOf(adb.getTransferAmount().doubleValue()));
		}
		List<String> list1 = new ArrayList<String>();
		list1.add("100.0");
		list1.add("200.0");
		if (list.size() == list1.size() || list.contains(list1)) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getTransferAmount_3(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<TransferAmountBean> transferAmountBeanList = new CommonResources().getParam_TransferAmount(testCase);
		if (transferAmountBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getTransferAmount_4(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<TransferAmountBean> transferAmountBeanList = new CommonResources().getParam_TransferAmount(testCase);
		if (transferAmountBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getTransferAmount_5(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<TransferAmountBean> transferAmountBeanList = new CommonResources().getParam_TransferAmount(testCase);
		if (transferAmountBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getTransferAmount_6(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<TransferAmountBean> transferAmountBeanList = new CommonResources().getParam_TransferAmount(testCase);
		if (transferAmountBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

}
