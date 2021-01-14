package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;
import pageObjects.GoogleHomePage;
import pageObjects.SecurePayContactUsPage;
import pageObjects.SecurePayHomePage;

public class Steps {

	public WebDriver driver; 
	
	public GoogleHomePage ghp;
	
	public SecurePayHomePage sphp;
	
	public SecurePayContactUsPage spcp;
	
	public String url = "https://www.google.com.au";	
	
	@Given ("User Launch browser and naviagte to Google and search Secure Pay and navigate to Secure Pay website")
	public void launch_browser_and_search_secure_pay() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		WebDriver driver = new ChromeDriver(options); 
		
		driver.navigate().to(url);
		driver.manage().window().maximize();				
		
		ghp = new GoogleHomePage(driver);
		
		ghp.search();
		
		ghp.clickOnSearchResult();
		
	}
	
	@When("User clicks on Contact us link and navigates to contact us page")
	public void user_clicks_on_contact_us_link() {
		
		sphp = new SecurePayHomePage(driver);
		
		sphp.ClickOnContactUsLink();
		
		driver.getPageSource().contains("Contact our Sales Team");		
		
	}
	
	@Then("User should be able to fill the details in Contact us page")
	public void User_should_be_able_to_fill_the_details() {
		
		spcp = new SecurePayContactUsPage(driver);		
		spcp.enter_firstName();
		spcp.enter_lastName();
		spcp.enter_email();
		spcp.enter_phone();
		spcp.enter_company();
		spcp.enter_website();
		spcp.select_amount();
		spcp.enter_message();		
		
	}
		
		
}
