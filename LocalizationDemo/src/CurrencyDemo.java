import java.text.*;
import java.util.*;
public class CurrencyDemo {
        public static void main(String args[]){
        	NumberFormat nft=NumberFormat.getCurrencyInstance(new Locale("de","DE"));
        	String formatted =nft.format(1000000);
        	System.out.println(formatted);
        }
}
