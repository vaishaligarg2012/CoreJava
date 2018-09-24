package Test;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1="abc";
    String s2="def";
    String s3=s1.concat(s2.toUpperCase());
    System.out.println(s1+s2+s3);
	}

}

class MyException extends Exception{
	public void method() {
		throw new ArithmeticException();
	}
}