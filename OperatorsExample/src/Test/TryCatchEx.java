package Test;

public class TryCatchEx {

	
	 static void method() {}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
      try {
    	  method();
    	  System.out.println("try");
      } catch(Exception e) {
    	  System.out.println("catch");
      }
      finally {
    	  System.out.println("finally");
      }
	}

}
