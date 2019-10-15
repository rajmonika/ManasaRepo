package CollectionConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Selenium");
		hm.put(2, "Automation");
		hm.put(3, "Collections");
		hm.put(4, "QTP");
		
		System.out.println(hm);
		
		System.out.println(hm.get(3));
		
		//It may have one null key and multiple null values
		
		hm.put(null , "Java");
		hm.put(null , "ALM");
		hm.put(5, " ");
		hm.put(6, null);
		hm.put(7, " ");
		hm.put(8, null);
				
		System.out.println(hm);
		
		for(Entry m :hm.entrySet())
		{
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		hm.remove(7);
		System.out.println(hm);
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Tom", 25, 'A');
		Employee e2 = new Employee("Jerry", 26, 'B');
		Employee e3 = new Employee("John", 27, 'C');
		
		emp.put(101, e1);
		emp.put(102, e2);
		emp.put(103, e3);
		
		for(Entry<Integer, Employee> m : emp.entrySet())
		{
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee "+key+" Info is: ");
			System.out.println(e.name+" "+e.age+ " "+ e.dept);
			
		}
		
		
		
	}

}
