package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean isMilitaryTime;
	
	
	
	/**
	 * @param hour
	 * @param minute
	 * @param isMilitaryTime
	 */
	public Time(int hour, int minute, boolean isMilitaryTime) {
		this.hour = hour;
		this.minute = minute;
		this.isMilitaryTime = isMilitaryTime;
	}

	

	@Override
	public String toString() {
		if(isMilitaryTime == true)
		{
			return (hour + ":" + minute);
		}
		else
		{
			if(hour <= 12)
			{
				return (hour + ":" + minute + " AM");
			}
			else
			{
				int newTime = hour-12;
				return (newTime + ":" + minute + " PM");
			}
		}
	}



	@Override
	public int hashCode() {
		return Objects.hash(hour, isMilitaryTime, minute);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && isMilitaryTime == other.isMilitaryTime && minute == other.minute;
	}



	public static void main(String[] args) {
		Time test = new Time(18, 19, true);
    	System.out.println(test);
    }

}