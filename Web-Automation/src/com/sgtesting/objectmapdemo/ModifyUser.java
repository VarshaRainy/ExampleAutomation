package com.sgtesting.objectmapdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ModifyUserTest
{
	public static String filename="D:\\Selenium\\Automation\\Web_Automation\\ObjectMap\\objectmap.properties";
	public static ObjectMap objmap=new ObjectMap(filename);
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Automation\\Web_Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Launch Browser Successful");
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Navigate Browser Successful");
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("admin");
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("manager");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Login Successful");
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("homepageflyoutwin")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Minimize FlyOut Window Successful");
	}
	
	
	
	static void createUser()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("userimage")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("adduserbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("firstnametextfield")).sendKeys("demo");
			oBrowser.findElement(objmap.getLocator("lastnametextfield")).sendKeys("User1");
			oBrowser.findElement(objmap.getLocator("emailtextfield")).sendKeys("demo@gmail.com");
			oBrowser.findElement(objmap.getLocator("usernametextfield")).sendKeys("demoUser1");
			oBrowser.findElement(objmap.getLocator("passwordtextfield")).sendKeys("Welcome1");
			oBrowser.findElement(objmap.getLocator("retypepasswordtextfield")).sendKeys("Welcome1");
			oBrowser.findElement(objmap.getLocator("createuserbutton")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Create User Successful");
	}
	static void ModifyUser()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("existinguserlink")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("lastnametextfield")).sendKeys("Modified");
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("savechanges")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Delete User Successful");
	}
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("existinguserlink")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("deleteexistinguser")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Delete User Successful");
	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("homepagelogout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Logout Successful");
	}
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Close Application Successful");
	}
}
public class ModifyUser {

	public static void main(String[] args) {
		
		ModifyUserTest.launchBrowser();
		ModifyUserTest.navigate();
		ModifyUserTest.login();
		ModifyUserTest.minimizeFlyOutWindow();
		ModifyUserTest.createUser();
		ModifyUserTest.ModifyUser();
		ModifyUserTest.deleteUser();
		ModifyUserTest.logout();
		ModifyUserTest.closeApplication();
	}
}
