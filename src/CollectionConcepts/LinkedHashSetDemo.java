package CollectionConcepts;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set s = new LinkedHashSet();
		
		s.add("ABC");
		s.add("ABC");
		s.add("ABC");
		s.add("xyz");
		s.add("xyz");
		s.add(123);
		s.add(345.890);
		s.add('m');
		s.add('m');
		s.add(456);
		
		System.out.println(s);
		
		s.add("");
		s.add("");
		
		System.out.println(s);

	}

}
