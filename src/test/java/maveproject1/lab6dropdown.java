package maveproject1;

import java.util.ArrayList;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab6dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("vk@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("vk");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=25_28&limit=25");
		Select sortlist=new Select(driver.findElement(By.id("input-limit")));
		sortlist.selectByIndex(1);
		Select sortlist1=new Select(driver.findElement(By.id("input-sort")));
		sortlist1.selectByIndex(3);
		driver.findElement(By.linkText("Add to Cart")).click();
		driver.findElement(By.linkText("Apple Cinema 30")).click();
		driver.findElement(By.id("button-cart")).click();
		
		
	}

}
