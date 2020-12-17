package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://training-support.net/selenium/ajax");
		String title = driver.getTitle();
		System.out.println("title : " + title);

		WebElement button = driver
				.findElement(By.xpath("//div[@id='ajax-content']/button[contains(@class,'ui violet button')]"));

		button.click();
		
		WebElement text1 = driver.findElement(By.xpath("//div[@id='ajax-content']/h1"));
		WebElement text2 = driver.findElement(By.xpath("//div[@id='ajax-content']/h3"));

		wait.until(ExpectedConditions.textToBePresentInElement(text1, "HELLO!"));
		System.out.println("1>>>>>>>>>>>>>>>>>>>>>>>>>>" + text1.getText());

		wait.until(ExpectedConditions.textToBePresentInElement(text2,"I'm late!"));
		System.out.println("2>>>>>>>>>>>>>>>>>>>>>>>>>>" + text1.getText());
		
		driver.close();
	}
}
