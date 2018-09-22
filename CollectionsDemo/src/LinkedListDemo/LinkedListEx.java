package LinkedListDemo;

import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<String> obj= new LinkedList<String>();
      obj.add("Vaishali");
      obj.add("main");
      obj.add("Ajay");
      obj.add("Vijay");
      
      ListIterator c=obj.listIterator();
      while(c.hasNext()){
    	  System.out.println(c.next());
      }
      System.out.println("Previoud order list");
      while(c.hasPrevious()){
    	  System.out.println(c.previous());
      }
      
	}

}
