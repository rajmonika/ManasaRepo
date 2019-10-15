package JavaConcepts;

public class AbstractChild extends AbstractParent{

	public static void main(String[] args) {

		AbstractChild ac = new AbstractChild();
		ac.display1();
		ac.display2();

	}

	public void display1() {
	System.out.println("This is Abstract Method");
		
	}

}
