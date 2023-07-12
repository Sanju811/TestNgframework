package com.obsqura.TestNGframework;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButton extends Base
{
	@Test
	public void radioButtonDemo()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement radioButtonMale = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radioButtonMale.click();
		boolean radioButtonMaleIsSelected = radioButtonMale.isSelected();
		assertTrue(radioButtonMale.isSelected(),"RadioButtonMale is not Selected");
	}
	@Test
	public void groupRadioButtonDemo()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement radioButtonFemale = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		radioButtonFemale.click();
		WebElement radioButtonAge19to44 = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		radioButtonAge19to44.click();
		assertTrue(radioButtonFemale.isSelected(),"RadioButtonFemale is not Selected");
		assertTrue(radioButtonAge19to44.isSelected(),"RadioButtonAge19to44 is not Selected");


		
	}

}
