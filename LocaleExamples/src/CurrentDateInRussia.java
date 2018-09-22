import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class CurrentDateInRussia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PrintWriter pw=new PrintWriter(System.out,true);
     Date today=new Date();
     Locale currentLocale=Locale.getDefault();
     Locale ruLocale=new Locale("ru","RU");
     currentLocale=ruLocale;
     
     DateFormat df=DateFormat.getDateInstance(DateFormat.DEFAULT);
     pw.println(df.format(today)+" "+currentLocale.toString());
	}

}
