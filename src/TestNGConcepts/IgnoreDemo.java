package TestNGConcepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreDemo {
	
	@Test
	public void test1()
	{
		System.out.println("This is test 1");
	}
	
	@Ignore
	@Test 
	public void test2()
	{
		System.out.println("This is test 2");
	}

	@Test 
	public void test3()
	{
		System.out.println("This is test 3");
	}

	@Ignore
	@Test 
	public void test4()
	{
		System.out.println("This is test 4");
	}

}
