package maveproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab4_eclipse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		String expectedtitle="Your Store";
		String actualtitle=driver.getTitle();
		System.out.println("Open Cart Title"+ actualtitle);
		Assert.assertTrue(actualtitle.equalsIgnoreCase(expectedtitle),"Page title not matched");
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Mac (1)")).click();
		WebElement heading = driver.findElement(By.xpath("//*[@id=\"content\"]/h2"));
		System.out.println(heading.getText());
		Select sortlist1 = new Select(driver.findElement(By.id("input-sort")));
		sortlist1.selectByIndex(1);
		driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();
		System.out.println("Item added to cart Successfully");
	}

}
