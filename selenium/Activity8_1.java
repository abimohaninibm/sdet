package SeleniumPractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		System.out.println("Title : "+driver.getTitle());
		
		//<div class="ui huge header">Static Table</div>
		String table1 = driver.findElement(By.xpath("//div[@class='ui huge header' and text()='Static Table']")).getText();
		
		List<WebElement> lr = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
		
		System.out.println("Number of rows in "+table1+" is "+lr.size());
		
		List<WebElement> lc = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"));
		
		System.out.println("Number of cols in "+table1+" is "+lc.size());
		
			
		
		System.out.println("***************");
		System.out.println("Elements in the 3rd row are ");
		List<WebElement> l3 = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]/td"));
		for (Iterator iterator = l3.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			System.out.print(webElement.getText()+"  ::  ");
		}
		
		
		System.out.println("***************");
		System.out.println("Element are 2nd row and 2nd Col ");
		List<WebElement> l4 = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td"));
		System.out.println(l4.get(1).getText());
		
		driver.close();
	}

}
