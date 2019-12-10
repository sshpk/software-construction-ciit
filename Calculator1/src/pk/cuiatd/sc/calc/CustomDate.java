package pk.cuiatd.sc.calc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class CustomDate {
	private Date date;
	public CustomDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		date = new Date();
		sdf.format(date);
	}
	public CustomDate(String dateString){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try{
			date = sdf.parse(dateString);
		}catch(ParseException ex){
			ex.printStackTrace();
		}
	}
	public Date getDate() {
		return date;
	}
	public int getDay(){
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getDayOfMonth();
	}
	public int getMonth(){
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getMonthValue();
	}
	public int getYear(){
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getYear();
	}
	public void addDays(int days){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days); //minus number would decrement the days
		date= cal.getTime();
	}
	public void nextDay(){
		addDays(1);
	}
	public boolean isLeapYear(){
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.isLeapYear();
	}
	@Override
	public String toString() {
		return date.toString();
	}
	@Override
	public boolean equals(Object obj) {
		CustomDate otherDate = (CustomDate)obj;
		if( date.compareTo(otherDate.getDate())==0)
			return true;
		else return false;
	}
}
