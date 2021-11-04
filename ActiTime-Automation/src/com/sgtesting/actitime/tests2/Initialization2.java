package com.sgtesting.actitime.tests2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialization2 {

	public static WebDriver oBrowser=null;
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
	public static WebDriver LaunchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			System.out.println("launchBrowser Successful");
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
		return oBrowser;
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
	public static void Navigate(WebDriver oBrowser)
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
			System.out.println("navigate Successful");
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
	public static void CloseApplication(WebDriver oBrowser)
	{
		try
		{
			oBrowser.close();
			System.out.println("closeApplication Successful");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}




