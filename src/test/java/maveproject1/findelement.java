package maveproject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class findelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world");
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.linkText("My Account")).click();
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
