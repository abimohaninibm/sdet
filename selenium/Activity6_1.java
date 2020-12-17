package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity6_1 {
	
	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	driver.get("https://training-support.net/selenium/dynamic-controls");
		
	String title = driver.getTitle();
	System.out.println("Title : "+title);
	
	WebElement checkbox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
	WebElement button = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
	button.click();
	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@class='willDisappear']")));
	
	button.click();
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@class='willDisappear']")));
	checkbox.click();
	
	driver.close();
		
	}
}
