package Pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagefb {

	WebDriver driver;
	
	//locators
	@FindBy(id = "email")
	WebElement fbemail;
	
	@FindBy(id = "pass")
	WebElement fbpassword;
	
	@FindBy(name = "login")
	WebElement fblogin;
	
	public Pagefb(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void setValues(String username, String password) {
		fbemail.sendKeys(username);
		fbpassword.sendKeys(password);
	}
	
	public void loginClick() {
		fblogin.click();
	}
}
