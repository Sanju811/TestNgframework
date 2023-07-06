package com.obsqura.TestNGframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public WebDriver driver;
	@BeforeMethod
	public void initialisebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\git\\Automationcourse\\Automationcourse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}
	@AfterMethod
	public void browserCloseOrQuit()
	{
		//driver.close();
		driver.quit();	
	}
}
