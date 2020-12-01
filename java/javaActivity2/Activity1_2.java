package javaActivity2;

import java.util.Arrays;

public class Activity1_2 {

	public static void main(String[] args) {

		int num[] = { 10, 77, 10, 54, -11, 10 };
		
		
		System.out.println("Original Array"+Arrays.toString(num));
		System.out.println("****************************************");

		arraySum(num);
	}

	private static void arraySum(int num[]) {
		
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 10) {
				sum = sum + num[i];
			}
		}
		
		System.out.println("Total sum of number of 10s in array : "+sum);
		System.out.println("****************************************");

		if (sum == 30) {
			System.out.println("Yes, the sum is equal to 30!!");
		} else {
			System.out.println("No, the sum is not equal to 30!!");
		}

		
	}

}
