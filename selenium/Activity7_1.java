package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		
		System.out.println("Title: "+driver.getTitle());
		
		WebElement user = driver.findElement(By.xpath("//input[starts-with(@class,'username')]"));
		WebElement pass = driver.findElement(By.xpath("//input[starts-with(@class,'password')]"));
		
		user.sendKeys("admin");
		pass.sendKeys("password");
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		System.out.println("End Text : "+driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText());
		
		driver.close();
	}
}
