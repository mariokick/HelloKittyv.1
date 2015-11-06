package gui;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class time {

		

		
		void time1(){
			Date date = new Date();
			 date.toString();
			 GregorianCalendar gc = new GregorianCalendar();
			 gc.get(Calendar.SECOND);
			 System.out.print( gc.get(Calendar.SECOND)- gc.get(Calendar.SECOND));
		}
	   
		
	}
	
