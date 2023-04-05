package maveproject1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab3_eclipse {
@Test
	public void testcase() {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Desktops")).click();
	driver.findElement(By.linkText("Mac (1)")).click();
	Select sortlist1 = new Select(driver.findElement(By.id("input-sort")));
	sortlist1.selectByIndex(1);
	driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();
	//driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();
	
	
}
	

}
