package JavaConcepts;

public class StaticNonStatic {
	
	//Global variables
	String name = "John"; //Non Static variable
	static int age = 25; //Static variable

	
	public void multiply() //Non Static Method
	{
		System.out.println("Multiply method");
	}
	
	public static void sum() //Static method
	{
		System.out.println("Sum method");
	}

	public static void main(String[] args) {

		StaticNonStatic sn = new StaticNonStatic();
		
		System.out.println(age);
		System.out.println(sn.name);
		
		sum();
				
		sn.multiply();
		
		//sn.sum(); //Gives warning
		
	}

}
