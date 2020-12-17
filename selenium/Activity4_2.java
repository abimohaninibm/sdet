package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		System.out.println("The title of the page is : "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Abishek");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Mohan");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abimohna@oin.ibm.com");
		
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9902254893");
		
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		
	}

}
