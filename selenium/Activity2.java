package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://training-support.net");
		
		//title of the webpage
		System.out.println("Title of the web page : "+driver.getTitle());
		
		//find using id
		System.out.println("The text using id : "+driver.findElement(By.id("about-link")).getText());
		
		//find text using class name
		System.out.println("The text using classname : "+driver.findElement(By.className("green")).getText());
		
		//find text using link text
		System.out.println("The text using link text : "+driver.findElement(By.linkText("About Us")).getText());
		
		//find text using css selector
		System.out.println("The text using css selector : "+driver.findElement(By.cssSelector("a.green")).getText());
		
		driver.close();

		//<a id="about-link" href="about" class="ui inverted huge green button">About Us</a>
	}

}
