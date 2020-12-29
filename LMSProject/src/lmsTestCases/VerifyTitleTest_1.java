/* Verify the website title
Goal: Read the title of the website and verify the text
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Get the title of the website.
d. Make sure it matches “Alchemy LMS – An LMS Application '' exactly.
e. If it matches, close the browser.
 */

package lmsTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class VerifyTitleTest_1 {
	WebDriver driver;
	
	@Test
	public void lmsTitleTest() {
		String title = driver.getTitle();
		Reporter.log(">>>> lmsTitleTest - Getting the title from the page",true);
		Assert.assertEquals(title, "Alchemy LMS – An LMS Application");
		
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
