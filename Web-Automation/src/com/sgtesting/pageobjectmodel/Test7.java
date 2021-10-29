package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CreateTaskPOM
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
			Thread.sleep(2000);
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
			Thread.sleep(2000);
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
			Thread.sleep(2000);
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
			Thread.sleep(2000);
			oPage.getAddnewBtn().click();
			Thread.sleep(2000);
			oPage.getAddnewcustomerBtn().click();
			Thread.sleep(2000);
			oPage.getEntercustomername().sendKeys("Varsha");
			Thread.sleep(2000);
			oPage.getEntercustomerdescription().sendKeys("Java");
			Thread.sleep(2000);
			oPage.getcreatecustomerbtn().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void CreateProject()
	{
		try
		{
			oPage.getAddbtn().click();
			Thread.sleep(2000);
			oPage.getAddprojectbtn().click();
			Thread.sleep(2000);
			oPage.getEnterProjectname().sendKeys("Prasad");
			Thread.sleep(2000);
			oPage.getAddProjectDescription().sendKeys("Java Program");
			Thread.sleep(2000);
			oPage.getCreateprojectbtn().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void CreateTask()
	{
		try
		{
			oPage.getAddNewTaskbtn().click();
			Thread.sleep(2000);
			oPage.getCreateNewTasksbtn().click();
			Thread.sleep(2000);
			oPage.getEntertaskname1().sendKeys("A");
			Thread.sleep(2000);
			oPage.getEntertaskname2().sendKeys("B");
			Thread.sleep(2000);
			oPage.getCreateTasksbtn().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void DeleteTask()
	{
		try
		{
			oPage.getEditTasksAbtn().click();
			Thread.sleep(2000);
			oPage.getActionTasksAbtn().click();
			Thread.sleep(2000);
			oPage.getDltTasksAbtn().click();
			Thread.sleep(2000);
			oPage.getDltpermannentlyTasksAbtn().click();
			Thread.sleep(2000);
			oPage.getEditTasksBbtn().click();
			Thread.sleep(2000);
			oPage.getActionTasksBbtn().click();
			Thread.sleep(2000);
			oPage.getDltTasksBbtn().click();
			Thread.sleep(2000);
			oPage.getDltpermannentlyTasksBbtn().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void DeleteProject()
	{
		try
		{
			oPage.getEditprojectbtn().click();
			Thread.sleep(2000);
			oPage.getActionsprojectbtn().click();
			Thread.sleep(2000);
			oPage.getProjectdltbtn().click();
			Thread.sleep(2000);
			oPage.getProjectdltpermanentlybtn().click();
			Thread.sleep(2000);
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
			Thread.sleep(2000);
			oPage.getactionbtn().click();
			Thread.sleep(2000);
			oPage.getdltcustomerbtn().click();
			Thread.sleep(2000);
			oPage.getdltpermanentlybtn().click();
			Thread.sleep(2000);
			
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
			Thread.sleep(2000);
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
public class Test7 {

	public static void main(String[] args) {
		CreateTaskPOM.launchBrowser();
		CreateTaskPOM.navigate();
		CreateTaskPOM.login();
		CreateTaskPOM.minimizeFlyOutWindow();
		CreateTaskPOM.CreateCustomer();
		CreateTaskPOM.CreateProject();
		CreateTaskPOM.CreateTask();
		CreateTaskPOM.DeleteTask();
		CreateTaskPOM.DeleteProject();
		CreateTaskPOM.deletecustomer();
		CreateTaskPOM.logout();
		CreateTaskPOM.closeApplication();

	}
}

