package javaActivity4;

import java.util.Arrays;

public class Activity1_4 {

	public static void main(String[] args) {

		int numbers[] = { 13, 34, 544, 232, 2, 3, 4443, 3, 4343, 5554454, 65, 34, 23, 43 };

		insertionSort(numbers);
	}

	private static void insertionSort(int[] numbers) {

		int i = 0;
		int j = 0;
		int key = 0;

		for (i = 1; i < numbers.length; i++) {
			key = numbers[i];
			j = i - 1;

			while (j >= 0 && key < numbers[j]) {
				numbers[j + 1] = numbers[j];
				--j;
			}
			numbers[j+1] = key;

		}
		
		System.out.println("Sorted array is : "+Arrays.toString(numbers));

	}

}
