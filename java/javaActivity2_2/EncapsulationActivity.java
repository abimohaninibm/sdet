package javaActivity2_2;

import java.util.Date;

public class EncapsulationActivity {

	public static void main(String[] args) throws InterruptedException {
		
		Plane plane = new Plane(10);
		
		plane.onboard("Rita");
		plane.onboard("2");
		plane.onboard("Ramesh");
		plane.onboard("4");
		plane.onboard("Sam");
		plane.onboard("6");
		plane.onboard("Abishek");
		plane.onboard("Zubi");
		
		
		
		System.out.println("Took off at : "+plane.takeOff());
		
		System.out.println("Passengers are : "+plane.getPassesngers());
		
		Thread.sleep(5000);
		
		plane.land();
		
		System.out.println("Plane Landed at : "+plane.getLastTimeLanded());
		

	}

}
