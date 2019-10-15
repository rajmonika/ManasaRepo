package JavaConcepts;

public class LoopsConcept {

	public static void main(String[] args) {

		//while loop
		
		//print numbers from 1 to 10
		
		int i = 1;
		while(i<=10)
		{
			System.out.println("The value is: "+i);//1 //2 //3.....//9 //10
			i = i+1; //i = 1+1=2 //i=2+1=3 //i=3+! .......i=9+1=10 //i=10+1=11
		}
		
		System.out.println("*******************************");
		//do...while
		
		int j=1;
		do {
			System.out.println("The value is: "+j);
			j=j+1;
		}while(j<=10);
		
		System.out.println("*******************************");

		//for loop
		
		for(int m=11; m<=20; m++)
		{
			System.out.println("Value is: "+m);
		}
		
		System.out.println("*******************************");
		
		//Printing even numbers between 1 to 100
		
		for(int p=1; p<=100; p++)
		{
			if(!(p%2==0))
			{
			System.out.println("Value is: "+p);
			}
		}
		
	}

}












