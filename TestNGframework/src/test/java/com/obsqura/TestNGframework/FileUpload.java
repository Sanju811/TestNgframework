package com.obsqura.TestNGframework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpload extends Base
{
	@Test
	public void fileUploadUsingAutoIt() throws IOException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdfFile = driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		selectPdfFile.click();
		Runtime.getRuntime().exec("C:\\\\Users\\\\HP\\\\OneDrive\\\\Documents\\\\FileUploader.exe");
		
	}
	@Test
	public void fileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		uploadElement.sendKeys("C:\\\\Users\\\\HP\\\\OneDrive\\\\Documents\\\\FileUploader.exe");	
	}
	@Test
	public void fileUploadUsingRobotClass() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdfFile = driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		selectPdfFile.click();
		StringSelection ss = new StringSelection("C:\\Users\\HP\\OneDrive\\Desktop\\AUTOMATION TESTING.pdf");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

	     //imitate mouse events like ENTER, CTRL+C, CTRL+V
	     Robot robot = new Robot();
	     robot.delay(250);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
