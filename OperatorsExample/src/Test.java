

public class Test implements Runnable 
{ 
	public void run() 
	{ 
		System.out.println("r1 "); 
		System.out.println("r2 "); 
	} 

	public static void main( String[] args ) 
	{ 
		Thread t = new Thread(new Test()); 
		t.start(); 
		System.out.println("m1 "); 
		t.sleep(); 
		System.out.println("m2 "); 
	} 
}


