package com.obsqura.TestNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends Base
{
	@Test
	public void actionClassDemo()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement draggableN01 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(draggableN01).click();
		actions.moveToElement(draggableN01).build().perform(); 
		actions.doubleClick(draggableN01).perform();
		actions.contextClick(draggableN01).perform();
		WebElement destination = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		actions.dragAndDrop(draggableN01, destination).build().perform();
	}

}
