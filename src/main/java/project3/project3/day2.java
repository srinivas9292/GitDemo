package project3.project3;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	//1st Test Case in class 
	@Test(groups={"smoke"})
	public void demo()
	{
		System.out.println("ok");
	}
	
	@BeforeTest
	public void before()
	{
		System.out.println("i will execute first");
	
	}
	@Test
	public void after()
	{
		System.out.println("i will execute After");
	
	}
	
}

