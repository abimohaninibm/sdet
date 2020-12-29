/*
 *  Verify the website heading
Goal: Read the heading of the website and verify the text
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Get the heading of the webpage.
d. Make sure it matches “Learn from Industry Experts” exactly.
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

public class VerifyHeadingTest_2 {
	
	WebDriver driver;
	
  @Test
  public void lmsHeadingTest() {
	  WebElement heading = driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
	  String htext = heading.getText();
	  Reporter.log(">>>>lmsHeadingTest - Retriving the heading",true);
	  Assert.assertEquals(htext, "Learn from Industry Experts");
	  
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
