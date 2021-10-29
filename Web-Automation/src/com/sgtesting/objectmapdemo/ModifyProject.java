package com.sgtesting.objectmapdemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ModifyProjectTest
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
	static void CreateCustomer()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("Tasksbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("Addbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("Newcustomerbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("CustomerName")).sendKeys("Varsha");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("AddCustomerdescription")).sendKeys("Java");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("CreateCustomerbtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Create Customer Successful");
	}
	static void createProject()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("addbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("NewProject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("EnterProjectName")).sendKeys("Prasad");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("AddProjectDescription")).sendKeys("Java");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("CreateProject")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Create Project Successful");
	}
	static void ModifyProject()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("editbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("modifyprojectdescription")).sendKeys("Programming");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("Projectclosebtn")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Modify Project Successful");
	}
	static void deleteproject()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("editbtn")).click();
			Thread.sleep(2000);	
			oBrowser.findElement(objmap.getLocator("actnbtn")).click();
			Thread.sleep(2000);	
			oBrowser.findElement(objmap.getLocator("dltbtn")).click();
			Thread.sleep(2000);	
			oBrowser.findElement(objmap.getLocator("dltpermanently")).click();
			Thread.sleep(2000);	
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Delete Project Successful");
	}
	static void DeleteCustomer()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("edit")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("Actionbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("Deletebtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("DeletePermanentlybtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Delete Customer Successful");
	}
	
	
	static void logout()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("homepagelogout")).click();
			Thread.sleep(4000);
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
public class ModifyProject {

	public static void main(String[] args) {
		
		ModifyProjectTest.launchBrowser();
		ModifyProjectTest.navigate();
		ModifyProjectTest.login();
		ModifyProjectTest.minimizeFlyOutWindow();
		ModifyProjectTest.CreateCustomer();
		ModifyProjectTest.createProject();
		ModifyProjectTest.ModifyProject();
		ModifyProjectTest.deleteproject();
		ModifyProjectTest.DeleteCustomer();
		ModifyProjectTest.logout();
		ModifyProjectTest.closeApplication();
	}

}

