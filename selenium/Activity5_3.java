package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println("Title of the page : "+driver.getTitle());
		System.out.println("Is Enabled ? : "+driver.findElement(By.xpath("//input[@id='input-text']")).isEnabled());
		driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
		driver.findElement(By.xpath("//input[@id='input-text']")).sendKeys("Hey yo!!!!!!");
		System.out.println("**************");
		System.out.println("Is Enabled ? : "+driver.findElement(By.xpath("//input[@id='input-text']")).isEnabled());
		System.out.println("Text : "+driver.findElement(By.xpath("//input[@id='input-text']")).getText());
		
		driver.close();
		
	}

}