package pk.cuiatd.sc.calc;

public class Date
{
	private int  day, year, month;
	private static String [] monthsStringName = {"", "January", "February", "March",
			"April", "May","June", "July", "August", "September",
			"October", "November", "December"};
	private static int [] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30,
			31, 30, 31};


	public Date(){
		setYear(2019);
		setDate(1);
		setMonth(1);
	}


	public Date(int  inputYear, int  inputMonth, int  inputDate )
	{
		setMonth( inputMonth);
		setYear( inputYear);
		setDate( inputDate);
	}
	private void setMonth ( int  inputMonth ){
		if ( inputMonth >=1 && inputMonth <=12)
			month = inputMonth;
		else
			month = 1;
	}

	public int getMonth(){
		return month;
	}
	private void setDate ( int  inputDate ){
		if ( inputDate > 0 &&  inputDate <= daysPerMonth[month] )
			day = inputDate;

		if ( month == 2 &&  inputDate == 29 && checkLeapYear( year) )
			day = inputDate;
		else
			day = 1;
	}
	public int getDay(){
		return day;
	}

	//set year method
	private void setYear ( int  inputYear ){
		if (  inputYear >= 1900 &&  inputYear <= 2100 )
			year = inputYear;
		else
			year = 2019;
	}

	public int getYear(){
		return year;
	}
	public String toString (){
		String message = String.format( "%d/%d/%d\n", getMonth(),  getDay(),  getYear() );
		message += toMonthNameDateString() + toDayDateString();
		return message;
	}

	//toMonthNameDateString method
	public String toMonthNameDateString(){
		String message = String.format( "%s %d, %d\n",
				monthsStringName[ getMonth() ],  getDay(),  getYear() );
		return message;
	}
	public String toDayDateString(){
		int countDays=0;

		for ( int i = 1; i < getMonth(); i++){
			if ( i == 2 && checkLeapYear(  getYear() ))
				countDays += 29;
			else
				countDays += daysPerMonth[i];
		}
		countDays +=  day;
		String message = String.format( "%d %d\n", countDays,  getYear());
		return message;
	}
	private Boolean checkLeapYear(int  inputYear){
		if ( getYear() % 400 == 0 || ( getYear() % 4 == 0 &&  getYear() % 100 != 0 ))
			return true;
		else
			return false;
	}
	public Boolean checkLeapYear(){
		return checkLeapYear(getYear());
	}
}
