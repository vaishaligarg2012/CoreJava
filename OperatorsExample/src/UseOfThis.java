
public class UseOfThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Y(5);
	}
	


}
class X{
	X(){
		System.out.println(1);
	}
	X(int x){
	this();
	System.out.println(2);
	}
	
}
 class Y extends X
{
	Y(){
		super(6);
		System.out.println(3);
	}
	Y(int y){
		this(); //how this call X() for printing 1 
		System.out.println(4);
	}
}