package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	public RediffLoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	WebDriver driver;
	By username=By.name("login");
	By Password=By.id("password");
	By Go=By.name("proceed");
	By home=By.linkText("Home");
	
	public WebElement emailid()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(Go);
	}
	
	public WebElement homepage()
	{
		return driver.findElement(home);
	}
	
}
