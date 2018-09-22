package comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student st1, Student st2) {
		// TODO Auto-generated method stub
		Student st=(Student)st1;
		Student st3=(Student)st2;
		
		if(st.age  == st3.age){
			return 0;
		}else if(st.age > st3.age){
			return 1;
		}else
			return -1;
		

	}
}
