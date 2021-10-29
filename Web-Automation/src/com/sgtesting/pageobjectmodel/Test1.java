package com.sgtesting.pageobjectmodel;


	import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	class CreateUserPOM
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
				Thread.sleep(3000);
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
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void createuser()
		{
			try
			{
				oPage.getUserImg().click();
				Thread.sleep(3000);
				oPage.getaddUser().click();
				Thread.sleep(3000);
				oPage.getfirstName().sendKeys("demo");
				oPage.getlastName().sendKeys("User1");
				oPage.getemail().sendKeys("demo@gmail.com");
				oPage.getuserName().sendKeys("demoUser1");
				oPage.getpassword().sendKeys("Welcome1");
				oPage.getretypepassword().sendKeys("Welcome1");
				Thread.sleep(3000);
				oPage.getCreateUser().click();
				Thread.sleep(3000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void deleteuser()
		{
			try
			{
				oPage.geteditUser().click();
				Thread.sleep(3000);
				oPage.getDeleteBtn().click();
				Thread.sleep(3000);
				Alert oAlert=oBrowser.switchTo().alert();
				oAlert.accept();
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
				Thread.sleep(3000);
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
	public class Test1 {

		public static void main(String[] args) {
			CreateUserPOM.launchBrowser();
			CreateUserPOM.navigate();
			CreateUserPOM.login();
			CreateUserPOM.minimizeFlyOutWindow();
			CreateUserPOM.createuser();
			CreateUserPOM.deleteuser();
			CreateUserPOM.logout();
			CreateUserPOM.closeApplication();

		}
	}

