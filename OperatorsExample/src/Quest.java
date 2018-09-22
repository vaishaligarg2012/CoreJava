import java.util.Arrays;

public class Quest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String[] colors= {"blue","red","green","orange"};
     Arrays.sort(colors);
     
     for(String s:colors) {
  System.out.println(s);
     }
     int s2=Arrays.binarySearch(colors, "orange");
     int s3=Arrays.binarySearch(colors, "violel");
     System.out.println(s2+" "+s3);
	}

}
