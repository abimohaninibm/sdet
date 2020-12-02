package Activity2_3;

public class Driver {

	public static void main(String[] args) {

		MountainBike abi = new MountainBike(18, 20);
		abi.SeatHeight(50);
		abi.bicycleDesc();

		abi.applyBrake(3);
		System.out.println("*****************************");

		abi.bicycleDesc();
		abi.speedUp(10);
		System.out.println("*****************************");

		abi.bicycleDesc();
	}

}
