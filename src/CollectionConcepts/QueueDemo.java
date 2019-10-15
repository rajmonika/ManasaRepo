package CollectionConcepts;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue q = new PriorityQueue();
		
		q.add("Test1");
		q.add("Test2");
		q.add("Test3");
		
		System.out.println(q);
		
		System.out.println("Peek: "+q.peek()); //Head is Test1
		
		System.out.println("Remove: "+q.remove()); //test1 is removed
		
		System.out.println("Element: "+q.element()); //head is now test 2
		
		System.out.println("Poll: "+q.poll()); //Deleted Test2
		
		System.out.println("Peek: "+q.peek()); //Head becomes Test3
		
		System.out.println("Remove: "+q.remove()); //test3 is removed
		
		System.out.println("Poll: "+q.poll()); //no values present in the Queue
		
		System.out.println("Peek: "+q.peek()); //no values present in the Queue
		
		//Below methods should give Exception as Queue is Empty
		
		System.out.println("Remove: "+q.remove()); //no values present in the Queue
		
		System.out.println("Element: "+q.element()); //no values present in the Queue
		
		

	}

}
