package com.sgtesting.actitime.tests2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginLogout2 {

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
	public static void Login(WebDriver oBrowser)
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
	public static void Logout(WebDriver oBrowser)
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

