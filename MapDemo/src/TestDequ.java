import java.util.*;
public class TestDequ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Deque<String> o = new LinkedList<String>();
          o.add("One");
          o.addFirst("Head");
          o.addLast("Trail");
          o.push("Element");
          System.out.println(o);
          
	}

}
