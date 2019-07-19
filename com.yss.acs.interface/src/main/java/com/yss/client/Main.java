package com.yss.client;

import com.autotest.executor.TestExecutor;
import com.autotest.listener.TestListenerFactory;
import com.autotest.webservice.listener.WebAPITestReporterListener;

/**
 * 测试启动器
 * 
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {
		TestListenerFactory.registerTestListener(TestExecutor.getInstance(), new WebAPITestReporterListener());
		TestExecutor.getInstance().execute();
	}
}
