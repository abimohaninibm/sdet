package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity7_2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("Title : "+driver.getTitle());
		
		WebElement user = driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
		WebElement pass = driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
		WebElement cpass = driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[1]"));
		WebElement email = driver.findElement(By.xpath("//input[contains(@class,'email-')]"));
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
		
		user.sendKeys("Abishek");
		pass.sendKeys("123243242");
		cpass.sendKeys("123243242");
		email.sendKeys("abimohan@in.ibvm.com");
		button.click();
		
		System.out.println(">>>>>>>>>>>>>>"+driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText());
		driver.close();
	
		
		
	}

}
