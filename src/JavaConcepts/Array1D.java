package JavaConcepts;

public class Array1D {

	public static void main(String[] args) {

		int i[] = new int[4];
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println("Value at index 2: "+i[2]);
		//System.out.println(i[4]); -- ArrayIndexOutofBoundsException
		
		System.out.println("Size of Array : "+i.length); //Size of Array
		
		System.out.println("Printing all Array values");
		for(int j=0 ; j<i.length; j++)
		{
			System.out.println(i[j]);
		}

	}

}

/*
    double d[] = new double[3];
    String s[] =new String[4];
    char c[] = new char[5];
    boolean b[] = new boolean[2];
*/