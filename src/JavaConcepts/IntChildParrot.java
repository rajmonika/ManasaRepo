package JavaConcepts;

public class IntChildParrot implements InterfaceBird1, InterfaceBird2{

	public static void main(String[] args) {

		IntChildParrot ic = new IntChildParrot();
		ic.fly();
		ic.color();
		ic.feathers();
		ic.size();
		ic.weight();
		ic.species();
	}

	public void fly() {
	System.out.println("Interface 1 - Fly - Good");
		
	}

	public void color() {
		System.out.println("Interface 1 - Color --- Green");
		
	}

	public void feathers() {
		System.out.println("Interface 2 - Feathers --- Green Feathers");
		
	}

	public void size() {
		System.out.println("Interface 2 - Size --- Small");
		
	}

	public void weight() {
		System.out.println("Interface 3 - Weight --- Light");
		
	}

	public void species() {
		System.out.println("Interface 3 - Species --- Bird");
		
	}

}
