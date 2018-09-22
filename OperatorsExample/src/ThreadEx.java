
public class ThreadEx {
   public static void main(String[] args) {
	   new Thread(new Runnable() {
		   public void run() {
			   System.out.println("Run");
		   }
	   }).start();
   }
}
