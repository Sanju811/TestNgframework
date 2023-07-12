package com.obsqura.TestNGframework;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Assertions extends Base
{
	@Test
		public void verifySingleInputFieldWhenEnterDataOnTextFieldAndClickOnShowMessageButton()
		{
			String textFieldInput = "Hello";
			String expectedMessage = "Your Message : "+textFieldInput;
			WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
			singleInputField.sendKeys(textFieldInput);
			WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
			showMessage.click();
			WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		    String yourMessageText = yourMessage.getText();
		    assertEquals(expectedMessage,yourMessageText,"Your message is not" +expectedMessage );
		
		}
	@Test
	public void verifyTwoInputFieldWhenEnterDataOnTextFieldAndClickOnGetTotalButton()
	{
		int textFieldInputA = 1;
		int textFieldInputB = 2;
		String expectedTotal = "Total A + B : "+(textFieldInputA+textFieldInputB);
		WebElement enterValueA = driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValueA.sendKeys(String.valueOf(textFieldInputA));
		WebElement enterValueB = driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValueB.sendKeys(String.valueOf(textFieldInputB));
		WebElement getTotal = driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotal.click();
		WebElement totalAB = driver.findElement(By.xpath("//div[@id='message-two']"));
    	String SumOfAB = totalAB.getText();
    	assertEquals(expectedTotal,SumOfAB," Total is not" +expectedTotal);
		
	}
	@Test
	public void verifyStyleOfShowMessageButton()
	{
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		SoftAssert softAssert = new SoftAssert();

		String expectedBackGroundColor = "rgba(0, 123, 255, 1)";
		String backGroundColorOfShowMessageButton = showMessage.getCssValue("background-color");

		String expectedBorderColor = "rgb(0, 123, 255)";
	    String borderColorOfShowMessageButton = showMessage.getCssValue("border-color");

	    String expectedfontColor = "rgba(255, 255, 255, 1)";
	    String fontColorOfShowMessageButton = showMessage.getCssValue("color");
	    
    	String expectedfontWeight = "400";
	    String fontWeightOfShowMessageButton = showMessage.getCssValue("font-weight");
    	
	    softAssert.assertEquals(expectedBackGroundColor,backGroundColorOfShowMessageButton," BackGround color is not" +expectedBackGroundColor);
    	softAssert.assertEquals(expectedBorderColor,borderColorOfShowMessageButton," Border color is not" +expectedBorderColor);
    	softAssert.assertEquals(expectedfontColor,fontColorOfShowMessageButton," font color is not" +expectedfontColor);
    	softAssert.assertEquals(expectedfontWeight,fontWeightOfShowMessageButton," font Weight is not" +expectedfontWeight);
    	softAssert.assertAll();
	}

	@Test
	public void assertTrueSample()
	{
		String expectedValue = "ABC";
		String actualValue = "ABC";
		boolean flag = false;
		if(expectedValue.equals(actualValue))
		{
			flag = true;
		}
		assertTrue(flag,"expected and actualvalue are not same");
		
	}
	@Test
	public void verifyShowMessageButtonIsDisplayedUsingAssertTrue()
	{
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
	    boolean isShowMessageButtonDisplayed = showMessage.isDisplayed();
	    assertTrue(isShowMessageButtonDisplayed,"ShowMessage Button not displayed");
	}
	@Test
	public void verifyGetTotalButtonIsEnabledUsingAssertTrue()
	{
	    WebElement getTotal = driver.findElement(By.xpath("//button[@id='button-two']"));
	    boolean isGetTotalButtonEnabled = getTotal.isEnabled();
	    assertTrue(isGetTotalButtonEnabled,"GetTotal Button not enabled");
		
	}
	@Test
	public void assertFalseSample()
	{
		boolean flag = false;
		assertFalse(flag, "Flag is true");
		
	}
	@Test
	public void assertNullSample()
	{
		String value = null;
		assertNull(value, "Value is not Null");
	}
	@Test
	public void assertNotNullSample()
	{
		String value = "ABC";
		assertNotNull(value, "Value is Null");
	}
	@Test
	public void softAssert()
	{
		String value1 = "123";
		String value2 = null;
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertNull(value1, "Value is not Null");
		softAssert.assertNotNull(value2, "Value is Null");
		softAssert.assertAll();

	}
	@Test
	public void verifyPageSourceOfObsqura()
	{
		String pageSource = driver.getPageSource();
		assertFalse(pageSource.contains("Amazon"), "PageSource Contains Amazon");
	}
}
