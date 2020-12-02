package Activity2_3;

public class MountainBike extends Bicycle {

	int seatHeight;
	public MountainBike(int gears, int currentSpeed) {
		super(gears, currentSpeed);
		
	}
	
	public void SeatHeight(int newVal) {
		this.seatHeight=newVal;
	}
	
	public void bicycleDesc() {
		System.out.println("The number of gears : "+gears);
		System.out.println("The current speed : "+currentSpeed);
		System.out.println("The seat height : "+seatHeight);
	}
	
	

}
