import java.util.Locale;

public class DefaultLanuageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Locale l=Locale.getDefault();
          System.out.println(l+" "+ l.getDisplayCountry()+ " "+l.getDisplayLanguage());
        
          Locale l2=new Locale("pa","IN");
          System.out.println(l2+ " " +l2.getDisplayLanguage()+" "+l2.getDisplayCountry());
          
          String[] s4= Locale.getISOCountries();
          
          for(String s: s4){
        	 // System.out.println(s);
          }
          
          Locale[] d3=Locale.getAvailableLocales();
          for(Locale d: d3){
        	  System.out.println(d.getDisplayLanguage()+" "+ d.getDisplayCountry());
        	  
          }
	}

}
