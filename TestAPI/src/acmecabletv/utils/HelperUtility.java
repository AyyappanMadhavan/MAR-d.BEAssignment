package acmecabletv.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HelperUtility {

	public static Date[] getDateRange(String month){
		Date[] dateRange = new Date[2];

		 int monthNum = Integer.parseInt(month);

	        switch (monthNum) {
	            case 1:
	            	dateRange[0] =  new GregorianCalendar(2016, Calendar.JANUARY, 1).getTime();
	            	dateRange[1] =  new GregorianCalendar(2016, Calendar.JANUARY, 31).getTime();
	            	break;
	            case 2:
	            	dateRange[0] =  new GregorianCalendar(2016, Calendar.FEBRUARY, 1).getTime();
	            	dateRange[1] =  new GregorianCalendar(2016, Calendar.FEBRUARY, 29).getTime();
	            	break;
	            case 3:
	            	dateRange[0] =  new GregorianCalendar(2016, Calendar.MARCH, 1).getTime();
	            	dateRange[1] =  new GregorianCalendar(2016, Calendar.MARCH, 31).getTime();
	            	break;
	            case 4:
	            	dateRange[0] =  new GregorianCalendar(2016, Calendar.APRIL, 1).getTime();
	            	dateRange[1] =  new GregorianCalendar(2016, Calendar.APRIL, 30).getTime();
	            	break;
	            case 5:
	            	dateRange[0] =  new GregorianCalendar(2016, Calendar.MAY, 1).getTime();
	            	dateRange[1] =  new GregorianCalendar(2016, Calendar.MAY, 31).getTime();
	            	break;
	            case 6:
	            	dateRange[0] =  new GregorianCalendar(2016, Calendar.JUNE, 1).getTime();
	            	dateRange[1] =  new GregorianCalendar(2016, Calendar.JUNE, 30).getTime();
	            	break;
	            case 7:
	            	dateRange[0] =  new GregorianCalendar(2016, Calendar.JULY, 1).getTime();
	            	dateRange[1] =  new GregorianCalendar(2016, Calendar.JULY, 31).getTime();
	            	break;
	            case 8:
	            	dateRange[0] =  new GregorianCalendar(2016, Calendar.AUGUST, 1).getTime();
	            	dateRange[1] =  new GregorianCalendar(2016, Calendar.AUGUST, 31).getTime();
	            	break;
	            case 9:
	            	dateRange[0] =  new GregorianCalendar(2016, Calendar.SEPTEMBER, 1).getTime();
	            	dateRange[1] =  new GregorianCalendar(2016, Calendar.SEPTEMBER, 30).getTime();
	            	break;
	            case 10:
	            	dateRange[0] =  new GregorianCalendar(2016, Calendar.OCTOBER, 1).getTime();
	            	dateRange[1] =  new GregorianCalendar(2016, Calendar.OCTOBER, 31).getTime();
	            	break;
	            case 11:
	            	dateRange[0] =  new GregorianCalendar(2016, Calendar.NOVEMBER, 1).getTime();
	            	dateRange[1] =  new GregorianCalendar(2016, Calendar.NOVEMBER, 30).getTime();
	            	break;
	            case 12:
	            	dateRange[0] =  new GregorianCalendar(2016, Calendar.DECEMBER, 1).getTime();
	            	dateRange[1] =  new GregorianCalendar(2016, Calendar.DECEMBER, 31).getTime();
	            	break;

	        }

		return dateRange;
	}

	public static Date convertStringToDate(String str){
		DateFormat df = new SimpleDateFormat("yyyy-MM-DDThh:mm:ss");
	    Date dt = new Date();
	    try {
	        dt = df.parse(str);
	        //String newDateString = df.format(dt);
	        //System.out.println(newDateString);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	    return dt;
	}
}
