package CollectionConcepts;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "Test1");
		h1.put(2, "Test2");
		h1.put(3, "Test3");
		h1.put(4, "Test4");
		h1.put(5, "Test5");
		
		System.out.println(h1);
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2 = (Hashtable<Integer, String>) h1.clone();
		
		System.out.println("Values from h1: "+h1);
		System.out.println("Values from h2: "+h2);
		
		h2.put(6, "Test6");
		
		if(h1.equals(h2))
		{ 
			System.out.println("Both are Equal");
		}
		else
		{
			System.out.println("Both are NOT Equal");
		}
		
		System.out.println(h2.get(6));
		
		System.out.println("The Hashcode value of h1: "+h1.hashCode());
			
		Hashtable<String, String> h3 = new Hashtable<String, String>();
		
		h3.put("abc", "Sample1");
		h3.put("def", "Sample2");
		
		System.out.println("Values in h3: "+h3);
		
	}

}
