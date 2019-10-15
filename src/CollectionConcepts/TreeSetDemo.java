package CollectionConcepts;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

Set<String> s1 = new TreeSet<String>();
		
		s1.add("Abc");
		s1.add("Hello");
		s1.add("Xyz");
		s1.add("Blue");
		s1.add("Sunshine");
		s1.add("Veal");
		s1.add("Zurich");
		
		System.out.println(s1);
		
		
		Set<Integer> s = new TreeSet<Integer>();
		
		s.add(2019);
		s.add(2001);
		s.add(2010);
		s.add(100);
		s.add(15);
		s.add(5);
		s.add(2089);
		
		System.out.println(s);
		
			
		Set s2 = new TreeSet();
		
		s2.add('c');
		s2.add('j');
		s2.add('p');
		s2.add('m');
		
		System.out.println(s2);
		
		
	}

}
