package com.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;

public class bbb {

	public AppiumDriver driver;


	@BeforeSuite

	public void setup() throws MalformedURLException {

		DesiredCapabilities capabilites = new DesiredCapabilities();
		capabilites.setCapability("platformName", "Android");
		capabilites.setCapability("platformVersion", "12");
		capabilites.setCapability("udid", "ZD22275F65");
		capabilites.setCapability("deviceName", "motog22");

		capabilites.setCapability("appPackage", "com.google.android.calculator");
		capabilites.setCapability("appActivity", "com.android.calculator2.Calculator");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		driver = new AppiumDriver(url, capabilites);

	}

	@AfterSuite
	public void teardown() throws InterruptedException {
		Thread.sleep(50);
		//driver.close();
	}
}
