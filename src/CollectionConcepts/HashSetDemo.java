package CollectionConcepts;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set s = new HashSet();
		s.add("ABC");
		s.add("ABC");
		s.add("ABC");
		s.add("xyz");
		s.add("xyz");
		s.add(123);
		s.add(345.890);
		s.add('m');
		s.add('m');
		
		System.out.println(s); //Dupes are not added and not printed in order
		
		s.add("");
		s.add("");
		
		System.out.println(s); //Only one null value is acceptable
		
		
		

	}

}
