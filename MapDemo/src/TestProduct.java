import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class TestProduct {
    public static void main(String args[]){
    //	Set<Product> s=new HashSet<Product>();

    	//List<Product> s=new ArrayList<Product>();

        List<Product> s=new LinkedList<Product>();
    	s.add(new Product(10,40));
    	s.add(new Product(19,55));
    	s.add(new Product(4,40));
    	s.add(new Product(14,17));
    	
    for(Product p: s){
    	System.out.println(p.getPid()+" "+p.getPcost());
    }
    }
}
