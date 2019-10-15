package JavaConcepts;

public class WrapperClass {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);
		
		//Data conversion: String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to Double
		double d = Double.parseDouble("12.35");
		System.out.println(d+10);
		
		//String to Boolean
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		
		//If String is alphanumeric
		String z = "100A";
		//int y = Integer.parseInt(z); //NumberFormatException
		//System.out.println(z);

		
		//Int to String
		int j = 200;
		System.out.println(j+20);
		
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		
		
	}

}
