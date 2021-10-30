package com.sgtesting.tests;

public class ExecuteAutoITDemo {

	public static void main(String[] args) {
		
		executeScript();
	}
	static void executeScript()
	{
		try
		{
			String path="D:\\Selenium\\AutoIT\\FinalScenarioOffileSave.exe";
			Runtime.getRuntime().exec(path);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
