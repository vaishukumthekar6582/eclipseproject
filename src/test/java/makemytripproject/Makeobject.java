package makemytripproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Makeobject {

	WebDriver driver;
	
	By clickhotel=By.linkText("Hotels");
	By clicksearch=By.xpath("//*[@id=\"hsw_search_button\"]");
	By inputsearch=By.xpath("//input[@placeholder='Search for locality / hotel name']");
	By clickplace=By.xpath("//*[@id=\"react-autowhatever-1--item-2\"]/a/p/span[2]");
	By clickname=By.id("hlistpg_hotel_star_rating");
	By clickbook=By.linkText("BOOK THIS NOW");
	By firstname=By.id("fName");
	By lastname=By.id("lName");
	By entreemail=By.id("email");
	By mobile=By.id("mNo");
	
	
	public Makeobject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickonhotel()
	{
		driver.findElement(clickhotel).click();	
		//driver.findElement(By.linkText("Hotels")).click();
	}
	
	public void clickonsearch()
	{
		driver.findElement(clicksearch).click();
	}
	
	public void clickoninputsearch()
	{
		driver.findElement(inputsearch).click();
	}
	public void clickonplace()
	{
		driver.findElement(clickplace).click();
	}
	
	public void clickonname()
	{
		driver.getWindowHandles();
		driver.findElement(By.xpath("//"))
		driver.findElement(clickname).click();
	}
	
	public void clickonbook()
	{
		driver.findElement(clickbook).click();
	}
	public void clickonfirst()
	{
		driver.findElement(firstname).click();
	}
	public void clickonlast()
	{
		driver.findElement(lastname).click();
	}
	public void clickonemail()
	{
		driver.findElement(entreemail).click();
	}
	public void clickonmobile()
	{
		driver.findElement(mobile).click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
