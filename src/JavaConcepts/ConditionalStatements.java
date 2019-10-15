package JavaConcepts;

public class ConditionalStatements {

	public static void main(String[] args) {

		//If-else if-else Statement
		
		int a = 0;
		int b = 1;
		int c = 5;
	
		System.out.println("hello");
		System.out.println("java");
		
		System.out.println("***********************");
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
		
		//SWITCH STATEMENTS
		System.out.println("********SWITCH STATEMENTS********");
		
		char grade = 'M';
		
		switch(grade)
		{
		case 'A':
			System.out.println("Excellent!");
			break;
		
		case 'B':
			System.out.println("Well Done");
			break;
			
		case 'C':
			System.out.println("You Passed");
			break;
			
		case 'D':
			System.out.println("Better try again");
			break;
			
		case 'E':
			System.out.println("Failed");
			break;
			
		default:
			System.out.println("Invalid Grade");
		}
		
		System.out.println("Your grade is: "+grade);
		
	}

}
