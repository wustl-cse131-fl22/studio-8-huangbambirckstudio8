package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	private Time time;
	private Date date;
	private boolean isAvaliable;
	private String type;
	
	

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}



	/**
	 * @param time
	 * @param date
	 */
	public Appointment(Time time, Date date, boolean avaliable, String initType) {
		this.time = time;
		this.date = date;
		this.isAvaliable = avaliable;
		this.type = initType;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}



	@Override
	public String toString() {
		return "Appointment [time=" + time + ", date=" + date + ", isAvaliable=" + isAvaliable + ", type=" + type + "]";
	}



	public static void main(String[] args) {
    	Date test2 = new Date("August", "14th", 2004, false);
    	Time test3 = new Time(12, 27, true);
    	Appointment test4 = new Appointment(test3, test2, true, "Dentist");
    	HashSet<Appointment> list = new HashSet<Appointment>();
    	list.add(test4);
    	
    	System.out.println(list);

	}

}
