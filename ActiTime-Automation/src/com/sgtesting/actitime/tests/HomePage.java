package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;


public class HomePage extends Initialization {

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
	public static void minimizeFlyOutWindow()
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
