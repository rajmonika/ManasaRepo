package CollectionConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		//int a[] = new int [4]; //static array
		// a[1] = 10;
		
		ArrayList ar = new ArrayList(); //Non-generic
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add("Hello");
		ar.add('a');
		ar.add(12.56);
		
		System.out.println("Size: "+ar.size());
		
		System.out.println("Element at index 3 : "+ar.get(3));
		
		//To print all the elements of the ArrayList using For Loop
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("*******************");
		
		ArrayList<String> ar1 = new ArrayList<String>(); //Generic
		
		ar1.add("Selenium");
		ar1.add("100");
		ar1.add("test");
		
		for(int j=0; j<ar1.size(); j++)
		{
			System.out.println(ar1.get(j));
		}
		System.out.println("*******************");
		
        ArrayList<String> ar2 = new ArrayList<String>(); //Generic
		
		ar2.add("Automation");
		ar2.add("Java");
		ar2.add("Collections");
		
		//AddAll
		ar1.addAll(ar2);
		for(int j=0; j<ar1.size(); j++)
		{
			System.out.println(ar1.get(j));
		}
		
		System.out.println("*******************");
		
		//RemoveAll
		ar1.removeAll(ar2);
		
		for(int j=0; j<ar1.size(); j++)
		{
			System.out.println(ar1.get(j));
		}
		
		System.out.println("*******************");
		
		ar1.remove(1);
		for(int j=0; j<ar1.size(); j++)
		{
			System.out.println(ar1.get(j));
		}
		
		System.out.println("*******************");

		ArrayList<String> ar3 = new ArrayList<String>(); //Generic
        ar3.add("TestNG");
        ar3.add("java");
        ar3.add("test");
        
        ArrayList<String> ar4 = new ArrayList<String>(); //Generic
        ar4.add("Selenium");
        ar4.add("java");
        ar4.add("test");
        ar4.add("Automation");
        
        ar3.retainAll(ar4);
        
        for(int j=0; j<ar3.size(); j++)
		{
			System.out.println(ar3.get(j));
		}
        
        System.out.println("*******************");
        
        Employee e1 = new Employee("John", 25, 'A');
        Employee e2 = new Employee("Tom", 26, 'B');
        Employee e3 = new Employee("Sam", 27, 'C');
        
        ArrayList<Employee> ar5 = new ArrayList<Employee>();
        ar5.add(e1);
        ar5.add(e2);
        ar5.add(e3);
        
        //Iterator to traverse and print values
        
        Iterator<Employee> it = ar5.iterator();
        while(it.hasNext())
        {
        	Employee emp = it.next();
        	System.out.print(emp.name +" ");
        	System.out.print(emp.age +" ");
        	System.out.println(emp.dept);
        }
		
        
		
	}

}
