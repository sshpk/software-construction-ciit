package pk.ciit.date;

public interface IDate {
	public int getDay();
	public int getMonth();
	public int getYear();
	public void addDays(int days);   // advances by days
	public int daysInMonth();
	public String dayOfWeek();       // e.g. "Sunday"
	public boolean isLeapYear();
	public void nextDay();           // advances by 1 day
}
