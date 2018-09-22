package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Student> obj=new ArrayList<>();
        Student s1=new Student(23,232,"Vaishali");
        Student s2=new Student(24,237,"Vaishali1");
        Student s3=new Student(25,235,"Vaishali3");
        obj.add(s1);
        obj.add(s2);
        obj.add(s3);
        
        Collections.sort(obj,new AgeComparator());
        Iterator itr=obj.iterator();
        
        while(itr.hasNext()){
        	Student st=(Student)itr.next();
        	System.out.println(st.age+" "+st.name+" "+st.rollNo);
        }
	}

}
