package com.sgtesting.actitime.tests2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage2 {

	/**
		 * TestCase ID:
		 * Module Name:
		 * Created By:
		 * Reviewed By:
		 * Modified By:
		 * Parameters:
		 * Return Value:
		 * Purpose:
		 * Description:
		 */
	public static void minimizeFlyOutWindow(WebDriver oBrowser)
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			System.out.println("minimizeFlyOutWindow Successful");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

