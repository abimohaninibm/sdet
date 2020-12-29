/*
 * Contact the admin
Goal: Navigate to the “Contact Us” page and complete the form.
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Find the navigation bar.
d. Select the menu item that says “Contact” and click it.
e. Find the contact form fields (Full Name, email, etc.)
f. Fill in the information and leave a message.
g. Click submit.
h. Read and print the message displayed after submission.
i. Close the browser.
 */

package lmsTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class VerifyContactAdmin_8 {
	
	WebDriver driver;
	
	@Test(dataProvider = "dp")
	public void lmsContactAdminTest(String Dname, String Demail, String Dsubject, String Dmessage) {
		
		WebElement contact = driver.findElement(By.cssSelector("li#menu-item-1506 > a"));
		Reporter.log(">>>>Getting the contact webElement and clicking it ",true);
		contact.click();
		
		WebElement name= driver.findElement(By.cssSelector("input#wpforms-8-field_0"));
		WebElement email= driver.findElement(By.cssSelector("input#wpforms-8-field_1"));
		WebElement sub= driver.findElement(By.cssSelector("input#wpforms-8-field_3"));
		WebElement message= driver.findElement(By.cssSelector("textarea#wpforms-8-field_2"));
		WebElement button= driver.findElement(By.cssSelector("button#wpforms-submit-8"));
		
		Reporter.log(">>>>Sending the details in the form",true);
		name.sendKeys(Dname);
		email.sendKeys(Demail);
		sub.sendKeys(Dsubject);
		message.sendKeys(Dmessage);
		
		Reporter.log(">>>>Clicking the button..",true);
		button.click();
		
		
		WebElement verifytext = driver.findElement(By.cssSelector("div.uagb-column__inner-wrap > div#wpforms-confirmation-8 > p"));
		
		Assert.assertEquals(verifytext.getText(), "Thanks for contacting us! We will be in touch with you shortly.");
		Reporter.log(">>>>Verifying the text"+verifytext.getText(),true);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "Abishek Raj Mohan", "abimohan87@gmail.com","Need Help","I am not able to view the courses..." } };
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
