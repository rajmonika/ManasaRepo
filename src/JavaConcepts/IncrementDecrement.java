package JavaConcepts;

public class IncrementDecrement {

	public static void main(String[] args) {

		System.out.println("Post Icrementation");
		int i=1;
		int j = i++; //j=1 , i=2
		System.out.println("i = "+i); //2
		System.out.println("j = "+j); //1
		
		
		System.out.println("Pre Icrementation");
		int a = 1;
		int b = ++a;   //b=2 //a=2
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		
		System.out.println("Post Decrementation");
		int m = 2;
		int n = m--;
		System.out.println("m = "+m);
		System.out.println("n = "+n);
		
		
		System.out.println("Pre Decrementation");
		int p = 2;
		int q = --p; //q=1 //p=1
		System.out.println("p = "+p);
		System.out.println("q = "+q);
		
		

	}

}
