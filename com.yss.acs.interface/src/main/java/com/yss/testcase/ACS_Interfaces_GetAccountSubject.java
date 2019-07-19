package com.yss.testcase;

import java.util.ArrayList;
import java.util.List;

import com.autotest.enumeration.TestResultEnum;
import com.autotest.utils.TestLog;
import com.autotest.webserivce.model.WebAPITestCase;
import com.yss.common.CommonResources;
import com.yss.util.WebService;

import acs.AccountDataBean;

/**
 * 获取会计科目测试用例
 * 
 * @author Administrator
 */
public class ACS_Interfaces_GetAccountSubject extends WebService {
	public Object getAccountSubject_1(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list1 = new CommonResources().getParam_AccountSubject(testCase);
		List<String> list = new ArrayList<String>();
		for (AccountDataBean code : list1) {
			list.add(code.getAccountCode());
		}
		boolean flag = list.containsAll(getSqlData("getAccountSubject_1"));
		if (list.size() == (getSqlData("getAccountSubject_1")).size() || flag) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_2(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list1 = new CommonResources().getParam_AccountSubject(testCase);
		List<String> list = new ArrayList<String>();
		for (AccountDataBean code : list1) {
			list.add(code.getAccountCode());
		}
		boolean flag = list.containsAll(getSqlData("getAccountSubject_2"));
		if (list.size() == (getSqlData("getAccountSubject_2")).size() || flag) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_3(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list1 = new CommonResources().getParam_AccountSubject(testCase);
		List<String> list = new ArrayList<String>();
		for (AccountDataBean code : list1) {
			list.add(code.getAccountCode());
		}
		boolean flag = list.containsAll(getSqlData("getAccountSubject_3"));
		if (list.size() == (getSqlData("getAccountSubject_3")).size() || flag) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_4(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list1 = new CommonResources().getParam_AccountSubject(testCase);
		List<String> list = new ArrayList<String>();
		for (AccountDataBean code : list1) {
			list.add(code.getAccountCode());
		}
		boolean flag = list.containsAll(getSqlData("getAccountSubject_4"));
		if (list.size() == (getSqlData("getAccountSubject_4")).size() || flag) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_5(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list = new CommonResources().getParam_AccountSubject(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_6(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list = new CommonResources().getParam_AccountSubject(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_7(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list = new CommonResources().getParam_AccountSubject(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_8(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list = new CommonResources().getParam_AccountSubject(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_9(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list = new CommonResources().getParam_AccountSubject(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_10(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list = new CommonResources().getParam_AccountSubject(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_11(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list = new CommonResources().getParam_AccountSubject(testCase);
		if (list.size() == 811) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_12(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list = new CommonResources().getParam_AccountSubject(testCase);
		if (list.size() == 365) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_13(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list = new CommonResources().getParam_AccountSubject(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_14(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list = new CommonResources().getParam_AccountSubject(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_15(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list = new CommonResources().getParam_AccountSubject(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_16(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list = new CommonResources().getParam_AccountSubject(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_17(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list = new CommonResources().getParam_AccountSubject(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_18(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list = new CommonResources().getParam_AccountSubject(testCase);
		if (list.size() == 811) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getAccountSubject_19(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<AccountDataBean> list = new CommonResources().getParam_AccountSubject(testCase);
		if (list.size() == 365) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

}
