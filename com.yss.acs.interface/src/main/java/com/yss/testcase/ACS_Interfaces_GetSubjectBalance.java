package com.yss.testcase;

import java.util.ArrayList;
import java.util.List;

import com.autotest.enumeration.TestResultEnum;
import com.autotest.utils.TestLog;
import com.autotest.webserivce.model.WebAPITestCase;
import com.yss.common.CommonResources;
import com.yss.util.WebService;

import acs.SubjectBalanceDataBean;

/**
 * 资金托管系统相关金额测试用例
 * 
 * @author Administrator
 *
 */
public class ACS_Interfaces_GetSubjectBalance extends WebService {

	public Object getSubjectBalance_1(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 1) {
			double accountBalance = subjectBalanceDataBeanList.get(0).getAccountBalance().doubleValue();
			if (accountBalance == 10000000) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		}
		return testCase;
	}

	@SuppressWarnings("unlikely-arg-type")
	public Object getSubjectBalance_2(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		List<String> accountBalanceList = new ArrayList<String>();
		for (SubjectBalanceDataBean adb : subjectBalanceDataBeanList) {
			double accountBalance = adb.getAccountBalance().doubleValue();
			String string = String.valueOf(accountBalance);
			accountBalanceList.add(string);
		}
		List<String> list = new ArrayList<String>();
		list.add("10000000");
		list.add("1000.0");
		list.add("0.0");
		list.add("0.0");
		if (accountBalanceList.size() == list.size() || accountBalanceList.contains(list)) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	@SuppressWarnings("unlikely-arg-type")
	public Object getSubjectBalance_3(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		List<String> list = new ArrayList<String>();
		for (SubjectBalanceDataBean adb : subjectBalanceDataBeanList) {
			double accountBalance = adb.getAccountBalance().doubleValue();
			String string = String.valueOf(accountBalance);
			list.add(string);
		}
		List<String> list1 = new ArrayList<String>();
		list1.add("10000000");
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
	public Object getSubjectBalance_4(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		List<String> list = new ArrayList<String>();
		for (SubjectBalanceDataBean adb : subjectBalanceDataBeanList) {
			double accountBalance = adb.getAccountBalance().doubleValue();
			String string = String.valueOf(accountBalance);
			list.add(string);
		}
		List<String> list1 = new ArrayList<String>();
		list1.add("10000000");
		list1.add("1000.0");
		list1.add("0.0");
		list1.add("0.0");
		if (list.size() == list1.size() || list.contains(list1)) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getSubjectBalance_5(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getSubjectBalance_6(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getSubjectBalance_7(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getSubjectBalance_8(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 1) {
			double accountBalance = subjectBalanceDataBeanList.get(0).getAccountBalance().doubleValue();
			if (accountBalance == 10000000) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		}
		return testCase;
	}

	public Object getSubjectBalance_9(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getSubjectBalance_10(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getSubjectBalance_11(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getSubjectBalance_12(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 1) {
			double accountBalance = subjectBalanceDataBeanList.get(0).getAccountBalance().doubleValue();
			if (accountBalance == 0.0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		}
		return testCase;
	}

	public Object getSubjectBalance_13(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getSubjectBalance_14(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getSubjectBalance_15(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getSubjectBalance_16(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getSubjectBalance_17(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getSubjectBalance_18(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getSubjectBalance_19(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getSubjectBalance_20(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectBalanceDataBean> subjectBalanceDataBeanList = new CommonResources()
				.getParam_SubjectBalance(testCase);
		if (subjectBalanceDataBeanList.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

}
