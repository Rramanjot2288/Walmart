package walmart.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import walmart.baseclass.Baseclass;

public class SignupPage extends Baseclass {
	
	
	@FindBy(id="firstName")
	WebElement firstname;
	
	@FindBy(id ="lastName")
	WebElement lastname;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"create-account-form\"]/div/div[9]/div/div/label")
	WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"create-account-form\"]/div/div[10]/button")
	WebElement signup;
	
	
	
	public SignupPage ()
	{
		PageFactory.initElements(driver, this);
		
	}
	public void signup(String fn,String ln,String em,String pass)
	{
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		email.sendKeys(em);
		password.sendKeys(pass);
		checkbox.click();
		signup.click();
	}
	
}
