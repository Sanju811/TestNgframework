package com.obsqura.TestNGframework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommands extends Base
{
	@Test
	public void webElementCommand()
	{
		WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputField.sendKeys("Hello"); //sendKeys
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessage.click(); //click
		WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
	    String yourMessageText = yourMessage.getText(); //getText
	    String showMessageText = showMessage.getText();
	    
	    String yourMessageTag = yourMessage.getTagName(); //getTagName
	    
	    String showMessageClassname = showMessage.getAttribute("class"); //getAttribute
	    String showMessageId = showMessage.getAttribute("id");
	    String tagName = showMessage.getTagName();
	    
	    
	    singleInputField.clear(); //clear
	    boolean isShowMessageButtonDisplayed = showMessage.isDisplayed(); //isDisplayed
	    boolean isShowMessageButtonEnabled = showMessage.isEnabled(); //isEnabled
	    
	    String backGroundColorOfShowMessageButton = showMessage.getCssValue("background-color"); //getCssValue
	    String borderColorOfShowMessageButton = showMessage.getCssValue("border-color");
	    String fontColorOfShowMessageButton = showMessage.getCssValue("color");
	    String fontWeightOfShowMessageButton = showMessage.getCssValue("font-weight");
	    
	    int showMessageXaxis = showMessage.getLocation().getX(); //getLocation
	    int showMessageYaxis = showMessage.getLocation().getY();
	    int singleInputFieldXaxis = singleInputField.getLocation().getX();
	    int singleInputFieldYaxis = singleInputField.getLocation().getY();
	    assertTrue(showMessageYaxis>singleInputFieldYaxis, "ShowMessage button is not aligned below SingleInputField" );

	    
	    int showMessageButtonHeight = showMessage.getSize().getHeight(); //getSize
	    int showMessageButtonWidth = showMessage.getSize().getWidth();
	    int showMessageButtonExpectedHeight = 38;
	    int showMessageButtonExpectedWidth = 136;
	    assertEquals(showMessageButtonHeight, showMessageButtonExpectedHeight, "Show message button Height is not" +showMessageButtonExpectedHeight);
	    assertEquals(showMessageButtonWidth, showMessageButtonExpectedWidth, "Show message button Width is not" +showMessageButtonExpectedWidth);  
	    
	}
	@Test
	public void webElementTwoInputField()
	{
		WebElement enterValueA = driver.findElement(By.xpath("//input[@id='value-a']"));
	    enterValueA.sendKeys("1");
	    WebElement enterValueB = driver.findElement(By.xpath("//input[@id='value-b']"));
	    enterValueB.sendKeys("2");
	    WebElement getTotal = driver.findElement(By.xpath("//button[@id='button-two']"));
	    getTotal.click();
	    WebElement totalAB = driver.findElement(By.xpath("//div[@id='message-two']"));
	    String SumOfAB = totalAB.getText();
	    
	    String getTotalText = getTotal.getText();
	    String getTotalTagName = getTotal.getTagName();
	    String getTotalClassName = getTotal.getAttribute("class");
	    String getTotalId = getTotal.getAttribute("id");
	    String fontColorOfGetTotalButton = getTotal.getCssValue("color");
	    String borderColorOfGetTotalButton = getTotal.getCssValue("border-color");
	    String backGroundColorOfGetTotalButton = getTotal.getCssValue("background-color");
	    String fontWeightOfGetTotalButton = getTotal.getCssValue("font-weight");
	    
	    int enterValueAXaxis = enterValueA.getLocation().getX();
	    int enterValueAYaxis = enterValueA.getLocation().getY();
	    int enterValueBXaxis = enterValueB.getLocation().getX();
	    int enterValueBYaxis = enterValueB.getLocation().getY();
	    assertTrue(enterValueBYaxis>enterValueAYaxis, "EntervalueB is not aligned below EntervalueA");

	}

}
