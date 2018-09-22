import java.util.ArrayList;
import java.util.Iterator;
public class TestCollection3 {

	public static void main(String[] args) {
		Student s1=new Student(101,"Sonoo",23);
		Student s2=new Student(102,"Ravi",21);
	    Student s3=new Student(103,"Hanumat",25);
	    
	    ArrayList<Student> al=new ArrayList<Student>();
	    al.add(s1);
	    al.add(s2);
	    al.add(s3);
	    
	    Iterator itr=al.iterator();
	    
	    while(itr.hasNext()){
	    	Student st=(Student)itr.next();
	    	System.out.println(st.rollNo+" "+st.name+ " "+st.age);
	    }
	    
	 }

}
