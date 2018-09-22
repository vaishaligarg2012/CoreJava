import java.util.ArrayList;
import java.util.Iterator;
public class RemoveAllDemo {
   public static void main(String args[]){
	   ArrayList<String> al=new ArrayList<String>();
	   al.add("Ravi");
	   al.add("Vaishali");
	   al.add("Garg");
	   al.add("Rajan");
	   
	   ArrayList<String> al2=new ArrayList<String>();
	   al2.add("Vaishali");
	   al2.add("Same");
	   
	   al.removeAll(al2);
	   Iterator itr=al.iterator();
	   
	   while(itr.hasNext()){
		   System.out.println(itr.next());
	   }
   }
}
