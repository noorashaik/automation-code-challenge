package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
public WebDriver ldriver;

public GoogleHomePage(WebDriver rdriver) {
	
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);
	
}
@FindBy (name = "q")
WebElement search;

@FindBy (xpath ="//link[@href=\"http://www.securepay.com.au/\"]")
WebElement securePayLink;

public void search() {
	search.click();
	search.clear();
	search.sendKeys("Secure Pay");
	search.sendKeys(Keys.ENTER);
}

public void clickOnSearchResult() {
	securePayLink.click();
}

}