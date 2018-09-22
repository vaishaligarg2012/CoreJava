
public class WaitForSingnal {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WaitForSingnal.waitForSingle();
	}
	public  static void waitForSingle() {
  	  Object obj= new Object();
  	  synchronized (Thread.currentThread()) {
  		  try {
			Thread.currentThread().wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  		  obj.notify();
  	  }
  	  
    }
}
