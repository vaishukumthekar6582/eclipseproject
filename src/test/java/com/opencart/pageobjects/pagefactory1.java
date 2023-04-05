package com.opencart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import maveproject1.pageobject;

public class pagefactory1 {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub*/
	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	
	pageobject obj=new pageobject(driver);
	
	driver.get("https://demo.opencart.com/");
	
	obj.clickonmyaccount();
	obj.clickonloginlink();
	obj.enteremail();
	obj.enterpassword();
	obj.clickonsubmit();
	
	
	WebDriver driver;
	
	@FindBy(linkText="My Account")
	WebElement myaccountlink;
	
	
	@FindBy(linkText="Login")
	WebElement loginlink;
	
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-password")
	WebElement password;
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbutton;
	
	public void clickonmyaccount()
	{
		(myaccountlink).click();
	}
	
	public void clickonloginlink()
	{
		(loginlink).click();
	}
	
	
	public void enteremail()
	{
		(email).sendKeys("vk@gmail.com");
	}
	
	public void enterpassword()
	{
		(password).sendKeys("vk");
	}
	
	
	public void clickonsubmit()
	{
		(loginbutton).click();
	}
	
}

	
