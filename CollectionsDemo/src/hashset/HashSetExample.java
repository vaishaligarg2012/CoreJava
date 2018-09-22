package hashset;
import java.util.HashSet;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet<Book> set=new HashSet<Book>();
       //creating books...       
       Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
       Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
       Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
       
       //adding book to hashSet...
       set.add(b1);
       set.add(b2);
       set.add(b3);
       
       //traversing books...
       
       for(Book b: set)
       {
    	  System.out.println(b.id+ " "+b.auther); 
       }
	}

}
