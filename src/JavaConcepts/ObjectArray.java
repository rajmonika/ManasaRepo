package JavaConcepts;

public class ObjectArray {

	public static void main(String[] args) {

		Object ob[] = new Object[4];
		
		ob[0] = 101;
		ob[1] = "Tom";
		ob[2] = 'M';
		ob[3] = 6589.34;
		
		System.out.println("Size: "+ob.length);
		
		System.out.println("Value at index 3 : "+ob[3]);
		
		System.out.println("Printing all Array values");
		for(int j=0 ; j<ob.length; j++)
		{
			System.out.println(ob[j]);
		}


	}

}
