package CollectionConcepts;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add("Test123");
		v.add(678);
		v.add('C');
		v.add(56.809);
		
		System.out.println(v);
		
		for(int i=0; i<v.size(); i++)
		{
			System.out.println(v.get(i));
		}
		
		v.clear();
		System.out.println(v);
		System.out.println(v.isEmpty());
		v.add("hello");
		v.add(678);
		v.add('C');
		v.add(56.809);
		
		System.out.println(v);
		
		System.out.println(v.elementAt(3));
		//System.out.println(v);
		
		System.out.println(v.isEmpty());
		
	}

}
