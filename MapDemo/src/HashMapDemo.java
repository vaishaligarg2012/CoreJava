import java.util.*;

public class HashMapDemo {
      public static void main(String args[]){
    	  Map<Integer,String> v1=new HashMap<>();
    	  v1.put(1, "Vaishali");
    	  v1.put(2, "Alex");
    	  v1.put(3, "Bob");  
    	  Set s1=v1.keySet();
    	  Collection s2=v1.values();
    	  System.out.println(s1);
    	  System.out.print(s2);
         // List s3=v1.entrySet();
    	 // System.out.println(s3);
    	  
    	  for(Map.Entry<Integer, String> e1: v1.entrySet()){
    		  System.out.println(e1.getKey()+" "+e1.getValue());
    	  }
    	  
      }
}
