package com.obsqura.TestNGframework;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBoxDemo extends Base
{
@Test
 public void singleCheckBoxDemo()
 {
	driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
	WebElement checkBoxClick = driver.findElement(By.xpath("//input[@id='gridCheck']"));
	checkBoxClick.click();
	boolean isCheckBoxIsSelected = checkBoxClick.isSelected();
	assertTrue(isCheckBoxIsSelected,"CheckBox is not selected");
 }
@Test
	public void multipleCheckBoxDemo()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@value='Select All']"));
		selectAllButton.click();
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		assertTrue(checkBox.isSelected(), "CheckBox one is not selected");
		
		checkBox = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		assertTrue(checkBox.isSelected(), "CheckBox two is not selected");
		
		checkBox = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		assertTrue(checkBox.isSelected(), "CheckBox three is not selected");
		
		checkBox = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		assertTrue(checkBox.isSelected(), "CheckBox four is not selected");
		
		WebElement unSelectAllButton = driver.findElement(By.xpath("//input[@value='Unselect All']"));
		unSelectAllButton.click();
		
		checkBox = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		assertFalse(checkBox.isSelected(), "CheckBox one is selected");
		
		checkBox = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		assertFalse(checkBox.isSelected(), "CheckBox two is selected");
		
		checkBox = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		assertFalse(checkBox.isSelected(), "CheckBox three is selected");
		
		checkBox = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		assertFalse(checkBox.isSelected(), "CheckBox four is selected");
		
		
	
	}

}