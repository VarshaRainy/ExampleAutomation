package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;

public class LoginLogout extends Initialization{

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
	public static void Login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			System.out.println("login Successful");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
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
	public static void Logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("logout Successful");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}
