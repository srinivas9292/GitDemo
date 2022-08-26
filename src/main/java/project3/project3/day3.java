package project3.project3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@Parameters({"URL"})		//from testng3 xml file
	@Test
	public void webloginhomeloan(String urlname)
	{
		//selenium
		System.out.println("selenium");
		System.out.println(urlname);
	}
	
	@Test(timeOut=4000)
	public void mobilesuigninhomeloan()
	{
		//Appium
		System.out.println("sign");
	}
	@Test(groups= {"smoke"})
	public void mobilesignedhomeloan()
	{
		//Appium
		System.out.println("sign");
	}
	@Test(enabled=false)
	public void mobilesignouthomeloan()
	{
		//Appium
		System.out.println("signout");
	}
	
	@Test(dependsOnMethods= {"webloginhomeloan"})
	public void loginAPIhomeloan()
	{
		//Rest API Appium
		System.out.println("API");
	}
	@BeforeSuite
	public void bsuit()
	{
		System.out.println("i will execute first as suit");
	
	}
	@AfterSuite
	public void Asuit()
	{
		System.out.println("i will execute last as suit");
	
	}
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("i will execute before every method");
	}
	@AfterMethod
	public void aftereevery()
	{
		System.out.println("i will execute after every method");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("i will execute before class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("i will execute after class");
		
	}
	@Test(dataProvider="getData")
	public void MobilesignoutcarLoan(String username,String password)
	{
		//Appium
		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combiantion - username password - good credit history= row
		//2nd - username password  - no crdit history
		// 3rd - fraudelent credit history
		Object[][] data= new Object[3][2];
		//1st set 
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//couloumns in the row are nothing but values for that particualar combination(row)
		//2nd set
		data[1][0]= "secondsetusername";
		data[1][1]= "secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
	}
}
