/*
 * Verify the title of the first info box
Goal: Read the title of the first info box on the website and verify the text
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Get the title of the first info box.
d. Make sure it matches “Actionable Training” exactly.
e. If it matches, close the browser
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

public class Verify1stTextBox_3 {
	WebDriver driver;

	@Test
	public void lms1stTextBox() {
		Reporter.log(">>>>lms1stTextBox - Locating the webElement",true);
		
		WebElement box= driver.findElement(By.xpath("//div[contains(@id,'uagb-infobox-')]/div[@class='uagb-infobox__content-wrap uagb-infobox uagb-infobox-has-icon uagb-infobox-icon-above-title uagb-infobox-image-valign-top uagb-infobox-enable-border-radius ']/div[@class='uagb-ifb-left-right-wrap']/div[@class='uagb-ifb-content']/div[@class='uagb-ifb-title-wrap']/h3[contains(text(),'Training')]"));
		String head = box.getText();
		Reporter.log(">>>>lms1stTextBox - Retriving 1st box heading : "+head,true);
		
		Assert.assertEquals(head, "Actionable Training");
		
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
