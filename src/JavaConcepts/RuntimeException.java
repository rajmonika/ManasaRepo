package JavaConcepts;

public class RuntimeException {

	public static void main(String[] args) {
		
		int a = 7;
		int b;
		
		try 
		{
		b = a/0;
		System.out.println("Value of b: "+b);
		}
		catch(ArithmeticException ae)
		{		
		System.out.println(ae.getMessage());
		System.out.println("Program execution completed");
		}

	}

}
