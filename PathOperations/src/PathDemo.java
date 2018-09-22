import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
         public static void main(String[] args){
        	 Path p1=Paths.get("e://NIIT_DT");
        	 Path p2=p1.resolve("/backend");
        	 System.out.println(p2.toString());
         }
}
