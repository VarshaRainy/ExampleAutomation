package com.sgtesting.actitime.driverscript;

import com.sgtesting.actitime.tests.Customers;
import com.sgtesting.actitime.tests.HomePage;
import com.sgtesting.actitime.tests.Initialization;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Projects;
import com.sgtesting.actitime.tests.Tasks;
import com.sgtesting.actitime.tests.Users;

public class DriverScript {
	
	public static void main(String[] args)
	{
		//LaunchBrowser-->navigate-->login-->createUser-->deleteUser-->logout -->closeApplication
		//Create User Scenario
		Initialization.LaunchBrowser();
		Initialization.Navigate();
		LoginLogout.Login();
		HomePage.minimizeFlyOutWindow();
		Users.CreateUser();
		Users.DeleteUser();
		LoginLogout.Logout();
		Initialization.CloseApplication();
		
		
		//LaunchBrowser-->navigate-->login-->createUser-->modifyUser-->deleteUser-->logout -->closeApplication
		//ModifyUser Scenario
		Initialization.LaunchBrowser();
		Initialization.Navigate();
		LoginLogout.Login();
		HomePage.minimizeFlyOutWindow();
		Users.CreateUser();
		Users.ModifyUser();
		Users.DeleteUser();
		LoginLogout.Logout();
		Initialization.CloseApplication();
		
		//LaunchBrowser-->navigate-->login-->createCustomer-->deleteCustomer-->logout -->closeApplication
		//Create Customer Scenario
		Initialization.LaunchBrowser();
		Initialization.Navigate();
		LoginLogout.Login();
		HomePage.minimizeFlyOutWindow();
		Customers.CreateCustomer();
		Customers.DeleteCustomer();
		LoginLogout.Logout();
		Initialization.CloseApplication();
		
		//LaunchBrowser-->navigate-->login-->createCustomer-->modifyCustomer-->deleteCustomer-->logout -->closeApplication
		//Modify Customer Scenario
		Initialization.LaunchBrowser();
		Initialization.Navigate();
		LoginLogout.Login();
		HomePage.minimizeFlyOutWindow();
		Customers.CreateCustomer();
		Customers.ModifyCustomer();
		Customers.DeleteCustomer();
		LoginLogout.Logout();
		Initialization.CloseApplication();
		
		//LaunchBrowser-->navigate-->login-->createCustomer-->CreateProject-->DeleteProject-->deleteCustomer-->logout -->closeApplication
		//Create Project Scenario
		Initialization.LaunchBrowser();
		Initialization.Navigate();
		LoginLogout.Login();
		HomePage.minimizeFlyOutWindow();
		Customers.CreateCustomer();
		Projects.CreateProject();
		Projects.DeleteProject();
		Customers.DeleteCustomer();
		LoginLogout.Logout();
		Initialization.CloseApplication();
		
		//LaunchBrowser-->navigate-->login-->createCustomer-->CreateProject-->modifyProject -->DeleteProject-->deleteCustomer-->logout -->closeApplication
		//Modify Project Scenario
		Initialization.LaunchBrowser();
		Initialization.Navigate();
		LoginLogout.Login();
		HomePage.minimizeFlyOutWindow();
		Customers.CreateCustomer();
		Projects.CreateProject();
		Projects.ModifyProject();
		Projects.DeleteProject();
		Customers.DeleteCustomer();
		LoginLogout.Logout();
		Initialization.CloseApplication();
		
		//launchBrowser-->navigate-->login-->createCustomer-->CreateProject-->Create Tasks -->Delete Tasks -->DeleteProject-->deleteCustomer-->logout -->closeApplication
		//Create Task Scenario
		Initialization.LaunchBrowser();
		Initialization.Navigate();
		LoginLogout.Login();
		HomePage.minimizeFlyOutWindow();
		Customers.CreateCustomer();
		Projects.CreateProject();
		Tasks.CreateTask();
		Tasks.DeleteTask();
		Projects.DeleteProject();
		Customers.DeleteCustomer();
		LoginLogout.Logout();
		Initialization.CloseApplication();
		
	}

}
