package testing;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Exam {
	static Date today = new Date();
	public static int fToC(int f) {
		return (f - 32) * 5 / 9;
	}
	public static int cToF(int c) {
		return c * 9 / 5 + 32;
	}
	public static String removeExclaimation(String in){
		if(in==null||in.length()==0)
			return in;
		return in.replaceAll("!", "");
	}
	
	public static int currentDay(){
		LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getDayOfMonth();
	}
	public static int currentMonth(){
		LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getMonthValue();
	}
	public static int currentYear(){
		LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getYear();
	}
}
