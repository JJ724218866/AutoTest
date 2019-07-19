package com.yss.testcase;

import java.util.ArrayList;
import java.util.List;

import com.autotest.enumeration.TestResultEnum;
import com.autotest.utils.TestLog;
import com.autotest.webserivce.model.WebAPITestCase;
import com.yss.common.CommonResources;
import com.yss.util.WebService;

import acs.SubjectAccrualBean;
import acs.YssException_Exception;

/**
 * 获取核算科目日期区间发生额测试用例
 * 
 * @author Administrator
 *
 */
public class ACS_Interfaces_GetKmfsBalance extends WebService {

	@SuppressWarnings("unlikely-arg-type")
	public Object getKmfsBalance_1(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		List<String> accMoneyList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			accMoneyList = new ArrayList<String>();
			for (SubjectAccrualBean adb : subjectAccrualBeanList) {
				if (subjectAccrualBeanList.size() == 1) {
					accMoneyList.add(String.valueOf(adb.getAccMoney()));
				}
			}
			List<String> list = new ArrayList<String>();
			list.add("1000.0");
			if (accMoneyList.size() == list.size() || accMoneyList.contains(list)) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	@SuppressWarnings("unlikely-arg-type")
	public Object getKmfsBalance_2(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		List<String> accMoneyList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			accMoneyList = new ArrayList<String>();
			for (SubjectAccrualBean adb : subjectAccrualBeanList) {
				if (subjectAccrualBeanList.size() == 1) {
					accMoneyList.add(String.valueOf(adb.getAccMoney()));
				}
			}
			List<String> list = new ArrayList<String>();
			list.add("1000.0");
			if (accMoneyList.size() == list.size() || accMoneyList.contains(list)) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	@SuppressWarnings("unlikely-arg-type")
	public Object getKmfsBalance_3(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		List<String> accMoneyList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			accMoneyList = new ArrayList<String>();
			for (SubjectAccrualBean adb : subjectAccrualBeanList) {
				if (subjectAccrualBeanList.size() == 1) {
					accMoneyList.add(String.valueOf(adb.getAccMoney()));
				}
			}
			List<String> list = new ArrayList<String>();
			list.add("1000.0");
			if (accMoneyList.size() == list.size() || accMoneyList.contains(list)) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	@SuppressWarnings("unlikely-arg-type")
	public Object getKmfsBalance_4(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		List<String> accMoneyList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			accMoneyList = new ArrayList<String>();
			for (SubjectAccrualBean adb : subjectAccrualBeanList) {
				if (subjectAccrualBeanList.size() == 1) {
					accMoneyList.add(String.valueOf(adb.getAccMoney()));
				}
			}
			List<String> list = new ArrayList<String>();
			list.add("1000.0");
			if (accMoneyList.size() == list.size() || accMoneyList.contains(list)) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	@SuppressWarnings("unlikely-arg-type")
	public Object getKmfsBalance_5(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		List<String> accMoneyList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			accMoneyList = new ArrayList<String>();
			for (SubjectAccrualBean adb : subjectAccrualBeanList) {
				if (subjectAccrualBeanList.size() == 1) {
					accMoneyList.add(String.valueOf(adb.getAccMoney()));
				}
			}
			List<String> list = new ArrayList<String>();
			list.add("1000.0");
			if (accMoneyList.size() == list.size() || accMoneyList.contains(list)) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	@SuppressWarnings("unlikely-arg-type")
	public Object getKmfsBalance_6(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		List<String> accMoneyList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			accMoneyList = new ArrayList<String>();
			for (SubjectAccrualBean adb : subjectAccrualBeanList) {
				accMoneyList.add(String.valueOf(adb.getAccMoney()));
			}
			List<String> list = new ArrayList<String>();
			list.add("1000.0");
			list.add("200.0");
			if (accMoneyList.size() == list.size() || accMoneyList.contains(list)) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	@SuppressWarnings("unlikely-arg-type")
	public Object getKmfsBalance_7(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		List<String> accMoneyList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			accMoneyList = new ArrayList<String>();
			for (SubjectAccrualBean adb : subjectAccrualBeanList) {
				accMoneyList.add(String.valueOf(adb.getAccMoney()));
			}
			List<String> list = new ArrayList<String>();
			list.add("1000.0");
			list.add("200.0");
			if (accMoneyList.size() == list.size() || accMoneyList.contains(list)) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	@SuppressWarnings("unlikely-arg-type")
	public Object getKmfsBalance_8(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		List<String> accMoneyList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			accMoneyList = new ArrayList<String>();
			for (SubjectAccrualBean adb : subjectAccrualBeanList) {
				accMoneyList.add(String.valueOf(adb.getAccMoney()));
			}
			List<String> list = new ArrayList<String>();
			list.add("1000.0");
			list.add("200.0");
			if (accMoneyList.size() == list.size() || accMoneyList.contains(list)) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	public Object getKmfsBalance_9(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			if (subjectAccrualBeanList.size() == 0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	public Object getKmfsBalance_10(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			if (subjectAccrualBeanList.size() == 0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	public Object getKmfsBalance_11(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			if (subjectAccrualBeanList.size() == 0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	public Object getKmfsBalance_12(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			if (subjectAccrualBeanList.size() == 0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	public Object getKmfsBalance_13(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			if (subjectAccrualBeanList.size() == 0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	public Object getKmfsBalance_14(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			if (subjectAccrualBeanList.size() == 0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	public Object getKmfsBalance_15(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			if (subjectAccrualBeanList.size() == 0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	public Object getKmfsBalance_16(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			if (subjectAccrualBeanList.size() == 0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	public Object getKmfsBalance_17(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			if (subjectAccrualBeanList.size() == 0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	@SuppressWarnings("unlikely-arg-type")
	public Object getKmfsBalance_18(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		List<String> accMoneyList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			accMoneyList = new ArrayList<String>();
			for (SubjectAccrualBean adb : subjectAccrualBeanList) {
				if (subjectAccrualBeanList.size() == 1) {
					accMoneyList.add(String.valueOf(adb.getAccMoney()));
				}
			}
			List<String> list = new ArrayList<String>();
			list.add("1000.0");
			if (accMoneyList.size() == list.size() || accMoneyList.contains(list)) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	public Object getKmfsBalance_19(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			if (subjectAccrualBeanList.size() == 0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	public Object getKmfsBalance_20(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			if (subjectAccrualBeanList.size() == 0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	public Object getKmfsBalance_21(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			if (subjectAccrualBeanList.size() == 0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	public Object getKmfsBalance_22(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			if (subjectAccrualBeanList.size() == 0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	public Object getKmfsBalance_23(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			if (subjectAccrualBeanList.size() == 0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}

	public Object getKmfsBalance_24(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<SubjectAccrualBean> subjectAccrualBeanList;
		try {
			subjectAccrualBeanList = new CommonResources().getParam_KmfsBalance(testCase);
			if (subjectAccrualBeanList.size() == 0) {
				System.out.println("通过");
				testCase.setResult(TestResultEnum.PASS.value());
			} else {
				System.out.println("失败");
				testCase.setResult(TestResultEnum.FAIL.value());
			}
		} catch (YssException_Exception e) {
			e.printStackTrace();
		}
		return testCase;
	}
}
