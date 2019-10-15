package JavaConcepts;

public class ExceptionHandling {

	public static void main(String[] args) {

		String s = null;
		
		try {
		System.out.println(s.length());
		}
		catch(Throwable t)
		{
			System.out.println("Error type: "+t.getMessage());
		}
		finally
		{
			System.out.println("Execution done");
		}

	}

}
