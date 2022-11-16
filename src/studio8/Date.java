package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return Objects.equals(day, other.day) && Objects.equals(month, other.month) && year == other.year;
	}



	private String month;
	private String day;
	private int year;
	private boolean isHoliday;
	
	
	
    /**
	 * @param month
	 * @param day
	 * @param year
	 * @param isHoliday
	 */
	public Date(String month, String day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}

	

	@Override
	public String toString() {
		return (month + " " + day + ", " + year);
	}



	public static void main(String[] args) {
    	Date test = new Date("August", "14th", 2004, false);
    	Date test2 = new Date("August", "14th", 2004, false);
    	Date test3 = new Date("December", "25th", 2004, true);
    	Date test4 = new Date("March", "17th", 2004, true);
    	Date test5 = new Date("March", "17th", 2004, true);
    	Date test6 = new Date("September", "16th", 2003, false);
    	HashSet<Date> list = new HashSet<Date>();
    	list.add(test2);
    	list.add(test);
    	list.add(test3);
    	list.add(test4);
    	list.add(test5);
    	list.add(test6);
    	System.out.println(list);
    	
    }

}
