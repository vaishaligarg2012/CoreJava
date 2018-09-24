package Test;
public class TestArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 check();
     }catch(ArithmeticException e) {
    	 System.out.println("Cought"+e);
     }
	}




	  static void check() throws ArithmeticException {
	    	 System.out.println("Inside check function");
	    	 throw new ArithmeticException("demo");
	     }
	   
    }
