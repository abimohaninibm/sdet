package SeleniumPractice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Activity8_2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://training-support.net/selenium/tables");
		
		List<WebElement> lr = driver.findElements(By.xpath("//div[@class='table div']/table[@id='sortableTable']/tbody/tr"));
		System.out.println("Number of rows in Sortable table is : "+lr.size());
		
		List<WebElement> lc = driver.findElements(By.xpath("//div[@class='table div']/table[@id='sortableTable']/tbody/tr[1]/td"));
		System.out.println("Number of Cols in Sortable table is : "+lc.size());
		
		System.out.println("**********************");
		WebElement rc = driver.findElement(By.xpath("//div[@class='table div']/table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("Value at second row and second col is : "+rc.getText());
		
		System.out.println("**********************");
		WebElement hname = driver.findElement(By.xpath("//div[@class='table div']/table[@id='sortableTable']/thead/tr/th[2]"));
		hname.click();
		System.out.println("Name sorted by click");
		
		System.out.println("**********************");
		WebElement rc1 = driver.findElement(By.xpath("//div[@class='table div']/table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("Value at second row and second col after sorting is : "+rc.getText());
		
		System.out.println("**********************");
		List<WebElement> ft = driver.findElements(By.xpath("//div[@class='table div']/table[@id='sortableTable']/tfoot/tr"));
		System.out.println("Value at footer are : ");
		for (Iterator iterator = ft.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			System.out.print(webElement.getText());
		}
		
		
		driver.close();
	}

}
