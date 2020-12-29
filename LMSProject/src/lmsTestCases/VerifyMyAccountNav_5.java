/*
 *  Navigate to another page
Goal: Navigate to the “My Account” page on the site.
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Find the navigation bar.
d. Select the menu item that says “My Account” and click it.
e. Read the page title and verify that you are on the correct page.
f. Close the browser.
 * <title>My Account – Alchemy LMS</title>
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

public class VerifyMyAccountNav_5 {
	WebDriver driver;
	
	@Test
	public void lmsMyAccTest() {
		WebElement myAcc = driver.findElement(By.xpath("//div[@class='main-navigation']/ul[@id='primary-menu']/li[@id='menu-item-1507']/a"));
		Reporter.log("Clicking the my account in the Nav bar : ",true);
		
		myAcc.click();
		String title = driver.getTitle();
		Reporter.log("Asserting the title : "+title,true);
		Assert.assertEquals(title, "My Account – Alchemy LMS");
		
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
