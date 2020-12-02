package javaActivity2_1;

import java.util.Scanner;

public class MyBook extends Book {

	public static void main(String[] args) {

		MyBook b = new MyBook();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the title of the book : ");
		
		b.setTitle(s.nextLine());
		b.getTitle();
		s.close();

	}

	@Override
	public void setTitle(String s) {
		Title = s;

	}

	@Override
	public void getTitle() {

		System.out.println("Title of the book set is : " + Title);

	}

}
