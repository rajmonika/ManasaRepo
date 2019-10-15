package CollectionConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Test1");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("Test2");
		
		System.out.println(ll);
		
		//AddFirst
		ll.addFirst("Tom");
		System.out.println(ll);
		
		//AddLast
		ll.addLast("Jerry");
		System.out.println(ll);
		
		//get
		System.out.println(ll.get(3));
		
		//set
		ll.set(1, "Peter");
		System.out.println(ll);
		
		//removeFirst
		ll.removeFirst();
		System.out.println(ll);
		
		//removeLast
		ll.removeLast();
		System.out.println(ll);
		System.out.println();
		
		System.out.println("*****Printing using For Loop*******");
		
		for (int i=0; i<ll.size(); i++)
		{
		 System.out.println(ll.get(i));	
		}
		
		System.out.println("*****Printing using For each Loop*******");
		for(String s : ll)
		{
			System.out.println(s);
		}
		
		System.out.println("*****Printing using Iterator*******");
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("*****Printing using While Loop*******");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
		
		
	}

}
























