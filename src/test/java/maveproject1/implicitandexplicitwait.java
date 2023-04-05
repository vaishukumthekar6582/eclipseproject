package maveproject1;

import java.util.ArrayList;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class implicitandexplicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofseconds(60));
		
		//Explicit wait
		WebDriverWait wait;
		
		wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Accounts")));
		
		//Fluent Wait
		
		Wait fwait=new FluentWait(driver)
		
				.withTimeout(java.time.Duration.ofSeconds(30))
				.ignoring(NoSuchElementException.class)
				.pollingEvery(java.time.Duration.ofSeconds(5));
		
		fwait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Accounts")));
				
		driver.get("https://demo.opencart.com/");
		//Thread.sleep(20);
		
		driver.findElement(By.linkText("My Accounts")).click();
		//Thread.sleep(20);
		
		driver.findElement(By.linkText("Register")).click();
		List <WebElement> l1=driver.findElements(By.xpath("//a[@class='list-group-item']"));
		System.out.println("Size of List :"+l1.size());
		
		for (WebElement i:l1)
		{
			System.out.println("Lis is :"+i.getText());
			System.out.println("Attribute is:"+i.getAttribute("href"));
		}
	}

}
