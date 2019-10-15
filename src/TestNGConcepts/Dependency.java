package TestNGConcepts;

import org.testng.annotations.Test;

public class Dependency {
	
	@Test
	public void Login()
	{
		System.out.println("Login Test");
	//	int i = 5/0;
	}
	
	@Test (dependsOnMethods = "Login")
	public void HomePageTest()
	{
		System.out.println("Home Page Test");
	}
	
	@Test (dependsOnMethods = "HomePageTest")
	public void SearchPageTest()
	{
		System.out.println("Search Page Test");
	}
	
	@Test 
	public void ProductPage()
	{
		System.out.println("Product Page Test");
	}


}
