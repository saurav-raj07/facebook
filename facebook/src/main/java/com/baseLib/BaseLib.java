package com.baseLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseLib {
	
	public static WebDriver driver;

	@BeforeTest
	public void SetUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Browser Launched", true);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
		Reporter.log("Url Opened", true);
		Thread.sleep(2000);

	}

	@AfterTest
	public void testDown() {
		driver.quit();
		Reporter.log("browser closed", true);
	}

}
