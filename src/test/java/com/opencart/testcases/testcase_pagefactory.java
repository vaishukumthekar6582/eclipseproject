package com.opencart.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import maveproject1.pageobject;

public class testcase_pagefactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		pageobject obj=new pageobject(driver);
		
		driver.get("https://demo.opencart.com/");
		
		obj.clickonmyaccount();
		obj.clickonloginlink();
		obj.enteremail();
		obj.enterpassword();
		obj.clickonsubmit();

	}

}
