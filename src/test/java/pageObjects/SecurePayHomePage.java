package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurePayHomePage {
	
	public WebDriver ldriver;

	public SecurePayHomePage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy (xpath ="//link[@href=\"/help-and-support/contact-sales\"]")	
	WebElement contactUs_link;	

	public void ClickOnContactUsLink() {
		contactUs_link.click();
	}
	
	

}
