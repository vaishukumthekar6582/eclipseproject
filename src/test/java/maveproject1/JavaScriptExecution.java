package maveproject1;

import java.util.ArrayList;

//import java.util.List;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hello world');");

	}

}
