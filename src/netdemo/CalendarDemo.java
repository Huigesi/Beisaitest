package netdemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
	
		Calendar c=Calendar.getInstance();
		c.setTime(new Date());
		int hour=c.get(Calendar.HOUR_OF_DAY);
		int miniute=c.get(Calendar.MINUTE);
		int second=c.get(Calendar.SECOND);
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int day=c.get(Calendar.DATE);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(hour);
		System.out.println(miniute);
		System.out.println(second);
		
	}

}
