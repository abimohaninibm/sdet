/*Logging into the site
Goal: Open the website and log-in using the provided credentials.
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Find the navigation bar.
d. Select the menu item that says “My Account” and click it.
e. Read the page title and verify that you are on the correct page.
f. Find the “Login” button on the page and click it.
g. Find the username field of the login form and enter the username into that field.
h. Find the password field of the login form and enter the password into that field.
i. Find the login button and click it.
j. Verify that you have logged in.
k. Close the browser.
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

public class VerifyLogin_6 {
	WebDriver driver;
	
	@Test(dataProvider = "dp")
	public void lmsLoginTest(String username, String password) {
		WebElement myAcc = driver.findElement(By.xpath("//div[@class='main-navigation']/ul[@id='primary-menu']/li[@id='menu-item-1507']/a"));
		Reporter.log(">>>>Clicking on the my account nav",true);
		
		myAcc.click();
		Reporter.log(">>>>Verifying the title of myAcc",true);
		Assert.assertEquals(driver.getTitle(), "My Account – Alchemy LMS");
		
		Reporter.log(">>>>Clicking on the login button ",true);
		WebElement loginbutton = driver.findElement(By.xpath("//a[@class='ld-login ld-login ld-login-text ld-login-button ld-button']"));
		loginbutton.click();
		
		WebElement user = driver.findElement(By.cssSelector("input#user_login"));
		WebElement pass = driver.findElement(By.cssSelector("input#user_pass"));
		WebElement button = driver.findElement(By.cssSelector("input#wp-submit"));
		
		
		Reporter.log(">>>>Entering the username and password",true);
		user.sendKeys(username);
		pass.sendKeys(password);
		
		Reporter.log(">>>>Clicking the button",true);
		button.click();
		
		WebElement Logintext = driver.findElement(By.xpath("//div[contains(@id,'uagb-infobox-')]//h1[@class='uagb-ifb-title']"));
		Assert.assertEquals(Logintext.getText(), "My Account");
		
		
		
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "root", "pa$$w0rd" } };
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
