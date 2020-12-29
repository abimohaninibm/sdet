/*
 * Count the number of courses
Goal: Navigate to the “All Courses” page and count the number of courses.
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Find the navigation bar.
d. Select the menu item that says “All Courses” and click it.
e. Find all the courses on the page.
f. Print the number of courses on the page.
g. Click the Mark Complete button on the page (if available).
h. Close the browser.
 */

package lmsTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class VerifyCountCourses_7 {
	WebDriver driver;
	
	@Test
	public void lmsCountCourses() {
		
		Reporter.log(">>>>Finding the my courses webelement",true);
		WebElement mycourses = driver.findElement(By.cssSelector("li#menu-item-1508 > a"));
		
		Reporter.log(">>>>Clicking on the my courses webelement",true);
		mycourses.click();
		
		Reporter.log(">>>>Fetching the number of courses",true);
		List<WebElement> courses = driver.findElements(By.cssSelector("img.attachment-course-thumb.size-course-thumb.wp-post-image"));
		
		Reporter.log(">>>>The number of courses are "+courses.size(),true);
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
