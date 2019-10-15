package JavaConcepts;

public class ConstructorFruit {
	
	String name, color;
	
	public ConstructorFruit()
	{
		name = "Mango";
		color = "Yellow";
	}
	
	public ConstructorFruit(String n, String c)
	{
		name = n;
		color = c;
	}
	
	
	public void display()
	{
		System.out.println("Name is: "+name);
		System.out.println("Color is: "+color);
	}
	
	public void display2()
	{
		System.out.println("This is display method 2"+name+color);
	}

	public static void main(String[] args) {

		ConstructorFruit f = new ConstructorFruit();
		f.display();
		f.display2();
		
		ConstructorFruit f2 = new ConstructorFruit("Apple","Red");
		f2.display();
		f2.display2();
		
		

	}

}
