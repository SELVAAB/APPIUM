package com.test;

import org.testng.annotations.Test;

import com.base.bbb;
import com.pages.loginnnn;

import io.appium.java_client.AppiumDriver;

public class testcase  {

	
	public AppiumDriver driver;
	 loginnnn page = new loginnnn(driver);
	
	
	
	

	@Test(priority = 1)
	public void step() {

		loginnnn page = new loginnnn(driver);

		page.clickonelements();
	}

}
