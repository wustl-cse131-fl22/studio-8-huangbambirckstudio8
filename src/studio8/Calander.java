package studio8;

import java.util.LinkedList;
import java.util.List;

public class Calander {
	private List<Appointment> calandar;

	/**
	 * @param calandar
	 */
	public Calander(List<Appointment> calandar) {
		this.calandar = calandar;
	}
	public Calander() {
		this.calandar = new LinkedList<Appointment>();
	}
	

	@Override
	public String toString() {
		return calandar.toString();
	}
	
    public void addAppointment(Appointment a1) {
    	calandar.add(a1);
    }
    public static void main(String[] args) {
    	Date test2 = new Date("August", "14th", 2004, false);
    	Time test3 = new Time(12, 27, true);
    	Appointment test4 = new Appointment(test3, test2, true, "Dentist");
    	Calander c1 = new Calander();
    	c1.addAppointment(test4);
    	System.out.print(c1);
    }
}
