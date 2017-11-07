package SimpleDateFormat;
import java.text.*;
import java.util.Date;
public class FormatDateTime2 {

	 public static String toLongDateString(Date dt){
	        SimpleDateFormat myFmt=new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss�� E ");        
	        return myFmt.format(dt);
	    }
	    
	    public static String toShortDateString(Date dt){
	        SimpleDateFormat myFmt=new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��");        
	        return myFmt.format(dt);
	    }    
	    
	    public static String toLongTimeString(Date dt){
	        SimpleDateFormat myFmt=new SimpleDateFormat("HH mm ss SSSS");        
	        return myFmt.format(dt);
	    }
	    public static String toShortTimeString(Date dt){
	        SimpleDateFormat myFmt=new SimpleDateFormat("yy/MM/dd HH:mm");        
	        return myFmt.format(dt);
	    }
	    
	    public static void main(String[] args) {
	        Date now=new Date();
	        System.out.println(FormatDateTime2.toLongDateString(now));
	        System.out.println(FormatDateTime2.toShortDateString(now));
	        System.out.println(FormatDateTime2.toLongTimeString(now));
	        System.out.println(FormatDateTime2.toShortTimeString(now));
	    }    
}
