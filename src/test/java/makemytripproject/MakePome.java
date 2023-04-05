package makemytripproject;
import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import maveproject1.pageobject;

public class MakePome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		pageobject obj=new pageobject(driver);
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(200));
		driver.get("https://www.makemytrip.com/");
		
		/*obj.clickonmyaccount();
		obj.clickonloginlink();
		obj.enteremail();
		obj.enterpassword();
		obj.clickonsubmit();*/
		
		obj.clickonhotel();
		obj.clickonsearch();
		obj.inputsearch();
		obj.clickplace();
		obj.clickname();
		obj.firstname();
		obj.lastname();
		obj.entreemail();
		obj.mobile();
		
		/*driver.findElement(By.linkText("Hotels")).click();
		
		driver.findElement(By.xpath("//*[@id=\"hsw_search_button\"]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for locality / hotel name']")).sendKeys("Goa");
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1--item-2\"]/a/p/span[2]")).click();
		
		driver.getWindowHandles();
		driver.findElement(By.id("hlistpg_hotel_star_rating")).click();
List<String> l1=new ArrayList<String>(driver.getWindowHandles());
		
		for(int i=0;i<l1.size();i++)
		{
			
			driver.switchTo().window(l1.get(i));
			
		}
		driver.switchTo().window(l1.get(1));
		//Thread.sleep(120);
		driver.findElement(By.linkText("BOOK THIS NOW")).click();
		driver.findElement(By.id("fName")).sendKeys("v");
		driver.findElement(By.id("lName")).sendKeys("k");
		driver.findElement(By.id("email")).sendKeys("vk@gmail.com");
		driver.findElement(By.id("mNo")).sendKeys("1234567890");
		driver.quit();
		
		*/

	}

}
