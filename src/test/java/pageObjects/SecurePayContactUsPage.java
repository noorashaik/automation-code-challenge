package pageObjects;

import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SecurePayContactUsPage {
	
	static Random rand = new Random();  
	public static String random_string_value= String.valueOf(rand.nextInt(1000));
	public WebDriver ldriver;	

	public SecurePayContactUsPage(WebDriver rdriver) {		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}	

	@FindBy (xpath ="//input[@name='firstName']")
	WebElement firstName_text;
	@FindBy (xpath ="//input[@name='lastName']")
	WebElement lastName_text;
	@FindBy (xpath ="//input[@name='email']")
	WebElement email_text;
	@FindBy (xpath ="//input[@name='phone']")
	WebElement phone_number;
	@FindBy (xpath ="//input[@name='company']")
	WebElement company_text;
	@FindBy (xpath ="//input[@name='website']")
	WebElement website_text;
	@FindBy (xpath ="//Select[@name='amount']")
	Select amount_dropdownlist;
	@FindBy (xpath ="//textarea[@name='message']")
	WebElement message_textarea;	
	@FindBy (id = "existingCustomer")
	WebElement existingCustomer_checkbox;
	
	public void enter_firstName() {	    
		firstName_text.click();
		firstName_text.clear();
		firstName_text.sendKeys(random_string_value);		
	}
	
	public void enter_lastName() {	    
		lastName_text.click();
		lastName_text.clear();
		lastName_text.sendKeys(random_string_value);		
	}
	
	public void enter_email() {	    
		email_text.click();
		email_text.clear();
		email_text.sendKeys(random_string_value);		
	}
	
	public void enter_phone() {	    
		phone_number.click();
		phone_number.clear();
		phone_number.sendKeys(random_string_value);		
	}
	
	public void enter_company() {	    
		company_text.click();
		company_text.clear();
		company_text.sendKeys(random_string_value);		
	}
	
	public void enter_website() {	    
		website_text.click();
		website_text.clear();
		website_text.sendKeys(random_string_value);		
	}
	
	public void select_amount() {		
		amount_dropdownlist.selectByIndex(1);		
	}	
	public void enter_message() {	    
		message_textarea.click();
		message_textarea.clear();
		message_textarea.sendKeys(random_string_value);		
	}
	
	}

