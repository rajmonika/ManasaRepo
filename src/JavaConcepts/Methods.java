package JavaConcepts;

public class Methods {
	
	//Global variables
	int m =100;
	int n = 30;
	String k;
	int z;
	
	public void sum(int x, int y)
	{
		//Local variables
		int a = x; //50
		int b = y; //60
		int c = a+b;
		
		System.out.println("Sum is: "+c);
		System.out.println("value of m is:"+m);
	}
	
	public void sub()
	{
		int p;
		m=100;
		n=50;
		p=m-n;
		System.out.println("Value os sub() is: "+p);
	}

	public static void main(String[] args) {

		Methods x = new Methods();
		
		x.sum(50, 60);
		x.sub();
		
		System.out.println("Value of n is: "+x.n);
		System.out.println("Value of K is: "+x.k);
		System.out.println("Value of z is: "+x.z);
	}

}
