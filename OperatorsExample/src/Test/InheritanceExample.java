package Test;



class Base{
	private Base() {
		System.out.println("Base");
	}
}


public class InheritanceExample extends Base{
           
	public void InheritanceExample() {
		System.out.println("Drived");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new InheritanceExample();
	}

}

