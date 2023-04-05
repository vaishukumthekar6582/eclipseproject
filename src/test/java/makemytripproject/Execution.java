package makemytripproject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
//import java.time.Duration;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Execution {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		//String projectpath=System.getProperty("user.dir");
		//ExtentReports extent=new ExtentReports();
		//ExtentSparkReporter spark=new ExtentSparkReporter(projectpath+"\\REPORTS_MAKEMYTRIP\\TC1.html");
				
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(200));
		driver.get("https://www.makemytrip.com/");
		//Thread.sleep(50);
		
		driver.findElement(By.linkText("Hotels")).click();
		//Thread.sleep(60);
		driver.findElement(By.xpath("//*[@id=\"hsw_search_button\"]")).click();
		//Thread.sleep(60);
		driver.findElement(By.xpath("//input[@placeholder='Search for locality / hotel name']")).sendKeys("Goa");
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1--item-2\"]/a/p/span[2]")).click();
		//Thread.sleep(120);
		driver.getWindowHandles();
		driver.findElement(By.id("hlistpg_hotel_star_rating")).click();
		Thread.sleep(60);
		List<String> l1=new ArrayList<String>(driver.getWindowHandles());
		System.out.println("l1size"+l1.size());
		
		driver.switchTo().window(l1.get(0));
		System.out.println("current url"+driver.getCurrentUrl());
		
		driver.switchTo().window(l1.get(1));
		Thread.sleep(200);
		System.out.println("current url"+driver.getCurrentUrl());
		driver.findElement(By.linkText("BOOK THIS NOW")).click();
		driver.findElement(By.id("fName")).sendKeys("v");
		driver.findElement(By.id("lName")).sendKeys("k");
		driver.findElement(By.id("email")).sendKeys("vk@gmail.com");
		driver.findElement(By.id("mNo")).sendKeys("1234567890");
		driver.quit();
		
	}

}



/*WebElement ele=driver.findElement(By.linkText("BOOK THIS NOW"));
Actions builder=new Actions(driver);
builder.moveToElement(ele).perform();
ele.click();*/
