package com.obsqura.TestNGframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindElements extends Base
{
	@Test
	public void menuOption()
	{
		List<WebElement> menu = driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
		for(WebElement menuOption : menu)
		{
			String menuText = menuOption.getText();
			if(menuText.equals("DropDown"));
			{
				menuOption.click();
				break;
			}
		}
	}
	
	@Test
	public void invokeMenuOption(String menuCategory)
	{
		
	}

}
