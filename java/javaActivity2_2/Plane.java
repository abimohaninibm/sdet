package javaActivity2_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {

	private int maxPassengers;
	private List<String> Passengers = new ArrayList<String>();
	private Date LastTimeTookOff;
	private Date LastTimeLanded;
	
	public Plane(int m) {
		 this.maxPassengers=m;
		
	}
	
	public void onboard(String s) {
		this.Passengers.add(s);
	}
	
	public Date takeOff() {
		this.LastTimeTookOff=new Date();
		return LastTimeTookOff;

	}
	
	public void land() {
		this.LastTimeLanded= new Date();
		Passengers.clear();
	}
	
	public Date getLastTimeLanded() {
		return LastTimeLanded;
	}
	
	public List<String> getPassesngers() {
		return Passengers;
	}
	
}
