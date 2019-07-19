package com.yss.testcase;

import java.util.List;

import com.autotest.enumeration.TestResultEnum;
import com.autotest.utils.TestLog;
import com.autotest.webserivce.model.WebAPITestCase;
import com.yss.common.CommonResources;
import com.yss.util.WebService;

import acs.CwjySj;

/**
 * 从核算获取场外交易流水测试用例
 * 
 * @author Administrator
 *
 */
public class ACS_Interfaces_GetCwjysj extends WebService {

	public Object getCwjysj_1(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 20.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_2(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 21.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_3(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 22.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_4(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 10000.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_5(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 5000.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_6(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 2000.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_7(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 1500.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_8(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 90.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_9(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 80.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_10(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 60.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_11(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 40.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_12(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 100.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_13(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 70.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_14(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 1200.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_15(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 10000.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_16(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 20000.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_17(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 30000.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_18(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 999.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_19(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 888.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_20(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 6000.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_21(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 7000.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_22(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 8000.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_23(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 555.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_24(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 333.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_25(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 444.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_26(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 2020.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_27(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 2030.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_28(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 1290.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_29(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 1310.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_30(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 4010.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_31(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 4020.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_32(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 5010.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_33(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 5020.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_34(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 6010.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_35(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 6020.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_36(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 7010.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_37(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 7020.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_38(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 8010.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_39(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 8020.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_40(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 9010.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_41(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 9020.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_42(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 10010.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_43(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 10020.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_44(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 11010.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_45(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 11020.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_46(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 1 || list.get(0).getFhkje() == 1234.0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_47(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_48(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_49(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_50(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_51(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_52(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_53(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_54(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_55(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

	public Object getCwjysj_56(WebAPITestCase testCase) {
		TestLog.getInstance(this.getClass()).startTest(testCase.getName());
		TestLog.getInstance(this.getClass()).testStep(testCase.getName());
		TestLog.getInstance(this.getClass()).endTest(testCase.getName());
		List<CwjySj> list = new CommonResources().getParam_Cwjysj(testCase);
		if (list.size() == 0) {
			System.out.println("通过");
			testCase.setResult(TestResultEnum.PASS.value());
		} else {
			System.out.println("失败");
			testCase.setResult(TestResultEnum.FAIL.value());
		}
		return testCase;
	}

}
