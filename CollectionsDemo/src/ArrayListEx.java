import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=new ArrayList<String>();
        list.add("Vaishali");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        Iterator itr=list.iterator();
        
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
        
        for(String obj : list){
        	System.out.println(obj);
        }
        
	}

}
