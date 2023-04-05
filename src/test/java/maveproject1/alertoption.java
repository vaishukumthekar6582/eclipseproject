package maveproject1;


import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertoption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		Alert simplealret=driver.switchTo().alert();
		System.out.println("Alert Text:"+simplealret.getText());
		simplealret.accept();
		

	}

}
