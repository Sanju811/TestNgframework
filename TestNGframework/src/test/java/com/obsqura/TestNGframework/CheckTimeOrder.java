package com.obsqura.TestNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckTimeOrder extends Base
{
	@Test
	public void locateByClass() //24ms
	{
		WebElement ShowMessageButton = driver.findElement(By.className("btn-primary"));
	}
	@Test
	public void locateById() //18ms
	{
		WebElement ShowMessageButton = driver.findElement(By.id("button-one"));
	}
	@Test
	public void locateByCssSelector() //15ms
	{
		WebElement ShowMessageButton = driver.findElement(By.cssSelector("button.navbar-toggler"));
	}
	@Test
	public void locateByXpath() //17ms
	{
		WebElement ShowMessageButton = driver.findElement(By.xpath("//button[@class='navbar-toggler']"));
	}
	
	

}
