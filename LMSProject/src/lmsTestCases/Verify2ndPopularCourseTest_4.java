/*
 * Verify the title of the second most popular course
Goal: Read the title of the second most popular course on the website and verify the
text
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Get the title of the second most popular course.
d. Make sure it matches “Email Marketing Strategies” exactly.
e. If it matches, close the browser.

 */
package lmsTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Verify2ndPopularCourseTest_4 {
	WebDriver driver;
	
	@Test
	public void lms2ndPopCourse() {
		WebElement head= driver.findElement(By.xpath("//div[@class='ld_course_grid col-sm-8 col-md-4 ']/article[@id='post-71']/div[@class='caption']/h3[@class='entry-title']"));
		String htext = head.getText();
		Reporter.log("Retriving 2nd most popular course header : "+htext,true);
		
		Assert.assertEquals(htext, "Email Marketing Strategies");
	}

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	

}
