import java.util.ArrayList;
import java.util.Iterator;
public class retainAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // retail all means the object name you pass here only not remove all other will remove
		
		
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Vaishali");
		obj.add("vijay");
		obj.add("Ajay");
		
		ArrayList<String>  obj2=new ArrayList<String>();
		obj2.add("Vaishali");
		
		obj.retainAll(obj2);
		Iterator obj1= obj.iterator();
		
		while(obj1.hasNext()){
			System.out.println(obj1.next());
		}
	}

}
