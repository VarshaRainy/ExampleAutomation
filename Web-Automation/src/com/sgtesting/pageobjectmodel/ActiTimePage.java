package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
		
	}

	//User Name Text field in Login Page
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	//Password text field in Login Page
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login Button in Login Page
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLoginBtn;
	public WebElement getLoginBtn()
	{
		return oLoginBtn;
	}
	
	//FlyoutWindow in Home Page
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Logout link in Home Page
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	
	//Create User Field
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement userImg;
	public WebElement getUserImg()
	{
		return userImg;
	}
	
		//Add User Field
		@FindBy(xpath="//div[text()='Add User']")
		private WebElement addUser;
		public WebElement getaddUser()
		{
			return addUser;
		}
	
		//Firstname Field
		@FindBy(name="firstName")
		private WebElement firstName;
		public WebElement getfirstName()
		{
			return firstName;
		}
		//Lastname Field
	
		@FindBy(name="lastName")
		private WebElement lastName;
		public WebElement getlastName()
		{
			return lastName;
		}
		
		//Email Field
		@FindBy(name="email")
		private WebElement email;
		public WebElement getemail()
		{
			return email;
		}
		
		//
		@FindBy(name="username")
		private WebElement userName;
		public WebElement getuserName()
		{
			return userName;
		}
		//Password Field
		@FindBy(name="password")
		private WebElement password;
		public WebElement getpassword()
		{
			return password;
		}
		//Retype Password Field
		@FindBy(name="passwordCopy")
		private WebElement retypepassword;
		public WebElement getretypepassword()
		{
			return retypepassword;
		}
		
		//Create User btn
		@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div")
		private WebElement CreateUser;
		public WebElement getCreateUser()
		{
			return CreateUser;
		}
	
	//Modify User field
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")	
		private WebElement editUser;
		public WebElement geteditUser()
		{
			return editUser;
		}
		//Modify SaveChangesBtn field
		@FindBy(xpath="//span[text()='Save Changes']")
		private WebElement SaveChangesBtn;
		public WebElement getSaveChangesBtn()
		{
			return SaveChangesBtn;
		}
		
	//Delete User Field
		
		//Delete Btn
		@FindBy(id="userDataLightBox_deleteBtn")
		private WebElement DeleteBtn;
		public WebElement getDeleteBtn()
		{
			return DeleteBtn;
		}
		
	//Create Customer
		
		//tasks img field
		@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr/td[3]/a")
		private WebElement TaskimgBtn;
		public WebElement getTaskimgBtn()
		{
			return TaskimgBtn;
		}
		//Add new btn
		@FindBy(xpath="//div[text()='Add New']")
		private WebElement AddnewBtn;
		public WebElement getAddnewBtn()
		{
			return AddnewBtn;
		}
		//New Customer btn
		@FindBy(xpath="//div[text()='+ New Customer']")
		private WebElement AddnewcustomerBtn;
		public WebElement getAddnewcustomerBtn()
		{
			return AddnewcustomerBtn;
		}
		//Enter customer name field
		@FindBy(id="customerLightBox_nameField")
		private WebElement Entercustomername;
		public WebElement getEntercustomername()
		{
			return Entercustomername;
		}
		//Add Customer Description
		@FindBy(id="customerLightBox_descriptionField")
		private WebElement Entercustomerdescription;
		public WebElement getEntercustomerdescription()
		{
			return Entercustomerdescription;
		}
		//Create Customer btn
		@FindBy(xpath="//span[text()='Create Customer']")
		private WebElement createcustomerbtn;
		public WebElement getcreatecustomerbtn()
		{
			return createcustomerbtn;
		}
		
	
	//Delete Customer
		//edit btn field
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement editcustomerbtn;
		public WebElement geteditcustomerbtn()
		{
			return editcustomerbtn;
		}
		//Actions btn field
		@FindBy(xpath="//div[text()='ACTIONS']")
		private WebElement actionbtn;
		public WebElement getactionbtn()
		{
			return actionbtn;
		}
		//delete btn field
		@FindBy(xpath="//div[text()='Delete']")
		private WebElement dltcustomerbtn;
		public WebElement getdltcustomerbtn()
		{
			return dltcustomerbtn;
		}
		//delete permanently btn
		@FindBy(id="customerPanel_deleteConfirm_submitTitle")
		private WebElement dltpermanentlybtn;
		public WebElement getdltpermanentlybtn()
		{
			return dltpermanentlybtn;
		}
		
	//Modify Customer
		//modify desciption
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
		private WebElement modifydescription;
		public WebElement getmodifydescription()
		{
			return modifydescription;
		}
		//closeButton
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
		private WebElement closebtn;
		public WebElement getclosebtn()
		{
			return closebtn;
		}
		
	//Create Project
		
		//Add new btn field
		@FindBy(xpath="//div[text()='Add New']")
		private WebElement Addbtn;
		public WebElement getAddbtn()
		{
			return Addbtn;
		}
		//Add Project btn
		@FindBy(xpath="//div[text()='+ New Project']")
		private WebElement Addprojectbtn;
		public WebElement getAddprojectbtn()
		{
			return Addprojectbtn;
		}
		//Enter Project name field
		@FindBy(id="projectPopup_projectNameField")
		private WebElement EnterProjectname;
		public WebElement getEnterProjectname()
		{
			return EnterProjectname;
		}
		//Add Project Description
		@FindBy(name="projectDescriptionField")
		private WebElement AddProjectDescription;
		public WebElement getAddProjectDescription()
		{
			return AddProjectDescription;
		}
		//Create Project field
		@FindBy(xpath="//span[text()='Create Project']")
		private WebElement Createprojectbtn;
		public WebElement getCreateprojectbtn()
		{
			return Createprojectbtn;
		}
		
	//Delete Project Field
		//edit project field
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement Editprojectbtn;
		public WebElement getEditprojectbtn()
		{
			return Editprojectbtn;
		}
		//Project Actions btn
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
		private WebElement Actionsprojectbtn;
		public WebElement getActionsprojectbtn()
		{
			return Actionsprojectbtn;
		}
		//Project dlt btn
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
		private WebElement Projectdltbtn;
		public WebElement getProjectdltbtn()
		{
			return Projectdltbtn;
		}
		//Project Dlt Permanently btn
		@FindBy(id="projectPanel_deleteConfirm_submitTitle")
		private WebElement Projectdltpermanentlybtn;
		public WebElement getProjectdltpermanentlybtn()
		{
			return Projectdltpermanentlybtn;
		}
		
		
	//Modify Project
		//modify project description field
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
		private WebElement modifyprojectdescription;
		public WebElement getmodifyprojectdescription()
		{
			return modifyprojectdescription;
		}
		//close Project modified btn
		@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[1]")
		private WebElement Projectclosebtn;
		public WebElement getProjectclosebtn()
		{
			return Projectclosebtn;
		}
		
		
	//Create Task Field
		//Add new Task btn
		@FindBy(xpath="//div[text()='Add New Task']")
		private WebElement AddNewTaskbtn;
		public WebElement getAddNewTaskbtn()
		{
			return AddNewTaskbtn;
		}
		//Create new Task btn
		@FindBy(xpath="//div[text()='Create new tasks']")
		private WebElement CreateNewTasksbtn;
		public WebElement getCreateNewTasksbtn()
		{
			return CreateNewTasksbtn;
		}
		//Enter task name
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
		private WebElement Entertaskname1;
		public WebElement getEntertaskname1()
		{
			return Entertaskname1;
		}
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")
		private WebElement Entertaskname2;
		public WebElement getEntertaskname2()
		{
			return Entertaskname2;
		}
		//Create Tasks btn
		@FindBy(xpath="//span[text()='Create Tasks']")
		private WebElement CreateTasksbtn;
		public WebElement getCreateTasksbtn()
		{
			return CreateTasksbtn;
		}
		
		
	//Delete Task
		//edit user1 field
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[2]/div/div[2]")
		private WebElement EditTasksAbtn;
		public WebElement getEditTasksAbtn()
		{
			return EditTasksAbtn;
		}
		//Actions btn
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
		private WebElement ActionTasksAbtn;
		public WebElement getActionTasksAbtn()
		{
			return ActionTasksAbtn;
		}
		//Delete btn
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
		private WebElement DltTasksAbtn;
		public WebElement getDltTasksAbtn()
		{
			return DltTasksAbtn;
		}
		//dlt permanently btn
		@FindBy(id="taskPanel_deleteConfirm_submitTitle")
		private WebElement DltpermannentlyTasksAbtn;
		public WebElement getDltpermannentlyTasksAbtn()
		{
			return DltpermannentlyTasksAbtn;
		}
		//edit user2 field
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[2]/div/div[2]")
				private WebElement EditTasksBbtn;
				public WebElement getEditTasksBbtn()
				{
					return EditTasksBbtn;
				}
				//Actions btn
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
				private WebElement ActionTasksBbtn;
				public WebElement getActionTasksBbtn()
				{
					return ActionTasksBbtn;
				}
				//Delete btn
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
				private WebElement DltTasksBbtn;
				public WebElement getDltTasksBbtn()
				{
					return DltTasksBbtn;
				}
				//dlt permanently btn
				@FindBy(id="taskPanel_deleteConfirm_submitTitle")
				private WebElement DltpermannentlyTasksBbtn;
				public WebElement getDltpermannentlyTasksBbtn()
				{
					return DltpermannentlyTasksBbtn;
				}
}
	
	


