package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepage {
	
	WebDriver driver;
	
	public RediffHomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//By Search=By.id("srchword");
	
	@FindBy(id="srchword")
	WebElement search;
	
	public WebElement Search()
	{
		return search;
	}
	
	/*public WebElement search()
	{
		return driver.findElement(Search);
	}
	*/

}
