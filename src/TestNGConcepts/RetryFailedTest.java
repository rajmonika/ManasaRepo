package TestNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGConcepts.TestNGListeners.class)
public class RetryFailedTest {
	
	@Test (retryAnalyzer = TestNGConcepts.RetryAnalyzer.class)
	public void test1()
	{
		System.out.println("This is Test Case 1");
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("This is Test Case 2");
	}

}
