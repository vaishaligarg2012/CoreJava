package comparableinterface;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Student> obj=new ArrayList<>();
       
       Student s1=new Student(22,"vaishali");
       Student s2=new Student(26,"vaishali1");
       Student s3=new Student(23,"vaishali3");
       
       obj.add(s1);
       obj.add(s2);
       obj.add(s3);
       
       Collections.sort(obj);
       for(Student st:obj){
    	   System.out.println(st.name+" "+st.rollNo);
       }
       
       
	}

}
