package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println("Title of the page : "+driver.getTitle());
		
		System.out.println("Is checked ? : "+driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		System.out.println("***********************************");
		System.out.println("Is checked ? : "+driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		
		driver.close();
	}
}
