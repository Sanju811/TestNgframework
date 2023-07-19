package com.obsqura.TestNGframework;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PopUp extends Base
{
	@Test
	public void popUpDemo()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
		WebElement LikeUsOnFaceBook = driver.findElement(By.xpath("//a[@title='Follow @obsqurazone on Facebook']"));
		LikeUsOnFaceBook.click();
		String MainWindow=driver.getWindowHandle();		
		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
                    driver.findElement(By.xpath("(//div[contains(@class,'x17zwfj4')])[3]")).click();
			driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);

	}

}
