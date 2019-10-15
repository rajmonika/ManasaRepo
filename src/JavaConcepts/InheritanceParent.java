package JavaConcepts;

public class InheritanceParent extends InheritanceGrandParent{
	
	int wheels = 4;
	
	public void start()
	{
		System.out.println("Parent Car ---- Start ---- KeyStart");
	}

	public void stop()
	{
		System.out.println("Parent Car ---- Stop");
	}
	
	public void Engine()
	{
		System.out.println("Parent ------ Engine ---- 2000");
		wheels = 10;
	}
	
	public void mileage()
	{
		System.out.println("Grand Parent --- abstract ---method");
	}
	
	
	public static void main(String[] args) {
		InheritanceParent ip = new InheritanceParent();
	   System.out.println(ip.wheels);
	   ip.start();
	   ip.stop();
	   
	   ip.Refuel();
	   ip.Engine();
	   ip.mileage();

	}

}
