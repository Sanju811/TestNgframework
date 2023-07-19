package com.obsqura.TestNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alerts extends Base
{
	@Test
	public void alertsDemo()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickMeButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		clickMeButton.click();
		String alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}
	@Test
	public void confirmDemo()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickMeConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		clickMeConfirm.click();
		String confirmMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();	
	}
	@Test
	public void promptDemo() 
	{
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickMePrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		clickMePrompt.click();
		String promptBoxMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Sanju");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		WebElement promptText = driver.findElement(By.xpath("//p[@id='prompt-demo']"));
		promptText.getText();
		

		
	}
	

}
