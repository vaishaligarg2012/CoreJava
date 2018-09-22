package LinkedListDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<String> obj=new HashSet<>();
        obj.add("Vaishali");
        obj.add("Garg");
        obj.add("Garg");
        
        Iterator<String> o=obj.iterator();
        
        while(o.hasNext())
        {
        	
        	System.out.println(o.next());
        }
	}

}
