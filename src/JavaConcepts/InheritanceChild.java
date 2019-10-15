package JavaConcepts;

public class InheritanceChild extends InheritanceParent{
	
	String Model = "2019";
	
	int wheels = 6;
	
	public void Engine()
	{
		System.out.println("Child ------ Engine ---- 2020");
		super.Engine();
		System.out.println("Parent wheels"+super.wheels);
	}
		
	public void start()
	{
		System.out.println("Child Car ---- Start ---- ButtonStart");
	}

	
	public void theftSafety()
	{
		System.out.println("Child ------ Theft safety");
	}
	
	public void GPS()
	{
		System.out.println("Child ----- GPS");
	}

	public static void main(String[] args) {

		InheritanceChild ic = new InheritanceChild();
		
		System.out.println("Wheels: "+ic.wheels);
		
		ic.start();
		ic.stop();
		
		System.out.println(ic.Model);
		ic.theftSafety();
		ic.GPS();
		
		ic.Engine();
		ic.Refuel();

	}

}
