package Activity2_3;

public class Bicycle implements bicycleParts,bicycleOperations {

	public int gears;
	public int currentSpeed;
	
	public Bicycle(int gears, int currentSpeed) {
		
		this.gears=gears;
		this.currentSpeed=currentSpeed;
	}
	
	@Override
	public void applyBrake(int decrement) {
		
		this.currentSpeed=currentSpeed-decrement;
		
	}

	@Override
	public void speedUp(int increment) {
		
		this.currentSpeed=currentSpeed+increment;
		
	}
	
	public void bicycleDesc() {
		System.out.println("The number of gears : "+gears);
		System.out.println("The current speed : "+currentSpeed);
	}

}
