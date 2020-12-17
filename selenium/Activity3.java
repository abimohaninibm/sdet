package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
	
	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		
		System.out.println("The title of the page is : "+driver.getTitle());

		//<input placeholder="First Name" type="text" id="firstName" required="">
		driver.findElement(By.id("firstName")).sendKeys("Abishek");
		
		//<input placeholder="Last Name" type="text" id="lastName" required="">
		driver.findElement(By.id("lastName")).sendKeys("Mohan");
		
		//<input placeholder="abc@xyz.com" type="email" id="email" required="">
		driver.findElement(By.id("email")).sendKeys("abimohan@in.ibm.com");
		
		//<input placeholder="9876543210" type="tel" pattern="[0-9]{10}" id="number" required="">
		driver.findElement(By.id("number")).sendKeys("9902254893");
		
		//<input class="ui green button" type="submit" value="submit" onclick="simpleFormSubmit()">
		driver.findElement(By.cssSelector("input.green")).click();
		
		driver.close();
		
		
	}

}
