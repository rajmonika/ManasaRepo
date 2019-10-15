package JavaConcepts;

public class MethodOverloading {
	
	public void add()
	{
		System.out.println("add method ---- no parameters");
	}
	
	public void add(int i)
	{
		System.out.println("add method ----- 1 parameter");
	}
	
	public void add(int i, int j)
	{
		System.out.println("add method ----- 2 parameters");
	}
	
	public void add(String a)
	{
		System.out.println("add method ----- 1 parameter ---diff data type");
	}
	
	public void add(int i, int j, int k)
	{
		System.out.println("add method ----- 3 parameters");
	}
	
	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		
		obj.add(10);
		obj.add();
		obj.add(1, 2, 3);
		obj.add("hello");

	}

}
