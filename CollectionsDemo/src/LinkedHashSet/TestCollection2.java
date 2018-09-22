package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestCollection2 {
      public static void main(String args[]){
    	  LinkedHashSet<String>  o=new LinkedHashSet<>();
    	  
    	  o.add("Some");
    	  o.add("data");
    	  o.add("genger");
    	  o.add("clever");
    	  o.add("dancer");
    	  
    	  Iterator<String> it=o.iterator();
    	  
    	  while(it.hasNext()){
    		  System.out.println(it.next());
    	  }
    	 
      }
}
