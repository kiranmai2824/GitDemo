package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomepage;
import ObjectRepository.RediffLoginPage;

public class RediffLogin {

	@Test
	public void Login() 
	
	{
		System.setProperty("webdriver.chrome.driver","G:\\Kiranmai\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rl=new RediffLoginPage(driver);
		rl.emailid().sendKeys("hello");
		rl.password().sendKeys("hello");
		//rl.submit().click();
		rl.homepage().click();
		RediffHomepage rh= new RediffHomepage(driver);
		rh.Search().sendKeys("rediff");
		
	
	}
}
