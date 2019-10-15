package JavaConcepts;

public class CallByValRef {
	
	int p, q;
	
	public int sum(int a, int b)
	{
		a = 30;
		b = 40;
		int c = a+b;
		System.out.println(c);
		return c;
	}
	
	public void swap(CallByValRef t)
	{
		int temp;
		temp = t.p; //temp = 50
		t.p = t.q; //p = 60
		t.q = temp; //q = 50
	}

	public static void main(String[] args) {

		CallByValRef obj = new CallByValRef();
		obj.sum(100, 50);
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);

		System.out.println("P after swap: "+obj.p);
		System.out.println("Q after swap: "+obj.q);
	}

}
