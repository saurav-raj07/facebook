package com.testcases;

import org.testng.annotations.Test;
import com.baseLib.BaseLib;

import com.loginpage.*;

public class TestCases extends BaseLib{

	@Test()
	public void logintest() throws InterruptedException {
		// System.out.println("hello");
		
		LoginPage lp = new LoginPage(driver);
		// System.out.println("hello2");
		lp.loginFunction("admin", "manager");
		// System.out.println("hello3");
	}
}
