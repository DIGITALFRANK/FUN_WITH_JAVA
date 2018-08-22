package date_calendar_intro;

import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarExample {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy HH:mm:ss");
		String date = sdf.format(new Date());
		System.out.println(date);
		
		
		sdf = new SimpleDateFormat("y-MM-dd z");
		date = sdf.format(new Date());
		System.out.println(date);
		
		sdf = new SimpleDateFormat("EEE, d MMM yy zzzz");
		date = sdf.format(new Date());
		System.out.println(date);
		
		sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar cal = new GregorianCalendar(2018,7,16,13,24,56);
//		Calendar cal = new GregorianCalendar();
//		Date d = new Date();
//		System.out.println(cal);
//		System.out.println(d);
		int year 		= cal.get(Calendar.YEAR);
		int month		= cal.get(Calendar.MONTH);
		int dayOfMonth  = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek	= cal.get(Calendar.DAY_OF_WEEK);
		int weekOfYear	= cal.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth	= cal.get(Calendar.WEEK_OF_MONTH);
		int hour		= cal.get(Calendar.HOUR);
		int hourOfDay	= cal.get(Calendar.HOUR_OF_DAY);
		int minute		= cal.get(Calendar.MINUTE);
		int second		= cal.get(Calendar.SECOND);
		int millisecond	= cal.get(Calendar.MILLISECOND);
		
		System.out.println(sdf.format(cal.getTime()));
		
		System.out.println("year \t\t: "+year);
		System.out.println("month \t\t: "+month);
		System.out.println("dayOfMonth \t: "+dayOfMonth);
		System.out.println("dayOfWeek \t: "+dayOfWeek);
		System.out.println("weekOfYear \t: "+weekOfYear);
		System.out.println("weekOfMonth \t: "+weekOfMonth);
		System.out.println("hour \t\t: "+hour);
		System.out.println("hourOfDay \t: "+hourOfDay);
		System.out.println("minute \t\t: "+minute);
		System.out.println("second \t\t: "+second);
		System.out.println("millisecond \t: "+millisecond);
	}

}

