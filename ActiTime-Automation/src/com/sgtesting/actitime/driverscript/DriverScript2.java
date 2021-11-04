package com.sgtesting.actitime.driverscript;
import org.openqa.selenium.WebDriver;
import com.sgtesting.actitime.tests2.Customers2;
import com.sgtesting.actitime.tests2.HomePage2;
import com.sgtesting.actitime.tests2.Initialization2;
import com.sgtesting.actitime.tests2.LoginLogout2;
import com.sgtesting.actitime.tests2.Projects2;
import com.sgtesting.actitime.tests2.Tasks2;
import com.sgtesting.actitime.tests2.Users2;

public class DriverScript2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args)
	{
		//1)LaunchBrowser-->navigate-->login-->createUser-->deleteUser-->logout -->closeApplication
		//Create User Scenario
		oBrowser=Initialization2.LaunchBrowser();
		Initialization2.Navigate(oBrowser);
		LoginLogout2.Login(oBrowser);
		HomePage2.minimizeFlyOutWindow(oBrowser);
		Users2.CreateUser(oBrowser);
		Users2.DeleteUser(oBrowser);
		LoginLogout2.Logout(oBrowser);
		Initialization2.CloseApplication(oBrowser);
		
		
		//2)LaunchBrowser-->navigate-->login-->createUser-->modifyUser-->deleteUser-->logout -->closeApplication
		//ModifyUser Scenario
		oBrowser=Initialization2.LaunchBrowser();
		Initialization2.Navigate(oBrowser);
		LoginLogout2.Login(oBrowser);
		HomePage2.minimizeFlyOutWindow(oBrowser);
		Users2.CreateUser(oBrowser);
		Users2.ModifyUser(oBrowser);
		Users2.DeleteUser(oBrowser);
		LoginLogout2.Logout(oBrowser);
		Initialization2.CloseApplication(oBrowser);
		
		//3)LaunchBrowser-->navigate-->login-->createCustomer-->deleteCustomer-->logout -->closeApplication
		//Create Customer Scenario
		oBrowser=Initialization2.LaunchBrowser();
		Initialization2.Navigate(oBrowser);
		LoginLogout2.Login(oBrowser);
		HomePage2.minimizeFlyOutWindow(oBrowser);
		Customers2.CreateCustomer(oBrowser);
		Customers2.DeleteCustomer(oBrowser);
		LoginLogout2.Logout(oBrowser);
		Initialization2.CloseApplication(oBrowser);		
				
		//4)LaunchBrowser-->navigate-->login-->createCustomer-->modifyCustomer-->deleteCustomer-->logout -->closeApplication
		//Modify Customer Scenario
		oBrowser=Initialization2.LaunchBrowser();
		Initialization2.Navigate(oBrowser);
		LoginLogout2.Login(oBrowser);
		HomePage2.minimizeFlyOutWindow(oBrowser);
		Customers2.CreateCustomer(oBrowser);
		Customers2.ModifyCustomer(oBrowser);
		Customers2.DeleteCustomer(oBrowser);
		LoginLogout2.Logout(oBrowser);
		Initialization2.CloseApplication(oBrowser);	
				
		//5)LaunchBrowser-->navigate-->login-->createCustomer-->CreateProject-->DeleteProject-->deleteCustomer-->logout -->closeApplication
		//Create Project Scenario
		oBrowser=Initialization2.LaunchBrowser();
		Initialization2.Navigate(oBrowser);
		LoginLogout2.Login(oBrowser);
		HomePage2.minimizeFlyOutWindow(oBrowser);
		Customers2.CreateCustomer(oBrowser);
		Projects2.CreateProject(oBrowser);
		Projects2.DeleteProject(oBrowser);
		Customers2.DeleteCustomer(oBrowser);
		LoginLogout2.Logout(oBrowser);
		Initialization2.CloseApplication(oBrowser);	
				
		//6)LaunchBrowser-->navigate-->login-->createCustomer-->CreateProject-->modifyProject -->DeleteProject-->deleteCustomer-->logout -->closeApplication
		//Modify Project Scenario
		oBrowser=Initialization2.LaunchBrowser();
		Initialization2.Navigate(oBrowser);
		LoginLogout2.Login(oBrowser);
		HomePage2.minimizeFlyOutWindow(oBrowser);
		Customers2.CreateCustomer(oBrowser);
		Projects2.CreateProject(oBrowser);
		Projects2.ModifyProject(oBrowser);
		Projects2.DeleteProject(oBrowser);
		Customers2.DeleteCustomer(oBrowser);
		LoginLogout2.Logout(oBrowser);
		Initialization2.CloseApplication(oBrowser);		
				
		//launchBrowser-->navigate-->login-->createCustomer-->CreateProject-->Create Tasks -->Delete Tasks -->DeleteProject-->deleteCustomer-->logout -->closeApplication
		//Create Task Scenario
		oBrowser=Initialization2.LaunchBrowser();
		Initialization2.Navigate(oBrowser);
		LoginLogout2.Login(oBrowser);
		HomePage2.minimizeFlyOutWindow(oBrowser);
		Customers2.CreateCustomer(oBrowser);
		Projects2.CreateProject(oBrowser);
		Tasks2.CreateTask(oBrowser);
		Tasks2.DeleteTask(oBrowser);
		Projects2.DeleteProject(oBrowser);
		Customers2.DeleteCustomer(oBrowser);
		LoginLogout2.Logout(oBrowser);
		Initialization2.CloseApplication(oBrowser);		
		
		
	}

}

