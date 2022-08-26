package project3.project3;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	//1st Test Case in class 
	@Test
	public void carloan()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	//2nd Test case in class
	@Test(groups= {"smoke"})
	public void carloan2()
	{
		System.out.println("bye");
	}

	@AfterTest
	public void after()
	{
		System.out.println("after test");
	}
}
