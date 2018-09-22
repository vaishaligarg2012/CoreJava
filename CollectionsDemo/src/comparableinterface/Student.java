package comparableinterface;

 class Student implements Comparable<Student>{
   int rollNo;
   String name;
   
   Student(int rollNo, String name){
	   this.rollNo=rollNo;
	   this.name=name;
	   
   }
 
 
   public int compareTo(Student s){
	   if(rollNo==s.rollNo)
	   {
		   return 0;	   
	   }else if(rollNo>s.rollNo){
		   return 1;
	   }
	   else{
		   return -1;
	   }
	
	   
   }

}
