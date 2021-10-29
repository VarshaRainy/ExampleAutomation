package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ModifyCustomerPOM
{
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Automation\\Web_Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
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
	}
	
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginBtn().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void CreateCustomer()
	{
		try
		{
			oPage.getTaskimgBtn().click();
			Thread.sleep(3000);
			oPage.getAddnewBtn().click();
			Thread.sleep(3000);
			oPage.getAddnewcustomerBtn().click();
			Thread.sleep(3000);
			oPage.getEntercustomername().sendKeys("Varsha");
			Thread.sleep(4000);
			oPage.getEntercustomerdescription().sendKeys("Java");
			Thread.sleep(4000);
			oPage.getcreatecustomerbtn().click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Modify()
	{
		try
		{
			oPage.geteditcustomerbtn().click();
			Thread.sleep(3000);
			oPage.getmodifydescription().sendKeys(" Programming");
			Thread.sleep(4000);
			oPage.getclosebtn().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deletecustomer()
	{
		try
		{
			oPage.geteditcustomerbtn().click();
			Thread.sleep(3000);
			oPage.getactionbtn().click();
			Thread.sleep(3000);
			oPage.getdltcustomerbtn().click();
			Thread.sleep(3000);
			oPage.getdltpermanentlybtn().click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
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
	}
}
public class Test4 {

	public static void main(String[] args) {
		ModifyCustomerPOM.launchBrowser();
		ModifyCustomerPOM.navigate();
		ModifyCustomerPOM.login();
		ModifyCustomerPOM.minimizeFlyOutWindow();
		ModifyCustomerPOM.CreateCustomer();
		ModifyCustomerPOM.Modify();
		ModifyCustomerPOM.deletecustomer();
		ModifyCustomerPOM.logout();
		ModifyCustomerPOM.closeApplication();

	}
}

