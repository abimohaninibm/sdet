/*
 * Complete a simple lesson
Goal: Navigate to a particular lesson and complete it.
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Find the navigation bar.
d. Select the menu item that says “All Courses” and click it.
e. Select any course and open it.
f. Click on a lesson in the course. Verify the title of the course.
g. Click the Mark Complete button on the page (if available).
h. Close the browser.
 */

package lmsTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class VerifyCompleteLesson_9 {
	WebDriver driver;
	WebDriverWait wait;
	
	@Test
	public void lmsCompleteLessonTest() {
		
		Reporter.log("Finding all courses and clicking",true);
		WebElement allcourses = driver.findElement(By.cssSelector("li#menu-item-1508 > a"));
		allcourses.click();
		
		
		WebElement lesson = driver.findElement(By.cssSelector("div[id*='ld-course-list-content-'] > div.ld-course-list-items.row > div.ld_course_grid.col-sm-8.col-md-4  > article#post-69 > a > img.attachment-course-thumb.size-course-thumb.wp-post-image"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[id*='ld-course-list-content-'] > div.ld-course-list-items.row > div.ld_course_grid.col-sm-8.col-md-4  > article#post-69 > a > img.attachment-course-thumb.size-course-thumb.wp-post-image")));
		Reporter.log("Clicking on the 1st lession",true);
		lesson.click();
		
		String title = driver.getTitle();
		Reporter.log("Retirving the lesson title and asserting "+title,true);
		Assert.assertEquals(title, "Social Media Marketing – Alchemy LMS");
		
		//login
		Reporter.log("Logging in to check the course",true);
		WebElement login = driver.findElement(By.cssSelector("a.ld-button"));
		
		WebElement user = driver.findElement(By.cssSelector("input#user_login"));
		WebElement pass = driver.findElement(By.cssSelector("input#user_pass"));
		WebElement submit = driver.findElement(By.cssSelector("input#wp-submit"));
		
		login.click();
		user.sendKeys("root");
		pass.sendKeys("pa$$w0rd");
		submit.click();
		
		WebElement expand = driver.findElement(By.cssSelector("div#ld-expand-83 > div.ld-item-list-item-preview > div.ld-item-details > div.ld-expand-button.ld-button-alternate > span.ld-icon-arrow-down.ld-icon.ld-primary-background"));
		WebElement course = driver.findElement(By.cssSelector("div#ld-table-list-item-175 > a.ld-table-list-item-preview.ld-primary-color-hover.ld-topic-row.learndash-incomplete"));
		
		Reporter.log("Clicking on the expand and lesson",true);
		expand.click();
		course.click();
		
		WebElement markComplete = driver.findElement(By.cssSelector("div.ld-focus-content > div#learndash_post_175 > div.learndash-wrapper > div.ld-content-actions > div.ld-content-action > form.sfwd-mark-complete > input.learndash_mark_complete_button"));
		
		if (markComplete.isDisplayed()) {
			Reporter.log("Mark Complete Clicked",true);
			markComplete.click();
		} else {
			Reporter.log("Mark Complete was NOT Clicked because is not visible",true);
		}
	}

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		driver.get("https://alchemy.hguy.co/lms");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
