package SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Datetest {

	public static void main(String[] args) {
		//SimpleDateFormat
		Date now=new Date();
		SimpleDateFormat date=new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		System.out.println(date.format(now));
		//Calender
		Calendar c=Calendar.getInstance();
		c.setTime(now);
		int cc=c.get(Calendar.DATE);
		System.out.println(cc);
		
	}

}
