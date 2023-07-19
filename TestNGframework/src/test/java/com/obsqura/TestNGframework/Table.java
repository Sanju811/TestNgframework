package com.obsqura.TestNGframework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Table extends Base
{
	@Test
	public void table()
	{
		List <String> nameList = new ArrayList<String>();
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement tableLocate = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		List <WebElement> tableHeaders = tableLocate.findElements(By.xpath("//th[contains(@class,'sorting_disabled')]"));
		int headerCount = tableHeaders.size();
		for(WebElement nameOfTableHeader :tableHeaders)
		{
			String tableHeaderText = nameOfTableHeader.getText();
		}
		
		List <WebElement> rows = tableLocate.findElements(By.xpath("//tr[@class]"));
		int rowSize = rows.size();
		
		WebElement findName = driver.findElement(By.xpath("//td[text()='Ashton Cox']"));
		boolean nameFind = findName.isDisplayed();
		
		for(WebElement nameOfRow : rows)
		{
			String tableRowValueText = nameOfRow.getText();
			nameList.add(tableRowValueText);

		}
		assertTrue(nameFind,"Ashton Cox is not in the table");
		assertEquals(headerCount,6,"Header count is different");
		assertEquals(rowSize,10,"Row size is ifferent");
	}

}
