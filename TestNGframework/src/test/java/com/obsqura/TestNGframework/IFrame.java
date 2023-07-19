package com.obsqura.TestNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrame extends Base
{
	@Test
	public void iFrameDemo()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		int size = driver.findElements(By.tagName("iframe")).size();
		//driver.switchTo().frame(2); //index
		driver.switchTo().frame("a077aa5e"); //id
		WebElement iFrameJmeter = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		iFrameJmeter.click();
	}

}
