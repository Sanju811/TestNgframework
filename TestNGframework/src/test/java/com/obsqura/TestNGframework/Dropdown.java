package com.obsqura.TestNGframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown extends Base
{
	@Test
	public void dropDownUsingSelectClass()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropDown);
		select.selectByVisibleText("Red");
		select.selectByValue("Yellow");
		select.selectByIndex(3);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		
		WebElement multipleDropDown = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select2 = new Select(multipleDropDown);
		boolean isMultipleSelected = select2.isMultiple();
		select2.selectByVisibleText("Red");
		select2.selectByValue("Yellow");
		
		
	}
	@Test
	public void seleniumDevSelectLanguage()
	{
		driver.navigate().to("https://www.selenium.dev/");
		String languageOption ="Português (Brasileiro)";
		List<WebElement> languages = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a"));
		WebElement languageDropDown = driver.findElement(By.xpath("//div[@class='dropdown']//child::a[@class='nav-link dropdown-toggle']"));
		languageDropDown.click();
		for(WebElement language : languages )
		{
			String menuText = language.getText();
			if(menuText.equals(languageOption));
			{
				language.click();
				break;
			}
		}
	}
}
