package maveproject1;

//import org.openqa.selenium.By;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
				
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
				
		//driver.get("htttps://demo.opencart.com/");
		//driver.findElement(By.linkText("My Account")).click();
		//driver.findElement(By.linkText("Register")).click();
		//driver.findElement(By.id("input-firstname")).sendKeys("v");
		//driver.findElement(By.id("input-lastname")).sendKeys("k");
		//driver.findElement(By.id("input-email")).sendKeys("vk@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("vk");
		//driver.findElement(By.linkText("checkbox")).click();
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		System.out.println("The title of browser is:"+driver.getTitle());
		System.out.println("url is"+driver.getCurrentUrl());
		driver.navigate().to("https://www.google.com/");
		System.out.println("The title of browser is:"+driver.getTitle());
		System.out.println("url is"+driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("The title of browser is:"+driver.getTitle());
		System.out.println("url is"+driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println("The title of browser is:"+driver.getTitle());
		System.out.println("url is"+driver.getCurrentUrl());
		
	
		driver.quit();
	}

}
