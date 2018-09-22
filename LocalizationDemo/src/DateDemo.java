import java.text.DateFormat;
import java.util.*;
public class DateDemo {
         public static void main(String... args){
        	// DateFormat.getDateInstance(style, aLocale)
     
        	 DateFormat df=DateFormat.getDateInstance(DateFormat.LONG, new Locale("De","DE"));
        	 
        	 String date =df.format(new Date());
        	System.out.println(date);
            
         }
}
