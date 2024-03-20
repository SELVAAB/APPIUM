package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.bbb;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class loginnnn {

	public AppiumDriver driver;
	
	
	//constructor

	public loginnnn(AppiumDriver driver) {

		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	//locating elements

	@AndroidFindBy(id = "com.google.android.calculator:id/digit_8")

	private WebElement eight;
	

	@AndroidFindBy(id = "com.google.android.calculator:id/digit_3")

	private WebElement three;
	

	@AndroidFindBy(id = "com.google.android.calculator:id/op_add")

	private WebElement add;
	

	@AndroidFindBy(id = "com.google.android.calculator:id/digit_2")

	private WebElement two;
	

	@AndroidFindBy(id = "com.google.android.calculator:id/eq")

	private WebElement five;

	
	@AndroidFindBy(id = "com.google.android.calculator:id/op_mul")

	private WebElement multiplee;

	
	@AndroidFindBy(id = "com.google.android.calculator:id/digit_3")

	private WebElement bbbb;

	@AndroidFindBy(id = "com.google.android.calculator:id/eq")

	private WebElement strrr;
	
	
	//perform actions 
	
	public void clickonelements() {
		eight.click();
		three.click();
		add.click();
		two.click();
		five.click();
		multiplee.click();
		bbbb.click();
		strrr.click();
		
		
		
	}

}
